// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414;

import com.aliyun.tea.*;
import com.aliyun.codeup20200414.models.*;
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

    public DeleteRepositoryMemberResponse deleteRepositoryMember(String ProjectId, String UserId, DeleteRepositoryMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRepositoryMemberWithOptions(ProjectId, UserId, request, headers, runtime);
    }

    public DeleteRepositoryMemberResponse deleteRepositoryMemberWithOptions(String ProjectId, String UserId, DeleteRepositoryMemberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteRepositoryMember", "2020-04-14", "HTTPS", "DELETE", "AK", "/api/v3/projects/" + ProjectId + "/members/" + UserId + "", "json", req, runtime), new DeleteRepositoryMemberResponse());
    }

    public CreateRepositoryProtectedBranchResponse createRepositoryProtectedBranch(String ProjectId, CreateRepositoryProtectedBranchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRepositoryProtectedBranchWithOptions(ProjectId, request, headers, runtime);
    }

    public CreateRepositoryProtectedBranchResponse createRepositoryProtectedBranchWithOptions(String ProjectId, CreateRepositoryProtectedBranchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateRepositoryProtectedBranch", "2020-04-14", "HTTPS", "POST", "AK", "/api/v4/projects/" + ProjectId + "/repository/protect_branches", "json", req, runtime), new CreateRepositoryProtectedBranchResponse());
    }

    public CreateMergeRequestResponse createMergeRequest(String ProjectId, CreateMergeRequestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMergeRequestWithOptions(ProjectId, request, headers, runtime);
    }

    public CreateMergeRequestResponse createMergeRequestWithOptions(String ProjectId, CreateMergeRequestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateMergeRequest", "2020-04-14", "HTTPS", "POST", "AK", "/api/v4/projects/" + ProjectId + "/merge_requests", "json", req, runtime), new CreateMergeRequestResponse());
    }

    public DeleteRepositoryResponse deleteRepository(String ProjectId, DeleteRepositoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRepositoryWithOptions(ProjectId, request, headers, runtime);
    }

    public DeleteRepositoryResponse deleteRepositoryWithOptions(String ProjectId, DeleteRepositoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteRepository", "2020-04-14", "HTTPS", "POST", "AK", "/api/v3/projects/" + ProjectId + "/remove", "json", req, runtime), new DeleteRepositoryResponse());
    }

    public GetRepositoryTagResponse getRepositoryTag(String ProjectId, String TagName, GetRepositoryTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepositoryTagWithOptions(ProjectId, TagName, request, headers, runtime);
    }

    public GetRepositoryTagResponse getRepositoryTagWithOptions(String ProjectId, String TagName, GetRepositoryTagRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetRepositoryTag", "2020-04-14", "HTTPS", "GET", "AK", "/api/v3/projects/" + ProjectId + "/repository/tags/" + TagName + "", "json", req, runtime), new GetRepositoryTagResponse());
    }

    public UpdateMergeRequestResponse updateMergeRequest(String ProjectId, String MergeRequestId, UpdateMergeRequestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMergeRequestWithOptions(ProjectId, MergeRequestId, request, headers, runtime);
    }

    public UpdateMergeRequestResponse updateMergeRequestWithOptions(String ProjectId, String MergeRequestId, UpdateMergeRequestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateMergeRequest", "2020-04-14", "HTTPS", "PUT", "AK", "/api/v3/projects/" + ProjectId + "/merge_request/" + MergeRequestId + "", "json", req, runtime), new UpdateMergeRequestResponse());
    }

    public UpdateRepositoryResponse updateRepository(String ProjectId, UpdateRepositoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRepositoryWithOptions(ProjectId, request, headers, runtime);
    }

    public UpdateRepositoryResponse updateRepositoryWithOptions(String ProjectId, UpdateRepositoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateRepository", "2020-04-14", "HTTPS", "PUT", "AK", "/api/v3/projects/" + ProjectId + "", "json", req, runtime), new UpdateRepositoryResponse());
    }

    public UpdateMergeRequestCommentResponse updateMergeRequestComment(String ProjectId, String MergeRequestId, String NoteId, UpdateMergeRequestCommentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMergeRequestCommentWithOptions(ProjectId, MergeRequestId, NoteId, request, headers, runtime);
    }

    public UpdateMergeRequestCommentResponse updateMergeRequestCommentWithOptions(String ProjectId, String MergeRequestId, String NoteId, UpdateMergeRequestCommentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateMergeRequestComment", "2020-04-14", "HTTPS", "PUT", "AK", "/api/v3/projects/" + ProjectId + "/merge_requests/" + MergeRequestId + "/notes/" + NoteId + "", "json", req, runtime), new UpdateMergeRequestCommentResponse());
    }

    public DeleteBranchResponse deleteBranch(String ProjectId, DeleteBranchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBranchWithOptions(ProjectId, request, headers, runtime);
    }

    public DeleteBranchResponse deleteBranchWithOptions(String ProjectId, DeleteBranchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteBranch", "2020-04-14", "HTTPS", "DELETE", "AK", "/api/v3/projects/" + ProjectId + "/repository/branches/delete", "json", req, runtime), new DeleteBranchResponse());
    }

    public ListRepositoryCommitDiffResponse listRepositoryCommitDiff(String ProjectId, String Sha, ListRepositoryCommitDiffRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryCommitDiffWithOptions(ProjectId, Sha, request, headers, runtime);
    }

    public ListRepositoryCommitDiffResponse listRepositoryCommitDiffWithOptions(String ProjectId, String Sha, ListRepositoryCommitDiffRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contextLine)) {
            query.put("ContextLine", request.contextLine);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListRepositoryCommitDiff", "2020-04-14", "HTTPS", "GET", "AK", "/api/v3/projects/" + ProjectId + "/repository/commits/" + Sha + "/diff", "json", req, runtime), new ListRepositoryCommitDiffResponse());
    }

    public GetRepositoryInfoResponse getRepositoryInfo(GetRepositoryInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepositoryInfoWithOptions(request, headers, runtime);
    }

    public GetRepositoryInfoResponse getRepositoryInfoWithOptions(GetRepositoryInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetRepositoryInfo", "2020-04-14", "HTTPS", "GET", "AK", "/api/v3/projects/info", "json", req, runtime), new GetRepositoryInfoResponse());
    }

    public AcceptMergeRequestResponse acceptMergeRequest(String ProjectId, String MergeRequestId, AcceptMergeRequestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.acceptMergeRequestWithOptions(ProjectId, MergeRequestId, request, headers, runtime);
    }

    public AcceptMergeRequestResponse acceptMergeRequestWithOptions(String ProjectId, String MergeRequestId, AcceptMergeRequestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("AcceptMergeRequest", "2020-04-14", "HTTPS", "PUT", "AK", "/api/v3/projects/" + ProjectId + "/merge_request/" + MergeRequestId + "/accept", "json", req, runtime), new AcceptMergeRequestResponse());
    }

    public DeleteFileResponse deleteFile(String ProjectId, DeleteFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFileWithOptions(ProjectId, request, headers, runtime);
    }

    public DeleteFileResponse deleteFileWithOptions(String ProjectId, DeleteFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("BranchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commitMessage)) {
            query.put("CommitMessage", request.commitMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteFile", "2020-04-14", "HTTPS", "DELETE", "AK", "/api/v3/projects/" + ProjectId + "/repository/files", "json", req, runtime), new DeleteFileResponse());
    }

    public DeleteRepositoryProtectedBranchResponse deleteRepositoryProtectedBranch(String ProjectId, String ProtectedBranchId, DeleteRepositoryProtectedBranchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRepositoryProtectedBranchWithOptions(ProjectId, ProtectedBranchId, request, headers, runtime);
    }

    public DeleteRepositoryProtectedBranchResponse deleteRepositoryProtectedBranchWithOptions(String ProjectId, String ProtectedBranchId, DeleteRepositoryProtectedBranchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteRepositoryProtectedBranch", "2020-04-14", "HTTPS", "DELETE", "AK", "/api/v4/projects/" + ProjectId + "/repository/protect_branches/" + ProtectedBranchId + "", "json", req, runtime), new DeleteRepositoryProtectedBranchResponse());
    }

    public DeleteRepositoryTagV2Response deleteRepositoryTagV2(String ProjectId, DeleteRepositoryTagV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRepositoryTagV2WithOptions(ProjectId, request, headers, runtime);
    }

    public DeleteRepositoryTagV2Response deleteRepositoryTagV2WithOptions(String ProjectId, DeleteRepositoryTagV2Request request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteRepositoryTagV2", "2020-04-14", "HTTPS", "DELETE", "AK", "/api/v3/projects/" + ProjectId + "/repository/tag/delete", "json", req, runtime), new DeleteRepositoryTagV2Response());
    }

    public GetFileLastCommitResponse getFileLastCommit(String ProjectId, GetFileLastCommitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFileLastCommitWithOptions(ProjectId, request, headers, runtime);
    }

    public GetFileLastCommitResponse getFileLastCommitWithOptions(String ProjectId, GetFileLastCommitRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sha)) {
            query.put("Sha", request.sha);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetFileLastCommit", "2020-04-14", "HTTPS", "GET", "AK", "/api/v3/projects/" + ProjectId + "/repository/files/last_commit", "json", req, runtime), new GetFileLastCommitResponse());
    }

    public UpdateFileResponse updateFile(String ProjectId, UpdateFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFileWithOptions(ProjectId, request, headers, runtime);
    }

    public UpdateFileResponse updateFileWithOptions(String ProjectId, UpdateFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateFile", "2020-04-14", "HTTPS", "PUT", "AK", "/api/v4/projects/" + ProjectId + "/repository/files", "json", req, runtime), new UpdateFileResponse());
    }

    public UpdateRepositoryMemberResponse updateRepositoryMember(String ProjectId, String UserId, UpdateRepositoryMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRepositoryMemberWithOptions(ProjectId, UserId, request, headers, runtime);
    }

    public UpdateRepositoryMemberResponse updateRepositoryMemberWithOptions(String ProjectId, String UserId, UpdateRepositoryMemberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateRepositoryMember", "2020-04-14", "HTTPS", "PUT", "AK", "/api/v3/projects/" + ProjectId + "/members/" + UserId + "", "json", req, runtime), new UpdateRepositoryMemberResponse());
    }

    public AddRepositoryMemberResponse addRepositoryMember(String ProjectId, AddRepositoryMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addRepositoryMemberWithOptions(ProjectId, request, headers, runtime);
    }

    public AddRepositoryMemberResponse addRepositoryMemberWithOptions(String ProjectId, AddRepositoryMemberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("AddRepositoryMember", "2020-04-14", "HTTPS", "POST", "AK", "/api/v4/projects/" + ProjectId + "/members", "json", req, runtime), new AddRepositoryMemberResponse());
    }

    public CreateSshKeyResponse createSshKey(CreateSshKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSshKeyWithOptions(request, headers, runtime);
    }

    public CreateSshKeyResponse createSshKeyWithOptions(CreateSshKeyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateSshKey", "2020-04-14", "HTTPS", "POST", "AK", "/api/v3/user/keys", "json", req, runtime), new CreateSshKeyResponse());
    }

    public ListRepositoryTagsResponse listRepositoryTags(String ProjectId, ListRepositoryTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryTagsWithOptions(ProjectId, request, headers, runtime);
    }

    public ListRepositoryTagsResponse listRepositoryTagsWithOptions(String ProjectId, ListRepositoryTagsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("Search", request.search);
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

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showSignature)) {
            query.put("ShowSignature", request.showSignature);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListRepositoryTags", "2020-04-14", "HTTPS", "GET", "AK", "/api/v4/projects/" + ProjectId + "/repository/tags", "json", req, runtime), new ListRepositoryTagsResponse());
    }

    public AddWebhookResponse addWebhook(String ProjectId, AddWebhookRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addWebhookWithOptions(ProjectId, request, headers, runtime);
    }

    public AddWebhookResponse addWebhookWithOptions(String ProjectId, AddWebhookRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("AddWebhook", "2020-04-14", "HTTPS", "POST", "AK", "/api/v3/projects/" + ProjectId + "/hooks", "json", req, runtime), new AddWebhookResponse());
    }

    public EnableRepositoryDeployKeyResponse enableRepositoryDeployKey(String ProjectId, String KeyId, EnableRepositoryDeployKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableRepositoryDeployKeyWithOptions(ProjectId, KeyId, request, headers, runtime);
    }

    public EnableRepositoryDeployKeyResponse enableRepositoryDeployKeyWithOptions(String ProjectId, String KeyId, EnableRepositoryDeployKeyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("EnableRepositoryDeployKey", "2020-04-14", "HTTPS", "POST", "AK", "/api/v3/projects/" + ProjectId + "/keys/" + KeyId + "/enable", "json", req, runtime), new EnableRepositoryDeployKeyResponse());
    }

    public GetUserInfoResponse getUserInfo(GetUserInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserInfoWithOptions(request, headers, runtime);
    }

    public GetUserInfoResponse getUserInfoWithOptions(GetUserInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetUserInfo", "2020-04-14", "HTTPS", "GET", "AK", "/api/v3/user/current", "json", req, runtime), new GetUserInfoResponse());
    }

    public ListRepositoryTreeResponse listRepositoryTree(String ProjectId, ListRepositoryTreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryTreeWithOptions(ProjectId, request, headers, runtime);
    }

    public ListRepositoryTreeResponse listRepositoryTreeWithOptions(String ProjectId, ListRepositoryTreeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refName)) {
            query.put("RefName", request.refName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListRepositoryTree", "2020-04-14", "HTTPS", "GET", "AK", "/api/v4/projects/" + ProjectId + "/repository/tree", "json", req, runtime), new ListRepositoryTreeResponse());
    }

    public DeleteRepositoryGroupResponse deleteRepositoryGroup(String GroupId, DeleteRepositoryGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRepositoryGroupWithOptions(GroupId, request, headers, runtime);
    }

    public DeleteRepositoryGroupResponse deleteRepositoryGroupWithOptions(String GroupId, DeleteRepositoryGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteRepositoryGroup", "2020-04-14", "HTTPS", "POST", "AK", "/api/v3/groups/" + GroupId + "/remove", "json", req, runtime), new DeleteRepositoryGroupResponse());
    }

    public DeleteRepositoryWebhookResponse deleteRepositoryWebhook(String ProjectId, String WebhookId, DeleteRepositoryWebhookRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRepositoryWebhookWithOptions(ProjectId, WebhookId, request, headers, runtime);
    }

    public DeleteRepositoryWebhookResponse deleteRepositoryWebhookWithOptions(String ProjectId, String WebhookId, DeleteRepositoryWebhookRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteRepositoryWebhook", "2020-04-14", "HTTPS", "DELETE", "AK", "/api/v3/projects/" + ProjectId + "/hooks/" + WebhookId + "", "json", req, runtime), new DeleteRepositoryWebhookResponse());
    }

    public ListRepositoryMemberResponse listRepositoryMember(String ProjectId, ListRepositoryMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryMemberWithOptions(ProjectId, request, headers, runtime);
    }

    public ListRepositoryMemberResponse listRepositoryMemberWithOptions(String ProjectId, ListRepositoryMemberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListRepositoryMember", "2020-04-14", "HTTPS", "GET", "AK", "/api/v3/projects/" + ProjectId + "/members", "json", req, runtime), new ListRepositoryMemberResponse());
    }

    public CreateTagResponse createTag(String ProjectId, CreateTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTagWithOptions(ProjectId, request, headers, runtime);
    }

    public CreateTagResponse createTagWithOptions(String ProjectId, CreateTagRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateTag", "2020-04-14", "HTTPS", "POST", "AK", "/api/v3/projects/" + ProjectId + "/repository/tags", "json", req, runtime), new CreateTagResponse());
    }

    public GetRepositoryCommitResponse getRepositoryCommit(String ProjectId, String Sha, GetRepositoryCommitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepositoryCommitWithOptions(ProjectId, Sha, request, headers, runtime);
    }

    public GetRepositoryCommitResponse getRepositoryCommitWithOptions(String ProjectId, String Sha, GetRepositoryCommitRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetRepositoryCommit", "2020-04-14", "HTTPS", "GET", "AK", "/api/v4/projects/" + ProjectId + "/repository/commits/" + Sha + "", "json", req, runtime), new GetRepositoryCommitResponse());
    }

    public AddGroupMemberResponse addGroupMember(String GroupId, AddGroupMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addGroupMemberWithOptions(GroupId, request, headers, runtime);
    }

    public AddGroupMemberResponse addGroupMemberWithOptions(String GroupId, AddGroupMemberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("AddGroupMember", "2020-04-14", "HTTPS", "POST", "AK", "/api/v4/groups/" + GroupId + "/members", "json", req, runtime), new AddGroupMemberResponse());
    }

    public GetBranchInfoResponse getBranchInfo(String ProjectId, GetBranchInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBranchInfoWithOptions(ProjectId, request, headers, runtime);
    }

    public GetBranchInfoResponse getBranchInfoWithOptions(String ProjectId, GetBranchInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("BranchName", request.branchName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetBranchInfo", "2020-04-14", "HTTPS", "GET", "AK", "/api/v3/projects/" + ProjectId + "/repository/branches/detail", "json", req, runtime), new GetBranchInfoResponse());
    }

    public ListMergeRequestCommentsResponse listMergeRequestComments(String ProjectId, String MergeRequestId, ListMergeRequestCommentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMergeRequestCommentsWithOptions(ProjectId, MergeRequestId, request, headers, runtime);
    }

    public ListMergeRequestCommentsResponse listMergeRequestCommentsWithOptions(String ProjectId, String MergeRequestId, ListMergeRequestCommentsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromCommit)) {
            query.put("FromCommit", request.fromCommit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toCommit)) {
            query.put("ToCommit", request.toCommit);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListMergeRequestComments", "2020-04-14", "HTTPS", "GET", "AK", "/api/v4/projects/" + ProjectId + "/merge_request/" + MergeRequestId + "/comments", "json", req, runtime), new ListMergeRequestCommentsResponse());
    }

    public CreateRepositoryGroupResponse createRepositoryGroup(CreateRepositoryGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRepositoryGroupWithOptions(request, headers, runtime);
    }

    public CreateRepositoryGroupResponse createRepositoryGroupWithOptions(CreateRepositoryGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateRepositoryGroup", "2020-04-14", "HTTPS", "POST", "AK", "/api/v3/groups", "json", req, runtime), new CreateRepositoryGroupResponse());
    }

    public GetMergeRequestDetailResponse getMergeRequestDetail(String ProjectId, String MergeRequestId, GetMergeRequestDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMergeRequestDetailWithOptions(ProjectId, MergeRequestId, request, headers, runtime);
    }

    public GetMergeRequestDetailResponse getMergeRequestDetailWithOptions(String ProjectId, String MergeRequestId, GetMergeRequestDetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetMergeRequestDetail", "2020-04-14", "HTTPS", "GET", "AK", "/api/v4/projects/" + ProjectId + "/merge_request/" + MergeRequestId + "", "json", req, runtime), new GetMergeRequestDetailResponse());
    }

    public ListGroupsResponse listGroups(ListGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGroupsWithOptions(request, headers, runtime);
    }

    public ListGroupsResponse listGroupsWithOptions(ListGroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("Search", request.search);
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

        if (!com.aliyun.teautil.Common.isUnset(request.includePersonal)) {
            query.put("IncludePersonal", request.includePersonal);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListGroups", "2020-04-14", "HTTPS", "GET", "AK", "/api/v3/groups/all", "json", req, runtime), new ListGroupsResponse());
    }

    public ListRepositoryProtectedBranchResponse listRepositoryProtectedBranch(String ProjectId, ListRepositoryProtectedBranchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryProtectedBranchWithOptions(ProjectId, request, headers, runtime);
    }

    public ListRepositoryProtectedBranchResponse listRepositoryProtectedBranchWithOptions(String ProjectId, ListRepositoryProtectedBranchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListRepositoryProtectedBranch", "2020-04-14", "HTTPS", "GET", "AK", "/api/v4/projects/" + ProjectId + "/repository/protect_branches", "json", req, runtime), new ListRepositoryProtectedBranchResponse());
    }

    public ListOrganizationsResponse listOrganizations(ListOrganizationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOrganizationsWithOptions(request, headers, runtime);
    }

    public ListOrganizationsResponse listOrganizationsWithOptions(ListOrganizationsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessLevel)) {
            query.put("AccessLevel", request.accessLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minAccessLevel)) {
            query.put("MinAccessLevel", request.minAccessLevel);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListOrganizations", "2020-04-14", "HTTPS", "GET", "AK", "/api/v4/organization", "json", req, runtime), new ListOrganizationsResponse());
    }

    public GetProjectMemberResponse getProjectMember(String ProjectId, String UserId, GetProjectMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProjectMemberWithOptions(ProjectId, UserId, request, headers, runtime);
    }

    public GetProjectMemberResponse getProjectMemberWithOptions(String ProjectId, String UserId, GetProjectMemberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetProjectMember", "2020-04-14", "HTTPS", "GET", "AK", "/api/v3/projects/" + ProjectId + "/members/" + UserId + "", "json", req, runtime), new GetProjectMemberResponse());
    }

    public CreateFileResponse createFile(String ProjectId, CreateFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFileWithOptions(ProjectId, request, headers, runtime);
    }

    public CreateFileResponse createFileWithOptions(String ProjectId, CreateFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateFile", "2020-04-14", "HTTPS", "POST", "AK", "/api/v3/projects/" + ProjectId + "/repository/files", "json", req, runtime), new CreateFileResponse());
    }

    public ListRepositoryCommitsResponse listRepositoryCommits(String ProjectId, ListRepositoryCommitsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryCommitsWithOptions(ProjectId, request, headers, runtime);
    }

    public ListRepositoryCommitsResponse listRepositoryCommitsWithOptions(String ProjectId, ListRepositoryCommitsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refName)) {
            query.put("RefName", request.refName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showSignature)) {
            query.put("ShowSignature", request.showSignature);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListRepositoryCommits", "2020-04-14", "HTTPS", "GET", "AK", "/api/v4/projects/" + ProjectId + "/repository/commits", "json", req, runtime), new ListRepositoryCommitsResponse());
    }

    public GetMergeRequestApproveStatusResponse getMergeRequestApproveStatus(String ProjectId, String MergeRequestId, GetMergeRequestApproveStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMergeRequestApproveStatusWithOptions(ProjectId, MergeRequestId, request, headers, runtime);
    }

    public GetMergeRequestApproveStatusResponse getMergeRequestApproveStatusWithOptions(String ProjectId, String MergeRequestId, GetMergeRequestApproveStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetMergeRequestApproveStatus", "2020-04-14", "HTTPS", "GET", "AK", "/api/v4/projects/" + ProjectId + "/merge_request/" + MergeRequestId + "/approve_status", "json", req, runtime), new GetMergeRequestApproveStatusResponse());
    }

    public ListRepositoriesResponse listRepositories(ListRepositoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoriesWithOptions(request, headers, runtime);
    }

    public ListRepositoriesResponse listRepositoriesWithOptions(ListRepositoriesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("Search", request.search);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.archive)) {
            query.put("Archive", request.archive);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListRepositories", "2020-04-14", "HTTPS", "GET", "AK", "/api/v3/projects/all", "json", req, runtime), new ListRepositoriesResponse());
    }

    public UpdateMergeRequestSettingResponse updateMergeRequestSetting(String ProjectId, UpdateMergeRequestSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMergeRequestSettingWithOptions(ProjectId, request, headers, runtime);
    }

    public UpdateMergeRequestSettingResponse updateMergeRequestSettingWithOptions(String ProjectId, UpdateMergeRequestSettingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateMergeRequestSetting", "2020-04-14", "HTTPS", "PUT", "AK", "/api/v4/projects/" + ProjectId + "/settings/merge_requests", "json", req, runtime), new UpdateMergeRequestSettingResponse());
    }

    public ListGroupMemberResponse listGroupMember(String GroupId, ListGroupMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGroupMemberWithOptions(GroupId, request, headers, runtime);
    }

    public ListGroupMemberResponse listGroupMemberWithOptions(String GroupId, ListGroupMemberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListGroupMember", "2020-04-14", "HTTPS", "GET", "AK", "/api/v3/groups/" + GroupId + "/members", "json", req, runtime), new ListGroupMemberResponse());
    }

    public UpdateGroupMemberResponse updateGroupMember(String GroupId, String UserId, UpdateGroupMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGroupMemberWithOptions(GroupId, UserId, request, headers, runtime);
    }

    public UpdateGroupMemberResponse updateGroupMemberWithOptions(String GroupId, String UserId, UpdateGroupMemberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateGroupMember", "2020-04-14", "HTTPS", "PUT", "AK", "/api/v3/groups/" + GroupId + "/members/" + UserId + "", "json", req, runtime), new UpdateGroupMemberResponse());
    }

    public CreateMergeRequestCommentResponse createMergeRequestComment(String ProjectId, String MergeRequestId, CreateMergeRequestCommentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMergeRequestCommentWithOptions(ProjectId, MergeRequestId, request, headers, runtime);
    }

    public CreateMergeRequestCommentResponse createMergeRequestCommentWithOptions(String ProjectId, String MergeRequestId, CreateMergeRequestCommentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateMergeRequestComment", "2020-04-14", "HTTPS", "POST", "AK", "/api/v4/projects/" + ProjectId + "/merge_request/" + MergeRequestId + "/comments", "json", req, runtime), new CreateMergeRequestCommentResponse());
    }

    public CreateRepositoryDeployKeyResponse createRepositoryDeployKey(String ProjectId, CreateRepositoryDeployKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRepositoryDeployKeyWithOptions(ProjectId, request, headers, runtime);
    }

    public CreateRepositoryDeployKeyResponse createRepositoryDeployKeyWithOptions(String ProjectId, CreateRepositoryDeployKeyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateRepositoryDeployKey", "2020-04-14", "HTTPS", "POST", "AK", "/api/v3/projects/" + ProjectId + "/keys", "json", req, runtime), new CreateRepositoryDeployKeyResponse());
    }

    public DeleteRepositoryTagResponse deleteRepositoryTag(String ProjectId, String TagName, DeleteRepositoryTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRepositoryTagWithOptions(ProjectId, TagName, request, headers, runtime);
    }

    public DeleteRepositoryTagResponse deleteRepositoryTagWithOptions(String ProjectId, String TagName, DeleteRepositoryTagRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteRepositoryTag", "2020-04-14", "HTTPS", "DELETE", "AK", "/api/v3/projects/" + ProjectId + "/repository/tags/" + TagName + "", "json", req, runtime), new DeleteRepositoryTagResponse());
    }

    public CreateRepositoryResponse createRepository(CreateRepositoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRepositoryWithOptions(request, headers, runtime);
    }

    public CreateRepositoryResponse createRepositoryWithOptions(CreateRepositoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sync)) {
            query.put("Sync", request.sync);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateRepository", "2020-04-14", "HTTPS", "POST", "AK", "/api/v3/projects", "json", req, runtime), new CreateRepositoryResponse());
    }

    public GetCodeCompletionResponse getCodeCompletion(String ServiceName, GetCodeCompletionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCodeCompletionWithOptions(ServiceName, request, headers, runtime);
    }

    public GetCodeCompletionResponse getCodeCompletionWithOptions(String ServiceName, GetCodeCompletionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fetchKeys)) {
            query.put("FetchKeys", request.fetchKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isEncrypted)) {
            query.put("IsEncrypted", request.isEncrypted);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetCodeCompletion", "2020-04-14", "HTTPS", "POST", "AK", "/api/v2/service/invoke/" + ServiceName + "", "json", req, runtime), new GetCodeCompletionResponse());
    }

    public ListMergeRequestsResponse listMergeRequests(ListMergeRequestsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMergeRequestsWithOptions(request, headers, runtime);
    }

    public ListMergeRequestsResponse listMergeRequestsWithOptions(ListMergeRequestsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.groupIdList)) {
            query.put("GroupIdList", request.groupIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdList)) {
            query.put("ProjectIdList", request.projectIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorCodeupIdList)) {
            query.put("AuthorCodeupIdList", request.authorCodeupIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorIdList)) {
            query.put("AuthorIdList", request.authorIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assigneeCodeupIdList)) {
            query.put("AssigneeCodeupIdList", request.assigneeCodeupIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assigneeIdList)) {
            query.put("AssigneeIdList", request.assigneeIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriberCodeupIdList)) {
            query.put("SubscriberCodeupIdList", request.subscriberCodeupIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("Search", request.search);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.afterDate)) {
            query.put("AfterDate", request.afterDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beforeDate)) {
            query.put("BeforeDate", request.beforeDate);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListMergeRequests", "2020-04-14", "HTTPS", "GET", "AK", "/api/v4/merge_requests/advanced_search", "json", req, runtime), new ListMergeRequestsResponse());
    }

    public ListOrganizationSecurityScoresResponse listOrganizationSecurityScores(ListOrganizationSecurityScoresRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOrganizationSecurityScoresWithOptions(request, headers, runtime);
    }

    public ListOrganizationSecurityScoresResponse listOrganizationSecurityScoresWithOptions(ListOrganizationSecurityScoresRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListOrganizationSecurityScores", "2020-04-14", "HTTPS", "GET", "AK", "/api/v4/organization/security/scores", "json", req, runtime), new ListOrganizationSecurityScoresResponse());
    }

    public GetFileBlobsResponse getFileBlobs(String ProjectId, GetFileBlobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFileBlobsWithOptions(ProjectId, request, headers, runtime);
    }

    public GetFileBlobsResponse getFileBlobsWithOptions(String ProjectId, GetFileBlobsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ref)) {
            query.put("Ref", request.ref);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("From", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            query.put("To", request.to);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetFileBlobs", "2020-04-14", "HTTPS", "GET", "AK", "/api/v4/projects/" + ProjectId + "/repository/blobs", "json", req, runtime), new GetFileBlobsResponse());
    }

    public MergeMergeRequestResponse mergeMergeRequest(String ProjectId, String MergeRequestId, MergeMergeRequestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.mergeMergeRequestWithOptions(ProjectId, MergeRequestId, request, headers, runtime);
    }

    public MergeMergeRequestResponse mergeMergeRequestWithOptions(String ProjectId, String MergeRequestId, MergeMergeRequestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("MergeMergeRequest", "2020-04-14", "HTTPS", "PUT", "AK", "/api/v3/projects/" + ProjectId + "/merge_request/" + MergeRequestId + "/merge", "json", req, runtime), new MergeMergeRequestResponse());
    }

    public DeleteGroupMemberResponse deleteGroupMember(String GroupId, String UserId, DeleteGroupMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGroupMemberWithOptions(GroupId, UserId, request, headers, runtime);
    }

    public DeleteGroupMemberResponse deleteGroupMemberWithOptions(String GroupId, String UserId, DeleteGroupMemberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteGroupMember", "2020-04-14", "HTTPS", "DELETE", "AK", "/api/v3/groups/" + GroupId + "/members/" + UserId + "", "json", req, runtime), new DeleteGroupMemberResponse());
    }

    public ListRepositoryMemberWithInheritedResponse listRepositoryMemberWithInherited(String ProjectId, ListRepositoryMemberWithInheritedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryMemberWithInheritedWithOptions(ProjectId, request, headers, runtime);
    }

    public ListRepositoryMemberWithInheritedResponse listRepositoryMemberWithInheritedWithOptions(String ProjectId, ListRepositoryMemberWithInheritedRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListRepositoryMemberWithInherited", "2020-04-14", "HTTPS", "GET", "AK", "/api/v4/projects/" + ProjectId + "/all_members", "json", req, runtime), new ListRepositoryMemberWithInheritedResponse());
    }

    public GetGroupDetailResponse getGroupDetail(GetGroupDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGroupDetailWithOptions(request, headers, runtime);
    }

    public GetGroupDetailResponse getGroupDetailWithOptions(GetGroupDetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetGroupDetail", "2020-04-14", "HTTPS", "GET", "AK", "/api/v3/groups/detail", "json", req, runtime), new GetGroupDetailResponse());
    }

    public GetCodeupOrganizationResponse getCodeupOrganization(String OrganizationIdentity, GetCodeupOrganizationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCodeupOrganizationWithOptions(OrganizationIdentity, request, headers, runtime);
    }

    public GetCodeupOrganizationResponse getCodeupOrganizationWithOptions(String OrganizationIdentity, GetCodeupOrganizationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetCodeupOrganization", "2020-04-14", "HTTPS", "GET", "AK", "/api/v4/organization/" + OrganizationIdentity + "", "json", req, runtime), new GetCodeupOrganizationResponse());
    }

    public GetOrganizationSecurityCenterStatusResponse getOrganizationSecurityCenterStatus(GetOrganizationSecurityCenterStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOrganizationSecurityCenterStatusWithOptions(request, headers, runtime);
    }

    public GetOrganizationSecurityCenterStatusResponse getOrganizationSecurityCenterStatusWithOptions(GetOrganizationSecurityCenterStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetOrganizationSecurityCenterStatus", "2020-04-14", "HTTPS", "GET", "AK", "/api/v4/organization/security/status", "json", req, runtime), new GetOrganizationSecurityCenterStatusResponse());
    }

    public ListRepositoryBranchesResponse listRepositoryBranches(String ProjectId, ListRepositoryBranchesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryBranchesWithOptions(ProjectId, request, headers, runtime);
    }

    public ListRepositoryBranchesResponse listRepositoryBranchesWithOptions(String ProjectId, ListRepositoryBranchesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("Search", request.search);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListRepositoryBranches", "2020-04-14", "HTTPS", "GET", "AK", "/api/v3/projects/" + ProjectId + "/repository/branches", "json", req, runtime), new ListRepositoryBranchesResponse());
    }

    public CreateBranchResponse createBranch(String ProjectId, CreateBranchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBranchWithOptions(ProjectId, request, headers, runtime);
    }

    public CreateBranchResponse createBranchWithOptions(String ProjectId, CreateBranchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateBranch", "2020-04-14", "HTTPS", "POST", "AK", "/api/v3/projects/" + ProjectId + "/repository/branches", "json", req, runtime), new CreateBranchResponse());
    }

    public ListGroupRepositoriesResponse listGroupRepositories(String Identity, ListGroupRepositoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGroupRepositoriesWithOptions(Identity, request, headers, runtime);
    }

    public ListGroupRepositoriesResponse listGroupRepositoriesWithOptions(String Identity, ListGroupRepositoriesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isMember)) {
            query.put("IsMember", request.isMember);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.search)) {
            query.put("Search", request.search);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListGroupRepositories", "2020-04-14", "HTTPS", "GET", "AK", "/api/v3/groups/" + Identity + "/projects", "json", req, runtime), new ListGroupRepositoriesResponse());
    }

    public GetRepositoryTagV2Response getRepositoryTagV2(String ProjectId, GetRepositoryTagV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRepositoryTagV2WithOptions(ProjectId, request, headers, runtime);
    }

    public GetRepositoryTagV2Response getRepositoryTagV2WithOptions(String ProjectId, GetRepositoryTagV2Request request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetRepositoryTagV2", "2020-04-14", "HTTPS", "GET", "AK", "/api/v3/projects/" + ProjectId + "/repository/tag/info", "json", req, runtime), new GetRepositoryTagV2Response());
    }

    public GetMergeRequestSettingResponse getMergeRequestSetting(String ProjectId, GetMergeRequestSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMergeRequestSettingWithOptions(ProjectId, request, headers, runtime);
    }

    public GetMergeRequestSettingResponse getMergeRequestSettingWithOptions(String ProjectId, GetMergeRequestSettingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            query.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetMergeRequestSetting", "2020-04-14", "HTTPS", "GET", "AK", "/api/v4/projects/" + ProjectId + "/settings/merge_requests", "json", req, runtime), new GetMergeRequestSettingResponse());
    }

    public ListRepositoryWebhookResponse listRepositoryWebhook(String ProjectId, ListRepositoryWebhookRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRepositoryWebhookWithOptions(ProjectId, request, headers, runtime);
    }

    public ListRepositoryWebhookResponse listRepositoryWebhookWithOptions(String ProjectId, ListRepositoryWebhookRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListRepositoryWebhook", "2020-04-14", "HTTPS", "GET", "AK", "/api/v3/projects/" + ProjectId + "/hooks", "json", req, runtime), new ListRepositoryWebhookResponse());
    }
}
