// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611;

import com.aliyun.tea.*;
import com.aliyun.emas_appmonitor20190611.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("emas-appmonitor", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>CreateTlogTask</p>
     * 
     * @param request CreateTlogTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTlogTaskResponse
     */
    public CreateTlogTaskResponse createTlogTaskWithOptions(CreateTlogTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliYunCurrentPk)) {
            body.put("AliYunCurrentPk", request.aliYunCurrentPk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliYunMainPk)) {
            body.put("AliYunMainPk", request.aliYunMainPk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliYunName)) {
            body.put("AliYunName", request.aliYunName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            body.put("AppVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginDate)) {
            body.put("BeginDate", request.beginDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.brand)) {
            body.put("Brand", request.brand);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            body.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.collectionNums)) {
            body.put("CollectionNums", request.collectionNums);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.days)) {
            body.put("Days", request.days);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceJson)) {
            body.put("DeviceJson", request.deviceJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorType)) {
            body.put("ErrorType", request.errorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifySettingJson)) {
            body.put("NotifySettingJson", request.notifySettingJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.os)) {
            body.put("Os", request.os);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osVersion)) {
            body.put("OsVersion", request.osVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            body.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTlogTask"),
            new TeaPair("version", "2019-06-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTlogTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CreateTlogTask</p>
     * 
     * @param request CreateTlogTaskRequest
     * @return CreateTlogTaskResponse
     */
    public CreateTlogTaskResponse createTlogTask(CreateTlogTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTlogTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取错误事件详情</p>
     * 
     * @param request GetErrorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetErrorResponse
     */
    public GetErrorResponse getErrorWithOptions(GetErrorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizModule)) {
            body.put("BizModule", request.bizModule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientTime)) {
            body.put("ClientTime", request.clientTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.did)) {
            body.put("Did", request.did);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digestHash)) {
            body.put("DigestHash", request.digestHash);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            body.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.os)) {
            body.put("Os", request.os);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetError"),
            new TeaPair("version", "2019-06-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetErrorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取错误事件详情</p>
     * 
     * @param request GetErrorRequest
     * @return GetErrorResponse
     */
    public GetErrorResponse getError(GetErrorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getErrorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取某一聚合错误下所有的错误事件列表</p>
     * 
     * @param tmpReq GetErrorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetErrorsResponse
     */
    public GetErrorsResponse getErrorsWithOptions(GetErrorsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetErrorsShrinkRequest request = new GetErrorsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filter)) {
            request.filterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filter, "Filter", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizModule)) {
            body.put("BizModule", request.bizModule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digestHash)) {
            body.put("DigestHash", request.digestHash);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterShrink)) {
            body.put("Filter", request.filterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.os)) {
            body.put("Os", request.os);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            body.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.timeRange)) {
            bodyFlat.put("TimeRange", request.timeRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.utdid)) {
            body.put("Utdid", request.utdid);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetErrors"),
            new TeaPair("version", "2019-06-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetErrorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取某一聚合错误下所有的错误事件列表</p>
     * 
     * @param request GetErrorsRequest
     * @return GetErrorsResponse
     */
    public GetErrorsResponse getErrors(GetErrorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getErrorsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取聚合错误详情</p>
     * 
     * @param tmpReq GetIssueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIssueResponse
     */
    public GetIssueResponse getIssueWithOptions(GetIssueRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetIssueShrinkRequest request = new GetIssueShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filter)) {
            request.filterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filter, "Filter", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizModule)) {
            body.put("BizModule", request.bizModule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digestHash)) {
            body.put("DigestHash", request.digestHash);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterShrink)) {
            body.put("Filter", request.filterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.os)) {
            body.put("Os", request.os);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.timeRange)) {
            bodyFlat.put("TimeRange", request.timeRange);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIssue"),
            new TeaPair("version", "2019-06-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIssueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取聚合错误详情</p>
     * 
     * @param request GetIssueRequest
     * @return GetIssueResponse
     */
    public GetIssueResponse getIssue(GetIssueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIssueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取聚合错误列表</p>
     * 
     * @param tmpReq GetIssuesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIssuesResponse
     */
    public GetIssuesResponse getIssuesWithOptions(GetIssuesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetIssuesShrinkRequest request = new GetIssuesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filter)) {
            request.filterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filter, "Filter", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizModule)) {
            body.put("BizModule", request.bizModule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterShrink)) {
            body.put("Filter", request.filterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            body.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            body.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.os)) {
            body.put("Os", request.os);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            body.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.timeRange)) {
            bodyFlat.put("TimeRange", request.timeRange);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIssues"),
            new TeaPair("version", "2019-06-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIssuesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取聚合错误列表</p>
     * 
     * @param request GetIssuesRequest
     * @return GetIssuesResponse
     */
    public GetIssuesResponse getIssues(GetIssuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIssuesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取符号表文件列表</p>
     * 
     * @param request GetSymbolicFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSymbolicFilesResponse
     */
    public GetSymbolicFilesResponse getSymbolicFilesWithOptions(GetSymbolicFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            body.put("AppVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buildId)) {
            body.put("BuildId", request.buildId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exportStatus)) {
            body.put("ExportStatus", request.exportStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            body.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.os)) {
            body.put("Os", request.os);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            body.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSymbolicFiles"),
            new TeaPair("version", "2019-06-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSymbolicFilesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取符号表文件列表</p>
     * 
     * @param request GetSymbolicFilesRequest
     * @return GetSymbolicFilesResponse
     */
    public GetSymbolicFilesResponse getSymbolicFiles(GetSymbolicFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSymbolicFilesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetTlogCollectList</p>
     * 
     * @param request GetTlogCollectListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTlogCollectListResponse
     */
    public GetTlogCollectListResponse getTlogCollectListWithOptions(GetTlogCollectListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            body.put("AppVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.author)) {
            body.put("Author", request.author);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginDate)) {
            body.put("BeginDate", request.beginDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            body.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createBeginDate)) {
            body.put("CreateBeginDate", request.createBeginDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createEndDate)) {
            body.put("CreateEndDate", request.createEndDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.os)) {
            body.put("Os", request.os);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osVersion)) {
            body.put("OsVersion", request.osVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            body.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.positiveComment)) {
            body.put("PositiveComment", request.positiveComment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            body.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateBeginDate)) {
            body.put("UpdateBeginDate", request.updateBeginDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateEndDate)) {
            body.put("UpdateEndDate", request.updateEndDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userNick)) {
            body.put("UserNick", request.userNick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.utdid)) {
            body.put("Utdid", request.utdid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTlogCollectList"),
            new TeaPair("version", "2019-06-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTlogCollectListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetTlogCollectList</p>
     * 
     * @param request GetTlogCollectListRequest
     * @return GetTlogCollectListResponse
     */
    public GetTlogCollectListResponse getTlogCollectList(GetTlogCollectListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTlogCollectListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>TlogDeviceInfo</p>
     * 
     * @param request GetTlogDeviceInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTlogDeviceInfoResponse
     */
    public GetTlogDeviceInfoResponse getTlogDeviceInfoWithOptions(GetTlogDeviceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.os)) {
            body.put("Os", request.os);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTlogDeviceInfo"),
            new TeaPair("version", "2019-06-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTlogDeviceInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>TlogDeviceInfo</p>
     * 
     * @param request GetTlogDeviceInfoRequest
     * @return GetTlogDeviceInfoResponse
     */
    public GetTlogDeviceInfoResponse getTlogDeviceInfo(GetTlogDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTlogDeviceInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetTlogDeviceList</p>
     * 
     * @param request GetTlogDeviceListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTlogDeviceListResponse
     */
    public GetTlogDeviceListResponse getTlogDeviceListWithOptions(GetTlogDeviceListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            body.put("AppVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginDate)) {
            body.put("BeginDate", request.beginDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.brand)) {
            body.put("Brand", request.brand);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            body.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createBeginDate)) {
            body.put("CreateBeginDate", request.createBeginDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createEndDate)) {
            body.put("CreateEndDate", request.createEndDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.os)) {
            body.put("Os", request.os);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osVersion)) {
            body.put("OsVersion", request.osVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            body.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateBeginDate)) {
            body.put("UpdateBeginDate", request.updateBeginDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateEndDate)) {
            body.put("UpdateEndDate", request.updateEndDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userNick)) {
            body.put("UserNick", request.userNick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.utdid)) {
            body.put("Utdid", request.utdid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTlogDeviceList"),
            new TeaPair("version", "2019-06-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTlogDeviceListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetTlogDeviceList</p>
     * 
     * @param request GetTlogDeviceListRequest
     * @return GetTlogDeviceListResponse
     */
    public GetTlogDeviceListResponse getTlogDeviceList(GetTlogDeviceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTlogDeviceListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetTlogTaskCollections</p>
     * 
     * @param request GetTlogTaskCollectionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTlogTaskCollectionsResponse
     */
    public GetTlogTaskCollectionsResponse getTlogTaskCollectionsWithOptions(GetTlogTaskCollectionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.os)) {
            body.put("Os", request.os);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTlogTaskCollections"),
            new TeaPair("version", "2019-06-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTlogTaskCollectionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetTlogTaskCollections</p>
     * 
     * @param request GetTlogTaskCollectionsRequest
     * @return GetTlogTaskCollectionsResponse
     */
    public GetTlogTaskCollectionsResponse getTlogTaskCollections(GetTlogTaskCollectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTlogTaskCollectionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetTlogTaskInfo</p>
     * 
     * @param request GetTlogTaskInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTlogTaskInfoResponse
     */
    public GetTlogTaskInfoResponse getTlogTaskInfoWithOptions(GetTlogTaskInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.os)) {
            body.put("Os", request.os);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTlogTaskInfo"),
            new TeaPair("version", "2019-06-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTlogTaskInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetTlogTaskInfo</p>
     * 
     * @param request GetTlogTaskInfoRequest
     * @return GetTlogTaskInfoResponse
     */
    public GetTlogTaskInfoResponse getTlogTaskInfo(GetTlogTaskInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTlogTaskInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>RequestUploadToken</p>
     * 
     * @param request RequestUploadTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RequestUploadTokenResponse
     */
    public RequestUploadTokenResponse requestUploadTokenWithOptions(RequestUploadTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.os)) {
            body.put("Os", request.os);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RequestUploadToken"),
            new TeaPair("version", "2019-06-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RequestUploadTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>RequestUploadToken</p>
     * 
     * @param request RequestUploadTokenRequest
     * @return RequestUploadTokenResponse
     */
    public RequestUploadTokenResponse requestUploadToken(RequestUploadTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.requestUploadTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>SearchTlog</p>
     * 
     * @param request SearchTlogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchTlogResponse
     */
    public SearchTlogResponse searchTlogWithOptions(SearchTlogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginDate)) {
            body.put("BeginDate", request.beginDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.levelJson)) {
            body.put("LevelJson", request.levelJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.os)) {
            body.put("Os", request.os);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            body.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchTlog"),
            new TeaPair("version", "2019-06-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchTlogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>SearchTlog</p>
     * 
     * @param request SearchTlogRequest
     * @return SearchTlogResponse
     */
    public SearchTlogResponse searchTlog(SearchTlogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchTlogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>SubmitSymbolic</p>
     * 
     * @param request SubmitSymbolicRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitSymbolicResponse
     */
    public SubmitSymbolicResponse submitSymbolicWithOptions(SubmitSymbolicRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            body.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            body.put("AppVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buildId)) {
            body.put("BuildId", request.buildId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            body.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            body.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.os)) {
            body.put("Os", request.os);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitSymbolic"),
            new TeaPair("version", "2019-06-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitSymbolicResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>SubmitSymbolic</p>
     * 
     * @param request SubmitSymbolicRequest
     * @return SubmitSymbolicResponse
     */
    public SubmitSymbolicResponse submitSymbolic(SubmitSymbolicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSymbolicWithOptions(request, runtime);
    }
}
