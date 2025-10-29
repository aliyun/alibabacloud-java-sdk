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
     * <p>创建数字人会话</p>
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
     * <p>创建数字人会话</p>
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
