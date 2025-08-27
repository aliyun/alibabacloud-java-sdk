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
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cloudauth", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }

    public java.util.Map<String, ?> _postOSSObject(String bucketName, java.util.Map<String, ?> data) throws Exception {
        TeaRequest request_ = new TeaRequest();
        java.util.Map<String, Object> form = com.aliyun.teautil.Common.assertAsMap(data);
        String boundary = com.aliyun.fileform.Client.getBoundary();
        String host = com.aliyun.teautil.Common.assertAsString(form.get("host"));
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
        TeaResponse response_ = Tea.doAction(request_, new java.util.HashMap<String, Object>(), interceptorChain);

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
     * <p>Add AIGC Face Detection Capability</p>
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
     * <p>Add AIGC Face Detection Capability</p>
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
     * <p>Bank card verification, including: two elements (name + bank card number), three elements (name + ID number + bank card number), and four elements (name + ID number + mobile phone number + bank card number) consistency verification.</p>
     * <ul>
     * <li>Service address:<ul>
     * <li>Beijing region: cloudauth.cn-beijing.aliyuncs.com (IPv4) or cloudauth-dualstack.cn-beijing.aliyuncs.com (IPv6).</li>
     * <li>Shanghai region: cloudauth.cn-shanghai.aliyuncs.com (IPv4) or cloudauth-dualstack.cn-shanghai.aliyuncs.com (IPv6).</li>
     * </ul>
     * </li>
     * <li>Request method: POST and GET.</li>
     * <li>Transfer protocol: HTTPS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Bank Card Element Verification Interface</p>
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
     * <p>Bank card verification, including: two elements (name + bank card number), three elements (name + ID number + bank card number), and four elements (name + ID number + mobile phone number + bank card number) consistency verification.</p>
     * <ul>
     * <li>Service address:<ul>
     * <li>Beijing region: cloudauth.cn-beijing.aliyuncs.com (IPv4) or cloudauth-dualstack.cn-beijing.aliyuncs.com (IPv6).</li>
     * <li>Shanghai region: cloudauth.cn-shanghai.aliyuncs.com (IPv4) or cloudauth-dualstack.cn-shanghai.aliyuncs.com (IPv6).</li>
     * </ul>
     * </li>
     * <li>Request method: POST and GET.</li>
     * <li>Transfer protocol: HTTPS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Bank Card Element Verification Interface</p>
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
     * <li>API Name: CompareFaceVerify.</li>
     * <li>Service Address: cloudauth.aliyuncs.com.</li>
     * <li>Request Method: HTTPS POST and GET.</li>
     * <li>API Description: An interface to achieve real-person authentication through server-side integration.</li>
     * </ul>
     * <h4>Photo Format Requirements</h4>
     * <p>When performing face comparison, please upload 2 facial photos that meet all the following conditions:</p>
     * <ul>
     * <li>Recent photo/recent database photo, with a complete, clear, unobstructed face, natural expression, and facing the camera directly.</li>
     * <li>Clear photo with normal exposure, no overly dark, overly bright, or halo effects on the face, and no significant angle deviation.</li>
     * <li>Resolution not exceeding 1920<em>1080, at least 640</em>480, recommended to scale the shorter side to 720 pixels, with a compression ratio greater than 0.9.</li>
     * <li>Photo size: &lt;1MB.</li>
     * <li>Supports 90, 180, and 270-degree photos; in cases of multiple faces, the largest face will be selected.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Financial-grade Pure Server-Side API for Face Comparison.</p>
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
     * <li>API Name: CompareFaceVerify.</li>
     * <li>Service Address: cloudauth.aliyuncs.com.</li>
     * <li>Request Method: HTTPS POST and GET.</li>
     * <li>API Description: An interface to achieve real-person authentication through server-side integration.</li>
     * </ul>
     * <h4>Photo Format Requirements</h4>
     * <p>When performing face comparison, please upload 2 facial photos that meet all the following conditions:</p>
     * <ul>
     * <li>Recent photo/recent database photo, with a complete, clear, unobstructed face, natural expression, and facing the camera directly.</li>
     * <li>Clear photo with normal exposure, no overly dark, overly bright, or halo effects on the face, and no significant angle deviation.</li>
     * <li>Resolution not exceeding 1920<em>1080, at least 640</em>480, recommended to scale the shorter side to 720 pixels, with a compression ratio greater than 0.9.</li>
     * <li>Photo size: &lt;1MB.</li>
     * <li>Supports 90, 180, and 270-degree photos; in cases of multiple faces, the largest face will be selected.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Financial-grade Pure Server-Side API for Face Comparison.</p>
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
     * <p>Request Method: Only supports sending requests via HTTPS POST.
     * Interface Description: Compares two face images and outputs the similarity score of the faces in the two images as the result.</p>
     * <ul>
     * <li>At least one of the specified comparison images should be a face photo (FacePic).</li>
     * <li>If an image contains multiple faces, the algorithm will automatically select the largest face in the image.</li>
     * <li>If one of the two comparison images does not detect a face, the system will return an error message stating \&quot;No face detected\&quot;.
     * When uploading images, you need to provide the HTTP address or base64 encoding of the image.</li>
     * <li>HTTP Address: A publicly accessible HTTP address. For example, <code>http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg</code>.</li>
     * <li>Base64 Encoding: An image encoded in base64, formatted as <code>base64://&lt;base64 string of the image&gt;</code>.
     * Image Restrictions</li>
     * <li>Does not support relative or absolute paths for local images.</li>
     * <li>Please keep the size of a single image within 2MB to avoid timeout during retrieval by the algorithm.</li>
     * <li>The body of a single request has a size limit of 8MB; please calculate the total size of all images and other information in the request to ensure it does not exceed this limit.</li>
     * <li>When using base64 to transmit images, the request method must be changed to POST; the header description such as <code>data:image/png;base64,</code> should be removed from the base64 string of the image.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invoke CompareFaces for face comparison.</p>
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
     * <p>Request Method: Only supports sending requests via HTTPS POST.
     * Interface Description: Compares two face images and outputs the similarity score of the faces in the two images as the result.</p>
     * <ul>
     * <li>At least one of the specified comparison images should be a face photo (FacePic).</li>
     * <li>If an image contains multiple faces, the algorithm will automatically select the largest face in the image.</li>
     * <li>If one of the two comparison images does not detect a face, the system will return an error message stating \&quot;No face detected\&quot;.
     * When uploading images, you need to provide the HTTP address or base64 encoding of the image.</li>
     * <li>HTTP Address: A publicly accessible HTTP address. For example, <code>http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg</code>.</li>
     * <li>Base64 Encoding: An image encoded in base64, formatted as <code>base64://&lt;base64 string of the image&gt;</code>.
     * Image Restrictions</li>
     * <li>Does not support relative or absolute paths for local images.</li>
     * <li>Please keep the size of a single image within 2MB to avoid timeout during retrieval by the algorithm.</li>
     * <li>The body of a single request has a size limit of 8MB; please calculate the total size of all images and other information in the request to ensure it does not exceed this limit.</li>
     * <li>When using base64 to transmit images, the request method must be changed to POST; the header description such as <code>data:image/png;base64,</code> should be removed from the base64 string of the image.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invoke CompareFaces for face comparison.</p>
     * 
     * @param request CompareFacesRequest
     * @return CompareFacesResponse
     */
    public CompareFacesResponse compareFaces(CompareFacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.compareFacesWithOptions(request, runtime);
    }

    /**
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
                new TeaPair("host", "" + authResponseBody.get("Bucket") + "." + com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType) + ""),
                new TeaPair("OSSAccessKeyId", authResponseBody.get("AccessKeyId")),
                new TeaPair("policy", authResponseBody.get("EncodedPolicy")),
                new TeaPair("Signature", authResponseBody.get("Signature")),
                new TeaPair("key", authResponseBody.get("ObjectKey")),
                new TeaPair("file", fileObj),
                new TeaPair("success_action_status", "201")
            );
            this._postOSSObject(authResponseBody.get("Bucket"), ossHeader);
            contrastFaceVerifyReq.faceContrastFile = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        ContrastFaceVerifyResponse contrastFaceVerifyResp = this.contrastFaceVerifyWithOptions(contrastFaceVerifyReq, runtime);
        return contrastFaceVerifyResp;
    }

    /**
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
     * @param request CreateAuthKeyRequest
     * @return CreateAuthKeyResponse
     */
    public CreateAuthKeyResponse createAuthKey(CreateAuthKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAuthKeyWithOptions(request, runtime);
    }

    /**
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
     * @param request CreateVerifySettingRequest
     * @return CreateVerifySettingResponse
     */
    public CreateVerifySettingResponse createVerifySetting(CreateVerifySettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVerifySettingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Upload e-commerce product images to perform tampering, quality (clarity), and similar image detection, returning risk labels and scores.</p>
     * 
     * <b>summary</b> : 
     * <p>Product Credential Verification</p>
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
     * <p>Upload e-commerce product images to perform tampering, quality (clarity), and similar image detection, returning risk labels and scores.</p>
     * 
     * <b>summary</b> : 
     * <p>Product Credential Verification</p>
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
                new TeaPair("host", "" + authResponseBody.get("Bucket") + "." + com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType) + ""),
                new TeaPair("OSSAccessKeyId", authResponseBody.get("AccessKeyId")),
                new TeaPair("policy", authResponseBody.get("EncodedPolicy")),
                new TeaPair("Signature", authResponseBody.get("Signature")),
                new TeaPair("key", authResponseBody.get("ObjectKey")),
                new TeaPair("file", fileObj),
                new TeaPair("success_action_status", "201")
            );
            this._postOSSObject(authResponseBody.get("Bucket"), ossHeader);
            credentialProductVerifyV2Req.imageFile = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        CredentialProductVerifyV2Response credentialProductVerifyV2Resp = this.credentialProductVerifyV2WithOptions(credentialProductVerifyV2Req, runtime);
        return credentialProductVerifyV2Resp;
    }

    /**
     * <b>summary</b> : 
     * <p>凭证核验</p>
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
     * <b>summary</b> : 
     * <p>凭证核验</p>
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
     * <p>Input credential image information, perform image tampering and forgery detection, and image semantic understanding. Return the risk detection results.</p>
     * 
     * <b>summary</b> : 
     * <p>Credential Verification</p>
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
     * <p>Input credential image information, perform image tampering and forgery detection, and image semantic understanding. Return the risk detection results.</p>
     * 
     * <b>summary</b> : 
     * <p>Credential Verification</p>
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
                new TeaPair("host", "" + authResponseBody.get("Bucket") + "." + com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType) + ""),
                new TeaPair("OSSAccessKeyId", authResponseBody.get("AccessKeyId")),
                new TeaPair("policy", authResponseBody.get("EncodedPolicy")),
                new TeaPair("Signature", authResponseBody.get("Signature")),
                new TeaPair("key", authResponseBody.get("ObjectKey")),
                new TeaPair("file", fileObj),
                new TeaPair("success_action_status", "201")
            );
            this._postOSSObject(authResponseBody.get("Bucket"), ossHeader);
            credentialVerifyV2Req.imageFile = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        CredentialVerifyV2Response credentialVerifyV2Resp = this.credentialVerifyV2WithOptions(credentialVerifyV2Req, runtime);
        return credentialVerifyV2Resp;
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The Face Deepfake Detection API is currently in the free public beta stage, which will end on August 30, 2024, at 23:59:59. During the public beta, the QPS (Queries Per Second) cannot exceed 3 times/second.</p>
     * </blockquote>
     * <ul>
     * <li>Service address: cloudauth.aliyuncs.com (IPv4) or cloudauth-dualstack.aliyuncs.com (IPv6).</li>
     * <li>Request method: POST and GET.</li>
     * <li>Transfer protocol: HTTPS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Face Credential Verification Service</p>
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
     * <p>The Face Deepfake Detection API is currently in the free public beta stage, which will end on August 30, 2024, at 23:59:59. During the public beta, the QPS (Queries Per Second) cannot exceed 3 times/second.</p>
     * </blockquote>
     * <ul>
     * <li>Service address: cloudauth.aliyuncs.com (IPv4) or cloudauth-dualstack.aliyuncs.com (IPv6).</li>
     * <li>Request method: POST and GET.</li>
     * <li>Transfer protocol: HTTPS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Face Credential Verification Service</p>
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
     * <p>Deletes all personal information fields in the request, including name, ID number, phone number, IP, images, videos, and device information, etc.</p>
     * 
     * <b>summary</b> : 
     * <p>Financial Level Sensitive Data Deletion Interface</p>
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
     * <p>Deletes all personal information fields in the request, including name, ID number, phone number, IP, images, videos, and device information, etc.</p>
     * 
     * <b>summary</b> : 
     * <p>Financial Level Sensitive Data Deletion Interface</p>
     * 
     * @param request DeleteFaceVerifyResultRequest
     * @return DeleteFaceVerifyResultResponse
     */
    public DeleteFaceVerifyResultResponse deleteFaceVerifyResult(DeleteFaceVerifyResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFaceVerifyResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>图片要素核验获取认证结果</p>
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
     * <b>summary</b> : 
     * <p>图片要素核验获取认证结果</p>
     * 
     * @param request DescribeCardVerifyRequest
     * @return DescribeCardVerifyResponse
     */
    public DescribeCardVerifyResponse describeCardVerify(DescribeCardVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCardVerifyWithOptions(request, runtime);
    }

    /**
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
     * @param request DescribeDeviceInfoRequest
     * @return DescribeDeviceInfoResponse
     */
    public DescribeDeviceInfoResponse describeDeviceInfo(DescribeDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeviceInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>金融级人脸保镖服务</p>
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
     * <p>金融级人脸保镖服务</p>
     * 
     * @param request DescribeFaceGuardRiskRequest
     * @return DescribeFaceGuardRiskResponse
     */
    public DescribeFaceGuardRiskResponse describeFaceGuardRisk(DescribeFaceGuardRiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFaceGuardRiskWithOptions(request, runtime);
    }

    /**
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
     * @param request DescribeFaceVerifyRequest
     * @return DescribeFaceVerifyResponse
     */
    public DescribeFaceVerifyResponse describeFaceVerify(DescribeFaceVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFaceVerifyWithOptions(request, runtime);
    }

    /**
     * @param request DescribeOssUploadTokenRequest
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
     * @return DescribeOssUploadTokenResponse
     */
    public DescribeOssUploadTokenResponse describeOssUploadToken() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOssUploadTokenWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Open API新增金融级数据统计API</p>
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
     * <p>Open API新增金融级数据统计API</p>
     * 
     * @param request DescribePageFaceVerifyDataRequest
     * @return DescribePageFaceVerifyDataResponse
     */
    public DescribePageFaceVerifyDataResponse describePageFaceVerifyData(DescribePageFaceVerifyDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePageFaceVerifyDataWithOptions(request, runtime);
    }

    /**
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
     * @param request DescribeSmartStatisticsPageListRequest
     * @return DescribeSmartStatisticsPageListResponse
     */
    public DescribeSmartStatisticsPageListResponse describeSmartStatisticsPageList(DescribeSmartStatisticsPageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSmartStatisticsPageListWithOptions(request, runtime);
    }

    /**
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
     * @param request DescribeVerifyResultRequest
     * @return DescribeVerifyResultResponse
     */
    public DescribeVerifyResultResponse describeVerifyResult(DescribeVerifyResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVerifyResultWithOptions(request, runtime);
    }

    /**
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
     * @param request DescribeVerifySDKRequest
     * @return DescribeVerifySDKResponse
     */
    public DescribeVerifySDKResponse describeVerifySDK(DescribeVerifySDKRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVerifySDKWithOptions(request, runtime);
    }

    /**
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
     * @param request DescribeVerifyTokenRequest
     * @return DescribeVerifyTokenResponse
     */
    public DescribeVerifyTokenResponse describeVerifyToken(DescribeVerifyTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVerifyTokenWithOptions(request, runtime);
    }

    /**
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
     * @param request DetectFaceAttributesRequest
     * @return DetectFaceAttributesResponse
     */
    public DetectFaceAttributesResponse detectFaceAttributes(DetectFaceAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectFaceAttributesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Two-Factor Validity Verification API</p>
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
     * <p>Two-Factor Validity Verification API</p>
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
     * <p>Identity Two-Factor Standard</p>
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
     * <p>Identity Two-Factor Standard</p>
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
     * <li>Service address: cloudauth.aliyuncs.com (IPv4) or cloudauth-dualstack.aliyuncs.com (IPv6).</li>
     * <li>Request method: POST and GET.</li>
     * <li>Transfer protocol: HTTPS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Identity Two-Factor Interface</p>
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
     * <li>Service address: cloudauth.aliyuncs.com (IPv4) or cloudauth-dualstack.aliyuncs.com (IPv6).</li>
     * <li>Request method: POST and GET.</li>
     * <li>Transfer protocol: HTTPS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Identity Two-Factor Interface</p>
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
     * <p>Upload both sides of the ID card, and get the verification result of the two factors from an authoritative data source.</p>
     * 
     * <b>summary</b> : 
     * <p>ID Two-Factor Image Verification</p>
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
     * <p>Upload both sides of the ID card, and get the verification result of the two factors from an authoritative data source.</p>
     * 
     * <b>summary</b> : 
     * <p>ID Two-Factor Image Verification</p>
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
                new TeaPair("host", "" + authResponseBody.get("Bucket") + "." + com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType) + ""),
                new TeaPair("OSSAccessKeyId", authResponseBody.get("AccessKeyId")),
                new TeaPair("policy", authResponseBody.get("EncodedPolicy")),
                new TeaPair("Signature", authResponseBody.get("Signature")),
                new TeaPair("key", authResponseBody.get("ObjectKey")),
                new TeaPair("file", fileObj),
                new TeaPair("success_action_status", "201")
            );
            this._postOSSObject(authResponseBody.get("Bucket"), ossHeader);
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
                new TeaPair("host", "" + authResponseBody.get("Bucket") + "." + com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType) + ""),
                new TeaPair("OSSAccessKeyId", authResponseBody.get("AccessKeyId")),
                new TeaPair("policy", authResponseBody.get("EncodedPolicy")),
                new TeaPair("Signature", authResponseBody.get("Signature")),
                new TeaPair("key", authResponseBody.get("ObjectKey")),
                new TeaPair("file", fileObj),
                new TeaPair("success_action_status", "201")
            );
            this._postOSSObject(authResponseBody.get("Bucket"), ossHeader);
            id2MetaVerifyWithOCRReq.certNationalFile = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        Id2MetaVerifyWithOCRResponse id2MetaVerifyWithOCRResp = this.id2MetaVerifyWithOCRWithOptions(id2MetaVerifyWithOCRReq, runtime);
        return id2MetaVerifyWithOCRResp;
    }

    /**
     * <b>description</b> :
     * <p>Before each authentication, use this interface to obtain the CertifyId, which is used to link various interfaces in the authentication request.</p>
     * 
     * <b>summary</b> : 
     * <p>Initiate an authentication request for image verification</p>
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
     * <p>Before each authentication, use this interface to obtain the CertifyId, which is used to link various interfaces in the authentication request.</p>
     * 
     * <b>summary</b> : 
     * <p>Initiate an authentication request for image verification</p>
     * 
     * @param request InitCardVerifyRequest
     * @return InitCardVerifyResponse
     */
    public InitCardVerifyResponse initCardVerify(InitCardVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initCardVerifyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实人服务端初始化接口</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.encryptType)) {
            query.put("EncryptType", request.encryptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceContrastPictureUrl)) {
            query.put("FaceContrastPictureUrl", request.faceContrastPictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceGuardOutput)) {
            query.put("FaceGuardOutput", request.faceGuardOutput);
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
     * <b>summary</b> : 
     * <p>实人服务端初始化接口</p>
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
     * <p>Add Real Person Whitelist</p>
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
     * <p>Add Real Person Whitelist</p>
     * 
     * @param request InsertWhiteListSettingRequest
     * @return InsertWhiteListSettingResponse
     */
    public InsertWhiteListSettingResponse insertWhiteListSetting(InsertWhiteListSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.insertWhiteListSettingWithOptions(request, runtime);
    }

    /**
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
     * @param request LivenessFaceVerifyRequest
     * @return LivenessFaceVerifyResponse
     */
    public LivenessFaceVerifyResponse livenessFaceVerify(LivenessFaceVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.livenessFaceVerifyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Input the phone number and name, verify their authenticity and consistency through authoritative data sources.</p>
     * 
     * <b>summary</b> : 
     * <p>Mobile Two-Factor Verification</p>
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
     * <p>Input the phone number and name, verify their authenticity and consistency through authoritative data sources.</p>
     * 
     * <b>summary</b> : 
     * <p>Mobile Two-Factor Verification</p>
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
     * <p>Input the phone number, name, and ID number to verify their authenticity and consistency through authoritative data sources. If they do not match, the reason for the mismatch is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Detailed Three-Element Verification for Phone Number_Standard Version</p>
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
     * <p>Input the phone number, name, and ID number to verify their authenticity and consistency through authoritative data sources. If they do not match, the reason for the mismatch is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Detailed Three-Element Verification for Phone Number_Standard Version</p>
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
     * <li>Service address: cloudauth.aliyuncs.com (IPv4) or cloudauth-dualstack.aliyuncs.com (IPv6).</li>
     * <li>Request method: POST and GET.</li>
     * <li>Transfer protocol: HTTPS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detailed Mobile Three-Element Verification Interface</p>
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
     * <li>Service address: cloudauth.aliyuncs.com (IPv4) or cloudauth-dualstack.aliyuncs.com (IPv6).</li>
     * <li>Request method: POST and GET.</li>
     * <li>Transfer protocol: HTTPS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Detailed Mobile Three-Element Verification Interface</p>
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
     * <p>Input the phone number, name, and ID number to verify their authenticity and consistency through authoritative data sources.</p>
     * 
     * <b>summary</b> : 
     * <p>Simplified Three-Element Verification for Phone Number_Standard Version</p>
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
     * <p>Input the phone number, name, and ID number to verify their authenticity and consistency through authoritative data sources.</p>
     * 
     * <b>summary</b> : 
     * <p>Simplified Three-Element Verification for Phone Number_Standard Version</p>
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
     * <p>Mobile Three Elements Simplified Interface</p>
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
     * <p>Mobile Three Elements Simplified Interface</p>
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
     * <p>Number Detection</p>
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
     * <p>Number Detection</p>
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
     * <p>Query the online status of a mobile number</p>
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
     * <p>Query the online status of a mobile number</p>
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
     * <p>Query the online duration of a mobile number</p>
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
     * <p>Query the online duration of a mobile number</p>
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
     * <p>Request Method: Supports sending requests using HTTPS POST and GET methods.</p>
     * 
     * <b>summary</b> : 
     * <p>Call ModifyDeviceInfo to update device-related information, such as extending the device authorization validity period, updating the business party\&quot;s custom business identifier, and device ID. Suitable for scenarios like renewing the device validity period.</p>
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
     * <p>Request Method: Supports sending requests using HTTPS POST and GET methods.</p>
     * 
     * <b>summary</b> : 
     * <p>Call ModifyDeviceInfo to update device-related information, such as extending the device authorization validity period, updating the business party\&quot;s custom business identifier, and device ID. Suitable for scenarios like renewing the device validity period.</p>
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
     * <p>Paging Query for Real Person Whitelist Configuration</p>
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
     * <p>Paging Query for Real Person Whitelist Configuration</p>
     * 
     * @param request PageQueryWhiteListSettingRequest
     * @return PageQueryWhiteListSettingResponse
     */
    public PageQueryWhiteListSettingResponse pageQueryWhiteListSetting(PageQueryWhiteListSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pageQueryWhiteListSettingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Real Person Whitelist</p>
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
     * <p>Delete Real Person Whitelist</p>
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
     * <p>Query basic vehicle information through the license plate number and vehicle type.</p>
     * 
     * <b>summary</b> : 
     * <p>Five-Item Vehicle Information Recognition</p>
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
     * <p>Query basic vehicle information through the license plate number and vehicle type.</p>
     * 
     * <b>summary</b> : 
     * <p>Five-Item Vehicle Information Recognition</p>
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
     * <p>Query the vehicle insurance date through the license plate number, vehicle type, and vehicle identification number (VIN).</p>
     * 
     * <b>summary</b> : 
     * <p>Vehicle Insurance Date Inquiry</p>
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
     * <p>Query the vehicle insurance date through the license plate number, vehicle type, and vehicle identification number (VIN).</p>
     * 
     * <b>summary</b> : 
     * <p>Vehicle Insurance Date Inquiry</p>
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
     * <p>Verifies the consistency of name, ID number, vehicle license plate, and vehicle type.</p>
     * 
     * <b>summary</b> : 
     * <p>Vehicle Element Verification</p>
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
     * <p>Verifies the consistency of name, ID number, vehicle license plate, and vehicle type.</p>
     * 
     * <b>summary</b> : 
     * <p>Vehicle Element Verification</p>
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
     * <p>Verifies the consistency of name, ID number, license plate number, and vehicle type, and supports returning detailed vehicle information.</p>
     * 
     * <b>summary</b> : 
     * <p>Enhanced Vehicle Element Verification</p>
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
     * <p>Verifies the consistency of name, ID number, license plate number, and vehicle type, and supports returning detailed vehicle information.</p>
     * 
     * <b>summary</b> : 
     * <p>Enhanced Vehicle Element Verification</p>
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
     * <p>Query detailed vehicle information through the license plate number and vehicle type.</p>
     * 
     * <b>summary</b> : 
     * <p>Vehicle Information Recognition</p>
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
     * <p>Query detailed vehicle information through the license plate number and vehicle type.</p>
     * 
     * <b>summary</b> : 
     * <p>Vehicle Information Recognition</p>
     * 
     * @param request VehicleQueryRequest
     * @return VehicleQueryResponse
     */
    public VehicleQueryResponse vehicleQuery(VehicleQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.vehicleQueryWithOptions(request, runtime);
    }

    /**
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
     * @param request VerifyMaterialRequest
     * @return VerifyMaterialResponse
     */
    public VerifyMaterialResponse verifyMaterial(VerifyMaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyMaterialWithOptions(request, runtime);
    }
}
