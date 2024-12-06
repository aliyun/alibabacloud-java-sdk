// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823;

import com.aliyun.tea.*;
import com.aliyun.dataanalysisgbi20240823.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dataanalysisgbi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>取消关联的数据源授权</p>
     * 
     * @param request CancelDatasourceAuthorizationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelDatasourceAuthorizationResponse
     */
    public CancelDatasourceAuthorizationResponse cancelDatasourceAuthorizationWithOptions(CancelDatasourceAuthorizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelDatasourceAuthorization"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/cancel/datasource"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelDatasourceAuthorizationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消关联的数据源授权</p>
     * 
     * @param request CancelDatasourceAuthorizationRequest
     * @return CancelDatasourceAuthorizationResponse
     */
    public CancelDatasourceAuthorizationResponse cancelDatasourceAuthorization(CancelDatasourceAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelDatasourceAuthorizationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据库关联授权</p>
     * 
     * @param request CreateDatasourceAuthorizationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDatasourceAuthorizationResponse
     */
    public CreateDatasourceAuthorizationResponse createDatasourceAuthorizationWithOptions(CreateDatasourceAuthorizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            body.put("url", request.url);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("userName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vdbId)) {
            body.put("vdbId", request.vdbId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDatasourceAuthorization"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/create/datasource"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDatasourceAuthorizationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据库关联授权</p>
     * 
     * @param request CreateDatasourceAuthorizationRequest
     * @return CreateDatasourceAuthorizationResponse
     */
    public CreateDatasourceAuthorizationResponse createDatasourceAuthorization(CreateDatasourceAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDatasourceAuthorizationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>在指定的业务空间创建虚拟数据源</p>
     * 
     * @param request CreateVirtualDatasourceInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVirtualDatasourceInstanceResponse
     */
    public CreateVirtualDatasourceInstanceResponse createVirtualDatasourceInstanceWithOptions(CreateVirtualDatasourceInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
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
            new TeaPair("action", "CreateVirtualDatasourceInstance"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/virtualDatasource/createVirtualDatasourceInstance"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVirtualDatasourceInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>在指定的业务空间创建虚拟数据源</p>
     * 
     * @param request CreateVirtualDatasourceInstanceRequest
     * @return CreateVirtualDatasourceInstanceResponse
     */
    public CreateVirtualDatasourceInstanceResponse createVirtualDatasourceInstance(CreateVirtualDatasourceInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVirtualDatasourceInstanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定业务空间下面的虚拟数据源实例</p>
     * 
     * @param request DeleteVirtualDatasourceInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVirtualDatasourceInstanceResponse
     */
    public DeleteVirtualDatasourceInstanceResponse deleteVirtualDatasourceInstanceWithOptions(DeleteVirtualDatasourceInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.vdbId)) {
            body.put("vdbId", request.vdbId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVirtualDatasourceInstance"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/virtualDatasource/deleteVirtualDatasourceInstance"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVirtualDatasourceInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定业务空间下面的虚拟数据源实例</p>
     * 
     * @param request DeleteVirtualDatasourceInstanceRequest
     * @return DeleteVirtualDatasourceInstanceResponse
     */
    public DeleteVirtualDatasourceInstanceResponse deleteVirtualDatasourceInstance(DeleteVirtualDatasourceInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteVirtualDatasourceInstanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取当前业务空间下的数据源实例列表</p>
     * 
     * @param request ListVirtualDatasourceInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVirtualDatasourceInstanceResponse
     */
    public ListVirtualDatasourceInstanceResponse listVirtualDatasourceInstanceWithOptions(ListVirtualDatasourceInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVirtualDatasourceInstance"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/virtualDatasource/listVirtualDatasourceInstance"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVirtualDatasourceInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取当前业务空间下的数据源实例列表</p>
     * 
     * @param request ListVirtualDatasourceInstanceRequest
     * @return ListVirtualDatasourceInstanceResponse
     */
    public ListVirtualDatasourceInstanceResponse listVirtualDatasourceInstance(ListVirtualDatasourceInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listVirtualDatasourceInstanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>运行数据分析</p>
     * 
     * @param request RunDataAnalysisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunDataAnalysisResponse
     */
    public RunDataAnalysisResponse runDataAnalysisWithOptions(String workspaceId, RunDataAnalysisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.generateSqlOnly)) {
            body.put("generateSqlOnly", request.generateSqlOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specificationType)) {
            body.put("specificationType", request.specificationType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunDataAnalysis"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceId) + "/gbi/runDataAnalysis"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunDataAnalysisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>运行数据分析</p>
     * 
     * @param request RunDataAnalysisRequest
     * @return RunDataAnalysisResponse
     */
    public RunDataAnalysisResponse runDataAnalysis(String workspaceId, RunDataAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runDataAnalysisWithOptions(workspaceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>向当前指定的业务空间下的指定虚拟数据源实例添加ddl语句</p>
     * 
     * @param request SaveVirtualDatasourceDdlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveVirtualDatasourceDdlResponse
     */
    public SaveVirtualDatasourceDdlResponse saveVirtualDatasourceDdlWithOptions(SaveVirtualDatasourceDdlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ddl)) {
            body.put("ddl", request.ddl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vdbId)) {
            body.put("vdbId", request.vdbId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveVirtualDatasourceDdl"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/virtualDatasource/addDdl2VirtualInstance"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveVirtualDatasourceDdlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>向当前指定的业务空间下的指定虚拟数据源实例添加ddl语句</p>
     * 
     * @param request SaveVirtualDatasourceDdlRequest
     * @return SaveVirtualDatasourceDdlResponse
     */
    public SaveVirtualDatasourceDdlResponse saveVirtualDatasourceDdl(SaveVirtualDatasourceDdlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveVirtualDatasourceDdlWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新当前业务空间所关联的数据表</p>
     * 
     * @param request SyncRemoteTablesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncRemoteTablesResponse
     */
    public SyncRemoteTablesResponse syncRemoteTablesWithOptions(SyncRemoteTablesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keepTableNames)) {
            body.put("keepTableNames", request.keepTableNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pullSamples)) {
            body.put("pullSamples", request.pullSamples);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableNames)) {
            body.put("tableNames", request.tableNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncRemoteTables"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/update/datasource/tables"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncRemoteTablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新当前业务空间所关联的数据表</p>
     * 
     * @param request SyncRemoteTablesRequest
     * @return SyncRemoteTablesResponse
     */
    public SyncRemoteTablesResponse syncRemoteTables(SyncRemoteTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncRemoteTablesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改指定业务空间下所指定的虚拟数据源的信息</p>
     * 
     * @param request UpdateVirtualDatasourceInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVirtualDatasourceInstanceResponse
     */
    public UpdateVirtualDatasourceInstanceResponse updateVirtualDatasourceInstanceWithOptions(UpdateVirtualDatasourceInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vdbId)) {
            body.put("vdbId", request.vdbId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVirtualDatasourceInstance"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/virtualDatasource/updateVirtualDatasourceInstance"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVirtualDatasourceInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改指定业务空间下所指定的虚拟数据源的信息</p>
     * 
     * @param request UpdateVirtualDatasourceInstanceRequest
     * @return UpdateVirtualDatasourceInstanceResponse
     */
    public UpdateVirtualDatasourceInstanceResponse updateVirtualDatasourceInstance(UpdateVirtualDatasourceInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateVirtualDatasourceInstanceWithOptions(request, headers, runtime);
    }
}
