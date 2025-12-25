// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707;

import com.aliyun.tea.*;
import com.aliyun.anytrans20250707.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("anytrans", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>通义多模态翻译批量翻译</p>
     * 
     * @param tmpReq BatchTranslateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchTranslateResponse
     */
    public BatchTranslateResponse batchTranslateWithOptions(BatchTranslateRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchTranslateShrinkRequest request = new BatchTranslateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ext)) {
            request.extShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ext, "ext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.text)) {
            request.textShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.text, "text", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("appName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extShrink)) {
            body.put("ext", request.extShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.format)) {
            body.put("format", request.format);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            body.put("scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            body.put("sourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            body.put("targetLanguage", request.targetLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textShrink)) {
            body.put("text", request.textShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchTranslate"),
            new TeaPair("version", "2025-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/anytrans/translate/batch"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchTranslateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通义多模态翻译批量翻译</p>
     * 
     * @param request BatchTranslateRequest
     * @return BatchTranslateResponse
     */
    public BatchTranslateResponse batchTranslate(BatchTranslateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchTranslateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通义多模态翻译批量翻译(供js sdk使用)</p>
     * 
     * @param tmpReq BatchTranslateForHtmlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchTranslateForHtmlResponse
     */
    public BatchTranslateForHtmlResponse batchTranslateForHtmlWithOptions(BatchTranslateForHtmlRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchTranslateForHtmlShrinkRequest request = new BatchTranslateForHtmlShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ext)) {
            request.extShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ext, "ext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.text)) {
            request.textShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.text, "text", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("appName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extShrink)) {
            body.put("ext", request.extShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.format)) {
            body.put("format", request.format);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            body.put("scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            body.put("sourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            body.put("targetLanguage", request.targetLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textShrink)) {
            body.put("text", request.textShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchTranslateForHtml"),
            new TeaPair("version", "2025-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/anytrans/translate/batchForHtml"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchTranslateForHtmlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通义多模态翻译批量翻译(供js sdk使用)</p>
     * 
     * @param request BatchTranslateForHtmlRequest
     * @return BatchTranslateForHtmlResponse
     */
    public BatchTranslateForHtmlResponse batchTranslateForHtml(BatchTranslateForHtmlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchTranslateForHtmlWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通义多模态翻译获文档翻译任务</p>
     * 
     * @param request GetDocTranslateTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocTranslateTaskResponse
     */
    public GetDocTranslateTaskResponse getDocTranslateTaskWithOptions(GetDocTranslateTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDocTranslateTask"),
            new TeaPair("version", "2025-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/anytrans/translate/doc/get"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDocTranslateTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通义多模态翻译获文档翻译任务</p>
     * 
     * @param request GetDocTranslateTaskRequest
     * @return GetDocTranslateTaskResponse
     */
    public GetDocTranslateTaskResponse getDocTranslateTask(GetDocTranslateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDocTranslateTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通义多模态翻译获取html翻译结果</p>
     * 
     * @param request GetHtmlTranslateTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHtmlTranslateTaskResponse
     */
    public GetHtmlTranslateTaskResponse getHtmlTranslateTaskWithOptions(GetHtmlTranslateTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHtmlTranslateTask"),
            new TeaPair("version", "2025-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/anytrans/translate/html/get"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHtmlTranslateTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通义多模态翻译获取html翻译结果</p>
     * 
     * @param request GetHtmlTranslateTaskRequest
     * @return GetHtmlTranslateTaskResponse
     */
    public GetHtmlTranslateTaskResponse getHtmlTranslateTask(GetHtmlTranslateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHtmlTranslateTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通义多模态翻译获取图片翻译任务</p>
     * 
     * @param request GetImageTranslateTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetImageTranslateTaskResponse
     */
    public GetImageTranslateTaskResponse getImageTranslateTaskWithOptions(GetImageTranslateTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImageTranslateTask"),
            new TeaPair("version", "2025-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/anytrans/translate/image/get"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageTranslateTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通义多模态翻译获取图片翻译任务</p>
     * 
     * @param request GetImageTranslateTaskRequest
     * @return GetImageTranslateTaskResponse
     */
    public GetImageTranslateTaskResponse getImageTranslateTask(GetImageTranslateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getImageTranslateTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通义多模态翻译获取长文翻译结果</p>
     * 
     * @param request GetLongTextTranslateTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLongTextTranslateTaskResponse
     */
    public GetLongTextTranslateTaskResponse getLongTextTranslateTaskWithOptions(GetLongTextTranslateTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLongTextTranslateTask"),
            new TeaPair("version", "2025-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/anytrans/translate/longText/get"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLongTextTranslateTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通义多模态翻译获取长文翻译结果</p>
     * 
     * @param request GetLongTextTranslateTaskRequest
     * @return GetLongTextTranslateTaskResponse
     */
    public GetLongTextTranslateTaskResponse getLongTextTranslateTask(GetLongTextTranslateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLongTextTranslateTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通义多模态翻译提交文档翻译任务</p>
     * 
     * @param tmpReq SubmitDocTranslateTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitDocTranslateTaskResponse
     */
    public SubmitDocTranslateTaskResponse submitDocTranslateTaskWithOptions(SubmitDocTranslateTaskRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitDocTranslateTaskShrinkRequest request = new SubmitDocTranslateTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ext)) {
            request.extShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ext, "ext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extShrink)) {
            body.put("ext", request.extShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.format)) {
            body.put("format", request.format);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            body.put("scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            body.put("sourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            body.put("targetLanguage", request.targetLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitDocTranslateTask"),
            new TeaPair("version", "2025-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/anytrans/translate/doc/submit"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitDocTranslateTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通义多模态翻译提交文档翻译任务</p>
     * 
     * @param request SubmitDocTranslateTaskRequest
     * @return SubmitDocTranslateTaskResponse
     */
    public SubmitDocTranslateTaskResponse submitDocTranslateTask(SubmitDocTranslateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitDocTranslateTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通义多模态翻译提交html翻译任务</p>
     * 
     * @param tmpReq SubmitHtmlTranslateTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitHtmlTranslateTaskResponse
     */
    public SubmitHtmlTranslateTaskResponse submitHtmlTranslateTaskWithOptions(SubmitHtmlTranslateTaskRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitHtmlTranslateTaskShrinkRequest request = new SubmitHtmlTranslateTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ext)) {
            request.extShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ext, "ext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extShrink)) {
            body.put("ext", request.extShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.format)) {
            body.put("format", request.format);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            body.put("scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            body.put("sourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            body.put("targetLanguage", request.targetLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitHtmlTranslateTask"),
            new TeaPair("version", "2025-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/anytrans/translate/html/submit"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitHtmlTranslateTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通义多模态翻译提交html翻译任务</p>
     * 
     * @param request SubmitHtmlTranslateTaskRequest
     * @return SubmitHtmlTranslateTaskResponse
     */
    public SubmitHtmlTranslateTaskResponse submitHtmlTranslateTask(SubmitHtmlTranslateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitHtmlTranslateTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通义多模态翻译提交图片翻译任务</p>
     * 
     * @param tmpReq SubmitImageTranslateTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitImageTranslateTaskResponse
     */
    public SubmitImageTranslateTaskResponse submitImageTranslateTaskWithOptions(SubmitImageTranslateTaskRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitImageTranslateTaskShrinkRequest request = new SubmitImageTranslateTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ext)) {
            request.extShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ext, "ext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.targetLanguage)) {
            request.targetLanguageShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.targetLanguage, "targetLanguage", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extShrink)) {
            body.put("ext", request.extShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.format)) {
            body.put("format", request.format);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            body.put("scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            body.put("sourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguageShrink)) {
            body.put("targetLanguage", request.targetLanguageShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitImageTranslateTask"),
            new TeaPair("version", "2025-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/anytrans/translate/image/submit"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitImageTranslateTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通义多模态翻译提交图片翻译任务</p>
     * 
     * @param request SubmitImageTranslateTaskRequest
     * @return SubmitImageTranslateTaskResponse
     */
    public SubmitImageTranslateTaskResponse submitImageTranslateTask(SubmitImageTranslateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitImageTranslateTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通义多模态翻译提交长文翻译任务</p>
     * 
     * @param tmpReq SubmitLongTextTranslateTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitLongTextTranslateTaskResponse
     */
    public SubmitLongTextTranslateTaskResponse submitLongTextTranslateTaskWithOptions(SubmitLongTextTranslateTaskRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitLongTextTranslateTaskShrinkRequest request = new SubmitLongTextTranslateTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ext)) {
            request.extShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ext, "ext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extShrink)) {
            body.put("ext", request.extShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.format)) {
            body.put("format", request.format);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            body.put("scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            body.put("sourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            body.put("targetLanguage", request.targetLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitLongTextTranslateTask"),
            new TeaPair("version", "2025-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/anytrans/translate/longText/submit"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitLongTextTranslateTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通义多模态翻译提交长文翻译任务</p>
     * 
     * @param request SubmitLongTextTranslateTaskRequest
     * @return SubmitLongTextTranslateTaskResponse
     */
    public SubmitLongTextTranslateTaskResponse submitLongTextTranslateTask(SubmitLongTextTranslateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitLongTextTranslateTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通义多模态翻译术语编辑</p>
     * 
     * @param tmpReq TermEditRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TermEditResponse
     */
    public TermEditResponse termEditWithOptions(TermEditRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TermEditShrinkRequest request = new TermEditShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ext)) {
            request.extShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ext, "ext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            body.put("action", request.action);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extShrink)) {
            body.put("ext", request.extShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            body.put("scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            body.put("sourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            body.put("targetLanguage", request.targetLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TermEdit"),
            new TeaPair("version", "2025-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/anytrans/translate/intervene/edit"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TermEditResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通义多模态翻译术语编辑</p>
     * 
     * @param request TermEditRequest
     * @return TermEditResponse
     */
    public TermEditResponse termEdit(TermEditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.termEditWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通义多模态翻译术语查询</p>
     * 
     * @param tmpReq TermQueryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TermQueryResponse
     */
    public TermQueryResponse termQueryWithOptions(TermQueryRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TermQueryShrinkRequest request = new TermQueryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ext)) {
            request.extShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ext, "ext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extShrink)) {
            body.put("ext", request.extShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            body.put("scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            body.put("sourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            body.put("targetLanguage", request.targetLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TermQuery"),
            new TeaPair("version", "2025-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/anytrans/translate/intervene/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TermQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通义多模态翻译术语查询</p>
     * 
     * @param request TermQueryRequest
     * @return TermQueryResponse
     */
    public TermQueryResponse termQuery(TermQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.termQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通义多模态翻译文本翻译</p>
     * 
     * @param tmpReq TextTranslateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TextTranslateResponse
     */
    public TextTranslateResponse textTranslateWithOptions(TextTranslateRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TextTranslateShrinkRequest request = new TextTranslateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ext)) {
            request.extShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ext, "ext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extShrink)) {
            body.put("ext", request.extShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.format)) {
            body.put("format", request.format);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            body.put("scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            body.put("sourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLanguage)) {
            body.put("targetLanguage", request.targetLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TextTranslate"),
            new TeaPair("version", "2025-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/anytrans/translate/text"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TextTranslateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通义多模态翻译文本翻译</p>
     * 
     * @param request TextTranslateRequest
     * @return TextTranslateResponse
     */
    public TextTranslateResponse textTranslate(TextTranslateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.textTranslateWithOptions(request, headers, runtime);
    }
}
