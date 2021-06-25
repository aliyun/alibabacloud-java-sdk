// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204;

import com.aliyun.tea.*;
import com.aliyun.emas_devops20191204.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.common.*;
import com.aliyun.tearpc.*;
import com.aliyun.tearpc.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("emas-devops", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public ListPluginsByCategoryResponse listPluginsByCategoryWithOptions(ListPluginsByCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPluginsByCategory", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new ListPluginsByCategoryResponse());
    }

    public ListPluginsByCategoryResponse listPluginsByCategory(ListPluginsByCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPluginsByCategoryWithOptions(request, runtime);
    }

    public ListPluginCategoriesResponse listPluginCategoriesWithOptions(ListPluginCategoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPluginCategories", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new ListPluginCategoriesResponse());
    }

    public ListPluginCategoriesResponse listPluginCategories(ListPluginCategoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPluginCategoriesWithOptions(request, runtime);
    }

    public ListOauthAccessResponse listOauthAccessWithOptions(ListOauthAccessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListOauthAccess", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new ListOauthAccessResponse());
    }

    public ListOauthAccessResponse listOauthAccess(ListOauthAccessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOauthAccessWithOptions(request, runtime);
    }

    public UpdatePublishPlanResponse updatePublishPlanWithOptions(UpdatePublishPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdatePublishPlan", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new UpdatePublishPlanResponse());
    }

    public UpdatePublishPlanResponse updatePublishPlan(UpdatePublishPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updatePublishPlanWithOptions(request, runtime);
    }

    public ListPipelineDefinitionsResponse listPipelineDefinitionsWithOptions(ListPipelineDefinitionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPipelineDefinitions", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new ListPipelineDefinitionsResponse());
    }

    public ListPipelineDefinitionsResponse listPipelineDefinitions(ListPipelineDefinitionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPipelineDefinitionsWithOptions(request, runtime);
    }

    public DescribePublishRecommendVersionResponse describePublishRecommendVersionWithOptions(DescribePublishRecommendVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePublishRecommendVersion", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new DescribePublishRecommendVersionResponse());
    }

    public DescribePublishRecommendVersionResponse describePublishRecommendVersion(DescribePublishRecommendVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePublishRecommendVersionWithOptions(request, runtime);
    }

    public ListPipelineInstancesByAppKeyResponse listPipelineInstancesByAppKeyWithOptions(ListPipelineInstancesByAppKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPipelineInstancesByAppKey", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new ListPipelineInstancesByAppKeyResponse());
    }

    public ListPipelineInstancesByAppKeyResponse listPipelineInstancesByAppKey(ListPipelineInstancesByAppKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPipelineInstancesByAppKeyWithOptions(request, runtime);
    }

    public ListPipelineInstancesByDefinitionResponse listPipelineInstancesByDefinitionWithOptions(ListPipelineInstancesByDefinitionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPipelineInstancesByDefinition", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new ListPipelineInstancesByDefinitionResponse());
    }

    public ListPipelineInstancesByDefinitionResponse listPipelineInstancesByDefinition(ListPipelineInstancesByDefinitionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPipelineInstancesByDefinitionWithOptions(request, runtime);
    }

    public ListPublishPlansResponse listPublishPlansWithOptions(ListPublishPlansRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPublishPlans", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new ListPublishPlansResponse());
    }

    public ListPublishPlansResponse listPublishPlans(ListPublishPlansRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPublishPlansWithOptions(request, runtime);
    }

    public DescribePublishPlanDetailResponse describePublishPlanDetailWithOptions(DescribePublishPlanDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePublishPlanDetail", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new DescribePublishPlanDetailResponse());
    }

    public DescribePublishPlanDetailResponse describePublishPlanDetail(DescribePublishPlanDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePublishPlanDetailWithOptions(request, runtime);
    }

    public DescribePublishPlanDataResponse describePublishPlanDataWithOptions(DescribePublishPlanDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePublishPlanData", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new DescribePublishPlanDataResponse());
    }

    public DescribePublishPlanDataResponse describePublishPlanData(DescribePublishPlanDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePublishPlanDataWithOptions(request, runtime);
    }

    public ModifyPipelineDefinitionDslResponse modifyPipelineDefinitionDslWithOptions(ModifyPipelineDefinitionDslRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyPipelineDefinitionDsl", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new ModifyPipelineDefinitionDslResponse());
    }

    public ModifyPipelineDefinitionDslResponse modifyPipelineDefinitionDsl(ModifyPipelineDefinitionDslRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPipelineDefinitionDslWithOptions(request, runtime);
    }

    public DescribePipelineJobInstanceDetailResponse describePipelineJobInstanceDetailWithOptions(DescribePipelineJobInstanceDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePipelineJobInstanceDetail", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new DescribePipelineJobInstanceDetailResponse());
    }

    public DescribePipelineJobInstanceDetailResponse describePipelineJobInstanceDetail(DescribePipelineJobInstanceDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePipelineJobInstanceDetailWithOptions(request, runtime);
    }

    public ModifyPipelineEnvVariablesResponse modifyPipelineEnvVariablesWithOptions(ModifyPipelineEnvVariablesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyPipelineEnvVariables", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new ModifyPipelineEnvVariablesResponse());
    }

    public ModifyPipelineEnvVariablesResponse modifyPipelineEnvVariables(ModifyPipelineEnvVariablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPipelineEnvVariablesWithOptions(request, runtime);
    }

    public TriggerPipelineResponse triggerPipelineWithOptions(TriggerPipelineRequest tmp, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        TriggerPipelineShrinkRequest request = new TriggerPipelineShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.runtimeEnvVariables)) {
            request.runtimeEnvVariablesShrink = com.aliyun.teautil.Common.toJSONString(tmp.runtimeEnvVariables);
        }

        return TeaModel.toModel(this.doRequest("TriggerPipeline", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new TriggerPipelineResponse());
    }

    public TriggerPipelineResponse triggerPipeline(TriggerPipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.triggerPipelineWithOptions(request, runtime);
    }

    public ListPipelineTemplatesResponse listPipelineTemplatesWithOptions(ListPipelineTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPipelineTemplates", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new ListPipelineTemplatesResponse());
    }

    public ListPipelineTemplatesResponse listPipelineTemplates(ListPipelineTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPipelineTemplatesWithOptions(request, runtime);
    }

    public ListPublishVersionsResponse listPublishVersionsWithOptions(ListPublishVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPublishVersions", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new ListPublishVersionsResponse());
    }

    public ListPublishVersionsResponse listPublishVersions(ListPublishVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPublishVersionsWithOptions(request, runtime);
    }

    public ModifyPipelineDefinitionInfoResponse modifyPipelineDefinitionInfoWithOptions(ModifyPipelineDefinitionInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyPipelineDefinitionInfo", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new ModifyPipelineDefinitionInfoResponse());
    }

    public ModifyPipelineDefinitionInfoResponse modifyPipelineDefinitionInfo(ModifyPipelineDefinitionInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPipelineDefinitionInfoWithOptions(request, runtime);
    }

    public GetPipelineInstanceDataResponse getPipelineInstanceDataWithOptions(GetPipelineInstanceDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPipelineInstanceData", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new GetPipelineInstanceDataResponse());
    }

    public GetPipelineInstanceDataResponse getPipelineInstanceData(GetPipelineInstanceDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPipelineInstanceDataWithOptions(request, runtime);
    }

    public DescribePluginDetailResponse describePluginDetailWithOptions(DescribePluginDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePluginDetail", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new DescribePluginDetailResponse());
    }

    public DescribePluginDetailResponse describePluginDetail(DescribePluginDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePluginDetailWithOptions(request, runtime);
    }

    public DescribePipelineDetailResponse describePipelineDetailWithOptions(DescribePipelineDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePipelineDetail", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new DescribePipelineDetailResponse());
    }

    public DescribePipelineDetailResponse describePipelineDetail(DescribePipelineDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePipelineDetailWithOptions(request, runtime);
    }

    public InitAppPipelineResponse initAppPipelineWithOptions(InitAppPipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("InitAppPipeline", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new InitAppPipelineResponse());
    }

    public InitAppPipelineResponse initAppPipeline(InitAppPipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.initAppPipelineWithOptions(request, runtime);
    }

    public CancelPipelineResponse cancelPipelineWithOptions(CancelPipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CancelPipeline", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new CancelPipelineResponse());
    }

    public CancelPipelineResponse cancelPipeline(CancelPipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelPipelineWithOptions(request, runtime);
    }

    public QueryArtifactSignatureResponse queryArtifactSignatureWithOptions(QueryArtifactSignatureRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryArtifactSignature", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new QueryArtifactSignatureResponse());
    }

    public QueryArtifactSignatureResponse queryArtifactSignature(QueryArtifactSignatureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryArtifactSignatureWithOptions(request, runtime);
    }

    public CreatePublishPlanWithPipelineResponse createPublishPlanWithPipelineWithOptions(CreatePublishPlanWithPipelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreatePublishPlanWithPipeline", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new CreatePublishPlanWithPipelineResponse());
    }

    public CreatePublishPlanWithPipelineResponse createPublishPlanWithPipeline(CreatePublishPlanWithPipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPublishPlanWithPipelineWithOptions(request, runtime);
    }

    public CreatePipelinePublishBatchResponse createPipelinePublishBatchWithOptions(CreatePipelinePublishBatchRequest tmp, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        CreatePipelinePublishBatchShrinkRequest request = new CreatePipelinePublishBatchShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.publishStrategy)) {
            request.publishStrategyShrink = com.aliyun.teautil.Common.toJSONString(tmp.publishStrategy);
        }

        return TeaModel.toModel(this.doRequest("CreatePipelinePublishBatch", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new CreatePipelinePublishBatchResponse());
    }

    public CreatePipelinePublishBatchResponse createPipelinePublishBatch(CreatePipelinePublishBatchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPipelinePublishBatchWithOptions(request, runtime);
    }

    public ModifyPublishPipelineTemplateResponse modifyPublishPipelineTemplateWithOptions(ModifyPublishPipelineTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyPublishPipelineTemplate", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new ModifyPublishPipelineTemplateResponse());
    }

    public ModifyPublishPipelineTemplateResponse modifyPublishPipelineTemplate(ModifyPublishPipelineTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPublishPipelineTemplateWithOptions(request, runtime);
    }

    public FinishPublishPlanResponse finishPublishPlanWithOptions(FinishPublishPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("FinishPublishPlan", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new FinishPublishPlanResponse());
    }

    public FinishPublishPlanResponse finishPublishPlan(FinishPublishPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.finishPublishPlanWithOptions(request, runtime);
    }

    public ListCertConfigsResponse listCertConfigsWithOptions(ListCertConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListCertConfigs", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new ListCertConfigsResponse());
    }

    public ListCertConfigsResponse listCertConfigs(ListCertConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCertConfigsWithOptions(request, runtime);
    }

    public GetScmRsaPubKeyResponse getScmRsaPubKeyWithOptions(GetScmRsaPubKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetScmRsaPubKey", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new GetScmRsaPubKeyResponse());
    }

    public GetScmRsaPubKeyResponse getScmRsaPubKey(GetScmRsaPubKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getScmRsaPubKeyWithOptions(request, runtime);
    }

    public ListPublishBatchesResponse listPublishBatchesWithOptions(ListPublishBatchesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPublishBatches", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new ListPublishBatchesResponse());
    }

    public ListPublishBatchesResponse listPublishBatches(ListPublishBatchesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPublishBatchesWithOptions(request, runtime);
    }

    public UpdateIosCertResponse updateIosCertWithOptions(UpdateIosCertRequest tmp, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        UpdateIosCertShrinkRequest request = new UpdateIosCertShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.mobileProvisionList)) {
            request.mobileProvisionListShrink = com.aliyun.teautil.Common.toJSONString(tmp.mobileProvisionList);
        }

        return TeaModel.toModel(this.doRequest("UpdateIosCert", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new UpdateIosCertResponse());
    }

    public UpdateIosCertResponse updateIosCert(UpdateIosCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateIosCertWithOptions(request, runtime);
    }

    public TerminateBatchResponse terminateBatchWithOptions(TerminateBatchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TerminateBatch", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new TerminateBatchResponse());
    }

    public TerminateBatchResponse terminateBatch(TerminateBatchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.terminateBatchWithOptions(request, runtime);
    }

    public CreateIosCertResponse createIosCertWithOptions(CreateIosCertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateIosCert", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new CreateIosCertResponse());
    }

    public CreateIosCertResponse createIosCert(CreateIosCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIosCertWithOptions(request, runtime);
    }

    public DeleteAndroidCertResponse deleteAndroidCertWithOptions(DeleteAndroidCertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteAndroidCert", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new DeleteAndroidCertResponse());
    }

    public DeleteAndroidCertResponse deleteAndroidCert(DeleteAndroidCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAndroidCertWithOptions(request, runtime);
    }

    public CreateAndroidCertResponse createAndroidCertWithOptions(CreateAndroidCertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateAndroidCert", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new CreateAndroidCertResponse());
    }

    public CreateAndroidCertResponse createAndroidCert(CreateAndroidCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAndroidCertWithOptions(request, runtime);
    }

    public DeleteIosCertResponse deleteIosCertWithOptions(DeleteIosCertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteIosCert", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new DeleteIosCertResponse());
    }

    public DeleteIosCertResponse deleteIosCert(DeleteIosCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIosCertWithOptions(request, runtime);
    }

    public GetPublishBatchDetailResponse getPublishBatchDetailWithOptions(GetPublishBatchDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPublishBatchDetail", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new GetPublishBatchDetailResponse());
    }

    public GetPublishBatchDetailResponse getPublishBatchDetail(GetPublishBatchDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPublishBatchDetailWithOptions(request, runtime);
    }

    public DescribeSprintPublishDataResponse describeSprintPublishDataWithOptions(DescribeSprintPublishDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSprintPublishData", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSprintPublishDataResponse());
    }

    public DescribeSprintPublishDataResponse describeSprintPublishData(DescribeSprintPublishDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSprintPublishDataWithOptions(request, runtime);
    }

    public ListScmConfigsResponse listScmConfigsWithOptions(ListScmConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListScmConfigs", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new ListScmConfigsResponse());
    }

    public ListScmConfigsResponse listScmConfigs(ListScmConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listScmConfigsWithOptions(request, runtime);
    }

    public GetScmAppConfigResponse getScmAppConfigWithOptions(GetScmAppConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetScmAppConfig", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new GetScmAppConfigResponse());
    }

    public GetScmAppConfigResponse getScmAppConfig(GetScmAppConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getScmAppConfigWithOptions(request, runtime);
    }

    public DeleteScmConfigResponse deleteScmConfigWithOptions(DeleteScmConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteScmConfig", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new DeleteScmConfigResponse());
    }

    public DeleteScmConfigResponse deleteScmConfig(DeleteScmConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteScmConfigWithOptions(request, runtime);
    }

    public GetPublishFileResponse getPublishFileWithOptions(GetPublishFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPublishFile", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new GetPublishFileResponse());
    }

    public GetPublishFileResponse getPublishFile(GetPublishFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPublishFileWithOptions(request, runtime);
    }

    public CreateScmConfigResponse createScmConfigWithOptions(CreateScmConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateScmConfig", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new CreateScmConfigResponse());
    }

    public CreateScmConfigResponse createScmConfig(CreateScmConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createScmConfigWithOptions(request, runtime);
    }

    public CheckScmAppConnectivityResponse checkScmAppConnectivityWithOptions(CheckScmAppConnectivityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckScmAppConnectivity", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new CheckScmAppConnectivityResponse());
    }

    public CheckScmAppConnectivityResponse checkScmAppConnectivity(CheckScmAppConnectivityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkScmAppConnectivityWithOptions(request, runtime);
    }

    public UpdateScmConfigResponse updateScmConfigWithOptions(UpdateScmConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateScmConfig", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new UpdateScmConfigResponse());
    }

    public UpdateScmConfigResponse updateScmConfig(UpdateScmConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateScmConfigWithOptions(request, runtime);
    }

    public CreateScmAppConfigResponse createScmAppConfigWithOptions(CreateScmAppConfigRequest tmp, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        CreateScmAppConfigShrinkRequest request = new CreateScmAppConfigShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.contextUserUpdateRequest)) {
            request.contextUserUpdateRequestShrink = com.aliyun.teautil.Common.toJSONString(tmp.contextUserUpdateRequest);
        }

        return TeaModel.toModel(this.doRequest("CreateScmAppConfig", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new CreateScmAppConfigResponse());
    }

    public CreateScmAppConfigResponse createScmAppConfig(CreateScmAppConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createScmAppConfigWithOptions(request, runtime);
    }

    public UpdateScmAppConfigResponse updateScmAppConfigWithOptions(UpdateScmAppConfigRequest tmp, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        UpdateScmAppConfigShrinkRequest request = new UpdateScmAppConfigShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.contextUserUpdateRequest)) {
            request.contextUserUpdateRequestShrink = com.aliyun.teautil.Common.toJSONString(tmp.contextUserUpdateRequest);
        }

        return TeaModel.toModel(this.doRequest("UpdateScmAppConfig", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new UpdateScmAppConfigResponse());
    }

    public UpdateScmAppConfigResponse updateScmAppConfig(UpdateScmAppConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateScmAppConfigWithOptions(request, runtime);
    }

    public CreatePublishBatchResponse createPublishBatchWithOptions(CreatePublishBatchRequest tmp, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        CreatePublishBatchShrinkRequest request = new CreatePublishBatchShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.publishStrategy)) {
            request.publishStrategyShrink = com.aliyun.teautil.Common.toJSONString(tmp.publishStrategy);
        }

        return TeaModel.toModel(this.doRequest("CreatePublishBatch", "HTTPS", "POST", "2019-12-04", "AK", null, TeaModel.buildMap(request), runtime), new CreatePublishBatchResponse());
    }

    public CreatePublishBatchResponse createPublishBatch(CreatePublishBatchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPublishBatchWithOptions(request, runtime);
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
