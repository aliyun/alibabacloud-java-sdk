// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625;

import com.aliyun.tea.*;
import com.aliyun.devops20210625.models.*;
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

    public RetryPipelineJobRunResponse retryPipelineJobRun(String organizationId, String pipelineId, String pipelineRunId, String jobId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryPipelineJobRunWithOptions(organizationId, pipelineId, pipelineRunId, jobId, headers, runtime);
    }

    public RetryPipelineJobRunResponse retryPipelineJobRunWithOptions(String organizationId, String pipelineId, String pipelineRunId, String jobId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("RetryPipelineJobRun", "2021-06-25", "HTTPS", "PUT", "AK", "/organization/" + organizationId + "/pipelines/" + pipelineId + "/pipelineRuns/" + pipelineRunId + "/jobs/" + jobId + "", "json", req, runtime), new RetryPipelineJobRunResponse());
    }

    public ListResourceMembersResponse listResourceMembers(String organizationId, String resourceType, String resourceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceMembersWithOptions(organizationId, resourceType, resourceId, headers, runtime);
    }

    public ListResourceMembersResponse listResourceMembersWithOptions(String organizationId, String resourceType, String resourceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListResourceMembers", "2021-06-25", "HTTPS", "GET", "AK", "/organization/" + organizationId + "/" + resourceType + "/" + resourceId + "/members", "json", req, runtime), new ListResourceMembersResponse());
    }

    public GetHostGroupResponse getHostGroup(String organizationId, String id) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHostGroupWithOptions(organizationId, id, headers, runtime);
    }

    public GetHostGroupResponse getHostGroupWithOptions(String organizationId, String id, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetHostGroup", "2021-06-25", "HTTPS", "GET", "AK", "/organization/" + organizationId + "/hostGroups/" + id + "", "json", req, runtime), new GetHostGroupResponse());
    }

    public GetVariableGroupResponse getVariableGroup(String organizationId, String id) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getVariableGroupWithOptions(organizationId, id, headers, runtime);
    }

    public GetVariableGroupResponse getVariableGroupWithOptions(String organizationId, String id, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetVariableGroup", "2021-06-25", "HTTPS", "GET", "AK", "/organization/" + organizationId + "/variableGroups/" + id + "", "json", req, runtime), new GetVariableGroupResponse());
    }

    public ListPipelinesResponse listPipelines(String organizationId, ListPipelinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelinesWithOptions(organizationId, request, headers, runtime);
    }

    public ListPipelinesResponse listPipelinesWithOptions(String organizationId, ListPipelinesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pipelineName)) {
            query.put("pipelineName", request.pipelineName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorAccountIds)) {
            query.put("creatorAccountIds", request.creatorAccountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeAccountIds)) {
            query.put("executeAccountIds", request.executeAccountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusList)) {
            query.put("statusList", request.statusList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createStartTime)) {
            query.put("createStartTime", request.createStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createEndTime)) {
            query.put("createEndTime", request.createEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeStartTime)) {
            query.put("executeStartTime", request.executeStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeEndTime)) {
            query.put("executeEndTime", request.executeEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListPipelines", "2021-06-25", "HTTPS", "GET", "AK", "/organization/" + organizationId + "/pipelines", "json", req, runtime), new ListPipelinesResponse());
    }

    public UpdateResourceMemberResponse updateResourceMember(String organizationId, String resourceType, String resourceId, String accountId, UpdateResourceMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateResourceMemberWithOptions(organizationId, resourceType, resourceId, accountId, request, headers, runtime);
    }

    public UpdateResourceMemberResponse updateResourceMemberWithOptions(String organizationId, String resourceType, String resourceId, String accountId, UpdateResourceMemberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("roleName", request.roleName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("UpdateResourceMember", "2021-06-25", "HTTPS", "PUT", "AK", "/organization/" + organizationId + "/" + resourceType + "/" + resourceId + "/members/" + accountId + "", "json", req, runtime), new UpdateResourceMemberResponse());
    }

    public UpdateVariableGroupResponse updateVariableGroup(String organizationId, String id, UpdateVariableGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateVariableGroupWithOptions(organizationId, id, request, headers, runtime);
    }

    public UpdateVariableGroupResponse updateVariableGroupWithOptions(String organizationId, String id, UpdateVariableGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variables)) {
            body.put("variables", request.variables);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("UpdateVariableGroup", "2021-06-25", "HTTPS", "PUT", "AK", "/organization/" + organizationId + "/variableGroups/" + id + "", "json", req, runtime), new UpdateVariableGroupResponse());
    }

    public DeleteResourceMemberResponse deleteResourceMember(String organizationId, String resourceType, String resourceId, String accountId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceMemberWithOptions(organizationId, resourceType, resourceId, accountId, headers, runtime);
    }

    public DeleteResourceMemberResponse deleteResourceMemberWithOptions(String organizationId, String resourceType, String resourceId, String accountId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteResourceMember", "2021-06-25", "HTTPS", "DELETE", "AK", "/organization/" + organizationId + "/" + resourceType + "/" + resourceId + "/members/" + accountId + "", "json", req, runtime), new DeleteResourceMemberResponse());
    }

    public ListHostGroupsResponse listHostGroups(String organizationId, ListHostGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listHostGroupsWithOptions(organizationId, request, headers, runtime);
    }

    public ListHostGroupsResponse listHostGroupsWithOptions(String organizationId, ListHostGroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            query.put("ids", request.ids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createStartTime)) {
            query.put("createStartTime", request.createStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createEndTime)) {
            query.put("createEndTime", request.createEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorAccountIds)) {
            query.put("creatorAccountIds", request.creatorAccountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSort)) {
            query.put("pageSort", request.pageSort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageOrder)) {
            query.put("pageOrder", request.pageOrder);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListHostGroups", "2021-06-25", "HTTPS", "GET", "AK", "/organization/" + organizationId + "/hostGroups", "json", req, runtime), new ListHostGroupsResponse());
    }

    public ResetSshKeyResponse resetSshKey(String organizationId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetSshKeyWithOptions(organizationId, headers, runtime);
    }

    public ResetSshKeyResponse resetSshKeyWithOptions(String organizationId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ResetSshKey", "2021-06-25", "HTTPS", "PUT", "AK", "/organization/" + organizationId + "/sshKey", "json", req, runtime), new ResetSshKeyResponse());
    }

    public CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWorkspaceWithOptions(request, headers, runtime);
    }

    public CreateWorkspaceResponse createWorkspaceWithOptions(CreateWorkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceTemplate)) {
            body.put("workspaceTemplate", request.workspaceTemplate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeUrl)) {
            body.put("codeUrl", request.codeUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeVersion)) {
            body.put("codeVersion", request.codeVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            body.put("filePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reuse)) {
            body.put("reuse", request.reuse);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdentifier)) {
            body.put("resourceIdentifier", request.resourceIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestFrom)) {
            body.put("requestFrom", request.requestFrom);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("CreateWorkspace", "2021-06-25", "HTTPS", "POST", "AK", "/api/workspaces", "json", req, runtime), new CreateWorkspaceResponse());
    }

    public ListServiceConnectionsResponse listServiceConnections(String organizationId, ListServiceConnectionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceConnectionsWithOptions(organizationId, request, headers, runtime);
    }

    public ListServiceConnectionsResponse listServiceConnectionsWithOptions(String organizationId, ListServiceConnectionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sericeConnectionType)) {
            query.put("sericeConnectionType", request.sericeConnectionType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListServiceConnections", "2021-06-25", "HTTPS", "GET", "AK", "/organization/" + organizationId + "/serviceConnections", "json", req, runtime), new ListServiceConnectionsResponse());
    }

    public CreateHostGroupResponse createHostGroup(String organizationId, CreateHostGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createHostGroupWithOptions(organizationId, request, headers, runtime);
    }

    public CreateHostGroupResponse createHostGroupWithOptions(String organizationId, CreateHostGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            body.put("envId", request.envId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.ecsType)) {
            body.put("ecsType", request.ecsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsLabelKey)) {
            body.put("ecsLabelKey", request.ecsLabelKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsLabelValue)) {
            body.put("ecsLabelValue", request.ecsLabelValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunRegion)) {
            body.put("aliyunRegion", request.aliyunRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.machineInfos)) {
            body.put("machineInfos", request.machineInfos);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("CreateHostGroup", "2021-06-25", "HTTPS", "POST", "AK", "/organization/" + organizationId + "/hostGroups", "json", req, runtime), new CreateHostGroupResponse());
    }

    public StopPipelineRunResponse stopPipelineRun(String organizationId, String pipelineId, String pipelineRunId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopPipelineRunWithOptions(organizationId, pipelineId, pipelineRunId, headers, runtime);
    }

    public StopPipelineRunResponse stopPipelineRunWithOptions(String organizationId, String pipelineId, String pipelineRunId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("StopPipelineRun", "2021-06-25", "HTTPS", "PUT", "AK", "/organization/" + organizationId + "/pipelines/" + pipelineId + "/pipelineRuns/" + pipelineRunId + "/stop", "json", req, runtime), new StopPipelineRunResponse());
    }

    public UpdateHostGroupResponse updateHostGroup(String organizationId, String id, UpdateHostGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateHostGroupWithOptions(organizationId, id, request, headers, runtime);
    }

    public UpdateHostGroupResponse updateHostGroupWithOptions(String organizationId, String id, UpdateHostGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            body.put("envId", request.envId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.ecsType)) {
            body.put("ecsType", request.ecsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsLabelKey)) {
            body.put("ecsLabelKey", request.ecsLabelKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsLabelValue)) {
            body.put("ecsLabelValue", request.ecsLabelValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunRegion)) {
            body.put("aliyunRegion", request.aliyunRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.machineInfos)) {
            body.put("machineInfos", request.machineInfos);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("UpdateHostGroup", "2021-06-25", "HTTPS", "PUT", "AK", "/organization/" + organizationId + "/hostGroups/" + id + "", "json", req, runtime), new UpdateHostGroupResponse());
    }

    public CreateResourceMemberResponse createResourceMember(String organizationId, String resourceType, String resourceId, CreateResourceMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceMemberWithOptions(organizationId, resourceType, resourceId, request, headers, runtime);
    }

    public CreateResourceMemberResponse createResourceMemberWithOptions(String organizationId, String resourceType, String resourceId, CreateResourceMemberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("accountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("roleName", request.roleName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("CreateResourceMember", "2021-06-25", "HTTPS", "POST", "AK", "/organization/" + organizationId + "/" + resourceType + "/" + resourceId + "/members", "json", req, runtime), new CreateResourceMemberResponse());
    }

    public SkipPipelineJobRunResponse skipPipelineJobRun(String organizationId, String pipelineId, String pipelineRunId, String jobId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.skipPipelineJobRunWithOptions(organizationId, pipelineId, pipelineRunId, jobId, headers, runtime);
    }

    public SkipPipelineJobRunResponse skipPipelineJobRunWithOptions(String organizationId, String pipelineId, String pipelineRunId, String jobId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("SkipPipelineJobRun", "2021-06-25", "HTTPS", "PUT", "AK", "/organization/" + organizationId + "/pipelines/" + pipelineId + "/pipelineRuns/" + pipelineRunId + "/jobs/" + jobId + "/skip", "json", req, runtime), new SkipPipelineJobRunResponse());
    }

    public StopPipelineJobRunResponse stopPipelineJobRun(String organizationId, String pipelineId, String pipelineRunId, String jobId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopPipelineJobRunWithOptions(organizationId, pipelineId, pipelineRunId, jobId, headers, runtime);
    }

    public StopPipelineJobRunResponse stopPipelineJobRunWithOptions(String organizationId, String pipelineId, String pipelineRunId, String jobId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("StopPipelineJobRun", "2021-06-25", "HTTPS", "PUT", "AK", "/organization/" + organizationId + "/pipelines/" + pipelineId + "/pipelineRuns/" + pipelineRunId + "/jobs/" + jobId + "/stop", "json", req, runtime), new StopPipelineJobRunResponse());
    }

    public StartPipelineRunResponse startPipelineRun(String organizationId, String pipelineId, StartPipelineRunRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startPipelineRunWithOptions(organizationId, pipelineId, request, headers, runtime);
    }

    public StartPipelineRunResponse startPipelineRunWithOptions(String organizationId, String pipelineId, StartPipelineRunRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("StartPipelineRun", "2021-06-25", "HTTPS", "POST", "AK", "/organizations/" + organizationId + "/pipelines/" + pipelineId + "/run", "json", req, runtime), new StartPipelineRunResponse());
    }

    public ListWorkspacesResponse listWorkspaces(ListWorkspacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkspacesWithOptions(request, headers, runtime);
    }

    public ListWorkspacesResponse listWorkspacesWithOptions(ListWorkspacesRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListWorkspacesShrinkRequest request = new ListWorkspacesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.statusList)) {
            request.statusListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.statusList, "statusList", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.workspaceTemplateList)) {
            request.workspaceTemplateListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.workspaceTemplateList, "workspaceTemplateList", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusListShrink)) {
            query.put("statusList", request.statusListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceTemplateListShrink)) {
            query.put("workspaceTemplateList", request.workspaceTemplateListShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListWorkspaces", "2021-06-25", "HTTPS", "GET", "AK", "/api/workspaces", "json", req, runtime), new ListWorkspacesResponse());
    }

    public GetPipelineRunResponse getPipelineRun(String organizationId, String pipelineId, String pipelineRunId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPipelineRunWithOptions(organizationId, pipelineId, pipelineRunId, headers, runtime);
    }

    public GetPipelineRunResponse getPipelineRunWithOptions(String organizationId, String pipelineId, String pipelineRunId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetPipelineRun", "2021-06-25", "HTTPS", "GET", "AK", "/organization/" + organizationId + "/pipelines/" + pipelineId + "/pipelineRuns/" + pipelineRunId + "", "json", req, runtime), new GetPipelineRunResponse());
    }

    public GetPipelineResponse getPipeline(String organizationId, String pipelineId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPipelineWithOptions(organizationId, pipelineId, headers, runtime);
    }

    public GetPipelineResponse getPipelineWithOptions(String organizationId, String pipelineId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetPipeline", "2021-06-25", "HTTPS", "GET", "AK", "/organization/" + organizationId + "/pipelines/" + pipelineId + "", "json", req, runtime), new GetPipelineResponse());
    }

    public CreateVariableGroupResponse createVariableGroup(String organizationId, CreateVariableGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVariableGroupWithOptions(organizationId, request, headers, runtime);
    }

    public CreateVariableGroupResponse createVariableGroupWithOptions(String organizationId, CreateVariableGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variables)) {
            body.put("variables", request.variables);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("CreateVariableGroup", "2021-06-25", "HTTPS", "POST", "AK", "/organization/" + organizationId + "/variableGroups", "json", req, runtime), new CreateVariableGroupResponse());
    }

    public DeleteVariableGroupResponse deleteVariableGroup(String organizationId, String id) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteVariableGroupWithOptions(organizationId, id, headers, runtime);
    }

    public DeleteVariableGroupResponse deleteVariableGroupWithOptions(String organizationId, String id, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteVariableGroup", "2021-06-25", "HTTPS", "DELETE", "AK", "/organization/" + organizationId + "/variableGroups/" + id + "", "json", req, runtime), new DeleteVariableGroupResponse());
    }

    public GetWorkspaceResponse getWorkspace(String workspaceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkspaceWithOptions(workspaceId, headers, runtime);
    }

    public GetWorkspaceResponse getWorkspaceWithOptions(String workspaceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetWorkspace", "2021-06-25", "HTTPS", "GET", "AK", "/api/workspaces/" + workspaceId + "", "json", req, runtime), new GetWorkspaceResponse());
    }

    public CreateSshKeyResponse createSshKey(String organizationId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSshKeyWithOptions(organizationId, headers, runtime);
    }

    public CreateSshKeyResponse createSshKeyWithOptions(String organizationId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("CreateSshKey", "2021-06-25", "HTTPS", "POST", "AK", "/organization/" + organizationId + "/sshKey", "json", req, runtime), new CreateSshKeyResponse());
    }

    public DeleteHostGroupResponse deleteHostGroup(String organizationId, String id) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteHostGroupWithOptions(organizationId, id, headers, runtime);
    }

    public DeleteHostGroupResponse deleteHostGroupWithOptions(String organizationId, String id, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteHostGroup", "2021-06-25", "HTTPS", "DELETE", "AK", "/organization/" + organizationId + "/hostGroups/" + id + "", "json", req, runtime), new DeleteHostGroupResponse());
    }

    public ReleaseWorkspaceResponse releaseWorkspace(String workspaceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.releaseWorkspaceWithOptions(workspaceId, headers, runtime);
    }

    public ReleaseWorkspaceResponse releaseWorkspaceWithOptions(String workspaceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ReleaseWorkspace", "2021-06-25", "HTTPS", "DELETE", "AK", "/api/workspaces/" + workspaceId + "/release", "json", req, runtime), new ReleaseWorkspaceResponse());
    }

    public ListVariableGroupsResponse listVariableGroups(String organizationId, ListVariableGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listVariableGroupsWithOptions(organizationId, request, headers, runtime);
    }

    public ListVariableGroupsResponse listVariableGroupsWithOptions(String organizationId, ListVariableGroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageSort)) {
            query.put("pageSort", request.pageSort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageOrder)) {
            query.put("pageOrder", request.pageOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListVariableGroups", "2021-06-25", "HTTPS", "GET", "AK", "/organization/" + organizationId + "/variableGroups", "json", req, runtime), new ListVariableGroupsResponse());
    }

    public DeletePipelineResponse deletePipeline(String organizationId, String pipelineId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePipelineWithOptions(organizationId, pipelineId, headers, runtime);
    }

    public DeletePipelineResponse deletePipelineWithOptions(String organizationId, String pipelineId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeletePipeline", "2021-06-25", "HTTPS", "DELETE", "AK", "/organization/" + organizationId + "/pipelines/" + pipelineId + "", "json", req, runtime), new DeletePipelineResponse());
    }

    public FrozenWorkspaceResponse frozenWorkspace(String workspaceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.frozenWorkspaceWithOptions(workspaceId, headers, runtime);
    }

    public FrozenWorkspaceResponse frozenWorkspaceWithOptions(String workspaceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("FrozenWorkspace", "2021-06-25", "HTTPS", "PUT", "AK", "/api/workspaces/" + workspaceId + "/frozen", "json", req, runtime), new FrozenWorkspaceResponse());
    }

    public ListPipelineRunsResponse listPipelineRuns(String organizationId, String pipelineId, ListPipelineRunsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelineRunsWithOptions(organizationId, pipelineId, request, headers, runtime);
    }

    public ListPipelineRunsResponse listPipelineRunsWithOptions(String organizationId, String pipelineId, ListPipelineRunsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerMode)) {
            query.put("triggerMode", request.triggerMode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListPipelineRuns", "2021-06-25", "HTTPS", "GET", "AK", "/organization/" + organizationId + "/pipelines/" + pipelineId + "/pipelineRuns", "json", req, runtime), new ListPipelineRunsResponse());
    }
}
