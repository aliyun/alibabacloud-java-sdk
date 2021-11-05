// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012;

import com.aliyun.tea.*;
import com.aliyun.alimt20181012.models.*;
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
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "mt.cn-hangzhou.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "mt.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "mt.aliyuncs.com"),
            new TeaPair("ap-south-1", "mt.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "mt.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "mt.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "mt.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "mt.aliyuncs.com"),
            new TeaPair("cn-beijing", "mt.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "mt.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "mt.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "mt.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "mt.aliyuncs.com"),
            new TeaPair("cn-chengdu", "mt.aliyuncs.com"),
            new TeaPair("cn-edge-1", "mt.aliyuncs.com"),
            new TeaPair("cn-fujian", "mt.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "mt.aliyuncs.com"),
            new TeaPair("cn-hongkong", "mt.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "mt.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "mt.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "mt.aliyuncs.com"),
            new TeaPair("cn-qingdao", "mt.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "mt.aliyuncs.com"),
            new TeaPair("cn-shanghai", "mt.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "mt.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "mt.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "mt.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "mt.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "mt.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "mt.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "mt.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "mt.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "mt.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "mt.aliyuncs.com"),
            new TeaPair("cn-wuhan", "mt.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "mt.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "mt.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "mt.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "mt.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "mt.aliyuncs.com"),
            new TeaPair("eu-central-1", "mt.aliyuncs.com"),
            new TeaPair("eu-west-1", "mt.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "mt.aliyuncs.com"),
            new TeaPair("me-east-1", "mt.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "mt.aliyuncs.com"),
            new TeaPair("us-east-1", "mt.aliyuncs.com"),
            new TeaPair("us-west-1", "mt.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("alimt", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateDocTranslateTaskResponse createDocTranslateTaskWithOptions(CreateDocTranslateTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDocTranslateTask", "2018-10-12", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDocTranslateTaskResponse());
    }

    public CreateDocTranslateTaskResponse createDocTranslateTask(CreateDocTranslateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDocTranslateTaskWithOptions(request, runtime);
    }

    public CreateDocTranslateTaskResponse createDocTranslateTaskAdvance(CreateDocTranslateTaskAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("product", "alimt"),
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
        CreateDocTranslateTaskRequest createDocTranslateTaskReq = new CreateDocTranslateTaskRequest();
        com.aliyun.openapiutil.Client.convert(request, createDocTranslateTaskReq);
        if (!com.aliyun.teautil.Common.isUnset(request.fileUrlObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.objectKey),
                new TeaPair("content", request.fileUrlObject),
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
            createDocTranslateTaskReq.fileUrl = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        }

        CreateDocTranslateTaskResponse createDocTranslateTaskResp = this.createDocTranslateTaskWithOptions(createDocTranslateTaskReq, runtime);
        return createDocTranslateTaskResp;
    }

    public CreateImageTranslateTaskResponse createImageTranslateTaskWithOptions(CreateImageTranslateTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateImageTranslateTask", "2018-10-12", "HTTPS", "POST", "AK", "json", req, runtime), new CreateImageTranslateTaskResponse());
    }

    public CreateImageTranslateTaskResponse createImageTranslateTask(CreateImageTranslateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createImageTranslateTaskWithOptions(request, runtime);
    }

    public GetBatchTranslateResponse getBatchTranslateWithOptions(GetBatchTranslateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetBatchTranslate", "2018-10-12", "HTTPS", "POST", "AK", "json", req, runtime), new GetBatchTranslateResponse());
    }

    public GetBatchTranslateResponse getBatchTranslate(GetBatchTranslateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBatchTranslateWithOptions(request, runtime);
    }

    public GetDetectLanguageResponse getDetectLanguageWithOptions(GetDetectLanguageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDetectLanguage", "2018-10-12", "HTTPS", "POST", "AK", "json", req, runtime), new GetDetectLanguageResponse());
    }

    public GetDetectLanguageResponse getDetectLanguage(GetDetectLanguageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDetectLanguageWithOptions(request, runtime);
    }

    public GetDocTranslateTaskResponse getDocTranslateTaskWithOptions(GetDocTranslateTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDocTranslateTask", "2018-10-12", "HTTPS", "GET", "AK", "json", req, runtime), new GetDocTranslateTaskResponse());
    }

    public GetDocTranslateTaskResponse getDocTranslateTask(GetDocTranslateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDocTranslateTaskWithOptions(request, runtime);
    }

    public GetImageDiagnoseResponse getImageDiagnoseWithOptions(GetImageDiagnoseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetImageDiagnose", "2018-10-12", "HTTPS", "POST", "AK", "json", req, runtime), new GetImageDiagnoseResponse());
    }

    public GetImageDiagnoseResponse getImageDiagnose(GetImageDiagnoseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageDiagnoseWithOptions(request, runtime);
    }

    public GetImageTranslateResponse getImageTranslateWithOptions(GetImageTranslateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetImageTranslate", "2018-10-12", "HTTPS", "POST", "AK", "json", req, runtime), new GetImageTranslateResponse());
    }

    public GetImageTranslateResponse getImageTranslate(GetImageTranslateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageTranslateWithOptions(request, runtime);
    }

    public GetImageTranslateTaskResponse getImageTranslateTaskWithOptions(GetImageTranslateTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetImageTranslateTask", "2018-10-12", "HTTPS", "POST", "AK", "json", req, runtime), new GetImageTranslateTaskResponse());
    }

    public GetImageTranslateTaskResponse getImageTranslateTask(GetImageTranslateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageTranslateTaskWithOptions(request, runtime);
    }

    public GetTitleDiagnoseResponse getTitleDiagnoseWithOptions(GetTitleDiagnoseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTitleDiagnose", "2018-10-12", "HTTPS", "POST", "AK", "json", req, runtime), new GetTitleDiagnoseResponse());
    }

    public GetTitleDiagnoseResponse getTitleDiagnose(GetTitleDiagnoseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTitleDiagnoseWithOptions(request, runtime);
    }

    public GetTitleGenerateResponse getTitleGenerateWithOptions(GetTitleGenerateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTitleGenerate", "2018-10-12", "HTTPS", "POST", "AK", "json", req, runtime), new GetTitleGenerateResponse());
    }

    public GetTitleGenerateResponse getTitleGenerate(GetTitleGenerateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTitleGenerateWithOptions(request, runtime);
    }

    public GetTitleIntelligenceResponse getTitleIntelligenceWithOptions(GetTitleIntelligenceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTitleIntelligence", "2018-10-12", "HTTPS", "POST", "AK", "json", req, runtime), new GetTitleIntelligenceResponse());
    }

    public GetTitleIntelligenceResponse getTitleIntelligence(GetTitleIntelligenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTitleIntelligenceWithOptions(request, runtime);
    }

    public GetTranslateReportResponse getTranslateReportWithOptions(GetTranslateReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTranslateReport", "2018-10-12", "HTTPS", "POST", "AK", "json", req, runtime), new GetTranslateReportResponse());
    }

    public GetTranslateReportResponse getTranslateReport(GetTranslateReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTranslateReportWithOptions(request, runtime);
    }

    public GetUserResponse getUserWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetUser", "2018-10-12", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserResponse());
    }

    public GetUserResponse getUser() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserWithOptions(runtime);
    }

    public OpenAlimtServiceResponse openAlimtServiceWithOptions(OpenAlimtServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OpenAlimtService", "2018-10-12", "HTTPS", "POST", "AK", "json", req, runtime), new OpenAlimtServiceResponse());
    }

    public OpenAlimtServiceResponse openAlimtService(OpenAlimtServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openAlimtServiceWithOptions(request, runtime);
    }

    public TranslateResponse translateWithOptions(TranslateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("Translate", "2018-10-12", "HTTPS", "POST", "AK", "json", req, runtime), new TranslateResponse());
    }

    public TranslateResponse translate(TranslateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.translateWithOptions(request, runtime);
    }

    public TranslateCertificateResponse translateCertificateWithOptions(TranslateCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TranslateCertificate", "2018-10-12", "HTTPS", "POST", "AK", "json", req, runtime), new TranslateCertificateResponse());
    }

    public TranslateCertificateResponse translateCertificate(TranslateCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.translateCertificateWithOptions(request, runtime);
    }

    public TranslateCertificateResponse translateCertificateAdvance(TranslateCertificateAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("product", "alimt"),
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
        TranslateCertificateRequest translateCertificateReq = new TranslateCertificateRequest();
        com.aliyun.openapiutil.Client.convert(request, translateCertificateReq);
        if (!com.aliyun.teautil.Common.isUnset(request.imageUrlObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.objectKey),
                new TeaPair("content", request.imageUrlObject),
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
            translateCertificateReq.imageUrl = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        }

        TranslateCertificateResponse translateCertificateResp = this.translateCertificateWithOptions(translateCertificateReq, runtime);
        return translateCertificateResp;
    }

    public TranslateECommerceResponse translateECommerceWithOptions(TranslateECommerceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TranslateECommerce", "2018-10-12", "HTTPS", "POST", "AK", "json", req, runtime), new TranslateECommerceResponse());
    }

    public TranslateECommerceResponse translateECommerce(TranslateECommerceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.translateECommerceWithOptions(request, runtime);
    }

    public TranslateGeneralResponse translateGeneralWithOptions(TranslateGeneralRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TranslateGeneral", "2018-10-12", "HTTPS", "POST", "AK", "json", req, runtime), new TranslateGeneralResponse());
    }

    public TranslateGeneralResponse translateGeneral(TranslateGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.translateGeneralWithOptions(request, runtime);
    }

    public TranslateImageResponse translateImageWithOptions(TranslateImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TranslateImage", "2018-10-12", "HTTPS", "POST", "AK", "json", req, runtime), new TranslateImageResponse());
    }

    public TranslateImageResponse translateImage(TranslateImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.translateImageWithOptions(request, runtime);
    }
}
