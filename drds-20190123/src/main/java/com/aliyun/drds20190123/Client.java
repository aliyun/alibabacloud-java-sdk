// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123;

import com.aliyun.tea.*;
import com.aliyun.drds20190123.models.*;
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
            new TeaPair("ap-northeast-1", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "drds.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "drds.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "drds.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "drds.aliyuncs.com"),
            new TeaPair("cn-chengdu", "drds.aliyuncs.com"),
            new TeaPair("cn-edge-1", "drds.aliyuncs.com"),
            new TeaPair("cn-fujian", "drds.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "drds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "drds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "drds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "drds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "drds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "drds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "drds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "drds.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "drds.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "drds.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "drds.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "drds.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "drds.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "drds.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "drds.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "drds.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "drds.aliyuncs.com"),
            new TeaPair("cn-wuhan", "drds.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "drds.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "drds.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "drds.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "drds.aliyuncs.com"),
            new TeaPair("eu-central-1", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "drds.ap-southeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("drds", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public UpdatePrivateRdsClassResponse updatePrivateRdsClassWithOptions(UpdatePrivateRdsClassRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdatePrivateRdsClass", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new UpdatePrivateRdsClassResponse());
    }

    public UpdatePrivateRdsClassResponse updatePrivateRdsClass(UpdatePrivateRdsClassRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updatePrivateRdsClassWithOptions(request, runtime);
    }

    public UpdateResourceGroupAttributeResponse updateResourceGroupAttributeWithOptions(UpdateResourceGroupAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateResourceGroupAttribute", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new UpdateResourceGroupAttributeResponse());
    }

    public UpdateResourceGroupAttributeResponse updateResourceGroupAttribute(UpdateResourceGroupAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateResourceGroupAttributeWithOptions(request, runtime);
    }

    public ManagePrivateRdsResponse managePrivateRdsWithOptions(ManagePrivateRdsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ManagePrivateRds", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new ManagePrivateRdsResponse());
    }

    public ManagePrivateRdsResponse managePrivateRds(ManagePrivateRdsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.managePrivateRdsWithOptions(request, runtime);
    }

    public DescribeDrdsRdsInstancesResponse describeDrdsRdsInstancesWithOptions(DescribeDrdsRdsInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsRdsInstances", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsRdsInstancesResponse());
    }

    public DescribeDrdsRdsInstancesResponse describeDrdsRdsInstances(DescribeDrdsRdsInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDrdsRdsInstancesWithOptions(request, runtime);
    }

    public CreateDrdsInstanceResponse createDrdsInstanceWithOptions(CreateDrdsInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDrdsInstance", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CreateDrdsInstanceResponse());
    }

    public CreateDrdsInstanceResponse createDrdsInstance(CreateDrdsInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDrdsInstanceWithOptions(request, runtime);
    }

    public DescribeHiStoreInstanceInfoResponse describeHiStoreInstanceInfoWithOptions(DescribeHiStoreInstanceInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeHiStoreInstanceInfo", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeHiStoreInstanceInfoResponse());
    }

    public DescribeHiStoreInstanceInfoResponse describeHiStoreInstanceInfo(DescribeHiStoreInstanceInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHiStoreInstanceInfoWithOptions(request, runtime);
    }

    public SubmitSmoothExpandPreCheckResponse submitSmoothExpandPreCheckWithOptions(SubmitSmoothExpandPreCheckRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitSmoothExpandPreCheck", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SubmitSmoothExpandPreCheckResponse());
    }

    public SubmitSmoothExpandPreCheckResponse submitSmoothExpandPreCheck(SubmitSmoothExpandPreCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitSmoothExpandPreCheckWithOptions(request, runtime);
    }

    public DescribeDrdsDBClusterResponse describeDrdsDBClusterWithOptions(DescribeDrdsDBClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsDBCluster", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsDBClusterResponse());
    }

    public DescribeDrdsDBClusterResponse describeDrdsDBCluster(DescribeDrdsDBClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDrdsDBClusterWithOptions(request, runtime);
    }

    public SubmitHotExpandPreCheckTaskResponse submitHotExpandPreCheckTaskWithOptions(SubmitHotExpandPreCheckTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitHotExpandPreCheckTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SubmitHotExpandPreCheckTaskResponse());
    }

    public SubmitHotExpandPreCheckTaskResponse submitHotExpandPreCheckTask(SubmitHotExpandPreCheckTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitHotExpandPreCheckTaskWithOptions(request, runtime);
    }

    public UpgradeHiStoreInstanceResponse upgradeHiStoreInstanceWithOptions(UpgradeHiStoreInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpgradeHiStoreInstance", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new UpgradeHiStoreInstanceResponse());
    }

    public UpgradeHiStoreInstanceResponse upgradeHiStoreInstance(UpgradeHiStoreInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeHiStoreInstanceWithOptions(request, runtime);
    }

    public SubmitSmoothExpandPreCheckTaskResponse submitSmoothExpandPreCheckTaskWithOptions(SubmitSmoothExpandPreCheckTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitSmoothExpandPreCheckTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SubmitSmoothExpandPreCheckTaskResponse());
    }

    public SubmitSmoothExpandPreCheckTaskResponse submitSmoothExpandPreCheckTask(SubmitSmoothExpandPreCheckTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitSmoothExpandPreCheckTaskWithOptions(request, runtime);
    }

    public DescribePreCheckResultResponse describePreCheckResultWithOptions(DescribePreCheckResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePreCheckResult", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribePreCheckResultResponse());
    }

    public DescribePreCheckResultResponse describePreCheckResult(DescribePreCheckResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePreCheckResultWithOptions(request, runtime);
    }

    public DescribeRDSPerformanceResponse describeRDSPerformanceWithOptions(DescribeRDSPerformanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRDSPerformance", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRDSPerformanceResponse());
    }

    public DescribeRDSPerformanceResponse describeRDSPerformance(DescribeRDSPerformanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRDSPerformanceWithOptions(request, runtime);
    }

    public UpdateInstanceNetworkResponse updateInstanceNetworkWithOptions(UpdateInstanceNetworkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateInstanceNetwork", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new UpdateInstanceNetworkResponse());
    }

    public UpdateInstanceNetworkResponse updateInstanceNetwork(UpdateInstanceNetworkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateInstanceNetworkWithOptions(request, runtime);
    }

    public DescribeDrdsSqlAuditStatusResponse describeDrdsSqlAuditStatusWithOptions(DescribeDrdsSqlAuditStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsSqlAuditStatus", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsSqlAuditStatusResponse());
    }

    public DescribeDrdsSqlAuditStatusResponse describeDrdsSqlAuditStatus(DescribeDrdsSqlAuditStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDrdsSqlAuditStatusWithOptions(request, runtime);
    }

    public DescribeDrdsDbRdsNameListResponse describeDrdsDbRdsNameListWithOptions(DescribeDrdsDbRdsNameListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsDbRdsNameList", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsDbRdsNameListResponse());
    }

    public DescribeDrdsDbRdsNameListResponse describeDrdsDbRdsNameList(DescribeDrdsDbRdsNameListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDrdsDbRdsNameListWithOptions(request, runtime);
    }

    public SwitchGlobalBroadcastTypeResponse switchGlobalBroadcastTypeWithOptions(SwitchGlobalBroadcastTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SwitchGlobalBroadcastType", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SwitchGlobalBroadcastTypeResponse());
    }

    public SwitchGlobalBroadcastTypeResponse switchGlobalBroadcastType(SwitchGlobalBroadcastTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.switchGlobalBroadcastTypeWithOptions(request, runtime);
    }

    public DescribeInstanceSwitchAzoneResponse describeInstanceSwitchAzoneWithOptions(DescribeInstanceSwitchAzoneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceSwitchAzone", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceSwitchAzoneResponse());
    }

    public DescribeInstanceSwitchAzoneResponse describeInstanceSwitchAzone(DescribeInstanceSwitchAzoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceSwitchAzoneWithOptions(request, runtime);
    }

    public DescribeInstanceSwitchNetworkResponse describeInstanceSwitchNetworkWithOptions(DescribeInstanceSwitchNetworkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceSwitchNetwork", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceSwitchNetworkResponse());
    }

    public DescribeInstanceSwitchNetworkResponse describeInstanceSwitchNetwork(DescribeInstanceSwitchNetworkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceSwitchNetworkWithOptions(request, runtime);
    }

    public DescribeDbInstancesResponse describeDbInstancesWithOptions(DescribeDbInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDbInstances", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDbInstancesResponse());
    }

    public DescribeDbInstancesResponse describeDbInstances(DescribeDbInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDbInstancesWithOptions(request, runtime);
    }

    public DescribeDrdsInstancesResponse describeDrdsInstancesWithOptions(DescribeDrdsInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsInstances", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsInstancesResponse());
    }

    public DescribeDrdsInstancesResponse describeDrdsInstances(DescribeDrdsInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDrdsInstancesWithOptions(request, runtime);
    }

    public DescribeDrdsDBsResponse describeDrdsDBsWithOptions(DescribeDrdsDBsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsDBs", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsDBsResponse());
    }

    public DescribeDrdsDBsResponse describeDrdsDBs(DescribeDrdsDBsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDrdsDBsWithOptions(request, runtime);
    }

    public DescribeDrdsInstanceResponse describeDrdsInstanceWithOptions(DescribeDrdsInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsInstance", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsInstanceResponse());
    }

    public DescribeDrdsInstanceResponse describeDrdsInstance(DescribeDrdsInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDrdsInstanceWithOptions(request, runtime);
    }

    public DescribeDrdsInstanceVersionResponse describeDrdsInstanceVersionWithOptions(DescribeDrdsInstanceVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsInstanceVersion", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsInstanceVersionResponse());
    }

    public DescribeDrdsInstanceVersionResponse describeDrdsInstanceVersion(DescribeDrdsInstanceVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDrdsInstanceVersionWithOptions(request, runtime);
    }

    public DescribeRdsSuperAccountInstancesResponse describeRdsSuperAccountInstancesWithOptions(DescribeRdsSuperAccountInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRdsSuperAccountInstances", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRdsSuperAccountInstancesResponse());
    }

    public DescribeRdsSuperAccountInstancesResponse describeRdsSuperAccountInstances(DescribeRdsSuperAccountInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRdsSuperAccountInstancesWithOptions(request, runtime);
    }

    public DescribeDrdsDBResponse describeDrdsDBWithOptions(DescribeDrdsDBRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsDB", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsDBResponse());
    }

    public DescribeDrdsDBResponse describeDrdsDB(DescribeDrdsDBRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDrdsDBWithOptions(request, runtime);
    }

    public CreateDrdsDBResponse createDrdsDBWithOptions(CreateDrdsDBRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDrdsDB", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CreateDrdsDBResponse());
    }

    public CreateDrdsDBResponse createDrdsDB(CreateDrdsDBRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDrdsDBWithOptions(request, runtime);
    }

    public ModifyRdsReadWeightResponse modifyRdsReadWeightWithOptions(ModifyRdsReadWeightRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyRdsReadWeight", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new ModifyRdsReadWeightResponse());
    }

    public ModifyRdsReadWeightResponse modifyRdsReadWeight(ModifyRdsReadWeightRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyRdsReadWeightWithOptions(request, runtime);
    }

    public CheckDrdsDbNameResponse checkDrdsDbNameWithOptions(CheckDrdsDbNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckDrdsDbName", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CheckDrdsDbNameResponse());
    }

    public CheckDrdsDbNameResponse checkDrdsDbName(CheckDrdsDbNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkDrdsDbNameWithOptions(request, runtime);
    }

    public DescribeInstanceAccountsResponse describeInstanceAccountsWithOptions(DescribeInstanceAccountsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceAccounts", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceAccountsResponse());
    }

    public DescribeInstanceAccountsResponse describeInstanceAccounts(DescribeInstanceAccountsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceAccountsWithOptions(request, runtime);
    }

    public DescribeDrdsDbInstanceResponse describeDrdsDbInstanceWithOptions(DescribeDrdsDbInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsDbInstance", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsDbInstanceResponse());
    }

    public DescribeDrdsDbInstanceResponse describeDrdsDbInstance(DescribeDrdsDbInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDrdsDbInstanceWithOptions(request, runtime);
    }

    public DescribeDrdsDbInstancesResponse describeDrdsDbInstancesWithOptions(DescribeDrdsDbInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsDbInstances", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsDbInstancesResponse());
    }

    public DescribeDrdsDbInstancesResponse describeDrdsDbInstances(DescribeDrdsDbInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDrdsDbInstancesWithOptions(request, runtime);
    }

    public DescribeDrdsShardingDbsResponse describeDrdsShardingDbsWithOptions(DescribeDrdsShardingDbsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsShardingDbs", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsShardingDbsResponse());
    }

    public DescribeDrdsShardingDbsResponse describeDrdsShardingDbs(DescribeDrdsShardingDbsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDrdsShardingDbsWithOptions(request, runtime);
    }

    public RemoveDrdsInstanceResponse removeDrdsInstanceWithOptions(RemoveDrdsInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveDrdsInstance", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new RemoveDrdsInstanceResponse());
    }

    public RemoveDrdsInstanceResponse removeDrdsInstance(RemoveDrdsInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeDrdsInstanceWithOptions(request, runtime);
    }

    public CreateInstanceAccountResponse createInstanceAccountWithOptions(CreateInstanceAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateInstanceAccount", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CreateInstanceAccountResponse());
    }

    public CreateInstanceAccountResponse createInstanceAccount(CreateInstanceAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createInstanceAccountWithOptions(request, runtime);
    }

    public RemoveInstanceAccountResponse removeInstanceAccountWithOptions(RemoveInstanceAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveInstanceAccount", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new RemoveInstanceAccountResponse());
    }

    public RemoveInstanceAccountResponse removeInstanceAccount(RemoveInstanceAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeInstanceAccountWithOptions(request, runtime);
    }

    public RemoveDrdsDbResponse removeDrdsDbWithOptions(RemoveDrdsDbRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveDrdsDb", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new RemoveDrdsDbResponse());
    }

    public RemoveDrdsDbResponse removeDrdsDb(RemoveDrdsDbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeDrdsDbWithOptions(request, runtime);
    }

    public DescribeDrdsSlowSqlsResponse describeDrdsSlowSqlsWithOptions(DescribeDrdsSlowSqlsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsSlowSqls", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsSlowSqlsResponse());
    }

    public DescribeDrdsSlowSqlsResponse describeDrdsSlowSqls(DescribeDrdsSlowSqlsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDrdsSlowSqlsWithOptions(request, runtime);
    }

    public ModifyDrdsIpWhiteListResponse modifyDrdsIpWhiteListWithOptions(ModifyDrdsIpWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDrdsIpWhiteList", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDrdsIpWhiteListResponse());
    }

    public ModifyDrdsIpWhiteListResponse modifyDrdsIpWhiteList(ModifyDrdsIpWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDrdsIpWhiteListWithOptions(request, runtime);
    }

    public DescribeDrdsDBIpWhiteListResponse describeDrdsDBIpWhiteListWithOptions(DescribeDrdsDBIpWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsDBIpWhiteList", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsDBIpWhiteListResponse());
    }

    public DescribeDrdsDBIpWhiteListResponse describeDrdsDBIpWhiteList(DescribeDrdsDBIpWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDrdsDBIpWhiteListWithOptions(request, runtime);
    }

    public DescribeDrdsTasksResponse describeDrdsTasksWithOptions(DescribeDrdsTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsTasks", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsTasksResponse());
    }

    public DescribeDrdsTasksResponse describeDrdsTasks(DescribeDrdsTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDrdsTasksWithOptions(request, runtime);
    }

    public SubmitSqlFlashbackTaskResponse submitSqlFlashbackTaskWithOptions(SubmitSqlFlashbackTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitSqlFlashbackTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SubmitSqlFlashbackTaskResponse());
    }

    public SubmitSqlFlashbackTaskResponse submitSqlFlashbackTask(SubmitSqlFlashbackTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitSqlFlashbackTaskWithOptions(request, runtime);
    }

    public EnableSqlFlashbackMatchSwitchResponse enableSqlFlashbackMatchSwitchWithOptions(EnableSqlFlashbackMatchSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EnableSqlFlashbackMatchSwitch", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new EnableSqlFlashbackMatchSwitchResponse());
    }

    public EnableSqlFlashbackMatchSwitchResponse enableSqlFlashbackMatchSwitch(EnableSqlFlashbackMatchSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableSqlFlashbackMatchSwitchWithOptions(request, runtime);
    }

    public DisableSqlAuditResponse disableSqlAuditWithOptions(DisableSqlAuditRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DisableSqlAudit", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DisableSqlAuditResponse());
    }

    public DisableSqlAuditResponse disableSqlAudit(DisableSqlAuditRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableSqlAuditWithOptions(request, runtime);
    }

    public CheckSqlAuditEnableStatusResponse checkSqlAuditEnableStatusWithOptions(CheckSqlAuditEnableStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckSqlAuditEnableStatus", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CheckSqlAuditEnableStatusResponse());
    }

    public CheckSqlAuditEnableStatusResponse checkSqlAuditEnableStatus(CheckSqlAuditEnableStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkSqlAuditEnableStatusWithOptions(request, runtime);
    }

    public EnableSqlAuditResponse enableSqlAuditWithOptions(EnableSqlAuditRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EnableSqlAudit", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new EnableSqlAuditResponse());
    }

    public EnableSqlAuditResponse enableSqlAudit(EnableSqlAuditRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableSqlAuditWithOptions(request, runtime);
    }

    public DescribeInstanceMenuSwitchResponse describeInstanceMenuSwitchWithOptions(DescribeInstanceMenuSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceMenuSwitch", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceMenuSwitchResponse());
    }

    public DescribeInstanceMenuSwitchResponse describeInstanceMenuSwitch(DescribeInstanceMenuSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceMenuSwitchWithOptions(request, runtime);
    }

    public DescribeDrdsInstanceLevelTasksResponse describeDrdsInstanceLevelTasksWithOptions(DescribeDrdsInstanceLevelTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsInstanceLevelTasks", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsInstanceLevelTasksResponse());
    }

    public DescribeDrdsInstanceLevelTasksResponse describeDrdsInstanceLevelTasks(DescribeDrdsInstanceLevelTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDrdsInstanceLevelTasksWithOptions(request, runtime);
    }

    public DescribeBackMenuResponse describeBackMenuWithOptions(DescribeBackMenuRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBackMenu", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBackMenuResponse());
    }

    public DescribeBackMenuResponse describeBackMenu(DescribeBackMenuRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackMenuWithOptions(request, runtime);
    }

    public DescribeBackupDbsResponse describeBackupDbsWithOptions(DescribeBackupDbsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBackupDbs", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBackupDbsResponse());
    }

    public DescribeBackupDbsResponse describeBackupDbs(DescribeBackupDbsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupDbsWithOptions(request, runtime);
    }

    public DescribeBackupLocalResponse describeBackupLocalWithOptions(DescribeBackupLocalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBackupLocal", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBackupLocalResponse());
    }

    public DescribeBackupLocalResponse describeBackupLocal(DescribeBackupLocalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupLocalWithOptions(request, runtime);
    }

    public DescribeBackupSetsResponse describeBackupSetsWithOptions(DescribeBackupSetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBackupSets", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBackupSetsResponse());
    }

    public DescribeBackupSetsResponse describeBackupSets(DescribeBackupSetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupSetsWithOptions(request, runtime);
    }

    public DescribeBackupPolicyResponse describeBackupPolicyWithOptions(DescribeBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBackupPolicy", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBackupPolicyResponse());
    }

    public DescribeBackupPolicyResponse describeBackupPolicy(DescribeBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupPolicyWithOptions(request, runtime);
    }

    public DescribeBackupTimesResponse describeBackupTimesWithOptions(DescribeBackupTimesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBackupTimes", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBackupTimesResponse());
    }

    public DescribeBackupTimesResponse describeBackupTimes(DescribeBackupTimesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupTimesWithOptions(request, runtime);
    }

    public DescribeRestoreOrderResponse describeRestoreOrderWithOptions(DescribeRestoreOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRestoreOrder", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRestoreOrderResponse());
    }

    public DescribeRestoreOrderResponse describeRestoreOrder(DescribeRestoreOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRestoreOrderWithOptions(request, runtime);
    }

    public SetBackupLocalResponse setBackupLocalWithOptions(SetBackupLocalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetBackupLocal", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SetBackupLocalResponse());
    }

    public SetBackupLocalResponse setBackupLocal(SetBackupLocalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setBackupLocalWithOptions(request, runtime);
    }

    public RemoveBackupsSetResponse removeBackupsSetWithOptions(RemoveBackupsSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveBackupsSet", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new RemoveBackupsSetResponse());
    }

    public RemoveBackupsSetResponse removeBackupsSet(RemoveBackupsSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeBackupsSetWithOptions(request, runtime);
    }

    public SetBackupPolicyResponse setBackupPolicyWithOptions(SetBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetBackupPolicy", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SetBackupPolicyResponse());
    }

    public SetBackupPolicyResponse setBackupPolicy(SetBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setBackupPolicyWithOptions(request, runtime);
    }

    public StartRestoreResponse startRestoreWithOptions(StartRestoreRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartRestore", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new StartRestoreResponse());
    }

    public StartRestoreResponse startRestore(StartRestoreRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startRestoreWithOptions(request, runtime);
    }

    public PutStartBackupResponse putStartBackupWithOptions(PutStartBackupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PutStartBackup", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new PutStartBackupResponse());
    }

    public PutStartBackupResponse putStartBackup(PutStartBackupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putStartBackupWithOptions(request, runtime);
    }

    public DescribeDrdsDbTasksResponse describeDrdsDbTasksWithOptions(DescribeDrdsDbTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsDbTasks", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsDbTasksResponse());
    }

    public DescribeDrdsDbTasksResponse describeDrdsDbTasks(DescribeDrdsDbTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDrdsDbTasksWithOptions(request, runtime);
    }

    public SubmitSmoothExpandTaskResponse submitSmoothExpandTaskWithOptions(SubmitSmoothExpandTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitSmoothExpandTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SubmitSmoothExpandTaskResponse());
    }

    public SubmitSmoothExpandTaskResponse submitSmoothExpandTask(SubmitSmoothExpandTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitSmoothExpandTaskWithOptions(request, runtime);
    }

    public DescribeDbInstanceDbsResponse describeDbInstanceDbsWithOptions(DescribeDbInstanceDbsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDbInstanceDbs", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDbInstanceDbsResponse());
    }

    public DescribeDbInstanceDbsResponse describeDbInstanceDbs(DescribeDbInstanceDbsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDbInstanceDbsWithOptions(request, runtime);
    }

    public SubmitSwitchTaskResponse submitSwitchTaskWithOptions(SubmitSwitchTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitSwitchTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SubmitSwitchTaskResponse());
    }

    public SubmitSwitchTaskResponse submitSwitchTask(SubmitSwitchTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitSwitchTaskWithOptions(request, runtime);
    }

    public SubmitCleanTaskResponse submitCleanTaskWithOptions(SubmitCleanTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitCleanTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SubmitCleanTaskResponse());
    }

    public SubmitCleanTaskResponse submitCleanTask(SubmitCleanTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitCleanTaskWithOptions(request, runtime);
    }

    public SubmitHotExpandTaskResponse submitHotExpandTaskWithOptions(SubmitHotExpandTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitHotExpandTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SubmitHotExpandTaskResponse());
    }

    public SubmitHotExpandTaskResponse submitHotExpandTask(SubmitHotExpandTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitHotExpandTaskWithOptions(request, runtime);
    }

    public CheckExpandStatusResponse checkExpandStatusWithOptions(CheckExpandStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckExpandStatus", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CheckExpandStatusResponse());
    }

    public CheckExpandStatusResponse checkExpandStatus(CheckExpandStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkExpandStatusWithOptions(request, runtime);
    }

    public DescribeExpandLogicTableInfoListResponse describeExpandLogicTableInfoListWithOptions(DescribeExpandLogicTableInfoListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeExpandLogicTableInfoList", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeExpandLogicTableInfoListResponse());
    }

    public DescribeExpandLogicTableInfoListResponse describeExpandLogicTableInfoList(DescribeExpandLogicTableInfoListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeExpandLogicTableInfoListWithOptions(request, runtime);
    }

    public DescribeHotDbListResponse describeHotDbListWithOptions(DescribeHotDbListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeHotDbList", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeHotDbListResponse());
    }

    public DescribeHotDbListResponse describeHotDbList(DescribeHotDbListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHotDbListWithOptions(request, runtime);
    }

    public DescribeSqlFlashbakTaskResponse describeSqlFlashbakTaskWithOptions(DescribeSqlFlashbakTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSqlFlashbakTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSqlFlashbakTaskResponse());
    }

    public DescribeSqlFlashbakTaskResponse describeSqlFlashbakTask(DescribeSqlFlashbakTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSqlFlashbakTaskWithOptions(request, runtime);
    }

    public DescribeInstDbLogInfoResponse describeInstDbLogInfoWithOptions(DescribeInstDbLogInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstDbLogInfo", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstDbLogInfoResponse());
    }

    public DescribeInstDbLogInfoResponse describeInstDbLogInfo(DescribeInstDbLogInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstDbLogInfoWithOptions(request, runtime);
    }

    public DescribeInstDbSlsInfoResponse describeInstDbSlsInfoWithOptions(DescribeInstDbSlsInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstDbSlsInfo", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstDbSlsInfoResponse());
    }

    public DescribeInstDbSlsInfoResponse describeInstDbSlsInfo(DescribeInstDbSlsInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstDbSlsInfoWithOptions(request, runtime);
    }

    public CreateShardTaskResponse createShardTaskWithOptions(CreateShardTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateShardTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CreateShardTaskResponse());
    }

    public CreateShardTaskResponse createShardTask(CreateShardTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createShardTaskWithOptions(request, runtime);
    }

    public DescribeTableResponse describeTableWithOptions(DescribeTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeTable", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeTableResponse());
    }

    public DescribeTableResponse describeTable(DescribeTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTableWithOptions(request, runtime);
    }

    public UpgradeInstanceVersionResponse upgradeInstanceVersionWithOptions(UpgradeInstanceVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpgradeInstanceVersion", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new UpgradeInstanceVersionResponse());
    }

    public UpgradeInstanceVersionResponse upgradeInstanceVersion(UpgradeInstanceVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeInstanceVersionWithOptions(request, runtime);
    }

    public DescribeTableListByTypeResponse describeTableListByTypeWithOptions(DescribeTableListByTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeTableListByType", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeTableListByTypeResponse());
    }

    public DescribeTableListByTypeResponse describeTableListByType(DescribeTableListByTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTableListByTypeWithOptions(request, runtime);
    }

    public ValidateShardTaskResponse validateShardTaskWithOptions(ValidateShardTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ValidateShardTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new ValidateShardTaskResponse());
    }

    public ValidateShardTaskResponse validateShardTask(ValidateShardTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.validateShardTaskWithOptions(request, runtime);
    }

    public DescribeTablesResponse describeTablesWithOptions(DescribeTablesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeTables", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeTablesResponse());
    }

    public DescribeTablesResponse describeTables(DescribeTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTablesWithOptions(request, runtime);
    }

    public DescribeShardTaskListResponse describeShardTaskListWithOptions(DescribeShardTaskListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeShardTaskList", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeShardTaskListResponse());
    }

    public DescribeShardTaskListResponse describeShardTaskList(DescribeShardTaskListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeShardTaskListWithOptions(request, runtime);
    }

    public CreateInstanceInternetAddressResponse createInstanceInternetAddressWithOptions(CreateInstanceInternetAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateInstanceInternetAddress", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CreateInstanceInternetAddressResponse());
    }

    public CreateInstanceInternetAddressResponse createInstanceInternetAddress(CreateInstanceInternetAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createInstanceInternetAddressWithOptions(request, runtime);
    }

    public DescribeBroadcastTablesResponse describeBroadcastTablesWithOptions(DescribeBroadcastTablesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBroadcastTables", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBroadcastTablesResponse());
    }

    public DescribeBroadcastTablesResponse describeBroadcastTables(DescribeBroadcastTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBroadcastTablesWithOptions(request, runtime);
    }

    public SetupBroadcastTablesResponse setupBroadcastTablesWithOptions(SetupBroadcastTablesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetupBroadcastTables", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SetupBroadcastTablesResponse());
    }

    public SetupBroadcastTablesResponse setupBroadcastTables(SetupBroadcastTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setupBroadcastTablesWithOptions(request, runtime);
    }

    public ReleaseInstanceInternetAddressResponse releaseInstanceInternetAddressWithOptions(ReleaseInstanceInternetAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReleaseInstanceInternetAddress", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new ReleaseInstanceInternetAddressResponse());
    }

    public ReleaseInstanceInternetAddressResponse releaseInstanceInternetAddress(ReleaseInstanceInternetAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseInstanceInternetAddressWithOptions(request, runtime);
    }

    public DescribeDrdsParamsResponse describeDrdsParamsWithOptions(DescribeDrdsParamsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsParams", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsParamsResponse());
    }

    public DescribeDrdsParamsResponse describeDrdsParams(DescribeDrdsParamsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDrdsParamsWithOptions(request, runtime);
    }

    public SetupTableResponse setupTableWithOptions(SetupTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetupTable", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SetupTableResponse());
    }

    public SetupTableResponse setupTable(SetupTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setupTableWithOptions(request, runtime);
    }

    public SetupDrdsParamsResponse setupDrdsParamsWithOptions(SetupDrdsParamsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetupDrdsParams", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SetupDrdsParamsResponse());
    }

    public SetupDrdsParamsResponse setupDrdsParams(SetupDrdsParamsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setupDrdsParamsWithOptions(request, runtime);
    }

    public DescribeShardTaskInfoResponse describeShardTaskInfoWithOptions(DescribeShardTaskInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeShardTaskInfo", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeShardTaskInfoResponse());
    }

    public DescribeShardTaskInfoResponse describeShardTaskInfo(DescribeShardTaskInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeShardTaskInfoWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UntagResources", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public DescribeDrdsInstanceMonitorResponse describeDrdsInstanceMonitorWithOptions(DescribeDrdsInstanceMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsInstanceMonitor", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsInstanceMonitorResponse());
    }

    public DescribeDrdsInstanceMonitorResponse describeDrdsInstanceMonitor(DescribeDrdsInstanceMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDrdsInstanceMonitorWithOptions(request, runtime);
    }

    public DescribeDrdsInstanceDbMonitorResponse describeDrdsInstanceDbMonitorWithOptions(DescribeDrdsInstanceDbMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsInstanceDbMonitor", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsInstanceDbMonitorResponse());
    }

    public DescribeDrdsInstanceDbMonitorResponse describeDrdsInstanceDbMonitor(DescribeDrdsInstanceDbMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDrdsInstanceDbMonitorWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TagResources", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public RemoveDrdsDbFailedRecordResponse removeDrdsDbFailedRecordWithOptions(RemoveDrdsDbFailedRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveDrdsDbFailedRecord", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new RemoveDrdsDbFailedRecordResponse());
    }

    public RemoveDrdsDbFailedRecordResponse removeDrdsDbFailedRecord(RemoveDrdsDbFailedRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeDrdsDbFailedRecordWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTagResources", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public DescribeRdsCommodityResponse describeRdsCommodityWithOptions(DescribeRdsCommodityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRdsCommodity", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRdsCommodityResponse());
    }

    public DescribeRdsCommodityResponse describeRdsCommodity(DescribeRdsCommodityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRdsCommodityWithOptions(request, runtime);
    }

    public CreateOrderForRdsResponse createOrderForRdsWithOptions(CreateOrderForRdsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateOrderForRds", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CreateOrderForRdsResponse());
    }

    public CreateOrderForRdsResponse createOrderForRds(CreateOrderForRdsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOrderForRdsWithOptions(request, runtime);
    }

    public DescribeRdsPerformanceSummaryResponse describeRdsPerformanceSummaryWithOptions(DescribeRdsPerformanceSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRdsPerformanceSummary", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRdsPerformanceSummaryResponse());
    }

    public DescribeRdsPerformanceSummaryResponse describeRdsPerformanceSummary(DescribeRdsPerformanceSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRdsPerformanceSummaryWithOptions(request, runtime);
    }

    public ModifyDrdsInstanceDescriptionResponse modifyDrdsInstanceDescriptionWithOptions(ModifyDrdsInstanceDescriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDrdsInstanceDescription", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDrdsInstanceDescriptionResponse());
    }

    public ModifyDrdsInstanceDescriptionResponse modifyDrdsInstanceDescription(ModifyDrdsInstanceDescriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDrdsInstanceDescriptionWithOptions(request, runtime);
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
