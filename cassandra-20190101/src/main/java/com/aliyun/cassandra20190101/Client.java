// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101;

import com.aliyun.tea.*;
import com.aliyun.cassandra20190101.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cassandra", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AllocatePublicContactPointsResponse allocatePublicContactPointsWithOptions(AllocatePublicContactPointsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AllocatePublicContactPoints", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new AllocatePublicContactPointsResponse());
    }

    public AllocatePublicContactPointsResponse allocatePublicContactPoints(AllocatePublicContactPointsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocatePublicContactPointsWithOptions(request, runtime);
    }

    public CreateBackupPlanResponse createBackupPlanWithOptions(CreateBackupPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateBackupPlan", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateBackupPlanResponse());
    }

    public CreateBackupPlanResponse createBackupPlan(CreateBackupPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBackupPlanWithOptions(request, runtime);
    }

    public CreateClusterResponse createClusterWithOptions(CreateClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCluster", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateClusterResponse());
    }

    public CreateClusterResponse createCluster(CreateClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createClusterWithOptions(request, runtime);
    }

    public CreateDataCenterResponse createDataCenterWithOptions(CreateDataCenterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDataCenter", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDataCenterResponse());
    }

    public CreateDataCenterResponse createDataCenter(CreateDataCenterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDataCenterWithOptions(request, runtime);
    }

    public DeleteBackupPlanResponse deleteBackupPlanWithOptions(DeleteBackupPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteBackupPlan", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteBackupPlanResponse());
    }

    public DeleteBackupPlanResponse deleteBackupPlan(DeleteBackupPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBackupPlanWithOptions(request, runtime);
    }

    public DeleteClusterResponse deleteClusterWithOptions(DeleteClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCluster", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteClusterResponse());
    }

    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteClusterWithOptions(request, runtime);
    }

    public DeleteDataCenterResponse deleteDataCenterWithOptions(DeleteDataCenterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDataCenter", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDataCenterResponse());
    }

    public DeleteDataCenterResponse deleteDataCenter(DeleteDataCenterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDataCenterWithOptions(request, runtime);
    }

    public DeleteNodeToolExecutionHistoryResponse deleteNodeToolExecutionHistoryWithOptions(DeleteNodeToolExecutionHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteNodeToolExecutionHistory", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteNodeToolExecutionHistoryResponse());
    }

    public DeleteNodeToolExecutionHistoryResponse deleteNodeToolExecutionHistory(DeleteNodeToolExecutionHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNodeToolExecutionHistoryWithOptions(request, runtime);
    }

    public DescribeAccountsResponse describeAccountsWithOptions(DescribeAccountsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAccounts", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAccountsResponse());
    }

    public DescribeAccountsResponse describeAccounts(DescribeAccountsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAccountsWithOptions(request, runtime);
    }

    public DescribeBackupResponse describeBackupWithOptions(DescribeBackupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackup", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupResponse());
    }

    public DescribeBackupResponse describeBackup(DescribeBackupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupWithOptions(request, runtime);
    }

    public DescribeBackupPlanResponse describeBackupPlanWithOptions(DescribeBackupPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupPlan", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupPlanResponse());
    }

    public DescribeBackupPlanResponse describeBackupPlan(DescribeBackupPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupPlanWithOptions(request, runtime);
    }

    public DescribeBackupPlansResponse describeBackupPlansWithOptions(DescribeBackupPlansRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupPlans", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupPlansResponse());
    }

    public DescribeBackupPlansResponse describeBackupPlans(DescribeBackupPlansRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupPlansWithOptions(request, runtime);
    }

    public DescribeBackupsResponse describeBackupsWithOptions(DescribeBackupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackups", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupsResponse());
    }

    public DescribeBackupsResponse describeBackups(DescribeBackupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupsWithOptions(request, runtime);
    }

    public DescribeClusterResponse describeClusterWithOptions(DescribeClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCluster", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClusterResponse());
    }

    public DescribeClusterResponse describeCluster(DescribeClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterWithOptions(request, runtime);
    }

    public DescribeClusterDashboardResponse describeClusterDashboardWithOptions(DescribeClusterDashboardRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClusterDashboard", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClusterDashboardResponse());
    }

    public DescribeClusterDashboardResponse describeClusterDashboard(DescribeClusterDashboardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterDashboardWithOptions(request, runtime);
    }

    public DescribeClustersResponse describeClustersWithOptions(DescribeClustersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClusters", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClustersResponse());
    }

    public DescribeClustersResponse describeClusters(DescribeClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClustersWithOptions(request, runtime);
    }

    public DescribeClusterStatusResponse describeClusterStatusWithOptions(DescribeClusterStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeClusterStatus", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeClusterStatusResponse());
    }

    public DescribeClusterStatusResponse describeClusterStatus(DescribeClusterStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterStatusWithOptions(request, runtime);
    }

    public DescribeContactPointsResponse describeContactPointsWithOptions(DescribeContactPointsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeContactPoints", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeContactPointsResponse());
    }

    public DescribeContactPointsResponse describeContactPoints(DescribeContactPointsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeContactPointsWithOptions(request, runtime);
    }

    public DescribeDataCenterResponse describeDataCenterWithOptions(DescribeDataCenterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDataCenter", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDataCenterResponse());
    }

    public DescribeDataCenterResponse describeDataCenter(DescribeDataCenterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDataCenterWithOptions(request, runtime);
    }

    public DescribeDataCentersResponse describeDataCentersWithOptions(DescribeDataCentersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDataCenters", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDataCentersResponse());
    }

    public DescribeDataCentersResponse describeDataCenters(DescribeDataCentersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDataCentersWithOptions(request, runtime);
    }

    public DescribeDeletedClustersResponse describeDeletedClustersWithOptions(DescribeDeletedClustersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDeletedClusters", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDeletedClustersResponse());
    }

    public DescribeDeletedClustersResponse describeDeletedClusters(DescribeDeletedClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDeletedClustersWithOptions(request, runtime);
    }

    public DescribeInstanceTypeResponse describeInstanceTypeWithOptions(DescribeInstanceTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceType", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceTypeResponse());
    }

    public DescribeInstanceTypeResponse describeInstanceType(DescribeInstanceTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceTypeWithOptions(request, runtime);
    }

    public DescribeIpWhitelistResponse describeIpWhitelistWithOptions(DescribeIpWhitelistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeIpWhitelist", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeIpWhitelistResponse());
    }

    public DescribeIpWhitelistResponse describeIpWhitelist(DescribeIpWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIpWhitelistWithOptions(request, runtime);
    }

    public DescribeIpWhitelistGroupsResponse describeIpWhitelistGroupsWithOptions(DescribeIpWhitelistGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeIpWhitelistGroups", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeIpWhitelistGroupsResponse());
    }

    public DescribeIpWhitelistGroupsResponse describeIpWhitelistGroups(DescribeIpWhitelistGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIpWhitelistGroupsWithOptions(request, runtime);
    }

    public DescribeNodeToolExecutionHistoriesResponse describeNodeToolExecutionHistoriesWithOptions(DescribeNodeToolExecutionHistoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNodeToolExecutionHistories", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeNodeToolExecutionHistoriesResponse());
    }

    public DescribeNodeToolExecutionHistoriesResponse describeNodeToolExecutionHistories(DescribeNodeToolExecutionHistoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNodeToolExecutionHistoriesWithOptions(request, runtime);
    }

    public DescribeNodeToolExecutionHistoryResponse describeNodeToolExecutionHistoryWithOptions(DescribeNodeToolExecutionHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNodeToolExecutionHistory", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeNodeToolExecutionHistoryResponse());
    }

    public DescribeNodeToolExecutionHistoryResponse describeNodeToolExecutionHistory(DescribeNodeToolExecutionHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNodeToolExecutionHistoryWithOptions(request, runtime);
    }

    public DescribeParameterModificationHistoriesResponse describeParameterModificationHistoriesWithOptions(DescribeParameterModificationHistoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeParameterModificationHistories", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeParameterModificationHistoriesResponse());
    }

    public DescribeParameterModificationHistoriesResponse describeParameterModificationHistories(DescribeParameterModificationHistoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeParameterModificationHistoriesWithOptions(request, runtime);
    }

    public DescribeParametersResponse describeParametersWithOptions(DescribeParametersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeParameters", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeParametersResponse());
    }

    public DescribeParametersResponse describeParameters(DescribeParametersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeParametersWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeSecurityGroupsResponse describeSecurityGroupsWithOptions(DescribeSecurityGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSecurityGroups", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSecurityGroupsResponse());
    }

    public DescribeSecurityGroupsResponse describeSecurityGroups(DescribeSecurityGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityGroupsWithOptions(request, runtime);
    }

    public ExecuteNodeToolResponse executeNodeToolWithOptions(ExecuteNodeToolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExecuteNodeTool", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ExecuteNodeToolResponse());
    }

    public ExecuteNodeToolResponse executeNodeTool(ExecuteNodeToolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeNodeToolWithOptions(request, runtime);
    }

    public GetCmsUrlResponse getCmsUrlWithOptions(GetCmsUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCmsUrl", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetCmsUrlResponse());
    }

    public GetCmsUrlResponse getCmsUrl(GetCmsUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCmsUrlWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ListTagsResponse listTagsWithOptions(ListTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTags", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagsResponse());
    }

    public ListTagsResponse listTags(ListTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagsWithOptions(request, runtime);
    }

    public ModifyAccountPasswordResponse modifyAccountPasswordWithOptions(ModifyAccountPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAccountPassword", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAccountPasswordResponse());
    }

    public ModifyAccountPasswordResponse modifyAccountPassword(ModifyAccountPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAccountPasswordWithOptions(request, runtime);
    }

    public ModifyBackupPlanResponse modifyBackupPlanWithOptions(ModifyBackupPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyBackupPlan", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyBackupPlanResponse());
    }

    public ModifyBackupPlanResponse modifyBackupPlan(ModifyBackupPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBackupPlanWithOptions(request, runtime);
    }

    public ModifyClusterResponse modifyClusterWithOptions(ModifyClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCluster", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyClusterResponse());
    }

    public ModifyClusterResponse modifyCluster(ModifyClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyClusterWithOptions(request, runtime);
    }

    public ModifyDataCenterResponse modifyDataCenterWithOptions(ModifyDataCenterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDataCenter", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDataCenterResponse());
    }

    public ModifyDataCenterResponse modifyDataCenter(ModifyDataCenterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDataCenterWithOptions(request, runtime);
    }

    public ModifyInstanceMaintainTimeResponse modifyInstanceMaintainTimeWithOptions(ModifyInstanceMaintainTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceMaintainTime", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceMaintainTimeResponse());
    }

    public ModifyInstanceMaintainTimeResponse modifyInstanceMaintainTime(ModifyInstanceMaintainTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceMaintainTimeWithOptions(request, runtime);
    }

    public ModifyInstanceTypeResponse modifyInstanceTypeWithOptions(ModifyInstanceTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceType", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceTypeResponse());
    }

    public ModifyInstanceTypeResponse modifyInstanceType(ModifyInstanceTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceTypeWithOptions(request, runtime);
    }

    public ModifyIpWhitelistResponse modifyIpWhitelistWithOptions(ModifyIpWhitelistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyIpWhitelist", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyIpWhitelistResponse());
    }

    public ModifyIpWhitelistResponse modifyIpWhitelist(ModifyIpWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyIpWhitelistWithOptions(request, runtime);
    }

    public ModifyIpWhitelistGroupResponse modifyIpWhitelistGroupWithOptions(ModifyIpWhitelistGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyIpWhitelistGroup", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyIpWhitelistGroupResponse());
    }

    public ModifyIpWhitelistGroupResponse modifyIpWhitelistGroup(ModifyIpWhitelistGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyIpWhitelistGroupWithOptions(request, runtime);
    }

    public ModifyParameterResponse modifyParameterWithOptions(ModifyParameterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyParameter", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyParameterResponse());
    }

    public ModifyParameterResponse modifyParameter(ModifyParameterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyParameterWithOptions(request, runtime);
    }

    public ModifySecurityGroupsResponse modifySecurityGroupsWithOptions(ModifySecurityGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySecurityGroups", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySecurityGroupsResponse());
    }

    public ModifySecurityGroupsResponse modifySecurityGroups(ModifySecurityGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySecurityGroupsWithOptions(request, runtime);
    }

    public MoveResourceGroupResponse moveResourceGroupWithOptions(MoveResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MoveResourceGroup", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new MoveResourceGroupResponse());
    }

    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    public PurgeClusterResponse purgeClusterWithOptions(PurgeClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PurgeCluster", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new PurgeClusterResponse());
    }

    public PurgeClusterResponse purgeCluster(PurgeClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.purgeClusterWithOptions(request, runtime);
    }

    public RebootClusterResponse rebootClusterWithOptions(RebootClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RebootCluster", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new RebootClusterResponse());
    }

    public RebootClusterResponse rebootCluster(RebootClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rebootClusterWithOptions(request, runtime);
    }

    public ReleasePublicContactPointsResponse releasePublicContactPointsWithOptions(ReleasePublicContactPointsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleasePublicContactPoints", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ReleasePublicContactPointsResponse());
    }

    public ReleasePublicContactPointsResponse releasePublicContactPoints(ReleasePublicContactPointsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releasePublicContactPointsWithOptions(request, runtime);
    }

    public ResizeDiskSizeResponse resizeDiskSizeWithOptions(ResizeDiskSizeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResizeDiskSize", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ResizeDiskSizeResponse());
    }

    public ResizeDiskSizeResponse resizeDiskSize(ResizeDiskSizeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resizeDiskSizeWithOptions(request, runtime);
    }

    public ResizeNodeCountResponse resizeNodeCountWithOptions(ResizeNodeCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResizeNodeCount", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ResizeNodeCountResponse());
    }

    public ResizeNodeCountResponse resizeNodeCount(ResizeNodeCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resizeNodeCountWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UnTagResourcesResponse unTagResourcesWithOptions(UnTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnTagResources", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new UnTagResourcesResponse());
    }

    public UnTagResourcesResponse unTagResources(UnTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unTagResourcesWithOptions(request, runtime);
    }

    public UpgradeClusterVersionResponse upgradeClusterVersionWithOptions(UpgradeClusterVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeClusterVersion", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeClusterVersionResponse());
    }

    public UpgradeClusterVersionResponse upgradeClusterVersion(UpgradeClusterVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeClusterVersionWithOptions(request, runtime);
    }
}
