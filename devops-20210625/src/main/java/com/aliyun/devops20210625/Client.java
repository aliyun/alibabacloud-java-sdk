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

    public CreateHostGroupResponse createHostGroup(String organizationId, CreateHostGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createHostGroupWithOptions(organizationId, request, headers, runtime);
    }

    public CreateHostGroupResponse createHostGroupWithOptions(String organizationId, CreateHostGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHostGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/hostGroups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHostGroupResponse());
    }

    public CreateResourceMemberResponse createResourceMember(String organizationId, String resourceType, String resourceId, CreateResourceMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceMemberWithOptions(organizationId, resourceType, resourceId, request, headers, runtime);
    }

    public CreateResourceMemberResponse createResourceMemberWithOptions(String organizationId, String resourceType, String resourceId, CreateResourceMemberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        resourceType = com.aliyun.openapiutil.Client.getEncodeParam(resourceType);
        resourceId = com.aliyun.openapiutil.Client.getEncodeParam(resourceId);
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResourceMember"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/{resourceType}/{resourceId}/members"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceMemberResponse());
    }

    public CreateSshKeyResponse createSshKey(String organizationId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSshKeyWithOptions(organizationId, headers, runtime);
    }

    public CreateSshKeyResponse createSshKeyWithOptions(String organizationId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSshKey"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/sshKey"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSshKeyResponse());
    }

    public CreateVariableGroupResponse createVariableGroup(String organizationId, CreateVariableGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVariableGroupWithOptions(organizationId, request, headers, runtime);
    }

    public CreateVariableGroupResponse createVariableGroupWithOptions(String organizationId, CreateVariableGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVariableGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/variableGroups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVariableGroupResponse());
    }

    public CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWorkspaceWithOptions(request, headers, runtime);
    }

    public CreateWorkspaceResponse createWorkspaceWithOptions(CreateWorkspaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.codeUrl)) {
            body.put("codeUrl", request.codeUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeVersion)) {
            body.put("codeVersion", request.codeVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            body.put("filePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestFrom)) {
            body.put("requestFrom", request.requestFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdentifier)) {
            body.put("resourceIdentifier", request.resourceIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reuse)) {
            body.put("reuse", request.reuse);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceTemplate)) {
            body.put("workspaceTemplate", request.workspaceTemplate);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkspace"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/workspaces"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkspaceResponse());
    }

    public DeleteHostGroupResponse deleteHostGroup(String organizationId, String id) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteHostGroupWithOptions(organizationId, id, headers, runtime);
    }

    public DeleteHostGroupResponse deleteHostGroupWithOptions(String organizationId, String id, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        id = com.aliyun.openapiutil.Client.getEncodeParam(id);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHostGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/hostGroups/{id}"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHostGroupResponse());
    }

    public DeletePipelineResponse deletePipeline(String organizationId, String pipelineId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePipelineWithOptions(organizationId, pipelineId, headers, runtime);
    }

    public DeletePipelineResponse deletePipelineWithOptions(String organizationId, String pipelineId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        pipelineId = com.aliyun.openapiutil.Client.getEncodeParam(pipelineId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePipeline"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/pipelines/{pipelineId}"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePipelineResponse());
    }

    public DeleteResourceMemberResponse deleteResourceMember(String organizationId, String resourceType, String resourceId, String accountId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceMemberWithOptions(organizationId, resourceType, resourceId, accountId, headers, runtime);
    }

    public DeleteResourceMemberResponse deleteResourceMemberWithOptions(String organizationId, String resourceType, String resourceId, String accountId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        resourceType = com.aliyun.openapiutil.Client.getEncodeParam(resourceType);
        resourceId = com.aliyun.openapiutil.Client.getEncodeParam(resourceId);
        accountId = com.aliyun.openapiutil.Client.getEncodeParam(accountId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResourceMember"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/{resourceType}/{resourceId}/members/{accountId}"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceMemberResponse());
    }

    public DeleteVariableGroupResponse deleteVariableGroup(String organizationId, String id) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteVariableGroupWithOptions(organizationId, id, headers, runtime);
    }

    public DeleteVariableGroupResponse deleteVariableGroupWithOptions(String organizationId, String id, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        id = com.aliyun.openapiutil.Client.getEncodeParam(id);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVariableGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/variableGroups/{id}"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVariableGroupResponse());
    }

    public FrozenWorkspaceResponse frozenWorkspace(String workspaceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.frozenWorkspaceWithOptions(workspaceId, headers, runtime);
    }

    public FrozenWorkspaceResponse frozenWorkspaceWithOptions(String workspaceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        workspaceId = com.aliyun.openapiutil.Client.getEncodeParam(workspaceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FrozenWorkspace"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/workspaces/" + workspaceId + "/frozen"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FrozenWorkspaceResponse());
    }

    public GetHostGroupResponse getHostGroup(String organizationId, String id) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHostGroupWithOptions(organizationId, id, headers, runtime);
    }

    public GetHostGroupResponse getHostGroupWithOptions(String organizationId, String id, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        id = com.aliyun.openapiutil.Client.getEncodeParam(id);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHostGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/hostGroups/{id}"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHostGroupResponse());
    }

    public GetOrganizationMemberResponse getOrganizationMember(String organizationId, String accountId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOrganizationMemberWithOptions(organizationId, accountId, headers, runtime);
    }

    public GetOrganizationMemberResponse getOrganizationMemberWithOptions(String organizationId, String accountId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        accountId = com.aliyun.openapiutil.Client.getEncodeParam(accountId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOrganizationMember"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/members/{accountId}"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOrganizationMemberResponse());
    }

    public GetPipelineResponse getPipeline(String organizationId, String pipelineId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPipelineWithOptions(organizationId, pipelineId, headers, runtime);
    }

    public GetPipelineResponse getPipelineWithOptions(String organizationId, String pipelineId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        pipelineId = com.aliyun.openapiutil.Client.getEncodeParam(pipelineId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPipeline"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/pipelines/{pipelineId}"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPipelineResponse());
    }

    public GetPipelineRunResponse getPipelineRun(String organizationId, String pipelineId, String pipelineRunId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPipelineRunWithOptions(organizationId, pipelineId, pipelineRunId, headers, runtime);
    }

    public GetPipelineRunResponse getPipelineRunWithOptions(String organizationId, String pipelineId, String pipelineRunId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        pipelineId = com.aliyun.openapiutil.Client.getEncodeParam(pipelineId);
        pipelineRunId = com.aliyun.openapiutil.Client.getEncodeParam(pipelineRunId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPipelineRun"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/pipelines/{pipelineId}/pipelineRuns/{pipelineRunId}"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPipelineRunResponse());
    }

    public GetVMDeployOrderResponse getVMDeployOrder(String organizationId, String pipelineId, String deployOrderId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getVMDeployOrderWithOptions(organizationId, pipelineId, deployOrderId, headers, runtime);
    }

    public GetVMDeployOrderResponse getVMDeployOrderWithOptions(String organizationId, String pipelineId, String deployOrderId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        pipelineId = com.aliyun.openapiutil.Client.getEncodeParam(pipelineId);
        deployOrderId = com.aliyun.openapiutil.Client.getEncodeParam(deployOrderId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVMDeployOrder"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/pipelines/{pipelineId}/deploy/{deployOrderId}"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVMDeployOrderResponse());
    }

    public GetVariableGroupResponse getVariableGroup(String organizationId, String id) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getVariableGroupWithOptions(organizationId, id, headers, runtime);
    }

    public GetVariableGroupResponse getVariableGroupWithOptions(String organizationId, String id, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        id = com.aliyun.openapiutil.Client.getEncodeParam(id);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVariableGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/variableGroups/{id}"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVariableGroupResponse());
    }

    public GetWorkspaceResponse getWorkspace(String workspaceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkspaceWithOptions(workspaceId, headers, runtime);
    }

    public GetWorkspaceResponse getWorkspaceWithOptions(String workspaceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        workspaceId = com.aliyun.openapiutil.Client.getEncodeParam(workspaceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkspace"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/workspaces/" + workspaceId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkspaceResponse());
    }

    public ListHostGroupsResponse listHostGroups(String organizationId, ListHostGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listHostGroupsWithOptions(organizationId, request, headers, runtime);
    }

    public ListHostGroupsResponse listHostGroupsWithOptions(String organizationId, ListHostGroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHostGroups"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/hostGroups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHostGroupsResponse());
    }

    public ListOrganizationMembersResponse listOrganizationMembers(String organizationId, ListOrganizationMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOrganizationMembersWithOptions(organizationId, request, headers, runtime);
    }

    public ListOrganizationMembersResponse listOrganizationMembersWithOptions(String organizationId, ListOrganizationMembersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOrganizationMembers"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/members"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOrganizationMembersResponse());
    }

    public ListPipelineRunsResponse listPipelineRuns(String organizationId, String pipelineId, ListPipelineRunsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelineRunsWithOptions(organizationId, pipelineId, request, headers, runtime);
    }

    public ListPipelineRunsResponse listPipelineRunsWithOptions(String organizationId, String pipelineId, ListPipelineRunsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        pipelineId = com.aliyun.openapiutil.Client.getEncodeParam(pipelineId);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPipelineRuns"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/pipelines/{pipelineId}/pipelineRuns"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPipelineRunsResponse());
    }

    public ListPipelinesResponse listPipelines(String organizationId, ListPipelinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelinesWithOptions(organizationId, request, headers, runtime);
    }

    public ListPipelinesResponse listPipelinesWithOptions(String organizationId, ListPipelinesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPipelines"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/pipelines"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPipelinesResponse());
    }

    public ListResourceMembersResponse listResourceMembers(String organizationId, String resourceType, String resourceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceMembersWithOptions(organizationId, resourceType, resourceId, headers, runtime);
    }

    public ListResourceMembersResponse listResourceMembersWithOptions(String organizationId, String resourceType, String resourceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        resourceType = com.aliyun.openapiutil.Client.getEncodeParam(resourceType);
        resourceId = com.aliyun.openapiutil.Client.getEncodeParam(resourceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceMembers"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/{resourceType}/{resourceId}/members"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceMembersResponse());
    }

    public ListServiceConnectionsResponse listServiceConnections(String organizationId, ListServiceConnectionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceConnectionsWithOptions(organizationId, request, headers, runtime);
    }

    public ListServiceConnectionsResponse listServiceConnectionsWithOptions(String organizationId, ListServiceConnectionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sericeConnectionType)) {
            query.put("sericeConnectionType", request.sericeConnectionType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceConnections"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/serviceConnections"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceConnectionsResponse());
    }

    public ListVariableGroupsResponse listVariableGroups(String organizationId, ListVariableGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listVariableGroupsWithOptions(organizationId, request, headers, runtime);
    }

    public ListVariableGroupsResponse listVariableGroupsWithOptions(String organizationId, ListVariableGroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVariableGroups"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/variableGroups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVariableGroupsResponse());
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
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkspaces"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/workspaces"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkspacesResponse());
    }

    public LogPipelineJobRunResponse logPipelineJobRun(String organizationId, String pipelineId, String jobId, String pipelineRunId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.logPipelineJobRunWithOptions(organizationId, pipelineId, jobId, pipelineRunId, headers, runtime);
    }

    public LogPipelineJobRunResponse logPipelineJobRunWithOptions(String organizationId, String pipelineId, String jobId, String pipelineRunId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        pipelineId = com.aliyun.openapiutil.Client.getEncodeParam(pipelineId);
        jobId = com.aliyun.openapiutil.Client.getEncodeParam(jobId);
        pipelineRunId = com.aliyun.openapiutil.Client.getEncodeParam(pipelineRunId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LogPipelineJobRun"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/pipeline/{pipelineId}/pipelineRun/{pipelineRunId}/job/{jobId}/logs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LogPipelineJobRunResponse());
    }

    public LogVMDeployMachineResponse logVMDeployMachine(String organizationId, String pipelineId, String deployOrderId, String machineSn) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.logVMDeployMachineWithOptions(organizationId, pipelineId, deployOrderId, machineSn, headers, runtime);
    }

    public LogVMDeployMachineResponse logVMDeployMachineWithOptions(String organizationId, String pipelineId, String deployOrderId, String machineSn, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        pipelineId = com.aliyun.openapiutil.Client.getEncodeParam(pipelineId);
        deployOrderId = com.aliyun.openapiutil.Client.getEncodeParam(deployOrderId);
        machineSn = com.aliyun.openapiutil.Client.getEncodeParam(machineSn);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LogVMDeployMachine"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/pipelines/{pipelineId}/deploy/{deployOrderId}/machine/{machineSn}/log"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LogVMDeployMachineResponse());
    }

    public PassPipelineValidateResponse passPipelineValidate(String organizationId, String pipelineId, String pipelineRunId, String jobId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.passPipelineValidateWithOptions(organizationId, pipelineId, pipelineRunId, jobId, headers, runtime);
    }

    public PassPipelineValidateResponse passPipelineValidateWithOptions(String organizationId, String pipelineId, String pipelineRunId, String jobId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        pipelineId = com.aliyun.openapiutil.Client.getEncodeParam(pipelineId);
        pipelineRunId = com.aliyun.openapiutil.Client.getEncodeParam(pipelineRunId);
        jobId = com.aliyun.openapiutil.Client.getEncodeParam(jobId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PassPipelineValidate"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/pipelines/{pipelineId}/pipelineRuns/{pipelineRunId}/jobs/{jobId}/pass"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PassPipelineValidateResponse());
    }

    public RefusePipelineValidateResponse refusePipelineValidate(String organizationId, String pipelineId, String pipelineRunId, String jobId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refusePipelineValidateWithOptions(organizationId, pipelineId, pipelineRunId, jobId, headers, runtime);
    }

    public RefusePipelineValidateResponse refusePipelineValidateWithOptions(String organizationId, String pipelineId, String pipelineRunId, String jobId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        pipelineId = com.aliyun.openapiutil.Client.getEncodeParam(pipelineId);
        pipelineRunId = com.aliyun.openapiutil.Client.getEncodeParam(pipelineRunId);
        jobId = com.aliyun.openapiutil.Client.getEncodeParam(jobId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefusePipelineValidate"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/pipelines/{pipelineId}/pipelineRuns/{pipelineRunId}/jobs/{jobId}/refuse"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefusePipelineValidateResponse());
    }

    public ReleaseWorkspaceResponse releaseWorkspace(String workspaceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.releaseWorkspaceWithOptions(workspaceId, headers, runtime);
    }

    public ReleaseWorkspaceResponse releaseWorkspaceWithOptions(String workspaceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        workspaceId = com.aliyun.openapiutil.Client.getEncodeParam(workspaceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseWorkspace"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/workspaces/" + workspaceId + "/release"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseWorkspaceResponse());
    }

    public ResetSshKeyResponse resetSshKey(String organizationId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetSshKeyWithOptions(organizationId, headers, runtime);
    }

    public ResetSshKeyResponse resetSshKeyWithOptions(String organizationId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetSshKey"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/sshKey"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetSshKeyResponse());
    }

    public ResumeVMDeployOrderResponse resumeVMDeployOrder(String organizationId, String pipelineId, String deployOrderId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeVMDeployOrderWithOptions(organizationId, pipelineId, deployOrderId, headers, runtime);
    }

    public ResumeVMDeployOrderResponse resumeVMDeployOrderWithOptions(String organizationId, String pipelineId, String deployOrderId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        pipelineId = com.aliyun.openapiutil.Client.getEncodeParam(pipelineId);
        deployOrderId = com.aliyun.openapiutil.Client.getEncodeParam(deployOrderId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeVMDeployOrder"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/pipelines/{pipelineId}/deploy/{deployOrderId}/resume"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeVMDeployOrderResponse());
    }

    public RetryPipelineJobRunResponse retryPipelineJobRun(String organizationId, String pipelineId, String pipelineRunId, String jobId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryPipelineJobRunWithOptions(organizationId, pipelineId, pipelineRunId, jobId, headers, runtime);
    }

    public RetryPipelineJobRunResponse retryPipelineJobRunWithOptions(String organizationId, String pipelineId, String pipelineRunId, String jobId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        pipelineId = com.aliyun.openapiutil.Client.getEncodeParam(pipelineId);
        pipelineRunId = com.aliyun.openapiutil.Client.getEncodeParam(pipelineRunId);
        jobId = com.aliyun.openapiutil.Client.getEncodeParam(jobId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryPipelineJobRun"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/pipelines/{pipelineId}/pipelineRuns/{pipelineRunId}/jobs/{jobId}"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryPipelineJobRunResponse());
    }

    public RetryVMDeployMachineResponse retryVMDeployMachine(String organizationId, String pipelineId, String deployOrderId, String machineSn) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryVMDeployMachineWithOptions(organizationId, pipelineId, deployOrderId, machineSn, headers, runtime);
    }

    public RetryVMDeployMachineResponse retryVMDeployMachineWithOptions(String organizationId, String pipelineId, String deployOrderId, String machineSn, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        pipelineId = com.aliyun.openapiutil.Client.getEncodeParam(pipelineId);
        deployOrderId = com.aliyun.openapiutil.Client.getEncodeParam(deployOrderId);
        machineSn = com.aliyun.openapiutil.Client.getEncodeParam(machineSn);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryVMDeployMachine"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/pipelines/{pipelineId}/deploy/{deployOrderId}/machine/{machineSn}/retry"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryVMDeployMachineResponse());
    }

    public SkipPipelineJobRunResponse skipPipelineJobRun(String organizationId, String pipelineId, String pipelineRunId, String jobId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.skipPipelineJobRunWithOptions(organizationId, pipelineId, pipelineRunId, jobId, headers, runtime);
    }

    public SkipPipelineJobRunResponse skipPipelineJobRunWithOptions(String organizationId, String pipelineId, String pipelineRunId, String jobId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        pipelineId = com.aliyun.openapiutil.Client.getEncodeParam(pipelineId);
        pipelineRunId = com.aliyun.openapiutil.Client.getEncodeParam(pipelineRunId);
        jobId = com.aliyun.openapiutil.Client.getEncodeParam(jobId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SkipPipelineJobRun"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/pipelines/{pipelineId}/pipelineRuns/{pipelineRunId}/jobs/{jobId}/skip"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SkipPipelineJobRunResponse());
    }

    public SkipVMDeployMachineResponse skipVMDeployMachine(String organizationId, String pipelineId, String deployOrderId, String machineSn) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.skipVMDeployMachineWithOptions(organizationId, pipelineId, deployOrderId, machineSn, headers, runtime);
    }

    public SkipVMDeployMachineResponse skipVMDeployMachineWithOptions(String organizationId, String pipelineId, String deployOrderId, String machineSn, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        pipelineId = com.aliyun.openapiutil.Client.getEncodeParam(pipelineId);
        deployOrderId = com.aliyun.openapiutil.Client.getEncodeParam(deployOrderId);
        machineSn = com.aliyun.openapiutil.Client.getEncodeParam(machineSn);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SkipVMDeployMachine"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/pipelines/{pipelineId}/deploy/{deployOrderId}/machine/{machineSn}/skip"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SkipVMDeployMachineResponse());
    }

    public StartPipelineRunResponse startPipelineRun(String organizationId, String pipelineId, StartPipelineRunRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startPipelineRunWithOptions(organizationId, pipelineId, request, headers, runtime);
    }

    public StartPipelineRunResponse startPipelineRunWithOptions(String organizationId, String pipelineId, StartPipelineRunRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        pipelineId = com.aliyun.openapiutil.Client.getEncodeParam(pipelineId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartPipelineRun"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organizations/" + organizationId + "/pipelines/{pipelineId}/run"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartPipelineRunResponse());
    }

    public StopPipelineJobRunResponse stopPipelineJobRun(String organizationId, String pipelineId, String pipelineRunId, String jobId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopPipelineJobRunWithOptions(organizationId, pipelineId, pipelineRunId, jobId, headers, runtime);
    }

    public StopPipelineJobRunResponse stopPipelineJobRunWithOptions(String organizationId, String pipelineId, String pipelineRunId, String jobId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        pipelineId = com.aliyun.openapiutil.Client.getEncodeParam(pipelineId);
        pipelineRunId = com.aliyun.openapiutil.Client.getEncodeParam(pipelineRunId);
        jobId = com.aliyun.openapiutil.Client.getEncodeParam(jobId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopPipelineJobRun"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/pipelines/{pipelineId}/pipelineRuns/{pipelineRunId}/jobs/{jobId}/stop"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopPipelineJobRunResponse());
    }

    public StopPipelineRunResponse stopPipelineRun(String organizationId, String pipelineId, String pipelineRunId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopPipelineRunWithOptions(organizationId, pipelineId, pipelineRunId, headers, runtime);
    }

    public StopPipelineRunResponse stopPipelineRunWithOptions(String organizationId, String pipelineId, String pipelineRunId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        pipelineId = com.aliyun.openapiutil.Client.getEncodeParam(pipelineId);
        pipelineRunId = com.aliyun.openapiutil.Client.getEncodeParam(pipelineRunId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopPipelineRun"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/pipelines/{pipelineId}/pipelineRuns/{pipelineRunId}/stop"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopPipelineRunResponse());
    }

    public StopVMDeployOrderResponse stopVMDeployOrder(String organizationId, String pipelineId, String deployOrderId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopVMDeployOrderWithOptions(organizationId, pipelineId, deployOrderId, headers, runtime);
    }

    public StopVMDeployOrderResponse stopVMDeployOrderWithOptions(String organizationId, String pipelineId, String deployOrderId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        pipelineId = com.aliyun.openapiutil.Client.getEncodeParam(pipelineId);
        deployOrderId = com.aliyun.openapiutil.Client.getEncodeParam(deployOrderId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopVMDeployOrder"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/pipelines/{pipelineId}/deploy/{deployOrderId}/stop"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopVMDeployOrderResponse());
    }

    public UpdateHostGroupResponse updateHostGroup(String organizationId, String id, UpdateHostGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateHostGroupWithOptions(organizationId, id, request, headers, runtime);
    }

    public UpdateHostGroupResponse updateHostGroupWithOptions(String organizationId, String id, UpdateHostGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        id = com.aliyun.openapiutil.Client.getEncodeParam(id);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateHostGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/hostGroups/{id}"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHostGroupResponse());
    }

    public UpdateResourceMemberResponse updateResourceMember(String organizationId, String resourceType, String resourceId, String accountId, UpdateResourceMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateResourceMemberWithOptions(organizationId, resourceType, resourceId, accountId, request, headers, runtime);
    }

    public UpdateResourceMemberResponse updateResourceMemberWithOptions(String organizationId, String resourceType, String resourceId, String accountId, UpdateResourceMemberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        resourceType = com.aliyun.openapiutil.Client.getEncodeParam(resourceType);
        resourceId = com.aliyun.openapiutil.Client.getEncodeParam(resourceId);
        accountId = com.aliyun.openapiutil.Client.getEncodeParam(accountId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("roleName", request.roleName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResourceMember"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/{resourceType}/{resourceId}/members/{accountId}"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceMemberResponse());
    }

    public UpdateVariableGroupResponse updateVariableGroup(String organizationId, String id, UpdateVariableGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateVariableGroupWithOptions(organizationId, id, request, headers, runtime);
    }

    public UpdateVariableGroupResponse updateVariableGroupWithOptions(String organizationId, String id, UpdateVariableGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        organizationId = com.aliyun.openapiutil.Client.getEncodeParam(organizationId);
        id = com.aliyun.openapiutil.Client.getEncodeParam(id);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVariableGroup"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/organization/" + organizationId + "/variableGroups/{id}"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVariableGroupResponse());
    }
}
