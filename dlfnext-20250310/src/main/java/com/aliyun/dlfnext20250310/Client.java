// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310;

import com.aliyun.tea.*;
import com.aliyun.dlfnext20250310.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dlfnext", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>更新数据目录</p>
     * 
     * @param request AlterCatalogRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AlterCatalogResponse
     */
    public AlterCatalogResponse alterCatalogWithOptions(String catalog, AlterCatalogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.removals)) {
            body.put("removals", request.removals);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updates)) {
            body.put("updates", request.updates);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AlterCatalog"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/catalogs/" + com.aliyun.openapiutil.Client.getEncodeParam(catalog) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AlterCatalogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据目录</p>
     * 
     * @param request AlterCatalogRequest
     * @return AlterCatalogResponse
     */
    public AlterCatalogResponse alterCatalog(String catalog, AlterCatalogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.alterCatalogWithOptions(catalog, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据库</p>
     * 
     * @param request AlterDatabaseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AlterDatabaseResponse
     */
    public AlterDatabaseResponse alterDatabaseWithOptions(String catalogId, String database, AlterDatabaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.removals)) {
            body.put("removals", request.removals);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updates)) {
            body.put("updates", request.updates);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AlterDatabase"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/" + com.aliyun.openapiutil.Client.getEncodeParam(catalogId) + "/databases/" + com.aliyun.openapiutil.Client.getEncodeParam(database) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AlterDatabaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据库</p>
     * 
     * @param request AlterDatabaseRequest
     * @return AlterDatabaseResponse
     */
    public AlterDatabaseResponse alterDatabase(String catalogId, String database, AlterDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.alterDatabaseWithOptions(catalogId, database, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更改Table</p>
     * 
     * @param request AlterTableRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AlterTableResponse
     */
    public AlterTableResponse alterTableWithOptions(String catalogId, String database, String table, AlterTableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changes)) {
            body.put("changes", request.changes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AlterTable"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/" + com.aliyun.openapiutil.Client.getEncodeParam(catalogId) + "/databases/" + com.aliyun.openapiutil.Client.getEncodeParam(database) + "/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(table) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AlterTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更改Table</p>
     * 
     * @param request AlterTableRequest
     * @return AlterTableResponse
     */
    public AlterTableResponse alterTable(String catalogId, String database, String table, AlterTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.alterTableWithOptions(catalogId, database, table, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量授权</p>
     * 
     * @param request BatchGrantPermissionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchGrantPermissionsResponse
     */
    public BatchGrantPermissionsResponse batchGrantPermissionsWithOptions(String catalogId, BatchGrantPermissionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.permissions)) {
            body.put("permissions", request.permissions);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGrantPermissions"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/auth/permissions/" + com.aliyun.openapiutil.Client.getEncodeParam(catalogId) + "/batchgrant"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGrantPermissionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量授权</p>
     * 
     * @param request BatchGrantPermissionsRequest
     * @return BatchGrantPermissionsResponse
     */
    public BatchGrantPermissionsResponse batchGrantPermissions(String catalogId, BatchGrantPermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchGrantPermissionsWithOptions(catalogId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量取消授权</p>
     * 
     * @param request BatchRevokePermissionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchRevokePermissionsResponse
     */
    public BatchRevokePermissionsResponse batchRevokePermissionsWithOptions(String catalogId, BatchRevokePermissionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.permissions)) {
            body.put("permissions", request.permissions);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchRevokePermissions"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/auth/permissions/" + com.aliyun.openapiutil.Client.getEncodeParam(catalogId) + "/batchrevoke"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchRevokePermissionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量取消授权</p>
     * 
     * @param request BatchRevokePermissionsRequest
     * @return BatchRevokePermissionsResponse
     */
    public BatchRevokePermissionsResponse batchRevokePermissions(String catalogId, BatchRevokePermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchRevokePermissionsWithOptions(catalogId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据目录</p>
     * 
     * @param request CreateCatalogRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCatalogResponse
     */
    public CreateCatalogResponse createCatalogWithOptions(CreateCatalogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("options", request.options);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCatalog"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/catalogs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCatalogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据目录</p>
     * 
     * @param request CreateCatalogRequest
     * @return CreateCatalogResponse
     */
    public CreateCatalogResponse createCatalog(CreateCatalogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCatalogWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据库</p>
     * 
     * @param request CreateDatabaseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDatabaseResponse
     */
    public CreateDatabaseResponse createDatabaseWithOptions(String catalogId, CreateDatabaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("options", request.options);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDatabase"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/" + com.aliyun.openapiutil.Client.getEncodeParam(catalogId) + "/databases"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDatabaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据库</p>
     * 
     * @param request CreateDatabaseRequest
     * @return CreateDatabaseResponse
     */
    public CreateDatabaseResponse createDatabase(String catalogId, CreateDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDatabaseWithOptions(catalogId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建角色</p>
     * 
     * @param request CreateRoleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRoleResponse
     */
    public CreateRoleResponse createRoleWithOptions(CreateRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("roleName", request.roleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRole"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/auth/roles"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建角色</p>
     * 
     * @param request CreateRoleRequest
     * @return CreateRoleResponse
     */
    public CreateRoleResponse createRole(CreateRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRoleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建表</p>
     * 
     * @param request CreateTableRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTableResponse
     */
    public CreateTableResponse createTableWithOptions(String catalogId, String database, CreateTableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            body.put("identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schema)) {
            body.put("schema", request.schema);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTable"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/" + com.aliyun.openapiutil.Client.getEncodeParam(catalogId) + "/databases/" + com.aliyun.openapiutil.Client.getEncodeParam(database) + "/tables"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建表</p>
     * 
     * @param request CreateTableRequest
     * @return CreateTableResponse
     */
    public CreateTableResponse createTable(String catalogId, String database, CreateTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTableWithOptions(catalogId, database, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除角色</p>
     * 
     * @param request DeleteRoleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRoleResponse
     */
    public DeleteRoleResponse deleteRoleWithOptions(DeleteRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.rolePrincipal)) {
            query.put("rolePrincipal", request.rolePrincipal);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRole"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/auth/roles"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除角色</p>
     * 
     * @param request DeleteRoleRequest
     * @return DeleteRoleResponse
     */
    public DeleteRoleResponse deleteRole(DeleteRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRoleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询 DLF 开通地域</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/service/regions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询 DLF 开通地域</p>
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRegionsWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据湖Catalog</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DropCatalogResponse
     */
    public DropCatalogResponse dropCatalogWithOptions(String catalog, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DropCatalog"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/catalogs/" + com.aliyun.openapiutil.Client.getEncodeParam(catalog) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DropCatalogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据湖Catalog</p>
     * @return DropCatalogResponse
     */
    public DropCatalogResponse dropCatalog(String catalog) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.dropCatalogWithOptions(catalog, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据库</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DropDatabaseResponse
     */
    public DropDatabaseResponse dropDatabaseWithOptions(String catalogId, String database, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DropDatabase"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/" + com.aliyun.openapiutil.Client.getEncodeParam(catalogId) + "/databases/" + com.aliyun.openapiutil.Client.getEncodeParam(database) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DropDatabaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据库</p>
     * @return DropDatabaseResponse
     */
    public DropDatabaseResponse dropDatabase(String catalogId, String database) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.dropDatabaseWithOptions(catalogId, database, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DropTableResponse
     */
    public DropTableResponse dropTableWithOptions(String catalogId, String database, String table, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DropTable"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/" + com.aliyun.openapiutil.Client.getEncodeParam(catalogId) + "/databases/" + com.aliyun.openapiutil.Client.getEncodeParam(database) + "/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(table) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DropTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除表</p>
     * @return DropTableResponse
     */
    public DropTableResponse dropTable(String catalogId, String database, String table) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.dropTableWithOptions(catalogId, database, table, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看数据湖Catalog</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCatalogResponse
     */
    public GetCatalogResponse getCatalogWithOptions(String catalog, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCatalog"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/catalogs/" + com.aliyun.openapiutil.Client.getEncodeParam(catalog) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCatalogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看数据湖Catalog</p>
     * @return GetCatalogResponse
     */
    public GetCatalogResponse getCatalog(String catalog) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCatalogWithOptions(catalog, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看数据湖Catalog</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCatalogByIdResponse
     */
    public GetCatalogByIdResponse getCatalogByIdWithOptions(String id, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCatalogById"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/catalogs/id/" + com.aliyun.openapiutil.Client.getEncodeParam(id) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCatalogByIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看数据湖Catalog</p>
     * @return GetCatalogByIdResponse
     */
    public GetCatalogByIdResponse getCatalogById(String id) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCatalogByIdWithOptions(id, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCatalogSummaryResponse
     */
    public GetCatalogSummaryResponse getCatalogSummaryWithOptions(String catalogId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCatalogSummary"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/" + com.aliyun.openapiutil.Client.getEncodeParam(catalogId) + "/storage-summary"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCatalogSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看表</p>
     * @return GetCatalogSummaryResponse
     */
    public GetCatalogSummaryResponse getCatalogSummary(String catalogId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCatalogSummaryWithOptions(catalogId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看表</p>
     * 
     * @param request GetCatalogSummaryTrendRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCatalogSummaryTrendResponse
     */
    public GetCatalogSummaryTrendResponse getCatalogSummaryTrendWithOptions(String catalogId, GetCatalogSummaryTrendRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("endDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("startDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCatalogSummaryTrend"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/" + com.aliyun.openapiutil.Client.getEncodeParam(catalogId) + "/storage-summary/trend"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCatalogSummaryTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看表</p>
     * 
     * @param request GetCatalogSummaryTrendRequest
     * @return GetCatalogSummaryTrendResponse
     */
    public GetCatalogSummaryTrendResponse getCatalogSummaryTrend(String catalogId, GetCatalogSummaryTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCatalogSummaryTrendWithOptions(catalogId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据湖Catalog的临时访问凭证</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCatalogTokenResponse
     */
    public GetCatalogTokenResponse getCatalogTokenWithOptions(String catalog, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCatalogToken"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/catalogs/" + com.aliyun.openapiutil.Client.getEncodeParam(catalog) + "/token"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCatalogTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据湖Catalog的临时访问凭证</p>
     * @return GetCatalogTokenResponse
     */
    public GetCatalogTokenResponse getCatalogToken(String catalog) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCatalogTokenWithOptions(catalog, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看数据库</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDatabaseResponse
     */
    public GetDatabaseResponse getDatabaseWithOptions(String catalogId, String database, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDatabase"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/" + com.aliyun.openapiutil.Client.getEncodeParam(catalogId) + "/databases/" + com.aliyun.openapiutil.Client.getEncodeParam(database) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDatabaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看数据库</p>
     * @return GetDatabaseResponse
     */
    public GetDatabaseResponse getDatabase(String catalogId, String database) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDatabaseWithOptions(catalogId, database, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDatabaseSummaryResponse
     */
    public GetDatabaseSummaryResponse getDatabaseSummaryWithOptions(String catalogId, String database, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDatabaseSummary"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/" + com.aliyun.openapiutil.Client.getEncodeParam(catalogId) + "/databases/" + com.aliyun.openapiutil.Client.getEncodeParam(database) + "/storage-summary"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDatabaseSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看表</p>
     * @return GetDatabaseSummaryResponse
     */
    public GetDatabaseSummaryResponse getDatabaseSummary(String catalogId, String database) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDatabaseSummaryWithOptions(catalogId, database, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看iceberg数据库</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIcebergNamespaceResponse
     */
    public GetIcebergNamespaceResponse getIcebergNamespaceWithOptions(String catalogId, String namespace, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIcebergNamespace"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/iceberg/dlf/v1/" + com.aliyun.openapiutil.Client.getEncodeParam(catalogId) + "/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIcebergNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看iceberg数据库</p>
     * @return GetIcebergNamespaceResponse
     */
    public GetIcebergNamespaceResponse getIcebergNamespace(String catalogId, String namespace) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIcebergNamespaceWithOptions(catalogId, namespace, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIcebergTableResponse
     */
    public GetIcebergTableResponse getIcebergTableWithOptions(String catalogId, String namespace, String table, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIcebergTable"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/iceberg/dlf/v1/" + com.aliyun.openapiutil.Client.getEncodeParam(catalogId) + "/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(table) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIcebergTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看表</p>
     * @return GetIcebergTableResponse
     */
    public GetIcebergTableResponse getIcebergTable(String catalogId, String namespace, String table) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIcebergTableWithOptions(catalogId, namespace, table, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询 DLF 当前地域开通状态</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRegionStatusResponse
     */
    public GetRegionStatusResponse getRegionStatusWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRegionStatus"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/service/status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRegionStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询 DLF 当前地域开通状态</p>
     * @return GetRegionStatusResponse
     */
    public GetRegionStatusResponse getRegionStatus() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRegionStatusWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取角色</p>
     * 
     * @param request GetRoleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRoleResponse
     */
    public GetRoleResponse getRoleWithOptions(GetRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.rolePrincipal)) {
            query.put("rolePrincipal", request.rolePrincipal);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRole"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/auth/roles"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取角色</p>
     * 
     * @param request GetRoleRequest
     * @return GetRoleResponse
     */
    public GetRoleResponse getRole(GetRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRoleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableResponse
     */
    public GetTableResponse getTableWithOptions(String catalogId, String database, String table, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTable"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/" + com.aliyun.openapiutil.Client.getEncodeParam(catalogId) + "/databases/" + com.aliyun.openapiutil.Client.getEncodeParam(database) + "/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(table) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看表</p>
     * @return GetTableResponse
     */
    public GetTableResponse getTable(String catalogId, String database, String table) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTableWithOptions(catalogId, database, table, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableSummaryResponse
     */
    public GetTableSummaryResponse getTableSummaryWithOptions(String catalogId, String database, String table, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableSummary"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/" + com.aliyun.openapiutil.Client.getEncodeParam(catalogId) + "/databases/" + com.aliyun.openapiutil.Client.getEncodeParam(database) + "/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(table) + "/storage-summary"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看表</p>
     * @return GetTableSummaryResponse
     */
    public GetTableSummaryResponse getTableSummary(String catalogId, String database, String table) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTableSummaryWithOptions(catalogId, database, table, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户</p>
     * 
     * @param request GetUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserResponse
     */
    public GetUserResponse getUserWithOptions(GetUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipal)) {
            query.put("userPrincipal", request.userPrincipal);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUser"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/auth/users"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户</p>
     * 
     * @param request GetUserRequest
     * @return GetUserResponse
     */
    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量授予角色权限给用户</p>
     * 
     * @param request GrantRoleToUsersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantRoleToUsersResponse
     */
    public GrantRoleToUsersResponse grantRoleToUsersWithOptions(GrantRoleToUsersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.rolePrincipal)) {
            body.put("rolePrincipal", request.rolePrincipal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipals)) {
            body.put("userPrincipals", request.userPrincipals);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantRoleToUsers"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/auth/roles/grant"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantRoleToUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量授予角色权限给用户</p>
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
     * <p>查看数据目录列表</p>
     * 
     * @param request ListCatalogsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCatalogsResponse
     */
    public ListCatalogsResponse listCatalogsWithOptions(ListCatalogsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogNamePattern)) {
            query.put("catalogNamePattern", request.catalogNamePattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageToken)) {
            query.put("pageToken", request.pageToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCatalogs"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/catalogs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCatalogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看数据目录列表</p>
     * 
     * @param request ListCatalogsRequest
     * @return ListCatalogsResponse
     */
    public ListCatalogsResponse listCatalogs(ListCatalogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCatalogsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看数据库列表</p>
     * 
     * @param request ListDatabaseDetailsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDatabaseDetailsResponse
     */
    public ListDatabaseDetailsResponse listDatabaseDetailsWithOptions(String catalogId, ListDatabaseDetailsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseNamePattern)) {
            query.put("databaseNamePattern", request.databaseNamePattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageToken)) {
            query.put("pageToken", request.pageToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDatabaseDetails"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/" + com.aliyun.openapiutil.Client.getEncodeParam(catalogId) + "/database-details"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatabaseDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看数据库列表</p>
     * 
     * @param request ListDatabaseDetailsRequest
     * @return ListDatabaseDetailsResponse
     */
    public ListDatabaseDetailsResponse listDatabaseDetails(String catalogId, ListDatabaseDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDatabaseDetailsWithOptions(catalogId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看数据库列表</p>
     * 
     * @param request ListDatabasesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDatabasesResponse
     */
    public ListDatabasesResponse listDatabasesWithOptions(String catalogId, ListDatabasesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseNamePattern)) {
            query.put("databaseNamePattern", request.databaseNamePattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageToken)) {
            query.put("pageToken", request.pageToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDatabases"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/" + com.aliyun.openapiutil.Client.getEncodeParam(catalogId) + "/databases"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatabasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看数据库列表</p>
     * 
     * @param request ListDatabasesRequest
     * @return ListDatabasesResponse
     */
    public ListDatabasesResponse listDatabases(String catalogId, ListDatabasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDatabasesWithOptions(catalogId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看iceberg数据库列表</p>
     * 
     * @param request ListIcebergNamespaceDetailsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIcebergNamespaceDetailsResponse
     */
    public ListIcebergNamespaceDetailsResponse listIcebergNamespaceDetailsWithOptions(String catalogId, ListIcebergNamespaceDetailsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceNamePattern)) {
            query.put("namespaceNamePattern", request.namespaceNamePattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageToken)) {
            query.put("pageToken", request.pageToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIcebergNamespaceDetails"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/iceberg/dlf/v1/" + com.aliyun.openapiutil.Client.getEncodeParam(catalogId) + "/namespace-details"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIcebergNamespaceDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看iceberg数据库列表</p>
     * 
     * @param request ListIcebergNamespaceDetailsRequest
     * @return ListIcebergNamespaceDetailsResponse
     */
    public ListIcebergNamespaceDetailsResponse listIcebergNamespaceDetails(String catalogId, ListIcebergNamespaceDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIcebergNamespaceDetailsWithOptions(catalogId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看iceberg表快照列表</p>
     * 
     * @param request ListIcebergSnapshotsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIcebergSnapshotsResponse
     */
    public ListIcebergSnapshotsResponse listIcebergSnapshotsWithOptions(String catalogId, String namespace, String table, ListIcebergSnapshotsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageToken)) {
            query.put("pageToken", request.pageToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIcebergSnapshots"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/iceberg/dlf/v1/" + com.aliyun.openapiutil.Client.getEncodeParam(catalogId) + "/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(table) + "/snapshots"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIcebergSnapshotsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看iceberg表快照列表</p>
     * 
     * @param request ListIcebergSnapshotsRequest
     * @return ListIcebergSnapshotsResponse
     */
    public ListIcebergSnapshotsResponse listIcebergSnapshots(String catalogId, String namespace, String table, ListIcebergSnapshotsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIcebergSnapshotsWithOptions(catalogId, namespace, table, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看iceberg表详情列表</p>
     * 
     * @param request ListIcebergTableDetailsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIcebergTableDetailsResponse
     */
    public ListIcebergTableDetailsResponse listIcebergTableDetailsWithOptions(String catalogId, String namespace, ListIcebergTableDetailsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageToken)) {
            query.put("pageToken", request.pageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableNamePattern)) {
            query.put("tableNamePattern", request.tableNamePattern);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIcebergTableDetails"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/iceberg/dlf/v1/" + com.aliyun.openapiutil.Client.getEncodeParam(catalogId) + "/namespaces/" + com.aliyun.openapiutil.Client.getEncodeParam(namespace) + "/table-details"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIcebergTableDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看iceberg表详情列表</p>
     * 
     * @param request ListIcebergTableDetailsRequest
     * @return ListIcebergTableDetailsResponse
     */
    public ListIcebergTableDetailsResponse listIcebergTableDetails(String catalogId, String namespace, ListIcebergTableDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIcebergTableDetailsWithOptions(catalogId, namespace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看表</p>
     * 
     * @param request ListPartitionSummariesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPartitionSummariesResponse
     */
    public ListPartitionSummariesResponse listPartitionSummariesWithOptions(String catalogId, String database, String table, ListPartitionSummariesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageToken)) {
            query.put("pageToken", request.pageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionNamePattern)) {
            query.put("partitionNamePattern", request.partitionNamePattern);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPartitionSummaries"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/" + com.aliyun.openapiutil.Client.getEncodeParam(catalogId) + "/databases/" + com.aliyun.openapiutil.Client.getEncodeParam(database) + "/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(table) + "/partitions/storage-summary"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPartitionSummariesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看表</p>
     * 
     * @param request ListPartitionSummariesRequest
     * @return ListPartitionSummariesResponse
     */
    public ListPartitionSummariesResponse listPartitionSummaries(String catalogId, String database, String table, ListPartitionSummariesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPartitionSummariesWithOptions(catalogId, database, table, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定资源或指定Principal的权限信息</p>
     * 
     * @param request ListPermissionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPermissionsResponse
     */
    public ListPermissionsResponse listPermissionsWithOptions(String catalogId, ListPermissionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.database)) {
            query.put("database", request.database);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.function)) {
            query.put("function", request.function);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageToken)) {
            query.put("pageToken", request.pageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principal)) {
            query.put("principal", request.principal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.table)) {
            query.put("table", request.table);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.view)) {
            query.put("view", request.view);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPermissions"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/auth/permissions/" + com.aliyun.openapiutil.Client.getEncodeParam(catalogId) + "/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPermissionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定资源或指定Principal的权限信息</p>
     * 
     * @param request ListPermissionsRequest
     * @return ListPermissionsResponse
     */
    public ListPermissionsResponse listPermissions(String catalogId, ListPermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPermissionsWithOptions(catalogId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取角色用户列表</p>
     * 
     * @param request ListRoleUsersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRoleUsersResponse
     */
    public ListRoleUsersResponse listRoleUsersWithOptions(ListRoleUsersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageToken)) {
            query.put("pageToken", request.pageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rolePrincipal)) {
            query.put("rolePrincipal", request.rolePrincipal);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRoleUsers"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/auth/roles/users/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRoleUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取角色用户列表</p>
     * 
     * @param request ListRoleUsersRequest
     * @return ListRoleUsersResponse
     */
    public ListRoleUsersResponse listRoleUsers(ListRoleUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRoleUsersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取角色列表</p>
     * 
     * @param request ListRolesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRolesResponse
     */
    public ListRolesResponse listRolesWithOptions(ListRolesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageToken)) {
            query.put("pageToken", request.pageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("roleName", request.roleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRoles"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/auth/roles/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRolesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取角色列表</p>
     * 
     * @param request ListRolesRequest
     * @return ListRolesResponse
     */
    public ListRolesResponse listRoles(ListRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRolesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看表详情列表</p>
     * 
     * @param request ListTableDetailsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTableDetailsResponse
     */
    public ListTableDetailsResponse listTableDetailsWithOptions(String catalogId, String database, ListTableDetailsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageToken)) {
            query.put("pageToken", request.pageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableNamePattern)) {
            query.put("tableNamePattern", request.tableNamePattern);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTableDetails"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/" + com.aliyun.openapiutil.Client.getEncodeParam(catalogId) + "/databases/" + com.aliyun.openapiutil.Client.getEncodeParam(database) + "/table-details"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTableDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看表详情列表</p>
     * 
     * @param request ListTableDetailsRequest
     * @return ListTableDetailsResponse
     */
    public ListTableDetailsResponse listTableDetails(String catalogId, String database, ListTableDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTableDetailsWithOptions(catalogId, database, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看表详情列表</p>
     * 
     * @param request ListTablesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTablesResponse
     */
    public ListTablesResponse listTablesWithOptions(String catalogId, String database, ListTablesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageToken)) {
            query.put("pageToken", request.pageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableNamePattern)) {
            query.put("tableNamePattern", request.tableNamePattern);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTables"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/" + com.aliyun.openapiutil.Client.getEncodeParam(catalogId) + "/databases/" + com.aliyun.openapiutil.Client.getEncodeParam(database) + "/tables"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看表详情列表</p>
     * 
     * @param request ListTablesRequest
     * @return ListTablesResponse
     */
    public ListTablesResponse listTables(String catalogId, String database, ListTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTablesWithOptions(catalogId, database, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户角色列表</p>
     * 
     * @param request ListUserRolesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserRolesResponse
     */
    public ListUserRolesResponse listUserRolesWithOptions(ListUserRolesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageToken)) {
            query.put("pageToken", request.pageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipal)) {
            query.put("userPrincipal", request.userPrincipal);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserRoles"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/auth/users/roles/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserRolesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户角色列表</p>
     * 
     * @param request ListUserRolesRequest
     * @return ListUserRolesResponse
     */
    public ListUserRolesResponse listUserRoles(ListUserRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserRolesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户列表</p>
     * 
     * @param request ListUsersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageToken)) {
            query.put("pageToken", request.pageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("userName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsers"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/auth/users/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户列表</p>
     * 
     * @param request ListUsersRequest
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUsersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量取消授予角色权限给用户</p>
     * 
     * @param request RevokeRoleFromUsersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeRoleFromUsersResponse
     */
    public RevokeRoleFromUsersResponse revokeRoleFromUsersWithOptions(RevokeRoleFromUsersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.rolePrincipal)) {
            body.put("rolePrincipal", request.rolePrincipal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipals)) {
            body.put("userPrincipals", request.userPrincipals);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeRoleFromUsers"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/auth/roles/revoke"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeRoleFromUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量取消授予角色权限给用户</p>
     * 
     * @param request RevokeRoleFromUsersRequest
     * @return RevokeRoleFromUsersResponse
     */
    public RevokeRoleFromUsersResponse revokeRoleFromUsers(RevokeRoleFromUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.revokeRoleFromUsersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>订阅当前地域的 DLF</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubscribeResponse
     */
    public SubscribeResponse subscribeWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Subscribe"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/service/subscribe"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubscribeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>订阅当前地域的 DLF</p>
     * @return SubscribeResponse
     */
    public SubscribeResponse subscribe() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.subscribeWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新角色</p>
     * 
     * @param request UpdateRoleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRoleResponse
     */
    public UpdateRoleResponse updateRoleWithOptions(UpdateRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rolePrincipal)) {
            body.put("rolePrincipal", request.rolePrincipal);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRole"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/auth/roles"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新角色</p>
     * 
     * @param request UpdateRoleRequest
     * @return UpdateRoleResponse
     */
    public UpdateRoleResponse updateRole(UpdateRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRoleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新角色用户</p>
     * 
     * @param request UpdateRoleUsersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRoleUsersResponse
     */
    public UpdateRoleUsersResponse updateRoleUsersWithOptions(UpdateRoleUsersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.rolePrincipal)) {
            body.put("rolePrincipal", request.rolePrincipal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipals)) {
            body.put("userPrincipals", request.userPrincipals);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRoleUsers"),
            new TeaPair("version", "2025-03-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dlf/v1/auth/roles/users"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRoleUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新角色用户</p>
     * 
     * @param request UpdateRoleUsersRequest
     * @return UpdateRoleUsersResponse
     */
    public UpdateRoleUsersResponse updateRoleUsers(UpdateRoleUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRoleUsersWithOptions(request, headers, runtime);
    }
}
