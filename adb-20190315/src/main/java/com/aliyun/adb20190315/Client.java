// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315;

import com.aliyun.tea.*;
import com.aliyun.adb20190315.models.*;
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
            new TeaPair("cn-qingdao", "adb.aliyuncs.com"),
            new TeaPair("cn-beijing", "adb.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "adb.aliyuncs.com"),
            new TeaPair("cn-shanghai", "adb.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "adb.aliyuncs.com"),
            new TeaPair("cn-hongkong", "adb.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "adb.aliyuncs.com"),
            new TeaPair("us-west-1", "adb.aliyuncs.com"),
            new TeaPair("us-east-1", "adb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "adb.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "adb.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "adb.ap-northeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "adb.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "adb.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "adb.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "adb.aliyuncs.com"),
            new TeaPair("cn-edge-1", "adb.aliyuncs.com"),
            new TeaPair("cn-fujian", "adb.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "adb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "adb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "adb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "adb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "adb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "adb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "adb.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "adb.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "adb.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "adb.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "adb.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "adb.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "adb.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "adb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "adb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "adb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "adb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "adb.aliyuncs.com"),
            new TeaPair("cn-wuhan", "adb.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "adb.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "adb.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "adb.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "adb.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "adb.ap-northeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "adb.ap-northeast-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "adb.ap-northeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("adb", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AllocateClusterPublicConnectionResponse allocateClusterPublicConnectionWithOptions(AllocateClusterPublicConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AllocateClusterPublicConnection", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new AllocateClusterPublicConnectionResponse());
    }

    public AllocateClusterPublicConnectionResponse allocateClusterPublicConnection(AllocateClusterPublicConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocateClusterPublicConnectionWithOptions(request, runtime);
    }

    public BindDBResourcePoolWithUserResponse bindDBResourcePoolWithUserWithOptions(BindDBResourcePoolWithUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindDBResourcePoolWithUser", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new BindDBResourcePoolWithUserResponse());
    }

    public BindDBResourcePoolWithUserResponse bindDBResourcePoolWithUser(BindDBResourcePoolWithUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindDBResourcePoolWithUserWithOptions(request, runtime);
    }

    public CreateAccountResponse createAccountWithOptions(CreateAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAccount", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAccountResponse());
    }

    public CreateAccountResponse createAccount(CreateAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAccountWithOptions(request, runtime);
    }

    public CreateDBClusterResponse createDBClusterWithOptions(CreateDBClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDBCluster", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDBClusterResponse());
    }

    public CreateDBClusterResponse createDBCluster(CreateDBClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDBClusterWithOptions(request, runtime);
    }

    public CreateDBResourcePoolResponse createDBResourcePoolWithOptions(CreateDBResourcePoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDBResourcePool", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDBResourcePoolResponse());
    }

    public CreateDBResourcePoolResponse createDBResourcePool(CreateDBResourcePoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDBResourcePoolWithOptions(request, runtime);
    }

    public CreateElasticPlanResponse createElasticPlanWithOptions(CreateElasticPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateElasticPlan", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateElasticPlanResponse());
    }

    public CreateElasticPlanResponse createElasticPlan(CreateElasticPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createElasticPlanWithOptions(request, runtime);
    }

    public DeleteAccountResponse deleteAccountWithOptions(DeleteAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAccount", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAccountResponse());
    }

    public DeleteAccountResponse deleteAccount(DeleteAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAccountWithOptions(request, runtime);
    }

    public DeleteDBClusterResponse deleteDBClusterWithOptions(DeleteDBClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDBCluster", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDBClusterResponse());
    }

    public DeleteDBClusterResponse deleteDBCluster(DeleteDBClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDBClusterWithOptions(request, runtime);
    }

    public DeleteDBResourcePoolResponse deleteDBResourcePoolWithOptions(DeleteDBResourcePoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDBResourcePool", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDBResourcePoolResponse());
    }

    public DeleteDBResourcePoolResponse deleteDBResourcePool(DeleteDBResourcePoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDBResourcePoolWithOptions(request, runtime);
    }

    public DeleteElasticPlanResponse deleteElasticPlanWithOptions(DeleteElasticPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteElasticPlan", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteElasticPlanResponse());
    }

    public DeleteElasticPlanResponse deleteElasticPlan(DeleteElasticPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteElasticPlanWithOptions(request, runtime);
    }

    public DescribeAccountsResponse describeAccountsWithOptions(DescribeAccountsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAccounts", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAccountsResponse());
    }

    public DescribeAccountsResponse describeAccounts(DescribeAccountsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAccountsWithOptions(request, runtime);
    }

    public DescribeAllAccountsResponse describeAllAccountsWithOptions(DescribeAllAccountsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAllAccounts", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAllAccountsResponse());
    }

    public DescribeAllAccountsResponse describeAllAccounts(DescribeAllAccountsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAllAccountsWithOptions(request, runtime);
    }

    public DescribeAllDataSourceResponse describeAllDataSourceWithOptions(DescribeAllDataSourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAllDataSource", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAllDataSourceResponse());
    }

    public DescribeAllDataSourceResponse describeAllDataSource(DescribeAllDataSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAllDataSourceWithOptions(request, runtime);
    }

    public DescribeAuditLogConfigResponse describeAuditLogConfigWithOptions(DescribeAuditLogConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAuditLogConfig", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAuditLogConfigResponse());
    }

    public DescribeAuditLogConfigResponse describeAuditLogConfig(DescribeAuditLogConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAuditLogConfigWithOptions(request, runtime);
    }

    public DescribeAuditLogRecordsResponse describeAuditLogRecordsWithOptions(DescribeAuditLogRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAuditLogRecords", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAuditLogRecordsResponse());
    }

    public DescribeAuditLogRecordsResponse describeAuditLogRecords(DescribeAuditLogRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAuditLogRecordsWithOptions(request, runtime);
    }

    public DescribeAutoRenewAttributeResponse describeAutoRenewAttributeWithOptions(DescribeAutoRenewAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAutoRenewAttribute", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAutoRenewAttributeResponse());
    }

    public DescribeAutoRenewAttributeResponse describeAutoRenewAttribute(DescribeAutoRenewAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAutoRenewAttributeWithOptions(request, runtime);
    }

    public DescribeAvailableResourceResponse describeAvailableResourceWithOptions(DescribeAvailableResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAvailableResource", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAvailableResourceResponse());
    }

    public DescribeAvailableResourceResponse describeAvailableResource(DescribeAvailableResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAvailableResourceWithOptions(request, runtime);
    }

    public DescribeBackupPolicyResponse describeBackupPolicyWithOptions(DescribeBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupPolicy", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupPolicyResponse());
    }

    public DescribeBackupPolicyResponse describeBackupPolicy(DescribeBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupPolicyWithOptions(request, runtime);
    }

    public DescribeBackupsResponse describeBackupsWithOptions(DescribeBackupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackups", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupsResponse());
    }

    public DescribeBackupsResponse describeBackups(DescribeBackupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupsWithOptions(request, runtime);
    }

    public DescribeColumnsResponse describeColumnsWithOptions(DescribeColumnsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeColumns", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeColumnsResponse());
    }

    public DescribeColumnsResponse describeColumns(DescribeColumnsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeColumnsWithOptions(request, runtime);
    }

    public DescribeConnectionCountRecordsResponse describeConnectionCountRecordsWithOptions(DescribeConnectionCountRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeConnectionCountRecords", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeConnectionCountRecordsResponse());
    }

    public DescribeConnectionCountRecordsResponse describeConnectionCountRecords(DescribeConnectionCountRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeConnectionCountRecordsWithOptions(request, runtime);
    }

    public DescribeDBClusterAccessWhiteListResponse describeDBClusterAccessWhiteListWithOptions(DescribeDBClusterAccessWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBClusterAccessWhiteList", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBClusterAccessWhiteListResponse());
    }

    public DescribeDBClusterAccessWhiteListResponse describeDBClusterAccessWhiteList(DescribeDBClusterAccessWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBClusterAccessWhiteListWithOptions(request, runtime);
    }

    public DescribeDBClusterAttributeResponse describeDBClusterAttributeWithOptions(DescribeDBClusterAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBClusterAttribute", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBClusterAttributeResponse());
    }

    public DescribeDBClusterAttributeResponse describeDBClusterAttribute(DescribeDBClusterAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBClusterAttributeWithOptions(request, runtime);
    }

    public DescribeDBClusterNetInfoResponse describeDBClusterNetInfoWithOptions(DescribeDBClusterNetInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBClusterNetInfo", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBClusterNetInfoResponse());
    }

    public DescribeDBClusterNetInfoResponse describeDBClusterNetInfo(DescribeDBClusterNetInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBClusterNetInfoWithOptions(request, runtime);
    }

    public DescribeDBClusterPerformanceResponse describeDBClusterPerformanceWithOptions(DescribeDBClusterPerformanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBClusterPerformance", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBClusterPerformanceResponse());
    }

    public DescribeDBClusterPerformanceResponse describeDBClusterPerformance(DescribeDBClusterPerformanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBClusterPerformanceWithOptions(request, runtime);
    }

    public DescribeDBClusterResourcePoolPerformanceResponse describeDBClusterResourcePoolPerformanceWithOptions(DescribeDBClusterResourcePoolPerformanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBClusterResourcePoolPerformance", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBClusterResourcePoolPerformanceResponse());
    }

    public DescribeDBClusterResourcePoolPerformanceResponse describeDBClusterResourcePoolPerformance(DescribeDBClusterResourcePoolPerformanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBClusterResourcePoolPerformanceWithOptions(request, runtime);
    }

    public DescribeDBClustersResponse describeDBClustersWithOptions(DescribeDBClustersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBClusters", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBClustersResponse());
    }

    public DescribeDBClustersResponse describeDBClusters(DescribeDBClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBClustersWithOptions(request, runtime);
    }

    public DescribeDBResourcePoolResponse describeDBResourcePoolWithOptions(DescribeDBResourcePoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBResourcePool", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBResourcePoolResponse());
    }

    public DescribeDBResourcePoolResponse describeDBResourcePool(DescribeDBResourcePoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBResourcePoolWithOptions(request, runtime);
    }

    public DescribeElasticDailyPlanResponse describeElasticDailyPlanWithOptions(DescribeElasticDailyPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeElasticDailyPlan", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeElasticDailyPlanResponse());
    }

    public DescribeElasticDailyPlanResponse describeElasticDailyPlan(DescribeElasticDailyPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeElasticDailyPlanWithOptions(request, runtime);
    }

    public DescribeElasticPlanResponse describeElasticPlanWithOptions(DescribeElasticPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeElasticPlan", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeElasticPlanResponse());
    }

    public DescribeElasticPlanResponse describeElasticPlan(DescribeElasticPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeElasticPlanWithOptions(request, runtime);
    }

    public DescribeInclinedTablesResponse describeInclinedTablesWithOptions(DescribeInclinedTablesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInclinedTables", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInclinedTablesResponse());
    }

    public DescribeInclinedTablesResponse describeInclinedTables(DescribeInclinedTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInclinedTablesWithOptions(request, runtime);
    }

    public DescribeLoadTasksRecordsResponse describeLoadTasksRecordsWithOptions(DescribeLoadTasksRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLoadTasksRecords", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLoadTasksRecordsResponse());
    }

    public DescribeLoadTasksRecordsResponse describeLoadTasksRecords(DescribeLoadTasksRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLoadTasksRecordsWithOptions(request, runtime);
    }

    public DescribeOperatorPermissionResponse describeOperatorPermissionWithOptions(DescribeOperatorPermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeOperatorPermission", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeOperatorPermissionResponse());
    }

    public DescribeOperatorPermissionResponse describeOperatorPermission(DescribeOperatorPermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOperatorPermissionWithOptions(request, runtime);
    }

    public DescribeProcessListResponse describeProcessListWithOptions(DescribeProcessListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeProcessList", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeProcessListResponse());
    }

    public DescribeProcessListResponse describeProcessList(DescribeProcessListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeProcessListWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeSchemasResponse describeSchemasWithOptions(DescribeSchemasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSchemas", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSchemasResponse());
    }

    public DescribeSchemasResponse describeSchemas(DescribeSchemasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSchemasWithOptions(request, runtime);
    }

    public DescribeSlowLogRecordsResponse describeSlowLogRecordsWithOptions(DescribeSlowLogRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSlowLogRecords", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSlowLogRecordsResponse());
    }

    public DescribeSlowLogRecordsResponse describeSlowLogRecords(DescribeSlowLogRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSlowLogRecordsWithOptions(request, runtime);
    }

    public DescribeSlowLogTrendResponse describeSlowLogTrendWithOptions(DescribeSlowLogTrendRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSlowLogTrend", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSlowLogTrendResponse());
    }

    public DescribeSlowLogTrendResponse describeSlowLogTrend(DescribeSlowLogTrendRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSlowLogTrendWithOptions(request, runtime);
    }

    public DescribeSQLPlanResponse describeSQLPlanWithOptions(DescribeSQLPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSQLPlan", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSQLPlanResponse());
    }

    public DescribeSQLPlanResponse describeSQLPlan(DescribeSQLPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSQLPlanWithOptions(request, runtime);
    }

    public DescribeSQLPlanTaskResponse describeSQLPlanTaskWithOptions(DescribeSQLPlanTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSQLPlanTask", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSQLPlanTaskResponse());
    }

    public DescribeSQLPlanTaskResponse describeSQLPlanTask(DescribeSQLPlanTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSQLPlanTaskWithOptions(request, runtime);
    }

    public DescribeTableDetailResponse describeTableDetailWithOptions(DescribeTableDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTableDetail", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTableDetailResponse());
    }

    public DescribeTableDetailResponse describeTableDetail(DescribeTableDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTableDetailWithOptions(request, runtime);
    }

    public DescribeTablePartitionDiagnoseResponse describeTablePartitionDiagnoseWithOptions(DescribeTablePartitionDiagnoseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTablePartitionDiagnose", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTablePartitionDiagnoseResponse());
    }

    public DescribeTablePartitionDiagnoseResponse describeTablePartitionDiagnose(DescribeTablePartitionDiagnoseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTablePartitionDiagnoseWithOptions(request, runtime);
    }

    public DescribeTablesResponse describeTablesWithOptions(DescribeTablesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTables", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTablesResponse());
    }

    public DescribeTablesResponse describeTables(DescribeTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTablesWithOptions(request, runtime);
    }

    public DescribeTableStatisticsResponse describeTableStatisticsWithOptions(DescribeTableStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTableStatistics", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTableStatisticsResponse());
    }

    public DescribeTableStatisticsResponse describeTableStatistics(DescribeTableStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTableStatisticsWithOptions(request, runtime);
    }

    public DescribeTaskInfoResponse describeTaskInfoWithOptions(DescribeTaskInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTaskInfo", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTaskInfoResponse());
    }

    public DescribeTaskInfoResponse describeTaskInfo(DescribeTaskInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTaskInfoWithOptions(request, runtime);
    }

    public GrantOperatorPermissionResponse grantOperatorPermissionWithOptions(GrantOperatorPermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GrantOperatorPermission", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new GrantOperatorPermissionResponse());
    }

    public GrantOperatorPermissionResponse grantOperatorPermission(GrantOperatorPermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.grantOperatorPermissionWithOptions(request, runtime);
    }

    public KillProcessResponse killProcessWithOptions(KillProcessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("KillProcess", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new KillProcessResponse());
    }

    public KillProcessResponse killProcess(KillProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.killProcessWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ModifyAccountDescriptionResponse modifyAccountDescriptionWithOptions(ModifyAccountDescriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAccountDescription", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAccountDescriptionResponse());
    }

    public ModifyAccountDescriptionResponse modifyAccountDescription(ModifyAccountDescriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAccountDescriptionWithOptions(request, runtime);
    }

    public ModifyAuditLogConfigResponse modifyAuditLogConfigWithOptions(ModifyAuditLogConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAuditLogConfig", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAuditLogConfigResponse());
    }

    public ModifyAuditLogConfigResponse modifyAuditLogConfig(ModifyAuditLogConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAuditLogConfigWithOptions(request, runtime);
    }

    public ModifyAutoRenewAttributeResponse modifyAutoRenewAttributeWithOptions(ModifyAutoRenewAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAutoRenewAttribute", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAutoRenewAttributeResponse());
    }

    public ModifyAutoRenewAttributeResponse modifyAutoRenewAttribute(ModifyAutoRenewAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAutoRenewAttributeWithOptions(request, runtime);
    }

    public ModifyBackupPolicyResponse modifyBackupPolicyWithOptions(ModifyBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyBackupPolicy", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyBackupPolicyResponse());
    }

    public ModifyBackupPolicyResponse modifyBackupPolicy(ModifyBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBackupPolicyWithOptions(request, runtime);
    }

    public ModifyClusterConnectionStringResponse modifyClusterConnectionStringWithOptions(ModifyClusterConnectionStringRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyClusterConnectionString", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyClusterConnectionStringResponse());
    }

    public ModifyClusterConnectionStringResponse modifyClusterConnectionString(ModifyClusterConnectionStringRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyClusterConnectionStringWithOptions(request, runtime);
    }

    public ModifyDBClusterResponse modifyDBClusterWithOptions(ModifyDBClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBCluster", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBClusterResponse());
    }

    public ModifyDBClusterResponse modifyDBCluster(ModifyDBClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBClusterWithOptions(request, runtime);
    }

    public ModifyDBClusterAccessWhiteListResponse modifyDBClusterAccessWhiteListWithOptions(ModifyDBClusterAccessWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBClusterAccessWhiteList", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBClusterAccessWhiteListResponse());
    }

    public ModifyDBClusterAccessWhiteListResponse modifyDBClusterAccessWhiteList(ModifyDBClusterAccessWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBClusterAccessWhiteListWithOptions(request, runtime);
    }

    public ModifyDBClusterDescriptionResponse modifyDBClusterDescriptionWithOptions(ModifyDBClusterDescriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBClusterDescription", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBClusterDescriptionResponse());
    }

    public ModifyDBClusterDescriptionResponse modifyDBClusterDescription(ModifyDBClusterDescriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBClusterDescriptionWithOptions(request, runtime);
    }

    public ModifyDBClusterMaintainTimeResponse modifyDBClusterMaintainTimeWithOptions(ModifyDBClusterMaintainTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBClusterMaintainTime", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBClusterMaintainTimeResponse());
    }

    public ModifyDBClusterMaintainTimeResponse modifyDBClusterMaintainTime(ModifyDBClusterMaintainTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBClusterMaintainTimeWithOptions(request, runtime);
    }

    public ModifyDBClusterResourceGroupResponse modifyDBClusterResourceGroupWithOptions(ModifyDBClusterResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBClusterResourceGroup", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBClusterResourceGroupResponse());
    }

    public ModifyDBClusterResourceGroupResponse modifyDBClusterResourceGroup(ModifyDBClusterResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBClusterResourceGroupWithOptions(request, runtime);
    }

    public ModifyDBResourcePoolResponse modifyDBResourcePoolWithOptions(ModifyDBResourcePoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBResourcePool", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBResourcePoolResponse());
    }

    public ModifyDBResourcePoolResponse modifyDBResourcePool(ModifyDBResourcePoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBResourcePoolWithOptions(request, runtime);
    }

    public ModifyElasticPlanResponse modifyElasticPlanWithOptions(ModifyElasticPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyElasticPlan", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyElasticPlanResponse());
    }

    public ModifyElasticPlanResponse modifyElasticPlan(ModifyElasticPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyElasticPlanWithOptions(request, runtime);
    }

    public ModifyLogBackupPolicyResponse modifyLogBackupPolicyWithOptions(ModifyLogBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyLogBackupPolicy", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyLogBackupPolicyResponse());
    }

    public ModifyLogBackupPolicyResponse modifyLogBackupPolicy(ModifyLogBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyLogBackupPolicyWithOptions(request, runtime);
    }

    public ReleaseClusterPublicConnectionResponse releaseClusterPublicConnectionWithOptions(ReleaseClusterPublicConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseClusterPublicConnection", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseClusterPublicConnectionResponse());
    }

    public ReleaseClusterPublicConnectionResponse releaseClusterPublicConnection(ReleaseClusterPublicConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseClusterPublicConnectionWithOptions(request, runtime);
    }

    public ResetAccountPasswordResponse resetAccountPasswordWithOptions(ResetAccountPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetAccountPassword", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new ResetAccountPasswordResponse());
    }

    public ResetAccountPasswordResponse resetAccountPassword(ResetAccountPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetAccountPasswordWithOptions(request, runtime);
    }

    public RevokeOperatorPermissionResponse revokeOperatorPermissionWithOptions(RevokeOperatorPermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RevokeOperatorPermission", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new RevokeOperatorPermissionResponse());
    }

    public RevokeOperatorPermissionResponse revokeOperatorPermission(RevokeOperatorPermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.revokeOperatorPermissionWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UnbindDBResourcePoolWithUserResponse unbindDBResourcePoolWithUserWithOptions(UnbindDBResourcePoolWithUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindDBResourcePoolWithUser", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindDBResourcePoolWithUserResponse());
    }

    public UnbindDBResourcePoolWithUserResponse unbindDBResourcePoolWithUser(UnbindDBResourcePoolWithUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindDBResourcePoolWithUserWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResources", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }
}
