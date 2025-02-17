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
     * <p>批量删除当前指定业务空间下的同义词</p>
     * 
     * @param request BatchDeleteSynonymsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeleteSynonymsResponse
     */
    public BatchDeleteSynonymsResponse batchDeleteSynonymsWithOptions(BatchDeleteSynonymsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.synonymIdKeys)) {
            body.put("synonymIdKeys", request.synonymIdKeys);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteSynonyms"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/batchDelete/synonyms"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteSynonymsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new BatchDeleteSynonymsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>批量删除当前指定业务空间下的同义词</p>
     * 
     * @param request BatchDeleteSynonymsRequest
     * @return BatchDeleteSynonymsResponse
     */
    public BatchDeleteSynonymsResponse batchDeleteSynonyms(BatchDeleteSynonymsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchDeleteSynonymsWithOptions(request, headers, runtime);
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CancelDatasourceAuthorizationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CancelDatasourceAuthorizationResponse());
        }

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
     * <p>在指定的业务空间下创建新的业务逻辑解释</p>
     * 
     * @param request CreateBusinessLogicRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBusinessLogicResponse
     */
    public CreateBusinessLogicResponse createBusinessLogicWithOptions(CreateBusinessLogicRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBusinessLogic"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/create/logic"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBusinessLogicResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateBusinessLogicResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>在指定的业务空间下创建新的业务逻辑解释</p>
     * 
     * @param request CreateBusinessLogicRequest
     * @return CreateBusinessLogicResponse
     */
    public CreateBusinessLogicResponse createBusinessLogic(CreateBusinessLogicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessLogicWithOptions(request, headers, runtime);
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDatasourceAuthorizationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateDatasourceAuthorizationResponse());
        }

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
     * <p>在当前指定的业务空间下面，新建同义词</p>
     * 
     * @param request CreateSynonymsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSynonymsResponse
     */
    public CreateSynonymsResponse createSynonymsWithOptions(CreateSynonymsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columns)) {
            body.put("columns", request.columns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.word)) {
            body.put("word", request.word);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wordSynonyms)) {
            body.put("wordSynonyms", request.wordSynonyms);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSynonyms"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/create/synonyms"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSynonymsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateSynonymsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>在当前指定的业务空间下面，新建同义词</p>
     * 
     * @param request CreateSynonymsRequest
     * @return CreateSynonymsResponse
     */
    public CreateSynonymsResponse createSynonyms(CreateSynonymsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSynonymsWithOptions(request, headers, runtime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVirtualDatasourceInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateVirtualDatasourceInstanceResponse());
        }

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
     * <p>删除指定业务空间下所指定的业务逻辑解释</p>
     * 
     * @param request DeleteBusinessLogicRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBusinessLogicResponse
     */
    public DeleteBusinessLogicResponse deleteBusinessLogicWithOptions(DeleteBusinessLogicRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessLogicIdKeys)) {
            body.put("businessLogicIdKeys", request.businessLogicIdKeys);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBusinessLogic"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/delete/logic"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBusinessLogicResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteBusinessLogicResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除指定业务空间下所指定的业务逻辑解释</p>
     * 
     * @param request DeleteBusinessLogicRequest
     * @return DeleteBusinessLogicResponse
     */
    public DeleteBusinessLogicResponse deleteBusinessLogic(DeleteBusinessLogicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBusinessLogicWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>从当前所指定的业务空间中，删除所指定的列</p>
     * 
     * @param request DeleteColumnRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteColumnResponse
     */
    public DeleteColumnResponse deleteColumnWithOptions(DeleteColumnRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columnIdKey)) {
            body.put("columnIdKey", request.columnIdKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteColumn"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/delete/column"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteColumnResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteColumnResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>从当前所指定的业务空间中，删除所指定的列</p>
     * 
     * @param request DeleteColumnRequest
     * @return DeleteColumnResponse
     */
    public DeleteColumnResponse deleteColumn(DeleteColumnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteColumnWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>将当前指定数据表从指定业务空间管控中删除</p>
     * 
     * @param request DeleteSelectedTableRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSelectedTableResponse
     */
    public DeleteSelectedTableResponse deleteSelectedTableWithOptions(DeleteSelectedTableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tableIdKey)) {
            body.put("tableIdKey", request.tableIdKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSelectedTable"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/delete/table"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSelectedTableResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteSelectedTableResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>将当前指定数据表从指定业务空间管控中删除</p>
     * 
     * @param request DeleteSelectedTableRequest
     * @return DeleteSelectedTableResponse
     */
    public DeleteSelectedTableResponse deleteSelectedTable(DeleteSelectedTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSelectedTableWithOptions(request, headers, runtime);
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVirtualDatasourceInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteVirtualDatasourceInstanceResponse());
        }

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
     * <p>获取当前指定业务空间下的企业知识名词解释列表</p>
     * 
     * @param request ListBusinessLogicRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBusinessLogicResponse
     */
    public ListBusinessLogicResponse listBusinessLogicWithOptions(ListBusinessLogicRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListBusinessLogic"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/list/logic"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListBusinessLogicResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListBusinessLogicResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取当前指定业务空间下的企业知识名词解释列表</p>
     * 
     * @param request ListBusinessLogicRequest
     * @return ListBusinessLogicResponse
     */
    public ListBusinessLogicResponse listBusinessLogic(ListBusinessLogicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBusinessLogicWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取当前指定业务空间，指定表下面的列信息</p>
     * 
     * @param request ListColumnRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListColumnResponse
     */
    public ListColumnResponse listColumnWithOptions(ListColumnRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.tableIdKey)) {
            body.put("tableIdKey", request.tableIdKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListColumn"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/list/column"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListColumnResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListColumnResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取当前指定业务空间，指定表下面的列信息</p>
     * 
     * @param request ListColumnRequest
     * @return ListColumnResponse
     */
    public ListColumnResponse listColumn(ListColumnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listColumnWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取当前业务空间，指定表、列下的枚举值</p>
     * 
     * @param request ListEnumMappingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEnumMappingResponse
     */
    public ListEnumMappingResponse listEnumMappingWithOptions(ListEnumMappingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columnIdKey)) {
            body.put("columnIdKey", request.columnIdKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableIdKey)) {
            body.put("tableIdKey", request.tableIdKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnumMapping"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/list/mapping"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnumMappingResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListEnumMappingResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取当前业务空间，指定表、列下的枚举值</p>
     * 
     * @param request ListEnumMappingRequest
     * @return ListEnumMappingResponse
     */
    public ListEnumMappingResponse listEnumMapping(ListEnumMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEnumMappingWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取当前业务空间处于以关联状态的数据表</p>
     * 
     * @param request ListSelectedTablesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSelectedTablesResponse
     */
    public ListSelectedTablesResponse listSelectedTablesWithOptions(ListSelectedTablesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListSelectedTables"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/list/datasource/table"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListSelectedTablesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListSelectedTablesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取当前业务空间处于以关联状态的数据表</p>
     * 
     * @param request ListSelectedTablesRequest
     * @return ListSelectedTablesResponse
     */
    public ListSelectedTablesResponse listSelectedTables(ListSelectedTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSelectedTablesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取当前指定业务空间下的同义词列表</p>
     * 
     * @param request ListSynonymsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSynonymsResponse
     */
    public ListSynonymsResponse listSynonymsWithOptions(ListSynonymsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListSynonyms"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/list/synonyms"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListSynonymsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListSynonymsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取当前指定业务空间下的同义词列表</p>
     * 
     * @param request ListSynonymsRequest
     * @return ListSynonymsResponse
     */
    public ListSynonymsResponse listSynonyms(ListSynonymsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSynonymsWithOptions(request, headers, runtime);
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListVirtualDatasourceInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListVirtualDatasourceInstanceResponse());
        }

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
     * <p>将指定数据表的数据列恢复到初始话状态</p>
     * 
     * @param request RecoverColumnRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecoverColumnResponse
     */
    public RecoverColumnResponse recoverColumnWithOptions(RecoverColumnRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columnIdKey)) {
            body.put("columnIdKey", request.columnIdKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableIdKey)) {
            body.put("tableIdKey", request.tableIdKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecoverColumn"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/recover/column"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RecoverColumnResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RecoverColumnResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>将指定数据表的数据列恢复到初始话状态</p>
     * 
     * @param request RecoverColumnRequest
     * @return RecoverColumnResponse
     */
    public RecoverColumnResponse recoverColumn(RecoverColumnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recoverColumnWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>从远程数据库刷新当前所关联的数据表信息</p>
     * 
     * @param request ResyncTableRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResyncTableResponse
     */
    public ResyncTableResponse resyncTableWithOptions(ResyncTableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keep)) {
            body.put("keep", request.keep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableIdKey)) {
            body.put("tableIdKey", request.tableIdKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResyncTable"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/refresh/table"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ResyncTableResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ResyncTableResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>从远程数据库刷新当前所关联的数据表信息</p>
     * 
     * @param request ResyncTableRequest
     * @return ResyncTableResponse
     */
    public ResyncTableResponse resyncTable(ResyncTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resyncTableWithOptions(request, headers, runtime);
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
        if (!com.aliyun.teautil.Common.isUnset(request.dataRole)) {
            body.put("dataRole", request.dataRole);
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.userParams)) {
            body.put("userParams", request.userParams);
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RunDataAnalysisResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RunDataAnalysisResponse());
        }

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
     * <p>对结构化结果进行分析、可视化信息生成</p>
     * 
     * @param request RunDataResultAnalysisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunDataResultAnalysisResponse
     */
    public RunDataResultAnalysisResponse runDataResultAnalysisWithOptions(RunDataResultAnalysisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analysisMode)) {
            body.put("analysisMode", request.analysisMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlData)) {
            body.put("sqlData", request.sqlData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunDataResultAnalysis"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/runDataResultAnalysis"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RunDataResultAnalysisResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RunDataResultAnalysisResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>对结构化结果进行分析、可视化信息生成</p>
     * 
     * @param request RunDataResultAnalysisRequest
     * @return RunDataResultAnalysisResponse
     */
    public RunDataResultAnalysisResponse runDataResultAnalysis(RunDataResultAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runDataResultAnalysisWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>运行sql生成</p>
     * 
     * @param request RunSqlGenerationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunSqlGenerationResponse
     */
    public RunSqlGenerationResponse runSqlGenerationWithOptions(RunSqlGenerationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunSqlGeneration"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/runSqlGeneration"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RunSqlGenerationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RunSqlGenerationResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>运行sql生成</p>
     * 
     * @param request RunSqlGenerationRequest
     * @return RunSqlGenerationResponse
     */
    public RunSqlGenerationResponse runSqlGeneration(RunSqlGenerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runSqlGenerationWithOptions(request, headers, runtime);
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SaveVirtualDatasourceDdlResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SaveVirtualDatasourceDdlResponse());
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.noModifiedTableNames)) {
            body.put("noModifiedTableNames", request.noModifiedTableNames);
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SyncRemoteTablesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SyncRemoteTablesResponse());
        }

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
     * <p>修改当前指定业务空间下所指定的业务逻辑解释</p>
     * 
     * @param request UpdateBusinessLogicRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBusinessLogicResponse
     */
    public UpdateBusinessLogicResponse updateBusinessLogicWithOptions(UpdateBusinessLogicRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessLogicIdKey)) {
            body.put("businessLogicIdKey", request.businessLogicIdKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBusinessLogic"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/update/logic"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBusinessLogicResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateBusinessLogicResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>修改当前指定业务空间下所指定的业务逻辑解释</p>
     * 
     * @param request UpdateBusinessLogicRequest
     * @return UpdateBusinessLogicResponse
     */
    public UpdateBusinessLogicResponse updateBusinessLogic(UpdateBusinessLogicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBusinessLogicWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改当前指定业务空间中，指定列的信息</p>
     * 
     * @param request UpdateColumnRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateColumnResponse
     */
    public UpdateColumnResponse updateColumnWithOptions(UpdateColumnRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chineseName)) {
            body.put("chineseName", request.chineseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnIdKey)) {
            body.put("columnIdKey", request.columnIdKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enumType)) {
            body.put("enumType", request.enumType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enumValues)) {
            body.put("enumValues", request.enumValues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rangeMax)) {
            body.put("rangeMax", request.rangeMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rangeMin)) {
            body.put("rangeMin", request.rangeMin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.samples)) {
            body.put("samples", request.samples);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableIdKey)) {
            body.put("tableIdKey", request.tableIdKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateColumn"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/update/column"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateColumnResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateColumnResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>修改当前指定业务空间中，指定列的信息</p>
     * 
     * @param request UpdateColumnRequest
     * @return UpdateColumnResponse
     */
    public UpdateColumnResponse updateColumn(UpdateColumnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateColumnWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改当前指定业务空间指定列下的枚举值信息</p>
     * 
     * @param request UpdateEnumMappingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEnumMappingResponse
     */
    public UpdateEnumMappingResponse updateEnumMappingWithOptions(UpdateEnumMappingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columnIdKey)) {
            body.put("columnIdKey", request.columnIdKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enumMapping)) {
            body.put("enumMapping", request.enumMapping);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableIdKey)) {
            body.put("tableIdKey", request.tableIdKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEnumMapping"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/update/mapping"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEnumMappingResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateEnumMappingResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>修改当前指定业务空间指定列下的枚举值信息</p>
     * 
     * @param request UpdateEnumMappingRequest
     * @return UpdateEnumMappingResponse
     */
    public UpdateEnumMappingResponse updateEnumMapping(UpdateEnumMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEnumMappingWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改当前业务空间指定的同义词信息</p>
     * 
     * @param request UpdateSynonymsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSynonymsResponse
     */
    public UpdateSynonymsResponse updateSynonymsWithOptions(UpdateSynonymsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columns)) {
            body.put("columns", request.columns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synonymIdKey)) {
            body.put("synonymIdKey", request.synonymIdKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.word)) {
            body.put("word", request.word);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wordSynonyms)) {
            body.put("wordSynonyms", request.wordSynonyms);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSynonyms"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/update/synonyms"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSynonymsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateSynonymsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>修改当前业务空间指定的同义词信息</p>
     * 
     * @param request UpdateSynonymsRequest
     * @return UpdateSynonymsResponse
     */
    public UpdateSynonymsResponse updateSynonyms(UpdateSynonymsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSynonymsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改当前所指定的数据表的信息</p>
     * 
     * @param request UpdateTableInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTableInfoResponse
     */
    public UpdateTableInfoResponse updateTableInfoWithOptions(UpdateTableInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.foreignKeys)) {
            body.put("foreignKeys", request.foreignKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryKey)) {
            body.put("primaryKey", request.primaryKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableIdKey)) {
            body.put("tableIdKey", request.tableIdKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTableInfo"),
            new TeaPair("version", "2024-08-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gbi/update/table"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTableInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateTableInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>修改当前所指定的数据表的信息</p>
     * 
     * @param request UpdateTableInfoRequest
     * @return UpdateTableInfoResponse
     */
    public UpdateTableInfoResponse updateTableInfo(UpdateTableInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTableInfoWithOptions(request, headers, runtime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVirtualDatasourceInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateVirtualDatasourceInstanceResponse());
        }

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
