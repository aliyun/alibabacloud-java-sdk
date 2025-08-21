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
     * <p>添加托管侧用户自定义镜像</p>
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
     * <p>添加托管侧用户自定义镜像</p>
     * 
     * @param request AddImageRequest
     * @return AddImageResponse
     */
    public AddImageResponse addImage(AddImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addImageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建执行计划创建执行计划</p>
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
     * <b>summary</b> : 
     * <p>创建执行计划创建执行计划</p>
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
     * <p>提交任务</p>
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
     * <p>提交任务</p>
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
     * <p>创建资源池</p>
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
     * <p>创建资源池</p>
     * 
     * @param request CreatePoolRequest
     * @return CreatePoolResponse
     */
    public CreatePoolResponse createPool(CreatePoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除执行计划</p>
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
     * <b>summary</b> : 
     * <p>删除执行计划</p>
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
     * <p>删除作业</p>
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
     * <p>删除作业</p>
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
     * <p>删除资源池</p>
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
     * <p>删除资源池</p>
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
     * <p>查询作业性能数据</p>
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
     * <p>查询作业性能数据</p>
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
     * <p>查询作业即时监控项</p>
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
     * <p>查询作业即时监控项</p>
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
     * <p>查询执行计划详情</p>
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
     * <p>查询执行计划详情</p>
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
     * <p>查看应用版本列表</p>
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
     * <p>查看应用版本列表</p>
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
     * <p>查询托管侧镜像详情。</p>
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
     * <p>查询托管侧镜像详情。</p>
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
     * <p>查询作业详情</p>
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
     * <p>查询作业详情</p>
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
     * <p>查询队列详细信息</p>
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
     * <p>查询队列详细信息</p>
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
     * <p>查询执行计划的执行情况。</p>
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
     * <p>查询执行计划的执行情况。</p>
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
     * <p>查询执行计划列表</p>
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
     * <p>查询执行计划列表</p>
     * 
     * @param request ListActionPlansRequest
     * @return ListActionPlansResponse
     */
    public ListActionPlansResponse listActionPlans(ListActionPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listActionPlansWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询全局Executor信息</p>
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
     * <p>查询全局Executor信息</p>
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
     * <p>查看托管侧镜像列表</p>
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
     * <p>查看托管侧镜像列表</p>
     * 
     * @param request ListImagesRequest
     * @return ListImagesResponse
     */
    public ListImagesResponse listImages(ListImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listImagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询作业Executor信息</p>
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
     * <b>summary</b> : 
     * <p>查询作业Executor信息</p>
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
     * <p>查询作业列表</p>
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
     * <p>查询作业列表</p>
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
     * <p>查询资源池列表</p>
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
     * <p>查询资源池列表</p>
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
     * <p>查询一个或多个资源已经绑定的标签列表</p>
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
     * <p>查询一个或多个资源已经绑定的标签列表</p>
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
     * <p>移除托管侧镜像信息。</p>
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
     * <p>移除托管侧镜像信息。</p>
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
     * <p>应用跨地域同步</p>
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
     * <p>应用跨地域同步</p>
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
     * <p>为指定的资源列表统一创建并绑定标签</p>
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
     * <p>为指定的资源列表统一创建并绑定标签</p>
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
     * <p>为指定的ECS资源列表统一解绑标签</p>
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
     * <p>为指定的ECS资源列表统一解绑标签</p>
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
     * <p>更新执行计划</p>
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
     * <p>更新执行计划</p>
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
     * <p>更新资源池</p>
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
     * <p>更新资源池</p>
     * 
     * @param request UpdatePoolRequest
     * @return UpdatePoolResponse
     */
    public UpdatePoolResponse updatePool(UpdatePoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePoolWithOptions(request, runtime);
    }
}
