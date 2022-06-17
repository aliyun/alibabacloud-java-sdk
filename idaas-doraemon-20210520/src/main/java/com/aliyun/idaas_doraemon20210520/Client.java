// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520;

import com.aliyun.tea.*;
import com.aliyun.idaas_doraemon20210520.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "idaas-doraemon.cn-hangzhou.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("idaas-doraemon", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateAuthenticatorRegistrationResponse createAuthenticatorRegistrationWithOptions(CreateAuthenticatorRegistrationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationExternalId)) {
            query.put("ApplicationExternalId", request.applicationExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authenticatorType)) {
            query.put("AuthenticatorType", request.authenticatorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientExtendParamsJson)) {
            query.put("ClientExtendParamsJson", request.clientExtendParamsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientExtendParamsJsonSign)) {
            query.put("ClientExtendParamsJsonSign", request.clientExtendParamsJsonSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrationContext)) {
            query.put("RegistrationContext", request.registrationContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverExtendParamsJson)) {
            query.put("ServerExtendParamsJson", request.serverExtendParamsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDisplayName)) {
            query.put("UserDisplayName", request.userDisplayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAuthenticatorRegistration"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAuthenticatorRegistrationResponse());
    }

    public CreateAuthenticatorRegistrationResponse createAuthenticatorRegistration(CreateAuthenticatorRegistrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAuthenticatorRegistrationWithOptions(request, runtime);
    }

    public CreateUserAuthenticateOptionsResponse createUserAuthenticateOptionsWithOptions(CreateUserAuthenticateOptionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationExternalId)) {
            query.put("ApplicationExternalId", request.applicationExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authenticatorType)) {
            query.put("AuthenticatorType", request.authenticatorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindHashBase64)) {
            query.put("BindHashBase64", request.bindHashBase64);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientExtendParamsJson)) {
            query.put("ClientExtendParamsJson", request.clientExtendParamsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientExtendParamsJsonSign)) {
            query.put("ClientExtendParamsJsonSign", request.clientExtendParamsJsonSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverExtendParamsJson)) {
            query.put("ServerExtendParamsJson", request.serverExtendParamsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUserAuthenticateOptions"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserAuthenticateOptionsResponse());
    }

    public CreateUserAuthenticateOptionsResponse createUserAuthenticateOptions(CreateUserAuthenticateOptionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUserAuthenticateOptionsWithOptions(request, runtime);
    }

    public DeregisterAuthenticatorResponse deregisterAuthenticatorWithOptions(DeregisterAuthenticatorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationExternalId)) {
            query.put("ApplicationExternalId", request.applicationExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authenticatorUuid)) {
            query.put("AuthenticatorUuid", request.authenticatorUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeregisterAuthenticator"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeregisterAuthenticatorResponse());
    }

    public DeregisterAuthenticatorResponse deregisterAuthenticator(DeregisterAuthenticatorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deregisterAuthenticatorWithOptions(request, runtime);
    }

    public FetchAccessTokenResponse fetchAccessTokenWithOptions(FetchAccessTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationExternalId)) {
            query.put("ApplicationExternalId", request.applicationExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobileExtendParamsJson)) {
            query.put("MobileExtendParamsJson", request.mobileExtendParamsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobileExtendParamsJsonSign)) {
            query.put("MobileExtendParamsJsonSign", request.mobileExtendParamsJsonSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverExtendParamsJson)) {
            query.put("ServerExtendParamsJson", request.serverExtendParamsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XClientIp)) {
            query.put("XClientIp", request.XClientIp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FetchAccessToken"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FetchAccessTokenResponse());
    }

    public FetchAccessTokenResponse fetchAccessToken(FetchAccessTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.fetchAccessTokenWithOptions(request, runtime);
    }

    public GetAuthenticatorResponse getAuthenticatorWithOptions(GetAuthenticatorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationExternalId)) {
            query.put("ApplicationExternalId", request.applicationExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authenticatorUuid)) {
            query.put("AuthenticatorUuid", request.authenticatorUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAuthenticator"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAuthenticatorResponse());
    }

    public GetAuthenticatorResponse getAuthenticator(GetAuthenticatorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAuthenticatorWithOptions(request, runtime);
    }

    public ListAuthenticationLogsResponse listAuthenticationLogsWithOptions(ListAuthenticationLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationExternalId)) {
            query.put("ApplicationExternalId", request.applicationExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authenticatorType)) {
            query.put("AuthenticatorType", request.authenticatorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authenticatorUuid)) {
            query.put("AuthenticatorUuid", request.authenticatorUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialId)) {
            query.put("CredentialId", request.credentialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromTime)) {
            query.put("FromTime", request.fromTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logTag)) {
            query.put("LogTag", request.logTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toTime)) {
            query.put("ToTime", request.toTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAuthenticationLogs"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthenticationLogsResponse());
    }

    public ListAuthenticationLogsResponse listAuthenticationLogs(ListAuthenticationLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAuthenticationLogsWithOptions(request, runtime);
    }

    public ListAuthenticatorOpsLogsResponse listAuthenticatorOpsLogsWithOptions(ListAuthenticatorOpsLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationExternalId)) {
            query.put("ApplicationExternalId", request.applicationExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authenticatorType)) {
            query.put("AuthenticatorType", request.authenticatorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authenticatorUuid)) {
            query.put("AuthenticatorUuid", request.authenticatorUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromTime)) {
            query.put("FromTime", request.fromTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toTime)) {
            query.put("ToTime", request.toTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAuthenticatorOpsLogs"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthenticatorOpsLogsResponse());
    }

    public ListAuthenticatorOpsLogsResponse listAuthenticatorOpsLogs(ListAuthenticatorOpsLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAuthenticatorOpsLogsWithOptions(request, runtime);
    }

    public ListAuthenticatorsResponse listAuthenticatorsWithOptions(ListAuthenticatorsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationExternalId)) {
            query.put("ApplicationExternalId", request.applicationExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authenticatorType)) {
            query.put("AuthenticatorType", request.authenticatorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAuthenticators"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthenticatorsResponse());
    }

    public ListAuthenticatorsResponse listAuthenticators(ListAuthenticatorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAuthenticatorsWithOptions(request, runtime);
    }

    public ListCostUnitOrdersResponse listCostUnitOrdersWithOptions(ListCostUnitOrdersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginDate)) {
            query.put("BeginDate", request.beginDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.finalDate)) {
            query.put("FinalDate", request.finalDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCostUnitOrders"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCostUnitOrdersResponse());
    }

    public ListCostUnitOrdersResponse listCostUnitOrders(ListCostUnitOrdersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCostUnitOrdersWithOptions(request, runtime);
    }

    public ListOrderConsumeStatisticRecordsResponse listOrderConsumeStatisticRecordsWithOptions(ListOrderConsumeStatisticRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliOrderCode)) {
            query.put("AliOrderCode", request.aliOrderCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statisticTimeMax)) {
            query.put("StatisticTimeMax", request.statisticTimeMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statisticTimeMin)) {
            query.put("StatisticTimeMin", request.statisticTimeMin);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOrderConsumeStatisticRecords"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOrderConsumeStatisticRecordsResponse());
    }

    public ListOrderConsumeStatisticRecordsResponse listOrderConsumeStatisticRecords(ListOrderConsumeStatisticRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOrderConsumeStatisticRecordsWithOptions(request, runtime);
    }

    public ListPwnedPasswordsResponse listPwnedPasswordsWithOptions(ListPwnedPasswordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.prefixHexPasswordSha1Hash)) {
            query.put("PrefixHexPasswordSha1Hash", request.prefixHexPasswordSha1Hash);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPwnedPasswords"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPwnedPasswordsResponse());
    }

    public ListPwnedPasswordsResponse listPwnedPasswords(ListPwnedPasswordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPwnedPasswordsWithOptions(request, runtime);
    }

    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationExternalId)) {
            query.put("ApplicationExternalId", request.applicationExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsers"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersResponse());
    }

    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    public RegisterAuthenticatorResponse registerAuthenticatorWithOptions(RegisterAuthenticatorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationExternalId)) {
            query.put("ApplicationExternalId", request.applicationExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authenticatorName)) {
            query.put("AuthenticatorName", request.authenticatorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authenticatorType)) {
            query.put("AuthenticatorType", request.authenticatorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientExtendParamsJson)) {
            query.put("ClientExtendParamsJson", request.clientExtendParamsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientExtendParamsJsonSign)) {
            query.put("ClientExtendParamsJsonSign", request.clientExtendParamsJsonSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logParams)) {
            query.put("LogParams", request.logParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrationContext)) {
            query.put("RegistrationContext", request.registrationContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requireChallengeBase64)) {
            query.put("RequireChallengeBase64", request.requireChallengeBase64);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverExtendParamsJson)) {
            query.put("ServerExtendParamsJson", request.serverExtendParamsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSourceIp)) {
            query.put("UserSourceIp", request.userSourceIp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterAuthenticator"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterAuthenticatorResponse());
    }

    public RegisterAuthenticatorResponse registerAuthenticator(RegisterAuthenticatorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerAuthenticatorWithOptions(request, runtime);
    }

    public ServiceInvokeResponse serviceInvokeWithOptions(ServiceInvokeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationExternalId)) {
            query.put("ApplicationExternalId", request.applicationExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.doraemonAction)) {
            query.put("DoraemonAction", request.doraemonAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobileExtendParamsJson)) {
            query.put("MobileExtendParamsJson", request.mobileExtendParamsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobileExtendParamsJsonSign)) {
            query.put("MobileExtendParamsJsonSign", request.mobileExtendParamsJsonSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverExtendParamsJson)) {
            query.put("ServerExtendParamsJson", request.serverExtendParamsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.testModel)) {
            query.put("TestModel", request.testModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XClientIp)) {
            query.put("XClientIp", request.XClientIp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ServiceInvoke"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ServiceInvokeResponse());
    }

    public ServiceInvokeResponse serviceInvoke(ServiceInvokeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.serviceInvokeWithOptions(request, runtime);
    }

    public UpdateAuthenticatorAttributeResponse updateAuthenticatorAttributeWithOptions(UpdateAuthenticatorAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationExternalId)) {
            query.put("ApplicationExternalId", request.applicationExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authenticatorName)) {
            query.put("AuthenticatorName", request.authenticatorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authenticatorUuid)) {
            query.put("AuthenticatorUuid", request.authenticatorUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAuthenticatorAttribute"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAuthenticatorAttributeResponse());
    }

    public UpdateAuthenticatorAttributeResponse updateAuthenticatorAttribute(UpdateAuthenticatorAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAuthenticatorAttributeWithOptions(request, runtime);
    }

    public VerifyIdTokenResponse verifyIdTokenWithOptions(VerifyIdTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationExternalId)) {
            query.put("ApplicationExternalId", request.applicationExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwtIdToken)) {
            query.put("JwtIdToken", request.jwtIdToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyIdToken"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyIdTokenResponse());
    }

    public VerifyIdTokenResponse verifyIdToken(VerifyIdTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyIdTokenWithOptions(request, runtime);
    }

    public VerifyUserAuthenticationResponse verifyUserAuthenticationWithOptions(VerifyUserAuthenticationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationExternalId)) {
            query.put("ApplicationExternalId", request.applicationExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authenticationContext)) {
            query.put("AuthenticationContext", request.authenticationContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authenticatorType)) {
            query.put("AuthenticatorType", request.authenticatorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientExtendParamsJson)) {
            query.put("ClientExtendParamsJson", request.clientExtendParamsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientExtendParamsJsonSign)) {
            query.put("ClientExtendParamsJsonSign", request.clientExtendParamsJsonSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logParams)) {
            query.put("LogParams", request.logParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logTag)) {
            query.put("LogTag", request.logTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requireBindHashBase64)) {
            query.put("RequireBindHashBase64", request.requireBindHashBase64);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requireChallengeBase64)) {
            query.put("RequireChallengeBase64", request.requireChallengeBase64);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverExtendParamsJson)) {
            query.put("ServerExtendParamsJson", request.serverExtendParamsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSourceIp)) {
            query.put("UserSourceIp", request.userSourceIp);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyUserAuthentication"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyUserAuthenticationResponse());
    }

    public VerifyUserAuthenticationResponse verifyUserAuthentication(VerifyUserAuthenticationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyUserAuthenticationWithOptions(request, runtime);
    }
}
