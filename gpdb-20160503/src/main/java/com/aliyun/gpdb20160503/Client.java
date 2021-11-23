// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503;

import com.aliyun.tea.*;
import com.aliyun.gpdb20160503.models.*;
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
            new TeaPair("cn-beijing", "gpdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "gpdb.aliyuncs.com"),
            new TeaPair("cn-shanghai", "gpdb.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "gpdb.aliyuncs.com"),
            new TeaPair("cn-hongkong", "gpdb.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "gpdb.aliyuncs.com"),
            new TeaPair("us-west-1", "gpdb.aliyuncs.com"),
            new TeaPair("us-east-1", "gpdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "gpdb.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "gpdb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "gpdb.aliyuncs.com"),
            new TeaPair("cn-qingdao", "gpdb.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "gpdb.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("gpdb", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddBuDBInstanceRelationResponse addBuDBInstanceRelationWithOptions(AddBuDBInstanceRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddBuDBInstanceRelation", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new AddBuDBInstanceRelationResponse());
    }

    public AddBuDBInstanceRelationResponse addBuDBInstanceRelation(AddBuDBInstanceRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addBuDBInstanceRelationWithOptions(request, runtime);
    }

    public AllocateInstancePublicConnectionResponse allocateInstancePublicConnectionWithOptions(AllocateInstancePublicConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AllocateInstancePublicConnection", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new AllocateInstancePublicConnectionResponse());
    }

    public AllocateInstancePublicConnectionResponse allocateInstancePublicConnection(AllocateInstancePublicConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocateInstancePublicConnectionWithOptions(request, runtime);
    }

    public CheckServiceLinkedRoleResponse checkServiceLinkedRoleWithOptions(CheckServiceLinkedRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckServiceLinkedRole", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new CheckServiceLinkedRoleResponse());
    }

    public CheckServiceLinkedRoleResponse checkServiceLinkedRole(CheckServiceLinkedRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkServiceLinkedRoleWithOptions(request, runtime);
    }

    public CreateAccountResponse createAccountWithOptions(CreateAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAccount", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAccountResponse());
    }

    public CreateAccountResponse createAccount(CreateAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAccountWithOptions(request, runtime);
    }

    public CreateDBInstanceResponse createDBInstanceWithOptions(CreateDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDBInstance", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDBInstanceResponse());
    }

    public CreateDBInstanceResponse createDBInstance(CreateDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDBInstanceWithOptions(request, runtime);
    }

    public CreateECSDBInstanceResponse createECSDBInstanceWithOptions(CreateECSDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateECSDBInstance", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new CreateECSDBInstanceResponse());
    }

    public CreateECSDBInstanceResponse createECSDBInstance(CreateECSDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createECSDBInstanceWithOptions(request, runtime);
    }

    public CreateServiceLinkedRoleResponse createServiceLinkedRoleWithOptions(CreateServiceLinkedRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateServiceLinkedRole", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new CreateServiceLinkedRoleResponse());
    }

    public CreateServiceLinkedRoleResponse createServiceLinkedRole(CreateServiceLinkedRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createServiceLinkedRoleWithOptions(request, runtime);
    }

    public DeleteDBInstanceResponse deleteDBInstanceWithOptions(DeleteDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDBInstance", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDBInstanceResponse());
    }

    public DeleteDBInstanceResponse deleteDBInstance(DeleteDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDBInstanceWithOptions(request, runtime);
    }

    public DeleteDatabaseResponse deleteDatabaseWithOptions(DeleteDatabaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDatabase", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDatabaseResponse());
    }

    public DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDatabaseWithOptions(request, runtime);
    }

    public DescribeAccountsResponse describeAccountsWithOptions(DescribeAccountsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAccounts", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAccountsResponse());
    }

    public DescribeAccountsResponse describeAccounts(DescribeAccountsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAccountsWithOptions(request, runtime);
    }

    public DescribeAvailableResourcesResponse describeAvailableResourcesWithOptions(DescribeAvailableResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAvailableResources", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAvailableResourcesResponse());
    }

    public DescribeAvailableResourcesResponse describeAvailableResources(DescribeAvailableResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAvailableResourcesWithOptions(request, runtime);
    }

    public DescribeBackupPolicyResponse describeBackupPolicyWithOptions(DescribeBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupPolicy", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupPolicyResponse());
    }

    public DescribeBackupPolicyResponse describeBackupPolicy(DescribeBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupPolicyWithOptions(request, runtime);
    }

    public DescribeDBClusterPerformanceResponse describeDBClusterPerformanceWithOptions(DescribeDBClusterPerformanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBClusterPerformance", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBClusterPerformanceResponse());
    }

    public DescribeDBClusterPerformanceResponse describeDBClusterPerformance(DescribeDBClusterPerformanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBClusterPerformanceWithOptions(request, runtime);
    }

    public DescribeDBInstanceAttributeResponse describeDBInstanceAttributeWithOptions(DescribeDBInstanceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceAttribute", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceAttributeResponse());
    }

    public DescribeDBInstanceAttributeResponse describeDBInstanceAttribute(DescribeDBInstanceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceAttributeWithOptions(request, runtime);
    }

    public DescribeDBInstanceIPArrayListResponse describeDBInstanceIPArrayListWithOptions(DescribeDBInstanceIPArrayListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceIPArrayList", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceIPArrayListResponse());
    }

    public DescribeDBInstanceIPArrayListResponse describeDBInstanceIPArrayList(DescribeDBInstanceIPArrayListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceIPArrayListWithOptions(request, runtime);
    }

    public DescribeDBInstanceNetInfoResponse describeDBInstanceNetInfoWithOptions(DescribeDBInstanceNetInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceNetInfo", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceNetInfoResponse());
    }

    public DescribeDBInstanceNetInfoResponse describeDBInstanceNetInfo(DescribeDBInstanceNetInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceNetInfoWithOptions(request, runtime);
    }

    public DescribeDBInstanceOnECSAttributeResponse describeDBInstanceOnECSAttributeWithOptions(DescribeDBInstanceOnECSAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceOnECSAttribute", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceOnECSAttributeResponse());
    }

    public DescribeDBInstanceOnECSAttributeResponse describeDBInstanceOnECSAttribute(DescribeDBInstanceOnECSAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceOnECSAttributeWithOptions(request, runtime);
    }

    public DescribeDBInstancePerformanceResponse describeDBInstancePerformanceWithOptions(DescribeDBInstancePerformanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstancePerformance", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstancePerformanceResponse());
    }

    public DescribeDBInstancePerformanceResponse describeDBInstancePerformance(DescribeDBInstancePerformanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstancePerformanceWithOptions(request, runtime);
    }

    public DescribeDBInstanceSQLPatternsResponse describeDBInstanceSQLPatternsWithOptions(DescribeDBInstanceSQLPatternsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceSQLPatterns", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceSQLPatternsResponse());
    }

    public DescribeDBInstanceSQLPatternsResponse describeDBInstanceSQLPatterns(DescribeDBInstanceSQLPatternsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceSQLPatternsWithOptions(request, runtime);
    }

    public DescribeDBInstanceSSLResponse describeDBInstanceSSLWithOptions(DescribeDBInstanceSSLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceSSL", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceSSLResponse());
    }

    public DescribeDBInstanceSSLResponse describeDBInstanceSSL(DescribeDBInstanceSSLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceSSLWithOptions(request, runtime);
    }

    public DescribeDBInstancesResponse describeDBInstancesWithOptions(DescribeDBInstancesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeDBInstancesShrinkRequest request = new DescribeDBInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.DBInstanceCategories)) {
            request.DBInstanceCategoriesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.DBInstanceCategories, "DBInstanceCategories", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.DBInstanceModes)) {
            request.DBInstanceModesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.DBInstanceModes, "DBInstanceModes", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.DBInstanceStatuses)) {
            request.DBInstanceStatusesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.DBInstanceStatuses, "DBInstanceStatuses", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceDeployTypes)) {
            request.instanceDeployTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceDeployTypes, "InstanceDeployTypes", "simple");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstances", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstancesResponse());
    }

    public DescribeDBInstancesResponse describeDBInstances(DescribeDBInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstancesWithOptions(request, runtime);
    }

    public DescribeDataBackupsResponse describeDataBackupsWithOptions(DescribeDataBackupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDataBackups", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDataBackupsResponse());
    }

    public DescribeDataBackupsResponse describeDataBackups(DescribeDataBackupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDataBackupsWithOptions(request, runtime);
    }

    public DescribeLogBackupsResponse describeLogBackupsWithOptions(DescribeLogBackupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLogBackups", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLogBackupsResponse());
    }

    public DescribeLogBackupsResponse describeLogBackups(DescribeLogBackupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLogBackupsWithOptions(request, runtime);
    }

    public DescribeModifyParameterLogResponse describeModifyParameterLogWithOptions(DescribeModifyParameterLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeModifyParameterLog", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeModifyParameterLogResponse());
    }

    public DescribeModifyParameterLogResponse describeModifyParameterLog(DescribeModifyParameterLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeModifyParameterLogWithOptions(request, runtime);
    }

    public DescribeParametersResponse describeParametersWithOptions(DescribeParametersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeParameters", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeParametersResponse());
    }

    public DescribeParametersResponse describeParameters(DescribeParametersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeParametersWithOptions(request, runtime);
    }

    public DescribeRdsVSwitchsResponse describeRdsVSwitchsWithOptions(DescribeRdsVSwitchsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRdsVSwitchs", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRdsVSwitchsResponse());
    }

    public DescribeRdsVSwitchsResponse describeRdsVSwitchs(DescribeRdsVSwitchsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRdsVSwitchsWithOptions(request, runtime);
    }

    public DescribeRdsVpcsResponse describeRdsVpcsWithOptions(DescribeRdsVpcsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRdsVpcs", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRdsVpcsResponse());
    }

    public DescribeRdsVpcsResponse describeRdsVpcs(DescribeRdsVpcsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRdsVpcsWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeResourceUsageResponse describeResourceUsageWithOptions(DescribeResourceUsageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeResourceUsage", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeResourceUsageResponse());
    }

    public DescribeResourceUsageResponse describeResourceUsage(DescribeResourceUsageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeResourceUsageWithOptions(request, runtime);
    }

    public DescribeSQLCollectorPolicyResponse describeSQLCollectorPolicyWithOptions(DescribeSQLCollectorPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSQLCollectorPolicy", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSQLCollectorPolicyResponse());
    }

    public DescribeSQLCollectorPolicyResponse describeSQLCollectorPolicy(DescribeSQLCollectorPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSQLCollectorPolicyWithOptions(request, runtime);
    }

    public DescribeSQLLogByQueryIdResponse describeSQLLogByQueryIdWithOptions(DescribeSQLLogByQueryIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSQLLogByQueryId", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSQLLogByQueryIdResponse());
    }

    public DescribeSQLLogByQueryIdResponse describeSQLLogByQueryId(DescribeSQLLogByQueryIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSQLLogByQueryIdWithOptions(request, runtime);
    }

    public DescribeSQLLogCountResponse describeSQLLogCountWithOptions(DescribeSQLLogCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSQLLogCount", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSQLLogCountResponse());
    }

    public DescribeSQLLogCountResponse describeSQLLogCount(DescribeSQLLogCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSQLLogCountWithOptions(request, runtime);
    }

    public DescribeSQLLogFilesResponse describeSQLLogFilesWithOptions(DescribeSQLLogFilesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSQLLogFiles", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSQLLogFilesResponse());
    }

    public DescribeSQLLogFilesResponse describeSQLLogFiles(DescribeSQLLogFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSQLLogFilesWithOptions(request, runtime);
    }

    public DescribeSQLLogRecordsResponse describeSQLLogRecordsWithOptions(DescribeSQLLogRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSQLLogRecords", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSQLLogRecordsResponse());
    }

    public DescribeSQLLogRecordsResponse describeSQLLogRecords(DescribeSQLLogRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSQLLogRecordsWithOptions(request, runtime);
    }

    public DescribeSQLLogsResponse describeSQLLogsWithOptions(DescribeSQLLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSQLLogs", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSQLLogsResponse());
    }

    public DescribeSQLLogsResponse describeSQLLogs(DescribeSQLLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSQLLogsWithOptions(request, runtime);
    }

    public DescribeSQLLogsOnSliceResponse describeSQLLogsOnSliceWithOptions(DescribeSQLLogsOnSliceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSQLLogsOnSlice", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSQLLogsOnSliceResponse());
    }

    public DescribeSQLLogsOnSliceResponse describeSQLLogsOnSlice(DescribeSQLLogsOnSliceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSQLLogsOnSliceWithOptions(request, runtime);
    }

    public DescribeSlowLogRecordsResponse describeSlowLogRecordsWithOptions(DescribeSlowLogRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSlowLogRecords", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSlowLogRecordsResponse());
    }

    public DescribeSlowLogRecordsResponse describeSlowLogRecords(DescribeSlowLogRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSlowLogRecordsWithOptions(request, runtime);
    }

    public DescribeSlowSQLLogsResponse describeSlowSQLLogsWithOptions(DescribeSlowSQLLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSlowSQLLogs", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSlowSQLLogsResponse());
    }

    public DescribeSlowSQLLogsResponse describeSlowSQLLogs(DescribeSlowSQLLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSlowSQLLogsWithOptions(request, runtime);
    }

    public DescribeSpecificationResponse describeSpecificationWithOptions(DescribeSpecificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSpecification", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSpecificationResponse());
    }

    public DescribeSpecificationResponse describeSpecification(DescribeSpecificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSpecificationWithOptions(request, runtime);
    }

    public DescribeTagsResponse describeTagsWithOptions(DescribeTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTags", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTagsResponse());
    }

    public DescribeTagsResponse describeTags(DescribeTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTagsWithOptions(request, runtime);
    }

    public DescribeUserEncryptionKeyListResponse describeUserEncryptionKeyListWithOptions(DescribeUserEncryptionKeyListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserEncryptionKeyList", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserEncryptionKeyListResponse());
    }

    public DescribeUserEncryptionKeyListResponse describeUserEncryptionKeyList(DescribeUserEncryptionKeyListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserEncryptionKeyListWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
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
        return TeaModel.toModel(this.doRPCRequest("ModifyAccountDescription", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAccountDescriptionResponse());
    }

    public ModifyAccountDescriptionResponse modifyAccountDescription(ModifyAccountDescriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAccountDescriptionWithOptions(request, runtime);
    }

    public ModifyBackupPolicyResponse modifyBackupPolicyWithOptions(ModifyBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyBackupPolicy", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyBackupPolicyResponse());
    }

    public ModifyBackupPolicyResponse modifyBackupPolicy(ModifyBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBackupPolicyWithOptions(request, runtime);
    }

    public ModifyDBInstanceConnectionModeResponse modifyDBInstanceConnectionModeWithOptions(ModifyDBInstanceConnectionModeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceConnectionMode", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceConnectionModeResponse());
    }

    public ModifyDBInstanceConnectionModeResponse modifyDBInstanceConnectionMode(ModifyDBInstanceConnectionModeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceConnectionModeWithOptions(request, runtime);
    }

    public ModifyDBInstanceConnectionStringResponse modifyDBInstanceConnectionStringWithOptions(ModifyDBInstanceConnectionStringRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceConnectionString", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceConnectionStringResponse());
    }

    public ModifyDBInstanceConnectionStringResponse modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceConnectionStringWithOptions(request, runtime);
    }

    public ModifyDBInstanceDescriptionResponse modifyDBInstanceDescriptionWithOptions(ModifyDBInstanceDescriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceDescription", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceDescriptionResponse());
    }

    public ModifyDBInstanceDescriptionResponse modifyDBInstanceDescription(ModifyDBInstanceDescriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceDescriptionWithOptions(request, runtime);
    }

    public ModifyDBInstanceMaintainTimeResponse modifyDBInstanceMaintainTimeWithOptions(ModifyDBInstanceMaintainTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceMaintainTime", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceMaintainTimeResponse());
    }

    public ModifyDBInstanceMaintainTimeResponse modifyDBInstanceMaintainTime(ModifyDBInstanceMaintainTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceMaintainTimeWithOptions(request, runtime);
    }

    public ModifyDBInstanceNetworkTypeResponse modifyDBInstanceNetworkTypeWithOptions(ModifyDBInstanceNetworkTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceNetworkType", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceNetworkTypeResponse());
    }

    public ModifyDBInstanceNetworkTypeResponse modifyDBInstanceNetworkType(ModifyDBInstanceNetworkTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceNetworkTypeWithOptions(request, runtime);
    }

    public ModifyDBInstanceSSLResponse modifyDBInstanceSSLWithOptions(ModifyDBInstanceSSLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceSSL", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceSSLResponse());
    }

    public ModifyDBInstanceSSLResponse modifyDBInstanceSSL(ModifyDBInstanceSSLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceSSLWithOptions(request, runtime);
    }

    public ModifyParametersResponse modifyParametersWithOptions(ModifyParametersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyParameters", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyParametersResponse());
    }

    public ModifyParametersResponse modifyParameters(ModifyParametersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyParametersWithOptions(request, runtime);
    }

    public ModifySQLCollectorPolicyResponse modifySQLCollectorPolicyWithOptions(ModifySQLCollectorPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySQLCollectorPolicy", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySQLCollectorPolicyResponse());
    }

    public ModifySQLCollectorPolicyResponse modifySQLCollectorPolicy(ModifySQLCollectorPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySQLCollectorPolicyWithOptions(request, runtime);
    }

    public ModifySecurityIpsResponse modifySecurityIpsWithOptions(ModifySecurityIpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySecurityIps", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySecurityIpsResponse());
    }

    public ModifySecurityIpsResponse modifySecurityIps(ModifySecurityIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySecurityIpsWithOptions(request, runtime);
    }

    public ReleaseInstancePublicConnectionResponse releaseInstancePublicConnectionWithOptions(ReleaseInstancePublicConnectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseInstancePublicConnection", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseInstancePublicConnectionResponse());
    }

    public ReleaseInstancePublicConnectionResponse releaseInstancePublicConnection(ReleaseInstancePublicConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseInstancePublicConnectionWithOptions(request, runtime);
    }

    public ResetAccountPasswordResponse resetAccountPasswordWithOptions(ResetAccountPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetAccountPassword", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new ResetAccountPasswordResponse());
    }

    public ResetAccountPasswordResponse resetAccountPassword(ResetAccountPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetAccountPasswordWithOptions(request, runtime);
    }

    public RestartDBInstanceResponse restartDBInstanceWithOptions(RestartDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RestartDBInstance", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new RestartDBInstanceResponse());
    }

    public RestartDBInstanceResponse restartDBInstance(RestartDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restartDBInstanceWithOptions(request, runtime);
    }

    public SwitchDBInstanceNetTypeResponse switchDBInstanceNetTypeWithOptions(SwitchDBInstanceNetTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SwitchDBInstanceNetType", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new SwitchDBInstanceNetTypeResponse());
    }

    public SwitchDBInstanceNetTypeResponse switchDBInstanceNetType(SwitchDBInstanceNetTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.switchDBInstanceNetTypeWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResources", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public UpgradeDBInstanceResponse upgradeDBInstanceWithOptions(UpgradeDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeDBInstance", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeDBInstanceResponse());
    }

    public UpgradeDBInstanceResponse upgradeDBInstance(UpgradeDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeDBInstanceWithOptions(request, runtime);
    }

    public UpgradeDBVersionResponse upgradeDBVersionWithOptions(UpgradeDBVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeDBVersion", "2016-05-03", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeDBVersionResponse());
    }

    public UpgradeDBVersionResponse upgradeDBVersion(UpgradeDBVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeDBVersionWithOptions(request, runtime);
    }
}
