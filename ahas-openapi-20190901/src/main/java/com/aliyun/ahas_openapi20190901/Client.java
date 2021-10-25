// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901;

import com.aliyun.tea.*;
import com.aliyun.ahas_openapi20190901.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing", "ahas.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "ahas.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "ahas.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai", "ahas.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "ahas.cn-shenzhen.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "ahas.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-hongkong", "ahas.cn-hongkong.aliyuncs.com"),
            new TeaPair("eu-central-1", "ahas.eu-central-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ahas-openapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public UpdateExperimentBasicInfoResponse updateExperimentBasicInfoWithOptions(UpdateExperimentBasicInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateExperimentBasicInfo", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateExperimentBasicInfoResponse());
    }

    public UpdateExperimentBasicInfoResponse updateExperimentBasicInfo(UpdateExperimentBasicInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateExperimentBasicInfoWithOptions(request, runtime);
    }

    public DisableIsolationRuleResponse disableIsolationRuleWithOptions(DisableIsolationRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableIsolationRule", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new DisableIsolationRuleResponse());
    }

    public DisableIsolationRuleResponse disableIsolationRule(DisableIsolationRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableIsolationRuleWithOptions(request, runtime);
    }

    public GetExperimentMetaResponse getExperimentMetaWithOptions(GetExperimentMetaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetExperimentMeta", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetExperimentMetaResponse());
    }

    public GetExperimentMetaResponse getExperimentMeta(GetExperimentMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getExperimentMetaWithOptions(request, runtime);
    }

    public GetExperimentTaskResponse getExperimentTaskWithOptions(GetExperimentTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetExperimentTask", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetExperimentTaskResponse());
    }

    public GetExperimentTaskResponse getExperimentTask(GetExperimentTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getExperimentTaskWithOptions(request, runtime);
    }

    public GetActivityTaskResponse getActivityTaskWithOptions(GetActivityTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetActivityTask", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetActivityTaskResponse());
    }

    public GetActivityTaskResponse getActivityTask(GetActivityTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getActivityTaskWithOptions(request, runtime);
    }

    public EnableDegradeRuleResponse enableDegradeRuleWithOptions(EnableDegradeRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableDegradeRule", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new EnableDegradeRuleResponse());
    }

    public EnableDegradeRuleResponse enableDegradeRule(EnableDegradeRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableDegradeRuleWithOptions(request, runtime);
    }

    public DeleteDegradeRuleResponse deleteDegradeRuleWithOptions(DeleteDegradeRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDegradeRule", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDegradeRuleResponse());
    }

    public DeleteDegradeRuleResponse deleteDegradeRule(DeleteDegradeRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDegradeRuleWithOptions(request, runtime);
    }

    public ModifyDegradeRuleResponse modifyDegradeRuleWithOptions(ModifyDegradeRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDegradeRule", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDegradeRuleResponse());
    }

    public ModifyDegradeRuleResponse modifyDegradeRule(ModifyDegradeRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDegradeRuleWithOptions(request, runtime);
    }

    public DeleteHotParamRuleResponse deleteHotParamRuleWithOptions(DeleteHotParamRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteHotParamRule", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteHotParamRuleResponse());
    }

    public DeleteHotParamRuleResponse deleteHotParamRule(DeleteHotParamRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteHotParamRuleWithOptions(request, runtime);
    }

    public DeleteSystemRuleResponse deleteSystemRuleWithOptions(DeleteSystemRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSystemRule", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSystemRuleResponse());
    }

    public DeleteSystemRuleResponse deleteSystemRule(DeleteSystemRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSystemRuleWithOptions(request, runtime);
    }

    public DeleteIsolationRuleResponse deleteIsolationRuleWithOptions(DeleteIsolationRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteIsolationRule", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteIsolationRuleResponse());
    }

    public DeleteIsolationRuleResponse deleteIsolationRule(DeleteIsolationRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIsolationRuleWithOptions(request, runtime);
    }

    public CreateHotParamRuleResponse createHotParamRuleWithOptions(CreateHotParamRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateHotParamRule", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateHotParamRuleResponse());
    }

    public CreateHotParamRuleResponse createHotParamRule(CreateHotParamRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createHotParamRuleWithOptions(request, runtime);
    }

    public ModifySystemRuleResponse modifySystemRuleWithOptions(ModifySystemRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySystemRule", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySystemRuleResponse());
    }

    public ModifySystemRuleResponse modifySystemRule(ModifySystemRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySystemRuleWithOptions(request, runtime);
    }

    public ListFlowRulesOfAppResponse listFlowRulesOfAppWithOptions(ListFlowRulesOfAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowRulesOfApp", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowRulesOfAppResponse());
    }

    public ListFlowRulesOfAppResponse listFlowRulesOfApp(ListFlowRulesOfAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowRulesOfAppWithOptions(request, runtime);
    }

    public GetUserApplicationsResponse getUserApplicationsWithOptions(GetUserApplicationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUserApplications", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserApplicationsResponse());
    }

    public GetUserApplicationsResponse getUserApplications(GetUserApplicationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserApplicationsWithOptions(request, runtime);
    }

    public OpenAhasServiceResponse openAhasServiceWithOptions(OpenAhasServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OpenAhasService", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new OpenAhasServiceResponse());
    }

    public OpenAhasServiceResponse openAhasService(OpenAhasServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openAhasServiceWithOptions(request, runtime);
    }

    public PageableQueryExperimentTaskByExperimentIdResponse pageableQueryExperimentTaskByExperimentIdWithOptions(PageableQueryExperimentTaskByExperimentIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PageableQueryExperimentTaskByExperimentId", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new PageableQueryExperimentTaskByExperimentIdResponse());
    }

    public PageableQueryExperimentTaskByExperimentIdResponse pageableQueryExperimentTaskByExperimentId(PageableQueryExperimentTaskByExperimentIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pageableQueryExperimentTaskByExperimentIdWithOptions(request, runtime);
    }

    public EnableFlowRuleResponse enableFlowRuleWithOptions(EnableFlowRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableFlowRule", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new EnableFlowRuleResponse());
    }

    public EnableFlowRuleResponse enableFlowRule(EnableFlowRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableFlowRuleWithOptions(request, runtime);
    }

    public FinishExperimentTaskResponse finishExperimentTaskWithOptions(FinishExperimentTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FinishExperimentTask", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new FinishExperimentTaskResponse());
    }

    public FinishExperimentTaskResponse finishExperimentTask(FinishExperimentTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.finishExperimentTaskWithOptions(request, runtime);
    }

    public EnableIsolationRuleResponse enableIsolationRuleWithOptions(EnableIsolationRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableIsolationRule", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new EnableIsolationRuleResponse());
    }

    public EnableIsolationRuleResponse enableIsolationRule(EnableIsolationRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableIsolationRuleWithOptions(request, runtime);
    }

    public DisableSystemRuleResponse disableSystemRuleWithOptions(DisableSystemRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableSystemRule", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new DisableSystemRuleResponse());
    }

    public DisableSystemRuleResponse disableSystemRule(DisableSystemRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableSystemRuleWithOptions(request, runtime);
    }

    public GetMetricsOfResourceResponse getMetricsOfResourceWithOptions(GetMetricsOfResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMetricsOfResource", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetMetricsOfResourceResponse());
    }

    public GetMetricsOfResourceResponse getMetricsOfResource(GetMetricsOfResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMetricsOfResourceWithOptions(request, runtime);
    }

    public GetUserWorkspaceResponse getUserWorkspaceWithOptions(GetUserWorkspaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUserWorkspace", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserWorkspaceResponse());
    }

    public GetUserWorkspaceResponse getUserWorkspace(GetUserWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserWorkspaceWithOptions(request, runtime);
    }

    public CreateIsolationRuleResponse createIsolationRuleWithOptions(CreateIsolationRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateIsolationRule", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateIsolationRuleResponse());
    }

    public CreateIsolationRuleResponse createIsolationRule(CreateIsolationRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIsolationRuleWithOptions(request, runtime);
    }

    public EnableHotParamRuleResponse enableHotParamRuleWithOptions(EnableHotParamRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableHotParamRule", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new EnableHotParamRuleResponse());
    }

    public EnableHotParamRuleResponse enableHotParamRule(EnableHotParamRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableHotParamRuleWithOptions(request, runtime);
    }

    public GetLicenseKeyResponse getLicenseKeyWithOptions(GetLicenseKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLicenseKey", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetLicenseKeyResponse());
    }

    public GetLicenseKeyResponse getLicenseKey(GetLicenseKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLicenseKeyWithOptions(request, runtime);
    }

    public CreateFlowRuleResponse createFlowRuleWithOptions(CreateFlowRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFlowRule", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFlowRuleResponse());
    }

    public CreateFlowRuleResponse createFlowRule(CreateFlowRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowRuleWithOptions(request, runtime);
    }

    public PushExperimentTaskResponse pushExperimentTaskWithOptions(PushExperimentTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PushExperimentTask", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new PushExperimentTaskResponse());
    }

    public PushExperimentTaskResponse pushExperimentTask(PushExperimentTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pushExperimentTaskWithOptions(request, runtime);
    }

    public CheckExperimentRunnableResponse checkExperimentRunnableWithOptions(CheckExperimentRunnableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckExperimentRunnable", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new CheckExperimentRunnableResponse());
    }

    public CheckExperimentRunnableResponse checkExperimentRunnable(CheckExperimentRunnableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkExperimentRunnableWithOptions(request, runtime);
    }

    public CreateHotParamItemsResponse createHotParamItemsWithOptions(CreateHotParamItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateHotParamItems", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateHotParamItemsResponse());
    }

    public CreateHotParamItemsResponse createHotParamItems(CreateHotParamItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createHotParamItemsWithOptions(request, runtime);
    }

    public ListSystemRulesResponse listSystemRulesWithOptions(ListSystemRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSystemRules", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListSystemRulesResponse());
    }

    public ListSystemRulesResponse listSystemRules(ListSystemRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSystemRulesWithOptions(request, runtime);
    }

    public PageableQueryUserExperimentResponse pageableQueryUserExperimentWithOptions(PageableQueryUserExperimentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PageableQueryUserExperiment", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new PageableQueryUserExperimentResponse());
    }

    public PageableQueryUserExperimentResponse pageableQueryUserExperiment(PageableQueryUserExperimentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pageableQueryUserExperimentWithOptions(request, runtime);
    }

    public ListHotParamRulesOfResourceResponse listHotParamRulesOfResourceWithOptions(ListHotParamRulesOfResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListHotParamRulesOfResource", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListHotParamRulesOfResourceResponse());
    }

    public ListHotParamRulesOfResourceResponse listHotParamRulesOfResource(ListHotParamRulesOfResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHotParamRulesOfResourceWithOptions(request, runtime);
    }

    public CreateExperimentResponse createExperimentWithOptions(CreateExperimentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateExperiment", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateExperimentResponse());
    }

    public CreateExperimentResponse createExperiment(CreateExperimentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createExperimentWithOptions(request, runtime);
    }

    public ModifyHotParamRuleResponse modifyHotParamRuleWithOptions(ModifyHotParamRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyHotParamRule", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyHotParamRuleResponse());
    }

    public ModifyHotParamRuleResponse modifyHotParamRule(ModifyHotParamRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyHotParamRuleWithOptions(request, runtime);
    }

    public CreateDegradeRuleResponse createDegradeRuleWithOptions(CreateDegradeRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDegradeRule", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDegradeRuleResponse());
    }

    public CreateDegradeRuleResponse createDegradeRule(CreateDegradeRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDegradeRuleWithOptions(request, runtime);
    }

    public DisableDegradeRuleResponse disableDegradeRuleWithOptions(DisableDegradeRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableDegradeRule", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new DisableDegradeRuleResponse());
    }

    public DisableDegradeRuleResponse disableDegradeRule(DisableDegradeRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableDegradeRuleWithOptions(request, runtime);
    }

    public GetMetricsOfAppResponse getMetricsOfAppWithOptions(GetMetricsOfAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMetricsOfApp", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetMetricsOfAppResponse());
    }

    public GetMetricsOfAppResponse getMetricsOfApp(GetMetricsOfAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMetricsOfAppWithOptions(request, runtime);
    }

    public EnableSystemRuleResponse enableSystemRuleWithOptions(EnableSystemRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableSystemRule", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new EnableSystemRuleResponse());
    }

    public EnableSystemRuleResponse enableSystemRule(EnableSystemRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableSystemRuleWithOptions(request, runtime);
    }

    public ListActiveAppsResponse listActiveAppsWithOptions(ListActiveAppsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListActiveApps", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListActiveAppsResponse());
    }

    public ListActiveAppsResponse listActiveApps(ListActiveAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listActiveAppsWithOptions(request, runtime);
    }

    public ListDegradeRulesOfResourceResponse listDegradeRulesOfResourceWithOptions(ListDegradeRulesOfResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDegradeRulesOfResource", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListDegradeRulesOfResourceResponse());
    }

    public ListDegradeRulesOfResourceResponse listDegradeRulesOfResource(ListDegradeRulesOfResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDegradeRulesOfResourceWithOptions(request, runtime);
    }

    public ListFlowRulesOfResourceResponse listFlowRulesOfResourceWithOptions(ListFlowRulesOfResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlowRulesOfResource", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowRulesOfResourceResponse());
    }

    public ListFlowRulesOfResourceResponse listFlowRulesOfResource(ListFlowRulesOfResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowRulesOfResourceWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public ListDegradeRulesOfAppResponse listDegradeRulesOfAppWithOptions(ListDegradeRulesOfAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDegradeRulesOfApp", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListDegradeRulesOfAppResponse());
    }

    public ListDegradeRulesOfAppResponse listDegradeRulesOfApp(ListDegradeRulesOfAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDegradeRulesOfAppWithOptions(request, runtime);
    }

    public PageableQueryExperimentTaskByClusterIdResponse pageableQueryExperimentTaskByClusterIdWithOptions(PageableQueryExperimentTaskByClusterIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PageableQueryExperimentTaskByClusterId", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new PageableQueryExperimentTaskByClusterIdResponse());
    }

    public PageableQueryExperimentTaskByClusterIdResponse pageableQueryExperimentTaskByClusterId(PageableQueryExperimentTaskByClusterIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pageableQueryExperimentTaskByClusterIdWithOptions(request, runtime);
    }

    public ModifyFlowRuleResponse modifyFlowRuleWithOptions(ModifyFlowRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyFlowRule", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyFlowRuleResponse());
    }

    public ModifyFlowRuleResponse modifyFlowRule(ModifyFlowRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyFlowRuleWithOptions(request, runtime);
    }

    public ListExperimentMetasResponse listExperimentMetasWithOptions(ListExperimentMetasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListExperimentMetas", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListExperimentMetasResponse());
    }

    public ListExperimentMetasResponse listExperimentMetas(ListExperimentMetasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listExperimentMetasWithOptions(request, runtime);
    }

    public CreateSystemRuleResponse createSystemRuleWithOptions(CreateSystemRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSystemRule", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSystemRuleResponse());
    }

    public CreateSystemRuleResponse createSystemRule(CreateSystemRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSystemRuleWithOptions(request, runtime);
    }

    public ListIsolationRulesOfAppResponse listIsolationRulesOfAppWithOptions(ListIsolationRulesOfAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListIsolationRulesOfApp", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListIsolationRulesOfAppResponse());
    }

    public ListIsolationRulesOfAppResponse listIsolationRulesOfApp(ListIsolationRulesOfAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIsolationRulesOfAppWithOptions(request, runtime);
    }

    public ExecuteExperimentResponse executeExperimentWithOptions(ExecuteExperimentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExecuteExperiment", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new ExecuteExperimentResponse());
    }

    public ExecuteExperimentResponse executeExperiment(ExecuteExperimentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeExperimentWithOptions(request, runtime);
    }

    public DeleteFlowRuleResponse deleteFlowRuleWithOptions(DeleteFlowRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFlowRule", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFlowRuleResponse());
    }

    public DeleteFlowRuleResponse deleteFlowRule(DeleteFlowRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFlowRuleWithOptions(request, runtime);
    }

    public UpdateExperimentResponse updateExperimentWithOptions(UpdateExperimentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateExperiment", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateExperimentResponse());
    }

    public UpdateExperimentResponse updateExperiment(UpdateExperimentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateExperimentWithOptions(request, runtime);
    }

    public GetSentinelAppSumMetricResponse getSentinelAppSumMetricWithOptions(GetSentinelAppSumMetricRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSentinelAppSumMetric", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetSentinelAppSumMetricResponse());
    }

    public GetSentinelAppSumMetricResponse getSentinelAppSumMetric(GetSentinelAppSumMetricRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSentinelAppSumMetricWithOptions(request, runtime);
    }

    public ModifyIsolationRuleResponse modifyIsolationRuleWithOptions(ModifyIsolationRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyIsolationRule", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyIsolationRuleResponse());
    }

    public ModifyIsolationRuleResponse modifyIsolationRule(ModifyIsolationRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyIsolationRuleWithOptions(request, runtime);
    }

    public DisableFlowRuleResponse disableFlowRuleWithOptions(DisableFlowRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableFlowRule", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new DisableFlowRuleResponse());
    }

    public DisableFlowRuleResponse disableFlowRule(DisableFlowRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableFlowRuleWithOptions(request, runtime);
    }

    public ListHotParamRulesOfAppResponse listHotParamRulesOfAppWithOptions(ListHotParamRulesOfAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListHotParamRulesOfApp", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListHotParamRulesOfAppResponse());
    }

    public ListHotParamRulesOfAppResponse listHotParamRulesOfApp(ListHotParamRulesOfAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHotParamRulesOfAppWithOptions(request, runtime);
    }

    public DisableHotParamRuleResponse disableHotParamRuleWithOptions(DisableHotParamRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableHotParamRule", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new DisableHotParamRuleResponse());
    }

    public DisableHotParamRuleResponse disableHotParamRule(DisableHotParamRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableHotParamRuleWithOptions(request, runtime);
    }

    public ListIsolationRulesOfResourceResponse listIsolationRulesOfResourceWithOptions(ListIsolationRulesOfResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListIsolationRulesOfResource", "2019-09-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListIsolationRulesOfResourceResponse());
    }

    public ListIsolationRulesOfResourceResponse listIsolationRulesOfResource(ListIsolationRulesOfResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIsolationRulesOfResourceWithOptions(request, runtime);
    }
}
