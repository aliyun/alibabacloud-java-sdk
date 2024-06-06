// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520;

import com.aliyun.tea.*;
import com.aliyun.idaas_doraemon20210520.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    /**
     * @summary 创建认证器请求
     *
     * @param request CreateAuthenticatorRegistrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAuthenticatorRegistrationResponse
     */
    public CreateAuthenticatorRegistrationResponse createAuthenticatorRegistrationWithOptions(CreateAuthenticatorRegistrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 创建认证器请求
     *
     * @param request CreateAuthenticatorRegistrationRequest
     * @return CreateAuthenticatorRegistrationResponse
     */
    public CreateAuthenticatorRegistrationResponse createAuthenticatorRegistration(CreateAuthenticatorRegistrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAuthenticatorRegistrationWithOptions(request, runtime);
    }

    /**
     * @summary 创建用户认证请求
     *
     * @param request CreateUserAuthenticateOptionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserAuthenticateOptionsResponse
     */
    public CreateUserAuthenticateOptionsResponse createUserAuthenticateOptionsWithOptions(CreateUserAuthenticateOptionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 创建用户认证请求
     *
     * @param request CreateUserAuthenticateOptionsRequest
     * @return CreateUserAuthenticateOptionsResponse
     */
    public CreateUserAuthenticateOptionsResponse createUserAuthenticateOptions(CreateUserAuthenticateOptionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserAuthenticateOptionsWithOptions(request, runtime);
    }

    /**
     * @summary 删除认证器
     *
     * @param request DeregisterAuthenticatorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeregisterAuthenticatorResponse
     */
    public DeregisterAuthenticatorResponse deregisterAuthenticatorWithOptions(DeregisterAuthenticatorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 删除认证器
     *
     * @param request DeregisterAuthenticatorRequest
     * @return DeregisterAuthenticatorResponse
     */
    public DeregisterAuthenticatorResponse deregisterAuthenticator(DeregisterAuthenticatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deregisterAuthenticatorWithOptions(request, runtime);
    }

    /**
     * @summary 获取access_token
     *
     * @param request FetchAccessTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FetchAccessTokenResponse
     */
    public FetchAccessTokenResponse fetchAccessTokenWithOptions(FetchAccessTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 获取access_token
     *
     * @param request FetchAccessTokenRequest
     * @return FetchAccessTokenResponse
     */
    public FetchAccessTokenResponse fetchAccessToken(FetchAccessTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.fetchAccessTokenWithOptions(request, runtime);
    }

    /**
     * @summary 查询单个认证器
     *
     * @param request GetAuthenticatorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAuthenticatorResponse
     */
    public GetAuthenticatorResponse getAuthenticatorWithOptions(GetAuthenticatorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 查询单个认证器
     *
     * @param request GetAuthenticatorRequest
     * @return GetAuthenticatorResponse
     */
    public GetAuthenticatorResponse getAuthenticator(GetAuthenticatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAuthenticatorWithOptions(request, runtime);
    }

    /**
     * @summary 列表查询认证事件日志
     *
     * @param request ListAuthenticationLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAuthenticationLogsResponse
     */
    public ListAuthenticationLogsResponse listAuthenticationLogsWithOptions(ListAuthenticationLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 列表查询认证事件日志
     *
     * @param request ListAuthenticationLogsRequest
     * @return ListAuthenticationLogsResponse
     */
    public ListAuthenticationLogsResponse listAuthenticationLogs(ListAuthenticationLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAuthenticationLogsWithOptions(request, runtime);
    }

    /**
     * @summary 列表查询认证器操作日志
     *
     * @param request ListAuthenticatorOpsLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAuthenticatorOpsLogsResponse
     */
    public ListAuthenticatorOpsLogsResponse listAuthenticatorOpsLogsWithOptions(ListAuthenticatorOpsLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 列表查询认证器操作日志
     *
     * @param request ListAuthenticatorOpsLogsRequest
     * @return ListAuthenticatorOpsLogsResponse
     */
    public ListAuthenticatorOpsLogsResponse listAuthenticatorOpsLogs(ListAuthenticatorOpsLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAuthenticatorOpsLogsWithOptions(request, runtime);
    }

    /**
     * @summary 列表查询认证器
     *
     * @param request ListAuthenticatorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAuthenticatorsResponse
     */
    public ListAuthenticatorsResponse listAuthenticatorsWithOptions(ListAuthenticatorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 列表查询认证器
     *
     * @param request ListAuthenticatorsRequest
     * @return ListAuthenticatorsResponse
     */
    public ListAuthenticatorsResponse listAuthenticators(ListAuthenticatorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAuthenticatorsWithOptions(request, runtime);
    }

    /**
     * @summary 查询按量计费订单列表
     *
     * @param request ListCostUnitOrdersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCostUnitOrdersResponse
     */
    public ListCostUnitOrdersResponse listCostUnitOrdersWithOptions(ListCostUnitOrdersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 查询按量计费订单列表
     *
     * @param request ListCostUnitOrdersRequest
     * @return ListCostUnitOrdersResponse
     */
    public ListCostUnitOrdersResponse listCostUnitOrders(ListCostUnitOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCostUnitOrdersWithOptions(request, runtime);
    }

    /**
     * @summary 查询用量消费统计记录列表
     *
     * @param request ListOrderConsumeStatisticRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOrderConsumeStatisticRecordsResponse
     */
    public ListOrderConsumeStatisticRecordsResponse listOrderConsumeStatisticRecordsWithOptions(ListOrderConsumeStatisticRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliOrderCode)) {
            query.put("AliOrderCode", request.aliOrderCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationExternalId)) {
            query.put("ApplicationExternalId", request.applicationExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statisticTimeMax)) {
            query.put("StatisticTimeMax", request.statisticTimeMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statisticTimeMin)) {
            query.put("StatisticTimeMin", request.statisticTimeMin);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 查询用量消费统计记录列表
     *
     * @param request ListOrderConsumeStatisticRecordsRequest
     * @return ListOrderConsumeStatisticRecordsResponse
     */
    public ListOrderConsumeStatisticRecordsResponse listOrderConsumeStatisticRecords(ListOrderConsumeStatisticRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOrderConsumeStatisticRecordsWithOptions(request, runtime);
    }

    /**
     * @summary 弱密码检测
     *
     * @param request ListPwnedPasswordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPwnedPasswordsResponse
     */
    public ListPwnedPasswordsResponse listPwnedPasswordsWithOptions(ListPwnedPasswordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.prefixHexPasswordSha1Hash)) {
            query.put("PrefixHexPasswordSha1Hash", request.prefixHexPasswordSha1Hash);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 弱密码检测
     *
     * @param request ListPwnedPasswordsRequest
     * @return ListPwnedPasswordsResponse
     */
    public ListPwnedPasswordsResponse listPwnedPasswords(ListPwnedPasswordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPwnedPasswordsWithOptions(request, runtime);
    }

    /**
     * @summary 查询应用用户
     *
     * @param request ListUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationExternalId)) {
            query.put("ApplicationExternalId", request.applicationExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 查询应用用户
     *
     * @param request ListUsersRequest
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    /**
     * @summary 短信回执查询
     *
     * @param request QuerySmsReportsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySmsReportsResponse
     */
    public QuerySmsReportsResponse querySmsReportsWithOptions(QuerySmsReportsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySmsReports"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySmsReportsResponse());
    }

    /**
     * @summary 短信回执查询
     *
     * @param request QuerySmsReportsRequest
     * @return QuerySmsReportsResponse
     */
    public QuerySmsReportsResponse querySmsReports(QuerySmsReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySmsReportsWithOptions(request, runtime);
    }

    /**
     * @summary 短信上行查询
     *
     * @param request QuerySmsUpsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySmsUpsResponse
     */
    public QuerySmsUpsResponse querySmsUpsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySmsUps"),
            new TeaPair("version", "2021-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySmsUpsResponse());
    }

    /**
     * @summary 短信上行查询
     *
     * @return QuerySmsUpsResponse
     */
    public QuerySmsUpsResponse querySmsUps() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySmsUpsWithOptions(runtime);
    }

    /**
     * @summary 注册认证器
     *
     * @param request RegisterAuthenticatorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterAuthenticatorResponse
     */
    public RegisterAuthenticatorResponse registerAuthenticatorWithOptions(RegisterAuthenticatorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 注册认证器
     *
     * @param request RegisterAuthenticatorRequest
     * @return RegisterAuthenticatorResponse
     */
    public RegisterAuthenticatorResponse registerAuthenticator(RegisterAuthenticatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerAuthenticatorWithOptions(request, runtime);
    }

    /**
     * @summary 认证接口
     *
     * @param request ServiceInvokeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ServiceInvokeResponse
     */
    public ServiceInvokeResponse serviceInvokeWithOptions(ServiceInvokeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 认证接口
     *
     * @param request ServiceInvokeRequest
     * @return ServiceInvokeResponse
     */
    public ServiceInvokeResponse serviceInvoke(ServiceInvokeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.serviceInvokeWithOptions(request, runtime);
    }

    /**
     * @summary 更新认证器名字
     *
     * @param request UpdateAuthenticatorAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAuthenticatorAttributeResponse
     */
    public UpdateAuthenticatorAttributeResponse updateAuthenticatorAttributeWithOptions(UpdateAuthenticatorAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 更新认证器名字
     *
     * @param request UpdateAuthenticatorAttributeRequest
     * @return UpdateAuthenticatorAttributeResponse
     */
    public UpdateAuthenticatorAttributeResponse updateAuthenticatorAttribute(UpdateAuthenticatorAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAuthenticatorAttributeWithOptions(request, runtime);
    }

    /**
     * @summary 验证id_token
     *
     * @param request VerifyIdTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyIdTokenResponse
     */
    public VerifyIdTokenResponse verifyIdTokenWithOptions(VerifyIdTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationExternalId)) {
            query.put("ApplicationExternalId", request.applicationExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwtIdToken)) {
            query.put("JwtIdToken", request.jwtIdToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 验证id_token
     *
     * @param request VerifyIdTokenRequest
     * @return VerifyIdTokenResponse
     */
    public VerifyIdTokenResponse verifyIdToken(VerifyIdTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyIdTokenWithOptions(request, runtime);
    }

    /**
     * @summary 认证用户
     *
     * @param request VerifyUserAuthenticationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyUserAuthenticationResponse
     */
    public VerifyUserAuthenticationResponse verifyUserAuthenticationWithOptions(VerifyUserAuthenticationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 认证用户
     *
     * @param request VerifyUserAuthenticationRequest
     * @return VerifyUserAuthenticationResponse
     */
    public VerifyUserAuthenticationResponse verifyUserAuthentication(VerifyUserAuthenticationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyUserAuthenticationWithOptions(request, runtime);
    }
}
