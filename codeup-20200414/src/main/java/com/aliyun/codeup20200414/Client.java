// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414;

import com.aliyun.tea.*;
import com.aliyun.codeup20200414.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("codeup", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AcceptMergeRequestResponse acceptMergeRequest(String ProjectId, String MergeRequestId, AcceptMergeRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.acceptMergeRequestWithOptions(ProjectId, MergeRequestId, request, headers, runtime);
    }

    public AcceptMergeRequestResponse acceptMergeRequestWithOptions(String ProjectId, String MergeRequestId, AcceptMergeRequestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AcceptMergeRequest"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/merge_request/" + com.aliyun.openapiutil.Client.getEncodeParam(MergeRequestId) + "/accept"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AcceptMergeRequestResponse());
    }

    public AddGroupMemberResponse addGroupMember(String GroupId, AddGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addGroupMemberWithOptions(GroupId, request, headers, runtime);
    }

    public AddGroupMemberResponse addGroupMemberWithOptions(String GroupId, AddGroupMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddGroupMember"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(GroupId) + "/members"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddGroupMemberResponse());
    }

    public AddRepositoryMemberResponse addRepositoryMember(String ProjectId, AddRepositoryMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addRepositoryMemberWithOptions(ProjectId, request, headers, runtime);
    }

    public AddRepositoryMemberResponse addRepositoryMemberWithOptions(String ProjectId, AddRepositoryMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddRepositoryMember"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/members"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddRepositoryMemberResponse());
    }

    public AddWebhookResponse addWebhook(String ProjectId, AddWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addWebhookWithOptions(ProjectId, request, headers, runtime);
    }

    public AddWebhookResponse addWebhookWithOptions(String ProjectId, AddWebhookRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddWebhook"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/hooks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddWebhookResponse());
    }

    public CreateBranchResponse createBranch(String ProjectId, CreateBranchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBranchWithOptions(ProjectId, request, headers, runtime);
    }

    public CreateBranchResponse createBranchWithOptions(String ProjectId, CreateBranchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
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
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/repository/branches"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBranchResponse());
    }

    public CreateFileResponse createFile(String ProjectId, CreateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFileWithOptions(ProjectId, request, headers, runtime);
    }

    public CreateFileResponse createFileWithOptions(String ProjectId, CreateFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFile"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/repository/files"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFileResponse());
    }

    public CreateMergeRequestResponse createMergeRequest(String ProjectId, CreateMergeRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMergeRequestWithOptions(ProjectId, request, headers, runtime);
    }

    public CreateMergeRequestResponse createMergeRequestWithOptions(String ProjectId, CreateMergeRequestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMergeRequest"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/merge_requests"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMergeRequestResponse());
    }

    public CreateMergeRequestCommentResponse createMergeRequestComment(String ProjectId, String MergeRequestId, CreateMergeRequestCommentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMergeRequestCommentWithOptions(ProjectId, MergeRequestId, request, headers, runtime);
    }

    public CreateMergeRequestCommentResponse createMergeRequestCommentWithOptions(String ProjectId, String MergeRequestId, CreateMergeRequestCommentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMergeRequestComment"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/merge_request/" + com.aliyun.openapiutil.Client.getEncodeParam(MergeRequestId) + "/comments"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMergeRequestCommentResponse());
    }

    public CreateRepositoryResponse createRepository(CreateRepositoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRepositoryWithOptions(request, headers, runtime);
    }

    public CreateRepositoryResponse createRepositoryWithOptions(CreateRepositoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createParentPath)) {
            query.put("CreateParentPath", request.createParentPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sync)) {
            query.put("Sync", request.sync);
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
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRepositoryResponse());
    }

    public CreateRepositoryDeployKeyResponse createRepositoryDeployKey(String ProjectId, CreateRepositoryDeployKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRepositoryDeployKeyWithOptions(ProjectId, request, headers, runtime);
    }

    public CreateRepositoryDeployKeyResponse createRepositoryDeployKeyWithOptions(String ProjectId, CreateRepositoryDeployKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRepositoryDeployKey"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/keys"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRepositoryDeployKeyResponse());
    }

    public CreateRepositoryGroupResponse createRepositoryGroup(CreateRepositoryGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRepositoryGroupWithOptions(request, headers, runtime);
    }

    public CreateRepositoryGroupResponse createRepositoryGroupWithOptions(CreateRepositoryGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRepositoryGroup"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/groups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRepositoryGroupResponse());
    }

    public CreateRepositoryProtectedBranchResponse createRepositoryProtectedBranch(String ProjectId, CreateRepositoryProtectedBranchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRepositoryProtectedBranchWithOptions(ProjectId, request, headers, runtime);
    }

    public CreateRepositoryProtectedBranchResponse createRepositoryProtectedBranchWithOptions(String ProjectId, CreateRepositoryProtectedBranchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRepositoryProtectedBranch"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/repository/protect_branches"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRepositoryProtectedBranchResponse());
    }

    public CreateSshKeyResponse createSshKey(CreateSshKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSshKeyWithOptions(request, headers, runtime);
    }

    public CreateSshKeyResponse createSshKeyWithOptions(CreateSshKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSshKey"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/user/keys"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSshKeyResponse());
    }

    public CreateTagResponse createTag(String ProjectId, CreateTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTagWithOptions(ProjectId, request, headers, runtime);
    }

    public CreateTagResponse createTagWithOptions(String ProjectId, CreateTagRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTag"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/repository/tags"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTagResponse());
    }

    public DeleteBranchResponse deleteBranch(String ProjectId, DeleteBranchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBranchWithOptions(ProjectId, request, headers, runtime);
    }

    public DeleteBranchResponse deleteBranchWithOptions(String ProjectId, DeleteBranchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("BranchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBranch"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/repository/branches/delete"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBranchResponse());
    }

    public DeleteFileResponse deleteFile(String ProjectId, DeleteFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFileWithOptions(ProjectId, request, headers, runtime);
    }

    public DeleteFileResponse deleteFileWithOptions(String ProjectId, DeleteFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("BranchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commitMessage)) {
            query.put("CommitMessage", request.commitMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFile"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/repository/files"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFileResponse());
    }

    public DeleteGroupMemberResponse deleteGroupMember(String GroupId, String UserId, DeleteGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGroupMemberWithOptions(GroupId, UserId, request, headers, runtime);
    }

    public DeleteGroupMemberResponse deleteGroupMemberWithOptions(String GroupId, String UserId, DeleteGroupMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGroupMember"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(GroupId) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(UserId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGroupMemberResponse());
    }

    public DeleteRepositoryResponse deleteRepository(String ProjectId, DeleteRepositoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRepositoryWithOptions(ProjectId, request, headers, runtime);
    }

    public DeleteRepositoryResponse deleteRepositoryWithOptions(String ProjectId, DeleteRepositoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRepository"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/remove"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRepositoryResponse());
    }

    public DeleteRepositoryGroupResponse deleteRepositoryGroup(String GroupId, DeleteRepositoryGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRepositoryGroupWithOptions(GroupId, request, headers, runtime);
    }

    public DeleteRepositoryGroupResponse deleteRepositoryGroupWithOptions(String GroupId, DeleteRepositoryGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRepositoryGroup"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(GroupId) + "/remove"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRepositoryGroupResponse());
    }

    public DeleteRepositoryMemberResponse deleteRepositoryMember(String ProjectId, String UserId, DeleteRepositoryMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRepositoryMemberWithOptions(ProjectId, UserId, request, headers, runtime);
    }

    public DeleteRepositoryMemberResponse deleteRepositoryMemberWithOptions(String ProjectId, String UserId, DeleteRepositoryMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRepositoryMember"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(UserId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRepositoryMemberResponse());
    }

    public DeleteRepositoryMemberWithExternUidResponse deleteRepositoryMemberWithExternUid(String ProjectId, DeleteRepositoryMemberWithExternUidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRepositoryMemberWithExternUidWithOptions(ProjectId, request, headers, runtime);
    }

    public DeleteRepositoryMemberWithExternUidResponse deleteRepositoryMemberWithExternUidWithOptions(String ProjectId, DeleteRepositoryMemberWithExternUidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externUserId)) {
            query.put("ExternUserId", request.externUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRepositoryMemberWithExternUid"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/members/remove"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRepositoryMemberWithExternUidResponse());
    }

    public DeleteRepositoryProtectedBranchResponse deleteRepositoryProtectedBranch(String ProjectId, String ProtectedBranchId, DeleteRepositoryProtectedBranchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRepositoryProtectedBranchWithOptions(ProjectId, ProtectedBranchId, request, headers, runtime);
    }

    public DeleteRepositoryProtectedBranchResponse deleteRepositoryProtectedBranchWithOptions(String ProjectId, String ProtectedBranchId, DeleteRepositoryProtectedBranchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRepositoryProtectedBranch"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/repository/protect_branches/" + com.aliyun.openapiutil.Client.getEncodeParam(ProtectedBranchId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRepositoryProtectedBranchResponse());
    }

    public DeleteRepositoryTagResponse deleteRepositoryTag(String ProjectId, String TagName, DeleteRepositoryTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRepositoryTagWithOptions(ProjectId, TagName, request, headers, runtime);
    }

    public DeleteRepositoryTagResponse deleteRepositoryTagWithOptions(String ProjectId, String TagName, DeleteRepositoryTagRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRepositoryTag"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/repository/tags/" + com.aliyun.openapiutil.Client.getEncodeParam(TagName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRepositoryTagResponse());
    }

    public DeleteRepositoryTagV2Response deleteRepositoryTagV2(String ProjectId, DeleteRepositoryTagV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRepositoryTagV2WithOptions(ProjectId, request, headers, runtime);
    }

    public DeleteRepositoryTagV2Response deleteRepositoryTagV2WithOptions(String ProjectId, DeleteRepositoryTagV2Request request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagName)) {
            query.put("TagName", request.tagName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRepositoryTagV2"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/repository/tag/delete"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRepositoryTagV2Response());
    }

    public DeleteRepositoryWebhookResponse deleteRepositoryWebhook(String ProjectId, String WebhookId, DeleteRepositoryWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRepositoryWebhookWithOptions(ProjectId, WebhookId, request, headers, runtime);
    }

    public DeleteRepositoryWebhookResponse deleteRepositoryWebhookWithOptions(String ProjectId, String WebhookId, DeleteRepositoryWebhookRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRepositoryWebhook"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/hooks/" + com.aliyun.openapiutil.Client.getEncodeParam(WebhookId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRepositoryWebhookResponse());
    }

    public EnableRepositoryDeployKeyResponse enableRepositoryDeployKey(String ProjectId, String KeyId, EnableRepositoryDeployKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableRepositoryDeployKeyWithOptions(ProjectId, KeyId, request, headers, runtime);
    }

    public EnableRepositoryDeployKeyResponse enableRepositoryDeployKeyWithOptions(String ProjectId, String KeyId, EnableRepositoryDeployKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableRepositoryDeployKey"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/keys/" + com.aliyun.openapiutil.Client.getEncodeParam(KeyId) + "/enable"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableRepositoryDeployKeyResponse());
    }

    public GetBranchInfoResponse getBranchInfo(String ProjectId, GetBranchInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBranchInfoWithOptions(ProjectId, request, headers, runtime);
    }

    public GetBranchInfoResponse getBranchInfoWithOptions(String ProjectId, GetBranchInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("BranchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBranchInfo"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/repository/branches/detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBranchInfoResponse());
    }

    public GetCodeCompletionResponse getCodeCompletion(String ServiceName, GetCodeCompletionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCodeCompletionWithOptions(ServiceName, request, headers, runtime);
    }

    public GetCodeCompletionResponse getCodeCompletionWithOptions(String ServiceName, GetCodeCompletionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchKeys)) {
            query.put("FetchKeys", request.fetchKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isEncrypted)) {
            query.put("IsEncrypted", request.isEncrypted);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCodeCompletion"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/service/invoke/" + com.aliyun.openapiutil.Client.getEncodeParam(ServiceName) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCodeCompletionResponse());
    }

    public GetCodeupOrganizationResponse getCodeupOrganization(String OrganizationIdentity, GetCodeupOrganizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCodeupOrganizationWithOptions(OrganizationIdentity, request, headers, runtime);
    }

    public GetCodeupOrganizationResponse getCodeupOrganizationWithOptions(String OrganizationIdentity, GetCodeupOrganizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCodeupOrganization"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/organization/" + com.aliyun.openapiutil.Client.getEncodeParam(OrganizationIdentity) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCodeupOrganizationResponse());
    }

    public GetFileBlobsResponse getFileBlobs(String ProjectId, GetFileBlobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFileBlobsWithOptions(ProjectId, request, headers, runtime);
    }

    public GetFileBlobsResponse getFileBlobsWithOptions(String ProjectId, GetFileBlobsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("From", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ref)) {
            query.put("Ref", request.ref);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            query.put("To", request.to);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFileBlobs"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/repository/blobs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFileBlobsResponse());
    }

    public GetFileLastCommitResponse getFileLastCommit(String ProjectId, GetFileLastCommitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFileLastCommitWithOptions(ProjectId, request, headers, runtime);
    }

    public GetFileLastCommitResponse getFileLastCommitWithOptions(String ProjectId, GetFileLastCommitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sha)) {
            query.put("Sha", request.sha);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFileLastCommit"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/repository/files/last_commit"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFileLastCommitResponse());
    }

    public GetGroupDetailResponse getGroupDetail(GetGroupDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGroupDetailWithOptions(request, headers, runtime);
    }

    public GetGroupDetailResponse getGroupDetailWithOptions(GetGroupDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGroupDetail"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/groups/detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGroupDetailResponse());
    }

    public GetMergeRequestApproveStatusResponse getMergeRequestApproveStatus(String ProjectId, String MergeRequestId, GetMergeRequestApproveStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMergeRequestApproveStatusWithOptions(ProjectId, MergeRequestId, request, headers, runtime);
    }

    public GetMergeRequestApproveStatusResponse getMergeRequestApproveStatusWithOptions(String ProjectId, String MergeRequestId, GetMergeRequestApproveStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMergeRequestApproveStatus"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/merge_request/" + com.aliyun.openapiutil.Client.getEncodeParam(MergeRequestId) + "/approve_status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMergeRequestApproveStatusResponse());
    }

    public GetMergeRequestDetailResponse getMergeRequestDetail(String ProjectId, String MergeRequestId, GetMergeRequestDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMergeRequestDetailWithOptions(ProjectId, MergeRequestId, request, headers, runtime);
    }

    public GetMergeRequestDetailResponse getMergeRequestDetailWithOptions(String ProjectId, String MergeRequestId, GetMergeRequestDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMergeRequestDetail"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/merge_request/" + com.aliyun.openapiutil.Client.getEncodeParam(MergeRequestId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMergeRequestDetailResponse());
    }

    public GetMergeRequestSettingResponse getMergeRequestSetting(String ProjectId, GetMergeRequestSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMergeRequestSettingWithOptions(ProjectId, request, headers, runtime);
    }

    public GetMergeRequestSettingResponse getMergeRequestSettingWithOptions(String ProjectId, GetMergeRequestSettingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMergeRequestSetting"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/settings/merge_requests"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMergeRequestSettingResponse());
    }

    public GetOrganizationRepositorySettingResponse getOrganizationRepositorySetting(GetOrganizationRepositorySettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOrganizationRepositorySettingWithOptions(request, headers, runtime);
    }

    public GetOrganizationRepositorySettingResponse getOrganizationRepositorySettingWithOptions(GetOrganizationRepositorySettingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOrganizationRepositorySetting"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/organization/settings/repo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOrganizationRepositorySettingResponse());
    }

    public GetOrganizationSecurityCenterStatusResponse getOrganizationSecurityCenterStatus(GetOrganizationSecurityCenterStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOrganizationSecurityCenterStatusWithOptions(request, headers, runtime);
    }

    public GetOrganizationSecurityCenterStatusResponse getOrganizationSecurityCenterStatusWithOptions(GetOrganizationSecurityCenterStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOrganizationSecurityCenterStatus"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/organization/security/status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOrganizationSecurityCenterStatusResponse());
    }

    public GetProjectMemberResponse getProjectMember(String ProjectId, String UserId, GetProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProjectMemberWithOptions(ProjectId, UserId, request, headers, runtime);
    }

    public GetProjectMemberResponse getProjectMemberWithOptions(String ProjectId, String UserId, GetProjectMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectMember"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(UserId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectMemberResponse());
    }

    public GetRepositoryCommitResponse getRepositoryCommit(String ProjectId, String Sha, GetRepositoryCommitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepositoryCommitWithOptions(ProjectId, Sha, request, headers, runtime);
    }

    public GetRepositoryCommitResponse getRepositoryCommitWithOptions(String ProjectId, String Sha, GetRepositoryCommitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepositoryCommit"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/repository/commits/" + com.aliyun.openapiutil.Client.getEncodeParam(Sha) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepositoryCommitResponse());
    }

    public GetRepositoryInfoResponse getRepositoryInfo(GetRepositoryInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepositoryInfoWithOptions(request, headers, runtime);
    }

    public GetRepositoryInfoResponse getRepositoryInfoWithOptions(GetRepositoryInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identity)) {
            query.put("Identity", request.identity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepositoryInfo"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/info"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepositoryInfoResponse());
    }

    public GetRepositoryTagResponse getRepositoryTag(String ProjectId, String TagName, GetRepositoryTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepositoryTagWithOptions(ProjectId, TagName, request, headers, runtime);
    }

    public GetRepositoryTagResponse getRepositoryTagWithOptions(String ProjectId, String TagName, GetRepositoryTagRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepositoryTag"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/repository/tags/" + com.aliyun.openapiutil.Client.getEncodeParam(TagName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepositoryTagResponse());
    }

    public GetRepositoryTagV2Response getRepositoryTagV2(String ProjectId, GetRepositoryTagV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepositoryTagV2WithOptions(ProjectId, request, headers, runtime);
    }

    public GetRepositoryTagV2Response getRepositoryTagV2WithOptions(String ProjectId, GetRepositoryTagV2Request request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagName)) {
            query.put("TagName", request.tagName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRepositoryTagV2"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/repository/tag/info"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRepositoryTagV2Response());
    }

    public GetUserInfoResponse getUserInfo(GetUserInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserInfoWithOptions(request, headers, runtime);
    }

    public GetUserInfoResponse getUserInfoWithOptions(GetUserInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserInfo"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/user/current"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserInfoResponse());
    }

    public IsSlsUserAuthrizedCodeupResponse isSlsUserAuthrizedCodeup(IsSlsUserAuthrizedCodeupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.isSlsUserAuthrizedCodeupWithOptions(request, headers, runtime);
    }

    public IsSlsUserAuthrizedCodeupResponse isSlsUserAuthrizedCodeupWithOptions(IsSlsUserAuthrizedCodeupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunSubUserId)) {
            body.put("aliyunSubUserId", request.aliyunSubUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunUserId)) {
            body.put("aliyunUserId", request.aliyunUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeupProjectId)) {
            body.put("codeupProjectId", request.codeupProjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsLogStore)) {
            body.put("slsLogStore", request.slsLogStore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsProject)) {
            body.put("slsProject", request.slsProject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IsSlsUserAuthrizedCodeup"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/repository/is_codeup_authrized"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IsSlsUserAuthrizedCodeupResponse());
    }

    public ListGroupMemberResponse listGroupMember(String GroupId, ListGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGroupMemberWithOptions(GroupId, request, headers, runtime);
    }

    public ListGroupMemberResponse listGroupMemberWithOptions(String GroupId, ListGroupMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroupMember"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(GroupId) + "/members"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGroupMemberResponse());
    }

    public ListGroupRepositoriesResponse listGroupRepositories(String Identity, ListGroupRepositoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGroupRepositoriesWithOptions(Identity, request, headers, runtime);
    }

    public ListGroupRepositoriesResponse listGroupRepositoriesWithOptions(String Identity, ListGroupRepositoriesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isMember)) {
            query.put("IsMember", request.isMember);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("Search", request.search);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroupRepositories"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(Identity) + "/projects"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGroupRepositoriesResponse());
    }

    public ListGroupsResponse listGroups(ListGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGroupsWithOptions(request, headers, runtime);
    }

    public ListGroupsResponse listGroupsWithOptions(ListGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includePersonal)) {
            query.put("IncludePersonal", request.includePersonal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("Search", request.search);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroups"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/groups/all"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGroupsResponse());
    }

    public ListMergeRequestCommentsResponse listMergeRequestComments(String ProjectId, String MergeRequestId, ListMergeRequestCommentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMergeRequestCommentsWithOptions(ProjectId, MergeRequestId, request, headers, runtime);
    }

    public ListMergeRequestCommentsResponse listMergeRequestCommentsWithOptions(String ProjectId, String MergeRequestId, ListMergeRequestCommentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromCommit)) {
            query.put("FromCommit", request.fromCommit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toCommit)) {
            query.put("ToCommit", request.toCommit);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMergeRequestComments"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/merge_request/" + com.aliyun.openapiutil.Client.getEncodeParam(MergeRequestId) + "/comments"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMergeRequestCommentsResponse());
    }

    public ListMergeRequestsResponse listMergeRequests(ListMergeRequestsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMergeRequestsWithOptions(request, headers, runtime);
    }

    public ListMergeRequestsResponse listMergeRequestsWithOptions(ListMergeRequestsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.afterDate)) {
            query.put("AfterDate", request.afterDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assigneeCodeupIdList)) {
            query.put("AssigneeCodeupIdList", request.assigneeCodeupIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assigneeIdList)) {
            query.put("AssigneeIdList", request.assigneeIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorCodeupIdList)) {
            query.put("AuthorCodeupIdList", request.authorCodeupIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorIdList)) {
            query.put("AuthorIdList", request.authorIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beforeDate)) {
            query.put("BeforeDate", request.beforeDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupIdList)) {
            query.put("GroupIdList", request.groupIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdList)) {
            query.put("ProjectIdList", request.projectIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("Search", request.search);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriberCodeupIdList)) {
            query.put("SubscriberCodeupIdList", request.subscriberCodeupIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMergeRequests"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/merge_requests/advanced_search"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMergeRequestsResponse());
    }

    public ListOrganizationSecurityScoresResponse listOrganizationSecurityScores(ListOrganizationSecurityScoresRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOrganizationSecurityScoresWithOptions(request, headers, runtime);
    }

    public ListOrganizationSecurityScoresResponse listOrganizationSecurityScoresWithOptions(ListOrganizationSecurityScoresRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOrganizationSecurityScores"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/organization/security/scores"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOrganizationSecurityScoresResponse());
    }

    public ListOrganizationsResponse listOrganizations(ListOrganizationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOrganizationsWithOptions(request, headers, runtime);
    }

    public ListOrganizationsResponse listOrganizationsWithOptions(ListOrganizationsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessLevel)) {
            query.put("AccessLevel", request.accessLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minAccessLevel)) {
            query.put("MinAccessLevel", request.minAccessLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOrganizations"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/organization"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOrganizationsResponse());
    }

    public ListRepositoriesResponse listRepositories(ListRepositoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoriesWithOptions(request, headers, runtime);
    }

    public ListRepositoriesResponse listRepositoriesWithOptions(ListRepositoriesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.archive)) {
            query.put("Archive", request.archive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("Search", request.search);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepositories"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/all"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoriesResponse());
    }

    public ListRepositoryBranchesResponse listRepositoryBranches(String ProjectId, ListRepositoryBranchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryBranchesWithOptions(ProjectId, request, headers, runtime);
    }

    public ListRepositoryBranchesResponse listRepositoryBranchesWithOptions(String ProjectId, ListRepositoryBranchesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("Search", request.search);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepositoryBranches"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/repository/branches"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoryBranchesResponse());
    }

    public ListRepositoryCodeResponse listRepositoryCode(ListRepositoryCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryCodeWithOptions(request, headers, runtime);
    }

    public ListRepositoryCodeResponse listRepositoryCodeWithOptions(ListRepositoryCodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.filePath))) {
            body.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isCodeBlock)) {
            body.put("IsCodeBlock", request.isCodeBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            body.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.repositoryPath))) {
            body.put("RepositoryPath", request.repositoryPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            body.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            body.put("Sort", request.sort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepositoryCode"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/search/v3/code"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoryCodeResponse());
    }

    public ListRepositoryCommitDiffResponse listRepositoryCommitDiff(String ProjectId, String Sha, ListRepositoryCommitDiffRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryCommitDiffWithOptions(ProjectId, Sha, request, headers, runtime);
    }

    public ListRepositoryCommitDiffResponse listRepositoryCommitDiffWithOptions(String ProjectId, String Sha, ListRepositoryCommitDiffRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contextLine)) {
            query.put("ContextLine", request.contextLine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepositoryCommitDiff"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/repository/commits/" + com.aliyun.openapiutil.Client.getEncodeParam(Sha) + "/diff"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoryCommitDiffResponse());
    }

    public ListRepositoryCommitsResponse listRepositoryCommits(String ProjectId, ListRepositoryCommitsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryCommitsWithOptions(ProjectId, request, headers, runtime);
    }

    public ListRepositoryCommitsResponse listRepositoryCommitsWithOptions(String ProjectId, ListRepositoryCommitsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refName)) {
            query.put("RefName", request.refName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("Search", request.search);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showSignature)) {
            query.put("ShowSignature", request.showSignature);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepositoryCommits"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/repository/commits"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoryCommitsResponse());
    }

    public ListRepositoryMemberResponse listRepositoryMember(String ProjectId, ListRepositoryMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryMemberWithOptions(ProjectId, request, headers, runtime);
    }

    public ListRepositoryMemberResponse listRepositoryMemberWithOptions(String ProjectId, ListRepositoryMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepositoryMember"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/members"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoryMemberResponse());
    }

    public ListRepositoryMemberWithInheritedResponse listRepositoryMemberWithInherited(String ProjectId, ListRepositoryMemberWithInheritedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryMemberWithInheritedWithOptions(ProjectId, request, headers, runtime);
    }

    public ListRepositoryMemberWithInheritedResponse listRepositoryMemberWithInheritedWithOptions(String ProjectId, ListRepositoryMemberWithInheritedRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepositoryMemberWithInherited"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/all_members"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoryMemberWithInheritedResponse());
    }

    public ListRepositoryProtectedBranchResponse listRepositoryProtectedBranch(String ProjectId, ListRepositoryProtectedBranchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryProtectedBranchWithOptions(ProjectId, request, headers, runtime);
    }

    public ListRepositoryProtectedBranchResponse listRepositoryProtectedBranchWithOptions(String ProjectId, ListRepositoryProtectedBranchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepositoryProtectedBranch"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/repository/protect_branches"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoryProtectedBranchResponse());
    }

    public ListRepositoryTagsResponse listRepositoryTags(String ProjectId, ListRepositoryTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryTagsWithOptions(ProjectId, request, headers, runtime);
    }

    public ListRepositoryTagsResponse listRepositoryTagsWithOptions(String ProjectId, ListRepositoryTagsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("Search", request.search);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showSignature)) {
            query.put("ShowSignature", request.showSignature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepositoryTags"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/repository/tags"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoryTagsResponse());
    }

    public ListRepositoryTreeResponse listRepositoryTree(String ProjectId, ListRepositoryTreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryTreeWithOptions(ProjectId, request, headers, runtime);
    }

    public ListRepositoryTreeResponse listRepositoryTreeWithOptions(String ProjectId, ListRepositoryTreeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refName)) {
            query.put("RefName", request.refName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepositoryTree"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/repository/tree"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoryTreeResponse());
    }

    public ListRepositoryWebhookResponse listRepositoryWebhook(String ProjectId, ListRepositoryWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryWebhookWithOptions(ProjectId, request, headers, runtime);
    }

    public ListRepositoryWebhookResponse listRepositoryWebhookWithOptions(String ProjectId, ListRepositoryWebhookRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRepositoryWebhook"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/hooks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRepositoryWebhookResponse());
    }

    public MergeMergeRequestResponse mergeMergeRequest(String ProjectId, String MergeRequestId, MergeMergeRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.mergeMergeRequestWithOptions(ProjectId, MergeRequestId, request, headers, runtime);
    }

    public MergeMergeRequestResponse mergeMergeRequestWithOptions(String ProjectId, String MergeRequestId, MergeMergeRequestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MergeMergeRequest"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/merge_request/" + com.aliyun.openapiutil.Client.getEncodeParam(MergeRequestId) + "/merge"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MergeMergeRequestResponse());
    }

    public QuerySlsRelationResponse querySlsRelation(QuerySlsRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySlsRelationWithOptions(request, headers, runtime);
    }

    public QuerySlsRelationResponse querySlsRelationWithOptions(QuerySlsRelationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunUserId)) {
            body.put("aliyunUserId", request.aliyunUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeupProjectId)) {
            body.put("codeupProjectId", request.codeupProjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsLogStore)) {
            body.put("slsLogStore", request.slsLogStore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsProject)) {
            body.put("slsProject", request.slsProject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySlsRelation"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/repository/query_sls_relation"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySlsRelationResponse());
    }

    public RelatedSlsLogStoreResponse relatedSlsLogStore(RelatedSlsLogStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.relatedSlsLogStoreWithOptions(request, headers, runtime);
    }

    public RelatedSlsLogStoreResponse relatedSlsLogStoreWithOptions(RelatedSlsLogStoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunUserId)) {
            body.put("aliyunUserId", request.aliyunUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeupProjectId)) {
            body.put("codeupProjectId", request.codeupProjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultViewer)) {
            body.put("defaultViewer", request.defaultViewer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsLogStore)) {
            body.put("slsLogStore", request.slsLogStore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsProject)) {
            body.put("slsProject", request.slsProject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RelatedSlsLogStore"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/repository/related_to_sls_log_store"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RelatedSlsLogStoreResponse());
    }

    public TriggerRepositoryMirrorSyncResponse triggerRepositoryMirrorSync(String ProjectId, TriggerRepositoryMirrorSyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.triggerRepositoryMirrorSyncWithOptions(ProjectId, request, headers, runtime);
    }

    public TriggerRepositoryMirrorSyncResponse triggerRepositoryMirrorSyncWithOptions(String ProjectId, TriggerRepositoryMirrorSyncRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            query.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TriggerRepositoryMirrorSync"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/mirror"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TriggerRepositoryMirrorSyncResponse());
    }

    public UnRelatedSlsLogStoreResponse unRelatedSlsLogStore(UnRelatedSlsLogStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unRelatedSlsLogStoreWithOptions(request, headers, runtime);
    }

    public UnRelatedSlsLogStoreResponse unRelatedSlsLogStoreWithOptions(UnRelatedSlsLogStoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunUserId)) {
            body.put("aliyunUserId", request.aliyunUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeupProjectId)) {
            body.put("codeupProjectId", request.codeupProjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsLogStore)) {
            body.put("slsLogStore", request.slsLogStore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsProject)) {
            body.put("slsProject", request.slsProject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnRelatedSlsLogStore"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/repository/unrelated_to_sls_log_store"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnRelatedSlsLogStoreResponse());
    }

    public UpdateFileResponse updateFile(String ProjectId, UpdateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFileWithOptions(ProjectId, request, headers, runtime);
    }

    public UpdateFileResponse updateFileWithOptions(String ProjectId, UpdateFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFile"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/repository/files"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFileResponse());
    }

    public UpdateGroupMemberResponse updateGroupMember(String GroupId, String UserId, UpdateGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGroupMemberWithOptions(GroupId, UserId, request, headers, runtime);
    }

    public UpdateGroupMemberResponse updateGroupMemberWithOptions(String GroupId, String UserId, UpdateGroupMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGroupMember"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(GroupId) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(UserId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGroupMemberResponse());
    }

    public UpdateMergeRequestResponse updateMergeRequest(String ProjectId, String MergeRequestId, UpdateMergeRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMergeRequestWithOptions(ProjectId, MergeRequestId, request, headers, runtime);
    }

    public UpdateMergeRequestResponse updateMergeRequestWithOptions(String ProjectId, String MergeRequestId, UpdateMergeRequestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMergeRequest"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/merge_request/" + com.aliyun.openapiutil.Client.getEncodeParam(MergeRequestId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMergeRequestResponse());
    }

    public UpdateMergeRequestCommentResponse updateMergeRequestComment(String ProjectId, String MergeRequestId, String NoteId, UpdateMergeRequestCommentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMergeRequestCommentWithOptions(ProjectId, MergeRequestId, NoteId, request, headers, runtime);
    }

    public UpdateMergeRequestCommentResponse updateMergeRequestCommentWithOptions(String ProjectId, String MergeRequestId, String NoteId, UpdateMergeRequestCommentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMergeRequestComment"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/merge_requests/" + com.aliyun.openapiutil.Client.getEncodeParam(MergeRequestId) + "/notes/" + com.aliyun.openapiutil.Client.getEncodeParam(NoteId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMergeRequestCommentResponse());
    }

    public UpdateMergeRequestSettingResponse updateMergeRequestSetting(String ProjectId, UpdateMergeRequestSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMergeRequestSettingWithOptions(ProjectId, request, headers, runtime);
    }

    public UpdateMergeRequestSettingResponse updateMergeRequestSettingWithOptions(String ProjectId, UpdateMergeRequestSettingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMergeRequestSetting"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v4/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/settings/merge_requests"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMergeRequestSettingResponse());
    }

    public UpdateRepositoryResponse updateRepository(String ProjectId, UpdateRepositoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRepositoryWithOptions(ProjectId, request, headers, runtime);
    }

    public UpdateRepositoryResponse updateRepositoryWithOptions(String ProjectId, UpdateRepositoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRepository"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRepositoryResponse());
    }

    public UpdateRepositoryMemberResponse updateRepositoryMember(String ProjectId, String UserId, UpdateRepositoryMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRepositoryMemberWithOptions(ProjectId, UserId, request, headers, runtime);
    }

    public UpdateRepositoryMemberResponse updateRepositoryMemberWithOptions(String ProjectId, String UserId, UpdateRepositoryMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRepositoryMember"),
            new TeaPair("version", "2020-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v3/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/members/" + com.aliyun.openapiutil.Client.getEncodeParam(UserId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRepositoryMemberResponse());
    }
}
