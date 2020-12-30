// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306;

import com.aliyun.tea.*;
import com.aliyun.dbs20190306.models.*;
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
            new TeaPair("cn-qingdao", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-beijing", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-chengdu", "dbs-api.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "dbs-api.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hongkong", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "dbs-api.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "dbs-api.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "dbs-api.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "dbs-api.ap-southeast-5.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "dbs-api.ap-northeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("us-east-1", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("eu-central-1", "dbs-api.eu-central-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("ap-south-1", "dbs-api.ap-south-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "dbs-api.eu-west-1.aliyuncs.com"),
            new TeaPair("me-east-1", "dbs-api.me-east-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dbs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ConfigureBackupPlanResponse configureBackupPlanWithOptions(ConfigureBackupPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigureBackupPlan", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigureBackupPlanResponse());
    }

    public ConfigureBackupPlanResponse configureBackupPlan(ConfigureBackupPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configureBackupPlanWithOptions(request, runtime);
    }

    public CreateBackupPlanResponse createBackupPlanWithOptions(CreateBackupPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateBackupPlan", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new CreateBackupPlanResponse());
    }

    public CreateBackupPlanResponse createBackupPlan(CreateBackupPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBackupPlanWithOptions(request, runtime);
    }

    public CreateFullBackupSetDownloadResponse createFullBackupSetDownloadWithOptions(CreateFullBackupSetDownloadRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFullBackupSetDownload", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFullBackupSetDownloadResponse());
    }

    public CreateFullBackupSetDownloadResponse createFullBackupSetDownload(CreateFullBackupSetDownloadRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFullBackupSetDownloadWithOptions(request, runtime);
    }

    public CreateGetDBListFromAgentTaskResponse createGetDBListFromAgentTaskWithOptions(CreateGetDBListFromAgentTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateGetDBListFromAgentTask", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new CreateGetDBListFromAgentTaskResponse());
    }

    public CreateGetDBListFromAgentTaskResponse createGetDBListFromAgentTask(CreateGetDBListFromAgentTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGetDBListFromAgentTaskWithOptions(request, runtime);
    }

    public CreateIncrementBackupSetDownloadResponse createIncrementBackupSetDownloadWithOptions(CreateIncrementBackupSetDownloadRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateIncrementBackupSetDownload", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new CreateIncrementBackupSetDownloadResponse());
    }

    public CreateIncrementBackupSetDownloadResponse createIncrementBackupSetDownload(CreateIncrementBackupSetDownloadRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIncrementBackupSetDownloadWithOptions(request, runtime);
    }

    public CreateRestoreTaskResponse createRestoreTaskWithOptions(CreateRestoreTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRestoreTask", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRestoreTaskResponse());
    }

    public CreateRestoreTaskResponse createRestoreTask(CreateRestoreTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRestoreTaskWithOptions(request, runtime);
    }

    public DescribeBackupGatewayListResponse describeBackupGatewayListWithOptions(DescribeBackupGatewayListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupGatewayList", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupGatewayListResponse());
    }

    public DescribeBackupGatewayListResponse describeBackupGatewayList(DescribeBackupGatewayListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupGatewayListWithOptions(request, runtime);
    }

    public DescribeBackupPlanBillingResponse describeBackupPlanBillingWithOptions(DescribeBackupPlanBillingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupPlanBilling", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupPlanBillingResponse());
    }

    public DescribeBackupPlanBillingResponse describeBackupPlanBilling(DescribeBackupPlanBillingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupPlanBillingWithOptions(request, runtime);
    }

    public DescribeBackupPlanListResponse describeBackupPlanListWithOptions(DescribeBackupPlanListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupPlanList", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupPlanListResponse());
    }

    public DescribeBackupPlanListResponse describeBackupPlanList(DescribeBackupPlanListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupPlanListWithOptions(request, runtime);
    }

    public DescribeBackupSetDownloadTaskListResponse describeBackupSetDownloadTaskListWithOptions(DescribeBackupSetDownloadTaskListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupSetDownloadTaskList", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupSetDownloadTaskListResponse());
    }

    public DescribeBackupSetDownloadTaskListResponse describeBackupSetDownloadTaskList(DescribeBackupSetDownloadTaskListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupSetDownloadTaskListWithOptions(request, runtime);
    }

    public DescribeFullBackupListResponse describeFullBackupListWithOptions(DescribeFullBackupListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFullBackupList", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFullBackupListResponse());
    }

    public DescribeFullBackupListResponse describeFullBackupList(DescribeFullBackupListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFullBackupListWithOptions(request, runtime);
    }

    public DescribeIncrementBackupListResponse describeIncrementBackupListWithOptions(DescribeIncrementBackupListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeIncrementBackupList", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeIncrementBackupListResponse());
    }

    public DescribeIncrementBackupListResponse describeIncrementBackupList(DescribeIncrementBackupListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIncrementBackupListWithOptions(request, runtime);
    }

    public DescribeJobErrorCodeResponse describeJobErrorCodeWithOptions(DescribeJobErrorCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeJobErrorCode", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeJobErrorCodeResponse());
    }

    public DescribeJobErrorCodeResponse describeJobErrorCode(DescribeJobErrorCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeJobErrorCodeWithOptions(request, runtime);
    }

    public DescribeNodeCidrListResponse describeNodeCidrListWithOptions(DescribeNodeCidrListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNodeCidrList", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeNodeCidrListResponse());
    }

    public DescribeNodeCidrListResponse describeNodeCidrList(DescribeNodeCidrListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNodeCidrListWithOptions(request, runtime);
    }

    public DescribePreCheckProgressListResponse describePreCheckProgressListWithOptions(DescribePreCheckProgressListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePreCheckProgressList", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePreCheckProgressListResponse());
    }

    public DescribePreCheckProgressListResponse describePreCheckProgressList(DescribePreCheckProgressListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePreCheckProgressListWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeRestoreRangeInfoResponse describeRestoreRangeInfoWithOptions(DescribeRestoreRangeInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRestoreRangeInfo", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRestoreRangeInfoResponse());
    }

    public DescribeRestoreRangeInfoResponse describeRestoreRangeInfo(DescribeRestoreRangeInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRestoreRangeInfoWithOptions(request, runtime);
    }

    public DescribeRestoreTaskListResponse describeRestoreTaskListWithOptions(DescribeRestoreTaskListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRestoreTaskList", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRestoreTaskListResponse());
    }

    public DescribeRestoreTaskListResponse describeRestoreTaskList(DescribeRestoreTaskListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRestoreTaskListWithOptions(request, runtime);
    }

    public DisableBackupLogResponse disableBackupLogWithOptions(DisableBackupLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableBackupLog", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new DisableBackupLogResponse());
    }

    public DisableBackupLogResponse disableBackupLog(DisableBackupLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableBackupLogWithOptions(request, runtime);
    }

    public EnableBackupLogResponse enableBackupLogWithOptions(EnableBackupLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableBackupLog", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new EnableBackupLogResponse());
    }

    public EnableBackupLogResponse enableBackupLog(EnableBackupLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableBackupLogWithOptions(request, runtime);
    }

    public GetDBListFromAgentResponse getDBListFromAgentWithOptions(GetDBListFromAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDBListFromAgent", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetDBListFromAgentResponse());
    }

    public GetDBListFromAgentResponse getDBListFromAgent(GetDBListFromAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDBListFromAgentWithOptions(request, runtime);
    }

    public ModifyBackupObjectsResponse modifyBackupObjectsWithOptions(ModifyBackupObjectsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyBackupObjects", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyBackupObjectsResponse());
    }

    public ModifyBackupObjectsResponse modifyBackupObjects(ModifyBackupObjectsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBackupObjectsWithOptions(request, runtime);
    }

    public ModifyBackupPlanNameResponse modifyBackupPlanNameWithOptions(ModifyBackupPlanNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyBackupPlanName", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyBackupPlanNameResponse());
    }

    public ModifyBackupPlanNameResponse modifyBackupPlanName(ModifyBackupPlanNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBackupPlanNameWithOptions(request, runtime);
    }

    public ModifyBackupSetDownloadRulesResponse modifyBackupSetDownloadRulesWithOptions(ModifyBackupSetDownloadRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyBackupSetDownloadRules", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyBackupSetDownloadRulesResponse());
    }

    public ModifyBackupSetDownloadRulesResponse modifyBackupSetDownloadRules(ModifyBackupSetDownloadRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBackupSetDownloadRulesWithOptions(request, runtime);
    }

    public ModifyBackupSourceEndpointResponse modifyBackupSourceEndpointWithOptions(ModifyBackupSourceEndpointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyBackupSourceEndpoint", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyBackupSourceEndpointResponse());
    }

    public ModifyBackupSourceEndpointResponse modifyBackupSourceEndpoint(ModifyBackupSourceEndpointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBackupSourceEndpointWithOptions(request, runtime);
    }

    public ModifyBackupStrategyResponse modifyBackupStrategyWithOptions(ModifyBackupStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyBackupStrategy", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyBackupStrategyResponse());
    }

    public ModifyBackupStrategyResponse modifyBackupStrategy(ModifyBackupStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBackupStrategyWithOptions(request, runtime);
    }

    public ModifyStorageStrategyResponse modifyStorageStrategyWithOptions(ModifyStorageStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyStorageStrategy", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyStorageStrategyResponse());
    }

    public ModifyStorageStrategyResponse modifyStorageStrategy(ModifyStorageStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyStorageStrategyWithOptions(request, runtime);
    }

    public ReleaseBackupPlanResponse releaseBackupPlanWithOptions(ReleaseBackupPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseBackupPlan", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseBackupPlanResponse());
    }

    public ReleaseBackupPlanResponse releaseBackupPlan(ReleaseBackupPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseBackupPlanWithOptions(request, runtime);
    }

    public RenewBackupPlanResponse renewBackupPlanWithOptions(RenewBackupPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RenewBackupPlan", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new RenewBackupPlanResponse());
    }

    public RenewBackupPlanResponse renewBackupPlan(RenewBackupPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewBackupPlanWithOptions(request, runtime);
    }

    public StartBackupPlanResponse startBackupPlanWithOptions(StartBackupPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartBackupPlan", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new StartBackupPlanResponse());
    }

    public StartBackupPlanResponse startBackupPlan(StartBackupPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startBackupPlanWithOptions(request, runtime);
    }

    public StartRestoreTaskResponse startRestoreTaskWithOptions(StartRestoreTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartRestoreTask", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new StartRestoreTaskResponse());
    }

    public StartRestoreTaskResponse startRestoreTask(StartRestoreTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startRestoreTaskWithOptions(request, runtime);
    }

    public StartTaskResponse startTaskWithOptions(StartTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartTask", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new StartTaskResponse());
    }

    public StartTaskResponse startTask(StartTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startTaskWithOptions(request, runtime);
    }

    public StopBackupPlanResponse stopBackupPlanWithOptions(StopBackupPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopBackupPlan", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new StopBackupPlanResponse());
    }

    public StopBackupPlanResponse stopBackupPlan(StopBackupPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopBackupPlanWithOptions(request, runtime);
    }

    public UpgradeBackupPlanResponse upgradeBackupPlanWithOptions(UpgradeBackupPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeBackupPlan", "2019-03-06", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeBackupPlanResponse());
    }

    public UpgradeBackupPlanResponse upgradeBackupPlan(UpgradeBackupPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeBackupPlanWithOptions(request, runtime);
    }
}
