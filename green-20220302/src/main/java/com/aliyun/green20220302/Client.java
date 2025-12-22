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
     * <b>description</b> :
     * <p>  Billing: This operation is free of charge.</p>
     * <ul>
     * <li>QPS limit: You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains the moderation results of an Image Moderation 2.0 task.</p>
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
     * <b>description</b> :
     * <p>  Billing: This operation is free of charge.</p>
     * <ul>
     * <li>QPS limit: You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains the moderation results of an Image Moderation 2.0 task.</p>
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
     * <p>查询异步多模态检测结果</p>
     * 
     * @param request DescribeMultimodalModerationResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMultimodalModerationResultResponse
     */
    public DescribeMultimodalModerationResultResponse describeMultimodalModerationResultWithOptions(DescribeMultimodalModerationResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reqId)) {
            query.put("ReqId", request.reqId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMultimodalModerationResult"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMultimodalModerationResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询异步多模态检测结果</p>
     * 
     * @param request DescribeMultimodalModerationResultRequest
     * @return DescribeMultimodalModerationResultResponse
     */
    public DescribeMultimodalModerationResultResponse describeMultimodalModerationResult(DescribeMultimodalModerationResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMultimodalModerationResultWithOptions(request, runtime);
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
     * <b>description</b> :
     * <p>  Billing: This operation is free of charge.</p>
     * <ul>
     * <li>Query timeout: We recommend that you query moderation results at least 480 seconds after you send an asynchronous moderation request. Content Moderation retains moderation results for up to 3 days. After 3 days, the results are deleted.</li>
     * <li>You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the moderation results based on the ReqId returned by asynchronous URL moderation.</p>
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
     * <b>description</b> :
     * <p>  Billing: This operation is free of charge.</p>
     * <ul>
     * <li>Query timeout: We recommend that you query moderation results at least 480 seconds after you send an asynchronous moderation request. Content Moderation retains moderation results for up to 3 days. After 3 days, the results are deleted.</li>
     * <li>You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the moderation results based on the ReqId returned by asynchronous URL moderation.</p>
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
     * <p>图片批量调用</p>
     * 
     * @param request ImageBatchModerationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImageBatchModerationResponse
     */
    public ImageBatchModerationResponse imageBatchModerationWithOptions(ImageBatchModerationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ImageBatchModeration"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImageBatchModerationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>图片批量调用</p>
     * 
     * @param request ImageBatchModerationRequest
     * @return ImageBatchModerationResponse
     */
    public ImageBatchModerationResponse imageBatchModeration(ImageBatchModerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.imageBatchModerationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>*Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/467826.html">billing</a><a href="https://www.aliyun.com/price/product?#/lvwang/detail/cdibag"></a> of Image Moderation 2.0.</p>
     * 
     * <b>summary</b> : 
     * <p>Identifies whether an image contains content or elements that violate relevant regulations on network content dissemination, affect the content order of a specific platform, or affect user experience. Image Moderation 2.0 supports over 90 content risk labels and over 100 risk control items. Image Moderation 2.0 of Content Moderation allows you to develop further moderation or governance measures for specific image content based on business scenarios, platform-specific content governance rules, or rich risk labels and scores of confidence levels returned by API calls.</p>
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
     * <b>description</b> :
     * <p>*Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/467826.html">billing</a><a href="https://www.aliyun.com/price/product?#/lvwang/detail/cdibag"></a> of Image Moderation 2.0.</p>
     * 
     * <b>summary</b> : 
     * <p>Identifies whether an image contains content or elements that violate relevant regulations on network content dissemination, affect the content order of a specific platform, or affect user experience. Image Moderation 2.0 supports over 90 content risk labels and over 100 risk control items. Image Moderation 2.0 of Content Moderation allows you to develop further moderation or governance measures for specific image content based on business scenarios, platform-specific content governance rules, or rich risk labels and scores of confidence levels returned by API calls.</p>
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
     * <p>图片审核</p>
     * 
     * @param request ImageQueueModerationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImageQueueModerationResponse
     */
    public ImageQueueModerationResponse imageQueueModerationWithOptions(ImageQueueModerationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ImageQueueModeration"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImageQueueModerationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>图片审核</p>
     * 
     * @param request ImageQueueModerationRequest
     * @return ImageQueueModerationResponse
     */
    public ImageQueueModerationResponse imageQueueModeration(ImageQueueModerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.imageQueueModerationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Content Security Manual Review Result Callback Interface</p>
     * 
     * @param request ManualCallbackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ManualCallbackResponse
     */
    public ManualCallbackResponse manualCallbackWithOptions(ManualCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            body.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checksum)) {
            body.put("Checksum", request.checksum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msg)) {
            body.put("Msg", request.msg);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqId)) {
            body.put("ReqId", request.reqId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ManualCallback"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ManualCallbackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Content Security Manual Review Result Callback Interface</p>
     * 
     * @param request ManualCallbackRequest
     * @return ManualCallbackResponse
     */
    public ManualCallbackResponse manualCallback(ManualCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.manualCallbackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Content Security Manual Review Request Interface</p>
     * 
     * @param request ManualModerationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ManualModerationResponse
     */
    public ManualModerationResponse manualModerationWithOptions(ManualModerationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ManualModeration"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ManualModerationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Content Security Manual Review Request Interface</p>
     * 
     * @param request ManualModerationRequest
     * @return ManualModerationResponse
     */
    public ManualModerationResponse manualModeration(ManualModerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.manualModerationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve manual review results</p>
     * 
     * @param request ManualModerationResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ManualModerationResultResponse
     */
    public ManualModerationResultResponse manualModerationResultWithOptions(ManualModerationResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            body.put("ServiceParameters", request.serviceParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ManualModerationResult"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ManualModerationResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve manual review results</p>
     * 
     * @param request ManualModerationResultRequest
     * @return ManualModerationResultResponse
     */
    public ManualModerationResultResponse manualModerationResult(ManualModerationResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.manualModerationResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>同步检测接口</p>
     * 
     * @param request MultiModalGuardRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MultiModalGuardResponse
     */
    public MultiModalGuardResponse multiModalGuardWithOptions(MultiModalGuardRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "MultiModalGuard"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MultiModalGuardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>同步检测接口</p>
     * 
     * @param request MultiModalGuardRequest
     * @return MultiModalGuardResponse
     */
    public MultiModalGuardResponse multiModalGuard(MultiModalGuardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.multiModalGuardWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>多模态同步检测接口，支持图片base64字符串</p>
     * 
     * @param request MultiModalGuardForBase64Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return MultiModalGuardForBase64Response
     */
    public MultiModalGuardForBase64Response multiModalGuardForBase64WithOptions(MultiModalGuardForBase64Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            query.put("Service", request.service);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageBase64Str)) {
            body.put("ImageBase64Str", request.imageBase64Str);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            body.put("ServiceParameters", request.serviceParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MultiModalGuardForBase64"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MultiModalGuardForBase64Response());
    }

    /**
     * <b>summary</b> : 
     * <p>多模态同步检测接口，支持图片base64字符串</p>
     * 
     * @param request MultiModalGuardForBase64Request
     * @return MultiModalGuardForBase64Response
     */
    public MultiModalGuardForBase64Response multiModalGuardForBase64(MultiModalGuardForBase64Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.multiModalGuardForBase64WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>多模态-异步检测</p>
     * 
     * @param request MultimodalAsyncModerationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MultimodalAsyncModerationResponse
     */
    public MultimodalAsyncModerationResponse multimodalAsyncModerationWithOptions(MultimodalAsyncModerationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "MultimodalAsyncModeration"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MultimodalAsyncModerationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>多模态-异步检测</p>
     * 
     * @param request MultimodalAsyncModerationRequest
     * @return MultimodalAsyncModerationResponse
     */
    public MultimodalAsyncModerationResponse multimodalAsyncModeration(MultimodalAsyncModerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.multimodalAsyncModerationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/464388.html?#section-itm-m2s-ugq">billing</a> of Text Moderation 2.0.</p>
     * 
     * <b>summary</b> : 
     * <p>Provides moderation services for multiple business scenarios and identifies various violation risks.</p>
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
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/464388.html?#section-itm-m2s-ugq">billing</a> of Text Moderation 2.0.</p>
     * 
     * <b>summary</b> : 
     * <p>Provides moderation services for multiple business scenarios and identifies various violation risks.</p>
     * 
     * @param request TextModerationRequest
     * @return TextModerationResponse
     */
    public TextModerationResponse textModeration(TextModerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.textModerationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have <a href="https://common-buy.aliyun.com/?commodityCode=lvwang_cip_public_cn">activated the Content Moderation 2.0 service</a> and are familiar with the <a href="https://help.aliyun.com/document_detail/2671445.html?#section-6od-32j-99n">billing</a> of the Text Moderation 2.0 Plus service.</p>
     * 
     * <b>summary</b> : 
     * <p>Moderates the input command and generated text of large language models (LLMs). Specific model input commands can be used to retrieve standard answers. The feature of enabling and disabling the moderation labels is also available.</p>
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
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have <a href="https://common-buy.aliyun.com/?commodityCode=lvwang_cip_public_cn">activated the Content Moderation 2.0 service</a> and are familiar with the <a href="https://help.aliyun.com/document_detail/2671445.html?#section-6od-32j-99n">billing</a> of the Text Moderation 2.0 Plus service.</p>
     * 
     * <b>summary</b> : 
     * <p>Moderates the input command and generated text of large language models (LLMs). Specific model input commands can be used to retrieve standard answers. The feature of enabling and disabling the moderation labels is also available.</p>
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
     * <b>description</b> :
     * <p>This operation is free of charge. We recommend that you query moderation results at least 30 seconds after you send an asynchronous moderation request. Content Moderation retains moderation results for at most 24 hours. After 24 hours, the results are deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Get Video Detection Results</p>
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
     * <b>description</b> :
     * <p>This operation is free of charge. We recommend that you query moderation results at least 30 seconds after you send an asynchronous moderation request. Content Moderation retains moderation results for at most 24 hours. After 24 hours, the results are deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Get Video Detection Results</p>
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
     * <p>Obtains the moderation results of a Voice Moderation 2.0 task.</p>
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
     * <p>Obtains the moderation results of a Voice Moderation 2.0 task.</p>
     * 
     * @param request VoiceModerationResultRequest
     * @return VoiceModerationResultResponse
     */
    public VoiceModerationResultResponse voiceModerationResult(VoiceModerationResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.voiceModerationResultWithOptions(request, runtime);
    }
}
