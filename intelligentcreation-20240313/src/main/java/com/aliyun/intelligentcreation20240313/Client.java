// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313;

import com.aliyun.tea.*;
import com.aliyun.intelligentcreation20240313.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("intelligentcreation", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>添加文案反馈</p>
     * 
     * @param request AddTextFeedbackRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddTextFeedbackResponse
     */
    public AddTextFeedbackResponse addTextFeedbackWithOptions(AddTextFeedbackRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quality)) {
            body.put("quality", request.quality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textId)) {
            body.put("textId", request.textId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddTextFeedback"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/addTextFeedback"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddTextFeedbackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加文案反馈</p>
     * 
     * @param request AddTextFeedbackRequest
     * @return AddTextFeedbackResponse
     */
    public AddTextFeedbackResponse addTextFeedback(AddTextFeedbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addTextFeedbackWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>检查会话状态</p>
     * 
     * @param request CheckSessionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckSessionResponse
     */
    public CheckSessionResponse checkSessionWithOptions(CheckSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("projectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckSession"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/avatar/project/checkSession"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>检查会话状态</p>
     * 
     * @param request CheckSessionRequest
     * @return CheckSessionResponse
     */
    public CheckSessionResponse checkSession(CheckSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkSessionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建配图生成任务</p>
     * 
     * @param request CreateIllustrationTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIllustrationTaskResponse
     */
    public CreateIllustrationTaskResponse createIllustrationTaskWithOptions(String textId, CreateIllustrationTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIllustrationTask"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/texts/" + com.aliyun.openapiutil.Client.getEncodeParam(textId) + "/illustrationTasks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIllustrationTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建配图生成任务</p>
     * 
     * @param request CreateIllustrationTaskRequest
     * @return CreateIllustrationTaskResponse
     */
    public CreateIllustrationTaskResponse createIllustrationTask(String textId, CreateIllustrationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIllustrationTaskWithOptions(textId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建文案生成任务</p>
     * 
     * @param request CreateTextTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTextTaskResponse
     */
    public CreateTextTaskResponse createTextTaskWithOptions(CreateTextTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTextTask"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/textTasks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTextTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建文案生成任务</p>
     * 
     * @param request CreateTextTaskRequest
     * @return CreateTextTaskResponse
     */
    public CreateTextTaskResponse createTextTask(CreateTextTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTextTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询配图</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIllustrationResponse
     */
    public GetIllustrationResponse getIllustrationWithOptions(String textId, String illustrationId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIllustration"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/texts/" + com.aliyun.openapiutil.Client.getEncodeParam(textId) + "/illustrations/" + com.aliyun.openapiutil.Client.getEncodeParam(illustrationId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIllustrationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询配图</p>
     * @return GetIllustrationResponse
     */
    public GetIllustrationResponse getIllustration(String textId, String illustrationId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIllustrationWithOptions(textId, illustrationId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询配图任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIllustrationTaskResponse
     */
    public GetIllustrationTaskResponse getIllustrationTaskWithOptions(String textId, String illustrationTaskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIllustrationTask"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/texts/" + com.aliyun.openapiutil.Client.getEncodeParam(textId) + "/illustrationTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(illustrationTaskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIllustrationTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询配图任务</p>
     * @return GetIllustrationTaskResponse
     */
    public GetIllustrationTaskResponse getIllustrationTask(String textId, String illustrationTaskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIllustrationTaskWithOptions(textId, illustrationTaskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取图片上传oss token</p>
     * 
     * @param request GetOssUploadTokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOssUploadTokenResponse
     */
    public GetOssUploadTokenResponse getOssUploadTokenWithOptions(GetOssUploadTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("fileType", request.fileType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOssUploadToken"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/uploadToken"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOssUploadTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取图片上传oss token</p>
     * 
     * @param request GetOssUploadTokenRequest
     * @return GetOssUploadTokenResponse
     */
    public GetOssUploadTokenResponse getOssUploadToken(GetOssUploadTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOssUploadTokenWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据人合成信息</p>
     * 
     * @param request GetProjectTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectTaskResponse
     */
    public GetProjectTaskResponse getProjectTaskWithOptions(GetProjectTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idempotentId)) {
            query.put("IdempotentId", request.idempotentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectTask"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/digitalHuman/project/getProjectTask"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据人合成信息</p>
     * 
     * @param request GetProjectTaskRequest
     * @return GetProjectTaskResponse
     */
    public GetProjectTaskResponse getProjectTask(GetProjectTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProjectTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询文案</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTextResponse
     */
    public GetTextResponse getTextWithOptions(String textId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetText"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/texts/" + com.aliyun.openapiutil.Client.getEncodeParam(textId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTextResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询文案</p>
     * @return GetTextResponse
     */
    public GetTextResponse getText(String textId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTextWithOptions(textId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询文案任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTextTaskResponse
     */
    public GetTextTaskResponse getTextTaskWithOptions(String textTaskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTextTask"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/textTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(textTaskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTextTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询文案任务</p>
     * @return GetTextTaskResponse
     */
    public GetTextTaskResponse getTextTask(String textTaskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTextTaskWithOptions(textTaskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询表单配置</p>
     * 
     * @param request GetTextTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTextTemplateResponse
     */
    public GetTextTemplateResponse getTextTemplateWithOptions(GetTextTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.industry)) {
            query.put("industry", request.industry);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTextTemplate"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/texts/commands/getTextTemplate"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTextTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询表单配置</p>
     * 
     * @param request GetTextTemplateRequest
     * @return GetTextTemplateResponse
     */
    public GetTextTemplateResponse getTextTemplate(GetTextTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTextTemplateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数字人模特列表</p>
     * 
     * @param request ListAnchorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAnchorResponse
     */
    public ListAnchorResponse listAnchorWithOptions(ListAnchorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.anchorType)) {
            query.put("anchorType", request.anchorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverRate)) {
            query.put("coverRate", request.coverRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digitalHumanType)) {
            query.put("digitalHumanType", request.digitalHumanType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useScene)) {
            query.put("useScene", request.useScene);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAnchor"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/digitalHuman/anchorOpen/listAnchor"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAnchorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数字人模特列表</p>
     * 
     * @param request ListAnchorRequest
     * @return ListAnchorResponse
     */
    public ListAnchorResponse listAnchor(ListAnchorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAnchorWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询文案主题列表</p>
     * 
     * @param request ListTextThemesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTextThemesResponse
     */
    public ListTextThemesResponse listTextThemesWithOptions(ListTextThemesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.industry)) {
            query.put("industry", request.industry);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTextThemes"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/textThemes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTextThemesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询文案主题列表</p>
     * 
     * @param request ListTextThemesRequest
     * @return ListTextThemesResponse
     */
    public ListTextThemesResponse listTextThemes(ListTextThemesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTextThemesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举文案</p>
     * 
     * @param request ListTextsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTextsResponse
     */
    public ListTextsResponse listTextsWithOptions(ListTextsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.generationSource)) {
            query.put("generationSource", request.generationSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.industry)) {
            query.put("industry", request.industry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishStatus)) {
            query.put("publishStatus", request.publishStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textStyleType)) {
            query.put("textStyleType", request.textStyleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textTheme)) {
            query.put("textTheme", request.textTheme);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTexts"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/texts"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTextsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举文案</p>
     * 
     * @param request ListTextsRequest
     * @return ListTextsResponse
     */
    public ListTextsResponse listTexts(ListTextsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTextsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取声音模版列表</p>
     * 
     * @param request ListVoiceModelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVoiceModelsResponse
     */
    public ListVoiceModelsResponse listVoiceModelsWithOptions(ListVoiceModelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useScene)) {
            query.put("useScene", request.useScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceType)) {
            query.put("voiceType", request.voiceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVoiceModels"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/digitalHuman/voiceOpen/listVoiceModels"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVoiceModelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取声音模版列表</p>
     * 
     * @param request ListVoiceModelsRequest
     * @return ListVoiceModelsResponse
     */
    public ListVoiceModelsResponse listVoiceModels(ListVoiceModelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listVoiceModelsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询数字人项目信息</p>
     * 
     * @param request QueryAvatarProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAvatarProjectResponse
     */
    public QueryAvatarProjectResponse queryAvatarProjectWithOptions(QueryAvatarProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("projectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAvatarProject"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/avatar/project/queryAvatarProject"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAvatarProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询数字人项目信息</p>
     * 
     * @param request QueryAvatarProjectRequest
     * @return QueryAvatarProjectResponse
     */
    public QueryAvatarProjectResponse queryAvatarProject(QueryAvatarProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAvatarProjectWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查找资源</p>
     * 
     * @param request QueryAvatarResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAvatarResourceResponse
     */
    public QueryAvatarResourceResponse queryAvatarResourceWithOptions(QueryAvatarResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idempotentId)) {
            query.put("idempotentId", request.idempotentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAvatarResource"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/avatar/project/queryResource"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAvatarResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查找资源</p>
     * 
     * @param request QueryAvatarResourceRequest
     * @return QueryAvatarResourceResponse
     */
    public QueryAvatarResourceResponse queryAvatarResource(QueryAvatarResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAvatarResourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询离线数字人剩余资源</p>
     * 
     * @param request SelectResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SelectResourceResponse
     */
    public SelectResourceResponse selectResourceWithOptions(SelectResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idempotentId)) {
            query.put("idempotentId", request.idempotentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SelectResource"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/digitalHuman/project/commands/overview"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SelectResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询离线数字人剩余资源</p>
     * 
     * @param request SelectResourceRequest
     * @return SelectResourceResponse
     */
    public SelectResourceResponse selectResource(SelectResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.selectResourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发送文本消息</p>
     * 
     * @param request SendTextMsgRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendTextMsgResponse
     */
    public SendTextMsgResponse sendTextMsgWithOptions(SendTextMsgRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("projectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendTextMsg"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/avatar/project/sendTextMsg"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendTextMsgResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发送文本消息</p>
     * 
     * @param request SendTextMsgRequest
     * @return SendTextMsgResponse
     */
    public SendTextMsgResponse sendTextMsg(SendTextMsgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendTextMsgWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启动会话</p>
     * 
     * @param request StartAvatarSessionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartAvatarSessionResponse
     */
    public StartAvatarSessionResponse startAvatarSessionWithOptions(StartAvatarSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("projectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartAvatarSession"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/avatar/project/startAvatarSession"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartAvatarSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启动会话</p>
     * 
     * @param request StartAvatarSessionRequest
     * @return StartAvatarSessionResponse
     */
    public StartAvatarSessionResponse startAvatarSession(StartAvatarSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAvatarSessionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停止会话</p>
     * 
     * @param request StopAvatarSessionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopAvatarSessionResponse
     */
    public StopAvatarSessionResponse stopAvatarSessionWithOptions(StopAvatarSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("projectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopAvatarSession"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/avatar/project/stopAvatarSession"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopAvatarSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>停止会话</p>
     * 
     * @param request StopAvatarSessionRequest
     * @return StopAvatarSessionResponse
     */
    public StopAvatarSessionResponse stopAvatarSession(StopAvatarSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopAvatarSessionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>视频合成任务停止</p>
     * 
     * @param request StopProjectTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopProjectTaskResponse
     */
    public StopProjectTaskResponse stopProjectTaskWithOptions(StopProjectTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopProjectTask"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/digitalHuman/project/stop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopProjectTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>视频合成任务停止</p>
     * 
     * @param request StopProjectTaskRequest
     * @return StopProjectTaskResponse
     */
    public StopProjectTaskResponse stopProjectTask(StopProjectTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopProjectTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交离线数字人合成任务</p>
     * 
     * @param request SubmitProjectTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitProjectTaskResponse
     */
    public SubmitProjectTaskResponse submitProjectTaskWithOptions(SubmitProjectTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.frames)) {
            body.put("frames", request.frames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleType)) {
            body.put("scaleType", request.scaleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subtitleTag)) {
            body.put("subtitleTag", request.subtitleTag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitProjectTask"),
            new TeaPair("version", "2024-03-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/yic/yic-console/openService/v1/digitalHuman/project/submitProjectTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitProjectTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交离线数字人合成任务</p>
     * 
     * @param request SubmitProjectTaskRequest
     * @return SubmitProjectTaskResponse
     */
    public SubmitProjectTaskResponse submitProjectTask(SubmitProjectTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitProjectTaskWithOptions(request, headers, runtime);
    }
}
