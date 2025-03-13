// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625;

import com.aliyun.tea.*;
import com.aliyun.devops20210625.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("devops", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>添加组成员</p>
     * 
     * @param request AddGroupMemberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddGroupMemberResponse
     */
    public AddGroupMemberResponse addGroupMemberWithOptions(String groupId, AddGroupMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessLevel)) {
            body.put("accessLevel", request.accessLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunPks)) {
            body.put("aliyunPks", request.aliyunPks);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddGroupMember"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/members/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AddGroupMemberResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AddGroupMemberResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>添加组成员</p>
     * 
     * @param request AddGroupMemberRequest
     * @return AddGroupMemberResponse
     */
    public AddGroupMemberResponse addGroupMember(String groupId, AddGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addGroupMemberWithOptions(groupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加流水线关联</p>
     * 
     * @param request AddPipelineRelationsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddPipelineRelationsResponse
     */
    public AddPipelineRelationsResponse addPipelineRelationsWithOptions(String organizationId, String pipelineId, AddPipelineRelationsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.relObjectIds)) {
            query.put("relObjectIds", request.relObjectIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relObjectType)) {
            query.put("relObjectType", request.relObjectType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddPipelineRelations"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineId) + "/pipelineRelations"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AddPipelineRelationsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AddPipelineRelationsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>添加流水线关联</p>
     * 
     * @param request AddPipelineRelationsRequest
     * @return AddPipelineRelationsResponse
     */
    public AddPipelineRelationsResponse addPipelineRelations(String organizationId, String pipelineId, AddPipelineRelationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addPipelineRelationsWithOptions(organizationId, pipelineId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加代码库成员</p>
     * 
     * @param request AddRepositoryMemberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddRepositoryMemberResponse
     */
    public AddRepositoryMemberResponse addRepositoryMemberWithOptions(String repositoryId, AddRepositoryMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessLevel)) {
            body.put("accessLevel", request.accessLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunPks)) {
            body.put("aliyunPks", request.aliyunPks);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddRepositoryMember"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/members"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AddRepositoryMemberResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AddRepositoryMemberResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>添加代码库成员</p>
     * 
     * @param request AddRepositoryMemberRequest
     * @return AddRepositoryMemberResponse
     */
    public AddRepositoryMemberResponse addRepositoryMember(String repositoryId, AddRepositoryMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addRepositoryMemberWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加代码库Webhook</p>
     * 
     * @param request AddWebhookRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddWebhookResponse
     */
    public AddWebhookResponse addWebhookWithOptions(String repositoryId, AddWebhookRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSslVerification)) {
            body.put("enableSslVerification", request.enableSslVerification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mergeRequestsEvents)) {
            body.put("mergeRequestsEvents", request.mergeRequestsEvents);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noteEvents)) {
            body.put("noteEvents", request.noteEvents);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushEvents)) {
            body.put("pushEvents", request.pushEvents);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretToken)) {
            body.put("secretToken", request.secretToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagPushEvents)) {
            body.put("tagPushEvents", request.tagPushEvents);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            body.put("url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddWebhook"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/webhooks/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AddWebhookResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AddWebhookResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>添加代码库Webhook</p>
     * 
     * @param request AddWebhookRequest
     * @return AddWebhookResponse
     */
    public AddWebhookResponse addWebhook(String repositoryId, AddWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addWebhookWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消执行研发阶段流水线</p>
     * 
     * @param request CancelExecutionReleaseStageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelExecutionReleaseStageResponse
     */
    public CancelExecutionReleaseStageResponse cancelExecutionReleaseStageWithOptions(String appName, String releaseWorkflowSn, String releaseStageSn, String executionNumber, CancelExecutionReleaseStageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelExecutionReleaseStage"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/appstack/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/releaseWorkflows/" + com.aliyun.openapiutil.Client.getEncodeParam(releaseWorkflowSn) + "/releaseStages/" + com.aliyun.openapiutil.Client.getEncodeParam(releaseStageSn) + "/executions/" + com.aliyun.openapiutil.Client.getEncodeParam(executionNumber) + "%3Acancel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CancelExecutionReleaseStageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CancelExecutionReleaseStageResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>取消执行研发阶段流水线</p>
     * 
     * @param request CancelExecutionReleaseStageRequest
     * @return CancelExecutionReleaseStageResponse
     */
    public CancelExecutionReleaseStageResponse cancelExecutionReleaseStage(String appName, String releaseWorkflowSn, String releaseStageSn, String executionNumber, CancelExecutionReleaseStageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelExecutionReleaseStageWithOptions(appName, releaseWorkflowSn, releaseStageSn, executionNumber, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>关闭代码评审</p>
     * 
     * @param request CloseMergeRequestRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloseMergeRequestResponse
     */
    public CloseMergeRequestResponse closeMergeRequestWithOptions(String repositoryId, String localId, CloseMergeRequestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseMergeRequest"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/merge_requests/" + com.aliyun.openapiutil.Client.getEncodeParam(localId) + "/close"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CloseMergeRequestResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CloseMergeRequestResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>关闭代码评审</p>
     * 
     * @param request CloseMergeRequestRequest
     * @return CloseMergeRequestResponse
     */
    public CloseMergeRequestResponse closeMergeRequest(String repositoryId, String localId, CloseMergeRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeMergeRequestWithOptions(repositoryId, localId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加应用成员</p>
     * 
     * @param request CreateAppMembersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppMembersResponse
     */
    public CreateAppMembersResponse createAppMembersWithOptions(String appName, CreateAppMembersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.playerList)) {
            body.put("playerList", request.playerList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleNames)) {
            body.put("roleNames", request.roleNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppMembers"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/appstack/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/members"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "string")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppMembersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateAppMembersResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>添加应用成员</p>
     * 
     * @param request CreateAppMembersRequest
     * @return CreateAppMembersResponse
     */
    public CreateAppMembersResponse createAppMembers(String appName, CreateAppMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppMembersWithOptions(appName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建分支</p>
     * 
     * @param request CreateBranchRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBranchResponse
     */
    public CreateBranchResponse createBranchWithOptions(String repositoryId, CreateBranchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            body.put("branchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ref)) {
            body.put("ref", request.ref);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBranch"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/branches"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBranchResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateBranchResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建分支</p>
     * 
     * @param request CreateBranchRequest
     * @return CreateBranchResponse
     */
    public CreateBranchResponse createBranch(String repositoryId, CreateBranchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBranchWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建变更</p>
     * 
     * @param request CreateChangeRequestRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateChangeRequestResponse
     */
    public CreateChangeRequestResponse createChangeRequestWithOptions(String appName, CreateChangeRequestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appCodeRepoSn)) {
            body.put("appCodeRepoSn", request.appCodeRepoSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoDeleteBranchWhenEnd)) {
            body.put("autoDeleteBranchWhenEnd", request.autoDeleteBranchWhenEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            body.put("branchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createBranch)) {
            body.put("createBranch", request.createBranch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccountId)) {
            body.put("ownerAccountId", request.ownerAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            body.put("ownerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateChangeRequest"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/appstack/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/changeRequests"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateChangeRequestResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateChangeRequestResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建变更</p>
     * 
     * @param request CreateChangeRequestRequest
     * @return CreateChangeRequestResponse
     */
    public CreateChangeRequestResponse createChangeRequest(String appName, CreateChangeRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createChangeRequestWithOptions(appName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加检查运行记录</p>
     * 
     * @param request CreateCheckRunRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCheckRunResponse
     */
    public CreateCheckRunResponse createCheckRunWithOptions(CreateCheckRunRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repositoryIdentity)) {
            query.put("repositoryIdentity", request.repositoryIdentity);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.annotations)) {
            body.put("annotations", request.annotations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.completedAt)) {
            body.put("completedAt", request.completedAt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conclusion)) {
            body.put("conclusion", request.conclusion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detailsUrl)) {
            body.put("detailsUrl", request.detailsUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalId)) {
            body.put("externalId", request.externalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.headSha)) {
            body.put("headSha", request.headSha);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            body.put("output", request.output);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startedAt)) {
            body.put("startedAt", request.startedAt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCheckRun"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/check_runs/create_check_run"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCheckRunResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateCheckRunResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>添加检查运行记录</p>
     * 
     * @param request CreateCheckRunRequest
     * @return CreateCheckRunResponse
     */
    public CreateCheckRunResponse createCheckRun(CreateCheckRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCheckRunWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建评论</p>
     * 
     * @param request CreateCommentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCommentResponse
     */
    public CreateCommentResponse createCommentWithOptions(CreateCommentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localId)) {
            query.put("localId", request.localId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repositoryIdentity)) {
            query.put("repositoryIdentity", request.repositoryIdentity);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commentType)) {
            body.put("commentType", request.commentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.draft)) {
            body.put("draft", request.draft);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            body.put("filePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromPachSetBizId)) {
            body.put("fromPachSetBizId", request.fromPachSetBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lineNumber)) {
            body.put("lineNumber", request.lineNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentCommentBizId)) {
            body.put("parentCommentBizId", request.parentCommentBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.patchSetBizId)) {
            body.put("patchSetBizId", request.patchSetBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resolved)) {
            body.put("resolved", request.resolved);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toPatchSetBizId)) {
            body.put("toPatchSetBizId", request.toPatchSetBizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateComment"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/code_reviews/comments/create_comment"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCommentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateCommentResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建评论</p>
     * 
     * @param request CreateCommentRequest
     * @return CreateCommentResponse
     */
    public CreateCommentResponse createComment(CreateCommentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCommentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建提交状态记录</p>
     * 
     * @param request CreateCommitStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCommitStatusResponse
     */
    public CreateCommitStatusResponse createCommitStatusWithOptions(CreateCommitStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repositoryIdentity)) {
            query.put("repositoryIdentity", request.repositoryIdentity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sha)) {
            query.put("sha", request.sha);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.context)) {
            body.put("context", request.context);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            body.put("state", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUrl)) {
            body.put("targetUrl", request.targetUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCommitStatus"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/repository/commit_statuses/create_commit_status"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCommitStatusResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateCommitStatusResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建提交状态记录</p>
     * 
     * @param request CreateCommitStatusRequest
     * @return CreateCommitStatusResponse
     */
    public CreateCommitStatusResponse createCommitStatus(CreateCommitStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCommitStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>单提交变更多个文件</p>
     * 
     * @param request CreateCommitWithMultipleFilesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCommitWithMultipleFilesResponse
     */
    public CreateCommitWithMultipleFilesResponse createCommitWithMultipleFilesWithOptions(CreateCommitWithMultipleFilesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repositoryIdentity)) {
            query.put("repositoryIdentity", request.repositoryIdentity);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actions)) {
            body.put("actions", request.actions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.branch)) {
            body.put("branch", request.branch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commitMessage)) {
            body.put("commitMessage", request.commitMessage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCommitWithMultipleFiles"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/repository/commits/files"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCommitWithMultipleFilesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateCommitWithMultipleFilesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>单提交变更多个文件</p>
     * 
     * @param request CreateCommitWithMultipleFilesRequest
     * @return CreateCommitWithMultipleFilesResponse
     */
    public CreateCommitWithMultipleFilesResponse createCommitWithMultipleFiles(CreateCommitWithMultipleFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCommitWithMultipleFilesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建部署密钥</p>
     * 
     * @param request CreateDeployKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDeployKeyResponse
     */
    public CreateDeployKeyResponse createDeployKeyWithOptions(String repositoryId, CreateDeployKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            body.put("key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDeployKey"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/keys/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeployKeyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateDeployKeyResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建部署密钥</p>
     * 
     * @param request CreateDeployKeyRequest
     * @return CreateDeployKeyResponse
     */
    public CreateDeployKeyResponse createDeployKey(String repositoryId, CreateDeployKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDeployKeyWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建文件</p>
     * 
     * @param request CreateFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFileResponse
     */
    public CreateFileResponse createFileWithOptions(String repositoryId, CreateFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            body.put("branchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commitMessage)) {
            body.put("commitMessage", request.commitMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encoding)) {
            body.put("encoding", request.encoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            body.put("filePath", request.filePath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFile"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/files"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFileResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateFileResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建文件</p>
     * 
     * @param request CreateFileRequest
     * @return CreateFileResponse
     */
    public CreateFileResponse createFile(String repositoryId, CreateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFileWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建标签</p>
     * 
     * @param request CreateFlowTagRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFlowTagResponse
     */
    public CreateFlowTagResponse createFlowTagWithOptions(String organizationId, CreateFlowTagRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.color)) {
            query.put("color", request.color);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowTagGroupId)) {
            query.put("flowTagGroupId", request.flowTagGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFlowTag"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/flow/tags"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlowTagResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateFlowTagResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建标签</p>
     * 
     * @param request CreateFlowTagRequest
     * @return CreateFlowTagResponse
     */
    public CreateFlowTagResponse createFlowTag(String organizationId, CreateFlowTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFlowTagWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建标签分类</p>
     * 
     * @param request CreateFlowTagGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFlowTagGroupResponse
     */
    public CreateFlowTagGroupResponse createFlowTagGroupWithOptions(String organizationId, CreateFlowTagGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFlowTagGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/flow/tagGroups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlowTagGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateFlowTagGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建标签分类</p>
     * 
     * @param request CreateFlowTagGroupRequest
     * @return CreateFlowTagGroupResponse
     */
    public CreateFlowTagGroupResponse createFlowTagGroup(String organizationId, CreateFlowTagGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFlowTagGroupWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建主机组</p>
     * 
     * @param request CreateHostGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHostGroupResponse
     */
    public CreateHostGroupResponse createHostGroupWithOptions(String organizationId, CreateHostGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunRegion)) {
            body.put("aliyunRegion", request.aliyunRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsLabelKey)) {
            body.put("ecsLabelKey", request.ecsLabelKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsLabelValue)) {
            body.put("ecsLabelValue", request.ecsLabelValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsType)) {
            body.put("ecsType", request.ecsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            body.put("envId", request.envId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.machineInfos)) {
            body.put("machineInfos", request.machineInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceConnectionId)) {
            body.put("serviceConnectionId", request.serviceConnectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagIds)) {
            body.put("tagIds", request.tagIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHostGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/hostGroups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHostGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateHostGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建主机组</p>
     * 
     * @param request CreateHostGroupRequest
     * @return CreateHostGroupResponse
     */
    public CreateHostGroupResponse createHostGroup(String organizationId, CreateHostGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createHostGroupWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建代码评审</p>
     * 
     * @param request CreateMergeRequestRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMergeRequestResponse
     */
    public CreateMergeRequestResponse createMergeRequestWithOptions(String repositoryId, CreateMergeRequestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createFrom)) {
            body.put("createFrom", request.createFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reviewerIds)) {
            body.put("reviewerIds", request.reviewerIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceBranch)) {
            body.put("sourceBranch", request.sourceBranch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceProjectId)) {
            body.put("sourceProjectId", request.sourceProjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetBranch)) {
            body.put("targetBranch", request.targetBranch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetProjectId)) {
            body.put("targetProjectId", request.targetProjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workItemIds)) {
            body.put("workItemIds", request.workItemIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMergeRequest"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/merge_requests"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMergeRequestResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateMergeRequestResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建代码评审</p>
     * 
     * @param request CreateMergeRequestRequest
     * @return CreateMergeRequestResponse
     */
    public CreateMergeRequestResponse createMergeRequest(String repositoryId, CreateMergeRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMergeRequestWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建OAuth令牌</p>
     * 
     * @param request CreateOAuthTokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOAuthTokenResponse
     */
    public CreateOAuthTokenResponse createOAuthTokenWithOptions(CreateOAuthTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("clientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSecret)) {
            body.put("clientSecret", request.clientSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantType)) {
            body.put("grantType", request.grantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.login)) {
            body.put("login", request.login);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            body.put("scope", request.scope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOAuthToken"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/login/oauth/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOAuthTokenResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateOAuthTokenResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建OAuth令牌</p>
     * 
     * @param request CreateOAuthTokenRequest
     * @return CreateOAuthTokenResponse
     */
    public CreateOAuthTokenResponse createOAuthToken(CreateOAuthTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOAuthTokenWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建流水线。</p>
     * 
     * @param request CreatePipelineRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePipelineResponse
     */
    public CreatePipelineResponse createPipelineWithOptions(String organizationId, CreatePipelineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePipeline"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelines"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePipelineResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreatePipelineResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建流水线。</p>
     * 
     * @param request CreatePipelineRequest
     * @return CreatePipelineResponse
     */
    public CreatePipelineResponse createPipeline(String organizationId, CreatePipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPipelineWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建流水线分组</p>
     * 
     * @param request CreatePipelineGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePipelineGroupResponse
     */
    public CreatePipelineGroupResponse createPipelineGroupWithOptions(String organizationId, CreatePipelineGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePipelineGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelineGroups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePipelineGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreatePipelineGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建流水线分组</p>
     * 
     * @param request CreatePipelineGroupRequest
     * @return CreatePipelineGroupResponse
     */
    public CreatePipelineGroupResponse createPipelineGroup(String organizationId, CreatePipelineGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPipelineGroupWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建项目</p>
     * 
     * @param request CreateProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProjectWithOptions(String organizationId, CreateProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customCode)) {
            body.put("customCode", request.customCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            body.put("scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateIdentifier)) {
            body.put("templateIdentifier", request.templateIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProject"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/projects/createProject"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateProjectResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建项目</p>
     * 
     * @param request CreateProjectRequest
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProject(String organizationId, CreateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProjectWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建代码库Label</p>
     * 
     * @param request CreateProjectLabelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProjectLabelResponse
     */
    public CreateProjectLabelResponse createProjectLabelWithOptions(CreateProjectLabelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repositoryIdentity)) {
            query.put("repositoryIdentity", request.repositoryIdentity);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.color)) {
            body.put("color", request.color);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProjectLabel"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/labels"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectLabelResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateProjectLabelResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建代码库Label</p>
     * 
     * @param request CreateProjectLabelRequest
     * @return CreateProjectLabelResponse
     */
    public CreateProjectLabelResponse createProjectLabel(CreateProjectLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProjectLabelWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建保护分支</p>
     * 
     * @param request CreateProtectdBranchRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProtectdBranchResponse
     */
    public CreateProtectdBranchResponse createProtectdBranchWithOptions(String repositoryId, CreateProtectdBranchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowMergeRoles)) {
            body.put("allowMergeRoles", request.allowMergeRoles);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowMergeUserIds)) {
            body.put("allowMergeUserIds", request.allowMergeUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowPushRoles)) {
            body.put("allowPushRoles", request.allowPushRoles);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowPushUserIds)) {
            body.put("allowPushUserIds", request.allowPushUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.branch)) {
            body.put("branch", request.branch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mergeRequestSetting)) {
            body.put("mergeRequestSetting", request.mergeRequestSetting);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.testSettingDTO)) {
            body.put("testSettingDTO", request.testSettingDTO);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProtectdBranch"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/protect_branches"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProtectdBranchResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateProtectdBranchResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建保护分支</p>
     * 
     * @param request CreateProtectdBranchRequest
     * @return CreateProtectdBranchResponse
     */
    public CreateProtectdBranchResponse createProtectdBranch(String repositoryId, CreateProtectdBranchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProtectdBranchWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建推送规则</p>
     * 
     * @param request CreatePushRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePushRuleResponse
     */
    public CreatePushRuleResponse createPushRuleWithOptions(String repositoryId, CreatePushRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleInfos)) {
            body.put("ruleInfos", request.ruleInfos);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePushRule"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/push_rule"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePushRuleResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreatePushRuleResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建推送规则</p>
     * 
     * @param request CreatePushRuleRequest
     * @return CreatePushRuleResponse
     */
    public CreatePushRuleResponse createPushRule(String repositoryId, CreatePushRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPushRuleWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建(导入)代码库</p>
     * 
     * @param request CreateRepositoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRepositoryResponse
     */
    public CreateRepositoryResponse createRepositoryWithOptions(CreateRepositoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createParentPath)) {
            query.put("createParentPath", request.createParentPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sync)) {
            query.put("sync", request.sync);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.avatarUrl)) {
            body.put("avatarUrl", request.avatarUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gitignoreType)) {
            body.put("gitignoreType", request.gitignoreType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.importAccount)) {
            body.put("importAccount", request.importAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.importDemoProject)) {
            body.put("importDemoProject", request.importDemoProject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.importRepoType)) {
            body.put("importRepoType", request.importRepoType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.importToken)) {
            body.put("importToken", request.importToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.importTokenEncrypted)) {
            body.put("importTokenEncrypted", request.importTokenEncrypted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.importUrl)) {
            body.put("importUrl", request.importUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initStandardService)) {
            body.put("initStandardService", request.initStandardService);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isCryptoEnabled)) {
            body.put("isCryptoEnabled", request.isCryptoEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localImportUrl)) {
            body.put("localImportUrl", request.localImportUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            body.put("namespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            body.put("path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.readmeType)) {
            body.put("readmeType", request.readmeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibilityLevel)) {
            body.put("visibilityLevel", request.visibilityLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRepository"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRepositoryResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateRepositoryResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建(导入)代码库</p>
     * 
     * @param request CreateRepositoryRequest
     * @return CreateRepositoryResponse
     */
    public CreateRepositoryResponse createRepository(CreateRepositoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRepositoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建代码组</p>
     * 
     * @param request CreateRepositoryGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRepositoryGroupResponse
     */
    public CreateRepositoryGroupResponse createRepositoryGroupWithOptions(CreateRepositoryGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.avatarUrl)) {
            body.put("avatarUrl", request.avatarUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            body.put("parentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            body.put("path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibilityLevel)) {
            body.put("visibilityLevel", request.visibilityLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRepositoryGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/groups/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRepositoryGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateRepositoryGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建代码组</p>
     * 
     * @param request CreateRepositoryGroupRequest
     * @return CreateRepositoryGroupResponse
     */
    public CreateRepositoryGroupResponse createRepositoryGroup(CreateRepositoryGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRepositoryGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>插入资源成员</p>
     * 
     * @param request CreateResourceMemberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateResourceMemberResponse
     */
    public CreateResourceMemberResponse createResourceMemberWithOptions(String organizationId, String resourceType, String resourceId, CreateResourceMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("accountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("roleName", request.roleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResourceMember"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(resourceType) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(resourceId) + "/members"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceMemberResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateResourceMemberResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>插入资源成员</p>
     * 
     * @param request CreateResourceMemberRequest
     * @return CreateResourceMemberResponse
     */
    public CreateResourceMemberResponse createResourceMember(String organizationId, String resourceType, String resourceId, CreateResourceMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceMemberWithOptions(organizationId, resourceType, resourceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建服务授权</p>
     * 
     * @param request CreateServiceAuthRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceAuthResponse
     */
    public CreateServiceAuthResponse createServiceAuthWithOptions(String organizationId, CreateServiceAuthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceAuthType)) {
            query.put("serviceAuthType", request.serviceAuthType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceAuth"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/serviceAuths"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceAuthResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateServiceAuthResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建服务授权</p>
     * 
     * @param request CreateServiceAuthRequest
     * @return CreateServiceAuthResponse
     */
    public CreateServiceAuthResponse createServiceAuth(String organizationId, CreateServiceAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceAuthWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建服务连接</p>
     * 
     * @param request CreateServiceConnectionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceConnectionResponse
     */
    public CreateServiceConnectionResponse createServiceConnectionWithOptions(String organizationId, CreateServiceConnectionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            body.put("authType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionName)) {
            body.put("connectionName", request.connectionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionType)) {
            body.put("connectionType", request.connectionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            body.put("scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceAuthId)) {
            body.put("serviceAuthId", request.serviceAuthId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceConnection"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/createServiceConnection"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceConnectionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateServiceConnectionResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建服务连接</p>
     * 
     * @param request CreateServiceConnectionRequest
     * @return CreateServiceConnectionResponse
     */
    public CreateServiceConnectionResponse createServiceConnection(String organizationId, CreateServiceConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceConnectionWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建用户名密码类型的证书</p>
     * 
     * @param request CreateServiceCredentialRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceCredentialResponse
     */
    public CreateServiceCredentialResponse createServiceCredentialWithOptions(String organizationId, CreateServiceCredentialRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            body.put("scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceCredential"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/serviceCredentials"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceCredentialResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateServiceCredentialResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建用户名密码类型的证书</p>
     * 
     * @param request CreateServiceCredentialRequest
     * @return CreateServiceCredentialResponse
     */
    public CreateServiceCredentialResponse createServiceCredential(String organizationId, CreateServiceCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceCredentialWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建迭代</p>
     * 
     * @param request CreateSprintRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSprintResponse
     */
    public CreateSprintResponse createSprintWithOptions(String organizationId, CreateSprintRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("endDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceIdentifier)) {
            body.put("spaceIdentifier", request.spaceIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.staffIds)) {
            body.put("staffIds", request.staffIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("startDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSprint"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/sprints/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSprintResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateSprintResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建迭代</p>
     * 
     * @param request CreateSprintRequest
     * @return CreateSprintResponse
     */
    public CreateSprintResponse createSprint(String organizationId, CreateSprintRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSprintWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建企业公钥</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSshKeyResponse
     */
    public CreateSshKeyResponse createSshKeyWithOptions(String organizationId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSshKey"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/sshKey"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSshKeyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateSshKeyResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建企业公钥</p>
     * @return CreateSshKeyResponse
     */
    public CreateSshKeyResponse createSshKey(String organizationId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSshKeyWithOptions(organizationId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建标签Tag</p>
     * 
     * @param request CreateTagRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTagResponse
     */
    public CreateTagResponse createTagWithOptions(String repositoryId, CreateTagRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            body.put("message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ref)) {
            body.put("ref", request.ref);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagName)) {
            body.put("tagName", request.tagName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTag"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/tags/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTagResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateTagResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建标签Tag</p>
     * 
     * @param request CreateTagRequest
     * @return CreateTagResponse
     */
    public CreateTagResponse createTag(String repositoryId, CreateTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTagWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建测试用例</p>
     * 
     * @param request CreateTestCaseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTestCaseResponse
     */
    public CreateTestCaseResponse createTestCaseWithOptions(String organizationId, CreateTestCaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assignedTo)) {
            body.put("assignedTo", request.assignedTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryIdentifier)) {
            body.put("directoryIdentifier", request.directoryIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldValueList)) {
            body.put("fieldValueList", request.fieldValueList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceIdentifier)) {
            body.put("spaceIdentifier", request.spaceIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subject)) {
            body.put("subject", request.subject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.testcaseStepContentInfo)) {
            body.put("testcaseStepContentInfo", request.testcaseStepContentInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTestCase"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/testhub/testcase"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTestCaseResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateTestCaseResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建测试用例</p>
     * 
     * @param request CreateTestCaseRequest
     * @return CreateTestCaseResponse
     */
    public CreateTestCaseResponse createTestCase(String organizationId, CreateTestCaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTestCaseWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建SSH Key密钥</p>
     * 
     * @param request CreateUserKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserKeyResponse
     */
    public CreateUserKeyResponse createUserKeyWithOptions(CreateUserKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            body.put("expireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyScope)) {
            body.put("keyScope", request.keyScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicKey)) {
            body.put("publicKey", request.publicKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUserKey"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/user/keys/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserKeyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateUserKeyResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建SSH Key密钥</p>
     * 
     * @param request CreateUserKeyRequest
     * @return CreateUserKeyResponse
     */
    public CreateUserKeyResponse createUserKey(CreateUserKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUserKeyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建变量组</p>
     * 
     * @param request CreateVariableGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVariableGroupResponse
     */
    public CreateVariableGroupResponse createVariableGroupWithOptions(String organizationId, CreateVariableGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variables)) {
            body.put("variables", request.variables);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVariableGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/variableGroups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVariableGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateVariableGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建变量组</p>
     * 
     * @param request CreateVariableGroupRequest
     * @return CreateVariableGroupResponse
     */
    public CreateVariableGroupResponse createVariableGroup(String organizationId, CreateVariableGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVariableGroupWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新建工作项</p>
     * 
     * @param request CreateWorkitemRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkitemResponse
     */
    public CreateWorkitemResponse createWorkitemWithOptions(String organizationId, CreateWorkitemRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assignedTo)) {
            body.put("assignedTo", request.assignedTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            body.put("category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.descriptionFormat)) {
            body.put("descriptionFormat", request.descriptionFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldValueList)) {
            body.put("fieldValueList", request.fieldValueList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parent)) {
            body.put("parent", request.parent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.participant)) {
            body.put("participant", request.participant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.space)) {
            body.put("space", request.space);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceIdentifier)) {
            body.put("spaceIdentifier", request.spaceIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceType)) {
            body.put("spaceType", request.spaceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sprint)) {
            body.put("sprint", request.sprint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subject)) {
            body.put("subject", request.subject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracker)) {
            body.put("tracker", request.tracker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifier)) {
            body.put("verifier", request.verifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workitemType)) {
            body.put("workitemType", request.workitemType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkitem"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/workitems/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkitemResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateWorkitemResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>新建工作项</p>
     * 
     * @param request CreateWorkitemRequest
     * @return CreateWorkitemResponse
     */
    public CreateWorkitemResponse createWorkitem(String organizationId, CreateWorkitemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWorkitemWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个评论</p>
     * 
     * @param request CreateWorkitemCommentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkitemCommentResponse
     */
    public CreateWorkitemCommentResponse createWorkitemCommentWithOptions(String organizationId, CreateWorkitemCommentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formatType)) {
            body.put("formatType", request.formatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            body.put("parentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workitemIdentifier)) {
            body.put("workitemIdentifier", request.workitemIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkitemComment"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/workitems/comment"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkitemCommentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateWorkitemCommentResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建一个评论</p>
     * 
     * @param request CreateWorkitemCommentRequest
     * @return CreateWorkitemCommentResponse
     */
    public CreateWorkitemCommentResponse createWorkitemComment(String organizationId, CreateWorkitemCommentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWorkitemCommentWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>登记预计工时</p>
     * 
     * @param request CreateWorkitemEstimateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkitemEstimateResponse
     */
    public CreateWorkitemEstimateResponse createWorkitemEstimateWithOptions(String organizationId, CreateWorkitemEstimateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordUserIdentifier)) {
            body.put("recordUserIdentifier", request.recordUserIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spentTime)) {
            body.put("spentTime", request.spentTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workitemIdentifier)) {
            body.put("workitemIdentifier", request.workitemIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkitemEstimate"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/workitems/estimate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkitemEstimateResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateWorkitemEstimateResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>登记预计工时</p>
     * 
     * @param request CreateWorkitemEstimateRequest
     * @return CreateWorkitemEstimateResponse
     */
    public CreateWorkitemEstimateResponse createWorkitemEstimate(String organizationId, CreateWorkitemEstimateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWorkitemEstimateWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>登记实际工时</p>
     * 
     * @param request CreateWorkitemRecordRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkitemRecordResponse
     */
    public CreateWorkitemRecordResponse createWorkitemRecordWithOptions(String organizationId, CreateWorkitemRecordRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actualTime)) {
            body.put("actualTime", request.actualTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtEnd)) {
            body.put("gmtEnd", request.gmtEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtStart)) {
            body.put("gmtStart", request.gmtStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordUserIdentifier)) {
            body.put("recordUserIdentifier", request.recordUserIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workitemIdentifier)) {
            body.put("workitemIdentifier", request.workitemIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkitemRecord"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/workitems/record"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkitemRecordResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateWorkitemRecordResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>登记实际工时</p>
     * 
     * @param request CreateWorkitemRecordRequest
     * @return CreateWorkitemRecordResponse
     */
    public CreateWorkitemRecordResponse createWorkitemRecord(String organizationId, CreateWorkitemRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWorkitemRecordWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建工作项</p>
     * 
     * @param request CreateWorkitemV2Request
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkitemV2Response
     */
    public CreateWorkitemV2Response createWorkitemV2WithOptions(String organizationId, CreateWorkitemV2Request request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assignedTo)) {
            body.put("assignedTo", request.assignedTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            body.put("category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldValueList)) {
            body.put("fieldValueList", request.fieldValueList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentIdentifier)) {
            body.put("parentIdentifier", request.parentIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.participants)) {
            body.put("participants", request.participants);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceIdentifier)) {
            body.put("spaceIdentifier", request.spaceIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sprintIdentifier)) {
            body.put("sprintIdentifier", request.sprintIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subject)) {
            body.put("subject", request.subject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trackers)) {
            body.put("trackers", request.trackers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifier)) {
            body.put("verifier", request.verifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versions)) {
            body.put("versions", request.versions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workitemTypeIdentifier)) {
            body.put("workitemTypeIdentifier", request.workitemTypeIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkitemV2"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/workitem"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkitemV2Response());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateWorkitemV2Response());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建工作项</p>
     * 
     * @param request CreateWorkitemV2Request
     * @return CreateWorkitemV2Response
     */
    public CreateWorkitemV2Response createWorkitemV2(String organizationId, CreateWorkitemV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWorkitemV2WithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除应用成员</p>
     * 
     * @param request DeleteAppMemberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppMemberResponse
     */
    public DeleteAppMemberResponse deleteAppMemberWithOptions(String appName, DeleteAppMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subjectId)) {
            query.put("subjectId", request.subjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subjectType)) {
            query.put("subjectType", request.subjectType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppMember"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/appstack/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/members"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "string")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppMemberResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteAppMemberResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除应用成员</p>
     * 
     * @param request DeleteAppMemberRequest
     * @return DeleteAppMemberResponse
     */
    public DeleteAppMemberResponse deleteAppMember(String appName, DeleteAppMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAppMemberWithOptions(appName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除分支</p>
     * 
     * @param request DeleteBranchRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBranchResponse
     */
    public DeleteBranchResponse deleteBranchWithOptions(String repositoryId, DeleteBranchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("branchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBranch"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/branches/delete"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBranchResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteBranchResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除分支</p>
     * 
     * @param request DeleteBranchRequest
     * @return DeleteBranchResponse
     */
    public DeleteBranchResponse deleteBranch(String repositoryId, DeleteBranchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBranchWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除文件</p>
     * 
     * @param request DeleteFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFileResponse
     */
    public DeleteFileResponse deleteFileWithOptions(String repositoryId, DeleteFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("branchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commitMessage)) {
            query.put("commitMessage", request.commitMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("filePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFile"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/files/delete"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFileResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteFileResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除文件</p>
     * 
     * @param request DeleteFileRequest
     * @return DeleteFileResponse
     */
    public DeleteFileResponse deleteFile(String repositoryId, DeleteFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFileWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除标签</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFlowTagResponse
     */
    public DeleteFlowTagResponse deleteFlowTagWithOptions(String organizationId, String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFlowTag"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/flow/tags/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFlowTagResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteFlowTagResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除标签</p>
     * @return DeleteFlowTagResponse
     */
    public DeleteFlowTagResponse deleteFlowTag(String organizationId, String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFlowTagWithOptions(organizationId, id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除标签分类</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFlowTagGroupResponse
     */
    public DeleteFlowTagGroupResponse deleteFlowTagGroupWithOptions(String organizationId, String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFlowTagGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/flow/tagGroups/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFlowTagGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteFlowTagGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除标签分类</p>
     * @return DeleteFlowTagGroupResponse
     */
    public DeleteFlowTagGroupResponse deleteFlowTagGroup(String organizationId, String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFlowTagGroupWithOptions(organizationId, id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除组成员</p>
     * 
     * @param request DeleteGroupMemberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGroupMemberResponse
     */
    public DeleteGroupMemberResponse deleteGroupMemberWithOptions(String groupId, DeleteGroupMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunPk)) {
            query.put("aliyunPk", request.aliyunPk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberType)) {
            body.put("memberType", request.memberType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGroupMember"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/members/remove/aliyun_pk"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGroupMemberResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteGroupMemberResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除组成员</p>
     * 
     * @param request DeleteGroupMemberRequest
     * @return DeleteGroupMemberResponse
     */
    public DeleteGroupMemberResponse deleteGroupMember(String groupId, DeleteGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGroupMemberWithOptions(groupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除主机组</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHostGroupResponse
     */
    public DeleteHostGroupResponse deleteHostGroupWithOptions(String organizationId, String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHostGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/hostGroups/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHostGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteHostGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除主机组</p>
     * @return DeleteHostGroupResponse
     */
    public DeleteHostGroupResponse deleteHostGroup(String organizationId, String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteHostGroupWithOptions(organizationId, id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除流水线</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePipelineResponse
     */
    public DeletePipelineResponse deletePipelineWithOptions(String organizationId, String pipelineId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePipeline"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelines/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePipelineResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeletePipelineResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除流水线</p>
     * @return DeletePipelineResponse
     */
    public DeletePipelineResponse deletePipeline(String organizationId, String pipelineId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePipelineWithOptions(organizationId, pipelineId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除流水线分组</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePipelineGroupResponse
     */
    public DeletePipelineGroupResponse deletePipelineGroupWithOptions(String organizationId, String groupId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePipelineGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelineGroups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePipelineGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeletePipelineGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除流水线分组</p>
     * @return DeletePipelineGroupResponse
     */
    public DeletePipelineGroupResponse deletePipelineGroup(String organizationId, String groupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePipelineGroupWithOptions(organizationId, groupId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除流水线关联</p>
     * 
     * @param request DeletePipelineRelationsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePipelineRelationsResponse
     */
    public DeletePipelineRelationsResponse deletePipelineRelationsWithOptions(String organizationId, String pipelineId, DeletePipelineRelationsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.relObjectId)) {
            query.put("relObjectId", request.relObjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relObjectType)) {
            query.put("relObjectType", request.relObjectType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePipelineRelations"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineId) + "/pipelineRelations"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePipelineRelationsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeletePipelineRelationsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除流水线关联</p>
     * 
     * @param request DeletePipelineRelationsRequest
     * @return DeletePipelineRelationsResponse
     */
    public DeletePipelineRelationsResponse deletePipelineRelations(String organizationId, String pipelineId, DeletePipelineRelationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePipelineRelationsWithOptions(organizationId, pipelineId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除项目</p>
     * 
     * @param request DeleteProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProjectWithOptions(String organizationId, DeleteProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("identifier", request.identifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProject"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/projects/delete"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProjectResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteProjectResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除项目</p>
     * 
     * @param request DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProject(String organizationId, DeleteProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProjectWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除代码库Label</p>
     * 
     * @param request DeleteProjectLabelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProjectLabelResponse
     */
    public DeleteProjectLabelResponse deleteProjectLabelWithOptions(String labelId, DeleteProjectLabelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repositoryIdentity)) {
            query.put("repositoryIdentity", request.repositoryIdentity);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProjectLabel"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/labels/" + com.aliyun.openapiutil.Client.getEncodeParam(labelId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProjectLabelResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteProjectLabelResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除代码库Label</p>
     * 
     * @param request DeleteProjectLabelRequest
     * @return DeleteProjectLabelResponse
     */
    public DeleteProjectLabelResponse deleteProjectLabel(String labelId, DeleteProjectLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProjectLabelWithOptions(labelId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除保护分支</p>
     * 
     * @param request DeleteProtectedBranchRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProtectedBranchResponse
     */
    public DeleteProtectedBranchResponse deleteProtectedBranchWithOptions(String repositoryId, String protectedBranchId, DeleteProtectedBranchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProtectedBranch"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/protect_branches/" + com.aliyun.openapiutil.Client.getEncodeParam(protectedBranchId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProtectedBranchResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteProtectedBranchResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除保护分支</p>
     * 
     * @param request DeleteProtectedBranchRequest
     * @return DeleteProtectedBranchResponse
     */
    public DeleteProtectedBranchResponse deleteProtectedBranch(String repositoryId, String protectedBranchId, DeleteProtectedBranchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProtectedBranchWithOptions(repositoryId, protectedBranchId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除推送规则</p>
     * 
     * @param request DeletePushRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePushRuleResponse
     */
    public DeletePushRuleResponse deletePushRuleWithOptions(String repositoryId, String pushRuleId, DeletePushRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePushRule"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/push_rule/" + com.aliyun.openapiutil.Client.getEncodeParam(pushRuleId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePushRuleResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeletePushRuleResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除推送规则</p>
     * 
     * @param request DeletePushRuleRequest
     * @return DeletePushRuleResponse
     */
    public DeletePushRuleResponse deletePushRule(String repositoryId, String pushRuleId, DeletePushRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePushRuleWithOptions(repositoryId, pushRuleId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除代码库</p>
     * 
     * @param request DeleteRepositoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRepositoryResponse
     */
    public DeleteRepositoryResponse deleteRepositoryWithOptions(String repositoryId, DeleteRepositoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            body.put("reason", request.reason);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRepository"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/remove"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRepositoryResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteRepositoryResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除代码库</p>
     * 
     * @param request DeleteRepositoryRequest
     * @return DeleteRepositoryResponse
     */
    public DeleteRepositoryResponse deleteRepository(String repositoryId, DeleteRepositoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRepositoryWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除代码组</p>
     * 
     * @param request DeleteRepositoryGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRepositoryGroupResponse
     */
    public DeleteRepositoryGroupResponse deleteRepositoryGroupWithOptions(String groupId, DeleteRepositoryGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            body.put("reason", request.reason);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRepositoryGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/remove"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRepositoryGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteRepositoryGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除代码组</p>
     * 
     * @param request DeleteRepositoryGroupRequest
     * @return DeleteRepositoryGroupResponse
     */
    public DeleteRepositoryGroupResponse deleteRepositoryGroup(String groupId, DeleteRepositoryGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRepositoryGroupWithOptions(groupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除代码库成员</p>
     * 
     * @param request DeleteRepositoryMemberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRepositoryMemberResponse
     */
    public DeleteRepositoryMemberResponse deleteRepositoryMemberWithOptions(String repositoryId, String aliyunPk, DeleteRepositoryMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberType)) {
            body.put("memberType", request.memberType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRepositoryMember"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/members/delete/" + com.aliyun.openapiutil.Client.getEncodeParam(aliyunPk) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRepositoryMemberResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteRepositoryMemberResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除代码库成员</p>
     * 
     * @param request DeleteRepositoryMemberRequest
     * @return DeleteRepositoryMemberResponse
     */
    public DeleteRepositoryMemberResponse deleteRepositoryMember(String repositoryId, String aliyunPk, DeleteRepositoryMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRepositoryMemberWithOptions(repositoryId, aliyunPk, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除代码库Webhook</p>
     * 
     * @param request DeleteRepositoryWebhookRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRepositoryWebhookResponse
     */
    public DeleteRepositoryWebhookResponse deleteRepositoryWebhookWithOptions(String repositoryId, String hookId, DeleteRepositoryWebhookRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRepositoryWebhook"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/hooks/" + com.aliyun.openapiutil.Client.getEncodeParam(hookId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRepositoryWebhookResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteRepositoryWebhookResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除代码库Webhook</p>
     * 
     * @param request DeleteRepositoryWebhookRequest
     * @return DeleteRepositoryWebhookResponse
     */
    public DeleteRepositoryWebhookResponse deleteRepositoryWebhook(String repositoryId, String hookId, DeleteRepositoryWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRepositoryWebhookWithOptions(repositoryId, hookId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除资源成员</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteResourceMemberResponse
     */
    public DeleteResourceMemberResponse deleteResourceMemberWithOptions(String organizationId, String resourceType, String resourceId, String accountId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResourceMember"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(resourceType) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(resourceId) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(accountId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceMemberResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteResourceMemberResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除资源成员</p>
     * @return DeleteResourceMemberResponse
     */
    public DeleteResourceMemberResponse deleteResourceMember(String organizationId, String resourceType, String resourceId, String accountId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceMemberWithOptions(organizationId, resourceType, resourceId, accountId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除标签</p>
     * 
     * @param request DeleteTagRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTagResponse
     */
    public DeleteTagResponse deleteTagWithOptions(String repositoryId, DeleteTagRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagName)) {
            query.put("tagName", request.tagName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTag"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/tags/delete"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTagResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteTagResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除标签</p>
     * 
     * @param request DeleteTagRequest
     * @return DeleteTagResponse
     */
    public DeleteTagResponse deleteTag(String repositoryId, DeleteTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTagWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除用户的SSH Key</p>
     * 
     * @param request DeleteUserKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserKeyResponse
     */
    public DeleteUserKeyResponse deleteUserKeyWithOptions(String keyId, DeleteUserKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserKey"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/user/keys/" + com.aliyun.openapiutil.Client.getEncodeParam(keyId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserKeyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteUserKeyResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除用户的SSH Key</p>
     * 
     * @param request DeleteUserKeyRequest
     * @return DeleteUserKeyResponse
     */
    public DeleteUserKeyResponse deleteUserKey(String keyId, DeleteUserKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUserKeyWithOptions(keyId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除变量组</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVariableGroupResponse
     */
    public DeleteVariableGroupResponse deleteVariableGroupWithOptions(String organizationId, String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVariableGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/variableGroups/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVariableGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteVariableGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除变量组</p>
     * @return DeleteVariableGroupResponse
     */
    public DeleteVariableGroupResponse deleteVariableGroup(String organizationId, String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteVariableGroupWithOptions(organizationId, id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除工作项</p>
     * 
     * @param request DeleteWorkitemRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWorkitemResponse
     */
    public DeleteWorkitemResponse deleteWorkitemWithOptions(String organizationId, DeleteWorkitemRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("identifier", request.identifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkitem"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/workitem/delete"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkitemResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteWorkitemResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除工作项</p>
     * 
     * @param request DeleteWorkitemRequest
     * @return DeleteWorkitemResponse
     */
    public DeleteWorkitemResponse deleteWorkitem(String organizationId, DeleteWorkitemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteWorkitemWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除所有评论</p>
     * 
     * @param request DeleteWorkitemAllCommentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWorkitemAllCommentResponse
     */
    public DeleteWorkitemAllCommentResponse deleteWorkitemAllCommentWithOptions(String organizationId, DeleteWorkitemAllCommentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("identifier", request.identifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkitemAllComment"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/workitems/deleteAllComment"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkitemAllCommentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteWorkitemAllCommentResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除所有评论</p>
     * 
     * @param request DeleteWorkitemAllCommentRequest
     * @return DeleteWorkitemAllCommentResponse
     */
    public DeleteWorkitemAllCommentResponse deleteWorkitemAllComment(String organizationId, DeleteWorkitemAllCommentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteWorkitemAllCommentWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除单条评论</p>
     * 
     * @param request DeleteWorkitemCommentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWorkitemCommentResponse
     */
    public DeleteWorkitemCommentResponse deleteWorkitemCommentWithOptions(String organizationId, DeleteWorkitemCommentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commentId)) {
            body.put("commentId", request.commentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            body.put("identifier", request.identifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkitemComment"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/workitems/deleteComent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkitemCommentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteWorkitemCommentResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除单条评论</p>
     * 
     * @param request DeleteWorkitemCommentRequest
     * @return DeleteWorkitemCommentResponse
     */
    public DeleteWorkitemCommentResponse deleteWorkitemComment(String organizationId, DeleteWorkitemCommentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteWorkitemCommentWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启用部署密钥</p>
     * 
     * @param request EnableDeployKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableDeployKeyResponse
     */
    public EnableDeployKeyResponse enableDeployKeyWithOptions(String repositoryId, String keyId, EnableDeployKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableDeployKey"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/keys/" + com.aliyun.openapiutil.Client.getEncodeParam(keyId) + "/enable"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new EnableDeployKeyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new EnableDeployKeyResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>启用部署密钥</p>
     * 
     * @param request EnableDeployKeyRequest
     * @return EnableDeployKeyResponse
     */
    public EnableDeployKeyResponse enableDeployKey(String repositoryId, String keyId, EnableDeployKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableDeployKeyWithOptions(repositoryId, keyId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>执行研发阶段流水线</p>
     * 
     * @param request ExecuteChangeRequestReleaseStageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteChangeRequestReleaseStageResponse
     */
    public ExecuteChangeRequestReleaseStageResponse executeChangeRequestReleaseStageWithOptions(String appName, String releaseWorkflowSn, String releaseStageSn, ExecuteChangeRequestReleaseStageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("params", request.params);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteChangeRequestReleaseStage"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/appstack/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/releaseWorkflows/" + com.aliyun.openapiutil.Client.getEncodeParam(releaseWorkflowSn) + "/releaseStages/" + com.aliyun.openapiutil.Client.getEncodeParam(releaseStageSn) + "%3Aexecute"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteChangeRequestReleaseStageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ExecuteChangeRequestReleaseStageResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>执行研发阶段流水线</p>
     * 
     * @param request ExecuteChangeRequestReleaseStageRequest
     * @return ExecuteChangeRequestReleaseStageResponse
     */
    public ExecuteChangeRequestReleaseStageResponse executeChangeRequestReleaseStage(String appName, String releaseWorkflowSn, String releaseStageSn, ExecuteChangeRequestReleaseStageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeChangeRequestReleaseStageWithOptions(appName, releaseWorkflowSn, releaseStageSn, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导出Insight custom_value表</p>
     * 
     * @param request ExportInsightCustomValueRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportInsightCustomValueResponse
     */
    public ExportInsightCustomValueResponse exportInsightCustomValueWithOptions(String organizationId, ExportInsightCustomValueRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportInsightCustomValue"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/data/customValues"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ExportInsightCustomValueResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ExportInsightCustomValueResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>导出Insight custom_value表</p>
     * 
     * @param request ExportInsightCustomValueRequest
     * @return ExportInsightCustomValueResponse
     */
    public ExportInsightCustomValueResponse exportInsightCustomValue(String organizationId, ExportInsightCustomValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportInsightCustomValueWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导出Insight expected_work_time表数据</p>
     * 
     * @param request ExportInsightExpectedWorkTimeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportInsightExpectedWorkTimeResponse
     */
    public ExportInsightExpectedWorkTimeResponse exportInsightExpectedWorkTimeWithOptions(String organizationId, ExportInsightExpectedWorkTimeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportInsightExpectedWorkTime"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/data/expectedWorkTimes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ExportInsightExpectedWorkTimeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ExportInsightExpectedWorkTimeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>导出Insight expected_work_time表数据</p>
     * 
     * @param request ExportInsightExpectedWorkTimeRequest
     * @return ExportInsightExpectedWorkTimeResponse
     */
    public ExportInsightExpectedWorkTimeResponse exportInsightExpectedWorkTime(String organizationId, ExportInsightExpectedWorkTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportInsightExpectedWorkTimeWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导出Insight field表</p>
     * 
     * @param request ExportInsightFieldRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportInsightFieldResponse
     */
    public ExportInsightFieldResponse exportInsightFieldWithOptions(String organizationId, ExportInsightFieldRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportInsightField"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/data/fields"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ExportInsightFieldResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ExportInsightFieldResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>导出Insight field表</p>
     * 
     * @param request ExportInsightFieldRequest
     * @return ExportInsightFieldResponse
     */
    public ExportInsightFieldResponse exportInsightField(String organizationId, ExportInsightFieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportInsightFieldWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导出Insight space表数据</p>
     * 
     * @param request ExportInsightSpaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportInsightSpaceResponse
     */
    public ExportInsightSpaceResponse exportInsightSpaceWithOptions(String organizationId, ExportInsightSpaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportInsightSpace"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/data/spaces"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ExportInsightSpaceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ExportInsightSpaceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>导出Insight space表数据</p>
     * 
     * @param request ExportInsightSpaceRequest
     * @return ExportInsightSpaceResponse
     */
    public ExportInsightSpaceResponse exportInsightSpace(String organizationId, ExportInsightSpaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportInsightSpaceWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导出Insight space_ref表数据</p>
     * 
     * @param request ExportInsightSpaceRefRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportInsightSpaceRefResponse
     */
    public ExportInsightSpaceRefResponse exportInsightSpaceRefWithOptions(String organizationId, ExportInsightSpaceRefRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportInsightSpaceRef"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/data/spaceRefs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ExportInsightSpaceRefResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ExportInsightSpaceRefResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>导出Insight space_ref表数据</p>
     * 
     * @param request ExportInsightSpaceRefRequest
     * @return ExportInsightSpaceRefResponse
     */
    public ExportInsightSpaceRefResponse exportInsightSpaceRef(String organizationId, ExportInsightSpaceRefRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportInsightSpaceRefWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导出Insight sprint表数据</p>
     * 
     * @param request ExportInsightSprintRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportInsightSprintResponse
     */
    public ExportInsightSprintResponse exportInsightSprintWithOptions(String organizationId, ExportInsightSprintRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportInsightSprint"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/data/sprints"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ExportInsightSprintResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ExportInsightSprintResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>导出Insight sprint表数据</p>
     * 
     * @param request ExportInsightSprintRequest
     * @return ExportInsightSprintResponse
     */
    public ExportInsightSprintResponse exportInsightSprint(String organizationId, ExportInsightSprintRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportInsightSprintWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导出Insight tag_ref表数据</p>
     * 
     * @param request ExportInsightTagRefRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportInsightTagRefResponse
     */
    public ExportInsightTagRefResponse exportInsightTagRefWithOptions(String organizationId, ExportInsightTagRefRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportInsightTagRef"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/data/tagRefs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ExportInsightTagRefResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ExportInsightTagRefResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>导出Insight tag_ref表数据</p>
     * 
     * @param request ExportInsightTagRefRequest
     * @return ExportInsightTagRefResponse
     */
    public ExportInsightTagRefResponse exportInsightTagRef(String organizationId, ExportInsightTagRefRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportInsightTagRefWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导出Insight work_time表数据</p>
     * 
     * @param request ExportInsightWorkTimeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportInsightWorkTimeResponse
     */
    public ExportInsightWorkTimeResponse exportInsightWorkTimeWithOptions(String organizationId, ExportInsightWorkTimeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportInsightWorkTime"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/data/workTimes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ExportInsightWorkTimeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ExportInsightWorkTimeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>导出Insight work_time表数据</p>
     * 
     * @param request ExportInsightWorkTimeRequest
     * @return ExportInsightWorkTimeResponse
     */
    public ExportInsightWorkTimeResponse exportInsightWorkTime(String organizationId, ExportInsightWorkTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportInsightWorkTimeWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导出Insight workitem_stauts表数据</p>
     * 
     * @param request ExportInsightWorkitemStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportInsightWorkitemStatusResponse
     */
    public ExportInsightWorkitemStatusResponse exportInsightWorkitemStatusWithOptions(String organizationId, ExportInsightWorkitemStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportInsightWorkitemStatus"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/data/workitemStatuses"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ExportInsightWorkitemStatusResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ExportInsightWorkitemStatusResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>导出Insight workitem_stauts表数据</p>
     * 
     * @param request ExportInsightWorkitemStatusRequest
     * @return ExportInsightWorkitemStatusResponse
     */
    public ExportInsightWorkitemStatusResponse exportInsightWorkitemStatus(String organizationId, ExportInsightWorkitemStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportInsightWorkitemStatusWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导出Insight workitem_stauts表 join workitem_defect_extra表表数据</p>
     * 
     * @param request ExportInsightWorkitemStatusJoinWorkitemDefectExtraRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponse
     */
    public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponse exportInsightWorkitemStatusJoinWorkitemDefectExtraWithOptions(String organizationId, ExportInsightWorkitemStatusJoinWorkitemDefectExtraRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportInsightWorkitemStatusJoinWorkitemDefectExtra"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/data/workitemStatusJoinWorkitemDefectExtras"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>导出Insight workitem_stauts表 join workitem_defect_extra表表数据</p>
     * 
     * @param request ExportInsightWorkitemStatusJoinWorkitemDefectExtraRequest
     * @return ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponse
     */
    public ExportInsightWorkitemStatusJoinWorkitemDefectExtraResponse exportInsightWorkitemStatusJoinWorkitemDefectExtra(String organizationId, ExportInsightWorkitemStatusJoinWorkitemDefectExtraRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportInsightWorkitemStatusJoinWorkitemDefectExtraWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导出Insight workitem_version表数据</p>
     * 
     * @param request ExportInsightWorkitemVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportInsightWorkitemVersionResponse
     */
    public ExportInsightWorkitemVersionResponse exportInsightWorkitemVersionWithOptions(String organizationId, ExportInsightWorkitemVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportInsightWorkitemVersion"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/data/workitemVersions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ExportInsightWorkitemVersionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ExportInsightWorkitemVersionResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>导出Insight workitem_version表数据</p>
     * 
     * @param request ExportInsightWorkitemVersionRequest
     * @return ExportInsightWorkitemVersionResponse
     */
    public ExportInsightWorkitemVersionResponse exportInsightWorkitemVersion(String organizationId, ExportInsightWorkitemVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportInsightWorkitemVersionWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导出Insight workitem_activity表数据</p>
     * 
     * @param request ExportWorkitemActivityRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportWorkitemActivityResponse
     */
    public ExportWorkitemActivityResponse exportWorkitemActivityWithOptions(String organizationId, ExportWorkitemActivityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportWorkitemActivity"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/data/workitemActivities"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ExportWorkitemActivityResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ExportWorkitemActivityResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>导出Insight workitem_activity表数据</p>
     * 
     * @param request ExportWorkitemActivityRequest
     * @return ExportWorkitemActivityResponse
     */
    public ExportWorkitemActivityResponse exportWorkitemActivity(String organizationId, ExportWorkitemActivityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportWorkitemActivityWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查找应用详情</p>
     * 
     * @param request GetApplicationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApplicationResponse
     */
    public GetApplicationResponse getApplicationWithOptions(String appName, GetApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApplication"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/appstack/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetApplicationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetApplicationResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查找应用详情</p>
     * 
     * @param request GetApplicationRequest
     * @return GetApplicationResponse
     */
    public GetApplicationResponse getApplication(String appName, GetApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApplicationWithOptions(appName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个分支</p>
     * 
     * @param request GetBranchInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBranchInfoResponse
     */
    public GetBranchInfoResponse getBranchInfoWithOptions(String repositoryId, GetBranchInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("branchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBranchInfo"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/branches/detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetBranchInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetBranchInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询单个分支</p>
     * 
     * @param request GetBranchInfoRequest
     * @return GetBranchInfoResponse
     */
    public GetBranchInfoResponse getBranchInfo(String repositoryId, GetBranchInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBranchInfoWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询检查运行</p>
     * 
     * @param request GetCheckRunRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCheckRunResponse
     */
    public GetCheckRunResponse getCheckRunWithOptions(GetCheckRunRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkRunId)) {
            query.put("checkRunId", request.checkRunId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repositoryIdentity)) {
            query.put("repositoryIdentity", request.repositoryIdentity);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCheckRun"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/check_runs/get_check_run"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetCheckRunResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetCheckRunResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询检查运行</p>
     * 
     * @param request GetCheckRunRequest
     * @return GetCheckRunResponse
     */
    public GetCheckRunResponse getCheckRun(GetCheckRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCheckRunWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取企业信息</p>
     * 
     * @param request GetCodeupOrganizationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCodeupOrganizationResponse
     */
    public GetCodeupOrganizationResponse getCodeupOrganizationWithOptions(String identity, GetCodeupOrganizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCodeupOrganization"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(identity) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetCodeupOrganizationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetCodeupOrganizationResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取企业信息</p>
     * 
     * @param request GetCodeupOrganizationRequest
     * @return GetCodeupOrganizationResponse
     */
    public GetCodeupOrganizationResponse getCodeupOrganization(String identity, GetCodeupOrganizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCodeupOrganizationWithOptions(identity, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取比较详情</p>
     * 
     * @param request GetCompareDetailRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCompareDetailResponse
     */
    public GetCompareDetailResponse getCompareDetailWithOptions(String repositoryId, GetCompareDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("from", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxDiffByte)) {
            query.put("maxDiffByte", request.maxDiffByte);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxDiffFile)) {
            query.put("maxDiffFile", request.maxDiffFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mergeBase)) {
            query.put("mergeBase", request.mergeBase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            query.put("to", request.to);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCompareDetail"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/commits/compare/detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetCompareDetailResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetCompareDetailResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取比较详情</p>
     * 
     * @param request GetCompareDetailRequest
     * @return GetCompareDetailResponse
     */
    public GetCompareDetailResponse getCompareDetail(String repositoryId, GetCompareDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCompareDetailWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取自定义字段的选项值</p>
     * 
     * @param request GetCustomFieldOptionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCustomFieldOptionResponse
     */
    public GetCustomFieldOptionResponse getCustomFieldOptionWithOptions(String organizationId, String fieldId, GetCustomFieldOptionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.spaceIdentifier)) {
            query.put("spaceIdentifier", request.spaceIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceType)) {
            query.put("spaceType", request.spaceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workitemTypeIdentifier)) {
            query.put("workitemTypeIdentifier", request.workitemTypeIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomFieldOption"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/fields/" + com.aliyun.openapiutil.Client.getEncodeParam(fieldId) + "/getCustomOption"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomFieldOptionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetCustomFieldOptionResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取自定义字段的选项值</p>
     * 
     * @param request GetCustomFieldOptionRequest
     * @return GetCustomFieldOptionResponse
     */
    public GetCustomFieldOptionResponse getCustomFieldOption(String organizationId, String fieldId, GetCustomFieldOptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCustomFieldOptionWithOptions(organizationId, fieldId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询文件</p>
     * 
     * @param request GetFileBlobsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFileBlobsResponse
     */
    public GetFileBlobsResponse getFileBlobsWithOptions(String repositoryId, GetFileBlobsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("filePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("from", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ref)) {
            query.put("ref", request.ref);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            query.put("to", request.to);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFileBlobs"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/files/blobs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetFileBlobsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetFileBlobsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询文件</p>
     * 
     * @param request GetFileBlobsRequest
     * @return GetFileBlobsResponse
     */
    public GetFileBlobsResponse getFileBlobs(String repositoryId, GetFileBlobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFileBlobsWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取文件上一次提交信息</p>
     * 
     * @param request GetFileLastCommitRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFileLastCommitResponse
     */
    public GetFileLastCommitResponse getFileLastCommitWithOptions(String repositoryId, GetFileLastCommitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("filePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sha)) {
            query.put("sha", request.sha);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showSignature)) {
            query.put("showSignature", request.showSignature);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFileLastCommit"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/files/lastCommit"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetFileLastCommitResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetFileLastCommitResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取文件上一次提交信息</p>
     * 
     * @param request GetFileLastCommitRequest
     * @return GetFileLastCommitResponse
     */
    public GetFileLastCommitResponse getFileLastCommit(String repositoryId, GetFileLastCommitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFileLastCommitWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取标签分类</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFlowTagGroupResponse
     */
    public GetFlowTagGroupResponse getFlowTagGroupWithOptions(String organizationId, String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFlowTagGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/flow/tagGroups/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetFlowTagGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetFlowTagGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取标签分类</p>
     * @return GetFlowTagGroupResponse
     */
    public GetFlowTagGroupResponse getFlowTagGroup(String organizationId, String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFlowTagGroupWithOptions(organizationId, id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据路径查询代码组</p>
     * 
     * @param request GetGroupByPathRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGroupByPathResponse
     */
    public GetGroupByPathResponse getGroupByPathWithOptions(GetGroupByPathRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identity)) {
            query.put("identity", request.identity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGroupByPath"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/4/groups/find_by_path"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetGroupByPathResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetGroupByPathResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>根据路径查询代码组</p>
     * 
     * @param request GetGroupByPathRequest
     * @return GetGroupByPathResponse
     */
    public GetGroupByPathResponse getGroupByPath(GetGroupByPathRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGroupByPathWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询代码组信息</p>
     * 
     * @param request GetGroupDetailRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGroupDetailResponse
     */
    public GetGroupDetailResponse getGroupDetailWithOptions(GetGroupDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("groupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGroupDetail"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/groups/get_detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetGroupDetailResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetGroupDetailResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询代码组信息</p>
     * 
     * @param request GetGroupDetailRequest
     * @return GetGroupDetailResponse
     */
    public GetGroupDetailResponse getGroupDetail(GetGroupDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGroupDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取主机组信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHostGroupResponse
     */
    public GetHostGroupResponse getHostGroupWithOptions(String organizationId, String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHostGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/hostGroups/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetHostGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetHostGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取主机组信息</p>
     * @return GetHostGroupResponse
     */
    public GetHostGroupResponse getHostGroup(String organizationId, String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHostGroupWithOptions(organizationId, id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询合并请求详情</p>
     * 
     * @param request GetMergeRequestRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMergeRequestResponse
     */
    public GetMergeRequestResponse getMergeRequestWithOptions(String repositoryId, String localId, GetMergeRequestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMergeRequest"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/merge_requests/" + com.aliyun.openapiutil.Client.getEncodeParam(localId) + "/detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetMergeRequestResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetMergeRequestResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询合并请求详情</p>
     * 
     * @param request GetMergeRequestRequest
     * @return GetMergeRequestResponse
     */
    public GetMergeRequestResponse getMergeRequest(String repositoryId, String localId, GetMergeRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMergeRequestWithOptions(repositoryId, localId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询合并请求的变更信息</p>
     * 
     * @param request GetMergeRequestChangeTreeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMergeRequestChangeTreeResponse
     */
    public GetMergeRequestChangeTreeResponse getMergeRequestChangeTreeWithOptions(GetMergeRequestChangeTreeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromPatchSetBizId)) {
            query.put("fromPatchSetBizId", request.fromPatchSetBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localId)) {
            query.put("localId", request.localId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repositoryIdentity)) {
            query.put("repositoryIdentity", request.repositoryIdentity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toPatchSetBizId)) {
            query.put("toPatchSetBizId", request.toPatchSetBizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMergeRequestChangeTree"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/merge_requests/diffs/change_tree"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetMergeRequestChangeTreeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetMergeRequestChangeTreeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询合并请求的变更信息</p>
     * 
     * @param request GetMergeRequestChangeTreeRequest
     * @return GetMergeRequestChangeTreeResponse
     */
    public GetMergeRequestChangeTreeResponse getMergeRequestChangeTree(GetMergeRequestChangeTreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMergeRequestChangeTreeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取企业成员</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOrganizationMemberResponse
     */
    public GetOrganizationMemberResponse getOrganizationMemberWithOptions(String organizationId, String accountId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOrganizationMember"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(accountId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetOrganizationMemberResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetOrganizationMemberResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取企业成员</p>
     * @return GetOrganizationMemberResponse
     */
    public GetOrganizationMemberResponse getOrganizationMember(String organizationId, String accountId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOrganizationMemberWithOptions(organizationId, accountId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取流水线</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPipelineResponse
     */
    public GetPipelineResponse getPipelineWithOptions(String organizationId, String pipelineId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPipeline"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelines/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetPipelineResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetPipelineResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取流水线</p>
     * @return GetPipelineResponse
     */
    public GetPipelineResponse getPipeline(String organizationId, String pipelineId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPipelineWithOptions(organizationId, pipelineId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取构建物下载链接</p>
     * 
     * @param request GetPipelineArtifactUrlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPipelineArtifactUrlResponse
     */
    public GetPipelineArtifactUrlResponse getPipelineArtifactUrlWithOptions(String organizationId, GetPipelineArtifactUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("filePath", request.filePath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPipelineArtifactUrl"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipeline/getArtifactDownloadUrl"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetPipelineArtifactUrlResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetPipelineArtifactUrlResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取构建物下载链接</p>
     * 
     * @param request GetPipelineArtifactUrlRequest
     * @return GetPipelineArtifactUrlResponse
     */
    public GetPipelineArtifactUrlResponse getPipelineArtifactUrl(String organizationId, GetPipelineArtifactUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPipelineArtifactUrlWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取emase构建物下载链接</p>
     * 
     * @param request GetPipelineEmasArtifactUrlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPipelineEmasArtifactUrlResponse
     */
    public GetPipelineEmasArtifactUrlResponse getPipelineEmasArtifactUrlWithOptions(String organizationId, String emasJobInstanceId, String md5, String pipelineId, String pipelineRunId, GetPipelineEmasArtifactUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceConnectionId)) {
            query.put("serviceConnectionId", request.serviceConnectionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPipelineEmasArtifactUrl"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipeline/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineId) + "/pipelineRun/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineRunId) + "/emas/artifact/" + com.aliyun.openapiutil.Client.getEncodeParam(emasJobInstanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(md5) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetPipelineEmasArtifactUrlResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetPipelineEmasArtifactUrlResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取emase构建物下载链接</p>
     * 
     * @param request GetPipelineEmasArtifactUrlRequest
     * @return GetPipelineEmasArtifactUrlResponse
     */
    public GetPipelineEmasArtifactUrlResponse getPipelineEmasArtifactUrl(String organizationId, String emasJobInstanceId, String md5, String pipelineId, String pipelineRunId, GetPipelineEmasArtifactUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPipelineEmasArtifactUrlWithOptions(organizationId, emasJobInstanceId, md5, pipelineId, pipelineRunId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取流水线分组</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPipelineGroupResponse
     */
    public GetPipelineGroupResponse getPipelineGroupWithOptions(String organizationId, String groupId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPipelineGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelineGroups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetPipelineGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetPipelineGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取流水线分组</p>
     * @return GetPipelineGroupResponse
     */
    public GetPipelineGroupResponse getPipelineGroup(String organizationId, String groupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPipelineGroupWithOptions(organizationId, groupId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取流水线运行信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPipelineRunResponse
     */
    public GetPipelineRunResponse getPipelineRunWithOptions(String organizationId, String pipelineId, String pipelineRunId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPipelineRun"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelines/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineId) + "/pipelineRuns/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineRunId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetPipelineRunResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetPipelineRunResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取流水线运行信息</p>
     * @return GetPipelineRunResponse
     */
    public GetPipelineRunResponse getPipelineRun(String organizationId, String pipelineId, String pipelineRunId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPipelineRunWithOptions(organizationId, pipelineId, pipelineRunId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取扫描报告下载链接</p>
     * 
     * @param request GetPipelineScanReportUrlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPipelineScanReportUrlResponse
     */
    public GetPipelineScanReportUrlResponse getPipelineScanReportUrlWithOptions(String organizationId, GetPipelineScanReportUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportPath)) {
            body.put("reportPath", request.reportPath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPipelineScanReportUrl"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipeline/getPipelineScanReportUrl"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetPipelineScanReportUrlResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetPipelineScanReportUrlResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取扫描报告下载链接</p>
     * 
     * @param request GetPipelineScanReportUrlRequest
     * @return GetPipelineScanReportUrlResponse
     */
    public GetPipelineScanReportUrlResponse getPipelineScanReportUrl(String organizationId, GetPipelineScanReportUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPipelineScanReportUrlWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据id获取项目详情-Projex</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectInfoResponse
     */
    public GetProjectInfoResponse getProjectInfoWithOptions(String organizationId, String projectId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectInfo"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/project/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetProjectInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>根据id获取项目详情-Projex</p>
     * @return GetProjectInfoResponse
     */
    public GetProjectInfoResponse getProjectInfo(String organizationId, String projectId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProjectInfoWithOptions(organizationId, projectId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询代码库成员</p>
     * 
     * @param request GetProjectMemberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectMemberResponse
     */
    public GetProjectMemberResponse getProjectMemberWithOptions(String repositoryId, String aliyunPk, GetProjectMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectMember"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/members/get/" + com.aliyun.openapiutil.Client.getEncodeParam(aliyunPk) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectMemberResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetProjectMemberResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询代码库成员</p>
     * 
     * @param request GetProjectMemberRequest
     * @return GetProjectMemberResponse
     */
    public GetProjectMemberResponse getProjectMember(String repositoryId, String aliyunPk, GetProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProjectMemberWithOptions(repositoryId, aliyunPk, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取研发阶段流水线运行实例</p>
     * 
     * @param request GetReleaseStagePipelineRunRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetReleaseStagePipelineRunResponse
     */
    public GetReleaseStagePipelineRunResponse getReleaseStagePipelineRunWithOptions(String appName, String releaseWorkflowSn, String releaseStageSn, String executionNumber, GetReleaseStagePipelineRunRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetReleaseStagePipelineRun"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/appstack/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/releaseWorkflows/" + com.aliyun.openapiutil.Client.getEncodeParam(releaseWorkflowSn) + "/releaseStages/" + com.aliyun.openapiutil.Client.getEncodeParam(releaseStageSn) + "/executions/" + com.aliyun.openapiutil.Client.getEncodeParam(executionNumber) + "%3AgetPipelineRun"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetReleaseStagePipelineRunResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetReleaseStagePipelineRunResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取研发阶段流水线运行实例</p>
     * 
     * @param request GetReleaseStagePipelineRunRequest
     * @return GetReleaseStagePipelineRunResponse
     */
    public GetReleaseStagePipelineRunResponse getReleaseStagePipelineRun(String appName, String releaseWorkflowSn, String releaseStageSn, String executionNumber, GetReleaseStagePipelineRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getReleaseStagePipelineRunWithOptions(appName, releaseWorkflowSn, releaseStageSn, executionNumber, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>使用代码库ID或路径查询代码库信息</p>
     * 
     * @param request GetRepositoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRepositoryResponse
     */
    public GetRepositoryResponse getRepositoryWithOptions(GetRepositoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identity)) {
            query.put("identity", request.identity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepository"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/get"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepositoryResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetRepositoryResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>使用代码库ID或路径查询代码库信息</p>
     * 
     * @param request GetRepositoryRequest
     * @return GetRepositoryResponse
     */
    public GetRepositoryResponse getRepository(GetRepositoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepositoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询代码库提交信息</p>
     * 
     * @param request GetRepositoryCommitRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRepositoryCommitResponse
     */
    public GetRepositoryCommitResponse getRepositoryCommitWithOptions(String repositoryId, String sha, GetRepositoryCommitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showSignature)) {
            query.put("showSignature", request.showSignature);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepositoryCommit"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/commits/" + com.aliyun.openapiutil.Client.getEncodeParam(sha) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepositoryCommitResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetRepositoryCommitResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询代码库提交信息</p>
     * 
     * @param request GetRepositoryCommitRequest
     * @return GetRepositoryCommitResponse
     */
    public GetRepositoryCommitResponse getRepositoryCommit(String repositoryId, String sha, GetRepositoryCommitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepositoryCommitWithOptions(repositoryId, sha, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个标签</p>
     * 
     * @param request GetRepositoryTagRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRepositoryTagResponse
     */
    public GetRepositoryTagResponse getRepositoryTagWithOptions(String repositoryId, GetRepositoryTagRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagName)) {
            query.put("tagName", request.tagName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepositoryTag"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/tag/info"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepositoryTagResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetRepositoryTagResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询单个标签</p>
     * 
     * @param request GetRepositoryTagRequest
     * @return GetRepositoryTagResponse
     */
    public GetRepositoryTagResponse getRepositoryTag(String repositoryId, GetRepositoryTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepositoryTagWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>预览代码片段</p>
     * 
     * @param request GetSearchCodePreviewRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSearchCodePreviewResponse
     */
    public GetSearchCodePreviewResponse getSearchCodePreviewWithOptions(GetSearchCodePreviewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docId)) {
            query.put("docId", request.docId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDsl)) {
            query.put("isDsl", request.isDsl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSearchCodePreview"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/search/code_preview"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetSearchCodePreviewResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetSearchCodePreviewResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>预览代码片段</p>
     * 
     * @param request GetSearchCodePreviewRequest
     * @return GetSearchCodePreviewResponse
     */
    public GetSearchCodePreviewResponse getSearchCodePreview(GetSearchCodePreviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSearchCodePreviewWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取迭代详情</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSprintInfoResponse
     */
    public GetSprintInfoResponse getSprintInfoWithOptions(String organizationId, String sprintId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSprintInfo"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/sprints/" + com.aliyun.openapiutil.Client.getEncodeParam(sprintId) + "/getSprintinfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetSprintInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetSprintInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取迭代详情</p>
     * @return GetSprintInfoResponse
     */
    public GetSprintInfoResponse getSprintInfo(String organizationId, String sprintId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSprintInfoWithOptions(organizationId, sprintId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取测试计划中的测试用例列表</p>
     * 
     * @param request GetTestResultListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTestResultListResponse
     */
    public GetTestResultListResponse getTestResultListWithOptions(String organizationId, String testPlanIdentifier, GetTestResultListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conditions)) {
            body.put("conditions", request.conditions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryIdentifier)) {
            body.put("directoryIdentifier", request.directoryIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTestResultList"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/testhub/testplan/" + com.aliyun.openapiutil.Client.getEncodeParam(testPlanIdentifier) + "/testresults"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetTestResultListResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetTestResultListResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取测试计划中的测试用例列表</p>
     * 
     * @param request GetTestResultListRequest
     * @return GetTestResultListResponse
     */
    public GetTestResultListResponse getTestResultList(String organizationId, String testPlanIdentifier, GetTestResultListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTestResultListWithOptions(organizationId, testPlanIdentifier, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取测试用例列表</p>
     * 
     * @param request GetTestcaseListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTestcaseListResponse
     */
    public GetTestcaseListResponse getTestcaseListWithOptions(String organizationId, GetTestcaseListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conditions)) {
            body.put("conditions", request.conditions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryIdentifier)) {
            body.put("directoryIdentifier", request.directoryIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResult)) {
            body.put("maxResult", request.maxResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceIdentifier)) {
            body.put("spaceIdentifier", request.spaceIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTestcaseList"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/testhub/testcases"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetTestcaseListResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetTestcaseListResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取测试用例列表</p>
     * 
     * @param request GetTestcaseListRequest
     * @return GetTestcaseListResponse
     */
    public GetTestcaseListResponse getTestcaseList(String organizationId, GetTestcaseListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTestcaseListWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询当前用户信息</p>
     * 
     * @param request GetUserInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserInfoResponse
     */
    public GetUserInfoResponse getUserInfoWithOptions(GetUserInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserInfo"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/users/current"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetUserInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询当前用户信息</p>
     * 
     * @param request GetUserInfoRequest
     * @return GetUserInfoResponse
     */
    public GetUserInfoResponse getUserInfo(GetUserInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取部署单信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVMDeployOrderResponse
     */
    public GetVMDeployOrderResponse getVMDeployOrderWithOptions(String organizationId, String pipelineId, String deployOrderId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVMDeployOrder"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelines/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineId) + "/deploy/" + com.aliyun.openapiutil.Client.getEncodeParam(deployOrderId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetVMDeployOrderResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetVMDeployOrderResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取部署单信息</p>
     * @return GetVMDeployOrderResponse
     */
    public GetVMDeployOrderResponse getVMDeployOrder(String organizationId, String pipelineId, String deployOrderId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getVMDeployOrderWithOptions(organizationId, pipelineId, deployOrderId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取变量组</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVariableGroupResponse
     */
    public GetVariableGroupResponse getVariableGroupWithOptions(String organizationId, String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVariableGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/variableGroups/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetVariableGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetVariableGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取变量组</p>
     * @return GetVariableGroupResponse
     */
    public GetVariableGroupResponse getVariableGroup(String organizationId, String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getVariableGroupWithOptions(organizationId, id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作项动态</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkItemActivityResponse
     */
    public GetWorkItemActivityResponse getWorkItemActivityWithOptions(String organizationId, String workitemId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkItemActivity"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/workitems/" + com.aliyun.openapiutil.Client.getEncodeParam(workitemId) + "/getActivity"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkItemActivityResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetWorkItemActivityResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取工作项动态</p>
     * @return GetWorkItemActivityResponse
     */
    public GetWorkItemActivityResponse getWorkItemActivity(String organizationId, String workitemId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkItemActivityWithOptions(organizationId, workitemId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据id获取工作项详情</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkItemInfoResponse
     */
    public GetWorkItemInfoResponse getWorkItemInfoWithOptions(String organizationId, String workitemId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkItemInfo"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/workitems/" + com.aliyun.openapiutil.Client.getEncodeParam(workitemId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkItemInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetWorkItemInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>根据id获取工作项详情</p>
     * @return GetWorkItemInfoResponse
     */
    public GetWorkItemInfoResponse getWorkItemInfo(String organizationId, String workitemId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkItemInfoWithOptions(organizationId, workitemId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作项工作流信息</p>
     * 
     * @param request GetWorkItemWorkFlowInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkItemWorkFlowInfoResponse
     */
    public GetWorkItemWorkFlowInfoResponse getWorkItemWorkFlowInfoWithOptions(String organizationId, String workitemId, GetWorkItemWorkFlowInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configurationId)) {
            query.put("configurationId", request.configurationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkItemWorkFlowInfo"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/workitems/" + com.aliyun.openapiutil.Client.getEncodeParam(workitemId) + "/getWorkflowInfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkItemWorkFlowInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetWorkItemWorkFlowInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取工作项工作流信息</p>
     * 
     * @param request GetWorkItemWorkFlowInfoRequest
     * @return GetWorkItemWorkFlowInfoResponse
     */
    public GetWorkItemWorkFlowInfoResponse getWorkItemWorkFlowInfo(String organizationId, String workitemId, GetWorkItemWorkFlowInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkItemWorkFlowInfoWithOptions(organizationId, workitemId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取附件上传的元信息</p>
     * 
     * @param request GetWorkitemAttachmentCreatemetaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkitemAttachmentCreatemetaResponse
     */
    public GetWorkitemAttachmentCreatemetaResponse getWorkitemAttachmentCreatemetaWithOptions(String organizationId, String workitemIdentifier, GetWorkitemAttachmentCreatemetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("fileName", request.fileName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkitemAttachmentCreatemeta"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/workitem/" + com.aliyun.openapiutil.Client.getEncodeParam(workitemIdentifier) + "/attachment/createmeta"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkitemAttachmentCreatemetaResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetWorkitemAttachmentCreatemetaResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取附件上传的元信息</p>
     * 
     * @param request GetWorkitemAttachmentCreatemetaRequest
     * @return GetWorkitemAttachmentCreatemetaResponse
     */
    public GetWorkitemAttachmentCreatemetaResponse getWorkitemAttachmentCreatemeta(String organizationId, String workitemIdentifier, GetWorkitemAttachmentCreatemetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkitemAttachmentCreatemetaWithOptions(organizationId, workitemIdentifier, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获得所有评论</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkitemCommentListResponse
     */
    public GetWorkitemCommentListResponse getWorkitemCommentListWithOptions(String organizationId, String workitemId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkitemCommentList"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/workitems/" + com.aliyun.openapiutil.Client.getEncodeParam(workitemId) + "/commentList"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkitemCommentListResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetWorkitemCommentListResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获得所有评论</p>
     * @return GetWorkitemCommentListResponse
     */
    public GetWorkitemCommentListResponse getWorkitemCommentList(String organizationId, String workitemId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkitemCommentListWithOptions(organizationId, workitemId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作项文件信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkitemFileResponse
     */
    public GetWorkitemFileResponse getWorkitemFileWithOptions(String organizationId, String workitemIdentifier, String fileIdentifier, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkitemFile"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/workitem/" + com.aliyun.openapiutil.Client.getEncodeParam(workitemIdentifier) + "/files/" + com.aliyun.openapiutil.Client.getEncodeParam(fileIdentifier) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkitemFileResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetWorkitemFileResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取工作项文件信息</p>
     * @return GetWorkitemFileResponse
     */
    public GetWorkitemFileResponse getWorkitemFile(String organizationId, String workitemIdentifier, String fileIdentifier) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkitemFileWithOptions(organizationId, workitemIdentifier, fileIdentifier, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获得一个工作项的指定关联项</p>
     * 
     * @param request GetWorkitemRelationsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkitemRelationsResponse
     */
    public GetWorkitemRelationsResponse getWorkitemRelationsWithOptions(String organizationId, String workitemId, GetWorkitemRelationsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.relationType)) {
            query.put("relationType", request.relationType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkitemRelations"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/workitems/" + com.aliyun.openapiutil.Client.getEncodeParam(workitemId) + "/getRelations"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkitemRelationsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetWorkitemRelationsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获得一个工作项的指定关联项</p>
     * 
     * @param request GetWorkitemRelationsRequest
     * @return GetWorkitemRelationsResponse
     */
    public GetWorkitemRelationsResponse getWorkitemRelations(String organizationId, String workitemId, GetWorkitemRelationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkitemRelationsWithOptions(organizationId, workitemId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获得一个企业下所有工时类型</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkitemTimeTypeListResponse
     */
    public GetWorkitemTimeTypeListResponse getWorkitemTimeTypeListWithOptions(String organizationId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkitemTimeTypeList"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/workitems/type/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkitemTimeTypeListResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetWorkitemTimeTypeListResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获得一个企业下所有工时类型</p>
     * @return GetWorkitemTimeTypeListResponse
     */
    public GetWorkitemTimeTypeListResponse getWorkitemTimeTypeList(String organizationId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkitemTimeTypeListWithOptions(organizationId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>加入流水线分组</p>
     * 
     * @param request JoinPipelineGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return JoinPipelineGroupResponse
     */
    public JoinPipelineGroupResponse joinPipelineGroupWithOptions(String organizationId, JoinPipelineGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("groupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineIds)) {
            query.put("pipelineIds", request.pipelineIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "JoinPipelineGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelineGroups/join"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new JoinPipelineGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new JoinPipelineGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>加入流水线分组</p>
     * 
     * @param request JoinPipelineGroupRequest
     * @return JoinPipelineGroupResponse
     */
    public JoinPipelineGroupResponse joinPipelineGroup(String organizationId, JoinPipelineGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.joinPipelineGroupWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>关联合并请求Label</p>
     * 
     * @param request LinkMergeRequestLabelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return LinkMergeRequestLabelResponse
     */
    public LinkMergeRequestLabelResponse linkMergeRequestLabelWithOptions(LinkMergeRequestLabelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localId)) {
            query.put("localId", request.localId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repositoryIdentity)) {
            query.put("repositoryIdentity", request.repositoryIdentity);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labelIds)) {
            body.put("labelIds", request.labelIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LinkMergeRequestLabel"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/merge_requests/link_labels"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new LinkMergeRequestLabelResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new LinkMergeRequestLabelResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>关联合并请求Label</p>
     * 
     * @param request LinkMergeRequestLabelRequest
     * @return LinkMergeRequestLabelResponse
     */
    public LinkMergeRequestLabelResponse linkMergeRequestLabel(LinkMergeRequestLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.linkMergeRequestLabelWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查找应用下所有的研发流程</p>
     * 
     * @param request ListAllReleaseWorkflowsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAllReleaseWorkflowsResponse
     */
    public ListAllReleaseWorkflowsResponse listAllReleaseWorkflowsWithOptions(String appName, ListAllReleaseWorkflowsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAllReleaseWorkflows"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/appstack/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/releaseWorkflows"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListAllReleaseWorkflowsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListAllReleaseWorkflowsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查找应用下所有的研发流程</p>
     * 
     * @param request ListAllReleaseWorkflowsRequest
     * @return ListAllReleaseWorkflowsResponse
     */
    public ListAllReleaseWorkflowsResponse listAllReleaseWorkflows(String appName, ListAllReleaseWorkflowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAllReleaseWorkflowsWithOptions(appName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询研发阶段执行记录集成变更信息</p>
     * 
     * @param request ListAppReleaseStageExecutionIntegratedMetadataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppReleaseStageExecutionIntegratedMetadataResponse
     */
    public ListAppReleaseStageExecutionIntegratedMetadataResponse listAppReleaseStageExecutionIntegratedMetadataWithOptions(String appName, String releaseWorkflowSn, String releaseStageSn, String executionNumber, ListAppReleaseStageExecutionIntegratedMetadataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppReleaseStageExecutionIntegratedMetadata"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/appstack/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/releaseWorkflows/" + com.aliyun.openapiutil.Client.getEncodeParam(releaseWorkflowSn) + "/releaseStages/" + com.aliyun.openapiutil.Client.getEncodeParam(releaseStageSn) + "/executions/" + com.aliyun.openapiutil.Client.getEncodeParam(executionNumber) + "/integratedMetadata"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppReleaseStageExecutionIntegratedMetadataResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListAppReleaseStageExecutionIntegratedMetadataResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询研发阶段执行记录集成变更信息</p>
     * 
     * @param request ListAppReleaseStageExecutionIntegratedMetadataRequest
     * @return ListAppReleaseStageExecutionIntegratedMetadataResponse
     */
    public ListAppReleaseStageExecutionIntegratedMetadataResponse listAppReleaseStageExecutionIntegratedMetadata(String appName, String releaseWorkflowSn, String releaseStageSn, String executionNumber, ListAppReleaseStageExecutionIntegratedMetadataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppReleaseStageExecutionIntegratedMetadataWithOptions(appName, releaseWorkflowSn, releaseStageSn, executionNumber, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询研发阶段执行记录</p>
     * 
     * @param request ListAppReleaseStageExecutionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppReleaseStageExecutionsResponse
     */
    public ListAppReleaseStageExecutionsResponse listAppReleaseStageExecutionsWithOptions(String appName, String releaseWorkflowSn, String releaseStageSn, ListAppReleaseStageExecutionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pagination)) {
            query.put("pagination", request.pagination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.perPage)) {
            query.put("perPage", request.perPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("sort", request.sort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppReleaseStageExecutions"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/appstack/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/releaseWorkflows/" + com.aliyun.openapiutil.Client.getEncodeParam(releaseWorkflowSn) + "/releaseStages/" + com.aliyun.openapiutil.Client.getEncodeParam(releaseStageSn) + "/executions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppReleaseStageExecutionsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListAppReleaseStageExecutionsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>批量查询研发阶段执行记录</p>
     * 
     * @param request ListAppReleaseStageExecutionsRequest
     * @return ListAppReleaseStageExecutionsResponse
     */
    public ListAppReleaseStageExecutionsResponse listAppReleaseStageExecutions(String appName, String releaseWorkflowSn, String releaseStageSn, ListAppReleaseStageExecutionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppReleaseStageExecutionsWithOptions(appName, releaseWorkflowSn, releaseStageSn, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查找应用成员列表</p>
     * 
     * @param request ListApplicationMembersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationMembersResponse
     */
    public ListApplicationMembersResponse listApplicationMembersWithOptions(String appName, ListApplicationMembersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationMembers"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/appstack/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/members"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationMembersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListApplicationMembersResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查找应用成员列表</p>
     * 
     * @param request ListApplicationMembersRequest
     * @return ListApplicationMembersResponse
     */
    public ListApplicationMembersResponse listApplicationMembers(String appName, ListApplicationMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApplicationMembersWithOptions(appName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查找应用详情</p>
     * 
     * @param request ListApplicationsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationsResponse
     */
    public ListApplicationsResponse listApplicationsWithOptions(ListApplicationsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pagination)) {
            query.put("pagination", request.pagination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.perPage)) {
            query.put("perPage", request.perPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("sort", request.sort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplications"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/appstack/apps%3Asearch"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListApplicationsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>分页查找应用详情</p>
     * 
     * @param request ListApplicationsRequest
     * @return ListApplicationsResponse
     */
    public ListApplicationsResponse listApplications(ListApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApplicationsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询变更研发流程运行记录</p>
     * 
     * @param request ListChangeRequestWorkflowExecutionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListChangeRequestWorkflowExecutionsResponse
     */
    public ListChangeRequestWorkflowExecutionsResponse listChangeRequestWorkflowExecutionsWithOptions(String appName, String sn, ListChangeRequestWorkflowExecutionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.perPage)) {
            query.put("perPage", request.perPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseStageSn)) {
            query.put("releaseStageSn", request.releaseStageSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseWorkflowSn)) {
            query.put("releaseWorkflowSn", request.releaseWorkflowSn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("sort", request.sort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChangeRequestWorkflowExecutions"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/appstack/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/changeRequests/" + com.aliyun.openapiutil.Client.getEncodeParam(sn) + "/executions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListChangeRequestWorkflowExecutionsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListChangeRequestWorkflowExecutionsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询变更研发流程运行记录</p>
     * 
     * @param request ListChangeRequestWorkflowExecutionsRequest
     * @return ListChangeRequestWorkflowExecutionsResponse
     */
    public ListChangeRequestWorkflowExecutionsResponse listChangeRequestWorkflowExecutions(String appName, String sn, ListChangeRequestWorkflowExecutionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listChangeRequestWorkflowExecutionsWithOptions(appName, sn, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询变更列表</p>
     * 
     * @param tmpReq ListChangeRequestsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListChangeRequestsResponse
     */
    public ListChangeRequestsResponse listChangeRequestsWithOptions(String appName, ListChangeRequestsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListChangeRequestsShrinkRequest request = new ListChangeRequestsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.appNameList)) {
            request.appNameListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.appNameList, "appNameList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ownerIdList)) {
            request.ownerIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ownerIdList, "ownerIdList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.stateList)) {
            request.stateListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.stateList, "stateList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appNameListShrink)) {
            query.put("appNameList", request.appNameListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayNameKeyword)) {
            query.put("displayNameKeyword", request.displayNameKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerIdListShrink)) {
            query.put("ownerIdList", request.ownerIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pagination)) {
            query.put("pagination", request.pagination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.perPage)) {
            query.put("perPage", request.perPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stateListShrink)) {
            query.put("stateList", request.stateListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChangeRequests"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/appstack/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/changeRequests"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListChangeRequestsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListChangeRequestsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询变更列表</p>
     * 
     * @param request ListChangeRequestsRequest
     * @return ListChangeRequestsResponse
     */
    public ListChangeRequestsResponse listChangeRequests(String appName, ListChangeRequestsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listChangeRequestsWithOptions(appName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询检查运行列表</p>
     * 
     * @param request ListCheckRunsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCheckRunsResponse
     */
    public ListCheckRunsResponse listCheckRunsWithOptions(ListCheckRunsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ref)) {
            query.put("ref", request.ref);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repositoryIdentity)) {
            query.put("repositoryIdentity", request.repositoryIdentity);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCheckRuns"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/check_runs/list_check_runs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListCheckRunsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListCheckRunsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询检查运行列表</p>
     * 
     * @param request ListCheckRunsRequest
     * @return ListCheckRunsResponse
     */
    public ListCheckRunsResponse listCheckRuns(ListCheckRunsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCheckRunsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询提交状态列表</p>
     * 
     * @param request ListCommitStatusesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCommitStatusesResponse
     */
    public ListCommitStatusesResponse listCommitStatusesWithOptions(ListCommitStatusesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repositoryIdentity)) {
            query.put("repositoryIdentity", request.repositoryIdentity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sha)) {
            query.put("sha", request.sha);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCommitStatuses"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/repository/commit_statuses/list_commit_statuses"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListCommitStatusesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListCommitStatusesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询提交状态列表</p>
     * 
     * @param request ListCommitStatusesRequest
     * @return ListCommitStatusesResponse
     */
    public ListCommitStatusesResponse listCommitStatuses(ListCommitStatusesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCommitStatusesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取标签分类列表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFlowTagGroupsResponse
     */
    public ListFlowTagGroupsResponse listFlowTagGroupsWithOptions(String organizationId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlowTagGroups"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/flow/tagGroups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowTagGroupsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListFlowTagGroupsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取标签分类列表</p>
     * @return ListFlowTagGroupsResponse
     */
    public ListFlowTagGroupsResponse listFlowTagGroups(String organizationId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFlowTagGroupsWithOptions(organizationId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询组成员列表</p>
     * 
     * @param request ListGroupMemberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGroupMemberResponse
     */
    public ListGroupMemberResponse listGroupMemberWithOptions(String groupId, ListGroupMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroupMember"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListGroupMemberResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListGroupMemberResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询组成员列表</p>
     * 
     * @param request ListGroupMemberRequest
     * @return ListGroupMemberResponse
     */
    public ListGroupMemberResponse listGroupMember(String groupId, ListGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGroupMemberWithOptions(groupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询代码组下的库列表</p>
     * 
     * @param request ListGroupRepositoriesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGroupRepositoriesResponse
     */
    public ListGroupRepositoriesResponse listGroupRepositoriesWithOptions(String groupId, ListGroupRepositoriesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("search", request.search);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroupRepositories"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/projects"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListGroupRepositoriesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListGroupRepositoriesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询代码组下的库列表</p>
     * 
     * @param request ListGroupRepositoriesRequest
     * @return ListGroupRepositoriesResponse
     */
    public ListGroupRepositoriesResponse listGroupRepositories(String groupId, ListGroupRepositoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGroupRepositoriesWithOptions(groupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取主机组列表</p>
     * 
     * @param request ListHostGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHostGroupsResponse
     */
    public ListHostGroupsResponse listHostGroupsWithOptions(String organizationId, ListHostGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createEndTime)) {
            query.put("createEndTime", request.createEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createStartTime)) {
            query.put("createStartTime", request.createStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorAccountIds)) {
            query.put("creatorAccountIds", request.creatorAccountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            query.put("ids", request.ids);
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

        if (!com.aliyun.teautil.Common.isUnset(request.pageOrder)) {
            query.put("pageOrder", request.pageOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSort)) {
            query.put("pageSort", request.pageSort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHostGroups"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/hostGroups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListHostGroupsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListHostGroupsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取主机组列表</p>
     * 
     * @param request ListHostGroupsRequest
     * @return ListHostGroupsResponse
     */
    public ListHostGroupsResponse listHostGroups(String organizationId, ListHostGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listHostGroupsWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>当前用户加入的企业列表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJoinedOrganizationsResponse
     */
    public ListJoinedOrganizationsResponse listJoinedOrganizationsWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJoinedOrganizations"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/users/joinedOrgs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListJoinedOrganizationsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListJoinedOrganizationsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>当前用户加入的企业列表</p>
     * @return ListJoinedOrganizationsResponse
     */
    public ListJoinedOrganizationsResponse listJoinedOrganizations() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listJoinedOrganizationsWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询合并请求评论列表</p>
     * 
     * @param request ListMergeRequestCommentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMergeRequestCommentsResponse
     */
    public ListMergeRequestCommentsResponse listMergeRequestCommentsWithOptions(ListMergeRequestCommentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localId)) {
            query.put("localId", request.localId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repositoryIdentity)) {
            query.put("repositoryIdentity", request.repositoryIdentity);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commentType)) {
            body.put("commentType", request.commentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            body.put("filePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.patchSetBizIds)) {
            body.put("patchSetBizIds", request.patchSetBizIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resolved)) {
            body.put("resolved", request.resolved);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            body.put("state", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMergeRequestComments"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/merge_requests/comments/list_comments"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListMergeRequestCommentsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListMergeRequestCommentsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询合并请求评论列表</p>
     * 
     * @param request ListMergeRequestCommentsRequest
     * @return ListMergeRequestCommentsResponse
     */
    public ListMergeRequestCommentsResponse listMergeRequestComments(ListMergeRequestCommentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMergeRequestCommentsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询合并请求文件已读列表</p>
     * 
     * @param request ListMergeRequestFilesReadsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMergeRequestFilesReadsResponse
     */
    public ListMergeRequestFilesReadsResponse listMergeRequestFilesReadsWithOptions(ListMergeRequestFilesReadsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromPatchSetBizId)) {
            query.put("fromPatchSetBizId", request.fromPatchSetBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localId)) {
            query.put("localId", request.localId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repositoryIdentity)) {
            query.put("repositoryIdentity", request.repositoryIdentity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toPatchSetBizId)) {
            query.put("toPatchSetBizId", request.toPatchSetBizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMergeRequestFilesReads"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/merge_requests/diffs/files_read_infos"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListMergeRequestFilesReadsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListMergeRequestFilesReadsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询合并请求文件已读列表</p>
     * 
     * @param request ListMergeRequestFilesReadsRequest
     * @return ListMergeRequestFilesReadsResponse
     */
    public ListMergeRequestFilesReadsResponse listMergeRequestFilesReads(ListMergeRequestFilesReadsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMergeRequestFilesReadsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询合并请求Label列表</p>
     * 
     * @param request ListMergeRequestLabelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMergeRequestLabelsResponse
     */
    public ListMergeRequestLabelsResponse listMergeRequestLabelsWithOptions(ListMergeRequestLabelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localId)) {
            query.put("localId", request.localId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repositoryIdentity)) {
            query.put("repositoryIdentity", request.repositoryIdentity);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMergeRequestLabels"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/merge_requests/labels"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListMergeRequestLabelsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListMergeRequestLabelsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询合并请求Label列表</p>
     * 
     * @param request ListMergeRequestLabelsRequest
     * @return ListMergeRequestLabelsResponse
     */
    public ListMergeRequestLabelsResponse listMergeRequestLabels(ListMergeRequestLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMergeRequestLabelsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询合并请求的版本列表</p>
     * 
     * @param request ListMergeRequestPatchSetsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMergeRequestPatchSetsResponse
     */
    public ListMergeRequestPatchSetsResponse listMergeRequestPatchSetsWithOptions(ListMergeRequestPatchSetsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localId)) {
            query.put("localId", request.localId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repositoryIdentity)) {
            query.put("repositoryIdentity", request.repositoryIdentity);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMergeRequestPatchSets"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/merge_requests/diffs/list_patchsets"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListMergeRequestPatchSetsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListMergeRequestPatchSetsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询合并请求的版本列表</p>
     * 
     * @param request ListMergeRequestPatchSetsRequest
     * @return ListMergeRequestPatchSetsResponse
     */
    public ListMergeRequestPatchSetsResponse listMergeRequestPatchSets(ListMergeRequestPatchSetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMergeRequestPatchSetsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询代码评审列表</p>
     * 
     * @param request ListMergeRequestsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMergeRequestsResponse
     */
    public ListMergeRequestsResponse listMergeRequestsWithOptions(ListMergeRequestsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorIds)) {
            query.put("authorIds", request.authorIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdAfter)) {
            query.put("createdAfter", request.createdAfter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdBefore)) {
            query.put("createdBefore", request.createdBefore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupIds)) {
            query.put("groupIds", request.groupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelIds)) {
            query.put("labelIds", request.labelIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIds)) {
            query.put("projectIds", request.projectIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reviewerIds)) {
            query.put("reviewerIds", request.reviewerIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("search", request.search);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("state", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMergeRequests"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/merge_requests/advanced_search"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListMergeRequestsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListMergeRequestsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询代码评审列表</p>
     * 
     * @param request ListMergeRequestsRequest
     * @return ListMergeRequestsResponse
     */
    public ListMergeRequestsResponse listMergeRequests(ListMergeRequestsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMergeRequestsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取企业成员列表</p>
     * 
     * @param request ListOrganizationMembersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOrganizationMembersResponse
     */
    public ListOrganizationMembersResponse listOrganizationMembersWithOptions(String organizationId, ListOrganizationMembersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.containsExternInfo)) {
            query.put("containsExternInfo", request.containsExternInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externUid)) {
            query.put("externUid", request.externUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.joinTimeFrom)) {
            query.put("joinTimeFrom", request.joinTimeFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.joinTimeTo)) {
            query.put("joinTimeTo", request.joinTimeTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationMemberName)) {
            query.put("organizationMemberName", request.organizationMemberName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provider)) {
            query.put("provider", request.provider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("state", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOrganizationMembers"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/members"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListOrganizationMembersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListOrganizationMembersResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取企业成员列表</p>
     * 
     * @param request ListOrganizationMembersRequest
     * @return ListOrganizationMembersResponse
     */
    public ListOrganizationMembersResponse listOrganizationMembers(String organizationId, ListOrganizationMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOrganizationMembersWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户企业列表</p>
     * 
     * @param request ListOrganizationsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOrganizationsResponse
     */
    public ListOrganizationsResponse listOrganizationsWithOptions(ListOrganizationsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessLevel)) {
            query.put("accessLevel", request.accessLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minAccessLevel)) {
            query.put("minAccessLevel", request.minAccessLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOrganizations"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organizations/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListOrganizationsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListOrganizationsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询用户企业列表</p>
     * 
     * @param request ListOrganizationsRequest
     * @return ListOrganizationsResponse
     */
    public ListOrganizationsResponse listOrganizations(ListOrganizationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOrganizationsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取流水线分组下流水线列表列表</p>
     * 
     * @param request ListPipelineGroupPipelinesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPipelineGroupPipelinesResponse
     */
    public ListPipelineGroupPipelinesResponse listPipelineGroupPipelinesWithOptions(String organizationId, String groupId, ListPipelineGroupPipelinesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createEndTime)) {
            query.put("createEndTime", request.createEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createStartTime)) {
            query.put("createStartTime", request.createStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeEndTime)) {
            query.put("executeEndTime", request.executeEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeStartTime)) {
            query.put("executeStartTime", request.executeStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineName)) {
            query.put("pipelineName", request.pipelineName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultStatusList)) {
            query.put("resultStatusList", request.resultStatusList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPipelineGroupPipelines"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelineGroups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/pipelines"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListPipelineGroupPipelinesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListPipelineGroupPipelinesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取流水线分组下流水线列表列表</p>
     * 
     * @param request ListPipelineGroupPipelinesRequest
     * @return ListPipelineGroupPipelinesResponse
     */
    public ListPipelineGroupPipelinesResponse listPipelineGroupPipelines(String organizationId, String groupId, ListPipelineGroupPipelinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelineGroupPipelinesWithOptions(organizationId, groupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取流水线分组列表</p>
     * 
     * @param request ListPipelineGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPipelineGroupsResponse
     */
    public ListPipelineGroupsResponse listPipelineGroupsWithOptions(String organizationId, ListPipelineGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPipelineGroups"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelineGroups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListPipelineGroupsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListPipelineGroupsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取流水线分组列表</p>
     * 
     * @param request ListPipelineGroupsRequest
     * @return ListPipelineGroupsResponse
     */
    public ListPipelineGroupsResponse listPipelineGroups(String organizationId, ListPipelineGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelineGroupsWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取流水线运行过的任务历史</p>
     * 
     * @param request ListPipelineJobHistorysRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPipelineJobHistorysResponse
     */
    public ListPipelineJobHistorysResponse listPipelineJobHistorysWithOptions(String organizationId, String pipelineId, ListPipelineJobHistorysRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPipelineJobHistorys"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipeline/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineId) + "/job/historys"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListPipelineJobHistorysResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListPipelineJobHistorysResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取流水线运行过的任务历史</p>
     * 
     * @param request ListPipelineJobHistorysRequest
     * @return ListPipelineJobHistorysResponse
     */
    public ListPipelineJobHistorysResponse listPipelineJobHistorys(String organizationId, String pipelineId, ListPipelineJobHistorysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelineJobHistorysWithOptions(organizationId, pipelineId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取流水线运行过的任务</p>
     * 
     * @param request ListPipelineJobsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPipelineJobsResponse
     */
    public ListPipelineJobsResponse listPipelineJobsWithOptions(String organizationId, String pipelineId, ListPipelineJobsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("category", request.category);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPipelineJobs"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipeline/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineId) + "/jobs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListPipelineJobsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListPipelineJobsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取流水线运行过的任务</p>
     * 
     * @param request ListPipelineJobsRequest
     * @return ListPipelineJobsResponse
     */
    public ListPipelineJobsResponse listPipelineJobs(String organizationId, String pipelineId, ListPipelineJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelineJobsWithOptions(organizationId, pipelineId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取流水线关联列表</p>
     * 
     * @param request ListPipelineRelationsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPipelineRelationsResponse
     */
    public ListPipelineRelationsResponse listPipelineRelationsWithOptions(String organizationId, String pipelineId, ListPipelineRelationsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.relObjectType)) {
            query.put("relObjectType", request.relObjectType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPipelineRelations"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineId) + "/pipelineRelations"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListPipelineRelationsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListPipelineRelationsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取流水线关联列表</p>
     * 
     * @param request ListPipelineRelationsRequest
     * @return ListPipelineRelationsResponse
     */
    public ListPipelineRelationsResponse listPipelineRelations(String organizationId, String pipelineId, ListPipelineRelationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelineRelationsWithOptions(organizationId, pipelineId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取流水线运行历史</p>
     * 
     * @param request ListPipelineRunsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPipelineRunsResponse
     */
    public ListPipelineRunsResponse listPipelineRunsWithOptions(String organizationId, String pipelineId, ListPipelineRunsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerMode)) {
            query.put("triggerMode", request.triggerMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPipelineRuns"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelines/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineId) + "/pipelineRuns"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListPipelineRunsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListPipelineRunsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取流水线运行历史</p>
     * 
     * @param request ListPipelineRunsRequest
     * @return ListPipelineRunsResponse
     */
    public ListPipelineRunsResponse listPipelineRuns(String organizationId, String pipelineId, ListPipelineRunsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelineRunsWithOptions(organizationId, pipelineId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取流水线列表</p>
     * 
     * @param request ListPipelinesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPipelinesResponse
     */
    public ListPipelinesResponse listPipelinesWithOptions(String organizationId, ListPipelinesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createEndTime)) {
            query.put("createEndTime", request.createEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createStartTime)) {
            query.put("createStartTime", request.createStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorAccountIds)) {
            query.put("creatorAccountIds", request.creatorAccountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeAccountIds)) {
            query.put("executeAccountIds", request.executeAccountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeEndTime)) {
            query.put("executeEndTime", request.executeEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeStartTime)) {
            query.put("executeStartTime", request.executeStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineName)) {
            query.put("pipelineName", request.pipelineName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusList)) {
            query.put("statusList", request.statusList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPipelines"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelines"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListPipelinesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListPipelinesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取流水线列表</p>
     * 
     * @param request ListPipelinesRequest
     * @return ListPipelinesResponse
     */
    public ListPipelinesResponse listPipelines(String organizationId, ListPipelinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelinesWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询代码库Label列表</p>
     * 
     * @param request ListProjectLabelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectLabelsResponse
     */
    public ListProjectLabelsResponse listProjectLabelsWithOptions(ListProjectLabelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repositoryIdentity)) {
            query.put("repositoryIdentity", request.repositoryIdentity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("search", request.search);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withCounts)) {
            query.put("withCounts", request.withCounts);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectLabels"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/labels"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectLabelsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListProjectLabelsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询代码库Label列表</p>
     * 
     * @param request ListProjectLabelsRequest
     * @return ListProjectLabelsResponse
     */
    public ListProjectLabelsResponse listProjectLabels(ListProjectLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProjectLabelsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据项目id获取项目所以成员</p>
     * 
     * @param request ListProjectMembersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectMembersResponse
     */
    public ListProjectMembersResponse listProjectMembersWithOptions(String organizationId, String projectId, ListProjectMembersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("targetType", request.targetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectMembers"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/listMembers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectMembersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListProjectMembersResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>根据项目id获取项目所以成员</p>
     * 
     * @param request ListProjectMembersRequest
     * @return ListProjectMembersResponse
     */
    public ListProjectMembersResponse listProjectMembers(String organizationId, String projectId, ListProjectMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProjectMembersWithOptions(organizationId, projectId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取项目模板列表</p>
     * 
     * @param request ListProjectTemplatesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectTemplatesResponse
     */
    public ListProjectTemplatesResponse listProjectTemplatesWithOptions(String organizationId, ListProjectTemplatesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("category", request.category);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectTemplates"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/projects/listTemplates"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectTemplatesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListProjectTemplatesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取项目模板列表</p>
     * 
     * @param request ListProjectTemplatesRequest
     * @return ListProjectTemplatesResponse
     */
    public ListProjectTemplatesResponse listProjectTemplates(String organizationId, ListProjectTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProjectTemplatesWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取项目下开启的工作项类型</p>
     * 
     * @param request ListProjectWorkitemTypesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectWorkitemTypesResponse
     */
    public ListProjectWorkitemTypesResponse listProjectWorkitemTypesWithOptions(String organizationId, String projectId, ListProjectWorkitemTypesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceType)) {
            query.put("spaceType", request.spaceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectWorkitemTypes"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/getWorkitemType"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectWorkitemTypesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListProjectWorkitemTypesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取项目下开启的工作项类型</p>
     * 
     * @param request ListProjectWorkitemTypesRequest
     * @return ListProjectWorkitemTypesResponse
     */
    public ListProjectWorkitemTypesResponse listProjectWorkitemTypes(String organizationId, String projectId, ListProjectWorkitemTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProjectWorkitemTypesWithOptions(organizationId, projectId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取项目列表</p>
     * 
     * @param request ListProjectsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjectsWithOptions(String organizationId, ListProjectsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conditions)) {
            query.put("conditions", request.conditions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraConditions)) {
            query.put("extraConditions", request.extraConditions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("scope", request.scope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjects"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/listProjects"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListProjectsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取项目列表</p>
     * 
     * @param request ListProjectsRequest
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjects(String organizationId, ListProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProjectsWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询保护分支列表</p>
     * 
     * @param request ListProtectedBranchesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProtectedBranchesResponse
     */
    public ListProtectedBranchesResponse listProtectedBranchesWithOptions(String repositoryId, ListProtectedBranchesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProtectedBranches"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/protect_branches"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListProtectedBranchesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListProtectedBranchesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询保护分支列表</p>
     * 
     * @param request ListProtectedBranchesRequest
     * @return ListProtectedBranchesResponse
     */
    public ListProtectedBranchesResponse listProtectedBranches(String repositoryId, ListProtectedBranchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProtectedBranchesWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询推送规则列表</p>
     * 
     * @param request ListPushRulesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPushRulesResponse
     */
    public ListPushRulesResponse listPushRulesWithOptions(String repositoryId, ListPushRulesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPushRules"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/push_rule/push_rules/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListPushRulesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListPushRulesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询推送规则列表</p>
     * 
     * @param request ListPushRulesRequest
     * @return ListPushRulesResponse
     */
    public ListPushRulesResponse listPushRules(String repositoryId, ListPushRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPushRulesWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询代码库列表</p>
     * 
     * @param request ListRepositoriesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRepositoriesResponse
     */
    public ListRepositoriesResponse listRepositoriesWithOptions(ListRepositoriesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.archived)) {
            query.put("archived", request.archived);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minAccessLevel)) {
            query.put("minAccessLevel", request.minAccessLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.perPage)) {
            query.put("perPage", request.perPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("search", request.search);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("sort", request.sort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepositories"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoriesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListRepositoriesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询代码库列表</p>
     * 
     * @param request ListRepositoriesRequest
     * @return ListRepositoriesResponse
     */
    public ListRepositoriesResponse listRepositories(ListRepositoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoriesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询分支列表</p>
     * 
     * @param request ListRepositoryBranchesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRepositoryBranchesResponse
     */
    public ListRepositoryBranchesResponse listRepositoryBranchesWithOptions(String repositoryId, ListRepositoryBranchesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("search", request.search);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("sort", request.sort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepositoryBranches"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/branches"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoryBranchesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListRepositoryBranchesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询分支列表</p>
     * 
     * @param request ListRepositoryBranchesRequest
     * @return ListRepositoryBranchesResponse
     */
    public ListRepositoryBranchesResponse listRepositoryBranches(String repositoryId, ListRepositoryBranchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryBranchesWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询代码库单个提交（Commit）的提交内容</p>
     * 
     * @param request ListRepositoryCommitDiffRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRepositoryCommitDiffResponse
     */
    public ListRepositoryCommitDiffResponse listRepositoryCommitDiffWithOptions(String repositoryId, String sha, ListRepositoryCommitDiffRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contextLine)) {
            query.put("contextLine", request.contextLine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepositoryCommitDiff"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/commits/" + com.aliyun.openapiutil.Client.getEncodeParam(sha) + "/diff"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoryCommitDiffResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListRepositoryCommitDiffResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询代码库单个提交（Commit）的提交内容</p>
     * 
     * @param request ListRepositoryCommitDiffRequest
     * @return ListRepositoryCommitDiffResponse
     */
    public ListRepositoryCommitDiffResponse listRepositoryCommitDiff(String repositoryId, String sha, ListRepositoryCommitDiffRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryCommitDiffWithOptions(repositoryId, sha, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询代码库提交历史</p>
     * 
     * @param request ListRepositoryCommitsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRepositoryCommitsResponse
     */
    public ListRepositoryCommitsResponse listRepositoryCommitsWithOptions(String repositoryId, ListRepositoryCommitsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("end", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refName)) {
            query.put("refName", request.refName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("search", request.search);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showCommentsCount)) {
            query.put("showCommentsCount", request.showCommentsCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showSignature)) {
            query.put("showSignature", request.showSignature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepositoryCommits"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/commits"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoryCommitsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListRepositoryCommitsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询代码库提交历史</p>
     * 
     * @param request ListRepositoryCommitsRequest
     * @return ListRepositoryCommitsResponse
     */
    public ListRepositoryCommitsResponse listRepositoryCommits(String repositoryId, ListRepositoryCommitsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryCommitsWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询代码组列表</p>
     * 
     * @param request ListRepositoryGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRepositoryGroupsResponse
     */
    public ListRepositoryGroupsResponse listRepositoryGroupsWithOptions(ListRepositoryGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includePersonal)) {
            query.put("includePersonal", request.includePersonal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            query.put("parentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("search", request.search);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("sort", request.sort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepositoryGroups"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/groups/get/all"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoryGroupsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListRepositoryGroupsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询代码组列表</p>
     * 
     * @param request ListRepositoryGroupsRequest
     * @return ListRepositoryGroupsResponse
     */
    public ListRepositoryGroupsResponse listRepositoryGroups(ListRepositoryGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryGroupsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询代码库成员列表</p>
     * 
     * @param request ListRepositoryMemberWithInheritedRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRepositoryMemberWithInheritedResponse
     */
    public ListRepositoryMemberWithInheritedResponse listRepositoryMemberWithInheritedWithOptions(String repositoryId, ListRepositoryMemberWithInheritedRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepositoryMemberWithInherited"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/members/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoryMemberWithInheritedResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListRepositoryMemberWithInheritedResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询代码库成员列表</p>
     * 
     * @param request ListRepositoryMemberWithInheritedRequest
     * @return ListRepositoryMemberWithInheritedResponse
     */
    public ListRepositoryMemberWithInheritedResponse listRepositoryMemberWithInherited(String repositoryId, ListRepositoryMemberWithInheritedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryMemberWithInheritedWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询标签列表</p>
     * 
     * @param request ListRepositoryTagsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRepositoryTagsResponse
     */
    public ListRepositoryTagsResponse listRepositoryTagsWithOptions(String repositoryId, ListRepositoryTagsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("search", request.search);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("sort", request.sort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepositoryTags"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/tag/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoryTagsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListRepositoryTagsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询标签列表</p>
     * 
     * @param request ListRepositoryTagsRequest
     * @return ListRepositoryTagsResponse
     */
    public ListRepositoryTagsResponse listRepositoryTags(String repositoryId, ListRepositoryTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryTagsWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询代码库文件树</p>
     * 
     * @param request ListRepositoryTreeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRepositoryTreeResponse
     */
    public ListRepositoryTreeResponse listRepositoryTreeWithOptions(String repositoryId, ListRepositoryTreeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refName)) {
            query.put("refName", request.refName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepositoryTree"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/files/tree"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoryTreeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListRepositoryTreeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询代码库文件树</p>
     * 
     * @param request ListRepositoryTreeRequest
     * @return ListRepositoryTreeResponse
     */
    public ListRepositoryTreeResponse listRepositoryTree(String repositoryId, ListRepositoryTreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryTreeWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询代码库Webhook列表</p>
     * 
     * @param request ListRepositoryWebhookRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRepositoryWebhookResponse
     */
    public ListRepositoryWebhookResponse listRepositoryWebhookWithOptions(String repositoryId, ListRepositoryWebhookRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepositoryWebhook"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/webhooks/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoryWebhookResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListRepositoryWebhookResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询代码库Webhook列表</p>
     * 
     * @param request ListRepositoryWebhookRequest
     * @return ListRepositoryWebhookResponse
     */
    public ListRepositoryWebhookResponse listRepositoryWebhook(String repositoryId, ListRepositoryWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryWebhookWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源成员列表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceMembersResponse
     */
    public ListResourceMembersResponse listResourceMembersWithOptions(String organizationId, String resourceType, String resourceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceMembers"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(resourceType) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(resourceId) + "/members"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceMembersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListResourceMembersResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取资源成员列表</p>
     * @return ListResourceMembersResponse
     */
    public ListResourceMembersResponse listResourceMembers(String organizationId, String resourceType, String resourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceMembersWithOptions(organizationId, resourceType, resourceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>搜索代码提交数据</p>
     * 
     * @param request ListSearchCommitRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSearchCommitResponse
     */
    public ListSearchCommitResponse listSearchCommitWithOptions(ListSearchCommitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoPath)) {
            body.put("repoPath", request.repoPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            body.put("scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            body.put("sort", request.sort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSearchCommit"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/search/commit"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListSearchCommitResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListSearchCommitResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>搜索代码提交数据</p>
     * 
     * @param request ListSearchCommitRequest
     * @return ListSearchCommitResponse
     */
    public ListSearchCommitResponse listSearchCommit(ListSearchCommitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSearchCommitWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>搜索代码仓库数据</p>
     * 
     * @param request ListSearchRepositoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSearchRepositoryResponse
     */
    public ListSearchRepositoryResponse listSearchRepositoryWithOptions(ListSearchRepositoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunPk)) {
            body.put("aliyunPk", request.aliyunPk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoPath)) {
            body.put("repoPath", request.repoPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            body.put("scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            body.put("sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibilityLevel)) {
            body.put("visibilityLevel", request.visibilityLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSearchRepository"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/search/repo"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListSearchRepositoryResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListSearchRepositoryResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>搜索代码仓库数据</p>
     * 
     * @param request ListSearchRepositoryRequest
     * @return ListSearchRepositoryResponse
     */
    public ListSearchRepositoryResponse listSearchRepository(ListSearchRepositoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSearchRepositoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>搜索代码片段</p>
     * 
     * @param request ListSearchSourceCodeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSearchSourceCodeResponse
     */
    public ListSearchSourceCodeResponse listSearchSourceCodeWithOptions(ListSearchSourceCodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            body.put("filePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isCodeBlock)) {
            body.put("isCodeBlock", request.isCodeBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoPath)) {
            body.put("repoPath", request.repoPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            body.put("scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            body.put("sort", request.sort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSearchSourceCode"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/search/code"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListSearchSourceCodeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListSearchSourceCodeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>搜索代码片段</p>
     * 
     * @param request ListSearchSourceCodeRequest
     * @return ListSearchSourceCodeResponse
     */
    public ListSearchSourceCodeResponse listSearchSourceCode(ListSearchSourceCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSearchSourceCodeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取服务授权列表</p>
     * 
     * @param request ListServiceAuthsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceAuthsResponse
     */
    public ListServiceAuthsResponse listServiceAuthsWithOptions(String organizationId, ListServiceAuthsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceAuthType)) {
            query.put("serviceAuthType", request.serviceAuthType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceAuths"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/serviceAuths"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceAuthsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListServiceAuthsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取服务授权列表</p>
     * 
     * @param request ListServiceAuthsRequest
     * @return ListServiceAuthsResponse
     */
    public ListServiceAuthsResponse listServiceAuths(String organizationId, ListServiceAuthsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceAuthsWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取服务连接列表</p>
     * 
     * @param request ListServiceConnectionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceConnectionsResponse
     */
    public ListServiceConnectionsResponse listServiceConnectionsWithOptions(String organizationId, ListServiceConnectionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sericeConnectionType)) {
            query.put("sericeConnectionType", request.sericeConnectionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceConnections"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/serviceConnections"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceConnectionsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListServiceConnectionsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取服务连接列表</p>
     * 
     * @param request ListServiceConnectionsRequest
     * @return ListServiceConnectionsResponse
     */
    public ListServiceConnectionsResponse listServiceConnections(String organizationId, ListServiceConnectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceConnectionsWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取服务证书列表</p>
     * 
     * @param request ListServiceCredentialsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceCredentialsResponse
     */
    public ListServiceCredentialsResponse listServiceCredentialsWithOptions(String organizationId, ListServiceCredentialsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceCredentialType)) {
            query.put("serviceCredentialType", request.serviceCredentialType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceCredentials"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/serviceCredentials"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceCredentialsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListServiceCredentialsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取服务证书列表</p>
     * 
     * @param request ListServiceCredentialsRequest
     * @return ListServiceCredentialsResponse
     */
    public ListServiceCredentialsResponse listServiceCredentials(String organizationId, ListServiceCredentialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceCredentialsWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取迭代列表</p>
     * 
     * @param request ListSprintsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSprintsResponse
     */
    public ListSprintsResponse listSprintsWithOptions(String organizationId, ListSprintsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceIdentifier)) {
            query.put("spaceIdentifier", request.spaceIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceType)) {
            query.put("spaceType", request.spaceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSprints"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/sprints/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListSprintsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListSprintsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取迭代列表</p>
     * 
     * @param request ListSprintsRequest
     * @return ListSprintsResponse
     */
    public ListSprintsResponse listSprints(String organizationId, ListSprintsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSprintsWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取测试用例全部字段</p>
     * 
     * @param request ListTestCaseFieldsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTestCaseFieldsResponse
     */
    public ListTestCaseFieldsResponse listTestCaseFieldsWithOptions(String organizationId, ListTestCaseFieldsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.spaceIdentifier)) {
            query.put("spaceIdentifier", request.spaceIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTestCaseFields"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/testhub/testcase/fields"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTestCaseFieldsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTestCaseFieldsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取测试用例全部字段</p>
     * 
     * @param request ListTestCaseFieldsRequest
     * @return ListTestCaseFieldsResponse
     */
    public ListTestCaseFieldsResponse listTestCaseFields(String organizationId, ListTestCaseFieldsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTestCaseFieldsWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>测试DrawService</p>
     * 
     * @param request ListUserDrawRecordByPkRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserDrawRecordByPkResponse
     */
    public ListUserDrawRecordByPkResponse listUserDrawRecordByPkWithOptions(ListUserDrawRecordByPkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunPk)) {
            query.put("aliyunPk", request.aliyunPk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drawGroup)) {
            query.put("drawGroup", request.drawGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drawPoolName)) {
            query.put("drawPoolName", request.drawPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserDrawRecordByPk"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/listUserDrawRecords"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserDrawRecordByPkResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListUserDrawRecordByPkResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>测试DrawService</p>
     * 
     * @param request ListUserDrawRecordByPkRequest
     * @return ListUserDrawRecordByPkResponse
     */
    public ListUserDrawRecordByPkResponse listUserDrawRecordByPk(ListUserDrawRecordByPkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserDrawRecordByPkWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询当前用户的SSH Key列表</p>
     * 
     * @param request ListUserKeysRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserKeysResponse
     */
    public ListUserKeysResponse listUserKeysWithOptions(ListUserKeysRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("sort", request.sort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserKeys"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/user/keys"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserKeysResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListUserKeysResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询当前用户的SSH Key列表</p>
     * 
     * @param request ListUserKeysRequest
     * @return ListUserKeysResponse
     */
    public ListUserKeysResponse listUserKeys(ListUserKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserKeysWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户有权限的资源（代码库、组）</p>
     * 
     * @param request ListUserResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserResourcesResponse
     */
    public ListUserResourcesResponse listUserResourcesWithOptions(ListUserResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            query.put("userIds", request.userIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserResources"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/user/vision/user_resources"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserResourcesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListUserResourcesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询用户有权限的资源（代码库、组）</p>
     * 
     * @param request ListUserResourcesRequest
     * @return ListUserResourcesResponse
     */
    public ListUserResourcesResponse listUserResources(ListUserResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取变量组列表</p>
     * 
     * @param request ListVariableGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVariableGroupsResponse
     */
    public ListVariableGroupsResponse listVariableGroupsWithOptions(String organizationId, ListVariableGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageOrder)) {
            query.put("pageOrder", request.pageOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSort)) {
            query.put("pageSort", request.pageSort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVariableGroups"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/variableGroups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListVariableGroupsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListVariableGroupsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取变量组列表</p>
     * 
     * @param request ListVariableGroupsRequest
     * @return ListVariableGroupsResponse
     */
    public ListVariableGroupsResponse listVariableGroups(String organizationId, ListVariableGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listVariableGroupsWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取项目下工作项的所有字段</p>
     * 
     * @param request ListWorkItemAllFieldsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkItemAllFieldsResponse
     */
    public ListWorkItemAllFieldsResponse listWorkItemAllFieldsWithOptions(String organizationId, ListWorkItemAllFieldsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.spaceIdentifier)) {
            query.put("spaceIdentifier", request.spaceIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceType)) {
            query.put("spaceType", request.spaceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workitemTypeIdentifier)) {
            query.put("workitemTypeIdentifier", request.workitemTypeIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkItemAllFields"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/workitems/fields/listAll"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkItemAllFieldsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListWorkItemAllFieldsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取项目下工作项的所有字段</p>
     * 
     * @param request ListWorkItemAllFieldsRequest
     * @return ListWorkItemAllFieldsResponse
     */
    public ListWorkItemAllFieldsResponse listWorkItemAllFields(String organizationId, ListWorkItemAllFieldsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkItemAllFieldsWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询工作项工作流的所有状态</p>
     * 
     * @param request ListWorkItemWorkFlowStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkItemWorkFlowStatusResponse
     */
    public ListWorkItemWorkFlowStatusResponse listWorkItemWorkFlowStatusWithOptions(String organizationId, ListWorkItemWorkFlowStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.spaceIdentifier)) {
            query.put("spaceIdentifier", request.spaceIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceType)) {
            query.put("spaceType", request.spaceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workitemCategoryIdentifier)) {
            query.put("workitemCategoryIdentifier", request.workitemCategoryIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workitemTypeIdentifier)) {
            query.put("workitemTypeIdentifier", request.workitemTypeIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkItemWorkFlowStatus"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/workitems/workflow/listWorkflowStatus"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkItemWorkFlowStatusResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListWorkItemWorkFlowStatusResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询工作项工作流的所有状态</p>
     * 
     * @param request ListWorkItemWorkFlowStatusRequest
     * @return ListWorkItemWorkFlowStatusResponse
     */
    public ListWorkItemWorkFlowStatusResponse listWorkItemWorkFlowStatus(String organizationId, ListWorkItemWorkFlowStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkItemWorkFlowStatusWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作项的附件列表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkitemAttachmentsResponse
     */
    public ListWorkitemAttachmentsResponse listWorkitemAttachmentsWithOptions(String organizationId, String workitemIdentifier, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkitemAttachments"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/workitem/" + com.aliyun.openapiutil.Client.getEncodeParam(workitemIdentifier) + "/attachments"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkitemAttachmentsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListWorkitemAttachmentsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取工作项的附件列表</p>
     * @return ListWorkitemAttachmentsResponse
     */
    public ListWorkitemAttachmentsResponse listWorkitemAttachments(String organizationId, String workitemIdentifier) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkitemAttachmentsWithOptions(organizationId, workitemIdentifier, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作项预计工时明细列表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkitemEstimateResponse
     */
    public ListWorkitemEstimateResponse listWorkitemEstimateWithOptions(String organizationId, String workitemId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkitemEstimate"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/workitems/" + com.aliyun.openapiutil.Client.getEncodeParam(workitemId) + "/estimate/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkitemEstimateResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListWorkitemEstimateResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取工作项预计工时明细列表</p>
     * @return ListWorkitemEstimateResponse
     */
    public ListWorkitemEstimateResponse listWorkitemEstimate(String organizationId, String workitemId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkitemEstimateWithOptions(organizationId, workitemId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作项工时明细列表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkitemTimeResponse
     */
    public ListWorkitemTimeResponse listWorkitemTimeWithOptions(String organizationId, String workitemId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkitemTime"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/workitems/" + com.aliyun.openapiutil.Client.getEncodeParam(workitemId) + "/time/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkitemTimeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListWorkitemTimeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取工作项工时明细列表</p>
     * @return ListWorkitemTimeResponse
     */
    public ListWorkitemTimeResponse listWorkitemTime(String organizationId, String workitemId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkitemTimeWithOptions(organizationId, workitemId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作项列表</p>
     * 
     * @param request ListWorkitemsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkitemsResponse
     */
    public ListWorkitemsResponse listWorkitemsWithOptions(String organizationId, ListWorkitemsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conditions)) {
            query.put("conditions", request.conditions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraConditions)) {
            query.put("extraConditions", request.extraConditions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupCondition)) {
            query.put("groupCondition", request.groupCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchType)) {
            query.put("searchType", request.searchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceIdentifier)) {
            query.put("spaceIdentifier", request.spaceIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceType)) {
            query.put("spaceType", request.spaceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkitems"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/listWorkitems"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkitemsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListWorkitemsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取工作项列表</p>
     * 
     * @param request ListWorkitemsRequest
     * @return ListWorkitemsResponse
     */
    public ListWorkitemsResponse listWorkitems(String organizationId, ListWorkitemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkitemsWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取流水线运行任务日志</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return LogPipelineJobRunResponse
     */
    public LogPipelineJobRunResponse logPipelineJobRunWithOptions(String organizationId, String pipelineId, String jobId, String pipelineRunId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LogPipelineJobRun"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipeline/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineId) + "/pipelineRun/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineRunId) + "/job/" + com.aliyun.openapiutil.Client.getEncodeParam(jobId) + "/logs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new LogPipelineJobRunResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new LogPipelineJobRunResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取流水线运行任务日志</p>
     * @return LogPipelineJobRunResponse
     */
    public LogPipelineJobRunResponse logPipelineJobRun(String organizationId, String pipelineId, String jobId, String pipelineRunId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.logPipelineJobRunWithOptions(organizationId, pipelineId, jobId, pipelineRunId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取机器部署日志</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return LogVMDeployMachineResponse
     */
    public LogVMDeployMachineResponse logVMDeployMachineWithOptions(String organizationId, String pipelineId, String deployOrderId, String machineSn, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LogVMDeployMachine"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelines/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineId) + "/deploy/" + com.aliyun.openapiutil.Client.getEncodeParam(deployOrderId) + "/machine/" + com.aliyun.openapiutil.Client.getEncodeParam(machineSn) + "/log"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new LogVMDeployMachineResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new LogVMDeployMachineResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取机器部署日志</p>
     * @return LogVMDeployMachineResponse
     */
    public LogVMDeployMachineResponse logVMDeployMachine(String organizationId, String pipelineId, String deployOrderId, String machineSn) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.logVMDeployMachineWithOptions(organizationId, pipelineId, deployOrderId, machineSn, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>合并代码评审</p>
     * 
     * @param request MergeMergeRequestRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return MergeMergeRequestResponse
     */
    public MergeMergeRequestResponse mergeMergeRequestWithOptions(String repositoryId, String localId, MergeMergeRequestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mergeMessage)) {
            body.put("mergeMessage", request.mergeMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mergeType)) {
            body.put("mergeType", request.mergeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.removeSourceBranch)) {
            body.put("removeSourceBranch", request.removeSourceBranch);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MergeMergeRequest"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/merge_requests/" + com.aliyun.openapiutil.Client.getEncodeParam(localId) + "/merge"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new MergeMergeRequestResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new MergeMergeRequestResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>合并代码评审</p>
     * 
     * @param request MergeMergeRequestRequest
     * @return MergeMergeRequestResponse
     */
    public MergeMergeRequestResponse mergeMergeRequest(String repositoryId, String localId, MergeMergeRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.mergeMergeRequestWithOptions(repositoryId, localId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过人工卡点</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PassPipelineValidateResponse
     */
    public PassPipelineValidateResponse passPipelineValidateWithOptions(String organizationId, String pipelineId, String pipelineRunId, String jobId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PassPipelineValidate"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelines/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineId) + "/pipelineRuns/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineRunId) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobId) + "/pass"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new PassPipelineValidateResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new PassPipelineValidateResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>通过人工卡点</p>
     * @return PassPipelineValidateResponse
     */
    public PassPipelineValidateResponse passPipelineValidate(String organizationId, String pipelineId, String pipelineRunId, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.passPipelineValidateWithOptions(organizationId, pipelineId, pipelineRunId, jobId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过人工卡点</p>
     * 
     * @param request PassReleaseStagePipelineValidateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PassReleaseStagePipelineValidateResponse
     */
    public PassReleaseStagePipelineValidateResponse passReleaseStagePipelineValidateWithOptions(String appName, String releaseWorkflowSn, String releaseStageSn, String executionNumber, PassReleaseStagePipelineValidateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("jobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PassReleaseStagePipelineValidate"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/appstack/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/releaseWorkflows/" + com.aliyun.openapiutil.Client.getEncodeParam(releaseWorkflowSn) + "/releaseStages/" + com.aliyun.openapiutil.Client.getEncodeParam(releaseStageSn) + "/executions/" + com.aliyun.openapiutil.Client.getEncodeParam(executionNumber) + "%3ApassPipelineValidate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new PassReleaseStagePipelineValidateResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new PassReleaseStagePipelineValidateResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>通过人工卡点</p>
     * 
     * @param request PassReleaseStagePipelineValidateRequest
     * @return PassReleaseStagePipelineValidateResponse
     */
    public PassReleaseStagePipelineValidateResponse passReleaseStagePipelineValidate(String appName, String releaseWorkflowSn, String releaseStageSn, String executionNumber, PassReleaseStagePipelineValidateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.passReleaseStagePipelineValidateWithOptions(appName, releaseWorkflowSn, releaseStageSn, executionNumber, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>拒绝人工卡点</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefusePipelineValidateResponse
     */
    public RefusePipelineValidateResponse refusePipelineValidateWithOptions(String organizationId, String pipelineId, String pipelineRunId, String jobId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefusePipelineValidate"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelines/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineId) + "/pipelineRuns/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineRunId) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobId) + "/refuse"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RefusePipelineValidateResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RefusePipelineValidateResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>拒绝人工卡点</p>
     * @return RefusePipelineValidateResponse
     */
    public RefusePipelineValidateResponse refusePipelineValidate(String organizationId, String pipelineId, String pipelineRunId, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refusePipelineValidateWithOptions(organizationId, pipelineId, pipelineRunId, jobId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>拒绝人工卡点</p>
     * 
     * @param request RefuseReleaseStagePipelineValidateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefuseReleaseStagePipelineValidateResponse
     */
    public RefuseReleaseStagePipelineValidateResponse refuseReleaseStagePipelineValidateWithOptions(String appName, String releaseWorkflowSn, String releaseStageSn, String executionNumber, RefuseReleaseStagePipelineValidateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("jobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefuseReleaseStagePipelineValidate"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/appstack/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/releaseWorkflows/" + com.aliyun.openapiutil.Client.getEncodeParam(releaseWorkflowSn) + "/releaseStages/" + com.aliyun.openapiutil.Client.getEncodeParam(releaseStageSn) + "/executions/" + com.aliyun.openapiutil.Client.getEncodeParam(executionNumber) + "%3ArefusePipelineValidate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RefuseReleaseStagePipelineValidateResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RefuseReleaseStagePipelineValidateResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>拒绝人工卡点</p>
     * 
     * @param request RefuseReleaseStagePipelineValidateRequest
     * @return RefuseReleaseStagePipelineValidateResponse
     */
    public RefuseReleaseStagePipelineValidateResponse refuseReleaseStagePipelineValidate(String appName, String releaseWorkflowSn, String releaseStageSn, String executionNumber, RefuseReleaseStagePipelineValidateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refuseReleaseStagePipelineValidateWithOptions(appName, releaseWorkflowSn, releaseStageSn, executionNumber, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重新打开代码评审</p>
     * 
     * @param request ReopenMergeRequestRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReopenMergeRequestResponse
     */
    public ReopenMergeRequestResponse reopenMergeRequestWithOptions(String repositoryId, String localId, ReopenMergeRequestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReopenMergeRequest"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/merge_requests/" + com.aliyun.openapiutil.Client.getEncodeParam(localId) + "/reopen"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ReopenMergeRequestResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ReopenMergeRequestResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>重新打开代码评审</p>
     * 
     * @param request ReopenMergeRequestRequest
     * @return ReopenMergeRequestResponse
     */
    public ReopenMergeRequestResponse reopenMergeRequest(String repositoryId, String localId, ReopenMergeRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reopenMergeRequestWithOptions(repositoryId, localId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重置企业公钥</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetSshKeyResponse
     */
    public ResetSshKeyResponse resetSshKeyWithOptions(String organizationId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetSshKey"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/sshKey"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ResetSshKeyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ResetSshKeyResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>重置企业公钥</p>
     * @return ResetSshKeyResponse
     */
    public ResetSshKeyResponse resetSshKey(String organizationId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetSshKeyWithOptions(organizationId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>继续部署</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeVMDeployOrderResponse
     */
    public ResumeVMDeployOrderResponse resumeVMDeployOrderWithOptions(String organizationId, String pipelineId, String deployOrderId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeVMDeployOrder"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelines/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineId) + "/deploy/" + com.aliyun.openapiutil.Client.getEncodeParam(deployOrderId) + "/resume"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeVMDeployOrderResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ResumeVMDeployOrderResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>继续部署</p>
     * @return ResumeVMDeployOrderResponse
     */
    public ResumeVMDeployOrderResponse resumeVMDeployOrder(String organizationId, String pipelineId, String deployOrderId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeVMDeployOrderWithOptions(organizationId, pipelineId, deployOrderId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重试流水线运行</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetryPipelineJobRunResponse
     */
    public RetryPipelineJobRunResponse retryPipelineJobRunWithOptions(String organizationId, String pipelineId, String pipelineRunId, String jobId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryPipelineJobRun"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelines/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineId) + "/pipelineRuns/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineRunId) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RetryPipelineJobRunResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RetryPipelineJobRunResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>重试流水线运行</p>
     * @return RetryPipelineJobRunResponse
     */
    public RetryPipelineJobRunResponse retryPipelineJobRun(String organizationId, String pipelineId, String pipelineRunId, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryPipelineJobRunWithOptions(organizationId, pipelineId, pipelineRunId, jobId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重试机器部署</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetryVMDeployMachineResponse
     */
    public RetryVMDeployMachineResponse retryVMDeployMachineWithOptions(String organizationId, String pipelineId, String deployOrderId, String machineSn, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryVMDeployMachine"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelines/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineId) + "/deploy/" + com.aliyun.openapiutil.Client.getEncodeParam(deployOrderId) + "/machine/" + com.aliyun.openapiutil.Client.getEncodeParam(machineSn) + "/retry"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RetryVMDeployMachineResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RetryVMDeployMachineResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>重试机器部署</p>
     * @return RetryVMDeployMachineResponse
     */
    public RetryVMDeployMachineResponse retryVMDeployMachine(String organizationId, String pipelineId, String deployOrderId, String machineSn) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryVMDeployMachineWithOptions(organizationId, pipelineId, deployOrderId, machineSn, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交变更请求的评审意见</p>
     * 
     * @param request ReviewMergeRequestRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReviewMergeRequestResponse
     */
    public ReviewMergeRequestResponse reviewMergeRequestWithOptions(String repositoryId, String localId, ReviewMergeRequestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.draftCommentIds)) {
            body.put("draftCommentIds", request.draftCommentIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reviewComment)) {
            body.put("reviewComment", request.reviewComment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reviewOpinion)) {
            body.put("reviewOpinion", request.reviewOpinion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReviewMergeRequest"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/merge_requests/" + com.aliyun.openapiutil.Client.getEncodeParam(localId) + "/submit_review_opinion"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ReviewMergeRequestResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ReviewMergeRequestResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>提交变更请求的评审意见</p>
     * 
     * @param request ReviewMergeRequestRequest
     * @return ReviewMergeRequestResponse
     */
    public ReviewMergeRequestResponse reviewMergeRequest(String repositoryId, String localId, ReviewMergeRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reviewMergeRequestWithOptions(repositoryId, localId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>跳过流水线任务运行</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SkipPipelineJobRunResponse
     */
    public SkipPipelineJobRunResponse skipPipelineJobRunWithOptions(String organizationId, String pipelineId, String pipelineRunId, String jobId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SkipPipelineJobRun"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelines/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineId) + "/pipelineRuns/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineRunId) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobId) + "/skip"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SkipPipelineJobRunResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SkipPipelineJobRunResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>跳过流水线任务运行</p>
     * @return SkipPipelineJobRunResponse
     */
    public SkipPipelineJobRunResponse skipPipelineJobRun(String organizationId, String pipelineId, String pipelineRunId, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.skipPipelineJobRunWithOptions(organizationId, pipelineId, pipelineRunId, jobId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>跳过机器部署</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SkipVMDeployMachineResponse
     */
    public SkipVMDeployMachineResponse skipVMDeployMachineWithOptions(String organizationId, String pipelineId, String deployOrderId, String machineSn, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SkipVMDeployMachine"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelines/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineId) + "/deploy/" + com.aliyun.openapiutil.Client.getEncodeParam(deployOrderId) + "/machine/" + com.aliyun.openapiutil.Client.getEncodeParam(machineSn) + "/skip"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SkipVMDeployMachineResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SkipVMDeployMachineResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>跳过机器部署</p>
     * @return SkipVMDeployMachineResponse
     */
    public SkipVMDeployMachineResponse skipVMDeployMachine(String organizationId, String pipelineId, String deployOrderId, String machineSn) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.skipVMDeployMachineWithOptions(organizationId, pipelineId, deployOrderId, machineSn, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>运行流水线</p>
     * 
     * @param request StartPipelineRunRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartPipelineRunResponse
     */
    public StartPipelineRunResponse startPipelineRunWithOptions(String organizationId, String pipelineId, StartPipelineRunRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("params", request.params);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartPipelineRun"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organizations/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelines/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineId) + "/run"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StartPipelineRunResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StartPipelineRunResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>运行流水线</p>
     * 
     * @param request StartPipelineRunRequest
     * @return StartPipelineRunResponse
     */
    public StartPipelineRunResponse startPipelineRun(String organizationId, String pipelineId, StartPipelineRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startPipelineRunWithOptions(organizationId, pipelineId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>终止流水线任务运行</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopPipelineJobRunResponse
     */
    public StopPipelineJobRunResponse stopPipelineJobRunWithOptions(String organizationId, String pipelineId, String pipelineRunId, String jobId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopPipelineJobRun"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelines/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineId) + "/pipelineRuns/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineRunId) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobId) + "/stop"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StopPipelineJobRunResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StopPipelineJobRunResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>终止流水线任务运行</p>
     * @return StopPipelineJobRunResponse
     */
    public StopPipelineJobRunResponse stopPipelineJobRun(String organizationId, String pipelineId, String pipelineRunId, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopPipelineJobRunWithOptions(organizationId, pipelineId, pipelineRunId, jobId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>终止流水线运行</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopPipelineRunResponse
     */
    public StopPipelineRunResponse stopPipelineRunWithOptions(String organizationId, String pipelineId, String pipelineRunId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopPipelineRun"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelines/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineId) + "/pipelineRuns/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineRunId) + "/stop"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StopPipelineRunResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StopPipelineRunResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>终止流水线运行</p>
     * @return StopPipelineRunResponse
     */
    public StopPipelineRunResponse stopPipelineRun(String organizationId, String pipelineId, String pipelineRunId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopPipelineRunWithOptions(organizationId, pipelineId, pipelineRunId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消部署单</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopVMDeployOrderResponse
     */
    public StopVMDeployOrderResponse stopVMDeployOrderWithOptions(String organizationId, String pipelineId, String deployOrderId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopVMDeployOrder"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelines/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineId) + "/deploy/" + com.aliyun.openapiutil.Client.getEncodeParam(deployOrderId) + "/stop"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StopVMDeployOrderResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StopVMDeployOrderResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>取消部署单</p>
     * @return StopVMDeployOrderResponse
     */
    public StopVMDeployOrderResponse stopVMDeployOrder(String organizationId, String pipelineId, String deployOrderId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopVMDeployOrderWithOptions(organizationId, pipelineId, deployOrderId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>转移代码库</p>
     * 
     * @param request TransferRepositoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TransferRepositoryResponse
     */
    public TransferRepositoryResponse transferRepositoryWithOptions(TransferRepositoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("groupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repositoryId)) {
            query.put("repositoryId", request.repositoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferRepository"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/repository/transfer"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new TransferRepositoryResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new TransferRepositoryResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>转移代码库</p>
     * 
     * @param request TransferRepositoryRequest
     * @return TransferRepositoryResponse
     */
    public TransferRepositoryResponse transferRepository(TransferRepositoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.transferRepositoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>触发仓库同步</p>
     * 
     * @param request TriggerRepositoryMirrorSyncRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TriggerRepositoryMirrorSyncResponse
     */
    public TriggerRepositoryMirrorSyncResponse triggerRepositoryMirrorSyncWithOptions(String repositoryId, TriggerRepositoryMirrorSyncRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            query.put("account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TriggerRepositoryMirrorSync"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/mirror"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new TriggerRepositoryMirrorSyncResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new TriggerRepositoryMirrorSyncResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>触发仓库同步</p>
     * 
     * @param request TriggerRepositoryMirrorSyncRequest
     * @return TriggerRepositoryMirrorSyncResponse
     */
    public TriggerRepositoryMirrorSyncResponse triggerRepositoryMirrorSync(String repositoryId, TriggerRepositoryMirrorSyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.triggerRepositoryMirrorSyncWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新应用成员</p>
     * 
     * @param request UpdateAppMemberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAppMemberResponse
     */
    public UpdateAppMemberResponse updateAppMemberWithOptions(String appName, UpdateAppMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.player)) {
            body.put("player", request.player);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleNames)) {
            body.put("roleNames", request.roleNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAppMember"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/appstack/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/members"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "string")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAppMemberResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateAppMemberResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新应用成员</p>
     * 
     * @param request UpdateAppMemberRequest
     * @return UpdateAppMemberResponse
     */
    public UpdateAppMemberResponse updateAppMember(String appName, UpdateAppMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAppMemberWithOptions(appName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新应用</p>
     * 
     * @param request UpdateApplicationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApplicationResponse
     */
    public UpdateApplicationResponse updateApplicationWithOptions(String appName, UpdateApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccountId)) {
            body.put("ownerAccountId", request.ownerAccountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApplication"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/appstack/apps/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApplicationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateApplicationResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新应用</p>
     * 
     * @param request UpdateApplicationRequest
     * @return UpdateApplicationResponse
     */
    public UpdateApplicationResponse updateApplication(String appName, UpdateApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApplicationWithOptions(appName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新检查运行记录</p>
     * 
     * @param request UpdateCheckRunRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCheckRunResponse
     */
    public UpdateCheckRunResponse updateCheckRunWithOptions(UpdateCheckRunRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkRunId)) {
            query.put("checkRunId", request.checkRunId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repositoryIdentity)) {
            query.put("repositoryIdentity", request.repositoryIdentity);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.annotations)) {
            body.put("annotations", request.annotations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.completedAt)) {
            body.put("completedAt", request.completedAt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conclusion)) {
            body.put("conclusion", request.conclusion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detailsUrl)) {
            body.put("detailsUrl", request.detailsUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalId)) {
            body.put("externalId", request.externalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            body.put("output", request.output);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startedAt)) {
            body.put("startedAt", request.startedAt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCheckRun"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/check_runs/update_check_run"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCheckRunResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateCheckRunResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新检查运行记录</p>
     * 
     * @param request UpdateCheckRunRequest
     * @return UpdateCheckRunResponse
     */
    public UpdateCheckRunResponse updateCheckRun(UpdateCheckRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCheckRunWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新代码库文件</p>
     * 
     * @param request UpdateFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFileResponse
     */
    public UpdateFileResponse updateFileWithOptions(String repositoryId, UpdateFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            body.put("branchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commitMessage)) {
            body.put("commitMessage", request.commitMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encoding)) {
            body.put("encoding", request.encoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newPath)) {
            body.put("newPath", request.newPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oldPath)) {
            body.put("oldPath", request.oldPath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFile"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/files/update"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFileResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateFileResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新代码库文件</p>
     * 
     * @param request UpdateFileRequest
     * @return UpdateFileResponse
     */
    public UpdateFileResponse updateFile(String repositoryId, UpdateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFileWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新标签</p>
     * 
     * @param request UpdateFlowTagRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFlowTagResponse
     */
    public UpdateFlowTagResponse updateFlowTagWithOptions(String organizationId, String id, UpdateFlowTagRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.color)) {
            query.put("color", request.color);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowTagGroupId)) {
            query.put("flowTagGroupId", request.flowTagGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFlowTag"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/flow/tags/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFlowTagResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateFlowTagResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新标签</p>
     * 
     * @param request UpdateFlowTagRequest
     * @return UpdateFlowTagResponse
     */
    public UpdateFlowTagResponse updateFlowTag(String organizationId, String id, UpdateFlowTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFlowTagWithOptions(organizationId, id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>标签分类</p>
     * 
     * @param request UpdateFlowTagGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFlowTagGroupResponse
     */
    public UpdateFlowTagGroupResponse updateFlowTagGroupWithOptions(String organizationId, String id, UpdateFlowTagGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFlowTagGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/flow/tagGroups/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFlowTagGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateFlowTagGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>标签分类</p>
     * 
     * @param request UpdateFlowTagGroupRequest
     * @return UpdateFlowTagGroupResponse
     */
    public UpdateFlowTagGroupResponse updateFlowTagGroup(String organizationId, String id, UpdateFlowTagGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFlowTagGroupWithOptions(organizationId, id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新单个代码组信息</p>
     * 
     * @param request UpdateGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGroupResponse
     */
    public UpdateGroupResponse updateGroupWithOptions(UpdateGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.avatarUrl)) {
            body.put("avatarUrl", request.avatarUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            body.put("path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pathWithNamespace)) {
            body.put("pathWithNamespace", request.pathWithNamespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibilityLevel)) {
            body.put("visibilityLevel", request.visibilityLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/groups/modify"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新单个代码组信息</p>
     * 
     * @param request UpdateGroupRequest
     * @return UpdateGroupResponse
     */
    public UpdateGroupResponse updateGroup(UpdateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改组成员</p>
     * 
     * @param request UpdateGroupMemberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGroupMemberResponse
     */
    public UpdateGroupMemberResponse updateGroupMemberWithOptions(String groupId, UpdateGroupMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunPk)) {
            query.put("aliyunPk", request.aliyunPk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessLevel)) {
            body.put("accessLevel", request.accessLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberType)) {
            body.put("memberType", request.memberType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGroupMember"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/members/update/aliyun_pk"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGroupMemberResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateGroupMemberResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>修改组成员</p>
     * 
     * @param request UpdateGroupMemberRequest
     * @return UpdateGroupMemberResponse
     */
    public UpdateGroupMemberResponse updateGroupMember(String groupId, UpdateGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGroupMemberWithOptions(groupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新主机组</p>
     * 
     * @param request UpdateHostGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateHostGroupResponse
     */
    public UpdateHostGroupResponse updateHostGroupWithOptions(String organizationId, String id, UpdateHostGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunRegion)) {
            body.put("aliyunRegion", request.aliyunRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsLabelKey)) {
            body.put("ecsLabelKey", request.ecsLabelKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsLabelValue)) {
            body.put("ecsLabelValue", request.ecsLabelValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsType)) {
            body.put("ecsType", request.ecsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            body.put("envId", request.envId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.machineInfos)) {
            body.put("machineInfos", request.machineInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceConnectionId)) {
            body.put("serviceConnectionId", request.serviceConnectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagIds)) {
            body.put("tagIds", request.tagIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateHostGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/hostGroups/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHostGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateHostGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新主机组</p>
     * 
     * @param request UpdateHostGroupRequest
     * @return UpdateHostGroupResponse
     */
    public UpdateHostGroupResponse updateHostGroup(String organizationId, String id, UpdateHostGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateHostGroupWithOptions(organizationId, id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新代码评审的标题和描述</p>
     * 
     * @param request UpdateMergeRequestRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMergeRequestResponse
     */
    public UpdateMergeRequestResponse updateMergeRequestWithOptions(String repositoryId, String localId, UpdateMergeRequestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMergeRequest"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/merge_requests/" + com.aliyun.openapiutil.Client.getEncodeParam(localId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMergeRequestResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateMergeRequestResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新代码评审的标题和描述</p>
     * 
     * @param request UpdateMergeRequestRequest
     * @return UpdateMergeRequestResponse
     */
    public UpdateMergeRequestResponse updateMergeRequest(String repositoryId, String localId, UpdateMergeRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMergeRequestWithOptions(repositoryId, localId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新代码评审的干系人</p>
     * 
     * @param request UpdateMergeRequestPersonnelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMergeRequestPersonnelResponse
     */
    public UpdateMergeRequestPersonnelResponse updateMergeRequestPersonnelWithOptions(String repositoryId, String localId, String personType, UpdateMergeRequestPersonnelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newUserIdList)) {
            body.put("newUserIdList", request.newUserIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMergeRequestPersonnel"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/merge_requests/" + com.aliyun.openapiutil.Client.getEncodeParam(localId) + "/person/" + com.aliyun.openapiutil.Client.getEncodeParam(personType) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMergeRequestPersonnelResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateMergeRequestPersonnelResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新代码评审的干系人</p>
     * 
     * @param request UpdateMergeRequestPersonnelRequest
     * @return UpdateMergeRequestPersonnelResponse
     */
    public UpdateMergeRequestPersonnelResponse updateMergeRequestPersonnel(String repositoryId, String localId, String personType, UpdateMergeRequestPersonnelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMergeRequestPersonnelWithOptions(repositoryId, localId, personType, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>当前用户加入的企业列表</p>
     * 
     * @param request UpdateOrganizationMemberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOrganizationMemberResponse
     */
    public UpdateOrganizationMemberResponse updateOrganizationMemberWithOptions(String organizationId, String accountId, UpdateOrganizationMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationMemberName)) {
            query.put("organizationMemberName", request.organizationMemberName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOrganizationMember"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(accountId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOrganizationMemberResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateOrganizationMemberResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>当前用户加入的企业列表</p>
     * 
     * @param request UpdateOrganizationMemberRequest
     * @return UpdateOrganizationMemberResponse
     */
    public UpdateOrganizationMemberResponse updateOrganizationMember(String organizationId, String accountId, UpdateOrganizationMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateOrganizationMemberWithOptions(organizationId, accountId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新流水线。</p>
     * 
     * @param request UpdatePipelineRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePipelineResponse
     */
    public UpdatePipelineResponse updatePipelineWithOptions(String organizationId, UpdatePipelineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            body.put("pipelineId", request.pipelineId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePipeline"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelines/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePipelineResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdatePipelineResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新流水线。</p>
     * 
     * @param request UpdatePipelineRequest
     * @return UpdatePipelineResponse
     */
    public UpdatePipelineResponse updatePipeline(String organizationId, UpdatePipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePipelineWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除标签</p>
     * 
     * @param request UpdatePipelineBaseInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePipelineBaseInfoResponse
     */
    public UpdatePipelineBaseInfoResponse updatePipelineBaseInfoWithOptions(String organizationId, String pipelineId, UpdatePipelineBaseInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            query.put("envId", request.envId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineName)) {
            query.put("pipelineName", request.pipelineName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagList)) {
            query.put("tagList", request.tagList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePipelineBaseInfo"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelines/" + com.aliyun.openapiutil.Client.getEncodeParam(pipelineId) + "/baseInfo"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePipelineBaseInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdatePipelineBaseInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除标签</p>
     * 
     * @param request UpdatePipelineBaseInfoRequest
     * @return UpdatePipelineBaseInfoResponse
     */
    public UpdatePipelineBaseInfoResponse updatePipelineBaseInfo(String organizationId, String pipelineId, UpdatePipelineBaseInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePipelineBaseInfoWithOptions(organizationId, pipelineId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新流水线分组</p>
     * 
     * @param request UpdatePipelineGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePipelineGroupResponse
     */
    public UpdatePipelineGroupResponse updatePipelineGroupWithOptions(String organizationId, String groupId, UpdatePipelineGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePipelineGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/pipelineGroups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePipelineGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdatePipelineGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新流水线分组</p>
     * 
     * @param request UpdatePipelineGroupRequest
     * @return UpdatePipelineGroupResponse
     */
    public UpdatePipelineGroupResponse updatePipelineGroup(String organizationId, String groupId, UpdatePipelineGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePipelineGroupWithOptions(organizationId, groupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新项目属性与字段</p>
     * 
     * @param request UpdateProjectFieldRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProjectFieldResponse
     */
    public UpdateProjectFieldResponse updateProjectFieldWithOptions(String organizationId, String identifier, UpdateProjectFieldRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.statusIdentifier)) {
            body.put("statusIdentifier", request.statusIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateBasicFieldRequestList)) {
            body.put("updateBasicFieldRequestList", request.updateBasicFieldRequestList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateForOpenApiList)) {
            body.put("updateForOpenApiList", request.updateForOpenApiList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProjectField"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/project/" + com.aliyun.openapiutil.Client.getEncodeParam(identifier) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectFieldResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateProjectFieldResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新项目属性与字段</p>
     * 
     * @param request UpdateProjectFieldRequest
     * @return UpdateProjectFieldResponse
     */
    public UpdateProjectFieldResponse updateProjectField(String organizationId, String identifier, UpdateProjectFieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProjectFieldWithOptions(organizationId, identifier, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新代码库Label</p>
     * 
     * @param request UpdateProjectLabelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProjectLabelResponse
     */
    public UpdateProjectLabelResponse updateProjectLabelWithOptions(String labelId, UpdateProjectLabelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repositoryIdentity)) {
            query.put("repositoryIdentity", request.repositoryIdentity);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.color)) {
            body.put("color", request.color);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProjectLabel"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/labels/" + com.aliyun.openapiutil.Client.getEncodeParam(labelId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectLabelResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateProjectLabelResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新代码库Label</p>
     * 
     * @param request UpdateProjectLabelRequest
     * @return UpdateProjectLabelResponse
     */
    public UpdateProjectLabelResponse updateProjectLabel(String labelId, UpdateProjectLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProjectLabelWithOptions(labelId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加项目成员</p>
     * 
     * @param request UpdateProjectMemberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProjectMemberResponse
     */
    public UpdateProjectMemberResponse updateProjectMemberWithOptions(String organizationId, String projectId, UpdateProjectMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleIdentifier)) {
            body.put("roleIdentifier", request.roleIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetIdentifier)) {
            body.put("targetIdentifier", request.targetIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            body.put("targetType", request.targetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdentifier)) {
            body.put("userIdentifier", request.userIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            body.put("userType", request.userType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProjectMember"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectId) + "/updateMember"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectMemberResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateProjectMemberResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>添加项目成员</p>
     * 
     * @param request UpdateProjectMemberRequest
     * @return UpdateProjectMemberResponse
     */
    public UpdateProjectMemberResponse updateProjectMember(String organizationId, String projectId, UpdateProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProjectMemberWithOptions(organizationId, projectId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更改保护分支设置</p>
     * 
     * @param request UpdateProtectedBranchesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProtectedBranchesResponse
     */
    public UpdateProtectedBranchesResponse updateProtectedBranchesWithOptions(String repositoryId, String id, UpdateProtectedBranchesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowMergeRoles)) {
            body.put("allowMergeRoles", request.allowMergeRoles);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowMergeUserIds)) {
            body.put("allowMergeUserIds", request.allowMergeUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowPushRoles)) {
            body.put("allowPushRoles", request.allowPushRoles);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowPushUserIds)) {
            body.put("allowPushUserIds", request.allowPushUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.branch)) {
            body.put("branch", request.branch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mergeRequestSetting)) {
            body.put("mergeRequestSetting", request.mergeRequestSetting);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.testSettingDTO)) {
            body.put("testSettingDTO", request.testSettingDTO);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProtectedBranches"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/protect_branches/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProtectedBranchesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateProtectedBranchesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更改保护分支设置</p>
     * 
     * @param request UpdateProtectedBranchesRequest
     * @return UpdateProtectedBranchesResponse
     */
    public UpdateProtectedBranchesResponse updateProtectedBranches(String repositoryId, String id, UpdateProtectedBranchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProtectedBranchesWithOptions(repositoryId, id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>推送评审模式开关</p>
     * 
     * @param request UpdatePushReviewOnOffRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePushReviewOnOffResponse
     */
    public UpdatePushReviewOnOffResponse updatePushReviewOnOffWithOptions(String repositoryId, UpdatePushReviewOnOffRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trunkMode)) {
            query.put("trunkMode", request.trunkMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePushReviewOnOff"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/settings/trunk_mode"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePushReviewOnOffResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdatePushReviewOnOffResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>推送评审模式开关</p>
     * 
     * @param request UpdatePushReviewOnOffRequest
     * @return UpdatePushReviewOnOffResponse
     */
    public UpdatePushReviewOnOffResponse updatePushReviewOnOff(String repositoryId, UpdatePushReviewOnOffRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePushReviewOnOffWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新推送规则</p>
     * 
     * @param request UpdatePushRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePushRuleResponse
     */
    public UpdatePushRuleResponse updatePushRuleWithOptions(String repositoryId, String pushRuleId, UpdatePushRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleInfos)) {
            body.put("ruleInfos", request.ruleInfos);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePushRule"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/push_rule/" + com.aliyun.openapiutil.Client.getEncodeParam(pushRuleId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePushRuleResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdatePushRuleResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新推送规则</p>
     * 
     * @param request UpdatePushRuleRequest
     * @return UpdatePushRuleResponse
     */
    public UpdatePushRuleResponse updatePushRule(String repositoryId, String pushRuleId, UpdatePushRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePushRuleWithOptions(repositoryId, pushRuleId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新代码库名称、路径、描述、默认分支等设置</p>
     * 
     * @param request UpdateRepositoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRepositoryResponse
     */
    public UpdateRepositoryResponse updateRepositoryWithOptions(String repositoryId, UpdateRepositoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adminSettingLanguage)) {
            body.put("adminSettingLanguage", request.adminSettingLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.avatar)) {
            body.put("avatar", request.avatar);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buildsEnabled)) {
            body.put("buildsEnabled", request.buildsEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkEmail)) {
            body.put("checkEmail", request.checkEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultBranch)) {
            body.put("defaultBranch", request.defaultBranch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.issuesEnabled)) {
            body.put("issuesEnabled", request.issuesEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mergeRequestsEnabled)) {
            body.put("mergeRequestsEnabled", request.mergeRequestsEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openCloneDownloadControl)) {
            body.put("openCloneDownloadControl", request.openCloneDownloadControl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            body.put("path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectCloneDownloadMethodList)) {
            body.put("projectCloneDownloadMethodList", request.projectCloneDownloadMethodList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectCloneDownloadRoleList)) {
            body.put("projectCloneDownloadRoleList", request.projectCloneDownloadRoleList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snippetsEnabled)) {
            body.put("snippetsEnabled", request.snippetsEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibilityLevel)) {
            body.put("visibilityLevel", request.visibilityLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wikiEnabled)) {
            body.put("wikiEnabled", request.wikiEnabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRepository"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRepositoryResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateRepositoryResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新代码库名称、路径、描述、默认分支等设置</p>
     * 
     * @param request UpdateRepositoryRequest
     * @return UpdateRepositoryResponse
     */
    public UpdateRepositoryResponse updateRepository(String repositoryId, UpdateRepositoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRepositoryWithOptions(repositoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改代码库成员的权限（角色）</p>
     * 
     * @param request UpdateRepositoryMemberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRepositoryMemberResponse
     */
    public UpdateRepositoryMemberResponse updateRepositoryMemberWithOptions(String repositoryId, String aliyunPk, UpdateRepositoryMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("organizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessLevel)) {
            body.put("accessLevel", request.accessLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireAt)) {
            body.put("expireAt", request.expireAt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberType)) {
            body.put("memberType", request.memberType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedId)) {
            body.put("relatedId", request.relatedId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedInfos)) {
            body.put("relatedInfos", request.relatedInfos);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRepositoryMember"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/repository/" + com.aliyun.openapiutil.Client.getEncodeParam(repositoryId) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(aliyunPk) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRepositoryMemberResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateRepositoryMemberResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>修改代码库成员的权限（角色）</p>
     * 
     * @param request UpdateRepositoryMemberRequest
     * @return UpdateRepositoryMemberResponse
     */
    public UpdateRepositoryMemberResponse updateRepositoryMember(String repositoryId, String aliyunPk, UpdateRepositoryMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRepositoryMemberWithOptions(repositoryId, aliyunPk, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新资源成员</p>
     * 
     * @param request UpdateResourceMemberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateResourceMemberResponse
     */
    public UpdateResourceMemberResponse updateResourceMemberWithOptions(String organizationId, String resourceType, String resourceId, String accountId, UpdateResourceMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("roleName", request.roleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResourceMember"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(resourceType) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(resourceId) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(accountId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceMemberResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateResourceMemberResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新资源成员</p>
     * 
     * @param request UpdateResourceMemberRequest
     * @return UpdateResourceMemberResponse
     */
    public UpdateResourceMemberResponse updateResourceMember(String organizationId, String resourceType, String resourceId, String accountId, UpdateResourceMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateResourceMemberWithOptions(organizationId, resourceType, resourceId, accountId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新测试用例字段</p>
     * 
     * @param request UpdateTestCaseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTestCaseResponse
     */
    public UpdateTestCaseResponse updateTestCaseWithOptions(String organizationId, String testcaseIdentifier, UpdateTestCaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateWorkitemPropertyRequest)) {
            body.put("updateWorkitemPropertyRequest", request.updateWorkitemPropertyRequest);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTestCase"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/testhub/testcase/" + com.aliyun.openapiutil.Client.getEncodeParam(testcaseIdentifier) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTestCaseResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateTestCaseResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新测试用例字段</p>
     * 
     * @param request UpdateTestCaseRequest
     * @return UpdateTestCaseResponse
     */
    public UpdateTestCaseResponse updateTestCase(String organizationId, String testcaseIdentifier, UpdateTestCaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTestCaseWithOptions(organizationId, testcaseIdentifier, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新了测试计划中测试用例的执行人与状态</p>
     * 
     * @param request UpdateTestResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTestResultResponse
     */
    public UpdateTestResultResponse updateTestResultWithOptions(String organizationId, String testPlanIdentifier, String testcaseIdentifier, UpdateTestResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.executor)) {
            body.put("executor", request.executor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTestResult"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/testhub/testplan/" + com.aliyun.openapiutil.Client.getEncodeParam(testPlanIdentifier) + "/testresult/" + com.aliyun.openapiutil.Client.getEncodeParam(testcaseIdentifier) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTestResultResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateTestResultResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新了测试计划中测试用例的执行人与状态</p>
     * 
     * @param request UpdateTestResultRequest
     * @return UpdateTestResultResponse
     */
    public UpdateTestResultResponse updateTestResult(String organizationId, String testPlanIdentifier, String testcaseIdentifier, UpdateTestResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTestResultWithOptions(organizationId, testPlanIdentifier, testcaseIdentifier, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新变量组</p>
     * 
     * @param request UpdateVariableGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVariableGroupResponse
     */
    public UpdateVariableGroupResponse updateVariableGroupWithOptions(String organizationId, String id, UpdateVariableGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variables)) {
            body.put("variables", request.variables);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVariableGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/variableGroups/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVariableGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateVariableGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新变量组</p>
     * 
     * @param request UpdateVariableGroupRequest
     * @return UpdateVariableGroupResponse
     */
    public UpdateVariableGroupResponse updateVariableGroup(String organizationId, String id, UpdateVariableGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateVariableGroupWithOptions(organizationId, id, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新工作项信息</p>
     * 
     * @param request UpdateWorkItemRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkItemResponse
     */
    public UpdateWorkItemResponse updateWorkItemWithOptions(String organizationId, UpdateWorkItemRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fieldType)) {
            body.put("fieldType", request.fieldType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            body.put("identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyKey)) {
            body.put("propertyKey", request.propertyKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyValue)) {
            body.put("propertyValue", request.propertyValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkItem"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/workitems/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkItemResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateWorkItemResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新工作项信息</p>
     * 
     * @param request UpdateWorkItemRequest
     * @return UpdateWorkItemResponse
     */
    public UpdateWorkItemResponse updateWorkItem(String organizationId, UpdateWorkItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWorkItemWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新工作项评论</p>
     * 
     * @param request UpdateWorkitemCommentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkitemCommentResponse
     */
    public UpdateWorkitemCommentResponse updateWorkitemCommentWithOptions(String organizationId, UpdateWorkitemCommentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commentId)) {
            body.put("commentId", request.commentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formatType)) {
            body.put("formatType", request.formatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workitemIdentifier)) {
            body.put("workitemIdentifier", request.workitemIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkitemComment"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/workitems/commentUpdate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkitemCommentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateWorkitemCommentResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新工作项评论</p>
     * 
     * @param request UpdateWorkitemCommentRequest
     * @return UpdateWorkitemCommentResponse
     */
    public UpdateWorkitemCommentResponse updateWorkitemComment(String organizationId, UpdateWorkitemCommentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWorkitemCommentWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量更新工作项字段信息</p>
     * 
     * @param request UpdateWorkitemFieldRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkitemFieldResponse
     */
    public UpdateWorkitemFieldResponse updateWorkitemFieldWithOptions(String organizationId, UpdateWorkitemFieldRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateWorkitemPropertyRequest)) {
            body.put("updateWorkitemPropertyRequest", request.updateWorkitemPropertyRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workitemIdentifier)) {
            body.put("workitemIdentifier", request.workitemIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkitemField"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/workitems/updateWorkitemField"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkitemFieldResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateWorkitemFieldResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>批量更新工作项字段信息</p>
     * 
     * @param request UpdateWorkitemFieldRequest
     * @return UpdateWorkitemFieldResponse
     */
    public UpdateWorkitemFieldResponse updateWorkitemField(String organizationId, UpdateWorkitemFieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWorkitemFieldWithOptions(organizationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>工作项附件创建</p>
     * 
     * @param request WorkitemAttachmentCreateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return WorkitemAttachmentCreateResponse
     */
    public WorkitemAttachmentCreateResponse workitemAttachmentCreateWithOptions(String organizationId, String workitemIdentifier, WorkitemAttachmentCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileKey)) {
            body.put("fileKey", request.fileKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalFilename)) {
            body.put("originalFilename", request.originalFilename);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WorkitemAttachmentCreate"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationId) + "/workitem/" + com.aliyun.openapiutil.Client.getEncodeParam(workitemIdentifier) + "/attachment"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new WorkitemAttachmentCreateResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new WorkitemAttachmentCreateResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>工作项附件创建</p>
     * 
     * @param request WorkitemAttachmentCreateRequest
     * @return WorkitemAttachmentCreateResponse
     */
    public WorkitemAttachmentCreateResponse workitemAttachmentCreate(String organizationId, String workitemIdentifier, WorkitemAttachmentCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.workitemAttachmentCreateWithOptions(organizationId, workitemIdentifier, request, headers, runtime);
    }
}
