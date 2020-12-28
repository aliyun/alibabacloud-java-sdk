// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412;

import com.aliyun.tea.*;
import com.aliyun.ehpc20180412.models.*;
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
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ehpc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddContainerAppResponse addContainerAppWithOptions(AddContainerAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("AddContainerApp", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new AddContainerAppResponse());
    }

    public AddContainerAppResponse addContainerApp(AddContainerAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addContainerAppWithOptions(request, runtime);
    }

    public AddLocalNodesResponse addLocalNodesWithOptions(AddLocalNodesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("AddLocalNodes", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new AddLocalNodesResponse());
    }

    public AddLocalNodesResponse addLocalNodes(AddLocalNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addLocalNodesWithOptions(request, runtime);
    }

    public AddNodesResponse addNodesWithOptions(AddNodesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("AddNodes", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new AddNodesResponse());
    }

    public AddNodesResponse addNodes(AddNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addNodesWithOptions(request, runtime);
    }

    public AddQueueResponse addQueueWithOptions(AddQueueRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("AddQueue", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new AddQueueResponse());
    }

    public AddQueueResponse addQueue(AddQueueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addQueueWithOptions(request, runtime);
    }

    public AddSecurityGroupResponse addSecurityGroupWithOptions(AddSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("AddSecurityGroup", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new AddSecurityGroupResponse());
    }

    public AddSecurityGroupResponse addSecurityGroup(AddSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addSecurityGroupWithOptions(request, runtime);
    }

    public AddUsersResponse addUsersWithOptions(AddUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("AddUsers", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new AddUsersResponse());
    }

    public AddUsersResponse addUsers(AddUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addUsersWithOptions(request, runtime);
    }

    public ApplyNodesResponse applyNodesWithOptions(ApplyNodesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ApplyNodes", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ApplyNodesResponse());
    }

    public ApplyNodesResponse applyNodes(ApplyNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyNodesWithOptions(request, runtime);
    }

    public BindAccountToClusterUserResponse bindAccountToClusterUserWithOptions(BindAccountToClusterUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("BindAccountToClusterUser", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new BindAccountToClusterUserResponse());
    }

    public BindAccountToClusterUserResponse bindAccountToClusterUser(BindAccountToClusterUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindAccountToClusterUserWithOptions(request, runtime);
    }

    public CreateClusterResponse createClusterWithOptions(CreateClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCluster", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new CreateClusterResponse());
    }

    public CreateClusterResponse createCluster(CreateClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createClusterWithOptions(request, runtime);
    }

    public CreateGWSClusterResponse createGWSClusterWithOptions(CreateGWSClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateGWSCluster", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new CreateGWSClusterResponse());
    }

    public CreateGWSClusterResponse createGWSCluster(CreateGWSClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGWSClusterWithOptions(request, runtime);
    }

    public CreateGWSImageResponse createGWSImageWithOptions(CreateGWSImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateGWSImage", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new CreateGWSImageResponse());
    }

    public CreateGWSImageResponse createGWSImage(CreateGWSImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGWSImageWithOptions(request, runtime);
    }

    public CreateGWSInstanceResponse createGWSInstanceWithOptions(CreateGWSInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateGWSInstance", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new CreateGWSInstanceResponse());
    }

    public CreateGWSInstanceResponse createGWSInstance(CreateGWSInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGWSInstanceWithOptions(request, runtime);
    }

    public CreateHybridClusterResponse createHybridClusterWithOptions(CreateHybridClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateHybridCluster", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new CreateHybridClusterResponse());
    }

    public CreateHybridClusterResponse createHybridCluster(CreateHybridClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createHybridClusterWithOptions(request, runtime);
    }

    public CreateJobFileResponse createJobFileWithOptions(CreateJobFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateJobFile", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new CreateJobFileResponse());
    }

    public CreateJobFileResponse createJobFile(CreateJobFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createJobFileWithOptions(request, runtime);
    }

    public CreateJobTemplateResponse createJobTemplateWithOptions(CreateJobTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateJobTemplate", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new CreateJobTemplateResponse());
    }

    public CreateJobTemplateResponse createJobTemplate(CreateJobTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createJobTemplateWithOptions(request, runtime);
    }

    public DeleteClusterResponse deleteClusterWithOptions(DeleteClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCluster", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new DeleteClusterResponse());
    }

    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteClusterWithOptions(request, runtime);
    }

    public DeleteContainerAppsResponse deleteContainerAppsWithOptions(DeleteContainerAppsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteContainerApps", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new DeleteContainerAppsResponse());
    }

    public DeleteContainerAppsResponse deleteContainerApps(DeleteContainerAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteContainerAppsWithOptions(request, runtime);
    }

    public DeleteGWSClusterResponse deleteGWSClusterWithOptions(DeleteGWSClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteGWSCluster", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new DeleteGWSClusterResponse());
    }

    public DeleteGWSClusterResponse deleteGWSCluster(DeleteGWSClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGWSClusterWithOptions(request, runtime);
    }

    public DeleteGWSInstanceResponse deleteGWSInstanceWithOptions(DeleteGWSInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteGWSInstance", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new DeleteGWSInstanceResponse());
    }

    public DeleteGWSInstanceResponse deleteGWSInstance(DeleteGWSInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGWSInstanceWithOptions(request, runtime);
    }

    public DeleteImageResponse deleteImageWithOptions(DeleteImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteImage", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new DeleteImageResponse());
    }

    public DeleteImageResponse deleteImage(DeleteImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteImageWithOptions(request, runtime);
    }

    public DeleteJobsResponse deleteJobsWithOptions(DeleteJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteJobs", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new DeleteJobsResponse());
    }

    public DeleteJobsResponse deleteJobs(DeleteJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteJobsWithOptions(request, runtime);
    }

    public DeleteJobTemplatesResponse deleteJobTemplatesWithOptions(DeleteJobTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteJobTemplates", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new DeleteJobTemplatesResponse());
    }

    public DeleteJobTemplatesResponse deleteJobTemplates(DeleteJobTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteJobTemplatesWithOptions(request, runtime);
    }

    public DeleteNodesResponse deleteNodesWithOptions(DeleteNodesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteNodes", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new DeleteNodesResponse());
    }

    public DeleteNodesResponse deleteNodes(DeleteNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNodesWithOptions(request, runtime);
    }

    public DeleteQueueResponse deleteQueueWithOptions(DeleteQueueRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteQueue", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new DeleteQueueResponse());
    }

    public DeleteQueueResponse deleteQueue(DeleteQueueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteQueueWithOptions(request, runtime);
    }

    public DeleteSecurityGroupResponse deleteSecurityGroupWithOptions(DeleteSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSecurityGroup", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new DeleteSecurityGroupResponse());
    }

    public DeleteSecurityGroupResponse deleteSecurityGroup(DeleteSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSecurityGroupWithOptions(request, runtime);
    }

    public DeleteUsersResponse deleteUsersWithOptions(DeleteUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUsers", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new DeleteUsersResponse());
    }

    public DeleteUsersResponse deleteUsers(DeleteUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUsersWithOptions(request, runtime);
    }

    public DescribeAutoScaleConfigResponse describeAutoScaleConfigWithOptions(DescribeAutoScaleConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAutoScaleConfig", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeAutoScaleConfigResponse());
    }

    public DescribeAutoScaleConfigResponse describeAutoScaleConfig(DescribeAutoScaleConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAutoScaleConfigWithOptions(request, runtime);
    }

    public DescribeClusterResponse describeClusterWithOptions(DescribeClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCluster", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeClusterResponse());
    }

    public DescribeClusterResponse describeCluster(DescribeClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterWithOptions(request, runtime);
    }

    public DescribeContainerAppResponse describeContainerAppWithOptions(DescribeContainerAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeContainerApp", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeContainerAppResponse());
    }

    public DescribeContainerAppResponse describeContainerApp(DescribeContainerAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeContainerAppWithOptions(request, runtime);
    }

    public DescribeGWSClusterPolicyResponse describeGWSClusterPolicyWithOptions(DescribeGWSClusterPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGWSClusterPolicy", "2018-04-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGWSClusterPolicyResponse());
    }

    public DescribeGWSClusterPolicyResponse describeGWSClusterPolicy(DescribeGWSClusterPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGWSClusterPolicyWithOptions(request, runtime);
    }

    public DescribeGWSClustersResponse describeGWSClustersWithOptions(DescribeGWSClustersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGWSClusters", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeGWSClustersResponse());
    }

    public DescribeGWSClustersResponse describeGWSClusters(DescribeGWSClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGWSClustersWithOptions(request, runtime);
    }

    public DescribeGWSImagesResponse describeGWSImagesWithOptions(DescribeGWSImagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGWSImages", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeGWSImagesResponse());
    }

    public DescribeGWSImagesResponse describeGWSImages(DescribeGWSImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGWSImagesWithOptions(request, runtime);
    }

    public DescribeGWSInstancesResponse describeGWSInstancesWithOptions(DescribeGWSInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGWSInstances", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeGWSInstancesResponse());
    }

    public DescribeGWSInstancesResponse describeGWSInstances(DescribeGWSInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGWSInstancesWithOptions(request, runtime);
    }

    public DescribeImageResponse describeImageWithOptions(DescribeImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeImage", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeImageResponse());
    }

    public DescribeImageResponse describeImage(DescribeImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImageWithOptions(request, runtime);
    }

    public DescribeImageGatewayConfigResponse describeImageGatewayConfigWithOptions(DescribeImageGatewayConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeImageGatewayConfig", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeImageGatewayConfigResponse());
    }

    public DescribeImageGatewayConfigResponse describeImageGatewayConfig(DescribeImageGatewayConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImageGatewayConfigWithOptions(request, runtime);
    }

    public DescribeImagePriceResponse describeImagePriceWithOptions(DescribeImagePriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeImagePrice", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeImagePriceResponse());
    }

    public DescribeImagePriceResponse describeImagePrice(DescribeImagePriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImagePriceWithOptions(request, runtime);
    }

    public DescribeJobResponse describeJobWithOptions(DescribeJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeJob", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeJobResponse());
    }

    public DescribeJobResponse describeJob(DescribeJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeJobWithOptions(request, runtime);
    }

    public DescribeNFSClientStatusResponse describeNFSClientStatusWithOptions(DescribeNFSClientStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNFSClientStatus", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeNFSClientStatusResponse());
    }

    public DescribeNFSClientStatusResponse describeNFSClientStatus(DescribeNFSClientStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNFSClientStatusWithOptions(request, runtime);
    }

    public DescribePriceResponse describePriceWithOptions(DescribePriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePrice", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new DescribePriceResponse());
    }

    public DescribePriceResponse describePrice(DescribePriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePriceWithOptions(request, runtime);
    }

    public EditJobTemplateResponse editJobTemplateWithOptions(EditJobTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("EditJobTemplate", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new EditJobTemplateResponse());
    }

    public EditJobTemplateResponse editJobTemplate(EditJobTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.editJobTemplateWithOptions(request, runtime);
    }

    public GetAccountingReportResponse getAccountingReportWithOptions(GetAccountingReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAccountingReport", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new GetAccountingReportResponse());
    }

    public GetAccountingReportResponse getAccountingReport(GetAccountingReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAccountingReportWithOptions(request, runtime);
    }

    public GetAutoScaleConfigResponse getAutoScaleConfigWithOptions(GetAutoScaleConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAutoScaleConfig", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new GetAutoScaleConfigResponse());
    }

    public GetAutoScaleConfigResponse getAutoScaleConfig(GetAutoScaleConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAutoScaleConfigWithOptions(request, runtime);
    }

    public GetCloudMetricLogsResponse getCloudMetricLogsWithOptions(GetCloudMetricLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCloudMetricLogs", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new GetCloudMetricLogsResponse());
    }

    public GetCloudMetricLogsResponse getCloudMetricLogs(GetCloudMetricLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCloudMetricLogsWithOptions(request, runtime);
    }

    public GetCloudMetricProfilingResponse getCloudMetricProfilingWithOptions(GetCloudMetricProfilingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCloudMetricProfiling", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new GetCloudMetricProfilingResponse());
    }

    public GetCloudMetricProfilingResponse getCloudMetricProfiling(GetCloudMetricProfilingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCloudMetricProfilingWithOptions(request, runtime);
    }

    public GetClusterVolumesResponse getClusterVolumesWithOptions(GetClusterVolumesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetClusterVolumes", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new GetClusterVolumesResponse());
    }

    public GetClusterVolumesResponse getClusterVolumes(GetClusterVolumesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getClusterVolumesWithOptions(request, runtime);
    }

    public GetGWSConnectTicketResponse getGWSConnectTicketWithOptions(GetGWSConnectTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetGWSConnectTicket", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new GetGWSConnectTicketResponse());
    }

    public GetGWSConnectTicketResponse getGWSConnectTicket(GetGWSConnectTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGWSConnectTicketWithOptions(request, runtime);
    }

    public GetHealthMonitorLogsResponse getHealthMonitorLogsWithOptions(GetHealthMonitorLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHealthMonitorLogs", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new GetHealthMonitorLogsResponse());
    }

    public GetHealthMonitorLogsResponse getHealthMonitorLogs(GetHealthMonitorLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHealthMonitorLogsWithOptions(request, runtime);
    }

    public GetHybridClusterConfigResponse getHybridClusterConfigWithOptions(GetHybridClusterConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHybridClusterConfig", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new GetHybridClusterConfigResponse());
    }

    public GetHybridClusterConfigResponse getHybridClusterConfig(GetHybridClusterConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHybridClusterConfigWithOptions(request, runtime);
    }

    public GetIfEcsTypeSupportHtConfigResponse getIfEcsTypeSupportHtConfigWithOptions(GetIfEcsTypeSupportHtConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetIfEcsTypeSupportHtConfig", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new GetIfEcsTypeSupportHtConfigResponse());
    }

    public GetIfEcsTypeSupportHtConfigResponse getIfEcsTypeSupportHtConfig(GetIfEcsTypeSupportHtConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getIfEcsTypeSupportHtConfigWithOptions(request, runtime);
    }

    public GetVisualServiceStatusResponse getVisualServiceStatusWithOptions(GetVisualServiceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetVisualServiceStatus", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new GetVisualServiceStatusResponse());
    }

    public GetVisualServiceStatusResponse getVisualServiceStatus(GetVisualServiceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVisualServiceStatusWithOptions(request, runtime);
    }

    public GetWorkbenchTokenResponse getWorkbenchTokenWithOptions(GetWorkbenchTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetWorkbenchToken", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new GetWorkbenchTokenResponse());
    }

    public GetWorkbenchTokenResponse getWorkbenchToken(GetWorkbenchTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getWorkbenchTokenWithOptions(request, runtime);
    }

    public InitializeEHPCResponse initializeEHPCWithOptions(InitializeEHPCRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("InitializeEHPC", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new InitializeEHPCResponse());
    }

    public InitializeEHPCResponse initializeEHPC(InitializeEHPCRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.initializeEHPCWithOptions(request, runtime);
    }

    public InstallSoftwareResponse installSoftwareWithOptions(InstallSoftwareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("InstallSoftware", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new InstallSoftwareResponse());
    }

    public InstallSoftwareResponse installSoftware(InstallSoftwareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.installSoftwareWithOptions(request, runtime);
    }

    public InvokeShellCommandResponse invokeShellCommandWithOptions(InvokeShellCommandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("InvokeShellCommand", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new InvokeShellCommandResponse());
    }

    public InvokeShellCommandResponse invokeShellCommand(InvokeShellCommandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.invokeShellCommandWithOptions(request, runtime);
    }

    public ListAccountMappingResponse listAccountMappingWithOptions(ListAccountMappingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAccountMapping", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListAccountMappingResponse());
    }

    public ListAccountMappingResponse listAccountMapping(ListAccountMappingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAccountMappingWithOptions(request, runtime);
    }

    public ListAvailableEcsTypesResponse listAvailableEcsTypesWithOptions(ListAvailableEcsTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAvailableEcsTypes", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListAvailableEcsTypesResponse());
    }

    public ListAvailableEcsTypesResponse listAvailableEcsTypes(ListAvailableEcsTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAvailableEcsTypesWithOptions(request, runtime);
    }

    public ListAvailableFileSystemTypesResponse listAvailableFileSystemTypesWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListAvailableFileSystemTypes", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListAvailableFileSystemTypesResponse());
    }

    public ListAvailableFileSystemTypesResponse listAvailableFileSystemTypes() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAvailableFileSystemTypesWithOptions(runtime);
    }

    public ListCloudMetricProfilingsResponse listCloudMetricProfilingsWithOptions(ListCloudMetricProfilingsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCloudMetricProfilings", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListCloudMetricProfilingsResponse());
    }

    public ListCloudMetricProfilingsResponse listCloudMetricProfilings(ListCloudMetricProfilingsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCloudMetricProfilingsWithOptions(request, runtime);
    }

    public ListClusterLogsResponse listClusterLogsWithOptions(ListClusterLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusterLogs", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListClusterLogsResponse());
    }

    public ListClusterLogsResponse listClusterLogs(ListClusterLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterLogsWithOptions(request, runtime);
    }

    public ListClustersResponse listClustersWithOptions(ListClustersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusters", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListClustersResponse());
    }

    public ListClustersResponse listClusters(ListClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClustersWithOptions(request, runtime);
    }

    public ListClustersMetaResponse listClustersMetaWithOptions(ListClustersMetaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClustersMeta", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListClustersMetaResponse());
    }

    public ListClustersMetaResponse listClustersMeta(ListClustersMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClustersMetaWithOptions(request, runtime);
    }

    public ListCommandsResponse listCommandsWithOptions(ListCommandsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCommands", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListCommandsResponse());
    }

    public ListCommandsResponse listCommands(ListCommandsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCommandsWithOptions(request, runtime);
    }

    public ListContainerAppsResponse listContainerAppsWithOptions(ListContainerAppsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListContainerApps", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListContainerAppsResponse());
    }

    public ListContainerAppsResponse listContainerApps(ListContainerAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listContainerAppsWithOptions(request, runtime);
    }

    public ListContainerImagesResponse listContainerImagesWithOptions(ListContainerImagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListContainerImages", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListContainerImagesResponse());
    }

    public ListContainerImagesResponse listContainerImages(ListContainerImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listContainerImagesWithOptions(request, runtime);
    }

    public ListCpfsFileSystemsResponse listCpfsFileSystemsWithOptions(ListCpfsFileSystemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCpfsFileSystems", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListCpfsFileSystemsResponse());
    }

    public ListCpfsFileSystemsResponse listCpfsFileSystems(ListCpfsFileSystemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCpfsFileSystemsWithOptions(request, runtime);
    }

    public ListCurrentClientVersionResponse listCurrentClientVersionWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListCurrentClientVersion", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListCurrentClientVersionResponse());
    }

    public ListCurrentClientVersionResponse listCurrentClientVersion() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCurrentClientVersionWithOptions(runtime);
    }

    public ListCustomImagesResponse listCustomImagesWithOptions(ListCustomImagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCustomImages", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListCustomImagesResponse());
    }

    public ListCustomImagesResponse listCustomImages(ListCustomImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCustomImagesWithOptions(request, runtime);
    }

    public ListFileSystemWithMountTargetsResponse listFileSystemWithMountTargetsWithOptions(ListFileSystemWithMountTargetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFileSystemWithMountTargets", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListFileSystemWithMountTargetsResponse());
    }

    public ListFileSystemWithMountTargetsResponse listFileSystemWithMountTargets(ListFileSystemWithMountTargetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFileSystemWithMountTargetsWithOptions(request, runtime);
    }

    public ListImagesResponse listImagesWithOptions(ListImagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListImages", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListImagesResponse());
    }

    public ListImagesResponse listImages(ListImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listImagesWithOptions(request, runtime);
    }

    public ListInstalledSoftwareResponse listInstalledSoftwareWithOptions(ListInstalledSoftwareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListInstalledSoftware", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListInstalledSoftwareResponse());
    }

    public ListInstalledSoftwareResponse listInstalledSoftware(ListInstalledSoftwareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInstalledSoftwareWithOptions(request, runtime);
    }

    public ListInvocationResultsResponse listInvocationResultsWithOptions(ListInvocationResultsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListInvocationResults", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListInvocationResultsResponse());
    }

    public ListInvocationResultsResponse listInvocationResults(ListInvocationResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInvocationResultsWithOptions(request, runtime);
    }

    public ListInvocationStatusResponse listInvocationStatusWithOptions(ListInvocationStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListInvocationStatus", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListInvocationStatusResponse());
    }

    public ListInvocationStatusResponse listInvocationStatus(ListInvocationStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInvocationStatusWithOptions(request, runtime);
    }

    public ListJobsResponse listJobsWithOptions(ListJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListJobs", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListJobsResponse());
    }

    public ListJobsResponse listJobs(ListJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listJobsWithOptions(request, runtime);
    }

    public ListJobTemplatesResponse listJobTemplatesWithOptions(ListJobTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListJobTemplates", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListJobTemplatesResponse());
    }

    public ListJobTemplatesResponse listJobTemplates(ListJobTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listJobTemplatesWithOptions(request, runtime);
    }

    public ListNodesResponse listNodesWithOptions(ListNodesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListNodes", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListNodesResponse());
    }

    public ListNodesResponse listNodes(ListNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNodesWithOptions(request, runtime);
    }

    public ListNodesByQueueResponse listNodesByQueueWithOptions(ListNodesByQueueRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListNodesByQueue", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListNodesByQueueResponse());
    }

    public ListNodesByQueueResponse listNodesByQueue(ListNodesByQueueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNodesByQueueWithOptions(request, runtime);
    }

    public ListNodesNoPagingResponse listNodesNoPagingWithOptions(ListNodesNoPagingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListNodesNoPaging", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListNodesNoPagingResponse());
    }

    public ListNodesNoPagingResponse listNodesNoPaging(ListNodesNoPagingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNodesNoPagingWithOptions(request, runtime);
    }

    public ListPreferredEcsTypesResponse listPreferredEcsTypesWithOptions(ListPreferredEcsTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPreferredEcsTypes", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListPreferredEcsTypesResponse());
    }

    public ListPreferredEcsTypesResponse listPreferredEcsTypes(ListPreferredEcsTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPreferredEcsTypesWithOptions(request, runtime);
    }

    public ListQueuesResponse listQueuesWithOptions(ListQueuesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListQueues", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListQueuesResponse());
    }

    public ListQueuesResponse listQueues(ListQueuesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listQueuesWithOptions(request, runtime);
    }

    public ListRegionsResponse listRegionsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListRegions", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListRegionsResponse());
    }

    public ListRegionsResponse listRegions() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRegionsWithOptions(runtime);
    }

    public ListSecurityGroupsResponse listSecurityGroupsWithOptions(ListSecurityGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSecurityGroups", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListSecurityGroupsResponse());
    }

    public ListSecurityGroupsResponse listSecurityGroups(ListSecurityGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSecurityGroupsWithOptions(request, runtime);
    }

    public ListSoftwaresResponse listSoftwaresWithOptions(ListSoftwaresRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSoftwares", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListSoftwaresResponse());
    }

    public ListSoftwaresResponse listSoftwares(ListSoftwaresRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSoftwaresWithOptions(request, runtime);
    }

    public ListTasksResponse listTasksWithOptions(ListTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTasks", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListTasksResponse());
    }

    public ListTasksResponse listTasks(ListTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTasksWithOptions(request, runtime);
    }

    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUsers", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListUsersResponse());
    }

    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    public ListVolumesResponse listVolumesWithOptions(ListVolumesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListVolumes", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListVolumesResponse());
    }

    public ListVolumesResponse listVolumes(ListVolumesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listVolumesWithOptions(request, runtime);
    }

    public ModifyClusterAttributesResponse modifyClusterAttributesWithOptions(ModifyClusterAttributesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyClusterAttributes", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ModifyClusterAttributesResponse());
    }

    public ModifyClusterAttributesResponse modifyClusterAttributes(ModifyClusterAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyClusterAttributesWithOptions(request, runtime);
    }

    public ModifyContainerAppAttributesResponse modifyContainerAppAttributesWithOptions(ModifyContainerAppAttributesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyContainerAppAttributes", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ModifyContainerAppAttributesResponse());
    }

    public ModifyContainerAppAttributesResponse modifyContainerAppAttributes(ModifyContainerAppAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyContainerAppAttributesWithOptions(request, runtime);
    }

    public ModifyImageGatewayConfigResponse modifyImageGatewayConfigWithOptions(ModifyImageGatewayConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyImageGatewayConfig", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ModifyImageGatewayConfigResponse());
    }

    public ModifyImageGatewayConfigResponse modifyImageGatewayConfig(ModifyImageGatewayConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyImageGatewayConfigWithOptions(request, runtime);
    }

    public ModifyUserGroupsResponse modifyUserGroupsWithOptions(ModifyUserGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyUserGroups", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ModifyUserGroupsResponse());
    }

    public ModifyUserGroupsResponse modifyUserGroups(ModifyUserGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyUserGroupsWithOptions(request, runtime);
    }

    public ModifyUserPasswordsResponse modifyUserPasswordsWithOptions(ModifyUserPasswordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyUserPasswords", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ModifyUserPasswordsResponse());
    }

    public ModifyUserPasswordsResponse modifyUserPasswords(ModifyUserPasswordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyUserPasswordsWithOptions(request, runtime);
    }

    public ModifyVisualServicePasswdResponse modifyVisualServicePasswdWithOptions(ModifyVisualServicePasswdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyVisualServicePasswd", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ModifyVisualServicePasswdResponse());
    }

    public ModifyVisualServicePasswdResponse modifyVisualServicePasswd(ModifyVisualServicePasswdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVisualServicePasswdWithOptions(request, runtime);
    }

    public MountNFSResponse mountNFSWithOptions(MountNFSRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("MountNFS", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new MountNFSResponse());
    }

    public MountNFSResponse mountNFS(MountNFSRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.mountNFSWithOptions(request, runtime);
    }

    public PullImageResponse pullImageWithOptions(PullImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("PullImage", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new PullImageResponse());
    }

    public PullImageResponse pullImage(PullImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pullImageWithOptions(request, runtime);
    }

    public QueryServicePackAndPriceResponse queryServicePackAndPriceWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("QueryServicePackAndPrice", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new QueryServicePackAndPriceResponse());
    }

    public QueryServicePackAndPriceResponse queryServicePackAndPrice() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryServicePackAndPriceWithOptions(runtime);
    }

    public RecoverClusterResponse recoverClusterWithOptions(RecoverClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecoverCluster", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new RecoverClusterResponse());
    }

    public RecoverClusterResponse recoverCluster(RecoverClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recoverClusterWithOptions(request, runtime);
    }

    public RerunJobsResponse rerunJobsWithOptions(RerunJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RerunJobs", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new RerunJobsResponse());
    }

    public RerunJobsResponse rerunJobs(RerunJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rerunJobsWithOptions(request, runtime);
    }

    public ResetNodesResponse resetNodesWithOptions(ResetNodesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetNodes", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new ResetNodesResponse());
    }

    public ResetNodesResponse resetNodes(ResetNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetNodesWithOptions(request, runtime);
    }

    public RunCloudMetricProfilingResponse runCloudMetricProfilingWithOptions(RunCloudMetricProfilingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RunCloudMetricProfiling", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new RunCloudMetricProfilingResponse());
    }

    public RunCloudMetricProfilingResponse runCloudMetricProfiling(RunCloudMetricProfilingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.runCloudMetricProfilingWithOptions(request, runtime);
    }

    public SetAutoScaleConfigResponse setAutoScaleConfigWithOptions(SetAutoScaleConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("SetAutoScaleConfig", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new SetAutoScaleConfigResponse());
    }

    public SetAutoScaleConfigResponse setAutoScaleConfig(SetAutoScaleConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setAutoScaleConfigWithOptions(request, runtime);
    }

    public SetGWSClusterPolicyResponse setGWSClusterPolicyWithOptions(SetGWSClusterPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetGWSClusterPolicy", "2018-04-12", "HTTPS", "POST", "AK", "json", req, runtime), new SetGWSClusterPolicyResponse());
    }

    public SetGWSClusterPolicyResponse setGWSClusterPolicy(SetGWSClusterPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setGWSClusterPolicyWithOptions(request, runtime);
    }

    public SetGWSInstanceNameResponse setGWSInstanceNameWithOptions(SetGWSInstanceNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("SetGWSInstanceName", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new SetGWSInstanceNameResponse());
    }

    public SetGWSInstanceNameResponse setGWSInstanceName(SetGWSInstanceNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setGWSInstanceNameWithOptions(request, runtime);
    }

    public SetGWSInstanceUserResponse setGWSInstanceUserWithOptions(SetGWSInstanceUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("SetGWSInstanceUser", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new SetGWSInstanceUserResponse());
    }

    public SetGWSInstanceUserResponse setGWSInstanceUser(SetGWSInstanceUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setGWSInstanceUserWithOptions(request, runtime);
    }

    public SetJobUserResponse setJobUserWithOptions(SetJobUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("SetJobUser", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new SetJobUserResponse());
    }

    public SetJobUserResponse setJobUser(SetJobUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setJobUserWithOptions(request, runtime);
    }

    public SetQueueResponse setQueueWithOptions(SetQueueRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("SetQueue", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new SetQueueResponse());
    }

    public SetQueueResponse setQueue(SetQueueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setQueueWithOptions(request, runtime);
    }

    public StartClusterResponse startClusterWithOptions(StartClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("StartCluster", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new StartClusterResponse());
    }

    public StartClusterResponse startCluster(StartClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startClusterWithOptions(request, runtime);
    }

    public StartGWSInstanceResponse startGWSInstanceWithOptions(StartGWSInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("StartGWSInstance", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new StartGWSInstanceResponse());
    }

    public StartGWSInstanceResponse startGWSInstance(StartGWSInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startGWSInstanceWithOptions(request, runtime);
    }

    public StartNodesResponse startNodesWithOptions(StartNodesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("StartNodes", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new StartNodesResponse());
    }

    public StartNodesResponse startNodes(StartNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startNodesWithOptions(request, runtime);
    }

    public StartVisualServiceResponse startVisualServiceWithOptions(StartVisualServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("StartVisualService", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new StartVisualServiceResponse());
    }

    public StartVisualServiceResponse startVisualService(StartVisualServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startVisualServiceWithOptions(request, runtime);
    }

    public StopClusterResponse stopClusterWithOptions(StopClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("StopCluster", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new StopClusterResponse());
    }

    public StopClusterResponse stopCluster(StopClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopClusterWithOptions(request, runtime);
    }

    public StopGWSInstanceResponse stopGWSInstanceWithOptions(StopGWSInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("StopGWSInstance", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new StopGWSInstanceResponse());
    }

    public StopGWSInstanceResponse stopGWSInstance(StopGWSInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopGWSInstanceWithOptions(request, runtime);
    }

    public StopJobsResponse stopJobsWithOptions(StopJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("StopJobs", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new StopJobsResponse());
    }

    public StopJobsResponse stopJobs(StopJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopJobsWithOptions(request, runtime);
    }

    public StopNodesResponse stopNodesWithOptions(StopNodesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("StopNodes", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new StopNodesResponse());
    }

    public StopNodesResponse stopNodes(StopNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopNodesWithOptions(request, runtime);
    }

    public StopVisualServiceResponse stopVisualServiceWithOptions(StopVisualServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("StopVisualService", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new StopVisualServiceResponse());
    }

    public StopVisualServiceResponse stopVisualService(StopVisualServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopVisualServiceWithOptions(request, runtime);
    }

    public SubmitJobResponse submitJobWithOptions(SubmitJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitJob", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new SubmitJobResponse());
    }

    public SubmitJobResponse submitJob(SubmitJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitJobWithOptions(request, runtime);
    }

    public UnbindAccountToClusterUserResponse unbindAccountToClusterUserWithOptions(UnbindAccountToClusterUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindAccountToClusterUser", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new UnbindAccountToClusterUserResponse());
    }

    public UnbindAccountToClusterUserResponse unbindAccountToClusterUser(UnbindAccountToClusterUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindAccountToClusterUserWithOptions(request, runtime);
    }

    public UninstallSoftwareResponse uninstallSoftwareWithOptions(UninstallSoftwareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("UninstallSoftware", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new UninstallSoftwareResponse());
    }

    public UninstallSoftwareResponse uninstallSoftware(UninstallSoftwareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uninstallSoftwareWithOptions(request, runtime);
    }

    public UpdateClusterVolumesResponse updateClusterVolumesWithOptions(UpdateClusterVolumesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateClusterVolumes", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new UpdateClusterVolumesResponse());
    }

    public UpdateClusterVolumesResponse updateClusterVolumes(UpdateClusterVolumesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateClusterVolumesWithOptions(request, runtime);
    }

    public UpdateQueueConfigResponse updateQueueConfigWithOptions(UpdateQueueConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateQueueConfig", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new UpdateQueueConfigResponse());
    }

    public UpdateQueueConfigResponse updateQueueConfig(UpdateQueueConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateQueueConfigWithOptions(request, runtime);
    }

    public UpgradeClientResponse upgradeClientWithOptions(UpgradeClientRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeClient", "2018-04-12", "HTTPS", "GET", "AK", "json", req, runtime), new UpgradeClientResponse());
    }

    public UpgradeClientResponse upgradeClient(UpgradeClientRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeClientWithOptions(request, runtime);
    }
}
