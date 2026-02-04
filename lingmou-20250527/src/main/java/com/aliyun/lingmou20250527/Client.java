// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527;

import com.aliyun.tea.*;
import com.aliyun.lingmou20250527.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("lingmou", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>关闭会话实例session</p>
     * 
     * @param tmpReq CloseChatInstanceSessionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloseChatInstanceSessionsResponse
     */
    public CloseChatInstanceSessionsResponse closeChatInstanceSessionsWithOptions(String instanceId, CloseChatInstanceSessionsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CloseChatInstanceSessionsShrinkRequest request = new CloseChatInstanceSessionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sessionIds)) {
            request.sessionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sessionIds, "sessionIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sessionIdsShrink)) {
            body.put("sessionIds", request.sessionIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseChatInstanceSessions"),
            new TeaPair("version", "2025-05-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/chat/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/sessions/close"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseChatInstanceSessionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>关闭会话实例session</p>
     * 
     * @param request CloseChatInstanceSessionsRequest
     * @return CloseChatInstanceSessionsResponse
     */
    public CloseChatInstanceSessionsResponse closeChatInstanceSessions(String instanceId, CloseChatInstanceSessionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeChatInstanceSessionsWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>用户确认</p>
     * 
     * @param request ConfirmTrainPicAvatarRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfirmTrainPicAvatarResponse
     */
    public ConfirmTrainPicAvatarResponse confirmTrainPicAvatarWithOptions(ConfirmTrainPicAvatarRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.avatarId)) {
            query.put("avatarId", request.avatarId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfirmTrainPicAvatar"),
            new TeaPair("version", "2025-05-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/train/confirmTrainPicAvatar"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfirmTrainPicAvatarResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>用户确认</p>
     * 
     * @param request ConfirmTrainPicAvatarRequest
     * @return ConfirmTrainPicAvatarResponse
     */
    public ConfirmTrainPicAvatarResponse confirmTrainPicAvatar(ConfirmTrainPicAvatarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmTrainPicAvatarWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建背景素材</p>
     * 
     * @param request CreateBackgroundPicRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBackgroundPicResponse
     */
    public CreateBackgroundPicResponse createBackgroundPicWithOptions(CreateBackgroundPicRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filename)) {
            query.put("filename", request.filename);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossKey)) {
            query.put("ossKey", request.ossKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBackgroundPic"),
            new TeaPair("version", "2025-05-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/chat/createBackgroundPic"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBackgroundPicResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建背景素材</p>
     * 
     * @param request CreateBackgroundPicRequest
     * @return CreateBackgroundPicResponse
     */
    public CreateBackgroundPicResponse createBackgroundPic(CreateBackgroundPicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBackgroundPicWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建播报音频</p>
     * 
     * @param request CreateBroadcastAudioRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBroadcastAudioResponse
     */
    public CreateBroadcastAudioResponse createBroadcastAudioWithOptions(CreateBroadcastAudioRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossKey)) {
            body.put("ossKey", request.ossKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBroadcastAudio"),
            new TeaPair("version", "2025-05-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/customer/broadcast/material/audio/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBroadcastAudioResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建播报音频</p>
     * 
     * @param request CreateBroadcastAudioRequest
     * @return CreateBroadcastAudioResponse
     */
    public CreateBroadcastAudioResponse createBroadcastAudio(CreateBroadcastAudioRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBroadcastAudioWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建播报贴图</p>
     * 
     * @param request CreateBroadcastStickerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBroadcastStickerResponse
     */
    public CreateBroadcastStickerResponse createBroadcastStickerWithOptions(CreateBroadcastStickerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossKey)) {
            body.put("ossKey", request.ossKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBroadcastSticker"),
            new TeaPair("version", "2025-05-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/customer/broadcast/material/sticker/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBroadcastStickerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建播报贴图</p>
     * 
     * @param request CreateBroadcastStickerRequest
     * @return CreateBroadcastStickerResponse
     */
    public CreateBroadcastStickerResponse createBroadcastSticker(CreateBroadcastStickerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBroadcastStickerWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>基于模板创建播报视频</p>
     * 
     * @param request CreateBroadcastVideoFromTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBroadcastVideoFromTemplateResponse
     */
    public CreateBroadcastVideoFromTemplateResponse createBroadcastVideoFromTemplateWithOptions(CreateBroadcastVideoFromTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("templateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variables)) {
            body.put("variables", request.variables);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoOptions)) {
            body.put("videoOptions", request.videoOptions);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBroadcastVideoFromTemplate"),
            new TeaPair("version", "2025-05-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/amp/customer/broadcast/video/createFromTemplate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBroadcastVideoFromTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>基于模板创建播报视频</p>
     * 
     * @param request CreateBroadcastVideoFromTemplateRequest
     * @return CreateBroadcastVideoFromTemplateResponse
     */
    public CreateBroadcastVideoFromTemplateResponse createBroadcastVideoFromTemplate(CreateBroadcastVideoFromTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBroadcastVideoFromTemplateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>背景配置</p>
     * 
     * @param request CreateChatConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateChatConfigResponse
     */
    public CreateChatConfigResponse createChatConfigWithOptions(CreateChatConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.avatarId)) {
            query.put("avatarId", request.avatarId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgroundId)) {
            query.put("backgroundId", request.backgroundId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateChatConfig"),
            new TeaPair("version", "2025-05-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/chat/createChatConfig"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateChatConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>背景配置</p>
     * 
     * @param request CreateChatConfigRequest
     * @return CreateChatConfigResponse
     */
    public CreateChatConfigResponse createChatConfig(CreateChatConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createChatConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建实时数字人会话。</p>
     * 
     * @param request CreateChatSessionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateChatSessionResponse
     */
    public CreateChatSessionResponse createChatSessionWithOptions(String id, CreateChatSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.license)) {
            query.put("license", request.license);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("platform", request.platform);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateChatSession"),
            new TeaPair("version", "2025-05-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/chat/init/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateChatSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建实时数字人会话。</p>
     * 
     * @param request CreateChatSessionRequest
     * @return CreateChatSessionResponse
     */
    public CreateChatSessionResponse createChatSession(String id, CreateChatSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createChatSessionWithOptions(id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建对话免训照片数字人</p>
     * 
     * @param request CreateNoTrainPicAvatarRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNoTrainPicAvatarResponse
     */
    public CreateNoTrainPicAvatarResponse createNoTrainPicAvatarWithOptions(CreateNoTrainPicAvatarRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expressiveness)) {
            query.put("expressiveness", request.expressiveness);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gender)) {
            query.put("gender", request.gender);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generateAssets)) {
            query.put("generateAssets", request.generateAssets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageOssPath)) {
            query.put("imageOssPath", request.imageOssPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            query.put("jwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transparent)) {
            query.put("transparent", request.transparent);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNoTrainPicAvatar"),
            new TeaPair("version", "2025-05-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/chat/createNoTrainPicAvatar"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNoTrainPicAvatarResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建对话免训照片数字人</p>
     * 
     * @param request CreateNoTrainPicAvatarRequest
     * @return CreateNoTrainPicAvatarResponse
     */
    public CreateNoTrainPicAvatarResponse createNoTrainPicAvatar(CreateNoTrainPicAvatarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createNoTrainPicAvatarWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建TTS音色</p>
     * 
     * @param request CreateTTSVoiceCustomRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTTSVoiceCustomResponse
     */
    public CreateTTSVoiceCustomResponse createTTSVoiceCustomWithOptions(CreateTTSVoiceCustomRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gender)) {
            query.put("gender", request.gender);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossKey)) {
            query.put("ossKey", request.ossKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTTSVoiceCustom"),
            new TeaPair("version", "2025-05-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/voice/createTTSVoiceCustom"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTTSVoiceCustomResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建TTS音色</p>
     * 
     * @param request CreateTTSVoiceCustomRequest
     * @return CreateTTSVoiceCustomResponse
     */
    public CreateTTSVoiceCustomResponse createTTSVoiceCustom(CreateTTSVoiceCustomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTTSVoiceCustomWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建图片训练数字人</p>
     * 
     * @param request CreateTrainPicAvatarRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTrainPicAvatarResponse
     */
    public CreateTrainPicAvatarResponse createTrainPicAvatarWithOptions(CreateTrainPicAvatarRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("bizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gender)) {
            query.put("gender", request.gender);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generateAssets)) {
            query.put("generateAssets", request.generateAssets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageOssPath)) {
            query.put("imageOssPath", request.imageOssPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("templateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transparent)) {
            query.put("transparent", request.transparent);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrainPicAvatar"),
            new TeaPair("version", "2025-05-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/train/createTrainPicAvatar"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTrainPicAvatarResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建图片训练数字人</p>
     * 
     * @param request CreateTrainPicAvatarRequest
     * @return CreateTrainPicAvatarResponse
     */
    public CreateTrainPicAvatarResponse createTrainPicAvatar(CreateTrainPicAvatarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTrainPicAvatarWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询播报模板详情</p>
     * 
     * @param request GetBroadcastTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBroadcastTemplateResponse
     */
    public GetBroadcastTemplateResponse getBroadcastTemplateWithOptions(GetBroadcastTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("templateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBroadcastTemplate"),
            new TeaPair("version", "2025-05-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/customer/broadcast/template/detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBroadcastTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询播报模板详情</p>
     * 
     * @param request GetBroadcastTemplateRequest
     * @return GetBroadcastTemplateResponse
     */
    public GetBroadcastTemplateResponse getBroadcastTemplate(GetBroadcastTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBroadcastTemplateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据ID获取TTS音色</p>
     * 
     * @param request GetTTSVoiceByIdCustomRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTTSVoiceByIdCustomResponse
     */
    public GetTTSVoiceByIdCustomResponse getTTSVoiceByIdCustomWithOptions(GetTTSVoiceByIdCustomRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.voiceId)) {
            query.put("voiceId", request.voiceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTTSVoiceByIdCustom"),
            new TeaPair("version", "2025-05-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/voice/getTTSVoiceById"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTTSVoiceByIdCustomResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据ID获取TTS音色</p>
     * 
     * @param request GetTTSVoiceByIdCustomRequest
     * @return GetTTSVoiceByIdCustomResponse
     */
    public GetTTSVoiceByIdCustomResponse getTTSVoiceByIdCustom(GetTTSVoiceByIdCustomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTTSVoiceByIdCustomWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询图片训练数字人的状态</p>
     * 
     * @param request GetTrainPicAvatarStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTrainPicAvatarStatusResponse
     */
    public GetTrainPicAvatarStatusResponse getTrainPicAvatarStatusWithOptions(GetTrainPicAvatarStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.avatarId)) {
            query.put("avatarId", request.avatarId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTrainPicAvatarStatus"),
            new TeaPair("version", "2025-05-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/train/getTrainPicAvatarStatus"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTrainPicAvatarStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询图片训练数字人的状态</p>
     * 
     * @param request GetTrainPicAvatarStatusRequest
     * @return GetTrainPicAvatarStatusResponse
     */
    public GetTrainPicAvatarStatusResponse getTrainPicAvatarStatus(GetTrainPicAvatarStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTrainPicAvatarStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取对话免训图片素材上传凭证</p>
     * 
     * @param request GetUploadPolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUploadPolicyResponse
     */
    public GetUploadPolicyResponse getUploadPolicyWithOptions(GetUploadPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jwtToken)) {
            query.put("jwtToken", request.jwtToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUploadPolicy"),
            new TeaPair("version", "2025-05-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/chat/getUploadPolicy"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUploadPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取对话免训图片素材上传凭证</p>
     * 
     * @param request GetUploadPolicyRequest
     * @return GetUploadPolicyResponse
     */
    public GetUploadPolicyResponse getUploadPolicy(GetUploadPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUploadPolicyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据音频id批量查询播报音频（最多查询100个）</p>
     * 
     * @param tmpReq ListBroadcastAudiosByIdRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBroadcastAudiosByIdResponse
     */
    public ListBroadcastAudiosByIdResponse listBroadcastAudiosByIdWithOptions(ListBroadcastAudiosByIdRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListBroadcastAudiosByIdShrinkRequest request = new ListBroadcastAudiosByIdShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.audioIds)) {
            request.audioIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.audioIds, "audioIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.audioIdsShrink)) {
            query.put("audioIds", request.audioIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBroadcastAudiosById"),
            new TeaPair("version", "2025-05-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/customer/broadcast/material/audio/batchQuery"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBroadcastAudiosByIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据音频id批量查询播报音频（最多查询100个）</p>
     * 
     * @param request ListBroadcastAudiosByIdRequest
     * @return ListBroadcastAudiosByIdResponse
     */
    public ListBroadcastAudiosByIdResponse listBroadcastAudiosById(ListBroadcastAudiosByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBroadcastAudiosByIdWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举播报模板</p>
     * 
     * @param request ListBroadcastTemplatesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBroadcastTemplatesResponse
     */
    public ListBroadcastTemplatesResponse listBroadcastTemplatesWithOptions(ListBroadcastTemplatesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBroadcastTemplates"),
            new TeaPair("version", "2025-05-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/customer/broadcast/template/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBroadcastTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举播报模板</p>
     * 
     * @param request ListBroadcastTemplatesRequest
     * @return ListBroadcastTemplatesResponse
     */
    public ListBroadcastTemplatesResponse listBroadcastTemplates(ListBroadcastTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBroadcastTemplatesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据视频id批量查询播报视频（最多查询100个）</p>
     * 
     * @param tmpReq ListBroadcastVideosByIdRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBroadcastVideosByIdResponse
     */
    public ListBroadcastVideosByIdResponse listBroadcastVideosByIdWithOptions(ListBroadcastVideosByIdRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListBroadcastVideosByIdShrinkRequest request = new ListBroadcastVideosByIdShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.videoIds)) {
            request.videoIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.videoIds, "videoIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.videoIdsShrink)) {
            query.put("videoIds", request.videoIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBroadcastVideosById"),
            new TeaPair("version", "2025-05-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/amp/customer/broadcast/video/batchQuery"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBroadcastVideosByIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据视频id批量查询播报视频（最多查询100个）</p>
     * 
     * @param request ListBroadcastVideosByIdRequest
     * @return ListBroadcastVideosByIdResponse
     */
    public ListBroadcastVideosByIdResponse listBroadcastVideosById(ListBroadcastVideosByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBroadcastVideosByIdWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举私有TTS音色</p>
     * 
     * @param request ListPrivateTTSVoicesCustomRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrivateTTSVoicesCustomResponse
     */
    public ListPrivateTTSVoicesCustomResponse listPrivateTTSVoicesCustomWithOptions(ListPrivateTTSVoicesCustomRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrivateTTSVoicesCustom"),
            new TeaPair("version", "2025-05-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/voice/listPrivateTTSVoicesCustom"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrivateTTSVoicesCustomResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举私有TTS音色</p>
     * 
     * @param request ListPrivateTTSVoicesCustomRequest
     * @return ListPrivateTTSVoicesCustomResponse
     */
    public ListPrivateTTSVoicesCustomResponse listPrivateTTSVoicesCustom(ListPrivateTTSVoicesCustomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPrivateTTSVoicesCustomWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询底板素材</p>
     * 
     * @param request ListTemplateMaterialRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTemplateMaterialResponse
     */
    public ListTemplateMaterialResponse listTemplateMaterialWithOptions(ListTemplateMaterialRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateIds)) {
            query.put("templateIds", request.templateIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTemplateMaterial"),
            new TeaPair("version", "2025-05-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/train/listTemplateMaterial"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTemplateMaterialResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询底板素材</p>
     * 
     * @param request ListTemplateMaterialRequest
     * @return ListTemplateMaterialResponse
     */
    public ListTemplateMaterialResponse listTemplateMaterial(ListTemplateMaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTemplateMaterialWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询会话实例session</p>
     * 
     * @param tmpReq QueryChatInstanceSessionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryChatInstanceSessionsResponse
     */
    public QueryChatInstanceSessionsResponse queryChatInstanceSessionsWithOptions(String instanceId, QueryChatInstanceSessionsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryChatInstanceSessionsShrinkRequest request = new QueryChatInstanceSessionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sessionIds)) {
            request.sessionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sessionIds, "sessionIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sessionIdsShrink)) {
            query.put("sessionIds", request.sessionIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryChatInstanceSessions"),
            new TeaPair("version", "2025-05-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/chat/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/sessions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryChatInstanceSessionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询会话实例session</p>
     * 
     * @param request QueryChatInstanceSessionsRequest
     * @return QueryChatInstanceSessionsResponse
     */
    public QueryChatInstanceSessionsResponse queryChatInstanceSessions(String instanceId, QueryChatInstanceSessionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChatInstanceSessionsWithOptions(instanceId, request, headers, runtime);
    }
}
