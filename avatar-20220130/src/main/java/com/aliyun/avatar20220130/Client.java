// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130;

import com.aliyun.tea.*;
import com.aliyun.avatar20220130.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    public CancelVideoTaskResponse cancelVideoTaskWithOptions(CancelVideoTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CancelVideoTaskShrinkRequest request = new CancelVideoTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.app)) {
            request.appShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.app, "App", "json");
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelVideoTaskWithOptions(request, runtime);
    }

    public ClientAuthResponse clientAuthWithOptions(ClientAuthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfo)) {
            query.put("DeviceInfo", request.deviceInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            query.put("DeviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.license)) {
            query.put("License", request.license);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ClientAuth"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ClientAuthResponse());
    }

    public ClientAuthResponse clientAuth(ClientAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.clientAuthWithOptions(request, runtime);
    }

    public ClientStartResponse clientStartWithOptions(ClientStartRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ClientStart"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ClientStartResponse());
    }

    public ClientStartResponse clientStart(ClientStartRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.clientStartWithOptions(request, runtime);
    }

    public CloseTimedResetOperateResponse closeTimedResetOperateWithOptions(CloseTimedResetOperateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseTimedResetOperate"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseTimedResetOperateResponse());
    }

    public CloseTimedResetOperateResponse closeTimedResetOperate(CloseTimedResetOperateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.closeTimedResetOperateWithOptions(request, runtime);
    }

    public ConfirmAvatar2dTrainResponse confirmAvatar2dTrainWithOptions(ConfirmAvatar2dTrainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.confirm)) {
            query.put("Confirm", request.confirm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfirmAvatar2dTrain"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfirmAvatar2dTrainResponse());
    }

    public ConfirmAvatar2dTrainResponse confirmAvatar2dTrain(ConfirmAvatar2dTrainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.confirmAvatar2dTrainWithOptions(request, runtime);
    }

    public Create2dAvatarResponse create2dAvatarWithOptions(Create2dAvatarRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callback)) {
            query.put("Callback", request.callback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.image)) {
            query.put("Image", request.image);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientation)) {
            query.put("Orientation", request.orientation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portrait)) {
            query.put("Portrait", request.portrait);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transparent)) {
            query.put("Transparent", request.transparent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.video)) {
            query.put("Video", request.video);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Create2dAvatar"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Create2dAvatarResponse());
    }

    public Create2dAvatarResponse create2dAvatar(Create2dAvatarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.create2dAvatarWithOptions(request, runtime);
    }

    public DeleteAvatarResponse deleteAvatarWithOptions(DeleteAvatarRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAvatar"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAvatarResponse());
    }

    public DeleteAvatarResponse deleteAvatar(DeleteAvatarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAvatarWithOptions(request, runtime);
    }

    public DuplexDecisionResponse duplexDecisionWithOptions(DuplexDecisionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DuplexDecisionShrinkRequest request = new DuplexDecisionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.customKeywords)) {
            request.customKeywordsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.customKeywords, "CustomKeywords", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dialogContext)) {
            request.dialogContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dialogContext, "DialogContext", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRequestId)) {
            query.put("BizRequestId", request.bizRequestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callTime)) {
            query.put("CallTime", request.callTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customKeywordsShrink)) {
            query.put("CustomKeywords", request.customKeywordsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dialogContextShrink)) {
            query.put("DialogContext", request.dialogContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dialogStatus)) {
            query.put("DialogStatus", request.dialogStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interruptType)) {
            query.put("InterruptType", request.interruptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            query.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DuplexDecision"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DuplexDecisionResponse());
    }

    public DuplexDecisionResponse duplexDecision(DuplexDecisionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.duplexDecisionWithOptions(request, runtime);
    }

    public GetVideoTaskInfoResponse getVideoTaskInfoWithOptions(GetVideoTaskInfoRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetVideoTaskInfoShrinkRequest request = new GetVideoTaskInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.app)) {
            request.appShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.app, "App", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoTaskInfoWithOptions(request, runtime);
    }

    public LicenseAuthResponse licenseAuthWithOptions(LicenseAuthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.license)) {
            query.put("License", request.license);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LicenseAuth"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LicenseAuthResponse());
    }

    public LicenseAuthResponse licenseAuth(LicenseAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.licenseAuthWithOptions(request, runtime);
    }

    public QueryAvatarResponse queryAvatarWithOptions(QueryAvatarRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAvatar"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAvatarResponse());
    }

    public QueryAvatarResponse queryAvatar(QueryAvatarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAvatarWithOptions(request, runtime);
    }

    public QueryAvatarListResponse queryAvatarListWithOptions(QueryAvatarListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modelType)) {
            query.put("ModelType", request.modelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAvatarList"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAvatarListResponse());
    }

    public QueryAvatarListResponse queryAvatarList(QueryAvatarListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAvatarListWithOptions(request, runtime);
    }

    public QueryRunningInstanceResponse queryRunningInstanceWithOptions(QueryRunningInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryRunningInstanceShrinkRequest request = new QueryRunningInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.app)) {
            request.appShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.app, "App", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appShrink)) {
            query.put("App", request.appShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRunningInstanceWithOptions(request, runtime);
    }

    public QueryTimedResetOperateStatusResponse queryTimedResetOperateStatusWithOptions(QueryTimedResetOperateStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTimedResetOperateStatus"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTimedResetOperateStatusResponse());
    }

    public QueryTimedResetOperateStatusResponse queryTimedResetOperateStatus(QueryTimedResetOperateStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTimedResetOperateStatusWithOptions(request, runtime);
    }

    public QueryVideoTaskInfoResponse queryVideoTaskInfoWithOptions(QueryVideoTaskInfoRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryVideoTaskInfoShrinkRequest request = new QueryVideoTaskInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.app)) {
            request.appShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.app, "App", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appShrink)) {
            query.put("App", request.appShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderById)) {
            query.put("OrderById", request.orderById);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskUuid)) {
            query.put("TaskUuid", request.taskUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryVideoTaskInfo"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryVideoTaskInfoResponse());
    }

    public QueryVideoTaskInfoResponse queryVideoTaskInfo(QueryVideoTaskInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryVideoTaskInfoWithOptions(request, runtime);
    }

    public Render3dAvatarResponse render3dAvatarWithOptions(Render3dAvatarRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Render3dAvatar"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Render3dAvatarResponse());
    }

    public Render3dAvatarResponse render3dAvatar(Render3dAvatarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.render3dAvatarWithOptions(request, runtime);
    }

    public SendCommandResponse sendCommandWithOptions(SendCommandRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendCommandShrinkRequest request = new SendCommandShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.content)) {
            request.contentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.content, "Content", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentShrink)) {
            query.put("Content", request.contentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.feedback)) {
            query.put("Feedback", request.feedback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniqueCode)) {
            query.put("UniqueCode", request.uniqueCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendCommand"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendCommandResponse());
    }

    public SendCommandResponse sendCommand(SendCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendCommandWithOptions(request, runtime);
    }

    public SendMessageResponse sendMessageWithOptions(SendMessageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendMessageShrinkRequest request = new SendMessageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.streamExtension)) {
            request.streamExtensionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.streamExtension, "StreamExtension", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.textRequest)) {
            request.textRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.textRequest, "TextRequest", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.VAMLRequest)) {
            request.VAMLRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.VAMLRequest, "VAMLRequest", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.feedback)) {
            query.put("Feedback", request.feedback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamExtensionShrink)) {
            query.put("StreamExtension", request.streamExtensionShrink);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendMessageWithOptions(request, runtime);
    }

    public SendTextResponse sendTextWithOptions(SendTextRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendTextShrinkRequest request = new SendTextShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.streamExtension)) {
            request.streamExtensionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.streamExtension, "StreamExtension", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.feedback)) {
            query.put("Feedback", request.feedback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interrupt)) {
            query.put("Interrupt", request.interrupt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamExtensionShrink)) {
            query.put("StreamExtension", request.streamExtensionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            query.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniqueCode)) {
            query.put("UniqueCode", request.uniqueCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendText"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendTextResponse());
    }

    public SendTextResponse sendText(SendTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendTextWithOptions(request, runtime);
    }

    public SendVamlResponse sendVamlWithOptions(SendVamlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaml)) {
            query.put("Vaml", request.vaml);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendVaml"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendVamlResponse());
    }

    public SendVamlResponse sendVaml(SendVamlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendVamlWithOptions(request, runtime);
    }

    public StartInstanceResponse startInstanceWithOptions(StartInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StartInstanceShrinkRequest request = new StartInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.app)) {
            request.appShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.app, "App", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.channel)) {
            request.channelShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.channel, "Channel", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.commandRequest)) {
            request.commandRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.commandRequest, "CommandRequest", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.user)) {
            request.userShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.user, "User", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appShrink)) {
            query.put("App", request.appShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelShrink)) {
            query.put("Channel", request.channelShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commandRequestShrink)) {
            query.put("CommandRequest", request.commandRequestShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userShrink)) {
            query.put("User", request.userShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startInstanceWithOptions(request, runtime);
    }

    public StartTimedResetOperateResponse startTimedResetOperateWithOptions(StartTimedResetOperateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartTimedResetOperate"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartTimedResetOperateResponse());
    }

    public StartTimedResetOperateResponse startTimedResetOperate(StartTimedResetOperateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startTimedResetOperateWithOptions(request, runtime);
    }

    public StopInstanceResponse stopInstanceWithOptions(StopInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopInstanceWithOptions(request, runtime);
    }

    public SubmitAudioTo2DAvatarVideoTaskResponse submitAudioTo2DAvatarVideoTaskWithOptions(SubmitAudioTo2DAvatarVideoTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitAudioTo2DAvatarVideoTaskShrinkRequest request = new SubmitAudioTo2DAvatarVideoTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.app)) {
            request.appShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.app, "App", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.audioInfo)) {
            request.audioInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.audioInfo, "AudioInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.avatarInfo)) {
            request.avatarInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.avatarInfo, "AvatarInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.videoInfo)) {
            request.videoInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.videoInfo, "VideoInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appShrink)) {
            query.put("App", request.appShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audioInfoShrink)) {
            query.put("AudioInfo", request.audioInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.avatarInfoShrink)) {
            query.put("AvatarInfo", request.avatarInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callback)) {
            query.put("Callback", request.callback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackParams)) {
            query.put("CallbackParams", request.callbackParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extParams)) {
            query.put("ExtParams", request.extParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoInfoShrink)) {
            query.put("VideoInfo", request.videoInfoShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitAudioTo2DAvatarVideoTask"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitAudioTo2DAvatarVideoTaskResponse());
    }

    public SubmitAudioTo2DAvatarVideoTaskResponse submitAudioTo2DAvatarVideoTask(SubmitAudioTo2DAvatarVideoTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAudioTo2DAvatarVideoTaskWithOptions(request, runtime);
    }

    public SubmitAudioTo3DAvatarVideoTaskResponse submitAudioTo3DAvatarVideoTaskWithOptions(SubmitAudioTo3DAvatarVideoTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitAudioTo3DAvatarVideoTaskShrinkRequest request = new SubmitAudioTo3DAvatarVideoTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.app)) {
            request.appShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.app, "App", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.audioInfo)) {
            request.audioInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.audioInfo, "AudioInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.avatarInfo)) {
            request.avatarInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.avatarInfo, "AvatarInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.videoInfo)) {
            request.videoInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.videoInfo, "VideoInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appShrink)) {
            query.put("App", request.appShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audioInfoShrink)) {
            query.put("AudioInfo", request.audioInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.avatarInfoShrink)) {
            query.put("AvatarInfo", request.avatarInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callback)) {
            query.put("Callback", request.callback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackParams)) {
            query.put("CallbackParams", request.callbackParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extParams)) {
            query.put("ExtParams", request.extParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoInfoShrink)) {
            query.put("VideoInfo", request.videoInfoShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitAudioTo3DAvatarVideoTask"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitAudioTo3DAvatarVideoTaskResponse());
    }

    public SubmitAudioTo3DAvatarVideoTaskResponse submitAudioTo3DAvatarVideoTask(SubmitAudioTo3DAvatarVideoTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAudioTo3DAvatarVideoTaskWithOptions(request, runtime);
    }

    public SubmitAvatarVideoTaskResponse submitAvatarVideoTaskWithOptions(SubmitAvatarVideoTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitAvatarVideoTaskShrinkRequest request = new SubmitAvatarVideoTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.app)) {
            request.appShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.app, "App", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appShrink)) {
            query.put("App", request.appShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callback)) {
            query.put("Callback", request.callback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackParams)) {
            query.put("CallbackParams", request.callbackParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extParams)) {
            query.put("ExtParams", request.extParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoParams)) {
            query.put("VideoParams", request.videoParams);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitAvatarVideoTask"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitAvatarVideoTaskResponse());
    }

    public SubmitAvatarVideoTaskResponse submitAvatarVideoTask(SubmitAvatarVideoTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAvatarVideoTaskWithOptions(request, runtime);
    }

    public SubmitTextTo2DAvatarVideoTaskResponse submitTextTo2DAvatarVideoTaskWithOptions(SubmitTextTo2DAvatarVideoTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitTextTo2DAvatarVideoTaskShrinkRequest request = new SubmitTextTo2DAvatarVideoTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.app)) {
            request.appShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.app, "App", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.audioInfo)) {
            request.audioInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.audioInfo, "AudioInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.avatarInfo)) {
            request.avatarInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.avatarInfo, "AvatarInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.videoInfo)) {
            request.videoInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.videoInfo, "VideoInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appShrink)) {
            query.put("App", request.appShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audioInfoShrink)) {
            query.put("AudioInfo", request.audioInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.avatarInfoShrink)) {
            query.put("AvatarInfo", request.avatarInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callback)) {
            query.put("Callback", request.callback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackParams)) {
            query.put("CallbackParams", request.callbackParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extParams)) {
            query.put("ExtParams", request.extParams);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitTextTo2DAvatarVideoTaskWithOptions(request, runtime);
    }

    public SubmitTextTo3DAvatarVideoTaskResponse submitTextTo3DAvatarVideoTaskWithOptions(SubmitTextTo3DAvatarVideoTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitTextTo3DAvatarVideoTaskShrinkRequest request = new SubmitTextTo3DAvatarVideoTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.app)) {
            request.appShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.app, "App", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.audioInfo)) {
            request.audioInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.audioInfo, "AudioInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.avatarInfo)) {
            request.avatarInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.avatarInfo, "AvatarInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.videoInfo)) {
            request.videoInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.videoInfo, "VideoInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appShrink)) {
            query.put("App", request.appShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audioInfoShrink)) {
            query.put("AudioInfo", request.audioInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.avatarInfoShrink)) {
            query.put("AvatarInfo", request.avatarInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callback)) {
            query.put("Callback", request.callback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackParams)) {
            query.put("CallbackParams", request.callbackParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extParams)) {
            query.put("ExtParams", request.extParams);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitTextTo3DAvatarVideoTaskWithOptions(request, runtime);
    }

    public Update2dAvatarResponse update2dAvatarWithOptions(Update2dAvatarRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callback)) {
            query.put("Callback", request.callback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.image)) {
            query.put("Image", request.image);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientation)) {
            query.put("Orientation", request.orientation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portrait)) {
            query.put("Portrait", request.portrait);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transparent)) {
            query.put("Transparent", request.transparent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.video)) {
            query.put("Video", request.video);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Update2dAvatar"),
            new TeaPair("version", "2022-01-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Update2dAvatarResponse());
    }

    public Update2dAvatarResponse update2dAvatar(Update2dAvatarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.update2dAvatarWithOptions(request, runtime);
    }
}
