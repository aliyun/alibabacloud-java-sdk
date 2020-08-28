// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120;

import com.aliyun.tea.*;
import com.aliyun.linkvisual20180120.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
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


    public GetAIActionConfigResponse getAIActionConfigWithOptions(GetAIActionConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAIActionConfig", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetAIActionConfigResponse());
    }

    public GetAIActionConfigResponse getAIActionConfig(GetAIActionConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAIActionConfigWithOptions(request, runtime);
    }

    public CreateAIAppResponse createAIAppWithOptions(CreateAIAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateAIApp", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateAIAppResponse());
    }

    public CreateAIAppResponse createAIApp(CreateAIAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAIAppWithOptions(request, runtime);
    }

    public UnbindAIPlanWithDevicesResponse unbindAIPlanWithDevicesWithOptions(UnbindAIPlanWithDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnbindAIPlanWithDevices", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UnbindAIPlanWithDevicesResponse());
    }

    public UnbindAIPlanWithDevicesResponse unbindAIPlanWithDevices(UnbindAIPlanWithDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindAIPlanWithDevicesWithOptions(request, runtime);
    }

    public QueryIotIdsByAIPlanResponse queryIotIdsByAIPlanWithOptions(QueryIotIdsByAIPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryIotIdsByAIPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryIotIdsByAIPlanResponse());
    }

    public QueryIotIdsByAIPlanResponse queryIotIdsByAIPlan(QueryIotIdsByAIPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryIotIdsByAIPlanWithOptions(request, runtime);
    }

    public GetAIActionResponse getAIActionWithOptions(GetAIActionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAIAction", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetAIActionResponse());
    }

    public GetAIActionResponse getAIAction(GetAIActionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAIActionWithOptions(request, runtime);
    }

    public GetAIAppResponse getAIAppWithOptions(GetAIAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAIApp", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetAIAppResponse());
    }

    public GetAIAppResponse getAIApp(GetAIAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAIAppWithOptions(request, runtime);
    }

    public QueryAIPlanTemplatesResponse queryAIPlanTemplatesWithOptions(QueryAIPlanTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryAIPlanTemplates", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryAIPlanTemplatesResponse());
    }

    public QueryAIPlanTemplatesResponse queryAIPlanTemplates(QueryAIPlanTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAIPlanTemplatesWithOptions(request, runtime);
    }

    public BindAIPlanWithDevicesResponse bindAIPlanWithDevicesWithOptions(BindAIPlanWithDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BindAIPlanWithDevices", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BindAIPlanWithDevicesResponse());
    }

    public BindAIPlanWithDevicesResponse bindAIPlanWithDevices(BindAIPlanWithDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindAIPlanWithDevicesWithOptions(request, runtime);
    }

    public GetAIJobResponse getAIJobWithOptions(GetAIJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAIJob", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetAIJobResponse());
    }

    public GetAIJobResponse getAIJob(GetAIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAIJobWithOptions(request, runtime);
    }

    public QueryAIJobsResponse queryAIJobsWithOptions(QueryAIJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryAIJobs", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryAIJobsResponse());
    }

    public QueryAIJobsResponse queryAIJobs(QueryAIJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAIJobsWithOptions(request, runtime);
    }

    public QueryAIActionResponse queryAIActionWithOptions(QueryAIActionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryAIAction", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryAIActionResponse());
    }

    public QueryAIActionResponse queryAIAction(QueryAIActionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAIActionWithOptions(request, runtime);
    }

    public CreateAIPlanResponse createAIPlanWithOptions(CreateAIPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateAIPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateAIPlanResponse());
    }

    public CreateAIPlanResponse createAIPlan(CreateAIPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAIPlanWithOptions(request, runtime);
    }

    public UpdateAIAppResponse updateAIAppWithOptions(UpdateAIAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateAIApp", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateAIAppResponse());
    }

    public UpdateAIAppResponse updateAIApp(UpdateAIAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAIAppWithOptions(request, runtime);
    }

    public QueryAIAppResponse queryAIAppWithOptions(QueryAIAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryAIApp", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryAIAppResponse());
    }

    public QueryAIAppResponse queryAIApp(QueryAIAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAIAppWithOptions(request, runtime);
    }

    public RemoveAIAppResponse removeAIAppWithOptions(RemoveAIAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveAIApp", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new RemoveAIAppResponse());
    }

    public RemoveAIAppResponse removeAIApp(RemoveAIAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeAIAppWithOptions(request, runtime);
    }

    public UpdateAIPlanResponse updateAIPlanWithOptions(UpdateAIPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateAIPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateAIPlanResponse());
    }

    public UpdateAIPlanResponse updateAIPlan(UpdateAIPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAIPlanWithOptions(request, runtime);
    }

    public QueryStandardAIAppTemplatesResponse queryStandardAIAppTemplatesWithOptions(QueryStandardAIAppTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryStandardAIAppTemplates", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryStandardAIAppTemplatesResponse());
    }

    public QueryStandardAIAppTemplatesResponse queryStandardAIAppTemplates(QueryStandardAIAppTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryStandardAIAppTemplatesWithOptions(request, runtime);
    }

    public RemoveAIPlanResponse removeAIPlanWithOptions(RemoveAIPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveAIPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new RemoveAIPlanResponse());
    }

    public RemoveAIPlanResponse removeAIPlan(RemoveAIPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeAIPlanWithOptions(request, runtime);
    }

    public GetAIPlanResponse getAIPlanWithOptions(GetAIPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAIPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetAIPlanResponse());
    }

    public GetAIPlanResponse getAIPlan(GetAIPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAIPlanWithOptions(request, runtime);
    }

    public ConfigAIActionResponse configAIActionWithOptions(ConfigAIActionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ConfigAIAction", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ConfigAIActionResponse());
    }

    public ConfigAIActionResponse configAIAction(ConfigAIActionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configAIActionWithOptions(request, runtime);
    }

    public QueryAIPlanResponse queryAIPlanWithOptions(QueryAIPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryAIPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryAIPlanResponse());
    }

    public QueryAIPlanResponse queryAIPlan(QueryAIPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAIPlanWithOptions(request, runtime);
    }

    public CreateDevicePurifyJobByPlanIdResponse createDevicePurifyJobByPlanIdWithOptions(CreateDevicePurifyJobByPlanIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDevicePurifyJobByPlanId", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateDevicePurifyJobByPlanIdResponse());
    }

    public CreateDevicePurifyJobByPlanIdResponse createDevicePurifyJobByPlanId(CreateDevicePurifyJobByPlanIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDevicePurifyJobByPlanIdWithOptions(request, runtime);
    }

    public RemoveDevicePurifyPlanResponse removeDevicePurifyPlanWithOptions(RemoveDevicePurifyPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveDevicePurifyPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new RemoveDevicePurifyPlanResponse());
    }

    public RemoveDevicePurifyPlanResponse removeDevicePurifyPlan(RemoveDevicePurifyPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeDevicePurifyPlanWithOptions(request, runtime);
    }

    public UpdateDevicePurifyPlanResponse updateDevicePurifyPlanWithOptions(UpdateDevicePurifyPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateDevicePurifyPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateDevicePurifyPlanResponse());
    }

    public UpdateDevicePurifyPlanResponse updateDevicePurifyPlan(UpdateDevicePurifyPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDevicePurifyPlanWithOptions(request, runtime);
    }

    public CreateDevicePurifyPlanResponse createDevicePurifyPlanWithOptions(CreateDevicePurifyPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDevicePurifyPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateDevicePurifyPlanResponse());
    }

    public CreateDevicePurifyPlanResponse createDevicePurifyPlan(CreateDevicePurifyPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDevicePurifyPlanWithOptions(request, runtime);
    }

    public QueryDevicePurifyPlanByPlanIdResponse queryDevicePurifyPlanByPlanIdWithOptions(QueryDevicePurifyPlanByPlanIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDevicePurifyPlanByPlanId", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDevicePurifyPlanByPlanIdResponse());
    }

    public QueryDevicePurifyPlanByPlanIdResponse queryDevicePurifyPlanByPlanId(QueryDevicePurifyPlanByPlanIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDevicePurifyPlanByPlanIdWithOptions(request, runtime);
    }

    public CreateDevicePurifyJobResponse createDevicePurifyJobWithOptions(CreateDevicePurifyJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDevicePurifyJob", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateDevicePurifyJobResponse());
    }

    public CreateDevicePurifyJobResponse createDevicePurifyJob(CreateDevicePurifyJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDevicePurifyJobWithOptions(request, runtime);
    }

    public GetDevicePurifyJobByJobIdResponse getDevicePurifyJobByJobIdWithOptions(GetDevicePurifyJobByJobIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDevicePurifyJobByJobId", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetDevicePurifyJobByJobIdResponse());
    }

    public GetDevicePurifyJobByJobIdResponse getDevicePurifyJobByJobId(GetDevicePurifyJobByJobIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDevicePurifyJobByJobIdWithOptions(request, runtime);
    }

    public QueryDevicePurifyJobsResponse queryDevicePurifyJobsWithOptions(QueryDevicePurifyJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDevicePurifyJobs", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDevicePurifyJobsResponse());
    }

    public QueryDevicePurifyJobsResponse queryDevicePurifyJobs(QueryDevicePurifyJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDevicePurifyJobsWithOptions(request, runtime);
    }

    public QueryDevicePurifyPlansResponse queryDevicePurifyPlansWithOptions(QueryDevicePurifyPlansRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDevicePurifyPlans", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDevicePurifyPlansResponse());
    }

    public QueryDevicePurifyPlansResponse queryDevicePurifyPlans(QueryDevicePurifyPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDevicePurifyPlansWithOptions(request, runtime);
    }

    public StopTriggeredRecordResponse stopTriggeredRecordWithOptions(StopTriggeredRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopTriggeredRecord", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new StopTriggeredRecordResponse());
    }

    public StopTriggeredRecordResponse stopTriggeredRecord(StopTriggeredRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopTriggeredRecordWithOptions(request, runtime);
    }

    public QueryRecordByRecordIdResponse queryRecordByRecordIdWithOptions(QueryRecordByRecordIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryRecordByRecordId", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryRecordByRecordIdResponse());
    }

    public QueryRecordByRecordIdResponse queryRecordByRecordId(QueryRecordByRecordIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordByRecordIdWithOptions(request, runtime);
    }

    public QueryDeviceVodUrlResponse queryDeviceVodUrlWithOptions(QueryDeviceVodUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceVodUrl", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceVodUrlResponse());
    }

    public QueryDeviceVodUrlResponse queryDeviceVodUrl(QueryDeviceVodUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDeviceVodUrlWithOptions(request, runtime);
    }

    public QueryTimeTemplateDetailResponse queryTimeTemplateDetailWithOptions(QueryTimeTemplateDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryTimeTemplateDetail", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryTimeTemplateDetailResponse());
    }

    public QueryTimeTemplateDetailResponse queryTimeTemplateDetail(QueryTimeTemplateDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTimeTemplateDetailWithOptions(request, runtime);
    }

    public UpdateTimeTemplateResponse updateTimeTemplateWithOptions(UpdateTimeTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateTimeTemplate", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateTimeTemplateResponse());
    }

    public UpdateTimeTemplateResponse updateTimeTemplate(UpdateTimeTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTimeTemplateWithOptions(request, runtime);
    }

    public CreateTimeTemplateResponse createTimeTemplateWithOptions(CreateTimeTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateTimeTemplate", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateTimeTemplateResponse());
    }

    public CreateTimeTemplateResponse createTimeTemplate(CreateTimeTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTimeTemplateWithOptions(request, runtime);
    }

    public StopLiveStreamingResponse stopLiveStreamingWithOptions(StopLiveStreamingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopLiveStreaming", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new StopLiveStreamingResponse());
    }

    public StopLiveStreamingResponse stopLiveStreaming(StopLiveStreamingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopLiveStreamingWithOptions(request, runtime);
    }

    public SetDevicePictureLifeCycleResponse setDevicePictureLifeCycleWithOptions(SetDevicePictureLifeCycleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetDevicePictureLifeCycle", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new SetDevicePictureLifeCycleResponse());
    }

    public SetDevicePictureLifeCycleResponse setDevicePictureLifeCycle(SetDevicePictureLifeCycleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDevicePictureLifeCycleWithOptions(request, runtime);
    }

    public QueryDeviceRecordLifeCycleResponse queryDeviceRecordLifeCycleWithOptions(QueryDeviceRecordLifeCycleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceRecordLifeCycle", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceRecordLifeCycleResponse());
    }

    public QueryDeviceRecordLifeCycleResponse queryDeviceRecordLifeCycle(QueryDeviceRecordLifeCycleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDeviceRecordLifeCycleWithOptions(request, runtime);
    }

    public SetDeviceRecordLifeCycleResponse setDeviceRecordLifeCycleWithOptions(SetDeviceRecordLifeCycleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetDeviceRecordLifeCycle", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new SetDeviceRecordLifeCycleResponse());
    }

    public SetDeviceRecordLifeCycleResponse setDeviceRecordLifeCycle(SetDeviceRecordLifeCycleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDeviceRecordLifeCycleWithOptions(request, runtime);
    }

    public QueryLiveStreamingResponse queryLiveStreamingWithOptions(QueryLiveStreamingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryLiveStreaming", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryLiveStreamingResponse());
    }

    public QueryLiveStreamingResponse queryLiveStreaming(QueryLiveStreamingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryLiveStreamingWithOptions(request, runtime);
    }

    public QueryDevicePictureLifeCycleResponse queryDevicePictureLifeCycleWithOptions(QueryDevicePictureLifeCycleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDevicePictureLifeCycle", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDevicePictureLifeCycleResponse());
    }

    public QueryDevicePictureLifeCycleResponse queryDevicePictureLifeCycle(QueryDevicePictureLifeCycleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDevicePictureLifeCycleWithOptions(request, runtime);
    }

    public QueryTimeTemplateResponse queryTimeTemplateWithOptions(QueryTimeTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryTimeTemplate", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryTimeTemplateResponse());
    }

    public QueryTimeTemplateResponse queryTimeTemplate(QueryTimeTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTimeTemplateWithOptions(request, runtime);
    }

    public DeleteTimeTemplateResponse deleteTimeTemplateWithOptions(DeleteTimeTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteTimeTemplate", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteTimeTemplateResponse());
    }

    public DeleteTimeTemplateResponse deleteTimeTemplate(DeleteTimeTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTimeTemplateWithOptions(request, runtime);
    }

    public CreateRecordPlanResponse createRecordPlanWithOptions(CreateRecordPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateRecordPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateRecordPlanResponse());
    }

    public CreateRecordPlanResponse createRecordPlan(CreateRecordPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRecordPlanWithOptions(request, runtime);
    }

    public UpdateRecordPlanResponse updateRecordPlanWithOptions(UpdateRecordPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateRecordPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateRecordPlanResponse());
    }

    public UpdateRecordPlanResponse updateRecordPlan(UpdateRecordPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRecordPlanWithOptions(request, runtime);
    }

    public QueryRecordPlansResponse queryRecordPlansWithOptions(QueryRecordPlansRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryRecordPlans", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryRecordPlansResponse());
    }

    public QueryRecordPlansResponse queryRecordPlans(QueryRecordPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordPlansWithOptions(request, runtime);
    }

    public QueryRecordPlanDetailResponse queryRecordPlanDetailWithOptions(QueryRecordPlanDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryRecordPlanDetail", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryRecordPlanDetailResponse());
    }

    public QueryRecordPlanDetailResponse queryRecordPlanDetail(QueryRecordPlanDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordPlanDetailWithOptions(request, runtime);
    }

    public DeleteRecordPlanResponse deleteRecordPlanWithOptions(DeleteRecordPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteRecordPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteRecordPlanResponse());
    }

    public DeleteRecordPlanResponse deleteRecordPlan(DeleteRecordPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRecordPlanWithOptions(request, runtime);
    }

    public AddRecordPlanDeviceResponse addRecordPlanDeviceWithOptions(AddRecordPlanDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddRecordPlanDevice", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new AddRecordPlanDeviceResponse());
    }

    public AddRecordPlanDeviceResponse addRecordPlanDevice(AddRecordPlanDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addRecordPlanDeviceWithOptions(request, runtime);
    }

    public DeleteRecordPlanDeviceResponse deleteRecordPlanDeviceWithOptions(DeleteRecordPlanDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteRecordPlanDevice", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteRecordPlanDeviceResponse());
    }

    public DeleteRecordPlanDeviceResponse deleteRecordPlanDevice(DeleteRecordPlanDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRecordPlanDeviceWithOptions(request, runtime);
    }

    public QueryRecordPlanDeviceByPlanResponse queryRecordPlanDeviceByPlanWithOptions(QueryRecordPlanDeviceByPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryRecordPlanDeviceByPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryRecordPlanDeviceByPlanResponse());
    }

    public QueryRecordPlanDeviceByPlanResponse queryRecordPlanDeviceByPlan(QueryRecordPlanDeviceByPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordPlanDeviceByPlanWithOptions(request, runtime);
    }

    public QueryEventRecordPlansResponse queryEventRecordPlansWithOptions(QueryEventRecordPlansRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryEventRecordPlans", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryEventRecordPlansResponse());
    }

    public QueryEventRecordPlansResponse queryEventRecordPlans(QueryEventRecordPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEventRecordPlansWithOptions(request, runtime);
    }

    public DeleteEventRecordPlanResponse deleteEventRecordPlanWithOptions(DeleteEventRecordPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteEventRecordPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteEventRecordPlanResponse());
    }

    public DeleteEventRecordPlanResponse deleteEventRecordPlan(DeleteEventRecordPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEventRecordPlanWithOptions(request, runtime);
    }

    public QueryEventRecordPlanDetailResponse queryEventRecordPlanDetailWithOptions(QueryEventRecordPlanDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryEventRecordPlanDetail", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryEventRecordPlanDetailResponse());
    }

    public QueryEventRecordPlanDetailResponse queryEventRecordPlanDetail(QueryEventRecordPlanDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEventRecordPlanDetailWithOptions(request, runtime);
    }

    public AddEventRecordPlanDeviceResponse addEventRecordPlanDeviceWithOptions(AddEventRecordPlanDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddEventRecordPlanDevice", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new AddEventRecordPlanDeviceResponse());
    }

    public AddEventRecordPlanDeviceResponse addEventRecordPlanDevice(AddEventRecordPlanDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addEventRecordPlanDeviceWithOptions(request, runtime);
    }

    public DeleteEventRecordPlanDeviceResponse deleteEventRecordPlanDeviceWithOptions(DeleteEventRecordPlanDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteEventRecordPlanDevice", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteEventRecordPlanDeviceResponse());
    }

    public DeleteEventRecordPlanDeviceResponse deleteEventRecordPlanDevice(DeleteEventRecordPlanDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEventRecordPlanDeviceWithOptions(request, runtime);
    }

    public QueryEventRecordPlanDeviceByDeviceResponse queryEventRecordPlanDeviceByDeviceWithOptions(QueryEventRecordPlanDeviceByDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryEventRecordPlanDeviceByDevice", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryEventRecordPlanDeviceByDeviceResponse());
    }

    public QueryEventRecordPlanDeviceByDeviceResponse queryEventRecordPlanDeviceByDevice(QueryEventRecordPlanDeviceByDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEventRecordPlanDeviceByDeviceWithOptions(request, runtime);
    }

    public TriggerRecordResponse triggerRecordWithOptions(TriggerRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TriggerRecord", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new TriggerRecordResponse());
    }

    public TriggerRecordResponse triggerRecord(TriggerRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.triggerRecordWithOptions(request, runtime);
    }

    public QueryDeviceEventResponse queryDeviceEventWithOptions(QueryDeviceEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceEvent", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceEventResponse());
    }

    public QueryDeviceEventResponse queryDeviceEvent(QueryDeviceEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDeviceEventWithOptions(request, runtime);
    }

    public QueryDeviceEventPictureResponse queryDeviceEventPictureWithOptions(QueryDeviceEventPictureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceEventPicture", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceEventPictureResponse());
    }

    public QueryDeviceEventPictureResponse queryDeviceEventPicture(QueryDeviceEventPictureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDeviceEventPictureWithOptions(request, runtime);
    }

    public QueryDevicePictureFileResponse queryDevicePictureFileWithOptions(QueryDevicePictureFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDevicePictureFile", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDevicePictureFileResponse());
    }

    public QueryDevicePictureFileResponse queryDevicePictureFile(QueryDevicePictureFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDevicePictureFileWithOptions(request, runtime);
    }

    public QueryMonthRecordResponse queryMonthRecordWithOptions(QueryMonthRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryMonthRecord", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryMonthRecordResponse());
    }

    public QueryMonthRecordResponse queryMonthRecord(QueryMonthRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMonthRecordWithOptions(request, runtime);
    }

    public QueryRecordPlanDeviceByDeviceResponse queryRecordPlanDeviceByDeviceWithOptions(QueryRecordPlanDeviceByDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryRecordPlanDeviceByDevice", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryRecordPlanDeviceByDeviceResponse());
    }

    public QueryRecordPlanDeviceByDeviceResponse queryRecordPlanDeviceByDevice(QueryRecordPlanDeviceByDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordPlanDeviceByDeviceWithOptions(request, runtime);
    }

    public UpdateEventRecordPlanResponse updateEventRecordPlanWithOptions(UpdateEventRecordPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateEventRecordPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateEventRecordPlanResponse());
    }

    public UpdateEventRecordPlanResponse updateEventRecordPlan(UpdateEventRecordPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEventRecordPlanWithOptions(request, runtime);
    }

    public QueryEventRecordPlanDeviceByPlanResponse queryEventRecordPlanDeviceByPlanWithOptions(QueryEventRecordPlanDeviceByPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryEventRecordPlanDeviceByPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryEventRecordPlanDeviceByPlanResponse());
    }

    public QueryEventRecordPlanDeviceByPlanResponse queryEventRecordPlanDeviceByPlan(QueryEventRecordPlanDeviceByPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEventRecordPlanDeviceByPlanWithOptions(request, runtime);
    }

    public TriggerCapturePictureResponse triggerCapturePictureWithOptions(TriggerCapturePictureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TriggerCapturePicture", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new TriggerCapturePictureResponse());
    }

    public TriggerCapturePictureResponse triggerCapturePicture(TriggerCapturePictureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.triggerCapturePictureWithOptions(request, runtime);
    }

    public QueryDeviceEventRecordResponse queryDeviceEventRecordWithOptions(QueryDeviceEventRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceEventRecord", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceEventRecordResponse());
    }

    public QueryDeviceEventRecordResponse queryDeviceEventRecord(QueryDeviceEventRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDeviceEventRecordWithOptions(request, runtime);
    }

    public QueryPictureFilesResponse queryPictureFilesWithOptions(QueryPictureFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryPictureFiles", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryPictureFilesResponse());
    }

    public QueryPictureFilesResponse queryPictureFiles(QueryPictureFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPictureFilesWithOptions(request, runtime);
    }

    public QueryRecordResponse queryRecordWithOptions(QueryRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryRecord", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryRecordResponse());
    }

    public QueryRecordResponse queryRecord(QueryRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordWithOptions(request, runtime);
    }

    public QueryRecordUrlResponse queryRecordUrlWithOptions(QueryRecordUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryRecordUrl", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryRecordUrlResponse());
    }

    public QueryRecordUrlResponse queryRecordUrl(QueryRecordUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordUrlWithOptions(request, runtime);
    }

    public QueryDeviceFileVodResponse queryDeviceFileVodWithOptions(QueryDeviceFileVodRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceFileVod", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceFileVodResponse());
    }

    public QueryDeviceFileVodResponse queryDeviceFileVod(QueryDeviceFileVodRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDeviceFileVodWithOptions(request, runtime);
    }

    public CreateEventRecordPlanResponse createEventRecordPlanWithOptions(CreateEventRecordPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateEventRecordPlan", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateEventRecordPlanResponse());
    }

    public CreateEventRecordPlanResponse createEventRecordPlan(CreateEventRecordPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
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
