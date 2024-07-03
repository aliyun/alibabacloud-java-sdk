// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210903;

import com.aliyun.tea.*;
import com.aliyun.appstream_center20210903.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "";
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
     * <b>summary</b> : 
     * <p>获取连接信息</p>
     * 
     * @param request GetConnectionTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConnectionTicketResponse
     */
    public GetConnectionTicketResponse getConnectionTicketWithOptions(GetConnectionTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            body.put("AppVersion", request.appVersion);
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

        if (!com.aliyun.teautil.Common.isUnset(request.connectionProperties)) {
            body.put("ConnectionProperties", request.connectionProperties);
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

        if (!com.aliyun.teautil.Common.isUnset(request.param)) {
            body.put("Param", request.param);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConnectionTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取连接信息</p>
     * 
     * @param request GetConnectionTicketRequest
     * @return GetConnectionTicketResponse
     */
    public GetConnectionTicketResponse getConnectionTicket(GetConnectionTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConnectionTicketWithOptions(request, runtime);
    }

    /**
     * @param request ListLFUAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLFUAppResponse
     */
    public ListLFUAppResponse listLFUAppWithOptions(ListLFUAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            body.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            body.put("ApiType", request.apiType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.extendsAccessToken)) {
            body.put("ExtendsAccessToken", request.extendsAccessToken);
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

        if (!com.aliyun.teautil.Common.isUnset(request.traceId)) {
            body.put("TraceId", request.traceId);
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
            new TeaPair("action", "ListLFUApp"),
            new TeaPair("version", "2021-09-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLFUAppResponse());
    }

    /**
     * @param request ListLFUAppRequest
     * @return ListLFUAppResponse
     */
    public ListLFUAppResponse listLFUApp(ListLFUAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLFUAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>已上架应用列表</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPublishedAppInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>已上架应用列表</p>
     * 
     * @param request ListPublishedAppInfoRequest
     * @return ListPublishedAppInfoResponse
     */
    public ListPublishedAppInfoResponse listPublishedAppInfo(ListPublishedAppInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPublishedAppInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>运行中应用列表</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRunningAppsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>运行中应用列表</p>
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
     * <p>停止应用</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>停止应用</p>
     * 
     * @param request StopAppRequest
     * @return StopAppResponse
     */
    public StopAppResponse stopApp(StopAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解绑实例</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解绑实例</p>
     * 
     * @param request UnbindRequest
     * @return UnbindResponse
     */
    public UnbindResponse unbind(UnbindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindWithOptions(request, runtime);
    }
}
