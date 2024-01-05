// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621;

import com.aliyun.tea.*;
import com.aliyun.igraph20210621.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("igraph", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateGraphResponse createGraphWithOptions(String instanceId, String graphName, CreateGraphRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGraph"),
            new TeaPair("version", "2021-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/igraph/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/graphs/" + com.aliyun.openapiutil.Client.getEncodeParam(graphName) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGraphResponse());
    }

    public CreateGraphResponse createGraph(String instanceId, String graphName, CreateGraphRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGraphWithOptions(instanceId, graphName, request, headers, runtime);
    }

    public CreateGraphSchemaResponse createGraphSchemaWithOptions(String instanceId, String graphName, CreateGraphSchemaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGraphSchema"),
            new TeaPair("version", "2021-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/igraph/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/graphs/" + com.aliyun.openapiutil.Client.getEncodeParam(graphName) + "/schemas"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGraphSchemaResponse());
    }

    public CreateGraphSchemaResponse createGraphSchema(String instanceId, String graphName, CreateGraphSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGraphSchemaWithOptions(instanceId, graphName, request, headers, runtime);
    }

    public DeleteGraphResponse deleteGraphWithOptions(String instanceId, String graphName, DeleteGraphRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGraph"),
            new TeaPair("version", "2021-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/igraph/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/graphs/" + com.aliyun.openapiutil.Client.getEncodeParam(graphName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGraphResponse());
    }

    public DeleteGraphResponse deleteGraph(String instanceId, String graphName, DeleteGraphRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGraphWithOptions(instanceId, graphName, request, headers, runtime);
    }

    public GetGraphResponse getGraphWithOptions(String instanceId, String graphName, GetGraphRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGraph"),
            new TeaPair("version", "2021-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/igraph/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/graphs/" + com.aliyun.openapiutil.Client.getEncodeParam(graphName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGraphResponse());
    }

    public GetGraphResponse getGraph(String instanceId, String graphName, GetGraphRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGraphWithOptions(instanceId, graphName, request, headers, runtime);
    }

    public GetGraphSchemaResponse getGraphSchemaWithOptions(String instanceId, String graphName, String graphSchemaName, GetGraphSchemaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGraphSchema"),
            new TeaPair("version", "2021-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/igraph/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/graphs/" + com.aliyun.openapiutil.Client.getEncodeParam(graphName) + "/schemas/" + com.aliyun.openapiutil.Client.getEncodeParam(graphSchemaName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGraphSchemaResponse());
    }

    public GetGraphSchemaResponse getGraphSchema(String instanceId, String graphName, String graphSchemaName, GetGraphSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGraphSchemaWithOptions(instanceId, graphName, graphSchemaName, request, headers, runtime);
    }

    public GetIgraphLabelBackFlowResponse getIgraphLabelBackFlowWithOptions(String graphName, String instanceId, String labelName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIgraphLabelBackFlow"),
            new TeaPair("version", "2021-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/igraph/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/graphs/" + com.aliyun.openapiutil.Client.getEncodeParam(graphName) + "/label/" + com.aliyun.openapiutil.Client.getEncodeParam(labelName) + "/backflow"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIgraphLabelBackFlowResponse());
    }

    public GetIgraphLabelBackFlowResponse getIgraphLabelBackFlow(String graphName, String instanceId, String labelName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIgraphLabelBackFlowWithOptions(graphName, instanceId, labelName, headers, runtime);
    }

    public GetIgraphLabelLastBackflowResponse getIgraphLabelLastBackflowWithOptions(String instanceId, String graphName, String labelName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIgraphLabelLastBackflow"),
            new TeaPair("version", "2021-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/igraph/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/graphs/" + com.aliyun.openapiutil.Client.getEncodeParam(graphName) + "/label/" + com.aliyun.openapiutil.Client.getEncodeParam(labelName) + "/backflow/last"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIgraphLabelLastBackflowResponse());
    }

    public GetIgraphLabelLastBackflowResponse getIgraphLabelLastBackflow(String instanceId, String graphName, String labelName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIgraphLabelLastBackflowWithOptions(instanceId, graphName, labelName, headers, runtime);
    }

    public GetIgraphTableDetailResponse getIgraphTableDetailWithOptions(String instanceId, String graphName, String tableName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIgraphTableDetail"),
            new TeaPair("version", "2021-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/igraph/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/graphs/" + com.aliyun.openapiutil.Client.getEncodeParam(graphName) + "/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(tableName) + "/detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIgraphTableDetailResponse());
    }

    public GetIgraphTableDetailResponse getIgraphTableDetail(String instanceId, String graphName, String tableName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIgraphTableDetailWithOptions(instanceId, graphName, tableName, headers, runtime);
    }

    public GetIgraphTablesBackFlowResponse getIgraphTablesBackFlowWithOptions(String instanceId, String graphName, GetIgraphTablesBackFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIgraphTablesBackFlow"),
            new TeaPair("version", "2021-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/igraph/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/graphs/" + com.aliyun.openapiutil.Client.getEncodeParam(graphName) + "/backflows"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIgraphTablesBackFlowResponse());
    }

    public GetIgraphTablesBackFlowResponse getIgraphTablesBackFlow(String instanceId, String graphName, GetIgraphTablesBackFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIgraphTablesBackFlowWithOptions(instanceId, graphName, request, headers, runtime);
    }

    public GetInstanceResponse getInstanceWithOptions(String instanceId, GetInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstance"),
            new TeaPair("version", "2021-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/igraph/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceResponse());
    }

    public GetInstanceResponse getInstance(String instanceId, GetInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceWithOptions(instanceId, request, headers, runtime);
    }

    public GetInstanceDigestResponse getInstanceDigestWithOptions(String instanceId, GetInstanceDigestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceDigest"),
            new TeaPair("version", "2021-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/igraph/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/digest"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceDigestResponse());
    }

    public GetInstanceDigestResponse getInstanceDigest(String instanceId, GetInstanceDigestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceDigestWithOptions(instanceId, request, headers, runtime);
    }

    public GetTableDetailResponse getTableDetailWithOptions(String instanceId, String tableName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableDetail"),
            new TeaPair("version", "2021-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/igraph/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(tableName) + "/detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableDetailResponse());
    }

    public GetTableDetailResponse getTableDetail(String instanceId, String tableName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTableDetailWithOptions(instanceId, tableName, headers, runtime);
    }

    public GetTableLastBackflowResponse getTableLastBackflowWithOptions(String instanceId, String tableName, GetTableLastBackflowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.partition)) {
            query.put("partition", request.partition);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableLastBackflow"),
            new TeaPair("version", "2021-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/igraph/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/table/" + com.aliyun.openapiutil.Client.getEncodeParam(tableName) + "/backflow/last"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableLastBackflowResponse());
    }

    public GetTableLastBackflowResponse getTableLastBackflow(String instanceId, String tableName, GetTableLastBackflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTableLastBackflowWithOptions(instanceId, tableName, request, headers, runtime);
    }

    public ListDemoGraphSchemasResponse listDemoGraphSchemasWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDemoGraphSchemas"),
            new TeaPair("version", "2021-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/igraph/instances/demo/schemas"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDemoGraphSchemasResponse());
    }

    public ListDemoGraphSchemasResponse listDemoGraphSchemas() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDemoGraphSchemasWithOptions(headers, runtime);
    }

    public ListGraphSchemasResponse listGraphSchemasWithOptions(String instanceId, String graphName, ListGraphSchemasRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageLimit)) {
            query.put("pageLimit", request.pageLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageStart)) {
            query.put("pageStart", request.pageStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnSpec)) {
            query.put("returnSpec", request.returnSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaStatus)) {
            query.put("schemaStatus", request.schemaStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGraphSchemas"),
            new TeaPair("version", "2021-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/igraph/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/graphs/" + com.aliyun.openapiutil.Client.getEncodeParam(graphName) + "/schemas"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGraphSchemasResponse());
    }

    public ListGraphSchemasResponse listGraphSchemas(String instanceId, String graphName, ListGraphSchemasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGraphSchemasWithOptions(instanceId, graphName, request, headers, runtime);
    }

    public ListIgraphInstancesResponse listIgraphInstancesWithOptions(ListIgraphInstancesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListIgraphInstancesShrinkRequest request = new ListIgraphInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageContinue)) {
            query.put("pageContinue", request.pageContinue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageLimit)) {
            query.put("pageLimit", request.pageLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIgraphInstances"),
            new TeaPair("version", "2021-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/igraph/instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIgraphInstancesResponse());
    }

    public ListIgraphInstancesResponse listIgraphInstances(ListIgraphInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIgraphInstancesWithOptions(request, headers, runtime);
    }

    public ListInstanceGraphResponse listInstanceGraphWithOptions(String instanceId, ListInstanceGraphRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceGraph"),
            new TeaPair("version", "2021-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/igraph/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/graphs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceGraphResponse());
    }

    public ListInstanceGraphResponse listInstanceGraph(String instanceId, ListInstanceGraphRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceGraphWithOptions(instanceId, request, headers, runtime);
    }

    public PublishGraphSchemaResponse publishGraphSchemaWithOptions(String instanceId, String graphName, String graphSchemaName, PublishGraphSchemaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishGraphSchema"),
            new TeaPair("version", "2021-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/igraph/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/graphs/" + com.aliyun.openapiutil.Client.getEncodeParam(graphName) + "/schemas/" + com.aliyun.openapiutil.Client.getEncodeParam(graphSchemaName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishGraphSchemaResponse());
    }

    public PublishGraphSchemaResponse publishGraphSchema(String instanceId, String graphName, String graphSchemaName, PublishGraphSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishGraphSchemaWithOptions(instanceId, graphName, graphSchemaName, request, headers, runtime);
    }

    public SearchIgraphDemoResponse searchIgraphDemoWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchIgraphDemo"),
            new TeaPair("version", "2021-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/igraph/tool/actions/search_demo"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchIgraphDemoResponse());
    }

    public SearchIgraphDemoResponse searchIgraphDemo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchIgraphDemoWithOptions(headers, runtime);
    }

    public TriggerLabelBackflowResponse triggerLabelBackflowWithOptions(String instanceId, String graphName, String labelName, TriggerLabelBackflowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.odpsPartition)) {
            query.put("odpsPartition", request.odpsPartition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timestamp)) {
            query.put("timestamp", request.timestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TriggerLabelBackflow"),
            new TeaPair("version", "2021-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/igraph/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/graphs/" + com.aliyun.openapiutil.Client.getEncodeParam(graphName) + "/label/" + com.aliyun.openapiutil.Client.getEncodeParam(labelName) + "/backflow"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TriggerLabelBackflowResponse());
    }

    public TriggerLabelBackflowResponse triggerLabelBackflow(String instanceId, String graphName, String labelName, TriggerLabelBackflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.triggerLabelBackflowWithOptions(instanceId, graphName, labelName, request, headers, runtime);
    }

    public UpdateGraphDescriptionResponse updateGraphDescriptionWithOptions(String instanceId, String graphName, UpdateGraphDescriptionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGraphDescription"),
            new TeaPair("version", "2021-06-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/igraph/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/graphs/" + com.aliyun.openapiutil.Client.getEncodeParam(graphName) + "/description"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGraphDescriptionResponse());
    }

    public UpdateGraphDescriptionResponse updateGraphDescription(String instanceId, String graphName, UpdateGraphDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGraphDescriptionWithOptions(instanceId, graphName, request, headers, runtime);
    }
}
