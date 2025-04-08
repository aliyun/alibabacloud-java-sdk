// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808;

import com.aliyun.tea.*;
import com.aliyun.emr_serverless_spark20230808.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("emr-serverless-spark", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Adds a RAM user or RAM role to a workspace as a member.</p>
     * 
     * @param request AddMembersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddMembersResponse
     */
    public AddMembersResponse addMembersWithOptions(AddMembersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberArns)) {
            body.put("memberArns", request.memberArns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddMembers"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/auth/members"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AddMembersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AddMembersResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Adds a RAM user or RAM role to a workspace as a member.</p>
     * 
     * @param request AddMembersRequest
     * @return AddMembersResponse
     */
    public AddMembersResponse addMembers(AddMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addMembersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Terminates a Spark job.</p>
     * 
     * @param request CancelJobRunRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelJobRunResponse
     */
    public CancelJobRunResponse cancelJobRunWithOptions(String workspaceId, String jobRunId, CancelJobRunRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelJobRun"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/jobRuns/" + com.aliyun.openapiutil.Client.getEncodeParam(jobRunId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CancelJobRunResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CancelJobRunResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Terminates a Spark job.</p>
     * 
     * @param request CancelJobRunRequest
     * @return CancelJobRunResponse
     */
    public CancelJobRunResponse cancelJobRun(String workspaceId, String jobRunId, CancelJobRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelJobRunWithOptions(workspaceId, jobRunId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a workflow.</p>
     * 
     * @param tmpReq CreateProcessDefinitionWithScheduleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProcessDefinitionWithScheduleResponse
     */
    public CreateProcessDefinitionWithScheduleResponse createProcessDefinitionWithScheduleWithOptions(String bizId, CreateProcessDefinitionWithScheduleRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateProcessDefinitionWithScheduleShrinkRequest request = new CreateProcessDefinitionWithScheduleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.globalParams)) {
            request.globalParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.globalParams, "globalParams", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.schedule)) {
            request.scheduleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.schedule, "schedule", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "tags", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskDefinitionJson)) {
            request.taskDefinitionJsonShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskDefinitionJson, "taskDefinitionJson", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskRelationJson)) {
            request.taskRelationJsonShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskRelationJson, "taskRelationJson", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertEmailAddress)) {
            query.put("alertEmailAddress", request.alertEmailAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionType)) {
            query.put("executionType", request.executionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalParamsShrink)) {
            query.put("globalParams", request.globalParamsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productNamespace)) {
            query.put("productNamespace", request.productNamespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publish)) {
            query.put("publish", request.publish);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceQueue)) {
            query.put("resourceQueue", request.resourceQueue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryTimes)) {
            query.put("retryTimes", request.retryTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runAs)) {
            query.put("runAs", request.runAs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleShrink)) {
            query.put("schedule", request.scheduleShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskDefinitionJsonShrink)) {
            query.put("taskDefinitionJson", request.taskDefinitionJsonShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskParallelism)) {
            query.put("taskParallelism", request.taskParallelism);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskRelationJsonShrink)) {
            query.put("taskRelationJson", request.taskRelationJsonShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProcessDefinitionWithSchedule"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dolphinscheduler/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(bizId) + "/process-definition"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProcessDefinitionWithScheduleResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateProcessDefinitionWithScheduleResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Creates a workflow.</p>
     * 
     * @param request CreateProcessDefinitionWithScheduleRequest
     * @return CreateProcessDefinitionWithScheduleResponse
     */
    public CreateProcessDefinitionWithScheduleResponse createProcessDefinitionWithSchedule(String bizId, CreateProcessDefinitionWithScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProcessDefinitionWithScheduleWithOptions(bizId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a session.</p>
     * 
     * @param request CreateSessionClusterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSessionClusterResponse
     */
    public CreateSessionClusterResponse createSessionClusterWithOptions(String workspaceId, CreateSessionClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationConfigs)) {
            body.put("applicationConfigs", request.applicationConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoStartConfiguration)) {
            body.put("autoStartConfiguration", request.autoStartConfiguration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoStopConfiguration)) {
            body.put("autoStopConfiguration", request.autoStopConfiguration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayReleaseVersion)) {
            body.put("displayReleaseVersion", request.displayReleaseVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            body.put("envId", request.envId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fusion)) {
            body.put("fusion", request.fusion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kind)) {
            body.put("kind", request.kind);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            body.put("queueName", request.queueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseVersion)) {
            body.put("releaseVersion", request.releaseVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSessionCluster"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/sessionClusters"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSessionClusterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateSessionClusterResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Creates a session.</p>
     * 
     * @param request CreateSessionClusterRequest
     * @return CreateSessionClusterResponse
     */
    public CreateSessionClusterResponse createSessionCluster(String workspaceId, CreateSessionClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSessionClusterWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an SQL query task.</p>
     * 
     * @param request CreateSqlStatementRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSqlStatementResponse
     */
    public CreateSqlStatementResponse createSqlStatementWithOptions(String workspaceId, CreateSqlStatementRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.codeContent)) {
            body.put("codeContent", request.codeContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultCatalog)) {
            body.put("defaultCatalog", request.defaultCatalog);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultDatabase)) {
            body.put("defaultDatabase", request.defaultDatabase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlComputeId)) {
            body.put("sqlComputeId", request.sqlComputeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSqlStatement"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/interactive/v1/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/statement"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSqlStatementResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateSqlStatementResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Creates an SQL query task.</p>
     * 
     * @param request CreateSqlStatementRequest
     * @return CreateSqlStatementResponse
     */
    public CreateSqlStatementResponse createSqlStatement(String workspaceId, CreateSqlStatementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSqlStatementWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a workspace.</p>
     * 
     * @param request CreateWorkspaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkspaceResponse
     */
    public CreateWorkspaceResponse createWorkspaceWithOptions(CreateWorkspaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            body.put("autoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewPeriod)) {
            body.put("autoRenewPeriod", request.autoRenewPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewPeriodUnit)) {
            body.put("autoRenewPeriodUnit", request.autoRenewPeriodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoStartSessionCluster)) {
            body.put("autoStartSessionCluster", request.autoStartSessionCluster);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dlfCatalogId)) {
            body.put("dlfCatalogId", request.dlfCatalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dlfType)) {
            body.put("dlfType", request.dlfType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            body.put("duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucket)) {
            body.put("ossBucket", request.ossBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentDurationUnit)) {
            body.put("paymentDurationUnit", request.paymentDurationUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            body.put("paymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRoleName)) {
            body.put("ramRoleName", request.ramRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseType)) {
            body.put("releaseType", request.releaseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSpec)) {
            body.put("resourceSpec", request.resourceSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceName)) {
            body.put("workspaceName", request.workspaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkspace"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkspaceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateWorkspaceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Creates a workspace.</p>
     * 
     * @param request CreateWorkspaceRequest
     * @return CreateWorkspaceResponse
     */
    public CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWorkspaceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of CU-hours consumed by a queue during a specified cycle.</p>
     * 
     * @param request GetCuHoursRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCuHoursResponse
     */
    public GetCuHoursResponse getCuHoursWithOptions(String workspaceId, String queue, GetCuHoursRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCuHours"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/metric/cuHours/" + com.aliyun.openapiutil.Client.getEncodeParam(queue) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetCuHoursResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetCuHoursResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of CU-hours consumed by a queue during a specified cycle.</p>
     * 
     * @param request GetCuHoursRequest
     * @return GetCuHoursResponse
     */
    public GetCuHoursResponse getCuHours(String workspaceId, String queue, GetCuHoursRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCuHoursWithOptions(workspaceId, queue, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains job analysis information on E-MapReduce (EMR) Doctor.</p>
     * 
     * @param request GetDoctorApplicationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDoctorApplicationResponse
     */
    public GetDoctorApplicationResponse getDoctorApplicationWithOptions(String workspaceId, String runId, GetDoctorApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.locale)) {
            query.put("locale", request.locale);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryTime)) {
            query.put("queryTime", request.queryTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorApplication"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/runs/" + com.aliyun.openapiutil.Client.getEncodeParam(runId) + "/action/getDoctorApplication"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorApplicationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetDoctorApplicationResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains job analysis information on E-MapReduce (EMR) Doctor.</p>
     * 
     * @param request GetDoctorApplicationRequest
     * @return GetDoctorApplicationResponse
     */
    public GetDoctorApplicationResponse getDoctorApplication(String workspaceId, String runId, GetDoctorApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDoctorApplicationWithOptions(workspaceId, runId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the job details.</p>
     * 
     * @param request GetJobRunRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobRunResponse
     */
    public GetJobRunResponse getJobRunWithOptions(String workspaceId, String jobRunId, GetJobRunRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobRun"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/jobRuns/" + com.aliyun.openapiutil.Client.getEncodeParam(jobRunId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobRunResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetJobRunResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the job details.</p>
     * 
     * @param request GetJobRunRequest
     * @return GetJobRunResponse
     */
    public GetJobRunResponse getJobRun(String workspaceId, String jobRunId, GetJobRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJobRunWithOptions(workspaceId, jobRunId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a session.</p>
     * 
     * @param request GetSessionClusterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSessionClusterResponse
     */
    public GetSessionClusterResponse getSessionClusterWithOptions(String workspaceId, String sessionClusterId, GetSessionClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSessionCluster"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/sessionClusters/" + com.aliyun.openapiutil.Client.getEncodeParam(sessionClusterId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetSessionClusterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetSessionClusterResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a session.</p>
     * 
     * @param request GetSessionClusterRequest
     * @return GetSessionClusterResponse
     */
    public GetSessionClusterResponse getSessionCluster(String workspaceId, String sessionClusterId, GetSessionClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSessionClusterWithOptions(workspaceId, sessionClusterId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of an SQL query task.</p>
     * 
     * @param request GetSqlStatementRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSqlStatementResponse
     */
    public GetSqlStatementResponse getSqlStatementWithOptions(String workspaceId, String statementId, GetSqlStatementRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSqlStatement"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/interactive/v1/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/statement/" + com.aliyun.openapiutil.Client.getEncodeParam(statementId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetSqlStatementResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetSqlStatementResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of an SQL query task.</p>
     * 
     * @param request GetSqlStatementRequest
     * @return GetSqlStatementResponse
     */
    public GetSqlStatementResponse getSqlStatement(String workspaceId, String statementId, GetSqlStatementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSqlStatementWithOptions(workspaceId, statementId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries task templates.</p>
     * 
     * @param request GetTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTemplateResponse
     */
    public GetTemplateResponse getTemplateWithOptions(String workspaceBizId, GetTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("templateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplate"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/interactive/v1/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceBizId) + "/template"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplateResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetTemplateResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries task templates.</p>
     * 
     * @param request GetTemplateRequest
     * @return GetTemplateResponse
     */
    public GetTemplateResponse getTemplate(String workspaceBizId, GetTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTemplateWithOptions(workspaceBizId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Assigns a specified role to users.</p>
     * 
     * @param request GrantRoleToUsersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantRoleToUsersResponse
     */
    public GrantRoleToUsersResponse grantRoleToUsersWithOptions(GrantRoleToUsersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleArn)) {
            body.put("roleArn", request.roleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userArns)) {
            body.put("userArns", request.userArns);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantRoleToUsers"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/auth/roles/grant"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GrantRoleToUsersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GrantRoleToUsersResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Assigns a specified role to users.</p>
     * 
     * @param request GrantRoleToUsersRequest
     * @return GrantRoleToUsersResponse
     */
    public GrantRoleToUsersResponse grantRoleToUsers(GrantRoleToUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.grantRoleToUsersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of Spark jobs.</p>
     * 
     * @param tmpReq ListJobRunsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobRunsResponse
     */
    public ListJobRunsResponse listJobRunsWithOptions(String workspaceId, ListJobRunsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListJobRunsShrinkRequest request = new ListJobRunsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.endTime)) {
            request.endTimeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.endTime, "endTime", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.startTime)) {
            request.startTimeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.startTime, "startTime", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.states)) {
            request.statesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.states, "states", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creator)) {
            query.put("creator", request.creator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimeShrink)) {
            query.put("endTime", request.endTimeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobRunDeploymentId)) {
            query.put("jobRunDeploymentId", request.jobRunDeploymentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobRunId)) {
            query.put("jobRunId", request.jobRunId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minDuration)) {
            query.put("minDuration", request.minDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceQueueId)) {
            query.put("resourceQueueId", request.resourceQueueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimeShrink)) {
            query.put("startTime", request.startTimeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statesShrink)) {
            query.put("states", request.statesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobRuns"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/jobRuns"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobRunsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListJobRunsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of Spark jobs.</p>
     * 
     * @param request ListJobRunsRequest
     * @return ListJobRunsResponse
     */
    public ListJobRunsResponse listJobRuns(String workspaceId, ListJobRunsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listJobRunsWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the applications that are submitted by using a Kyuubi gateway.</p>
     * 
     * @param tmpReq ListKyuubiSparkApplicationsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListKyuubiSparkApplicationsResponse
     */
    public ListKyuubiSparkApplicationsResponse listKyuubiSparkApplicationsWithOptions(String workspaceId, String kyuubiServiceId, ListKyuubiSparkApplicationsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListKyuubiSparkApplicationsShrinkRequest request = new ListKyuubiSparkApplicationsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.startTime)) {
            request.startTimeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.startTime, "startTime", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("applicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("applicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimeShrink)) {
            query.put("startTime", request.startTimeShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListKyuubiSparkApplications"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/kyuubi/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(kyuubiServiceId) + "/applications"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListKyuubiSparkApplicationsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListKyuubiSparkApplicationsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the applications that are submitted by using a Kyuubi gateway.</p>
     * 
     * @param request ListKyuubiSparkApplicationsRequest
     * @return ListKyuubiSparkApplicationsResponse
     */
    public ListKyuubiSparkApplicationsResponse listKyuubiSparkApplications(String workspaceId, String kyuubiServiceId, ListKyuubiSparkApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listKyuubiSparkApplicationsWithOptions(workspaceId, kyuubiServiceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Log Content</p>
     * 
     * @param request ListLogContentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLogContentsResponse
     */
    public ListLogContentsResponse listLogContentsWithOptions(String workspaceId, ListLogContentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.length)) {
            query.put("length", request.length);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLogContents"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/action/listLogContents"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListLogContentsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListLogContentsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Get Log Content</p>
     * 
     * @param request ListLogContentsRequest
     * @return ListLogContentsResponse
     */
    public ListLogContentsResponse listLogContents(String workspaceId, ListLogContentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLogContentsWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of published versions of E-MapReduce (EMR) Serverless Spark.</p>
     * 
     * @param request ListReleaseVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListReleaseVersionsResponse
     */
    public ListReleaseVersionsResponse listReleaseVersionsWithOptions(ListReleaseVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseType)) {
            query.put("releaseType", request.releaseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseVersion)) {
            query.put("releaseVersion", request.releaseVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseVersionStatus)) {
            query.put("releaseVersionStatus", request.releaseVersionStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceFilter)) {
            query.put("serviceFilter", request.serviceFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListReleaseVersions"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/releaseVersions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListReleaseVersionsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListReleaseVersionsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of published versions of E-MapReduce (EMR) Serverless Spark.</p>
     * 
     * @param request ListReleaseVersionsRequest
     * @return ListReleaseVersionsResponse
     */
    public ListReleaseVersionsResponse listReleaseVersions(ListReleaseVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listReleaseVersionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of sessions.</p>
     * 
     * @param request ListSessionClustersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSessionClustersResponse
     */
    public ListSessionClustersResponse listSessionClustersWithOptions(String workspaceId, ListSessionClustersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.kind)) {
            query.put("kind", request.kind);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("queueName", request.queueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionClusterId)) {
            query.put("sessionClusterId", request.sessionClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSessionClusters"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/sessionClusters"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListSessionClustersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListSessionClustersResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of sessions.</p>
     * 
     * @param request ListSessionClustersRequest
     * @return ListSessionClustersResponse
     */
    public ListSessionClustersResponse listSessionClusters(String workspaceId, ListSessionClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSessionClustersWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of queues in a Spark workspace.</p>
     * 
     * @param request ListWorkspaceQueuesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkspaceQueuesResponse
     */
    public ListWorkspaceQueuesResponse listWorkspaceQueuesWithOptions(String workspaceId, ListWorkspaceQueuesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            query.put("environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkspaceQueues"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/queues"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkspaceQueuesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListWorkspaceQueuesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of queues in a Spark workspace.</p>
     * 
     * @param request ListWorkspaceQueuesRequest
     * @return ListWorkspaceQueuesResponse
     */
    public ListWorkspaceQueuesResponse listWorkspaceQueues(String workspaceId, ListWorkspaceQueuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkspaceQueuesWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of workspaces.</p>
     * 
     * @param tmpReq ListWorkspacesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkspacesResponse
     */
    public ListWorkspacesResponse listWorkspacesWithOptions(ListWorkspacesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListWorkspacesShrinkRequest request = new ListWorkspacesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("state", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("tag", request.tagShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkspaces"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkspacesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListWorkspacesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of workspaces.</p>
     * 
     * @param request ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    public ListWorkspacesResponse listWorkspaces(ListWorkspacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkspacesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a Spark job.</p>
     * 
     * @param request StartJobRunRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartJobRunResponse
     */
    public StartJobRunResponse startJobRunWithOptions(String workspaceId, StartJobRunRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeType)) {
            body.put("codeType", request.codeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configurationOverrides)) {
            body.put("configurationOverrides", request.configurationOverrides);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayReleaseVersion)) {
            body.put("displayReleaseVersion", request.displayReleaseVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionTimeoutSeconds)) {
            body.put("executionTimeoutSeconds", request.executionTimeoutSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fusion)) {
            body.put("fusion", request.fusion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobDriver)) {
            body.put("jobDriver", request.jobDriver);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("jobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseVersion)) {
            body.put("releaseVersion", request.releaseVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceQueueId)) {
            body.put("resourceQueueId", request.resourceQueueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartJobRun"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/jobRuns"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StartJobRunResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StartJobRunResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Starts a Spark job.</p>
     * 
     * @param request StartJobRunRequest
     * @return StartJobRunResponse
     */
    public StartJobRunResponse startJobRun(String workspaceId, StartJobRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startJobRunWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Manually runs a workflow.</p>
     * 
     * @param request StartProcessInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartProcessInstanceResponse
     */
    public StartProcessInstanceResponse startProcessInstanceWithOptions(String bizId, StartProcessInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            query.put("action", request.action);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comments)) {
            query.put("comments", request.comments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isProd)) {
            query.put("isProd", request.isProd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processDefinitionCode)) {
            query.put("processDefinitionCode", request.processDefinitionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productNamespace)) {
            query.put("productNamespace", request.productNamespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeQueue)) {
            query.put("runtimeQueue", request.runtimeQueue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionHashCode)) {
            query.put("versionHashCode", request.versionHashCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionNumber)) {
            query.put("versionNumber", request.versionNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartProcessInstance"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dolphinscheduler/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(bizId) + "/executors/start-process-instance"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StartProcessInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StartProcessInstanceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Manually runs a workflow.</p>
     * 
     * @param request StartProcessInstanceRequest
     * @return StartProcessInstanceResponse
     */
    public StartProcessInstanceResponse startProcessInstance(String bizId, StartProcessInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startProcessInstanceWithOptions(bizId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a session.</p>
     * 
     * @param request StartSessionClusterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartSessionClusterResponse
     */
    public StartSessionClusterResponse startSessionClusterWithOptions(String workspaceId, StartSessionClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            body.put("queueName", request.queueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionClusterId)) {
            body.put("sessionClusterId", request.sessionClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartSessionCluster"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/sessionClusters/action/startSessionCluster"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StartSessionClusterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StartSessionClusterResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Starts a session.</p>
     * 
     * @param request StartSessionClusterRequest
     * @return StartSessionClusterResponse
     */
    public StartSessionClusterResponse startSessionCluster(String workspaceId, StartSessionClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startSessionClusterWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a session.</p>
     * 
     * @param request StopSessionClusterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopSessionClusterResponse
     */
    public StopSessionClusterResponse stopSessionClusterWithOptions(String workspaceId, StopSessionClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            body.put("queueName", request.queueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionClusterId)) {
            body.put("sessionClusterId", request.sessionClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopSessionCluster"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/sessionClusters/action/stopSessionCluster"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StopSessionClusterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StopSessionClusterResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Stops a session.</p>
     * 
     * @param request StopSessionClusterRequest
     * @return StopSessionClusterResponse
     */
    public StopSessionClusterResponse stopSessionCluster(String workspaceId, StopSessionClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopSessionClusterWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Terminates an SQL query task.</p>
     * 
     * @param request TerminateSqlStatementRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TerminateSqlStatementResponse
     */
    public TerminateSqlStatementResponse terminateSqlStatementWithOptions(String workspaceId, String statementId, TerminateSqlStatementRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TerminateSqlStatement"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/interactive/v1/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/statement/" + com.aliyun.openapiutil.Client.getEncodeParam(statementId) + "/terminate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new TerminateSqlStatementResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new TerminateSqlStatementResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Terminates an SQL query task.</p>
     * 
     * @param request TerminateSqlStatementRequest
     * @return TerminateSqlStatementResponse
     */
    public TerminateSqlStatementResponse terminateSqlStatement(String workspaceId, String statementId, TerminateSqlStatementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.terminateSqlStatementWithOptions(workspaceId, statementId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the workflow and time-based scheduling configurations.</p>
     * 
     * @param tmpReq UpdateProcessDefinitionWithScheduleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProcessDefinitionWithScheduleResponse
     */
    public UpdateProcessDefinitionWithScheduleResponse updateProcessDefinitionWithScheduleWithOptions(String bizId, String code, UpdateProcessDefinitionWithScheduleRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateProcessDefinitionWithScheduleShrinkRequest request = new UpdateProcessDefinitionWithScheduleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.globalParams)) {
            request.globalParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.globalParams, "globalParams", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.schedule)) {
            request.scheduleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.schedule, "schedule", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "tags", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskDefinitionJson)) {
            request.taskDefinitionJsonShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskDefinitionJson, "taskDefinitionJson", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskRelationJson)) {
            request.taskRelationJsonShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskRelationJson, "taskRelationJson", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertEmailAddress)) {
            query.put("alertEmailAddress", request.alertEmailAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionType)) {
            query.put("executionType", request.executionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalParamsShrink)) {
            query.put("globalParams", request.globalParamsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productNamespace)) {
            query.put("productNamespace", request.productNamespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publish)) {
            query.put("publish", request.publish);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseState)) {
            query.put("releaseState", request.releaseState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceQueue)) {
            query.put("resourceQueue", request.resourceQueue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryTimes)) {
            query.put("retryTimes", request.retryTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runAs)) {
            query.put("runAs", request.runAs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleShrink)) {
            query.put("schedule", request.scheduleShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskDefinitionJsonShrink)) {
            query.put("taskDefinitionJson", request.taskDefinitionJsonShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskParallelism)) {
            query.put("taskParallelism", request.taskParallelism);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskRelationJsonShrink)) {
            query.put("taskRelationJson", request.taskRelationJsonShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProcessDefinitionWithSchedule"),
            new TeaPair("version", "2023-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dolphinscheduler/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(bizId) + "/process-definition/" + com.aliyun.openapiutil.Client.getEncodeParam(code) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProcessDefinitionWithScheduleResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateProcessDefinitionWithScheduleResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Updates the workflow and time-based scheduling configurations.</p>
     * 
     * @param request UpdateProcessDefinitionWithScheduleRequest
     * @return UpdateProcessDefinitionWithScheduleResponse
     */
    public UpdateProcessDefinitionWithScheduleResponse updateProcessDefinitionWithSchedule(String bizId, String code, UpdateProcessDefinitionWithScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProcessDefinitionWithScheduleWithOptions(bizId, code, request, headers, runtime);
    }
}
