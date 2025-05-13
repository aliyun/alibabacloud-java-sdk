// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330;

import com.aliyun.tea.*;
import com.aliyun.cms20240330.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cms", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>创建EntityStore相关存储</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEntityStoreResponse
     */
    public CreateEntityStoreResponse createEntityStoreWithOptions(String workspaceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEntityStore"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/entitystore"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEntityStoreResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建EntityStore相关存储</p>
     * @return CreateEntityStoreResponse
     */
    public CreateEntityStoreResponse createEntityStore(String workspaceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEntityStoreWithOptions(workspaceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建Prometheus监控实例</p>
     * 
     * @param request CreatePrometheusInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePrometheusInstanceResponse
     */
    public CreatePrometheusInstanceResponse createPrometheusInstanceWithOptions(CreatePrometheusInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.archiveDuration)) {
            body.put("archiveDuration", request.archiveDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authFreeReadPolicy)) {
            body.put("authFreeReadPolicy", request.authFreeReadPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authFreeWritePolicy)) {
            body.put("authFreeWritePolicy", request.authFreeWritePolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAuthFreeRead)) {
            body.put("enableAuthFreeRead", request.enableAuthFreeRead);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAuthFreeWrite)) {
            body.put("enableAuthFreeWrite", request.enableAuthFreeWrite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAuthToken)) {
            body.put("enableAuthToken", request.enableAuthToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            body.put("paymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prometheusInstanceName)) {
            body.put("prometheusInstanceName", request.prometheusInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageDuration)) {
            body.put("storageDuration", request.storageDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspace)) {
            body.put("workspace", request.workspace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePrometheusInstance"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/prometheus-instances"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePrometheusInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建Prometheus监控实例</p>
     * 
     * @param request CreatePrometheusInstanceRequest
     * @return CreatePrometheusInstanceResponse
     */
    public CreatePrometheusInstanceResponse createPrometheusInstance(CreatePrometheusInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPrometheusInstanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建Umodel配置</p>
     * 
     * @param request CreateUmodelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUmodelResponse
     */
    public CreateUmodelResponse createUmodelWithOptions(String workspace, CreateUmodelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commonSchemaRef)) {
            body.put("commonSchemaRef", request.commonSchemaRef);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUmodel"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspace) + "/umodel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUmodelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建Umodel配置</p>
     * 
     * @param request CreateUmodelRequest
     * @return CreateUmodelResponse
     */
    public CreateUmodelResponse createUmodel(String workspace, CreateUmodelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUmodelWithOptions(workspace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除EntityStore相关存储</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEntityStoreResponse
     */
    public DeleteEntityStoreResponse deleteEntityStoreWithOptions(String workspaceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEntityStore"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/entitystore"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEntityStoreResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除EntityStore相关存储</p>
     * @return DeleteEntityStoreResponse
     */
    public DeleteEntityStoreResponse deleteEntityStore(String workspaceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteEntityStoreWithOptions(workspaceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除Umodel配置信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUmodelResponse
     */
    public DeleteUmodelResponse deleteUmodelWithOptions(String workspace, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUmodel"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspace) + "/umodel"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUmodelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除Umodel配置信息</p>
     * @return DeleteUmodelResponse
     */
    public DeleteUmodelResponse deleteUmodel(String workspace) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUmodelWithOptions(workspace, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除 Umodel Elements</p>
     * 
     * @param request DeleteUmodelDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUmodelDataResponse
     */
    public DeleteUmodelDataResponse deleteUmodelDataWithOptions(String workspace, DeleteUmodelDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kind)) {
            query.put("kind", request.kind);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUmodelData"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspace) + "/umodel/data"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUmodelDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除 Umodel Elements</p>
     * 
     * @param request DeleteUmodelDataRequest
     * @return DeleteUmodelDataResponse
     */
    public DeleteUmodelDataResponse deleteUmodelData(String workspace, DeleteUmodelDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUmodelDataWithOptions(workspace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除工作空间</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWorkspaceResponse
     */
    public DeleteWorkspaceResponse deleteWorkspaceWithOptions(String workspaceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkspace"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除工作空间</p>
     * @return DeleteWorkspaceResponse
     */
    public DeleteWorkspaceResponse deleteWorkspace(String workspaceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteWorkspaceWithOptions(workspaceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取EntityStore相关存储信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEntityStoreResponse
     */
    public GetEntityStoreResponse getEntityStoreWithOptions(String workspaceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEntityStore"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + "/entitystore"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEntityStoreResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取EntityStore相关存储信息</p>
     * @return GetEntityStoreResponse
     */
    public GetEntityStoreResponse getEntityStore(String workspaceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEntityStoreWithOptions(workspaceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询指定Workspace下的实体和关系数据，返回结果显示某时间区间中的实体数据（返回结果压缩后传输）。</p>
     * 
     * @param request GetEntityStoreDataRequest
     * @param headers GetEntityStoreDataHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEntityStoreDataResponse
     */
    public GetEntityStoreDataResponse getEntityStoreDataWithOptions(String workspace, GetEntityStoreDataRequest request, GetEntityStoreDataHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            body.put("from", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            body.put("to", request.to);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.acceptEncoding)) {
            realHeaders.put("acceptEncoding", com.aliyun.teautil.Common.toJSONString(headers.acceptEncoding));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEntityStoreData"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspace) + "/entitiesAndRelations"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEntityStoreDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询指定Workspace下的实体和关系数据，返回结果显示某时间区间中的实体数据（返回结果压缩后传输）。</p>
     * 
     * @param request GetEntityStoreDataRequest
     * @return GetEntityStoreDataResponse
     */
    public GetEntityStoreDataResponse getEntityStoreData(String workspace, GetEntityStoreDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetEntityStoreDataHeaders headers = new GetEntityStoreDataHeaders();
        return this.getEntityStoreDataWithOptions(workspace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Umodel配置信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUmodelResponse
     */
    public GetUmodelResponse getUmodelWithOptions(String workspace, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUmodel"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspace) + "/umodel"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUmodelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Umodel配置信息</p>
     * @return GetUmodelResponse
     */
    public GetUmodelResponse getUmodel(String workspace) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUmodelWithOptions(workspace, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取相关联的 Umodel 图数据</p>
     * 
     * @param request GetUmodelDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUmodelDataResponse
     */
    public GetUmodelDataResponse getUmodelDataWithOptions(String workspace, GetUmodelDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.method)) {
            query.put("method", request.method);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUmodelData"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspace) + "/umodel/graph"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUmodelDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取相关联的 Umodel 图数据</p>
     * 
     * @param request GetUmodelDataRequest
     * @return GetUmodelDataResponse
     */
    public GetUmodelDataResponse getUmodelData(String workspace, GetUmodelDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUmodelDataWithOptions(workspace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作空间</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkspaceResponse
     */
    public GetWorkspaceResponse getWorkspaceWithOptions(String workspaceName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkspace"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作空间</p>
     * @return GetWorkspaceResponse
     */
    public GetWorkspaceResponse getWorkspace(String workspaceName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkspaceWithOptions(workspaceName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询告警动作</p>
     * 
     * @param tmpReq ListAlertActionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAlertActionsResponse
     */
    public ListAlertActionsResponse listAlertActionsWithOptions(ListAlertActionsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAlertActionsShrinkRequest request = new ListAlertActionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.alertActionIds)) {
            request.alertActionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.alertActionIds, "alertActionIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertActionIdsShrink)) {
            query.put("alertActionIds", request.alertActionIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertActionName)) {
            query.put("alertActionName", request.alertActionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlertActions"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/alertActions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlertActionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询告警动作</p>
     * 
     * @param request ListAlertActionsRequest
     * @return ListAlertActionsResponse
     */
    public ListAlertActionsResponse listAlertActions(ListAlertActionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAlertActionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作空间列表</p>
     * 
     * @param tmpReq ListWorkspacesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkspacesResponse
     */
    public ListWorkspacesResponse listWorkspacesWithOptions(ListWorkspacesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListWorkspacesShrinkRequest request = new ListWorkspacesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.workspaceNameList)) {
            request.workspaceNameListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.workspaceNameList, "workspaceNameList", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceName)) {
            query.put("workspaceName", request.workspaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceNameListShrink)) {
            query.put("workspaceNameList", request.workspaceNameListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkspaces"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace"),
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
     * <p>获取工作空间列表</p>
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
     * <p>创建工作空间</p>
     * 
     * @param request PutWorkspaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutWorkspaceResponse
     */
    public PutWorkspaceResponse putWorkspaceWithOptions(String workspaceName, PutWorkspaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsProject)) {
            body.put("slsProject", request.slsProject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutWorkspace"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspaceName) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建工作空间</p>
     * 
     * @param request PutWorkspaceRequest
     * @return PutWorkspaceResponse
     */
    public PutWorkspaceResponse putWorkspace(String workspaceName, PutWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putWorkspaceWithOptions(workspaceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新Umodel配置信息</p>
     * 
     * @param request UpdateUmodelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUmodelResponse
     */
    public UpdateUmodelResponse updateUmodelWithOptions(String workspace, UpdateUmodelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commonSchemaRef)) {
            body.put("commonSchemaRef", request.commonSchemaRef);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUmodel"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspace) + "/umodel"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUmodelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新Umodel配置信息</p>
     * 
     * @param request UpdateUmodelRequest
     * @return UpdateUmodelResponse
     */
    public UpdateUmodelResponse updateUmodel(String workspace, UpdateUmodelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUmodelWithOptions(workspace, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>写入 Umodel Elements</p>
     * 
     * @param request UpsertUmodelDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpsertUmodelDataResponse
     */
    public UpsertUmodelDataResponse upsertUmodelDataWithOptions(String workspace, UpsertUmodelDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.method)) {
            query.put("method", request.method);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.elements)) {
            body.put("elements", request.elements);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpsertUmodelData"),
            new TeaPair("version", "2024-03-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/workspace/" + com.aliyun.openapiutil.Client.getEncodeParam(workspace) + "/umodel/data"),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpsertUmodelDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>写入 Umodel Elements</p>
     * 
     * @param request UpsertUmodelDataRequest
     * @return UpsertUmodelDataResponse
     */
    public UpsertUmodelDataResponse upsertUmodelData(String workspace, UpsertUmodelDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upsertUmodelDataWithOptions(workspace, request, headers, runtime);
    }
}
