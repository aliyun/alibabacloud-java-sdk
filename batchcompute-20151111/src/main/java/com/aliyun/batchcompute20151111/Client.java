// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.batchcompute20151111;

import com.aliyun.tea.*;
import com.aliyun.batchcompute20151111.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("batchcompute", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CancelImageResponse cancelImage(String ResourceName, CancelImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelImageWithOptions(ResourceName, request, headers, runtime);
    }

    public CancelImageResponse cancelImageWithOptions(String ResourceName, CancelImageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CancelImage", "2015-11-11", "HTTPS", "PUT", "AK", "/images/" + ResourceName + "", "none", req, runtime), new CancelImageResponse());
    }

    public ChangeJobPriorityResponse changeJobPriority(String ResourceName, ChangeJobPriorityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.changeJobPriorityWithOptions(ResourceName, request, headers, runtime);
    }

    public ChangeJobPriorityResponse changeJobPriorityWithOptions(String ResourceName, ChangeJobPriorityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ChangeJobPriority", "2015-11-11", "HTTPS", "PUT", "AK", "/jobs/" + ResourceName + "", "none", req, runtime), new ChangeJobPriorityResponse());
    }

    public CreateAppResponse createApp() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppWithOptions(headers, runtime);
    }

    public CreateAppResponse createAppWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("CreateApp", "2015-11-11", "HTTPS", "POST", "AK", "/apps", "none", req, runtime), new CreateAppResponse());
    }

    public CreateClusterResponse createCluster(CreateClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createClusterWithOptions(request, headers, runtime);
    }

    public CreateClusterResponse createClusterWithOptions(CreateClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateCluster", "2015-11-11", "HTTPS", "POST", "AK", "/clusters", "none", req, runtime), new CreateClusterResponse());
    }

    public CreateImageResponse createImage(CreateImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createImageWithOptions(request, headers, runtime);
    }

    public CreateImageResponse createImageWithOptions(CreateImageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateImage", "2015-11-11", "HTTPS", "POST", "AK", "/images", "none", req, runtime), new CreateImageResponse());
    }

    public CreateJobResponse createJob(CreateJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createJobWithOptions(request, headers, runtime);
    }

    public CreateJobResponse createJobWithOptions(CreateJobRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateJob", "2015-11-11", "HTTPS", "POST", "AK", "/jobs", "none", req, runtime), new CreateJobResponse());
    }

    public DeleteAppResponse deleteApp(String ResourceName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAppWithOptions(ResourceName, headers, runtime);
    }

    public DeleteAppResponse deleteAppWithOptions(String ResourceName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteApp", "2015-11-11", "HTTPS", "DELETE", "AK", "/apps/" + ResourceName + "", "none", req, runtime), new DeleteAppResponse());
    }

    public DeleteClusterResponse deleteCluster(String ResourceName, DeleteClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteClusterWithOptions(ResourceName, request, headers, runtime);
    }

    public DeleteClusterResponse deleteClusterWithOptions(String ResourceName, DeleteClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteCluster", "2015-11-11", "HTTPS", "DELETE", "AK", "/clusters/" + ResourceName + "", "none", req, runtime), new DeleteClusterResponse());
    }

    public DeleteClusterInstanceResponse deleteClusterInstance(String ClusterId, String GroupName, String InstanceId, DeleteClusterInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteClusterInstanceWithOptions(ClusterId, GroupName, InstanceId, request, headers, runtime);
    }

    public DeleteClusterInstanceResponse deleteClusterInstanceWithOptions(String ClusterId, String GroupName, String InstanceId, DeleteClusterInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteClusterInstance", "2015-11-11", "HTTPS", "DELETE", "AK", "/clusters/" + ClusterId + "/groups/{GroupName}/instances/{InstanceId}", "none", req, runtime), new DeleteClusterInstanceResponse());
    }

    public DeleteImageResponse deleteImage(String ResourceName, DeleteImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteImageWithOptions(ResourceName, request, headers, runtime);
    }

    public DeleteImageResponse deleteImageWithOptions(String ResourceName, DeleteImageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteImage", "2015-11-11", "HTTPS", "DELETE", "AK", "/images/" + ResourceName + "", "none", req, runtime), new DeleteImageResponse());
    }

    public DeleteJobResponse deleteJob(String ResourceName, DeleteJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteJobWithOptions(ResourceName, request, headers, runtime);
    }

    public DeleteJobResponse deleteJobWithOptions(String ResourceName, DeleteJobRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteJob", "2015-11-11", "HTTPS", "DELETE", "AK", "/jobs/" + ResourceName + "", "none", req, runtime), new DeleteJobResponse());
    }

    public DeleteProjectResponse deleteProject(String ProjectName, DeleteProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProjectWithOptions(ProjectName, request, headers, runtime);
    }

    public DeleteProjectResponse deleteProjectWithOptions(String ProjectName, DeleteProjectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteProject", "2015-11-11", "HTTPS", "DELETE", "AK", "/projects/" + ProjectName + "", "none", req, runtime), new DeleteProjectResponse());
    }

    public GetAppResponse getApp(String ResourceName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppWithOptions(ResourceName, headers, runtime);
    }

    public GetAppResponse getAppWithOptions(String ResourceName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetApp", "2015-11-11", "HTTPS", "GET", "AK", "/apps/" + ResourceName + "", "none", req, runtime), new GetAppResponse());
    }

    public GetClusterResponse getCluster(String ResourceName, GetClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterWithOptions(ResourceName, request, headers, runtime);
    }

    public GetClusterResponse getClusterWithOptions(String ResourceName, GetClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetCluster", "2015-11-11", "HTTPS", "GET", "AK", "/clusters/" + ResourceName + "", "none", req, runtime), new GetClusterResponse());
    }

    public GetClusterInstanceResponse getClusterInstance(String ClusterId, String GroupName, String InstanceId, GetClusterInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterInstanceWithOptions(ClusterId, GroupName, InstanceId, request, headers, runtime);
    }

    public GetClusterInstanceResponse getClusterInstanceWithOptions(String ClusterId, String GroupName, String InstanceId, GetClusterInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetClusterInstance", "2015-11-11", "HTTPS", "GET", "AK", "/clusters/" + ClusterId + "/groups/{GroupName}/instances/{InstanceId}", "none", req, runtime), new GetClusterInstanceResponse());
    }

    public GetImageResponse getImage(String ResourceName, GetImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getImageWithOptions(ResourceName, request, headers, runtime);
    }

    public GetImageResponse getImageWithOptions(String ResourceName, GetImageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetImage", "2015-11-11", "HTTPS", "GET", "AK", "/images/" + ResourceName + "", "none", req, runtime), new GetImageResponse());
    }

    public GetInstanceResponse getInstance(String ResourceName, String TaskName, String InstanceId, GetInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceWithOptions(ResourceName, TaskName, InstanceId, request, headers, runtime);
    }

    public GetInstanceResponse getInstanceWithOptions(String ResourceName, String TaskName, String InstanceId, GetInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetInstance", "2015-11-11", "HTTPS", "GET", "AK", "/jobs/" + ResourceName + "/tasks/{TaskName}/instances/{InstanceId}", "none", req, runtime), new GetInstanceResponse());
    }

    public GetJobResponse getJob(String ResourceName, GetJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJobWithOptions(ResourceName, request, headers, runtime);
    }

    public GetJobResponse getJobWithOptions(String ResourceName, GetJobRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetJob", "2015-11-11", "HTTPS", "GET", "AK", "/jobs/" + ResourceName + "", "none", req, runtime), new GetJobResponse());
    }

    public GetJobDescriptionResponse getJobDescription(String ResourceName, GetJobDescriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJobDescriptionWithOptions(ResourceName, request, headers, runtime);
    }

    public GetJobDescriptionResponse getJobDescriptionWithOptions(String ResourceName, GetJobDescriptionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetJobDescription", "2015-11-11", "HTTPS", "GET", "AK", "/jobs/" + ResourceName + "?description", "none", req, runtime), new GetJobDescriptionResponse());
    }

    public GetQuotaResponse getQuota(GetQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getQuotaWithOptions(request, headers, runtime);
    }

    public GetQuotaResponse getQuotaWithOptions(GetQuotaRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetQuota", "2015-11-11", "HTTPS", "GET", "AK", "/quotas", "none", req, runtime), new GetQuotaResponse());
    }

    public GetTaskResponse getTask(String ResourceName, String TaskName, GetTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskWithOptions(ResourceName, TaskName, request, headers, runtime);
    }

    public GetTaskResponse getTaskWithOptions(String ResourceName, String TaskName, GetTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetTask", "2015-11-11", "HTTPS", "GET", "AK", "/jobs/" + ResourceName + "/tasks/{TaskName}", "none", req, runtime), new GetTaskResponse());
    }

    public ListAppsResponse listApps() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppsWithOptions(headers, runtime);
    }

    public ListAppsResponse listAppsWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListApps", "2015-11-11", "HTTPS", "GET", "AK", "/apps", "none", req, runtime), new ListAppsResponse());
    }

    public ListAvailableInstanceTypeResponse listAvailableInstanceType() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAvailableInstanceTypeWithOptions(headers, runtime);
    }

    public ListAvailableInstanceTypeResponse listAvailableInstanceTypeWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListAvailableInstanceType", "2015-11-11", "HTTPS", "GET", "AK", "/available", "none", req, runtime), new ListAvailableInstanceTypeResponse());
    }

    public ListClusterInstancesResponse listClusterInstances(String ClusterId, String GroupName, ListClusterInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterInstancesWithOptions(ClusterId, GroupName, request, headers, runtime);
    }

    public ListClusterInstancesResponse listClusterInstancesWithOptions(String ClusterId, String GroupName, ListClusterInstancesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListClusterInstances", "2015-11-11", "HTTPS", "GET", "AK", "/clusters/" + ClusterId + "/groups/{GroupName}/instances", "none", req, runtime), new ListClusterInstancesResponse());
    }

    public ListClustersResponse listClusters(ListClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClustersWithOptions(request, headers, runtime);
    }

    public ListClustersResponse listClustersWithOptions(ListClustersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListClusters", "2015-11-11", "HTTPS", "GET", "AK", "/clusters", "none", req, runtime), new ListClustersResponse());
    }

    public ListImagesResponse listImages(ListImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listImagesWithOptions(request, headers, runtime);
    }

    public ListImagesResponse listImagesWithOptions(ListImagesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListImages", "2015-11-11", "HTTPS", "GET", "AK", "/images", "none", req, runtime), new ListImagesResponse());
    }

    public ListInstancesResponse listInstances(String ResourceName, String TaskName, ListInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstancesWithOptions(ResourceName, TaskName, request, headers, runtime);
    }

    public ListInstancesResponse listInstancesWithOptions(String ResourceName, String TaskName, ListInstancesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListInstances", "2015-11-11", "HTTPS", "GET", "AK", "/jobs/" + ResourceName + "/tasks/{TaskName}/instances", "none", req, runtime), new ListInstancesResponse());
    }

    public ListJobsResponse listJobs(ListJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listJobsWithOptions(request, headers, runtime);
    }

    public ListJobsResponse listJobsWithOptions(ListJobsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListJobs", "2015-11-11", "HTTPS", "GET", "AK", "/jobs", "none", req, runtime), new ListJobsResponse());
    }

    public ListRegionsResponse listRegions() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRegionsWithOptions(headers, runtime);
    }

    public ListRegionsResponse listRegionsWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListRegions", "2015-11-11", "HTTPS", "GET", "AK", "/regions", "none", req, runtime), new ListRegionsResponse());
    }

    public ListTasksResponse listTasks(String ResourceName, ListTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTasksWithOptions(ResourceName, request, headers, runtime);
    }

    public ListTasksResponse listTasksWithOptions(String ResourceName, ListTasksRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListTasks", "2015-11-11", "HTTPS", "GET", "AK", "/jobs/" + ResourceName + "/tasks", "none", req, runtime), new ListTasksResponse());
    }

    public ModifyAppResponse modifyApp(String ResourceName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyAppWithOptions(ResourceName, headers, runtime);
    }

    public ModifyAppResponse modifyAppWithOptions(String ResourceName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ModifyApp", "2015-11-11", "HTTPS", "PUT", "AK", "/apps/" + ResourceName + "", "none", req, runtime), new ModifyAppResponse());
    }

    public ModifyClusterResponse modifyCluster(String ResourceName, ModifyClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyClusterWithOptions(ResourceName, request, headers, runtime);
    }

    public ModifyClusterResponse modifyClusterWithOptions(String ResourceName, ModifyClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ModifyCluster", "2015-11-11", "HTTPS", "PUT", "AK", "/clusters/" + ResourceName + "", "none", req, runtime), new ModifyClusterResponse());
    }

    public PollForTaskResponse pollForTask(String ClusterId, String WorkerId, PollForTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pollForTaskWithOptions(ClusterId, WorkerId, request, headers, runtime);
    }

    public PollForTaskResponse pollForTaskWithOptions(String ClusterId, String WorkerId, PollForTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("PollForTask", "2015-11-11", "HTTPS", "POST", "AK", "/clusters/" + ClusterId + "/workers/{WorkerId}/fetchTask", "none", req, runtime), new PollForTaskResponse());
    }

    public RecreateClusterInstanceResponse recreateClusterInstance(String ClusterId, String GroupName, String InstanceId, RecreateClusterInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recreateClusterInstanceWithOptions(ClusterId, GroupName, InstanceId, request, headers, runtime);
    }

    public RecreateClusterInstanceResponse recreateClusterInstanceWithOptions(String ClusterId, String GroupName, String InstanceId, RecreateClusterInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("RecreateClusterInstance", "2015-11-11", "HTTPS", "POST", "AK", "/clusters/" + ClusterId + "/groups/{GroupName}/instances/{InstanceId}/recreate", "none", req, runtime), new RecreateClusterInstanceResponse());
    }

    public RenewClusterInstanceResponse renewClusterInstance(String ClusterId, String GroupName, String InstanceId, RenewClusterInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renewClusterInstanceWithOptions(ClusterId, GroupName, InstanceId, request, headers, runtime);
    }

    public RenewClusterInstanceResponse renewClusterInstanceWithOptions(String ClusterId, String GroupName, String InstanceId, RenewClusterInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("RenewClusterInstance", "2015-11-11", "HTTPS", "POST", "AK", "/clusters/" + ClusterId + "/groups/{GroupName}/instances/{InstanceId}/renew", "none", req, runtime), new RenewClusterInstanceResponse());
    }

    public ReportTaskStatusResponse reportTaskStatus(String ClusterId, String WorkerId, ReportTaskStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reportTaskStatusWithOptions(ClusterId, WorkerId, request, headers, runtime);
    }

    public ReportTaskStatusResponse reportTaskStatusWithOptions(String ClusterId, String WorkerId, ReportTaskStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ReportTaskStatus", "2015-11-11", "HTTPS", "POST", "AK", "/clusters/" + ClusterId + "/workers/{WorkerId}/updateTaskStatus", "none", req, runtime), new ReportTaskStatusResponse());
    }

    public ReportWorkerStatusResponse reportWorkerStatus(String ClusterId, String WorkerId, ReportWorkerStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reportWorkerStatusWithOptions(ClusterId, WorkerId, request, headers, runtime);
    }

    public ReportWorkerStatusResponse reportWorkerStatusWithOptions(String ClusterId, String WorkerId, ReportWorkerStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ReportWorkerStatus", "2015-11-11", "HTTPS", "POST", "AK", "/clusters/" + ClusterId + "/workers/{WorkerId}/updateStatus", "none", req, runtime), new ReportWorkerStatusResponse());
    }

    public StartJobResponse startJob(String ResourceName, StartJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startJobWithOptions(ResourceName, request, headers, runtime);
    }

    public StartJobResponse startJobWithOptions(String ResourceName, StartJobRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("StartJob", "2015-11-11", "HTTPS", "POST", "AK", "/jobs/" + ResourceName + "/start", "none", req, runtime), new StartJobResponse());
    }

    public StopJobResponse stopJob(String ResourceName, StopJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopJobWithOptions(ResourceName, request, headers, runtime);
    }

    public StopJobResponse stopJobWithOptions(String ResourceName, StopJobRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("StopJob", "2015-11-11", "HTTPS", "POST", "AK", "/jobs/" + ResourceName + "/stop", "none", req, runtime), new StopJobResponse());
    }
}
