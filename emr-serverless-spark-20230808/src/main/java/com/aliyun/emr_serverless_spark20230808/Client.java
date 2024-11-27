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
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddMembersResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelJobRunResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSqlStatementResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobRunResponse());
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
     * <p>查询SessionCluster集群</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSessionClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询SessionCluster集群</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSqlStatementResponse());
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
     * <p>获取任务模板</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取任务模板</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantRoleToUsersResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobRunsResponse());
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
     * <p>Obtains the log content.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLogContentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the log content.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListReleaseVersionsResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSessionClustersResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkspaceQueuesResponse());
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
     * @param request ListWorkspacesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkspacesResponse
     */
    public ListWorkspacesResponse listWorkspacesWithOptions(ListWorkspacesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkspacesResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartJobRunResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartSessionClusterResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopSessionClusterResponse());
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new TerminateSqlStatementResponse());
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
}
