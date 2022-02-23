// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307;

import com.aliyun.tea.*;
import com.aliyun.cloudauth20190307.models.*;
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


    public CompareFaceVerifyResponse compareFaceVerify(CompareFaceVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CompareFaceVerify", "HTTPS", "POST", "2019-03-07", "AK", null, TeaModel.buildMap(request), runtime), new CompareFaceVerifyResponse());
    }

    public CompareFaceVerifyResponse compareFaceVerifySimply(CompareFaceVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.compareFaceVerify(request, runtime);
    }

    public CompareFacesResponse compareFaces(CompareFacesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CompareFaces", "HTTPS", "POST", "2019-03-07", "AK", null, TeaModel.buildMap(request), runtime), new CompareFacesResponse());
    }

    public CompareFacesResponse compareFacesSimply(CompareFacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.compareFaces(request, runtime);
    }

    public ContrastFaceVerifyResponse contrastFaceVerify(ContrastFaceVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ContrastFaceVerify", "HTTPS", "POST", "2019-03-07", "AK", null, TeaModel.buildMap(request), runtime), new ContrastFaceVerifyResponse());
    }

    public ContrastFaceVerifyResponse contrastFaceVerifySimply(ContrastFaceVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.contrastFaceVerify(request, runtime);
    }

    public ContrastFaceVerifyResponse contrastFaceVerifyAdvance(ContrastFaceVerifyAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
        ContrastFaceVerifyRequest contrastFaceVerifyReq = new ContrastFaceVerifyRequest();
        com.aliyun.common.Common.convert(request, contrastFaceVerifyReq);
        if (!com.aliyun.teautil.Common.isUnset(request.faceContrastFileObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.accessKeyId;
            ossConfig.endpoint = com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.objectKey),
                new TeaPair("content", request.faceContrastFileObject),
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
            contrastFaceVerifyReq.faceContrastFile = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        }

        ContrastFaceVerifyResponse contrastFaceVerifyResp = this.contrastFaceVerify(contrastFaceVerifyReq, runtime);
        return contrastFaceVerifyResp;
    }

    public CreateAuthKeyResponse createAuthKey(CreateAuthKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateAuthKey", "HTTPS", "POST", "2019-03-07", "AK", null, TeaModel.buildMap(request), runtime), new CreateAuthKeyResponse());
    }

    public CreateAuthKeyResponse createAuthKeySimply(CreateAuthKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAuthKey(request, runtime);
    }

    public CreateVerifySettingResponse createVerifySetting(CreateVerifySettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateVerifySetting", "HTTPS", "POST", "2019-03-07", "AK", null, TeaModel.buildMap(request), runtime), new CreateVerifySettingResponse());
    }

    public CreateVerifySettingResponse createVerifySettingSimply(CreateVerifySettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVerifySetting(request, runtime);
    }

    public DescribeDeviceInfoResponse describeDeviceInfo(DescribeDeviceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDeviceInfo", "HTTPS", "POST", "2019-03-07", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDeviceInfoResponse());
    }

    public DescribeDeviceInfoResponse describeDeviceInfoSimply(DescribeDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeviceInfo(request, runtime);
    }

    public DescribeFaceVerifyResponse describeFaceVerify(DescribeFaceVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeFaceVerify", "HTTPS", "POST", "2019-03-07", "AK", null, TeaModel.buildMap(request), runtime), new DescribeFaceVerifyResponse());
    }

    public DescribeFaceVerifyResponse describeFaceVerifySimply(DescribeFaceVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFaceVerify(request, runtime);
    }

    public DescribeOssUploadTokenResponse describeOssUploadToken(DescribeOssUploadTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeOssUploadToken", "HTTPS", "POST", "2019-03-07", "AK", null, TeaModel.buildMap(request), runtime), new DescribeOssUploadTokenResponse());
    }

    public DescribeOssUploadTokenResponse describeOssUploadTokenSimply(DescribeOssUploadTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOssUploadToken(request, runtime);
    }

    public DescribeVerifyResultResponse describeVerifyResult(DescribeVerifyResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVerifyResult", "HTTPS", "POST", "2019-03-07", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVerifyResultResponse());
    }

    public DescribeVerifyResultResponse describeVerifyResultSimply(DescribeVerifyResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVerifyResult(request, runtime);
    }

    public DescribeVerifySDKResponse describeVerifySDK(DescribeVerifySDKRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVerifySDK", "HTTPS", "POST", "2019-03-07", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVerifySDKResponse());
    }

    public DescribeVerifySDKResponse describeVerifySDKSimply(DescribeVerifySDKRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVerifySDK(request, runtime);
    }

    public DescribeVerifyTokenResponse describeVerifyToken(DescribeVerifyTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeVerifyToken", "HTTPS", "POST", "2019-03-07", "AK", null, TeaModel.buildMap(request), runtime), new DescribeVerifyTokenResponse());
    }

    public DescribeVerifyTokenResponse describeVerifyTokenSimply(DescribeVerifyTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVerifyToken(request, runtime);
    }

    public DetectFaceAttributesResponse detectFaceAttributes(DetectFaceAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DetectFaceAttributes", "HTTPS", "POST", "2019-03-07", "AK", null, TeaModel.buildMap(request), runtime), new DetectFaceAttributesResponse());
    }

    public DetectFaceAttributesResponse detectFaceAttributesSimply(DetectFaceAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectFaceAttributes(request, runtime);
    }

    public InitFaceVerifyResponse initFaceVerify(InitFaceVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("InitFaceVerify", "HTTPS", "POST", "2019-03-07", "AK", null, TeaModel.buildMap(request), runtime), new InitFaceVerifyResponse());
    }

    public InitFaceVerifyResponse initFaceVerifySimply(InitFaceVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initFaceVerify(request, runtime);
    }

    public LivenessFaceVerifyResponse livenessFaceVerify(LivenessFaceVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("LivenessFaceVerify", "HTTPS", "POST", "2019-03-07", "AK", null, TeaModel.buildMap(request), runtime), new LivenessFaceVerifyResponse());
    }

    public LivenessFaceVerifyResponse livenessFaceVerifySimply(LivenessFaceVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.livenessFaceVerify(request, runtime);
    }

    public ModifyDeviceInfoResponse modifyDeviceInfo(ModifyDeviceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDeviceInfo", "HTTPS", "POST", "2019-03-07", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDeviceInfoResponse());
    }

    public ModifyDeviceInfoResponse modifyDeviceInfoSimply(ModifyDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDeviceInfo(request, runtime);
    }

    public VerifyMaterialResponse verifyMaterial(VerifyMaterialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("VerifyMaterial", "HTTPS", "POST", "2019-03-07", "AK", null, TeaModel.buildMap(request), runtime), new VerifyMaterialResponse());
    }

    public VerifyMaterialResponse verifyMaterialSimply(VerifyMaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyMaterial(request, runtime);
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
