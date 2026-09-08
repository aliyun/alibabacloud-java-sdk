// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602;

import com.aliyun.tea.*;
import com.aliyun.ecd20210602.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ecd", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Creates a tenant skill.</p>
     * 
     * @param tmpReq CreateTenantSkillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTenantSkillResponse
     */
    public CreateTenantSkillResponse createTenantSkillWithOptions(CreateTenantSkillRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTenantSkillShrinkRequest request = new CreateTenantSkillShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.envVars)) {
            request.envVarsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.envVars, "EnvVars", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            query.put("ApiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envVarsShrink)) {
            query.put("EnvVars", request.envVarsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iconETag)) {
            query.put("IconETag", request.iconETag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillChannel)) {
            query.put("SkillChannel", request.skillChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillIcon)) {
            query.put("SkillIcon", request.skillIcon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillVersion)) {
            query.put("SkillVersion", request.skillVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slug)) {
            query.put("Slug", request.slug);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskKey)) {
            query.put("TaskKey", request.taskKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTenantSkill"),
            new TeaPair("version", "2021-06-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTenantSkillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a tenant skill.</p>
     * 
     * @param request CreateTenantSkillRequest
     * @return CreateTenantSkillResponse
     */
    public CreateTenantSkillResponse createTenantSkill(CreateTenantSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTenantSkillWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes skills in batches.</p>
     * 
     * @param request DeleteTenantSkillsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTenantSkillsResponse
     */
    public DeleteTenantSkillsResponse deleteTenantSkillsWithOptions(DeleteTenantSkillsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.skillChannel)) {
            query.put("SkillChannel", request.skillChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillIds)) {
            query.put("SkillIds", request.skillIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTenantSkills"),
            new TeaPair("version", "2021-06-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTenantSkillsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes skills in batches.</p>
     * 
     * @param request DeleteTenantSkillsRequest
     * @return DeleteTenantSkillsResponse
     */
    public DeleteTenantSkillsResponse deleteTenantSkills(DeleteTenantSkillsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTenantSkillsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The obtained SecurityToken is valid for 15 minutes.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a temporary OSS token for authentication.</p>
     * 
     * @param request GetOssStsTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOssStsTokenResponse
     */
    public GetOssStsTokenResponse getOssStsTokenWithOptions(GetOssStsTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("FileType", request.fileType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOssStsToken"),
            new TeaPair("version", "2021-06-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOssStsTokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>The obtained SecurityToken is valid for 15 minutes.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a temporary OSS token for authentication.</p>
     * 
     * @param request GetOssStsTokenRequest
     * @return GetOssStsTokenResponse
     */
    public GetOssStsTokenResponse getOssStsToken(GetOssStsTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOssStsTokenWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Call the ParseSkillPackage operation first. Poll this operation every 3 seconds.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the parsed content of a skill package.</p>
     * 
     * @param request GetParseProgressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetParseProgressResponse
     */
    public GetParseProgressResponse getParseProgressWithOptions(GetParseProgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskKey)) {
            query.put("TaskKey", request.taskKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetParseProgress"),
            new TeaPair("version", "2021-06-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetParseProgressResponse());
    }

    /**
     * <b>description</b> :
     * <p>Call the ParseSkillPackage operation first. Poll this operation every 3 seconds.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the parsed content of a skill package.</p>
     * 
     * @param request GetParseProgressRequest
     * @return GetParseProgressResponse
     */
    public GetParseProgressResponse getParseProgress(GetParseProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getParseProgressWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The resource type supports only cloud computers.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of identities for which security policies are enabled.</p>
     * 
     * @param request ListSecureSkillIdentitiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSecureSkillIdentitiesResponse
     */
    public ListSecureSkillIdentitiesResponse listSecureSkillIdentitiesWithOptions(ListSecureSkillIdentitiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillChannel)) {
            query.put("SkillChannel", request.skillChannel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSecureSkillIdentities"),
            new TeaPair("version", "2021-06-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSecureSkillIdentitiesResponse());
    }

    /**
     * <b>description</b> :
     * <p>The resource type supports only cloud computers.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of identities for which security policies are enabled.</p>
     * 
     * @param request ListSecureSkillIdentitiesRequest
     * @return ListSecureSkillIdentitiesResponse
     */
    public ListSecureSkillIdentitiesResponse listSecureSkillIdentities(ListSecureSkillIdentitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSecureSkillIdentitiesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Authorized objects support only cloud computers.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of identities authorized for a skill.</p>
     * 
     * @param request ListSkillAuthedIdentitiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSkillAuthedIdentitiesResponse
     */
    public ListSkillAuthedIdentitiesResponse listSkillAuthedIdentitiesWithOptions(ListSkillAuthedIdentitiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillChannel)) {
            query.put("SkillChannel", request.skillChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillId)) {
            query.put("SkillId", request.skillId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSkillAuthedIdentities"),
            new TeaPair("version", "2021-06-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSkillAuthedIdentitiesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Authorized objects support only cloud computers.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of identities authorized for a skill.</p>
     * 
     * @param request ListSkillAuthedIdentitiesRequest
     * @return ListSkillAuthedIdentitiesResponse
     */
    public ListSkillAuthedIdentitiesResponse listSkillAuthedIdentities(ListSkillAuthedIdentitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSkillAuthedIdentitiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of skills.</p>
     * 
     * @param request ListSkillsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSkillsResponse
     */
    public ListSkillsResponse listSkillsWithOptions(ListSkillsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillChannel)) {
            query.put("SkillChannel", request.skillChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillIds)) {
            query.put("SkillIds", request.skillIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierType)) {
            query.put("SupplierType", request.supplierType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagCodes)) {
            query.put("TagCodes", request.tagCodes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSkills"),
            new TeaPair("version", "2021-06-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSkillsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of skills.</p>
     * 
     * @param request ListSkillsRequest
     * @return ListSkillsResponse
     */
    public ListSkillsResponse listSkills(ListSkillsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSkillsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The query scope is determined by the caller identity and includes applications uploaded by the current tenant and marketplace applications that the tenant is authorized to view. The visibility of marketplace applications is subject to authorization and display policy restrictions. The authorization and auto-installation information in the list represents application configurations and does not indicate the actual installation result on a specific device.</p>
     * <ul>
     * <li><strong>Application identity</strong>: Id is a numeric application ID, and AppUid is a character string UID. The two cannot be used interchangeably.</li>
     * <li><strong>Authorization scope</strong>: DistributeType is used together with AuthType. For example, <code>AuthType=auth_type_user</code> and <code>DistributeType=ALL</code> indicate that the application is allocated to all users on a per-user dimension.</li>
     * <li><strong>Auto-installation</strong>: AutoInstallmentType specifies the auto-installation scope policy, which is used to distinguish between full, partial, or disabled auto-installation.</li>
     * <li><strong>Partial auto-installation</strong>: When AutoInstallmentType is set to 1, use SetAutoInstallUser or SetAutoInstallDesktop to configure specific users or cloud desktops. OperationType=1 indicates enabled, and OperationType=2 indicates disabled. ListTenantApp only returns configurations and does not modify auto-installation settings.</li>
     * <li><strong>Capabilities and execution results</strong>: The silent installation capability is application metadata returned in the response. To determine the actual installation or execution result on a device, use the corresponding execution result query capability.</li>
     * <li><strong>Optional information</strong>: Information such as timestamps may be empty.</li>
     * <li><strong>Compatibility handling</strong>: Extension information and subtype do not use closed enumerations. Clients should ignore unrecognized extension fields and be compatible with new enumeration values.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query of desktop applications visible to the current tenant, with support for filtering by application name and source.</p>
     * 
     * @param request ListTenantAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTenantAppResponse
     */
    public ListTenantAppResponse listTenantAppWithOptions(ListTenantAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyName)) {
            query.put("KeyName", request.keyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTenantApp"),
            new TeaPair("version", "2021-06-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTenantAppResponse());
    }

    /**
     * <b>description</b> :
     * <p>The query scope is determined by the caller identity and includes applications uploaded by the current tenant and marketplace applications that the tenant is authorized to view. The visibility of marketplace applications is subject to authorization and display policy restrictions. The authorization and auto-installation information in the list represents application configurations and does not indicate the actual installation result on a specific device.</p>
     * <ul>
     * <li><strong>Application identity</strong>: Id is a numeric application ID, and AppUid is a character string UID. The two cannot be used interchangeably.</li>
     * <li><strong>Authorization scope</strong>: DistributeType is used together with AuthType. For example, <code>AuthType=auth_type_user</code> and <code>DistributeType=ALL</code> indicate that the application is allocated to all users on a per-user dimension.</li>
     * <li><strong>Auto-installation</strong>: AutoInstallmentType specifies the auto-installation scope policy, which is used to distinguish between full, partial, or disabled auto-installation.</li>
     * <li><strong>Partial auto-installation</strong>: When AutoInstallmentType is set to 1, use SetAutoInstallUser or SetAutoInstallDesktop to configure specific users or cloud desktops. OperationType=1 indicates enabled, and OperationType=2 indicates disabled. ListTenantApp only returns configurations and does not modify auto-installation settings.</li>
     * <li><strong>Capabilities and execution results</strong>: The silent installation capability is application metadata returned in the response. To determine the actual installation or execution result on a device, use the corresponding execution result query capability.</li>
     * <li><strong>Optional information</strong>: Information such as timestamps may be empty.</li>
     * <li><strong>Compatibility handling</strong>: Extension information and subtype do not use closed enumerations. Clients should ignore unrecognized extension fields and be compatible with new enumeration values.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Performs a paging query of desktop applications visible to the current tenant, with support for filtering by application name and source.</p>
     * 
     * @param request ListTenantAppRequest
     * @return ListTenantAppResponse
     */
    public ListTenantAppResponse listTenantApp(ListTenantAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTenantAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Parses a skill package.</p>
     * 
     * @param request ParseSkillPackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ParseSkillPackageResponse
     */
    public ParseSkillPackageResponse parseSkillPackageWithOptions(ParseSkillPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ossObjectETag)) {
            query.put("OssObjectETag", request.ossObjectETag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossObjectKey)) {
            query.put("OssObjectKey", request.ossObjectKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ParseSkillPackage"),
            new TeaPair("version", "2021-06-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ParseSkillPackageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Parses a skill package.</p>
     * 
     * @param request ParseSkillPackageRequest
     * @return ParseSkillPackageResponse
     */
    public ParseSkillPackageResponse parseSkillPackage(ParseSkillPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.parseSkillPackageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The authorized object supports only cloud computers.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets skill permissions for an identity.</p>
     * 
     * @param request SetIdentitySkillAuthRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetIdentitySkillAuthResponse
     */
    public SetIdentitySkillAuthResponse setIdentitySkillAuthWithOptions(SetIdentitySkillAuthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoInstall)) {
            query.put("AutoInstall", request.autoInstall);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identities)) {
            query.put("Identities", request.identities);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            query.put("OperationType", request.operationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillChannel)) {
            query.put("SkillChannel", request.skillChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillIds)) {
            query.put("SkillIds", request.skillIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetIdentitySkillAuth"),
            new TeaPair("version", "2021-06-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetIdentitySkillAuthResponse());
    }

    /**
     * <b>description</b> :
     * <p>The authorized object supports only cloud computers.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets skill permissions for an identity.</p>
     * 
     * @param request SetIdentitySkillAuthRequest
     * @return SetIdentitySkillAuthResponse
     */
    public SetIdentitySkillAuthResponse setIdentitySkillAuth(SetIdentitySkillAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setIdentitySkillAuthWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The resource type supports only cloud computers.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the security policy for identity skills.</p>
     * 
     * @param request SetIdentitySkillSecurityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetIdentitySkillSecurityResponse
     */
    public SetIdentitySkillSecurityResponse setIdentitySkillSecurityWithOptions(SetIdentitySkillSecurityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityIds)) {
            query.put("IdentityIds", request.identityIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillChannel)) {
            query.put("SkillChannel", request.skillChannel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetIdentitySkillSecurity"),
            new TeaPair("version", "2021-06-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetIdentitySkillSecurityResponse());
    }

    /**
     * <b>description</b> :
     * <p>The resource type supports only cloud computers.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the security policy for identity skills.</p>
     * 
     * @param request SetIdentitySkillSecurityRequest
     * @return SetIdentitySkillSecurityResponse
     */
    public SetIdentitySkillSecurityResponse setIdentitySkillSecurity(SetIdentitySkillSecurityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setIdentitySkillSecurityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the enabling status of skills at the tenant level.</p>
     * 
     * @param request SetTenantSkillEnabledRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetTenantSkillEnabledResponse
     */
    public SetTenantSkillEnabledResponse setTenantSkillEnabledWithOptions(SetTenantSkillEnabledRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillChannel)) {
            query.put("SkillChannel", request.skillChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillIds)) {
            query.put("SkillIds", request.skillIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetTenantSkillEnabled"),
            new TeaPair("version", "2021-06-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetTenantSkillEnabledResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the enabling status of skills at the tenant level.</p>
     * 
     * @param request SetTenantSkillEnabledRequest
     * @return SetTenantSkillEnabledResponse
     */
    public SetTenantSkillEnabledResponse setTenantSkillEnabled(SetTenantSkillEnabledRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setTenantSkillEnabledWithOptions(request, runtime);
    }
}
