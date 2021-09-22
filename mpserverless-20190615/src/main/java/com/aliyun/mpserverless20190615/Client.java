// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615;

import com.aliyun.tea.*;
import com.aliyun.mpserverless20190615.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("mpserverless", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public RunFunctionResponse runFunctionWithOptions(RunFunctionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RunFunction", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new RunFunctionResponse());
    }

    public RunFunctionResponse runFunction(RunFunctionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.runFunctionWithOptions(request, runtime);
    }

    public ListFunctionResponse listFunctionWithOptions(ListFunctionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFunction", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListFunctionResponse());
    }

    public ListFunctionResponse listFunction(ListFunctionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFunctionWithOptions(request, runtime);
    }

    public GetWebHostingCertificateDetailResponse getWebHostingCertificateDetailWithOptions(GetWebHostingCertificateDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetWebHostingCertificateDetail", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetWebHostingCertificateDetailResponse());
    }

    public GetWebHostingCertificateDetailResponse getWebHostingCertificateDetail(GetWebHostingCertificateDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getWebHostingCertificateDetailWithOptions(request, runtime);
    }

    public UpdateSpaceResponse updateSpaceWithOptions(UpdateSpaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSpace", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSpaceResponse());
    }

    public UpdateSpaceResponse updateSpace(UpdateSpaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSpaceWithOptions(request, runtime);
    }

    public SaveWebHostingCustomDomainConfigResponse saveWebHostingCustomDomainConfigWithOptions(SaveWebHostingCustomDomainConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveWebHostingCustomDomainConfig", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new SaveWebHostingCustomDomainConfigResponse());
    }

    public SaveWebHostingCustomDomainConfigResponse saveWebHostingCustomDomainConfig(SaveWebHostingCustomDomainConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveWebHostingCustomDomainConfigWithOptions(request, runtime);
    }

    public ListFunctionSpecResponse listFunctionSpecWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListFunctionSpec", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListFunctionSpecResponse());
    }

    public ListFunctionSpecResponse listFunctionSpec() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFunctionSpecWithOptions(runtime);
    }

    public DeleteWechatOpenPlatformConfigResponse deleteWechatOpenPlatformConfigWithOptions(DeleteWechatOpenPlatformConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteWechatOpenPlatformConfig", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteWechatOpenPlatformConfigResponse());
    }

    public DeleteWechatOpenPlatformConfigResponse deleteWechatOpenPlatformConfig(DeleteWechatOpenPlatformConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteWechatOpenPlatformConfigWithOptions(request, runtime);
    }

    public CreateSpaceResponse createSpaceWithOptions(CreateSpaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSpace", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSpaceResponse());
    }

    public CreateSpaceResponse createSpace(CreateSpaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSpaceWithOptions(request, runtime);
    }

    public OpenProductResponse openProductWithOptions(OpenProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OpenProduct", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new OpenProductResponse());
    }

    public OpenProductResponse openProduct(OpenProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openProductWithOptions(request, runtime);
    }

    public OpenServiceResponse openServiceWithOptions(OpenServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OpenService", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new OpenServiceResponse());
    }

    public OpenServiceResponse openService(OpenServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openServiceWithOptions(request, runtime);
    }

    public DeleteSpaceResponse deleteSpaceWithOptions(DeleteSpaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSpace", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSpaceResponse());
    }

    public DeleteSpaceResponse deleteSpace(DeleteSpaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSpaceWithOptions(request, runtime);
    }

    public DeleteAntOpenPlatformConfigResponse deleteAntOpenPlatformConfigWithOptions(DeleteAntOpenPlatformConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAntOpenPlatformConfig", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAntOpenPlatformConfigResponse());
    }

    public DeleteAntOpenPlatformConfigResponse deleteAntOpenPlatformConfig(DeleteAntOpenPlatformConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAntOpenPlatformConfigWithOptions(request, runtime);
    }

    public DescribeFCOpenStatusResponse describeFCOpenStatusWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeFCOpenStatus", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFCOpenStatusResponse());
    }

    public DescribeFCOpenStatusResponse describeFCOpenStatus() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFCOpenStatusWithOptions(runtime);
    }

    public DescribeFileUploadSignedUrlResponse describeFileUploadSignedUrlWithOptions(DescribeFileUploadSignedUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFileUploadSignedUrl", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFileUploadSignedUrlResponse());
    }

    public DescribeFileUploadSignedUrlResponse describeFileUploadSignedUrl(DescribeFileUploadSignedUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFileUploadSignedUrlWithOptions(request, runtime);
    }

    public DeleteFileResponse deleteFileWithOptions(DeleteFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFile", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFileResponse());
    }

    public DeleteFileResponse deleteFile(DeleteFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFileWithOptions(request, runtime);
    }

    public QueryDBImportTaskStatusResponse queryDBImportTaskStatusWithOptions(QueryDBImportTaskStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDBImportTaskStatus", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDBImportTaskStatusResponse());
    }

    public QueryDBImportTaskStatusResponse queryDBImportTaskStatus(QueryDBImportTaskStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDBImportTaskStatusWithOptions(request, runtime);
    }

    public RegisterFileResponse registerFileWithOptions(RegisterFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RegisterFile", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new RegisterFileResponse());
    }

    public RegisterFileResponse registerFile(RegisterFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerFileWithOptions(request, runtime);
    }

    public SaveAntOpenPlatformConfigResponse saveAntOpenPlatformConfigWithOptions(SaveAntOpenPlatformConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveAntOpenPlatformConfig", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new SaveAntOpenPlatformConfigResponse());
    }

    public SaveAntOpenPlatformConfigResponse saveAntOpenPlatformConfig(SaveAntOpenPlatformConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveAntOpenPlatformConfigWithOptions(request, runtime);
    }

    public DescribeFunctionResponse describeFunctionWithOptions(DescribeFunctionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFunction", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFunctionResponse());
    }

    public DescribeFunctionResponse describeFunction(DescribeFunctionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFunctionWithOptions(request, runtime);
    }

    public OpenWebHostingServiceResponse openWebHostingServiceWithOptions(OpenWebHostingServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OpenWebHostingService", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new OpenWebHostingServiceResponse());
    }

    public OpenWebHostingServiceResponse openWebHostingService(OpenWebHostingServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openWebHostingServiceWithOptions(request, runtime);
    }

    public DescribeSmsSignResponse describeSmsSignWithOptions(DescribeSmsSignRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSmsSign", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSmsSignResponse());
    }

    public DescribeSmsSignResponse describeSmsSign(DescribeSmsSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSmsSignWithOptions(request, runtime);
    }

    public ListAvailableCertificatesResponse listAvailableCertificatesWithOptions(ListAvailableCertificatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAvailableCertificates", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListAvailableCertificatesResponse());
    }

    public ListAvailableCertificatesResponse listAvailableCertificates(ListAvailableCertificatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAvailableCertificatesWithOptions(request, runtime);
    }

    public ListOpenPlatformConfigResponse listOpenPlatformConfigWithOptions(ListOpenPlatformConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOpenPlatformConfig", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListOpenPlatformConfigResponse());
    }

    public ListOpenPlatformConfigResponse listOpenPlatformConfig(ListOpenPlatformConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOpenPlatformConfigWithOptions(request, runtime);
    }

    public ModifyWebHostingConfigResponse modifyWebHostingConfigWithOptions(ModifyWebHostingConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyWebHostingConfig", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyWebHostingConfigResponse());
    }

    public ModifyWebHostingConfigResponse modifyWebHostingConfig(ModifyWebHostingConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyWebHostingConfigWithOptions(request, runtime);
    }

    public DeleteSmsSignResponse deleteSmsSignWithOptions(DeleteSmsSignRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSmsSign", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSmsSignResponse());
    }

    public DeleteSmsSignResponse deleteSmsSign(DeleteSmsSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSmsSignWithOptions(request, runtime);
    }

    public DescribeSmsOpenStatusResponse describeSmsOpenStatusWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeSmsOpenStatus", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSmsOpenStatusResponse());
    }

    public DescribeSmsOpenStatusResponse describeSmsOpenStatus() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSmsOpenStatusWithOptions(runtime);
    }

    public ListSpaceResponse listSpaceWithOptions(ListSpaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSpace", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListSpaceResponse());
    }

    public ListSpaceResponse listSpace(ListSpaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSpaceWithOptions(request, runtime);
    }

    public DeleteDBCollectionResponse deleteDBCollectionWithOptions(DeleteDBCollectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDBCollection", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDBCollectionResponse());
    }

    public DeleteDBCollectionResponse deleteDBCollection(DeleteDBCollectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDBCollectionWithOptions(request, runtime);
    }

    public CreateFunctionDeploymentResponse createFunctionDeploymentWithOptions(CreateFunctionDeploymentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFunctionDeployment", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFunctionDeploymentResponse());
    }

    public CreateFunctionDeploymentResponse createFunctionDeployment(CreateFunctionDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFunctionDeploymentWithOptions(request, runtime);
    }

    public GetWebHostingUploadCredentialResponse getWebHostingUploadCredentialWithOptions(GetWebHostingUploadCredentialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetWebHostingUploadCredential", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetWebHostingUploadCredentialResponse());
    }

    public GetWebHostingUploadCredentialResponse getWebHostingUploadCredential(GetWebHostingUploadCredentialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getWebHostingUploadCredentialWithOptions(request, runtime);
    }

    public ListFunctionDeploymentResponse listFunctionDeploymentWithOptions(ListFunctionDeploymentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFunctionDeployment", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListFunctionDeploymentResponse());
    }

    public ListFunctionDeploymentResponse listFunctionDeployment(ListFunctionDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFunctionDeploymentWithOptions(request, runtime);
    }

    public AddDingtalkOpenPlatformConfigResponse addDingtalkOpenPlatformConfigWithOptions(AddDingtalkOpenPlatformConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddDingtalkOpenPlatformConfig", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new AddDingtalkOpenPlatformConfigResponse());
    }

    public AddDingtalkOpenPlatformConfigResponse addDingtalkOpenPlatformConfig(AddDingtalkOpenPlatformConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDingtalkOpenPlatformConfigWithOptions(request, runtime);
    }

    public CreateDBRestoreTaskResponse createDBRestoreTaskWithOptions(CreateDBRestoreTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDBRestoreTask", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDBRestoreTaskResponse());
    }

    public CreateDBRestoreTaskResponse createDBRestoreTask(CreateDBRestoreTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDBRestoreTaskWithOptions(request, runtime);
    }

    public AttachWebHostingCertificateResponse attachWebHostingCertificateWithOptions(AttachWebHostingCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachWebHostingCertificate", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new AttachWebHostingCertificateResponse());
    }

    public AttachWebHostingCertificateResponse attachWebHostingCertificate(AttachWebHostingCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachWebHostingCertificateWithOptions(request, runtime);
    }

    public ListFileResponse listFileWithOptions(ListFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFile", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListFileResponse());
    }

    public ListFileResponse listFile(ListFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFileWithOptions(request, runtime);
    }

    public QueryDBRestoreTaskStatusResponse queryDBRestoreTaskStatusWithOptions(QueryDBRestoreTaskStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDBRestoreTaskStatus", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDBRestoreTaskStatusResponse());
    }

    public QueryDBRestoreTaskStatusResponse queryDBRestoreTaskStatus(QueryDBRestoreTaskStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDBRestoreTaskStatusWithOptions(request, runtime);
    }

    public VerifyWebHostingDomainOwnerResponse verifyWebHostingDomainOwnerWithOptions(VerifyWebHostingDomainOwnerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VerifyWebHostingDomainOwner", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new VerifyWebHostingDomainOwnerResponse());
    }

    public VerifyWebHostingDomainOwnerResponse verifyWebHostingDomainOwner(VerifyWebHostingDomainOwnerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyWebHostingDomainOwnerWithOptions(request, runtime);
    }

    public DeleteSmsTemplateResponse deleteSmsTemplateWithOptions(DeleteSmsTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSmsTemplate", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSmsTemplateResponse());
    }

    public DeleteSmsTemplateResponse deleteSmsTemplate(DeleteSmsTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSmsTemplateWithOptions(request, runtime);
    }

    public QueryDBExportTaskStatusResponse queryDBExportTaskStatusWithOptions(QueryDBExportTaskStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDBExportTaskStatus", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDBExportTaskStatusResponse());
    }

    public QueryDBExportTaskStatusResponse queryDBExportTaskStatus(QueryDBExportTaskStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDBExportTaskStatusWithOptions(request, runtime);
    }

    public CreateDBImportTaskResponse createDBImportTaskWithOptions(CreateDBImportTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDBImportTask", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDBImportTaskResponse());
    }

    public CreateDBImportTaskResponse createDBImportTask(CreateDBImportTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDBImportTaskWithOptions(request, runtime);
    }

    public CheckSmsHasAuthorizedToMPSResponse checkSmsHasAuthorizedToMPSWithOptions(CheckSmsHasAuthorizedToMPSRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckSmsHasAuthorizedToMPS", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new CheckSmsHasAuthorizedToMPSResponse());
    }

    public CheckSmsHasAuthorizedToMPSResponse checkSmsHasAuthorizedToMPS(CheckSmsHasAuthorizedToMPSRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkSmsHasAuthorizedToMPSWithOptions(request, runtime);
    }

    public DescribeServicePolicyResponse describeServicePolicyWithOptions(DescribeServicePolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeServicePolicy", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeServicePolicyResponse());
    }

    public DescribeServicePolicyResponse describeServicePolicy(DescribeServicePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServicePolicyWithOptions(request, runtime);
    }

    public ListSmsTemplatesResponse listSmsTemplatesWithOptions(ListSmsTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSmsTemplates", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListSmsTemplatesResponse());
    }

    public ListSmsTemplatesResponse listSmsTemplates(ListSmsTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSmsTemplatesWithOptions(request, runtime);
    }

    public QueryDBBackupCollectionsResponse queryDBBackupCollectionsWithOptions(QueryDBBackupCollectionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDBBackupCollections", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDBBackupCollectionsResponse());
    }

    public QueryDBBackupCollectionsResponse queryDBBackupCollections(QueryDBBackupCollectionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDBBackupCollectionsWithOptions(request, runtime);
    }

    public QueryServiceStatusResponse queryServiceStatusWithOptions(QueryServiceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryServiceStatus", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new QueryServiceStatusResponse());
    }

    public QueryServiceStatusResponse queryServiceStatus(QueryServiceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryServiceStatusWithOptions(request, runtime);
    }

    public DescribeSpaceClientConfigResponse describeSpaceClientConfigWithOptions(DescribeSpaceClientConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSpaceClientConfig", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSpaceClientConfigResponse());
    }

    public DescribeSpaceClientConfigResponse describeSpaceClientConfig(DescribeSpaceClientConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSpaceClientConfigWithOptions(request, runtime);
    }

    public SaveBuiltinFunctionTemplateResponse saveBuiltinFunctionTemplateWithOptions(SaveBuiltinFunctionTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveBuiltinFunctionTemplate", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new SaveBuiltinFunctionTemplateResponse());
    }

    public SaveBuiltinFunctionTemplateResponse saveBuiltinFunctionTemplate(SaveBuiltinFunctionTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveBuiltinFunctionTemplateWithOptions(request, runtime);
    }

    public DescribeISVFileUploadSignedUrlResponse describeISVFileUploadSignedUrlWithOptions(DescribeISVFileUploadSignedUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeISVFileUploadSignedUrl", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeISVFileUploadSignedUrlResponse());
    }

    public DescribeISVFileUploadSignedUrlResponse describeISVFileUploadSignedUrl(DescribeISVFileUploadSignedUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeISVFileUploadSignedUrlWithOptions(request, runtime);
    }

    public CreateBuiltinFunctionTemplateResponse createBuiltinFunctionTemplateWithOptions(CreateBuiltinFunctionTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateBuiltinFunctionTemplate", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateBuiltinFunctionTemplateResponse());
    }

    public CreateBuiltinFunctionTemplateResponse createBuiltinFunctionTemplate(CreateBuiltinFunctionTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBuiltinFunctionTemplateWithOptions(request, runtime);
    }

    public GetWebHostingStatusResponse getWebHostingStatusWithOptions(GetWebHostingStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetWebHostingStatus", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetWebHostingStatusResponse());
    }

    public GetWebHostingStatusResponse getWebHostingStatus(GetWebHostingStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getWebHostingStatusWithOptions(request, runtime);
    }

    public ListFunctionLogResponse listFunctionLogWithOptions(ListFunctionLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFunctionLog", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListFunctionLogResponse());
    }

    public ListFunctionLogResponse listFunctionLog(ListFunctionLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFunctionLogWithOptions(request, runtime);
    }

    public ListWebHostingFilesResponse listWebHostingFilesWithOptions(ListWebHostingFilesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListWebHostingFiles", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListWebHostingFilesResponse());
    }

    public ListWebHostingFilesResponse listWebHostingFiles(ListWebHostingFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listWebHostingFilesWithOptions(request, runtime);
    }

    public DescribeFileResponse describeFileWithOptions(DescribeFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFile", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFileResponse());
    }

    public DescribeFileResponse describeFile(DescribeFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFileWithOptions(request, runtime);
    }

    public MoveWebHostingFileResponse moveWebHostingFileWithOptions(MoveWebHostingFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MoveWebHostingFile", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new MoveWebHostingFileResponse());
    }

    public MoveWebHostingFileResponse moveWebHostingFile(MoveWebHostingFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.moveWebHostingFileWithOptions(request, runtime);
    }

    public CreateSmsTemplateResponse createSmsTemplateWithOptions(CreateSmsTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSmsTemplate", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSmsTemplateResponse());
    }

    public CreateSmsTemplateResponse createSmsTemplate(CreateSmsTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSmsTemplateWithOptions(request, runtime);
    }

    public DescribeSmsTemplateStatusResponse describeSmsTemplateStatusWithOptions(DescribeSmsTemplateStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSmsTemplateStatus", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSmsTemplateStatusResponse());
    }

    public DescribeSmsTemplateStatusResponse describeSmsTemplateStatus(DescribeSmsTemplateStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSmsTemplateStatusWithOptions(request, runtime);
    }

    public BindWebHostingCustomDomainResponse bindWebHostingCustomDomainWithOptions(BindWebHostingCustomDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindWebHostingCustomDomain", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new BindWebHostingCustomDomainResponse());
    }

    public BindWebHostingCustomDomainResponse bindWebHostingCustomDomain(BindWebHostingCustomDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindWebHostingCustomDomainWithOptions(request, runtime);
    }

    public CreateFunctionResponse createFunctionWithOptions(CreateFunctionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFunction", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFunctionResponse());
    }

    public CreateFunctionResponse createFunction(CreateFunctionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFunctionWithOptions(request, runtime);
    }

    public DeleteDingtalkOpenPlatformConfigResponse deleteDingtalkOpenPlatformConfigWithOptions(DeleteDingtalkOpenPlatformConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDingtalkOpenPlatformConfig", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDingtalkOpenPlatformConfigResponse());
    }

    public DeleteDingtalkOpenPlatformConfigResponse deleteDingtalkOpenPlatformConfig(DeleteDingtalkOpenPlatformConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDingtalkOpenPlatformConfigWithOptions(request, runtime);
    }

    public ListExtensionsResponse listExtensionsWithOptions(ListExtensionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListExtensions", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListExtensionsResponse());
    }

    public ListExtensionsResponse listExtensions(ListExtensionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listExtensionsWithOptions(request, runtime);
    }

    public EnableSmsServiceResponse enableSmsServiceWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("EnableSmsService", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new EnableSmsServiceResponse());
    }

    public EnableSmsServiceResponse enableSmsService() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableSmsServiceWithOptions(runtime);
    }

    public ReleaseBuiltinFunctionTemplateResponse releaseBuiltinFunctionTemplateWithOptions(ReleaseBuiltinFunctionTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseBuiltinFunctionTemplate", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseBuiltinFunctionTemplateResponse());
    }

    public ReleaseBuiltinFunctionTemplateResponse releaseBuiltinFunctionTemplate(ReleaseBuiltinFunctionTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseBuiltinFunctionTemplateWithOptions(request, runtime);
    }

    public CreateSmsSignResponse createSmsSignWithOptions(CreateSmsSignRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSmsSign", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSmsSignResponse());
    }

    public CreateSmsSignResponse createSmsSign(CreateSmsSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSmsSignWithOptions(request, runtime);
    }

    public UpdateFunctionResponse updateFunctionWithOptions(UpdateFunctionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateFunction", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateFunctionResponse());
    }

    public UpdateFunctionResponse updateFunction(UpdateFunctionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateFunctionWithOptions(request, runtime);
    }

    public UpdateHttpTriggerConfigResponse updateHttpTriggerConfigWithOptions(UpdateHttpTriggerConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateHttpTriggerConfig", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateHttpTriggerConfigResponse());
    }

    public UpdateHttpTriggerConfigResponse updateHttpTriggerConfig(UpdateHttpTriggerConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateHttpTriggerConfigWithOptions(request, runtime);
    }

    public ResetServerSecretResponse resetServerSecretWithOptions(ResetServerSecretRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetServerSecret", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new ResetServerSecretResponse());
    }

    public ResetServerSecretResponse resetServerSecret(ResetServerSecretRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetServerSecretWithOptions(request, runtime);
    }

    public GetWebHostingDomainVerificationContentResponse getWebHostingDomainVerificationContentWithOptions(GetWebHostingDomainVerificationContentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetWebHostingDomainVerificationContent", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetWebHostingDomainVerificationContentResponse());
    }

    public GetWebHostingDomainVerificationContentResponse getWebHostingDomainVerificationContent(GetWebHostingDomainVerificationContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getWebHostingDomainVerificationContentWithOptions(request, runtime);
    }

    public UpdateDingtalkOpenPlatformConfigResponse updateDingtalkOpenPlatformConfigWithOptions(UpdateDingtalkOpenPlatformConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDingtalkOpenPlatformConfig", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDingtalkOpenPlatformConfigResponse());
    }

    public UpdateDingtalkOpenPlatformConfigResponse updateDingtalkOpenPlatformConfig(UpdateDingtalkOpenPlatformConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDingtalkOpenPlatformConfigWithOptions(request, runtime);
    }

    public CheckMpServerlessRoleExistsResponse checkMpServerlessRoleExistsWithOptions(CheckMpServerlessRoleExistsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckMpServerlessRoleExists", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new CheckMpServerlessRoleExistsResponse());
    }

    public CheckMpServerlessRoleExistsResponse checkMpServerlessRoleExists(CheckMpServerlessRoleExistsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkMpServerlessRoleExistsWithOptions(request, runtime);
    }

    public EnableExtensionResponse enableExtensionWithOptions(EnableExtensionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableExtension", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new EnableExtensionResponse());
    }

    public EnableExtensionResponse enableExtension(EnableExtensionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableExtensionWithOptions(request, runtime);
    }

    public ListSmsSignsForAccountResponse listSmsSignsForAccountWithOptions(ListSmsSignsForAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSmsSignsForAccount", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListSmsSignsForAccountResponse());
    }

    public ListSmsSignsForAccountResponse listSmsSignsForAccount(ListSmsSignsForAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSmsSignsForAccountWithOptions(request, runtime);
    }

    public ListCorsDomainsResponse listCorsDomainsWithOptions(ListCorsDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCorsDomains", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListCorsDomainsResponse());
    }

    public ListCorsDomainsResponse listCorsDomains(ListCorsDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCorsDomainsWithOptions(request, runtime);
    }

    public ListDingtalkOpenPlatformConfigsResponse listDingtalkOpenPlatformConfigsWithOptions(ListDingtalkOpenPlatformConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDingtalkOpenPlatformConfigs", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListDingtalkOpenPlatformConfigsResponse());
    }

    public ListDingtalkOpenPlatformConfigsResponse listDingtalkOpenPlatformConfigs(ListDingtalkOpenPlatformConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDingtalkOpenPlatformConfigsWithOptions(request, runtime);
    }

    public CreateDBExportTaskResponse createDBExportTaskWithOptions(CreateDBExportTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDBExportTask", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDBExportTaskResponse());
    }

    public CreateDBExportTaskResponse createDBExportTask(CreateDBExportTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDBExportTaskWithOptions(request, runtime);
    }

    public GetWebHostingConfigResponse getWebHostingConfigWithOptions(GetWebHostingConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetWebHostingConfig", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetWebHostingConfigResponse());
    }

    public GetWebHostingConfigResponse getWebHostingConfig(GetWebHostingConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getWebHostingConfigWithOptions(request, runtime);
    }

    public UnbindWebHostingCustomDomainResponse unbindWebHostingCustomDomainWithOptions(UnbindWebHostingCustomDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindWebHostingCustomDomain", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindWebHostingCustomDomainResponse());
    }

    public UnbindWebHostingCustomDomainResponse unbindWebHostingCustomDomain(UnbindWebHostingCustomDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindWebHostingCustomDomainWithOptions(request, runtime);
    }

    public DescribeSmsTemplateResponse describeSmsTemplateWithOptions(DescribeSmsTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSmsTemplate", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSmsTemplateResponse());
    }

    public DescribeSmsTemplateResponse describeSmsTemplate(DescribeSmsTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSmsTemplateWithOptions(request, runtime);
    }

    public SaveWebHostingCustomDomainCorsConfigResponse saveWebHostingCustomDomainCorsConfigWithOptions(SaveWebHostingCustomDomainCorsConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveWebHostingCustomDomainCorsConfig", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new SaveWebHostingCustomDomainCorsConfigResponse());
    }

    public SaveWebHostingCustomDomainCorsConfigResponse saveWebHostingCustomDomainCorsConfig(SaveWebHostingCustomDomainCorsConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveWebHostingCustomDomainCorsConfigWithOptions(request, runtime);
    }

    public BatchDeleteWebHostingFilesResponse batchDeleteWebHostingFilesWithOptions(BatchDeleteWebHostingFilesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchDeleteWebHostingFiles", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new BatchDeleteWebHostingFilesResponse());
    }

    public BatchDeleteWebHostingFilesResponse batchDeleteWebHostingFiles(BatchDeleteWebHostingFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchDeleteWebHostingFilesWithOptions(request, runtime);
    }

    public DeleteCorsDomainResponse deleteCorsDomainWithOptions(DeleteCorsDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCorsDomain", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCorsDomainResponse());
    }

    public DeleteCorsDomainResponse deleteCorsDomain(DeleteCorsDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCorsDomainWithOptions(request, runtime);
    }

    public DescribeHttpTriggerConfigResponse describeHttpTriggerConfigWithOptions(DescribeHttpTriggerConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHttpTriggerConfig", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHttpTriggerConfigResponse());
    }

    public DescribeHttpTriggerConfigResponse describeHttpTriggerConfig(DescribeHttpTriggerConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHttpTriggerConfigWithOptions(request, runtime);
    }

    public SaveAppAuthTokenResponse saveAppAuthTokenWithOptions(SaveAppAuthTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveAppAuthToken", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new SaveAppAuthTokenResponse());
    }

    public SaveAppAuthTokenResponse saveAppAuthToken(SaveAppAuthTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveAppAuthTokenWithOptions(request, runtime);
    }

    public DescribeSmsSignStatusResponse describeSmsSignStatusWithOptions(DescribeSmsSignStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSmsSignStatus", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSmsSignStatusResponse());
    }

    public DescribeSmsSignStatusResponse describeSmsSignStatus(DescribeSmsSignStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSmsSignStatusWithOptions(request, runtime);
    }

    public SaveWechatOpenPlatformConfigResponse saveWechatOpenPlatformConfigWithOptions(SaveWechatOpenPlatformConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveWechatOpenPlatformConfig", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new SaveWechatOpenPlatformConfigResponse());
    }

    public SaveWechatOpenPlatformConfigResponse saveWechatOpenPlatformConfig(SaveWechatOpenPlatformConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveWechatOpenPlatformConfigWithOptions(request, runtime);
    }

    public DescribeSpaceResponse describeSpaceWithOptions(DescribeSpaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSpace", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSpaceResponse());
    }

    public DescribeSpaceResponse describeSpace(DescribeSpaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSpaceWithOptions(request, runtime);
    }

    public RenameDBCollectionResponse renameDBCollectionWithOptions(RenameDBCollectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RenameDBCollection", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new RenameDBCollectionResponse());
    }

    public RenameDBCollectionResponse renameDBCollection(RenameDBCollectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renameDBCollectionWithOptions(request, runtime);
    }

    public ListSmsSignsResponse listSmsSignsWithOptions(ListSmsSignsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSmsSigns", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListSmsSignsResponse());
    }

    public ListSmsSignsResponse listSmsSigns(ListSmsSignsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSmsSignsWithOptions(request, runtime);
    }

    public DescribeProductOpenStatusResponse describeProductOpenStatusWithOptions(DescribeProductOpenStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeProductOpenStatus", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeProductOpenStatusResponse());
    }

    public DescribeProductOpenStatusResponse describeProductOpenStatus(DescribeProductOpenStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeProductOpenStatusWithOptions(request, runtime);
    }

    public UpdateSmsSignResponse updateSmsSignWithOptions(UpdateSmsSignRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSmsSign", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSmsSignResponse());
    }

    public UpdateSmsSignResponse updateSmsSign(UpdateSmsSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSmsSignWithOptions(request, runtime);
    }

    public DeleteWebHostingCertificateResponse deleteWebHostingCertificateWithOptions(DeleteWebHostingCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteWebHostingCertificate", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteWebHostingCertificateResponse());
    }

    public DeleteWebHostingCertificateResponse deleteWebHostingCertificate(DeleteWebHostingCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteWebHostingCertificateWithOptions(request, runtime);
    }

    public QueryDBBackupDumpTimesResponse queryDBBackupDumpTimesWithOptions(QueryDBBackupDumpTimesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDBBackupDumpTimes", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDBBackupDumpTimesResponse());
    }

    public QueryDBBackupDumpTimesResponse queryDBBackupDumpTimes(QueryDBBackupDumpTimesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDBBackupDumpTimesWithOptions(request, runtime);
    }

    public DeployFunctionResponse deployFunctionWithOptions(DeployFunctionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeployFunction", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeployFunctionResponse());
    }

    public DeployFunctionResponse deployFunction(DeployFunctionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deployFunctionWithOptions(request, runtime);
    }

    public AttachSmsSignResponse attachSmsSignWithOptions(AttachSmsSignRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachSmsSign", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new AttachSmsSignResponse());
    }

    public AttachSmsSignResponse attachSmsSign(AttachSmsSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachSmsSignWithOptions(request, runtime);
    }

    public UpdateServicePolicyResponse updateServicePolicyWithOptions(UpdateServicePolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateServicePolicy", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateServicePolicyResponse());
    }

    public UpdateServicePolicyResponse updateServicePolicy(UpdateServicePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateServicePolicyWithOptions(request, runtime);
    }

    public AddCorsDomainResponse addCorsDomainWithOptions(AddCorsDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddCorsDomain", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new AddCorsDomainResponse());
    }

    public AddCorsDomainResponse addCorsDomain(AddCorsDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addCorsDomainWithOptions(request, runtime);
    }

    public DescribeWebHostingFileResponse describeWebHostingFileWithOptions(DescribeWebHostingFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeWebHostingFile", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeWebHostingFileResponse());
    }

    public DescribeWebHostingFileResponse describeWebHostingFile(DescribeWebHostingFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeWebHostingFileWithOptions(request, runtime);
    }

    public UpdateSmsTemplateResponse updateSmsTemplateWithOptions(UpdateSmsTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSmsTemplate", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSmsTemplateResponse());
    }

    public UpdateSmsTemplateResponse updateSmsTemplate(UpdateSmsTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSmsTemplateWithOptions(request, runtime);
    }

    public VerifyBuiltinFunctionTemplateResponse verifyBuiltinFunctionTemplateWithOptions(VerifyBuiltinFunctionTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VerifyBuiltinFunctionTemplate", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new VerifyBuiltinFunctionTemplateResponse());
    }

    public VerifyBuiltinFunctionTemplateResponse verifyBuiltinFunctionTemplate(VerifyBuiltinFunctionTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyBuiltinFunctionTemplateWithOptions(request, runtime);
    }

    public DeleteWebHostingFileResponse deleteWebHostingFileWithOptions(DeleteWebHostingFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteWebHostingFile", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteWebHostingFileResponse());
    }

    public DeleteWebHostingFileResponse deleteWebHostingFile(DeleteWebHostingFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteWebHostingFileWithOptions(request, runtime);
    }

    public ListWebHostingCustomDomainsResponse listWebHostingCustomDomainsWithOptions(ListWebHostingCustomDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListWebHostingCustomDomains", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListWebHostingCustomDomainsResponse());
    }

    public ListWebHostingCustomDomainsResponse listWebHostingCustomDomains(ListWebHostingCustomDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listWebHostingCustomDomainsWithOptions(request, runtime);
    }

    public RunDBCommandResponse runDBCommandWithOptions(RunDBCommandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RunDBCommand", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new RunDBCommandResponse());
    }

    public RunDBCommandResponse runDBCommand(RunDBCommandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.runDBCommandWithOptions(request, runtime);
    }

    public DeleteFunctionResponse deleteFunctionWithOptions(DeleteFunctionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFunction", "2019-06-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFunctionResponse());
    }

    public DeleteFunctionResponse deleteFunction(DeleteFunctionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFunctionWithOptions(request, runtime);
    }
}
