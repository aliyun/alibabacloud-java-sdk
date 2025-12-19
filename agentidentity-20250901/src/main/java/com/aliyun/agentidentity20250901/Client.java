// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901;

import com.aliyun.tea.*;
import com.aliyun.agentidentity20250901.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("agentidentity", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    /**
     * <b>summary</b> : 
     * <p>创建一个 API 密钥凭证提供商</p>
     * 
     * @param request CreateAPIKeyCredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAPIKeyCredentialProviderResponse
     */
    public CreateAPIKeyCredentialProviderResponse createAPIKeyCredentialProviderWithOptions(CreateAPIKeyCredentialProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.APIKey)) {
            body.put("APIKey", request.APIKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.APIKeyCredentialProviderName)) {
            body.put("APIKeyCredentialProviderName", request.APIKeyCredentialProviderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAPIKeyCredentialProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAPIKeyCredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个 API 密钥凭证提供商</p>
     * 
     * @param request CreateAPIKeyCredentialProviderRequest
     * @return CreateAPIKeyCredentialProviderResponse
     */
    public CreateAPIKeyCredentialProviderResponse createAPIKeyCredentialProvider(CreateAPIKeyCredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAPIKeyCredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建IdentityProvider</p>
     * 
     * @param tmpReq CreateIdentityProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIdentityProviderResponse
     */
    public CreateIdentityProviderResponse createIdentityProviderWithOptions(CreateIdentityProviderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateIdentityProviderShrinkRequest request = new CreateIdentityProviderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.allowedAudience)) {
            request.allowedAudienceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.allowedAudience, "AllowedAudience", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowedAudienceShrink)) {
            body.put("AllowedAudience", request.allowedAudienceShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.discoveryURL)) {
            body.put("DiscoveryURL", request.discoveryURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderName)) {
            body.put("IdentityProviderName", request.identityProviderName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIdentityProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIdentityProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建IdentityProvider</p>
     * 
     * @param request CreateIdentityProviderRequest
     * @return CreateIdentityProviderResponse
     */
    public CreateIdentityProviderResponse createIdentityProvider(CreateIdentityProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIdentityProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建 OAuth2 凭证提供商</p>
     * 
     * @param tmpReq CreateOAuth2CredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOAuth2CredentialProviderResponse
     */
    public CreateOAuth2CredentialProviderResponse createOAuth2CredentialProviderWithOptions(CreateOAuth2CredentialProviderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateOAuth2CredentialProviderShrinkRequest request = new CreateOAuth2CredentialProviderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.OAuth2ProviderConfig)) {
            request.OAuth2ProviderConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.OAuth2ProviderConfig, "OAuth2ProviderConfig", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callbackURL)) {
            body.put("CallbackURL", request.callbackURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialProviderVendor)) {
            body.put("CredentialProviderVendor", request.credentialProviderVendor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OAuth2CredentialProviderName)) {
            body.put("OAuth2CredentialProviderName", request.OAuth2CredentialProviderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OAuth2ProviderConfigShrink)) {
            body.put("OAuth2ProviderConfig", request.OAuth2ProviderConfigShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOAuth2CredentialProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOAuth2CredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建 OAuth2 凭证提供商</p>
     * 
     * @param request CreateOAuth2CredentialProviderRequest
     * @return CreateOAuth2CredentialProviderResponse
     */
    public CreateOAuth2CredentialProviderResponse createOAuth2CredentialProvider(CreateOAuth2CredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOAuth2CredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建WorkloadIdentity</p>
     * 
     * @param tmpReq CreateWorkloadIdentityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkloadIdentityResponse
     */
    public CreateWorkloadIdentityResponse createWorkloadIdentityWithOptions(CreateWorkloadIdentityRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateWorkloadIdentityShrinkRequest request = new CreateWorkloadIdentityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.allowedResourceOAuth2ReturnURLs)) {
            request.allowedResourceOAuth2ReturnURLsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.allowedResourceOAuth2ReturnURLs, "AllowedResourceOAuth2ReturnURLs", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowedResourceOAuth2ReturnURLsShrink)) {
            body.put("AllowedResourceOAuth2ReturnURLs", request.allowedResourceOAuth2ReturnURLsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderName)) {
            body.put("IdentityProviderName", request.identityProviderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleArn)) {
            body.put("RoleArn", request.roleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadIdentityName)) {
            body.put("WorkloadIdentityName", request.workloadIdentityName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkloadIdentity"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkloadIdentityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建WorkloadIdentity</p>
     * 
     * @param request CreateWorkloadIdentityRequest
     * @return CreateWorkloadIdentityResponse
     */
    public CreateWorkloadIdentityResponse createWorkloadIdentity(CreateWorkloadIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWorkloadIdentityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个 API 密钥凭证提供商</p>
     * 
     * @param request DeleteAPIKeyCredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAPIKeyCredentialProviderResponse
     */
    public DeleteAPIKeyCredentialProviderResponse deleteAPIKeyCredentialProviderWithOptions(DeleteAPIKeyCredentialProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.APIKeyCredentialProviderName)) {
            body.put("APIKeyCredentialProviderName", request.APIKeyCredentialProviderName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAPIKeyCredentialProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAPIKeyCredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个 API 密钥凭证提供商</p>
     * 
     * @param request DeleteAPIKeyCredentialProviderRequest
     * @return DeleteAPIKeyCredentialProviderResponse
     */
    public DeleteAPIKeyCredentialProviderResponse deleteAPIKeyCredentialProvider(DeleteAPIKeyCredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAPIKeyCredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除IdentityProvider</p>
     * 
     * @param request DeleteIdentityProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIdentityProviderResponse
     */
    public DeleteIdentityProviderResponse deleteIdentityProviderWithOptions(DeleteIdentityProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderName)) {
            body.put("IdentityProviderName", request.identityProviderName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIdentityProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIdentityProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除IdentityProvider</p>
     * 
     * @param request DeleteIdentityProviderRequest
     * @return DeleteIdentityProviderResponse
     */
    public DeleteIdentityProviderResponse deleteIdentityProvider(DeleteIdentityProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIdentityProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除 OAuth2 凭证提供商</p>
     * 
     * @param request DeleteOAuth2CredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteOAuth2CredentialProviderResponse
     */
    public DeleteOAuth2CredentialProviderResponse deleteOAuth2CredentialProviderWithOptions(DeleteOAuth2CredentialProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.OAuth2CredentialProviderName)) {
            body.put("OAuth2CredentialProviderName", request.OAuth2CredentialProviderName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOAuth2CredentialProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOAuth2CredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除 OAuth2 凭证提供商</p>
     * 
     * @param request DeleteOAuth2CredentialProviderRequest
     * @return DeleteOAuth2CredentialProviderResponse
     */
    public DeleteOAuth2CredentialProviderResponse deleteOAuth2CredentialProvider(DeleteOAuth2CredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteOAuth2CredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除WorkloadIdentity</p>
     * 
     * @param request DeleteWorkloadIdentityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWorkloadIdentityResponse
     */
    public DeleteWorkloadIdentityResponse deleteWorkloadIdentityWithOptions(DeleteWorkloadIdentityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workloadIdentityName)) {
            body.put("WorkloadIdentityName", request.workloadIdentityName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkloadIdentity"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkloadIdentityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除WorkloadIdentity</p>
     * 
     * @param request DeleteWorkloadIdentityRequest
     * @return DeleteWorkloadIdentityResponse
     */
    public DeleteWorkloadIdentityResponse deleteWorkloadIdentity(DeleteWorkloadIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWorkloadIdentityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询一个 API 密钥凭证提供商</p>
     * 
     * @param request GetAPIKeyCredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAPIKeyCredentialProviderResponse
     */
    public GetAPIKeyCredentialProviderResponse getAPIKeyCredentialProviderWithOptions(GetAPIKeyCredentialProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.APIKeyCredentialProviderName)) {
            body.put("APIKeyCredentialProviderName", request.APIKeyCredentialProviderName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAPIKeyCredentialProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAPIKeyCredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询一个 API 密钥凭证提供商</p>
     * 
     * @param request GetAPIKeyCredentialProviderRequest
     * @return GetAPIKeyCredentialProviderResponse
     */
    public GetAPIKeyCredentialProviderResponse getAPIKeyCredentialProvider(GetAPIKeyCredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAPIKeyCredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用</p>
     * 
     * @param request GetIdentityProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIdentityProviderResponse
     */
    public GetIdentityProviderResponse getIdentityProviderWithOptions(GetIdentityProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderName)) {
            body.put("IdentityProviderName", request.identityProviderName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIdentityProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIdentityProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用</p>
     * 
     * @param request GetIdentityProviderRequest
     * @return GetIdentityProviderResponse
     */
    public GetIdentityProviderResponse getIdentityProvider(GetIdentityProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIdentityProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询 OAuth2 凭证提供商</p>
     * 
     * @param request GetOAuth2CredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOAuth2CredentialProviderResponse
     */
    public GetOAuth2CredentialProviderResponse getOAuth2CredentialProviderWithOptions(GetOAuth2CredentialProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.OAuth2CredentialProviderName)) {
            body.put("OAuth2CredentialProviderName", request.OAuth2CredentialProviderName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOAuth2CredentialProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOAuth2CredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询 OAuth2 凭证提供商</p>
     * 
     * @param request GetOAuth2CredentialProviderRequest
     * @return GetOAuth2CredentialProviderResponse
     */
    public GetOAuth2CredentialProviderResponse getOAuth2CredentialProvider(GetOAuth2CredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOAuth2CredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用</p>
     * 
     * @param request GetWorkloadIdentityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkloadIdentityResponse
     */
    public GetWorkloadIdentityResponse getWorkloadIdentityWithOptions(GetWorkloadIdentityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workloadIdentityName)) {
            body.put("WorkloadIdentityName", request.workloadIdentityName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkloadIdentity"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkloadIdentityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用</p>
     * 
     * @param request GetWorkloadIdentityRequest
     * @return GetWorkloadIdentityResponse
     */
    public GetWorkloadIdentityResponse getWorkloadIdentity(GetWorkloadIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkloadIdentityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出 API 密钥凭证提供商</p>
     * 
     * @param request ListAPIKeyCredentialProvidersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAPIKeyCredentialProvidersResponse
     */
    public ListAPIKeyCredentialProvidersResponse listAPIKeyCredentialProvidersWithOptions(ListAPIKeyCredentialProvidersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAPIKeyCredentialProviders"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAPIKeyCredentialProvidersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出 API 密钥凭证提供商</p>
     * 
     * @param request ListAPIKeyCredentialProvidersRequest
     * @return ListAPIKeyCredentialProvidersResponse
     */
    public ListAPIKeyCredentialProvidersResponse listAPIKeyCredentialProviders(ListAPIKeyCredentialProvidersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAPIKeyCredentialProvidersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出IdentityProvider</p>
     * 
     * @param request ListIdentityProvidersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIdentityProvidersResponse
     */
    public ListIdentityProvidersResponse listIdentityProvidersWithOptions(ListIdentityProvidersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIdentityProviders"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIdentityProvidersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出IdentityProvider</p>
     * 
     * @param request ListIdentityProvidersRequest
     * @return ListIdentityProvidersResponse
     */
    public ListIdentityProvidersResponse listIdentityProviders(ListIdentityProvidersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIdentityProvidersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出 OAuth2 凭证提供商</p>
     * 
     * @param request ListOAuth2CredentialProvidersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOAuth2CredentialProvidersResponse
     */
    public ListOAuth2CredentialProvidersResponse listOAuth2CredentialProvidersWithOptions(ListOAuth2CredentialProvidersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOAuth2CredentialProviders"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOAuth2CredentialProvidersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出 OAuth2 凭证提供商</p>
     * 
     * @param request ListOAuth2CredentialProvidersRequest
     * @return ListOAuth2CredentialProvidersResponse
     */
    public ListOAuth2CredentialProvidersResponse listOAuth2CredentialProviders(ListOAuth2CredentialProvidersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOAuth2CredentialProvidersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出IdentityProvider</p>
     * 
     * @param request ListWorkloadIdentitiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkloadIdentitiesResponse
     */
    public ListWorkloadIdentitiesResponse listWorkloadIdentitiesWithOptions(ListWorkloadIdentitiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkloadIdentities"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkloadIdentitiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出IdentityProvider</p>
     * 
     * @param request ListWorkloadIdentitiesRequest
     * @return ListWorkloadIdentitiesResponse
     */
    public ListWorkloadIdentitiesResponse listWorkloadIdentities(ListWorkloadIdentitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWorkloadIdentitiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新一个 API 密钥凭证提供商</p>
     * 
     * @param request UpdateAPIKeyCredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAPIKeyCredentialProviderResponse
     */
    public UpdateAPIKeyCredentialProviderResponse updateAPIKeyCredentialProviderWithOptions(UpdateAPIKeyCredentialProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.APIKey)) {
            body.put("APIKey", request.APIKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.APIKeyCredentialProviderName)) {
            body.put("APIKeyCredentialProviderName", request.APIKeyCredentialProviderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAPIKeyCredentialProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAPIKeyCredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新一个 API 密钥凭证提供商</p>
     * 
     * @param request UpdateAPIKeyCredentialProviderRequest
     * @return UpdateAPIKeyCredentialProviderResponse
     */
    public UpdateAPIKeyCredentialProviderResponse updateAPIKeyCredentialProvider(UpdateAPIKeyCredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAPIKeyCredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新IdentityProvider</p>
     * 
     * @param tmpReq UpdateIdentityProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIdentityProviderResponse
     */
    public UpdateIdentityProviderResponse updateIdentityProviderWithOptions(UpdateIdentityProviderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateIdentityProviderShrinkRequest request = new UpdateIdentityProviderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.allowedAudience)) {
            request.allowedAudienceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.allowedAudience, "AllowedAudience", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowedAudienceShrink)) {
            body.put("AllowedAudience", request.allowedAudienceShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.discoveryURL)) {
            body.put("DiscoveryURL", request.discoveryURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderName)) {
            body.put("IdentityProviderName", request.identityProviderName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIdentityProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIdentityProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新IdentityProvider</p>
     * 
     * @param request UpdateIdentityProviderRequest
     * @return UpdateIdentityProviderResponse
     */
    public UpdateIdentityProviderResponse updateIdentityProvider(UpdateIdentityProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIdentityProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改 OAuth2 凭证提供商</p>
     * 
     * @param tmpReq UpdateOAuth2CredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOAuth2CredentialProviderResponse
     */
    public UpdateOAuth2CredentialProviderResponse updateOAuth2CredentialProviderWithOptions(UpdateOAuth2CredentialProviderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateOAuth2CredentialProviderShrinkRequest request = new UpdateOAuth2CredentialProviderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.OAuth2ProviderConfig)) {
            request.OAuth2ProviderConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.OAuth2ProviderConfig, "OAuth2ProviderConfig", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callbackURL)) {
            body.put("CallbackURL", request.callbackURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialProviderVendor)) {
            body.put("CredentialProviderVendor", request.credentialProviderVendor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OAuth2CredentialProviderName)) {
            body.put("OAuth2CredentialProviderName", request.OAuth2CredentialProviderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OAuth2ProviderConfigShrink)) {
            body.put("OAuth2ProviderConfig", request.OAuth2ProviderConfigShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOAuth2CredentialProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOAuth2CredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改 OAuth2 凭证提供商</p>
     * 
     * @param request UpdateOAuth2CredentialProviderRequest
     * @return UpdateOAuth2CredentialProviderResponse
     */
    public UpdateOAuth2CredentialProviderResponse updateOAuth2CredentialProvider(UpdateOAuth2CredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOAuth2CredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用</p>
     * 
     * @param tmpReq UpdateWorkloadIdentityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkloadIdentityResponse
     */
    public UpdateWorkloadIdentityResponse updateWorkloadIdentityWithOptions(UpdateWorkloadIdentityRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateWorkloadIdentityShrinkRequest request = new UpdateWorkloadIdentityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.allowedResourceOAuth2ReturnURLs)) {
            request.allowedResourceOAuth2ReturnURLsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.allowedResourceOAuth2ReturnURLs, "AllowedResourceOAuth2ReturnURLs", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowedResourceOAuth2ReturnURLsShrink)) {
            body.put("AllowedResourceOAuth2ReturnURLs", request.allowedResourceOAuth2ReturnURLsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderName)) {
            body.put("IdentityProviderName", request.identityProviderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleArn)) {
            body.put("RoleArn", request.roleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadIdentityName)) {
            body.put("WorkloadIdentityName", request.workloadIdentityName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkloadIdentity"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkloadIdentityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用</p>
     * 
     * @param request UpdateWorkloadIdentityRequest
     * @return UpdateWorkloadIdentityResponse
     */
    public UpdateWorkloadIdentityResponse updateWorkloadIdentity(UpdateWorkloadIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWorkloadIdentityWithOptions(request, runtime);
    }
}
