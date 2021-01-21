// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120;

import com.aliyun.tea.*;
import com.aliyun.linkvisual20180120.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.tearpc.*;
import com.aliyun.tearpc.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "linkvisual.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "linkvisual.aliyuncs.com"),
            new TeaPair("ap-south-1", "linkvisual.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "linkvisual.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "linkvisual.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "linkvisual.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-beijing", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-chengdu", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-edge-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-fujian", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hongkong", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-qingdao", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-wuhan", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "linkvisual.aliyuncs.com"),
            new TeaPair("eu-central-1", "linkvisual.aliyuncs.com"),
            new TeaPair("eu-west-1", "linkvisual.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "linkvisual.aliyuncs.com"),
            new TeaPair("me-east-1", "linkvisual.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "linkvisual.aliyuncs.com"),
            new TeaPair("us-east-1", "linkvisual.aliyuncs.com"),
            new TeaPair("us-west-1", "linkvisual.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("linkvisual", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public UpdatePictureSearchAppResponse updatePictureSearchAppWithOptions(UpdatePictureSearchAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdatePictureSearchApp", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdatePictureSearchAppResponse());
    }

    public UpdatePictureSearchAppResponse updatePictureSearchApp(UpdatePictureSearchAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updatePictureSearchAppWithOptions(request, runtime);
    }

    public GetPictureSearchJobStatusResponse getPictureSearchJobStatusWithOptions(GetPictureSearchJobStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPictureSearchJobStatus", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetPictureSearchJobStatusResponse());
    }

    public GetPictureSearchJobStatusResponse getPictureSearchJobStatus(GetPictureSearchJobStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPictureSearchJobStatusWithOptions(request, runtime);
    }

    public QueryPictureSearchJobResultResponse queryPictureSearchJobResultWithOptions(QueryPictureSearchJobResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryPictureSearchJobResult", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryPictureSearchJobResultResponse());
    }

    public QueryPictureSearchJobResultResponse queryPictureSearchJobResult(QueryPictureSearchJobResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPictureSearchJobResultWithOptions(request, runtime);
    }

    public QueryPictureSearchJobResponse queryPictureSearchJobWithOptions(QueryPictureSearchJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryPictureSearchJob", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryPictureSearchJobResponse());
    }

    public QueryPictureSearchJobResponse queryPictureSearchJob(QueryPictureSearchJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPictureSearchJobWithOptions(request, runtime);
    }

    public QueryPictureSearchAppsResponse queryPictureSearchAppsWithOptions(QueryPictureSearchAppsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryPictureSearchApps", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryPictureSearchAppsResponse());
    }

    public QueryPictureSearchAppsResponse queryPictureSearchApps(QueryPictureSearchAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPictureSearchAppsWithOptions(request, runtime);
    }

    public CreatePictureSearchJobResponse createPictureSearchJobWithOptions(CreatePictureSearchJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreatePictureSearchJob", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreatePictureSearchJobResponse());
    }

    public CreatePictureSearchJobResponse createPictureSearchJob(CreatePictureSearchJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPictureSearchJobWithOptions(request, runtime);
    }

    public GetPictureInfoWithVectorIdsResponse getPictureInfoWithVectorIdsWithOptions(GetPictureInfoWithVectorIdsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPictureInfoWithVectorIds", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetPictureInfoWithVectorIdsResponse());
    }

    public GetPictureInfoWithVectorIdsResponse getPictureInfoWithVectorIds(GetPictureInfoWithVectorIdsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPictureInfoWithVectorIdsWithOptions(request, runtime);
    }

    public QueryPictureSearchAiboxesResponse queryPictureSearchAiboxesWithOptions(QueryPictureSearchAiboxesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryPictureSearchAiboxes", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryPictureSearchAiboxesResponse());
    }

    public QueryPictureSearchAiboxesResponse queryPictureSearchAiboxes(QueryPictureSearchAiboxesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPictureSearchAiboxesWithOptions(request, runtime);
    }

    public ListDeployTaskByModelIdAndDevicesResponse listDeployTaskByModelIdAndDevicesWithOptions(ListDeployTaskByModelIdAndDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDeployTaskByModelIdAndDevices", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ListDeployTaskByModelIdAndDevicesResponse());
    }

    public ListDeployTaskByModelIdAndDevicesResponse listDeployTaskByModelIdAndDevices(ListDeployTaskByModelIdAndDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDeployTaskByModelIdAndDevicesWithOptions(request, runtime);
    }

    public QueryVoiceIntercomResponse queryVoiceIntercomWithOptions(QueryVoiceIntercomRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryVoiceIntercom", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryVoiceIntercomResponse());
    }

    public QueryVoiceIntercomResponse queryVoiceIntercom(QueryVoiceIntercomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryVoiceIntercomWithOptions(request, runtime);
    }

    public DeleteFaceUserPictureResponse deleteFaceUserPictureWithOptions(DeleteFaceUserPictureRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteFaceUserPicture", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteFaceUserPictureResponse());
    }

    public DeleteFaceUserPictureResponse deleteFaceUserPicture(DeleteFaceUserPictureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFaceUserPictureWithOptions(request, runtime);
    }

    public AddFaceUserPictureResponse addFaceUserPictureWithOptions(AddFaceUserPictureRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddFaceUserPicture", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new AddFaceUserPictureResponse());
    }

    public AddFaceUserPictureResponse addFaceUserPicture(AddFaceUserPictureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addFaceUserPictureWithOptions(request, runtime);
    }

    public GetAlgorithmDetailByNameResponse getAlgorithmDetailByNameWithOptions(GetAlgorithmDetailByNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAlgorithmDetailByName", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetAlgorithmDetailByNameResponse());
    }

    public GetAlgorithmDetailByNameResponse getAlgorithmDetailByName(GetAlgorithmDetailByNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAlgorithmDetailByNameWithOptions(request, runtime);
    }

    public GetModelDetailByIdResponse getModelDetailByIdWithOptions(GetModelDetailByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetModelDetailById", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetModelDetailByIdResponse());
    }

    public GetModelDetailByIdResponse getModelDetailById(GetModelDetailByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getModelDetailByIdWithOptions(request, runtime);
    }

    public UpdateModelResponse updateModelWithOptions(UpdateModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateModel", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateModelResponse());
    }

    public UpdateModelResponse updateModel(UpdateModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateModelWithOptions(request, runtime);
    }

    public ListModelVersionsByPageResponse listModelVersionsByPageWithOptions(ListModelVersionsByPageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListModelVersionsByPage", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ListModelVersionsByPageResponse());
    }

    public ListModelVersionsByPageResponse listModelVersionsByPage(ListModelVersionsByPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listModelVersionsByPageWithOptions(request, runtime);
    }

    public DeleteAlgorithmResponse deleteAlgorithmWithOptions(DeleteAlgorithmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteAlgorithm", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteAlgorithmResponse());
    }

    public DeleteAlgorithmResponse deleteAlgorithm(DeleteAlgorithmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAlgorithmWithOptions(request, runtime);
    }

    public GetModelOssPolicyResponse getModelOssPolicyWithOptions(GetModelOssPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetModelOssPolicy", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetModelOssPolicyResponse());
    }

    public GetModelOssPolicyResponse getModelOssPolicy(GetModelOssPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getModelOssPolicyWithOptions(request, runtime);
    }

    public ListAlgorithmsByPageResponse listAlgorithmsByPageWithOptions(ListAlgorithmsByPageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAlgorithmsByPage", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ListAlgorithmsByPageResponse());
    }

    public ListAlgorithmsByPageResponse listAlgorithmsByPage(ListAlgorithmsByPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAlgorithmsByPageWithOptions(request, runtime);
    }

    public GetAlgorithmDetailByIdResponse getAlgorithmDetailByIdWithOptions(GetAlgorithmDetailByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAlgorithmDetailById", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetAlgorithmDetailByIdResponse());
    }

    public GetAlgorithmDetailByIdResponse getAlgorithmDetailById(GetAlgorithmDetailByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAlgorithmDetailByIdWithOptions(request, runtime);
    }

    public GetModelDetailResponse getModelDetailWithOptions(GetModelDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetModelDetail", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetModelDetailResponse());
    }

    public GetModelDetailResponse getModelDetail(GetModelDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getModelDetailWithOptions(request, runtime);
    }

    public DeleteModelResponse deleteModelWithOptions(DeleteModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteModel", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteModelResponse());
    }

    public DeleteModelResponse deleteModel(DeleteModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteModelWithOptions(request, runtime);
    }

    public ListDeployTaskByPageResponse listDeployTaskByPageWithOptions(ListDeployTaskByPageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDeployTaskByPage", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ListDeployTaskByPageResponse());
    }

    public ListDeployTaskByPageResponse listDeployTaskByPage(ListDeployTaskByPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDeployTaskByPageWithOptions(request, runtime);
    }

    public CreateAlgorithmResponse createAlgorithmWithOptions(CreateAlgorithmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateAlgorithm", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateAlgorithmResponse());
    }

    public CreateAlgorithmResponse createAlgorithm(CreateAlgorithmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAlgorithmWithOptions(request, runtime);
    }

    public DeployModelBatchResponse deployModelBatchWithOptions(DeployModelBatchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeployModelBatch", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeployModelBatchResponse());
    }

    public DeployModelBatchResponse deployModelBatch(DeployModelBatchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deployModelBatchWithOptions(request, runtime);
    }

    public CreateModelResponse createModelWithOptions(CreateModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateModel", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateModelResponse());
    }

    public CreateModelResponse createModel(CreateModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createModelWithOptions(request, runtime);
    }

    public ListModelsByPageResponse listModelsByPageWithOptions(ListModelsByPageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListModelsByPage", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ListModelsByPageResponse());
    }

    public ListModelsByPageResponse listModelsByPage(ListModelsByPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listModelsByPageWithOptions(request, runtime);
    }

    public GetPictureWithVectorIdResponse getPictureWithVectorIdWithOptions(GetPictureWithVectorIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPictureWithVectorId", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetPictureWithVectorIdResponse());
    }

    public GetPictureWithVectorIdResponse getPictureWithVectorId(GetPictureWithVectorIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPictureWithVectorIdWithOptions(request, runtime);
    }

    public QueryPictureSearchDevicesResponse queryPictureSearchDevicesWithOptions(QueryPictureSearchDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryPictureSearchDevices", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryPictureSearchDevicesResponse());
    }

    public QueryPictureSearchDevicesResponse queryPictureSearchDevices(QueryPictureSearchDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPictureSearchDevicesWithOptions(request, runtime);
    }

    public QueryPictureSearchAppResponse queryPictureSearchAppWithOptions(QueryPictureSearchAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryPictureSearchApp", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryPictureSearchAppResponse());
    }

    public QueryPictureSearchAppResponse queryPictureSearchApp(QueryPictureSearchAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPictureSearchAppWithOptions(request, runtime);
    }

    public DetectUserFaceByUrlResponse detectUserFaceByUrlWithOptions(DetectUserFaceByUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DetectUserFaceByUrl", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DetectUserFaceByUrlResponse());
    }

    public DetectUserFaceByUrlResponse detectUserFaceByUrl(DetectUserFaceByUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detectUserFaceByUrlWithOptions(request, runtime);
    }

    public PictureSearchPictureResponse pictureSearchPictureWithOptions(PictureSearchPictureRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PictureSearchPicture", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new PictureSearchPictureResponse());
    }

    public PictureSearchPictureResponse pictureSearchPicture(PictureSearchPictureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pictureSearchPictureWithOptions(request, runtime);
    }

    public UnbindPictureSearchAppWithDevicesResponse unbindPictureSearchAppWithDevicesWithOptions(UnbindPictureSearchAppWithDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnbindPictureSearchAppWithDevices", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UnbindPictureSearchAppWithDevicesResponse());
    }

    public UnbindPictureSearchAppWithDevicesResponse unbindPictureSearchAppWithDevices(UnbindPictureSearchAppWithDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindPictureSearchAppWithDevicesWithOptions(request, runtime);
    }

    public BindPictureSearchAppWithDevicesResponse bindPictureSearchAppWithDevicesWithOptions(BindPictureSearchAppWithDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BindPictureSearchAppWithDevices", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BindPictureSearchAppWithDevicesResponse());
    }

    public BindPictureSearchAppWithDevicesResponse bindPictureSearchAppWithDevices(BindPictureSearchAppWithDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindPictureSearchAppWithDevicesWithOptions(request, runtime);
    }

    public CreatePictureSearchAppResponse createPictureSearchAppWithOptions(CreatePictureSearchAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreatePictureSearchApp", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreatePictureSearchAppResponse());
    }

    public CreatePictureSearchAppResponse createPictureSearchApp(CreatePictureSearchAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPictureSearchAppWithOptions(request, runtime);
    }

    public UpdateFaceUserGroupAndDeviceGroupRelationResponse updateFaceUserGroupAndDeviceGroupRelationWithOptions(UpdateFaceUserGroupAndDeviceGroupRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateFaceUserGroupAndDeviceGroupRelation", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateFaceUserGroupAndDeviceGroupRelationResponse());
    }

    public UpdateFaceUserGroupAndDeviceGroupRelationResponse updateFaceUserGroupAndDeviceGroupRelation(UpdateFaceUserGroupAndDeviceGroupRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateFaceUserGroupAndDeviceGroupRelationWithOptions(request, runtime);
    }

    public AddFaceDeviceGroupResponse addFaceDeviceGroupWithOptions(AddFaceDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddFaceDeviceGroup", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new AddFaceDeviceGroupResponse());
    }

    public AddFaceDeviceGroupResponse addFaceDeviceGroup(AddFaceDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addFaceDeviceGroupWithOptions(request, runtime);
    }

    public AddFaceDeviceToDeviceGroupResponse addFaceDeviceToDeviceGroupWithOptions(AddFaceDeviceToDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddFaceDeviceToDeviceGroup", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new AddFaceDeviceToDeviceGroupResponse());
    }

    public AddFaceDeviceToDeviceGroupResponse addFaceDeviceToDeviceGroup(AddFaceDeviceToDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addFaceDeviceToDeviceGroupWithOptions(request, runtime);
    }

    public RemoveFaceDeviceFromDeviceGroupResponse removeFaceDeviceFromDeviceGroupWithOptions(RemoveFaceDeviceFromDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveFaceDeviceFromDeviceGroup", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new RemoveFaceDeviceFromDeviceGroupResponse());
    }

    public RemoveFaceDeviceFromDeviceGroupResponse removeFaceDeviceFromDeviceGroup(RemoveFaceDeviceFromDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeFaceDeviceFromDeviceGroupWithOptions(request, runtime);
    }

    public AddFaceUserToUserGroupResponse addFaceUserToUserGroupWithOptions(AddFaceUserToUserGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddFaceUserToUserGroup", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new AddFaceUserToUserGroupResponse());
    }

    public AddFaceUserToUserGroupResponse addFaceUserToUserGroup(AddFaceUserToUserGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addFaceUserToUserGroupWithOptions(request, runtime);
    }

    public DeleteFaceUserGroupResponse deleteFaceUserGroupWithOptions(DeleteFaceUserGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteFaceUserGroup", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteFaceUserGroupResponse());
    }

    public DeleteFaceUserGroupResponse deleteFaceUserGroup(DeleteFaceUserGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFaceUserGroupWithOptions(request, runtime);
    }

    public CheckFaceUserDoExistOnDeviceResponse checkFaceUserDoExistOnDeviceWithOptions(CheckFaceUserDoExistOnDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckFaceUserDoExistOnDevice", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CheckFaceUserDoExistOnDeviceResponse());
    }

    public CheckFaceUserDoExistOnDeviceResponse checkFaceUserDoExistOnDevice(CheckFaceUserDoExistOnDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkFaceUserDoExistOnDeviceWithOptions(request, runtime);
    }

    public RemoveFaceUserFromUserGroupResponse removeFaceUserFromUserGroupWithOptions(RemoveFaceUserFromUserGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveFaceUserFromUserGroup", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new RemoveFaceUserFromUserGroupResponse());
    }

    public RemoveFaceUserFromUserGroupResponse removeFaceUserFromUserGroup(RemoveFaceUserFromUserGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeFaceUserFromUserGroupWithOptions(request, runtime);
    }

    public DeleteFaceUserGroupAndDeviceGroupRelationResponse deleteFaceUserGroupAndDeviceGroupRelationWithOptions(DeleteFaceUserGroupAndDeviceGroupRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteFaceUserGroupAndDeviceGroupRelation", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteFaceUserGroupAndDeviceGroupRelationResponse());
    }

    public DeleteFaceUserGroupAndDeviceGroupRelationResponse deleteFaceUserGroupAndDeviceGroupRelation(DeleteFaceUserGroupAndDeviceGroupRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFaceUserGroupAndDeviceGroupRelationWithOptions(request, runtime);
    }

    public QueryFaceAllDeviceGroupResponse queryFaceAllDeviceGroupWithOptions(QueryFaceAllDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryFaceAllDeviceGroup", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryFaceAllDeviceGroupResponse());
    }

    public QueryFaceAllDeviceGroupResponse queryFaceAllDeviceGroup(QueryFaceAllDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryFaceAllDeviceGroupWithOptions(request, runtime);
    }

    public AddFaceUserGroupAndDeviceGroupRelationResponse addFaceUserGroupAndDeviceGroupRelationWithOptions(AddFaceUserGroupAndDeviceGroupRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddFaceUserGroupAndDeviceGroupRelation", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new AddFaceUserGroupAndDeviceGroupRelationResponse());
    }

    public AddFaceUserGroupAndDeviceGroupRelationResponse addFaceUserGroupAndDeviceGroupRelation(AddFaceUserGroupAndDeviceGroupRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addFaceUserGroupAndDeviceGroupRelationWithOptions(request, runtime);
    }

    public DeleteFaceDeviceGroupResponse deleteFaceDeviceGroupWithOptions(DeleteFaceDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteFaceDeviceGroup", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteFaceDeviceGroupResponse());
    }

    public DeleteFaceDeviceGroupResponse deleteFaceDeviceGroup(DeleteFaceDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFaceDeviceGroupWithOptions(request, runtime);
    }

    public UpdateFaceUserResponse updateFaceUserWithOptions(UpdateFaceUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateFaceUser", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateFaceUserResponse());
    }

    public UpdateFaceUserResponse updateFaceUser(UpdateFaceUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateFaceUserWithOptions(request, runtime);
    }

    public QueryFaceUserGroupAndDeviceGroupRelationResponse queryFaceUserGroupAndDeviceGroupRelationWithOptions(QueryFaceUserGroupAndDeviceGroupRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryFaceUserGroupAndDeviceGroupRelation", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryFaceUserGroupAndDeviceGroupRelationResponse());
    }

    public QueryFaceUserGroupAndDeviceGroupRelationResponse queryFaceUserGroupAndDeviceGroupRelation(QueryFaceUserGroupAndDeviceGroupRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryFaceUserGroupAndDeviceGroupRelationWithOptions(request, runtime);
    }

    public AddFaceUserGroupResponse addFaceUserGroupWithOptions(AddFaceUserGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddFaceUserGroup", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new AddFaceUserGroupResponse());
    }

    public AddFaceUserGroupResponse addFaceUserGroup(AddFaceUserGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addFaceUserGroupWithOptions(request, runtime);
    }

    public AddFaceUserResponse addFaceUserWithOptions(AddFaceUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddFaceUser", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new AddFaceUserResponse());
    }

    public AddFaceUserResponse addFaceUser(AddFaceUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addFaceUserWithOptions(request, runtime);
    }

    public QueryFaceAllUserIdsByGroupIdResponse queryFaceAllUserIdsByGroupIdWithOptions(QueryFaceAllUserIdsByGroupIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryFaceAllUserIdsByGroupId", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryFaceAllUserIdsByGroupIdResponse());
    }

    public QueryFaceAllUserIdsByGroupIdResponse queryFaceAllUserIdsByGroupId(QueryFaceAllUserIdsByGroupIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryFaceAllUserIdsByGroupIdWithOptions(request, runtime);
    }

    public QueryFaceDeviceGroupsByDeviceResponse queryFaceDeviceGroupsByDeviceWithOptions(QueryFaceDeviceGroupsByDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryFaceDeviceGroupsByDevice", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryFaceDeviceGroupsByDeviceResponse());
    }

    public QueryFaceDeviceGroupsByDeviceResponse queryFaceDeviceGroupsByDevice(QueryFaceDeviceGroupsByDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryFaceDeviceGroupsByDeviceWithOptions(request, runtime);
    }

    public QueryFaceUserGroupResponse queryFaceUserGroupWithOptions(QueryFaceUserGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryFaceUserGroup", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryFaceUserGroupResponse());
    }

    public QueryFaceUserGroupResponse queryFaceUserGroup(QueryFaceUserGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryFaceUserGroupWithOptions(request, runtime);
    }

    public QueryFaceCustomUserIdByUserIdResponse queryFaceCustomUserIdByUserIdWithOptions(QueryFaceCustomUserIdByUserIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryFaceCustomUserIdByUserId", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryFaceCustomUserIdByUserIdResponse());
    }

    public QueryFaceCustomUserIdByUserIdResponse queryFaceCustomUserIdByUserId(QueryFaceCustomUserIdByUserIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryFaceCustomUserIdByUserIdWithOptions(request, runtime);
    }

    public QueryFaceUserResponse queryFaceUserWithOptions(QueryFaceUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryFaceUser", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryFaceUserResponse());
    }

    public QueryFaceUserResponse queryFaceUser(QueryFaceUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryFaceUserWithOptions(request, runtime);
    }

    public ClearFaceDeviceDBResponse clearFaceDeviceDBWithOptions(ClearFaceDeviceDBRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ClearFaceDeviceDB", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ClearFaceDeviceDBResponse());
    }

    public ClearFaceDeviceDBResponse clearFaceDeviceDB(ClearFaceDeviceDBRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.clearFaceDeviceDBWithOptions(request, runtime);
    }

    public QueryFaceAllUserGroupResponse queryFaceAllUserGroupWithOptions(QueryFaceAllUserGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryFaceAllUserGroup", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryFaceAllUserGroupResponse());
    }

    public QueryFaceAllUserGroupResponse queryFaceAllUserGroup(QueryFaceAllUserGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryFaceAllUserGroupWithOptions(request, runtime);
    }

    public QueryFaceAllUserGroupAndDeviceGroupRelationResponse queryFaceAllUserGroupAndDeviceGroupRelationWithOptions(QueryFaceAllUserGroupAndDeviceGroupRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryFaceAllUserGroupAndDeviceGroupRelation", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryFaceAllUserGroupAndDeviceGroupRelationResponse());
    }

    public QueryFaceAllUserGroupAndDeviceGroupRelationResponse queryFaceAllUserGroupAndDeviceGroupRelation(QueryFaceAllUserGroupAndDeviceGroupRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryFaceAllUserGroupAndDeviceGroupRelationWithOptions(request, runtime);
    }

    public QueryFaceUserIdByCustomUserIdResponse queryFaceUserIdByCustomUserIdWithOptions(QueryFaceUserIdByCustomUserIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryFaceUserIdByCustomUserId", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryFaceUserIdByCustomUserIdResponse());
    }

    public QueryFaceUserIdByCustomUserIdResponse queryFaceUserIdByCustomUserId(QueryFaceUserIdByCustomUserIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryFaceUserIdByCustomUserIdWithOptions(request, runtime);
    }

    public DeleteFaceUserResponse deleteFaceUserWithOptions(DeleteFaceUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteFaceUser", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteFaceUserResponse());
    }

    public DeleteFaceUserResponse deleteFaceUser(DeleteFaceUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFaceUserWithOptions(request, runtime);
    }

    public GetAIActionConfigResponse getAIActionConfigWithOptions(GetAIActionConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAIActionConfig", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetAIActionConfigResponse());
    }

    public GetAIActionConfigResponse getAIActionConfig(GetAIActionConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAIActionConfigWithOptions(request, runtime);
    }

    public CreateAIAppResponse createAIAppWithOptions(CreateAIAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateAIApp", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateAIAppResponse());
    }

    public CreateAIAppResponse createAIApp(CreateAIAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAIAppWithOptions(request, runtime);
    }

    public UnbindAIPlanWithDevicesResponse unbindAIPlanWithDevicesWithOptions(UnbindAIPlanWithDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnbindAIPlanWithDevices", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UnbindAIPlanWithDevicesResponse());
    }

    public UnbindAIPlanWithDevicesResponse unbindAIPlanWithDevices(UnbindAIPlanWithDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindAIPlanWithDevicesWithOptions(request, runtime);
    }

    public QueryIotIdsByAIPlanResponse queryIotIdsByAIPlanWithOptions(QueryIotIdsByAIPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryIotIdsByAIPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryIotIdsByAIPlanResponse());
    }

    public QueryIotIdsByAIPlanResponse queryIotIdsByAIPlan(QueryIotIdsByAIPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryIotIdsByAIPlanWithOptions(request, runtime);
    }

    public GetAIActionResponse getAIActionWithOptions(GetAIActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAIAction", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetAIActionResponse());
    }

    public GetAIActionResponse getAIAction(GetAIActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAIActionWithOptions(request, runtime);
    }

    public GetAIAppResponse getAIAppWithOptions(GetAIAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAIApp", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetAIAppResponse());
    }

    public GetAIAppResponse getAIApp(GetAIAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAIAppWithOptions(request, runtime);
    }

    public QueryAIPlanTemplatesResponse queryAIPlanTemplatesWithOptions(QueryAIPlanTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryAIPlanTemplates", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryAIPlanTemplatesResponse());
    }

    public QueryAIPlanTemplatesResponse queryAIPlanTemplates(QueryAIPlanTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAIPlanTemplatesWithOptions(request, runtime);
    }

    public BindAIPlanWithDevicesResponse bindAIPlanWithDevicesWithOptions(BindAIPlanWithDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BindAIPlanWithDevices", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BindAIPlanWithDevicesResponse());
    }

    public BindAIPlanWithDevicesResponse bindAIPlanWithDevices(BindAIPlanWithDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindAIPlanWithDevicesWithOptions(request, runtime);
    }

    public GetAIJobResponse getAIJobWithOptions(GetAIJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAIJob", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetAIJobResponse());
    }

    public GetAIJobResponse getAIJob(GetAIJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAIJobWithOptions(request, runtime);
    }

    public QueryAIJobsResponse queryAIJobsWithOptions(QueryAIJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryAIJobs", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryAIJobsResponse());
    }

    public QueryAIJobsResponse queryAIJobs(QueryAIJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAIJobsWithOptions(request, runtime);
    }

    public QueryAIActionResponse queryAIActionWithOptions(QueryAIActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryAIAction", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryAIActionResponse());
    }

    public QueryAIActionResponse queryAIAction(QueryAIActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAIActionWithOptions(request, runtime);
    }

    public CreateAIPlanResponse createAIPlanWithOptions(CreateAIPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateAIPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateAIPlanResponse());
    }

    public CreateAIPlanResponse createAIPlan(CreateAIPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAIPlanWithOptions(request, runtime);
    }

    public UpdateAIAppResponse updateAIAppWithOptions(UpdateAIAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateAIApp", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateAIAppResponse());
    }

    public UpdateAIAppResponse updateAIApp(UpdateAIAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAIAppWithOptions(request, runtime);
    }

    public QueryAIAppResponse queryAIAppWithOptions(QueryAIAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryAIApp", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryAIAppResponse());
    }

    public QueryAIAppResponse queryAIApp(QueryAIAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAIAppWithOptions(request, runtime);
    }

    public RemoveAIAppResponse removeAIAppWithOptions(RemoveAIAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveAIApp", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new RemoveAIAppResponse());
    }

    public RemoveAIAppResponse removeAIApp(RemoveAIAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeAIAppWithOptions(request, runtime);
    }

    public UpdateAIPlanResponse updateAIPlanWithOptions(UpdateAIPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateAIPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateAIPlanResponse());
    }

    public UpdateAIPlanResponse updateAIPlan(UpdateAIPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAIPlanWithOptions(request, runtime);
    }

    public QueryStandardAIAppTemplatesResponse queryStandardAIAppTemplatesWithOptions(QueryStandardAIAppTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryStandardAIAppTemplates", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryStandardAIAppTemplatesResponse());
    }

    public QueryStandardAIAppTemplatesResponse queryStandardAIAppTemplates(QueryStandardAIAppTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryStandardAIAppTemplatesWithOptions(request, runtime);
    }

    public RemoveAIPlanResponse removeAIPlanWithOptions(RemoveAIPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveAIPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new RemoveAIPlanResponse());
    }

    public RemoveAIPlanResponse removeAIPlan(RemoveAIPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeAIPlanWithOptions(request, runtime);
    }

    public GetAIPlanResponse getAIPlanWithOptions(GetAIPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAIPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetAIPlanResponse());
    }

    public GetAIPlanResponse getAIPlan(GetAIPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAIPlanWithOptions(request, runtime);
    }

    public ConfigAIActionResponse configAIActionWithOptions(ConfigAIActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ConfigAIAction", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ConfigAIActionResponse());
    }

    public ConfigAIActionResponse configAIAction(ConfigAIActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configAIActionWithOptions(request, runtime);
    }

    public QueryAIPlanResponse queryAIPlanWithOptions(QueryAIPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryAIPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryAIPlanResponse());
    }

    public QueryAIPlanResponse queryAIPlan(QueryAIPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAIPlanWithOptions(request, runtime);
    }

    public CreateDevicePurifyJobByPlanIdResponse createDevicePurifyJobByPlanIdWithOptions(CreateDevicePurifyJobByPlanIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDevicePurifyJobByPlanId", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateDevicePurifyJobByPlanIdResponse());
    }

    public CreateDevicePurifyJobByPlanIdResponse createDevicePurifyJobByPlanId(CreateDevicePurifyJobByPlanIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDevicePurifyJobByPlanIdWithOptions(request, runtime);
    }

    public RemoveDevicePurifyPlanResponse removeDevicePurifyPlanWithOptions(RemoveDevicePurifyPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveDevicePurifyPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new RemoveDevicePurifyPlanResponse());
    }

    public RemoveDevicePurifyPlanResponse removeDevicePurifyPlan(RemoveDevicePurifyPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeDevicePurifyPlanWithOptions(request, runtime);
    }

    public UpdateDevicePurifyPlanResponse updateDevicePurifyPlanWithOptions(UpdateDevicePurifyPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateDevicePurifyPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateDevicePurifyPlanResponse());
    }

    public UpdateDevicePurifyPlanResponse updateDevicePurifyPlan(UpdateDevicePurifyPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDevicePurifyPlanWithOptions(request, runtime);
    }

    public CreateDevicePurifyPlanResponse createDevicePurifyPlanWithOptions(CreateDevicePurifyPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDevicePurifyPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateDevicePurifyPlanResponse());
    }

    public CreateDevicePurifyPlanResponse createDevicePurifyPlan(CreateDevicePurifyPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDevicePurifyPlanWithOptions(request, runtime);
    }

    public QueryDevicePurifyPlanByPlanIdResponse queryDevicePurifyPlanByPlanIdWithOptions(QueryDevicePurifyPlanByPlanIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDevicePurifyPlanByPlanId", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDevicePurifyPlanByPlanIdResponse());
    }

    public QueryDevicePurifyPlanByPlanIdResponse queryDevicePurifyPlanByPlanId(QueryDevicePurifyPlanByPlanIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDevicePurifyPlanByPlanIdWithOptions(request, runtime);
    }

    public CreateDevicePurifyJobResponse createDevicePurifyJobWithOptions(CreateDevicePurifyJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDevicePurifyJob", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateDevicePurifyJobResponse());
    }

    public CreateDevicePurifyJobResponse createDevicePurifyJob(CreateDevicePurifyJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDevicePurifyJobWithOptions(request, runtime);
    }

    public GetDevicePurifyJobByJobIdResponse getDevicePurifyJobByJobIdWithOptions(GetDevicePurifyJobByJobIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDevicePurifyJobByJobId", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetDevicePurifyJobByJobIdResponse());
    }

    public GetDevicePurifyJobByJobIdResponse getDevicePurifyJobByJobId(GetDevicePurifyJobByJobIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDevicePurifyJobByJobIdWithOptions(request, runtime);
    }

    public QueryDevicePurifyJobsResponse queryDevicePurifyJobsWithOptions(QueryDevicePurifyJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDevicePurifyJobs", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDevicePurifyJobsResponse());
    }

    public QueryDevicePurifyJobsResponse queryDevicePurifyJobs(QueryDevicePurifyJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDevicePurifyJobsWithOptions(request, runtime);
    }

    public QueryDevicePurifyPlansResponse queryDevicePurifyPlansWithOptions(QueryDevicePurifyPlansRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDevicePurifyPlans", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDevicePurifyPlansResponse());
    }

    public QueryDevicePurifyPlansResponse queryDevicePurifyPlans(QueryDevicePurifyPlansRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDevicePurifyPlansWithOptions(request, runtime);
    }

    public StopTriggeredRecordResponse stopTriggeredRecordWithOptions(StopTriggeredRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopTriggeredRecord", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new StopTriggeredRecordResponse());
    }

    public StopTriggeredRecordResponse stopTriggeredRecord(StopTriggeredRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopTriggeredRecordWithOptions(request, runtime);
    }

    public QueryRecordByRecordIdResponse queryRecordByRecordIdWithOptions(QueryRecordByRecordIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryRecordByRecordId", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryRecordByRecordIdResponse());
    }

    public QueryRecordByRecordIdResponse queryRecordByRecordId(QueryRecordByRecordIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRecordByRecordIdWithOptions(request, runtime);
    }

    public QueryDeviceVodUrlResponse queryDeviceVodUrlWithOptions(QueryDeviceVodUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceVodUrl", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceVodUrlResponse());
    }

    public QueryDeviceVodUrlResponse queryDeviceVodUrl(QueryDeviceVodUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceVodUrlWithOptions(request, runtime);
    }

    public QueryTimeTemplateDetailResponse queryTimeTemplateDetailWithOptions(QueryTimeTemplateDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryTimeTemplateDetail", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryTimeTemplateDetailResponse());
    }

    public QueryTimeTemplateDetailResponse queryTimeTemplateDetail(QueryTimeTemplateDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTimeTemplateDetailWithOptions(request, runtime);
    }

    public UpdateTimeTemplateResponse updateTimeTemplateWithOptions(UpdateTimeTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateTimeTemplate", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateTimeTemplateResponse());
    }

    public UpdateTimeTemplateResponse updateTimeTemplate(UpdateTimeTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTimeTemplateWithOptions(request, runtime);
    }

    public CreateTimeTemplateResponse createTimeTemplateWithOptions(CreateTimeTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateTimeTemplate", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateTimeTemplateResponse());
    }

    public CreateTimeTemplateResponse createTimeTemplate(CreateTimeTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTimeTemplateWithOptions(request, runtime);
    }

    public StopLiveStreamingResponse stopLiveStreamingWithOptions(StopLiveStreamingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopLiveStreaming", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new StopLiveStreamingResponse());
    }

    public StopLiveStreamingResponse stopLiveStreaming(StopLiveStreamingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopLiveStreamingWithOptions(request, runtime);
    }

    public SetDevicePictureLifeCycleResponse setDevicePictureLifeCycleWithOptions(SetDevicePictureLifeCycleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetDevicePictureLifeCycle", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new SetDevicePictureLifeCycleResponse());
    }

    public SetDevicePictureLifeCycleResponse setDevicePictureLifeCycle(SetDevicePictureLifeCycleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDevicePictureLifeCycleWithOptions(request, runtime);
    }

    public QueryDeviceRecordLifeCycleResponse queryDeviceRecordLifeCycleWithOptions(QueryDeviceRecordLifeCycleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceRecordLifeCycle", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceRecordLifeCycleResponse());
    }

    public QueryDeviceRecordLifeCycleResponse queryDeviceRecordLifeCycle(QueryDeviceRecordLifeCycleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceRecordLifeCycleWithOptions(request, runtime);
    }

    public SetDeviceRecordLifeCycleResponse setDeviceRecordLifeCycleWithOptions(SetDeviceRecordLifeCycleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetDeviceRecordLifeCycle", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new SetDeviceRecordLifeCycleResponse());
    }

    public SetDeviceRecordLifeCycleResponse setDeviceRecordLifeCycle(SetDeviceRecordLifeCycleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDeviceRecordLifeCycleWithOptions(request, runtime);
    }

    public QueryLiveStreamingResponse queryLiveStreamingWithOptions(QueryLiveStreamingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryLiveStreaming", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryLiveStreamingResponse());
    }

    public QueryLiveStreamingResponse queryLiveStreaming(QueryLiveStreamingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryLiveStreamingWithOptions(request, runtime);
    }

    public QueryDevicePictureLifeCycleResponse queryDevicePictureLifeCycleWithOptions(QueryDevicePictureLifeCycleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDevicePictureLifeCycle", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDevicePictureLifeCycleResponse());
    }

    public QueryDevicePictureLifeCycleResponse queryDevicePictureLifeCycle(QueryDevicePictureLifeCycleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDevicePictureLifeCycleWithOptions(request, runtime);
    }

    public QueryTimeTemplateResponse queryTimeTemplateWithOptions(QueryTimeTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryTimeTemplate", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryTimeTemplateResponse());
    }

    public QueryTimeTemplateResponse queryTimeTemplate(QueryTimeTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTimeTemplateWithOptions(request, runtime);
    }

    public DeleteTimeTemplateResponse deleteTimeTemplateWithOptions(DeleteTimeTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteTimeTemplate", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteTimeTemplateResponse());
    }

    public DeleteTimeTemplateResponse deleteTimeTemplate(DeleteTimeTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTimeTemplateWithOptions(request, runtime);
    }

    public CreateRecordPlanResponse createRecordPlanWithOptions(CreateRecordPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateRecordPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateRecordPlanResponse());
    }

    public CreateRecordPlanResponse createRecordPlan(CreateRecordPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRecordPlanWithOptions(request, runtime);
    }

    public UpdateRecordPlanResponse updateRecordPlanWithOptions(UpdateRecordPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateRecordPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateRecordPlanResponse());
    }

    public UpdateRecordPlanResponse updateRecordPlan(UpdateRecordPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRecordPlanWithOptions(request, runtime);
    }

    public QueryRecordPlansResponse queryRecordPlansWithOptions(QueryRecordPlansRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryRecordPlans", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryRecordPlansResponse());
    }

    public QueryRecordPlansResponse queryRecordPlans(QueryRecordPlansRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRecordPlansWithOptions(request, runtime);
    }

    public QueryRecordPlanDetailResponse queryRecordPlanDetailWithOptions(QueryRecordPlanDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryRecordPlanDetail", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryRecordPlanDetailResponse());
    }

    public QueryRecordPlanDetailResponse queryRecordPlanDetail(QueryRecordPlanDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRecordPlanDetailWithOptions(request, runtime);
    }

    public DeleteRecordPlanResponse deleteRecordPlanWithOptions(DeleteRecordPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteRecordPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteRecordPlanResponse());
    }

    public DeleteRecordPlanResponse deleteRecordPlan(DeleteRecordPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRecordPlanWithOptions(request, runtime);
    }

    public AddRecordPlanDeviceResponse addRecordPlanDeviceWithOptions(AddRecordPlanDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddRecordPlanDevice", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new AddRecordPlanDeviceResponse());
    }

    public AddRecordPlanDeviceResponse addRecordPlanDevice(AddRecordPlanDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addRecordPlanDeviceWithOptions(request, runtime);
    }

    public DeleteRecordPlanDeviceResponse deleteRecordPlanDeviceWithOptions(DeleteRecordPlanDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteRecordPlanDevice", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteRecordPlanDeviceResponse());
    }

    public DeleteRecordPlanDeviceResponse deleteRecordPlanDevice(DeleteRecordPlanDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRecordPlanDeviceWithOptions(request, runtime);
    }

    public QueryRecordPlanDeviceByPlanResponse queryRecordPlanDeviceByPlanWithOptions(QueryRecordPlanDeviceByPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryRecordPlanDeviceByPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryRecordPlanDeviceByPlanResponse());
    }

    public QueryRecordPlanDeviceByPlanResponse queryRecordPlanDeviceByPlan(QueryRecordPlanDeviceByPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRecordPlanDeviceByPlanWithOptions(request, runtime);
    }

    public QueryEventRecordPlansResponse queryEventRecordPlansWithOptions(QueryEventRecordPlansRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryEventRecordPlans", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryEventRecordPlansResponse());
    }

    public QueryEventRecordPlansResponse queryEventRecordPlans(QueryEventRecordPlansRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEventRecordPlansWithOptions(request, runtime);
    }

    public DeleteEventRecordPlanResponse deleteEventRecordPlanWithOptions(DeleteEventRecordPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteEventRecordPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteEventRecordPlanResponse());
    }

    public DeleteEventRecordPlanResponse deleteEventRecordPlan(DeleteEventRecordPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEventRecordPlanWithOptions(request, runtime);
    }

    public QueryEventRecordPlanDetailResponse queryEventRecordPlanDetailWithOptions(QueryEventRecordPlanDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryEventRecordPlanDetail", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryEventRecordPlanDetailResponse());
    }

    public QueryEventRecordPlanDetailResponse queryEventRecordPlanDetail(QueryEventRecordPlanDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEventRecordPlanDetailWithOptions(request, runtime);
    }

    public AddEventRecordPlanDeviceResponse addEventRecordPlanDeviceWithOptions(AddEventRecordPlanDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddEventRecordPlanDevice", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new AddEventRecordPlanDeviceResponse());
    }

    public AddEventRecordPlanDeviceResponse addEventRecordPlanDevice(AddEventRecordPlanDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addEventRecordPlanDeviceWithOptions(request, runtime);
    }

    public DeleteEventRecordPlanDeviceResponse deleteEventRecordPlanDeviceWithOptions(DeleteEventRecordPlanDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteEventRecordPlanDevice", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteEventRecordPlanDeviceResponse());
    }

    public DeleteEventRecordPlanDeviceResponse deleteEventRecordPlanDevice(DeleteEventRecordPlanDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEventRecordPlanDeviceWithOptions(request, runtime);
    }

    public QueryEventRecordPlanDeviceByDeviceResponse queryEventRecordPlanDeviceByDeviceWithOptions(QueryEventRecordPlanDeviceByDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryEventRecordPlanDeviceByDevice", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryEventRecordPlanDeviceByDeviceResponse());
    }

    public QueryEventRecordPlanDeviceByDeviceResponse queryEventRecordPlanDeviceByDevice(QueryEventRecordPlanDeviceByDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEventRecordPlanDeviceByDeviceWithOptions(request, runtime);
    }

    public TriggerRecordResponse triggerRecordWithOptions(TriggerRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TriggerRecord", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new TriggerRecordResponse());
    }

    public TriggerRecordResponse triggerRecord(TriggerRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.triggerRecordWithOptions(request, runtime);
    }

    public QueryDeviceEventResponse queryDeviceEventWithOptions(QueryDeviceEventRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceEvent", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceEventResponse());
    }

    public QueryDeviceEventResponse queryDeviceEvent(QueryDeviceEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceEventWithOptions(request, runtime);
    }

    public QueryDeviceEventPictureResponse queryDeviceEventPictureWithOptions(QueryDeviceEventPictureRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceEventPicture", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceEventPictureResponse());
    }

    public QueryDeviceEventPictureResponse queryDeviceEventPicture(QueryDeviceEventPictureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceEventPictureWithOptions(request, runtime);
    }

    public QueryDevicePictureFileResponse queryDevicePictureFileWithOptions(QueryDevicePictureFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDevicePictureFile", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDevicePictureFileResponse());
    }

    public QueryDevicePictureFileResponse queryDevicePictureFile(QueryDevicePictureFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDevicePictureFileWithOptions(request, runtime);
    }

    public QueryMonthRecordResponse queryMonthRecordWithOptions(QueryMonthRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryMonthRecord", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryMonthRecordResponse());
    }

    public QueryMonthRecordResponse queryMonthRecord(QueryMonthRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMonthRecordWithOptions(request, runtime);
    }

    public QueryRecordPlanDeviceByDeviceResponse queryRecordPlanDeviceByDeviceWithOptions(QueryRecordPlanDeviceByDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryRecordPlanDeviceByDevice", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryRecordPlanDeviceByDeviceResponse());
    }

    public QueryRecordPlanDeviceByDeviceResponse queryRecordPlanDeviceByDevice(QueryRecordPlanDeviceByDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRecordPlanDeviceByDeviceWithOptions(request, runtime);
    }

    public UpdateEventRecordPlanResponse updateEventRecordPlanWithOptions(UpdateEventRecordPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateEventRecordPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateEventRecordPlanResponse());
    }

    public UpdateEventRecordPlanResponse updateEventRecordPlan(UpdateEventRecordPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEventRecordPlanWithOptions(request, runtime);
    }

    public QueryEventRecordPlanDeviceByPlanResponse queryEventRecordPlanDeviceByPlanWithOptions(QueryEventRecordPlanDeviceByPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryEventRecordPlanDeviceByPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryEventRecordPlanDeviceByPlanResponse());
    }

    public QueryEventRecordPlanDeviceByPlanResponse queryEventRecordPlanDeviceByPlan(QueryEventRecordPlanDeviceByPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEventRecordPlanDeviceByPlanWithOptions(request, runtime);
    }

    public TriggerCapturePictureResponse triggerCapturePictureWithOptions(TriggerCapturePictureRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TriggerCapturePicture", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new TriggerCapturePictureResponse());
    }

    public TriggerCapturePictureResponse triggerCapturePicture(TriggerCapturePictureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.triggerCapturePictureWithOptions(request, runtime);
    }

    public QueryDeviceEventRecordResponse queryDeviceEventRecordWithOptions(QueryDeviceEventRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceEventRecord", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceEventRecordResponse());
    }

    public QueryDeviceEventRecordResponse queryDeviceEventRecord(QueryDeviceEventRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceEventRecordWithOptions(request, runtime);
    }

    public QueryPictureFilesResponse queryPictureFilesWithOptions(QueryPictureFilesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryPictureFiles", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryPictureFilesResponse());
    }

    public QueryPictureFilesResponse queryPictureFiles(QueryPictureFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPictureFilesWithOptions(request, runtime);
    }

    public QueryRecordResponse queryRecordWithOptions(QueryRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryRecord", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryRecordResponse());
    }

    public QueryRecordResponse queryRecord(QueryRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRecordWithOptions(request, runtime);
    }

    public QueryRecordUrlResponse queryRecordUrlWithOptions(QueryRecordUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryRecordUrl", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryRecordUrlResponse());
    }

    public QueryRecordUrlResponse queryRecordUrl(QueryRecordUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRecordUrlWithOptions(request, runtime);
    }

    public QueryDeviceFileVodResponse queryDeviceFileVodWithOptions(QueryDeviceFileVodRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceFileVod", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceFileVodResponse());
    }

    public QueryDeviceFileVodResponse queryDeviceFileVod(QueryDeviceFileVodRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceFileVodWithOptions(request, runtime);
    }

    public CreateEventRecordPlanResponse createEventRecordPlanWithOptions(CreateEventRecordPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateEventRecordPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateEventRecordPlanResponse());
    }

    public CreateEventRecordPlanResponse createEventRecordPlan(CreateEventRecordPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEventRecordPlanWithOptions(request, runtime);
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
