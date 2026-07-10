// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.aliyun.cloudauth20190307.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    private final static InterceptorChain interceptorChain = InterceptorChain.create();

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("us-west-1", "cloudauth.aliyuncs.com"),
            new TeaPair("us-east-1", "cloudauth.aliyuncs.com"),
            new TeaPair("me-east-1", "cloudauth.aliyuncs.com"),
            new TeaPair("eu-west-1", "cloudauth.aliyuncs.com"),
            new TeaPair("eu-central-1", "cloudauth.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "cloudauth.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "cloudauth.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "cloudauth.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "cloudauth.aliyuncs.com"),
            new TeaPair("cn-shanghai", "cloudauth.aliyuncs.com"),
            new TeaPair("cn-qingdao", "cloudauth.cn-qingdao.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "cloudauth.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "cloudauth.aliyuncs.com"),
            new TeaPair("cn-hongkong", "cloudauth.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "cloudauth.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "cloudauth.aliyuncs.com"),
            new TeaPair("cn-chengdu", "cloudauth.aliyuncs.com"),
            new TeaPair("cn-beijing", "cloudauth.cn-beijing.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "cloudauth.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "cloudauth.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "cloudauth.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "cloudauth.aliyuncs.com"),
            new TeaPair("ap-south-1", "cloudauth.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "cloudauth.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cloudauth", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }

    public java.util.Map<String, ?> _postOSSObject(String bucketName, java.util.Map<String, ?> data, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, Object> runtime_ = TeaConverter.buildMap(
            new TeaPair("timeouted", "retry"),
            new TeaPair("key", com.aliyun.teautil.Common.defaultString(runtime.key, _key)),
            new TeaPair("cert", com.aliyun.teautil.Common.defaultString(runtime.cert, _cert)),
            new TeaPair("ca", com.aliyun.teautil.Common.defaultString(runtime.ca, _ca)),
            new TeaPair("readTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.readTimeout, _readTimeout)),
            new TeaPair("connectTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.connectTimeout, _connectTimeout)),
            new TeaPair("httpProxy", com.aliyun.teautil.Common.defaultString(runtime.httpProxy, _httpProxy)),
            new TeaPair("httpsProxy", com.aliyun.teautil.Common.defaultString(runtime.httpsProxy, _httpsProxy)),
            new TeaPair("noProxy", com.aliyun.teautil.Common.defaultString(runtime.noProxy, _noProxy)),
            new TeaPair("socks5Proxy", com.aliyun.teautil.Common.defaultString(runtime.socks5Proxy, _socks5Proxy)),
            new TeaPair("socks5NetWork", com.aliyun.teautil.Common.defaultString(runtime.socks5NetWork, _socks5NetWork)),
            new TeaPair("maxIdleConns", com.aliyun.teautil.Common.defaultNumber(runtime.maxIdleConns, _maxIdleConns)),
            new TeaPair("retry", TeaConverter.buildMap(
                new TeaPair("retryable", runtime.autoretry),
                new TeaPair("maxAttempts", com.aliyun.teautil.Common.defaultNumber(runtime.maxAttempts, 3))
            )),
            new TeaPair("backoff", TeaConverter.buildMap(
                new TeaPair("policy", com.aliyun.teautil.Common.defaultString(runtime.backoffPolicy, "no")),
                new TeaPair("period", com.aliyun.teautil.Common.defaultNumber(runtime.backoffPeriod, 1))
            )),
            new TeaPair("ignoreSSL", com.aliyun.teaopenapi.Client.defaultAny(runtime.ignoreSSL, false)),
            new TeaPair("tlsMinVersion", _tlsMinVersion)
        );

        TeaRequest _lastRequest = null;
        Exception _lastException = null;
        long _now = System.currentTimeMillis();
        int _retryTimes = 0;
        while (Tea.allowRetry((java.util.Map<String, Object>) runtime_.get("retry"), _retryTimes, _now)) {
            if (_retryTimes > 0) {
                int backoffTime = Tea.getBackoffTime(runtime_.get("backoff"), _retryTimes);
                if (backoffTime > 0) {
                    Tea.sleep(backoffTime);
                }
            }
            _retryTimes = _retryTimes + 1;
            try {
                TeaRequest request_ = new TeaRequest();
                java.util.Map<String, Object> form = com.aliyun.teautil.Common.assertAsMap(data);
                String boundary = com.aliyun.fileform.Client.getBoundary();
                String tmp = com.aliyun.teautil.Common.assertAsString(form.get("host"));
                String host = "" + bucketName + "." + tmp + "";
                request_.protocol = "HTTPS";
                request_.method = "POST";
                request_.pathname = "/";
                request_.headers = TeaConverter.buildMap(
                    new TeaPair("host", host),
                    new TeaPair("date", com.aliyun.teautil.Common.getDateUTCString()),
                    new TeaPair("user-agent", com.aliyun.teautil.Common.getUserAgent(""))
                );
                request_.headers.put("content-type", "multipart/form-data; boundary=" + boundary + "");
                request_.body = com.aliyun.fileform.Client.toFileForm(form, boundary);
                _lastRequest = request_;
                TeaResponse response_ = Tea.doAction(request_, runtime_, interceptorChain);

                java.util.Map<String, Object> respMap = null;
                String bodyStr = com.aliyun.teautil.Common.readAsString(response_.body);
                if (com.aliyun.teautil.Common.is4xx(response_.statusCode) || com.aliyun.teautil.Common.is5xx(response_.statusCode)) {
                    respMap = com.aliyun.teaxml.Client.parseXml(bodyStr, null);
                    java.util.Map<String, Object> err = com.aliyun.teautil.Common.assertAsMap(respMap.get("Error"));
                    throw new TeaException(TeaConverter.buildMap(
                        new TeaPair("code", err.get("Code")),
                        new TeaPair("message", err.get("Message")),
                        new TeaPair("data", TeaConverter.buildMap(
                            new TeaPair("httpCode", response_.statusCode),
                            new TeaPair("requestId", err.get("RequestId")),
                            new TeaPair("hostId", err.get("HostId"))
                        ))
                    ));
                }

                respMap = com.aliyun.teaxml.Client.parseXml(bodyStr, null);
                return TeaConverter.merge(Object.class,
                    respMap
                );
            } catch (Exception e) {
                if (Tea.isRetryable(e)) {
                    _lastException = e;
                    continue;
                }
                throw e;
            }
        }
        throw new TeaUnretryableException(_lastRequest, _lastException);
    }

    public void addRuntimeOptionsInterceptor(RuntimeOptionsInterceptor interceptor) {
        interceptorChain.addRuntimeOptionsInterceptor(interceptor);
    }

    public void addRequestInterceptor(RequestInterceptor interceptor) {
        interceptorChain.addRequestInterceptor(interceptor);
    }

    public void addResponseInterceptor(ResponseInterceptor interceptor) {
        interceptorChain.addResponseInterceptor(interceptor);
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
     * <p>Detects whether an image is generated by AIGC and returns the detection result.</p>
     * 
     * @param request AIGCFaceVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AIGCFaceVerifyResponse
     */
    public AIGCFaceVerifyResponse aIGCFaceVerifyWithOptions(AIGCFaceVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.faceContrastPictureUrl)) {
            query.put("FaceContrastPictureUrl", request.faceContrastPictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucketName)) {
            query.put("OssBucketName", request.ossBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossObjectName)) {
            query.put("OssObjectName", request.ossObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerOrderNo)) {
            query.put("OuterOrderNo", request.outerOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.faceContrastPicture)) {
            body.put("FaceContrastPicture", request.faceContrastPicture);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AIGCFaceVerify"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AIGCFaceVerifyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Detects whether an image is generated by AIGC and returns the detection result.</p>
     * 
     * @param request AIGCFaceVerifyRequest
     * @return AIGCFaceVerifyResponse
     */
    public AIGCFaceVerifyResponse aIGCFaceVerify(AIGCFaceVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.aIGCFaceVerifyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Verifies bank card information consistency, including two-element verification (name + bank card number), three-element verification (name + ID card number + bank card number), and four-element verification (name + ID card number + phone number + bank card number).</p>
     * <ul>
     * <li>Service endpoint:<ul>
     * <li>Singapore region: cloudauth.ap-southeast-1.aliyuncs.com (IPv4) or cloudauth-dualstack.ap-southeast-1.aliyuncs.com (IPv6).</li>
     * <li>Malaysia region: cloudauth.ap-southeast-3.aliyuncs.com (IPv4) or cloudauth-dualstack.ap-southeast-3.aliyuncs.com (IPv6).</li>
     * </ul>
     * </li>
     * <li>Request method: POST and GET.</li>
     * <li>Transfer protocol: HTTPS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Provides API operations for bank card element verification, including two-element, three-element, and four-element verification.</p>
     * 
     * @param request BankMetaVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BankMetaVerifyResponse
     */
    public BankMetaVerifyResponse bankMetaVerifyWithOptions(BankMetaVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bankCard)) {
            query.put("BankCard", request.bankCard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifyNum)) {
            query.put("IdentifyNum", request.identifyNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityType)) {
            query.put("IdentityType", request.identityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            query.put("ParamType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyMode)) {
            query.put("VerifyMode", request.verifyMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BankMetaVerify"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BankMetaVerifyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Verifies bank card information consistency, including two-element verification (name + bank card number), three-element verification (name + ID card number + bank card number), and four-element verification (name + ID card number + phone number + bank card number).</p>
     * <ul>
     * <li>Service endpoint:<ul>
     * <li>Singapore region: cloudauth.ap-southeast-1.aliyuncs.com (IPv4) or cloudauth-dualstack.ap-southeast-1.aliyuncs.com (IPv6).</li>
     * <li>Malaysia region: cloudauth.ap-southeast-3.aliyuncs.com (IPv4) or cloudauth-dualstack.ap-southeast-3.aliyuncs.com (IPv6).</li>
     * </ul>
     * </li>
     * <li>Request method: POST and GET.</li>
     * <li>Transfer protocol: HTTPS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Provides API operations for bank card element verification, including two-element, three-element, and four-element verification.</p>
     * 
     * @param request BankMetaVerifyRequest
     * @return BankMetaVerifyResponse
     */
    public BankMetaVerifyResponse bankMetaVerify(BankMetaVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bankMetaVerifyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>API operation: CompareFaceVerify.</li>
     * <li>Endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * <li>Operation description: Implements ID Verification through server-side integration.</li>
     * </ul>
     * <h4>Photo format requirements</h4>
     * <p>When performing face comparison, submit two face photos that meet all of the following conditions:</p>
     * <ul>
     * <li>Recent photos or recent reference photos with a complete, clear, and unobstructed face, a natural expression, and the subject facing the camera directly.</li>
     * <li>Clear photos with normal exposure. The face must not be too dark, too bright, or have lens flare, and the angle must not deviate significantly.</li>
     * <li>Resolution must not exceed 1920×1080 and must be at least 640×480. The short side is recommended to be scaled to 720 pixels with a compression ratio greater than 0.9.</li>
     * <li>Photo size: &lt; 1 MB.</li>
     * <li>Photos rotated 90, 180, and 270 degrees are supported. If multiple faces are detected, the largest face is selected.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Provides a financial-grade server-side API for face comparison.</p>
     * 
     * @param request CompareFaceVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CompareFaceVerifyResponse
     */
    public CompareFaceVerifyResponse compareFaceVerifyWithOptions(CompareFaceVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crop)) {
            body.put("Crop", request.crop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerOrderNo)) {
            body.put("OuterOrderNo", request.outerOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCertifyId)) {
            body.put("SourceCertifyId", request.sourceCertifyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceFaceContrastPicture)) {
            body.put("SourceFaceContrastPicture", request.sourceFaceContrastPicture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceFaceContrastPictureUrl)) {
            body.put("SourceFaceContrastPictureUrl", request.sourceFaceContrastPictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOssBucketName)) {
            body.put("SourceOssBucketName", request.sourceOssBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOssObjectName)) {
            body.put("SourceOssObjectName", request.sourceOssObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetCertifyId)) {
            body.put("TargetCertifyId", request.targetCertifyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetFaceContrastPicture)) {
            body.put("TargetFaceContrastPicture", request.targetFaceContrastPicture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetFaceContrastPictureUrl)) {
            body.put("TargetFaceContrastPictureUrl", request.targetFaceContrastPictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetOssBucketName)) {
            body.put("TargetOssBucketName", request.targetOssBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetOssObjectName)) {
            body.put("TargetOssObjectName", request.targetOssObjectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompareFaceVerify"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompareFaceVerifyResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>API operation: CompareFaceVerify.</li>
     * <li>Endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * <li>Operation description: Implements ID Verification through server-side integration.</li>
     * </ul>
     * <h4>Photo format requirements</h4>
     * <p>When performing face comparison, submit two face photos that meet all of the following conditions:</p>
     * <ul>
     * <li>Recent photos or recent reference photos with a complete, clear, and unobstructed face, a natural expression, and the subject facing the camera directly.</li>
     * <li>Clear photos with normal exposure. The face must not be too dark, too bright, or have lens flare, and the angle must not deviate significantly.</li>
     * <li>Resolution must not exceed 1920×1080 and must be at least 640×480. The short side is recommended to be scaled to 720 pixels with a compression ratio greater than 0.9.</li>
     * <li>Photo size: &lt; 1 MB.</li>
     * <li>Photos rotated 90, 180, and 270 degrees are supported. If multiple faces are detected, the largest face is selected.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Provides a financial-grade server-side API for face comparison.</p>
     * 
     * @param request CompareFaceVerifyRequest
     * @return CompareFaceVerifyResponse
     */
    public CompareFaceVerifyResponse compareFaceVerify(CompareFaceVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.compareFaceVerifyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Request method: Only HTTPS POST requests are supported.
     * Operation description: Specifies two face images for comparison and returns a similarity score between the faces in the two images.</p>
     * <ul>
     * <li>At least one of the specified comparison images must be of the face photo type (FacePic).</li>
     * <li>If an image contains multiple faces, the algorithm automatically selects the face that occupies the largest area in the image.</li>
     * <li>If no face is detected in one of the two comparison images, the system returns a &quot;No face detected&quot; error.
     * When you submit images, you must provide the corresponding HTTP URL or Base64 encoding of each image.</li>
     * <li>HTTP URL: A publicly accessible HTTP URL. For example, <code>http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg</code>.</li>
     * <li>Base64 encoding: A Base64-encoded image in the format <code>base64://&lt;Base64-encoded image string&gt;</code>.
     * Image limits.</li>
     * <li>Relative paths or absolute paths of local images are not supported.</li>
     * <li>Keep the size of each image within 2 MB to avoid algorithm retrieval timeout.</li>
     * <li>The body of a single request has a size limit of 8 MB. Make sure that the total size of all images and other information in the request does not exceed this limit.</li>
     * <li>When you use Base64 to transmit images, set the request method to POST. Remove the header description from the Base64 character string, such as <code>data:image/png;base64,</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Performs face comparison.</p>
     * 
     * @param request CompareFacesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CompareFacesResponse
     */
    public CompareFacesResponse compareFacesWithOptions(CompareFacesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceImageType)) {
            body.put("SourceImageType", request.sourceImageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceImageValue)) {
            body.put("SourceImageValue", request.sourceImageValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetImageType)) {
            body.put("TargetImageType", request.targetImageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetImageValue)) {
            body.put("TargetImageValue", request.targetImageValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompareFaces"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompareFacesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Request method: Only HTTPS POST requests are supported.
     * Operation description: Specifies two face images for comparison and returns a similarity score between the faces in the two images.</p>
     * <ul>
     * <li>At least one of the specified comparison images must be of the face photo type (FacePic).</li>
     * <li>If an image contains multiple faces, the algorithm automatically selects the face that occupies the largest area in the image.</li>
     * <li>If no face is detected in one of the two comparison images, the system returns a &quot;No face detected&quot; error.
     * When you submit images, you must provide the corresponding HTTP URL or Base64 encoding of each image.</li>
     * <li>HTTP URL: A publicly accessible HTTP URL. For example, <code>http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg</code>.</li>
     * <li>Base64 encoding: A Base64-encoded image in the format <code>base64://&lt;Base64-encoded image string&gt;</code>.
     * Image limits.</li>
     * <li>Relative paths or absolute paths of local images are not supported.</li>
     * <li>Keep the size of each image within 2 MB to avoid algorithm retrieval timeout.</li>
     * <li>The body of a single request has a size limit of 8 MB. Make sure that the total size of all images and other information in the request does not exceed this limit.</li>
     * <li>When you use Base64 to transmit images, set the request method to POST. Remove the header description from the Base64 character string, such as <code>data:image/png;base64,</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Performs face comparison.</p>
     * 
     * @param request CompareFacesRequest
     * @return CompareFacesResponse
     */
    public CompareFacesResponse compareFaces(CompareFacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.compareFacesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>API operation: ContrastFaceVerify.</li>
     * <li>Endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * <li>Operation description: An API operation that implements ID Verification through server-side integration.</li>
     * </ul>
     * <h4>Image format requirements</h4>
     * <p>When performing ID Verification, submit images that meet all of the following conditions:</p>
     * <ul>
     * <li>A recent photo with a complete, clear, and unobstructed face, a natural expression, and the subject facing the camera directly.</li>
     * <li>A clear photo with normal exposure. The face must not be too dark, too bright, or have glare, and the angle must not deviate significantly.</li>
     * <li>The resolution must not exceed 1920 × 1080 and must be at least 640 × 480. We recommend scaling the short side to 720 pixels with a compression ratio greater than 0.9.</li>
     * <li>Photo size: &lt; 1 MB.</li>
     * <li>Photos rotated 90, 180, and 270 degrees are supported. If multiple faces are detected, the largest face is selected.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits verification materials for identity comparison and synchronously returns the verification result.</p>
     * 
     * @param request ContrastFaceVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ContrastFaceVerifyResponse
     */
    public ContrastFaceVerifyResponse contrastFaceVerifyWithOptions(ContrastFaceVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            query.put("Model", request.model);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certName)) {
            body.put("CertName", request.certName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certNo)) {
            body.put("CertNo", request.certNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certType)) {
            body.put("CertType", request.certType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certifyId)) {
            body.put("CertifyId", request.certifyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crop)) {
            body.put("Crop", request.crop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceToken)) {
            body.put("DeviceToken", request.deviceToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptType)) {
            body.put("EncryptType", request.encryptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceContrastFile)) {
            body.put("FaceContrastFile", request.faceContrastFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceContrastPicture)) {
            body.put("FaceContrastPicture", request.faceContrastPicture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceContrastPictureUrl)) {
            body.put("FaceContrastPictureUrl", request.faceContrastPictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            body.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            body.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucketName)) {
            body.put("OssBucketName", request.ossBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossObjectName)) {
            body.put("OssObjectName", request.ossObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerOrderNo)) {
            body.put("OuterOrderNo", request.outerOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ContrastFaceVerify"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ContrastFaceVerifyResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>API operation: ContrastFaceVerify.</li>
     * <li>Endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * <li>Operation description: An API operation that implements ID Verification through server-side integration.</li>
     * </ul>
     * <h4>Image format requirements</h4>
     * <p>When performing ID Verification, submit images that meet all of the following conditions:</p>
     * <ul>
     * <li>A recent photo with a complete, clear, and unobstructed face, a natural expression, and the subject facing the camera directly.</li>
     * <li>A clear photo with normal exposure. The face must not be too dark, too bright, or have glare, and the angle must not deviate significantly.</li>
     * <li>The resolution must not exceed 1920 × 1080 and must be at least 640 × 480. We recommend scaling the short side to 720 pixels with a compression ratio greater than 0.9.</li>
     * <li>Photo size: &lt; 1 MB.</li>
     * <li>Photos rotated 90, 180, and 270 degrees are supported. If multiple faces are detected, the largest face is selected.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits verification materials for identity comparison and synchronously returns the verification result.</p>
     * 
     * @param request ContrastFaceVerifyRequest
     * @return ContrastFaceVerifyResponse
     */
    public ContrastFaceVerifyResponse contrastFaceVerify(ContrastFaceVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.contrastFaceVerifyWithOptions(request, runtime);
    }

    public ContrastFaceVerifyResponse contrastFaceVerifyAdvance(ContrastFaceVerifyAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        com.aliyun.credentials.models.CredentialModel credentialModel = null;
        if (com.aliyun.teautil.Common.isUnset(_credential)) {
            throw new TeaException(TeaConverter.buildMap(
                new TeaPair("code", "InvalidCredentials"),
                new TeaPair("message", "Please set up the credentials correctly. If you are setting them through environment variables, please ensure that ALIBABA_CLOUD_ACCESS_KEY_ID and ALIBABA_CLOUD_ACCESS_KEY_SECRET are set correctly. See https://help.aliyun.com/zh/sdk/developer-reference/configure-the-alibaba-cloud-accesskey-environment-variable-on-linux-macos-and-windows-systems for more details.")
            ));
        }

        credentialModel = _credential.getCredential();
        String accessKeyId = credentialModel.accessKeyId;
        String accessKeySecret = credentialModel.accessKeySecret;
        String securityToken = credentialModel.securityToken;
        String credentialType = credentialModel.type;
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.teaopenapi.Client authClient = new com.aliyun.teaopenapi.Client(authConfig);
        java.util.Map<String, String> authRequest = TeaConverter.buildMap(
            new TeaPair("Product", "Cloudauth"),
            new TeaPair("RegionId", _regionId)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest authReq = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(authRequest))
        ));
        com.aliyun.teaopenapi.models.Params authParams = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeFileUpload"),
            new TeaPair("version", "2019-12-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        java.util.Map<String, Object> authResponse = new java.util.HashMap<>();
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        java.util.Map<String, Object> ossHeader = new java.util.HashMap<>();
        java.util.Map<String, Object> tmpBody = new java.util.HashMap<>();
        Boolean useAccelerate = false;
        java.util.Map<String, String> authResponseBody = new java.util.HashMap<>();
        ContrastFaceVerifyRequest contrastFaceVerifyReq = new ContrastFaceVerifyRequest();
        com.aliyun.openapiutil.Client.convert(request, contrastFaceVerifyReq);
        if (!com.aliyun.teautil.Common.isUnset(request.faceContrastFileObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.faceContrastFileObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = TeaConverter.buildMap(
                new TeaPair("host", com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType)),
                new TeaPair("OSSAccessKeyId", authResponseBody.get("AccessKeyId")),
                new TeaPair("policy", authResponseBody.get("EncodedPolicy")),
                new TeaPair("Signature", authResponseBody.get("Signature")),
                new TeaPair("key", authResponseBody.get("ObjectKey")),
                new TeaPair("file", fileObj),
                new TeaPair("success_action_status", "201")
            );
            this._postOSSObject(authResponseBody.get("Bucket"), ossHeader, runtime);
            contrastFaceVerifyReq.faceContrastFile = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        ContrastFaceVerifyResponse contrastFaceVerifyResp = this.contrastFaceVerifyWithOptions(contrastFaceVerifyReq, runtime);
        return contrastFaceVerifyResp;
    }

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests by using HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. Obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a network access credential.</p>
     * 
     * @param request CreateAntCloudAuthSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAntCloudAuthSceneResponse
     */
    public CreateAntCloudAuthSceneResponse createAntCloudAuthSceneWithOptions(CreateAntCloudAuthSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bindMiniProgram)) {
            query.put("BindMiniProgram", request.bindMiniProgram);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkFileBody)) {
            query.put("CheckFileBody", request.checkFileBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkFileName)) {
            query.put("CheckFileName", request.checkFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceRiskPlus)) {
            query.put("DeviceRiskPlus", request.deviceRiskPlus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.miniProgramName)) {
            query.put("MiniProgramName", request.miniProgramName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnPicCount)) {
            query.put("ReturnPicCount", request.returnPicCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnVideoLength)) {
            query.put("ReturnVideoLength", request.returnVideoLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneName)) {
            query.put("SceneName", request.sceneName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeImage)) {
            query.put("StoreImage", request.storeImage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAntCloudAuthScene"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAntCloudAuthSceneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests by using HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. Obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a network access credential.</p>
     * 
     * @param request CreateAntCloudAuthSceneRequest
     * @return CreateAntCloudAuthSceneResponse
     */
    public CreateAntCloudAuthSceneResponse createAntCloudAuthScene(CreateAntCloudAuthSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAntCloudAuthSceneWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests by using HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. Obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Obtains an authorization key for activating the offline facial recognition SDK.</p>
     * 
     * @param request CreateAuthKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAuthKeyResponse
     */
    public CreateAuthKeyResponse createAuthKeyWithOptions(CreateAuthKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authYears)) {
            query.put("AuthYears", request.authYears);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.test)) {
            query.put("Test", request.test);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDeviceId)) {
            query.put("UserDeviceId", request.userDeviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAuthKey"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAuthKeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests by using HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. Obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Obtains an authorization key for activating the offline facial recognition SDK.</p>
     * 
     * @param request CreateAuthKeyRequest
     * @return CreateAuthKeyResponse
     */
    public CreateAuthKeyResponse createAuthKey(CreateAuthKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAuthKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests by using HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization code is valid for 30 minutes and cannot be reused. Obtain a new authorization code before each activation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates an authentication scenario for enhanced ID Verification.</p>
     * 
     * @param request CreateCloudauthstSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCloudauthstSceneResponse
     */
    public CreateCloudauthstSceneResponse createCloudauthstSceneWithOptions(CreateCloudauthstSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneName)) {
            query.put("SceneName", request.sceneName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeImage)) {
            query.put("StoreImage", request.storeImage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCloudauthstScene"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCloudauthstSceneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests by using HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization code is valid for 30 minutes and cannot be reused. Obtain a new authorization code before each activation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates an authentication scenario for enhanced ID Verification.</p>
     * 
     * @param request CreateCloudauthstSceneRequest
     * @return CreateCloudauthstSceneResponse
     */
    public CreateCloudauthstSceneResponse createCloudauthstScene(CreateCloudauthstSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCloudauthstSceneWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Request method: Send requests by using the HTTPS POST method.
     * Request URL: cloudauth.aliyuncs.com.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. Obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a willingness authentication configuration.</p>
     * 
     * @param request CreateSceneConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSceneConfigResponse
     */
    public CreateSceneConfigResponse createSceneConfigWithOptions(CreateSceneConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("sceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSceneConfig"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSceneConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>Request method: Send requests by using the HTTPS POST method.
     * Request URL: cloudauth.aliyuncs.com.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. Obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a willingness authentication configuration.</p>
     * 
     * @param request CreateSceneConfigRequest
     * @return CreateSceneConfigResponse
     */
    public CreateSceneConfigResponse createSceneConfig(CreateSceneConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSceneConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Request method: Only HTTPS POST requests are supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an ID Verification scenario configuration. This is equivalent to creating a verification scenario in the console.</p>
     * 
     * @param request CreateVerifySettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVerifySettingResponse
     */
    public CreateVerifySettingResponse createVerifySettingWithOptions(CreateVerifySettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizName)) {
            query.put("BizName", request.bizName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.guideStep)) {
            query.put("GuideStep", request.guideStep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privacyStep)) {
            query.put("PrivacyStep", request.privacyStep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultStep)) {
            query.put("ResultStep", request.resultStep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solution)) {
            query.put("Solution", request.solution);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVerifySetting"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVerifySettingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Request method: Only HTTPS POST requests are supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an ID Verification scenario configuration. This is equivalent to creating a verification scenario in the console.</p>
     * 
     * @param request CreateVerifySettingRequest
     * @return CreateVerifySettingResponse
     */
    public CreateVerifySettingResponse createVerifySetting(CreateVerifySettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVerifySettingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Request method: Only HTTPS POST requests are supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an authentication whitelist.</p>
     * 
     * @param request CreateWhitelistSettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWhitelistSettingResponse
     */
    public CreateWhitelistSettingResponse createWhitelistSettingWithOptions(CreateWhitelistSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certNo)) {
            query.put("CertNo", request.certNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certifyId)) {
            query.put("CertifyId", request.certifyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validDay)) {
            query.put("ValidDay", request.validDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelistType)) {
            query.put("WhitelistType", request.whitelistType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWhitelistSetting"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWhitelistSettingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Request method: Only HTTPS POST requests are supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an authentication whitelist.</p>
     * 
     * @param request CreateWhitelistSettingRequest
     * @return CreateWhitelistSettingResponse
     */
    public CreateWhitelistSettingResponse createWhitelistSetting(CreateWhitelistSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWhitelistSettingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Submits an e-commerce product image to perform tampering detection, quality (clarity) assessment, and similar image detection. Returns risk labels and risk scores.</p>
     * 
     * <b>summary</b> : 
     * <p>API operation for the product image tampering detection service. Detects image tampering, quality (clarity), and similar images.</p>
     * 
     * @param request CredentialProductVerifyV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return CredentialProductVerifyV2Response
     */
    public CredentialProductVerifyV2Response credentialProductVerifyV2WithOptions(CredentialProductVerifyV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credName)) {
            query.put("CredName", request.credName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credType)) {
            query.put("CredType", request.credType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantId)) {
            query.put("MerchantId", request.merchantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageFile)) {
            body.put("ImageFile", request.imageFile);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CredentialProductVerifyV2"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CredentialProductVerifyV2Response());
    }

    /**
     * <b>description</b> :
     * <p>Submits an e-commerce product image to perform tampering detection, quality (clarity) assessment, and similar image detection. Returns risk labels and risk scores.</p>
     * 
     * <b>summary</b> : 
     * <p>API operation for the product image tampering detection service. Detects image tampering, quality (clarity), and similar images.</p>
     * 
     * @param request CredentialProductVerifyV2Request
     * @return CredentialProductVerifyV2Response
     */
    public CredentialProductVerifyV2Response credentialProductVerifyV2(CredentialProductVerifyV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.credentialProductVerifyV2WithOptions(request, runtime);
    }

    public CredentialProductVerifyV2Response credentialProductVerifyV2Advance(CredentialProductVerifyV2AdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        com.aliyun.credentials.models.CredentialModel credentialModel = null;
        if (com.aliyun.teautil.Common.isUnset(_credential)) {
            throw new TeaException(TeaConverter.buildMap(
                new TeaPair("code", "InvalidCredentials"),
                new TeaPair("message", "Please set up the credentials correctly. If you are setting them through environment variables, please ensure that ALIBABA_CLOUD_ACCESS_KEY_ID and ALIBABA_CLOUD_ACCESS_KEY_SECRET are set correctly. See https://help.aliyun.com/zh/sdk/developer-reference/configure-the-alibaba-cloud-accesskey-environment-variable-on-linux-macos-and-windows-systems for more details.")
            ));
        }

        credentialModel = _credential.getCredential();
        String accessKeyId = credentialModel.accessKeyId;
        String accessKeySecret = credentialModel.accessKeySecret;
        String securityToken = credentialModel.securityToken;
        String credentialType = credentialModel.type;
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.teaopenapi.Client authClient = new com.aliyun.teaopenapi.Client(authConfig);
        java.util.Map<String, String> authRequest = TeaConverter.buildMap(
            new TeaPair("Product", "Cloudauth"),
            new TeaPair("RegionId", _regionId)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest authReq = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(authRequest))
        ));
        com.aliyun.teaopenapi.models.Params authParams = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeFileUpload"),
            new TeaPair("version", "2019-12-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        java.util.Map<String, Object> authResponse = new java.util.HashMap<>();
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        java.util.Map<String, Object> ossHeader = new java.util.HashMap<>();
        java.util.Map<String, Object> tmpBody = new java.util.HashMap<>();
        Boolean useAccelerate = false;
        java.util.Map<String, String> authResponseBody = new java.util.HashMap<>();
        CredentialProductVerifyV2Request credentialProductVerifyV2Req = new CredentialProductVerifyV2Request();
        com.aliyun.openapiutil.Client.convert(request, credentialProductVerifyV2Req);
        if (!com.aliyun.teautil.Common.isUnset(request.imageFileObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.imageFileObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = TeaConverter.buildMap(
                new TeaPair("host", com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType)),
                new TeaPair("OSSAccessKeyId", authResponseBody.get("AccessKeyId")),
                new TeaPair("policy", authResponseBody.get("EncodedPolicy")),
                new TeaPair("Signature", authResponseBody.get("Signature")),
                new TeaPair("key", authResponseBody.get("ObjectKey")),
                new TeaPair("file", fileObj),
                new TeaPair("success_action_status", "201")
            );
            this._postOSSObject(authResponseBody.get("Bucket"), ossHeader, runtime);
            credentialProductVerifyV2Req.imageFile = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        CredentialProductVerifyV2Response credentialProductVerifyV2Resp = this.credentialProductVerifyV2WithOptions(credentialProductVerifyV2Req, runtime);
        return credentialProductVerifyV2Resp;
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com (IPv4) or cloudauth-dualstack.aliyuncs.com (IPv6).</li>
     * <li>Request method: POST and GET.</li>
     * <li>Transfer protocol: HTTPS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Credential verification.</p>
     * 
     * @param tmpReq CredentialVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CredentialVerifyResponse
     */
    public CredentialVerifyResponse credentialVerifyWithOptions(CredentialVerifyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CredentialVerifyShrinkRequest request = new CredentialVerifyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.merchantDetail)) {
            request.merchantDetailShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.merchantDetail, "MerchantDetail", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certNum)) {
            query.put("CertNum", request.certNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credName)) {
            query.put("CredName", request.credName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credType)) {
            query.put("CredType", request.credType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifyNum)) {
            query.put("IdentifyNum", request.identifyNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isCheck)) {
            query.put("IsCheck", request.isCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isOCR)) {
            query.put("IsOCR", request.isOCR);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantDetailShrink)) {
            query.put("MerchantDetail", request.merchantDetailShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantId)) {
            query.put("MerchantId", request.merchantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            query.put("Prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptModel)) {
            query.put("PromptModel", request.promptModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageContext)) {
            body.put("ImageContext", request.imageContext);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CredentialVerify"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CredentialVerifyResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com (IPv4) or cloudauth-dualstack.aliyuncs.com (IPv6).</li>
     * <li>Request method: POST and GET.</li>
     * <li>Transfer protocol: HTTPS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Credential verification.</p>
     * 
     * @param request CredentialVerifyRequest
     * @return CredentialVerifyResponse
     */
    public CredentialVerifyResponse credentialVerify(CredentialVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.credentialVerifyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Submits a credential image to perform image tampering and forgery detection and image semantic understanding. Returns risk detection results.</p>
     * 
     * <b>summary</b> : 
     * <p>Credential verification.</p>
     * 
     * @param tmpReq CredentialVerifyV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return CredentialVerifyV2Response
     */
    public CredentialVerifyV2Response credentialVerifyV2WithOptions(CredentialVerifyV2Request tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CredentialVerifyV2ShrinkRequest request = new CredentialVerifyV2ShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.merchantDetail)) {
            request.merchantDetailShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.merchantDetail, "MerchantDetail", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certNum)) {
            query.put("CertNum", request.certNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credName)) {
            query.put("CredName", request.credName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credType)) {
            query.put("CredType", request.credType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifyNum)) {
            query.put("IdentifyNum", request.identifyNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isCheck)) {
            query.put("IsCheck", request.isCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isOcr)) {
            query.put("IsOcr", request.isOcr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantDetailShrink)) {
            query.put("MerchantDetail", request.merchantDetailShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantId)) {
            query.put("MerchantId", request.merchantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            query.put("Prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promptModel)) {
            query.put("PromptModel", request.promptModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageContext)) {
            body.put("ImageContext", request.imageContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageFile)) {
            body.put("ImageFile", request.imageFile);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CredentialVerifyV2"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CredentialVerifyV2Response());
    }

    /**
     * <b>description</b> :
     * <p>Submits a credential image to perform image tampering and forgery detection and image semantic understanding. Returns risk detection results.</p>
     * 
     * <b>summary</b> : 
     * <p>Credential verification.</p>
     * 
     * @param request CredentialVerifyV2Request
     * @return CredentialVerifyV2Response
     */
    public CredentialVerifyV2Response credentialVerifyV2(CredentialVerifyV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.credentialVerifyV2WithOptions(request, runtime);
    }

    public CredentialVerifyV2Response credentialVerifyV2Advance(CredentialVerifyV2AdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        com.aliyun.credentials.models.CredentialModel credentialModel = null;
        if (com.aliyun.teautil.Common.isUnset(_credential)) {
            throw new TeaException(TeaConverter.buildMap(
                new TeaPair("code", "InvalidCredentials"),
                new TeaPair("message", "Please set up the credentials correctly. If you are setting them through environment variables, please ensure that ALIBABA_CLOUD_ACCESS_KEY_ID and ALIBABA_CLOUD_ACCESS_KEY_SECRET are set correctly. See https://help.aliyun.com/zh/sdk/developer-reference/configure-the-alibaba-cloud-accesskey-environment-variable-on-linux-macos-and-windows-systems for more details.")
            ));
        }

        credentialModel = _credential.getCredential();
        String accessKeyId = credentialModel.accessKeyId;
        String accessKeySecret = credentialModel.accessKeySecret;
        String securityToken = credentialModel.securityToken;
        String credentialType = credentialModel.type;
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.teaopenapi.Client authClient = new com.aliyun.teaopenapi.Client(authConfig);
        java.util.Map<String, String> authRequest = TeaConverter.buildMap(
            new TeaPair("Product", "Cloudauth"),
            new TeaPair("RegionId", _regionId)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest authReq = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(authRequest))
        ));
        com.aliyun.teaopenapi.models.Params authParams = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeFileUpload"),
            new TeaPair("version", "2019-12-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        java.util.Map<String, Object> authResponse = new java.util.HashMap<>();
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        java.util.Map<String, Object> ossHeader = new java.util.HashMap<>();
        java.util.Map<String, Object> tmpBody = new java.util.HashMap<>();
        Boolean useAccelerate = false;
        java.util.Map<String, String> authResponseBody = new java.util.HashMap<>();
        CredentialVerifyV2Request credentialVerifyV2Req = new CredentialVerifyV2Request();
        com.aliyun.openapiutil.Client.convert(request, credentialVerifyV2Req);
        if (!com.aliyun.teautil.Common.isUnset(request.imageFileObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.imageFileObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = TeaConverter.buildMap(
                new TeaPair("host", com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType)),
                new TeaPair("OSSAccessKeyId", authResponseBody.get("AccessKeyId")),
                new TeaPair("policy", authResponseBody.get("EncodedPolicy")),
                new TeaPair("Signature", authResponseBody.get("Signature")),
                new TeaPair("key", authResponseBody.get("ObjectKey")),
                new TeaPair("file", fileObj),
                new TeaPair("success_action_status", "201")
            );
            this._postOSSObject(authResponseBody.get("Bucket"), ossHeader, runtime);
            credentialVerifyV2Req.imageFile = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        CredentialVerifyV2Response credentialVerifyV2Resp = this.credentialVerifyV2WithOptions(credentialVerifyV2Req, runtime);
        return credentialVerifyV2Resp;
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The face deepfake detection operation is currently in free public preview. The free public preview ends at 23:59:59 on August 30, 2024. During the public preview, the QPS cannot exceed 3 queries per second.</p>
     * </blockquote>
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com (IPv4) or cloudauth-dualstack.aliyuncs.com (IPv6).</li>
     * <li>Request method: POST and GET.</li>
     * <li>Transfer protocol: HTTPS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Accepts a face image and uses algorithms to detect deepfake risks. Covers risk scenarios such as AIGC-generated faces, deepfake face swaps, template faces, and recaptured faces. Returns risk labels and confidence levels.</p>
     * 
     * @param request DeepfakeDetectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeepfakeDetectResponse
     */
    public DeepfakeDetectResponse deepfakeDetectWithOptions(DeepfakeDetectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.faceInputType)) {
            query.put("FaceInputType", request.faceInputType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceUrl)) {
            query.put("FaceUrl", request.faceUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerOrderNo)) {
            query.put("OuterOrderNo", request.outerOrderNo);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.faceBase64)) {
            body.put("FaceBase64", request.faceBase64);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeepfakeDetect"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeepfakeDetectResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The face deepfake detection operation is currently in free public preview. The free public preview ends at 23:59:59 on August 30, 2024. During the public preview, the QPS cannot exceed 3 queries per second.</p>
     * </blockquote>
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com (IPv4) or cloudauth-dualstack.aliyuncs.com (IPv6).</li>
     * <li>Request method: POST and GET.</li>
     * <li>Transfer protocol: HTTPS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Accepts a face image and uses algorithms to detect deepfake risks. Covers risk scenarios such as AIGC-generated faces, deepfake face swaps, template faces, and recaptured faces. Returns risk labels and confidence levels.</p>
     * 
     * @param request DeepfakeDetectRequest
     * @return DeepfakeDetectResponse
     */
    public DeepfakeDetectResponse deepfakeDetect(DeepfakeDetectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deepfakeDetectWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests by using the HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. Obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes all custom rate limiting policies.</p>
     * 
     * @param request DeleteAllCustomizeFlowStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAllCustomizeFlowStrategyResponse
     */
    public DeleteAllCustomizeFlowStrategyResponse deleteAllCustomizeFlowStrategyWithOptions(DeleteAllCustomizeFlowStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAllCustomizeFlowStrategy"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAllCustomizeFlowStrategyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests by using the HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. Obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes all custom rate limiting policies.</p>
     * 
     * @param request DeleteAllCustomizeFlowStrategyRequest
     * @return DeleteAllCustomizeFlowStrategyResponse
     */
    public DeleteAllCustomizeFlowStrategyResponse deleteAllCustomizeFlowStrategy(DeleteAllCustomizeFlowStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAllCustomizeFlowStrategyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a China Finance Verification scene.</p>
     * 
     * @param request DeleteAntCloudAuthSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAntCloudAuthSceneResponse
     */
    public DeleteAntCloudAuthSceneResponse deleteAntCloudAuthSceneWithOptions(DeleteAntCloudAuthSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAntCloudAuthScene"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAntCloudAuthSceneResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a China Finance Verification scene.</p>
     * 
     * @param request DeleteAntCloudAuthSceneRequest
     * @return DeleteAntCloudAuthSceneResponse
     */
    public DeleteAntCloudAuthSceneResponse deleteAntCloudAuthScene(DeleteAntCloudAuthSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAntCloudAuthSceneWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Request method: Only HTTPS POST requests are supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a blacklist rule.</p>
     * 
     * @param request DeleteBlackListStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBlackListStrategyResponse
     */
    public DeleteBlackListStrategyResponse deleteBlackListStrategyWithOptions(DeleteBlackListStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            query.put("ProductName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBlackListStrategy"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBlackListStrategyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Request method: Only HTTPS POST requests are supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a blacklist rule.</p>
     * 
     * @param request DeleteBlackListStrategyRequest
     * @return DeleteBlackListStrategyResponse
     */
    public DeleteBlackListStrategyResponse deleteBlackListStrategy(DeleteBlackListStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBlackListStrategyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests using HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. We recommend that you obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Delete a specified authentication scene for Enhanced Real-person Identity Verification</p>
     * 
     * @param request DeleteCloudauthstSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCloudauthstSceneResponse
     */
    public DeleteCloudauthstSceneResponse deleteCloudauthstSceneWithOptions(DeleteCloudauthstSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCloudauthstScene"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCloudauthstSceneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests using HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. We recommend that you obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Delete a specified authentication scene for Enhanced Real-person Identity Verification</p>
     * 
     * @param request DeleteCloudauthstSceneRequest
     * @return DeleteCloudauthstSceneResponse
     */
    public DeleteCloudauthstSceneResponse deleteCloudauthstScene(DeleteCloudauthstSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCloudauthstSceneWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests using the HTTPS POST method.
     * Request URL: cloudauth.aliyuncs.com.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete a stability alert rule.</p>
     * 
     * @param request DeleteControlStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteControlStrategyResponse
     */
    public DeleteControlStrategyResponse deleteControlStrategyWithOptions(DeleteControlStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiName)) {
            query.put("ApiName", request.apiName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteControlStrategy"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteControlStrategyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests using the HTTPS POST method.
     * Request URL: cloudauth.aliyuncs.com.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete a stability alert rule.</p>
     * 
     * @param request DeleteControlStrategyRequest
     * @return DeleteControlStrategyResponse
     */
    public DeleteControlStrategyResponse deleteControlStrategy(DeleteControlStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteControlStrategyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests by using HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. Obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom rate limiting policy.</p>
     * 
     * @param request DeleteCustomizeFlowStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomizeFlowStrategyResponse
     */
    public DeleteCustomizeFlowStrategyResponse deleteCustomizeFlowStrategyWithOptions(DeleteCustomizeFlowStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiName)) {
            query.put("ApiName", request.apiName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomizeFlowStrategy"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomizeFlowStrategyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests by using HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. Obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom rate limiting policy.</p>
     * 
     * @param request DeleteCustomizeFlowStrategyRequest
     * @return DeleteCustomizeFlowStrategyResponse
     */
    public DeleteCustomizeFlowStrategyResponse deleteCustomizeFlowStrategy(DeleteCustomizeFlowStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomizeFlowStrategyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes all personal information fields from the request, including name, ID card number, phone number, IP address, images, videos, device information, etc.</p>
     * 
     * <b>summary</b> : 
     * <p>API for deleting sensitive data in financial-grade services.</p>
     * 
     * @param request DeleteFaceVerifyResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFaceVerifyResultResponse
     */
    public DeleteFaceVerifyResultResponse deleteFaceVerifyResultWithOptions(DeleteFaceVerifyResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certifyId)) {
            query.put("CertifyId", request.certifyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteAfterQuery)) {
            query.put("DeleteAfterQuery", request.deleteAfterQuery);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFaceVerifyResult"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFaceVerifyResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes all personal information fields from the request, including name, ID card number, phone number, IP address, images, videos, device information, etc.</p>
     * 
     * <b>summary</b> : 
     * <p>API for deleting sensitive data in financial-grade services.</p>
     * 
     * @param request DeleteFaceVerifyResultRequest
     * @return DeleteFaceVerifyResultResponse
     */
    public DeleteFaceVerifyResultResponse deleteFaceVerifyResult(DeleteFaceVerifyResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFaceVerifyResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: HTTPS POST and GET methods are supported.</li>
     * <li>Request URL: cloudauth.aliyuncs.com.<blockquote>
     * <p>The authorization code is valid for 30 minutes and cannot be reused. Obtain a new authorization code before each activation.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a scenario configuration.</p>
     * 
     * @param request DeleteSceneConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSceneConfigResponse
     */
    public DeleteSceneConfigResponse deleteSceneConfigWithOptions(DeleteSceneConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneConfigId)) {
            body.put("sceneConfigId", request.sceneConfigId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSceneConfig"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSceneConfigResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: HTTPS POST and GET methods are supported.</li>
     * <li>Request URL: cloudauth.aliyuncs.com.<blockquote>
     * <p>The authorization code is valid for 30 minutes and cannot be reused. Obtain a new authorization code before each activation.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a scenario configuration.</p>
     * 
     * @param request DeleteSceneConfigRequest
     * @return DeleteSceneConfigResponse
     */
    public DeleteSceneConfigResponse deleteSceneConfig(DeleteSceneConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSceneConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Request method: Only HTTPS POST requests are supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the version of a specified cluster.</p>
     * 
     * @param request DeleteWhitelistSettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWhitelistSettingResponse
     */
    public DeleteWhitelistSettingResponse deleteWhitelistSettingWithOptions(DeleteWhitelistSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            query.put("Ids", request.ids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWhitelistSetting"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWhitelistSettingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Request method: Only HTTPS POST requests are supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the version of a specified cluster.</p>
     * 
     * @param request DeleteWhitelistSettingRequest
     * @return DeleteWhitelistSettingResponse
     */
    public DeleteWhitelistSettingResponse deleteWhitelistSetting(DeleteWhitelistSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWhitelistSettingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests by using HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. Obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the activation status of different ID Verification product plans.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntAndCloudAuthUserStatusResponse
     */
    public DescribeAntAndCloudAuthUserStatusResponse describeAntAndCloudAuthUserStatusWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntAndCloudAuthUserStatus"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntAndCloudAuthUserStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests by using HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. Obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the activation status of different ID Verification product plans.</p>
     * @return DescribeAntAndCloudAuthUserStatusResponse
     */
    public DescribeAntAndCloudAuthUserStatusResponse describeAntAndCloudAuthUserStatus() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntAndCloudAuthUserStatusWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves OCR results.</p>
     * 
     * @param request DescribeAuthVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAuthVerifyResponse
     */
    public DescribeAuthVerifyResponse describeAuthVerifyWithOptions(DescribeAuthVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certifyId)) {
            body.put("CertifyId", request.certifyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAuthVerify"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAuthVerifyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves OCR results.</p>
     * 
     * @param request DescribeAuthVerifyRequest
     * @return DescribeAuthVerifyResponse
     */
    public DescribeAuthVerifyResponse describeAuthVerify(DescribeAuthVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAuthVerifyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you receive a callback notification, you can call this operation on the server side to obtain the corresponding verification status and verification materials.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the verification result for image element verification.</p>
     * 
     * @param request DescribeCardVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCardVerifyResponse
     */
    public DescribeCardVerifyResponse describeCardVerifyWithOptions(DescribeCardVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certifyId)) {
            query.put("CertifyId", request.certifyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCardVerify"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCardVerifyResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you receive a callback notification, you can call this operation on the server side to obtain the corresponding verification status and verification materials.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the verification result for image element verification.</p>
     * 
     * @param request DescribeCardVerifyRequest
     * @return DescribeCardVerifyResponse
     */
    public DescribeCardVerifyResponse describeCardVerify(DescribeCardVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCardVerifyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests by using HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. Obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the authentication scenarios for enhanced ID Verification.</p>
     * 
     * @param request DescribeCloudauthstSceneListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudauthstSceneListResponse
     */
    public DescribeCloudauthstSceneListResponse describeCloudauthstSceneListWithOptions(DescribeCloudauthstSceneListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudauthstSceneList"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudauthstSceneListResponse());
    }

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests by using HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. Obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the authentication scenarios for enhanced ID Verification.</p>
     * 
     * @param request DescribeCloudauthstSceneListRequest
     * @return DescribeCloudauthstSceneListResponse
     */
    public DescribeCloudauthstSceneListResponse describeCloudauthstSceneList(DescribeCloudauthstSceneListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudauthstSceneListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Request method: supports sending requests using HTTPS POST and GET methods.</p>
     * 
     * <b>summary</b> : 
     * <p>Such as authorization validity period, custom business identifiers defined by the integrating party, and device IDs.</p>
     * 
     * @param request DescribeDeviceInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDeviceInfoResponse
     */
    public DescribeDeviceInfoResponse describeDeviceInfoWithOptions(DescribeDeviceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiredEndDay)) {
            query.put("ExpiredEndDay", request.expiredEndDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiredStartDay)) {
            query.put("ExpiredStartDay", request.expiredStartDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDeviceId)) {
            query.put("UserDeviceId", request.userDeviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDeviceInfo"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDeviceInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Request method: supports sending requests using HTTPS POST and GET methods.</p>
     * 
     * <b>summary</b> : 
     * <p>Such as authorization validity period, custom business identifiers defined by the integrating party, and device IDs.</p>
     * 
     * @param request DescribeDeviceInfoRequest
     * @return DescribeDeviceInfoResponse
     */
    public DescribeDeviceInfoResponse describeDeviceInfo(DescribeDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeviceInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Financial-grade Face Guard service.</p>
     * 
     * @param request DescribeFaceGuardRiskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFaceGuardRiskResponse
     */
    public DescribeFaceGuardRiskResponse describeFaceGuardRiskWithOptions(DescribeFaceGuardRiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceToken)) {
            query.put("DeviceToken", request.deviceToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerOrderNo)) {
            query.put("OuterOrderNo", request.outerOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFaceGuardRisk"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFaceGuardRiskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Financial-grade Face Guard service.</p>
     * 
     * @param request DescribeFaceGuardRiskRequest
     * @return DescribeFaceGuardRiskResponse
     */
    public DescribeFaceGuardRiskResponse describeFaceGuardRisk(DescribeFaceGuardRiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFaceGuardRiskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>After the China site (Chinese mainland) mobile client receives a callback, the China site (Chinese mainland) server can call this operation to obtain the corresponding verification status and verification materials.</p>
     * 
     * @param request DescribeFaceVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFaceVerifyResponse
     */
    public DescribeFaceVerifyResponse describeFaceVerifyWithOptions(DescribeFaceVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certifyId)) {
            query.put("CertifyId", request.certifyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pictureReturnType)) {
            query.put("PictureReturnType", request.pictureReturnType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFaceVerify"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFaceVerifyResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>After the China site (Chinese mainland) mobile client receives a callback, the China site (Chinese mainland) server can call this operation to obtain the corresponding verification status and verification materials.</p>
     * 
     * @param request DescribeFaceVerifyRequest
     * @return DescribeFaceVerifyResponse
     */
    public DescribeFaceVerifyResponse describeFaceVerify(DescribeFaceVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFaceVerifyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests by using the HTTPS POST and GET methods.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information verification export tasks by page.</p>
     * 
     * @param request DescribeInfoCheckExportRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInfoCheckExportRecordResponse
     */
    public DescribeInfoCheckExportRecordResponse describeInfoCheckExportRecordWithOptions(DescribeInfoCheckExportRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInfoCheckExportRecord"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInfoCheckExportRecordResponse());
    }

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests by using the HTTPS POST and GET methods.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information verification export tasks by page.</p>
     * 
     * @param request DescribeInfoCheckExportRecordRequest
     * @return DescribeInfoCheckExportRecordResponse
     */
    public DescribeInfoCheckExportRecordResponse describeInfoCheckExportRecord(DescribeInfoCheckExportRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInfoCheckExportRecordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Request method: Supports HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. Obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries a specified.</p>
     * 
     * @param request DescribeListAntCloudAuthScenesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeListAntCloudAuthScenesResponse
     */
    public DescribeListAntCloudAuthScenesResponse describeListAntCloudAuthScenesWithOptions(DescribeListAntCloudAuthScenesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeListAntCloudAuthScenes"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeListAntCloudAuthScenesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Request method: Supports HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. Obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries a specified.</p>
     * 
     * @param request DescribeListAntCloudAuthScenesRequest
     * @return DescribeListAntCloudAuthScenesResponse
     */
    public DescribeListAntCloudAuthScenesResponse describeListAntCloudAuthScenes(DescribeListAntCloudAuthScenesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeListAntCloudAuthScenesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of facial recognition data.</p>
     * 
     * @param request DescribeListFaceVerifyDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeListFaceVerifyDataResponse
     */
    public DescribeListFaceVerifyDataResponse describeListFaceVerifyDataWithOptions(DescribeListFaceVerifyDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gmtEnd)) {
            query.put("GmtEnd", request.gmtEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtStart)) {
            query.put("GmtStart", request.gmtStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeListFaceVerifyData"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeListFaceVerifyDataResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of facial recognition data.</p>
     * 
     * @param request DescribeListFaceVerifyDataRequest
     * @return DescribeListFaceVerifyDataResponse
     */
    public DescribeListFaceVerifyDataResponse describeListFaceVerifyData(DescribeListFaceVerifyDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeListFaceVerifyDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves facial recognition authentication records (legacy).</p>
     * 
     * @param request DescribeListFaceVerifyInfosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeListFaceVerifyInfosResponse
     */
    public DescribeListFaceVerifyInfosResponse describeListFaceVerifyInfosWithOptions(DescribeListFaceVerifyInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certifyId)) {
            query.put("CertifyId", request.certifyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtEnd)) {
            query.put("GmtEnd", request.gmtEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtStart)) {
            query.put("GmtStart", request.gmtStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeListFaceVerifyInfos"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeListFaceVerifyInfosResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves facial recognition authentication records (legacy).</p>
     * 
     * @param request DescribeListFaceVerifyInfosRequest
     * @return DescribeListFaceVerifyInfosResponse
     */
    public DescribeListFaceVerifyInfosResponse describeListFaceVerifyInfos(DescribeListFaceVerifyInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeListFaceVerifyInfosWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information verification details by paging.</p>
     * 
     * @param request DescribeMetaSearchPageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMetaSearchPageListResponse
     */
    public DescribeMetaSearchPageListResponse describeMetaSearchPageListWithOptions(DescribeMetaSearchPageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.api)) {
            query.put("Api", request.api);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bankCard)) {
            query.put("BankCard", request.bankCard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizCode)) {
            query.put("BizCode", request.bizCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifyNum)) {
            query.put("IdentifyNum", request.identifyNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispName)) {
            query.put("IspName", request.ispName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqId)) {
            query.put("ReqId", request.reqId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subCode)) {
            query.put("SubCode", request.subCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vehicleNum)) {
            query.put("VehicleNum", request.vehicleNum);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMetaSearchPageList"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMetaSearchPageListResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information verification details by paging.</p>
     * 
     * @param request DescribeMetaSearchPageListRequest
     * @return DescribeMetaSearchPageListResponse
     */
    public DescribeMetaSearchPageListResponse describeMetaSearchPageList(DescribeMetaSearchPageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetaSearchPageListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: HTTPS POST and GET methods are supported.</li>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries statistics information for information verification and authentication.</p>
     * 
     * @param request DescribeMetaStatisticsListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMetaStatisticsListResponse
     */
    public DescribeMetaStatisticsListResponse describeMetaStatisticsListWithOptions(DescribeMetaStatisticsListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.api)) {
            query.put("Api", request.api);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMetaStatisticsList"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMetaStatisticsListResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: HTTPS POST and GET methods are supported.</li>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries statistics information for information verification and authentication.</p>
     * 
     * @param request DescribeMetaStatisticsListRequest
     * @return DescribeMetaStatisticsListResponse
     */
    public DescribeMetaStatisticsListResponse describeMetaStatisticsList(DescribeMetaStatisticsListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetaStatisticsListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: Supports sending requests using HTTPS POST and GET methods.</li>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information verification and authentication data with pagination.</p>
     * 
     * @param request DescribeMetaStatisticsPageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMetaStatisticsPageListResponse
     */
    public DescribeMetaStatisticsPageListResponse describeMetaStatisticsPageListWithOptions(DescribeMetaStatisticsPageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.api)) {
            query.put("Api", request.api);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
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
            new TeaPair("action", "DescribeMetaStatisticsPageList"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMetaStatisticsPageListResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: Supports sending requests using HTTPS POST and GET methods.</li>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information verification and authentication data with pagination.</p>
     * 
     * @param request DescribeMetaStatisticsPageListRequest
     * @return DescribeMetaStatisticsPageListResponse
     */
    public DescribeMetaStatisticsPageListResponse describeMetaStatisticsPageList(DescribeMetaStatisticsPageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetaStatisticsPageListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: HTTPS POST and GET methods are supported.</li>
     * <li>Endpoint: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of OSS.</p>
     * 
     * @param request DescribeOssStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOssStatusResponse
     */
    public DescribeOssStatusResponse describeOssStatusWithOptions(DescribeOssStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("ServiceCode", request.serviceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOssStatus"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOssStatusResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: HTTPS POST and GET methods are supported.</li>
     * <li>Endpoint: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of OSS.</p>
     * 
     * @param request DescribeOssStatusRequest
     * @return DescribeOssStatusResponse
     */
    public DescribeOssStatusResponse describeOssStatus(DescribeOssStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOssStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: HTTPS POST and GET methods are supported.</li>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the OSS status of a user (V2).</p>
     * 
     * @param request DescribeOssStatusV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOssStatusV2Response
     */
    public DescribeOssStatusV2Response describeOssStatusV2WithOptions(DescribeOssStatusV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOssStatusV2"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOssStatusV2Response());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: HTTPS POST and GET methods are supported.</li>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the OSS status of a user (V2).</p>
     * 
     * @param request DescribeOssStatusV2Request
     * @return DescribeOssStatusV2Response
     */
    public DescribeOssStatusV2Response describeOssStatusV2(DescribeOssStatusV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOssStatusV2WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the token required for uploading photos to OSS.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOssUploadTokenResponse
     */
    public DescribeOssUploadTokenResponse describeOssUploadTokenWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOssUploadToken"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOssUploadTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the token required for uploading photos to OSS.</p>
     * @return DescribeOssUploadTokenResponse
     */
    public DescribeOssUploadTokenResponse describeOssUploadToken() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOssUploadTokenWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries financial-grade ID Verification call statistics by using a paging query operation.</p>
     * 
     * @param request DescribePageFaceVerifyDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePageFaceVerifyDataResponse
     */
    public DescribePageFaceVerifyDataResponse describePageFaceVerifyDataWithOptions(DescribePageFaceVerifyDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePageFaceVerifyData"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePageFaceVerifyDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries financial-grade ID Verification call statistics by using a paging query operation.</p>
     * 
     * @param request DescribePageFaceVerifyDataRequest
     * @return DescribePageFaceVerifyDataResponse
     */
    public DescribePageFaceVerifyDataResponse describePageFaceVerifyData(DescribePageFaceVerifyDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePageFaceVerifyDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Request method: Only HTTPS POST requests are supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries page settings and returns the reasons for authentication failure.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePageSettingResponse
     */
    public DescribePageSettingResponse describePageSettingWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePageSetting"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePageSettingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Request method: Only HTTPS POST requests are supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries page settings and returns the reasons for authentication failure.</p>
     * @return DescribePageSettingResponse
     */
    public DescribePageSettingResponse describePageSetting() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePageSettingWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>Request method: Send requests by using the HTTPS GET or POST method.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the product codes for financial-grade ID Verification.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProductCodeResponse
     */
    public DescribeProductCodeResponse describeProductCodeWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProductCode"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProductCodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Request method: Send requests by using the HTTPS GET or POST method.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the product codes for financial-grade ID Verification.</p>
     * @return DescribeProductCodeResponse
     */
    public DescribeProductCodeResponse describeProductCode() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProductCodeWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the invoke statistics of enhanced ID Verification by using a paged query.</p>
     * 
     * @param request DescribeSmartStatisticsPageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSmartStatisticsPageListResponse
     */
    public DescribeSmartStatisticsPageListResponse describeSmartStatisticsPageListWithOptions(DescribeSmartStatisticsPageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSmartStatisticsPageList"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSmartStatisticsPageListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the invoke statistics of enhanced ID Verification by using a paged query.</p>
     * 
     * @param request DescribeSmartStatisticsPageListRequest
     * @return DescribeSmartStatisticsPageListResponse
     */
    public DescribeSmartStatisticsPageListResponse describeSmartStatisticsPageList(DescribeSmartStatisticsPageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSmartStatisticsPageListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves statistics of verification devices.</p>
     * 
     * @param request DescribeVerifyDeviceRiskStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVerifyDeviceRiskStatisticsResponse
     */
    public DescribeVerifyDeviceRiskStatisticsResponse describeVerifyDeviceRiskStatisticsWithOptions(DescribeVerifyDeviceRiskStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVerifyDeviceRiskStatistics"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVerifyDeviceRiskStatisticsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves statistics of verification devices.</p>
     * 
     * @param request DescribeVerifyDeviceRiskStatisticsRequest
     * @return DescribeVerifyDeviceRiskStatisticsResponse
     */
    public DescribeVerifyDeviceRiskStatisticsResponse describeVerifyDeviceRiskStatistics(DescribeVerifyDeviceRiskStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVerifyDeviceRiskStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the total number of failed authentication requests.</p>
     * 
     * @param request DescribeVerifyFailStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVerifyFailStatisticsResponse
     */
    public DescribeVerifyFailStatisticsResponse describeVerifyFailStatisticsWithOptions(DescribeVerifyFailStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ageGt)) {
            query.put("AgeGt", request.ageGt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.api)) {
            query.put("Api", request.api);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            query.put("DeviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVerifyFailStatistics"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVerifyFailStatisticsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the total number of failed authentication requests.</p>
     * 
     * @param request DescribeVerifyFailStatisticsRequest
     * @return DescribeVerifyFailStatisticsResponse
     */
    public DescribeVerifyFailStatisticsResponse describeVerifyFailStatistics(DescribeVerifyFailStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVerifyFailStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the distribution data of phone models used by authenticated users.</p>
     * 
     * @param request DescribeVerifyPersonasDeviceModelStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVerifyPersonasDeviceModelStatisticsResponse
     */
    public DescribeVerifyPersonasDeviceModelStatisticsResponse describeVerifyPersonasDeviceModelStatisticsWithOptions(DescribeVerifyPersonasDeviceModelStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeRange)) {
            query.put("TimeRange", request.timeRange);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVerifyPersonasDeviceModelStatistics"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVerifyPersonasDeviceModelStatisticsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the distribution data of phone models used by authenticated users.</p>
     * 
     * @param request DescribeVerifyPersonasDeviceModelStatisticsRequest
     * @return DescribeVerifyPersonasDeviceModelStatisticsResponse
     */
    public DescribeVerifyPersonasDeviceModelStatisticsResponse describeVerifyPersonasDeviceModelStatistics(DescribeVerifyPersonasDeviceModelStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVerifyPersonasDeviceModelStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the distribution data of ID Verification devices.</p>
     * 
     * @param request DescribeVerifyPersonasOsStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVerifyPersonasOsStatisticsResponse
     */
    public DescribeVerifyPersonasOsStatisticsResponse describeVerifyPersonasOsStatisticsWithOptions(DescribeVerifyPersonasOsStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeRange)) {
            query.put("TimeRange", request.timeRange);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVerifyPersonasOsStatistics"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVerifyPersonasOsStatisticsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the distribution data of ID Verification devices.</p>
     * 
     * @param request DescribeVerifyPersonasOsStatisticsRequest
     * @return DescribeVerifyPersonasOsStatisticsResponse
     */
    public DescribeVerifyPersonasOsStatisticsResponse describeVerifyPersonasOsStatistics(DescribeVerifyPersonasOsStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVerifyPersonasOsStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries authentication statistics by province of the individual.</p>
     * 
     * @param request DescribeVerifyPersonasProvinceStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVerifyPersonasProvinceStatisticsResponse
     */
    public DescribeVerifyPersonasProvinceStatisticsResponse describeVerifyPersonasProvinceStatisticsWithOptions(DescribeVerifyPersonasProvinceStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeRange)) {
            query.put("TimeRange", request.timeRange);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVerifyPersonasProvinceStatistics"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVerifyPersonasProvinceStatisticsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries authentication statistics by province of the individual.</p>
     * 
     * @param request DescribeVerifyPersonasProvinceStatisticsRequest
     * @return DescribeVerifyPersonasProvinceStatisticsResponse
     */
    public DescribeVerifyPersonasProvinceStatisticsResponse describeVerifyPersonasProvinceStatistics(DescribeVerifyPersonasProvinceStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVerifyPersonasProvinceStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries ID Verification statistics by gender.</p>
     * 
     * @param request DescribeVerifyPersonasSexStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVerifyPersonasSexStatisticsResponse
     */
    public DescribeVerifyPersonasSexStatisticsResponse describeVerifyPersonasSexStatisticsWithOptions(DescribeVerifyPersonasSexStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeRange)) {
            query.put("TimeRange", request.timeRange);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVerifyPersonasSexStatistics"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVerifyPersonasSexStatisticsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries ID Verification statistics by gender.</p>
     * 
     * @param request DescribeVerifyPersonasSexStatisticsRequest
     * @return DescribeVerifyPersonasSexStatisticsResponse
     */
    public DescribeVerifyPersonasSexStatisticsResponse describeVerifyPersonasSexStatistics(DescribeVerifyPersonasSexStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVerifyPersonasSexStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you begin: Before calling this API, make sure that you have completed the required preparations. For more information, see <a href="https://help.aliyun.com/document_detail/127471.html">ID Verification server-side integration preparations</a> and <a href="https://help.aliyun.com/document_detail/127717.html">Face liveness verification server-side integration preparations</a>.</p>
     * <blockquote>
     * <p>Alibaba Cloud ID Verification retains verification data for only the last 180 days. To use verification data for subsequent business purposes, call this operation promptly to retrieve and store the data to avoid data loss.
     * Request method: HTTPS POST and GET.
     * Operation description: After the caller\&quot;s mobile client receives a callback, the server can call this operation to obtain the corresponding verification status and verification materials.
     * Applicable scope: This operation is applicable to the SDK + server-side integration verification solution.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the result of an ID Verification task.</p>
     * 
     * @param request DescribeVerifyResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVerifyResultResponse
     */
    public DescribeVerifyResultResponse describeVerifyResultWithOptions(DescribeVerifyResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVerifyResult"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVerifyResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you begin: Before calling this API, make sure that you have completed the required preparations. For more information, see <a href="https://help.aliyun.com/document_detail/127471.html">ID Verification server-side integration preparations</a> and <a href="https://help.aliyun.com/document_detail/127717.html">Face liveness verification server-side integration preparations</a>.</p>
     * <blockquote>
     * <p>Alibaba Cloud ID Verification retains verification data for only the last 180 days. To use verification data for subsequent business purposes, call this operation promptly to retrieve and store the data to avoid data loss.
     * Request method: HTTPS POST and GET.
     * Operation description: After the caller\&quot;s mobile client receives a callback, the server can call this operation to obtain the corresponding verification status and verification materials.
     * Applicable scope: This operation is applicable to the SDK + server-side integration verification solution.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the result of an ID Verification task.</p>
     * 
     * @param request DescribeVerifyResultRequest
     * @return DescribeVerifyResultResponse
     */
    public DescribeVerifyResultResponse describeVerifyResult(DescribeVerifyResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVerifyResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Request method: Supports HTTPS POST and GET methods.
     * Operation description: Retrieves the result of an offline facial recognition SDK generation task based on the task ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the download URL of an offline SDK.</p>
     * 
     * @param request DescribeVerifySDKRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVerifySDKResponse
     */
    public DescribeVerifySDKResponse describeVerifySDKWithOptions(DescribeVerifySDKRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVerifySDK"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVerifySDKResponse());
    }

    /**
     * <b>description</b> :
     * <p>Request method: Supports HTTPS POST and GET methods.
     * Operation description: Retrieves the result of an offline facial recognition SDK generation task based on the task ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the download URL of an offline SDK.</p>
     * 
     * @param request DescribeVerifySDKRequest
     * @return DescribeVerifySDKResponse
     */
    public DescribeVerifySDKResponse describeVerifySDK(DescribeVerifySDKRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVerifySDKWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request methods: HTTPS POST and GET.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query authentication details by page with conditions.</p>
     * 
     * @param request DescribeVerifySearchPageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVerifySearchPageListResponse
     */
    public DescribeVerifySearchPageListResponse describeVerifySearchPageListWithOptions(DescribeVerifySearchPageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certNo)) {
            query.put("CertNo", request.certNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certifyId)) {
            query.put("CertifyId", request.certifyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hasDeviceRisk)) {
            query.put("HasDeviceRisk", request.hasDeviceRisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            query.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerOrderNo)) {
            query.put("OuterOrderNo", request.outerOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passed)) {
            query.put("Passed", request.passed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskBizScenario)) {
            query.put("RiskBizScenario", request.riskBizScenario);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskDevice)) {
            query.put("RiskDevice", request.riskDevice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskDeviceToken)) {
            query.put("RiskDeviceToken", request.riskDeviceToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskGeneric)) {
            query.put("RiskGeneric", request.riskGeneric);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskModelMining)) {
            query.put("RiskModelMining", request.riskModelMining);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.root)) {
            query.put("Root", request.root);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.simulator)) {
            query.put("Simulator", request.simulator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subCode)) {
            query.put("SubCode", request.subCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subCodes)) {
            query.put("SubCodes", request.subCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualVideo)) {
            query.put("VirtualVideo", request.virtualVideo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVerifySearchPageList"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVerifySearchPageListResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request methods: HTTPS POST and GET.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query authentication details by page with conditions.</p>
     * 
     * @param request DescribeVerifySearchPageListRequest
     * @return DescribeVerifySearchPageListResponse
     */
    public DescribeVerifySearchPageListResponse describeVerifySearchPageList(DescribeVerifySearchPageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVerifySearchPageListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: HTTPS POST and GET methods are supported.</li>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics information of authentication requests.</p>
     * 
     * @param request DescribeVerifyStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVerifyStatisticsResponse
     */
    public DescribeVerifyStatisticsResponse describeVerifyStatisticsWithOptions(DescribeVerifyStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ageGt)) {
            query.put("AgeGt", request.ageGt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVerifyStatistics"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVerifyStatisticsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: HTTPS POST and GET methods are supported.</li>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics information of authentication requests.</p>
     * 
     * @param request DescribeVerifyStatisticsRequest
     * @return DescribeVerifyStatisticsResponse
     */
    public DescribeVerifyStatisticsResponse describeVerifyStatistics(DescribeVerifyStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVerifyStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Preparations: Before calling this operation, make sure that you have completed the required preparations. For more information, see <a href="https://help.aliyun.com/document_detail/127536.html">Overview of the ID Verification scheme integration process</a> and <a href="https://help.aliyun.com/document_detail/127687.html">Overview of the face liveness verification scheme (liveness detection scheme) integration process</a>.
     * Request method: HTTPS POST and GET.
     * Operation description: Before each authentication, call this operation to obtain an authentication token (VerifyToken), which is used to connect the various operations in the authentication request.
     * Scope of application: This operation is applicable to mobile SDK integration.
     * Image URL: Use a publicly accessible HTTP or HTTPS URL. Example: <code>http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg</code>.
     * Image limits:</p>
     * <ul>
     * <li>The relative path or absolute path of local images is not supported.</li>
     * <li>Keep the size of a single image within 2 MB to avoid algorithm fetch timeout.</li>
     * <li>The face area in the image must be at least 64 × 64 pixels (px).</li>
     * <li>The body of a single request has a size limit of 8 MB. Make sure that the total size of all images and other information in the request does not exceed this limit.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiates an authentication request and obtains an authentication token. This operation is applicable to authentication schemes that use SDK and server-side integration.</p>
     * 
     * @param request DescribeVerifyTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVerifyTokenResponse
     */
    public DescribeVerifyTokenResponse describeVerifyTokenWithOptions(DescribeVerifyTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackSeed)) {
            query.put("CallbackSeed", request.callbackSeed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackUrl)) {
            query.put("CallbackUrl", request.callbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceRetainedImageUrl)) {
            query.put("FaceRetainedImageUrl", request.faceRetainedImageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failedRedirectUrl)) {
            query.put("FailedRedirectUrl", request.failedRedirectUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idCardBackImageUrl)) {
            query.put("IdCardBackImageUrl", request.idCardBackImageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idCardFrontImageUrl)) {
            query.put("IdCardFrontImageUrl", request.idCardFrontImageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idCardNumber)) {
            query.put("IdCardNumber", request.idCardNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passedRedirectUrl)) {
            query.put("PassedRedirectUrl", request.passedRedirectUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIp)) {
            query.put("UserIp", request.userIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPhoneNumber)) {
            query.put("UserPhoneNumber", request.userPhoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userRegistTime)) {
            query.put("UserRegistTime", request.userRegistTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVerifyToken"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVerifyTokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>Preparations: Before calling this operation, make sure that you have completed the required preparations. For more information, see <a href="https://help.aliyun.com/document_detail/127536.html">Overview of the ID Verification scheme integration process</a> and <a href="https://help.aliyun.com/document_detail/127687.html">Overview of the face liveness verification scheme (liveness detection scheme) integration process</a>.
     * Request method: HTTPS POST and GET.
     * Operation description: Before each authentication, call this operation to obtain an authentication token (VerifyToken), which is used to connect the various operations in the authentication request.
     * Scope of application: This operation is applicable to mobile SDK integration.
     * Image URL: Use a publicly accessible HTTP or HTTPS URL. Example: <code>http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg</code>.
     * Image limits:</p>
     * <ul>
     * <li>The relative path or absolute path of local images is not supported.</li>
     * <li>Keep the size of a single image within 2 MB to avoid algorithm fetch timeout.</li>
     * <li>The face area in the image must be at least 64 × 64 pixels (px).</li>
     * <li>The body of a single request has a size limit of 8 MB. Make sure that the total size of all images and other information in the request does not exceed this limit.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiates an authentication request and obtains an authentication token. This operation is applicable to authentication schemes that use SDK and server-side integration.</p>
     * 
     * @param request DescribeVerifyTokenRequest
     * @return DescribeVerifyTokenResponse
     */
    public DescribeVerifyTokenResponse describeVerifyToken(DescribeVerifyTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVerifyTokenWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Request method: Only HTTPS POST requests are supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the whitelist of a scenario.</p>
     * 
     * @param request DescribeWhitelistSettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWhitelistSettingResponse
     */
    public DescribeWhitelistSettingResponse describeWhitelistSettingWithOptions(DescribeWhitelistSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certNo)) {
            query.put("CertNo", request.certNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certifyId)) {
            query.put("CertifyId", request.certifyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validEndDate)) {
            query.put("ValidEndDate", request.validEndDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validStartDate)) {
            query.put("ValidStartDate", request.validStartDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelistType)) {
            query.put("WhitelistType", request.whitelistType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWhitelistSetting"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWhitelistSettingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Request method: Only HTTPS POST requests are supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the whitelist of a scenario.</p>
     * 
     * @param request DescribeWhitelistSettingRequest
     * @return DescribeWhitelistSettingResponse
     */
    public DescribeWhitelistSettingResponse describeWhitelistSetting(DescribeWhitelistSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWhitelistSettingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Request method: Only HTTPS POST requests are supported.
     * Operation description: Detects validity-related attributes of faces in an input photo, helping you determine whether the photo meets your business requirements for retention or comparison. Currently supported face validity attributes include: whether a face is present, whether the face is blurry, whether glasses are worn, facial pose, and whether the face is smiling.
     * Notes on uploading image addresses: When submitting an image, provide its HTTP URL, OSS address, or Base64 encoding.</p>
     * <ul>
     * <li>HTTP address: A publicly accessible HTTP URL. For example, <code>http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg</code>.</li>
     * <li>Base64 encoding: A Base64-encoded image in the format <code>base64://&lt;Base64-encoded image string&gt;</code>.
     * Image limits:</li>
     * <li>Relative paths or absolute paths of local images are not supported.</li>
     * <li>Keep the size of a single image within 2 MB to avoid algorithm fetch timeouts.</li>
     * <li>The request body has a size limit of 8 MB. Make sure the total size of all images and other information in the request does not exceed this limit.</li>
     * <li>When using Base64 to transmit images, set the request method to POST. Remove the header description from the Base64 character string, such as <code>data:image/png,base64</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects validity attributes of faces in a photo.</p>
     * 
     * @param request DetectFaceAttributesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetectFaceAttributesResponse
     */
    public DetectFaceAttributesResponse detectFaceAttributesWithOptions(DetectFaceAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.materialValue)) {
            body.put("MaterialValue", request.materialValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectFaceAttributes"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectFaceAttributesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Request method: Only HTTPS POST requests are supported.
     * Operation description: Detects validity-related attributes of faces in an input photo, helping you determine whether the photo meets your business requirements for retention or comparison. Currently supported face validity attributes include: whether a face is present, whether the face is blurry, whether glasses are worn, facial pose, and whether the face is smiling.
     * Notes on uploading image addresses: When submitting an image, provide its HTTP URL, OSS address, or Base64 encoding.</p>
     * <ul>
     * <li>HTTP address: A publicly accessible HTTP URL. For example, <code>http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg</code>.</li>
     * <li>Base64 encoding: A Base64-encoded image in the format <code>base64://&lt;Base64-encoded image string&gt;</code>.
     * Image limits:</li>
     * <li>Relative paths or absolute paths of local images are not supported.</li>
     * <li>Keep the size of a single image within 2 MB to avoid algorithm fetch timeouts.</li>
     * <li>The request body has a size limit of 8 MB. Make sure the total size of all images and other information in the request does not exceed this limit.</li>
     * <li>When using Base64 to transmit images, set the request method to POST. Remove the header description from the Base64 character string, such as <code>data:image/png,base64</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detects validity attributes of faces in a photo.</p>
     * 
     * @param request DetectFaceAttributesRequest
     * @return DetectFaceAttributesResponse
     */
    public DetectFaceAttributesResponse detectFaceAttributes(DetectFaceAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectFaceAttributesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the download link for the statistical call data file under a product plan based on the specified query conditions.</p>
     * <ul>
     * <li>Method: HTTPS POST</li>
     * <li>Endpoint: cloudauth.aliyuncs.com<blockquote>
     * <p>ID Verification counts call volume by CertifyId. To facilitate reconciliation, retain the CertifyId field in your system.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves statistical call volume data.</p>
     * 
     * @param request DownloadVerifyRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadVerifyRecordsResponse
     */
    public DownloadVerifyRecordsResponse downloadVerifyRecordsWithOptions(DownloadVerifyRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizParam)) {
            query.put("BizParam", request.bizParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadVerifyRecords"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadVerifyRecordsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the download link for the statistical call data file under a product plan based on the specified query conditions.</p>
     * <ul>
     * <li>Method: HTTPS POST</li>
     * <li>Endpoint: cloudauth.aliyuncs.com<blockquote>
     * <p>ID Verification counts call volume by CertifyId. To facilitate reconciliation, retain the CertifyId field in your system.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves statistical call volume data.</p>
     * 
     * @param request DownloadVerifyRecordsRequest
     * @return DownloadVerifyRecordsResponse
     */
    public DownloadVerifyRecordsResponse downloadVerifyRecords(DownloadVerifyRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadVerifyRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Verifies the validity period of a two-factor identity document.</p>
     * 
     * @param request Id2MetaPeriodVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return Id2MetaPeriodVerifyResponse
     */
    public Id2MetaPeriodVerifyResponse id2MetaPeriodVerifyWithOptions(Id2MetaPeriodVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifyNum)) {
            body.put("IdentifyNum", request.identifyNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            body.put("ParamType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validityEndDate)) {
            body.put("ValidityEndDate", request.validityEndDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validityStartDate)) {
            body.put("ValidityStartDate", request.validityStartDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Id2MetaPeriodVerify"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Id2MetaPeriodVerifyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Verifies the validity period of a two-factor identity document.</p>
     * 
     * @param request Id2MetaPeriodVerifyRequest
     * @return Id2MetaPeriodVerifyResponse
     */
    public Id2MetaPeriodVerifyResponse id2MetaPeriodVerify(Id2MetaPeriodVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.id2MetaPeriodVerifyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Two-factor identity verification Standard Edition.</p>
     * 
     * @param request Id2MetaStandardVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return Id2MetaStandardVerifyResponse
     */
    public Id2MetaStandardVerifyResponse id2MetaStandardVerifyWithOptions(Id2MetaStandardVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifyNum)) {
            body.put("IdentifyNum", request.identifyNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            body.put("ParamType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Id2MetaStandardVerify"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Id2MetaStandardVerifyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Two-factor identity verification Standard Edition.</p>
     * 
     * @param request Id2MetaStandardVerifyRequest
     * @return Id2MetaStandardVerifyResponse
     */
    public Id2MetaStandardVerifyResponse id2MetaStandardVerify(Id2MetaStandardVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.id2MetaStandardVerifyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com (IPv4) or cloudauth-dualstack.aliyuncs.com (IPv6).</li>
     * <li>Request method: POST and GET.</li>
     * <li>Transfer protocol: HTTPS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Verifies the authenticity and consistency of a name and ID card number against an authoritative data source.</p>
     * 
     * @param request Id2MetaVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return Id2MetaVerifyResponse
     */
    public Id2MetaVerifyResponse id2MetaVerifyWithOptions(Id2MetaVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifyNum)) {
            body.put("IdentifyNum", request.identifyNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            body.put("ParamType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Id2MetaVerify"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Id2MetaVerifyResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com (IPv4) or cloudauth-dualstack.aliyuncs.com (IPv6).</li>
     * <li>Request method: POST and GET.</li>
     * <li>Transfer protocol: HTTPS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Verifies the authenticity and consistency of a name and ID card number against an authoritative data source.</p>
     * 
     * @param request Id2MetaVerifyRequest
     * @return Id2MetaVerifyResponse
     */
    public Id2MetaVerifyResponse id2MetaVerify(Id2MetaVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.id2MetaVerifyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Takes images of both sides of an ID card and returns the verification result of the two factors from an authoritative data source.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies the authenticity and consistency of an identity by taking images of both sides of an ID card, extracting the name and ID number via OCR, and checking them against an authoritative source.</p>
     * 
     * @param request Id2MetaVerifyWithOCRRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return Id2MetaVerifyWithOCRResponse
     */
    public Id2MetaVerifyWithOCRResponse id2MetaVerifyWithOCRWithOptions(Id2MetaVerifyWithOCRRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certFile)) {
            body.put("CertFile", request.certFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certNationalFile)) {
            body.put("CertNationalFile", request.certNationalFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certNationalUrl)) {
            body.put("CertNationalUrl", request.certNationalUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certUrl)) {
            body.put("CertUrl", request.certUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Id2MetaVerifyWithOCR"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Id2MetaVerifyWithOCRResponse());
    }

    /**
     * <b>description</b> :
     * <p>Takes images of both sides of an ID card and returns the verification result of the two factors from an authoritative data source.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies the authenticity and consistency of an identity by taking images of both sides of an ID card, extracting the name and ID number via OCR, and checking them against an authoritative source.</p>
     * 
     * @param request Id2MetaVerifyWithOCRRequest
     * @return Id2MetaVerifyWithOCRResponse
     */
    public Id2MetaVerifyWithOCRResponse id2MetaVerifyWithOCR(Id2MetaVerifyWithOCRRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.id2MetaVerifyWithOCRWithOptions(request, runtime);
    }

    public Id2MetaVerifyWithOCRResponse id2MetaVerifyWithOCRAdvance(Id2MetaVerifyWithOCRAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        com.aliyun.credentials.models.CredentialModel credentialModel = null;
        if (com.aliyun.teautil.Common.isUnset(_credential)) {
            throw new TeaException(TeaConverter.buildMap(
                new TeaPair("code", "InvalidCredentials"),
                new TeaPair("message", "Please set up the credentials correctly. If you are setting them through environment variables, please ensure that ALIBABA_CLOUD_ACCESS_KEY_ID and ALIBABA_CLOUD_ACCESS_KEY_SECRET are set correctly. See https://help.aliyun.com/zh/sdk/developer-reference/configure-the-alibaba-cloud-accesskey-environment-variable-on-linux-macos-and-windows-systems for more details.")
            ));
        }

        credentialModel = _credential.getCredential();
        String accessKeyId = credentialModel.accessKeyId;
        String accessKeySecret = credentialModel.accessKeySecret;
        String securityToken = credentialModel.securityToken;
        String credentialType = credentialModel.type;
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.teaopenapi.Client authClient = new com.aliyun.teaopenapi.Client(authConfig);
        java.util.Map<String, String> authRequest = TeaConverter.buildMap(
            new TeaPair("Product", "Cloudauth"),
            new TeaPair("RegionId", _regionId)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest authReq = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(authRequest))
        ));
        com.aliyun.teaopenapi.models.Params authParams = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeFileUpload"),
            new TeaPair("version", "2019-12-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        java.util.Map<String, Object> authResponse = new java.util.HashMap<>();
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        java.util.Map<String, Object> ossHeader = new java.util.HashMap<>();
        java.util.Map<String, Object> tmpBody = new java.util.HashMap<>();
        Boolean useAccelerate = false;
        java.util.Map<String, String> authResponseBody = new java.util.HashMap<>();
        Id2MetaVerifyWithOCRRequest id2MetaVerifyWithOCRReq = new Id2MetaVerifyWithOCRRequest();
        com.aliyun.openapiutil.Client.convert(request, id2MetaVerifyWithOCRReq);
        if (!com.aliyun.teautil.Common.isUnset(request.certFileObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.certFileObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = TeaConverter.buildMap(
                new TeaPair("host", com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType)),
                new TeaPair("OSSAccessKeyId", authResponseBody.get("AccessKeyId")),
                new TeaPair("policy", authResponseBody.get("EncodedPolicy")),
                new TeaPair("Signature", authResponseBody.get("Signature")),
                new TeaPair("key", authResponseBody.get("ObjectKey")),
                new TeaPair("file", fileObj),
                new TeaPair("success_action_status", "201")
            );
            this._postOSSObject(authResponseBody.get("Bucket"), ossHeader, runtime);
            id2MetaVerifyWithOCRReq.certFile = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certNationalFileObject)) {
            Object tmpResp1 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp1);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.certNationalFileObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = TeaConverter.buildMap(
                new TeaPair("host", com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType)),
                new TeaPair("OSSAccessKeyId", authResponseBody.get("AccessKeyId")),
                new TeaPair("policy", authResponseBody.get("EncodedPolicy")),
                new TeaPair("Signature", authResponseBody.get("Signature")),
                new TeaPair("key", authResponseBody.get("ObjectKey")),
                new TeaPair("file", fileObj),
                new TeaPair("success_action_status", "201")
            );
            this._postOSSObject(authResponseBody.get("Bucket"), ossHeader, runtime);
            id2MetaVerifyWithOCRReq.certNationalFile = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        Id2MetaVerifyWithOCRResponse id2MetaVerifyWithOCRResp = this.id2MetaVerifyWithOCRWithOptions(id2MetaVerifyWithOCRReq, runtime);
        return id2MetaVerifyWithOCRResp;
    }

    /**
     * <b>description</b> :
     * <p>Verifies the authenticity and consistency of a name, ID card number, and facial photo against an authoritative data source.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies the authenticity and consistency of a name, ID card number, and facial photo against an authoritative data source.</p>
     * 
     * @param request Id3MetaVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return Id3MetaVerifyResponse
     */
    public Id3MetaVerifyResponse id3MetaVerifyWithOptions(Id3MetaVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crop)) {
            body.put("Crop", request.crop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceFile)) {
            body.put("FaceFile", request.faceFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.facePicture)) {
            body.put("FacePicture", request.facePicture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceUrl)) {
            body.put("FaceUrl", request.faceUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifyNum)) {
            body.put("IdentifyNum", request.identifyNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            body.put("ParamType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Id3MetaVerify"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Id3MetaVerifyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Verifies the authenticity and consistency of a name, ID card number, and facial photo against an authoritative data source.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies the authenticity and consistency of a name, ID card number, and facial photo against an authoritative data source.</p>
     * 
     * @param request Id3MetaVerifyRequest
     * @return Id3MetaVerifyResponse
     */
    public Id3MetaVerifyResponse id3MetaVerify(Id3MetaVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.id3MetaVerifyWithOptions(request, runtime);
    }

    public Id3MetaVerifyResponse id3MetaVerifyAdvance(Id3MetaVerifyAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        com.aliyun.credentials.models.CredentialModel credentialModel = null;
        if (com.aliyun.teautil.Common.isUnset(_credential)) {
            throw new TeaException(TeaConverter.buildMap(
                new TeaPair("code", "InvalidCredentials"),
                new TeaPair("message", "Please set up the credentials correctly. If you are setting them through environment variables, please ensure that ALIBABA_CLOUD_ACCESS_KEY_ID and ALIBABA_CLOUD_ACCESS_KEY_SECRET are set correctly. See https://help.aliyun.com/zh/sdk/developer-reference/configure-the-alibaba-cloud-accesskey-environment-variable-on-linux-macos-and-windows-systems for more details.")
            ));
        }

        credentialModel = _credential.getCredential();
        String accessKeyId = credentialModel.accessKeyId;
        String accessKeySecret = credentialModel.accessKeySecret;
        String securityToken = credentialModel.securityToken;
        String credentialType = credentialModel.type;
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.teaopenapi.Client authClient = new com.aliyun.teaopenapi.Client(authConfig);
        java.util.Map<String, String> authRequest = TeaConverter.buildMap(
            new TeaPair("Product", "Cloudauth"),
            new TeaPair("RegionId", _regionId)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest authReq = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(authRequest))
        ));
        com.aliyun.teaopenapi.models.Params authParams = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeFileUpload"),
            new TeaPair("version", "2019-12-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        java.util.Map<String, Object> authResponse = new java.util.HashMap<>();
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        java.util.Map<String, Object> ossHeader = new java.util.HashMap<>();
        java.util.Map<String, Object> tmpBody = new java.util.HashMap<>();
        Boolean useAccelerate = false;
        java.util.Map<String, String> authResponseBody = new java.util.HashMap<>();
        Id3MetaVerifyRequest id3MetaVerifyReq = new Id3MetaVerifyRequest();
        com.aliyun.openapiutil.Client.convert(request, id3MetaVerifyReq);
        if (!com.aliyun.teautil.Common.isUnset(request.faceFileObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.faceFileObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = TeaConverter.buildMap(
                new TeaPair("host", com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType)),
                new TeaPair("OSSAccessKeyId", authResponseBody.get("AccessKeyId")),
                new TeaPair("policy", authResponseBody.get("EncodedPolicy")),
                new TeaPair("Signature", authResponseBody.get("Signature")),
                new TeaPair("key", authResponseBody.get("ObjectKey")),
                new TeaPair("file", fileObj),
                new TeaPair("success_action_status", "201")
            );
            this._postOSSObject(authResponseBody.get("Bucket"), ossHeader, runtime);
            id3MetaVerifyReq.faceFile = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        Id3MetaVerifyResponse id3MetaVerifyResp = this.id3MetaVerifyWithOptions(id3MetaVerifyReq, runtime);
        return id3MetaVerifyResp;
    }

    /**
     * <b>description</b> :
     * <p>Submits images of the front and back of an ID card and returns the verification result of the three facial elements from an authoritative data source.</p>
     * 
     * <b>summary</b> : 
     * <p>Accepts images of the front and back of an ID card, extracts the name, ID number, and facial photo by using OCR, and verifies the authenticity and consistency of the three facial elements against an authoritative source.</p>
     * 
     * @param request Id3MetaVerifyWithOCRRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return Id3MetaVerifyWithOCRResponse
     */
    public Id3MetaVerifyWithOCRResponse id3MetaVerifyWithOCRWithOptions(Id3MetaVerifyWithOCRRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certFile)) {
            body.put("CertFile", request.certFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certNationalFile)) {
            body.put("CertNationalFile", request.certNationalFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certNationalUrl)) {
            body.put("CertNationalUrl", request.certNationalUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certUrl)) {
            body.put("CertUrl", request.certUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Id3MetaVerifyWithOCR"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Id3MetaVerifyWithOCRResponse());
    }

    /**
     * <b>description</b> :
     * <p>Submits images of the front and back of an ID card and returns the verification result of the three facial elements from an authoritative data source.</p>
     * 
     * <b>summary</b> : 
     * <p>Accepts images of the front and back of an ID card, extracts the name, ID number, and facial photo by using OCR, and verifies the authenticity and consistency of the three facial elements against an authoritative source.</p>
     * 
     * @param request Id3MetaVerifyWithOCRRequest
     * @return Id3MetaVerifyWithOCRResponse
     */
    public Id3MetaVerifyWithOCRResponse id3MetaVerifyWithOCR(Id3MetaVerifyWithOCRRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.id3MetaVerifyWithOCRWithOptions(request, runtime);
    }

    public Id3MetaVerifyWithOCRResponse id3MetaVerifyWithOCRAdvance(Id3MetaVerifyWithOCRAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        com.aliyun.credentials.models.CredentialModel credentialModel = null;
        if (com.aliyun.teautil.Common.isUnset(_credential)) {
            throw new TeaException(TeaConverter.buildMap(
                new TeaPair("code", "InvalidCredentials"),
                new TeaPair("message", "Please set up the credentials correctly. If you are setting them through environment variables, please ensure that ALIBABA_CLOUD_ACCESS_KEY_ID and ALIBABA_CLOUD_ACCESS_KEY_SECRET are set correctly. See https://help.aliyun.com/zh/sdk/developer-reference/configure-the-alibaba-cloud-accesskey-environment-variable-on-linux-macos-and-windows-systems for more details.")
            ));
        }

        credentialModel = _credential.getCredential();
        String accessKeyId = credentialModel.accessKeyId;
        String accessKeySecret = credentialModel.accessKeySecret;
        String securityToken = credentialModel.securityToken;
        String credentialType = credentialModel.type;
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.teaopenapi.Client authClient = new com.aliyun.teaopenapi.Client(authConfig);
        java.util.Map<String, String> authRequest = TeaConverter.buildMap(
            new TeaPair("Product", "Cloudauth"),
            new TeaPair("RegionId", _regionId)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest authReq = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(authRequest))
        ));
        com.aliyun.teaopenapi.models.Params authParams = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeFileUpload"),
            new TeaPair("version", "2019-12-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        java.util.Map<String, Object> authResponse = new java.util.HashMap<>();
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        java.util.Map<String, Object> ossHeader = new java.util.HashMap<>();
        java.util.Map<String, Object> tmpBody = new java.util.HashMap<>();
        Boolean useAccelerate = false;
        java.util.Map<String, String> authResponseBody = new java.util.HashMap<>();
        Id3MetaVerifyWithOCRRequest id3MetaVerifyWithOCRReq = new Id3MetaVerifyWithOCRRequest();
        com.aliyun.openapiutil.Client.convert(request, id3MetaVerifyWithOCRReq);
        if (!com.aliyun.teautil.Common.isUnset(request.certFileObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.certFileObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = TeaConverter.buildMap(
                new TeaPair("host", com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType)),
                new TeaPair("OSSAccessKeyId", authResponseBody.get("AccessKeyId")),
                new TeaPair("policy", authResponseBody.get("EncodedPolicy")),
                new TeaPair("Signature", authResponseBody.get("Signature")),
                new TeaPair("key", authResponseBody.get("ObjectKey")),
                new TeaPair("file", fileObj),
                new TeaPair("success_action_status", "201")
            );
            this._postOSSObject(authResponseBody.get("Bucket"), ossHeader, runtime);
            id3MetaVerifyWithOCRReq.certFile = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certNationalFileObject)) {
            Object tmpResp1 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp1);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.certNationalFileObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = TeaConverter.buildMap(
                new TeaPair("host", com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType)),
                new TeaPair("OSSAccessKeyId", authResponseBody.get("AccessKeyId")),
                new TeaPair("policy", authResponseBody.get("EncodedPolicy")),
                new TeaPair("Signature", authResponseBody.get("Signature")),
                new TeaPair("key", authResponseBody.get("ObjectKey")),
                new TeaPair("file", fileObj),
                new TeaPair("success_action_status", "201")
            );
            this._postOSSObject(authResponseBody.get("Bucket"), ossHeader, runtime);
            id3MetaVerifyWithOCRReq.certNationalFile = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        Id3MetaVerifyWithOCRResponse id3MetaVerifyWithOCRResp = this.id3MetaVerifyWithOCRWithOptions(id3MetaVerifyWithOCRReq, runtime);
        return id3MetaVerifyWithOCRResp;
    }

    /**
     * <b>summary</b> : 
     * <p>Initiates an OCR request.</p>
     * 
     * @param request InitAuthVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitAuthVerifyResponse
     */
    public InitAuthVerifyResponse initAuthVerifyWithOptions(InitAuthVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callbackToken)) {
            body.put("CallbackToken", request.callbackToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackUrl)) {
            body.put("CallbackUrl", request.callbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardPageNumber)) {
            body.put("CardPageNumber", request.cardPageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardType)) {
            body.put("CardType", request.cardType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docScanMode)) {
            body.put("DocScanMode", request.docScanMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idSpoof)) {
            body.put("IdSpoof", request.idSpoof);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metaInfo)) {
            body.put("MetaInfo", request.metaInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerOrderNo)) {
            body.put("OuterOrderNo", request.outerOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitAuthVerify"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitAuthVerifyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Initiates an OCR request.</p>
     * 
     * @param request InitAuthVerifyRequest
     * @return InitAuthVerifyResponse
     */
    public InitAuthVerifyResponse initAuthVerify(InitAuthVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initAuthVerifyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a CertifyId before each authentication session. The CertifyId links all API operations within the authentication request.</p>
     * 
     * <b>summary</b> : 
     * <p>Initiates an image verification authentication request.</p>
     * 
     * @param request InitCardVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitCardVerifyResponse
     */
    public InitCardVerifyResponse initCardVerifyWithOptions(InitCardVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callbackToken)) {
            query.put("CallbackToken", request.callbackToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackUrl)) {
            query.put("CallbackUrl", request.callbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardPageNumber)) {
            query.put("CardPageNumber", request.cardPageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardType)) {
            query.put("CardType", request.cardType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.docScanMode)) {
            query.put("DocScanMode", request.docScanMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantBizId)) {
            query.put("MerchantBizId", request.merchantBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metaInfo)) {
            query.put("MetaInfo", request.metaInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            query.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pictureSave)) {
            query.put("PictureSave", request.pictureSave);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyMeta)) {
            query.put("VerifyMeta", request.verifyMeta);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitCardVerify"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitCardVerifyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a CertifyId before each authentication session. The CertifyId links all API operations within the authentication request.</p>
     * 
     * <b>summary</b> : 
     * <p>Initiates an image verification authentication request.</p>
     * 
     * @param request InitCardVerifyRequest
     * @return InitCardVerifyResponse
     */
    public InitCardVerifyResponse initCardVerify(InitCardVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initCardVerifyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * <li>This operation uses different parameters for different product plans. For more information, refer to the <a href="https://www.alibabacloud.com/help/en/id-verification/financial-grade-id-verification/product-overview/introduction/">official documentation</a>.</li>
     * </ul>
     * <h4>Image format requirements</h4>
     * <p>When performing ID Verification, submit images that meet all of the following conditions:</p>
     * <ul>
     * <li>A recent photo with a complete, clear, and unobstructed face, a natural expression, and the subject facing the camera directly.</li>
     * <li>A clear photo with normal exposure. The face must not be too dark, too bright, or have glare, and the angle must not deviate significantly.</li>
     * <li>Resolution must not exceed 1920×1080 and must be at least 640×480. Scale the short side to 720 pixels and use a compression ratio greater than 0.9.</li>
     * <li>Photo size: &lt; 1 MB.</li>
     * <li>Photos rotated 90, 180, and 270 degrees are supported. For photos with multiple faces, the largest face is selected.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains a CertifyId before each authentication to link the interfaces in the authentication request.</p>
     * 
     * @param request InitFaceVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitFaceVerifyResponse
     */
    public InitFaceVerifyResponse initFaceVerifyWithOptions(InitFaceVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appQualityCheck)) {
            query.put("AppQualityCheck", request.appQualityCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.birthday)) {
            query.put("Birthday", request.birthday);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackToken)) {
            query.put("CallbackToken", request.callbackToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackUrl)) {
            query.put("CallbackUrl", request.callbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cameraSelection)) {
            query.put("CameraSelection", request.cameraSelection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certName)) {
            query.put("CertName", request.certName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certNo)) {
            query.put("CertNo", request.certNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certType)) {
            query.put("CertType", request.certType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certifyId)) {
            query.put("CertifyId", request.certifyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certifyUrlStyle)) {
            query.put("CertifyUrlStyle", request.certifyUrlStyle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certifyUrlType)) {
            query.put("CertifyUrlType", request.certifyUrlType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableBeauty)) {
            query.put("EnableBeauty", request.enableBeauty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptType)) {
            query.put("EncryptType", request.encryptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceContrastPictureUrl)) {
            query.put("FaceContrastPictureUrl", request.faceContrastPictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceGuardOutput)) {
            query.put("FaceGuardOutput", request.faceGuardOutput);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.h5DegradeConfirmBtn)) {
            query.put("H5DegradeConfirmBtn", request.h5DegradeConfirmBtn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metaInfo)) {
            query.put("MetaInfo", request.metaInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needMultiFaceCheck)) {
            query.put("NeedMultiFaceCheck", request.needMultiFaceCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucketName)) {
            query.put("OssBucketName", request.ossBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossObjectName)) {
            query.put("OssObjectName", request.ossObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerOrderNo)) {
            query.put("OuterOrderNo", request.outerOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.procedurePriority)) {
            query.put("ProcedurePriority", request.procedurePriority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rarelyCharacters)) {
            query.put("RarelyCharacters", request.rarelyCharacters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.readImg)) {
            query.put("ReadImg", request.readImg);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnUrl)) {
            query.put("ReturnUrl", request.returnUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.suitableType)) {
            query.put("SuitableType", request.suitableType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uiCustomUrl)) {
            query.put("UiCustomUrl", request.uiCustomUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validityDate)) {
            query.put("ValidityDate", request.validityDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoEvidence)) {
            query.put("VideoEvidence", request.videoEvidence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voluntaryCustomizedContent)) {
            query.put("VoluntaryCustomizedContent", request.voluntaryCustomizedContent);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authId)) {
            body.put("AuthId", request.authId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crop)) {
            body.put("Crop", request.crop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceContrastPicture)) {
            body.put("FaceContrastPicture", request.faceContrastPicture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitFaceVerify"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitFaceVerifyResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * <li>This operation uses different parameters for different product plans. For more information, refer to the <a href="https://www.alibabacloud.com/help/en/id-verification/financial-grade-id-verification/product-overview/introduction/">official documentation</a>.</li>
     * </ul>
     * <h4>Image format requirements</h4>
     * <p>When performing ID Verification, submit images that meet all of the following conditions:</p>
     * <ul>
     * <li>A recent photo with a complete, clear, and unobstructed face, a natural expression, and the subject facing the camera directly.</li>
     * <li>A clear photo with normal exposure. The face must not be too dark, too bright, or have glare, and the angle must not deviate significantly.</li>
     * <li>Resolution must not exceed 1920×1080 and must be at least 640×480. Scale the short side to 720 pixels and use a compression ratio greater than 0.9.</li>
     * <li>Photo size: &lt; 1 MB.</li>
     * <li>Photos rotated 90, 180, and 270 degrees are supported. For photos with multiple faces, the largest face is selected.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains a CertifyId before each authentication to link the interfaces in the authentication request.</p>
     * 
     * @param request InitFaceVerifyRequest
     * @return InitFaceVerifyResponse
     */
    public InitFaceVerifyResponse initFaceVerify(InitFaceVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initFaceVerifyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds an ID Verification whitelist entry.</p>
     * 
     * @param request InsertWhiteListSettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InsertWhiteListSettingResponse
     */
    public InsertWhiteListSettingResponse insertWhiteListSettingWithOptions(InsertWhiteListSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certNo)) {
            query.put("CertNo", request.certNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certifyId)) {
            query.put("CertifyId", request.certifyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validDay)) {
            query.put("ValidDay", request.validDay);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsertWhiteListSetting"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsertWhiteListSettingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds an ID Verification whitelist entry.</p>
     * 
     * @param request InsertWhiteListSettingRequest
     * @return InsertWhiteListSettingResponse
     */
    public InsertWhiteListSettingResponse insertWhiteListSetting(InsertWhiteListSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.insertWhiteListSettingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calls the LivenessFaceVerify operation to perform liveness detection on a face image.</p>
     * 
     * <b>summary</b> : 
     * <p>LivenessFaceVerify is a service that performs passive liveness detection on face images submitted through an API operation. The algorithm primarily identifies liveness attack types such as screen replay and printed photo attacks. This service is suitable for low-risk business scenarios or for use in conjunction with an offline facial recognition SDK. If your business requires a higher level of security for real face verification, integrate the App or WebSDK pattern, or integrate the face Deepfake detection service to identify face forgery risks across more dimensions.</p>
     * 
     * @param request LivenessFaceVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LivenessFaceVerifyResponse
     */
    public LivenessFaceVerifyResponse livenessFaceVerifyWithOptions(LivenessFaceVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            query.put("Model", request.model);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certifyId)) {
            body.put("CertifyId", request.certifyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crop)) {
            body.put("Crop", request.crop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceToken)) {
            body.put("DeviceToken", request.deviceToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceContrastPicture)) {
            body.put("FaceContrastPicture", request.faceContrastPicture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceContrastPictureUrl)) {
            body.put("FaceContrastPictureUrl", request.faceContrastPictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            body.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            body.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucketName)) {
            body.put("OssBucketName", request.ossBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossObjectName)) {
            body.put("OssObjectName", request.ossObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerOrderNo)) {
            body.put("OuterOrderNo", request.outerOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LivenessFaceVerify"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LivenessFaceVerifyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Calls the LivenessFaceVerify operation to perform liveness detection on a face image.</p>
     * 
     * <b>summary</b> : 
     * <p>LivenessFaceVerify is a service that performs passive liveness detection on face images submitted through an API operation. The algorithm primarily identifies liveness attack types such as screen replay and printed photo attacks. This service is suitable for low-risk business scenarios or for use in conjunction with an offline facial recognition SDK. If your business requires a higher level of security for real face verification, integrate the App or WebSDK pattern, or integrate the face Deepfake detection service to identify face forgery risks across more dimensions.</p>
     * 
     * @param request LivenessFaceVerifyRequest
     * @return LivenessFaceVerifyResponse
     */
    public LivenessFaceVerifyResponse livenessFaceVerify(LivenessFaceVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.livenessFaceVerifyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Passes in a mobile phone number and a name, and verifies their authenticity and consistency through an authoritative data source.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies the consistency of a mobile phone number and the owner\&quot;s name.</p>
     * 
     * @param request Mobile2MetaVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return Mobile2MetaVerifyResponse
     */
    public Mobile2MetaVerifyResponse mobile2MetaVerifyWithOptions(Mobile2MetaVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            body.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            body.put("ParamType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Mobile2MetaVerify"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Mobile2MetaVerifyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Passes in a mobile phone number and a name, and verifies their authenticity and consistency through an authoritative data source.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies the consistency of a mobile phone number and the owner\&quot;s name.</p>
     * 
     * @param request Mobile2MetaVerifyRequest
     * @return Mobile2MetaVerifyResponse
     */
    public Mobile2MetaVerifyResponse mobile2MetaVerify(Mobile2MetaVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.mobile2MetaVerifyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Passes in a phone number, name, and ID card number, and verifies their authenticity and consistency through an authoritative data source. If the information is inconsistent, the reason for the inconsistency is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies the three-element identity of a phone number (detailed version - standard edition).</p>
     * 
     * @param request Mobile3MetaDetailStandardVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return Mobile3MetaDetailStandardVerifyResponse
     */
    public Mobile3MetaDetailStandardVerifyResponse mobile3MetaDetailStandardVerifyWithOptions(Mobile3MetaDetailStandardVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifyNum)) {
            body.put("IdentifyNum", request.identifyNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            body.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            body.put("ParamType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Mobile3MetaDetailStandardVerify"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Mobile3MetaDetailStandardVerifyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Passes in a phone number, name, and ID card number, and verifies their authenticity and consistency through an authoritative data source. If the information is inconsistent, the reason for the inconsistency is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies the three-element identity of a phone number (detailed version - standard edition).</p>
     * 
     * @param request Mobile3MetaDetailStandardVerifyRequest
     * @return Mobile3MetaDetailStandardVerifyResponse
     */
    public Mobile3MetaDetailStandardVerifyResponse mobile3MetaDetailStandardVerify(Mobile3MetaDetailStandardVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.mobile3MetaDetailStandardVerifyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com (IPv4) or cloudauth-dualstack.aliyuncs.com (IPv6).</li>
     * <li>Request method: POST and GET.</li>
     * <li>Transfer protocol: HTTPS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Verifies the authenticity and consistency of a phone number, name, and ID card number against authoritative data sources, and returns the reason for any inconsistency.</p>
     * 
     * @param request Mobile3MetaDetailVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return Mobile3MetaDetailVerifyResponse
     */
    public Mobile3MetaDetailVerifyResponse mobile3MetaDetailVerifyWithOptions(Mobile3MetaDetailVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifyNum)) {
            body.put("IdentifyNum", request.identifyNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            body.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            body.put("ParamType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Mobile3MetaDetailVerify"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Mobile3MetaDetailVerifyResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com (IPv4) or cloudauth-dualstack.aliyuncs.com (IPv6).</li>
     * <li>Request method: POST and GET.</li>
     * <li>Transfer protocol: HTTPS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Verifies the authenticity and consistency of a phone number, name, and ID card number against authoritative data sources, and returns the reason for any inconsistency.</p>
     * 
     * @param request Mobile3MetaDetailVerifyRequest
     * @return Mobile3MetaDetailVerifyResponse
     */
    public Mobile3MetaDetailVerifyResponse mobile3MetaDetailVerify(Mobile3MetaDetailVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.mobile3MetaDetailVerifyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Passes in a phone number, name, and ID card number, and verifies their authenticity and consistency through an authoritative data source.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies the three-element identity of a phone number (Standard Edition).</p>
     * 
     * @param request Mobile3MetaSimpleStandardVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return Mobile3MetaSimpleStandardVerifyResponse
     */
    public Mobile3MetaSimpleStandardVerifyResponse mobile3MetaSimpleStandardVerifyWithOptions(Mobile3MetaSimpleStandardVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifyNum)) {
            body.put("IdentifyNum", request.identifyNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            body.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            body.put("ParamType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Mobile3MetaSimpleStandardVerify"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Mobile3MetaSimpleStandardVerifyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Passes in a phone number, name, and ID card number, and verifies their authenticity and consistency through an authoritative data source.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies the three-element identity of a phone number (Standard Edition).</p>
     * 
     * @param request Mobile3MetaSimpleStandardVerifyRequest
     * @return Mobile3MetaSimpleStandardVerifyResponse
     */
    public Mobile3MetaSimpleStandardVerifyResponse mobile3MetaSimpleStandardVerify(Mobile3MetaSimpleStandardVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.mobile3MetaSimpleStandardVerifyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service address: cloudauth.aliyuncs.com (IPv4) or cloudauth-dualstack.aliyuncs.com (IPv6).</li>
     * <li>Request method: POST and GET.</li>
     * <li>Transfer protocol: HTTPS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Pass in the name and ID card number to verify their authenticity and consistency through authoritative data sources.</p>
     * 
     * @param request Mobile3MetaSimpleVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return Mobile3MetaSimpleVerifyResponse
     */
    public Mobile3MetaSimpleVerifyResponse mobile3MetaSimpleVerifyWithOptions(Mobile3MetaSimpleVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifyNum)) {
            body.put("IdentifyNum", request.identifyNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            body.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            body.put("ParamType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Mobile3MetaSimpleVerify"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Mobile3MetaSimpleVerifyResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service address: cloudauth.aliyuncs.com (IPv4) or cloudauth-dualstack.aliyuncs.com (IPv6).</li>
     * <li>Request method: POST and GET.</li>
     * <li>Transfer protocol: HTTPS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Pass in the name and ID card number to verify their authenticity and consistency through authoritative data sources.</p>
     * 
     * @param request Mobile3MetaSimpleVerifyRequest
     * @return Mobile3MetaSimpleVerifyResponse
     */
    public Mobile3MetaSimpleVerifyResponse mobile3MetaSimpleVerify(Mobile3MetaSimpleVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.mobile3MetaSimpleVerifyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Detects phone numbers.</p>
     * 
     * @param request MobileDetectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MobileDetectResponse
     */
    public MobileDetectResponse mobileDetectWithOptions(MobileDetectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mobiles)) {
            body.put("Mobiles", request.mobiles);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            body.put("ParamType", request.paramType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MobileDetect"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MobileDetectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Detects phone numbers.</p>
     * 
     * @param request MobileDetectRequest
     * @return MobileDetectResponse
     */
    public MobileDetectResponse mobileDetect(MobileDetectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.mobileDetectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the network availability status of a phone number.</p>
     * 
     * @param request MobileOnlineStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MobileOnlineStatusResponse
     */
    public MobileOnlineStatusResponse mobileOnlineStatusWithOptions(MobileOnlineStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            body.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            body.put("ParamType", request.paramType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MobileOnlineStatus"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MobileOnlineStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the network availability status of a phone number.</p>
     * 
     * @param request MobileOnlineStatusRequest
     * @return MobileOnlineStatusResponse
     */
    public MobileOnlineStatusResponse mobileOnlineStatus(MobileOnlineStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.mobileOnlineStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the length of time a phone number has been active on a network.</p>
     * 
     * @param request MobileOnlineTimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MobileOnlineTimeResponse
     */
    public MobileOnlineTimeResponse mobileOnlineTimeWithOptions(MobileOnlineTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            body.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            body.put("ParamType", request.paramType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MobileOnlineTime"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MobileOnlineTimeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the length of time a phone number has been active on a network.</p>
     * 
     * @param request MobileOnlineTimeRequest
     * @return MobileOnlineTimeResponse
     */
    public MobileOnlineTimeResponse mobileOnlineTime(MobileOnlineTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.mobileOnlineTimeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Passes in a phone number and its registration date, and verifies the authenticity and consistency of the information through an authoritative data source.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies whether a phone number has been reassigned to a new subscriber.</p>
     * 
     * @param request MobileRecycledMetaVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MobileRecycledMetaVerifyResponse
     */
    public MobileRecycledMetaVerifyResponse mobileRecycledMetaVerifyWithOptions(MobileRecycledMetaVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            query.put("ParamType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerDate)) {
            query.put("RegisterDate", request.registerDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MobileRecycledMetaVerify"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MobileRecycledMetaVerifyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Passes in a phone number and its registration date, and verifies the authenticity and consistency of the information through an authoritative data source.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies whether a phone number has been reassigned to a new subscriber.</p>
     * 
     * @param request MobileRecycledMetaVerifyRequest
     * @return MobileRecycledMetaVerifyResponse
     */
    public MobileRecycledMetaVerifyResponse mobileRecycledMetaVerify(MobileRecycledMetaVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.mobileRecycledMetaVerifyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * <li>Operation description: Creates or modifies a blacklist rule.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates or modifies a blacklist rule.</p>
     * 
     * @param tmpReq ModifyBlackListStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyBlackListStrategyResponse
     */
    public ModifyBlackListStrategyResponse modifyBlackListStrategyWithOptions(ModifyBlackListStrategyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyBlackListStrategyShrinkRequest request = new ModifyBlackListStrategyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.blackListStrategy)) {
            request.blackListStrategyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.blackListStrategy, "BlackListStrategy", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blackListStrategyShrink)) {
            query.put("BlackListStrategy", request.blackListStrategyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBlackListStrategy"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBlackListStrategyResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * <li>Operation description: Creates or modifies a blacklist rule.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates or modifies a blacklist rule.</p>
     * 
     * @param request ModifyBlackListStrategyRequest
     * @return ModifyBlackListStrategyResponse
     */
    public ModifyBlackListStrategyResponse modifyBlackListStrategy(ModifyBlackListStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBlackListStrategyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: HTTPS POST.</li>
     * <li>Request URL: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adjusts stability alert rules.</p>
     * 
     * @param tmpReq ModifyControlStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyControlStrategyResponse
     */
    public ModifyControlStrategyResponse modifyControlStrategyWithOptions(ModifyControlStrategyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyControlStrategyShrinkRequest request = new ModifyControlStrategyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.controlStrategyList)) {
            request.controlStrategyListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.controlStrategyList, "ControlStrategyList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.controlStrategyListShrink)) {
            query.put("ControlStrategyList", request.controlStrategyListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyControlStrategy"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyControlStrategyResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: HTTPS POST.</li>
     * <li>Request URL: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adjusts stability alert rules.</p>
     * 
     * @param request ModifyControlStrategyRequest
     * @return ModifyControlStrategyResponse
     */
    public ModifyControlStrategyResponse modifyControlStrategy(ModifyControlStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyControlStrategyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: HTTPS POST and GET methods are supported.</li>
     * <li>Endpoint: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adjusts the list of custom rate limiting policies.</p>
     * 
     * @param tmpReq ModifyCustomizeFlowStrategyListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCustomizeFlowStrategyListResponse
     */
    public ModifyCustomizeFlowStrategyListResponse modifyCustomizeFlowStrategyListWithOptions(ModifyCustomizeFlowStrategyListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyCustomizeFlowStrategyListShrinkRequest request = new ModifyCustomizeFlowStrategyListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.strategyObject)) {
            request.strategyObjectShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.strategyObject, "StrategyObject", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyObjectShrink)) {
            query.put("StrategyObject", request.strategyObjectShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCustomizeFlowStrategyList"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCustomizeFlowStrategyListResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: HTTPS POST and GET methods are supported.</li>
     * <li>Endpoint: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adjusts the list of custom rate limiting policies.</p>
     * 
     * @param request ModifyCustomizeFlowStrategyListRequest
     * @return ModifyCustomizeFlowStrategyListResponse
     */
    public ModifyCustomizeFlowStrategyListResponse modifyCustomizeFlowStrategyList(ModifyCustomizeFlowStrategyListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCustomizeFlowStrategyListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Request method: You can send requests by using the HTTPS POST and GET methods.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates device-related information, such as extending the device authorization validity period, updating custom business identifiers, and updating device IDs. This operation is applicable to scenarios such as device validity period renewal.</p>
     * 
     * @param request ModifyDeviceInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDeviceInfoResponse
     */
    public ModifyDeviceInfoResponse modifyDeviceInfoWithOptions(ModifyDeviceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiredDay)) {
            query.put("ExpiredDay", request.expiredDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDeviceId)) {
            query.put("UserDeviceId", request.userDeviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDeviceInfo"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDeviceInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Request method: You can send requests by using the HTTPS POST and GET methods.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates device-related information, such as extending the device authorization validity period, updating custom business identifiers, and updating device IDs. This operation is applicable to scenarios such as device validity period renewal.</p>
     * 
     * @param request ModifyDeviceInfoRequest
     * @return ModifyDeviceInfoResponse
     */
    public ModifyDeviceInfoResponse modifyDeviceInfo(ModifyDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDeviceInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries ID Verification whitelist configurations by using paging.</p>
     * 
     * @param request PageQueryWhiteListSettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PageQueryWhiteListSettingResponse
     */
    public PageQueryWhiteListSettingResponse pageQueryWhiteListSettingWithOptions(PageQueryWhiteListSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certNo)) {
            query.put("CertNo", request.certNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certifyId)) {
            query.put("CertifyId", request.certifyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validEndDate)) {
            query.put("ValidEndDate", request.validEndDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validStartDate)) {
            query.put("ValidStartDate", request.validStartDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PageQueryWhiteListSetting"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PageQueryWhiteListSettingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries ID Verification whitelist configurations by using paging.</p>
     * 
     * @param request PageQueryWhiteListSettingRequest
     * @return PageQueryWhiteListSettingResponse
     */
    public PageQueryWhiteListSettingResponse pageQueryWhiteListSetting(PageQueryWhiteListSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pageQueryWhiteListSettingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request endpoint: cloudauth.aliyuncs.com</li>
     * <li>Request method: HTTPS POST and GET.<blockquote>
     * <p>You can configure blacklists for IP addresses, ID card numbers, phone numbers, and bank card numbers. When a request matches a blacklist entry, the system rejects the request and returns a fixed error code.
     * You can configure blacklists for IP addresses, ID card numbers, phone numbers, and bank card numbers. When a request matches a blacklist entry, the system rejects the request and returns a fixed error code.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the blacklist configuration list.</p>
     * 
     * @param request QueryBlackListStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBlackListStrategyResponse
     */
    public QueryBlackListStrategyResponse queryBlackListStrategyWithOptions(QueryBlackListStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBlackListStrategy"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBlackListStrategyResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request endpoint: cloudauth.aliyuncs.com</li>
     * <li>Request method: HTTPS POST and GET.<blockquote>
     * <p>You can configure blacklists for IP addresses, ID card numbers, phone numbers, and bank card numbers. When a request matches a blacklist entry, the system rejects the request and returns a fixed error code.
     * You can configure blacklists for IP addresses, ID card numbers, phone numbers, and bank card numbers. When a request matches a blacklist entry, the system rejects the request and returns a fixed error code.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the blacklist configuration list.</p>
     * 
     * @param request QueryBlackListStrategyRequest
     * @return QueryBlackListStrategyResponse
     */
    public QueryBlackListStrategyResponse queryBlackListStrategy(QueryBlackListStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBlackListStrategyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: HTTPS POST and GET.</li>
     * <li>Request URL: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of stability rules. The system monitors the stability of the server-side InitFaceVerify operation and API integration operations. If a threshold is triggered, the system sends an alert.</p>
     * 
     * @param request QueryControlStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryControlStrategyResponse
     */
    public QueryControlStrategyResponse queryControlStrategyWithOptions(QueryControlStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryControlStrategy"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryControlStrategyResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: HTTPS POST and GET.</li>
     * <li>Request URL: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of stability rules. The system monitors the stability of the server-side InitFaceVerify operation and API integration operations. If a threshold is triggered, the system sends an alert.</p>
     * 
     * @param request QueryControlStrategyRequest
     * @return QueryControlStrategyResponse
     */
    public QueryControlStrategyResponse queryControlStrategy(QueryControlStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryControlStrategyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * <li>Security rules: monitoring rules that ensure system security, such as API abuse and abnormal account theft. When a threshold is triggered, the system sends an alert.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries security rules.</p>
     * 
     * @param request QueryCustomizeFlowStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCustomizeFlowStrategyResponse
     */
    public QueryCustomizeFlowStrategyResponse queryCustomizeFlowStrategyWithOptions(QueryCustomizeFlowStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCustomizeFlowStrategy"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCustomizeFlowStrategyResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * <li>Security rules: monitoring rules that ensure system security, such as API abuse and abnormal account theft. When a threshold is triggered, the system sends an alert.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries security rules.</p>
     * 
     * @param request QueryCustomizeFlowStrategyRequest
     * @return QueryCustomizeFlowStrategyResponse
     */
    public QueryCustomizeFlowStrategyResponse queryCustomizeFlowStrategy(QueryCustomizeFlowStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCustomizeFlowStrategyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of intent verification settings.</p>
     * 
     * @param request QuerySceneConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySceneConfigsResponse
     */
    public QuerySceneConfigsResponse querySceneConfigsWithOptions(QuerySceneConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySceneConfigs"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySceneConfigsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of intent verification settings.</p>
     * 
     * @param request QuerySceneConfigsRequest
     * @return QuerySceneConfigsResponse
     */
    public QuerySceneConfigsResponse querySceneConfigs(QuerySceneConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySceneConfigsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the download link of a statistical call data file under a product plan based on query conditions.</p>
     * <ul>
     * <li>Method: HTTPS POST</li>
     * <li>Endpoint: cloudauth.aliyuncs.com<blockquote>
     * <p>ID Verification uses CertifyId to calculate the call volume. To facilitate reconciliation, retain the CertifyId field in your system.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries an ID Verification download task.</p>
     * 
     * @param request QueryVerifyDownloadTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryVerifyDownloadTaskResponse
     */
    public QueryVerifyDownloadTaskResponse queryVerifyDownloadTaskWithOptions(QueryVerifyDownloadTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryVerifyDownloadTask"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryVerifyDownloadTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the download link of a statistical call data file under a product plan based on query conditions.</p>
     * <ul>
     * <li>Method: HTTPS POST</li>
     * <li>Endpoint: cloudauth.aliyuncs.com<blockquote>
     * <p>ID Verification uses CertifyId to calculate the call volume. To facilitate reconciliation, retain the CertifyId field in your system.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries an ID Verification download task.</p>
     * 
     * @param request QueryVerifyDownloadTaskRequest
     * @return QueryVerifyDownloadTaskResponse
     */
    public QueryVerifyDownloadTaskResponse queryVerifyDownloadTask(QueryVerifyDownloadTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryVerifyDownloadTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * <li>This operation uses different parameters for different product plans. For more information, see <a href="https://www.alibabacloud.com/help/en/id-verification/financial-grade-id-verification/product-overview/introduction/">official documentation</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries data transfer plans.</p>
     * 
     * @param request QueryVerifyFlowPackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryVerifyFlowPackageResponse
     */
    public QueryVerifyFlowPackageResponse queryVerifyFlowPackageWithOptions(QueryVerifyFlowPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryVerifyFlowPackage"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryVerifyFlowPackageResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * <li>This operation uses different parameters for different product plans. For more information, see <a href="https://www.alibabacloud.com/help/en/id-verification/financial-grade-id-verification/product-overview/introduction/">official documentation</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries data transfer plans.</p>
     * 
     * @param request QueryVerifyFlowPackageRequest
     * @return QueryVerifyFlowPackageResponse
     */
    public QueryVerifyFlowPackageResponse queryVerifyFlowPackage(QueryVerifyFlowPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryVerifyFlowPackageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request endpoint: cloudauth.aliyuncs.com</li>
     * <li>Request method: HTTPS POST and GET.<blockquote>
     * <p>ID Verification counts call volume by CertifyId. To facilitate reconciliation, retain the CertifyId field in your system.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the call volume of a product code based on different product plans.</p>
     * 
     * @param request QueryVerifyInvokeSatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryVerifyInvokeSatisticResponse
     */
    public QueryVerifyInvokeSatisticResponse queryVerifyInvokeSatisticWithOptions(QueryVerifyInvokeSatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productProgramList)) {
            query.put("ProductProgramList", request.productProgramList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneIdList)) {
            query.put("SceneIdList", request.sceneIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statisticsType)) {
            query.put("StatisticsType", request.statisticsType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryVerifyInvokeSatistic"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryVerifyInvokeSatisticResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request endpoint: cloudauth.aliyuncs.com</li>
     * <li>Request method: HTTPS POST and GET.<blockquote>
     * <p>ID Verification counts call volume by CertifyId. To facilitate reconciliation, retain the CertifyId field in your system.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the call volume of a product code based on different product plans.</p>
     * 
     * @param request QueryVerifyInvokeSatisticRequest
     * @return QueryVerifyInvokeSatisticResponse
     */
    public QueryVerifyInvokeSatisticResponse queryVerifyInvokeSatistic(QueryVerifyInvokeSatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryVerifyInvokeSatisticWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an ID Verification whitelist.</p>
     * 
     * @param tmpReq RemoveWhiteListSettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveWhiteListSettingResponse
     */
    public RemoveWhiteListSettingResponse removeWhiteListSettingWithOptions(RemoveWhiteListSettingRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveWhiteListSettingShrinkRequest request = new RemoveWhiteListSettingShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            query.put("Ids", request.idsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            query.put("ServiceCode", request.serviceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveWhiteListSetting"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveWhiteListSettingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an ID Verification whitelist.</p>
     * 
     * @param request RemoveWhiteListSettingRequest
     * @return RemoveWhiteListSettingResponse
     */
    public RemoveWhiteListSettingResponse removeWhiteListSetting(RemoveWhiteListSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeWhiteListSettingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the information of a China Finance Certification Initiative (CFCI) scenario based on the scenario ID.</p>
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a China Finance Certification Initiative (CFCI) scenario.</p>
     * 
     * @param request UpdateAntCloudAuthSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAntCloudAuthSceneResponse
     */
    public UpdateAntCloudAuthSceneResponse updateAntCloudAuthSceneWithOptions(UpdateAntCloudAuthSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bindMiniProgram)) {
            query.put("BindMiniProgram", request.bindMiniProgram);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkFileBody)) {
            query.put("CheckFileBody", request.checkFileBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkFileName)) {
            query.put("CheckFileName", request.checkFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceRiskPlus)) {
            query.put("DeviceRiskPlus", request.deviceRiskPlus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.miniProgramName)) {
            query.put("MiniProgramName", request.miniProgramName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnPicCount)) {
            query.put("ReturnPicCount", request.returnPicCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnVideoLength)) {
            query.put("ReturnVideoLength", request.returnVideoLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneName)) {
            query.put("SceneName", request.sceneName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeImage)) {
            query.put("StoreImage", request.storeImage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAntCloudAuthScene"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAntCloudAuthSceneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates the information of a China Finance Certification Initiative (CFCI) scenario based on the scenario ID.</p>
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a China Finance Certification Initiative (CFCI) scenario.</p>
     * 
     * @param request UpdateAntCloudAuthSceneRequest
     * @return UpdateAntCloudAuthSceneResponse
     */
    public UpdateAntCloudAuthSceneResponse updateAntCloudAuthScene(UpdateAntCloudAuthSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAntCloudAuthSceneWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: HTTPS POST.</li>
     * <li>Request URL: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the intent scenario configuration.</p>
     * 
     * @param request UpdateSceneConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSceneConfigResponse
     */
    public UpdateSceneConfigResponse updateSceneConfigWithOptions(UpdateSceneConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("sceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSceneConfig"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSceneConfigResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: HTTPS POST.</li>
     * <li>Request URL: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the intent scenario configuration.</p>
     * 
     * @param request UpdateSceneConfigRequest
     * @return UpdateSceneConfigResponse
     */
    public UpdateSceneConfigResponse updateSceneConfig(UpdateSceneConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSceneConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries basic vehicle information by license plate number and vehicle type.</p>
     * 
     * <b>summary</b> : 
     * <p>Identifies the five key attributes of a vehicle.</p>
     * 
     * @param request Vehicle5ItemQueryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return Vehicle5ItemQueryResponse
     */
    public Vehicle5ItemQueryResponse vehicle5ItemQueryWithOptions(Vehicle5ItemQueryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            query.put("ParamType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vehicleNum)) {
            query.put("VehicleNum", request.vehicleNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vehicleType)) {
            query.put("VehicleType", request.vehicleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Vehicle5ItemQuery"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Vehicle5ItemQueryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries basic vehicle information by license plate number and vehicle type.</p>
     * 
     * <b>summary</b> : 
     * <p>Identifies the five key attributes of a vehicle.</p>
     * 
     * @param request Vehicle5ItemQueryRequest
     * @return Vehicle5ItemQueryResponse
     */
    public Vehicle5ItemQueryResponse vehicle5ItemQuery(Vehicle5ItemQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.vehicle5ItemQueryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the insurance date of a vehicle by license plate number, vehicle type, and vehicle identification number (VIN).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the insurance date of a vehicle.</p>
     * 
     * @param request VehicleInsureQueryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VehicleInsureQueryResponse
     */
    public VehicleInsureQueryResponse vehicleInsureQueryWithOptions(VehicleInsureQueryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            query.put("ParamType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vehicleNum)) {
            query.put("VehicleNum", request.vehicleNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vehicleType)) {
            query.put("VehicleType", request.vehicleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vin)) {
            query.put("Vin", request.vin);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VehicleInsureQuery"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VehicleInsureQueryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the insurance date of a vehicle by license plate number, vehicle type, and vehicle identification number (VIN).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the insurance date of a vehicle.</p>
     * 
     * @param request VehicleInsureQueryRequest
     * @return VehicleInsureQueryResponse
     */
    public VehicleInsureQueryResponse vehicleInsureQuery(VehicleInsureQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.vehicleInsureQueryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Verifies the consistency of the name, ID card number, license plate number, and vehicle type.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies vehicle element consistency.</p>
     * 
     * @param request VehicleMetaVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VehicleMetaVerifyResponse
     */
    public VehicleMetaVerifyResponse vehicleMetaVerifyWithOptions(VehicleMetaVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifyNum)) {
            query.put("IdentifyNum", request.identifyNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            query.put("ParamType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vehicleNum)) {
            query.put("VehicleNum", request.vehicleNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vehicleType)) {
            query.put("VehicleType", request.vehicleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyMetaType)) {
            query.put("VerifyMetaType", request.verifyMetaType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VehicleMetaVerify"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VehicleMetaVerifyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Verifies the consistency of the name, ID card number, license plate number, and vehicle type.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies vehicle element consistency.</p>
     * 
     * @param request VehicleMetaVerifyRequest
     * @return VehicleMetaVerifyResponse
     */
    public VehicleMetaVerifyResponse vehicleMetaVerify(VehicleMetaVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.vehicleMetaVerifyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Verifies the consistency of the name, ID card number, license plate number, and vehicle type, and supports returning vehicle details.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies vehicle element information (enhanced edition).</p>
     * 
     * @param request VehicleMetaVerifyV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return VehicleMetaVerifyV2Response
     */
    public VehicleMetaVerifyV2Response vehicleMetaVerifyV2WithOptions(VehicleMetaVerifyV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifyNum)) {
            query.put("IdentifyNum", request.identifyNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            query.put("ParamType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vehicleNum)) {
            query.put("VehicleNum", request.vehicleNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vehicleType)) {
            query.put("VehicleType", request.vehicleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyMetaType)) {
            query.put("VerifyMetaType", request.verifyMetaType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VehicleMetaVerifyV2"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VehicleMetaVerifyV2Response());
    }

    /**
     * <b>description</b> :
     * <p>Verifies the consistency of the name, ID card number, license plate number, and vehicle type, and supports returning vehicle details.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies vehicle element information (enhanced edition).</p>
     * 
     * @param request VehicleMetaVerifyV2Request
     * @return VehicleMetaVerifyV2Response
     */
    public VehicleMetaVerifyV2Response vehicleMetaVerifyV2(VehicleMetaVerifyV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.vehicleMetaVerifyV2WithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries detailed vehicle information by license plate number and vehicle type.</p>
     * 
     * <b>summary</b> : 
     * <p>Identifies vehicle information.</p>
     * 
     * @param request VehicleQueryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VehicleQueryResponse
     */
    public VehicleQueryResponse vehicleQueryWithOptions(VehicleQueryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            query.put("ParamType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vehicleNum)) {
            query.put("VehicleNum", request.vehicleNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vehicleType)) {
            query.put("VehicleType", request.vehicleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VehicleQuery"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VehicleQueryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries detailed vehicle information by license plate number and vehicle type.</p>
     * 
     * <b>summary</b> : 
     * <p>Identifies vehicle information.</p>
     * 
     * @param request VehicleQueryRequest
     * @return VehicleQueryResponse
     */
    public VehicleQueryResponse vehicleQuery(VehicleQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.vehicleQueryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you begin: Before calling this API, ensure that you have completed the required preparations. For more information, see <a href="https://help.aliyun.com/document_detail/127471.html">Server-side integration preparations</a>.
     * Request method: HTTPS POST and GET.
     * Operation description: The caller\&quot;s server submits verification materials to the ID Verification service for comparison and validation. The result is returned synchronously.
     * Applicable scope: This operation is applicable only to server-side-only verification solutions.
     * Image URL description:</p>
     * <ul>
     * <li>HTTP or HTTPS URL: Publicly accessible HTTP or HTTPS URLs are supported. For example, <code>http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg</code>.</li>
     * <li>OSS URL: If the caller\&quot;s images are local files, Alibaba Cloud provides an upload SDK that allows you to upload images to the OSS bucket designated by the ID Verification service and obtain the corresponding OSS URL to use as the image URL parameter. If your business requires the upload SDK, <a href="https://selfservice.console.aliyun.com/ticket/category/cloudauth/today">submit a ticket</a> to contact us.
     * Image restrictions:</li>
     * <li>Relative paths or absolute paths of local images are not supported.</li>
     * <li>Keep each image within 2 MB to avoid algorithm fetch timeouts.</li>
     * <li>The face area in the image must be at least 64 × 64 pixels.</li>
     * <li>The request body has an 8 MB size limit. Ensure that the total size of all images and other information in the request does not exceed this limit.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a name, ID card number, facial photo, and optional front and back photos of the ID card for ID Verification, and synchronously returns the result.</p>
     * 
     * @param request VerifyMaterialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyMaterialResponse
     */
    public VerifyMaterialResponse verifyMaterialWithOptions(VerifyMaterialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceImageUrl)) {
            query.put("FaceImageUrl", request.faceImageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idCardBackImageUrl)) {
            query.put("IdCardBackImageUrl", request.idCardBackImageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idCardFrontImageUrl)) {
            query.put("IdCardFrontImageUrl", request.idCardFrontImageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idCardNumber)) {
            query.put("IdCardNumber", request.idCardNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyMaterial"),
            new TeaPair("version", "2019-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyMaterialResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you begin: Before calling this API, ensure that you have completed the required preparations. For more information, see <a href="https://help.aliyun.com/document_detail/127471.html">Server-side integration preparations</a>.
     * Request method: HTTPS POST and GET.
     * Operation description: The caller\&quot;s server submits verification materials to the ID Verification service for comparison and validation. The result is returned synchronously.
     * Applicable scope: This operation is applicable only to server-side-only verification solutions.
     * Image URL description:</p>
     * <ul>
     * <li>HTTP or HTTPS URL: Publicly accessible HTTP or HTTPS URLs are supported. For example, <code>http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg</code>.</li>
     * <li>OSS URL: If the caller\&quot;s images are local files, Alibaba Cloud provides an upload SDK that allows you to upload images to the OSS bucket designated by the ID Verification service and obtain the corresponding OSS URL to use as the image URL parameter. If your business requires the upload SDK, <a href="https://selfservice.console.aliyun.com/ticket/category/cloudauth/today">submit a ticket</a> to contact us.
     * Image restrictions:</li>
     * <li>Relative paths or absolute paths of local images are not supported.</li>
     * <li>Keep each image within 2 MB to avoid algorithm fetch timeouts.</li>
     * <li>The face area in the image must be at least 64 × 64 pixels.</li>
     * <li>The request body has an 8 MB size limit. Ensure that the total size of all images and other information in the request does not exceed this limit.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a name, ID card number, facial photo, and optional front and back photos of the ID card for ID Verification, and synchronously returns the result.</p>
     * 
     * @param request VerifyMaterialRequest
     * @return VerifyMaterialResponse
     */
    public VerifyMaterialResponse verifyMaterial(VerifyMaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyMaterialWithOptions(request, runtime);
    }
}
