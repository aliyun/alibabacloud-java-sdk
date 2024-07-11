// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111;

import com.aliyun.tea.*;
import com.aliyun.cgcs20211111.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cgcs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>批量检查异常会话</p>
     * 
     * @param tmpReq BatchCheckSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchCheckSessionResponse
     */
    public BatchCheckSessionResponse batchCheckSessionWithOptions(BatchCheckSessionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchCheckSessionShrinkRequest request = new BatchCheckSessionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.records)) {
            request.recordsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.records, "Records", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recordsShrink)) {
            query.put("Records", request.recordsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchCheckSession"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchCheckSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量检查异常会话</p>
     * 
     * @param request BatchCheckSessionRequest
     * @return BatchCheckSessionResponse
     */
    public BatchCheckSessionResponse batchCheckSession(BatchCheckSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchCheckSessionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消 session 资源预定任务</p>
     * 
     * @param request CancelReserveTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelReserveTaskResponse
     */
    public CancelReserveTaskResponse cancelReserveTaskWithOptions(CancelReserveTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelReserveTask"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelReserveTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消 session 资源预定任务</p>
     * 
     * @param request CancelReserveTaskRequest
     * @return CancelReserveTaskResponse
     */
    public CancelReserveTaskResponse cancelReserveTask(CancelReserveTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelReserveTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交适配请求</p>
     * 
     * @param tmpReq CreateAdaptationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAdaptationResponse
     */
    public CreateAdaptationResponse createAdaptationWithOptions(CreateAdaptationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAdaptationShrinkRequest request = new CreateAdaptationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.adaptTarget)) {
            request.adaptTargetShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.adaptTarget, "AdaptTarget", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adaptTargetShrink)) {
            body.put("AdaptTarget", request.adaptTargetShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersionId)) {
            body.put("AppVersionId", request.appVersionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAdaptation"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAdaptationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交适配请求</p>
     * 
     * @param request CreateAdaptationRequest
     * @return CreateAdaptationResponse
     */
    public CreateAdaptationResponse createAdaptation(CreateAdaptationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAdaptationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>应用创建服务</p>
     * 
     * @param request CreateAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppResponse
     */
    public CreateAppResponse createAppWithOptions(CreateAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamingAppId)) {
            body.put("StreamingAppId", request.streamingAppId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamingSolution)) {
            body.put("StreamingSolution", request.streamingSolution);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApp"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>应用创建服务</p>
     * 
     * @param request CreateAppRequest
     * @return CreateAppResponse
     */
    public CreateAppResponse createApp(CreateAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>增加实时生产资源的相关字段</p>
     * 
     * @param request CreateAppSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppSessionResponse
     */
    public CreateAppSessionResponse createAppSessionWithOptions(CreateAppSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adapterFileId)) {
            query.put("AdapterFileId", request.adapterFileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            query.put("AppVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customSessionId)) {
            query.put("CustomSessionId", request.customSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customUserId)) {
            query.put("CustomUserId", request.customUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.districtId)) {
            query.put("DistrictId", request.districtId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enablePostpaid)) {
            query.put("EnablePostpaid", request.enablePostpaid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startParameters)) {
            query.put("StartParameters", request.startParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemInfo)) {
            query.put("SystemInfo", request.systemInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppSession"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>增加实时生产资源的相关字段</p>
     * 
     * @param request CreateAppSessionRequest
     * @return CreateAppSessionResponse
     */
    public CreateAppSessionResponse createAppSession(CreateAppSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppSessionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量创建会话</p>
     * 
     * @param tmpReq CreateAppSessionBatchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppSessionBatchResponse
     */
    public CreateAppSessionBatchResponse createAppSessionBatchWithOptions(CreateAppSessionBatchRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAppSessionBatchShrinkRequest request = new CreateAppSessionBatchShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.appInfos)) {
            request.appInfosShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.appInfos, "AppInfos", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInfosShrink)) {
            query.put("AppInfos", request.appInfosShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customTaskId)) {
            query.put("CustomTaskId", request.customTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppSessionBatch"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppSessionBatchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量创建会话</p>
     * 
     * @param request CreateAppSessionBatchRequest
     * @return CreateAppSessionBatchResponse
     */
    public CreateAppSessionBatchResponse createAppSessionBatch(CreateAppSessionBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppSessionBatchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>同步批量创建多个会话</p>
     * 
     * @param tmpReq CreateAppSessionBatchSyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppSessionBatchSyncResponse
     */
    public CreateAppSessionBatchSyncResponse createAppSessionBatchSyncWithOptions(CreateAppSessionBatchSyncRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAppSessionBatchSyncShrinkRequest request = new CreateAppSessionBatchSyncShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.appInfos)) {
            request.appInfosShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.appInfos, "AppInfos", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInfosShrink)) {
            query.put("AppInfos", request.appInfosShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchId)) {
            query.put("BatchId", request.batchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppSessionBatchSync"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppSessionBatchSyncResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>同步批量创建多个会话</p>
     * 
     * @param request CreateAppSessionBatchSyncRequest
     * @return CreateAppSessionBatchSyncResponse
     */
    public CreateAppSessionBatchSyncResponse createAppSessionBatchSync(CreateAppSessionBatchSyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppSessionBatchSyncWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>同步创建会话</p>
     * 
     * @param request CreateAppSessionSyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppSessionSyncResponse
     */
    public CreateAppSessionSyncResponse createAppSessionSyncWithOptions(CreateAppSessionSyncRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adapterFileId)) {
            query.put("AdapterFileId", request.adapterFileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            query.put("AppVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customSessionId)) {
            query.put("CustomSessionId", request.customSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customUserId)) {
            query.put("CustomUserId", request.customUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.districtId)) {
            query.put("DistrictId", request.districtId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchRules)) {
            query.put("MatchRules", request.matchRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startParameters)) {
            query.put("StartParameters", request.startParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemInfo)) {
            query.put("SystemInfo", request.systemInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppSessionSync"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppSessionSyncResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>同步创建会话</p>
     * 
     * @param request CreateAppSessionSyncRequest
     * @return CreateAppSessionSyncResponse
     */
    public CreateAppSessionSyncResponse createAppSessionSync(CreateAppSessionSyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppSessionSyncWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>应用版本创建服务</p>
     * 
     * @param request CreateAppVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppVersionResponse
     */
    public CreateAppVersionResponse createAppVersionWithOptions(CreateAppVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersionName)) {
            body.put("AppVersionName", request.appVersionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppVersion"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>应用版本创建服务</p>
     * 
     * @param request CreateAppVersionRequest
     * @return CreateAppVersionResponse
     */
    public CreateAppVersionResponse createAppVersion(CreateAppVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>预定session资源</p>
     * 
     * @param request CreateCapacityReservationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCapacityReservationResponse
     */
    public CreateCapacityReservationResponse createCapacityReservationWithOptions(CreateCapacityReservationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            body.put("AppVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.districtId)) {
            body.put("DistrictId", request.districtId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expectResourceReadyTime)) {
            body.put("ExpectResourceReadyTime", request.expectResourceReadyTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expectSessionCapacity)) {
            body.put("ExpectSessionCapacity", request.expectSessionCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCapacityReservation"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCapacityReservationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>预定session资源</p>
     * 
     * @param request CreateCapacityReservationRequest
     * @return CreateCapacityReservationResponse
     */
    public CreateCapacityReservationResponse createCapacityReservation(CreateCapacityReservationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCapacityReservationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>应用删除接口</p>
     * 
     * @param request DeleteAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteAppWithOptions(DeleteAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApp"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>应用删除接口</p>
     * 
     * @param request DeleteAppRequest
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteApp(DeleteAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>应用版本删除接口</p>
     * 
     * @param request DeleteAppVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppVersionResponse
     */
    public DeleteAppVersionResponse deleteAppVersionWithOptions(DeleteAppVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appVersionId)) {
            body.put("AppVersionId", request.appVersionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppVersion"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>应用版本删除接口</p>
     * 
     * @param request DeleteAppVersionRequest
     * @return DeleteAppVersionResponse
     */
    public DeleteAppVersionResponse deleteAppVersion(DeleteAppVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppVersionWithOptions(request, runtime);
    }

    /**
     * @param request DescribeInstanceStatsInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceStatsInfoResponse
     */
    public DescribeInstanceStatsInfoResponse describeInstanceStatsInfoWithOptions(DescribeInstanceStatsInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceStatsInfo"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceStatsInfoResponse());
    }

    /**
     * @param request DescribeInstanceStatsInfoRequest
     * @return DescribeInstanceStatsInfoResponse
     */
    public DescribeInstanceStatsInfoResponse describeInstanceStatsInfo(DescribeInstanceStatsInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceStatsInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取适配申请详情</p>
     * 
     * @param request GetAdaptationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAdaptationResponse
     */
    public GetAdaptationResponse getAdaptationWithOptions(GetAdaptationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adaptApplyId)) {
            body.put("AdaptApplyId", request.adaptApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersionId)) {
            body.put("AppVersionId", request.appVersionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAdaptation"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAdaptationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取适配申请详情</p>
     * 
     * @param request GetAdaptationRequest
     * @return GetAdaptationResponse
     */
    public GetAdaptationResponse getAdaptation(GetAdaptationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAdaptationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>应用详情接口</p>
     * 
     * @param request GetAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppResponse
     */
    public GetAppResponse getAppWithOptions(GetAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApp"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>应用详情接口</p>
     * 
     * @param request GetAppRequest
     * @return GetAppResponse
     */
    public GetAppResponse getApp(GetAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询会话并发数</p>
     * 
     * @param request GetAppCcuRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppCcuResponse
     */
    public GetAppCcuResponse getAppCcuWithOptions(GetAppCcuRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppCcu"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppCcuResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询会话并发数</p>
     * 
     * @param request GetAppCcuRequest
     * @return GetAppCcuResponse
     */
    public GetAppCcuResponse getAppCcu(GetAppCcuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppCcuWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取App会话信息</p>
     * 
     * @param request GetAppSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppSessionResponse
     */
    public GetAppSessionResponse getAppSessionWithOptions(GetAppSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customSessionId)) {
            query.put("CustomSessionId", request.customSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformSessionId)) {
            query.put("PlatformSessionId", request.platformSessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppSession"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取App会话信息</p>
     * 
     * @param request GetAppSessionRequest
     * @return GetAppSessionResponse
     */
    public GetAppSessionResponse getAppSession(GetAppSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppSessionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>应用版本详情接口</p>
     * 
     * @param request GetAppVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppVersionResponse
     */
    public GetAppVersionResponse getAppVersionWithOptions(GetAppVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appVersionId)) {
            body.put("AppVersionId", request.appVersionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppVersion"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>应用版本详情接口</p>
     * 
     * @param request GetAppVersionRequest
     * @return GetAppVersionResponse
     */
    public GetAppVersionResponse getAppVersion(GetAppVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询 session 会话容量信息</p>
     * 
     * @param request GetCapacityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCapacityResponse
     */
    public GetCapacityResponse getCapacityWithOptions(GetCapacityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            body.put("AppVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.districtId)) {
            body.put("DistrictId", request.districtId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCapacity"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCapacityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询 session 会话容量信息</p>
     * 
     * @param request GetCapacityRequest
     * @return GetCapacityResponse
     */
    public GetCapacityResponse getCapacity(GetCapacityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCapacityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询预定任务的详情信息</p>
     * 
     * @param request GetReserveTaskDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetReserveTaskDetailResponse
     */
    public GetReserveTaskDetailResponse getReserveTaskDetailWithOptions(GetReserveTaskDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetReserveTaskDetail"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetReserveTaskDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询预定任务的详情信息</p>
     * 
     * @param request GetReserveTaskDetailRequest
     * @return GetReserveTaskDetailResponse
     */
    public GetReserveTaskDetailResponse getReserveTaskDetail(GetReserveTaskDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getReserveTaskDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询公网ip</p>
     * 
     * @param request GetResourcePublicIPsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourcePublicIPsResponse
     */
    public GetResourcePublicIPsResponse getResourcePublicIPsWithOptions(GetResourcePublicIPsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourcePublicIPs"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourcePublicIPsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询公网ip</p>
     * 
     * @param request GetResourcePublicIPsRequest
     * @return GetResourcePublicIPsResponse
     */
    public GetResourcePublicIPsResponse getResourcePublicIPs(GetResourcePublicIPsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourcePublicIPsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>应用列表接口</p>
     * 
     * @param request ListAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppResponse
     */
    public ListAppResponse listAppWithOptions(ListAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keySearch)) {
            body.put("KeySearch", request.keySearch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApp"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>应用列表接口</p>
     * 
     * @param request ListAppRequest
     * @return ListAppResponse
     */
    public ListAppResponse listApp(ListAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询App会话</p>
     * 
     * @param request ListAppSessionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppSessionsResponse
     */
    public ListAppSessionsResponse listAppSessionsWithOptions(ListAppSessionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customSessionIds)) {
            query.put("CustomSessionIds", request.customSessionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformSessionIds)) {
            query.put("PlatformSessionIds", request.platformSessionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppSessions"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppSessionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询App会话</p>
     * 
     * @param request ListAppSessionsRequest
     * @return ListAppSessionsResponse
     */
    public ListAppSessionsResponse listAppSessions(ListAppSessionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppSessionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>应用版本列表接口</p>
     * 
     * @param request ListAppVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppVersionResponse
     */
    public ListAppVersionResponse listAppVersionWithOptions(ListAppVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppVersion"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>应用版本列表接口</p>
     * 
     * @param request ListAppVersionRequest
     * @return ListAppVersionResponse
     */
    public ListAppVersionResponse listAppVersion(ListAppVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询GCS实例列表</p>
     * 
     * @param request ListInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询GCS实例列表</p>
     * 
     * @param request ListInstancesRequest
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>应用修改服务</p>
     * 
     * @param request ModifyAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppResponse
     */
    public ModifyAppResponse modifyAppWithOptions(ModifyAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApp"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>应用修改服务</p>
     * 
     * @param request ModifyAppRequest
     * @return ModifyAppResponse
     */
    public ModifyAppResponse modifyApp(ModifyAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>应用版本修改服务</p>
     * 
     * @param request ModifyAppVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppVersionResponse
     */
    public ModifyAppVersionResponse modifyAppVersionWithOptions(ModifyAppVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appVersionId)) {
            body.put("AppVersionId", request.appVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersionName)) {
            body.put("AppVersionName", request.appVersionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAppVersion"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>应用版本修改服务</p>
     * 
     * @param request ModifyAppVersionRequest
     * @return ModifyAppVersionResponse
     */
    public ModifyAppVersionResponse modifyAppVersion(ModifyAppVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>释放 session 资源预定的资源</p>
     * 
     * @param request ReleaseCapacityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseCapacityResponse
     */
    public ReleaseCapacityResponse releaseCapacityWithOptions(ReleaseCapacityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            body.put("AppVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.districtId)) {
            body.put("DistrictId", request.districtId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expectReleaseSessionCapacity)) {
            body.put("ExpectReleaseSessionCapacity", request.expectReleaseSessionCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseCapacity"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseCapacityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>释放 session 资源预定的资源</p>
     * 
     * @param request ReleaseCapacityRequest
     * @return ReleaseCapacityResponse
     */
    public ReleaseCapacityResponse releaseCapacity(ReleaseCapacityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseCapacityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据资源批次号释放 session 资源预定的资源</p>
     * 
     * @param request ReleaseCapacityByBatchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseCapacityByBatchResponse
     */
    public ReleaseCapacityByBatchResponse releaseCapacityByBatchWithOptions(ReleaseCapacityByBatchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resBatchId)) {
            body.put("ResBatchId", request.resBatchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseCapacityByBatch"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseCapacityByBatchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据资源批次号释放 session 资源预定的资源</p>
     * 
     * @param request ReleaseCapacityByBatchRequest
     * @return ReleaseCapacityByBatchResponse
     */
    public ReleaseCapacityByBatchResponse releaseCapacityByBatch(ReleaseCapacityByBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseCapacityByBatchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>退订GCS实例</p>
     * 
     * @param request ReleaseInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseInstancesResponse
     */
    public ReleaseInstancesResponse releaseInstancesWithOptions(ReleaseInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            body.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.districtId)) {
            body.put("DistrictId", request.districtId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseInstances"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>退订GCS实例</p>
     * 
     * @param request ReleaseInstancesRequest
     * @return ReleaseInstancesResponse
     */
    public ReleaseInstancesResponse releaseInstances(ReleaseInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>预定GCS实例</p>
     * 
     * @param request ReserveInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReserveInstancesResponse
     */
    public ReserveInstancesResponse reserveInstancesWithOptions(ReserveInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            body.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.districtId)) {
            body.put("DistrictId", request.districtId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReserveInstances"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReserveInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>预定GCS实例</p>
     * 
     * @param request ReserveInstancesRequest
     * @return ReserveInstancesResponse
     */
    public ReserveInstancesResponse reserveInstances(ReserveInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reserveInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发送业务能力变更结果回调</p>
     * 
     * @param request SendBizCocChangeCallbackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendBizCocChangeCallbackResponse
     */
    public SendBizCocChangeCallbackResponse sendBizCocChangeCallbackWithOptions(SendBizCocChangeCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.platformSessionId)) {
            query.put("PlatformSessionId", request.platformSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.result)) {
            query.put("Result", request.result);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendBizCocChangeCallback"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendBizCocChangeCallbackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发送业务能力变更结果回调</p>
     * 
     * @param request SendBizCocChangeCallbackRequest
     * @return SendBizCocChangeCallbackResponse
     */
    public SendBizCocChangeCallbackResponse sendBizCocChangeCallback(SendBizCocChangeCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendBizCocChangeCallbackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停止App会话</p>
     * 
     * @param tmpReq StopAppSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopAppSessionResponse
     */
    public StopAppSessionResponse stopAppSessionWithOptions(StopAppSessionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StopAppSessionShrinkRequest request = new StopAppSessionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.stopParam)) {
            request.stopParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.stopParam, "StopParam", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customSessionId)) {
            query.put("CustomSessionId", request.customSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformSessionId)) {
            query.put("PlatformSessionId", request.platformSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stopParamShrink)) {
            query.put("StopParam", request.stopParamShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopAppSession"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopAppSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>停止App会话</p>
     * 
     * @param request StopAppSessionRequest
     * @return StopAppSessionResponse
     */
    public StopAppSessionResponse stopAppSession(StopAppSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopAppSessionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量停止会话接口</p>
     * 
     * @param tmpReq StopAppSessionBatchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopAppSessionBatchResponse
     */
    public StopAppSessionBatchResponse stopAppSessionBatchWithOptions(StopAppSessionBatchRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StopAppSessionBatchShrinkRequest request = new StopAppSessionBatchShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.stopParam)) {
            request.stopParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.stopParam, "StopParam", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            query.put("AppVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchId)) {
            query.put("BatchId", request.batchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stopParamShrink)) {
            query.put("StopParam", request.stopParamShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopAppSessionBatch"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopAppSessionBatchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量停止会话接口</p>
     * 
     * @param request StopAppSessionBatchRequest
     * @return StopAppSessionBatchResponse
     */
    public StopAppSessionBatchResponse stopAppSessionBatch(StopAppSessionBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopAppSessionBatchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新会话状态</p>
     * 
     * @param request UpdateSessionBizStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSessionBizStatusResponse
     */
    public UpdateSessionBizStatusResponse updateSessionBizStatusWithOptions(UpdateSessionBizStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizStatus)) {
            query.put("BizStatus", request.bizStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformSessionId)) {
            query.put("PlatformSessionId", request.platformSessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSessionBizStatus"),
            new TeaPair("version", "2021-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSessionBizStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新会话状态</p>
     * 
     * @param request UpdateSessionBizStatusRequest
     * @return UpdateSessionBizStatusResponse
     */
    public UpdateSessionBizStatusResponse updateSessionBizStatus(UpdateSessionBizStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSessionBizStatusWithOptions(request, runtime);
    }
}
