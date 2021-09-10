// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109;

import com.aliyun.tea.*;
import com.aliyun.ice20201109.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "ice.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "ice.aliyuncs.com"),
            new TeaPair("ap-south-1", "ice.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "ice.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "ice.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "ice.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "ice.aliyuncs.com"),
            new TeaPair("cn-beijing", "ice.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "ice.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "ice.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "ice.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "ice.aliyuncs.com"),
            new TeaPair("cn-chengdu", "ice.aliyuncs.com"),
            new TeaPair("cn-edge-1", "ice.aliyuncs.com"),
            new TeaPair("cn-fujian", "ice.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "ice.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "ice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "ice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "ice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "ice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "ice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "ice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "ice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "ice.aliyuncs.com"),
            new TeaPair("cn-hongkong", "ice.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "ice.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "ice.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "ice.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "ice.aliyuncs.com"),
            new TeaPair("cn-qingdao", "ice.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "ice.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "ice.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "ice.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "ice.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "ice.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "ice.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "ice.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "ice.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "ice.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "ice.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "ice.aliyuncs.com"),
            new TeaPair("cn-wuhan", "ice.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "ice.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "ice.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "ice.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "ice.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "ice.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "ice.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "ice.aliyuncs.com"),
            new TeaPair("eu-central-1", "ice.aliyuncs.com"),
            new TeaPair("eu-west-1", "ice.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "ice.aliyuncs.com"),
            new TeaPair("me-east-1", "ice.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "ice.aliyuncs.com"),
            new TeaPair("us-east-1", "ice.aliyuncs.com"),
            new TeaPair("us-west-1", "ice.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ice", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ListSmartJobsResponse listSmartJobsWithOptions(ListSmartJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSmartJobs", "2020-11-09", "HTTPS", "GET", "AK", "json", req, runtime), new ListSmartJobsResponse());
    }

    public ListSmartJobsResponse listSmartJobs(ListSmartJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSmartJobsWithOptions(request, runtime);
    }

    public GetLiveEditingJobResponse getLiveEditingJobWithOptions(GetLiveEditingJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLiveEditingJob", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new GetLiveEditingJobResponse());
    }

    public GetLiveEditingJobResponse getLiveEditingJob(GetLiveEditingJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLiveEditingJobWithOptions(request, runtime);
    }

    public DescribeRelatedAuthorizationStatusResponse describeRelatedAuthorizationStatusWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeRelatedAuthorizationStatus", "2020-11-09", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeRelatedAuthorizationStatusResponse());
    }

    public DescribeRelatedAuthorizationStatusResponse describeRelatedAuthorizationStatus() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRelatedAuthorizationStatusWithOptions(runtime);
    }

    public DeleteSmartJobResponse deleteSmartJobWithOptions(DeleteSmartJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSmartJob", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSmartJobResponse());
    }

    public DeleteSmartJobResponse deleteSmartJob(DeleteSmartJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSmartJobWithOptions(request, runtime);
    }

    public AddTemplateResponse addTemplateWithOptions(AddTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddTemplate", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new AddTemplateResponse());
    }

    public AddTemplateResponse addTemplate(AddTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addTemplateWithOptions(request, runtime);
    }

    public UpdateEditingProjectResponse updateEditingProjectWithOptions(UpdateEditingProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateEditingProject", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateEditingProjectResponse());
    }

    public UpdateEditingProjectResponse updateEditingProject(UpdateEditingProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEditingProjectWithOptions(request, runtime);
    }

    public ListMediaProducingJobsResponse listMediaProducingJobsWithOptions(ListMediaProducingJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListMediaProducingJobs", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new ListMediaProducingJobsResponse());
    }

    public ListMediaProducingJobsResponse listMediaProducingJobs(ListMediaProducingJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMediaProducingJobsWithOptions(request, runtime);
    }

    public GetEditingProjectMaterialsResponse getEditingProjectMaterialsWithOptions(GetEditingProjectMaterialsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEditingProjectMaterials", "2020-11-09", "HTTPS", "GET", "AK", "json", req, runtime), new GetEditingProjectMaterialsResponse());
    }

    public GetEditingProjectMaterialsResponse getEditingProjectMaterials(GetEditingProjectMaterialsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEditingProjectMaterialsWithOptions(request, runtime);
    }

    public GetDefaultStorageLocationResponse getDefaultStorageLocationWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetDefaultStorageLocation", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new GetDefaultStorageLocationResponse());
    }

    public GetDefaultStorageLocationResponse getDefaultStorageLocation() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDefaultStorageLocationWithOptions(runtime);
    }

    public DeleteMediaInfosResponse deleteMediaInfosWithOptions(DeleteMediaInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMediaInfos", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMediaInfosResponse());
    }

    public DeleteMediaInfosResponse deleteMediaInfos(DeleteMediaInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMediaInfosWithOptions(request, runtime);
    }

    public SetEventCallbackResponse setEventCallbackWithOptions(SetEventCallbackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetEventCallback", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new SetEventCallbackResponse());
    }

    public SetEventCallbackResponse setEventCallback(SetEventCallbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setEventCallbackWithOptions(request, runtime);
    }

    public GetTemplateResponse getTemplateWithOptions(GetTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTemplate", "2020-11-09", "HTTPS", "GET", "AK", "json", req, runtime), new GetTemplateResponse());
    }

    public GetTemplateResponse getTemplate(GetTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTemplateWithOptions(request, runtime);
    }

    public RegisterMediaInfoResponse registerMediaInfoWithOptions(RegisterMediaInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RegisterMediaInfo", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new RegisterMediaInfoResponse());
    }

    public RegisterMediaInfoResponse registerMediaInfo(RegisterMediaInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerMediaInfoWithOptions(request, runtime);
    }

    public CreateEditingProjectResponse createEditingProjectWithOptions(CreateEditingProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateEditingProject", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new CreateEditingProjectResponse());
    }

    public CreateEditingProjectResponse createEditingProject(CreateEditingProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEditingProjectWithOptions(request, runtime);
    }

    public BatchGetMediaInfosResponse batchGetMediaInfosWithOptions(BatchGetMediaInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchGetMediaInfos", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new BatchGetMediaInfosResponse());
    }

    public BatchGetMediaInfosResponse batchGetMediaInfos(BatchGetMediaInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetMediaInfosWithOptions(request, runtime);
    }

    public SetDefaultStorageLocationResponse setDefaultStorageLocationWithOptions(SetDefaultStorageLocationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetDefaultStorageLocation", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new SetDefaultStorageLocationResponse());
    }

    public SetDefaultStorageLocationResponse setDefaultStorageLocation(SetDefaultStorageLocationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDefaultStorageLocationWithOptions(request, runtime);
    }

    public UpdateMediaInfoResponse updateMediaInfoWithOptions(UpdateMediaInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateMediaInfo", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateMediaInfoResponse());
    }

    public UpdateMediaInfoResponse updateMediaInfo(UpdateMediaInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateMediaInfoWithOptions(request, runtime);
    }

    public GetMediaProducingJobResponse getMediaProducingJobWithOptions(GetMediaProducingJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMediaProducingJob", "2020-11-09", "HTTPS", "GET", "AK", "json", req, runtime), new GetMediaProducingJobResponse());
    }

    public GetMediaProducingJobResponse getMediaProducingJob(GetMediaProducingJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMediaProducingJobWithOptions(request, runtime);
    }

    public DescribeIceProductStatusResponse describeIceProductStatusWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeIceProductStatus", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeIceProductStatusResponse());
    }

    public DescribeIceProductStatusResponse describeIceProductStatus() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIceProductStatusWithOptions(runtime);
    }

    public GetLiveEditingIndexFileResponse getLiveEditingIndexFileWithOptions(GetLiveEditingIndexFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLiveEditingIndexFile", "2020-11-09", "HTTPS", "GET", "AK", "json", req, runtime), new GetLiveEditingIndexFileResponse());
    }

    public GetLiveEditingIndexFileResponse getLiveEditingIndexFile(GetLiveEditingIndexFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLiveEditingIndexFileWithOptions(request, runtime);
    }

    public ListMediaBasicInfosResponse listMediaBasicInfosWithOptions(ListMediaBasicInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListMediaBasicInfos", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new ListMediaBasicInfosResponse());
    }

    public ListMediaBasicInfosResponse listMediaBasicInfos(ListMediaBasicInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMediaBasicInfosWithOptions(request, runtime);
    }

    public SubmitSubtitleProduceJobResponse submitSubtitleProduceJobWithOptions(SubmitSubtitleProduceJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitSubtitleProduceJob", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitSubtitleProduceJobResponse());
    }

    public SubmitSubtitleProduceJobResponse submitSubtitleProduceJob(SubmitSubtitleProduceJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitSubtitleProduceJobWithOptions(request, runtime);
    }

    public SubmitKeyWordCutJobResponse submitKeyWordCutJobWithOptions(SubmitKeyWordCutJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitKeyWordCutJob", "2020-11-09", "HTTPS", "GET", "AK", "json", req, runtime), new SubmitKeyWordCutJobResponse());
    }

    public SubmitKeyWordCutJobResponse submitKeyWordCutJob(SubmitKeyWordCutJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitKeyWordCutJobWithOptions(request, runtime);
    }

    public AddEditingProjectMaterialsResponse addEditingProjectMaterialsWithOptions(AddEditingProjectMaterialsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddEditingProjectMaterials", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new AddEditingProjectMaterialsResponse());
    }

    public AddEditingProjectMaterialsResponse addEditingProjectMaterials(AddEditingProjectMaterialsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addEditingProjectMaterialsWithOptions(request, runtime);
    }

    public SubmitASRJobResponse submitASRJobWithOptions(SubmitASRJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitASRJob", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitASRJobResponse());
    }

    public SubmitASRJobResponse submitASRJob(SubmitASRJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitASRJobWithOptions(request, runtime);
    }

    public GetEditingProjectResponse getEditingProjectWithOptions(GetEditingProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEditingProject", "2020-11-09", "HTTPS", "GET", "AK", "json", req, runtime), new GetEditingProjectResponse());
    }

    public GetEditingProjectResponse getEditingProject(GetEditingProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEditingProjectWithOptions(request, runtime);
    }

    public ListSysTemplatesResponse listSysTemplatesWithOptions(ListSysTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSysTemplates", "2020-11-09", "HTTPS", "GET", "AK", "json", req, runtime), new ListSysTemplatesResponse());
    }

    public ListSysTemplatesResponse listSysTemplates(ListSysTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSysTemplatesWithOptions(request, runtime);
    }

    public DeleteTemplateResponse deleteTemplateWithOptions(DeleteTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTemplate", "2020-11-09", "HTTPS", "GET", "AK", "json", req, runtime), new DeleteTemplateResponse());
    }

    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTemplateWithOptions(request, runtime);
    }

    public SubmitIRJobResponse submitIRJobWithOptions(SubmitIRJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitIRJob", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitIRJobResponse());
    }

    public SubmitIRJobResponse submitIRJob(SubmitIRJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitIRJobWithOptions(request, runtime);
    }

    public DeleteEditingProjectMaterialsResponse deleteEditingProjectMaterialsWithOptions(DeleteEditingProjectMaterialsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteEditingProjectMaterials", "2020-11-09", "HTTPS", "GET", "AK", "json", req, runtime), new DeleteEditingProjectMaterialsResponse());
    }

    public DeleteEditingProjectMaterialsResponse deleteEditingProjectMaterials(DeleteEditingProjectMaterialsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEditingProjectMaterialsWithOptions(request, runtime);
    }

    public SearchEditingProjectResponse searchEditingProjectWithOptions(SearchEditingProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchEditingProject", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new SearchEditingProjectResponse());
    }

    public SearchEditingProjectResponse searchEditingProject(SearchEditingProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchEditingProjectWithOptions(request, runtime);
    }

    public ListTemplatesResponse listTemplatesWithOptions(ListTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTemplates", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new ListTemplatesResponse());
    }

    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTemplatesWithOptions(request, runtime);
    }

    public DeleteEditingProjectsResponse deleteEditingProjectsWithOptions(DeleteEditingProjectsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteEditingProjects", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteEditingProjectsResponse());
    }

    public DeleteEditingProjectsResponse deleteEditingProjects(DeleteEditingProjectsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEditingProjectsWithOptions(request, runtime);
    }

    public GetMediaInfoResponse getMediaInfoWithOptions(GetMediaInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMediaInfo", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new GetMediaInfoResponse());
    }

    public GetMediaInfoResponse getMediaInfo(GetMediaInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMediaInfoWithOptions(request, runtime);
    }

    public SubmitSmartJobResponse submitSmartJobWithOptions(SubmitSmartJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitSmartJob", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitSmartJobResponse());
    }

    public SubmitSmartJobResponse submitSmartJob(SubmitSmartJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitSmartJobWithOptions(request, runtime);
    }

    public SubmitDelogoJobResponse submitDelogoJobWithOptions(SubmitDelogoJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitDelogoJob", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitDelogoJobResponse());
    }

    public SubmitDelogoJobResponse submitDelogoJob(SubmitDelogoJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitDelogoJobWithOptions(request, runtime);
    }

    public UpdateTemplateResponse updateTemplateWithOptions(UpdateTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateTemplate", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateTemplateResponse());
    }

    public UpdateTemplateResponse updateTemplate(UpdateTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTemplateWithOptions(request, runtime);
    }

    public SubmitAudioProduceJobResponse submitAudioProduceJobWithOptions(SubmitAudioProduceJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitAudioProduceJob", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitAudioProduceJobResponse());
    }

    public SubmitAudioProduceJobResponse submitAudioProduceJob(SubmitAudioProduceJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitAudioProduceJobWithOptions(request, runtime);
    }

    public SubmitMediaProducingJobResponse submitMediaProducingJobWithOptions(SubmitMediaProducingJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitMediaProducingJob", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitMediaProducingJobResponse());
    }

    public SubmitMediaProducingJobResponse submitMediaProducingJob(SubmitMediaProducingJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitMediaProducingJobWithOptions(request, runtime);
    }

    public UpdateSmartJobResponse updateSmartJobWithOptions(UpdateSmartJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSmartJob", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSmartJobResponse());
    }

    public UpdateSmartJobResponse updateSmartJob(UpdateSmartJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSmartJobWithOptions(request, runtime);
    }

    public ListAllPublicMediaTagsResponse listAllPublicMediaTagsWithOptions(ListAllPublicMediaTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAllPublicMediaTags", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new ListAllPublicMediaTagsResponse());
    }

    public ListAllPublicMediaTagsResponse listAllPublicMediaTags(ListAllPublicMediaTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAllPublicMediaTagsWithOptions(request, runtime);
    }

    public SubmitMattingJobResponse submitMattingJobWithOptions(SubmitMattingJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitMattingJob", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitMattingJobResponse());
    }

    public SubmitMattingJobResponse submitMattingJob(SubmitMattingJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitMattingJobWithOptions(request, runtime);
    }

    public GetEventCallbackResponse getEventCallbackWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetEventCallback", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new GetEventCallbackResponse());
    }

    public GetEventCallbackResponse getEventCallback() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEventCallbackWithOptions(runtime);
    }

    public ListPublicMediaBasicInfosResponse listPublicMediaBasicInfosWithOptions(ListPublicMediaBasicInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPublicMediaBasicInfos", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new ListPublicMediaBasicInfosResponse());
    }

    public ListPublicMediaBasicInfosResponse listPublicMediaBasicInfos(ListPublicMediaBasicInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPublicMediaBasicInfosWithOptions(request, runtime);
    }

    public SubmitCoverJobResponse submitCoverJobWithOptions(SubmitCoverJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitCoverJob", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitCoverJobResponse());
    }

    public SubmitCoverJobResponse submitCoverJob(SubmitCoverJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitCoverJobWithOptions(request, runtime);
    }

    public GetSmartHandleJobResponse getSmartHandleJobWithOptions(GetSmartHandleJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSmartHandleJob", "2020-11-09", "HTTPS", "GET", "AK", "json", req, runtime), new GetSmartHandleJobResponse());
    }

    public GetSmartHandleJobResponse getSmartHandleJob(GetSmartHandleJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSmartHandleJobWithOptions(request, runtime);
    }

    public SubmitH2VJobResponse submitH2VJobWithOptions(SubmitH2VJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitH2VJob", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitH2VJobResponse());
    }

    public SubmitH2VJobResponse submitH2VJob(SubmitH2VJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitH2VJobWithOptions(request, runtime);
    }

    public SubmitLiveEditingJobResponse submitLiveEditingJobWithOptions(SubmitLiveEditingJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitLiveEditingJob", "2020-11-09", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitLiveEditingJobResponse());
    }

    public SubmitLiveEditingJobResponse submitLiveEditingJob(SubmitLiveEditingJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitLiveEditingJobWithOptions(request, runtime);
    }

    public SubmitPPTCutJobResponse submitPPTCutJobWithOptions(SubmitPPTCutJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitPPTCutJob", "2020-11-09", "HTTPS", "GET", "AK", "json", req, runtime), new SubmitPPTCutJobResponse());
    }

    public SubmitPPTCutJobResponse submitPPTCutJob(SubmitPPTCutJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitPPTCutJobWithOptions(request, runtime);
    }
}
