// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130;

import com.aliyun.tea.*;
import com.aliyun.avatar20220130.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("avatar", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CancelVideoTaskResponse cancelVideoTaskWithOptions(CancelVideoTaskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CancelVideoTaskShrinkRequest request = new CancelVideoTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.app))) {
            request.appShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.app), "App", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appShrink)) {
            query.put("App", request.appShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskUuid)) {
            query.put("TaskUuid", request.taskUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelVideoTask"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelVideoTaskResponse());
    }

    public CancelVideoTaskResponse cancelVideoTask(CancelVideoTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelVideoTaskWithOptions(request, runtime);
    }

    public GetVideoTaskInfoResponse getVideoTaskInfoWithOptions(GetVideoTaskInfoRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetVideoTaskInfoShrinkRequest request = new GetVideoTaskInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.app))) {
            request.appShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.app), "App", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVideoTaskInfo"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVideoTaskInfoResponse());
    }

    public GetVideoTaskInfoResponse getVideoTaskInfo(GetVideoTaskInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVideoTaskInfoWithOptions(request, runtime);
    }

    public QueryRunningInstanceResponse queryRunningInstanceWithOptions(QueryRunningInstanceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryRunningInstanceShrinkRequest request = new QueryRunningInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.app))) {
            request.appShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.app), "App", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appShrink)) {
            query.put("App", request.appShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRunningInstance"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRunningInstanceResponse());
    }

    public QueryRunningInstanceResponse queryRunningInstance(QueryRunningInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRunningInstanceWithOptions(request, runtime);
    }

    public SendMessageResponse sendMessageWithOptions(SendMessageRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendMessageShrinkRequest request = new SendMessageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.textRequest))) {
            request.textRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.textRequest), "TextRequest", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.VAMLRequest))) {
            request.VAMLRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.VAMLRequest), "VAMLRequest", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textRequestShrink)) {
            query.put("TextRequest", request.textRequestShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VAMLRequestShrink)) {
            query.put("VAMLRequest", request.VAMLRequestShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendMessage"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendMessageResponse());
    }

    public SendMessageResponse sendMessage(SendMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendMessageWithOptions(request, runtime);
    }

    public StartInstanceResponse startInstanceWithOptions(StartInstanceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StartInstanceShrinkRequest request = new StartInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.app))) {
            request.appShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.app), "App", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.channel))) {
            request.channelShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.channel), "Channel", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.user))) {
            request.userShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.user), "User", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appShrink)) {
            query.put("App", request.appShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelShrink)) {
            query.put("Channel", request.channelShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userShrink)) {
            query.put("User", request.userShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartInstance"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartInstanceResponse());
    }

    public StartInstanceResponse startInstance(StartInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startInstanceWithOptions(request, runtime);
    }

    public StopInstanceResponse stopInstanceWithOptions(StopInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopInstance"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopInstanceResponse());
    }

    public StopInstanceResponse stopInstance(StopInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopInstanceWithOptions(request, runtime);
    }

    public SubmitTextTo2DAvatarVideoTaskResponse submitTextTo2DAvatarVideoTaskWithOptions(SubmitTextTo2DAvatarVideoTaskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitTextTo2DAvatarVideoTaskShrinkRequest request = new SubmitTextTo2DAvatarVideoTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.app))) {
            request.appShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.app), "App", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.videoInfo))) {
            request.videoInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.videoInfo), "VideoInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appShrink)) {
            query.put("App", request.appShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            query.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoInfoShrink)) {
            query.put("VideoInfo", request.videoInfoShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitTextTo2DAvatarVideoTask"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitTextTo2DAvatarVideoTaskResponse());
    }

    public SubmitTextTo2DAvatarVideoTaskResponse submitTextTo2DAvatarVideoTask(SubmitTextTo2DAvatarVideoTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitTextTo2DAvatarVideoTaskWithOptions(request, runtime);
    }

    public SubmitTextTo3DAvatarVideoTaskResponse submitTextTo3DAvatarVideoTaskWithOptions(SubmitTextTo3DAvatarVideoTaskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitTextTo3DAvatarVideoTaskShrinkRequest request = new SubmitTextTo3DAvatarVideoTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.app))) {
            request.appShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.app), "App", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.videoInfo))) {
            request.videoInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.videoInfo), "VideoInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appShrink)) {
            query.put("App", request.appShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            query.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoInfoShrink)) {
            query.put("VideoInfo", request.videoInfoShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitTextTo3DAvatarVideoTask"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitTextTo3DAvatarVideoTaskResponse());
    }

    public SubmitTextTo3DAvatarVideoTaskResponse submitTextTo3DAvatarVideoTask(SubmitTextTo3DAvatarVideoTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitTextTo3DAvatarVideoTaskWithOptions(request, runtime);
    }

    public SubmitTextToSignVideoTaskResponse submitTextToSignVideoTaskWithOptions(SubmitTextToSignVideoTaskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitTextToSignVideoTaskShrinkRequest request = new SubmitTextToSignVideoTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.app))) {
            request.appShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.app), "App", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.videoInfo))) {
            request.videoInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.videoInfo), "VideoInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appShrink)) {
            query.put("App", request.appShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            query.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoInfoShrink)) {
            query.put("VideoInfo", request.videoInfoShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitTextToSignVideoTask"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitTextToSignVideoTaskResponse());
    }

    public SubmitTextToSignVideoTaskResponse submitTextToSignVideoTask(SubmitTextToSignVideoTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitTextToSignVideoTaskWithOptions(request, runtime);
    }
}
