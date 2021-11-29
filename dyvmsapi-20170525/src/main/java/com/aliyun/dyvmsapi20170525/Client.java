// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525;

import com.aliyun.tea.*;
import com.aliyun.dyvmsapi20170525.models.*;
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
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dyvmsapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddRtcAccountResponse addRtcAccountWithOptions(AddRtcAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DeviceId", request.deviceId);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddRtcAccount"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddRtcAccountResponse());
    }

    public AddRtcAccountResponse addRtcAccount(AddRtcAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addRtcAccountWithOptions(request, runtime);
    }

    public AddVirtualNumberRelationResponse addVirtualNumberRelationWithOptions(AddVirtualNumberRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CorpNameList", request.corpNameList);
        query.put("NumberList", request.numberList);
        query.put("OwnerId", request.ownerId);
        query.put("PhoneNum", request.phoneNum);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RouteType", request.routeType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddVirtualNumberRelation"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddVirtualNumberRelationResponse());
    }

    public AddVirtualNumberRelationResponse addVirtualNumberRelation(AddVirtualNumberRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addVirtualNumberRelationWithOptions(request, runtime);
    }

    public BatchRobotSmartCallResponse batchRobotSmartCallWithOptions(BatchRobotSmartCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CalledNumber", request.calledNumber);
        query.put("CalledShowNumber", request.calledShowNumber);
        query.put("CorpName", request.corpName);
        query.put("DialogId", request.dialogId);
        query.put("EarlyMediaAsr", request.earlyMediaAsr);
        query.put("IsSelfLine", request.isSelfLine);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ScheduleCall", request.scheduleCall);
        query.put("ScheduleTime", request.scheduleTime);
        query.put("TaskName", request.taskName);
        query.put("TtsParam", request.ttsParam);
        query.put("TtsParamHead", request.ttsParamHead);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchRobotSmartCall"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchRobotSmartCallResponse());
    }

    public BatchRobotSmartCallResponse batchRobotSmartCall(BatchRobotSmartCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchRobotSmartCallWithOptions(request, runtime);
    }

    public CancelCallResponse cancelCallWithOptions(CancelCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CallId", request.callId);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelCall"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelCallResponse());
    }

    public CancelCallResponse cancelCall(CancelCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelCallWithOptions(request, runtime);
    }

    public CancelOrderRobotTaskResponse cancelOrderRobotTaskWithOptions(CancelOrderRobotTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelOrderRobotTask"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelOrderRobotTaskResponse());
    }

    public CancelOrderRobotTaskResponse cancelOrderRobotTask(CancelOrderRobotTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelOrderRobotTaskWithOptions(request, runtime);
    }

    public CancelRobotTaskResponse cancelRobotTaskWithOptions(CancelRobotTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelRobotTask"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelRobotTaskResponse());
    }

    public CancelRobotTaskResponse cancelRobotTask(CancelRobotTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelRobotTaskWithOptions(request, runtime);
    }

    public ClickToDialResponse clickToDialWithOptions(ClickToDialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AsrFlag", request.asrFlag);
        query.put("AsrModelId", request.asrModelId);
        query.put("CalledNumber", request.calledNumber);
        query.put("CalledShowNumber", request.calledShowNumber);
        query.put("CallerNumber", request.callerNumber);
        query.put("CallerShowNumber", request.callerShowNumber);
        query.put("OutId", request.outId);
        query.put("OwnerId", request.ownerId);
        query.put("RecordFlag", request.recordFlag);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SessionTimeout", request.sessionTimeout);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ClickToDial"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ClickToDialResponse());
    }

    public ClickToDialResponse clickToDial(ClickToDialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.clickToDialWithOptions(request, runtime);
    }

    public CreateCallTaskResponse createCallTaskWithOptions(CreateCallTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizType", request.bizType);
        query.put("Data", request.data);
        query.put("DataType", request.dataType);
        query.put("FireTime", request.fireTime);
        query.put("OwnerId", request.ownerId);
        query.put("Resource", request.resource);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ResourceType", request.resourceType);
        query.put("ScheduleType", request.scheduleType);
        query.put("StopTime", request.stopTime);
        query.put("TaskName", request.taskName);
        query.put("TemplateCode", request.templateCode);
        query.put("TemplateName", request.templateName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCallTask"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCallTaskResponse());
    }

    public CreateCallTaskResponse createCallTask(CreateCallTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCallTaskWithOptions(request, runtime);
    }

    public CreateRobotTaskResponse createRobotTaskWithOptions(CreateRobotTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Caller", request.caller);
        query.put("CorpName", request.corpName);
        query.put("DialogId", request.dialogId);
        query.put("IsSelfLine", request.isSelfLine);
        query.put("NumberStatusIdent", request.numberStatusIdent);
        query.put("OwnerId", request.ownerId);
        query.put("RecallInterval", request.recallInterval);
        query.put("RecallStateCodes", request.recallStateCodes);
        query.put("RecallTimes", request.recallTimes);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RetryType", request.retryType);
        query.put("TaskName", request.taskName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRobotTask"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRobotTaskResponse());
    }

    public CreateRobotTaskResponse createRobotTask(CreateRobotTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRobotTaskWithOptions(request, runtime);
    }

    public DeleteRobotTaskResponse deleteRobotTaskWithOptions(DeleteRobotTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRobotTask"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRobotTaskResponse());
    }

    public DeleteRobotTaskResponse deleteRobotTask(DeleteRobotTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRobotTaskWithOptions(request, runtime);
    }

    public ExecuteCallTaskResponse executeCallTaskWithOptions(ExecuteCallTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FireTime", request.fireTime);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("Status", request.status);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteCallTask"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteCallTaskResponse());
    }

    public ExecuteCallTaskResponse executeCallTask(ExecuteCallTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeCallTaskWithOptions(request, runtime);
    }

    public GetCallInfoResponse getCallInfoWithOptions(GetCallInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RtcId", request.rtcId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCallInfo"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCallInfoResponse());
    }

    public GetCallInfoResponse getCallInfo(GetCallInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCallInfoWithOptions(request, runtime);
    }

    public GetHotlineQualificationByOrderResponse getHotlineQualificationByOrderWithOptions(GetHotlineQualificationByOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OrderId", request.orderId);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotlineQualificationByOrder"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotlineQualificationByOrderResponse());
    }

    public GetHotlineQualificationByOrderResponse getHotlineQualificationByOrder(GetHotlineQualificationByOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHotlineQualificationByOrderWithOptions(request, runtime);
    }

    public GetMqttTokenResponse getMqttTokenWithOptions(GetMqttTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMqttToken"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMqttTokenResponse());
    }

    public GetMqttTokenResponse getMqttToken(GetMqttTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMqttTokenWithOptions(request, runtime);
    }

    public GetRtcTokenResponse getRtcTokenWithOptions(GetRtcTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DeviceId", request.deviceId);
        query.put("IsCustomAccount", request.isCustomAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("UserId", request.userId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRtcToken"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRtcTokenResponse());
    }

    public GetRtcTokenResponse getRtcToken(GetRtcTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRtcTokenWithOptions(request, runtime);
    }

    public GetTokenResponse getTokenWithOptions(GetTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TokenType", request.tokenType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetToken"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTokenResponse());
    }

    public GetTokenResponse getToken(GetTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTokenWithOptions(request, runtime);
    }

    public IvrCallResponse ivrCallWithOptions(IvrCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ByeCode", request.byeCode);
        query.put("ByeTtsParams", request.byeTtsParams);
        query.put("CalledNumber", request.calledNumber);
        query.put("CalledShowNumber", request.calledShowNumber);
        query.put("MenuKeyMap", request.menuKeyMap);
        query.put("OutId", request.outId);
        query.put("OwnerId", request.ownerId);
        query.put("PlayTimes", request.playTimes);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("StartCode", request.startCode);
        query.put("StartTtsParams", request.startTtsParams);
        query.put("Timeout", request.timeout);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IvrCall"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IvrCallResponse());
    }

    public IvrCallResponse ivrCall(IvrCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.ivrCallWithOptions(request, runtime);
    }

    public ListCallTaskResponse listCallTaskWithOptions(ListCallTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizType", request.bizType);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("Status", request.status);
        query.put("TaskId", request.taskId);
        query.put("TaskName", request.taskName);
        query.put("TemplateName", request.templateName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCallTask"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCallTaskResponse());
    }

    public ListCallTaskResponse listCallTask(ListCallTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCallTaskWithOptions(request, runtime);
    }

    public ListCallTaskDetailResponse listCallTaskDetailWithOptions(ListCallTaskDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CalledNum", request.calledNum);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("Status", request.status);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCallTaskDetail"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCallTaskDetailResponse());
    }

    public ListCallTaskDetailResponse listCallTaskDetail(ListCallTaskDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCallTaskDetailWithOptions(request, runtime);
    }

    public ListHotlineTransferNumberResponse listHotlineTransferNumberWithOptions(ListHotlineTransferNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("HotlineNumber", request.hotlineNumber);
        query.put("OwnerId", request.ownerId);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("QualificationId", request.qualificationId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHotlineTransferNumber"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotlineTransferNumberResponse());
    }

    public ListHotlineTransferNumberResponse listHotlineTransferNumber(ListHotlineTransferNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHotlineTransferNumberWithOptions(request, runtime);
    }

    public ListHotlineTransferRegisterFileResponse listHotlineTransferRegisterFileWithOptions(ListHotlineTransferRegisterFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("HotlineNumber", request.hotlineNumber);
        query.put("OwnerId", request.ownerId);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("QualificationId", request.qualificationId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHotlineTransferRegisterFile"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotlineTransferRegisterFileResponse());
    }

    public ListHotlineTransferRegisterFileResponse listHotlineTransferRegisterFile(ListHotlineTransferRegisterFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHotlineTransferRegisterFileWithOptions(request, runtime);
    }

    public QueryCallDetailByCallIdResponse queryCallDetailByCallIdWithOptions(QueryCallDetailByCallIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CallId", request.callId);
        query.put("OwnerId", request.ownerId);
        query.put("ProdId", request.prodId);
        query.put("QueryDate", request.queryDate);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCallDetailByCallId"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCallDetailByCallIdResponse());
    }

    public QueryCallDetailByCallIdResponse queryCallDetailByCallId(QueryCallDetailByCallIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCallDetailByCallIdWithOptions(request, runtime);
    }

    public QueryCallDetailByTaskIdResponse queryCallDetailByTaskIdWithOptions(QueryCallDetailByTaskIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Callee", request.callee);
        query.put("OwnerId", request.ownerId);
        query.put("QueryDate", request.queryDate);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCallDetailByTaskId"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCallDetailByTaskIdResponse());
    }

    public QueryCallDetailByTaskIdResponse queryCallDetailByTaskId(QueryCallDetailByTaskIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCallDetailByTaskIdWithOptions(request, runtime);
    }

    public QueryCallInPoolTransferConfigResponse queryCallInPoolTransferConfigWithOptions(QueryCallInPoolTransferConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("PhoneNumber", request.phoneNumber);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCallInPoolTransferConfig"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCallInPoolTransferConfigResponse());
    }

    public QueryCallInPoolTransferConfigResponse queryCallInPoolTransferConfig(QueryCallInPoolTransferConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCallInPoolTransferConfigWithOptions(request, runtime);
    }

    public QueryCallInTransferRecordResponse queryCallInTransferRecordWithOptions(QueryCallInTransferRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CallInCaller", request.callInCaller);
        query.put("OwnerId", request.ownerId);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("PhoneNumber", request.phoneNumber);
        query.put("QueryDate", request.queryDate);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCallInTransferRecord"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCallInTransferRecordResponse());
    }

    public QueryCallInTransferRecordResponse queryCallInTransferRecord(QueryCallInTransferRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCallInTransferRecordWithOptions(request, runtime);
    }

    public QueryRobotInfoListResponse queryRobotInfoListWithOptions(QueryRobotInfoListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AuditStatus", request.auditStatus);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRobotInfoList"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRobotInfoListResponse());
    }

    public QueryRobotInfoListResponse queryRobotInfoList(QueryRobotInfoListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRobotInfoListWithOptions(request, runtime);
    }

    public QueryRobotTaskCallDetailResponse queryRobotTaskCallDetailWithOptions(QueryRobotTaskCallDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Callee", request.callee);
        query.put("OwnerId", request.ownerId);
        query.put("QueryDate", request.queryDate);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRobotTaskCallDetail"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRobotTaskCallDetailResponse());
    }

    public QueryRobotTaskCallDetailResponse queryRobotTaskCallDetail(QueryRobotTaskCallDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRobotTaskCallDetailWithOptions(request, runtime);
    }

    public QueryRobotTaskCallListResponse queryRobotTaskCallListWithOptions(QueryRobotTaskCallListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CallResult", request.callResult);
        query.put("Called", request.called);
        query.put("DialogCountFrom", request.dialogCountFrom);
        query.put("DialogCountTo", request.dialogCountTo);
        query.put("DurationFrom", request.durationFrom);
        query.put("DurationTo", request.durationTo);
        query.put("HangupDirection", request.hangupDirection);
        query.put("OwnerId", request.ownerId);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRobotTaskCallList"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRobotTaskCallListResponse());
    }

    public QueryRobotTaskCallListResponse queryRobotTaskCallList(QueryRobotTaskCallListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRobotTaskCallListWithOptions(request, runtime);
    }

    public QueryRobotTaskDetailResponse queryRobotTaskDetailWithOptions(QueryRobotTaskDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Id", request.id);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRobotTaskDetail"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRobotTaskDetailResponse());
    }

    public QueryRobotTaskDetailResponse queryRobotTaskDetail(QueryRobotTaskDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRobotTaskDetailWithOptions(request, runtime);
    }

    public QueryRobotTaskListResponse queryRobotTaskListWithOptions(QueryRobotTaskListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("Status", request.status);
        query.put("TaskName", request.taskName);
        query.put("Time", request.time);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRobotTaskList"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRobotTaskListResponse());
    }

    public QueryRobotTaskListResponse queryRobotTaskList(QueryRobotTaskListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRobotTaskListWithOptions(request, runtime);
    }

    public QueryRobotv2AllListResponse queryRobotv2AllListWithOptions(QueryRobotv2AllListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRobotv2AllList"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRobotv2AllListResponse());
    }

    public QueryRobotv2AllListResponse queryRobotv2AllList(QueryRobotv2AllListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRobotv2AllListWithOptions(request, runtime);
    }

    public QueryVirtualNumberResponse queryVirtualNumberWithOptions(QueryVirtualNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RouteType", request.routeType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryVirtualNumber"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryVirtualNumberResponse());
    }

    public QueryVirtualNumberResponse queryVirtualNumber(QueryVirtualNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryVirtualNumberWithOptions(request, runtime);
    }

    public QueryVirtualNumberRelationResponse queryVirtualNumberRelationWithOptions(QueryVirtualNumberRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("PhoneNum", request.phoneNum);
        query.put("ProdCode", request.prodCode);
        query.put("QualificationId", request.qualificationId);
        query.put("RegionNameCity", request.regionNameCity);
        query.put("RelatedNum", request.relatedNum);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("RouteType", request.routeType);
        query.put("SpecId", request.specId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryVirtualNumberRelation"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryVirtualNumberRelationResponse());
    }

    public QueryVirtualNumberRelationResponse queryVirtualNumberRelation(QueryVirtualNumberRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryVirtualNumberRelationWithOptions(request, runtime);
    }

    public RefreshMqttTokenResponse refreshMqttTokenWithOptions(RefreshMqttTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientId", request.clientId);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshMqttToken"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshMqttTokenResponse());
    }

    public RefreshMqttTokenResponse refreshMqttToken(RefreshMqttTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshMqttTokenWithOptions(request, runtime);
    }

    public SendVerificationResponse sendVerificationWithOptions(SendVerificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizType", request.bizType);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("Target", request.target);
        query.put("VerifyType", request.verifyType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendVerification"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendVerificationResponse());
    }

    public SendVerificationResponse sendVerification(SendVerificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendVerificationWithOptions(request, runtime);
    }

    public SetTransferCalleePoolConfigResponse setTransferCalleePoolConfigWithOptions(SetTransferCalleePoolConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CalledRouteMode", request.calledRouteMode);
        query.put("Details", request.details);
        query.put("OwnerId", request.ownerId);
        query.put("PhoneNumber", request.phoneNumber);
        query.put("QualificationId", request.qualificationId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetTransferCalleePoolConfig"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetTransferCalleePoolConfigResponse());
    }

    public SetTransferCalleePoolConfigResponse setTransferCalleePoolConfig(SetTransferCalleePoolConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setTransferCalleePoolConfigWithOptions(request, runtime);
    }

    public SingleCallByTtsResponse singleCallByTtsWithOptions(SingleCallByTtsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CalledNumber", request.calledNumber);
        query.put("CalledShowNumber", request.calledShowNumber);
        query.put("OutId", request.outId);
        query.put("OwnerId", request.ownerId);
        query.put("PlayTimes", request.playTimes);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("Speed", request.speed);
        query.put("TtsCode", request.ttsCode);
        query.put("TtsParam", request.ttsParam);
        query.put("Volume", request.volume);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SingleCallByTts"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SingleCallByTtsResponse());
    }

    public SingleCallByTtsResponse singleCallByTts(SingleCallByTtsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.singleCallByTtsWithOptions(request, runtime);
    }

    public SingleCallByVoiceResponse singleCallByVoiceWithOptions(SingleCallByVoiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CalledNumber", request.calledNumber);
        query.put("CalledShowNumber", request.calledShowNumber);
        query.put("OutId", request.outId);
        query.put("OwnerId", request.ownerId);
        query.put("PlayTimes", request.playTimes);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("Speed", request.speed);
        query.put("VoiceCode", request.voiceCode);
        query.put("Volume", request.volume);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SingleCallByVoice"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SingleCallByVoiceResponse());
    }

    public SingleCallByVoiceResponse singleCallByVoice(SingleCallByVoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.singleCallByVoiceWithOptions(request, runtime);
    }

    public SmartCallResponse smartCallWithOptions(SmartCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ActionCodeBreak", request.actionCodeBreak);
        query.put("ActionCodeTimeBreak", request.actionCodeTimeBreak);
        query.put("AsrBaseId", request.asrBaseId);
        query.put("AsrModelId", request.asrModelId);
        query.put("BackgroundFileCode", request.backgroundFileCode);
        query.put("BackgroundSpeed", request.backgroundSpeed);
        query.put("BackgroundVolume", request.backgroundVolume);
        query.put("CalledNumber", request.calledNumber);
        query.put("CalledShowNumber", request.calledShowNumber);
        query.put("DynamicId", request.dynamicId);
        query.put("EarlyMediaAsr", request.earlyMediaAsr);
        query.put("EnableITN", request.enableITN);
        query.put("MuteTime", request.muteTime);
        query.put("OutId", request.outId);
        query.put("OwnerId", request.ownerId);
        query.put("PauseTime", request.pauseTime);
        query.put("RecordFlag", request.recordFlag);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SessionTimeout", request.sessionTimeout);
        query.put("Speed", request.speed);
        query.put("StreamAsr", request.streamAsr);
        query.put("TtsConf", request.ttsConf);
        query.put("TtsSpeed", request.ttsSpeed);
        query.put("TtsStyle", request.ttsStyle);
        query.put("TtsVolume", request.ttsVolume);
        query.put("VoiceCode", request.voiceCode);
        query.put("VoiceCodeParam", request.voiceCodeParam);
        query.put("Volume", request.volume);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SmartCall"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SmartCallResponse());
    }

    public SmartCallResponse smartCall(SmartCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.smartCallWithOptions(request, runtime);
    }

    public SmartCallOperateResponse smartCallOperateWithOptions(SmartCallOperateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CallId", request.callId);
        query.put("Command", request.command);
        query.put("OwnerId", request.ownerId);
        query.put("Param", request.param);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SmartCallOperate"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SmartCallOperateResponse());
    }

    public SmartCallOperateResponse smartCallOperate(SmartCallOperateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.smartCallOperateWithOptions(request, runtime);
    }

    public StartRobotTaskResponse startRobotTaskWithOptions(StartRobotTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ScheduleTime", request.scheduleTime);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartRobotTask"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartRobotTaskResponse());
    }

    public StartRobotTaskResponse startRobotTask(StartRobotTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startRobotTaskWithOptions(request, runtime);
    }

    public StopRobotTaskResponse stopRobotTaskWithOptions(StopRobotTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopRobotTask"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopRobotTaskResponse());
    }

    public StopRobotTaskResponse stopRobotTask(StopRobotTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopRobotTaskWithOptions(request, runtime);
    }

    public SubmitHotlineTransferRegisterResponse submitHotlineTransferRegisterWithOptions(SubmitHotlineTransferRegisterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Agreement", request.agreement);
        query.put("HotlineNumber", request.hotlineNumber);
        query.put("OperatorIdentityCard", request.operatorIdentityCard);
        query.put("OperatorMail", request.operatorMail);
        query.put("OperatorMailVerifyCode", request.operatorMailVerifyCode);
        query.put("OperatorMobile", request.operatorMobile);
        query.put("OperatorMobileVerifyCode", request.operatorMobileVerifyCode);
        query.put("OperatorName", request.operatorName);
        query.put("OwnerId", request.ownerId);
        query.put("QualificationId", request.qualificationId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TransferPhoneNumberInfos", request.transferPhoneNumberInfos);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitHotlineTransferRegister"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitHotlineTransferRegisterResponse());
    }

    public SubmitHotlineTransferRegisterResponse submitHotlineTransferRegister(SubmitHotlineTransferRegisterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitHotlineTransferRegisterWithOptions(request, runtime);
    }

    public UploadRobotTaskCalledFileResponse uploadRobotTaskCalledFileWithOptions(UploadRobotTaskCalledFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CalledNumber", request.calledNumber);
        query.put("Id", request.id);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TtsParam", request.ttsParam);
        query.put("TtsParamHead", request.ttsParamHead);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadRobotTaskCalledFile"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadRobotTaskCalledFileResponse());
    }

    public UploadRobotTaskCalledFileResponse uploadRobotTaskCalledFile(UploadRobotTaskCalledFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadRobotTaskCalledFileWithOptions(request, runtime);
    }
}
