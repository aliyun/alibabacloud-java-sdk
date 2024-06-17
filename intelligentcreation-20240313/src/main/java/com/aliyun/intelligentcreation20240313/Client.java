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
}
