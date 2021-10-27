// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307;

import com.aliyun.tea.*;
import com.aliyun.cloudauth20190307.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.oss.*;
import com.aliyun.oss.models.*;
import com.aliyun.tearpc.*;
import com.aliyun.tearpc.models.*;
import com.aliyun.openplatform20191219.*;
import com.aliyun.openplatform20191219.models.*;
import com.aliyun.ossutil.*;
import com.aliyun.ossutil.models.*;
import com.aliyun.fileform.*;
import com.aliyun.fileform.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

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

    public CompareFaceVerifyResponse compareFaceVerifyWithOptions(CompareFaceVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CompareFaceVerify", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new CompareFaceVerifyResponse());
    }

    public CompareFaceVerifyResponse compareFaceVerify(CompareFaceVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.compareFaceVerifyWithOptions(request, runtime);
    }

    public CompareFacesResponse compareFacesWithOptions(CompareFacesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CompareFaces", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new CompareFacesResponse());
    }

    public CompareFacesResponse compareFaces(CompareFacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.compareFacesWithOptions(request, runtime);
    }

    public ContrastFaceVerifyResponse contrastFaceVerifyWithOptions(ContrastFaceVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ContrastFaceVerify", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new ContrastFaceVerifyResponse());
    }

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
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        ContrastFaceVerifyRequest contrastFaceVerifyReq = new ContrastFaceVerifyRequest();
        com.aliyun.openapiutil.Client.convert(request, contrastFaceVerifyReq);
        if (!com.aliyun.teautil.Common.isUnset(request.faceContrastFileObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
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

        ContrastFaceVerifyResponse contrastFaceVerifyResp = this.contrastFaceVerifyWithOptions(contrastFaceVerifyReq, runtime);
        return contrastFaceVerifyResp;
    }

    public CreateAuthKeyResponse createAuthKeyWithOptions(CreateAuthKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAuthKey", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAuthKeyResponse());
    }

    public CreateAuthKeyResponse createAuthKey(CreateAuthKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAuthKeyWithOptions(request, runtime);
    }

    public CreateFaceConfigResponse createFaceConfigWithOptions(CreateFaceConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFaceConfig", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFaceConfigResponse());
    }

    public CreateFaceConfigResponse createFaceConfig(CreateFaceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFaceConfigWithOptions(request, runtime);
    }

    public CreateRPSDKResponse createRPSDKWithOptions(CreateRPSDKRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRPSDK", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRPSDKResponse());
    }

    public CreateRPSDKResponse createRPSDK(CreateRPSDKRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRPSDKWithOptions(request, runtime);
    }

    public CreateVerifySDKResponse createVerifySDKWithOptions(CreateVerifySDKRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVerifySDK", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVerifySDKResponse());
    }

    public CreateVerifySDKResponse createVerifySDK(CreateVerifySDKRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVerifySDKWithOptions(request, runtime);
    }

    public CreateVerifySettingResponse createVerifySettingWithOptions(CreateVerifySettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVerifySetting", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVerifySettingResponse());
    }

    public CreateVerifySettingResponse createVerifySetting(CreateVerifySettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVerifySettingWithOptions(request, runtime);
    }

    public CreateWhitelistResponse createWhitelistWithOptions(CreateWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateWhitelist", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new CreateWhitelistResponse());
    }

    public CreateWhitelistResponse createWhitelist(CreateWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWhitelistWithOptions(request, runtime);
    }

    public CreateWhitelistSettingResponse createWhitelistSettingWithOptions(CreateWhitelistSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateWhitelistSetting", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new CreateWhitelistSettingResponse());
    }

    public CreateWhitelistSettingResponse createWhitelistSetting(CreateWhitelistSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWhitelistSettingWithOptions(request, runtime);
    }

    public DeleteWhitelistResponse deleteWhitelistWithOptions(DeleteWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteWhitelist", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteWhitelistResponse());
    }

    public DeleteWhitelistResponse deleteWhitelist(DeleteWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWhitelistWithOptions(request, runtime);
    }

    public DeleteWhitelistSettingResponse deleteWhitelistSettingWithOptions(DeleteWhitelistSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteWhitelistSetting", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteWhitelistSettingResponse());
    }

    public DeleteWhitelistSettingResponse deleteWhitelistSetting(DeleteWhitelistSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWhitelistSettingWithOptions(request, runtime);
    }

    public DescribeAppInfoResponse describeAppInfoWithOptions(DescribeAppInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAppInfo", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAppInfoResponse());
    }

    public DescribeAppInfoResponse describeAppInfo(DescribeAppInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppInfoWithOptions(request, runtime);
    }

    public DescribeDeviceInfoResponse describeDeviceInfoWithOptions(DescribeDeviceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDeviceInfo", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDeviceInfoResponse());
    }

    public DescribeDeviceInfoResponse describeDeviceInfo(DescribeDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeviceInfoWithOptions(request, runtime);
    }

    public DescribeFaceConfigResponse describeFaceConfigWithOptions(DescribeFaceConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFaceConfig", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFaceConfigResponse());
    }

    public DescribeFaceConfigResponse describeFaceConfig(DescribeFaceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFaceConfigWithOptions(request, runtime);
    }

    public DescribeFaceUsageResponse describeFaceUsageWithOptions(DescribeFaceUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFaceUsage", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFaceUsageResponse());
    }

    public DescribeFaceUsageResponse describeFaceUsage(DescribeFaceUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFaceUsageWithOptions(request, runtime);
    }

    public DescribeFaceVerifyResponse describeFaceVerifyWithOptions(DescribeFaceVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFaceVerify", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFaceVerifyResponse());
    }

    public DescribeFaceVerifyResponse describeFaceVerify(DescribeFaceVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFaceVerifyWithOptions(request, runtime);
    }

    public DescribeOssUploadTokenResponse describeOssUploadTokenWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeOssUploadToken", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeOssUploadTokenResponse());
    }

    public DescribeOssUploadTokenResponse describeOssUploadToken() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOssUploadTokenWithOptions(runtime);
    }

    public DescribeRPSDKResponse describeRPSDKWithOptions(DescribeRPSDKRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRPSDK", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRPSDKResponse());
    }

    public DescribeRPSDKResponse describeRPSDK(DescribeRPSDKRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRPSDKWithOptions(request, runtime);
    }

    public DescribeSdkUrlResponse describeSdkUrlWithOptions(DescribeSdkUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSdkUrl", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSdkUrlResponse());
    }

    public DescribeSdkUrlResponse describeSdkUrl(DescribeSdkUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSdkUrlWithOptions(request, runtime);
    }

    public DescribeUpdatePackageResultResponse describeUpdatePackageResultWithOptions(DescribeUpdatePackageResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUpdatePackageResult", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUpdatePackageResultResponse());
    }

    public DescribeUpdatePackageResultResponse describeUpdatePackageResult(DescribeUpdatePackageResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUpdatePackageResultWithOptions(request, runtime);
    }

    public DescribeUploadInfoResponse describeUploadInfoWithOptions(DescribeUploadInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUploadInfo", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUploadInfoResponse());
    }

    public DescribeUploadInfoResponse describeUploadInfo(DescribeUploadInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUploadInfoWithOptions(request, runtime);
    }

    public DescribeUserStatusResponse describeUserStatusWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeUserStatus", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserStatusResponse());
    }

    public DescribeUserStatusResponse describeUserStatus() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserStatusWithOptions(runtime);
    }

    public DescribeVerifyRecordsResponse describeVerifyRecordsWithOptions(DescribeVerifyRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVerifyRecords", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVerifyRecordsResponse());
    }

    public DescribeVerifyRecordsResponse describeVerifyRecords(DescribeVerifyRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVerifyRecordsWithOptions(request, runtime);
    }

    public DescribeVerifyResultResponse describeVerifyResultWithOptions(DescribeVerifyResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVerifyResult", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVerifyResultResponse());
    }

    public DescribeVerifyResultResponse describeVerifyResult(DescribeVerifyResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVerifyResultWithOptions(request, runtime);
    }

    public DescribeVerifySDKResponse describeVerifySDKWithOptions(DescribeVerifySDKRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVerifySDK", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVerifySDKResponse());
    }

    public DescribeVerifySDKResponse describeVerifySDK(DescribeVerifySDKRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVerifySDKWithOptions(request, runtime);
    }

    public DescribeVerifySettingResponse describeVerifySettingWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeVerifySetting", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVerifySettingResponse());
    }

    public DescribeVerifySettingResponse describeVerifySetting() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVerifySettingWithOptions(runtime);
    }

    public DescribeVerifyTokenResponse describeVerifyTokenWithOptions(DescribeVerifyTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVerifyToken", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVerifyTokenResponse());
    }

    public DescribeVerifyTokenResponse describeVerifyToken(DescribeVerifyTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVerifyTokenWithOptions(request, runtime);
    }

    public DescribeVerifyUsageResponse describeVerifyUsageWithOptions(DescribeVerifyUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVerifyUsage", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVerifyUsageResponse());
    }

    public DescribeVerifyUsageResponse describeVerifyUsage(DescribeVerifyUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVerifyUsageWithOptions(request, runtime);
    }

    public DescribeWhitelistResponse describeWhitelistWithOptions(DescribeWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeWhitelist", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeWhitelistResponse());
    }

    public DescribeWhitelistResponse describeWhitelist(DescribeWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWhitelistWithOptions(request, runtime);
    }

    public DescribeWhitelistSettingResponse describeWhitelistSettingWithOptions(DescribeWhitelistSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeWhitelistSetting", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeWhitelistSettingResponse());
    }

    public DescribeWhitelistSettingResponse describeWhitelistSetting(DescribeWhitelistSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWhitelistSettingWithOptions(request, runtime);
    }

    public DetectFaceAttributesResponse detectFaceAttributesWithOptions(DetectFaceAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetectFaceAttributes", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new DetectFaceAttributesResponse());
    }

    public DetectFaceAttributesResponse detectFaceAttributes(DetectFaceAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectFaceAttributesWithOptions(request, runtime);
    }

    public InitDeviceResponse initDeviceWithOptions(InitDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InitDevice", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new InitDeviceResponse());
    }

    public InitDeviceResponse initDevice(InitDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initDeviceWithOptions(request, runtime);
    }

    public InitFaceVerifyResponse initFaceVerifyWithOptions(InitFaceVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InitFaceVerify", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new InitFaceVerifyResponse());
    }

    public InitFaceVerifyResponse initFaceVerify(InitFaceVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initFaceVerifyWithOptions(request, runtime);
    }

    public LivenessFaceVerifyResponse livenessFaceVerifyWithOptions(LivenessFaceVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LivenessFaceVerify", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new LivenessFaceVerifyResponse());
    }

    public LivenessFaceVerifyResponse livenessFaceVerify(LivenessFaceVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.livenessFaceVerifyWithOptions(request, runtime);
    }

    public ModifyDeviceInfoResponse modifyDeviceInfoWithOptions(ModifyDeviceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDeviceInfo", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDeviceInfoResponse());
    }

    public ModifyDeviceInfoResponse modifyDeviceInfo(ModifyDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDeviceInfoWithOptions(request, runtime);
    }

    public UpdateAppPackageResponse updateAppPackageWithOptions(UpdateAppPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAppPackage", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAppPackageResponse());
    }

    public UpdateAppPackageResponse updateAppPackage(UpdateAppPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAppPackageWithOptions(request, runtime);
    }

    public UpdateFaceConfigResponse updateFaceConfigWithOptions(UpdateFaceConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateFaceConfig", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateFaceConfigResponse());
    }

    public UpdateFaceConfigResponse updateFaceConfig(UpdateFaceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFaceConfigWithOptions(request, runtime);
    }

    public UpdateVerifySettingResponse updateVerifySettingWithOptions(UpdateVerifySettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateVerifySetting", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateVerifySettingResponse());
    }

    public UpdateVerifySettingResponse updateVerifySetting(UpdateVerifySettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVerifySettingWithOptions(request, runtime);
    }

    public VerifyDeviceResponse verifyDeviceWithOptions(VerifyDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VerifyDevice", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new VerifyDeviceResponse());
    }

    public VerifyDeviceResponse verifyDevice(VerifyDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyDeviceWithOptions(request, runtime);
    }

    public VerifyMaterialResponse verifyMaterialWithOptions(VerifyMaterialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VerifyMaterial", "2019-03-07", "HTTPS", "POST", "AK", "json", req, runtime), new VerifyMaterialResponse());
    }

    public VerifyMaterialResponse verifyMaterial(VerifyMaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyMaterialWithOptions(request, runtime);
    }
}
