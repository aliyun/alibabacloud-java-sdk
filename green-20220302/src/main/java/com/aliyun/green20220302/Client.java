// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302;

import com.aliyun.tea.*;
import com.aliyun.green20220302.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-chengdu", "green.aliyuncs.com"),
            new TeaPair("cn-hongkong", "green.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "green.aliyuncs.com"),
            new TeaPair("cn-qingdao", "green.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "green.aliyuncs.com"),
            new TeaPair("eu-central-1", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "green.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "green.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "green.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "green.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "green.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("green", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>文档审核结果</p>
     * 
     * @param request DescribeFileModerationResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFileModerationResultResponse
     */
    public DescribeFileModerationResultResponse describeFileModerationResultWithOptions(DescribeFileModerationResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            body.put("Service", request.service);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            body.put("ServiceParameters", request.serviceParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFileModerationResult"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFileModerationResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文档审核结果</p>
     * 
     * @param request DescribeFileModerationResultRequest
     * @return DescribeFileModerationResultResponse
     */
    public DescribeFileModerationResultResponse describeFileModerationResult(DescribeFileModerationResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFileModerationResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询异步检测结果</p>
     * 
     * @param request DescribeImageModerationResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeImageModerationResultResponse
     */
    public DescribeImageModerationResultResponse describeImageModerationResultWithOptions(DescribeImageModerationResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reqId)) {
            query.put("ReqId", request.reqId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImageModerationResult"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImageModerationResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询异步检测结果</p>
     * 
     * @param request DescribeImageModerationResultRequest
     * @return DescribeImageModerationResultResponse
     */
    public DescribeImageModerationResultResponse describeImageModerationResult(DescribeImageModerationResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImageModerationResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询检测结果辅助信息</p>
     * 
     * @param request DescribeImageResultExtRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeImageResultExtResponse
     */
    public DescribeImageResultExtResponse describeImageResultExtWithOptions(DescribeImageResultExtRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.infoType)) {
            body.put("InfoType", request.infoType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqId)) {
            body.put("ReqId", request.reqId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImageResultExt"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImageResultExtResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询检测结果辅助信息</p>
     * 
     * @param request DescribeImageResultExtRequest
     * @return DescribeImageResultExtResponse
     */
    public DescribeImageResultExtResponse describeImageResultExt(DescribeImageResultExtRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImageResultExtWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询上传token</p>
     * 
     * @param request DescribeUploadTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUploadTokenResponse
     */
    public DescribeUploadTokenResponse describeUploadTokenWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUploadToken"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUploadTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询上传token</p>
     * @return DescribeUploadTokenResponse
     */
    public DescribeUploadTokenResponse describeUploadToken() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUploadTokenWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询 url 检测结果</p>
     * 
     * @param request DescribeUrlModerationResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUrlModerationResultResponse
     */
    public DescribeUrlModerationResultResponse describeUrlModerationResultWithOptions(DescribeUrlModerationResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reqId)) {
            body.put("ReqId", request.reqId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUrlModerationResult"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUrlModerationResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询 url 检测结果</p>
     * 
     * @param request DescribeUrlModerationResultRequest
     * @return DescribeUrlModerationResultResponse
     */
    public DescribeUrlModerationResultResponse describeUrlModerationResult(DescribeUrlModerationResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUrlModerationResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文档审核</p>
     * 
     * @param request FileModerationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FileModerationResponse
     */
    public FileModerationResponse fileModerationWithOptions(FileModerationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            body.put("Service", request.service);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            body.put("ServiceParameters", request.serviceParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FileModeration"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FileModerationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文档审核</p>
     * 
     * @param request FileModerationRequest
     * @return FileModerationResponse
     */
    public FileModerationResponse fileModeration(FileModerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.fileModerationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>图片异步检测</p>
     * 
     * @param request ImageAsyncModerationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImageAsyncModerationResponse
     */
    public ImageAsyncModerationResponse imageAsyncModerationWithOptions(ImageAsyncModerationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            query.put("Service", request.service);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            query.put("ServiceParameters", request.serviceParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImageAsyncModeration"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImageAsyncModerationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>图片异步检测</p>
     * 
     * @param request ImageAsyncModerationRequest
     * @return ImageAsyncModerationResponse
     */
    public ImageAsyncModerationResponse imageAsyncModeration(ImageAsyncModerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.imageAsyncModerationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>图片审核</p>
     * 
     * @param request ImageModerationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImageModerationResponse
     */
    public ImageModerationResponse imageModerationWithOptions(ImageModerationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            body.put("Service", request.service);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            body.put("ServiceParameters", request.serviceParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImageModeration"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImageModerationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>图片审核</p>
     * 
     * @param request ImageModerationRequest
     * @return ImageModerationResponse
     */
    public ImageModerationResponse imageModeration(ImageModerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.imageModerationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文本审核</p>
     * 
     * @param request TextModerationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TextModerationResponse
     */
    public TextModerationResponse textModerationWithOptions(TextModerationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            body.put("Service", request.service);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            body.put("ServiceParameters", request.serviceParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TextModeration"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TextModerationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文本审核</p>
     * 
     * @param request TextModerationRequest
     * @return TextModerationResponse
     */
    public TextModerationResponse textModeration(TextModerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.textModerationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文本检测Plus版</p>
     * 
     * @param request TextModerationPlusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TextModerationPlusResponse
     */
    public TextModerationPlusResponse textModerationPlusWithOptions(TextModerationPlusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            body.put("Service", request.service);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            body.put("ServiceParameters", request.serviceParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TextModerationPlus"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TextModerationPlusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文本检测Plus版</p>
     * 
     * @param request TextModerationPlusRequest
     * @return TextModerationPlusResponse
     */
    public TextModerationPlusResponse textModerationPlus(TextModerationPlusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.textModerationPlusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>url异步检测</p>
     * 
     * @param request UrlAsyncModerationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UrlAsyncModerationResponse
     */
    public UrlAsyncModerationResponse urlAsyncModerationWithOptions(UrlAsyncModerationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            query.put("Service", request.service);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            query.put("ServiceParameters", request.serviceParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UrlAsyncModeration"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UrlAsyncModerationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>url异步检测</p>
     * 
     * @param request UrlAsyncModerationRequest
     * @return UrlAsyncModerationResponse
     */
    public UrlAsyncModerationResponse urlAsyncModeration(UrlAsyncModerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.urlAsyncModerationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>视频检测任务提交</p>
     * 
     * @param request VideoModerationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VideoModerationResponse
     */
    public VideoModerationResponse videoModerationWithOptions(VideoModerationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            body.put("Service", request.service);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            body.put("ServiceParameters", request.serviceParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VideoModeration"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VideoModerationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>视频检测任务提交</p>
     * 
     * @param request VideoModerationRequest
     * @return VideoModerationResponse
     */
    public VideoModerationResponse videoModeration(VideoModerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.videoModerationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消视频直播流检测</p>
     * 
     * @param request VideoModerationCancelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VideoModerationCancelResponse
     */
    public VideoModerationCancelResponse videoModerationCancelWithOptions(VideoModerationCancelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            body.put("Service", request.service);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            body.put("ServiceParameters", request.serviceParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VideoModerationCancel"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VideoModerationCancelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消视频直播流检测</p>
     * 
     * @param request VideoModerationCancelRequest
     * @return VideoModerationCancelResponse
     */
    public VideoModerationCancelResponse videoModerationCancel(VideoModerationCancelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.videoModerationCancelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取视频检测结果</p>
     * 
     * @param request VideoModerationResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VideoModerationResultResponse
     */
    public VideoModerationResultResponse videoModerationResultWithOptions(VideoModerationResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            body.put("Service", request.service);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            body.put("ServiceParameters", request.serviceParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VideoModerationResult"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VideoModerationResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取视频检测结果</p>
     * 
     * @param request VideoModerationResultRequest
     * @return VideoModerationResultResponse
     */
    public VideoModerationResultResponse videoModerationResult(VideoModerationResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.videoModerationResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>语音审核</p>
     * 
     * @param request VoiceModerationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VoiceModerationResponse
     */
    public VoiceModerationResponse voiceModerationWithOptions(VoiceModerationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            body.put("Service", request.service);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            body.put("ServiceParameters", request.serviceParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VoiceModeration"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VoiceModerationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>语音审核</p>
     * 
     * @param request VoiceModerationRequest
     * @return VoiceModerationResponse
     */
    public VoiceModerationResponse voiceModeration(VoiceModerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.voiceModerationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消检测</p>
     * 
     * @param request VoiceModerationCancelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VoiceModerationCancelResponse
     */
    public VoiceModerationCancelResponse voiceModerationCancelWithOptions(VoiceModerationCancelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            body.put("Service", request.service);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            body.put("ServiceParameters", request.serviceParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VoiceModerationCancel"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VoiceModerationCancelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消检测</p>
     * 
     * @param request VoiceModerationCancelRequest
     * @return VoiceModerationCancelResponse
     */
    public VoiceModerationCancelResponse voiceModerationCancel(VoiceModerationCancelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.voiceModerationCancelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>语音检测结果获取接口</p>
     * 
     * @param request VoiceModerationResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VoiceModerationResultResponse
     */
    public VoiceModerationResultResponse voiceModerationResultWithOptions(VoiceModerationResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            body.put("Service", request.service);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            body.put("ServiceParameters", request.serviceParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VoiceModerationResult"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VoiceModerationResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>语音检测结果获取接口</p>
     * 
     * @param request VoiceModerationResultRequest
     * @return VoiceModerationResultResponse
     */
    public VoiceModerationResultResponse voiceModerationResult(VoiceModerationResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.voiceModerationResultWithOptions(request, runtime);
    }
}
