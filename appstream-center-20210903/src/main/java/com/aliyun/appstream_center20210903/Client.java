// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210903;

import com.aliyun.tea.*;
import com.aliyun.appstream_center20210903.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "appstream-center";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("appstream-center", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>description</b> :
     * <p>It is a time-consuming operation to issue connection credentials. Therefore, you may need to invoke this API operation multiple times to obtain the connection credentials.</p>
     * <ol>
     * <li>When you invoke the API for the first time, an application instance is allocated to the specified convenience account, and the application is started. The start node ID (<code>TaskId</code>) is returned.</li>
     * <li>When you invoke the API subsequently, you must pass the <code>TaskId</code> parameter as a request parameter to check whether the node is completed. When the returned node status (<code>TaskStatus</code>) is <code>Finished</code>, the connection ticket (<code>Ticket</code>) is also returned.<blockquote>
     * <ul>
     * <li>If the startup process is fast enough, the connection ticket (<code>Ticket</code>) may also be returned when you invoke the API for the first time.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the connection credentials for cloud applications.</p>
     * 
     * @param request GetConnectionTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConnectionTicketResponse
     */
    public GetConnectionTicketResponse getConnectionTicketWithOptions(GetConnectionTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessType)) {
            body.put("AccessType", request.accessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceId)) {
            body.put("AppInstanceId", request.appInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appPolicyId)) {
            body.put("AppPolicyId", request.appPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            body.put("AppVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoConnectInQueue)) {
            body.put("AutoConnectInQueue", request.autoConnectInQueue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            body.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientOS)) {
            body.put("ClientOS", request.clientOS);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            body.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVersion)) {
            body.put("ClientVersion", request.clientVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionProperties)) {
            body.put("ConnectionProperties", request.connectionProperties);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            body.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentConfig)) {
            body.put("EnvironmentConfig", request.environmentConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginRegionId)) {
            body.put("LoginRegionId", request.loginRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginToken)) {
            body.put("LoginToken", request.loginToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.param)) {
            body.put("Param", request.param);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requireUuidValidation)) {
            body.put("RequireUuidValidation", request.requireUuidValidation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConnectionTicket"),
            new TeaPair("version", "2021-09-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new GetConnectionTicketResponse());
    }

    /**
     * <b>description</b> :
     * <p>It is a time-consuming operation to issue connection credentials. Therefore, you may need to invoke this API operation multiple times to obtain the connection credentials.</p>
     * <ol>
     * <li>When you invoke the API for the first time, an application instance is allocated to the specified convenience account, and the application is started. The start node ID (<code>TaskId</code>) is returned.</li>
     * <li>When you invoke the API subsequently, you must pass the <code>TaskId</code> parameter as a request parameter to check whether the node is completed. When the returned node status (<code>TaskStatus</code>) is <code>Finished</code>, the connection ticket (<code>Ticket</code>) is also returned.<blockquote>
     * <ul>
     * <li>If the startup process is fast enough, the connection ticket (<code>Ticket</code>) may also be returned when you invoke the API for the first time.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the connection credentials for cloud applications.</p>
     * 
     * @param request GetConnectionTicketRequest
     * @return GetConnectionTicketResponse
     */
    public GetConnectionTicketResponse getConnectionTicket(GetConnectionTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConnectionTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of published applications.</p>
     * 
     * @param request ListPublishedAppInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPublishedAppInfoResponse
     */
    public ListPublishedAppInfoResponse listPublishedAppInfoWithOptions(ListPublishedAppInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            query.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryType)) {
            query.put("CategoryType", request.categoryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientOS)) {
            query.put("ClientOS", request.clientOS);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVersion)) {
            query.put("ClientVersion", request.clientVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginRegionId)) {
            query.put("LoginRegionId", request.loginRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginToken)) {
            query.put("LoginToken", request.loginToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderParam)) {
            query.put("OrderParam", request.orderParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortType)) {
            query.put("SortType", request.sortType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPublishedAppInfo"),
            new TeaPair("version", "2021-09-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new ListPublishedAppInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of published applications.</p>
     * 
     * @param request ListPublishedAppInfoRequest
     * @return ListPublishedAppInfoResponse
     */
    public ListPublishedAppInfoResponse listPublishedAppInfo(ListPublishedAppInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPublishedAppInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Prerequisites</h2>
     * <p>This operation is an anonymous API operation, but the server still verifies the logon status. The <code>LoginToken</code> and <code>SessionId</code> request parameters are actually required. If either parameter is missing, an HTTP 400 error is returned with the error code <code>InvalidParameter.loginToken</code> or <code>InvalidParameter.sessionId</code>.</p>
     * <h2>Obtain credentials</h2>
     * <p>To obtain the <code>LoginToken</code> and <code>SessionId</code> by using <code>GetLoginToken</code>, call the <code>GetLoginToken</code> operation of the <code>appstream-center</code> 2021-02-20 version. The 2021-09-03 version does not provide this operation. You can also call <code>RefreshLoginToken</code> to update and obtain the <code>LoginToken</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries running applications.</p>
     * 
     * @param request ListRunningAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRunningAppsResponse
     */
    public ListRunningAppsResponse listRunningAppsWithOptions(ListRunningAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            query.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientOS)) {
            query.put("ClientOS", request.clientOS);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVersion)) {
            query.put("ClientVersion", request.clientVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginRegionId)) {
            query.put("LoginRegionId", request.loginRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginToken)) {
            query.put("LoginToken", request.loginToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRunningApps"),
            new TeaPair("version", "2021-09-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new ListRunningAppsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Prerequisites</h2>
     * <p>This operation is an anonymous API operation, but the server still verifies the logon status. The <code>LoginToken</code> and <code>SessionId</code> request parameters are actually required. If either parameter is missing, an HTTP 400 error is returned with the error code <code>InvalidParameter.loginToken</code> or <code>InvalidParameter.sessionId</code>.</p>
     * <h2>Obtain credentials</h2>
     * <p>To obtain the <code>LoginToken</code> and <code>SessionId</code> by using <code>GetLoginToken</code>, call the <code>GetLoginToken</code> operation of the <code>appstream-center</code> 2021-02-20 version. The 2021-09-03 version does not provide this operation. You can also call <code>RefreshLoginToken</code> to update and obtain the <code>LoginToken</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries running applications.</p>
     * 
     * @param request ListRunningAppsRequest
     * @return ListRunningAppsResponse
     */
    public ListRunningAppsResponse listRunningApps(ListRunningAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRunningAppsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resets application resources.</p>
     * 
     * @param request ResetAppResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetAppResourcesResponse
     */
    public ResetAppResourcesResponse resetAppResourcesWithOptions(ResetAppResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            body.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientOS)) {
            body.put("ClientOS", request.clientOS);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVersion)) {
            body.put("ClientVersion", request.clientVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            body.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginRegionId)) {
            body.put("LoginRegionId", request.loginRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginToken)) {
            body.put("LoginToken", request.loginToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            body.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetAppResources"),
            new TeaPair("version", "2021-09-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new ResetAppResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resets application resources.</p>
     * 
     * @param request ResetAppResourcesRequest
     * @return ResetAppResourcesResponse
     */
    public ResetAppResourcesResponse resetAppResources(ResetAppResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetAppResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts application resources.</p>
     * 
     * @param request RestartAppResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartAppResourcesResponse
     */
    public RestartAppResourcesResponse restartAppResourcesWithOptions(RestartAppResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            body.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientOS)) {
            body.put("ClientOS", request.clientOS);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVersion)) {
            body.put("ClientVersion", request.clientVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            body.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginRegionId)) {
            body.put("LoginRegionId", request.loginRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginToken)) {
            body.put("LoginToken", request.loginToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            body.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartAppResources"),
            new TeaPair("version", "2021-09-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new RestartAppResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts application resources.</p>
     * 
     * @param request RestartAppResourcesRequest
     * @return RestartAppResourcesResponse
     */
    public RestartAppResourcesResponse restartAppResources(RestartAppResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartAppResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts application resources.</p>
     * 
     * @param request StartAppResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartAppResourcesResponse
     */
    public StartAppResourcesResponse startAppResourcesWithOptions(StartAppResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            body.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientOS)) {
            body.put("ClientOS", request.clientOS);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVersion)) {
            body.put("ClientVersion", request.clientVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            body.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginRegionId)) {
            body.put("LoginRegionId", request.loginRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginToken)) {
            body.put("LoginToken", request.loginToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            body.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartAppResources"),
            new TeaPair("version", "2021-09-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new StartAppResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts application resources.</p>
     * 
     * @param request StartAppResourcesRequest
     * @return StartAppResourcesResponse
     */
    public StartAppResourcesResponse startAppResources(StartAppResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startAppResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Credential acquisition</h2>
     * <p>To obtain the <code>LoginToken</code> and <code>SessionId</code> by using <code>GetLoginToken</code>, call the <code>GetLoginToken</code> operation of the <code>appstream-center</code> 2021-02-20 version. The 2021-09-03 version does not provide this operation. You can also update and obtain the <code>LoginToken</code> by using <code>RefreshLoginToken</code>.</p>
     * <h3>Required parameters and authentication invocation flow for GetLoginToken (2021-02-20 version)</h3>
     * <p>API documentation: <a href="https://www.alibabacloud.com/help/en/wuying-appstreaming/developer-reference/api-appstream-center-2021-02-20-getlogintoken">GetLoginToken (2021-02-20)</a>
     * Required metric descriptions:</p>
     * <ul>
     * <li><code>ClientId</code>: Required. The unique ID generated by the client, serving as the identity for the client that initiates the logon. Reuse the same value within the same session.</li>
     * <li><code>LoginIdentifier</code>: The enterprise identity (i.e., enterprise alias). This parameter is required when you use the enterprise identity logon method. Note that the parameter name is <code>LoginIdentifier</code>, not <code>TenantAlias</code>.</li>
     * <li>When you use a convenience account or an AD domain account for authentication, the Settings for <code>CurrentStage</code> must be <code>ADPassword</code>, and you must provide both <code>EndUserId</code> (username) and <code>Password</code> (password).
     * Complete authentication invocation flow:</li>
     * </ul>
     * <ol>
     * <li>Invoke <code>GetLoginToken</code> for the first time with <code>ClientId</code>, <code>LoginIdentifier</code>, <code>CurrentStage</code> based on the logon method, and the corresponding credentials. Save the returned <code>LoginToken</code> and <code>SessionId</code>. <code>SessionId</code> is returned only during the first invocation in the same session and must be reused in subsequent stage invocations.</li>
     * <li>If <code>NextStage</code> (such as <code>MFAVerify</code>, <code>TokenVerify</code>, or <code>ChangePassword</code>) is returned, carry the same <code>SessionId</code> and <code>ClientId</code>, update the Settings of <code>CurrentStage</code> to the value of <code>NextStage</code>, and provide the parameters required for this stage (such as <code>AuthenticationCode</code> for the <code>MFAVerify</code> stage and <code>TokenCode</code> for the <code>TokenVerify</code> stage). Repeat the invocation until the final <code>LoginToken</code> is obtained.</li>
     * <li>Use the final <code>LoginToken</code> and <code>SessionId</code> to invoke this operation (<code>StopApp</code>).</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Stops a specified application.</p>
     * 
     * @param request StopAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopAppResponse
     */
    public StopAppResponse stopAppWithOptions(StopAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            body.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            body.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceId)) {
            body.put("AppInstanceId", request.appInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientChannel)) {
            body.put("ClientChannel", request.clientChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            body.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientOS)) {
            body.put("ClientOS", request.clientOS);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVersion)) {
            body.put("ClientVersion", request.clientVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            body.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceStop)) {
            body.put("ForceStop", request.forceStop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idpId)) {
            body.put("IdpId", request.idpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginRegionId)) {
            body.put("LoginRegionId", request.loginRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginToken)) {
            body.put("LoginToken", request.loginToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wyId)) {
            body.put("WyId", request.wyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopApp"),
            new TeaPair("version", "2021-09-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new StopAppResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Credential acquisition</h2>
     * <p>To obtain the <code>LoginToken</code> and <code>SessionId</code> by using <code>GetLoginToken</code>, call the <code>GetLoginToken</code> operation of the <code>appstream-center</code> 2021-02-20 version. The 2021-09-03 version does not provide this operation. You can also update and obtain the <code>LoginToken</code> by using <code>RefreshLoginToken</code>.</p>
     * <h3>Required parameters and authentication invocation flow for GetLoginToken (2021-02-20 version)</h3>
     * <p>API documentation: <a href="https://www.alibabacloud.com/help/en/wuying-appstreaming/developer-reference/api-appstream-center-2021-02-20-getlogintoken">GetLoginToken (2021-02-20)</a>
     * Required metric descriptions:</p>
     * <ul>
     * <li><code>ClientId</code>: Required. The unique ID generated by the client, serving as the identity for the client that initiates the logon. Reuse the same value within the same session.</li>
     * <li><code>LoginIdentifier</code>: The enterprise identity (i.e., enterprise alias). This parameter is required when you use the enterprise identity logon method. Note that the parameter name is <code>LoginIdentifier</code>, not <code>TenantAlias</code>.</li>
     * <li>When you use a convenience account or an AD domain account for authentication, the Settings for <code>CurrentStage</code> must be <code>ADPassword</code>, and you must provide both <code>EndUserId</code> (username) and <code>Password</code> (password).
     * Complete authentication invocation flow:</li>
     * </ul>
     * <ol>
     * <li>Invoke <code>GetLoginToken</code> for the first time with <code>ClientId</code>, <code>LoginIdentifier</code>, <code>CurrentStage</code> based on the logon method, and the corresponding credentials. Save the returned <code>LoginToken</code> and <code>SessionId</code>. <code>SessionId</code> is returned only during the first invocation in the same session and must be reused in subsequent stage invocations.</li>
     * <li>If <code>NextStage</code> (such as <code>MFAVerify</code>, <code>TokenVerify</code>, or <code>ChangePassword</code>) is returned, carry the same <code>SessionId</code> and <code>ClientId</code>, update the Settings of <code>CurrentStage</code> to the value of <code>NextStage</code>, and provide the parameters required for this stage (such as <code>AuthenticationCode</code> for the <code>MFAVerify</code> stage and <code>TokenCode</code> for the <code>TokenVerify</code> stage). Repeat the invocation until the final <code>LoginToken</code> is obtained.</li>
     * <li>Use the final <code>LoginToken</code> and <code>SessionId</code> to invoke this operation (<code>StopApp</code>).</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Stops a specified application.</p>
     * 
     * @param request StopAppRequest
     * @return StopAppResponse
     */
    public StopAppResponse stopApp(StopAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopAppWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <p>Before you call this operation, you must complete user logon authentication to obtain the <code>LoginToken</code> and <code>SessionId</code>. This <code>StopAppResources</code> operation uses the <strong>2021-09-03</strong> version of <code>appstream-center</code>. The prerequisite logon operation uses the <strong>2021-02-20</strong> version of <a href="https://www.alibabacloud.com/help/en/wuying-appstreaming/developer-reference/api-appstream-center-2021-02-20-getlogintoken">GetLoginToken</a>. Use the respective API versions for each operation.</p>
     * <h3>1. Prepare the enterprise identifier and account information</h3>
     * <p>The following procedure applies to password authentication for convenience accounts or AD domain accounts that log on by using an enterprise identifier.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Parameter</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>ClientId</code></td>
     * <td>The unique ID generated by the client. This parameter is required when you call <code>GetLoginToken</code>. The same client ID is reused in the following call sequence.</td>
     * </tr>
     * <tr>
     * <td><code>LoginIdentifier</code></td>
     * <td>The enterprise identifier for logon, which is the <code>TenantAlias</code>. The parameter name in the logon request is <code>LoginIdentifier</code>, not <code>TenantAlias</code>. To query the logon configuration of this identifier, you can call <a href="https://www.alibabacloud.com/help/en/wuying-appstreaming/developer-reference/api-appstream-center-2021-02-20-findidplistbyloginidentifier">FindIdpListByLoginIdentifier (2021-02-20)</a>. The <code>TenantAliasInfo.TenantAlias</code> field in the response indicates the enterprise identifier.</td>
     * </tr>
     * <tr>
     * <td><code>CurrentStage</code></td>
     * <td>Set this parameter to <code>ADPassword</code> for password authentication. This value applies to both convenience accounts and AD domain accounts, not only AD domain accounts.</td>
     * </tr>
     * <tr>
     * <td><code>EndUserId</code></td>
     * <td>The username of the convenience account or AD domain account. This parameter is required when <code>CurrentStage</code> is set to <code>ADPassword</code>.</td>
     * </tr>
     * <tr>
     * <td><code>Password</code></td>
     * <td>The password of the corresponding account. This parameter is required when <code>CurrentStage</code> is set to <code>ADPassword</code>.</td>
     * </tr>
     * </tbody></table>
     * <h3>2. Continue logon based on the returned authentication stage</h3>
     * <p>After you invoke <code>GetLoginToken</code> for the first time, save the returned <code>SessionId</code>. This value is returned only during the first invocation in the same logon session. If you need to authenticate further, include the saved <code>SessionId</code> in subsequent requests. Do not clear this value even if it is not returned in subsequent responses.
     * Determine whether you still need to authenticate based on the <code>NextStage</code> field in the response, and set the required next authentication stage as the <code>CurrentStage</code> for subsequent requests. Examples:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Next authentication stage</th>
     * <th>What to do next</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>MFAVerify</code></td>
     * <td>Include the <code>SessionId</code> and the <code>AuthenticationCode</code> generated by the virtual MFA device to continue to invoke <code>GetLoginToken</code>.</td>
     * </tr>
     * <tr>
     * <td><code>TokenVerify</code></td>
     * <td>Include the <code>SessionId</code> and the client secondary authentication verification code <code>TokenCode</code> to continue to authenticate.</td>
     * </tr>
     * <tr>
     * <td><code>ChangePassword</code></td>
     * <td>Specify <code>OldPassword</code> and <code>NewPassword</code> as required to complete the password change stage.</td>
     * </tr>
     * <tr>
     * <td><code>MFABind</code> or other authentication stages</td>
     * <td>Complete the corresponding operations based on the actual returned stage and the <code>GetLoginToken</code> documentation. Do not directly apply the request parameters of <code>MFAVerify</code>.</td>
     * </tr>
     * <tr>
     * <td>The authentication stages are determined by the account configuration and the result of the current logon. Not every logon must go through all the preceding stages in sequence. Invoke <code>StopAppResources</code> only after logon authentication is complete and the <code>LoginToken</code> is obtained. Do not proceed with the shutdown of resources if authentication failed or if there are pending authentication stages.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>3. Call sequence example</h3>
     * <p>The following is pseudocode for parameter passing and is not an executable SDK example. <code>clientId</code>, <code>tenantAlias</code>, <code>endUserId</code>, <code>password</code>, and <code>authenticationCode</code> are runtime variables of the caller. <code>resourceIds</code>, <code>productType</code>, and <code>appInstanceGroupId</code> are business parameters for this operation. Do not write real passwords, verification codes, or logon credentials in examples or logs.</p>
     * <pre><code class="language-text">login1 = GetLoginToken(version=&quot;2021-02-20&quot;,
     *     ClientId=clientId, LoginIdentifier=tenantAlias,
     *     CurrentStage=&quot;ADPassword&quot;, EndUserId=endUserId, Password=password)
     * sessionId = login1.SessionId
     * loginResult = login1
     * if loginResult.NextStage == &quot;MFAVerify&quot;:
     *     loginResult = GetLoginToken(version=&quot;2021-02-20&quot;,
     *         ClientId=clientId, LoginIdentifier=tenantAlias,
     *         SessionId=sessionId, CurrentStage=&quot;MFAVerify&quot;,
     *         AuthenticationCode=authenticationCode)
     * </code></pre>
     * <p>If other authentication stages are still required, continue processing based on <code>NextStage</code>. Do not treat the preceding single MFA call as a fixed endpoint. After logon is complete, call this operation by using the <code>LoginToken</code> obtained during this logon and the saved <code>SessionId</code>:</p>
     * <pre><code class="language-text">StopAppResources(version=&quot;2021-09-03&quot;,
     *     ClientId=clientId, LoginToken=loginResult.LoginToken, SessionId=sessionId,
     *     ProductType=productType, AppInstanceGroupId=appInstanceGroupId,
     *     ResourceIds=resourceIds)
     * </code></pre>
     * <p><code>Password</code>, <code>LoginIdentifier</code>, and <code>CurrentStage</code> belong to the prerequisite logon request and are not request parameters of <code>StopAppResources</code>. For the rules on how to specify other parameters and resource IDs for this operation, see the request parameter table below.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops application resources.</p>
     * 
     * @param request StopAppResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopAppResourcesResponse
     */
    public StopAppResourcesResponse stopAppResourcesWithOptions(StopAppResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            body.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientOS)) {
            body.put("ClientOS", request.clientOS);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVersion)) {
            body.put("ClientVersion", request.clientVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            body.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginRegionId)) {
            body.put("LoginRegionId", request.loginRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginToken)) {
            body.put("LoginToken", request.loginToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            body.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopAppResources"),
            new TeaPair("version", "2021-09-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new StopAppResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <p>Before you call this operation, you must complete user logon authentication to obtain the <code>LoginToken</code> and <code>SessionId</code>. This <code>StopAppResources</code> operation uses the <strong>2021-09-03</strong> version of <code>appstream-center</code>. The prerequisite logon operation uses the <strong>2021-02-20</strong> version of <a href="https://www.alibabacloud.com/help/en/wuying-appstreaming/developer-reference/api-appstream-center-2021-02-20-getlogintoken">GetLoginToken</a>. Use the respective API versions for each operation.</p>
     * <h3>1. Prepare the enterprise identifier and account information</h3>
     * <p>The following procedure applies to password authentication for convenience accounts or AD domain accounts that log on by using an enterprise identifier.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Parameter</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>ClientId</code></td>
     * <td>The unique ID generated by the client. This parameter is required when you call <code>GetLoginToken</code>. The same client ID is reused in the following call sequence.</td>
     * </tr>
     * <tr>
     * <td><code>LoginIdentifier</code></td>
     * <td>The enterprise identifier for logon, which is the <code>TenantAlias</code>. The parameter name in the logon request is <code>LoginIdentifier</code>, not <code>TenantAlias</code>. To query the logon configuration of this identifier, you can call <a href="https://www.alibabacloud.com/help/en/wuying-appstreaming/developer-reference/api-appstream-center-2021-02-20-findidplistbyloginidentifier">FindIdpListByLoginIdentifier (2021-02-20)</a>. The <code>TenantAliasInfo.TenantAlias</code> field in the response indicates the enterprise identifier.</td>
     * </tr>
     * <tr>
     * <td><code>CurrentStage</code></td>
     * <td>Set this parameter to <code>ADPassword</code> for password authentication. This value applies to both convenience accounts and AD domain accounts, not only AD domain accounts.</td>
     * </tr>
     * <tr>
     * <td><code>EndUserId</code></td>
     * <td>The username of the convenience account or AD domain account. This parameter is required when <code>CurrentStage</code> is set to <code>ADPassword</code>.</td>
     * </tr>
     * <tr>
     * <td><code>Password</code></td>
     * <td>The password of the corresponding account. This parameter is required when <code>CurrentStage</code> is set to <code>ADPassword</code>.</td>
     * </tr>
     * </tbody></table>
     * <h3>2. Continue logon based on the returned authentication stage</h3>
     * <p>After you invoke <code>GetLoginToken</code> for the first time, save the returned <code>SessionId</code>. This value is returned only during the first invocation in the same logon session. If you need to authenticate further, include the saved <code>SessionId</code> in subsequent requests. Do not clear this value even if it is not returned in subsequent responses.
     * Determine whether you still need to authenticate based on the <code>NextStage</code> field in the response, and set the required next authentication stage as the <code>CurrentStage</code> for subsequent requests. Examples:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Next authentication stage</th>
     * <th>What to do next</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>MFAVerify</code></td>
     * <td>Include the <code>SessionId</code> and the <code>AuthenticationCode</code> generated by the virtual MFA device to continue to invoke <code>GetLoginToken</code>.</td>
     * </tr>
     * <tr>
     * <td><code>TokenVerify</code></td>
     * <td>Include the <code>SessionId</code> and the client secondary authentication verification code <code>TokenCode</code> to continue to authenticate.</td>
     * </tr>
     * <tr>
     * <td><code>ChangePassword</code></td>
     * <td>Specify <code>OldPassword</code> and <code>NewPassword</code> as required to complete the password change stage.</td>
     * </tr>
     * <tr>
     * <td><code>MFABind</code> or other authentication stages</td>
     * <td>Complete the corresponding operations based on the actual returned stage and the <code>GetLoginToken</code> documentation. Do not directly apply the request parameters of <code>MFAVerify</code>.</td>
     * </tr>
     * <tr>
     * <td>The authentication stages are determined by the account configuration and the result of the current logon. Not every logon must go through all the preceding stages in sequence. Invoke <code>StopAppResources</code> only after logon authentication is complete and the <code>LoginToken</code> is obtained. Do not proceed with the shutdown of resources if authentication failed or if there are pending authentication stages.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>3. Call sequence example</h3>
     * <p>The following is pseudocode for parameter passing and is not an executable SDK example. <code>clientId</code>, <code>tenantAlias</code>, <code>endUserId</code>, <code>password</code>, and <code>authenticationCode</code> are runtime variables of the caller. <code>resourceIds</code>, <code>productType</code>, and <code>appInstanceGroupId</code> are business parameters for this operation. Do not write real passwords, verification codes, or logon credentials in examples or logs.</p>
     * <pre><code class="language-text">login1 = GetLoginToken(version=&quot;2021-02-20&quot;,
     *     ClientId=clientId, LoginIdentifier=tenantAlias,
     *     CurrentStage=&quot;ADPassword&quot;, EndUserId=endUserId, Password=password)
     * sessionId = login1.SessionId
     * loginResult = login1
     * if loginResult.NextStage == &quot;MFAVerify&quot;:
     *     loginResult = GetLoginToken(version=&quot;2021-02-20&quot;,
     *         ClientId=clientId, LoginIdentifier=tenantAlias,
     *         SessionId=sessionId, CurrentStage=&quot;MFAVerify&quot;,
     *         AuthenticationCode=authenticationCode)
     * </code></pre>
     * <p>If other authentication stages are still required, continue processing based on <code>NextStage</code>. Do not treat the preceding single MFA call as a fixed endpoint. After logon is complete, call this operation by using the <code>LoginToken</code> obtained during this logon and the saved <code>SessionId</code>:</p>
     * <pre><code class="language-text">StopAppResources(version=&quot;2021-09-03&quot;,
     *     ClientId=clientId, LoginToken=loginResult.LoginToken, SessionId=sessionId,
     *     ProductType=productType, AppInstanceGroupId=appInstanceGroupId,
     *     ResourceIds=resourceIds)
     * </code></pre>
     * <p><code>Password</code>, <code>LoginIdentifier</code>, and <code>CurrentStage</code> belong to the prerequisite logon request and are not request parameters of <code>StopAppResources</code>. For the rules on how to specify other parameters and resource IDs for this operation, see the request parameter table below.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops application resources.</p>
     * 
     * @param request StopAppResourcesRequest
     * @return StopAppResourcesResponse
     */
    public StopAppResourcesResponse stopAppResources(StopAppResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopAppResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds an application instance from a user.</p>
     * 
     * @param request UnbindRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindResponse
     */
    public UnbindResponse unbindWithOptions(UnbindRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceId)) {
            body.put("AppInstanceId", request.appInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstancePersistentId)) {
            body.put("AppInstancePersistentId", request.appInstancePersistentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            body.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientOS)) {
            body.put("ClientOS", request.clientOS);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVersion)) {
            body.put("ClientVersion", request.clientVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            body.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginRegionId)) {
            body.put("LoginRegionId", request.loginRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginToken)) {
            body.put("LoginToken", request.loginToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionToken)) {
            body.put("SessionToken", request.sessionToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Unbind"),
            new TeaPair("version", "2021-09-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new UnbindResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds an application instance from a user.</p>
     * 
     * @param request UnbindRequest
     * @return UnbindResponse
     */
    public UnbindResponse unbind(UnbindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindWithOptions(request, runtime);
    }
}
