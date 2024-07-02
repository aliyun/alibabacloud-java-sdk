// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307;

import com.aliyun.tea.*;
import com.aliyun.cloudauth20190307.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cloudauth", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>新增AIGC人脸检测能力</p>
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
     * <p>新增AIGC人脸检测能力</p>
     * 
     * @param request AIGCFaceVerifyRequest
     * @return AIGCFaceVerifyResponse
     */
    public AIGCFaceVerifyResponse aIGCFaceVerify(AIGCFaceVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.aIGCFaceVerifyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>银行卡要素核验接口</p>
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
     * <b>summary</b> : 
     * <p>银行卡要素核验接口</p>
     * 
     * @param request BankMetaVerifyRequest
     * @return BankMetaVerifyResponse
     */
    public BankMetaVerifyResponse bankMetaVerify(BankMetaVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bankMetaVerifyWithOptions(request, runtime);
    }

    /**
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
     * @param request CompareFaceVerifyRequest
     * @return CompareFaceVerifyResponse
     */
    public CompareFaceVerifyResponse compareFaceVerify(CompareFaceVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.compareFaceVerifyWithOptions(request, runtime);
    }

    /**
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
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
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
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "Cloudauth"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        ContrastFaceVerifyRequest contrastFaceVerifyReq = new ContrastFaceVerifyRequest();
        com.aliyun.openapiutil.Client.convert(request, contrastFaceVerifyReq);
        if (!com.aliyun.teautil.Common.isUnset(request.faceContrastFileObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.body.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.body.objectKey),
                new TeaPair("content", request.faceContrastFileObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                new TeaPair("policy", authResponse.body.encodedPolicy),
                new TeaPair("signature", authResponse.body.signature),
                new TeaPair("key", authResponse.body.objectKey),
                new TeaPair("file", fileObj),
                new TeaPair("successActionStatus", "201")
            ));
            uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                new TeaPair("bucketName", authResponse.body.bucket),
                new TeaPair("header", ossHeader)
            ));
            ossClient.postObject(uploadRequest, ossRuntime);
            contrastFaceVerifyReq.faceContrastFile = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
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
     * <b>summary</b> : 
     * <p>凭证核验</p>
     * 
     * @param request CredentialVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CredentialVerifyResponse
     */
    public CredentialVerifyResponse credentialVerifyWithOptions(CredentialVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(request.merchantId)) {
            query.put("MerchantId", request.merchantId);
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
     * <b>summary</b> : 
     * <p>人脸凭证核验服务</p>
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
     * <b>summary</b> : 
     * <p>人脸凭证核验服务</p>
     * 
     * @param request DeepfakeDetectRequest
     * @return DeepfakeDetectResponse
     */
    public DeepfakeDetectResponse deepfakeDetect(DeepfakeDetectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deepfakeDetectWithOptions(request, runtime);
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
     * <p>身份二要素接口</p>
     * 
     * @param request Id2MetaVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return Id2MetaVerifyResponse
     */
    public Id2MetaVerifyResponse id2MetaVerifyWithOptions(Id2MetaVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
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
     * <b>summary</b> : 
     * <p>身份二要素接口</p>
     * 
     * @param request Id2MetaVerifyRequest
     * @return Id2MetaVerifyResponse
     */
    public Id2MetaVerifyResponse id2MetaVerify(Id2MetaVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.id2MetaVerifyWithOptions(request, runtime);
    }

    /**
     * @param request InitFaceVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitFaceVerifyResponse
     */
    public InitFaceVerifyResponse initFaceVerifyWithOptions(InitFaceVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.birthday)) {
            query.put("Birthday", request.birthday);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackToken)) {
            query.put("CallbackToken", request.callbackToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackUrl)) {
            query.put("CallbackUrl", request.callbackUrl);
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
     * @param request InitFaceVerifyRequest
     * @return InitFaceVerifyResponse
     */
    public InitFaceVerifyResponse initFaceVerify(InitFaceVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initFaceVerifyWithOptions(request, runtime);
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
     * <b>summary</b> : 
     * <p>手机三要素详版接口</p>
     * 
     * @param request Mobile3MetaDetailVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return Mobile3MetaDetailVerifyResponse
     */
    public Mobile3MetaDetailVerifyResponse mobile3MetaDetailVerifyWithOptions(Mobile3MetaDetailVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifyNum)) {
            query.put("IdentifyNum", request.identifyNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            query.put("ParamType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
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
     * <b>summary</b> : 
     * <p>手机三要素详版接口</p>
     * 
     * @param request Mobile3MetaDetailVerifyRequest
     * @return Mobile3MetaDetailVerifyResponse
     */
    public Mobile3MetaDetailVerifyResponse mobile3MetaDetailVerify(Mobile3MetaDetailVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.mobile3MetaDetailVerifyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>手机号三要素简版接口</p>
     * 
     * @param request Mobile3MetaSimpleVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return Mobile3MetaSimpleVerifyResponse
     */
    public Mobile3MetaSimpleVerifyResponse mobile3MetaSimpleVerifyWithOptions(Mobile3MetaSimpleVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifyNum)) {
            query.put("IdentifyNum", request.identifyNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            query.put("ParamType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
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
     * <b>summary</b> : 
     * <p>手机号三要素简版接口</p>
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
     * <p>号码检测</p>
     * 
     * @param request MobileDetectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MobileDetectResponse
     */
    public MobileDetectResponse mobileDetectWithOptions(MobileDetectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mobiles)) {
            query.put("Mobiles", request.mobiles);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            query.put("ParamType", request.paramType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
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
     * <p>号码检测</p>
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
     * <p>查询手机号在网状态</p>
     * 
     * @param request MobileOnlineStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MobileOnlineStatusResponse
     */
    public MobileOnlineStatusResponse mobileOnlineStatusWithOptions(MobileOnlineStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            query.put("ParamType", request.paramType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
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
     * <p>查询手机号在网状态</p>
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
     * <p>查询手机号在网时长</p>
     * 
     * @param request MobileOnlineTimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MobileOnlineTimeResponse
     */
    public MobileOnlineTimeResponse mobileOnlineTimeWithOptions(MobileOnlineTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            query.put("ParamType", request.paramType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
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
     * <p>查询手机号在网时长</p>
     * 
     * @param request MobileOnlineTimeRequest
     * @return MobileOnlineTimeResponse
     */
    public MobileOnlineTimeResponse mobileOnlineTime(MobileOnlineTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.mobileOnlineTimeWithOptions(request, runtime);
    }

    /**
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
     * @param request ModifyDeviceInfoRequest
     * @return ModifyDeviceInfoResponse
     */
    public ModifyDeviceInfoResponse modifyDeviceInfo(ModifyDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDeviceInfoWithOptions(request, runtime);
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
