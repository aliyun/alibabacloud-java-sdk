// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210;

import com.aliyun.tea.*;
import com.aliyun.modelstudio20260210.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("eu-central-1", "modelstudio.eu-central-1.aliyuncs.com"),
            new TeaPair("cn-hongkong", "modelstudio.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-beijing", "modelstudio.cn-beijing.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "modelstudio.ap-southeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("modelstudio", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Creates an account and directly adds it as a member.</p>
     * 
     * @param request AddOrganizationMemberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddOrganizationMemberResponse
     */
    public AddOrganizationMemberResponse addOrganizationMemberWithOptions(AddOrganizationMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgRoleCode)) {
            query.put("OrgRoleCode", request.orgRoleCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specType)) {
            query.put("SpecType", request.specType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddOrganizationMember"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tokenplan/organization/member-additions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddOrganizationMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an account and directly adds it as a member.</p>
     * 
     * @param request AddOrganizationMemberRequest
     * @return AddOrganizationMemberResponse
     */
    public AddOrganizationMemberResponse addOrganizationMember(AddOrganizationMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addOrganizationMemberWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Assigns seats in batches to the member level.</p>
     * 
     * @param request BatchAssignSeatsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchAssignSeatsResponse
     */
    public BatchAssignSeatsResponse batchAssignSeatsWithOptions(BatchAssignSeatsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountIds)) {
            query.put("AccountIds", request.accountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locale)) {
            query.put("Locale", request.locale);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seatType)) {
            query.put("SeatType", request.seatType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchAssignSeats"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tokenplan/subscription/seat-assignments"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchAssignSeatsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Assigns seats in batches to the member level.</p>
     * 
     * @param request BatchAssignSeatsRequest
     * @return BatchAssignSeatsResponse
     */
    public BatchAssignSeatsResponse batchAssignSeats(BatchAssignSeatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchAssignSeatsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes member-level seats in batches.</p>
     * 
     * @param tmpReq BatchRevokeSeatsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchRevokeSeatsResponse
     */
    public BatchRevokeSeatsResponse batchRevokeSeatsWithOptions(BatchRevokeSeatsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchRevokeSeatsShrinkRequest request = new BatchRevokeSeatsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.items)) {
            request.itemsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.items, "Items", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.itemsShrink)) {
            query.put("Items", request.itemsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locale)) {
            query.put("Locale", request.locale);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchRevokeSeats"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tokenplan/subscription/seat-revocations"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchRevokeSeatsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes member-level seats in batches.</p>
     * 
     * @param request BatchRevokeSeatsRequest
     * @return BatchRevokeSeatsResponse
     */
    public BatchRevokeSeatsResponse batchRevokeSeats(BatchRevokeSeatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchRevokeSeatsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Before using large models or applications in Alibaba Cloud Model Studio, create an API key as an authentication credential.</p>
     * 
     * @param request CreateApiKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApiKeyResponse
     */
    public CreateApiKeyResponse createApiKeyWithOptions(CreateApiKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auth)) {
            body.put("auth", request.auth);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApiKey"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modelstudio/apikeys"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApiKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Before using large models or applications in Alibaba Cloud Model Studio, create an API key as an authentication credential.</p>
     * 
     * @param request CreateApiKeyRequest
     * @return CreateApiKeyResponse
     */
    public CreateApiKeyResponse createApiKey(CreateApiKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApiKeyWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A user can have only one valid invitation link at a time.
     * If the user already has a valid invitation link, this operation returns the existing link.
     * To create a new link, call the RevokeTokenPlanInviteLink operation to invalidate the current link first.
     * This operation returns only the generated token. The invitation link is assembled in the following format: <code>https://{host}/accept-invite?token=[token]&amp;orgId=[orgId]</code></p>
     * <ul>
     * <li>For the China site, the host is tokenplan-enterprise.bailian.aliyunportal.com.</li>
     * <li>For the China site, the host is tokenplan-enterprise.modelstudio.aliyunportal.com.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a TokenPlan member invitation link.</p>
     * 
     * @param request CreateTokenPlanInviteLinkRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTokenPlanInviteLinkResponse
     */
    public CreateTokenPlanInviteLinkResponse createTokenPlanInviteLinkWithOptions(CreateTokenPlanInviteLinkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expireType)) {
            query.put("ExpireType", request.expireType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ssoSource)) {
            query.put("SsoSource", request.ssoSource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTokenPlanInviteLink"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tokenplan/invite/link/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTokenPlanInviteLinkResponse());
    }

    /**
     * <b>description</b> :
     * <p>A user can have only one valid invitation link at a time.
     * If the user already has a valid invitation link, this operation returns the existing link.
     * To create a new link, call the RevokeTokenPlanInviteLink operation to invalidate the current link first.
     * This operation returns only the generated token. The invitation link is assembled in the following format: <code>https://{host}/accept-invite?token=[token]&amp;orgId=[orgId]</code></p>
     * <ul>
     * <li>For the China site, the host is tokenplan-enterprise.bailian.aliyunportal.com.</li>
     * <li>For the China site, the host is tokenplan-enterprise.modelstudio.aliyunportal.com.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a TokenPlan member invitation link.</p>
     * 
     * @param request CreateTokenPlanInviteLinkRequest
     * @return CreateTokenPlanInviteLinkResponse
     */
    public CreateTokenPlanInviteLinkResponse createTokenPlanInviteLink(CreateTokenPlanInviteLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTokenPlanInviteLinkWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a UAC API key.</p>
     * 
     * @param request CreateTokenPlanKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTokenPlanKeyResponse
     */
    public CreateTokenPlanKeyResponse createTokenPlanKeyWithOptions(CreateTokenPlanKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTokenPlanKey"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tokenplan/api-keys"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTokenPlanKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a UAC API key.</p>
     * 
     * @param request CreateTokenPlanKeyRequest
     * @return CreateTokenPlanKeyResponse
     */
    public CreateTokenPlanKeyResponse createTokenPlanKey(CreateTokenPlanKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTokenPlanKeyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a business workspace.</p>
     * 
     * @param request CreateWorkspaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkspaceResponse
     */
    public CreateWorkspaceResponse createWorkspaceWithOptions(CreateWorkspaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceSite)) {
            query.put("serviceSite", request.serviceSite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceName)) {
            query.put("workspaceName", request.workspaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkspace"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modelstudio/workspaces"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a business workspace.</p>
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
     * <p>Deletes an authentication credential API key.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApiKeyResponse
     */
    public DeleteApiKeyResponse deleteApiKeyWithOptions(String apiKeyId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApiKey"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modelstudio/apikeys/" + com.aliyun.openapiutil.Client.getEncodeParam(apiKeyId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApiKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an authentication credential API key.</p>
     * @return DeleteApiKeyResponse
     */
    public DeleteApiKeyResponse deleteApiKey(String apiKeyId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteApiKeyWithOptions(apiKeyId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A workspace can be deleted only if the following conditional requirements are met:</p>
     * <ol>
     * <li>The workspace is not the default workspace.</li>
     * <li>The workspace is not used to purchase other products, such as AMB.</li>
     * <li>In permission management, the workspace is not granted to Resource Access Management (RAM) users or RAM roles.</li>
     * <li>The workspace does not contain any resources, such as API keys, model deployments, or knowledge bases.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Deletes a workspace.</p>
     * 
     * @param request DeleteWorkspaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWorkspaceResponse
     */
    public DeleteWorkspaceResponse deleteWorkspaceWithOptions(String workspaceId, DeleteWorkspaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkspace"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modelstudio/workspaces/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkspaceResponse());
    }

    /**
     * <b>description</b> :
     * <p>A workspace can be deleted only if the following conditional requirements are met:</p>
     * <ol>
     * <li>The workspace is not the default workspace.</li>
     * <li>The workspace is not used to purchase other products, such as AMB.</li>
     * <li>In permission management, the workspace is not granted to Resource Access Management (RAM) users or RAM roles.</li>
     * <li>The workspace does not contain any resources, such as API keys, model deployments, or knowledge bases.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Deletes a workspace.</p>
     * 
     * @param request DeleteWorkspaceRequest
     * @return DeleteWorkspaceResponse
     */
    public DeleteWorkspaceResponse deleteWorkspace(String workspaceId, DeleteWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteWorkspaceWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>An API key cannot be disabled if it is already disabled.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables an API key.</p>
     * 
     * @param request DisableApiKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableApiKeyResponse
     */
    public DisableApiKeyResponse disableApiKeyWithOptions(String apiKeyId, DisableApiKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableApiKey"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modelstudio/apikeys/" + com.aliyun.openapiutil.Client.getEncodeParam(apiKeyId) + "/disable"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableApiKeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>An API key cannot be disabled if it is already disabled.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables an API key.</p>
     * 
     * @param request DisableApiKeyRequest
     * @return DisableApiKeyResponse
     */
    public DisableApiKeyResponse disableApiKey(String apiKeyId, DisableApiKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableApiKeyWithOptions(apiKeyId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>An API key that is already enabled cannot be enabled again.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables an API key.</p>
     * 
     * @param request EnableApiKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableApiKeyResponse
     */
    public EnableApiKeyResponse enableApiKeyWithOptions(String apiKeyId, EnableApiKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableApiKey"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modelstudio/apikeys/" + com.aliyun.openapiutil.Client.getEncodeParam(apiKeyId) + "/enable"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableApiKeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>An API key that is already enabled cannot be enabled again.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables an API key.</p>
     * 
     * @param request EnableApiKeyRequest
     * @return EnableApiKeyResponse
     */
    public EnableApiKeyResponse enableApiKey(String apiKeyId, EnableApiKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableApiKeyWithOptions(apiKeyId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the information of a specified authentication credential API key.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApiKeyResponse
     */
    public GetApiKeyResponse getApiKeyWithOptions(String apiKeyId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApiKey"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modelstudio/apikeys/" + com.aliyun.openapiutil.Client.getEncodeParam(apiKeyId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApiKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the information of a specified authentication credential API key.</p>
     * @return GetApiKeyResponse
     */
    public GetApiKeyResponse getApiKey(String apiKeyId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApiKeyWithOptions(apiKeyId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves information about a specified organization by OrgId.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves information about a specified organization.</p>
     * 
     * @param request GetOrganizationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOrganizationResponse
     */
    public GetOrganizationResponse getOrganizationWithOptions(GetOrganizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOrganization"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tokenplan/organization"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOrganizationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves information about a specified organization by OrgId.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves information about a specified organization.</p>
     * 
     * @param request GetOrganizationRequest
     * @return GetOrganizationResponse
     */
    public GetOrganizationResponse getOrganization(GetOrganizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOrganizationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries organization member statistics information, including the total number of members, the number of administrators, the number of regular members, the number of members with allocated seats, and the number of members without allocated seats.</p>
     * 
     * @param request GetOrganizationMemberSeatStatsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOrganizationMemberSeatStatsResponse
     */
    public GetOrganizationMemberSeatStatsResponse getOrganizationMemberSeatStatsWithOptions(GetOrganizationMemberSeatStatsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOrganizationMemberSeatStats"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tokenplan/organization/member-seat-stats"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOrganizationMemberSeatStatsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries organization member statistics information, including the total number of members, the number of administrators, the number of regular members, the number of members with allocated seats, and the number of members without allocated seats.</p>
     * 
     * @param request GetOrganizationMemberSeatStatsRequest
     * @return GetOrganizationMemberSeatStatsResponse
     */
    public GetOrganizationMemberSeatStatsResponse getOrganizationMemberSeatStats(GetOrganizationMemberSeatStatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOrganizationMemberSeatStatsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries seat details by paging.</p>
     * 
     * @param request GetSubscriptionSeatDetailsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSubscriptionSeatDetailsResponse
     */
    public GetSubscriptionSeatDetailsResponse getSubscriptionSeatDetailsWithOptions(GetSubscriptionSeatDetailsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryAssigned)) {
            query.put("QueryAssigned", request.queryAssigned);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seatId)) {
            query.put("SeatId", request.seatId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seatType)) {
            query.put("SeatType", request.seatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusList)) {
            query.put("StatusList", request.statusList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSubscriptionSeatDetails"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tokenplan/subscription/seat-detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSubscriptionSeatDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries seat details by paging.</p>
     * 
     * @param request GetSubscriptionSeatDetailsRequest
     * @return GetSubscriptionSeatDetailsResponse
     */
    public GetSubscriptionSeatDetailsResponse getSubscriptionSeatDetails(GetSubscriptionSeatDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSubscriptionSeatDetailsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of members and seats for member management.</p>
     * 
     * @param request GetSubscriptionStatsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSubscriptionStatsResponse
     */
    public GetSubscriptionStatsResponse getSubscriptionStatsWithOptions(GetSubscriptionStatsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSubscriptionStats"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tokenplan/subscription/stats"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSubscriptionStatsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of members and seats for member management.</p>
     * 
     * @param request GetSubscriptionStatsRequest
     * @return GetSubscriptionStatsResponse
     */
    public GetSubscriptionStatsResponse getSubscriptionStats(GetSubscriptionStatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSubscriptionStatsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the TokenPlan management platform account information when the user is logged in.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the TokenPlan account details and organization information.</p>
     * 
     * @param request GetTokenPlanAccountDetailRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTokenPlanAccountDetailResponse
     */
    public GetTokenPlanAccountDetailResponse getTokenPlanAccountDetailWithOptions(GetTokenPlanAccountDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTokenPlanAccountDetail"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tokenplan/account"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTokenPlanAccountDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the TokenPlan management platform account information when the user is logged in.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the TokenPlan account details and organization information.</p>
     * 
     * @param request GetTokenPlanAccountDetailRequest
     * @return GetTokenPlanAccountDetailResponse
     */
    public GetTokenPlanAccountDetailResponse getTokenPlanAccountDetail(GetTokenPlanAccountDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTokenPlanAccountDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation returns only the generated token and expiration time. The invitation link is assembled in the following format: <code>https://{host}/accept-invite?token=[token]&amp;orgId=[orgId]</code></p>
     * <ul>
     * <li>For the China site, the host is tokenplan-enterprise.bailian.aliyunportal.com.</li>
     * <li>For the international site, the host is tokenplan-enterprise.modelstudio.aliyunportal.com.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the TokenPlan member invitation link.</p>
     * 
     * @param request GetTokenPlanInviteLinkRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTokenPlanInviteLinkResponse
     */
    public GetTokenPlanInviteLinkResponse getTokenPlanInviteLinkWithOptions(GetTokenPlanInviteLinkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTokenPlanInviteLink"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tokenplan/invite/link/get"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTokenPlanInviteLinkResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation returns only the generated token and expiration time. The invitation link is assembled in the following format: <code>https://{host}/accept-invite?token=[token]&amp;orgId=[orgId]</code></p>
     * <ul>
     * <li>For the China site, the host is tokenplan-enterprise.bailian.aliyunportal.com.</li>
     * <li>For the international site, the host is tokenplan-enterprise.modelstudio.aliyunportal.com.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the TokenPlan member invitation link.</p>
     * 
     * @param request GetTokenPlanInviteLinkRequest
     * @return GetTokenPlanInviteLinkResponse
     */
    public GetTokenPlanInviteLinkResponse getTokenPlanInviteLink(GetTokenPlanInviteLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTokenPlanInviteLinkWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the TokenPlan member invitation configuration.</p>
     * 
     * @param request GetTokenPlanOrgInviteConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTokenPlanOrgInviteConfigResponse
     */
    public GetTokenPlanOrgInviteConfigResponse getTokenPlanOrgInviteConfigWithOptions(GetTokenPlanOrgInviteConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTokenPlanOrgInviteConfig"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tokenplan/invite/config/get"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTokenPlanOrgInviteConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the TokenPlan member invitation configuration.</p>
     * 
     * @param request GetTokenPlanOrgInviteConfigRequest
     * @return GetTokenPlanOrgInviteConfigResponse
     */
    public GetTokenPlanOrgInviteConfigResponse getTokenPlanOrgInviteConfig(GetTokenPlanOrgInviteConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTokenPlanOrgInviteConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of API key authentication credentials.</p>
     * 
     * @param request ListApiKeysRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApiKeysResponse
     */
    public ListApiKeysResponse listApiKeysWithOptions(ListApiKeysRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKeyId)) {
            query.put("apiKeyId", request.apiKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApiKeys"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modelstudio/apikeys"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApiKeysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of API key authentication credentials.</p>
     * 
     * @param request ListApiKeysRequest
     * @return ListApiKeysResponse
     */
    public ListApiKeysResponse listApiKeys(ListApiKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApiKeysWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of organization members including seat information. Supports filtering by name, status, and seat assignment, and supports pagination.</p>
     * 
     * @param request ListOrganizationMembersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOrganizationMembersResponse
     */
    public ListOrganizationMembersResponse listOrganizationMembersWithOptions(ListOrganizationMembersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hasSeat)) {
            query.put("HasSeat", request.hasSeat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOrganizationMembers"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tokenplan/organization/members"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOrganizationMembersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of organization members including seat information. Supports filtering by name, status, and seat assignment, and supports pagination.</p>
     * 
     * @param request ListOrganizationMembersRequest
     * @return ListOrganizationMembersResponse
     */
    public ListOrganizationMembersResponse listOrganizationMembers(ListOrganizationMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOrganizationMembersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of shared packages by paging.</p>
     * 
     * @param request ListSubscriptionSharedPackagesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSubscriptionSharedPackagesResponse
     */
    public ListSubscriptionSharedPackagesResponse listSubscriptionSharedPackagesWithOptions(ListSubscriptionSharedPackagesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusList)) {
            query.put("StatusList", request.statusList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSubscriptionSharedPackages"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tokenplan/subscription/shared-packages"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubscriptionSharedPackagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of shared packages by paging.</p>
     * 
     * @param request ListSubscriptionSharedPackagesRequest
     * @return ListSubscriptionSharedPackagesResponse
     */
    public ListSubscriptionSharedPackagesResponse listSubscriptionSharedPackages(ListSubscriptionSharedPackagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSubscriptionSharedPackagesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of business workspaces.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceName)) {
            query.put("workspaceName", request.workspaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkspaces"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modelstudio/workspaces"),
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
     * <p>Retrieves the list of business workspaces.</p>
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
     * <p>Removes organization members. Before removal, checks whether the member holds a seat. If the member holds a seat, the removal is rejected.</p>
     * 
     * @param request RemoveOrganizationMemberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveOrganizationMemberResponse
     */
    public RemoveOrganizationMemberResponse removeOrganizationMemberWithOptions(RemoveOrganizationMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountIds)) {
            query.put("AccountIds", request.accountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locale)) {
            query.put("Locale", request.locale);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveOrganizationMember"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tokenplan/organization/member-removals"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveOrganizationMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes organization members. Before removal, checks whether the member holds a seat. If the member holds a seat, the removal is rejected.</p>
     * 
     * @param request RemoveOrganizationMemberRequest
     * @return RemoveOrganizationMemberResponse
     */
    public RemoveOrganizationMemberResponse removeOrganizationMember(RemoveOrganizationMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeOrganizationMemberWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only the API key value changes. The API key ID remains unchanged.</p>
     * 
     * <b>summary</b> : 
     * <p>Resets an API key.</p>
     * 
     * @param request ResetApiKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetApiKeyResponse
     */
    public ResetApiKeyResponse resetApiKeyWithOptions(String apiKeyId, ResetApiKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetApiKey"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modelstudio/apikeys/" + com.aliyun.openapiutil.Client.getEncodeParam(apiKeyId) + "/reset"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetApiKeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only the API key value changes. The API key ID remains unchanged.</p>
     * 
     * <b>summary</b> : 
     * <p>Resets an API key.</p>
     * 
     * @param request ResetApiKeyRequest
     * @return ResetApiKeyResponse
     */
    public ResetApiKeyResponse resetApiKey(String apiKeyId, ResetApiKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetApiKeyWithOptions(apiKeyId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes a TokenPlan member invitation link.</p>
     * 
     * @param request RevokeTokenPlanInviteLinkRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeTokenPlanInviteLinkResponse
     */
    public RevokeTokenPlanInviteLinkResponse revokeTokenPlanInviteLinkWithOptions(RevokeTokenPlanInviteLinkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeTokenPlanInviteLink"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tokenplan/invite/link/revoke"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeTokenPlanInviteLinkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes a TokenPlan member invitation link.</p>
     * 
     * @param request RevokeTokenPlanInviteLinkRequest
     * @return RevokeTokenPlanInviteLinkResponse
     */
    public RevokeTokenPlanInviteLinkResponse revokeTokenPlanInviteLink(RevokeTokenPlanInviteLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.revokeTokenPlanInviteLinkWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only the API Key value changes. The API Key ID remains unchanged.</p>
     * 
     * <b>summary</b> : 
     * <p>Resets a UAC API key.</p>
     * 
     * @param request RotateTokenPlanKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RotateTokenPlanKeyResponse
     */
    public RotateTokenPlanKeyResponse rotateTokenPlanKeyWithOptions(RotateTokenPlanKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKeyId)) {
            query.put("ApiKeyId", request.apiKeyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RotateTokenPlanKey"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tokenplan/api-key-rotations"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RotateTokenPlanKeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only the API Key value changes. The API Key ID remains unchanged.</p>
     * 
     * <b>summary</b> : 
     * <p>Resets a UAC API key.</p>
     * 
     * @param request RotateTokenPlanKeyRequest
     * @return RotateTokenPlanKeyResponse
     */
    public RotateTokenPlanKeyResponse rotateTokenPlanKey(RotateTokenPlanKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rotateTokenPlanKeyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the member invitation settings for a TokenPlan.</p>
     * 
     * @param request SetTokenPlanOrgInviteConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetTokenPlanOrgInviteConfigResponse
     */
    public SetTokenPlanOrgInviteConfigResponse setTokenPlanOrgInviteConfigWithOptions(SetTokenPlanOrgInviteConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defaultRoleId)) {
            query.put("DefaultRoleId", request.defaultRoleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seatAssignStrategy)) {
            query.put("SeatAssignStrategy", request.seatAssignStrategy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetTokenPlanOrgInviteConfig"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tokenplan/invite/config/set"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetTokenPlanOrgInviteConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the member invitation settings for a TokenPlan.</p>
     * 
     * @param request SetTokenPlanOrgInviteConfigRequest
     * @return SetTokenPlanOrgInviteConfigResponse
     */
    public SetTokenPlanOrgInviteConfigResponse setTokenPlanOrgInviteConfig(SetTokenPlanOrgInviteConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setTokenPlanOrgInviteConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Edits the information of an authentication credential API key.</p>
     * 
     * @param request UpdateApiKeyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApiKeyResponse
     */
    public UpdateApiKeyResponse updateApiKeyWithOptions(String apiKeyId, UpdateApiKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auth)) {
            body.put("auth", request.auth);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApiKey"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/modelstudio/apikeys/" + com.aliyun.openapiutil.Client.getEncodeParam(apiKeyId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApiKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Edits the information of an authentication credential API key.</p>
     * 
     * @param request UpdateApiKeyRequest
     * @return UpdateApiKeyResponse
     */
    public UpdateApiKeyResponse updateApiKey(String apiKeyId, UpdateApiKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApiKeyWithOptions(apiKeyId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies organization information.</p>
     * 
     * @param request UpdateOrganizationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOrganizationResponse
     */
    public UpdateOrganizationResponse updateOrganizationWithOptions(UpdateOrganizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOrganization"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tokenplan/organization"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOrganizationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies organization information.</p>
     * 
     * @param request UpdateOrganizationRequest
     * @return UpdateOrganizationResponse
     */
    public UpdateOrganizationResponse updateOrganization(UpdateOrganizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateOrganizationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改组织成员角色</p>
     * 
     * @param request UpdateOrganizationMemberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOrganizationMemberResponse
     */
    public UpdateOrganizationMemberResponse updateOrganizationMemberWithOptions(UpdateOrganizationMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountIds)) {
            query.put("AccountIds", request.accountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newRoleCode)) {
            query.put("NewRoleCode", request.newRoleCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOrganizationMember"),
            new TeaPair("version", "2026-02-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tokenplan/organization/members/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOrganizationMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改组织成员角色</p>
     * 
     * @param request UpdateOrganizationMemberRequest
     * @return UpdateOrganizationMemberResponse
     */
    public UpdateOrganizationMemberResponse updateOrganizationMember(UpdateOrganizationMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateOrganizationMemberWithOptions(request, headers, runtime);
    }
}
