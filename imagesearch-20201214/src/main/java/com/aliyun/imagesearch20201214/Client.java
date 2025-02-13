// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214;

import com.aliyun.tea.*;
import com.aliyun.imagesearch20201214.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("imagesearch", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>description</b> :
     * <p>You can call this operation to add an image to an Image Search instance.</p>
     * <blockquote>
     * <p>If you want to obtain more information about the service and technical support, click <a href="https://www.aliyun.com/core/online-consult?from=aZgW6LJHr2">Online Consulting</a> or join the DingTalk group (ID 35035130).</p>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>By default, the concurrency limit for adding an image to instances whose image capacity specifications are 0.1 million images is 1. This means that the system can process up to one request of adding an image every second. By default, the concurrency limit for adding an image to instances of other image capacity specifications is 5. This means that the system can process up to five requests of adding an image every second.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds an image to an Image Search instance.</p>
     * 
     * @param request AddImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddImageResponse
     */
    public AddImageResponse addImageWithOptions(AddImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            body.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crop)) {
            body.put("Crop", request.crop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customContent)) {
            body.put("CustomContent", request.customContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intAttr)) {
            body.put("IntAttr", request.intAttr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intAttr2)) {
            body.put("IntAttr2", request.intAttr2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intAttr3)) {
            body.put("IntAttr3", request.intAttr3);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intAttr4)) {
            body.put("IntAttr4", request.intAttr4);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picContent)) {
            body.put("PicContent", request.picContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picName)) {
            body.put("PicName", request.picName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strAttr)) {
            body.put("StrAttr", request.strAttr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strAttr2)) {
            body.put("StrAttr2", request.strAttr2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strAttr3)) {
            body.put("StrAttr3", request.strAttr3);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strAttr4)) {
            body.put("StrAttr4", request.strAttr4);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddImage"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AddImageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AddImageResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to add an image to an Image Search instance.</p>
     * <blockquote>
     * <p>If you want to obtain more information about the service and technical support, click <a href="https://www.aliyun.com/core/online-consult?from=aZgW6LJHr2">Online Consulting</a> or join the DingTalk group (ID 35035130).</p>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>By default, the concurrency limit for adding an image to instances whose image capacity specifications are 0.1 million images is 1. This means that the system can process up to one request of adding an image every second. By default, the concurrency limit for adding an image to instances of other image capacity specifications is 5. This means that the system can process up to five requests of adding an image every second.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds an image to an Image Search instance.</p>
     * 
     * @param request AddImageRequest
     * @return AddImageResponse
     */
    public AddImageResponse addImage(AddImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addImageWithOptions(request, runtime);
    }

    public AddImageResponse addImageAdvance(AddImageAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("product", "ImageSearch"),
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
        AddImageRequest addImageReq = new AddImageRequest();
        com.aliyun.openapiutil.Client.convert(request, addImageReq);
        if (!com.aliyun.teautil.Common.isUnset(request.picContentObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.body.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.body.objectKey),
                new TeaPair("content", request.picContentObject),
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
            addImageReq.picContent = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        AddImageResponse addImageResp = this.addImageWithOptions(addImageReq, runtime);
        return addImageResp;
    }

    /**
     * <b>summary</b> : 
     * <p>对比图片相似值</p>
     * 
     * @param request CompareSimilarByImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CompareSimilarByImageResponse
     */
    public CompareSimilarByImageResponse compareSimilarByImageWithOptions(CompareSimilarByImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryPicContent)) {
            body.put("PrimaryPicContent", request.primaryPicContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryPicContent)) {
            body.put("SecondaryPicContent", request.secondaryPicContent);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompareSimilarByImage"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CompareSimilarByImageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CompareSimilarByImageResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>对比图片相似值</p>
     * 
     * @param request CompareSimilarByImageRequest
     * @return CompareSimilarByImageResponse
     */
    public CompareSimilarByImageResponse compareSimilarByImage(CompareSimilarByImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.compareSimilarByImageWithOptions(request, runtime);
    }

    public CompareSimilarByImageResponse compareSimilarByImageAdvance(CompareSimilarByImageAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("product", "ImageSearch"),
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
        CompareSimilarByImageRequest compareSimilarByImageReq = new CompareSimilarByImageRequest();
        com.aliyun.openapiutil.Client.convert(request, compareSimilarByImageReq);
        if (!com.aliyun.teautil.Common.isUnset(request.primaryPicContentObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.body.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.body.objectKey),
                new TeaPair("content", request.primaryPicContentObject),
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
            compareSimilarByImageReq.primaryPicContent = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryPicContentObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.body.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.body.objectKey),
                new TeaPair("content", request.secondaryPicContentObject),
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
            compareSimilarByImageReq.secondaryPicContent = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        CompareSimilarByImageResponse compareSimilarByImageResp = this.compareSimilarByImageWithOptions(compareSimilarByImageReq, runtime);
        return compareSimilarByImageResp;
    }

    /**
     * <b>description</b> :
     * <p>This operation deletes images from an Image Search instance.</p>
     * <blockquote>
     * <p> A success response is returned even if the specified image does not exist on the instance. Therefore, you cannot determine whether the image exists on the instance based on the response.</p>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 20. In this case, the system can process at most 20 requests every second.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax of the DeleteImage operation and provides examples of this operation. You can call this operation to delete images from an Image Search instance.</p>
     * 
     * @param request DeleteImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteImageResponse
     */
    public DeleteImageResponse deleteImageWithOptions(DeleteImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            body.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDeleteByFilter)) {
            body.put("IsDeleteByFilter", request.isDeleteByFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picName)) {
            body.put("PicName", request.picName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteImage"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteImageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteImageResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>This operation deletes images from an Image Search instance.</p>
     * <blockquote>
     * <p> A success response is returned even if the specified image does not exist on the instance. Therefore, you cannot determine whether the image exists on the instance based on the response.</p>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 20. In this case, the system can process at most 20 requests every second.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax of the DeleteImage operation and provides examples of this operation. You can call this operation to delete images from an Image Search instance.</p>
     * 
     * @param request DeleteImageRequest
     * @return DeleteImageResponse
     */
    public DeleteImageResponse deleteImage(DeleteImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteImageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation queries instance details.</p>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 1. In this case, the system can process only 1 request every second.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax of the Detail operation and provides examples of this operation. You can call this operation to query instance details.</p>
     * 
     * @param request DetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetailResponse
     */
    public DetailResponse detailWithOptions(DetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Detail"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DetailResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DetailResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>This operation queries instance details.</p>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 1. In this case, the system can process only 1 request every second.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax of the Detail operation and provides examples of this operation. You can call this operation to query instance details.</p>
     * 
     * @param request DetailRequest
     * @return DetailResponse
     */
    public DetailResponse detail(DetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation creates a task for exporting metadata from an Image Search instance.</p>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 1. In this case, the system can process at most 1 request every second.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax of the DumpMeta operation and provides examples of this operation. You can call this operation to create a task for exporting metadata from an Image Search instance.</p>
     * 
     * @param request DumpMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DumpMetaResponse
     */
    public DumpMetaResponse dumpMetaWithOptions(DumpMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DumpMeta"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DumpMetaResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DumpMetaResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>This operation creates a task for exporting metadata from an Image Search instance.</p>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 1. In this case, the system can process at most 1 request every second.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax of the DumpMeta operation and provides examples of this operation. You can call this operation to create a task for exporting metadata from an Image Search instance.</p>
     * 
     * @param request DumpMetaRequest
     * @return DumpMetaResponse
     */
    public DumpMetaResponse dumpMeta(DumpMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dumpMetaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation queries tasks that are used for exporting metadata from an Image Search instance.</p>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 1. In this case, the system can process at most 1 request every second.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax of the DumpMetaList operation and provides examples of this operation. You can call this operation to query tasks that are used for exporting metadata from an Image Search instance.</p>
     * 
     * @param request DumpMetaListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DumpMetaListResponse
     */
    public DumpMetaListResponse dumpMetaListWithOptions(DumpMetaListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DumpMetaList"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DumpMetaListResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DumpMetaListResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>This operation queries tasks that are used for exporting metadata from an Image Search instance.</p>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 1. In this case, the system can process at most 1 request every second.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax of the DumpMetaList operation and provides examples of this operation. You can call this operation to query tasks that are used for exporting metadata from an Image Search instance.</p>
     * 
     * @param request DumpMetaListRequest
     * @return DumpMetaListResponse
     */
    public DumpMetaListResponse dumpMetaList(DumpMetaListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dumpMetaListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation creates a batch task on an Image Search instance.</p>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 1. In this case, the system can process at most 1 request every second.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax of the IncreaseInstance operation and provides examples of this operation. You can call this operation to create a batch task on an Image Search instance.</p>
     * 
     * @param request IncreaseInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return IncreaseInstanceResponse
     */
    public IncreaseInstanceResponse increaseInstanceWithOptions(IncreaseInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackAddress)) {
            query.put("CallbackAddress", request.callbackAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IncreaseInstance"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new IncreaseInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new IncreaseInstanceResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>This operation creates a batch task on an Image Search instance.</p>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 1. In this case, the system can process at most 1 request every second.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax of the IncreaseInstance operation and provides examples of this operation. You can call this operation to create a batch task on an Image Search instance.</p>
     * 
     * @param request IncreaseInstanceRequest
     * @return IncreaseInstanceResponse
     */
    public IncreaseInstanceResponse increaseInstance(IncreaseInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.increaseInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation queries batch tasks on an Image Search instance.</p>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 1. In this case, the system can process at most 1 request every second.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax of the IncreaseList operation and provides examples of this operation. You can call this operation to query batch tasks on an Image Search instance.</p>
     * 
     * @param request IncreaseListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return IncreaseListResponse
     */
    public IncreaseListResponse increaseListWithOptions(IncreaseListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IncreaseList"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new IncreaseListResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new IncreaseListResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>This operation queries batch tasks on an Image Search instance.</p>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 1. In this case, the system can process at most 1 request every second.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax of the IncreaseList operation and provides examples of this operation. You can call this operation to query batch tasks on an Image Search instance.</p>
     * 
     * @param request IncreaseListRequest
     * @return IncreaseListResponse
     */
    public IncreaseListResponse increaseList(IncreaseListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.increaseListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation searches for images by image name on an Image Search instance.</p>
     * <h2>QPS limits</h2>
     * <p>The maximum number of queries per second is displayed in the Image Search console. The upper limit is specified when you purchase the instance. You can set the upper limit to 5 QPS or 10 QPS.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax of the SearchByName operation and provides examples of this operation. You can call this operation to search for images by image name on an Image Search instance.</p>
     * 
     * @param request SearchImageByNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchImageByNameResponse
     */
    public SearchImageByNameResponse searchImageByNameWithOptions(SearchImageByNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            body.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distinctProductId)) {
            body.put("DistinctProductId", request.distinctProductId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            body.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            body.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picName)) {
            body.put("PicName", request.picName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            body.put("Start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchImageByName"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SearchImageByNameResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SearchImageByNameResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>This operation searches for images by image name on an Image Search instance.</p>
     * <h2>QPS limits</h2>
     * <p>The maximum number of queries per second is displayed in the Image Search console. The upper limit is specified when you purchase the instance. You can set the upper limit to 5 QPS or 10 QPS.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax of the SearchByName operation and provides examples of this operation. You can call this operation to search for images by image name on an Image Search instance.</p>
     * 
     * @param request SearchImageByNameRequest
     * @return SearchImageByNameResponse
     */
    public SearchImageByNameResponse searchImageByName(SearchImageByNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchImageByNameWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation searches for images by image name on an Image Search instance.</p>
     * <h2>QPS limits</h2>
     * <p>The maximum number of queries per second is displayed in the Image Search console. The upper limit is specified when you purchase the instance. You can set the upper limit to 5 QPS or 10 QPS.  </p>
     * <h2>SDK release notes</h2>
     * <p>The Image Search SDK has been upgraded to version 3.1.1, which supports multi-subject recognition and similarity scores. For more information, see <a href="/help/en/image-search/latest/version-v3-java-sdk">Image Search SDK for Java</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax of the SearchByPic operation and provides examples of this operation. You can call this operation to search for images by image on an Image Search Instance.</p>
     * 
     * @param request SearchImageByPicRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchImageByPicResponse
     */
    public SearchImageByPicResponse searchImageByPicWithOptions(SearchImageByPicRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            body.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crop)) {
            body.put("Crop", request.crop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distinctProductId)) {
            body.put("DistinctProductId", request.distinctProductId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            body.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            body.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picContent)) {
            body.put("PicContent", request.picContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            body.put("Start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchImageByPic"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SearchImageByPicResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SearchImageByPicResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>This operation searches for images by image name on an Image Search instance.</p>
     * <h2>QPS limits</h2>
     * <p>The maximum number of queries per second is displayed in the Image Search console. The upper limit is specified when you purchase the instance. You can set the upper limit to 5 QPS or 10 QPS.  </p>
     * <h2>SDK release notes</h2>
     * <p>The Image Search SDK has been upgraded to version 3.1.1, which supports multi-subject recognition and similarity scores. For more information, see <a href="/help/en/image-search/latest/version-v3-java-sdk">Image Search SDK for Java</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax of the SearchByPic operation and provides examples of this operation. You can call this operation to search for images by image on an Image Search Instance.</p>
     * 
     * @param request SearchImageByPicRequest
     * @return SearchImageByPicResponse
     */
    public SearchImageByPicResponse searchImageByPic(SearchImageByPicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchImageByPicWithOptions(request, runtime);
    }

    public SearchImageByPicResponse searchImageByPicAdvance(SearchImageByPicAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("product", "ImageSearch"),
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
        SearchImageByPicRequest searchImageByPicReq = new SearchImageByPicRequest();
        com.aliyun.openapiutil.Client.convert(request, searchImageByPicReq);
        if (!com.aliyun.teautil.Common.isUnset(request.picContentObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.body.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.body.objectKey),
                new TeaPair("content", request.picContentObject),
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
            searchImageByPicReq.picContent = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        SearchImageByPicResponse searchImageByPicResp = this.searchImageByPicWithOptions(searchImageByPicReq, runtime);
        return searchImageByPicResp;
    }

    /**
     * <b>description</b> :
     * <p>This operation updates image information on an Image Search instance.</p>
     * <blockquote>
     * <ul>
     * <li>Limits are imposed on the instance creation time.</li>
     * <li>This operation is supported by instances that are created in the Singapore (Singapore) region after December 2021. This operation is not supported in other regions.</li>
     * </ul>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 20. In this case, the system can process at most 20 requests every second.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax of the UpdateImage operation and provides examples of this operation. You can call this operation to update image information on an Image Search instance.</p>
     * 
     * @param request UpdateImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateImageResponse
     */
    public UpdateImageResponse updateImageWithOptions(UpdateImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.intAttr3)) {
            query.put("IntAttr3", request.intAttr3);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intAttr4)) {
            query.put("IntAttr4", request.intAttr4);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strAttr3)) {
            query.put("StrAttr3", request.strAttr3);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strAttr4)) {
            query.put("StrAttr4", request.strAttr4);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customContent)) {
            body.put("CustomContent", request.customContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intAttr)) {
            body.put("IntAttr", request.intAttr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intAttr2)) {
            body.put("IntAttr2", request.intAttr2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picName)) {
            body.put("PicName", request.picName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strAttr)) {
            body.put("StrAttr", request.strAttr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strAttr2)) {
            body.put("StrAttr2", request.strAttr2);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateImage"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateImageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateImageResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>This operation updates image information on an Image Search instance.</p>
     * <blockquote>
     * <ul>
     * <li>Limits are imposed on the instance creation time.</li>
     * <li>This operation is supported by instances that are created in the Singapore (Singapore) region after December 2021. This operation is not supported in other regions.</li>
     * </ul>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>By default, the maximum number of queries supported by this operation is 20. In this case, the system can process at most 20 requests every second.</p>
     * 
     * <b>summary</b> : 
     * <p>This topic describes the syntax of the UpdateImage operation and provides examples of this operation. You can call this operation to update image information on an Image Search instance.</p>
     * 
     * @param request UpdateImageRequest
     * @return UpdateImageResponse
     */
    public UpdateImageResponse updateImage(UpdateImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateImageWithOptions(request, runtime);
    }
}
