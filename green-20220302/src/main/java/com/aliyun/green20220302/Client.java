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
            new TeaPair("cn-north-2-gov-1", "green.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "green-cip.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-shanghai", "green-cip.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "green-cip.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-beijing", "green-cip.cn-beijing.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "green-cip.ap-southeast-1.aliyuncs.com")
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
     * <p>Document review results</p>
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
     * <p>Document review results</p>
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
     * <ul>
     * <li>Billing information: This operation is not billed.</li>
     * <li>QPS limit: This operation is limited to 100 queries per second (QPS) for each user. If you exceed this limit, your API calls are throttled, which may affect your business. We recommend that you call this operation at a reasonable rate.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the results of an Image Moderation Pro task.</p>
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
     * <ul>
     * <li>Billing information: This operation is not billed.</li>
     * <li>QPS limit: This operation is limited to 100 queries per second (QPS) for each user. If you exceed this limit, your API calls are throttled, which may affect your business. We recommend that you call this operation at a reasonable rate.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the results of an Image Moderation Pro task.</p>
     * 
     * @param request DescribeImageModerationResultRequest
     * @return DescribeImageModerationResultResponse
     */
    public DescribeImageModerationResultResponse describeImageModerationResult(DescribeImageModerationResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImageModerationResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation must be used with the enhanced image moderation API. After you call the enhanced image moderation API operation, you can call this API operation to obtain additional detection information. This API operation is free of charge.</p>
     * 
     * <b>summary</b> : 
     * <p>The enhanced image moderation auxiliary information API operation retrieves additional auxiliary information detected by the enhanced image moderation API operation, including OCR results and custom image library hit information.</p>
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
     * <b>description</b> :
     * <p>This API operation must be used with the enhanced image moderation API. After you call the enhanced image moderation API operation, you can call this API operation to obtain additional detection information. This API operation is free of charge.</p>
     * 
     * <b>summary</b> : 
     * <p>The enhanced image moderation auxiliary information API operation retrieves additional auxiliary information detected by the enhanced image moderation API operation, including OCR results and custom image library hit information.</p>
     * 
     * @param request DescribeImageResultExtRequest
     * @return DescribeImageResultExtResponse
     */
    public DescribeImageResultExtResponse describeImageResultExt(DescribeImageResultExtRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImageResultExtWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Billing information: This API call is free.</li>
     * <li>Query timeout: Wait 30 seconds after you submit an asynchronous moderation task before querying the result. Do not wait longer than 24 hours, or the result will be automatically deleted.</li>
     * <li>This API has a per-user rate limiting limit of 10 requests per second. Exceeding this limit triggers rate limiting, which may affect your service. Call the API responsibly.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query the results of an asynchronous multimodal moderation task.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Billing information: This API call is free.</li>
     * <li>Query timeout: Wait 30 seconds after you submit an asynchronous moderation task before querying the result. Do not wait longer than 24 hours, or the result will be automatically deleted.</li>
     * <li>This API has a per-user rate limiting limit of 10 requests per second. Exceeding this limit triggers rate limiting, which may affect your service. Call the API responsibly.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query the results of an asynchronous multimodal moderation task.</p>
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
     * <p>Retrieves an upload token.</p>
     * 
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
     * <p>Retrieves an upload token.</p>
     * @return DescribeUploadTokenResponse
     */
    public DescribeUploadTokenResponse describeUploadToken() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUploadTokenWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Billing information: This operation is free of charge.</li>
     * <li>Query timeout: We recommend that you set the query interval to 480 seconds (query the results 480 seconds after you submit the asynchronous moderation task). The maximum timeout period is 3 days. After this period, the results are automatically deleted.</li>
     * <li>The QPS limit for this operation is 100 queries per second (QPS) per user. If the limit is exceeded, your API calls will be throttled, which may affect your business. Make sure you call the operation at a reasonable rate.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries moderation results based on the ReqId returned by asynchronous URL moderation.</p>
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
     * <ul>
     * <li>Billing information: This operation is free of charge.</li>
     * <li>Query timeout: We recommend that you set the query interval to 480 seconds (query the results 480 seconds after you submit the asynchronous moderation task). The maximum timeout period is 3 days. After this period, the results are automatically deleted.</li>
     * <li>The QPS limit for this operation is 100 queries per second (QPS) per user. If the limit is exceeded, your API calls will be throttled, which may affect your business. Make sure you call the operation at a reasonable rate.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries moderation results based on the ReqId returned by asynchronous URL moderation.</p>
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
     * <p>Moderates document content.</p>
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
     * <p>Moderates document content.</p>
     * 
     * @param request FileModerationRequest
     * @return FileModerationResponse
     */
    public FileModerationResponse fileModeration(FileModerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.fileModerationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The following image formats are supported: PNG, JPG, JPEG, BMP, WEBP, TIFF, ICO, HEIC, and SVG.</li>
     * <li>The image size cannot exceed 10 MB. The recommended image resolution is greater than 200 × 200 pixels. A low resolution may compromise the accuracy of the Content Moderation algorithm.</li>
     * <li>The timeout period for image downloads is 3 seconds. If an image download exceeds this duration, a download timeout error is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>This API is used for asynchronous image moderation. Asynchronous moderation tasks do not return detection results in real time. You can obtain the detection results using a callback or by polling. The detection results are retained for up to three days.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>The following image formats are supported: PNG, JPG, JPEG, BMP, WEBP, TIFF, ICO, HEIC, and SVG.</li>
     * <li>The image size cannot exceed 10 MB. The recommended image resolution is greater than 200 × 200 pixels. A low resolution may compromise the accuracy of the Content Moderation algorithm.</li>
     * <li>The timeout period for image downloads is 3 seconds. If an image download exceeds this duration, a download timeout error is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>This API is used for asynchronous image moderation. Asynchronous moderation tasks do not return detection results in real time. You can obtain the detection results using a callback or by polling. The detection results are retained for up to three days.</p>
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
     * <p>Batch Invocation of Images</p>
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
     * <p>Batch Invocation of Images</p>
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
     * <p>Before you call this operation, complete the following steps:</p>
     * <ol>
     * <li><a href="https://common-buy.aliyun.com/?commodityCode=lvwang_cip_public_cn">Activate AI Guardrails-Enhanced Edition</a>.</li>
     * <li>Understand the <a href="https://help.aliyun.com/document_detail/467826.html?#section-h06-qz6-1pt">billing methods and pricing</a> of the enhanced image moderation feature.</li>
     * <li>For more information about API usage and parameters, see the <a href="https://help.aliyun.com/document_detail/467829.html">API reference</a>.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Image moderation</p>
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
     * <p>Before you call this operation, complete the following steps:</p>
     * <ol>
     * <li><a href="https://common-buy.aliyun.com/?commodityCode=lvwang_cip_public_cn">Activate AI Guardrails-Enhanced Edition</a>.</li>
     * <li>Understand the <a href="https://help.aliyun.com/document_detail/467826.html?#section-h06-qz6-1pt">billing methods and pricing</a> of the enhanced image moderation feature.</li>
     * <li>For more information about API usage and parameters, see the <a href="https://help.aliyun.com/document_detail/467829.html">API reference</a>.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Image moderation</p>
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
     * <p>The channel callback API for manual review results in Content Moderation.</p>
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
     * <p>The channel callback API for manual review results in Content Moderation.</p>
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
     * <p>Interface for submitting Content Moderation manual review requests</p>
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
     * <p>Interface for submitting Content Moderation manual review requests</p>
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
     * <p>Retrieves the manual review result.</p>
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
     * <p>Retrieves the manual review result.</p>
     * 
     * @param request ManualModerationResultRequest
     * @return ManualModerationResultResponse
     */
    public ManualModerationResultResponse manualModerationResult(ManualModerationResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.manualModerationResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This is the AI Guardrails agent.</p>
     * 
     * <b>summary</b> : 
     * <p>This is the synchronous detection API for the multi-modal agent.</p>
     * 
     * @param request MultiModalAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MultiModalAgentResponse
     */
    public MultiModalAgentResponse multiModalAgentWithOptions(MultiModalAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appID)) {
            body.put("AppID", request.appID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            body.put("ServiceParameters", request.serviceParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MultiModalAgent"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MultiModalAgentResponse());
    }

    /**
     * <b>description</b> :
     * <p>This is the AI Guardrails agent.</p>
     * 
     * <b>summary</b> : 
     * <p>This is the synchronous detection API for the multi-modal agent.</p>
     * 
     * @param request MultiModalAgentRequest
     * @return MultiModalAgentResponse
     */
    public MultiModalAgentResponse multiModalAgent(MultiModalAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.multiModalAgentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The content moderation Agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Synchronously detects multimodal content by using the Agent API.</p>
     * 
     * @param request MultiModalAgentSSERequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MultiModalAgentSSEResponse
     */
    public MultiModalAgentSSEResponse multiModalAgentSSEWithOptions(MultiModalAgentSSERequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appID)) {
            body.put("AppID", request.appID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            body.put("ServiceParameters", request.serviceParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("Stream", request.stream);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MultiModalAgentSSE"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MultiModalAgentSSEResponse());
    }

    /**
     * <b>description</b> :
     * <p>The content moderation Agent.</p>
     * 
     * <b>summary</b> : 
     * <p>Synchronously detects multimodal content by using the Agent API.</p>
     * 
     * @param request MultiModalAgentSSERequest
     * @return MultiModalAgentSSEResponse
     */
    public MultiModalAgentSSEResponse multiModalAgentSSE(MultiModalAgentSSERequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.multiModalAgentSSEWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>API for synchronous detection</p>
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
     * <p>API for synchronous detection</p>
     * 
     * @param request MultiModalGuardRequest
     * @return MultiModalGuardResponse
     */
    public MultiModalGuardResponse multiModalGuard(MultiModalGuardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.multiModalGuardWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If an API is subject to billing, add the following sentence in bold: &quot;Before using this API, ensure that you fully understand the billing methods and pricing of the XXX product.&quot; The word &quot;pricing&quot; must be a hyperlink to https\://www\.aliyun.com/price/product#/ecs/detail.</p>
     * 
     * <b>summary</b> : 
     * <p>An asynchronous multimodal AI safety guardrail API for audio and video. It provides comprehensive detection of non-compliant content, sensitive content, prompt injection attacks, malicious files, and malicious URLs.</p>
     * 
     * @param request MultiModalGuardAsyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MultiModalGuardAsyncResponse
     */
    public MultiModalGuardAsyncResponse multiModalGuardAsyncWithOptions(MultiModalGuardAsyncRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "MultiModalGuardAsync"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MultiModalGuardAsyncResponse());
    }

    /**
     * <b>description</b> :
     * <p>If an API is subject to billing, add the following sentence in bold: &quot;Before using this API, ensure that you fully understand the billing methods and pricing of the XXX product.&quot; The word &quot;pricing&quot; must be a hyperlink to https\://www\.aliyun.com/price/product#/ecs/detail.</p>
     * 
     * <b>summary</b> : 
     * <p>An asynchronous multimodal AI safety guardrail API for audio and video. It provides comprehensive detection of non-compliant content, sensitive content, prompt injection attacks, malicious files, and malicious URLs.</p>
     * 
     * @param request MultiModalGuardAsyncRequest
     * @return MultiModalGuardAsyncResponse
     */
    public MultiModalGuardAsyncResponse multiModalGuardAsync(MultiModalGuardAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.multiModalGuardAsyncWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For APIs that incur charges, add the following sentence in bold at the beginning of the description: &quot;Before you use this API, make sure that you fully understand the billing methods and pricing of the XXX product.&quot; Link the word \&quot;pricing\&quot; to https\://www\.aliyun.com/price/product#/ecs/detail.</p>
     * 
     * <b>summary</b> : 
     * <p>This AI Security Guardrail API retrieves asynchronous multimodal results from both audio and video.</p>
     * 
     * @param request MultiModalGuardAsyncResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MultiModalGuardAsyncResultResponse
     */
    public MultiModalGuardAsyncResultResponse multiModalGuardAsyncResultWithOptions(MultiModalGuardAsyncResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "MultiModalGuardAsyncResult"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MultiModalGuardAsyncResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>For APIs that incur charges, add the following sentence in bold at the beginning of the description: &quot;Before you use this API, make sure that you fully understand the billing methods and pricing of the XXX product.&quot; Link the word \&quot;pricing\&quot; to https\://www\.aliyun.com/price/product#/ecs/detail.</p>
     * 
     * <b>summary</b> : 
     * <p>This AI Security Guardrail API retrieves asynchronous multimodal results from both audio and video.</p>
     * 
     * @param request MultiModalGuardAsyncResultRequest
     * @return MultiModalGuardAsyncResultResponse
     */
    public MultiModalGuardAsyncResultResponse multiModalGuardAsyncResult(MultiModalGuardAsyncResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.multiModalGuardAsyncResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs synchronous multimodal content moderation. Supports base64-encoded image strings.</p>
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
     * <p>Performs synchronous multimodal content moderation. Supports base64-encoded image strings.</p>
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
     * <p>Provides a WebSocket-based multimodal detection API for AI safety guardrails. This API supports content compliance detection, sensitive content detection, prompt attack detection, malicious file detection, malicious URL detection, and other comprehensive detection capabilities.</p>
     * 
     * @param request MultiModalGuardWsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MultiModalGuardWsResponse
     */
    public MultiModalGuardWsResponse multiModalGuardWsWithOptions(MultiModalGuardWsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MultiModalGuardWs"),
            new TeaPair("version", "2022-03-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MultiModalGuardWsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Provides a WebSocket-based multimodal detection API for AI safety guardrails. This API supports content compliance detection, sensitive content detection, prompt attack detection, malicious file detection, malicious URL detection, and other comprehensive detection capabilities.</p>
     * 
     * @param request MultiModalGuardWsRequest
     * @return MultiModalGuardWsResponse
     */
    public MultiModalGuardWsResponse multiModalGuardWs(MultiModalGuardWsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.multiModalGuardWsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The asynchronous URL moderation service supports two billing methods: pay-as-you-go and resource plan usage.</p>
     * <ul>
     * <li>After you activate the enhanced text moderation service, the default billing method is pay-as-you-go. You are billed daily based on actual usage. No charges apply if you do not invoke the service.</li>
     * <li>If your moderation volume is large or your moderation needs are relatively stable, purchase a resource plan in advance. Larger resource plans offer greater discounts. You can stack multiple resource plans.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Multimodal-Asynchronous Detection</p>
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
     * <b>description</b> :
     * <p>The asynchronous URL moderation service supports two billing methods: pay-as-you-go and resource plan usage.</p>
     * <ul>
     * <li>After you activate the enhanced text moderation service, the default billing method is pay-as-you-go. You are billed daily based on actual usage. No charges apply if you do not invoke the service.</li>
     * <li>If your moderation volume is large or your moderation needs are relatively stable, purchase a resource plan in advance. Larger resource plans offer greater discounts. You can stack multiple resource plans.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Multimodal-Asynchronous Detection</p>
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
     * <p>Before you use this operation, review the <a href="https://help.aliyun.com/document_detail/464388.html?#section-itm-m2s-ugq">billing methods and pricing</a> for Text Moderation Plus.</p>
     * 
     * <b>summary</b> : 
     * <p>This service uses dynamic policies and models to defend against adversarial content. It provides moderation services for various business scenarios and detects different types of violations.</p>
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
     * <p>Before you use this operation, review the <a href="https://help.aliyun.com/document_detail/464388.html?#section-itm-m2s-ugq">billing methods and pricing</a> for Text Moderation Plus.</p>
     * 
     * <b>summary</b> : 
     * <p>This service uses dynamic policies and models to defend against adversarial content. It provides moderation services for various business scenarios and detects different types of violations.</p>
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
     * <p>Before you use this API, <a href="https://common-buy.aliyun.com/?commodityCode=lvwang_cip_public_cn">activate AI Guardrails Pro</a> and make sure that you understand the <a href="https://help.aliyun.com/document_detail/2671445.html?#section-6od-32j-99n">billing methods and pricing</a> for Text Moderation Plus.</p>
     * 
     * <b>summary</b> : 
     * <p>Text Moderation Plus is an upgraded service that moderates the input instructions and generated text of large language models (LLMs). This service can retrieve standard answers for specific input instructions and lets you enable or disable moderation labels.</p>
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
     * <p>Before you use this API, <a href="https://common-buy.aliyun.com/?commodityCode=lvwang_cip_public_cn">activate AI Guardrails Pro</a> and make sure that you understand the <a href="https://help.aliyun.com/document_detail/2671445.html?#section-6od-32j-99n">billing methods and pricing</a> for Text Moderation Plus.</p>
     * 
     * <b>summary</b> : 
     * <p>Text Moderation Plus is an upgraded service that moderates the input instructions and generated text of large language models (LLMs). This service can retrieve standard answers for specific input instructions and lets you enable or disable moderation labels.</p>
     * 
     * @param request TextModerationPlusRequest
     * @return TextModerationPlusResponse
     */
    public TextModerationPlusResponse textModerationPlus(TextModerationPlusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.textModerationPlusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The URL asynchronous moderation service supports the pay-as-you-go and resource plan billing methods.</p>
     * <ul>
     * <li>After you activate the enhanced edition of Text Moderation, the default billing method is pay-as-you-go. You are charged CNY 30 per 10,000 calls based on your daily usage. No fees are incurred if you do not call the service.</li>
     * <li>If you have many moderation requests or relatively fixed moderation requirements, we recommend that you purchase resource plans in advance. The larger the resource plan you purchase, the greater the discount you receive. You can purchase and use multiple resource plans.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>The URL asynchronous moderation service detects threats such as fraud, pornography, and gambling in URLs to protect the content ecosystem of your platform.</p>
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
     * <b>description</b> :
     * <p>The URL asynchronous moderation service supports the pay-as-you-go and resource plan billing methods.</p>
     * <ul>
     * <li>After you activate the enhanced edition of Text Moderation, the default billing method is pay-as-you-go. You are charged CNY 30 per 10,000 calls based on your daily usage. No fees are incurred if you do not call the service.</li>
     * <li>If you have many moderation requests or relatively fixed moderation requirements, we recommend that you purchase resource plans in advance. The larger the resource plan you purchase, the greater the discount you receive. You can purchase and use multiple resource plans.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>The URL asynchronous moderation service detects threats such as fraud, pornography, and gambling in URLs to protect the content ecosystem of your platform.</p>
     * 
     * @param request UrlAsyncModerationRequest
     * @return UrlAsyncModerationResponse
     */
    public UrlAsyncModerationResponse urlAsyncModeration(UrlAsyncModerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.urlAsyncModerationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have activated the <a href="https://common-buy.aliyun.com/?commodityCode=lvwang_cip_public_cn">enhanced Content Moderation</a> service and understand the <a href="https://help.aliyun.com/document_detail/2505807.html">billing methods</a> and <a href="https://www.aliyun.com/price/product?#/lvwang/detail/cdibag">pricing</a> of the enhanced video moderation feature.</p>
     * 
     * <b>summary</b> : 
     * <p>The enhanced video moderation feature of Content Moderation detects threats and non-compliant content in video files. Use this operation to submit a moderation task.</p>
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
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have activated the <a href="https://common-buy.aliyun.com/?commodityCode=lvwang_cip_public_cn">enhanced Content Moderation</a> service and understand the <a href="https://help.aliyun.com/document_detail/2505807.html">billing methods</a> and <a href="https://www.aliyun.com/price/product?#/lvwang/detail/cdibag">pricing</a> of the enhanced video moderation feature.</p>
     * 
     * <b>summary</b> : 
     * <p>The enhanced video moderation feature of Content Moderation detects threats and non-compliant content in video files. Use this operation to submit a moderation task.</p>
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
     * <p>Cancels an ApsaraVideo Live moderation task.</p>
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
     * <p>Cancels an ApsaraVideo Live moderation task.</p>
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
     * <p>This operation is not billed. Set the polling interval to 30 seconds (query results 30 seconds after submitting the asynchronous moderation task). The maximum query window is 24 hours. After that, results are automatically deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the task result of an enhanced video content moderation node.</p>
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
     * <p>This operation is not billed. Set the polling interval to 30 seconds (query results 30 seconds after submitting the asynchronous moderation task). The maximum query window is 24 hours. After that, results are automatically deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the task result of an enhanced video content moderation node.</p>
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
     * <p>Submits a task for enhanced voice moderation.</p>
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
     * <p>Submits a task for enhanced voice moderation.</p>
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
     * <p>This operation cancels an enhanced voice moderation task.</p>
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
     * <p>This operation cancels an enhanced voice moderation task.</p>
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
     * <p>Retrieve the detection results for enhanced voice moderation.</p>
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
     * <p>Retrieve the detection results for enhanced voice moderation.</p>
     * 
     * @param request VoiceModerationResultRequest
     * @return VoiceModerationResultResponse
     */
    public VoiceModerationResultResponse voiceModerationResult(VoiceModerationResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.voiceModerationResultWithOptions(request, runtime);
    }
}
