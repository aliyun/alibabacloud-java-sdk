// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015;

import com.aliyun.tea.*;
import com.aliyun.aiccs20191015.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aiccs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>新增热线号码</p>
     * 
     * @param tmpReq AddHotlineNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddHotlineNumberResponse
     */
    public AddHotlineNumberResponse addHotlineNumberWithOptions(AddHotlineNumberRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddHotlineNumberShrinkRequest request = new AddHotlineNumberShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.outboundRangeList)) {
            request.outboundRangeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.outboundRangeList, "OutboundRangeList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableInbound)) {
            body.put("EnableInbound", request.enableInbound);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableInboundEvaluation)) {
            body.put("EnableInboundEvaluation", request.enableInboundEvaluation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableOutbound)) {
            body.put("EnableOutbound", request.enableOutbound);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableOutboundEvaluation)) {
            body.put("EnableOutboundEvaluation", request.enableOutboundEvaluation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluationLevel)) {
            body.put("EvaluationLevel", request.evaluationLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotlineNumber)) {
            body.put("HotlineNumber", request.hotlineNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inboundFlowId)) {
            body.put("InboundFlowId", request.inboundFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outboundAllDepart)) {
            body.put("OutboundAllDepart", request.outboundAllDepart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outboundRangeListShrink)) {
            body.put("OutboundRangeList", request.outboundRangeListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddHotlineNumber"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddHotlineNumberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增热线号码</p>
     * 
     * @param request AddHotlineNumberRequest
     * @return AddHotlineNumberResponse
     */
    public AddHotlineNumberResponse addHotlineNumber(AddHotlineNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addHotlineNumberWithOptions(request, runtime);
    }

    /**
     * @param request AddOuterAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddOuterAccountResponse
     */
    public AddOuterAccountResponse addOuterAccountWithOptions(AddOuterAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddOuterAccount"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddOuterAccountResponse());
    }

    /**
     * @param request AddOuterAccountRequest
     * @return AddOuterAccountResponse
     */
    public AddOuterAccountResponse addOuterAccount(AddOuterAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addOuterAccountWithOptions(request, runtime);
    }

    /**
     * @param request AddSkillGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddSkillGroupResponse
     */
    public AddSkillGroupResponse addSkillGroupWithOptions(AddSkillGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSkillGroup"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSkillGroupResponse());
    }

    /**
     * @param request AddSkillGroupRequest
     * @return AddSkillGroupResponse
     */
    public AddSkillGroupResponse addSkillGroup(AddSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addSkillGroupWithOptions(request, runtime);
    }

    /**
     * @param request AiccsSmartCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AiccsSmartCallResponse
     */
    public AiccsSmartCallResponse aiccsSmartCallWithOptions(AiccsSmartCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionCodeBreak)) {
            query.put("ActionCodeBreak", request.actionCodeBreak);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.actionCodeTimeBreak)) {
            query.put("ActionCodeTimeBreak", request.actionCodeTimeBreak);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asrAlsAmId)) {
            query.put("AsrAlsAmId", request.asrAlsAmId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asrBaseId)) {
            query.put("AsrBaseId", request.asrBaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asrModelId)) {
            query.put("AsrModelId", request.asrModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asrVocabularyId)) {
            query.put("AsrVocabularyId", request.asrVocabularyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgroundFileCode)) {
            query.put("BackgroundFileCode", request.backgroundFileCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgroundSpeed)) {
            query.put("BackgroundSpeed", request.backgroundSpeed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgroundVolume)) {
            query.put("BackgroundVolume", request.backgroundVolume);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledShowNumber)) {
            query.put("CalledShowNumber", request.calledShowNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicId)) {
            query.put("DynamicId", request.dynamicId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.earlyMediaAsr)) {
            query.put("EarlyMediaAsr", request.earlyMediaAsr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableITN)) {
            query.put("EnableITN", request.enableITN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.muteTime)) {
            query.put("MuteTime", request.muteTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pauseTime)) {
            query.put("PauseTime", request.pauseTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playTimes)) {
            query.put("PlayTimes", request.playTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordFlag)) {
            query.put("RecordFlag", request.recordFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionTimeout)) {
            query.put("SessionTimeout", request.sessionTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speed)) {
            query.put("Speed", request.speed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsConf)) {
            query.put("TtsConf", request.ttsConf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsSpeed)) {
            query.put("TtsSpeed", request.ttsSpeed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsStyle)) {
            query.put("TtsStyle", request.ttsStyle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsVolume)) {
            query.put("TtsVolume", request.ttsVolume);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceCode)) {
            query.put("VoiceCode", request.voiceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceCodeParam)) {
            query.put("VoiceCodeParam", request.voiceCodeParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volume)) {
            query.put("Volume", request.volume);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AiccsSmartCall"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AiccsSmartCallResponse());
    }

    /**
     * @param request AiccsSmartCallRequest
     * @return AiccsSmartCallResponse
     */
    public AiccsSmartCallResponse aiccsSmartCall(AiccsSmartCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.aiccsSmartCallWithOptions(request, runtime);
    }

    /**
     * @param request AiccsSmartCallOperateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AiccsSmartCallOperateResponse
     */
    public AiccsSmartCallOperateResponse aiccsSmartCallOperateWithOptions(AiccsSmartCallOperateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.command)) {
            query.put("Command", request.command);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.param)) {
            query.put("Param", request.param);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AiccsSmartCallOperate"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AiccsSmartCallOperateResponse());
    }

    /**
     * @param request AiccsSmartCallOperateRequest
     * @return AiccsSmartCallOperateResponse
     */
    public AiccsSmartCallOperateResponse aiccsSmartCallOperate(AiccsSmartCallOperateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.aiccsSmartCallOperateWithOptions(request, runtime);
    }

    /**
     * @param request AnswerCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AnswerCallResponse
     */
    public AnswerCallResponse answerCallWithOptions(AnswerCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            body.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            body.put("ConnectionId", request.connectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AnswerCall"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AnswerCallResponse());
    }

    /**
     * @param request AnswerCallRequest
     * @return AnswerCallResponse
     */
    public AnswerCallResponse answerCall(AnswerCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.answerCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>追加任务明细</p>
     * 
     * @param request AttachTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachTaskResponse
     */
    public AttachTaskResponse attachTaskWithOptions(AttachTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callString)) {
            query.put("CallString", request.callString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachTask"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>追加任务明细</p>
     * 
     * @param request AttachTaskRequest
     * @return AttachTaskResponse
     */
    public AttachTaskResponse attachTask(AttachTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachTaskWithOptions(request, runtime);
    }

    /**
     * @param request BatchCreateQualityProjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchCreateQualityProjectsResponse
     */
    public BatchCreateQualityProjectsResponse batchCreateQualityProjectsWithOptions(BatchCreateQualityProjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analysisIds)) {
            query.put("AnalysisIds", request.analysisIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelTouchType)) {
            query.put("ChannelTouchType", request.channelTouchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkFreqType)) {
            query.put("CheckFreqType", request.checkFreqType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceList)) {
            query.put("InstanceList", request.instanceList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeRangeEnd)) {
            query.put("TimeRangeEnd", request.timeRangeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeRangeStart)) {
            query.put("TimeRangeStart", request.timeRangeStart);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchCreateQualityProjects"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchCreateQualityProjectsResponse());
    }

    /**
     * @param request BatchCreateQualityProjectsRequest
     * @return BatchCreateQualityProjectsResponse
     */
    public BatchCreateQualityProjectsResponse batchCreateQualityProjects(BatchCreateQualityProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchCreateQualityProjectsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量取消大模型解决方案Ai外呼明细任务</p>
     * 
     * @param tmpReq CancelAiCallDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelAiCallDetailsResponse
     */
    public CancelAiCallDetailsResponse cancelAiCallDetailsWithOptions(CancelAiCallDetailsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CancelAiCallDetailsShrinkRequest request = new CancelAiCallDetailsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.detailIdList)) {
            request.detailIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.detailIdList, "DetailIdList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.phoneNumbers)) {
            request.phoneNumbersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.phoneNumbers, "PhoneNumbers", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchId)) {
            query.put("BatchId", request.batchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detailIdListShrink)) {
            query.put("DetailIdList", request.detailIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumbersShrink)) {
            query.put("PhoneNumbers", request.phoneNumbersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelAiCallDetails"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelAiCallDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量取消大模型解决方案Ai外呼明细任务</p>
     * 
     * @param request CancelAiCallDetailsRequest
     * @return CancelAiCallDetailsResponse
     */
    public CancelAiCallDetailsResponse cancelAiCallDetails(CancelAiCallDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelAiCallDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除智能外呼任务</p>
     * 
     * @param request CancelTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelTaskResponse
     */
    public CancelTaskResponse cancelTaskWithOptions(CancelTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelTask"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除智能外呼任务</p>
     * 
     * @param request CancelTaskRequest
     * @return CancelTaskResponse
     */
    public CancelTaskResponse cancelTask(CancelTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改在线客服状态</p>
     * 
     * @param request ChangeChatAgentStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeChatAgentStatusResponse
     */
    public ChangeChatAgentStatusResponse changeChatAgentStatusWithOptions(ChangeChatAgentStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.method)) {
            body.put("Method", request.method);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeChatAgentStatus"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeChatAgentStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改在线客服状态</p>
     * 
     * @param request ChangeChatAgentStatusRequest
     * @return ChangeChatAgentStatusResponse
     */
    public ChangeChatAgentStatusResponse changeChatAgentStatus(ChangeChatAgentStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeChatAgentStatusWithOptions(request, runtime);
    }

    /**
     * @param request ChangeQualityProjectStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeQualityProjectStatusResponse
     */
    public ChangeQualityProjectStatusResponse changeQualityProjectStatusWithOptions(ChangeQualityProjectStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeQualityProjectStatus"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeQualityProjectStatusResponse());
    }

    /**
     * @param request ChangeQualityProjectStatusRequest
     * @return ChangeQualityProjectStatusResponse
     */
    public ChangeQualityProjectStatusResponse changeQualityProjectStatus(ChangeQualityProjectStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeQualityProjectStatusWithOptions(request, runtime);
    }

    /**
     * @param request CreateAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAgentResponse
     */
    public CreateAgentResponse createAgentWithOptions(CreateAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            bodyFlat.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupIdList)) {
            bodyFlat.put("SkillGroupIdList", request.skillGroupIdList);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAgent"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAgentResponse());
    }

    /**
     * @param request CreateAgentRequest
     * @return CreateAgentResponse
     */
    public CreateAgentResponse createAgent(CreateAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建任务</p>
     * 
     * @param tmpReq CreateAiCallTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAiCallTaskResponse
     */
    public CreateAiCallTaskResponse createAiCallTaskWithOptions(CreateAiCallTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAiCallTaskShrinkRequest request = new CreateAiCallTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.callDay)) {
            request.callDayShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.callDay, "CallDay", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.callRetryReason)) {
            request.callRetryReasonShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.callRetryReason, "CallRetryReason", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.callTime)) {
            request.callTimeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.callTime, "CallTime", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callDayShrink)) {
            query.put("CallDay", request.callDayShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callRetryInterval)) {
            query.put("CallRetryInterval", request.callRetryInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callRetryReasonShrink)) {
            query.put("CallRetryReason", request.callRetryReasonShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callRetryTimes)) {
            query.put("CallRetryTimes", request.callRetryTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callTimeShrink)) {
            query.put("CallTime", request.callTimeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.missCallRetry)) {
            query.put("MissCallRetry", request.missCallRetry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startType)) {
            query.put("StartType", request.startType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskCps)) {
            query.put("TaskCps", request.taskCps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskStartTime)) {
            query.put("TaskStartTime", request.taskStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualNumber)) {
            query.put("VirtualNumber", request.virtualNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAiCallTask"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAiCallTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建任务</p>
     * 
     * @param request CreateAiCallTaskRequest
     * @return CreateAiCallTaskResponse
     */
    public CreateAiCallTaskResponse createAiCallTask(CreateAiCallTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAiCallTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建智能外呼任务（预测式外呼、自动外呼）</p>
     * 
     * @param tmpReq CreateAiOutboundTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAiOutboundTaskResponse
     */
    public CreateAiOutboundTaskResponse createAiOutboundTaskWithOptions(CreateAiOutboundTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAiOutboundTaskShrinkRequest request = new CreateAiOutboundTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.outboundNums)) {
            request.outboundNumsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.outboundNums, "OutboundNums", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.recallRule)) {
            request.recallRuleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.recallRule, "RecallRule", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.concurrentRate)) {
            query.put("ConcurrentRate", request.concurrentRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionTime)) {
            query.put("ExecutionTime", request.executionTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forecastCallRate)) {
            query.put("ForecastCallRate", request.forecastCallRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.handlerId)) {
            query.put("HandlerId", request.handlerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numRepeated)) {
            query.put("NumRepeated", request.numRepeated);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outboundNumsShrink)) {
            query.put("OutboundNums", request.outboundNumsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallRuleShrink)) {
            query.put("RecallRule", request.recallRuleShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAiOutboundTask"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAiOutboundTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建智能外呼任务（预测式外呼、自动外呼）</p>
     * 
     * @param request CreateAiOutboundTaskRequest
     * @return CreateAiOutboundTaskResponse
     */
    public CreateAiOutboundTaskResponse createAiOutboundTask(CreateAiOutboundTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAiOutboundTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建智能外呼任务批次</p>
     * 
     * @param request CreateAiOutboundTaskBatchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAiOutboundTaskBatchResponse
     */
    public CreateAiOutboundTaskBatchResponse createAiOutboundTaskBatchWithOptions(CreateAiOutboundTaskBatchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAiOutboundTaskBatch"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAiOutboundTaskBatchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建智能外呼任务批次</p>
     * 
     * @param request CreateAiOutboundTaskBatchRequest
     * @return CreateAiOutboundTaskBatchResponse
     */
    public CreateAiOutboundTaskBatchResponse createAiOutboundTaskBatch(CreateAiOutboundTaskBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAiOutboundTaskBatchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建部门信息</p>
     * 
     * @param request CreateDepartmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDepartmentResponse
     */
    public CreateDepartmentResponse createDepartmentWithOptions(CreateDepartmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.departmentName)) {
            query.put("DepartmentName", request.departmentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDepartment"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDepartmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建部门信息</p>
     * 
     * @param request CreateDepartmentRequest
     * @return CreateDepartmentResponse
     */
    public CreateDepartmentResponse createDepartment(CreateDepartmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDepartmentWithOptions(request, runtime);
    }

    /**
     * @param request CreateOutboundTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOutboundTaskResponse
     */
    public CreateOutboundTaskResponse createOutboundTaskWithOptions(CreateOutboundTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ani)) {
            query.put("Ani", request.ani);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callInfos)) {
            query.put("CallInfos", request.callInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departmentId)) {
            query.put("DepartmentId", request.departmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extAttrs)) {
            query.put("ExtAttrs", request.extAttrs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            query.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryInterval)) {
            query.put("RetryInterval", request.retryInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryTime)) {
            query.put("RetryTime", request.retryTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroup)) {
            query.put("SkillGroup", request.skillGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOutboundTask"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOutboundTaskResponse());
    }

    /**
     * @param request CreateOutboundTaskRequest
     * @return CreateOutboundTaskResponse
     */
    public CreateOutboundTaskResponse createOutboundTask(CreateOutboundTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOutboundTaskWithOptions(request, runtime);
    }

    /**
     * @param request CreateQualityProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateQualityProjectResponse
     */
    public CreateQualityProjectResponse createQualityProjectWithOptions(CreateQualityProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analysisIds)) {
            body.put("AnalysisIds", request.analysisIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelTouchType)) {
            body.put("ChannelTouchType", request.channelTouchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkFreqType)) {
            body.put("CheckFreqType", request.checkFreqType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depList)) {
            body.put("DepList", request.depList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupList)) {
            body.put("GroupList", request.groupList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopeType)) {
            body.put("ScopeType", request.scopeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicerList)) {
            body.put("ServicerList", request.servicerList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeRangeEnd)) {
            body.put("TimeRangeEnd", request.timeRangeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeRangeStart)) {
            body.put("TimeRangeStart", request.timeRangeStart);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQualityProject"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQualityProjectResponse());
    }

    /**
     * @param request CreateQualityProjectRequest
     * @return CreateQualityProjectResponse
     */
    public CreateQualityProjectResponse createQualityProject(CreateQualityProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQualityProjectWithOptions(request, runtime);
    }

    /**
     * @param request CreateQualityRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateQualityRuleResponse
     */
    public CreateQualityRuleResponse createQualityRuleWithOptions(CreateQualityRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWords)) {
            body.put("KeyWords", request.keyWords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchType)) {
            body.put("MatchType", request.matchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleTag)) {
            body.put("RuleTag", request.ruleTag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQualityRule"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQualityRuleResponse());
    }

    /**
     * @param request CreateQualityRuleRequest
     * @return CreateQualityRuleResponse
     */
    public CreateQualityRuleResponse createQualityRule(CreateQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQualityRuleWithOptions(request, runtime);
    }

    /**
     * @param request CreateSkillGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSkillGroupResponse
     */
    public CreateSkillGroupResponse createSkillGroupWithOptions(CreateSkillGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            body.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departmentId)) {
            body.put("DepartmentId", request.departmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupName)) {
            body.put("SkillGroupName", request.skillGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSkillGroup"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSkillGroupResponse());
    }

    /**
     * @param request CreateSkillGroupRequest
     * @return CreateSkillGroupResponse
     */
    public CreateSkillGroupResponse createSkillGroup(CreateSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSkillGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建外呼任务</p>
     * 
     * @param request CreateTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTaskWithOptions(CreateTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callString)) {
            query.put("CallString", request.callString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callStringType)) {
            query.put("CallStringType", request.callStringType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            query.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryCount)) {
            query.put("RetryCount", request.retryCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryFlag)) {
            query.put("RetryFlag", request.retryFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryInterval)) {
            query.put("RetryInterval", request.retryInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryStatusCode)) {
            query.put("RetryStatusCode", request.retryStatusCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotId)) {
            query.put("RobotId", request.robotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seatCount)) {
            query.put("SeatCount", request.seatCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startNow)) {
            query.put("StartNow", request.startNow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workDay)) {
            query.put("WorkDay", request.workDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workTimeList)) {
            query.put("WorkTimeList", request.workTimeList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTask"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建外呼任务</p>
     * 
     * @param request CreateTaskRequest
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTask(CreateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建坐席并开通sso登录能力</p>
     * 
     * @param request CreateThirdSsoAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateThirdSsoAgentResponse
     */
    public CreateThirdSsoAgentResponse createThirdSsoAgentWithOptions(CreateThirdSsoAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleIds)) {
            bodyFlat.put("RoleIds", request.roleIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupIds)) {
            bodyFlat.put("SkillGroupIds", request.skillGroupIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateThirdSsoAgent"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateThirdSsoAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建坐席并开通sso登录能力</p>
     * 
     * @param request CreateThirdSsoAgentRequest
     * @return CreateThirdSsoAgentResponse
     */
    public CreateThirdSsoAgentResponse createThirdSsoAgent(CreateThirdSsoAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createThirdSsoAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除坐席账号</p>
     * 
     * @param request DeleteAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAgentResponse
     */
    public DeleteAgentResponse deleteAgentWithOptions(DeleteAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAgent"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除坐席账号</p>
     * 
     * @param request DeleteAgentRequest
     * @return DeleteAgentResponse
     */
    public DeleteAgentResponse deleteAgent(DeleteAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除智能外呼任务</p>
     * 
     * @param request DeleteAiOutboundTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAiOutboundTaskResponse
     */
    public DeleteAiOutboundTaskResponse deleteAiOutboundTaskWithOptions(DeleteAiOutboundTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAiOutboundTask"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAiOutboundTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除智能外呼任务</p>
     * 
     * @param request DeleteAiOutboundTaskRequest
     * @return DeleteAiOutboundTaskResponse
     */
    public DeleteAiOutboundTaskResponse deleteAiOutboundTask(DeleteAiOutboundTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAiOutboundTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除部门信息</p>
     * 
     * @param request DeleteDepartmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDepartmentResponse
     */
    public DeleteDepartmentResponse deleteDepartmentWithOptions(DeleteDepartmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.departmentId)) {
            query.put("DepartmentId", request.departmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDepartment"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDepartmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除部门信息</p>
     * 
     * @param request DeleteDepartmentRequest
     * @return DeleteDepartmentResponse
     */
    public DeleteDepartmentResponse deleteDepartment(DeleteDepartmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDepartmentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除热线号码</p>
     * 
     * @param request DeleteHotlineNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHotlineNumberResponse
     */
    public DeleteHotlineNumberResponse deleteHotlineNumberWithOptions(DeleteHotlineNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotlineNumber)) {
            body.put("HotlineNumber", request.hotlineNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHotlineNumber"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHotlineNumberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除热线号码</p>
     * 
     * @param request DeleteHotlineNumberRequest
     * @return DeleteHotlineNumberResponse
     */
    public DeleteHotlineNumberResponse deleteHotlineNumber(DeleteHotlineNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHotlineNumberWithOptions(request, runtime);
    }

    /**
     * @param request DeleteOutboundTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteOutboundTaskResponse
     */
    public DeleteOutboundTaskResponse deleteOutboundTaskWithOptions(DeleteOutboundTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outboundTaskId)) {
            query.put("OutboundTaskId", request.outboundTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOutboundTask"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOutboundTaskResponse());
    }

    /**
     * @param request DeleteOutboundTaskRequest
     * @return DeleteOutboundTaskResponse
     */
    public DeleteOutboundTaskResponse deleteOutboundTask(DeleteOutboundTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteOutboundTaskWithOptions(request, runtime);
    }

    /**
     * @param request DeleteOuterAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteOuterAccountResponse
     */
    public DeleteOuterAccountResponse deleteOuterAccountWithOptions(DeleteOuterAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOuterAccount"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOuterAccountResponse());
    }

    /**
     * @param request DeleteOuterAccountRequest
     * @return DeleteOuterAccountResponse
     */
    public DeleteOuterAccountResponse deleteOuterAccount(DeleteOuterAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteOuterAccountWithOptions(request, runtime);
    }

    /**
     * @param request DeleteQualityProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteQualityProjectResponse
     */
    public DeleteQualityProjectResponse deleteQualityProjectWithOptions(DeleteQualityProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteQualityProject"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQualityProjectResponse());
    }

    /**
     * @param request DeleteQualityProjectRequest
     * @return DeleteQualityProjectResponse
     */
    public DeleteQualityProjectResponse deleteQualityProject(DeleteQualityProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQualityProjectWithOptions(request, runtime);
    }

    /**
     * @param request DeleteQualityRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteQualityRuleResponse
     */
    public DeleteQualityRuleResponse deleteQualityRuleWithOptions(DeleteQualityRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteQualityRule"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQualityRuleResponse());
    }

    /**
     * @param request DeleteQualityRuleRequest
     * @return DeleteQualityRuleResponse
     */
    public DeleteQualityRuleResponse deleteQualityRule(DeleteQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQualityRuleWithOptions(request, runtime);
    }

    /**
     * @param request DeleteSkillGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSkillGroupResponse
     */
    public DeleteSkillGroupResponse deleteSkillGroupWithOptions(DeleteSkillGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSkillGroup"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSkillGroupResponse());
    }

    /**
     * @param request DeleteSkillGroupRequest
     * @return DeleteSkillGroupResponse
     */
    public DeleteSkillGroupResponse deleteSkillGroup(DeleteSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSkillGroupWithOptions(request, runtime);
    }

    /**
     * @param request DescribeRecordDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRecordDataResponse
     */
    public DescribeRecordDataResponse describeRecordDataWithOptions(DescribeRecordDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.acid)) {
            query.put("Acid", request.acid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secLevel)) {
            query.put("SecLevel", request.secLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecordData"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecordDataResponse());
    }

    /**
     * @param request DescribeRecordDataRequest
     * @return DescribeRecordDataResponse
     */
    public DescribeRecordDataResponse describeRecordData(DescribeRecordDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecordDataWithOptions(request, runtime);
    }

    /**
     * @param request EditQualityProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EditQualityProjectResponse
     */
    public EditQualityProjectResponse editQualityProjectWithOptions(EditQualityProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analysisIds)) {
            query.put("AnalysisIds", request.analysisIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelTouchType)) {
            query.put("ChannelTouchType", request.channelTouchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkFreqType)) {
            query.put("CheckFreqType", request.checkFreqType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depList)) {
            query.put("DepList", request.depList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupList)) {
            query.put("GroupList", request.groupList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectVersion)) {
            query.put("ProjectVersion", request.projectVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopeType)) {
            query.put("ScopeType", request.scopeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicerList)) {
            query.put("ServicerList", request.servicerList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeRangeEnd)) {
            query.put("TimeRangeEnd", request.timeRangeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeRangeStart)) {
            query.put("TimeRangeStart", request.timeRangeStart);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EditQualityProject"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EditQualityProjectResponse());
    }

    /**
     * @param request EditQualityProjectRequest
     * @return EditQualityProjectResponse
     */
    public EditQualityProjectResponse editQualityProject(EditQualityProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.editQualityProjectWithOptions(request, runtime);
    }

    /**
     * @param request EditQualityRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EditQualityRuleResponse
     */
    public EditQualityRuleResponse editQualityRuleWithOptions(EditQualityRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWords)) {
            body.put("KeyWords", request.keyWords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchType)) {
            body.put("MatchType", request.matchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualityRuleId)) {
            body.put("QualityRuleId", request.qualityRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleTag)) {
            body.put("RuleTag", request.ruleTag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EditQualityRule"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EditQualityRuleResponse());
    }

    /**
     * @param request EditQualityRuleRequest
     * @return EditQualityRuleResponse
     */
    public EditQualityRuleResponse editQualityRule(EditQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.editQualityRuleWithOptions(request, runtime);
    }

    /**
     * @param request EditQualityRuleTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EditQualityRuleTagResponse
     */
    public EditQualityRuleTagResponse editQualityRuleTagWithOptions(EditQualityRuleTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analysisTypes)) {
            query.put("AnalysisTypes", request.analysisTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EditQualityRuleTag"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EditQualityRuleTagResponse());
    }

    /**
     * @param request EditQualityRuleTagRequest
     * @return EditQualityRuleTagResponse
     */
    public EditQualityRuleTagResponse editQualityRuleTag(EditQualityRuleTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.editQualityRuleTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>热线号码加密</p>
     * 
     * @param request EncryptPhoneNumRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EncryptPhoneNumResponse
     */
    public EncryptPhoneNumResponse encryptPhoneNumWithOptions(EncryptPhoneNumRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EncryptPhoneNum"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EncryptPhoneNumResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>热线号码加密</p>
     * 
     * @param request EncryptPhoneNumRequest
     * @return EncryptPhoneNumResponse
     */
    public EncryptPhoneNumResponse encryptPhoneNum(EncryptPhoneNumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.encryptPhoneNumWithOptions(request, runtime);
    }

    /**
     * @param request FetchCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FetchCallResponse
     */
    public FetchCallResponse fetchCallWithOptions(FetchCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            body.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            body.put("ConnectionId", request.connectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.holdConnectionId)) {
            body.put("HoldConnectionId", request.holdConnectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FetchCall"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FetchCallResponse());
    }

    /**
     * @param request FetchCallRequest
     * @return FetchCallResponse
     */
    public FetchCallResponse fetchCall(FetchCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.fetchCallWithOptions(request, runtime);
    }

    /**
     * @param request FinishHotlineServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FinishHotlineServiceResponse
     */
    public FinishHotlineServiceResponse finishHotlineServiceWithOptions(FinishHotlineServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FinishHotlineService"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FinishHotlineServiceResponse());
    }

    /**
     * @param request FinishHotlineServiceRequest
     * @return FinishHotlineServiceResponse
     */
    public FinishHotlineServiceResponse finishHotlineService(FinishHotlineServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.finishHotlineServiceWithOptions(request, runtime);
    }

    /**
     * @param request GenerateWebSocketSignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateWebSocketSignResponse
     */
    public GenerateWebSocketSignResponse generateWebSocketSignWithOptions(GenerateWebSocketSignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateWebSocketSign"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateWebSocketSignResponse());
    }

    /**
     * @param request GenerateWebSocketSignRequest
     * @return GenerateWebSocketSignResponse
     */
    public GenerateWebSocketSignResponse generateWebSocketSign(GenerateWebSocketSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateWebSocketSignWithOptions(request, runtime);
    }

    /**
     * @param request GetAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentResponse
     */
    public GetAgentResponse getAgentWithOptions(GetAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgent"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentResponse());
    }

    /**
     * @param request GetAgentRequest
     * @return GetAgentResponse
     */
    public GetAgentResponse getAgent(GetAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>坐席纬度基础状态量</p>
     * 
     * @param tmpReq GetAgentBasisStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentBasisStatusResponse
     */
    public GetAgentBasisStatusResponse getAgentBasisStatusWithOptions(GetAgentBasisStatusRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetAgentBasisStatusShrinkRequest request = new GetAgentBasisStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.agentIds)) {
            request.agentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.agentIds, "AgentIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentBasisStatus"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentBasisStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>坐席纬度基础状态量</p>
     * 
     * @param request GetAgentBasisStatusRequest
     * @return GetAgentBasisStatusResponse
     */
    public GetAgentBasisStatusResponse getAgentBasisStatus(GetAgentBasisStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgentBasisStatusWithOptions(request, runtime);
    }

    /**
     * @param request GetAgentByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentByIdResponse
     */
    public GetAgentByIdResponse getAgentByIdWithOptions(GetAgentByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentById"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentByIdResponse());
    }

    /**
     * @param request GetAgentByIdRequest
     * @return GetAgentByIdResponse
     */
    public GetAgentByIdResponse getAgentById(GetAgentByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgentByIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>热线坐席纬度详情汇总</p>
     * 
     * @param tmpReq GetAgentDetailReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentDetailReportResponse
     */
    public GetAgentDetailReportResponse getAgentDetailReportWithOptions(GetAgentDetailReportRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetAgentDetailReportShrinkRequest request = new GetAgentDetailReportShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.agentIds)) {
            request.agentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.agentIds, "AgentIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentDetailReport"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentDetailReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>热线坐席纬度详情汇总</p>
     * 
     * @param request GetAgentDetailReportRequest
     * @return GetAgentDetailReportResponse
     */
    public GetAgentDetailReportResponse getAgentDetailReport(GetAgentDetailReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgentDetailReportWithOptions(request, runtime);
    }

    /**
     * @param request GetAgentIndexRealTimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentIndexRealTimeResponse
     */
    public GetAgentIndexRealTimeResponse getAgentIndexRealTimeWithOptions(GetAgentIndexRealTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depIds)) {
            query.put("DepIds", request.depIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupIds)) {
            query.put("GroupIds", request.groupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentIndexRealTime"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentIndexRealTimeResponse());
    }

    /**
     * @param request GetAgentIndexRealTimeRequest
     * @return GetAgentIndexRealTimeResponse
     */
    public GetAgentIndexRealTimeResponse getAgentIndexRealTime(GetAgentIndexRealTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgentIndexRealTimeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>坐席服务状态量</p>
     * 
     * @param tmpReq GetAgentServiceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentServiceStatusResponse
     */
    public GetAgentServiceStatusResponse getAgentServiceStatusWithOptions(GetAgentServiceStatusRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetAgentServiceStatusShrinkRequest request = new GetAgentServiceStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.agentIds)) {
            request.agentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.agentIds, "AgentIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentServiceStatus"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentServiceStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>坐席服务状态量</p>
     * 
     * @param request GetAgentServiceStatusRequest
     * @return GetAgentServiceStatusResponse
     */
    public GetAgentServiceStatusResponse getAgentServiceStatus(GetAgentServiceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgentServiceStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>坐席纬度统计量</p>
     * 
     * @param tmpReq GetAgentStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentStatisticsResponse
     */
    public GetAgentStatisticsResponse getAgentStatisticsWithOptions(GetAgentStatisticsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetAgentStatisticsShrinkRequest request = new GetAgentStatisticsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.agentIds)) {
            request.agentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.agentIds, "AgentIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentStatistics"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>坐席纬度统计量</p>
     * 
     * @param request GetAgentStatisticsRequest
     * @return GetAgentStatisticsResponse
     */
    public GetAgentStatisticsResponse getAgentStatistics(GetAgentStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgentStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取智能外呼任务业务自定义信息</p>
     * 
     * @param request GetAiOutboundTaskBizDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAiOutboundTaskBizDataResponse
     */
    public GetAiOutboundTaskBizDataResponse getAiOutboundTaskBizDataWithOptions(GetAiOutboundTaskBizDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAiOutboundTaskBizData"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAiOutboundTaskBizDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取智能外呼任务业务自定义信息</p>
     * 
     * @param request GetAiOutboundTaskBizDataRequest
     * @return GetAiOutboundTaskBizDataResponse
     */
    public GetAiOutboundTaskBizDataResponse getAiOutboundTaskBizData(GetAiOutboundTaskBizDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAiOutboundTaskBizDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>智能外呼任务配置详情查询</p>
     * 
     * @param request GetAiOutboundTaskDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAiOutboundTaskDetailResponse
     */
    public GetAiOutboundTaskDetailResponse getAiOutboundTaskDetailWithOptions(GetAiOutboundTaskDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAiOutboundTaskDetail"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAiOutboundTaskDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>智能外呼任务配置详情查询</p>
     * 
     * @param request GetAiOutboundTaskDetailRequest
     * @return GetAiOutboundTaskDetailResponse
     */
    public GetAiOutboundTaskDetailResponse getAiOutboundTaskDetail(GetAiOutboundTaskDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAiOutboundTaskDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>智能外呼任务执行详情</p>
     * 
     * @param request GetAiOutboundTaskExecDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAiOutboundTaskExecDetailResponse
     */
    public GetAiOutboundTaskExecDetailResponse getAiOutboundTaskExecDetailWithOptions(GetAiOutboundTaskExecDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAiOutboundTaskExecDetail"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAiOutboundTaskExecDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>智能外呼任务执行详情</p>
     * 
     * @param request GetAiOutboundTaskExecDetailRequest
     * @return GetAiOutboundTaskExecDetailResponse
     */
    public GetAiOutboundTaskExecDetailResponse getAiOutboundTaskExecDetail(GetAiOutboundTaskExecDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAiOutboundTaskExecDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>智能外呼任务列表查询</p>
     * 
     * @param request GetAiOutboundTaskListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAiOutboundTaskListResponse
     */
    public GetAiOutboundTaskListResponse getAiOutboundTaskListWithOptions(GetAiOutboundTaskListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAiOutboundTaskList"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAiOutboundTaskListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>智能外呼任务列表查询</p>
     * 
     * @param request GetAiOutboundTaskListRequest
     * @return GetAiOutboundTaskListResponse
     */
    public GetAiOutboundTaskListResponse getAiOutboundTaskList(GetAiOutboundTaskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAiOutboundTaskListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>智能外呼任务执行进度</p>
     * 
     * @param request GetAiOutboundTaskProgressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAiOutboundTaskProgressResponse
     */
    public GetAiOutboundTaskProgressResponse getAiOutboundTaskProgressWithOptions(GetAiOutboundTaskProgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAiOutboundTaskProgress"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAiOutboundTaskProgressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>智能外呼任务执行进度</p>
     * 
     * @param request GetAiOutboundTaskProgressRequest
     * @return GetAiOutboundTaskProgressResponse
     */
    public GetAiOutboundTaskProgressResponse getAiOutboundTaskProgress(GetAiOutboundTaskProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAiOutboundTaskProgressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>getAllDepartment</p>
     * 
     * @param request GetAllDepartmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAllDepartmentResponse
     */
    public GetAllDepartmentResponse getAllDepartmentWithOptions(GetAllDepartmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAllDepartment"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAllDepartmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>getAllDepartment</p>
     * 
     * @param request GetAllDepartmentRequest
     * @return GetAllDepartmentResponse
     */
    public GetAllDepartmentResponse getAllDepartment(GetAllDepartmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAllDepartmentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询对话内容</p>
     * 
     * @param request GetCallDialogContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCallDialogContentResponse
     */
    public GetCallDialogContentResponse getCallDialogContentWithOptions(GetCallDialogContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callDate)) {
            query.put("CallDate", request.callDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCallDialogContent"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCallDialogContentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询对话内容</p>
     * 
     * @param request GetCallDialogContentRequest
     * @return GetCallDialogContentResponse
     */
    public GetCallDialogContentResponse getCallDialogContent(GetCallDialogContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCallDialogContentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取通话录音文件</p>
     * 
     * @param request GetCallSoundRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCallSoundRecordResponse
     */
    public GetCallSoundRecordResponse getCallSoundRecordWithOptions(GetCallSoundRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTime)) {
            query.put("CreateTime", request.createTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCallSoundRecord"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCallSoundRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取通话录音文件</p>
     * 
     * @param request GetCallSoundRecordRequest
     * @return GetCallSoundRecordResponse
     */
    public GetCallSoundRecordResponse getCallSoundRecord(GetCallSoundRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCallSoundRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取热线配置号码列表</p>
     * 
     * @param request GetConfigNumListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConfigNumListResponse
     */
    public GetConfigNumListResponse getConfigNumListWithOptions(GetConfigNumListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConfigNumList"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConfigNumListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取热线配置号码列表</p>
     * 
     * @param request GetConfigNumListRequest
     * @return GetConfigNumListResponse
     */
    public GetConfigNumListResponse getConfigNumList(GetConfigNumListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConfigNumListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取会员信息</p>
     * 
     * @param request GetCustomerInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCustomerInfoResponse
     */
    public GetCustomerInfoResponse getCustomerInfoWithOptions(GetCustomerInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomerInfo"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomerInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取会员信息</p>
     * 
     * @param request GetCustomerInfoRequest
     * @return GetCustomerInfoResponse
     */
    public GetCustomerInfoResponse getCustomerInfo(GetCustomerInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomerInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取技能组分组</p>
     * 
     * @param request GetDepGroupTreeDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDepGroupTreeDataResponse
     */
    public GetDepGroupTreeDataResponse getDepGroupTreeDataWithOptions(GetDepGroupTreeDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDepGroupTreeData"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDepGroupTreeDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取技能组分组</p>
     * 
     * @param request GetDepGroupTreeDataRequest
     * @return GetDepGroupTreeDataResponse
     */
    public GetDepGroupTreeDataResponse getDepGroupTreeData(GetDepGroupTreeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDepGroupTreeDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>部门纬度坐席状态量</p>
     * 
     * @param tmpReq GetDepartmentalLatitudeAgentStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDepartmentalLatitudeAgentStatusResponse
     */
    public GetDepartmentalLatitudeAgentStatusResponse getDepartmentalLatitudeAgentStatusWithOptions(GetDepartmentalLatitudeAgentStatusRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetDepartmentalLatitudeAgentStatusShrinkRequest request = new GetDepartmentalLatitudeAgentStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDepartmentalLatitudeAgentStatus"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDepartmentalLatitudeAgentStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>部门纬度坐席状态量</p>
     * 
     * @param request GetDepartmentalLatitudeAgentStatusRequest
     * @return GetDepartmentalLatitudeAgentStatusResponse
     */
    public GetDepartmentalLatitudeAgentStatusResponse getDepartmentalLatitudeAgentStatus(GetDepartmentalLatitudeAgentStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDepartmentalLatitudeAgentStatusWithOptions(request, runtime);
    }

    /**
     * @param request GetHotlineAgentDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotlineAgentDetailResponse
     */
    public GetHotlineAgentDetailResponse getHotlineAgentDetailWithOptions(GetHotlineAgentDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotlineAgentDetail"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotlineAgentDetailResponse());
    }

    /**
     * @param request GetHotlineAgentDetailRequest
     * @return GetHotlineAgentDetailResponse
     */
    public GetHotlineAgentDetailResponse getHotlineAgentDetail(GetHotlineAgentDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHotlineAgentDetailWithOptions(request, runtime);
    }

    /**
     * @param request GetHotlineAgentDetailReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotlineAgentDetailReportResponse
     */
    public GetHotlineAgentDetailReportResponse getHotlineAgentDetailReportWithOptions(GetHotlineAgentDetailReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depIds)) {
            query.put("DepIds", request.depIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupIds)) {
            query.put("GroupIds", request.groupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotlineAgentDetailReport"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotlineAgentDetailReportResponse());
    }

    /**
     * @param request GetHotlineAgentDetailReportRequest
     * @return GetHotlineAgentDetailReportResponse
     */
    public GetHotlineAgentDetailReportResponse getHotlineAgentDetailReport(GetHotlineAgentDetailReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHotlineAgentDetailReportWithOptions(request, runtime);
    }

    /**
     * @param request GetHotlineAgentStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotlineAgentStatusResponse
     */
    public GetHotlineAgentStatusResponse getHotlineAgentStatusWithOptions(GetHotlineAgentStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotlineAgentStatus"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotlineAgentStatusResponse());
    }

    /**
     * @param request GetHotlineAgentStatusRequest
     * @return GetHotlineAgentStatusResponse
     */
    public GetHotlineAgentStatusResponse getHotlineAgentStatus(GetHotlineAgentStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHotlineAgentStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询话务动作结果数据</p>
     * 
     * @param request GetHotlineCallActionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotlineCallActionResponse
     */
    public GetHotlineCallActionResponse getHotlineCallActionWithOptions(GetHotlineCallActionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acc)) {
            body.put("Acc", request.acc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.act)) {
            body.put("Act", request.act);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.biz)) {
            body.put("Biz", request.biz);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromSource)) {
            body.put("FromSource", request.fromSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotlineCallAction"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotlineCallActionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询话务动作结果数据</p>
     * 
     * @param request GetHotlineCallActionRequest
     * @return GetHotlineCallActionResponse
     */
    public GetHotlineCallActionResponse getHotlineCallAction(GetHotlineCallActionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHotlineCallActionWithOptions(request, runtime);
    }

    /**
     * @param request GetHotlineGroupDetailReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotlineGroupDetailReportResponse
     */
    public GetHotlineGroupDetailReportResponse getHotlineGroupDetailReportWithOptions(GetHotlineGroupDetailReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depIds)) {
            query.put("DepIds", request.depIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupIds)) {
            query.put("GroupIds", request.groupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotlineGroupDetailReport"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotlineGroupDetailReportResponse());
    }

    /**
     * @param request GetHotlineGroupDetailReportRequest
     * @return GetHotlineGroupDetailReportResponse
     */
    public GetHotlineGroupDetailReportResponse getHotlineGroupDetailReport(GetHotlineGroupDetailReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHotlineGroupDetailReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取热线聊天记录</p>
     * 
     * @param request GetHotlineMessageLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotlineMessageLogResponse
     */
    public GetHotlineMessageLogResponse getHotlineMessageLogWithOptions(GetHotlineMessageLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotlineMessageLog"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotlineMessageLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取热线聊天记录</p>
     * 
     * @param request GetHotlineMessageLogRequest
     * @return GetHotlineMessageLogResponse
     */
    public GetHotlineMessageLogResponse getHotlineMessageLog(GetHotlineMessageLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHotlineMessageLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取热线当前信息</p>
     * 
     * @param request GetHotlineRuntimeInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotlineRuntimeInfoResponse
     */
    public GetHotlineRuntimeInfoResponse getHotlineRuntimeInfoWithOptions(GetHotlineRuntimeInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotlineRuntimeInfo"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotlineRuntimeInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取热线当前信息</p>
     * 
     * @param request GetHotlineRuntimeInfoRequest
     * @return GetHotlineRuntimeInfoResponse
     */
    public GetHotlineRuntimeInfoResponse getHotlineRuntimeInfo(GetHotlineRuntimeInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHotlineRuntimeInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>服务统计量数据</p>
     * 
     * @param tmpReq GetHotlineServiceStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotlineServiceStatisticsResponse
     */
    public GetHotlineServiceStatisticsResponse getHotlineServiceStatisticsWithOptions(GetHotlineServiceStatisticsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetHotlineServiceStatisticsShrinkRequest request = new GetHotlineServiceStatisticsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.agentIds)) {
            request.agentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.agentIds, "AgentIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupIds)) {
            request.groupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupIds, "GroupIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotlineServiceStatistics"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotlineServiceStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>服务统计量数据</p>
     * 
     * @param request GetHotlineServiceStatisticsRequest
     * @return GetHotlineServiceStatisticsResponse
     */
    public GetHotlineServiceStatisticsResponse getHotlineServiceStatistics(GetHotlineServiceStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHotlineServiceStatisticsWithOptions(request, runtime);
    }

    /**
     * @param request GetHotlineWaitingNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotlineWaitingNumberResponse
     */
    public GetHotlineWaitingNumberResponse getHotlineWaitingNumberWithOptions(GetHotlineWaitingNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotlineWaitingNumber"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotlineWaitingNumberResponse());
    }

    /**
     * @param request GetHotlineWaitingNumberRequest
     * @return GetHotlineWaitingNumberResponse
     */
    public GetHotlineWaitingNumberResponse getHotlineWaitingNumber(GetHotlineWaitingNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHotlineWaitingNumberWithOptions(request, runtime);
    }

    /**
     * @param request GetIndexCurrentValueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIndexCurrentValueResponse
     */
    public GetIndexCurrentValueResponse getIndexCurrentValueWithOptions(GetIndexCurrentValueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.depIds)) {
            query.put("DepIds", request.depIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupIds)) {
            query.put("GroupIds", request.groupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIndexCurrentValue"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIndexCurrentValueResponse());
    }

    /**
     * @param request GetIndexCurrentValueRequest
     * @return GetIndexCurrentValueResponse
     */
    public GetIndexCurrentValueResponse getIndexCurrentValue(GetIndexCurrentValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIndexCurrentValueWithOptions(request, runtime);
    }

    /**
     * @param request GetInstanceListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceListResponse
     */
    public GetInstanceListResponse getInstanceListWithOptions(GetInstanceListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
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
            new TeaPair("action", "GetInstanceList"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceListResponse());
    }

    /**
     * @param request GetInstanceListRequest
     * @return GetInstanceListResponse
     */
    public GetInstanceListResponse getInstanceList(GetInstanceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>热线检测获取mcu ip地址</p>
     * 
     * @param request GetMcuLvsIpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMcuLvsIpResponse
     */
    public GetMcuLvsIpResponse getMcuLvsIpWithOptions(GetMcuLvsIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMcuLvsIp"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMcuLvsIpResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>热线检测获取mcu ip地址</p>
     * 
     * @param request GetMcuLvsIpRequest
     * @return GetMcuLvsIpResponse
     */
    public GetMcuLvsIpResponse getMcuLvsIp(GetMcuLvsIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMcuLvsIpWithOptions(request, runtime);
    }

    /**
     * @param request GetNumLocationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNumLocationResponse
     */
    public GetNumLocationResponse getNumLocationWithOptions(GetNumLocationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNumLocation"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNumLocationResponse());
    }

    /**
     * @param request GetNumLocationRequest
     * @return GetNumLocationResponse
     */
    public GetNumLocationResponse getNumLocation(GetNumLocationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNumLocationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>在线坐席信息</p>
     * 
     * @param tmpReq GetOnlineSeatInformationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOnlineSeatInformationResponse
     */
    public GetOnlineSeatInformationResponse getOnlineSeatInformationWithOptions(GetOnlineSeatInformationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetOnlineSeatInformationShrinkRequest request = new GetOnlineSeatInformationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.agentIds)) {
            request.agentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.agentIds, "AgentIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOnlineSeatInformation"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOnlineSeatInformationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>在线坐席信息</p>
     * 
     * @param request GetOnlineSeatInformationRequest
     * @return GetOnlineSeatInformationResponse
     */
    public GetOnlineSeatInformationResponse getOnlineSeatInformation(GetOnlineSeatInformationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOnlineSeatInformationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>在线服务总量</p>
     * 
     * @param tmpReq GetOnlineServiceVolumeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOnlineServiceVolumeResponse
     */
    public GetOnlineServiceVolumeResponse getOnlineServiceVolumeWithOptions(GetOnlineServiceVolumeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetOnlineServiceVolumeShrinkRequest request = new GetOnlineServiceVolumeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.agentIds)) {
            request.agentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.agentIds, "AgentIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupIds)) {
            request.groupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupIds, "GroupIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOnlineServiceVolume"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOnlineServiceVolumeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>在线服务总量</p>
     * 
     * @param request GetOnlineServiceVolumeRequest
     * @return GetOnlineServiceVolumeResponse
     */
    public GetOnlineServiceVolumeResponse getOnlineServiceVolume(GetOnlineServiceVolumeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOnlineServiceVolumeWithOptions(request, runtime);
    }

    /**
     * @param request GetOutbounNumListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOutbounNumListResponse
     */
    public GetOutbounNumListResponse getOutbounNumListWithOptions(GetOutbounNumListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOutbounNumList"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOutbounNumListResponse());
    }

    /**
     * @param request GetOutbounNumListRequest
     * @return GetOutbounNumListResponse
     */
    public GetOutbounNumListResponse getOutbounNumList(GetOutbounNumListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOutbounNumListWithOptions(request, runtime);
    }

    /**
     * @param request GetQualityProjectDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQualityProjectDetailResponse
     */
    public GetQualityProjectDetailResponse getQualityProjectDetailWithOptions(GetQualityProjectDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQualityProjectDetail"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualityProjectDetailResponse());
    }

    /**
     * @param request GetQualityProjectDetailRequest
     * @return GetQualityProjectDetailResponse
     */
    public GetQualityProjectDetailResponse getQualityProjectDetail(GetQualityProjectDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityProjectDetailWithOptions(request, runtime);
    }

    /**
     * @param request GetQualityProjectListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQualityProjectListResponse
     */
    public GetQualityProjectListResponse getQualityProjectListWithOptions(GetQualityProjectListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkFreqType)) {
            query.put("checkFreqType", request.checkFreqType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQualityProjectList"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualityProjectListResponse());
    }

    /**
     * @param request GetQualityProjectListRequest
     * @return GetQualityProjectListResponse
     */
    public GetQualityProjectListResponse getQualityProjectList(GetQualityProjectListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityProjectListWithOptions(request, runtime);
    }

    /**
     * @param request GetQualityProjectLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQualityProjectLogResponse
     */
    public GetQualityProjectLogResponse getQualityProjectLogWithOptions(GetQualityProjectLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQualityProjectLog"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualityProjectLogResponse());
    }

    /**
     * @param request GetQualityProjectLogRequest
     * @return GetQualityProjectLogResponse
     */
    public GetQualityProjectLogResponse getQualityProjectLog(GetQualityProjectLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityProjectLogWithOptions(request, runtime);
    }

    /**
     * @param request GetQualityResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQualityResultResponse
     */
    public GetQualityResultResponse getQualityResultWithOptions(GetQualityResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupIds)) {
            query.put("GroupIds", request.groupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hitStatus)) {
            query.put("HitStatus", request.hitStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIds)) {
            query.put("ProjectIds", request.projectIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualityRuleIds)) {
            query.put("QualityRuleIds", request.qualityRuleIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.touchEndTime)) {
            query.put("TouchEndTime", request.touchEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.touchStartTime)) {
            query.put("TouchStartTime", request.touchStartTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQualityResult"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualityResultResponse());
    }

    /**
     * @param request GetQualityResultRequest
     * @return GetQualityResultResponse
     */
    public GetQualityResultResponse getQualityResult(GetQualityResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityResultWithOptions(request, runtime);
    }

    /**
     * @param request GetQualityRuleDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQualityRuleDetailResponse
     */
    public GetQualityRuleDetailResponse getQualityRuleDetailWithOptions(GetQualityRuleDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualityRuleId)) {
            query.put("QualityRuleId", request.qualityRuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQualityRuleDetail"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualityRuleDetailResponse());
    }

    /**
     * @param request GetQualityRuleDetailRequest
     * @return GetQualityRuleDetailResponse
     */
    public GetQualityRuleDetailResponse getQualityRuleDetail(GetQualityRuleDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityRuleDetailWithOptions(request, runtime);
    }

    /**
     * @param request GetQualityRuleListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQualityRuleListResponse
     */
    public GetQualityRuleListResponse getQualityRuleListWithOptions(GetQualityRuleListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQualityRuleList"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualityRuleListResponse());
    }

    /**
     * @param request GetQualityRuleListRequest
     * @return GetQualityRuleListResponse
     */
    public GetQualityRuleListResponse getQualityRuleList(GetQualityRuleListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityRuleListWithOptions(request, runtime);
    }

    /**
     * @param request GetQualityRuleTagListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQualityRuleTagListResponse
     */
    public GetQualityRuleTagListResponse getQualityRuleTagListWithOptions(GetQualityRuleTagListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQualityRuleTagList"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualityRuleTagListResponse());
    }

    /**
     * @param request GetQualityRuleTagListRequest
     * @return GetQualityRuleTagListResponse
     */
    public GetQualityRuleTagListResponse getQualityRuleTagList(GetQualityRuleTagListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityRuleTagListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>技能组纬度队列信息</p>
     * 
     * @param tmpReq GetQueueInformationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQueueInformationResponse
     */
    public GetQueueInformationResponse getQueueInformationWithOptions(GetQueueInformationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetQueueInformationShrinkRequest request = new GetQueueInformationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupIds)) {
            request.groupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupIds, "GroupIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQueueInformation"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQueueInformationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>技能组纬度队列信息</p>
     * 
     * @param request GetQueueInformationRequest
     * @return GetQueueInformationResponse
     */
    public GetQueueInformationResponse getQueueInformation(GetQueueInformationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueueInformationWithOptions(request, runtime);
    }

    /**
     * @param request GetRecordDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRecordDataResponse
     */
    public GetRecordDataResponse getRecordDataWithOptions(GetRecordDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acid)) {
            query.put("Acid", request.acid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRecordData"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRecordDataResponse());
    }

    /**
     * @param request GetRecordDataRequest
     * @return GetRecordDataResponse
     */
    public GetRecordDataResponse getRecordData(GetRecordDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRecordDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取录音链接</p>
     * 
     * @param request GetRecordUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRecordUrlResponse
     */
    public GetRecordUrlResponse getRecordUrlWithOptions(GetRecordUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRecordUrl"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRecordUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取录音链接</p>
     * 
     * @param request GetRecordUrlRequest
     * @return GetRecordUrlResponse
     */
    public GetRecordUrlResponse getRecordUrl(GetRecordUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRecordUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取RtcToken</p>
     * 
     * @param request GetRtcTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRtcTokenResponse
     */
    public GetRtcTokenResponse getRtcTokenWithOptions(GetRtcTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRtcToken"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRtcTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取RtcToken</p>
     * 
     * @param request GetRtcTokenRequest
     * @return GetRtcTokenResponse
     */
    public GetRtcTokenResponse getRtcToken(GetRtcTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRtcTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>部门纬度坐席信息数据</p>
     * 
     * @param tmpReq GetSeatInformationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSeatInformationResponse
     */
    public GetSeatInformationResponse getSeatInformationWithOptions(GetSeatInformationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetSeatInformationShrinkRequest request = new GetSeatInformationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "depIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSeatInformation"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSeatInformationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>部门纬度坐席信息数据</p>
     * 
     * @param request GetSeatInformationRequest
     * @return GetSeatInformationResponse
     */
    public GetSeatInformationResponse getSeatInformation(GetSeatInformationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSeatInformationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>技能组坐席状态详情</p>
     * 
     * @param tmpReq GetSkillGroupAgentStatusDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSkillGroupAgentStatusDetailsResponse
     */
    public GetSkillGroupAgentStatusDetailsResponse getSkillGroupAgentStatusDetailsWithOptions(GetSkillGroupAgentStatusDetailsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetSkillGroupAgentStatusDetailsShrinkRequest request = new GetSkillGroupAgentStatusDetailsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupIds)) {
            request.groupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupIds, "GroupIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSkillGroupAgentStatusDetails"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSkillGroupAgentStatusDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>技能组坐席状态详情</p>
     * 
     * @param request GetSkillGroupAgentStatusDetailsRequest
     * @return GetSkillGroupAgentStatusDetailsResponse
     */
    public GetSkillGroupAgentStatusDetailsResponse getSkillGroupAgentStatusDetails(GetSkillGroupAgentStatusDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSkillGroupAgentStatusDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>技能组坐席汇总状态量</p>
     * 
     * @param tmpReq GetSkillGroupAndAgentStatusSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSkillGroupAndAgentStatusSummaryResponse
     */
    public GetSkillGroupAndAgentStatusSummaryResponse getSkillGroupAndAgentStatusSummaryWithOptions(GetSkillGroupAndAgentStatusSummaryRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetSkillGroupAndAgentStatusSummaryShrinkRequest request = new GetSkillGroupAndAgentStatusSummaryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupIds)) {
            request.groupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupIds, "GroupIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSkillGroupAndAgentStatusSummary"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSkillGroupAndAgentStatusSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>技能组坐席汇总状态量</p>
     * 
     * @param request GetSkillGroupAndAgentStatusSummaryRequest
     * @return GetSkillGroupAndAgentStatusSummaryResponse
     */
    public GetSkillGroupAndAgentStatusSummaryResponse getSkillGroupAndAgentStatusSummary(GetSkillGroupAndAgentStatusSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSkillGroupAndAgentStatusSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>技能组纬度状态量</p>
     * 
     * @param tmpReq GetSkillGroupLatitudeStateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSkillGroupLatitudeStateResponse
     */
    public GetSkillGroupLatitudeStateResponse getSkillGroupLatitudeStateWithOptions(GetSkillGroupLatitudeStateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetSkillGroupLatitudeStateShrinkRequest request = new GetSkillGroupLatitudeStateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupIds)) {
            request.groupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupIds, "GroupIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSkillGroupLatitudeState"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSkillGroupLatitudeStateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>技能组纬度状态量</p>
     * 
     * @param request GetSkillGroupLatitudeStateRequest
     * @return GetSkillGroupLatitudeStateResponse
     */
    public GetSkillGroupLatitudeStateResponse getSkillGroupLatitudeState(GetSkillGroupLatitudeStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSkillGroupLatitudeStateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>技能组纬度服务能力</p>
     * 
     * @param tmpReq GetSkillGroupServiceCapabilityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSkillGroupServiceCapabilityResponse
     */
    public GetSkillGroupServiceCapabilityResponse getSkillGroupServiceCapabilityWithOptions(GetSkillGroupServiceCapabilityRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetSkillGroupServiceCapabilityShrinkRequest request = new GetSkillGroupServiceCapabilityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupIds)) {
            request.groupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupIds, "GroupIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSkillGroupServiceCapability"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSkillGroupServiceCapabilityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>技能组纬度服务能力</p>
     * 
     * @param request GetSkillGroupServiceCapabilityRequest
     * @return GetSkillGroupServiceCapabilityResponse
     */
    public GetSkillGroupServiceCapabilityResponse getSkillGroupServiceCapability(GetSkillGroupServiceCapabilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSkillGroupServiceCapabilityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>技能组服务状态量</p>
     * 
     * @param tmpReq GetSkillGroupServiceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSkillGroupServiceStatusResponse
     */
    public GetSkillGroupServiceStatusResponse getSkillGroupServiceStatusWithOptions(GetSkillGroupServiceStatusRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetSkillGroupServiceStatusShrinkRequest request = new GetSkillGroupServiceStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.agentIds)) {
            request.agentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.agentIds, "AgentIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupIds)) {
            request.groupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupIds, "GroupIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSkillGroupServiceStatus"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSkillGroupServiceStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>技能组服务状态量</p>
     * 
     * @param request GetSkillGroupServiceStatusRequest
     * @return GetSkillGroupServiceStatusResponse
     */
    public GetSkillGroupServiceStatusResponse getSkillGroupServiceStatus(GetSkillGroupServiceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSkillGroupServiceStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>技能组状态总量</p>
     * 
     * @param tmpReq GetSkillGroupStatusTotalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSkillGroupStatusTotalResponse
     */
    public GetSkillGroupStatusTotalResponse getSkillGroupStatusTotalWithOptions(GetSkillGroupStatusTotalRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetSkillGroupStatusTotalShrinkRequest request = new GetSkillGroupStatusTotalShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.agentIds)) {
            request.agentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.agentIds, "AgentIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.depIds)) {
            request.depIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.depIds, "DepIds", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupIds)) {
            request.groupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupIds, "GroupIds", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSkillGroupStatusTotal"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSkillGroupStatusTotalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>技能组状态总量</p>
     * 
     * @param request GetSkillGroupStatusTotalRequest
     * @return GetSkillGroupStatusTotalResponse
     */
    public GetSkillGroupStatusTotalResponse getSkillGroupStatusTotal(GetSkillGroupStatusTotalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSkillGroupStatusTotalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>移动端呼叫挂断</p>
     * 
     * @param request HangUpDoubleCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return HangUpDoubleCallResponse
     */
    public HangUpDoubleCallResponse hangUpDoubleCallWithOptions(HangUpDoubleCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acid)) {
            query.put("Acid", request.acid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HangUpDoubleCall"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HangUpDoubleCallResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>移动端呼叫挂断</p>
     * 
     * @param request HangUpDoubleCallRequest
     * @return HangUpDoubleCallResponse
     */
    public HangUpDoubleCallResponse hangUpDoubleCall(HangUpDoubleCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.hangUpDoubleCallWithOptions(request, runtime);
    }

    /**
     * @param request HangupCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return HangupCallResponse
     */
    public HangupCallResponse hangupCallWithOptions(HangupCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            body.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            body.put("ConnectionId", request.connectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HangupCall"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HangupCallResponse());
    }

    /**
     * @param request HangupCallRequest
     * @return HangupCallResponse
     */
    public HangupCallResponse hangupCall(HangupCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.hangupCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通信智能引擎中主动挂断通话</p>
     * 
     * @param request HangupOperateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return HangupOperateResponse
     */
    public HangupOperateResponse hangupOperateWithOptions(HangupOperateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.immediateHangup)) {
            query.put("ImmediateHangup", request.immediateHangup);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HangupOperate"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HangupOperateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通信智能引擎中主动挂断通话</p>
     * 
     * @param request HangupOperateRequest
     * @return HangupOperateResponse
     */
    public HangupOperateResponse hangupOperate(HangupOperateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.hangupOperateWithOptions(request, runtime);
    }

    /**
     * @param request HangupThirdCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return HangupThirdCallResponse
     */
    public HangupThirdCallResponse hangupThirdCallWithOptions(HangupThirdCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            body.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            body.put("ConnectionId", request.connectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HangupThirdCall"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HangupThirdCallResponse());
    }

    /**
     * @param request HangupThirdCallRequest
     * @return HangupThirdCallResponse
     */
    public HangupThirdCallResponse hangupThirdCall(HangupThirdCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.hangupThirdCallWithOptions(request, runtime);
    }

    /**
     * @param request HoldCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return HoldCallResponse
     */
    public HoldCallResponse holdCallWithOptions(HoldCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            body.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            body.put("ConnectionId", request.connectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HoldCall"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HoldCallResponse());
    }

    /**
     * @param request HoldCallRequest
     * @return HoldCallResponse
     */
    public HoldCallResponse holdCall(HoldCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.holdCallWithOptions(request, runtime);
    }

    /**
     * @param request HotlineSessionQueryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return HotlineSessionQueryResponse
     */
    public HotlineSessionQueryResponse hotlineSessionQueryWithOptions(HotlineSessionQueryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acid)) {
            query.put("Acid", request.acid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.acidList)) {
            query.put("AcidList", request.acidList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callResult)) {
            query.put("CallResult", request.callResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callResultList)) {
            query.put("CallResultList", request.callResultList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callType)) {
            query.put("CallType", request.callType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callTypeList)) {
            query.put("CallTypeList", request.callTypeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNumberList)) {
            query.put("CalledNumberList", request.calledNumberList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callingNumber)) {
            query.put("CallingNumber", request.callingNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callingNumberList)) {
            query.put("CallingNumberList", request.callingNumberList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupIdList)) {
            query.put("GroupIdList", request.groupIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberIdList)) {
            query.put("MemberIdList", request.memberIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberName)) {
            query.put("MemberName", request.memberName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryEndTime)) {
            query.put("QueryEndTime", request.queryEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryStartTime)) {
            query.put("QueryStartTime", request.queryStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicerId)) {
            query.put("ServicerId", request.servicerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicerIdList)) {
            query.put("ServicerIdList", request.servicerIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicerName)) {
            query.put("ServicerName", request.servicerName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotlineSessionQuery"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotlineSessionQueryResponse());
    }

    /**
     * @param request HotlineSessionQueryRequest
     * @return HotlineSessionQueryResponse
     */
    public HotlineSessionQueryResponse hotlineSessionQuery(HotlineSessionQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.hotlineSessionQueryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>语音智能体外呼任务导入单条数据</p>
     * 
     * @param tmpReq ImportOneTaskPhoneNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportOneTaskPhoneNumberResponse
     */
    public ImportOneTaskPhoneNumberResponse importOneTaskPhoneNumberWithOptions(ImportOneTaskPhoneNumberRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ImportOneTaskPhoneNumberShrinkRequest request = new ImportOneTaskPhoneNumberShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.variables)) {
            request.variablesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.variables, "Variables", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variablesShrink)) {
            query.put("Variables", request.variablesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportOneTaskPhoneNumber"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportOneTaskPhoneNumberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>语音智能体外呼任务导入单条数据</p>
     * 
     * @param request ImportOneTaskPhoneNumberRequest
     * @return ImportOneTaskPhoneNumberResponse
     */
    public ImportOneTaskPhoneNumberResponse importOneTaskPhoneNumber(ImportOneTaskPhoneNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importOneTaskPhoneNumberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导入任务号码数据</p>
     * 
     * @param tmpReq ImportTaskNumberDatasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportTaskNumberDatasResponse
     */
    public ImportTaskNumberDatasResponse importTaskNumberDatasWithOptions(ImportTaskNumberDatasRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ImportTaskNumberDatasShrinkRequest request = new ImportTaskNumberDatasShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.phoneNumberList)) {
            request.phoneNumberListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.phoneNumberList, "PhoneNumberList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossFileName)) {
            query.put("OssFileName", request.ossFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumberListShrink)) {
            body.put("PhoneNumberList", request.phoneNumberListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportTaskNumberDatas"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportTaskNumberDatasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>导入任务号码数据</p>
     * 
     * @param request ImportTaskNumberDatasRequest
     * @return ImportTaskNumberDatasResponse
     */
    public ImportTaskNumberDatasResponse importTaskNumberDatas(ImportTaskNumberDatasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importTaskNumberDatasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>智能外呼任务导入号码</p>
     * 
     * @param tmpReq InsertAiOutboundPhoneNumsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InsertAiOutboundPhoneNumsResponse
     */
    public InsertAiOutboundPhoneNumsResponse insertAiOutboundPhoneNumsWithOptions(InsertAiOutboundPhoneNumsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InsertAiOutboundPhoneNumsShrinkRequest request = new InsertAiOutboundPhoneNumsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.details)) {
            request.detailsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.details, "Details", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchVersion)) {
            query.put("BatchVersion", request.batchVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detailsShrink)) {
            query.put("Details", request.detailsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsertAiOutboundPhoneNums"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsertAiOutboundPhoneNumsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>智能外呼任务导入号码</p>
     * 
     * @param request InsertAiOutboundPhoneNumsRequest
     * @return InsertAiOutboundPhoneNumsResponse
     */
    public InsertAiOutboundPhoneNumsResponse insertAiOutboundPhoneNums(InsertAiOutboundPhoneNumsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.insertAiOutboundPhoneNumsWithOptions(request, runtime);
    }

    /**
     * @param request InsertTaskDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InsertTaskDetailResponse
     */
    public InsertTaskDetailResponse insertTaskDetailWithOptions(InsertTaskDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callInfos)) {
            query.put("CallInfos", request.callInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outboundTaskId)) {
            query.put("OutboundTaskId", request.outboundTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsertTaskDetail"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsertTaskDetailResponse());
    }

    /**
     * @param request InsertTaskDetailRequest
     * @return InsertTaskDetailResponse
     */
    public InsertTaskDetailResponse insertTaskDetail(InsertTaskDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.insertTaskDetailWithOptions(request, runtime);
    }

    /**
     * @param request JoinThirdCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return JoinThirdCallResponse
     */
    public JoinThirdCallResponse joinThirdCallWithOptions(JoinThirdCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            body.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            body.put("ConnectionId", request.connectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.holdConnectionId)) {
            body.put("HoldConnectionId", request.holdConnectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "JoinThirdCall"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new JoinThirdCallResponse());
    }

    /**
     * @param request JoinThirdCallRequest
     * @return JoinThirdCallResponse
     */
    public JoinThirdCallResponse joinThirdCall(JoinThirdCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.joinThirdCallWithOptions(request, runtime);
    }

    /**
     * @param request ListAgentBySkillGroupIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentBySkillGroupIdResponse
     */
    public ListAgentBySkillGroupIdResponse listAgentBySkillGroupIdWithOptions(ListAgentBySkillGroupIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAgentBySkillGroupId"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentBySkillGroupIdResponse());
    }

    /**
     * @param request ListAgentBySkillGroupIdRequest
     * @return ListAgentBySkillGroupIdResponse
     */
    public ListAgentBySkillGroupIdResponse listAgentBySkillGroupId(ListAgentBySkillGroupIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAgentBySkillGroupIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询所有机器人列表</p>
     * 
     * @param request ListAiccsRobotRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAiccsRobotResponse
     */
    public ListAiccsRobotResponse listAiccsRobotWithOptions(ListAiccsRobotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotName)) {
            query.put("RobotName", request.robotName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAiccsRobot"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAiccsRobotResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询所有机器人列表</p>
     * 
     * @param request ListAiccsRobotRequest
     * @return ListAiccsRobotResponse
     */
    public ListAiccsRobotResponse listAiccsRobot(ListAiccsRobotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAiccsRobotWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取tts音色列表</p>
     * 
     * @param request ListAvailableTtsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAvailableTtsResponse
     */
    public ListAvailableTtsResponse listAvailableTtsWithOptions(ListAvailableTtsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsVoiceCode)) {
            query.put("TtsVoiceCode", request.ttsVoiceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAvailableTts"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAvailableTtsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取tts音色列表</p>
     * 
     * @param request ListAvailableTtsRequest
     * @return ListAvailableTtsResponse
     */
    public ListAvailableTtsResponse listAvailableTts(ListAvailableTtsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAvailableTtsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据时间段查询在线会话详情，包含会话内容，时间段范围最长不超过1天</p>
     * 
     * @param request ListChatRecordDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListChatRecordDetailResponse
     */
    public ListChatRecordDetailResponse listChatRecordDetailWithOptions(ListChatRecordDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChatRecordDetail"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChatRecordDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据时间段查询在线会话详情，包含会话内容，时间段范围最长不超过1天</p>
     * 
     * @param request ListChatRecordDetailRequest
     * @return ListChatRecordDetailResponse
     */
    public ListChatRecordDetailResponse listChatRecordDetail(ListChatRecordDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listChatRecordDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看对话记录</p>
     * 
     * @param request ListDialogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDialogResponse
     */
    public ListDialogResponse listDialogWithOptions(ListDialogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.called)) {
            query.put("Called", request.called);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDialog"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDialogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看对话记录</p>
     * 
     * @param request ListDialogRequest
     * @return ListDialogResponse
     */
    public ListDialogResponse listDialog(ListDialogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDialogWithOptions(request, runtime);
    }

    /**
     * @param request ListHotlineRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHotlineRecordResponse
     */
    public ListHotlineRecordResponse listHotlineRecordWithOptions(ListHotlineRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHotlineRecord"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotlineRecordResponse());
    }

    /**
     * @param request ListHotlineRecordRequest
     * @return ListHotlineRecordResponse
     */
    public ListHotlineRecordResponse listHotlineRecord(ListHotlineRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHotlineRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据时间段查询热线详情列表，包含热线通话信息，时间段范围最长不超过1天</p>
     * 
     * @param request ListHotlineRecordDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHotlineRecordDetailResponse
     */
    public ListHotlineRecordDetailResponse listHotlineRecordDetailWithOptions(ListHotlineRecordDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHotlineRecordDetail"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotlineRecordDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据时间段查询热线详情列表，包含热线通话信息，时间段范围最长不超过1天</p>
     * 
     * @param request ListHotlineRecordDetailRequest
     * @return ListHotlineRecordDetailResponse
     */
    public ListHotlineRecordDetailResponse listHotlineRecordDetail(ListHotlineRecordDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHotlineRecordDetailWithOptions(request, runtime);
    }

    /**
     * @param request ListOutboundPhoneNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOutboundPhoneNumberResponse
     */
    public ListOutboundPhoneNumberResponse listOutboundPhoneNumberWithOptions(ListOutboundPhoneNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOutboundPhoneNumber"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOutboundPhoneNumberResponse());
    }

    /**
     * @param request ListOutboundPhoneNumberRequest
     * @return ListOutboundPhoneNumberResponse
     */
    public ListOutboundPhoneNumberResponse listOutboundPhoneNumber(ListOutboundPhoneNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOutboundPhoneNumberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看对话记录</p>
     * 
     * @param request ListRobotCallDialogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRobotCallDialogResponse
     */
    public ListRobotCallDialogResponse listRobotCallDialogWithOptions(ListRobotCallDialogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTime)) {
            query.put("CreateTime", request.createTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRobotCallDialog"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRobotCallDialogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看对话记录</p>
     * 
     * @param request ListRobotCallDialogRequest
     * @return ListRobotCallDialogResponse
     */
    public ListRobotCallDialogResponse listRobotCallDialog(ListRobotCallDialogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRobotCallDialogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询机器人输出列表</p>
     * 
     * @param request ListRobotNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRobotNodeResponse
     */
    public ListRobotNodeResponse listRobotNodeWithOptions(ListRobotNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotId)) {
            query.put("RobotId", request.robotId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRobotNode"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRobotNodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询机器人输出列表</p>
     * 
     * @param request ListRobotNodeRequest
     * @return ListRobotNodeResponse
     */
    public ListRobotNodeResponse listRobotNode(ListRobotNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRobotNodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询参数列表</p>
     * 
     * @param request ListRobotParamsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRobotParamsResponse
     */
    public ListRobotParamsResponse listRobotParamsWithOptions(ListRobotParamsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotId)) {
            query.put("RobotId", request.robotId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRobotParams"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRobotParamsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询参数列表</p>
     * 
     * @param request ListRobotParamsRequest
     * @return ListRobotParamsResponse
     */
    public ListRobotParamsResponse listRobotParams(ListRobotParamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRobotParamsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取租户下的所有角色</p>
     * 
     * @param request ListRolesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRolesResponse
     */
    public ListRolesResponse listRolesWithOptions(ListRolesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRoles"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRolesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取租户下的所有角色</p>
     * 
     * @param request ListRolesRequest
     * @return ListRolesResponse
     */
    public ListRolesResponse listRoles(ListRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRolesWithOptions(request, runtime);
    }

    /**
     * @param request ListSkillGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSkillGroupResponse
     */
    public ListSkillGroupResponse listSkillGroupWithOptions(ListSkillGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSkillGroup"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSkillGroupResponse());
    }

    /**
     * @param request ListSkillGroupRequest
     * @return ListSkillGroupResponse
     */
    public ListSkillGroupResponse listSkillGroup(ListSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSkillGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务列表</p>
     * 
     * @param request ListTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTaskResponse
     */
    public ListTaskResponse listTaskWithOptions(ListTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotName)) {
            query.put("RobotName", request.robotName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTask"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务列表</p>
     * 
     * @param request ListTaskRequest
     * @return ListTaskResponse
     */
    public ListTaskResponse listTask(ListTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>任务详情查看通话列表</p>
     * 
     * @param request ListTaskDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTaskDetailResponse
     */
    public ListTaskDetailResponse listTaskDetailWithOptions(ListTaskDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.called)) {
            query.put("Called", request.called);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusCode)) {
            query.put("StatusCode", request.statusCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTaskDetail"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTaskDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>任务详情查看通话列表</p>
     * 
     * @param request ListTaskDetailRequest
     * @return ListTaskDetailResponse
     */
    public ListTaskDetailResponse listTaskDetail(ListTaskDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTaskDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>基于大模型的智能外呼</p>
     * 
     * @param tmpReq LlmSmartCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LlmSmartCallResponse
     */
    public LlmSmartCallResponse llmSmartCallWithOptions(LlmSmartCallRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        LlmSmartCallShrinkRequest request = new LlmSmartCallShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizParam)) {
            request.bizParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizParam, "BizParam", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.promptParam)) {
            request.promptParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.promptParam, "PromptParam", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.startWordParam)) {
            request.startWordParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.startWordParam, "StartWordParam", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationCode)) {
            query.put("ApplicationCode", request.applicationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizParamShrink)) {
            query.put("BizParam", request.bizParamShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerNumber)) {
            query.put("CallerNumber", request.callerNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerLineCode)) {
            query.put("CustomerLineCode", request.customerLineCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extension)) {
            query.put("Extension", request.extension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptParamShrink)) {
            query.put("PromptParam", request.promptParamShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionTimeout)) {
            query.put("SessionTimeout", request.sessionTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startWordParamShrink)) {
            query.put("StartWordParam", request.startWordParamShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsSpeed)) {
            query.put("TtsSpeed", request.ttsSpeed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsVoiceCode)) {
            query.put("TtsVoiceCode", request.ttsVoiceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsVolume)) {
            query.put("TtsVolume", request.ttsVolume);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LlmSmartCall"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LlmSmartCallResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>基于大模型的智能外呼</p>
     * 
     * @param request LlmSmartCallRequest
     * @return LlmSmartCallResponse
     */
    public LlmSmartCallResponse llmSmartCall(LlmSmartCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.llmSmartCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>大模型外呼加密号码接口</p>
     * 
     * @param tmpReq LlmSmartCallEncryptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LlmSmartCallEncryptResponse
     */
    public LlmSmartCallEncryptResponse llmSmartCallEncryptWithOptions(LlmSmartCallEncryptRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        LlmSmartCallEncryptShrinkRequest request = new LlmSmartCallEncryptShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.promptParam)) {
            request.promptParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.promptParam, "PromptParam", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.startWordParam)) {
            request.startWordParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.startWordParam, "StartWordParam", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationCode)) {
            query.put("ApplicationCode", request.applicationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerNumber)) {
            query.put("CallerNumber", request.callerNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptCalledNumber)) {
            query.put("EncryptCalledNumber", request.encryptCalledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptParamShrink)) {
            query.put("PromptParam", request.promptParamShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startWordParamShrink)) {
            query.put("StartWordParam", request.startWordParamShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LlmSmartCallEncrypt"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LlmSmartCallEncryptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>大模型外呼加密号码接口</p>
     * 
     * @param request LlmSmartCallEncryptRequest
     * @return LlmSmartCallEncryptResponse
     */
    public LlmSmartCallEncryptResponse llmSmartCallEncrypt(LlmSmartCallEncryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.llmSmartCallEncryptWithOptions(request, runtime);
    }

    /**
     * @param request MakeCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MakeCallResponse
     */
    public MakeCallResponse makeCallWithOptions(MakeCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callingNumber)) {
            query.put("CallingNumber", request.callingNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commandCode)) {
            query.put("CommandCode", request.commandCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            query.put("ExtInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerAccountId)) {
            query.put("OuterAccountId", request.outerAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerAccountType)) {
            query.put("OuterAccountType", request.outerAccountType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MakeCall"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MakeCallResponse());
    }

    /**
     * @param request MakeCallRequest
     * @return MakeCallResponse
     */
    public MakeCallResponse makeCall(MakeCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.makeCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>移动端发起呼叫</p>
     * 
     * @param request MakeDoubleCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MakeDoubleCallResponse
     */
    public MakeDoubleCallResponse makeDoubleCallWithOptions(MakeDoubleCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizData)) {
            query.put("BizData", request.bizData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberPhone)) {
            query.put("MemberPhone", request.memberPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outboundCallNumber)) {
            query.put("OutboundCallNumber", request.outboundCallNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicerPhone)) {
            query.put("ServicerPhone", request.servicerPhone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MakeDoubleCall"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MakeDoubleCallResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>移动端发起呼叫</p>
     * 
     * @param request MakeDoubleCallRequest
     * @return MakeDoubleCallResponse
     */
    public MakeDoubleCallResponse makeDoubleCall(MakeDoubleCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.makeDoubleCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询智能体列表</p>
     * 
     * @param request PageQueryAgentListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PageQueryAgentListResponse
     */
    public PageQueryAgentListResponse pageQueryAgentListWithOptions(PageQueryAgentListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentName)) {
            query.put("AgentName", request.agentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PageQueryAgentList"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PageQueryAgentListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询智能体列表</p>
     * 
     * @param request PageQueryAgentListRequest
     * @return PageQueryAgentListResponse
     */
    public PageQueryAgentListResponse pageQueryAgentList(PageQueryAgentListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pageQueryAgentListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询明细记录</p>
     * 
     * @param tmpReq QueryAiCallDetailPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAiCallDetailPageResponse
     */
    public QueryAiCallDetailPageResponse queryAiCallDetailPageWithOptions(QueryAiCallDetailPageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryAiCallDetailPageShrinkRequest request = new QueryAiCallDetailPageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.detailIds)) {
            request.detailIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.detailIds, "DetailIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchId)) {
            query.put("BatchId", request.batchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callResult)) {
            query.put("CallResult", request.callResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detailIdsShrink)) {
            query.put("DetailIds", request.detailIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endCallingTime)) {
            query.put("EndCallingTime", request.endCallingTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endImportedTime)) {
            query.put("EndImportedTime", request.endImportedTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.majorIntent)) {
            query.put("MajorIntent", request.majorIntent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxConversationDuration)) {
            query.put("MaxConversationDuration", request.maxConversationDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minConversationDuration)) {
            query.put("MinConversationDuration", request.minConversationDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startCallingTime)) {
            query.put("StartCallingTime", request.startCallingTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startImportedTime)) {
            query.put("StartImportedTime", request.startImportedTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAiCallDetailPage"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAiCallDetailPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询明细记录</p>
     * 
     * @param request QueryAiCallDetailPageRequest
     * @return QueryAiCallDetailPageResponse
     */
    public QueryAiCallDetailPageResponse queryAiCallDetailPage(QueryAiCallDetailPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAiCallDetailPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务详情</p>
     * 
     * @param request QueryAiCallTaskDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAiCallTaskDetailResponse
     */
    public QueryAiCallTaskDetailResponse queryAiCallTaskDetailWithOptions(QueryAiCallTaskDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAiCallTaskDetail"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAiCallTaskDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务详情</p>
     * 
     * @param request QueryAiCallTaskDetailRequest
     * @return QueryAiCallTaskDetailResponse
     */
    public QueryAiCallTaskDetailResponse queryAiCallTaskDetail(QueryAiCallTaskDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAiCallTaskDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务列表</p>
     * 
     * @param request QueryAiCallTaskPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAiCallTaskPageResponse
     */
    public QueryAiCallTaskPageResponse queryAiCallTaskPageWithOptions(QueryAiCallTaskPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentName)) {
            query.put("AgentName", request.agentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAiCallTaskPage"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAiCallTaskPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询任务列表</p>
     * 
     * @param request QueryAiCallTaskPageRequest
     * @return QueryAiCallTaskPageResponse
     */
    public QueryAiCallTaskPageResponse queryAiCallTaskPage(QueryAiCallTaskPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAiCallTaskPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询智能体明细</p>
     * 
     * @param request QueryAiVoiceAgentDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAiVoiceAgentDetailResponse
     */
    public QueryAiVoiceAgentDetailResponse queryAiVoiceAgentDetailWithOptions(QueryAiVoiceAgentDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAiVoiceAgentDetail"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAiVoiceAgentDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询智能体明细</p>
     * 
     * @param request QueryAiVoiceAgentDetailRequest
     * @return QueryAiVoiceAgentDetailResponse
     */
    public QueryAiVoiceAgentDetailResponse queryAiVoiceAgentDetail(QueryAiVoiceAgentDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAiVoiceAgentDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询通话详情信息</p>
     * 
     * @param request QueryConversationDetailInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryConversationDetailInfoResponse
     */
    public QueryConversationDetailInfoResponse queryConversationDetailInfoWithOptions(QueryConversationDetailInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchId)) {
            query.put("BatchId", request.batchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detailId)) {
            query.put("DetailId", request.detailId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryConversationDetailInfo"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryConversationDetailInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询通话详情信息</p>
     * 
     * @param request QueryConversationDetailInfoRequest
     * @return QueryConversationDetailInfoResponse
     */
    public QueryConversationDetailInfoResponse queryConversationDetailInfo(QueryConversationDetailInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryConversationDetailInfoWithOptions(request, runtime);
    }

    /**
     * @param request QueryHotlineInQueueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryHotlineInQueueResponse
     */
    public QueryHotlineInQueueResponse queryHotlineInQueueWithOptions(QueryHotlineInQueueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryHotlineInQueue"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryHotlineInQueueResponse());
    }

    /**
     * @param request QueryHotlineInQueueRequest
     * @return QueryHotlineInQueueResponse
     */
    public QueryHotlineInQueueResponse queryHotlineInQueue(QueryHotlineInQueueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryHotlineInQueueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询热线号码配置</p>
     * 
     * @param tmpReq QueryHotlineNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryHotlineNumberResponse
     */
    public QueryHotlineNumberResponse queryHotlineNumberWithOptions(QueryHotlineNumberRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryHotlineNumberShrinkRequest request = new QueryHotlineNumberShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupIds)) {
            request.groupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupIds, "GroupIds", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryHotlineNumber"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryHotlineNumberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询热线号码配置</p>
     * 
     * @param request QueryHotlineNumberRequest
     * @return QueryHotlineNumberResponse
     */
    public QueryHotlineNumberResponse queryHotlineNumber(QueryHotlineNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryHotlineNumberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询呼入CallId</p>
     * 
     * @param request QueryInboundCallIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryInboundCallIdResponse
     */
    public QueryInboundCallIdResponse queryInboundCallIdWithOptions(QueryInboundCallIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callDate)) {
            query.put("CallDate", request.callDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryInboundCallId"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryInboundCallIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询呼入CallId</p>
     * 
     * @param request QueryInboundCallIdRequest
     * @return QueryInboundCallIdResponse
     */
    public QueryInboundCallIdResponse queryInboundCallId(QueryInboundCallIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryInboundCallIdWithOptions(request, runtime);
    }

    /**
     * @param request QueryOutboundTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOutboundTaskResponse
     */
    public QueryOutboundTaskResponse queryOutboundTaskWithOptions(QueryOutboundTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ani)) {
            query.put("Ani", request.ani);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departmentId)) {
            query.put("DepartmentId", request.departmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroup)) {
            query.put("SkillGroup", request.skillGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOutboundTask"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOutboundTaskResponse());
    }

    /**
     * @param request QueryOutboundTaskRequest
     * @return QueryOutboundTaskResponse
     */
    public QueryOutboundTaskResponse queryOutboundTask(QueryOutboundTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOutboundTaskWithOptions(request, runtime);
    }

    /**
     * @param request QuerySkillGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySkillGroupsResponse
     */
    public QuerySkillGroupsResponse querySkillGroupsWithOptions(QuerySkillGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departmentId)) {
            query.put("DepartmentId", request.departmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySkillGroups"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySkillGroupsResponse());
    }

    /**
     * @param request QuerySkillGroupsRequest
     * @return QuerySkillGroupsResponse
     */
    public QuerySkillGroupsResponse querySkillGroups(QuerySkillGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySkillGroupsWithOptions(request, runtime);
    }

    /**
     * @param request QueryTaskDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTaskDetailResponse
     */
    public QueryTaskDetailResponse queryTaskDetailWithOptions(QueryTaskDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ani)) {
            query.put("Ani", request.ani);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departmentIdList)) {
            query.put("DepartmentIdList", request.departmentIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnis)) {
            query.put("Dnis", request.dnis);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endReasonList)) {
            query.put("EndReasonList", request.endReasonList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outboundTaskId)) {
            query.put("OutboundTaskId", request.outboundTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priorityList)) {
            query.put("PriorityList", request.priorityList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicerId)) {
            query.put("ServicerId", request.servicerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicerName)) {
            query.put("ServicerName", request.servicerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sid)) {
            query.put("Sid", request.sid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroup)) {
            query.put("SkillGroup", request.skillGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusList)) {
            query.put("StatusList", request.statusList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTaskDetail"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTaskDetailResponse());
    }

    /**
     * @param request QueryTaskDetailRequest
     * @return QueryTaskDetailResponse
     */
    public QueryTaskDetailResponse queryTaskDetail(QueryTaskDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTaskDetailWithOptions(request, runtime);
    }

    /**
     * @param tmpReq QueryTicketsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTicketsResponse
     */
    public QueryTicketsResponse queryTicketsWithOptions(QueryTicketsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryTicketsShrinkRequest request = new QueryTicketsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extra)) {
            request.extraShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extra, "Extra", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caseId)) {
            body.put("CaseId", request.caseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caseStatus)) {
            body.put("CaseStatus", request.caseStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caseType)) {
            body.put("CaseType", request.caseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            body.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dealId)) {
            body.put("DealId", request.dealId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraShrink)) {
            body.put("Extra", request.extraShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srType)) {
            body.put("SrType", request.srType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskStatus)) {
            body.put("TaskStatus", request.taskStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.touchId)) {
            body.put("TouchId", request.touchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTickets"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTicketsResponse());
    }

    /**
     * @param request QueryTicketsRequest
     * @return QueryTicketsResponse
     */
    public QueryTicketsResponse queryTickets(QueryTicketsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTicketsWithOptions(request, runtime);
    }

    /**
     * @param request QueryTouchListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTouchListResponse
     */
    public QueryTouchListResponse queryTouchListWithOptions(QueryTouchListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            body.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.closeTimeEnd)) {
            body.put("CloseTimeEnd", request.closeTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.closeTimeStart)) {
            body.put("CloseTimeStart", request.closeTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluationLevel)) {
            body.put("EvaluationLevel", request.evaluationLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluationScore)) {
            body.put("EvaluationScore", request.evaluationScore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluationStatus)) {
            body.put("EvaluationStatus", request.evaluationStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firstTimeEnd)) {
            body.put("FirstTimeEnd", request.firstTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firstTimeStart)) {
            body.put("FirstTimeStart", request.firstTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            body.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberName)) {
            body.put("MemberName", request.memberName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueId)) {
            body.put("QueueId", request.queueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicerId)) {
            body.put("ServicerId", request.servicerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicerName)) {
            body.put("ServicerName", request.servicerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.touchId)) {
            body.put("TouchId", request.touchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.touchType)) {
            body.put("TouchType", request.touchType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTouchList"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTouchListResponse());
    }

    /**
     * @param request QueryTouchListRequest
     * @return QueryTouchListResponse
     */
    public QueryTouchListResponse queryTouchList(QueryTouchListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTouchListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>从技能组中移除坐席</p>
     * 
     * @param tmpReq RemoveAgentFromSkillGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveAgentFromSkillGroupResponse
     */
    public RemoveAgentFromSkillGroupResponse removeAgentFromSkillGroupWithOptions(RemoveAgentFromSkillGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveAgentFromSkillGroupShrinkRequest request = new RemoveAgentFromSkillGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.agentIds)) {
            request.agentIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.agentIds, "AgentIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentIdsShrink)) {
            query.put("AgentIds", request.agentIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveAgentFromSkillGroup"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveAgentFromSkillGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>从技能组中移除坐席</p>
     * 
     * @param request RemoveAgentFromSkillGroupRequest
     * @return RemoveAgentFromSkillGroupResponse
     */
    public RemoveAgentFromSkillGroupResponse removeAgentFromSkillGroup(RemoveAgentFromSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeAgentFromSkillGroupWithOptions(request, runtime);
    }

    /**
     * @param request RemoveSkillGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveSkillGroupResponse
     */
    public RemoveSkillGroupResponse removeSkillGroupWithOptions(RemoveSkillGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            body.put("SkillGroupId", request.skillGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveSkillGroup"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveSkillGroupResponse());
    }

    /**
     * @param request RemoveSkillGroupRequest
     * @return RemoveSkillGroupResponse
     */
    public RemoveSkillGroupResponse removeSkillGroup(RemoveSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeSkillGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重置热线号码</p>
     * 
     * @param tmpReq ResetHotlineNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetHotlineNumberResponse
     */
    public ResetHotlineNumberResponse resetHotlineNumberWithOptions(ResetHotlineNumberRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ResetHotlineNumberShrinkRequest request = new ResetHotlineNumberShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.outboundRangeList)) {
            request.outboundRangeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.outboundRangeList, "OutboundRangeList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableInbound)) {
            body.put("EnableInbound", request.enableInbound);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableInboundEvaluation)) {
            body.put("EnableInboundEvaluation", request.enableInboundEvaluation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableOutbound)) {
            body.put("EnableOutbound", request.enableOutbound);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableOutboundEvaluation)) {
            body.put("EnableOutboundEvaluation", request.enableOutboundEvaluation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluationLevel)) {
            body.put("EvaluationLevel", request.evaluationLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotlineNumber)) {
            body.put("HotlineNumber", request.hotlineNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inboundFlowId)) {
            body.put("InboundFlowId", request.inboundFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outboundAllDepart)) {
            body.put("OutboundAllDepart", request.outboundAllDepart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outboundRangeListShrink)) {
            body.put("OutboundRangeList", request.outboundRangeListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetHotlineNumber"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetHotlineNumberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>重置热线号码</p>
     * 
     * @param request ResetHotlineNumberRequest
     * @return ResetHotlineNumberResponse
     */
    public ResetHotlineNumberResponse resetHotlineNumber(ResetHotlineNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetHotlineNumberWithOptions(request, runtime);
    }

    /**
     * @param request RestartOutboundTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartOutboundTaskResponse
     */
    public RestartOutboundTaskResponse restartOutboundTaskWithOptions(RestartOutboundTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outboundTaskId)) {
            query.put("OutboundTaskId", request.outboundTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartOutboundTask"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartOutboundTaskResponse());
    }

    /**
     * @param request RestartOutboundTaskRequest
     * @return RestartOutboundTaskResponse
     */
    public RestartOutboundTaskResponse restartOutboundTask(RestartOutboundTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartOutboundTaskWithOptions(request, runtime);
    }

    /**
     * @param request RobotCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RobotCallResponse
     */
    public RobotCallResponse robotCallWithOptions(RobotCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledShowNumber)) {
            query.put("CalledShowNumber", request.calledShowNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.earlyMediaAsr)) {
            query.put("EarlyMediaAsr", request.earlyMediaAsr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordFlag)) {
            query.put("RecordFlag", request.recordFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotId)) {
            query.put("RobotId", request.robotId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RobotCall"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RobotCallResponse());
    }

    /**
     * @param request RobotCallRequest
     * @return RobotCallResponse
     */
    public RobotCallResponse robotCall(RobotCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.robotCallWithOptions(request, runtime);
    }

    /**
     * @param request SendCcoSmartCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendCcoSmartCallResponse
     */
    public SendCcoSmartCallResponse sendCcoSmartCallWithOptions(SendCcoSmartCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionCodeBreak)) {
            query.put("ActionCodeBreak", request.actionCodeBreak);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.actionCodeTimeBreak)) {
            query.put("ActionCodeTimeBreak", request.actionCodeTimeBreak);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asrAlsAmId)) {
            query.put("AsrAlsAmId", request.asrAlsAmId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asrBaseId)) {
            query.put("AsrBaseId", request.asrBaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asrModelId)) {
            query.put("AsrModelId", request.asrModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asrVocabularyId)) {
            query.put("AsrVocabularyId", request.asrVocabularyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgroundFileCode)) {
            query.put("BackgroundFileCode", request.backgroundFileCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgroundSpeed)) {
            query.put("BackgroundSpeed", request.backgroundSpeed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgroundVolume)) {
            query.put("BackgroundVolume", request.backgroundVolume);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledShowNumber)) {
            query.put("CalledShowNumber", request.calledShowNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicId)) {
            query.put("DynamicId", request.dynamicId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.earlyMediaAsr)) {
            query.put("EarlyMediaAsr", request.earlyMediaAsr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableITN)) {
            query.put("EnableITN", request.enableITN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.muteTime)) {
            query.put("MuteTime", request.muteTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pauseTime)) {
            query.put("PauseTime", request.pauseTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playTimes)) {
            query.put("PlayTimes", request.playTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordFlag)) {
            query.put("RecordFlag", request.recordFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionTimeout)) {
            query.put("SessionTimeout", request.sessionTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speed)) {
            query.put("Speed", request.speed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsConf)) {
            query.put("TtsConf", request.ttsConf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsSpeed)) {
            query.put("TtsSpeed", request.ttsSpeed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsStyle)) {
            query.put("TtsStyle", request.ttsStyle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsVolume)) {
            query.put("TtsVolume", request.ttsVolume);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceCode)) {
            query.put("VoiceCode", request.voiceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceCodeParam)) {
            query.put("VoiceCodeParam", request.voiceCodeParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volume)) {
            query.put("Volume", request.volume);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendCcoSmartCall"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendCcoSmartCallResponse());
    }

    /**
     * @param request SendCcoSmartCallRequest
     * @return SendCcoSmartCallResponse
     */
    public SendCcoSmartCallResponse sendCcoSmartCall(SendCcoSmartCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendCcoSmartCallWithOptions(request, runtime);
    }

    /**
     * @param request SendCcoSmartCallOperateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendCcoSmartCallOperateResponse
     */
    public SendCcoSmartCallOperateResponse sendCcoSmartCallOperateWithOptions(SendCcoSmartCallOperateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.command)) {
            query.put("Command", request.command);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.param)) {
            query.put("Param", request.param);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendCcoSmartCallOperate"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendCcoSmartCallOperateResponse());
    }

    /**
     * @param request SendCcoSmartCallOperateRequest
     * @return SendCcoSmartCallOperateResponse
     */
    public SendCcoSmartCallOperateResponse sendCcoSmartCallOperate(SendCcoSmartCallOperateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendCcoSmartCallOperateWithOptions(request, runtime);
    }

    /**
     * @param request SendHotlineHeartBeatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendHotlineHeartBeatResponse
     */
    public SendHotlineHeartBeatResponse sendHotlineHeartBeatWithOptions(SendHotlineHeartBeatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendHotlineHeartBeat"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendHotlineHeartBeatResponse());
    }

    /**
     * @param request SendHotlineHeartBeatRequest
     * @return SendHotlineHeartBeatResponse
     */
    public SendHotlineHeartBeatResponse sendHotlineHeartBeat(SendHotlineHeartBeatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendHotlineHeartBeatWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启动任务</p>
     * 
     * @param request StartAiCallTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartAiCallTaskResponse
     */
    public StartAiCallTaskResponse startAiCallTaskWithOptions(StartAiCallTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartAiCallTask"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartAiCallTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启动任务</p>
     * 
     * @param request StartAiCallTaskRequest
     * @return StartAiCallTaskResponse
     */
    public StartAiCallTaskResponse startAiCallTask(StartAiCallTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startAiCallTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启动智能外呼任务</p>
     * 
     * @param request StartAiOutboundTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartAiOutboundTaskResponse
     */
    public StartAiOutboundTaskResponse startAiOutboundTaskWithOptions(StartAiOutboundTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartAiOutboundTask"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartAiOutboundTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启动智能外呼任务</p>
     * 
     * @param request StartAiOutboundTaskRequest
     * @return StartAiOutboundTaskResponse
     */
    public StartAiOutboundTaskResponse startAiOutboundTask(StartAiOutboundTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startAiOutboundTaskWithOptions(request, runtime);
    }

    /**
     * @param request StartCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartCallResponse
     */
    public StartCallResponse startCallWithOptions(StartCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callee)) {
            body.put("Callee", request.callee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            body.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartCall"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartCallResponse());
    }

    /**
     * @param request StartCallRequest
     * @return StartCallResponse
     */
    public StartCallResponse startCall(StartCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startCallWithOptions(request, runtime);
    }

    /**
     * @param request StartCallV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartCallV2Response
     */
    public StartCallV2Response startCallV2WithOptions(StartCallV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callee)) {
            body.put("Callee", request.callee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            body.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerType)) {
            body.put("CallerType", request.callerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartCallV2"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartCallV2Response());
    }

    /**
     * @param request StartCallV2Request
     * @return StartCallV2Response
     */
    public StartCallV2Response startCallV2(StartCallV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startCallV2WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改在线客服为上班状态</p>
     * 
     * @param request StartChatWorkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartChatWorkResponse
     */
    public StartChatWorkResponse startChatWorkWithOptions(StartChatWorkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartChatWork"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartChatWorkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改在线客服为上班状态</p>
     * 
     * @param request StartChatWorkRequest
     * @return StartChatWorkResponse
     */
    public StartChatWorkResponse startChatWork(StartChatWorkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startChatWorkWithOptions(request, runtime);
    }

    /**
     * @param request StartHotlineServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartHotlineServiceResponse
     */
    public StartHotlineServiceResponse startHotlineServiceWithOptions(StartHotlineServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartHotlineService"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartHotlineServiceResponse());
    }

    /**
     * @param request StartHotlineServiceRequest
     * @return StartHotlineServiceResponse
     */
    public StartHotlineServiceResponse startHotlineService(StartHotlineServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startHotlineServiceWithOptions(request, runtime);
    }

    /**
     * @param request StartMicroOutboundRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartMicroOutboundResponse
     */
    public StartMicroOutboundResponse startMicroOutboundWithOptions(StartMicroOutboundRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callingNumber)) {
            query.put("CallingNumber", request.callingNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commandCode)) {
            query.put("CommandCode", request.commandCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extInfo)) {
            query.put("ExtInfo", request.extInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartMicroOutbound"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartMicroOutboundResponse());
    }

    /**
     * @param request StartMicroOutboundRequest
     * @return StartMicroOutboundResponse
     */
    public StartMicroOutboundResponse startMicroOutbound(StartMicroOutboundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startMicroOutboundWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>立即或定时启动智能外呼任务</p>
     * 
     * @param request StartTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartTaskResponse
     */
    public StartTaskResponse startTaskWithOptions(StartTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startNow)) {
            query.put("StartNow", request.startNow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartTask"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>立即或定时启动智能外呼任务</p>
     * 
     * @param request StartTaskRequest
     * @return StartTaskResponse
     */
    public StartTaskResponse startTask(StartTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停止任务</p>
     * 
     * @param request StopAiCallTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopAiCallTaskResponse
     */
    public StopAiCallTaskResponse stopAiCallTaskWithOptions(StopAiCallTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopAiCallTask"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopAiCallTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>停止任务</p>
     * 
     * @param request StopAiCallTaskRequest
     * @return StopAiCallTaskResponse
     */
    public StopAiCallTaskResponse stopAiCallTask(StopAiCallTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopAiCallTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>手动暂停智能外呼任务</p>
     * 
     * @param request StopAiOutboundTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopAiOutboundTaskResponse
     */
    public StopAiOutboundTaskResponse stopAiOutboundTaskWithOptions(StopAiOutboundTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopAiOutboundTask"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopAiOutboundTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>手动暂停智能外呼任务</p>
     * 
     * @param request StopAiOutboundTaskRequest
     * @return StopAiOutboundTaskResponse
     */
    public StopAiOutboundTaskResponse stopAiOutboundTask(StopAiOutboundTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopAiOutboundTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>暂停外呼任务</p>
     * 
     * @param request StopTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopTaskResponse
     */
    public StopTaskResponse stopTaskWithOptions(StopTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopTask"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>暂停外呼任务</p>
     * 
     * @param request StopTaskRequest
     * @return StopTaskResponse
     */
    public StopTaskResponse stopTask(StopTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopTaskWithOptions(request, runtime);
    }

    /**
     * @param request SuspendHotlineServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SuspendHotlineServiceResponse
     */
    public SuspendHotlineServiceResponse suspendHotlineServiceWithOptions(SuspendHotlineServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendHotlineService"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendHotlineServiceResponse());
    }

    /**
     * @param request SuspendHotlineServiceRequest
     * @return SuspendHotlineServiceResponse
     */
    public SuspendHotlineServiceResponse suspendHotlineService(SuspendHotlineServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendHotlineServiceWithOptions(request, runtime);
    }

    /**
     * @param request SuspendOutboundTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SuspendOutboundTaskResponse
     */
    public SuspendOutboundTaskResponse suspendOutboundTaskWithOptions(SuspendOutboundTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outboundTaskId)) {
            query.put("OutboundTaskId", request.outboundTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendOutboundTask"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendOutboundTaskResponse());
    }

    /**
     * @param request SuspendOutboundTaskRequest
     * @return SuspendOutboundTaskResponse
     */
    public SuspendOutboundTaskResponse suspendOutboundTask(SuspendOutboundTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendOutboundTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>终止智能外呼任务</p>
     * 
     * @param request TerminateAiOutboundTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TerminateAiOutboundTaskResponse
     */
    public TerminateAiOutboundTaskResponse terminateAiOutboundTaskWithOptions(TerminateAiOutboundTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TerminateAiOutboundTask"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TerminateAiOutboundTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>终止智能外呼任务</p>
     * 
     * @param request TerminateAiOutboundTaskRequest
     * @return TerminateAiOutboundTaskResponse
     */
    public TerminateAiOutboundTaskResponse terminateAiOutboundTask(TerminateAiOutboundTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.terminateAiOutboundTaskWithOptions(request, runtime);
    }

    /**
     * @param request TransferCallToSkillGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TransferCallToSkillGroupResponse
     */
    public TransferCallToSkillGroupResponse transferCallToSkillGroupWithOptions(TransferCallToSkillGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            body.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            body.put("ConnectionId", request.connectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.holdConnectionId)) {
            body.put("HoldConnectionId", request.holdConnectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSingleTransfer)) {
            body.put("IsSingleTransfer", request.isSingleTransfer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            body.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferCallToSkillGroup"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferCallToSkillGroupResponse());
    }

    /**
     * @param request TransferCallToSkillGroupRequest
     * @return TransferCallToSkillGroupResponse
     */
    public TransferCallToSkillGroupResponse transferCallToSkillGroup(TransferCallToSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferCallToSkillGroupWithOptions(request, runtime);
    }

    /**
     * @param request UpdateAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAgentResponse
     */
    public UpdateAgentResponse updateAgentWithOptions(UpdateAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            body.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupIdList)) {
            body.put("SkillGroupIdList", request.skillGroupIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAgent"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAgentResponse());
    }

    /**
     * @param request UpdateAgentRequest
     * @return UpdateAgentResponse
     */
    public UpdateAgentResponse updateAgent(UpdateAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新AI外呼任务配置</p>
     * 
     * @param tmpReq UpdateAiCallTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAiCallTaskResponse
     */
    public UpdateAiCallTaskResponse updateAiCallTaskWithOptions(UpdateAiCallTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAiCallTaskShrinkRequest request = new UpdateAiCallTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.callDay)) {
            request.callDayShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.callDay, "CallDay", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.callRetryReason)) {
            request.callRetryReasonShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.callRetryReason, "CallRetryReason", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.callTime)) {
            request.callTimeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.callTime, "CallTime", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callDayShrink)) {
            query.put("CallDay", request.callDayShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callRetryInterval)) {
            query.put("CallRetryInterval", request.callRetryInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callRetryReasonShrink)) {
            query.put("CallRetryReason", request.callRetryReasonShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callRetryTimes)) {
            query.put("CallRetryTimes", request.callRetryTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callTimeShrink)) {
            query.put("CallTime", request.callTimeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.missCallRetry)) {
            query.put("MissCallRetry", request.missCallRetry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startType)) {
            query.put("StartType", request.startType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskCps)) {
            query.put("TaskCps", request.taskCps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskStartTime)) {
            query.put("TaskStartTime", request.taskStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualNumber)) {
            query.put("VirtualNumber", request.virtualNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAiCallTask"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAiCallTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新AI外呼任务配置</p>
     * 
     * @param request UpdateAiCallTaskRequest
     * @return UpdateAiCallTaskResponse
     */
    public UpdateAiCallTaskResponse updateAiCallTask(UpdateAiCallTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAiCallTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新智能外呼任务（预测式外呼、自动外呼）</p>
     * 
     * @param tmpReq UpdateAiOutboundTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAiOutboundTaskResponse
     */
    public UpdateAiOutboundTaskResponse updateAiOutboundTaskWithOptions(UpdateAiOutboundTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAiOutboundTaskShrinkRequest request = new UpdateAiOutboundTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.outboundNums)) {
            request.outboundNumsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.outboundNums, "OutboundNums", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.recallRule)) {
            request.recallRuleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.recallRule, "RecallRule", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.concurrentRate)) {
            query.put("ConcurrentRate", request.concurrentRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionTime)) {
            query.put("ExecutionTime", request.executionTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forecastCallRate)) {
            query.put("ForecastCallRate", request.forecastCallRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.handlerId)) {
            query.put("HandlerId", request.handlerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numRepeated)) {
            query.put("NumRepeated", request.numRepeated);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outboundNumsShrink)) {
            query.put("OutboundNums", request.outboundNumsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallRuleShrink)) {
            query.put("RecallRule", request.recallRuleShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAiOutboundTask"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAiOutboundTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新智能外呼任务（预测式外呼、自动外呼）</p>
     * 
     * @param request UpdateAiOutboundTaskRequest
     * @return UpdateAiOutboundTaskResponse
     */
    public UpdateAiOutboundTaskResponse updateAiOutboundTask(UpdateAiOutboundTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAiOutboundTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新部门信息</p>
     * 
     * @param request UpdateDepartmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDepartmentResponse
     */
    public UpdateDepartmentResponse updateDepartmentWithOptions(UpdateDepartmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.departmentId)) {
            query.put("DepartmentId", request.departmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departmentName)) {
            query.put("DepartmentName", request.departmentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDepartment"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDepartmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新部门信息</p>
     * 
     * @param request UpdateDepartmentRequest
     * @return UpdateDepartmentResponse
     */
    public UpdateDepartmentResponse updateDepartment(UpdateDepartmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDepartmentWithOptions(request, runtime);
    }

    /**
     * @param request UpdateOuterAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOuterAccountResponse
     */
    public UpdateOuterAccountResponse updateOuterAccountWithOptions(UpdateOuterAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOuterAccount"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOuterAccountResponse());
    }

    /**
     * @param request UpdateOuterAccountRequest
     * @return UpdateOuterAccountResponse
     */
    public UpdateOuterAccountResponse updateOuterAccount(UpdateOuterAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOuterAccountWithOptions(request, runtime);
    }

    /**
     * @param request UpdateSkillGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSkillGroupResponse
     */
    public UpdateSkillGroupResponse updateSkillGroupWithOptions(UpdateSkillGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupId)) {
            query.put("SkillGroupId", request.skillGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroupName)) {
            query.put("SkillGroupName", request.skillGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSkillGroup"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSkillGroupResponse());
    }

    /**
     * @param request UpdateSkillGroupRequest
     * @return UpdateSkillGroupResponse
     */
    public UpdateSkillGroupResponse updateSkillGroup(UpdateSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSkillGroupWithOptions(request, runtime);
    }
}
