// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930;

import com.aliyun.tea.*;
import com.aliyun.imagerecog20190930.models.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("imagerecog", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public EvaluateCertificateQualityResponse evaluateCertificateQuality(EvaluateCertificateQualityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EvaluateCertificateQuality", "HTTPS", "POST", "2019-09-30", "AK", null, TeaModel.buildMap(request), runtime), new EvaluateCertificateQualityResponse());
    }

    public EvaluateCertificateQualityResponse evaluateCertificateQualitySimply(EvaluateCertificateQualityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.evaluateCertificateQuality(request, runtime);
    }

    public EvaluateCertificateQualityResponse evaluateCertificateQualityAdvance(EvaluateCertificateQualityAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        com.aliyun.tearpc.models.Config authConfig = com.aliyun.tearpc.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", "openplatform.aliyuncs.com"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imagerecog"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        EvaluateCertificateQualityRequest evaluateCertificateQualityReq = new EvaluateCertificateQualityRequest();
        com.aliyun.common.Common.convert(request, evaluateCertificateQualityReq);
        authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        ossConfig.accessKeyId = authResponse.accessKeyId;
        ossConfig.endpoint = com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
        ossClient = new com.aliyun.oss.Client(ossConfig);
        fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.imageURLObject),
            new TeaPair("contentType", "")
        ));
        ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        ossClient.postObject(uploadRequest, ossRuntime);
        evaluateCertificateQualityReq.imageURL = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        EvaluateCertificateQualityResponse evaluateCertificateQualityResp = this.evaluateCertificateQuality(evaluateCertificateQualityReq, runtime);
        return evaluateCertificateQualityResp;
    }

    public DetectFruitsResponse detectFruits(DetectFruitsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DetectFruits", "HTTPS", "POST", "2019-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DetectFruitsResponse());
    }

    public DetectFruitsResponse detectFruitsSimply(DetectFruitsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectFruits(request, runtime);
    }

    public DetectFruitsResponse detectFruitsAdvance(DetectFruitsAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        com.aliyun.tearpc.models.Config authConfig = com.aliyun.tearpc.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", "openplatform.aliyuncs.com"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imagerecog"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        DetectFruitsRequest detectFruitsReq = new DetectFruitsRequest();
        com.aliyun.common.Common.convert(request, detectFruitsReq);
        authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        ossConfig.accessKeyId = authResponse.accessKeyId;
        ossConfig.endpoint = com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
        ossClient = new com.aliyun.oss.Client(ossConfig);
        fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.imageURLObject),
            new TeaPair("contentType", "")
        ));
        ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        ossClient.postObject(uploadRequest, ossRuntime);
        detectFruitsReq.imageURL = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        DetectFruitsResponse detectFruitsResp = this.detectFruits(detectFruitsReq, runtime);
        return detectFruitsResp;
    }

    public ClassifyingRubbishResponse classifyingRubbish(ClassifyingRubbishRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ClassifyingRubbish", "HTTPS", "POST", "2019-09-30", "AK", null, TeaModel.buildMap(request), runtime), new ClassifyingRubbishResponse());
    }

    public ClassifyingRubbishResponse classifyingRubbishSimply(ClassifyingRubbishRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.classifyingRubbish(request, runtime);
    }

    public ClassifyingRubbishResponse classifyingRubbishAdvance(ClassifyingRubbishAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        com.aliyun.tearpc.models.Config authConfig = com.aliyun.tearpc.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", "openplatform.aliyuncs.com"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imagerecog"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        ClassifyingRubbishRequest classifyingRubbishReq = new ClassifyingRubbishRequest();
        com.aliyun.common.Common.convert(request, classifyingRubbishReq);
        authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        ossConfig.accessKeyId = authResponse.accessKeyId;
        ossConfig.endpoint = com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
        ossClient = new com.aliyun.oss.Client(ossConfig);
        fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.imageURLObject),
            new TeaPair("contentType", "")
        ));
        ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        ossClient.postObject(uploadRequest, ossRuntime);
        classifyingRubbishReq.imageURL = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        ClassifyingRubbishResponse classifyingRubbishResp = this.classifyingRubbish(classifyingRubbishReq, runtime);
        return classifyingRubbishResp;
    }

    public RecognizeVehicleTypeResponse recognizeVehicleType(RecognizeVehicleTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RecognizeVehicleType", "HTTPS", "POST", "2019-09-30", "AK", null, TeaModel.buildMap(request), runtime), new RecognizeVehicleTypeResponse());
    }

    public RecognizeVehicleTypeResponse recognizeVehicleTypeSimply(RecognizeVehicleTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeVehicleType(request, runtime);
    }

    public RecognizeVehicleTypeResponse recognizeVehicleTypeAdvance(RecognizeVehicleTypeAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        com.aliyun.tearpc.models.Config authConfig = com.aliyun.tearpc.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", "openplatform.aliyuncs.com"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imagerecog"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        RecognizeVehicleTypeRequest recognizeVehicleTypeReq = new RecognizeVehicleTypeRequest();
        com.aliyun.common.Common.convert(request, recognizeVehicleTypeReq);
        authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        ossConfig.accessKeyId = authResponse.accessKeyId;
        ossConfig.endpoint = com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
        ossClient = new com.aliyun.oss.Client(ossConfig);
        fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.imageURLObject),
            new TeaPair("contentType", "")
        ));
        ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        ossClient.postObject(uploadRequest, ossRuntime);
        recognizeVehicleTypeReq.imageURL = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        RecognizeVehicleTypeResponse recognizeVehicleTypeResp = this.recognizeVehicleType(recognizeVehicleTypeReq, runtime);
        return recognizeVehicleTypeResp;
    }

    public RecognizeLogoResponse recognizeLogo(RecognizeLogoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RecognizeLogo", "HTTPS", "POST", "2019-09-30", "AK", null, TeaModel.buildMap(request), runtime), new RecognizeLogoResponse());
    }

    public RecognizeLogoResponse recognizeLogoSimply(RecognizeLogoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeLogo(request, runtime);
    }

    public TaggingImageResponse taggingImage(TaggingImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TaggingImage", "HTTPS", "POST", "2019-09-30", "AK", null, TeaModel.buildMap(request), runtime), new TaggingImageResponse());
    }

    public TaggingImageResponse taggingImageSimply(TaggingImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.taggingImage(request, runtime);
    }

    public TaggingImageResponse taggingImageAdvance(TaggingImageAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        com.aliyun.tearpc.models.Config authConfig = com.aliyun.tearpc.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", "openplatform.aliyuncs.com"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imagerecog"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        TaggingImageRequest taggingImageReq = new TaggingImageRequest();
        com.aliyun.common.Common.convert(request, taggingImageReq);
        authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        ossConfig.accessKeyId = authResponse.accessKeyId;
        ossConfig.endpoint = com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
        ossClient = new com.aliyun.oss.Client(ossConfig);
        fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.imageURLObject),
            new TeaPair("contentType", "")
        ));
        ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        ossClient.postObject(uploadRequest, ossRuntime);
        taggingImageReq.imageURL = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        TaggingImageResponse taggingImageResp = this.taggingImage(taggingImageReq, runtime);
        return taggingImageResp;
    }

    public RecognizeSceneResponse recognizeScene(RecognizeSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RecognizeScene", "HTTPS", "POST", "2019-09-30", "AK", null, TeaModel.buildMap(request), runtime), new RecognizeSceneResponse());
    }

    public RecognizeSceneResponse recognizeSceneSimply(RecognizeSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeScene(request, runtime);
    }

    public RecognizeSceneResponse recognizeSceneAdvance(RecognizeSceneAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        com.aliyun.tearpc.models.Config authConfig = com.aliyun.tearpc.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", "openplatform.aliyuncs.com"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imagerecog"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        RecognizeSceneRequest recognizeSceneReq = new RecognizeSceneRequest();
        com.aliyun.common.Common.convert(request, recognizeSceneReq);
        authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        ossConfig.accessKeyId = authResponse.accessKeyId;
        ossConfig.endpoint = com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
        ossClient = new com.aliyun.oss.Client(ossConfig);
        fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.imageURLObject),
            new TeaPair("contentType", "")
        ));
        ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        ossClient.postObject(uploadRequest, ossRuntime);
        recognizeSceneReq.imageURL = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        RecognizeSceneResponse recognizeSceneResp = this.recognizeScene(recognizeSceneReq, runtime);
        return recognizeSceneResp;
    }

    public RecognizeImageColorResponse recognizeImageColor(RecognizeImageColorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RecognizeImageColor", "HTTPS", "POST", "2019-09-30", "AK", null, TeaModel.buildMap(request), runtime), new RecognizeImageColorResponse());
    }

    public RecognizeImageColorResponse recognizeImageColorSimply(RecognizeImageColorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeImageColor(request, runtime);
    }

    public RecognizeImageColorResponse recognizeImageColorAdvance(RecognizeImageColorAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        com.aliyun.tearpc.models.Config authConfig = com.aliyun.tearpc.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", "openplatform.aliyuncs.com"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imagerecog"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        RecognizeImageColorRequest recognizeImageColorReq = new RecognizeImageColorRequest();
        com.aliyun.common.Common.convert(request, recognizeImageColorReq);
        authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        ossConfig.accessKeyId = authResponse.accessKeyId;
        ossConfig.endpoint = com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
        ossClient = new com.aliyun.oss.Client(ossConfig);
        fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.urlObject),
            new TeaPair("contentType", "")
        ));
        ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        ossClient.postObject(uploadRequest, ossRuntime);
        recognizeImageColorReq.url = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        RecognizeImageColorResponse recognizeImageColorResp = this.recognizeImageColor(recognizeImageColorReq, runtime);
        return recognizeImageColorResp;
    }

    public DetectImageElementsResponse detectImageElements(DetectImageElementsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DetectImageElements", "HTTPS", "POST", "2019-09-30", "AK", null, TeaModel.buildMap(request), runtime), new DetectImageElementsResponse());
    }

    public DetectImageElementsResponse detectImageElementsSimply(DetectImageElementsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectImageElements(request, runtime);
    }

    public DetectImageElementsResponse detectImageElementsAdvance(DetectImageElementsAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        com.aliyun.tearpc.models.Config authConfig = com.aliyun.tearpc.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", "openplatform.aliyuncs.com"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imagerecog"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        DetectImageElementsRequest detectImageElementsReq = new DetectImageElementsRequest();
        com.aliyun.common.Common.convert(request, detectImageElementsReq);
        authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        ossConfig.accessKeyId = authResponse.accessKeyId;
        ossConfig.endpoint = com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
        ossClient = new com.aliyun.oss.Client(ossConfig);
        fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.urlObject),
            new TeaPair("contentType", "")
        ));
        ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        ossClient.postObject(uploadRequest, ossRuntime);
        detectImageElementsReq.url = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        DetectImageElementsResponse detectImageElementsResp = this.detectImageElements(detectImageElementsReq, runtime);
        return detectImageElementsResp;
    }

    public RecognizeImageStyleResponse recognizeImageStyle(RecognizeImageStyleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RecognizeImageStyle", "HTTPS", "POST", "2019-09-30", "AK", null, TeaModel.buildMap(request), runtime), new RecognizeImageStyleResponse());
    }

    public RecognizeImageStyleResponse recognizeImageStyleSimply(RecognizeImageStyleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeImageStyle(request, runtime);
    }

    public RecognizeImageStyleResponse recognizeImageStyleAdvance(RecognizeImageStyleAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        com.aliyun.tearpc.models.Config authConfig = com.aliyun.tearpc.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", "openplatform.aliyuncs.com"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imagerecog"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        RecognizeImageStyleRequest recognizeImageStyleReq = new RecognizeImageStyleRequest();
        com.aliyun.common.Common.convert(request, recognizeImageStyleReq);
        authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        ossConfig.accessKeyId = authResponse.accessKeyId;
        ossConfig.endpoint = com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
        ossClient = new com.aliyun.oss.Client(ossConfig);
        fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.urlObject),
            new TeaPair("contentType", "")
        ));
        ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        ossClient.postObject(uploadRequest, ossRuntime);
        recognizeImageStyleReq.url = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        RecognizeImageStyleResponse recognizeImageStyleResp = this.recognizeImageStyle(recognizeImageStyleReq, runtime);
        return recognizeImageStyleResp;
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
}
