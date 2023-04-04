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
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddGroupMemberResponse());
    }

    public AddGroupMemberResponse addGroupMember(String groupId, AddGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addGroupMemberWithOptions(groupId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddPipelineRelationsResponse());
    }

    public AddPipelineRelationsResponse addPipelineRelations(String organizationId, String pipelineId, AddPipelineRelationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addPipelineRelationsWithOptions(organizationId, pipelineId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddRepositoryMemberResponse());
    }

    public AddRepositoryMemberResponse addRepositoryMember(String repositoryId, AddRepositoryMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addRepositoryMemberWithOptions(repositoryId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddWebhookResponse());
    }

    public AddWebhookResponse addWebhook(String repositoryId, AddWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addWebhookWithOptions(repositoryId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBranchResponse());
    }

    public CreateBranchResponse createBranch(String repositoryId, CreateBranchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBranchWithOptions(repositoryId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeployKeyResponse());
    }

    public CreateDeployKeyResponse createDeployKey(String repositoryId, CreateDeployKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDeployKeyWithOptions(repositoryId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFileResponse());
    }

    public CreateFileResponse createFile(String repositoryId, CreateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFileWithOptions(repositoryId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlowTagResponse());
    }

    public CreateFlowTagResponse createFlowTag(String organizationId, CreateFlowTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFlowTagWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlowTagGroupResponse());
    }

    public CreateFlowTagGroupResponse createFlowTagGroup(String organizationId, CreateFlowTagGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFlowTagGroupWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHostGroupResponse());
    }

    public CreateHostGroupResponse createHostGroup(String organizationId, CreateHostGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createHostGroupWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOAuthTokenResponse());
    }

    public CreateOAuthTokenResponse createOAuthToken(CreateOAuthTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOAuthTokenWithOptions(request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePipelineGroupResponse());
    }

    public CreatePipelineGroupResponse createPipelineGroup(String organizationId, CreatePipelineGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPipelineGroupWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectResponse());
    }

    public CreateProjectResponse createProject(String organizationId, CreateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProjectWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProtectdBranchResponse());
    }

    public CreateProtectdBranchResponse createProtectdBranch(String repositoryId, CreateProtectdBranchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProtectdBranchWithOptions(repositoryId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRepositoryResponse());
    }

    public CreateRepositoryResponse createRepository(CreateRepositoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRepositoryWithOptions(request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRepositoryGroupResponse());
    }

    public CreateRepositoryGroupResponse createRepositoryGroup(CreateRepositoryGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRepositoryGroupWithOptions(request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceMemberResponse());
    }

    public CreateResourceMemberResponse createResourceMember(String organizationId, String resourceType, String resourceId, CreateResourceMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createResourceMemberWithOptions(organizationId, resourceType, resourceId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSprintResponse());
    }

    public CreateSprintResponse createSprint(String organizationId, CreateSprintRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSprintWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSshKeyResponse());
    }

    public CreateSshKeyResponse createSshKey(String organizationId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSshKeyWithOptions(organizationId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTagResponse());
    }

    public CreateTagResponse createTag(String repositoryId, CreateTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTagWithOptions(repositoryId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVariableGroupResponse());
    }

    public CreateVariableGroupResponse createVariableGroup(String organizationId, CreateVariableGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVariableGroupWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkitemResponse());
    }

    public CreateWorkitemResponse createWorkitem(String organizationId, CreateWorkitemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWorkitemWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkitemCommentResponse());
    }

    public CreateWorkitemCommentResponse createWorkitemComment(String organizationId, CreateWorkitemCommentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWorkitemCommentWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkitemEstimateResponse());
    }

    public CreateWorkitemEstimateResponse createWorkitemEstimate(String organizationId, CreateWorkitemEstimateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWorkitemEstimateWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkitemRecordResponse());
    }

    public CreateWorkitemRecordResponse createWorkitemRecord(String organizationId, CreateWorkitemRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWorkitemRecordWithOptions(organizationId, request, headers, runtime);
    }

    public CreateWorkspaceResponse createWorkspaceWithOptions(CreateWorkspaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    public CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWorkspaceWithOptions(request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBranchResponse());
    }

    public DeleteBranchResponse deleteBranch(String repositoryId, DeleteBranchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBranchWithOptions(repositoryId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFileResponse());
    }

    public DeleteFileResponse deleteFile(String repositoryId, DeleteFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFileWithOptions(repositoryId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFlowTagResponse());
    }

    public DeleteFlowTagResponse deleteFlowTag(String organizationId, String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFlowTagWithOptions(organizationId, id, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFlowTagGroupResponse());
    }

    public DeleteFlowTagGroupResponse deleteFlowTagGroup(String organizationId, String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFlowTagGroupWithOptions(organizationId, id, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGroupMemberResponse());
    }

    public DeleteGroupMemberResponse deleteGroupMember(String groupId, DeleteGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGroupMemberWithOptions(groupId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHostGroupResponse());
    }

    public DeleteHostGroupResponse deleteHostGroup(String organizationId, String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteHostGroupWithOptions(organizationId, id, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePipelineResponse());
    }

    public DeletePipelineResponse deletePipeline(String organizationId, String pipelineId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePipelineWithOptions(organizationId, pipelineId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePipelineGroupResponse());
    }

    public DeletePipelineGroupResponse deletePipelineGroup(String organizationId, String groupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePipelineGroupWithOptions(organizationId, groupId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePipelineRelationsResponse());
    }

    public DeletePipelineRelationsResponse deletePipelineRelations(String organizationId, String pipelineId, DeletePipelineRelationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePipelineRelationsWithOptions(organizationId, pipelineId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProjectResponse());
    }

    public DeleteProjectResponse deleteProject(String organizationId, DeleteProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProjectWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProtectedBranchResponse());
    }

    public DeleteProtectedBranchResponse deleteProtectedBranch(String repositoryId, String protectedBranchId, DeleteProtectedBranchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProtectedBranchWithOptions(repositoryId, protectedBranchId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRepositoryResponse());
    }

    public DeleteRepositoryResponse deleteRepository(String repositoryId, DeleteRepositoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRepositoryWithOptions(repositoryId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRepositoryGroupResponse());
    }

    public DeleteRepositoryGroupResponse deleteRepositoryGroup(String groupId, DeleteRepositoryGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRepositoryGroupWithOptions(groupId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRepositoryMemberResponse());
    }

    public DeleteRepositoryMemberResponse deleteRepositoryMember(String repositoryId, String aliyunPk, DeleteRepositoryMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRepositoryMemberWithOptions(repositoryId, aliyunPk, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRepositoryWebhookResponse());
    }

    public DeleteRepositoryWebhookResponse deleteRepositoryWebhook(String repositoryId, String hookId, DeleteRepositoryWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRepositoryWebhookWithOptions(repositoryId, hookId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceMemberResponse());
    }

    public DeleteResourceMemberResponse deleteResourceMember(String organizationId, String resourceType, String resourceId, String accountId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteResourceMemberWithOptions(organizationId, resourceType, resourceId, accountId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTagResponse());
    }

    public DeleteTagResponse deleteTag(String repositoryId, DeleteTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTagWithOptions(repositoryId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVariableGroupResponse());
    }

    public DeleteVariableGroupResponse deleteVariableGroup(String organizationId, String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteVariableGroupWithOptions(organizationId, id, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkitemResponse());
    }

    public DeleteWorkitemResponse deleteWorkitem(String organizationId, DeleteWorkitemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteWorkitemWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkitemAllCommentResponse());
    }

    public DeleteWorkitemAllCommentResponse deleteWorkitemAllComment(String organizationId, DeleteWorkitemAllCommentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteWorkitemAllCommentWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkitemCommentResponse());
    }

    public DeleteWorkitemCommentResponse deleteWorkitemComment(String organizationId, DeleteWorkitemCommentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteWorkitemCommentWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableDeployKeyResponse());
    }

    public EnableDeployKeyResponse enableDeployKey(String repositoryId, String keyId, EnableDeployKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableDeployKeyWithOptions(repositoryId, keyId, request, headers, runtime);
    }

    public FrozenWorkspaceResponse frozenWorkspaceWithOptions(String workspaceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FrozenWorkspace"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/frozen"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FrozenWorkspaceResponse());
    }

    public FrozenWorkspaceResponse frozenWorkspace(String workspaceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.frozenWorkspaceWithOptions(workspaceId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBranchInfoResponse());
    }

    public GetBranchInfoResponse getBranchInfo(String repositoryId, GetBranchInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBranchInfoWithOptions(repositoryId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCodeupOrganizationResponse());
    }

    public GetCodeupOrganizationResponse getCodeupOrganization(String identity, GetCodeupOrganizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCodeupOrganizationWithOptions(identity, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCompareDetailResponse());
    }

    public GetCompareDetailResponse getCompareDetail(String repositoryId, GetCompareDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCompareDetailWithOptions(repositoryId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomFieldOptionResponse());
    }

    public GetCustomFieldOptionResponse getCustomFieldOption(String organizationId, String fieldId, GetCustomFieldOptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCustomFieldOptionWithOptions(organizationId, fieldId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFileBlobsResponse());
    }

    public GetFileBlobsResponse getFileBlobs(String repositoryId, GetFileBlobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFileBlobsWithOptions(repositoryId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFileLastCommitResponse());
    }

    public GetFileLastCommitResponse getFileLastCommit(String repositoryId, GetFileLastCommitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFileLastCommitWithOptions(repositoryId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFlowTagGroupResponse());
    }

    public GetFlowTagGroupResponse getFlowTagGroup(String organizationId, String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFlowTagGroupWithOptions(organizationId, id, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGroupDetailResponse());
    }

    public GetGroupDetailResponse getGroupDetail(GetGroupDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGroupDetailWithOptions(request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHostGroupResponse());
    }

    public GetHostGroupResponse getHostGroup(String organizationId, String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHostGroupWithOptions(organizationId, id, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOrganizationMemberResponse());
    }

    public GetOrganizationMemberResponse getOrganizationMember(String organizationId, String accountId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOrganizationMemberWithOptions(organizationId, accountId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPipelineResponse());
    }

    public GetPipelineResponse getPipeline(String organizationId, String pipelineId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPipelineWithOptions(organizationId, pipelineId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPipelineArtifactUrlResponse());
    }

    public GetPipelineArtifactUrlResponse getPipelineArtifactUrl(String organizationId, GetPipelineArtifactUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPipelineArtifactUrlWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPipelineEmasArtifactUrlResponse());
    }

    public GetPipelineEmasArtifactUrlResponse getPipelineEmasArtifactUrl(String organizationId, String emasJobInstanceId, String md5, String pipelineId, String pipelineRunId, GetPipelineEmasArtifactUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPipelineEmasArtifactUrlWithOptions(organizationId, emasJobInstanceId, md5, pipelineId, pipelineRunId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPipelineGroupResponse());
    }

    public GetPipelineGroupResponse getPipelineGroup(String organizationId, String groupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPipelineGroupWithOptions(organizationId, groupId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPipelineRunResponse());
    }

    public GetPipelineRunResponse getPipelineRun(String organizationId, String pipelineId, String pipelineRunId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPipelineRunWithOptions(organizationId, pipelineId, pipelineRunId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPipelineScanReportUrlResponse());
    }

    public GetPipelineScanReportUrlResponse getPipelineScanReportUrl(String organizationId, GetPipelineScanReportUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPipelineScanReportUrlWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectInfoResponse());
    }

    public GetProjectInfoResponse getProjectInfo(String organizationId, String projectId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProjectInfoWithOptions(organizationId, projectId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectMemberResponse());
    }

    public GetProjectMemberResponse getProjectMember(String repositoryId, String aliyunPk, GetProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProjectMemberWithOptions(repositoryId, aliyunPk, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepositoryResponse());
    }

    public GetRepositoryResponse getRepository(GetRepositoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepositoryWithOptions(request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepositoryCommitResponse());
    }

    public GetRepositoryCommitResponse getRepositoryCommit(String repositoryId, String sha, GetRepositoryCommitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepositoryCommitWithOptions(repositoryId, sha, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepositoryTagResponse());
    }

    public GetRepositoryTagResponse getRepositoryTag(String repositoryId, GetRepositoryTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepositoryTagWithOptions(repositoryId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSearchCodePreviewResponse());
    }

    public GetSearchCodePreviewResponse getSearchCodePreview(GetSearchCodePreviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSearchCodePreviewWithOptions(request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSprintInfoResponse());
    }

    public GetSprintInfoResponse getSprintInfo(String organizationId, String sprintId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSprintInfoWithOptions(organizationId, sprintId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserInfoResponse());
    }

    public GetUserInfoResponse getUserInfo(GetUserInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserInfoWithOptions(request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVMDeployOrderResponse());
    }

    public GetVMDeployOrderResponse getVMDeployOrder(String organizationId, String pipelineId, String deployOrderId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getVMDeployOrderWithOptions(organizationId, pipelineId, deployOrderId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVariableGroupResponse());
    }

    public GetVariableGroupResponse getVariableGroup(String organizationId, String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getVariableGroupWithOptions(organizationId, id, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkItemActivityResponse());
    }

    public GetWorkItemActivityResponse getWorkItemActivity(String organizationId, String workitemId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkItemActivityWithOptions(organizationId, workitemId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkItemInfoResponse());
    }

    public GetWorkItemInfoResponse getWorkItemInfo(String organizationId, String workitemId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkItemInfoWithOptions(organizationId, workitemId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkItemWorkFlowInfoResponse());
    }

    public GetWorkItemWorkFlowInfoResponse getWorkItemWorkFlowInfo(String organizationId, String workitemId, GetWorkItemWorkFlowInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkItemWorkFlowInfoWithOptions(organizationId, workitemId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkitemCommentListResponse());
    }

    public GetWorkitemCommentListResponse getWorkitemCommentList(String organizationId, String workitemId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkitemCommentListWithOptions(organizationId, workitemId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkitemRelationsResponse());
    }

    public GetWorkitemRelationsResponse getWorkitemRelations(String organizationId, String workitemId, GetWorkitemRelationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkitemRelationsWithOptions(organizationId, workitemId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkitemTimeTypeListResponse());
    }

    public GetWorkitemTimeTypeListResponse getWorkitemTimeTypeList(String organizationId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkitemTimeTypeListWithOptions(organizationId, headers, runtime);
    }

    public GetWorkspaceResponse getWorkspaceWithOptions(String workspaceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkspace"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkspaceResponse());
    }

    public GetWorkspaceResponse getWorkspace(String workspaceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkspaceWithOptions(workspaceId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new JoinPipelineGroupResponse());
    }

    public JoinPipelineGroupResponse joinPipelineGroup(String organizationId, JoinPipelineGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.joinPipelineGroupWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowTagGroupsResponse());
    }

    public ListFlowTagGroupsResponse listFlowTagGroups(String organizationId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFlowTagGroupsWithOptions(organizationId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGroupMemberResponse());
    }

    public ListGroupMemberResponse listGroupMember(String groupId, ListGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGroupMemberWithOptions(groupId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGroupRepositoriesResponse());
    }

    public ListGroupRepositoriesResponse listGroupRepositories(String groupId, ListGroupRepositoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGroupRepositoriesWithOptions(groupId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHostGroupsResponse());
    }

    public ListHostGroupsResponse listHostGroups(String organizationId, ListHostGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listHostGroupsWithOptions(organizationId, request, headers, runtime);
    }

    public ListOrganizationMembersResponse listOrganizationMembersWithOptions(String organizationId, ListOrganizationMembersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOrganizationMembersResponse());
    }

    public ListOrganizationMembersResponse listOrganizationMembers(String organizationId, ListOrganizationMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOrganizationMembersWithOptions(organizationId, request, headers, runtime);
    }

    public ListOrganizationsResponse listOrganizationsWithOptions(ListOrganizationsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessLevel)) {
            query.put("accessLevel", request.accessLevel);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOrganizationsResponse());
    }

    public ListOrganizationsResponse listOrganizations(ListOrganizationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOrganizationsWithOptions(request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPipelineGroupPipelinesResponse());
    }

    public ListPipelineGroupPipelinesResponse listPipelineGroupPipelines(String organizationId, String groupId, ListPipelineGroupPipelinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelineGroupPipelinesWithOptions(organizationId, groupId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPipelineGroupsResponse());
    }

    public ListPipelineGroupsResponse listPipelineGroups(String organizationId, ListPipelineGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelineGroupsWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPipelineJobHistorysResponse());
    }

    public ListPipelineJobHistorysResponse listPipelineJobHistorys(String organizationId, String pipelineId, ListPipelineJobHistorysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelineJobHistorysWithOptions(organizationId, pipelineId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPipelineJobsResponse());
    }

    public ListPipelineJobsResponse listPipelineJobs(String organizationId, String pipelineId, ListPipelineJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelineJobsWithOptions(organizationId, pipelineId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPipelineRelationsResponse());
    }

    public ListPipelineRelationsResponse listPipelineRelations(String organizationId, String pipelineId, ListPipelineRelationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelineRelationsWithOptions(organizationId, pipelineId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPipelineRunsResponse());
    }

    public ListPipelineRunsResponse listPipelineRuns(String organizationId, String pipelineId, ListPipelineRunsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelineRunsWithOptions(organizationId, pipelineId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPipelinesResponse());
    }

    public ListPipelinesResponse listPipelines(String organizationId, ListPipelinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelinesWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectMembersResponse());
    }

    public ListProjectMembersResponse listProjectMembers(String organizationId, String projectId, ListProjectMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProjectMembersWithOptions(organizationId, projectId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectTemplatesResponse());
    }

    public ListProjectTemplatesResponse listProjectTemplates(String organizationId, ListProjectTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProjectTemplatesWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectWorkitemTypesResponse());
    }

    public ListProjectWorkitemTypesResponse listProjectWorkitemTypes(String organizationId, String projectId, ListProjectWorkitemTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProjectWorkitemTypesWithOptions(organizationId, projectId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectsResponse());
    }

    public ListProjectsResponse listProjects(String organizationId, ListProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProjectsWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProtectedBranchesResponse());
    }

    public ListProtectedBranchesResponse listProtectedBranches(String repositoryId, ListProtectedBranchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProtectedBranchesWithOptions(repositoryId, request, headers, runtime);
    }

    public ListRepositoriesResponse listRepositoriesWithOptions(ListRepositoriesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("accessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.archived)) {
            query.put("archived", request.archived);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoriesResponse());
    }

    public ListRepositoriesResponse listRepositories(ListRepositoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoriesWithOptions(request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoryBranchesResponse());
    }

    public ListRepositoryBranchesResponse listRepositoryBranches(String repositoryId, ListRepositoryBranchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryBranchesWithOptions(repositoryId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoryCommitDiffResponse());
    }

    public ListRepositoryCommitDiffResponse listRepositoryCommitDiff(String repositoryId, String sha, ListRepositoryCommitDiffRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryCommitDiffWithOptions(repositoryId, sha, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoryCommitsResponse());
    }

    public ListRepositoryCommitsResponse listRepositoryCommits(String repositoryId, ListRepositoryCommitsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryCommitsWithOptions(repositoryId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoryGroupsResponse());
    }

    public ListRepositoryGroupsResponse listRepositoryGroups(ListRepositoryGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryGroupsWithOptions(request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoryMemberWithInheritedResponse());
    }

    public ListRepositoryMemberWithInheritedResponse listRepositoryMemberWithInherited(String repositoryId, ListRepositoryMemberWithInheritedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryMemberWithInheritedWithOptions(repositoryId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoryTagsResponse());
    }

    public ListRepositoryTagsResponse listRepositoryTags(String repositoryId, ListRepositoryTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryTagsWithOptions(repositoryId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoryTreeResponse());
    }

    public ListRepositoryTreeResponse listRepositoryTree(String repositoryId, ListRepositoryTreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryTreeWithOptions(repositoryId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoryWebhookResponse());
    }

    public ListRepositoryWebhookResponse listRepositoryWebhook(String repositoryId, ListRepositoryWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryWebhookWithOptions(repositoryId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceMembersResponse());
    }

    public ListResourceMembersResponse listResourceMembers(String organizationId, String resourceType, String resourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceMembersWithOptions(organizationId, resourceType, resourceId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSearchCommitResponse());
    }

    public ListSearchCommitResponse listSearchCommit(ListSearchCommitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSearchCommitWithOptions(request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSearchRepositoryResponse());
    }

    public ListSearchRepositoryResponse listSearchRepository(ListSearchRepositoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSearchRepositoryWithOptions(request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSearchSourceCodeResponse());
    }

    public ListSearchSourceCodeResponse listSearchSourceCode(ListSearchSourceCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSearchSourceCodeWithOptions(request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceConnectionsResponse());
    }

    public ListServiceConnectionsResponse listServiceConnections(String organizationId, ListServiceConnectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceConnectionsWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSprintsResponse());
    }

    public ListSprintsResponse listSprints(String organizationId, ListSprintsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSprintsWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVariableGroupsResponse());
    }

    public ListVariableGroupsResponse listVariableGroups(String organizationId, ListVariableGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listVariableGroupsWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkItemAllFieldsResponse());
    }

    public ListWorkItemAllFieldsResponse listWorkItemAllFields(String organizationId, ListWorkItemAllFieldsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkItemAllFieldsWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkItemWorkFlowStatusResponse());
    }

    public ListWorkItemWorkFlowStatusResponse listWorkItemWorkFlowStatus(String organizationId, ListWorkItemWorkFlowStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkItemWorkFlowStatusWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkitemTimeResponse());
    }

    public ListWorkitemTimeResponse listWorkitemTime(String organizationId, String workitemId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkitemTimeWithOptions(organizationId, workitemId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkitemsResponse());
    }

    public ListWorkitemsResponse listWorkitems(String organizationId, ListWorkitemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkitemsWithOptions(organizationId, request, headers, runtime);
    }

    public ListWorkspacesResponse listWorkspacesWithOptions(ListWorkspacesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    public ListWorkspacesResponse listWorkspaces(ListWorkspacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkspacesWithOptions(request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new LogPipelineJobRunResponse());
    }

    public LogPipelineJobRunResponse logPipelineJobRun(String organizationId, String pipelineId, String jobId, String pipelineRunId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.logPipelineJobRunWithOptions(organizationId, pipelineId, jobId, pipelineRunId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new LogVMDeployMachineResponse());
    }

    public LogVMDeployMachineResponse logVMDeployMachine(String organizationId, String pipelineId, String deployOrderId, String machineSn) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.logVMDeployMachineWithOptions(organizationId, pipelineId, deployOrderId, machineSn, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new PassPipelineValidateResponse());
    }

    public PassPipelineValidateResponse passPipelineValidate(String organizationId, String pipelineId, String pipelineRunId, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.passPipelineValidateWithOptions(organizationId, pipelineId, pipelineRunId, jobId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefusePipelineValidateResponse());
    }

    public RefusePipelineValidateResponse refusePipelineValidate(String organizationId, String pipelineId, String pipelineRunId, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refusePipelineValidateWithOptions(organizationId, pipelineId, pipelineRunId, jobId, headers, runtime);
    }

    public ReleaseWorkspaceResponse releaseWorkspaceWithOptions(String workspaceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseWorkspace"),
            new TeaPair("version", "2021-06-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/release"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseWorkspaceResponse());
    }

    public ReleaseWorkspaceResponse releaseWorkspace(String workspaceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.releaseWorkspaceWithOptions(workspaceId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetSshKeyResponse());
    }

    public ResetSshKeyResponse resetSshKey(String organizationId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetSshKeyWithOptions(organizationId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeVMDeployOrderResponse());
    }

    public ResumeVMDeployOrderResponse resumeVMDeployOrder(String organizationId, String pipelineId, String deployOrderId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeVMDeployOrderWithOptions(organizationId, pipelineId, deployOrderId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryPipelineJobRunResponse());
    }

    public RetryPipelineJobRunResponse retryPipelineJobRun(String organizationId, String pipelineId, String pipelineRunId, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryPipelineJobRunWithOptions(organizationId, pipelineId, pipelineRunId, jobId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryVMDeployMachineResponse());
    }

    public RetryVMDeployMachineResponse retryVMDeployMachine(String organizationId, String pipelineId, String deployOrderId, String machineSn) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryVMDeployMachineWithOptions(organizationId, pipelineId, deployOrderId, machineSn, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new SkipPipelineJobRunResponse());
    }

    public SkipPipelineJobRunResponse skipPipelineJobRun(String organizationId, String pipelineId, String pipelineRunId, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.skipPipelineJobRunWithOptions(organizationId, pipelineId, pipelineRunId, jobId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new SkipVMDeployMachineResponse());
    }

    public SkipVMDeployMachineResponse skipVMDeployMachine(String organizationId, String pipelineId, String deployOrderId, String machineSn) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.skipVMDeployMachineWithOptions(organizationId, pipelineId, deployOrderId, machineSn, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartPipelineRunResponse());
    }

    public StartPipelineRunResponse startPipelineRun(String organizationId, String pipelineId, StartPipelineRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startPipelineRunWithOptions(organizationId, pipelineId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopPipelineJobRunResponse());
    }

    public StopPipelineJobRunResponse stopPipelineJobRun(String organizationId, String pipelineId, String pipelineRunId, String jobId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopPipelineJobRunWithOptions(organizationId, pipelineId, pipelineRunId, jobId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopPipelineRunResponse());
    }

    public StopPipelineRunResponse stopPipelineRun(String organizationId, String pipelineId, String pipelineRunId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopPipelineRunWithOptions(organizationId, pipelineId, pipelineRunId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopVMDeployOrderResponse());
    }

    public StopVMDeployOrderResponse stopVMDeployOrder(String organizationId, String pipelineId, String deployOrderId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopVMDeployOrderWithOptions(organizationId, pipelineId, deployOrderId, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new TriggerRepositoryMirrorSyncResponse());
    }

    public TriggerRepositoryMirrorSyncResponse triggerRepositoryMirrorSync(String repositoryId, TriggerRepositoryMirrorSyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.triggerRepositoryMirrorSyncWithOptions(repositoryId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFileResponse());
    }

    public UpdateFileResponse updateFile(String repositoryId, UpdateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFileWithOptions(repositoryId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFlowTagResponse());
    }

    public UpdateFlowTagResponse updateFlowTag(String organizationId, String id, UpdateFlowTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFlowTagWithOptions(organizationId, id, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFlowTagGroupResponse());
    }

    public UpdateFlowTagGroupResponse updateFlowTagGroup(String organizationId, String id, UpdateFlowTagGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFlowTagGroupWithOptions(organizationId, id, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGroupResponse());
    }

    public UpdateGroupResponse updateGroup(UpdateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGroupWithOptions(request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGroupMemberResponse());
    }

    public UpdateGroupMemberResponse updateGroupMember(String groupId, UpdateGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGroupMemberWithOptions(groupId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHostGroupResponse());
    }

    public UpdateHostGroupResponse updateHostGroup(String organizationId, String id, UpdateHostGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateHostGroupWithOptions(organizationId, id, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePipelineBaseInfoResponse());
    }

    public UpdatePipelineBaseInfoResponse updatePipelineBaseInfo(String organizationId, String pipelineId, UpdatePipelineBaseInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePipelineBaseInfoWithOptions(organizationId, pipelineId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePipelineGroupResponse());
    }

    public UpdatePipelineGroupResponse updatePipelineGroup(String organizationId, String groupId, UpdatePipelineGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePipelineGroupWithOptions(organizationId, groupId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectMemberResponse());
    }

    public UpdateProjectMemberResponse updateProjectMember(String organizationId, String projectId, UpdateProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProjectMemberWithOptions(organizationId, projectId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProtectedBranchesResponse());
    }

    public UpdateProtectedBranchesResponse updateProtectedBranches(String repositoryId, String id, UpdateProtectedBranchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProtectedBranchesWithOptions(repositoryId, id, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePushReviewOnOffResponse());
    }

    public UpdatePushReviewOnOffResponse updatePushReviewOnOff(String repositoryId, UpdatePushReviewOnOffRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePushReviewOnOffWithOptions(repositoryId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRepositoryResponse());
    }

    public UpdateRepositoryResponse updateRepository(String repositoryId, UpdateRepositoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRepositoryWithOptions(repositoryId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRepositoryMemberResponse());
    }

    public UpdateRepositoryMemberResponse updateRepositoryMember(String repositoryId, String aliyunPk, UpdateRepositoryMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRepositoryMemberWithOptions(repositoryId, aliyunPk, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceMemberResponse());
    }

    public UpdateResourceMemberResponse updateResourceMember(String organizationId, String resourceType, String resourceId, String accountId, UpdateResourceMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateResourceMemberWithOptions(organizationId, resourceType, resourceId, accountId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVariableGroupResponse());
    }

    public UpdateVariableGroupResponse updateVariableGroup(String organizationId, String id, UpdateVariableGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateVariableGroupWithOptions(organizationId, id, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkItemResponse());
    }

    public UpdateWorkItemResponse updateWorkItem(String organizationId, UpdateWorkItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWorkItemWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkitemCommentResponse());
    }

    public UpdateWorkitemCommentResponse updateWorkitemComment(String organizationId, UpdateWorkitemCommentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWorkitemCommentWithOptions(organizationId, request, headers, runtime);
    }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkitemFieldResponse());
    }

    public UpdateWorkitemFieldResponse updateWorkitemField(String organizationId, UpdateWorkitemFieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWorkitemFieldWithOptions(organizationId, request, headers, runtime);
    }
}
