// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015;

import com.aliyun.tea.*;
import com.aliyun.aiccs20191015.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("us-west-1", "aiccs.aliyuncs.com"),
            new TeaPair("us-east-1", "aiccs.aliyuncs.com"),
            new TeaPair("me-east-1", "aiccs.aliyuncs.com"),
            new TeaPair("eu-west-1", "aiccs.aliyuncs.com"),
            new TeaPair("eu-central-1", "aiccs.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "aiccs.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "aiccs.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "aiccs.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "aiccs.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "aiccs.aliyuncs.com"),
            new TeaPair("cn-shanghai", "aiccs.aliyuncs.com"),
            new TeaPair("cn-qingdao", "aiccs.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "aiccs.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "aiccs.aliyuncs.com"),
            new TeaPair("cn-hongkong", "aiccs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "aiccs.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "aiccs.aliyuncs.com"),
            new TeaPair("cn-chengdu", "aiccs.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "aiccs.aliyuncs.com"),
            new TeaPair("cn-beijing", "aiccs.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "aiccs.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "aiccs.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "aiccs.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "aiccs.aliyuncs.com")
        );
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
     * <b>description</b> :
     * <blockquote>
     * <p>Hotline numbers are for inbound and outbound calls only.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Invoke the AddHotlineNumber API to add a hotline number.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>Hotline numbers are for inbound and outbound calls only.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Invoke the AddHotlineNumber API to add a hotline number.</p>
     * 
     * @param request AddHotlineNumberRequest
     * @return AddHotlineNumberResponse
     */
    public AddHotlineNumberResponse addHotlineNumber(AddHotlineNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addHotlineNumberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds one or more inbound numbers.</p>
     * 
     * @param tmpReq AddInboundNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddInboundNumberResponse
     */
    public AddInboundNumberResponse addInboundNumberWithOptions(AddInboundNumberRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddInboundNumberShrinkRequest request = new AddInboundNumberShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.inboundNumbers)) {
            request.inboundNumbersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.inboundNumbers, "InboundNumbers", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationCode)) {
            query.put("ApplicationCode", request.applicationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inboundNumbersShrink)) {
            query.put("InboundNumbers", request.inboundNumbersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inboundType)) {
            query.put("InboundType", request.inboundType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lineCode)) {
            query.put("LineCode", request.lineCode);
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
            new TeaPair("action", "AddInboundNumber"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddInboundNumberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds one or more inbound numbers.</p>
     * 
     * @param request AddInboundNumberRequest
     * @return AddInboundNumberResponse
     */
    public AddInboundNumberResponse addInboundNumber(AddInboundNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addInboundNumberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a large language model.</p>
     * 
     * @param tmpReq AddLargeModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddLargeModelResponse
     */
    public AddLargeModelResponse addLargeModelWithOptions(AddLargeModelRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddLargeModelShrinkRequest request = new AddLargeModelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.baseModel)) {
            request.baseModelShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.baseModel, "BaseModel", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baseModelShrink)) {
            query.put("BaseModel", request.baseModelShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelName)) {
            query.put("ModelName", request.modelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelUrl)) {
            query.put("ModelUrl", request.modelUrl);
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

        if (!com.aliyun.teautil.Common.isUnset(request.temperature)) {
            query.put("Temperature", request.temperature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topK)) {
            query.put("TopK", request.topK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topP)) {
            query.put("TopP", request.topP);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddLargeModel"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddLargeModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a large language model.</p>
     * 
     * @param request AddLargeModelRequest
     * @return AddLargeModelResponse
     */
    public AddLargeModelResponse addLargeModel(AddLargeModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addLargeModelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Add a model application</p>
     * 
     * @param tmpReq AddModelApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddModelApplicationResponse
     */
    public AddModelApplicationResponse addModelApplicationWithOptions(AddModelApplicationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddModelApplicationShrinkRequest request = new AddModelApplicationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ttsConfig)) {
            request.ttsConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ttsConfig, "TtsConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationCps)) {
            query.put("ApplicationCps", request.applicationCps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callConnectedTriggerModel)) {
            query.put("CallConnectedTriggerModel", request.callConnectedTriggerModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dyvmsSceneName)) {
            query.put("DyvmsSceneName", request.dyvmsSceneName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelCode)) {
            query.put("ModelCode", request.modelCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelVersion)) {
            query.put("ModelVersion", request.modelVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.muteActive)) {
            query.put("MuteActive", request.muteActive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.muteDuration)) {
            query.put("MuteDuration", request.muteDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.muteHangupNum)) {
            query.put("MuteHangupNum", request.muteHangupNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            query.put("Prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualificationId)) {
            query.put("QualificationId", request.qualificationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualificationName)) {
            query.put("QualificationName", request.qualificationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordingFile)) {
            query.put("RecordingFile", request.recordingFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speechContent)) {
            query.put("SpeechContent", request.speechContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speechId)) {
            query.put("SpeechId", request.speechId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startWord)) {
            query.put("StartWord", request.startWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startWordType)) {
            query.put("StartWordType", request.startWordType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsConfigShrink)) {
            query.put("TtsConfig", request.ttsConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usageDesc)) {
            query.put("UsageDesc", request.usageDesc);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddModelApplication"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddModelApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Add a model application</p>
     * 
     * @param request AddModelApplicationRequest
     * @return AddModelApplicationResponse
     */
    public AddModelApplicationResponse addModelApplication(AddModelApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addModelApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke AddOuterAccount to add an external account.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke AddOuterAccount to add an external account.</p>
     * 
     * @param request AddOuterAccountRequest
     * @return AddOuterAccountResponse
     */
    public AddOuterAccountResponse addOuterAccount(AddOuterAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addOuterAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke AddSkillGroup to create an external skill group.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke AddSkillGroup to create an external skill group.</p>
     * 
     * @param request AddSkillGroupRequest
     * @return AddSkillGroupResponse
     */
    public AddSkillGroupResponse addSkillGroup(AddSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addSkillGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the AiccsSmartCall API to initiate an Intelligent Speech Interaction call.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke the AiccsSmartCall API to initiate an Intelligent Speech Interaction call.</p>
     * 
     * @param request AiccsSmartCallRequest
     * @return AiccsSmartCallResponse
     */
    public AiccsSmartCallResponse aiccsSmartCall(AiccsSmartCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.aiccsSmartCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the AiccsSmartCallOperate API to initiate a specified action during an Intelligent outbound call. This API is only used for scenarios such as parallel transfer to a human agent or allowing a human agent to listen in on the man-machine dialogue.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke the AiccsSmartCallOperate API to initiate a specified action during an Intelligent outbound call. This API is only used for scenarios such as parallel transfer to a human agent or allowing a human agent to listen in on the man-machine dialogue.</p>
     * 
     * @param request AiccsSmartCallOperateRequest
     * @return AiccsSmartCallOperateResponse
     */
    public AiccsSmartCallOperateResponse aiccsSmartCallOperate(AiccsSmartCallOperateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.aiccsSmartCallOperateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke AnswerCall to answer an incoming call.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke AnswerCall to answer an incoming call.</p>
     * 
     * @param request AnswerCallRequest
     * @return AnswerCallResponse
     */
    public AnswerCallResponse answerCall(AnswerCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.answerCallWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>After creating an Intelligent Contact Robot calling job, you can invoke this API to append job details.</li>
     * <li>Before invoking this API, ensure that you already have a successfully created Intelligent Contact Robot calling job.</li>
     * <li>If you do not have a successfully created Intelligent Contact Robot calling job, you can click <strong>Create Job</strong> on the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface or create a job by using the <a href="https://help.aliyun.com/document_detail/2718003.html">CreateTask</a> API.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Append job details.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>After creating an Intelligent Contact Robot calling job, you can invoke this API to append job details.</li>
     * <li>Before invoking this API, ensure that you already have a successfully created Intelligent Contact Robot calling job.</li>
     * <li>If you do not have a successfully created Intelligent Contact Robot calling job, you can click <strong>Create Job</strong> on the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface or create a job by using the <a href="https://help.aliyun.com/document_detail/2718003.html">CreateTask</a> API.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Append job details.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Use this operation to cancel calls. Alternatively, you can manually cancel calls in the console by navigating to <strong>Call Task Management</strong> &gt; <strong>Manage</strong> &gt; <strong>Execution Records</strong> &gt; <strong>Pending</strong>.</li>
     * <li>Before calling this operation, ensure you have created a call task and imported callee data.</li>
     * <li>If you have not created a call task, you can create one and import callee data on the <strong>Call Task Management</strong> page. You can also call the <a href="https://help.aliyun.com/document_detail/2926815.html">CreateAiCallTask</a> and <a href="">ImportTaskNumberDatas</a> operations.</li>
     * <li>Canceling a call task may affect your business. Please proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>This operation cancels calls from a call task. You cannot cancel a call if its detail record is already in the pending call queue or is in progress.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.encryptionType)) {
            query.put("EncryptionType", request.encryptionType);
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
     * <b>description</b> :
     * <ul>
     * <li>Use this operation to cancel calls. Alternatively, you can manually cancel calls in the console by navigating to <strong>Call Task Management</strong> &gt; <strong>Manage</strong> &gt; <strong>Execution Records</strong> &gt; <strong>Pending</strong>.</li>
     * <li>Before calling this operation, ensure you have created a call task and imported callee data.</li>
     * <li>If you have not created a call task, you can create one and import callee data on the <strong>Call Task Management</strong> page. You can also call the <a href="https://help.aliyun.com/document_detail/2926815.html">CreateAiCallTask</a> and <a href="">ImportTaskNumberDatas</a> operations.</li>
     * <li>Canceling a call task may affect your business. Please proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>This operation cancels calls from a call task. You cannot cancel a call if its detail record is already in the pending call queue or is in progress.</p>
     * 
     * @param request CancelAiCallDetailsRequest
     * @return CancelAiCallDetailsResponse
     */
    public CancelAiCallDetailsResponse cancelAiCallDetails(CancelAiCallDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelAiCallDetailsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can invoke this API to cancel an Intelligent Contact Robot calling job, or manually cancel the job in the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface.</li>
     * <li>After an Intelligent Contact Robot calling job is canceled, it cannot be started again. Proceed with caution.</li>
     * <li>If you want to pause a job and restart it later, you can manually pause the job in the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface or pause it by using the <a href="https://help.aliyun.com/document_detail/2718006.html">StopTask</a> API.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancel an Intelligent Contact Robot calling job.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>You can invoke this API to cancel an Intelligent Contact Robot calling job, or manually cancel the job in the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface.</li>
     * <li>After an Intelligent Contact Robot calling job is canceled, it cannot be started again. Proceed with caution.</li>
     * <li>If you want to pause a job and restart it later, you can manually pause the job in the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface or pause it by using the <a href="https://help.aliyun.com/document_detail/2718006.html">StopTask</a> API.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancel an Intelligent Contact Robot calling job.</p>
     * 
     * @param request CancelTaskRequest
     * @return CancelTaskResponse
     */
    public CancelTaskResponse cancelTask(CancelTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Currently, only changing the Live Support status to offline is supported.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Invoke ChangeChatAgentStatus to modify the Live Support status.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>Currently, only changing the Live Support status to offline is supported.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Invoke ChangeChatAgentStatus to modify the Live Support status.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before calling this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify skill group information, refer to the guidance in <a href="#api-detail-35">Request Parameters</a>.  </li>
     * <li>You can manage agents by calling <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-deleteagent">DeleteAgent</a> to delete an agent or <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-updateagent">UpdateAgent</a> to update agent data.</li>
     * </ul>
     * <h3>QPS Limit</h3>
     * <ul>
     * <li>Per-user call frequency: No rate limiting.  </li>
     * <li>API call frequency: 100 queries per second (QPS).  <blockquote>
     * <p>If the total calls from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create an agent account in the Cloud Customer Service System and return the agent ID.</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>Before calling this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify skill group information, refer to the guidance in <a href="#api-detail-35">Request Parameters</a>.  </li>
     * <li>You can manage agents by calling <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-deleteagent">DeleteAgent</a> to delete an agent or <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-updateagent">UpdateAgent</a> to update agent data.</li>
     * </ul>
     * <h3>QPS Limit</h3>
     * <ul>
     * <li>Per-user call frequency: No rate limiting.  </li>
     * <li>API call frequency: 100 queries per second (QPS).  <blockquote>
     * <p>If the total calls from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create an agent account in the Cloud Customer Service System and return the agent ID.</p>
     * 
     * @param request CreateAgentRequest
     * @return CreateAgentResponse
     */
    public CreateAgentResponse createAgent(CreateAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAgentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before creating a call task, make a test call with an agent to ensure the results meet your requirements.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a call task.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.applicationCode)) {
            query.put("ApplicationCode", request.applicationCode);
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

        if (!com.aliyun.teautil.Common.isUnset(request.lineEncoding)) {
            query.put("LineEncoding", request.lineEncoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.linePhoneNum)) {
            query.put("LinePhoneNum", request.linePhoneNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.missCallRetry)) {
            query.put("MissCallRetry", request.missCallRetry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneType)) {
            query.put("PhoneType", request.phoneType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
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
     * <b>description</b> :
     * <p>Before creating a call task, make a test call with an agent to ensure the results meet your requirements.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a call task.</p>
     * 
     * @param request CreateAiCallTaskRequest
     * @return CreateAiCallTaskResponse
     */
    public CreateAiCallTaskResponse createAiCallTask(CreateAiCallTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAiCallTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The <strong>Data</strong> field in the response parameters of this API is the job ID.  </li>
     * <li>After creating an Intelligent Outbound Call Job, if you need to make updates, you can invoke the <a href="https://help.aliyun.com/document_detail/2718021.html">UpdateAiOutboundTask</a> API to update the outbound call job.</li>
     * </ul>
     * <h3>Queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No Rate Limiting.</li>
     * <li>API frequency: 20 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create an Intelligent Outbound Call Job. You can configure the Task Type, job name, outbound caller ID, callee number deduplication policy, and other settings when creating the job.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>The <strong>Data</strong> field in the response parameters of this API is the job ID.  </li>
     * <li>After creating an Intelligent Outbound Call Job, if you need to make updates, you can invoke the <a href="https://help.aliyun.com/document_detail/2718021.html">UpdateAiOutboundTask</a> API to update the outbound call job.</li>
     * </ul>
     * <h3>Queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No Rate Limiting.</li>
     * <li>API frequency: 20 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create an Intelligent Outbound Call Job. You can configure the Task Type, job name, outbound caller ID, callee number deduplication policy, and other settings when creating the job.</p>
     * 
     * @param request CreateAiOutboundTaskRequest
     * @return CreateAiOutboundTaskResponse
     */
    public CreateAiOutboundTaskResponse createAiOutboundTask(CreateAiOutboundTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAiOutboundTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before invoking this API, we recommend that you confirm the instance ID and job ID. For guidance on how to obtain them, see the instructions in <a href="#api-detail-35">Request Parameters</a>.</p>
     * <h3>QPS limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: 20 queries per second (QPS).</li>
     * <li>API-wide invocation frequency: 20 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a batch for an Intelligent Outbound Calling job based on the instance ID and job ID, enabling data under the job to be queried by batch.</p>
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
     * <b>description</b> :
     * <p>Before invoking this API, we recommend that you confirm the instance ID and job ID. For guidance on how to obtain them, see the instructions in <a href="#api-detail-35">Request Parameters</a>.</p>
     * <h3>QPS limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: 20 queries per second (QPS).</li>
     * <li>API-wide invocation frequency: 20 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a batch for an Intelligent Outbound Calling job based on the instance ID and job ID, enabling data under the job to be queried by batch.</p>
     * 
     * @param request CreateAiOutboundTaskBatchRequest
     * @return CreateAiOutboundTaskBatchResponse
     */
    public CreateAiOutboundTaskBatchResponse createAiOutboundTaskBatch(CreateAiOutboundTaskBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAiOutboundTaskBatchWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you need to update department information, you can invoke the <a href="https://help.aliyun.com/document_detail/2717977.html">UpdateDepartment</a> API.</li>
     * <li>After successfully creating department information by invoking this API, the <strong>Data</strong> field in the response contains the department ID. If you need to query the department ID later, you can invoke the <a href="https://help.aliyun.com/document_detail/2717975.html">GetAllDepartment</a> API.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times/second.</li>
     * <li>API invocation frequency: 100 times/second.<blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates department information based on the Artificial Intelligence Cloud Call Service (AICCS) instance ID and department name. Upon successful creation, the department ID is returned.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>If you need to update department information, you can invoke the <a href="https://help.aliyun.com/document_detail/2717977.html">UpdateDepartment</a> API.</li>
     * <li>After successfully creating department information by invoking this API, the <strong>Data</strong> field in the response contains the department ID. If you need to query the department ID later, you can invoke the <a href="https://help.aliyun.com/document_detail/2717975.html">GetAllDepartment</a> API.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times/second.</li>
     * <li>API invocation frequency: 100 times/second.<blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates department information based on the Artificial Intelligence Cloud Call Service (AICCS) instance ID and department name. Upon successful creation, the department ID is returned.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>This API allows you to define information such as the external display name and description of the skill group. For details, see <a href="#api-detail-35">Request Parameters</a>.</li>
     * <li>The <strong>Data</strong> parameter returned by this API is the ID of the successfully created skill group.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 1000 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create a skill group based on the skill group name and channel type.</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>This API allows you to define information such as the external display name and description of the skill group. For details, see <a href="#api-detail-35">Request Parameters</a>.</li>
     * <li>The <strong>Data</strong> parameter returned by this API is the ID of the successfully created skill group.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 1000 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create a skill group based on the skill group name and channel type.</p>
     * 
     * @param request CreateSkillGroupRequest
     * @return CreateSkillGroupResponse
     */
    public CreateSkillGroupResponse createSkillGroup(CreateSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSkillGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can invoke this API to create a job, or create one in the <strong>Artificial Intelligence Cloud Call Service console</strong> &gt; <strong>Outbound Robot (Standard Edition)</strong> &gt; <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> by clicking <strong>Create Job</strong>.  </li>
     * <li>After invoking this API, the <strong>Data</strong> field in the response contains the unique job ID of the robot outbound calling task.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create an Artificial Intelligence Cloud Call Service robot outbound calling job.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>You can invoke this API to create a job, or create one in the <strong>Artificial Intelligence Cloud Call Service console</strong> &gt; <strong>Outbound Robot (Standard Edition)</strong> &gt; <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> by clicking <strong>Create Job</strong>.  </li>
     * <li>After invoking this API, the <strong>Data</strong> field in the response contains the unique job ID of the robot outbound calling task.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create an Artificial Intelligence Cloud Call Service robot outbound calling job.</p>
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
     * <p>Create an agent that enables password-free login to the Cloud Customer Service System based on a User Account.</p>
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
     * <p>Create an agent that enables password-free login to the Cloud Customer Service System based on a User Account.</p>
     * 
     * @param request CreateThirdSsoAgentRequest
     * @return CreateThirdSsoAgentResponse
     */
    public CreateThirdSsoAgentResponse createThirdSsoAgent(CreateThirdSsoAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createThirdSsoAgentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before deletion, we recommend that you confirm the agent account name and instance ID to be deleted. For guidance on how to obtain them, see the description of <a href="#api-detail-35">Request Parameters</a>.</li>
     * <li>If an agent is accidentally deleted, you can invoke the <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-createagent">CreateAgent</a> API to recreate the agent.<blockquote>
     * <p>If an account is re-added after deletion, the agent ID remains unchanged.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>Queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 100 queries per second.<blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an agent account in the Cloud Customer Service System based on the instance ID and agent account name.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before deletion, we recommend that you confirm the agent account name and instance ID to be deleted. For guidance on how to obtain them, see the description of <a href="#api-detail-35">Request Parameters</a>.</li>
     * <li>If an agent is accidentally deleted, you can invoke the <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-createagent">CreateAgent</a> API to recreate the agent.<blockquote>
     * <p>If an account is re-added after deletion, the agent ID remains unchanged.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>Queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 100 queries per second.<blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an agent account in the Cloud Customer Service System based on the instance ID and agent account name.</p>
     * 
     * @param request DeleteAgentRequest
     * @return DeleteAgentResponse
     */
    public DeleteAgentResponse deleteAgent(DeleteAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAgentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: Deletion is a sensitive operation. Proceed with caution.</p>
     * </blockquote>
     * <ul>
     * <li>Before deletion, we recommend that you confirm the job ID and related information. You can call the <a href="https://help.aliyun.com/document_detail/2718026.html">GetAiOutboundTaskList</a> API to view the outbound calling job list and verify the task name, description, and corresponding job ID.</li>
     * <li>If you need to recreate an Intelligent Outbound Calling job, you can call the <a href="https://help.aliyun.com/document_detail/312260.html">CreateAiOutboundTask</a> API.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 20 times/second.</li>
     * <li>API invocation frequency: 20 times/second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an Intelligent Outbound Calling job by instance ID and job ID. After deletion, the job will no longer appear in the outbound calling job list.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: Deletion is a sensitive operation. Proceed with caution.</p>
     * </blockquote>
     * <ul>
     * <li>Before deletion, we recommend that you confirm the job ID and related information. You can call the <a href="https://help.aliyun.com/document_detail/2718026.html">GetAiOutboundTaskList</a> API to view the outbound calling job list and verify the task name, description, and corresponding job ID.</li>
     * <li>If you need to recreate an Intelligent Outbound Calling job, you can call the <a href="https://help.aliyun.com/document_detail/312260.html">CreateAiOutboundTask</a> API.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 20 times/second.</li>
     * <li>API invocation frequency: 20 times/second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an Intelligent Outbound Calling job by instance ID and job ID. After deletion, the job will no longer appear in the outbound calling job list.</p>
     * 
     * @param request DeleteAiOutboundTaskRequest
     * @return DeleteAiOutboundTaskResponse
     */
    public DeleteAiOutboundTaskResponse deleteAiOutboundTask(DeleteAiOutboundTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAiOutboundTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Deletion is a sensitive operation. Proceed with caution.</li>
     * <li>Before invoking this API, we recommend that you confirm the AICCS instance ID and department ID. For guidance on how to obtain them, see the instructions in <a href="#api-detail-35">Request Parameters</a>.</li>
     * <li>If you accidentally delete department information, you can call the <a href="https://help.aliyun.com/document_detail/2717974.html">CreateDepartment</a> API to recreate it.</li>
     * </ul>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times/second.</li>
     * <li>API invocation frequency: 100 times/second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes department information based on the Artificial Intelligence Cloud Call Service (AICCS) instance ID and department ID.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Deletion is a sensitive operation. Proceed with caution.</li>
     * <li>Before invoking this API, we recommend that you confirm the AICCS instance ID and department ID. For guidance on how to obtain them, see the instructions in <a href="#api-detail-35">Request Parameters</a>.</li>
     * <li>If you accidentally delete department information, you can call the <a href="https://help.aliyun.com/document_detail/2717974.html">CreateDepartment</a> API to recreate it.</li>
     * </ul>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times/second.</li>
     * <li>API invocation frequency: 100 times/second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes department information based on the Artificial Intelligence Cloud Call Service (AICCS) instance ID and department ID.</p>
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
     * <p>Invoke the DeleteHotlineNumber API to delete a configured hotline number.</p>
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
     * <p>Invoke the DeleteHotlineNumber API to delete a configured hotline number.</p>
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
     * <b>summary</b> : 
     * <p>Invoke DeleteOuterAccount to delete an external account by its external Account ID.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke DeleteOuterAccount to delete an external account by its external Account ID.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes an external skill group based on the skill group ID and skill group channel type.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes an external skill group based on the skill group ID and skill group channel type.</p>
     * 
     * @param request DeleteSkillGroupRequest
     * @return DeleteSkillGroupResponse
     */
    public DeleteSkillGroupResponse deleteSkillGroup(DeleteSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSkillGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the DescribeRecordData API to retrieve call information.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke the DescribeRecordData API to retrieve call information.</p>
     * 
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
     * <p>Invoke EncryptPhoneNum to encrypt the User\&quot;s Phone number.</p>
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
     * <p>Invoke EncryptPhoneNum to encrypt the User\&quot;s Phone number.</p>
     * 
     * @param request EncryptPhoneNumRequest
     * @return EncryptPhoneNumResponse
     */
    public EncryptPhoneNumResponse encryptPhoneNum(EncryptPhoneNumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.encryptPhoneNumWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve or recover a call.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieve or recover a call.</p>
     * 
     * @param request FetchCallRequest
     * @return FetchCallResponse
     */
    public FetchCallResponse fetchCall(FetchCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.fetchCallWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user API call frequency: No rate limiting.</li>
     * <li>API frequency: 100 calls per second.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>End the hotline service by instance ID and agent account name.</p>
     * 
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
     * <b>description</b> :
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user API call frequency: No rate limiting.</li>
     * <li>API frequency: 100 calls per second.<blockquote>
     * <p>If the total number of calls from multiple users exceeds the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>End the hotline service by instance ID and agent account name.</p>
     * 
     * @param request FinishHotlineServiceRequest
     * @return FinishHotlineServiceResponse
     */
    public FinishHotlineServiceResponse finishHotlineService(FinishHotlineServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.finishHotlineServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can invoke this API to generate a message channel access signature. The <strong>Data</strong> field in the response contains the MessageBox message channel signature code.</li>
     * <li>Before invoking the API, we recommend that you confirm your AICCS instance ID. For instructions on how to obtain it, see the description of <a href="#api-detail-35">Request Parameters</a>.</li>
     * </ul>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API-wide frequency: 100 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generate a message channel access signature based on the Artificial Intelligence Cloud Call Service (AICCS) instance ID and agent account name.</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>You can invoke this API to generate a message channel access signature. The <strong>Data</strong> field in the response contains the MessageBox message channel signature code.</li>
     * <li>Before invoking the API, we recommend that you confirm your AICCS instance ID. For instructions on how to obtain it, see the description of <a href="#api-detail-35">Request Parameters</a>.</li>
     * </ul>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API-wide frequency: 100 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generate a message channel access signature based on the Artificial Intelligence Cloud Call Service (AICCS) instance ID and agent account name.</p>
     * 
     * @param request GenerateWebSocketSignRequest
     * @return GenerateWebSocketSignResponse
     */
    public GenerateWebSocketSignResponse generateWebSocketSign(GenerateWebSocketSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateWebSocketSignWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, confirm the AICCS instance information and the agent account name. For guidance on how to obtain these details, refer to the instructions in <a href="#api-detail-35">Request Parameters</a>.</li>
     * <li>Deleted agents can also be queried. Check the <strong>Status</strong> parameter in the response. If its value is 2, it indicates that the agent has been deleted.</li>
     * </ul>
     * <h3>queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No Rate Limiting.</li>
     * <li>API frequency: 100 times/second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query agent information in the Cloud Customer Service System by instance ID and agent account name, such as agent ID.</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, confirm the AICCS instance information and the agent account name. For guidance on how to obtain these details, refer to the instructions in <a href="#api-detail-35">Request Parameters</a>.</li>
     * <li>Deleted agents can also be queried. Check the <strong>Status</strong> parameter in the response. If its value is 2, it indicates that the agent has been deleted.</li>
     * </ul>
     * <h3>queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No Rate Limiting.</li>
     * <li>API frequency: 100 times/second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query agent information in the Cloud Customer Service System by instance ID and agent account name, such as agent ID.</p>
     * 
     * @param request GetAgentRequest
     * @return GetAgentResponse
     */
    public GetAgentResponse getAgent(GetAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to provide agent or department information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the agent-level status metrics under hotline monitoring. Supports queries by instance, time range, agent, and department group.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to provide agent or department information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the agent-level status metrics under hotline monitoring. Supports queries by instance, time range, agent, and department group.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before you invoke this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to provide agent or department information, refer to the instructions in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.  <blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve the summary data of hotline agent details under hotline reports. Supports queries by instance, time range, agent, and department group.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before you invoke this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to provide agent or department information, refer to the instructions in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.  <blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve the summary data of hotline agent details under hotline reports. Supports queries by instance, time range, agent, and department group.</p>
     * 
     * @param request GetAgentDetailReportRequest
     * @return GetAgentDetailReportResponse
     */
    public GetAgentDetailReportResponse getAgentDetailReport(GetAgentDetailReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgentDetailReportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.</li>
     * <li>If you need to specify department or skill group information, refer to the instructions in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 10 requests per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain real-time agent detail data grouped by instance, department, and skill group (real-time data).</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.</li>
     * <li>If you need to specify department or skill group information, refer to the instructions in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 10 requests per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain real-time agent detail data grouped by instance, department, and skill group (real-time data).</p>
     * 
     * @param request GetAgentIndexRealTimeRequest
     * @return GetAgentIndexRealTimeResponse
     */
    public GetAgentIndexRealTimeResponse getAgentIndexRealTime(GetAgentIndexRealTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgentIndexRealTimeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to provide agent or department information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 queries per second.</li>
     * <li>API-wide invocation frequency: 100 queries per second.<blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API-wide frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the agent service status metrics from online reports. Supports queries by instance, time range, agent, and department group.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to provide agent or department information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 queries per second.</li>
     * <li>API-wide invocation frequency: 100 queries per second.<blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API-wide frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the agent service status metrics from online reports. Supports queries by instance, time range, agent, and department group.</p>
     * 
     * @param request GetAgentServiceStatusRequest
     * @return GetAgentServiceStatusResponse
     */
    public GetAgentServiceStatusResponse getAgentServiceStatus(GetAgentServiceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgentServiceStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify agent or department information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.<blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API-wide frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain agent-level statistics under hotline monitoring. Supports querying by instance, time range, agent, and department group.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify agent or department information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.<blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API-wide frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain agent-level statistics under hotline monitoring. Supports querying by instance, time range, agent, and department group.</p>
     * 
     * @param request GetAgentStatisticsRequest
     * @return GetAgentStatisticsResponse
     */
    public GetAgentStatisticsResponse getAgentStatistics(GetAgentStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgentStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Call frequency per user: 100 times/second.</li>
     * <li>API call frequency: 100 times/second.<blockquote>
     * <p>If the total calls from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query the business information associated with this call by instance ID and session ID.</p>
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
     * <b>description</b> :
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Call frequency per user: 100 times/second.</li>
     * <li>API call frequency: 100 times/second.<blockquote>
     * <p>If the total calls from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query the business information associated with this call by instance ID and session ID.</p>
     * 
     * @param request GetAiOutboundTaskBizDataRequest
     * @return GetAiOutboundTaskBizDataResponse
     */
    public GetAiOutboundTaskBizDataResponse getAiOutboundTaskBizData(GetAiOutboundTaskBizDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAiOutboundTaskBizDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The outbound call job details include the job ID, job status, task type, outbound caller number, callee number repetition policy, and other information. For more information, see <a href="#api-detail-40">Response parameters</a>.  </p>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API invocation frequency: 100 times per second.  <blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the outbound call job details by instance ID and job ID.</p>
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
     * <b>description</b> :
     * <p>The outbound call job details include the job ID, job status, task type, outbound caller number, callee number repetition policy, and other information. For more information, see <a href="#api-detail-40">Response parameters</a>.  </p>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API invocation frequency: 100 times per second.  <blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the outbound call job details by instance ID and job ID.</p>
     * 
     * @param request GetAiOutboundTaskDetailRequest
     * @return GetAiOutboundTaskDetailResponse
     */
    public GetAiOutboundTaskDetailResponse getAiOutboundTaskDetail(GetAiOutboundTaskDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAiOutboundTaskDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The task execution details include the total number of jobs, job batches, outbound call numbers, corresponding call counts, execution status, and other information.</p>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times/second.</li>
     * <li>API invocation frequency: 100 times/second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain task execution details by instance ID and job ID.</p>
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
     * <b>description</b> :
     * <p>The task execution details include the total number of jobs, job batches, outbound call numbers, corresponding call counts, execution status, and other information.</p>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times/second.</li>
     * <li>API invocation frequency: 100 times/second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain task execution details by instance ID and job ID.</p>
     * 
     * @param request GetAiOutboundTaskExecDetailRequest
     * @return GetAiOutboundTaskExecDetailResponse
     */
    public GetAiOutboundTaskExecDetailResponse getAiOutboundTaskExecDetail(GetAiOutboundTaskExecDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAiOutboundTaskExecDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The job list contains job information, including job ID, Task Status, Task Name, task completion rate, and more. For details, see <a href="#api-detail-40">Response parameters</a>.</li>
     * <li>If you need to update job information, you can invoke the <a href="https://help.aliyun.com/document_detail/2718021.html">UpdateAiOutboundTask</a> API.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times/second.</li>
     * <li>API invocation frequency: 100 times/second.<blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve the outbound call job list by instance ID and Task Type.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>The job list contains job information, including job ID, Task Status, Task Name, task completion rate, and more. For details, see <a href="#api-detail-40">Response parameters</a>.</li>
     * <li>If you need to update job information, you can invoke the <a href="https://help.aliyun.com/document_detail/2718021.html">UpdateAiOutboundTask</a> API.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times/second.</li>
     * <li>API invocation frequency: 100 times/second.<blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve the outbound call job list by instance ID and Task Type.</p>
     * 
     * @param request GetAiOutboundTaskListRequest
     * @return GetAiOutboundTaskListResponse
     */
    public GetAiOutboundTaskListResponse getAiOutboundTaskList(GetAiOutboundTaskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAiOutboundTaskListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, we recommend that you confirm the instance ID and job ID. For more information, see <a href="#api-detail-35">Request Parameters</a>.  </li>
     * <li>The outbound call job progress includes information such as job ID, Task Type, job completion rate, agent connection rate, and customer connection rate. For details, see <a href="#api-detail-40">Response Parameters</a>.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times/second.  </li>
     * <li>API-wide invocation frequency: 100 times/second.  <blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the outbound call job progress by instance ID and job ID.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, we recommend that you confirm the instance ID and job ID. For more information, see <a href="#api-detail-35">Request Parameters</a>.  </li>
     * <li>The outbound call job progress includes information such as job ID, Task Type, job completion rate, agent connection rate, and customer connection rate. For details, see <a href="#api-detail-40">Response Parameters</a>.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times/second.  </li>
     * <li>API-wide invocation frequency: 100 times/second.  <blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the outbound call job progress by instance ID and job ID.</p>
     * 
     * @param request GetAiOutboundTaskProgressRequest
     * @return GetAiOutboundTaskProgressResponse
     */
    public GetAiOutboundTaskProgressResponse getAiOutboundTaskProgress(GetAiOutboundTaskProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAiOutboundTaskProgressWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can invoke this API to obtain department IDs for department group queries in certain data query APIs (such as <a href="https://help.aliyun.com/document_detail/2717938.html">GetHotlineServiceStatistics</a>).  </li>
     * <li>After creating, deleting, or updating department information, you can invoke this API to confirm whether the department information matches your expectations.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times/second.  </li>
     * <li>API invocation frequency: 100 times/second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>You can invoke this API to obtain department IDs for department group queries in certain data query APIs (such as <a href="https://help.aliyun.com/document_detail/2717938.html">GetHotlineServiceStatistics</a>).  </li>
     * <li>After creating, deleting, or updating department information, you can invoke this API to confirm whether the department information matches your expectations.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times/second.  </li>
     * <li>API invocation frequency: 100 times/second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
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
     * <p>Retrieves the upload address for a voice memo recording.</p>
     * 
     * @param request GetAudioNoteUploadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAudioNoteUploadUrlResponse
     */
    public GetAudioNoteUploadUrlResponse getAudioNoteUploadUrlWithOptions(GetAudioNoteUploadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("FileType", request.fileType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAudioNoteUploadUrl"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAudioNoteUploadUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the upload address for a voice memo recording.</p>
     * 
     * @param request GetAudioNoteUploadUrlRequest
     * @return GetAudioNoteUploadUrlResponse
     */
    public GetAudioNoteUploadUrlResponse getAudioNoteUploadUrl(GetAudioNoteUploadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAudioNoteUploadUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the dialog content for a call by using its call ID. You can retrieve content for calls completed within the last 30 days.</p>
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
     * <p>Retrieves the dialog content for a call by using its call ID. You can retrieve content for calls completed within the last 30 days.</p>
     * 
     * @param request GetCallDialogContentRequest
     * @return GetCallDialogContentResponse
     */
    public GetCallDialogContentResponse getCallDialogContent(GetCallDialogContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCallDialogContentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <p>Before invoking this API, ensure that call recording was enabled during the invocation of the <a href="https://help.aliyun.com/document_detail/223270.html">RobotCall</a> API and that you successfully received the recording receipt, indicating that the recording file has been generated. Otherwise, an invalid URL will be returned.</p>
     * <h3>How-To</h3>
     * <p>This API serves as a supplementary method to the recording receipt. If the URL in the recording receipt message expires, you can use this API to obtain a new recording URL. By default, the validity period of the recording receipt URL is three days.</p>
     * <blockquote>
     * <p>We recommend that you directly download the recording content using the recording receipt URL and save it locally, rather than relying on the receipt URL, to avoid issues caused by expiration.</p>
     * </blockquote>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second (QPS).<blockquote>
     * <p>Throttling will be triggered if the total invocations from multiple users exceed the API frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the URL of a call recording file based on the call creation time and the unique call ID, and then retrieve the call recording file using the URL.</p>
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
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <p>Before invoking this API, ensure that call recording was enabled during the invocation of the <a href="https://help.aliyun.com/document_detail/223270.html">RobotCall</a> API and that you successfully received the recording receipt, indicating that the recording file has been generated. Otherwise, an invalid URL will be returned.</p>
     * <h3>How-To</h3>
     * <p>This API serves as a supplementary method to the recording receipt. If the URL in the recording receipt message expires, you can use this API to obtain a new recording URL. By default, the validity period of the recording receipt URL is three days.</p>
     * <blockquote>
     * <p>We recommend that you directly download the recording content using the recording receipt URL and save it locally, rather than relying on the receipt URL, to avoid issues caused by expiration.</p>
     * </blockquote>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second (QPS).<blockquote>
     * <p>Throttling will be triggered if the total invocations from multiple users exceed the API frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the URL of a call recording file based on the call creation time and the unique call ID, and then retrieve the call recording file using the URL.</p>
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
     * <p>Invoke the GetConfigNumList API to obtain the hotline settings number list.</p>
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
     * <p>Invoke the GetConfigNumList API to obtain the hotline settings number list.</p>
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
     * <p>You can invoke the GetCustomerInfo API to obtain membership details by Workbench membership ID.</p>
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
     * <p>You can invoke the GetCustomerInfo API to obtain membership details by Workbench membership ID.</p>
     * 
     * @param request GetCustomerInfoRequest
     * @return GetCustomerInfoResponse
     */
    public GetCustomerInfoResponse getCustomerInfo(GetCustomerInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomerInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The skill groups returned by this API are grouped by department ID, which can be specified when you <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-createskillgroup">create a skill group</a>.</li>
     * <li>To query detailed skill group information, you can invoke the <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-queryskillgroups">QuerySkillGroups</a> API.</li>
     * <li>Before invoking this API, you should confirm the AICCS instance ID and agent ID. For guidance on how to obtain them, see the description of <a href="#api-detail-35">Request Parameters</a>.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 1000 queries per second.</li>
     * <li>API-wide invocation frequency: 1000 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries skill group categories and the skill group list by AICCS instance ID and agent ID.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>The skill groups returned by this API are grouped by department ID, which can be specified when you <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-createskillgroup">create a skill group</a>.</li>
     * <li>To query detailed skill group information, you can invoke the <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-queryskillgroups">QuerySkillGroups</a> API.</li>
     * <li>Before invoking this API, you should confirm the AICCS instance ID and agent ID. For guidance on how to obtain them, see the description of <a href="#api-detail-35">Request Parameters</a>.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 1000 queries per second.</li>
     * <li>API-wide invocation frequency: 1000 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries skill group categories and the skill group list by AICCS instance ID and agent ID.</p>
     * 
     * @param request GetDepGroupTreeDataRequest
     * @return GetDepGroupTreeDataResponse
     */
    public GetDepGroupTreeDataResponse getDepGroupTreeData(GetDepGroupTreeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDepGroupTreeDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify department information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times/second.  </li>
     * <li>API-wide invocation frequency: 100 times/second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain department-level status metrics under hotline monitoring. Supports queries by instance, time range, and department group.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify department information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times/second.  </li>
     * <li>API-wide invocation frequency: 100 times/second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain department-level status metrics under hotline monitoring. Supports queries by instance, time range, and department group.</p>
     * 
     * @param request GetDepartmentalLatitudeAgentStatusRequest
     * @return GetDepartmentalLatitudeAgentStatusResponse
     */
    public GetDepartmentalLatitudeAgentStatusResponse getDepartmentalLatitudeAgentStatus(GetDepartmentalLatitudeAgentStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDepartmentalLatitudeAgentStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The hotline agent details include information such as agent posture status, agent ID, and heartbeat signature. For more information, see <a href="#api-detail-40">Response parameters</a>.  </p>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: Rate Limiting is not applied.  </li>
     * <li>API frequency: 100 queries per second (QPS).  <blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the current service details of a hotline agent based on the instance ID and agent account name.</p>
     * 
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
     * <b>description</b> :
     * <p>The hotline agent details include information such as agent posture status, agent ID, and heartbeat signature. For more information, see <a href="#api-detail-40">Response parameters</a>.  </p>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: Rate Limiting is not applied.  </li>
     * <li>API frequency: 100 queries per second (QPS).  <blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the current service details of a hotline agent based on the instance ID and agent account name.</p>
     * 
     * @param request GetHotlineAgentDetailRequest
     * @return GetHotlineAgentDetailResponse
     */
    public GetHotlineAgentDetailResponse getHotlineAgentDetail(GetHotlineAgentDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHotlineAgentDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/document_detail/276009.html">activated the service</a> and <a href="https://help.aliyun.com/document_detail/276011.html">created an instance</a>.</li>
     * <li>If you need to specify department or skill group information, refer to the instructions in the <a href="#api-detail-35">Request Parameters</a> section.<blockquote>
     * <p>Query logic priority:</p>
     * <ul>
     * <li>If GroupIds is not empty, query data metrics under the specified skill groups.</li>
     * <li>Otherwise, if DepIds is not empty, query data metrics under the corresponding department groups.</li>
     * <li>Otherwise, query data metrics under the AICCS instance.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>QPS Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 10 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain detailed data metrics by hotline agent dimension (T+1). Supports grouping queries by instance, time range, department, and skill group.</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/document_detail/276009.html">activated the service</a> and <a href="https://help.aliyun.com/document_detail/276011.html">created an instance</a>.</li>
     * <li>If you need to specify department or skill group information, refer to the instructions in the <a href="#api-detail-35">Request Parameters</a> section.<blockquote>
     * <p>Query logic priority:</p>
     * <ul>
     * <li>If GroupIds is not empty, query data metrics under the specified skill groups.</li>
     * <li>Otherwise, if DepIds is not empty, query data metrics under the corresponding department groups.</li>
     * <li>Otherwise, query data metrics under the AICCS instance.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>QPS Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 10 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain detailed data metrics by hotline agent dimension (T+1). Supports grouping queries by instance, time range, department, and skill group.</p>
     * 
     * @param request GetHotlineAgentDetailReportRequest
     * @return GetHotlineAgentDetailReportResponse
     */
    public GetHotlineAgentDetailReportResponse getHotlineAgentDetailReport(GetHotlineAgentDetailReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHotlineAgentDetailReportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, confirm the AICCS instance information and the agent account name. For guidance on how to obtain these details, see the description in <a href="#api-detail-35">Request Parameters</a>.  </li>
     * <li>To retrieve detailed information about a hotline agent, you can invoke the <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-gethotlineagentdetail">GetHotlineAgentDetail</a> API.</li>
     * </ul>
     * <h3>Queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.  </li>
     * <li>API-wide frequency: 200 queries per second.  <blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the hotline agent status in the Cloud Customer Service System by AICCS instance ID and agent account name.</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, confirm the AICCS instance information and the agent account name. For guidance on how to obtain these details, see the description in <a href="#api-detail-35">Request Parameters</a>.  </li>
     * <li>To retrieve detailed information about a hotline agent, you can invoke the <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-gethotlineagentdetail">GetHotlineAgentDetail</a> API.</li>
     * </ul>
     * <h3>Queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.  </li>
     * <li>API-wide frequency: 200 queries per second.  <blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the hotline agent status in the Cloud Customer Service System by AICCS instance ID and agent account name.</p>
     * 
     * @param request GetHotlineAgentStatusRequest
     * @return GetHotlineAgentStatusResponse
     */
    public GetHotlineAgentStatusResponse getHotlineAgentStatus(GetHotlineAgentStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHotlineAgentStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 50 times/second.  </li>
     * <li>API invocation frequency: 100 times/second.  <blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invoke the GetHotlineCallAction API to query the result data of call actions.</p>
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
     * <b>description</b> :
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 50 times/second.  </li>
     * <li>API invocation frequency: 100 times/second.  <blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invoke the GetHotlineCallAction API to query the result data of call actions.</p>
     * 
     * @param request GetHotlineCallActionRequest
     * @return GetHotlineCallActionResponse
     */
    public GetHotlineCallActionResponse getHotlineCallAction(GetHotlineCallActionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHotlineCallActionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/document_detail/276009.html">activated the service</a> and <a href="https://help.aliyun.com/document_detail/276011.html">created an instance</a>.  </li>
     * <li>If you need to specify agent, department, or skill group information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No Rate Limiting.  </li>
     * <li>API frequency: 10 queries per second.<blockquote>
     * <p>Throttle will be triggered if the total invocations from multiple users exceed the API frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve detailed (T+1) data by hotline skill group dimension. Supports grouping by instance, time range, department, and skill group.</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/document_detail/276009.html">activated the service</a> and <a href="https://help.aliyun.com/document_detail/276011.html">created an instance</a>.  </li>
     * <li>If you need to specify agent, department, or skill group information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No Rate Limiting.  </li>
     * <li>API frequency: 10 queries per second.<blockquote>
     * <p>Throttle will be triggered if the total invocations from multiple users exceed the API frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve detailed (T+1) data by hotline skill group dimension. Supports grouping by instance, time range, department, and skill group.</p>
     * 
     * @param request GetHotlineGroupDetailReportRequest
     * @return GetHotlineGroupDetailReportResponse
     */
    public GetHotlineGroupDetailReportResponse getHotlineGroupDetailReport(GetHotlineGroupDetailReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHotlineGroupDetailReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the GetHotlineMessageLog API to retrieve hotline message records.</p>
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
     * <p>Invoke the GetHotlineMessageLog API to retrieve hotline message records.</p>
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
     * <p>Invoke the GetHotlineRuntimeInfo API to query hotline runtime information.</p>
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
     * <p>Invoke the GetHotlineRuntimeInfo API to query hotline runtime information.</p>
     * 
     * @param request GetHotlineRuntimeInfoRequest
     * @return GetHotlineRuntimeInfoResponse
     */
    public GetHotlineRuntimeInfoResponse getHotlineRuntimeInfo(GetHotlineRuntimeInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHotlineRuntimeInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to provide agent, department, or skill group information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.  <blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API-wide frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain service statistics under hotline monitoring. Supports grouped queries by instance, time dimension, agent, department, and skill group.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to provide agent, department, or skill group information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.  <blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API-wide frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain service statistics under hotline monitoring. Supports grouped queries by instance, time dimension, agent, department, and skill group.</p>
     * 
     * @param request GetHotlineServiceStatisticsRequest
     * @return GetHotlineServiceStatisticsResponse
     */
    public GetHotlineServiceStatisticsResponse getHotlineServiceStatistics(GetHotlineServiceStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHotlineServiceStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the queue length of hotline members.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Obtain the queue length of hotline members.</p>
     * 
     * @param request GetHotlineWaitingNumberRequest
     * @return GetHotlineWaitingNumberResponse
     */
    public GetHotlineWaitingNumberResponse getHotlineWaitingNumber(GetHotlineWaitingNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHotlineWaitingNumberWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The current data statistics metrics include cumulative metrics for the day and real-time metrics.  </li>
     * <li>If you need to specify department or skill group information, refer to the instructions in the <a href="#api-detail-35">Request Parameters</a> section.<blockquote>
     * <p>Query logic priority:  </p>
     * <ul>
     * <li>If GroupIds is not empty, query the data metrics for the specified skill groups.  </li>
     * <li>Otherwise, if DepIds is not empty, query the data metrics for the specified departments.  </li>
     * <li>Otherwise, query the data metrics for the Artificial Intelligence Cloud Call Service (AICCS) instance.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.  </li>
     * <li>API frequency: 100 times per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can obtain the current statistical metrics (real-time data) and query them by instance ID, department, or skill group.</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>The current data statistics metrics include cumulative metrics for the day and real-time metrics.  </li>
     * <li>If you need to specify department or skill group information, refer to the instructions in the <a href="#api-detail-35">Request Parameters</a> section.<blockquote>
     * <p>Query logic priority:  </p>
     * <ul>
     * <li>If GroupIds is not empty, query the data metrics for the specified skill groups.  </li>
     * <li>Otherwise, if DepIds is not empty, query the data metrics for the specified departments.  </li>
     * <li>Otherwise, query the data metrics for the Artificial Intelligence Cloud Call Service (AICCS) instance.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.  </li>
     * <li>API frequency: 100 times per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can obtain the current statistical metrics (real-time data) and query them by instance ID, department, or skill group.</p>
     * 
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
     * <p>Invoke the GetMcuLvsIp API to query the hotline server IP address.</p>
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
     * <p>Invoke the GetMcuLvsIp API to query the hotline server IP address.</p>
     * 
     * @param request GetMcuLvsIpRequest
     * @return GetMcuLvsIpResponse
     */
    public GetMcuLvsIpResponse getMcuLvsIp(GetMcuLvsIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMcuLvsIpWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 100 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the number\&quot;s归属地 information based on the instance ID and phone number.</p>
     * 
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
     * <b>description</b> :
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 100 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the number\&quot;s归属地 information based on the instance ID and phone number.</p>
     * 
     * @param request GetNumLocationRequest
     * @return GetNumLocationResponse
     */
    public GetNumLocationResponse getNumLocation(GetNumLocationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNumLocationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify agent or department information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.  <blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API-wide frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain online agent information data under real-time monitoring. Support queries by instance, time range, agent, and department group.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify agent or department information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.  <blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API-wide frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain online agent information data under real-time monitoring. Support queries by instance, time range, agent, and department group.</p>
     * 
     * @param request GetOnlineSeatInformationRequest
     * @return GetOnlineSeatInformationResponse
     */
    public GetOnlineSeatInformationResponse getOnlineSeatInformation(GetOnlineSeatInformationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOnlineSeatInformationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify agent, department, or skill group information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.  <blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the volume of Online Services under online monitoring. Support grouped queries by instance, time range, agent, department, and skill group.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify agent, department, or skill group information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.  <blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the volume of Online Services under online monitoring. Support grouped queries by instance, time range, agent, department, and skill group.</p>
     * 
     * @param request GetOnlineServiceVolumeRequest
     * @return GetOnlineServiceVolumeResponse
     */
    public GetOnlineServiceVolumeResponse getOnlineServiceVolume(GetOnlineServiceVolumeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOnlineServiceVolumeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the list of external hotline numbers.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieve the list of external hotline numbers.</p>
     * 
     * @param request GetOutbounNumListRequest
     * @return GetOutbounNumListResponse
     */
    public GetOutbounNumListResponse getOutbounNumList(GetOutbounNumListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOutbounNumListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke GetQualityProjectDetail to obtain the quality inspection job details.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke GetQualityProjectDetail to obtain the quality inspection job details.</p>
     * 
     * @param request GetQualityProjectDetailRequest
     * @return GetQualityProjectDetailResponse
     */
    public GetQualityProjectDetailResponse getQualityProjectDetail(GetQualityProjectDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityProjectDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke GetQualityProjectList to obtain the quality inspection job list.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke GetQualityProjectList to obtain the quality inspection job list.</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify department or skill group information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain queue information under the skill group dimension in online monitoring. Supports queries grouped by instance, time range, department, and skill group.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify department or skill group information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain queue information under the skill group dimension in online monitoring. Supports queries grouped by instance, time range, department, and skill group.</p>
     * 
     * @param request GetQueueInformationRequest
     * @return GetQueueInformationResponse
     */
    public GetQueueInformationResponse getQueueInformation(GetQueueInformationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueueInformationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the GetRecordData API to obtain a recording file.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke the GetRecordData API to obtain a recording file.</p>
     * 
     * @param request GetRecordDataRequest
     * @return GetRecordDataResponse
     */
    public GetRecordDataResponse getRecordData(GetRecordDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRecordDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the GetRecordUrl API to obtain the incoming and outgoing calls recording link.</p>
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
     * <p>Invoke the GetRecordUrl API to obtain the incoming and outgoing calls recording link.</p>
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
     * <p>Invoke GetRtcToken to obtain the token for a shift agent.</p>
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
     * <p>Invoke GetRtcToken to obtain the token for a shift agent.</p>
     * 
     * @param request GetRtcTokenRequest
     * @return GetRtcTokenResponse
     */
    public GetRtcTokenResponse getRtcToken(GetRtcTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRtcTokenWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify department information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain agent service capacity data under online monitoring. Supports queries by instance, time range, and department group.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify department information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain agent service capacity data under online monitoring. Supports queries by instance, time range, and department group.</p>
     * 
     * @param request GetSeatInformationRequest
     * @return GetSeatInformationResponse
     */
    public GetSeatInformationResponse getSeatInformation(GetSeatInformationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSeatInformationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify department or skill group information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.  <blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the service status metrics of skill groups. Support grouped queries by instance, time range, department, and skill group.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify department or skill group information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.  <blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the service status metrics of skill groups. Support grouped queries by instance, time range, department, and skill group.</p>
     * 
     * @param request GetSkillGroupAgentStatusDetailsRequest
     * @return GetSkillGroupAgentStatusDetailsResponse
     */
    public GetSkillGroupAgentStatusDetailsResponse getSkillGroupAgentStatusDetails(GetSkillGroupAgentStatusDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSkillGroupAgentStatusDetailsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify department or skill group information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.  <blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API-wide frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the aggregated agent status metrics for skill groups under hotline monitoring. Supports grouped queries by instance, time range, department, and skill group.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify department or skill group information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.  <blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API-wide frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the aggregated agent status metrics for skill groups under hotline monitoring. Supports grouped queries by instance, time range, department, and skill group.</p>
     * 
     * @param request GetSkillGroupAndAgentStatusSummaryRequest
     * @return GetSkillGroupAndAgentStatusSummaryResponse
     */
    public GetSkillGroupAndAgentStatusSummaryResponse getSkillGroupAndAgentStatusSummary(GetSkillGroupAndAgentStatusSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSkillGroupAndAgentStatusSummaryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify department or skill group information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the hotline monitoring status metrics by skill group dimension. Supports queries grouped by instance, time range, department, and skill group.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify department or skill group information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the hotline monitoring status metrics by skill group dimension. Supports queries grouped by instance, time range, department, and skill group.</p>
     * 
     * @param request GetSkillGroupLatitudeStateRequest
     * @return GetSkillGroupLatitudeStateResponse
     */
    public GetSkillGroupLatitudeStateResponse getSkillGroupLatitudeState(GetSkillGroupLatitudeStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSkillGroupLatitudeStateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify department or skill group information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.  <blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API-wide frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve skill group–level service capacity data under online monitoring. Supports queries grouped by instance, time range, department, and skill group.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify department or skill group information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.  <blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API-wide frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve skill group–level service capacity data under online monitoring. Supports queries grouped by instance, time range, department, and skill group.</p>
     * 
     * @param request GetSkillGroupServiceCapabilityRequest
     * @return GetSkillGroupServiceCapabilityResponse
     */
    public GetSkillGroupServiceCapabilityResponse getSkillGroupServiceCapability(GetSkillGroupServiceCapabilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSkillGroupServiceCapabilityWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API invocation frequency: 100 times per second.  <blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the service status metrics of skill groups in online reports.</p>
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
     * <b>description</b> :
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API invocation frequency: 100 times per second.  <blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the service status metrics of skill groups in online reports.</p>
     * 
     * @param request GetSkillGroupServiceStatusRequest
     * @return GetSkillGroupServiceStatusResponse
     */
    public GetSkillGroupServiceStatusResponse getSkillGroupServiceStatus(GetSkillGroupServiceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSkillGroupServiceStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify agent, department, or skill group information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.  <blockquote>
     * <p>Throttling will be triggered if the total invocations from multiple users exceed the API frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the total status count of skill groups under hotline reports. Supports grouped queries by instance, time range, agent, department, and skill group.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have <a href="https://help.aliyun.com/zh/aiccs/user-guide/activate-aiccs?spm=a2c4g.11186623.0.0.38365923RQDwdH">activated the service</a> and <a href="https://help.aliyun.com/zh/aiccs/user-guide/create-an-instance?spm=a2c4g.11186623.0.0.8e0b5a2fWNeRUn">created an instance</a>.  </li>
     * <li>If you need to specify agent, department, or skill group information, refer to the guidance in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.  </li>
     * <li>API-wide invocation frequency: 100 times per second.  <blockquote>
     * <p>Throttling will be triggered if the total invocations from multiple users exceed the API frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the total status count of skill groups under hotline reports. Supports grouped queries by instance, time range, agent, department, and skill group.</p>
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
     * <p>Cancel dual-call.</p>
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
     * <p>Cancel dual-call.</p>
     * 
     * @param request HangUpDoubleCallRequest
     * @return HangUpDoubleCallResponse
     */
    public HangUpDoubleCallResponse hangUpDoubleCall(HangUpDoubleCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.hangUpDoubleCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke HangupCall to execute the agent hang-up operation.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke HangupCall to execute the agent hang-up operation.</p>
     * 
     * @param request HangupCallRequest
     * @return HangupCallResponse
     */
    public HangupCallResponse hangupCall(HangupCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.hangupCallWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you hang up a call in Communication Intelligence Engine, ensure that a call has been initiated by a large model.</li>
     * <li>If a call has not been initiated, use the <a href="https://help.aliyun.com/document_detail/2862828.html">LlmSmartCall</a> or <a href="https://help.aliyun.com/document_detail/2881065.html">LlmSmartCallEncrypt</a> operation to do so.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Hangs up a call in Communication Intelligence Engine.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before you hang up a call in Communication Intelligence Engine, ensure that a call has been initiated by a large model.</li>
     * <li>If a call has not been initiated, use the <a href="https://help.aliyun.com/document_detail/2862828.html">LlmSmartCall</a> or <a href="https://help.aliyun.com/document_detail/2881065.html">LlmSmartCallEncrypt</a> operation to do so.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Hangs up a call in Communication Intelligence Engine.</p>
     * 
     * @param request HangupOperateRequest
     * @return HangupOperateResponse
     */
    public HangupOperateResponse hangupOperate(HangupOperateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.hangupOperateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Hang up a third-party call.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Hang up a third-party call.</p>
     * 
     * @param request HangupThirdCallRequest
     * @return HangupThirdCallResponse
     */
    public HangupThirdCallResponse hangupThirdCall(HangupThirdCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.hangupThirdCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Hold the call.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Hold the call.</p>
     * 
     * @param request HoldCallRequest
     * @return HoldCallResponse
     */
    public HoldCallResponse holdCall(HoldCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.holdCallWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Call details include the total number of records, call result, agent name, call time, and other information.</p>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No Rate Limiting.</li>
     * <li>API frequency: 80 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query call details by instance ID.</p>
     * 
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
     * <b>description</b> :
     * <p>Call details include the total number of records, call result, agent name, call time, and other information.</p>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No Rate Limiting.</li>
     * <li>API frequency: 80 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query call details by instance ID.</p>
     * 
     * @param request HotlineSessionQueryRequest
     * @return HotlineSessionQueryResponse
     */
    public HotlineSessionQueryResponse hotlineSessionQuery(HotlineSessionQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.hotlineSessionQueryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Imports a single phone number to a task.</p>
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
        if (!com.aliyun.teautil.Common.isUnset(request.encryptionType)) {
            query.put("EncryptionType", request.encryptionType);
        }

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
     * <p>Imports a single phone number to a task.</p>
     * 
     * @param request ImportOneTaskPhoneNumberRequest
     * @return ImportOneTaskPhoneNumberResponse
     */
    public ImportOneTaskPhoneNumberResponse importOneTaskPhoneNumber(ImportOneTaskPhoneNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importOneTaskPhoneNumberWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can import callee data by calling this operation. Alternatively, go to the <strong>call task management</strong> page, click <strong>Import Callee Data</strong>, download the template, and then upload your file.</li>
     * <li>This API operation currently supports only the JSON data type for importing callee data.</li>
     * <li>Ensure that you have created a call task before you call this operation.</li>
     * <li>To create a call task, go to the <strong>call task management</strong> page and click <strong>Create Call Task</strong>, or call the <a href="https://help.aliyun.com/document_detail/2926796.html">CreateAiCallTask</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Imports callee data for a call task.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.encryptionType)) {
            query.put("EncryptionType", request.encryptionType);
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
     * <b>description</b> :
     * <ul>
     * <li>You can import callee data by calling this operation. Alternatively, go to the <strong>call task management</strong> page, click <strong>Import Callee Data</strong>, download the template, and then upload your file.</li>
     * <li>This API operation currently supports only the JSON data type for importing callee data.</li>
     * <li>Ensure that you have created a call task before you call this operation.</li>
     * <li>To create a call task, go to the <strong>call task management</strong> page and click <strong>Create Call Task</strong>, or call the <a href="https://help.aliyun.com/document_detail/2926796.html">CreateAiCallTask</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Imports callee data for a call task.</p>
     * 
     * @param request ImportTaskNumberDatasRequest
     * @return ImportTaskNumberDatasResponse
     */
    public ImportTaskNumberDatasResponse importTaskNumberDatas(ImportTaskNumberDatasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importTaskNumberDatasWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>After importing outbound call callee numbers, the outbound calling job can operate normally.  </li>
     * <li>Before invoking this API, we recommend that you confirm the instance ID and job ID. For more information, see <a href="#api-detail-35">Request Parameters</a>.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 20 times/second.  </li>
     * <li>API invocation frequency: 50 times/second.  <blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Import outbound call callee numbers based on the instance ID and job ID.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>After importing outbound call callee numbers, the outbound calling job can operate normally.  </li>
     * <li>Before invoking this API, we recommend that you confirm the instance ID and job ID. For more information, see <a href="#api-detail-35">Request Parameters</a>.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 20 times/second.  </li>
     * <li>API invocation frequency: 50 times/second.  <blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Import outbound call callee numbers based on the instance ID and job ID.</p>
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
     * <b>summary</b> : 
     * <p>Add a third party to the call.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Add a third party to the call.</p>
     * 
     * @param request JoinThirdCallRequest
     * @return JoinThirdCallResponse
     */
    public JoinThirdCallResponse joinThirdCall(JoinThirdCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.joinThirdCallWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, confirm the AICCS instance information and skill group information. For guidance on how to obtain these details, refer to the description of <a href="#api-detail-35">Request Parameters</a>.</li>
     * <li>If an agent is not assigned to any skill group, you can invoke <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-getagent">GetAgent</a> to query the agent information.</li>
     * </ul>
     * <h3>Queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 100 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query the agent list in the Cloud Customer Service System by AICCS instance ID and skill group ID.</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, confirm the AICCS instance information and skill group information. For guidance on how to obtain these details, refer to the description of <a href="#api-detail-35">Request Parameters</a>.</li>
     * <li>If an agent is not assigned to any skill group, you can invoke <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-getagent">GetAgent</a> to query the agent information.</li>
     * </ul>
     * <h3>Queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 100 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query the agent list in the Cloud Customer Service System by AICCS instance ID and skill group ID.</p>
     * 
     * @param request ListAgentBySkillGroupIdRequest
     * @return ListAgentBySkillGroupIdResponse
     */
    public ListAgentBySkillGroupIdResponse listAgentBySkillGroupId(ListAgentBySkillGroupIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAgentBySkillGroupIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you already have scripts that have passed the Review.</li>
     * <li>If you do not have any scripts that have passed the Review, add a script and submit it for Review in the <a href="https://aiccs.console.aliyun.com/patter/list">Script Management</a> interface first.</li>
     * </ul>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No Rate Limiting.</li>
     * <li>API frequency: 500 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttle will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve the list of robot scripts, including robot type, robot name, robot ID, associated business, and industry information.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you already have scripts that have passed the Review.</li>
     * <li>If you do not have any scripts that have passed the Review, add a script and submit it for Review in the <a href="https://aiccs.console.aliyun.com/patter/list">Script Management</a> interface first.</li>
     * </ul>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No Rate Limiting.</li>
     * <li>API frequency: 500 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttle will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve the list of robot scripts, including robot type, robot name, robot ID, associated business, and industry information.</p>
     * 
     * @param request ListAiccsRobotRequest
     * @return ListAiccsRobotResponse
     */
    public ListAiccsRobotResponse listAiccsRobot(ListAiccsRobotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAiccsRobotWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you have not created and published any custom voices on the <a href="https://aiccs.console.aliyun.com/engine/voiceprint">Custom Voice</a> page, the operation returns only system voices.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the system and custom TTS voices available for large model-based outbound calls.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.voiceType)) {
            query.put("VoiceType", request.voiceType);
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
     * <b>description</b> :
     * <p>If you have not created and published any custom voices on the <a href="https://aiccs.console.aliyun.com/engine/voiceprint">Custom Voice</a> page, the operation returns only system voices.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the system and custom TTS voices available for large model-based outbound calls.</p>
     * 
     * @param request ListAvailableTtsRequest
     * @return ListAvailableTtsResponse
     */
    public ListAvailableTtsResponse listAvailableTts(ListAvailableTtsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAvailableTtsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API queries information about completed online sessions within a specified time range, including session content. The query rules are as follows:  </p>
     * <ul>
     * <li>The maximum time span for the query is 1 Day.  </li>
     * <li>If only the query End Time is provided, the query Start Time is set to 1 hour before the End Time.  </li>
     * <li>If only the query Start Time is provided, the End Time is set to 1 hour after the Start Time.  </li>
     * <li>If neither time is provided, the End Time defaults to the current time, and the Start Time is set to 1 hour before the End Time.  </li>
     * <li>If both times are provided but the time span exceeds 1 Day, an abnormal response is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invoke ListChatRecordDetail to query online session details by time period.</p>
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
     * <b>description</b> :
     * <p>This API queries information about completed online sessions within a specified time range, including session content. The query rules are as follows:  </p>
     * <ul>
     * <li>The maximum time span for the query is 1 Day.  </li>
     * <li>If only the query End Time is provided, the query Start Time is set to 1 hour before the End Time.  </li>
     * <li>If only the query Start Time is provided, the End Time is set to 1 hour after the Start Time.  </li>
     * <li>If neither time is provided, the End Time defaults to the current time, and the Start Time is set to 1 hour before the End Time.  </li>
     * <li>If both times are provided but the time span exceeds 1 Day, an abnormal response is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invoke ListChatRecordDetail to query online session details by time period.</p>
     * 
     * @param request ListChatRecordDetailRequest
     * @return ListChatRecordDetailResponse
     */
    public ListChatRecordDetailResponse listChatRecordDetail(ListChatRecordDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listChatRecordDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can invoke this API to query Intelligent Contact Bot conversation records, or view them in the <strong>Task Management</strong> &gt; <strong>Details</strong> &gt; <strong>View Conversation Records</strong> interface.</li>
     * <li>Before invoking this API, ensure that your created Intelligent Contact Bot calling job has successfully connected to at least one phone number.</li>
     * <li>If you do not have an existing Intelligent Contact Bot calling job, you can create and start a job in the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface, or use the <a href="https://help.aliyun.com/document_detail/2718003.html">CreateTask</a> and <a href="https://help.aliyun.com/document_detail/2718005.html">StartTask</a> APIs to create and start a job.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query Intelligent Contact Bot conversation records.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>You can invoke this API to query Intelligent Contact Bot conversation records, or view them in the <strong>Task Management</strong> &gt; <strong>Details</strong> &gt; <strong>View Conversation Records</strong> interface.</li>
     * <li>Before invoking this API, ensure that your created Intelligent Contact Bot calling job has successfully connected to at least one phone number.</li>
     * <li>If you do not have an existing Intelligent Contact Bot calling job, you can create and start a job in the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface, or use the <a href="https://help.aliyun.com/document_detail/2718003.html">CreateTask</a> and <a href="https://help.aliyun.com/document_detail/2718005.html">StartTask</a> APIs to create and start a job.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query Intelligent Contact Bot conversation records.</p>
     * 
     * @param request ListDialogRequest
     * @return ListDialogResponse
     */
    public ListDialogResponse listDialog(ListDialogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDialogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke ListHotlineRecord to query the hotline recording list by hotline session ID.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke ListHotlineRecord to query the hotline recording list by hotline session ID.</p>
     * 
     * @param request ListHotlineRecordRequest
     * @return ListHotlineRecordResponse
     */
    public ListHotlineRecordResponse listHotlineRecord(ListHotlineRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHotlineRecordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API queries detailed hotline information within a specified time range, including hotline call information. The query rules are as follows:  </p>
     * <ul>
     * <li>The maximum time span for the query is 1 Day.  </li>
     * <li>If only the query End Time is provided, the query Start Time is set to 1 hour before the End Time.  </li>
     * <li>If only the query Start Time is provided, the End Time is set to 1 hour after the Start Time.  </li>
     * <li>If neither time is provided, the End Time defaults to the current time, and the Start Time is set to 1 hour before the End Time.  </li>
     * <li>If both times are provided but the time span exceeds 1 Day, an abnormal result is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query the list of hotline details by time period.</p>
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
     * <b>description</b> :
     * <p>This API queries detailed hotline information within a specified time range, including hotline call information. The query rules are as follows:  </p>
     * <ul>
     * <li>The maximum time span for the query is 1 Day.  </li>
     * <li>If only the query End Time is provided, the query Start Time is set to 1 hour before the End Time.  </li>
     * <li>If only the query Start Time is provided, the End Time is set to 1 hour after the Start Time.  </li>
     * <li>If neither time is provided, the End Time defaults to the current time, and the Start Time is set to 1 hour before the End Time.  </li>
     * <li>If both times are provided but the time span exceeds 1 Day, an abnormal result is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query the list of hotline details by time period.</p>
     * 
     * @param request ListHotlineRecordDetailRequest
     * @return ListHotlineRecordDetailResponse
     */
    public ListHotlineRecordDetailResponse listHotlineRecordDetail(ListHotlineRecordDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHotlineRecordDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user API call frequency: No rate limiting.</li>
     * <li>API frequency: 100 calls per second.<blockquote>
     * <p>If the total calls from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the outbound caller phone numbers for a specified agent based on the instance ID and agent account name.</p>
     * 
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
     * <b>description</b> :
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user API call frequency: No rate limiting.</li>
     * <li>API frequency: 100 calls per second.<blockquote>
     * <p>If the total calls from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the outbound caller phone numbers for a specified agent based on the instance ID and agent account name.</p>
     * 
     * @param request ListOutboundPhoneNumberRequest
     * @return ListOutboundPhoneNumberResponse
     */
    public ListOutboundPhoneNumberResponse listOutboundPhoneNumber(ListOutboundPhoneNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOutboundPhoneNumberWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have already initiated an outbound job using the Intelligent Contact Robot.</li>
     * <li>If you have not yet initiated an outbound job using the Intelligent Contact Robot, you can invoke the <a href="https://help.aliyun.com/document_detail/2717996.html">RobotCall</a> API to start one.</li>
     * </ul>
     * <h3>Queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query Intelligent Contact Robot call records.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have already initiated an outbound job using the Intelligent Contact Robot.</li>
     * <li>If you have not yet initiated an outbound job using the Intelligent Contact Robot, you can invoke the <a href="https://help.aliyun.com/document_detail/2717996.html">RobotCall</a> API to start one.</li>
     * </ul>
     * <h3>Queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query Intelligent Contact Robot call records.</p>
     * 
     * @param request ListRobotCallDialogRequest
     * @return ListRobotCallDialogResponse
     */
    public ListRobotCallDialogResponse listRobotCallDialog(ListRobotCallDialogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRobotCallDialogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Robot node information includes flow name, model name, node name, whether it is an output, and output ID.  </li>
     * <li>Before invoking this API, you can confirm the robot ID (that is, the script ID) by following the instructions in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of robot node information based on the robot ID, which is the script ID.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Robot node information includes flow name, model name, node name, whether it is an output, and output ID.  </li>
     * <li>Before invoking this API, you can confirm the robot ID (that is, the script ID) by following the instructions in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of robot node information based on the robot ID, which is the script ID.</p>
     * 
     * @param request ListRobotNodeRequest
     * @return ListRobotNodeResponse
     */
    public ListRobotNodeResponse listRobotNode(ListRobotNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRobotNodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have already added input parameters for the robot.</li>
     * <li>If your robot does not have any input parameters, go to the <a href="https://aiccs.console.aliyun.com/patter/list"><strong>Script Management</strong></a> &gt; <strong>Configuration</strong> &gt; <strong>Input and Output Parameters</strong> interface and click to add an input parameter.</li>
     * </ul>
     * <h3>Queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttle will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of robot parameters by robot ID, which is also the script ID.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, ensure that you have already added input parameters for the robot.</li>
     * <li>If your robot does not have any input parameters, go to the <a href="https://aiccs.console.aliyun.com/patter/list"><strong>Script Management</strong></a> &gt; <strong>Configuration</strong> &gt; <strong>Input and Output Parameters</strong> interface and click to add an input parameter.</li>
     * </ul>
     * <h3>Queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttle will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of robot parameters by robot ID, which is also the script ID.</p>
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
     * <p>Invoke ListRoles to obtain the list of all roles under a tenant.</p>
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
     * <p>Invoke ListRoles to obtain the list of all roles under a tenant.</p>
     * 
     * @param request ListRolesRequest
     * @return ListRolesResponse
     */
    public ListRolesResponse listRoles(ListRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRolesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 100 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query skill groups in the Cloud Customer Service System by instance ID and skill group channel type.</p>
     * 
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
     * <b>description</b> :
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 100 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query skill groups in the Cloud Customer Service System by instance ID and skill group channel type.</p>
     * 
     * @param request ListSkillGroupRequest
     * @return ListSkillGroupResponse
     */
    public ListSkillGroupResponse listSkillGroup(ListSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSkillGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can use this API to obtain the list of Intelligent Contact Robot call jobs, or retrieve the job list from the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface.</li>
     * <li>If you have not created any Intelligent Contact Robot call jobs, you can click <strong>Create Job</strong> in the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface or create a job by invoking the <a href="https://help.aliyun.com/document_detail/2718003.html">CreateTask</a> API.</li>
     * <li>The optional parameters of this API serve as Filter Conditions for the Intelligent Contact Robot call job list. If these parameters are not specified, the API queries all jobs.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No Rate Limiting.</li>
     * <li>API frequency: 500 calls per second.<blockquote>
     * <p>If the combined invocations from multiple users exceed the API frequency limit, throttle will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Perform a paged query to retrieve the list of Intelligent Contact Robot call jobs. The response includes the total number of jobs and job details.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>You can use this API to obtain the list of Intelligent Contact Robot call jobs, or retrieve the job list from the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface.</li>
     * <li>If you have not created any Intelligent Contact Robot call jobs, you can click <strong>Create Job</strong> in the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface or create a job by invoking the <a href="https://help.aliyun.com/document_detail/2718003.html">CreateTask</a> API.</li>
     * <li>The optional parameters of this API serve as Filter Conditions for the Intelligent Contact Robot call job list. If these parameters are not specified, the API queries all jobs.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No Rate Limiting.</li>
     * <li>API frequency: 500 calls per second.<blockquote>
     * <p>If the combined invocations from multiple users exceed the API frequency limit, throttle will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Perform a paged query to retrieve the list of Intelligent Contact Robot call jobs. The response includes the total number of jobs and job details.</p>
     * 
     * @param request ListTaskRequest
     * @return ListTaskResponse
     */
    public ListTaskResponse listTask(ListTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can invoke this API to obtain the detail information of Intelligent Contact Robot call jobs. Alternatively, you can view this information in the <strong>Detail</strong> interface under <a href="https://aiccs.console.aliyun.com/job/list"><strong>Task Management</strong></a>.</li>
     * <li>Before invoking this API, ensure that you have created an Intelligent Contact Robot and successfully started a job.</li>
     * <li>If you do not have any successfully created Intelligent Contact Robot call jobs, you can create and start a job in the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface, or use the <a href="https://help.aliyun.com/document_detail/2718003.html">CreateTask</a> and <a href="https://help.aliyun.com/document_detail/2718005.html">StartTask</a> APIs to create and start a job.</li>
     * <li>The optional parameters in this API serve as filter conditions for the detail information of Intelligent Contact Robot call jobs. If these parameters are not specified, all job details will be queried.</li>
     * </ul>
     * <h3>queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the detail information of Intelligent Contact Robot call jobs.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>You can invoke this API to obtain the detail information of Intelligent Contact Robot call jobs. Alternatively, you can view this information in the <strong>Detail</strong> interface under <a href="https://aiccs.console.aliyun.com/job/list"><strong>Task Management</strong></a>.</li>
     * <li>Before invoking this API, ensure that you have created an Intelligent Contact Robot and successfully started a job.</li>
     * <li>If you do not have any successfully created Intelligent Contact Robot call jobs, you can create and start a job in the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface, or use the <a href="https://help.aliyun.com/document_detail/2718003.html">CreateTask</a> and <a href="https://help.aliyun.com/document_detail/2718005.html">StartTask</a> APIs to create and start a job.</li>
     * <li>The optional parameters in this API serve as filter conditions for the detail information of Intelligent Contact Robot call jobs. If these parameters are not specified, all job details will be queried.</li>
     * </ul>
     * <h3>queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the detail information of Intelligent Contact Robot call jobs.</p>
     * 
     * @param request ListTaskDetailRequest
     * @return ListTaskDetailResponse
     */
    public ListTaskDetailResponse listTaskDetail(ListTaskDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTaskDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation can be called only during an intelligent outbound call. When you call this operation, set the <strong>CallId</strong> request parameter to the unique receipt ID of the ongoing call.</li>
     * <li><strong>CallId</strong> is the <strong>CallId</strong> parameter returned by the <a href="https://help.aliyun.com/document_detail/2718012.html">LlmSmartCallFullDuplex</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Performs full-duplex large language model operations.</p>
     * 
     * @param request LlmFullDuplexCallOperateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LlmFullDuplexCallOperateResponse
     */
    public LlmFullDuplexCallOperateResponse llmFullDuplexCallOperateWithOptions(LlmFullDuplexCallOperateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.command)) {
            query.put("Command", request.command);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.param)) {
            query.put("Param", request.param);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LlmFullDuplexCallOperate"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LlmFullDuplexCallOperateResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation can be called only during an intelligent outbound call. When you call this operation, set the <strong>CallId</strong> request parameter to the unique receipt ID of the ongoing call.</li>
     * <li><strong>CallId</strong> is the <strong>CallId</strong> parameter returned by the <a href="https://help.aliyun.com/document_detail/2718012.html">LlmSmartCallFullDuplex</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Performs full-duplex large language model operations.</p>
     * 
     * @param request LlmFullDuplexCallOperateRequest
     * @return LlmFullDuplexCallOperateResponse
     */
    public LlmFullDuplexCallOperateResponse llmFullDuplexCallOperate(LlmFullDuplexCallOperateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.llmFullDuplexCallOperateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Each API invocation supports adding only one called number. If you have multiple called numbers, invoke the API multiple times.</li>
     * <li>Before initiating an intelligent call based on an LLM, ensure that you have created an LLM application in the <a href="https://aiccs.console.aliyun.com/engine/llmApp">Application Management</a> interface and have successfully requested a real number in the Voice Service <a href="https://dyvmsnext.console.aliyun.com/number/list/normal">Number Management</a> interface.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Intelligent outbound call based on an LLM.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Each API invocation supports adding only one called number. If you have multiple called numbers, invoke the API multiple times.</li>
     * <li>Before initiating an intelligent call based on an LLM, ensure that you have created an LLM application in the <a href="https://aiccs.console.aliyun.com/engine/llmApp">Application Management</a> interface and have successfully requested a real number in the Voice Service <a href="https://dyvmsnext.console.aliyun.com/number/list/normal">Number Management</a> interface.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Intelligent outbound call based on an LLM.</p>
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
     * <p>Initiates a smart call to an encrypted number using a large language model.</p>
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
     * <p>Initiates a smart call to an encrypted number using a large language model.</p>
     * 
     * @param request LlmSmartCallEncryptRequest
     * @return LlmSmartCallEncryptResponse
     */
    public LlmSmartCallEncryptResponse llmSmartCallEncrypt(LlmSmartCallEncryptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.llmSmartCallEncryptWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Before calling this operation, make sure that you have configured the ASR callback URL.</li>
     * <li>This operation is available only to users whose UIDs are added to the whitelist.</li>
     * <li>The request rate limit for a single user is 100 QPS.</li>
     * <li><code>CalledNumber</code> and <code>CallerNumber</code> are required parameters that specify the called number and the calling number, respectively.</li>
     * <li>Optional parameters such as <code>StartWordParam</code>, <code>TtsVoiceCode</code>, <code>TtsSpeed</code>, and <code>TtsVolume</code> allow you to customize the call experience. If these parameters are not specified, the default settings of the application are used.</li>
     * <li>The <code>SessionTimeout</code> parameter specifies the maximum call duration in seconds. The call is automatically ended when the specified duration is exceeded. For the default value and valid range, refer to the relevant documentation.</li>
     * <li>The <code>OutId</code> field can be used to track a unique identifier in an external system. The value must be 1 to 32 bytes in length.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiates a full-duplex Artificial Intelligence Cloud Call Service call with support for personalized configurations.</p>
     * 
     * @param tmpReq LlmSmartCallFullDuplexRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LlmSmartCallFullDuplexResponse
     */
    public LlmSmartCallFullDuplexResponse llmSmartCallFullDuplexWithOptions(LlmSmartCallFullDuplexRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        LlmSmartCallFullDuplexShrinkRequest request = new LlmSmartCallFullDuplexShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.startWordParam)) {
            request.startWordParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.startWordParam, "StartWordParam", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationCode)) {
            query.put("ApplicationCode", request.applicationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerNumber)) {
            query.put("CallerNumber", request.callerNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
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
            new TeaPair("action", "LlmSmartCallFullDuplex"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LlmSmartCallFullDuplexResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Before calling this operation, make sure that you have configured the ASR callback URL.</li>
     * <li>This operation is available only to users whose UIDs are added to the whitelist.</li>
     * <li>The request rate limit for a single user is 100 QPS.</li>
     * <li><code>CalledNumber</code> and <code>CallerNumber</code> are required parameters that specify the called number and the calling number, respectively.</li>
     * <li>Optional parameters such as <code>StartWordParam</code>, <code>TtsVoiceCode</code>, <code>TtsSpeed</code>, and <code>TtsVolume</code> allow you to customize the call experience. If these parameters are not specified, the default settings of the application are used.</li>
     * <li>The <code>SessionTimeout</code> parameter specifies the maximum call duration in seconds. The call is automatically ended when the specified duration is exceeded. For the default value and valid range, refer to the relevant documentation.</li>
     * <li>The <code>OutId</code> field can be used to track a unique identifier in an external system. The value must be 1 to 32 bytes in length.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiates a full-duplex Artificial Intelligence Cloud Call Service call with support for personalized configurations.</p>
     * 
     * @param request LlmSmartCallFullDuplexRequest
     * @return LlmSmartCallFullDuplexResponse
     */
    public LlmSmartCallFullDuplexResponse llmSmartCallFullDuplex(LlmSmartCallFullDuplexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.llmSmartCallFullDuplexWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke MakeCall to initiate a call.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke MakeCall to initiate a call.</p>
     * 
     * @param request MakeCallRequest
     * @return MakeCallResponse
     */
    public MakeCallResponse makeCall(MakeCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.makeCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can invoke MakeDoubleCall to initiate a call by using the server-side software development kit (SDK).</p>
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
     * <p>You can invoke MakeDoubleCall to initiate a call by using the server-side software development kit (SDK).</p>
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
     * <p>Returns a paginated list of agents.</p>
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
     * <p>Returns a paginated list of agents.</p>
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
     * <p>Retrieve a paginated list of agents (agency mode V2)</p>
     * 
     * @param request PageQueryAgentListNewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PageQueryAgentListNewResponse
     */
    public PageQueryAgentListNewResponse pageQueryAgentListNewWithOptions(PageQueryAgentListNewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentName)) {
            query.put("AgentName", request.agentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAvailable)) {
            query.put("IsAvailable", request.isAvailable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
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
            new TeaPair("action", "PageQueryAgentListNew"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PageQueryAgentListNewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve a paginated list of agents (agency mode V2)</p>
     * 
     * @param request PageQueryAgentListNewRequest
     * @return PageQueryAgentListNewResponse
     */
    public PageQueryAgentListNewResponse pageQueryAgentListNew(PageQueryAgentListNewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pageQueryAgentListNewWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You must create a call task before you can query its details.</li>
     * <li>You can create a call task on the <strong>call task management</strong> page or by calling the <a href="https://help.aliyun.com/document_detail/2926796.html">CreateAiCallTask</a> API.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Runs a paginated query for call task details.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.encryptionType)) {
            query.put("EncryptionType", request.encryptionType);
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
     * <b>description</b> :
     * <ul>
     * <li>You must create a call task before you can query its details.</li>
     * <li>You can create a call task on the <strong>call task management</strong> page or by calling the <a href="https://help.aliyun.com/document_detail/2926796.html">CreateAiCallTask</a> API.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Runs a paginated query for call task details.</p>
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
     * <p>Gets basic information for a call task.</p>
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
     * <p>Gets basic information for a call task.</p>
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
     * <p>Retrieves a list of call tasks.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.applicationCode)) {
            query.put("ApplicationCode", request.applicationCode);
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

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
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
     * <p>Retrieves a list of call tasks.</p>
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
     * <p>Retrieve the details of a communication agent.</p>
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
     * <p>Retrieve the details of a communication agent.</p>
     * 
     * @param request QueryAiVoiceAgentDetailRequest
     * @return QueryAiVoiceAgentDetailResponse
     */
    public QueryAiVoiceAgentDetailResponse queryAiVoiceAgentDetail(QueryAiVoiceAgentDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAiVoiceAgentDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>This API retrieves the details of a communication agent.</li>
     * <li>If you do not specify <code>BranchId</code> and <code>VersionId</code>, the API returns the configuration for the latest published version on the effective branch. If the effective branch only contains a draft version, no configuration is returned.</li>
     * <li>If you specify only <code>BranchId</code>, the API returns the configuration for the latest published version on the specified branch. If the specified branch only contains a draft version, no configuration is returned.</li>
     * <li>If you specify both <code>BranchId</code> and <code>VersionId</code>, the API returns the configuration for the specified version.</li>
     * <li>When <code>BranchDeployStatus</code> is <code>1</code> (branch deployed) and <code>VersionPublishStatus</code> is <code>1</code> (version published), imported outbound tasks use the configuration of this branch.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Gets details for a specified agent, including its basic, branch, and version information.</p>
     * 
     * @param request QueryAiVoiceAgentDetailNewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAiVoiceAgentDetailNewResponse
     */
    public QueryAiVoiceAgentDetailNewResponse queryAiVoiceAgentDetailNewWithOptions(QueryAiVoiceAgentDetailNewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.branchId)) {
            query.put("BranchId", request.branchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAiVoiceAgentDetailNew"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAiVoiceAgentDetailNewResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>This API retrieves the details of a communication agent.</li>
     * <li>If you do not specify <code>BranchId</code> and <code>VersionId</code>, the API returns the configuration for the latest published version on the effective branch. If the effective branch only contains a draft version, no configuration is returned.</li>
     * <li>If you specify only <code>BranchId</code>, the API returns the configuration for the latest published version on the specified branch. If the specified branch only contains a draft version, no configuration is returned.</li>
     * <li>If you specify both <code>BranchId</code> and <code>VersionId</code>, the API returns the configuration for the specified version.</li>
     * <li>When <code>BranchDeployStatus</code> is <code>1</code> (branch deployed) and <code>VersionPublishStatus</code> is <code>1</code> (version published), imported outbound tasks use the configuration of this branch.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Gets details for a specified agent, including its basic, branch, and version information.</p>
     * 
     * @param request QueryAiVoiceAgentDetailNewRequest
     * @return QueryAiVoiceAgentDetailNewResponse
     */
    public QueryAiVoiceAgentDetailNewResponse queryAiVoiceAgentDetailNew(QueryAiVoiceAgentDetailNewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAiVoiceAgentDetailNewWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API retrieves call details. You can also view these details on the <strong>call task management</strong> &gt; <strong>details</strong> &gt; <strong>execution history</strong> &gt; <strong>completed</strong> &gt; <strong>call details</strong> page.</li>
     * <li>Before calling this API, make sure you have created a call task and imported called number data.</li>
     * <li>You can create a call task and import called number data either on the <strong>call task management</strong> page or by using the <a href="https://help.aliyun.com/document_detail/2926796.html">CreateAiCallTask</a> and <a href="https://help.aliyun.com/document_detail/2926815.html">ImportTaskNumberDatas</a> APIs.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Gets call details.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>This API retrieves call details. You can also view these details on the <strong>call task management</strong> &gt; <strong>details</strong> &gt; <strong>execution history</strong> &gt; <strong>completed</strong> &gt; <strong>call details</strong> page.</li>
     * <li>Before calling this API, make sure you have created a call task and imported called number data.</li>
     * <li>You can create a call task and import called number data either on the <strong>call task management</strong> page or by using the <a href="https://help.aliyun.com/document_detail/2926796.html">CreateAiCallTask</a> and <a href="https://help.aliyun.com/document_detail/2926815.html">ImportTaskNumberDatas</a> APIs.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Gets call details.</p>
     * 
     * @param request QueryConversationDetailInfoRequest
     * @return QueryConversationDetailInfoResponse
     */
    public QueryConversationDetailInfoResponse queryConversationDetailInfo(QueryConversationDetailInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryConversationDetailInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to query call details. You can also view call details in the <strong>Call Task Management</strong> &gt; <strong>Details</strong> &gt; <strong>Execution Records</strong> &gt; <strong>Completed</strong> &gt; <strong>Call Details</strong> console.</li>
     * <li>Before calling this operation, make sure that you have created a call task and imported callee data.</li>
     * <li>If you do not have a created call task, create a call task and import callee data in the <strong>Call Task Management</strong> console, or call the <a href="https://help.aliyun.com/document_detail/2926796.html">CreateAiCallTask</a> and <a href="https://help.aliyun.com/document_detail/2926815.html">ImportTaskNumberDatas</a> operations to create a call task and import callee data.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a call task and call records.</p>
     * 
     * @param request QueryConversationDetailInfoNewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryConversationDetailInfoNewResponse
     */
    public QueryConversationDetailInfoNewResponse queryConversationDetailInfoNewWithOptions(QueryConversationDetailInfoNewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detailId)) {
            query.put("DetailId", request.detailId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryConversationDetailInfoNew"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryConversationDetailInfoNewResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to query call details. You can also view call details in the <strong>Call Task Management</strong> &gt; <strong>Details</strong> &gt; <strong>Execution Records</strong> &gt; <strong>Completed</strong> &gt; <strong>Call Details</strong> console.</li>
     * <li>Before calling this operation, make sure that you have created a call task and imported callee data.</li>
     * <li>If you do not have a created call task, create a call task and import callee data in the <strong>Call Task Management</strong> console, or call the <a href="https://help.aliyun.com/document_detail/2926796.html">CreateAiCallTask</a> and <a href="https://help.aliyun.com/document_detail/2926815.html">ImportTaskNumberDatas</a> operations to create a call task and import callee data.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a call task and call records.</p>
     * 
     * @param request QueryConversationDetailInfoNewRequest
     * @return QueryConversationDetailInfoNewResponse
     */
    public QueryConversationDetailInfoNewResponse queryConversationDetailInfoNew(QueryConversationDetailInfoNewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryConversationDetailInfoNewWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke QueryHotlineInQueue to obtain hotline agent data for a skill group by skill group ID.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke QueryHotlineInQueue to obtain hotline agent data for a skill group by skill group ID.</p>
     * 
     * @param request QueryHotlineInQueueRequest
     * @return QueryHotlineInQueueResponse
     */
    public QueryHotlineInQueueResponse queryHotlineInQueue(QueryHotlineInQueueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryHotlineInQueueWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The hotline number configuration includes information such as the hotline number, number location, carrier, and whether it is used for incoming calls. For details, see <a href="#api-detail-40">Return Parameters</a>.</p>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.</li>
     * <li>API invocation frequency: 100 times per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query the hotline number configuration list by instance ID. Fuzzy query by hotline number is supported.</p>
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
     * <b>description</b> :
     * <p>The hotline number configuration includes information such as the hotline number, number location, carrier, and whether it is used for incoming calls. For details, see <a href="#api-detail-40">Return Parameters</a>.</p>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times per second.</li>
     * <li>API invocation frequency: 100 times per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query the hotline number configuration list by instance ID. Fuzzy query by hotline number is supported.</p>
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
     * <b>description</b> :
     * <p>This API allows you to query information such as the display name, description, channel type, and ID of skill groups. For details, see <a href="#api-detail-40">Response Parameters</a>.</p>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 1000 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the skill group list of the Cloud Customer Service System by instance ID.</p>
     * 
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
     * <b>description</b> :
     * <p>This API allows you to query information such as the display name, description, channel type, and ID of skill groups. For details, see <a href="#api-detail-40">Response Parameters</a>.</p>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 1000 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the skill group list of the Cloud Customer Service System by instance ID.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke the QueryTickets API to query ticket information.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke the QueryTickets API to query ticket information.</p>
     * 
     * @param request QueryTicketsRequest
     * @return QueryTicketsResponse
     */
    public QueryTicketsResponse queryTickets(QueryTicketsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTicketsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API allows you to query contact data such as contact status, session recipient, agent name, contact channel, satisfaction rating, and evaluation status. For details, see <a href="#api-detail-40">Response parameters</a>.  </p>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No Rate Limiting.  </li>
     * <li>API frequency: 50 queries per second (QPS).  <blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query contact data by instance, list of contact IDs, list of session IDs, and so on.</p>
     * 
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
     * <b>description</b> :
     * <p>This API allows you to query contact data such as contact status, session recipient, agent name, contact channel, satisfaction rating, and evaluation status. For details, see <a href="#api-detail-40">Response parameters</a>.  </p>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No Rate Limiting.  </li>
     * <li>API frequency: 50 queries per second (QPS).  <blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query contact data by instance, list of contact IDs, list of session IDs, and so on.</p>
     * 
     * @param request QueryTouchListRequest
     * @return QueryTouchListResponse
     */
    public QueryTouchListResponse queryTouchList(QueryTouchListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTouchListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you need to provide agent or skill group information, refer to the instructions in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * <li>You can invoke <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-listagentbyskillgroupid">ListAgentBySkillGroupId</a> to retrieve agent information under a skill group and verify whether the removal aligns with your expectations.</li>
     * <li>If you accidentally remove an agent, you can invoke <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-updateagent">UpdateAgent</a> to update the agent data and reassign the skill group to the agent.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 50 times/second.</li>
     * <li>API-wide invocation frequency: 100 times/second.<blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API-wide frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Remove agent accounts from a skill group by specifying the skill group and agent IDs.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>If you need to provide agent or skill group information, refer to the instructions in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * <li>You can invoke <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-listagentbyskillgroupid">ListAgentBySkillGroupId</a> to retrieve agent information under a skill group and verify whether the removal aligns with your expectations.</li>
     * <li>If you accidentally remove an agent, you can invoke <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-updateagent">UpdateAgent</a> to update the agent data and reassign the skill group to the agent.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 50 times/second.</li>
     * <li>API-wide invocation frequency: 100 times/second.<blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API-wide frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Remove agent accounts from a skill group by specifying the skill group and agent IDs.</p>
     * 
     * @param request RemoveAgentFromSkillGroupRequest
     * @return RemoveAgentFromSkillGroupResponse
     */
    public RemoveAgentFromSkillGroupResponse removeAgentFromSkillGroup(RemoveAgentFromSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeAgentFromSkillGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Deletion is a sensitive operation. Proceed with caution.  </li>
     * <li>Before deletion, confirm the AICCS instance ID and the skill group ID to be deleted. Refer to the guidance in <a href="#api-detail-35">Request Parameters</a> for details on how to obtain them.  </li>
     * <li>After deletion, you can invoke the <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-queryskillgroups">QuerySkillGroups</a> API to verify the skill group status.  </li>
     * <li>If you accidentally delete a skill group, you can recreate it by invoking the <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-createskillgroup">CreateSkillGroup</a> API.</li>
     * </ul>
     * <h3>Queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.  </li>
     * <li>API frequency: 1000 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a skill group in the Cloud Customer Service System based on the AICCS instance ID and skill group ID.</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>Deletion is a sensitive operation. Proceed with caution.  </li>
     * <li>Before deletion, confirm the AICCS instance ID and the skill group ID to be deleted. Refer to the guidance in <a href="#api-detail-35">Request Parameters</a> for details on how to obtain them.  </li>
     * <li>After deletion, you can invoke the <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-queryskillgroups">QuerySkillGroups</a> API to verify the skill group status.  </li>
     * <li>If you accidentally delete a skill group, you can recreate it by invoking the <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-createskillgroup">CreateSkillGroup</a> API.</li>
     * </ul>
     * <h3>Queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.  </li>
     * <li>API frequency: 1000 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a skill group in the Cloud Customer Service System based on the AICCS instance ID and skill group ID.</p>
     * 
     * @param request RemoveSkillGroupRequest
     * @return RemoveSkillGroupResponse
     */
    public RemoveSkillGroupResponse removeSkillGroup(RemoveSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeSkillGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the ResetHotlineNumber API to reset the inbound (IVR flow) and outbound (effective scope) configuration information of a hotline number.</p>
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
     * <p>Invoke the ResetHotlineNumber API to reset the inbound (IVR flow) and outbound (effective scope) configuration information of a hotline number.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before initiating an outbound call using the Intelligent Contact Robot, ensure that you already have a reviewed and approved script in the <a href="https://aiccs.console.aliyun.com/patter/list">Script Management</a> interface and an approved real number in the Voice Service <a href="https://dyvmsnext.console.aliyun.com/number/list/normal">Real Number Management</a> interface.</li>
     * <li>You can obtain the creation time of the call from the <strong>date</strong> parameter in the <strong>Response Header</strong> after invoking this API.  <blockquote>
     * <p>For example, if the <strong>date</strong> parameter is: <code>&quot;date&quot;: &quot;Mon, 24 Jun 2024 03:40:31 GMT&quot;</code>, then the call creation time is: <code>&quot;2024-06-24 03:40:31&quot;</code>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 1000 calls per second.<blockquote>
     * <p>If the total calls from multiple users exceed the API frequency limit, throttle will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiate an outbound call using the Intelligent Contact Robot.</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>Before initiating an outbound call using the Intelligent Contact Robot, ensure that you already have a reviewed and approved script in the <a href="https://aiccs.console.aliyun.com/patter/list">Script Management</a> interface and an approved real number in the Voice Service <a href="https://dyvmsnext.console.aliyun.com/number/list/normal">Real Number Management</a> interface.</li>
     * <li>You can obtain the creation time of the call from the <strong>date</strong> parameter in the <strong>Response Header</strong> after invoking this API.  <blockquote>
     * <p>For example, if the <strong>date</strong> parameter is: <code>&quot;date&quot;: &quot;Mon, 24 Jun 2024 03:40:31 GMT&quot;</code>, then the call creation time is: <code>&quot;2024-06-24 03:40:31&quot;</code>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 1000 calls per second.<blockquote>
     * <p>If the total calls from multiple users exceed the API frequency limit, throttle will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiate an outbound call using the Intelligent Contact Robot.</p>
     * 
     * @param request RobotCallRequest
     * @return RobotCallResponse
     */
    public RobotCallResponse robotCall(RobotCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.robotCallWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The following characters cannot appear in the Intelligent Speech Interaction SendCcoSmartCall callback: <code>@ = : &quot;&quot; $ { } ^ * ￥</code>.  </li>
     * <li>After invoking this API, the <strong>Data</strong> field in the response contains the unique receipt ID for this call, which can be used when invoking the <a href="https://help.aliyun.com/document_detail/2718013.html">SendCcoSmartCallOperate</a> API.</li>
     * </ul>
     * <h3>Queries Per Second (QPS) Limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.  </li>
     * <li>API frequency: 100 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiate an Intelligent Speech Interaction call based on the callee\&quot;s caller ID, callee number, and intelligent outbound call audio file.</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>The following characters cannot appear in the Intelligent Speech Interaction SendCcoSmartCall callback: <code>@ = : &quot;&quot; $ { } ^ * ￥</code>.  </li>
     * <li>After invoking this API, the <strong>Data</strong> field in the response contains the unique receipt ID for this call, which can be used when invoking the <a href="https://help.aliyun.com/document_detail/2718013.html">SendCcoSmartCallOperate</a> API.</li>
     * </ul>
     * <h3>Queries Per Second (QPS) Limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.  </li>
     * <li>API frequency: 100 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiate an Intelligent Speech Interaction call based on the callee\&quot;s caller ID, callee number, and intelligent outbound call audio file.</p>
     * 
     * @param request SendCcoSmartCallRequest
     * @return SendCcoSmartCallResponse
     */
    public SendCcoSmartCallResponse sendCcoSmartCall(SendCcoSmartCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendCcoSmartCallWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API can be successfully invoked only during an ongoing Intelligent Outbound Call. When invoking it, note that the <strong>CallId</strong> in the request parameters must be set to the unique receipt ID of the active call.  </li>
     * <li>The <strong>CallId</strong> is the <strong>Data</strong> parameter returned when you invoke the <a href="https://help.aliyun.com/document_detail/2718012.html">SendCcoSmartCall</a> API.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiates a specified action during an Intelligent Outbound Call, applicable only to scenarios such as parallel transfer to a human agent or allowing a human agent to listen in on the man-machine dialogue.</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>This API can be successfully invoked only during an ongoing Intelligent Outbound Call. When invoking it, note that the <strong>CallId</strong> in the request parameters must be set to the unique receipt ID of the active call.  </li>
     * <li>The <strong>CallId</strong> is the <strong>Data</strong> parameter returned when you invoke the <a href="https://help.aliyun.com/document_detail/2718012.html">SendCcoSmartCall</a> API.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiates a specified action during an Intelligent Outbound Call, applicable only to scenarios such as parallel transfer to a human agent or allowing a human agent to listen in on the man-machine dialogue.</p>
     * 
     * @param request SendCcoSmartCallOperateRequest
     * @return SendCcoSmartCallOperateResponse
     */
    public SendCcoSmartCallOperateResponse sendCcoSmartCallOperate(SendCcoSmartCallOperateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendCcoSmartCallOperateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 100 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Send a hotline heartbeat request based on the instance ID, agent account name, and heartbeat signature.</p>
     * 
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
     * <b>description</b> :
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 100 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Send a hotline heartbeat request based on the instance ID, agent account name, and heartbeat signature.</p>
     * 
     * @param request SendHotlineHeartBeatRequest
     * @return SendHotlineHeartBeatResponse
     */
    public SendHotlineHeartBeatResponse sendHotlineHeartBeat(SendHotlineHeartBeatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendHotlineHeartBeatWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you start a call task, ensure its status is Stopped.</li>
     * <li>If you do not have a call task, create one on the <strong>Call Task Management</strong> page or by calling the <a href="https://help.aliyun.com/document_detail/2926796.html">CreateAiCallTask</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Starts a call task.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before you start a call task, ensure its status is Stopped.</li>
     * <li>If you do not have a call task, create one on the <strong>Call Task Management</strong> page or by calling the <a href="https://help.aliyun.com/document_detail/2926796.html">CreateAiCallTask</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Starts a call task.</p>
     * 
     * @param request StartAiCallTaskRequest
     * @return StartAiCallTaskResponse
     */
    public StartAiCallTaskResponse startAiCallTask(StartAiCallTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startAiCallTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can invoke this API to start an outbound calling job that is in the paused state.  </li>
     * <li>An outbound calling job in the stopped state cannot be started again.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 20 times per second.  </li>
     * <li>API invocation frequency: 20 times per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Start an outbound calling job by instance ID and job ID.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>You can invoke this API to start an outbound calling job that is in the paused state.  </li>
     * <li>An outbound calling job in the stopped state cannot be started again.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 20 times per second.  </li>
     * <li>API invocation frequency: 20 times per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Start an outbound calling job by instance ID and job ID.</p>
     * 
     * @param request StartAiOutboundTaskRequest
     * @return StartAiOutboundTaskResponse
     */
    public StartAiOutboundTaskResponse startAiOutboundTask(StartAiOutboundTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startAiOutboundTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 100 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiate an outbound call based on the instance ID, agent account name, hotline outbound caller number, and callee number.</p>
     * 
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
     * <b>description</b> :
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 100 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiate an outbound call based on the instance ID, agent account name, hotline outbound caller number, and callee number.</p>
     * 
     * @param request StartCallRequest
     * @return StartCallResponse
     */
    public StartCallResponse startCall(StartCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke StartCallV2 to initiate an outbound call V2.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke StartCallV2 to initiate an outbound call V2.</p>
     * 
     * @param request StartCallV2Request
     * @return StartCallV2Response
     */
    public StartCallV2Response startCallV2(StartCallV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startCallV2WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke StartChatWork to switch an online agent to the working status.</p>
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
     * <p>Invoke StartChatWork to switch an online agent to the working status.</p>
     * 
     * @param request StartChatWorkRequest
     * @return StartChatWorkResponse
     */
    public StartChatWorkResponse startChatWork(StartChatWorkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startChatWorkWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The <strong>Data</strong> parameter returned by this API is the token required to initiate a heartbeat.  </li>
     * <li>If the agent takes a break, you can pause the hotline service by invoking the <a href="https://help.aliyun.com/document_detail/2718046.html">SuspendHotlineService</a> API.</li>
     * </ul>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 100 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sign in a hotline agent by instance ID and agent account name to start the hotline service.</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>The <strong>Data</strong> parameter returned by this API is the token required to initiate a heartbeat.  </li>
     * <li>If the agent takes a break, you can pause the hotline service by invoking the <a href="https://help.aliyun.com/document_detail/2718046.html">SuspendHotlineService</a> API.</li>
     * </ul>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 100 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sign in a hotline agent by instance ID and agent account name to start the hotline service.</p>
     * 
     * @param request StartHotlineServiceRequest
     * @return StartHotlineServiceResponse
     */
    public StartHotlineServiceResponse startHotlineService(StartHotlineServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startHotlineServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the StartMicroOutbound API to initiate an outbound call request.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke the StartMicroOutbound API to initiate an outbound call request.</p>
     * 
     * @param request StartMicroOutboundRequest
     * @return StartMicroOutboundResponse
     */
    public StartMicroOutboundResponse startMicroOutbound(StartMicroOutboundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startMicroOutboundWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can invoke this API to start a successfully created Intelligent Contact Robot calling job, or manually start the job on the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> page.</li>
     * <li>Before invoking this API, ensure that you already have a successfully created Intelligent Contact Robot calling job.</li>
     * <li>If you do not have a successfully created Intelligent Contact Robot outbound calling job, you can click to create a job on the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> page or create one by using the <a href="https://help.aliyun.com/document_detail/2718003.html">CreateTask</a> API.</li>
     * </ul>
     * <h3>queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Start a successfully created Intelligent Contact Robot calling job.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>You can invoke this API to start a successfully created Intelligent Contact Robot calling job, or manually start the job on the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> page.</li>
     * <li>Before invoking this API, ensure that you already have a successfully created Intelligent Contact Robot calling job.</li>
     * <li>If you do not have a successfully created Intelligent Contact Robot outbound calling job, you can click to create a job on the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> page or create one by using the <a href="https://help.aliyun.com/document_detail/2718003.html">CreateTask</a> API.</li>
     * </ul>
     * <h3>queries per second (QPS) Limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Start a successfully created Intelligent Contact Robot calling job.</p>
     * 
     * @param request StartTaskRequest
     * @return StartTaskResponse
     */
    public StartTaskResponse startTask(StartTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you stop an outbound call task, ensure that the task has been created and its status is <code>running</code>.</li>
     * <li>If you have not created an outbound call task, create one on the Outbound Task Management page or call the <a href="https://help.aliyun.com/document_detail/2926796.html">CreateAiCallTask</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stops an outbound call task.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before you stop an outbound call task, ensure that the task has been created and its status is <code>running</code>.</li>
     * <li>If you have not created an outbound call task, create one on the Outbound Task Management page or call the <a href="https://help.aliyun.com/document_detail/2926796.html">CreateAiCallTask</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stops an outbound call task.</p>
     * 
     * @param request StopAiCallTaskRequest
     * @return StopAiCallTaskResponse
     */
    public StopAiCallTaskResponse stopAiCallTask(StopAiCallTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopAiCallTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After pausing an outbound calling job, you can invoke the <a href="https://help.aliyun.com/document_detail/2718027.html">StartAiOutboundTask</a> API to restart it.</p>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 20 times/second.</li>
     * <li>API invocation frequency: 20 times/second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Pause an outbound calling job by instance ID and job ID.</p>
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
     * <b>description</b> :
     * <p>After pausing an outbound calling job, you can invoke the <a href="https://help.aliyun.com/document_detail/2718027.html">StartAiOutboundTask</a> API to restart it.</p>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 20 times/second.</li>
     * <li>API invocation frequency: 20 times/second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Pause an outbound calling job by instance ID and job ID.</p>
     * 
     * @param request StopAiOutboundTaskRequest
     * @return StopAiOutboundTaskResponse
     */
    public StopAiOutboundTaskResponse stopAiOutboundTask(StopAiOutboundTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopAiOutboundTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can use this API to pause an Intelligent Contact Robot calling job that has been successfully started, or manually pause the job on the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface.</li>
     * <li>Before invoking this API, ensure that you already have a successfully started Intelligent Contact Robot calling job.</li>
     * <li>If you do not have a successfully started Intelligent Contact Robot calling job, click <strong>Start</strong> on the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface or start a job by using the <a href="https://help.aliyun.com/document_detail/2718005.html">StartTask</a> API.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Pause an Intelligent Contact Robot calling job that has been successfully started.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>You can use this API to pause an Intelligent Contact Robot calling job that has been successfully started, or manually pause the job on the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface.</li>
     * <li>Before invoking this API, ensure that you already have a successfully started Intelligent Contact Robot calling job.</li>
     * <li>If you do not have a successfully started Intelligent Contact Robot calling job, click <strong>Start</strong> on the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface or start a job by using the <a href="https://help.aliyun.com/document_detail/2718005.html">StartTask</a> API.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 500 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Pause an Intelligent Contact Robot calling job that has been successfully started.</p>
     * 
     * @param request StopTaskRequest
     * @return StopTaskResponse
     */
    public StopTaskResponse stopTask(StopTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a recording notes task.</p>
     * 
     * @param request SubmitAudioNoteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitAudioNoteResponse
     */
    public SubmitAudioNoteResponse submitAudioNoteWithOptions(SubmitAudioNoteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.llmModelId)) {
            query.put("LlmModelId", request.llmModelId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitAudioNote"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitAudioNoteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a recording notes task.</p>
     * 
     * @param request SubmitAudioNoteRequest
     * @return SubmitAudioNoteResponse
     */
    public SubmitAudioNoteResponse submitAudioNote(SubmitAudioNoteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAudioNoteWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If the break ends and you need to resume hotline service, you can invoke the <a href="https://help.aliyun.com/document_detail/2718045.html">StartHotlineService</a> API.</p>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 100 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Pause hotline service when an agent takes a short break.</p>
     * 
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
     * <b>description</b> :
     * <p>If the break ends and you need to resume hotline service, you can invoke the <a href="https://help.aliyun.com/document_detail/2718045.html">StartHotlineService</a> API.</p>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 100 queries per second (QPS).<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Pause hotline service when an agent takes a short break.</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>This API supports terminating an outbound call job. Once terminated, the job cannot be restarted.</li>
     * <li>To temporarily stop an outbound call job, you can invoke the <a href="https://help.aliyun.com/document_detail/2718024.html">StopAiOutboundTask</a> API.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 20 times/second.</li>
     * <li>API-wide invocation frequency: 20 times/second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Terminate an outbound call job by instance ID and job ID.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>This API supports terminating an outbound call job. Once terminated, the job cannot be restarted.</li>
     * <li>To temporarily stop an outbound call job, you can invoke the <a href="https://help.aliyun.com/document_detail/2718024.html">StopAiOutboundTask</a> API.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 20 times/second.</li>
     * <li>API-wide invocation frequency: 20 times/second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Terminate an outbound call job by instance ID and job ID.</p>
     * 
     * @param request TerminateAiOutboundTaskRequest
     * @return TerminateAiOutboundTaskResponse
     */
    public TerminateAiOutboundTaskResponse terminateAiOutboundTask(TerminateAiOutboundTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.terminateAiOutboundTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>TestLargeModel</p>
     * 
     * @param tmpReq TestLargeModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TestLargeModelResponse
     */
    public TestLargeModelResponse testLargeModelWithOptions(TestLargeModelRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TestLargeModelShrinkRequest request = new TestLargeModelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.baseModel)) {
            request.baseModelShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.baseModel, "BaseModel", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baseModelShrink)) {
            query.put("BaseModel", request.baseModelShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelCode)) {
            query.put("ModelCode", request.modelCode);
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

        if (!com.aliyun.teautil.Common.isUnset(request.userDialogContent)) {
            query.put("UserDialogContent", request.userDialogContent);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestLargeModel"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestLargeModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>TestLargeModel</p>
     * 
     * @param request TestLargeModelRequest
     * @return TestLargeModelResponse
     */
    public TestLargeModelResponse testLargeModel(TestLargeModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testLargeModelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke the TransferCallToSkillGroup API to execute a single-step or two-step transfer to a skill group.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke the TransferCallToSkillGroup API to execute a single-step or two-step transfer to a skill group.</p>
     * 
     * @param request TransferCallToSkillGroupRequest
     * @return TransferCallToSkillGroupResponse
     */
    public TransferCallToSkillGroupResponse transferCallToSkillGroup(TransferCallToSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferCallToSkillGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, we recommend that you confirm your Artificial Intelligence Cloud Call Service (AICCS) instance ID. For guidance on how to obtain it, see the description of <a href="#api-detail-35">Request Parameters</a>.</li>
     * <li>After the update, you can invoke the <a href="https://help.aliyun.com/document_detail/2717961.html">GetAgent</a> API to confirm whether the update meets your expectations.<blockquote>
     * <p>Currently, only the display name and assigned skill groups can be modified.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API-wide invocation frequency: 100 queries per second.<blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API-wide frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modify agent information in the Cloud Customer Service System based on the instance ID and agent account name. You can modify the agent\&quot;s display name and the skill groups to which the agent belongs.</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this API, we recommend that you confirm your Artificial Intelligence Cloud Call Service (AICCS) instance ID. For guidance on how to obtain it, see the description of <a href="#api-detail-35">Request Parameters</a>.</li>
     * <li>After the update, you can invoke the <a href="https://help.aliyun.com/document_detail/2717961.html">GetAgent</a> API to confirm whether the update meets your expectations.<blockquote>
     * <p>Currently, only the display name and assigned skill groups can be modified.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API-wide invocation frequency: 100 queries per second.<blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API-wide frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modify agent information in the Cloud Customer Service System based on the instance ID and agent account name. You can modify the agent\&quot;s display name and the skill groups to which the agent belongs.</p>
     * 
     * @param request UpdateAgentRequest
     * @return UpdateAgentResponse
     */
    public UpdateAgentResponse updateAgent(UpdateAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAgentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Ensure the call task is stopped before you update its configuration.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a call task configuration.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.lineEncoding)) {
            query.put("LineEncoding", request.lineEncoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.linePhoneNum)) {
            query.put("LinePhoneNum", request.linePhoneNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.missCallRetry)) {
            query.put("MissCallRetry", request.missCallRetry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneType)) {
            query.put("PhoneType", request.phoneType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
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
     * <b>description</b> :
     * <p>Ensure the call task is stopped before you update its configuration.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a call task configuration.</p>
     * 
     * @param request UpdateAiCallTaskRequest
     * @return UpdateAiCallTaskResponse
     */
    public UpdateAiCallTaskResponse updateAiCallTask(UpdateAiCallTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAiCallTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API supports updating information such as the task name, task description, outbound caller number, and skill group ID. For details, see <a href="#api-detail-35">Request Parameters</a>.</p>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 20 times per second.<blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Update an outbound call job by instance ID and job ID.</p>
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
     * <b>description</b> :
     * <p>This API supports updating information such as the task name, task description, outbound caller number, and skill group ID. For details, see <a href="#api-detail-35">Request Parameters</a>.</p>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user invocation frequency: No rate limiting.</li>
     * <li>API frequency: 20 times per second.<blockquote>
     * <p>Throttling is triggered if the total invocations from multiple users exceed the API frequency limit.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Update an outbound call job by instance ID and job ID.</p>
     * 
     * @param request UpdateAiOutboundTaskRequest
     * @return UpdateAiOutboundTaskResponse
     */
    public UpdateAiOutboundTaskResponse updateAiOutboundTask(UpdateAiOutboundTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAiOutboundTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API supports updating only the department name and does not support updating the department ID.  </li>
     * <li>Before invoking this API, we recommend that you confirm the AICCS instance ID and department ID. For guidance on how to obtain them, see the instructions in <a href="#api-detail-35">Request Parameters</a>.  </li>
     * <li>After the update is complete, you can invoke the <a href="https://help.aliyun.com/document_detail/2717975.html">GetAllDepartment</a> API to confirm whether the department information matches your expectations.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times/second.  </li>
     * <li>API-wide invocation frequency: 100 times/second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Update the department name based on the Artificial Intelligence Cloud Call Service (AICCS) instance ID and department ID.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>This API supports updating only the department name and does not support updating the department ID.  </li>
     * <li>Before invoking this API, we recommend that you confirm the AICCS instance ID and department ID. For guidance on how to obtain them, see the instructions in <a href="#api-detail-35">Request Parameters</a>.  </li>
     * <li>After the update is complete, you can invoke the <a href="https://help.aliyun.com/document_detail/2717975.html">GetAllDepartment</a> API to confirm whether the department information matches your expectations.</li>
     * </ul>
     * <h3>Queries per second (QPS) limits</h3>
     * <ul>
     * <li>Per-user invocation frequency: 100 times/second.  </li>
     * <li>API-wide invocation frequency: 100 times/second.<blockquote>
     * <p>If the total invocations from multiple users exceed the API-wide frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Update the department name based on the Artificial Intelligence Cloud Call Service (AICCS) instance ID and department ID.</p>
     * 
     * @param request UpdateDepartmentRequest
     * @return UpdateDepartmentResponse
     */
    public UpdateDepartmentResponse updateDepartment(UpdateDepartmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDepartmentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a large language model.</p>
     * 
     * @param tmpReq UpdateLargeModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLargeModelResponse
     */
    public UpdateLargeModelResponse updateLargeModelWithOptions(UpdateLargeModelRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateLargeModelShrinkRequest request = new UpdateLargeModelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.baseModel)) {
            request.baseModelShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.baseModel, "BaseModel", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baseModelShrink)) {
            query.put("BaseModel", request.baseModelShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelCode)) {
            query.put("ModelCode", request.modelCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelName)) {
            query.put("ModelName", request.modelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelUrl)) {
            query.put("ModelUrl", request.modelUrl);
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

        if (!com.aliyun.teautil.Common.isUnset(request.temperature)) {
            query.put("Temperature", request.temperature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topK)) {
            query.put("TopK", request.topK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topP)) {
            query.put("TopP", request.topP);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLargeModel"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLargeModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a large language model.</p>
     * 
     * @param request UpdateLargeModelRequest
     * @return UpdateLargeModelResponse
     */
    public UpdateLargeModelResponse updateLargeModel(UpdateLargeModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLargeModelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Edit Model Application</p>
     * 
     * @param tmpReq UpdateModelApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateModelApplicationResponse
     */
    public UpdateModelApplicationResponse updateModelApplicationWithOptions(UpdateModelApplicationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateModelApplicationShrinkRequest request = new UpdateModelApplicationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.interruptConfig)) {
            request.interruptConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.interruptConfig, "InterruptConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ttsConfig)) {
            request.ttsConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ttsConfig, "TtsConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationCode)) {
            query.put("ApplicationCode", request.applicationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationCps)) {
            query.put("ApplicationCps", request.applicationCps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callAssistantHangup)) {
            query.put("CallAssistantHangup", request.callAssistantHangup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callAssistantRecognize)) {
            query.put("CallAssistantRecognize", request.callAssistantRecognize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callConnectedTriggerModel)) {
            query.put("CallConnectedTriggerModel", request.callConnectedTriggerModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtmfAllowedDigits)) {
            query.put("DtmfAllowedDigits", request.dtmfAllowedDigits);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtmfAutoValidateEnable)) {
            query.put("DtmfAutoValidateEnable", request.dtmfAutoValidateEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtmfDigitCount)) {
            query.put("DtmfDigitCount", request.dtmfDigitCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtmfInputTimeout)) {
            query.put("DtmfInputTimeout", request.dtmfInputTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtmfOutOfRangeAction)) {
            query.put("DtmfOutOfRangeAction", request.dtmfOutOfRangeAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtmfRetryPlayTimes)) {
            query.put("DtmfRetryPlayTimes", request.dtmfRetryPlayTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtmfRetryPromptText)) {
            query.put("DtmfRetryPromptText", request.dtmfRetryPromptText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtmfSendMaxCount)) {
            query.put("DtmfSendMaxCount", request.dtmfSendMaxCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtmfSendWaitTimeout)) {
            query.put("DtmfSendWaitTimeout", request.dtmfSendWaitTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dyvmsSceneName)) {
            query.put("DyvmsSceneName", request.dyvmsSceneName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableDtmfReceive)) {
            query.put("EnableDtmfReceive", request.enableDtmfReceive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableDtmfSend)) {
            query.put("EnableDtmfSend", request.enableDtmfSend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableMorse)) {
            query.put("EnableMorse", request.enableMorse);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interruptConfigShrink)) {
            query.put("InterruptConfig", request.interruptConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelCode)) {
            query.put("ModelCode", request.modelCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelVersion)) {
            query.put("ModelVersion", request.modelVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.muteActive)) {
            query.put("MuteActive", request.muteActive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.muteDuration)) {
            query.put("MuteDuration", request.muteDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.muteHangupNum)) {
            query.put("MuteHangupNum", request.muteHangupNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mutePushMode)) {
            query.put("MutePushMode", request.mutePushMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            query.put("Prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualificationId)) {
            query.put("QualificationId", request.qualificationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualificationName)) {
            query.put("QualificationName", request.qualificationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordingFile)) {
            query.put("RecordingFile", request.recordingFile);
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

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speechContent)) {
            query.put("SpeechContent", request.speechContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speechId)) {
            query.put("SpeechId", request.speechId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startWord)) {
            query.put("StartWord", request.startWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startWordType)) {
            query.put("StartWordType", request.startWordType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsConfigShrink)) {
            query.put("TtsConfig", request.ttsConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usageDesc)) {
            query.put("UsageDesc", request.usageDesc);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateModelApplication"),
            new TeaPair("version", "2019-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateModelApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Edit Model Application</p>
     * 
     * @param request UpdateModelApplicationRequest
     * @return UpdateModelApplicationResponse
     */
    public UpdateModelApplicationResponse updateModelApplication(UpdateModelApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateModelApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invoke UpdateOuterAccount to update an external account based on the external account ID.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Invoke UpdateOuterAccount to update an external account based on the external account ID.</p>
     * 
     * @param request UpdateOuterAccountRequest
     * @return UpdateOuterAccountResponse
     */
    public UpdateOuterAccountResponse updateOuterAccount(UpdateOuterAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOuterAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API does not support updating the skill group ID or skill group name.  </li>
     * <li>After the update, you can invoke the <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-queryskillgroups">QuerySkillGroups</a> API to query the skill group information.  </li>
     * <li>If you need to provide the AICCS instance ID and skill group ID, refer to the instructions in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user call frequency: No rate limiting.</li>
     * <li>API call frequency: 1000 calls per second.<blockquote>
     * <p>If the total calls from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Update the skill group information in the Cloud Customer Service System based on the AICCS instance ID and skill group ID. This API supports updating the skill group description and display name.</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>This API does not support updating the skill group ID or skill group name.  </li>
     * <li>After the update, you can invoke the <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-queryskillgroups">QuerySkillGroups</a> API to query the skill group information.  </li>
     * <li>If you need to provide the AICCS instance ID and skill group ID, refer to the instructions in the <a href="#api-detail-35">Request Parameters</a> section.</li>
     * </ul>
     * <h3>Queries per second (QPS) limit</h3>
     * <ul>
     * <li>Per-user call frequency: No rate limiting.</li>
     * <li>API call frequency: 1000 calls per second.<blockquote>
     * <p>If the total calls from multiple users exceed the API frequency limit, throttling will be triggered.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Update the skill group information in the Cloud Customer Service System based on the AICCS instance ID and skill group ID. This API supports updating the skill group description and display name.</p>
     * 
     * @param request UpdateSkillGroupRequest
     * @return UpdateSkillGroupResponse
     */
    public UpdateSkillGroupResponse updateSkillGroup(UpdateSkillGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSkillGroupWithOptions(request, runtime);
    }
}
