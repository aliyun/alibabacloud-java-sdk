// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225;

import com.aliyun.tea.*;
import com.aliyun.eiam_developerapi20220225.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("eiam-developerapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    public CreateOrganizationalUnitResponse createOrganizationalUnit(String instanceId, String applicationId, CreateOrganizationalUnitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        CreateOrganizationalUnitHeaders headers = new CreateOrganizationalUnitHeaders();
        return this.createOrganizationalUnitWithOptions(instanceId, applicationId, request, headers, runtime);
    }

    public CreateOrganizationalUnitResponse createOrganizationalUnitWithOptions(String instanceId, String applicationId, CreateOrganizationalUnitRequest request, CreateOrganizationalUnitHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        applicationId = com.aliyun.openapiutil.Client.getEncodeParam(applicationId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitExternalId)) {
            body.put("organizationalUnitExternalId", request.organizationalUnitExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitName)) {
            body.put("organizationalUnitName", request.organizationalUnitName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            body.put("parentId", request.parentId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrganizationalUnit"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + instanceId + "/" + applicationId + "/organizationalUnits"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrganizationalUnitResponse());
    }

    public CreateUserResponse createUser(String instanceId, String applicationId, CreateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        CreateUserHeaders headers = new CreateUserHeaders();
        return this.createUserWithOptions(instanceId, applicationId, request, headers, runtime);
    }

    public CreateUserResponse createUserWithOptions(String instanceId, String applicationId, CreateUserRequest request, CreateUserHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        applicationId = com.aliyun.openapiutil.Client.getEncodeParam(applicationId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            body.put("email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emailVerified)) {
            body.put("emailVerified", request.emailVerified);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("phoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumberVerified)) {
            body.put("phoneNumberVerified", request.phoneNumberVerified);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneRegion)) {
            body.put("phoneRegion", request.phoneRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryOrganizationalUnitId)) {
            body.put("primaryOrganizationalUnitId", request.primaryOrganizationalUnitId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userExternalId)) {
            body.put("userExternalId", request.userExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("username", request.username);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUser"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + instanceId + "/" + applicationId + "/users"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserResponse());
    }

    public DeleteOrganizationalUnitResponse deleteOrganizationalUnit(String instanceId, String applicationId, String organizationalUnitId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        DeleteOrganizationalUnitHeaders headers = new DeleteOrganizationalUnitHeaders();
        return this.deleteOrganizationalUnitWithOptions(instanceId, applicationId, organizationalUnitId, headers, runtime);
    }

    public DeleteOrganizationalUnitResponse deleteOrganizationalUnitWithOptions(String instanceId, String applicationId, String organizationalUnitId, DeleteOrganizationalUnitHeaders headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        applicationId = com.aliyun.openapiutil.Client.getEncodeParam(applicationId);
        organizationalUnitId = com.aliyun.openapiutil.Client.getEncodeParam(organizationalUnitId);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOrganizationalUnit"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + instanceId + "/" + applicationId + "/organizationalUnits/" + organizationalUnitId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOrganizationalUnitResponse());
    }

    public DeleteUserResponse deleteUser(String instanceId, String applicationId, String userId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        DeleteUserHeaders headers = new DeleteUserHeaders();
        return this.deleteUserWithOptions(instanceId, applicationId, userId, headers, runtime);
    }

    public DeleteUserResponse deleteUserWithOptions(String instanceId, String applicationId, String userId, DeleteUserHeaders headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        applicationId = com.aliyun.openapiutil.Client.getEncodeParam(applicationId);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUser"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + instanceId + "/" + applicationId + "/users/" + userId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserResponse());
    }

    public GenerateDeviceCodeResponse generateDeviceCode(String instanceId, String applicationId, GenerateDeviceCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateDeviceCodeWithOptions(instanceId, applicationId, request, headers, runtime);
    }

    public GenerateDeviceCodeResponse generateDeviceCodeWithOptions(String instanceId, String applicationId, GenerateDeviceCodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        applicationId = com.aliyun.openapiutil.Client.getEncodeParam(applicationId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("client_id", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("scope", request.scope);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateDeviceCode"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + instanceId + "/" + applicationId + "/oauth2/device/code"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateDeviceCodeResponse());
    }

    public GenerateTokenResponse generateToken(String instanceId, String applicationId, GenerateTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateTokenWithOptions(instanceId, applicationId, request, headers, runtime);
    }

    public GenerateTokenResponse generateTokenWithOptions(String instanceId, String applicationId, GenerateTokenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        applicationId = com.aliyun.openapiutil.Client.getEncodeParam(applicationId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("client_id", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSecret)) {
            query.put("client_secret", request.clientSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeVerifier)) {
            query.put("code_verifier", request.codeVerifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceCode)) {
            query.put("device_code", request.deviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exclusiveTag)) {
            query.put("exclusive_tag", request.exclusiveTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantType)) {
            query.put("grant_type", request.grantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.redirectUri)) {
            query.put("redirect_uri", request.redirectUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refreshToken)) {
            query.put("refresh_token", request.refreshToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("username", request.username);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateToken"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + instanceId + "/" + applicationId + "/oauth2/token"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateTokenResponse());
    }

    public GetApplicationProvisioningScopeResponse getApplicationProvisioningScope(String instanceId, String applicationId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetApplicationProvisioningScopeHeaders headers = new GetApplicationProvisioningScopeHeaders();
        return this.getApplicationProvisioningScopeWithOptions(instanceId, applicationId, headers, runtime);
    }

    public GetApplicationProvisioningScopeResponse getApplicationProvisioningScopeWithOptions(String instanceId, String applicationId, GetApplicationProvisioningScopeHeaders headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        applicationId = com.aliyun.openapiutil.Client.getEncodeParam(applicationId);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApplicationProvisioningScope"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + instanceId + "/" + applicationId + "/provisioningScope"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApplicationProvisioningScopeResponse());
    }

    public GetOrganizationalUnitResponse getOrganizationalUnit(String instanceId, String applicationId, String organizationalUnitId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetOrganizationalUnitHeaders headers = new GetOrganizationalUnitHeaders();
        return this.getOrganizationalUnitWithOptions(instanceId, applicationId, organizationalUnitId, headers, runtime);
    }

    public GetOrganizationalUnitResponse getOrganizationalUnitWithOptions(String instanceId, String applicationId, String organizationalUnitId, GetOrganizationalUnitHeaders headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        applicationId = com.aliyun.openapiutil.Client.getEncodeParam(applicationId);
        organizationalUnitId = com.aliyun.openapiutil.Client.getEncodeParam(organizationalUnitId);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOrganizationalUnit"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + instanceId + "/" + applicationId + "/organizationalUnits/" + organizationalUnitId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOrganizationalUnitResponse());
    }

    public GetOrganizationalUnitIdByExternalIdResponse getOrganizationalUnitIdByExternalId(String instanceId, String applicationId, GetOrganizationalUnitIdByExternalIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetOrganizationalUnitIdByExternalIdHeaders headers = new GetOrganizationalUnitIdByExternalIdHeaders();
        return this.getOrganizationalUnitIdByExternalIdWithOptions(instanceId, applicationId, request, headers, runtime);
    }

    public GetOrganizationalUnitIdByExternalIdResponse getOrganizationalUnitIdByExternalIdWithOptions(String instanceId, String applicationId, GetOrganizationalUnitIdByExternalIdRequest request, GetOrganizationalUnitIdByExternalIdHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        applicationId = com.aliyun.openapiutil.Client.getEncodeParam(applicationId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitExternalId)) {
            body.put("organizationalUnitExternalId", request.organizationalUnitExternalId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOrganizationalUnitIdByExternalId"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + instanceId + "/" + applicationId + "/organizationalUnits/_/actions/getOrganizationalUnitIdByExternalId"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOrganizationalUnitIdByExternalIdResponse());
    }

    public GetUserResponse getUser(String instanceId, String applicationId, String userId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetUserHeaders headers = new GetUserHeaders();
        return this.getUserWithOptions(instanceId, applicationId, userId, headers, runtime);
    }

    public GetUserResponse getUserWithOptions(String instanceId, String applicationId, String userId, GetUserHeaders headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        applicationId = com.aliyun.openapiutil.Client.getEncodeParam(applicationId);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUser"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + instanceId + "/" + applicationId + "/users/" + userId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserResponse());
    }

    public GetUserIdByExternalIdResponse getUserIdByExternalId(String instanceId, String applicationId, GetUserIdByExternalIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetUserIdByExternalIdHeaders headers = new GetUserIdByExternalIdHeaders();
        return this.getUserIdByExternalIdWithOptions(instanceId, applicationId, request, headers, runtime);
    }

    public GetUserIdByExternalIdResponse getUserIdByExternalIdWithOptions(String instanceId, String applicationId, GetUserIdByExternalIdRequest request, GetUserIdByExternalIdHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        applicationId = com.aliyun.openapiutil.Client.getEncodeParam(applicationId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userExternalId)) {
            body.put("userExternalId", request.userExternalId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserIdByExternalId"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + instanceId + "/" + applicationId + "/users/_/actions/getUserIdByExternalId"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserIdByExternalIdResponse());
    }

    public GetUserInfoResponse getUserInfo(String instanceId, String applicationId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetUserInfoHeaders headers = new GetUserInfoHeaders();
        return this.getUserInfoWithOptions(instanceId, applicationId, headers, runtime);
    }

    public GetUserInfoResponse getUserInfoWithOptions(String instanceId, String applicationId, GetUserInfoHeaders headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        applicationId = com.aliyun.openapiutil.Client.getEncodeParam(applicationId);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserInfo"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + instanceId + "/" + applicationId + "/oauth2/userinfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserInfoResponse());
    }

    public GetUserPasswordPolicyResponse getUserPasswordPolicy(String instanceId, String applicationId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        GetUserPasswordPolicyHeaders headers = new GetUserPasswordPolicyHeaders();
        return this.getUserPasswordPolicyWithOptions(instanceId, applicationId, headers, runtime);
    }

    public GetUserPasswordPolicyResponse getUserPasswordPolicyWithOptions(String instanceId, String applicationId, GetUserPasswordPolicyHeaders headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        applicationId = com.aliyun.openapiutil.Client.getEncodeParam(applicationId);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserPasswordPolicy"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + instanceId + "/" + applicationId + "/users/_/actions/getUserPasswordPolicy"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserPasswordPolicyResponse());
    }

    public ListOrganizationalUnitParentIdsResponse listOrganizationalUnitParentIds(String instanceId, String applicationId, String organizationalUnitId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        ListOrganizationalUnitParentIdsHeaders headers = new ListOrganizationalUnitParentIdsHeaders();
        return this.listOrganizationalUnitParentIdsWithOptions(instanceId, applicationId, organizationalUnitId, headers, runtime);
    }

    public ListOrganizationalUnitParentIdsResponse listOrganizationalUnitParentIdsWithOptions(String instanceId, String applicationId, String organizationalUnitId, ListOrganizationalUnitParentIdsHeaders headers, RuntimeOptions runtime) throws Exception {
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        applicationId = com.aliyun.openapiutil.Client.getEncodeParam(applicationId);
        organizationalUnitId = com.aliyun.openapiutil.Client.getEncodeParam(organizationalUnitId);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOrganizationalUnitParentIds"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + instanceId + "/" + applicationId + "/organizationalUnits/" + organizationalUnitId + "/parentIds"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOrganizationalUnitParentIdsResponse());
    }

    public ListOrganizationalUnitsResponse listOrganizationalUnits(String instanceId, String applicationId, ListOrganizationalUnitsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        ListOrganizationalUnitsHeaders headers = new ListOrganizationalUnitsHeaders();
        return this.listOrganizationalUnitsWithOptions(instanceId, applicationId, request, headers, runtime);
    }

    public ListOrganizationalUnitsResponse listOrganizationalUnitsWithOptions(String instanceId, String applicationId, ListOrganizationalUnitsRequest request, ListOrganizationalUnitsHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        applicationId = com.aliyun.openapiutil.Client.getEncodeParam(applicationId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            query.put("parentId", request.parentId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOrganizationalUnits"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + instanceId + "/" + applicationId + "/organizationalUnits"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOrganizationalUnitsResponse());
    }

    public ListUsersResponse listUsers(String instanceId, String applicationId, ListUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        ListUsersHeaders headers = new ListUsersHeaders();
        return this.listUsersWithOptions(instanceId, applicationId, request, headers, runtime);
    }

    public ListUsersResponse listUsersWithOptions(String instanceId, String applicationId, ListUsersRequest request, ListUsersHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        applicationId = com.aliyun.openapiutil.Client.getEncodeParam(applicationId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitId)) {
            query.put("organizationalUnitId", request.organizationalUnitId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsers"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + instanceId + "/" + applicationId + "/users"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersResponse());
    }

    public PatchOrganizationalUnitResponse patchOrganizationalUnit(String instanceId, String applicationId, String organizationalUnitId, PatchOrganizationalUnitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        PatchOrganizationalUnitHeaders headers = new PatchOrganizationalUnitHeaders();
        return this.patchOrganizationalUnitWithOptions(instanceId, applicationId, organizationalUnitId, request, headers, runtime);
    }

    public PatchOrganizationalUnitResponse patchOrganizationalUnitWithOptions(String instanceId, String applicationId, String organizationalUnitId, PatchOrganizationalUnitRequest request, PatchOrganizationalUnitHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        applicationId = com.aliyun.openapiutil.Client.getEncodeParam(applicationId);
        organizationalUnitId = com.aliyun.openapiutil.Client.getEncodeParam(organizationalUnitId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitName)) {
            body.put("organizationalUnitName", request.organizationalUnitName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PatchOrganizationalUnit"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + instanceId + "/" + applicationId + "/organizationalUnits/" + organizationalUnitId + ""),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PatchOrganizationalUnitResponse());
    }

    public PatchUserResponse patchUser(String instanceId, String applicationId, String userId, PatchUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        PatchUserHeaders headers = new PatchUserHeaders();
        return this.patchUserWithOptions(instanceId, applicationId, userId, request, headers, runtime);
    }

    public PatchUserResponse patchUserWithOptions(String instanceId, String applicationId, String userId, PatchUserRequest request, PatchUserHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        applicationId = com.aliyun.openapiutil.Client.getEncodeParam(applicationId);
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            body.put("email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emailVerified)) {
            body.put("emailVerified", request.emailVerified);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("phoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumberVerified)) {
            body.put("phoneNumberVerified", request.phoneNumberVerified);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneRegion)) {
            body.put("phoneRegion", request.phoneRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("username", request.username);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PatchUser"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + instanceId + "/" + applicationId + "/users/" + userId + ""),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PatchUserResponse());
    }

    public RevokeTokenResponse revokeToken(String instanceId, String applicationId, RevokeTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.revokeTokenWithOptions(instanceId, applicationId, request, headers, runtime);
    }

    public RevokeTokenResponse revokeTokenWithOptions(String instanceId, String applicationId, RevokeTokenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        instanceId = com.aliyun.openapiutil.Client.getEncodeParam(instanceId);
        applicationId = com.aliyun.openapiutil.Client.getEncodeParam(applicationId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("client_id", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSecret)) {
            query.put("client_secret", request.clientSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenTypeHint)) {
            query.put("token_type_hint", request.tokenTypeHint);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeToken"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + instanceId + "/" + applicationId + "/oauth2/revoke"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeTokenResponse());
    }
}
