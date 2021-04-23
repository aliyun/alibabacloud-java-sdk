// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111;

import com.aliyun.tea.*;
import com.aliyun.clickhouse20191111.models.*;
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
            new TeaPair("ap-northeast-2-pop", "clickhouse.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-beijing", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-edge-1", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-fujian", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-hongkong", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-qingdao", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-shanghai", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-wuhan", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "clickhouse.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "clickhouse.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "clickhouse.aliyuncs.com"),
            new TeaPair("me-east-1", "clickhouse.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "clickhouse.aliyuncs.com"),
            new TeaPair("us-east-1", "clickhouse.aliyuncs.com"),
            new TeaPair("us-west-1", "clickhouse.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("clickhouse", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public DescribeAccountAuthorityResponse describeAccountAuthorityWithOptions(DescribeAccountAuthorityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAccountAuthority", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAccountAuthorityResponse());
    }

    public DescribeAccountAuthorityResponse describeAccountAuthority(DescribeAccountAuthorityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAccountAuthorityWithOptions(request, runtime);
    }

    public CreateServiceLinkedRoleResponse createServiceLinkedRoleWithOptions(CreateServiceLinkedRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateServiceLinkedRole", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateServiceLinkedRoleResponse());
    }

    public CreateServiceLinkedRoleResponse createServiceLinkedRole(CreateServiceLinkedRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createServiceLinkedRoleWithOptions(request, runtime);
    }

    public DescribeLorneTasksResponse describeLorneTasksWithOptions(DescribeLorneTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLorneTasks", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLorneTasksResponse());
    }

    public DescribeLorneTasksResponse describeLorneTasks(DescribeLorneTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLorneTasksWithOptions(request, runtime);
    }

    public DescribeDBClusterPerformanceResponse describeDBClusterPerformanceWithOptions(DescribeDBClusterPerformanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBClusterPerformance", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBClusterPerformanceResponse());
    }

    public DescribeDBClusterPerformanceResponse describeDBClusterPerformance(DescribeDBClusterPerformanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBClusterPerformanceWithOptions(request, runtime);
    }

    public ModifyDBClusterConfigResponse modifyDBClusterConfigWithOptions(ModifyDBClusterConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBClusterConfig", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBClusterConfigResponse());
    }

    public ModifyDBClusterConfigResponse modifyDBClusterConfig(ModifyDBClusterConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBClusterConfigWithOptions(request, runtime);
    }

    public ModifyAccountDescriptionResponse modifyAccountDescriptionWithOptions(ModifyAccountDescriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAccountDescription", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAccountDescriptionResponse());
    }

    public ModifyAccountDescriptionResponse modifyAccountDescription(ModifyAccountDescriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAccountDescriptionWithOptions(request, runtime);
    }

    public DescribeDBClusterConfigResponse describeDBClusterConfigWithOptions(DescribeDBClusterConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBClusterConfig", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBClusterConfigResponse());
    }

    public DescribeDBClusterConfigResponse describeDBClusterConfig(DescribeDBClusterConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBClusterConfigWithOptions(request, runtime);
    }

    public DescribeOSSStorageResponse describeOSSStorageWithOptions(DescribeOSSStorageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeOSSStorage", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeOSSStorageResponse());
    }

    public DescribeOSSStorageResponse describeOSSStorage(DescribeOSSStorageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOSSStorageWithOptions(request, runtime);
    }

    public CreateDBInstanceResponse createDBInstanceWithOptions(CreateDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDBInstance", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDBInstanceResponse());
    }

    public CreateDBInstanceResponse createDBInstance(CreateDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDBInstanceWithOptions(request, runtime);
    }

    public ModifyDBConfigResponse modifyDBConfigWithOptions(ModifyDBConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBConfig", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBConfigResponse());
    }

    public ModifyDBConfigResponse modifyDBConfig(ModifyDBConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBConfigWithOptions(request, runtime);
    }

    public DeleteDBClusterResponse deleteDBClusterWithOptions(DeleteDBClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDBCluster", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDBClusterResponse());
    }

    public DeleteDBClusterResponse deleteDBCluster(DeleteDBClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDBClusterWithOptions(request, runtime);
    }

    public DescribeSlowLogTrendResponse describeSlowLogTrendWithOptions(DescribeSlowLogTrendRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSlowLogTrend", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSlowLogTrendResponse());
    }

    public DescribeSlowLogTrendResponse describeSlowLogTrend(DescribeSlowLogTrendRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSlowLogTrendWithOptions(request, runtime);
    }

    public DescribeAvailableResourceResponse describeAvailableResourceWithOptions(DescribeAvailableResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAvailableResource", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAvailableResourceResponse());
    }

    public DescribeAvailableResourceResponse describeAvailableResource(DescribeAvailableResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAvailableResourceWithOptions(request, runtime);
    }

    public ReleaseClusterPublicConnectionResponse releaseClusterPublicConnectionWithOptions(ReleaseClusterPublicConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseClusterPublicConnection", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseClusterPublicConnectionResponse());
    }

    public ReleaseClusterPublicConnectionResponse releaseClusterPublicConnection(ReleaseClusterPublicConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseClusterPublicConnectionWithOptions(request, runtime);
    }

    public CreateAccountResponse createAccountWithOptions(CreateAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAccount", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAccountResponse());
    }

    public CreateAccountResponse createAccount(CreateAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAccountWithOptions(request, runtime);
    }

    public DescribeLogStoreKeysResponse describeLogStoreKeysWithOptions(DescribeLogStoreKeysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLogStoreKeys", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLogStoreKeysResponse());
    }

    public DescribeLogStoreKeysResponse describeLogStoreKeys(DescribeLogStoreKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLogStoreKeysWithOptions(request, runtime);
    }

    public DescribeProcessListResponse describeProcessListWithOptions(DescribeProcessListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeProcessList", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeProcessListResponse());
    }

    public DescribeProcessListResponse describeProcessList(DescribeProcessListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeProcessListWithOptions(request, runtime);
    }

    public CreateOSSStorageResponse createOSSStorageWithOptions(CreateOSSStorageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateOSSStorage", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateOSSStorageResponse());
    }

    public CreateOSSStorageResponse createOSSStorage(CreateOSSStorageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOSSStorageWithOptions(request, runtime);
    }

    public DescribeTablesResponse describeTablesWithOptions(DescribeTablesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTables", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTablesResponse());
    }

    public DescribeTablesResponse describeTables(DescribeTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTablesWithOptions(request, runtime);
    }

    public ModifyBackupPolicyResponse modifyBackupPolicyWithOptions(ModifyBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyBackupPolicy", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyBackupPolicyResponse());
    }

    public ModifyBackupPolicyResponse modifyBackupPolicy(ModifyBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBackupPolicyWithOptions(request, runtime);
    }

    public DescribeLorneTasksMCountResponse describeLorneTasksMCountWithOptions(DescribeLorneTasksMCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLorneTasksMCount", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLorneTasksMCountResponse());
    }

    public DescribeLorneTasksMCountResponse describeLorneTasksMCount(DescribeLorneTasksMCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLorneTasksMCountWithOptions(request, runtime);
    }

    public DescribeDBConfigResponse describeDBConfigWithOptions(DescribeDBConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBConfig", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBConfigResponse());
    }

    public DescribeDBConfigResponse describeDBConfig(DescribeDBConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBConfigWithOptions(request, runtime);
    }

    public ModifyAccountAuthorityResponse modifyAccountAuthorityWithOptions(ModifyAccountAuthorityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAccountAuthority", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAccountAuthorityResponse());
    }

    public ModifyAccountAuthorityResponse modifyAccountAuthority(ModifyAccountAuthorityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAccountAuthorityWithOptions(request, runtime);
    }

    public DescribeLorneLogResponse describeLorneLogWithOptions(DescribeLorneLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLorneLog", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLorneLogResponse());
    }

    public DescribeLorneLogResponse describeLorneLog(DescribeLorneLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLorneLogWithOptions(request, runtime);
    }

    public DescribeAllDataSourcesResponse describeAllDataSourcesWithOptions(DescribeAllDataSourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAllDataSources", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAllDataSourcesResponse());
    }

    public DescribeAllDataSourcesResponse describeAllDataSources(DescribeAllDataSourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAllDataSourcesWithOptions(request, runtime);
    }

    public OperateLorneTaskStatusResponse operateLorneTaskStatusWithOptions(OperateLorneTaskStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OperateLorneTaskStatus", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new OperateLorneTaskStatusResponse());
    }

    public OperateLorneTaskStatusResponse operateLorneTaskStatus(OperateLorneTaskStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.operateLorneTaskStatusWithOptions(request, runtime);
    }

    public DescribeDBClusterAttributeResponse describeDBClusterAttributeWithOptions(DescribeDBClusterAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBClusterAttribute", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBClusterAttributeResponse());
    }

    public DescribeDBClusterAttributeResponse describeDBClusterAttribute(DescribeDBClusterAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBClusterAttributeWithOptions(request, runtime);
    }

    public DeleteLorneTaskResponse deleteLorneTaskWithOptions(DeleteLorneTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLorneTask", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLorneTaskResponse());
    }

    public DeleteLorneTaskResponse deleteLorneTask(DeleteLorneTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLorneTaskWithOptions(request, runtime);
    }

    public DescribeDBClustersResponse describeDBClustersWithOptions(DescribeDBClustersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBClusters", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBClustersResponse());
    }

    public DescribeDBClustersResponse describeDBClusters(DescribeDBClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBClustersWithOptions(request, runtime);
    }

    public OperateLogHubResponse operateLogHubWithOptions(OperateLogHubRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OperateLogHub", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new OperateLogHubResponse());
    }

    public OperateLogHubResponse operateLogHub(OperateLogHubRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.operateLogHubWithOptions(request, runtime);
    }

    public CheckServiceLinkedRoleResponse checkServiceLinkedRoleWithOptions(CheckServiceLinkedRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckServiceLinkedRole", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new CheckServiceLinkedRoleResponse());
    }

    public CheckServiceLinkedRoleResponse checkServiceLinkedRole(CheckServiceLinkedRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkServiceLinkedRoleWithOptions(request, runtime);
    }

    public CreateBackupPolicyResponse createBackupPolicyWithOptions(CreateBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateBackupPolicy", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateBackupPolicyResponse());
    }

    public CreateBackupPolicyResponse createBackupPolicy(CreateBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBackupPolicyWithOptions(request, runtime);
    }

    public DescribeSchemasResponse describeSchemasWithOptions(DescribeSchemasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSchemas", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSchemasResponse());
    }

    public DescribeSchemasResponse describeSchemas(DescribeSchemasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSchemasWithOptions(request, runtime);
    }

    public KillProcessResponse killProcessWithOptions(KillProcessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("KillProcess", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new KillProcessResponse());
    }

    public KillProcessResponse killProcess(KillProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.killProcessWithOptions(request, runtime);
    }

    public ModifyDBClusterMaintainTimeResponse modifyDBClusterMaintainTimeWithOptions(ModifyDBClusterMaintainTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBClusterMaintainTime", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBClusterMaintainTimeResponse());
    }

    public ModifyDBClusterMaintainTimeResponse modifyDBClusterMaintainTime(ModifyDBClusterMaintainTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBClusterMaintainTimeWithOptions(request, runtime);
    }

    public DescribeBackupsResponse describeBackupsWithOptions(DescribeBackupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackups", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupsResponse());
    }

    public DescribeBackupsResponse describeBackups(DescribeBackupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupsWithOptions(request, runtime);
    }

    public DescribeDBClusterAccessWhiteListResponse describeDBClusterAccessWhiteListWithOptions(DescribeDBClusterAccessWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBClusterAccessWhiteList", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBClusterAccessWhiteListResponse());
    }

    public DescribeDBClusterAccessWhiteListResponse describeDBClusterAccessWhiteList(DescribeDBClusterAccessWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBClusterAccessWhiteListWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public ModifyDBClusterDescriptionResponse modifyDBClusterDescriptionWithOptions(ModifyDBClusterDescriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBClusterDescription", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBClusterDescriptionResponse());
    }

    public ModifyDBClusterDescriptionResponse modifyDBClusterDescription(ModifyDBClusterDescriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBClusterDescriptionWithOptions(request, runtime);
    }

    public DeleteAccountResponse deleteAccountWithOptions(DeleteAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAccount", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAccountResponse());
    }

    public DeleteAccountResponse deleteAccount(DeleteAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAccountWithOptions(request, runtime);
    }

    public DescribeSlowLogRecordsResponse describeSlowLogRecordsWithOptions(DescribeSlowLogRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSlowLogRecords", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSlowLogRecordsResponse());
    }

    public DescribeSlowLogRecordsResponse describeSlowLogRecords(DescribeSlowLogRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSlowLogRecordsWithOptions(request, runtime);
    }

    public DescribeColumnsResponse describeColumnsWithOptions(DescribeColumnsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeColumns", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeColumnsResponse());
    }

    public DescribeColumnsResponse describeColumns(DescribeColumnsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeColumnsWithOptions(request, runtime);
    }

    public ResetAccountPasswordResponse resetAccountPasswordWithOptions(ResetAccountPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetAccountPassword", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new ResetAccountPasswordResponse());
    }

    public ResetAccountPasswordResponse resetAccountPassword(ResetAccountPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetAccountPasswordWithOptions(request, runtime);
    }

    public DescribeAccountsResponse describeAccountsWithOptions(DescribeAccountsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAccounts", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAccountsResponse());
    }

    public DescribeAccountsResponse describeAccounts(DescribeAccountsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAccountsWithOptions(request, runtime);
    }

    public DescribeLorneTasksMetricsResponse describeLorneTasksMetricsWithOptions(DescribeLorneTasksMetricsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLorneTasksMetrics", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLorneTasksMetricsResponse());
    }

    public DescribeLorneTasksMetricsResponse describeLorneTasksMetrics(DescribeLorneTasksMetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLorneTasksMetricsWithOptions(request, runtime);
    }

    public CheckScaleOutBalancedResponse checkScaleOutBalancedWithOptions(CheckScaleOutBalancedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckScaleOutBalanced", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new CheckScaleOutBalancedResponse());
    }

    public CheckScaleOutBalancedResponse checkScaleOutBalanced(CheckScaleOutBalancedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkScaleOutBalancedWithOptions(request, runtime);
    }

    public AllocateClusterPublicConnectionResponse allocateClusterPublicConnectionWithOptions(AllocateClusterPublicConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AllocateClusterPublicConnection", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new AllocateClusterPublicConnectionResponse());
    }

    public AllocateClusterPublicConnectionResponse allocateClusterPublicConnection(AllocateClusterPublicConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocateClusterPublicConnectionWithOptions(request, runtime);
    }

    public DescribeAllDataSourceResponse describeAllDataSourceWithOptions(DescribeAllDataSourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAllDataSource", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAllDataSourceResponse());
    }

    public DescribeAllDataSourceResponse describeAllDataSource(DescribeAllDataSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAllDataSourceWithOptions(request, runtime);
    }

    public DescribeBackupPolicyResponse describeBackupPolicyWithOptions(DescribeBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupPolicy", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupPolicyResponse());
    }

    public DescribeBackupPolicyResponse describeBackupPolicy(DescribeBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupPolicyWithOptions(request, runtime);
    }

    public DescribeDBClusterNetInfoItemsResponse describeDBClusterNetInfoItemsWithOptions(DescribeDBClusterNetInfoItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBClusterNetInfoItems", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBClusterNetInfoItemsResponse());
    }

    public DescribeDBClusterNetInfoItemsResponse describeDBClusterNetInfoItems(DescribeDBClusterNetInfoItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBClusterNetInfoItemsWithOptions(request, runtime);
    }

    public DescribeLoghubDetailResponse describeLoghubDetailWithOptions(DescribeLoghubDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLoghubDetail", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLoghubDetailResponse());
    }

    public DescribeLoghubDetailResponse describeLoghubDetail(DescribeLoghubDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLoghubDetailWithOptions(request, runtime);
    }

    public ModifyDBClusterResponse modifyDBClusterWithOptions(ModifyDBClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBCluster", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBClusterResponse());
    }

    public ModifyDBClusterResponse modifyDBCluster(ModifyDBClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBClusterWithOptions(request, runtime);
    }

    public DescribeLogHubAttributeResponse describeLogHubAttributeWithOptions(DescribeLogHubAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLogHubAttribute", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLogHubAttributeResponse());
    }

    public DescribeLogHubAttributeResponse describeLogHubAttribute(DescribeLogHubAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLogHubAttributeWithOptions(request, runtime);
    }

    public ModifyDBClusterAccessWhiteListResponse modifyDBClusterAccessWhiteListWithOptions(ModifyDBClusterAccessWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBClusterAccessWhiteList", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBClusterAccessWhiteListResponse());
    }

    public ModifyDBClusterAccessWhiteListResponse modifyDBClusterAccessWhiteList(ModifyDBClusterAccessWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBClusterAccessWhiteListWithOptions(request, runtime);
    }

    public CreateAccountAndAuthorityResponse createAccountAndAuthorityWithOptions(CreateAccountAndAuthorityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAccountAndAuthority", "2019-11-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAccountAndAuthorityResponse());
    }

    public CreateAccountAndAuthorityResponse createAccountAndAuthority(CreateAccountAndAuthorityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAccountAndAuthorityWithOptions(request, runtime);
    }
}
