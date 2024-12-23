// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015;

import com.aliyun.tea.*;
import com.aliyun.dyvmsapi_intl20211015.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dyvmsapi-intl", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Initiates a voice group call to multiple phone numbers. The content of the group call is that of approved templates. You can log on to the VMS console and choose Voice Call Template to view the template ID. This feature enqueues the phone numbers to be called. The time when the phone numbers are called is uncertain.</p>
     * 
     * @param tmpReq BackendCallGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BackendCallGroupResponse
     */
    public BackendCallGroupResponse backendCallGroupWithOptions(BackendCallGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BackendCallGroupShrinkRequest request = new BackendCallGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.calledNumber)) {
            request.calledNumberShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.calledNumber, "CalledNumber", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calledNumberShrink)) {
            query.put("CalledNumber", request.calledNumberShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerIdNumber)) {
            query.put("CallerIdNumber", request.callerIdNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countryId)) {
            query.put("CountryId", request.countryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playTimes)) {
            query.put("PlayTimes", request.playTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendType)) {
            query.put("SendType", request.sendType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speed)) {
            query.put("Speed", request.speed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timingStart)) {
            query.put("TimingStart", request.timingStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsCode)) {
            query.put("TtsCode", request.ttsCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceCode)) {
            query.put("VoiceCode", request.voiceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volume)) {
            query.put("Volume", request.volume);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BackendCallGroup"),
            new TeaPair("version", "2021-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BackendCallGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Initiates a voice group call to multiple phone numbers. The content of the group call is that of approved templates. You can log on to the VMS console and choose Voice Call Template to view the template ID. This feature enqueues the phone numbers to be called. The time when the phone numbers are called is uncertain.</p>
     * 
     * @param request BackendCallGroupRequest
     * @return BackendCallGroupResponse
     */
    public BackendCallGroupResponse backendCallGroup(BackendCallGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.backendCallGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sends a voice verification code and voice notification with variables to a phone number.</p>
     * 
     * @param request BackendCallSignalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BackendCallSignalResponse
     */
    public BackendCallSignalResponse backendCallSignalWithOptions(BackendCallSignalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerIdNumber)) {
            query.put("CallerIdNumber", request.callerIdNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countryId)) {
            query.put("CountryId", request.countryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playTimes)) {
            query.put("PlayTimes", request.playTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speed)) {
            query.put("Speed", request.speed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsCode)) {
            query.put("TtsCode", request.ttsCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsParam)) {
            query.put("TtsParam", request.ttsParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volume)) {
            query.put("Volume", request.volume);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BackendCallSignal"),
            new TeaPair("version", "2021-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BackendCallSignalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sends a voice verification code and voice notification with variables to a phone number.</p>
     * 
     * @param request BackendCallSignalRequest
     * @return BackendCallSignalResponse
     */
    public BackendCallSignalResponse backendCallSignal(BackendCallSignalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.backendCallSignalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>向指定号码发送语音验证码和带参数变量的语音通知，支持语音文件模板或文本转语音模板</p>
     * 
     * @param tmpReq GroupCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GroupCallResponse
     */
    public GroupCallResponse groupCallWithOptions(GroupCallRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GroupCallShrinkRequest request = new GroupCallShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.calledNumber)) {
            request.calledNumberShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.calledNumber, "CalledNumber", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calledNumberShrink)) {
            query.put("CalledNumber", request.calledNumberShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerIdNumber)) {
            query.put("CallerIdNumber", request.callerIdNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countryId)) {
            query.put("CountryId", request.countryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playTimes)) {
            query.put("PlayTimes", request.playTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendType)) {
            query.put("SendType", request.sendType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signature)) {
            query.put("Signature", request.signature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureNonce)) {
            query.put("SignatureNonce", request.signatureNonce);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speed)) {
            query.put("Speed", request.speed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timestamp)) {
            query.put("Timestamp", request.timestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timingStart)) {
            query.put("TimingStart", request.timingStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsCode)) {
            query.put("TtsCode", request.ttsCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsParam)) {
            query.put("TtsParam", request.ttsParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceCode)) {
            query.put("VoiceCode", request.voiceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volume)) {
            query.put("Volume", request.volume);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GroupCall"),
            new TeaPair("version", "2021-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GroupCallResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>向指定号码发送语音验证码和带参数变量的语音通知，支持语音文件模板或文本转语音模板</p>
     * 
     * @param request GroupCallRequest
     * @return GroupCallResponse
     */
    public GroupCallResponse groupCall(GroupCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.groupCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>向指定号码发送语音验证码和带参数变量的语音通知，支持语音文件模板或文本转语音模板</p>
     * 
     * @param request SignalCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SignalCallResponse
     */
    public SignalCallResponse signalCallWithOptions(SignalCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerIdNumber)) {
            query.put("CallerIdNumber", request.callerIdNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countryId)) {
            query.put("CountryId", request.countryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playTimes)) {
            query.put("PlayTimes", request.playTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendType)) {
            query.put("SendType", request.sendType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signature)) {
            query.put("Signature", request.signature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureNonce)) {
            query.put("SignatureNonce", request.signatureNonce);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speed)) {
            query.put("Speed", request.speed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timestamp)) {
            query.put("Timestamp", request.timestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timingStart)) {
            query.put("TimingStart", request.timingStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsCode)) {
            query.put("TtsCode", request.ttsCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsParam)) {
            query.put("TtsParam", request.ttsParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceCode)) {
            query.put("VoiceCode", request.voiceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volume)) {
            query.put("Volume", request.volume);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SignalCall"),
            new TeaPair("version", "2021-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SignalCallResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>向指定号码发送语音验证码和带参数变量的语音通知，支持语音文件模板或文本转语音模板</p>
     * 
     * @param request SignalCallRequest
     * @return SignalCallResponse
     */
    public SignalCallResponse signalCall(SignalCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.signalCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>国际语音api-语音群呼</p>
     * 
     * @param tmpReq VoiceGroupCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VoiceGroupCallResponse
     */
    public VoiceGroupCallResponse voiceGroupCallWithOptions(VoiceGroupCallRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        VoiceGroupCallShrinkRequest request = new VoiceGroupCallShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.calledNumber)) {
            request.calledNumberShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.calledNumber, "CalledNumber", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calledNumberShrink)) {
            query.put("CalledNumber", request.calledNumberShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerIdNumber)) {
            query.put("CallerIdNumber", request.callerIdNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countryId)) {
            query.put("CountryId", request.countryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playTimes)) {
            query.put("PlayTimes", request.playTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendType)) {
            query.put("SendType", request.sendType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speed)) {
            query.put("Speed", request.speed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timingStart)) {
            query.put("TimingStart", request.timingStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsCode)) {
            query.put("TtsCode", request.ttsCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsParam)) {
            query.put("TtsParam", request.ttsParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceCode)) {
            query.put("VoiceCode", request.voiceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volume)) {
            query.put("Volume", request.volume);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VoiceGroupCall"),
            new TeaPair("version", "2021-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VoiceGroupCallResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>国际语音api-语音群呼</p>
     * 
     * @param request VoiceGroupCallRequest
     * @return VoiceGroupCallResponse
     */
    public VoiceGroupCallResponse voiceGroupCall(VoiceGroupCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.voiceGroupCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>国际语音api-语音单呼</p>
     * 
     * @param request VoiceSingleCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VoiceSingleCallResponse
     */
    public VoiceSingleCallResponse voiceSingleCallWithOptions(VoiceSingleCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerIdNumber)) {
            query.put("CallerIdNumber", request.callerIdNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countryId)) {
            query.put("CountryId", request.countryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playTimes)) {
            query.put("PlayTimes", request.playTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendType)) {
            query.put("SendType", request.sendType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speed)) {
            query.put("Speed", request.speed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timingStart)) {
            query.put("TimingStart", request.timingStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsCode)) {
            query.put("TtsCode", request.ttsCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsParam)) {
            query.put("TtsParam", request.ttsParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceCode)) {
            query.put("VoiceCode", request.voiceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volume)) {
            query.put("Volume", request.volume);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VoiceSingleCall"),
            new TeaPair("version", "2021-10-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VoiceSingleCallResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>国际语音api-语音单呼</p>
     * 
     * @param request VoiceSingleCallRequest
     * @return VoiceSingleCallResponse
     */
    public VoiceSingleCallResponse voiceSingleCall(VoiceSingleCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.voiceSingleCallWithOptions(request, runtime);
    }
}
