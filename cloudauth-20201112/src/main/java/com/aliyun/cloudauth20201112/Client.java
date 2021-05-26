// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20201112;

import com.aliyun.tea.*;
import com.aliyun.cloudauth20201112.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.common.*;
import com.aliyun.tearpc.*;
import com.aliyun.tearpc.models.*;
import com.aliyun.endpointutil.*;
import com.aliyun.oss.*;
import com.aliyun.oss.models.*;
import com.aliyun.openplatform20191219.*;
import com.aliyun.openplatform20191219.models.*;
import com.aliyun.ossutil.*;
import com.aliyun.ossutil.models.*;
import com.aliyun.fileform.*;
import com.aliyun.fileform.models.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cloudauth", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public DetectFaceAttributesResponse detectFaceAttributes(DetectFaceAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DetectFaceAttributes", "HTTPS", "POST", "2020-11-12", "AK", null, TeaModel.buildMap(request), runtime), new DetectFaceAttributesResponse());
    }

    public DetectFaceAttributesResponse detectFaceAttributesSimply(DetectFaceAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectFaceAttributes(request, runtime);
    }

    public DetectFaceAttributesResponse detectFaceAttributesAdvance(DetectFaceAttributesAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String openPlatformEndpoint = _openPlatformEndpoint;
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        if (com.aliyun.teautil.Common.isUnset(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.tearpc.models.Config authConfig = com.aliyun.tearpc.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        AuthorizeFileUploadRequest authRequest = AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "Cloudauth"),
            new TeaPair("regionId", _regionId)
        ));
        AuthorizeFileUploadResponse authResponse = new AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
        FileField fileObj = new FileField();
        PostObjectRequest.PostObjectRequestHeader ossHeader = new PostObjectRequest.PostObjectRequestHeader();
        PostObjectRequest uploadRequest = new PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        DetectFaceAttributesRequest detectFaceAttributesReq = new DetectFaceAttributesRequest();
        com.aliyun.common.Common.convert(request, detectFaceAttributesReq);
        if (!com.aliyun.teautil.Common.isUnset(request.imageFileObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.accessKeyId;
            ossConfig.endpoint = com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.objectKey),
                new TeaPair("content", request.imageFileObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                new TeaPair("accessKeyId", authResponse.accessKeyId),
                new TeaPair("policy", authResponse.encodedPolicy),
                new TeaPair("signature", authResponse.signature),
                new TeaPair("key", authResponse.objectKey),
                new TeaPair("file", fileObj),
                new TeaPair("successActionStatus", "201")
            ));
            uploadRequest = PostObjectRequest.build(TeaConverter.buildMap(
                new TeaPair("bucketName", authResponse.bucket),
                new TeaPair("header", ossHeader)
            ));
            ossClient.postObject(uploadRequest, ossRuntime);
            detectFaceAttributesReq.imageFile = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        }

        DetectFaceAttributesResponse detectFaceAttributesResp = this.detectFaceAttributes(detectFaceAttributesReq, runtime);
        return detectFaceAttributesResp;
    }

    public DescribeVerifyResultResponse describeVerifyResult(DescribeVerifyResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVerifyResult", "HTTPS", "POST", "2020-11-12", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVerifyResultResponse());
    }

    public DescribeVerifyResultResponse describeVerifyResultSimply(DescribeVerifyResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVerifyResult(request, runtime);
    }

    public VerifyMaterialResponse verifyMaterial(VerifyMaterialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("VerifyMaterial", "HTTPS", "POST", "2020-11-12", "AK", null, TeaModel.buildMap(request), runtime), new VerifyMaterialResponse());
    }

    public VerifyMaterialResponse verifyMaterialSimply(VerifyMaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyMaterial(request, runtime);
    }

    public DescribeVerifyTokenResponse describeVerifyToken(DescribeVerifyTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVerifyToken", "HTTPS", "POST", "2020-11-12", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVerifyTokenResponse());
    }

    public DescribeVerifyTokenResponse describeVerifyTokenSimply(DescribeVerifyTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVerifyToken(request, runtime);
    }

    public CompareFacesResponse compareFaces(CompareFacesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CompareFaces", "HTTPS", "POST", "2020-11-12", "AK", null, TeaModel.buildMap(request), runtime), new CompareFacesResponse());
    }

    public CompareFacesResponse compareFacesSimply(CompareFacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.compareFaces(request, runtime);
    }

    public LivenessDetectResponse livenessDetect(LivenessDetectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("LivenessDetect", "HTTPS", "POST", "2020-11-12", "AK", null, TeaModel.buildMap(request), runtime), new LivenessDetectResponse());
    }

    public LivenessDetectResponse livenessDetectSimply(LivenessDetectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.livenessDetect(request, runtime);
    }

    public LivenessDetectResponse livenessDetectAdvance(LivenessDetectAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String openPlatformEndpoint = _openPlatformEndpoint;
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        if (com.aliyun.teautil.Common.isUnset(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.tearpc.models.Config authConfig = com.aliyun.tearpc.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        AuthorizeFileUploadRequest authRequest = AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "Cloudauth"),
            new TeaPair("regionId", _regionId)
        ));
        AuthorizeFileUploadResponse authResponse = new AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
        FileField fileObj = new FileField();
        PostObjectRequest.PostObjectRequestHeader ossHeader = new PostObjectRequest.PostObjectRequestHeader();
        PostObjectRequest uploadRequest = new PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        LivenessDetectRequest livenessDetectReq = new LivenessDetectRequest();
        com.aliyun.common.Common.convert(request, livenessDetectReq);
        if (!com.aliyun.teautil.Common.isUnset(request.mediaFileObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.accessKeyId;
            ossConfig.endpoint = com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.objectKey),
                new TeaPair("content", request.mediaFileObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                new TeaPair("accessKeyId", authResponse.accessKeyId),
                new TeaPair("policy", authResponse.encodedPolicy),
                new TeaPair("signature", authResponse.signature),
                new TeaPair("key", authResponse.objectKey),
                new TeaPair("file", fileObj),
                new TeaPair("successActionStatus", "201")
            ));
            uploadRequest = PostObjectRequest.build(TeaConverter.buildMap(
                new TeaPair("bucketName", authResponse.bucket),
                new TeaPair("header", ossHeader)
            ));
            ossClient.postObject(uploadRequest, ossRuntime);
            livenessDetectReq.mediaFile = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        }

        LivenessDetectResponse livenessDetectResp = this.livenessDetect(livenessDetectReq, runtime);
        return livenessDetectResp;
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
