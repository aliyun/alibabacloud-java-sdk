// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701;

import com.aliyun.tea.*;
import com.aliyun.ehpcinstant20230701.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ehpcinstant", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    /**
     * <b>summary</b> : 
     * <p>Add a custom image.</p>
     * 
     * @param tmpReq AddImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddImageResponse
     */
    public AddImageResponse addImageWithOptions(AddImageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddImageShrinkRequest request = new AddImageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.containerImageSpec)) {
            request.containerImageSpecShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.containerImageSpec, "ContainerImageSpec", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.VMImageSpec)) {
            request.VMImageSpecShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.VMImageSpec, "VMImageSpec", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.containerImageSpecShrink)) {
            query.put("ContainerImageSpec", request.containerImageSpecShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageType)) {
            query.put("ImageType", request.imageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageVersion)) {
            query.put("ImageVersion", request.imageVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VMImageSpecShrink)) {
            query.put("VMImageSpec", request.VMImageSpecShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddImage"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Add a custom image.</p>
     * 
     * @param request AddImageRequest
     * @return AddImageResponse
     */
    public AddImageResponse addImage(AddImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addImageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>*Make sure that you fully understand E-HPC Instnat billing methods and <a href="https://help.aliyun.com/zh/e-hpc/e-hpc-instant/product-overview/billing-overview?spm=a2c4g.11186623.help-menu-57664.d_0_2_0.5fdd28422y6UvO">prices</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Create a E-HPC execution plan.</p>
     * 
     * @param tmpReq CreateActionPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateActionPlanResponse
     */
    public CreateActionPlanResponse createActionPlanWithOptions(CreateActionPlanRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateActionPlanShrinkRequest request = new CreateActionPlanShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.regions)) {
            request.regionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.regions, "Regions", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resources)) {
            request.resourcesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resources, "Resources", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionPlanName)) {
            query.put("ActionPlanName", request.actionPlanName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allocationSpec)) {
            query.put("AllocationSpec", request.allocationSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desiredCapacity)) {
            query.put("DesiredCapacity", request.desiredCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intervalMinutes)) {
            query.put("IntervalMinutes", request.intervalMinutes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prologScript)) {
            query.put("PrologScript", request.prologScript);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionsShrink)) {
            query.put("Regions", request.regionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourcesShrink)) {
            query.put("Resources", request.resourcesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.script)) {
            query.put("Script", request.script);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateActionPlan"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateActionPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>*Make sure that you fully understand E-HPC Instnat billing methods and <a href="https://help.aliyun.com/zh/e-hpc/e-hpc-instant/product-overview/billing-overview?spm=a2c4g.11186623.help-menu-57664.d_0_2_0.5fdd28422y6UvO">prices</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Create a E-HPC execution plan.</p>
     * 
     * @param request CreateActionPlanRequest
     * @return CreateActionPlanResponse
     */
    public CreateActionPlanResponse createActionPlan(CreateActionPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createActionPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a E-HPC Instant job.</p>
     * 
     * @param tmpReq CreateJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateJobResponse
     */
    public CreateJobResponse createJobWithOptions(CreateJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateJobShrinkRequest request = new CreateJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dependencyPolicy)) {
            request.dependencyPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dependencyPolicy, "DependencyPolicy", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deploymentPolicy)) {
            request.deploymentPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deploymentPolicy, "DeploymentPolicy", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.securityPolicy)) {
            request.securityPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.securityPolicy, "SecurityPolicy", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tasks)) {
            request.tasksShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tasks, "Tasks", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dependencyPolicyShrink)) {
            query.put("DependencyPolicy", request.dependencyPolicyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deploymentPolicyShrink)) {
            query.put("DeploymentPolicy", request.deploymentPolicyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobDescription)) {
            query.put("JobDescription", request.jobDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            query.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobScheduler)) {
            query.put("JobScheduler", request.jobScheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityPolicyShrink)) {
            query.put("SecurityPolicy", request.securityPolicyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tasksShrink)) {
            query.put("Tasks", request.tasksShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateJob"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create a E-HPC Instant job.</p>
     * 
     * @param request CreateJobRequest
     * @return CreateJobResponse
     */
    public CreateJobResponse createJob(CreateJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a resource pool.</p>
     * 
     * @param tmpReq CreatePoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePoolResponse
     */
    public CreatePoolResponse createPoolWithOptions(CreatePoolRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePoolShrinkRequest request = new CreatePoolShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceLimits)) {
            request.resourceLimitsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceLimits, "ResourceLimits", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.poolName)) {
            query.put("PoolName", request.poolName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceLimitsShrink)) {
            query.put("ResourceLimits", request.resourceLimitsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePool"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a resource pool.</p>
     * 
     * @param request CreatePoolRequest
     * @return CreatePoolResponse
     */
    public CreatePoolResponse createPool(CreatePoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPoolWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Make sure that you fully understand E-HPC Instnat billing methods and <a href="https://help.aliyun.com/zh/e-hpc/e-hpc-instant/product-overview/billing-overview?spm=a2c4g.11186623.help-menu-57664.d_0_2_0.5fdd28422y6UvO">prices</a>.</em>*
     * This operation stops all Instant jobs that are managed by ActionPlanId.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete an execution plan</p>
     * 
     * @param request DeleteActionPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteActionPlanResponse
     */
    public DeleteActionPlanResponse deleteActionPlanWithOptions(DeleteActionPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionPlanId)) {
            query.put("ActionPlanId", request.actionPlanId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteActionPlan"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteActionPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Make sure that you fully understand E-HPC Instnat billing methods and <a href="https://help.aliyun.com/zh/e-hpc/e-hpc-instant/product-overview/billing-overview?spm=a2c4g.11186623.help-menu-57664.d_0_2_0.5fdd28422y6UvO">prices</a>.</em>*
     * This operation stops all Instant jobs that are managed by ActionPlanId.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete an execution plan</p>
     * 
     * @param request DeleteActionPlanRequest
     * @return DeleteActionPlanResponse
     */
    public DeleteActionPlanResponse deleteActionPlan(DeleteActionPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteActionPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes one or more job records that are in the final state from a specified cluster.</p>
     * 
     * @param tmpReq DeleteJobRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteJobRecordsResponse
     */
    public DeleteJobRecordsResponse deleteJobRecordsWithOptions(DeleteJobRecordsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteJobRecordsShrinkRequest request = new DeleteJobRecordsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.jobIds)) {
            request.jobIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.jobIds, "JobIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobIdsShrink)) {
            query.put("JobIds", request.jobIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteJobRecords"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteJobRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes one or more job records that are in the final state from a specified cluster.</p>
     * 
     * @param request DeleteJobRecordsRequest
     * @return DeleteJobRecordsResponse
     */
    public DeleteJobRecordsResponse deleteJobRecords(DeleteJobRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteJobRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes one or more jobs from a specified cluster.</p>
     * 
     * @param tmpReq DeleteJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteJobsResponse
     */
    public DeleteJobsResponse deleteJobsWithOptions(DeleteJobsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteJobsShrinkRequest request = new DeleteJobsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.executorIds)) {
            request.executorIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.executorIds, "ExecutorIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.jobSpec)) {
            request.jobSpecShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.jobSpec, "JobSpec", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.executorIdsShrink)) {
            query.put("ExecutorIds", request.executorIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobScheduler)) {
            query.put("JobScheduler", request.jobScheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobSpecShrink)) {
            query.put("JobSpec", request.jobSpecShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteJobs"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes one or more jobs from a specified cluster.</p>
     * 
     * @param request DeleteJobsRequest
     * @return DeleteJobsResponse
     */
    public DeleteJobsResponse deleteJobs(DeleteJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can execute this statement to delete a resource pool.</p>
     * 
     * @param request DeletePoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePoolResponse
     */
    public DeletePoolResponse deletePoolWithOptions(DeletePoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.poolName)) {
            query.put("PoolName", request.poolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePool"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can execute this statement to delete a resource pool.</p>
     * 
     * @param request DeletePoolRequest
     * @return DeletePoolResponse
     */
    public DeletePoolResponse deletePool(DeletePoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can query the monitoring time series dataset of a job by specifying the job array index and query metric parameters.</p>
     * 
     * @param tmpReq DescribeJobMetricDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeJobMetricDataResponse
     */
    public DescribeJobMetricDataResponse describeJobMetricDataWithOptions(DescribeJobMetricDataRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeJobMetricDataShrinkRequest request = new DescribeJobMetricDataShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.arrayIndex)) {
            request.arrayIndexShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.arrayIndex, "ArrayIndex", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.arrayIndexShrink)) {
            query.put("ArrayIndex", request.arrayIndexShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeJobMetricData"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeJobMetricDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can query the monitoring time series dataset of a job by specifying the job array index and query metric parameters.</p>
     * 
     * @param request DescribeJobMetricDataRequest
     * @return DescribeJobMetricDataResponse
     */
    public DescribeJobMetricDataResponse describeJobMetricData(DescribeJobMetricDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeJobMetricDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all instant monitoring metrics in the job array list by specifying a specific job array index list.</p>
     * 
     * @param tmpReq DescribeJobMetricLastRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeJobMetricLastResponse
     */
    public DescribeJobMetricLastResponse describeJobMetricLastWithOptions(DescribeJobMetricLastRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeJobMetricLastShrinkRequest request = new DescribeJobMetricLastShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.arrayIndex)) {
            request.arrayIndexShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.arrayIndex, "ArrayIndex", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.arrayIndexShrink)) {
            query.put("ArrayIndex", request.arrayIndexShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeJobMetricLast"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeJobMetricLastResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all instant monitoring metrics in the job array list by specifying a specific job array index list.</p>
     * 
     * @param request DescribeJobMetricLastRequest
     * @return DescribeJobMetricLastResponse
     */
    public DescribeJobMetricLastResponse describeJobMetricLast(DescribeJobMetricLastRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeJobMetricLastWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query job logs</p>
     * 
     * @param request DescribeJobResultsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeJobResultsResponse
     */
    public DescribeJobResultsResponse describeJobResultsWithOptions(DescribeJobResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.arrayIndex)) {
            query.put("ArrayIndex", request.arrayIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentEncoding)) {
            query.put("ContentEncoding", request.contentEncoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitBytes)) {
            query.put("LimitBytes", request.limitBytes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeJobResults"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeJobResultsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query job logs</p>
     * 
     * @param request DescribeJobResultsRequest
     * @return DescribeJobResultsResponse
     */
    public DescribeJobResultsResponse describeJobResults(DescribeJobResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeJobResultsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Querying Execution Plan Details</p>
     * 
     * @param request GetActionPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetActionPlanResponse
     */
    public GetActionPlanResponse getActionPlanWithOptions(GetActionPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionPlanId)) {
            query.put("ActionPlanId", request.actionPlanId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetActionPlan"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetActionPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Querying Execution Plan Details</p>
     * 
     * @param request GetActionPlanRequest
     * @return GetActionPlanResponse
     */
    public GetActionPlanResponse getActionPlan(GetActionPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getActionPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the application version list.</p>
     * 
     * @param request GetAppVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppVersionsResponse
     */
    public GetAppVersionsResponse getAppVersionsWithOptions(GetAppVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageCategory)) {
            query.put("ImageCategory", request.imageCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageType)) {
            query.put("ImageType", request.imageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppVersions"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the application version list.</p>
     * 
     * @param request GetAppVersionsRequest
     * @return GetAppVersionsResponse
     */
    public GetAppVersionsResponse getAppVersions(GetAppVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppVersionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the information about an image.</p>
     * 
     * @param tmpReq GetImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetImageResponse
     */
    public GetImageResponse getImageWithOptions(GetImageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetImageShrinkRequest request = new GetImageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.additionalRegionIds)) {
            request.additionalRegionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.additionalRegionIds, "AdditionalRegionIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.additionalRegionIdsShrink)) {
            query.put("AdditionalRegionIds", request.additionalRegionIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageCategory)) {
            query.put("ImageCategory", request.imageCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageType)) {
            query.put("ImageType", request.imageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImage"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the information about an image.</p>
     * 
     * @param request GetImageRequest
     * @return GetImageResponse
     */
    public GetImageResponse getImage(GetImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of an execution job.</p>
     * 
     * @param request GetJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobResponse
     */
    public GetJobResponse getJobWithOptions(GetJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJob"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of an execution job.</p>
     * 
     * @param request GetJobRequest
     * @return GetJobResponse
     */
    public GetJobResponse getJob(GetJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of a resource pool.</p>
     * 
     * @param request GetPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPoolResponse
     */
    public GetPoolResponse getPoolWithOptions(GetPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.poolName)) {
            query.put("PoolName", request.poolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPool"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of a resource pool.</p>
     * 
     * @param request GetPoolRequest
     * @return GetPoolResponse
     */
    public GetPoolResponse getPool(GetPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution status of an execution plan.</p>
     * 
     * @param request ListActionPlanActivitiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListActionPlanActivitiesResponse
     */
    public ListActionPlanActivitiesResponse listActionPlanActivitiesWithOptions(ListActionPlanActivitiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionPlanId)) {
            query.put("ActionPlanId", request.actionPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListActionPlanActivities"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListActionPlanActivitiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution status of an execution plan.</p>
     * 
     * @param request ListActionPlanActivitiesRequest
     * @return ListActionPlanActivitiesResponse
     */
    public ListActionPlanActivitiesResponse listActionPlanActivities(ListActionPlanActivitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listActionPlanActivitiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of execution plans.</p>
     * 
     * @param tmpReq ListActionPlansRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListActionPlansResponse
     */
    public ListActionPlansResponse listActionPlansWithOptions(ListActionPlansRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListActionPlansShrinkRequest request = new ListActionPlansShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.actionPlanIds)) {
            request.actionPlanIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.actionPlanIds, "ActionPlanIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionPlanIdsShrink)) {
            query.put("ActionPlanIds", request.actionPlanIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListActionPlans"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListActionPlansResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of execution plans.</p>
     * 
     * @param request ListActionPlansRequest
     * @return ListActionPlansResponse
     */
    public ListActionPlansResponse listActionPlans(ListActionPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listActionPlansWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries job executor information.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the running event list of one or more executers.</p>
     * 
     * @param tmpReq ListExecutorEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExecutorEventsResponse
     */
    public ListExecutorEventsResponse listExecutorEventsWithOptions(ListExecutorEventsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListExecutorEventsShrinkRequest request = new ListExecutorEventsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filter)) {
            request.filterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filter, "Filter", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterShrink)) {
            query.put("Filter", request.filterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExecutorEvents"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExecutorEventsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries job executor information.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the running event list of one or more executers.</p>
     * 
     * @param request ListExecutorEventsRequest
     * @return ListExecutorEventsResponse
     */
    public ListExecutorEventsResponse listExecutorEvents(ListExecutorEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExecutorEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Querying Global Executor Information</p>
     * 
     * @param tmpReq ListExecutorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExecutorsResponse
     */
    public ListExecutorsResponse listExecutorsWithOptions(ListExecutorsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListExecutorsShrinkRequest request = new ListExecutorsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filter)) {
            request.filterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filter, "Filter", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterShrink)) {
            query.put("Filter", request.filterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExecutors"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExecutorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Querying Global Executor Information</p>
     * 
     * @param request ListExecutorsRequest
     * @return ListExecutorsResponse
     */
    public ListExecutorsResponse listExecutors(ListExecutorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExecutorsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the image list.</p>
     * 
     * @param tmpReq ListImagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListImagesResponse
     */
    public ListImagesResponse listImagesWithOptions(ListImagesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListImagesShrinkRequest request = new ListImagesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.imageIds)) {
            request.imageIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.imageIds, "ImageIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.imageNames)) {
            request.imageNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.imageNames, "ImageNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageCategory)) {
            query.put("ImageCategory", request.imageCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageIdsShrink)) {
            query.put("ImageIds", request.imageIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageNamesShrink)) {
            query.put("ImageNames", request.imageNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageType)) {
            query.put("ImageType", request.imageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListImages"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListImagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the image list.</p>
     * 
     * @param request ListImagesRequest
     * @return ListImagesResponse
     */
    public ListImagesResponse listImages(ListImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listImagesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries job executor information.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries job executor information.</p>
     * 
     * @param request ListJobExecutorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobExecutorsResponse
     */
    public ListJobExecutorsResponse listJobExecutorsWithOptions(ListJobExecutorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobExecutors"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobExecutorsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries job executor information.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries job executor information.</p>
     * 
     * @param request ListJobExecutorsRequest
     * @return ListJobExecutorsResponse
     */
    public ListJobExecutorsResponse listJobExecutors(ListJobExecutorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listJobExecutorsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the jobs in a cluster.</p>
     * 
     * @param tmpReq ListJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobsWithOptions(ListJobsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListJobsShrinkRequest request = new ListJobsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filter)) {
            request.filterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filter, "Filter", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sortBy)) {
            request.sortByShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sortBy, "SortBy", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterShrink)) {
            query.put("Filter", request.filterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortByShrink)) {
            query.put("SortBy", request.sortByShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobs"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the jobs in a cluster.</p>
     * 
     * @param request ListJobsRequest
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobs(ListJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resource pool list.</p>
     * 
     * @param tmpReq ListPoolsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPoolsResponse
     */
    public ListPoolsResponse listPoolsWithOptions(ListPoolsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListPoolsShrinkRequest request = new ListPoolsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filter)) {
            request.filterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filter, "Filter", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterShrink)) {
            query.put("Filter", request.filterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPools"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPoolsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resource pool list.</p>
     * 
     * @param request ListPoolsRequest
     * @return ListPoolsResponse
     */
    public ListPoolsResponse listPools(ListPoolsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPoolsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags that are bound to one or more Instant resources.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResult)) {
            query.put("MaxResult", request.maxResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags that are bound to one or more Instant resources.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Remove a custom image</p>
     * 
     * @param request RemoveImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveImageResponse
     */
    public RemoveImageResponse removeImageWithOptions(RemoveImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageType)) {
            query.put("ImageType", request.imageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveImage"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Remove a custom image</p>
     * 
     * @param request RemoveImageRequest
     * @return RemoveImageResponse
     */
    public RemoveImageResponse removeImage(RemoveImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeImageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Application cross-region synchronization</p>
     * 
     * @param tmpReq SynchronizeAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SynchronizeAppResponse
     */
    public SynchronizeAppResponse synchronizeAppWithOptions(SynchronizeAppRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SynchronizeAppShrinkRequest request = new SynchronizeAppShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.targetRegionIds)) {
            request.targetRegionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.targetRegionIds, "TargetRegionIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetRegionIdsShrink)) {
            query.put("TargetRegionIds", request.targetRegionIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SynchronizeApp"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SynchronizeAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Application cross-region synchronization</p>
     * 
     * @param request SynchronizeAppRequest
     * @return SynchronizeAppResponse
     */
    public SynchronizeAppResponse synchronizeApp(SynchronizeAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.synchronizeAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create and bind tags to Instant resource list</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create and bind tags to Instant resource list</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unbind tags from Instant resource list. If the tag is not bound to other resources, the tag is automatically deleted.</p>
     * 
     * @param request UnTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnTagResourcesResponse
     */
    public UnTagResourcesResponse unTagResourcesWithOptions(UnTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnTagResources"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnTagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unbind tags from Instant resource list. If the tag is not bound to other resources, the tag is automatically deleted.</p>
     * 
     * @param request UnTagResourcesRequest
     * @return UnTagResourcesResponse
     */
    public UnTagResourcesResponse unTagResources(UnTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adjust the resource scale of the execution plan or modify the execution status</p>
     * 
     * @param request UpdateActionPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateActionPlanResponse
     */
    public UpdateActionPlanResponse updateActionPlanWithOptions(UpdateActionPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionPlanId)) {
            query.put("ActionPlanId", request.actionPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desiredCapacity)) {
            query.put("DesiredCapacity", request.desiredCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intervalMinutes)) {
            query.put("IntervalMinutes", request.intervalMinutes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateActionPlan"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateActionPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adjust the resource scale of the execution plan or modify the execution status</p>
     * 
     * @param request UpdateActionPlanRequest
     * @return UpdateActionPlanResponse
     */
    public UpdateActionPlanResponse updateActionPlan(UpdateActionPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateActionPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update the resource pool configuration.</p>
     * 
     * @param tmpReq UpdatePoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePoolResponse
     */
    public UpdatePoolResponse updatePoolWithOptions(UpdatePoolRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdatePoolShrinkRequest request = new UpdatePoolShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceLimits)) {
            request.resourceLimitsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceLimits, "ResourceLimits", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.poolName)) {
            query.put("PoolName", request.poolName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceLimitsShrink)) {
            query.put("ResourceLimits", request.resourceLimitsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePool"),
            new TeaPair("version", "2023-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update the resource pool configuration.</p>
     * 
     * @param request UpdatePoolRequest
     * @return UpdatePoolResponse
     */
    public UpdatePoolResponse updatePool(UpdatePoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePoolWithOptions(request, runtime);
    }
}
