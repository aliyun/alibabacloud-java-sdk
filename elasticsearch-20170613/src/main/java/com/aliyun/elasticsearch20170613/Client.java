// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613;

import com.aliyun.tea.*;
import com.aliyun.elasticsearch20170613.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("elasticsearch", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ActivateZonesResponse activateZonesWithOptions(String InstanceId, ActivateZonesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActivateZones"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/recover-zones"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActivateZonesResponse());
    }

    public ActivateZonesResponse activateZones(String InstanceId, ActivateZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.activateZonesWithOptions(InstanceId, request, headers, runtime);
    }

    public AddConnectableClusterResponse addConnectableClusterWithOptions(String InstanceId, AddConnectableClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddConnectableCluster"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/connected-clusters"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddConnectableClusterResponse());
    }

    public AddConnectableClusterResponse addConnectableCluster(String InstanceId, AddConnectableClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addConnectableClusterWithOptions(InstanceId, request, headers, runtime);
    }

    public AddSnapshotRepoResponse addSnapshotRepoWithOptions(String InstanceId, AddSnapshotRepoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSnapshotRepo"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/snapshot-repos"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSnapshotRepoResponse());
    }

    public AddSnapshotRepoResponse addSnapshotRepo(String InstanceId, AddSnapshotRepoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addSnapshotRepoWithOptions(InstanceId, request, headers, runtime);
    }

    public CancelDeletionResponse cancelDeletionWithOptions(String InstanceId, CancelDeletionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelDeletion"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/cancel-deletion"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelDeletionResponse());
    }

    public CancelDeletionResponse cancelDeletion(String InstanceId, CancelDeletionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelDeletionWithOptions(InstanceId, request, headers, runtime);
    }

    public CancelLogstashDeletionResponse cancelLogstashDeletionWithOptions(String InstanceId, CancelLogstashDeletionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelLogstashDeletion"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/cancel-deletion"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelLogstashDeletionResponse());
    }

    public CancelLogstashDeletionResponse cancelLogstashDeletion(String InstanceId, CancelLogstashDeletionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelLogstashDeletionWithOptions(InstanceId, request, headers, runtime);
    }

    public CancelTaskResponse cancelTaskWithOptions(String InstanceId, CancelTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("taskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelTask"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/cancel-task"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelTaskResponse());
    }

    public CancelTaskResponse cancelTask(String InstanceId, CancelTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelTaskWithOptions(InstanceId, request, headers, runtime);
    }

    public CapacityPlanResponse capacityPlanWithOptions(CapacityPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.complexQueryAvailable)) {
            body.put("complexQueryAvailable", request.complexQueryAvailable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataInfo)) {
            body.put("dataInfo", request.dataInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metric)) {
            body.put("metric", request.metric);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usageScenario)) {
            body.put("usageScenario", request.usageScenario);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CapacityPlan"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/assist/actions/capacity-plan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CapacityPlanResponse());
    }

    public CapacityPlanResponse capacityPlan(CapacityPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.capacityPlanWithOptions(request, headers, runtime);
    }

    public CloseDiagnosisResponse closeDiagnosisWithOptions(String InstanceId, CloseDiagnosisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseDiagnosis"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/diagnosis/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/close-diagnosis"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseDiagnosisResponse());
    }

    public CloseDiagnosisResponse closeDiagnosis(String InstanceId, CloseDiagnosisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeDiagnosisWithOptions(InstanceId, request, headers, runtime);
    }

    public CloseHttpsResponse closeHttpsWithOptions(String InstanceId, CloseHttpsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseHttps"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/close-https"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseHttpsResponse());
    }

    public CloseHttpsResponse closeHttps(String InstanceId, CloseHttpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeHttpsWithOptions(InstanceId, request, headers, runtime);
    }

    public CloseManagedIndexResponse closeManagedIndexWithOptions(String InstanceId, String Index, CloseManagedIndexRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseManagedIndex"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/indices/" + com.aliyun.openapiutil.Client.getEncodeParam(Index) + "/close-managed"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseManagedIndexResponse());
    }

    public CloseManagedIndexResponse closeManagedIndex(String InstanceId, String Index, CloseManagedIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeManagedIndexWithOptions(InstanceId, Index, request, headers, runtime);
    }

    public CreateCollectorResponse createCollectorWithOptions(CreateCollectorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collectorPaths)) {
            body.put("collectorPaths", request.collectorPaths);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configs)) {
            body.put("configs", request.configs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("dryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendConfigs)) {
            body.put("extendConfigs", request.extendConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resType)) {
            body.put("resType", request.resType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resVersion)) {
            body.put("resVersion", request.resVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("vpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCollector"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/collectors"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCollectorResponse());
    }

    public CreateCollectorResponse createCollector(CreateCollectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCollectorWithOptions(request, headers, runtime);
    }

    public CreateComponentIndexResponse createComponentIndexWithOptions(String InstanceId, String name, CreateComponentIndexRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.meta)) {
            body.put("_meta", request.meta);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.template)) {
            body.put("template", request.template);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateComponentIndex"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/component-index/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateComponentIndexResponse());
    }

    public CreateComponentIndexResponse createComponentIndex(String InstanceId, String name, CreateComponentIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createComponentIndexWithOptions(InstanceId, name, request, headers, runtime);
    }

    public CreateDataStreamResponse createDataStreamWithOptions(String InstanceId, CreateDataStreamRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataStream"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/data-streams"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataStreamResponse());
    }

    public CreateDataStreamResponse createDataStream(String InstanceId, CreateDataStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataStreamWithOptions(InstanceId, request, headers, runtime);
    }

    /**
      * @deprecated
      * Before you call this operation, note that:
      * *   Currently, the one-click index migration feature only supports the China (Beijing) region.
      * *   The source and destination Elasticsearch clusters must meet the following requirements: a user-created or Alibaba Cloud Elasticsearch Elasticsearch cluster with a source of version 6.7.0 and a Alibaba Cloud Elasticsearch Elasticsearch cluster with a destination of version 6.3.2 or 6.7.0.
      *
      * @param request CreateDataTasksRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateDataTasksResponse
     */
    // Deprecated
    public CreateDataTasksResponse createDataTasksWithOptions(String InstanceId, CreateDataTasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataTasks"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/data-task"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataTasksResponse());
    }

    /**
      * @deprecated
      * Before you call this operation, note that:
      * *   Currently, the one-click index migration feature only supports the China (Beijing) region.
      * *   The source and destination Elasticsearch clusters must meet the following requirements: a user-created or Alibaba Cloud Elasticsearch Elasticsearch cluster with a source of version 6.7.0 and a Alibaba Cloud Elasticsearch Elasticsearch cluster with a destination of version 6.3.2 or 6.7.0.
      *
      * @param request CreateDataTasksRequest
      * @return CreateDataTasksResponse
     */
    // Deprecated
    public CreateDataTasksResponse createDataTasks(String InstanceId, CreateDataTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataTasksWithOptions(InstanceId, request, headers, runtime);
    }

    public CreateILMPolicyResponse createILMPolicyWithOptions(String InstanceId, CreateILMPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateILMPolicy"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/ilm-policies"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateILMPolicyResponse());
    }

    public CreateILMPolicyResponse createILMPolicy(String InstanceId, CreateILMPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createILMPolicyWithOptions(InstanceId, request, headers, runtime);
    }

    public CreateIndexTemplateResponse createIndexTemplateWithOptions(String InstanceId, CreateIndexTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataStream)) {
            body.put("dataStream", request.dataStream);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ilmPolicy)) {
            body.put("ilmPolicy", request.ilmPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexPatterns)) {
            body.put("indexPatterns", request.indexPatterns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexTemplate)) {
            body.put("indexTemplate", request.indexTemplate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.template)) {
            body.put("template", request.template);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIndexTemplate"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/index-templates"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIndexTemplateResponse());
    }

    public CreateIndexTemplateResponse createIndexTemplate(String InstanceId, CreateIndexTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIndexTemplateWithOptions(InstanceId, request, headers, runtime);
    }

    public CreateLogstashResponse createLogstashWithOptions(CreateLogstashRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkConfig)) {
            body.put("networkConfig", request.networkConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeAmount)) {
            body.put("nodeAmount", request.nodeAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeSpec)) {
            body.put("nodeSpec", request.nodeSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentInfo)) {
            body.put("paymentInfo", request.paymentInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            body.put("paymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLogstash"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLogstashResponse());
    }

    public CreateLogstashResponse createLogstash(CreateLogstashRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLogstashWithOptions(request, headers, runtime);
    }

    public CreatePipelinesResponse createPipelinesWithOptions(String InstanceId, CreatePipelinesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trigger)) {
            query.put("trigger", request.trigger);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePipelines"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/pipelines"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePipelinesResponse());
    }

    public CreatePipelinesResponse createPipelines(String InstanceId, CreatePipelinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPipelinesWithOptions(InstanceId, request, headers, runtime);
    }

    public CreateSnapshotResponse createSnapshotWithOptions(String InstanceId, CreateSnapshotRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSnapshot"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/snapshots"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSnapshotResponse());
    }

    public CreateSnapshotResponse createSnapshot(String InstanceId, CreateSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSnapshotWithOptions(InstanceId, request, headers, runtime);
    }

    /**
      * 5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D\\*\\*\\*
      *
      * @param request CreateVpcEndpointRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateVpcEndpointResponse
     */
    public CreateVpcEndpointResponse createVpcEndpointWithOptions(String InstanceId, CreateVpcEndpointRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            body.put("serviceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            body.put("zoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVpcEndpoint"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/vpc-endpoints"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVpcEndpointResponse());
    }

    /**
      * 5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D\\*\\*\\*
      *
      * @param request CreateVpcEndpointRequest
      * @return CreateVpcEndpointResponse
     */
    public CreateVpcEndpointResponse createVpcEndpoint(String InstanceId, CreateVpcEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVpcEndpointWithOptions(InstanceId, request, headers, runtime);
    }

    public DeactivateZonesResponse deactivateZonesWithOptions(String InstanceId, DeactivateZonesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeactivateZones"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/down-zones"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeactivateZonesResponse());
    }

    public DeactivateZonesResponse deactivateZones(String InstanceId, DeactivateZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deactivateZonesWithOptions(InstanceId, request, headers, runtime);
    }

    public DeleteCollectorResponse deleteCollectorWithOptions(String ResId, DeleteCollectorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCollector"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/collectors/" + com.aliyun.openapiutil.Client.getEncodeParam(ResId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCollectorResponse());
    }

    public DeleteCollectorResponse deleteCollector(String ResId, DeleteCollectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCollectorWithOptions(ResId, request, headers, runtime);
    }

    public DeleteComponentIndexResponse deleteComponentIndexWithOptions(String InstanceId, String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteComponentIndex"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/component-index/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteComponentIndexResponse());
    }

    public DeleteComponentIndexResponse deleteComponentIndex(String InstanceId, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteComponentIndexWithOptions(InstanceId, name, headers, runtime);
    }

    public DeleteConnectedClusterResponse deleteConnectedClusterWithOptions(String InstanceId, DeleteConnectedClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectedInstanceId)) {
            query.put("connectedInstanceId", request.connectedInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConnectedCluster"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/connected-clusters"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConnectedClusterResponse());
    }

    public DeleteConnectedClusterResponse deleteConnectedCluster(String InstanceId, DeleteConnectedClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConnectedClusterWithOptions(InstanceId, request, headers, runtime);
    }

    public DeleteDataStreamResponse deleteDataStreamWithOptions(String InstanceId, String DataStream, DeleteDataStreamRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataStream"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/data-streams/" + com.aliyun.openapiutil.Client.getEncodeParam(DataStream) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataStreamResponse());
    }

    public DeleteDataStreamResponse deleteDataStream(String InstanceId, String DataStream, DeleteDataStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDataStreamWithOptions(InstanceId, DataStream, request, headers, runtime);
    }

    public DeleteDataTaskResponse deleteDataTaskWithOptions(String InstanceId, DeleteDataTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataTask"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/data-task"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataTaskResponse());
    }

    public DeleteDataTaskResponse deleteDataTask(String InstanceId, DeleteDataTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDataTaskWithOptions(InstanceId, request, headers, runtime);
    }

    public DeleteDeprecatedTemplateResponse deleteDeprecatedTemplateWithOptions(String InstanceId, String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeprecatedTemplate"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/deprecated-templates/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeprecatedTemplateResponse());
    }

    public DeleteDeprecatedTemplateResponse deleteDeprecatedTemplate(String InstanceId, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDeprecatedTemplateWithOptions(InstanceId, name, headers, runtime);
    }

    public DeleteILMPolicyResponse deleteILMPolicyWithOptions(String InstanceId, String PolicyName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteILMPolicy"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/ilm-policies/" + com.aliyun.openapiutil.Client.getEncodeParam(PolicyName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteILMPolicyResponse());
    }

    public DeleteILMPolicyResponse deleteILMPolicy(String InstanceId, String PolicyName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteILMPolicyWithOptions(InstanceId, PolicyName, headers, runtime);
    }

    public DeleteIndexTemplateResponse deleteIndexTemplateWithOptions(String InstanceId, String IndexTemplate, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIndexTemplate"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/index-templates/" + com.aliyun.openapiutil.Client.getEncodeParam(IndexTemplate) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIndexTemplateResponse());
    }

    public DeleteIndexTemplateResponse deleteIndexTemplate(String InstanceId, String IndexTemplate) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIndexTemplateWithOptions(InstanceId, IndexTemplate, headers, runtime);
    }

    public DeleteInstanceResponse deleteInstanceWithOptions(String InstanceId, DeleteInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteType)) {
            query.put("deleteType", request.deleteType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceResponse());
    }

    public DeleteInstanceResponse deleteInstance(String InstanceId, DeleteInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInstanceWithOptions(InstanceId, request, headers, runtime);
    }

    /**
      * Before you call this operation, take note of the following information: After the cluster is released, the physical resources used by the cluster are reclaimed. The data stored in the cluster is deleted and cannot be recovered. The disks attached to the nodes in the cluster and the snapshots created for the cluster are released.
      *
      * @param request DeleteLogstashRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteLogstashResponse
     */
    public DeleteLogstashResponse deleteLogstashWithOptions(String InstanceId, DeleteLogstashRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteType)) {
            query.put("deleteType", request.deleteType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLogstash"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLogstashResponse());
    }

    /**
      * Before you call this operation, take note of the following information: After the cluster is released, the physical resources used by the cluster are reclaimed. The data stored in the cluster is deleted and cannot be recovered. The disks attached to the nodes in the cluster and the snapshots created for the cluster are released.
      *
      * @param request DeleteLogstashRequest
      * @return DeleteLogstashResponse
     */
    public DeleteLogstashResponse deleteLogstash(String InstanceId, DeleteLogstashRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLogstashWithOptions(InstanceId, request, headers, runtime);
    }

    public DeletePipelinesResponse deletePipelinesWithOptions(String InstanceId, DeletePipelinesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineIds)) {
            query.put("pipelineIds", request.pipelineIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePipelines"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/pipelines"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePipelinesResponse());
    }

    public DeletePipelinesResponse deletePipelines(String InstanceId, DeletePipelinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePipelinesWithOptions(InstanceId, request, headers, runtime);
    }

    public DeleteSnapshotRepoResponse deleteSnapshotRepoWithOptions(String InstanceId, DeleteSnapshotRepoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoPath)) {
            query.put("repoPath", request.repoPath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSnapshotRepo"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/snapshot-repos"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSnapshotRepoResponse());
    }

    public DeleteSnapshotRepoResponse deleteSnapshotRepo(String InstanceId, DeleteSnapshotRepoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSnapshotRepoWithOptions(InstanceId, request, headers, runtime);
    }

    public DeleteVpcEndpointResponse deleteVpcEndpointWithOptions(String InstanceId, String EndpointId, DeleteVpcEndpointRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVpcEndpoint"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/vpc-endpoints/" + com.aliyun.openapiutil.Client.getEncodeParam(EndpointId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVpcEndpointResponse());
    }

    public DeleteVpcEndpointResponse deleteVpcEndpoint(String InstanceId, String EndpointId, DeleteVpcEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteVpcEndpointWithOptions(InstanceId, EndpointId, request, headers, runtime);
    }

    /**
      * > Before you install a shipper on an ACK cluster, you can call this operation to query the installation status of ES-operator for the ACK cluster.
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeAckOperatorResponse
     */
    public DescribeAckOperatorResponse describeAckOperatorWithOptions(String ClusterId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAckOperator"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ack-clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/operator"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAckOperatorResponse());
    }

    /**
      * > Before you install a shipper on an ACK cluster, you can call this operation to query the installation status of ES-operator for the ACK cluster.
      *
      * @return DescribeAckOperatorResponse
     */
    public DescribeAckOperatorResponse describeAckOperator(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAckOperatorWithOptions(ClusterId, headers, runtime);
    }

    public DescribeApmResponse describeApmWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApm"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/apm/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApmResponse());
    }

    public DescribeApmResponse describeApm(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApmWithOptions(instanceId, headers, runtime);
    }

    public DescribeCollectorResponse describeCollectorWithOptions(String ResId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCollector"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/collectors/" + com.aliyun.openapiutil.Client.getEncodeParam(ResId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCollectorResponse());
    }

    public DescribeCollectorResponse describeCollector(String ResId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeCollectorWithOptions(ResId, headers, runtime);
    }

    public DescribeComponentIndexResponse describeComponentIndexWithOptions(String InstanceId, String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeComponentIndex"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/component-index/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeComponentIndexResponse());
    }

    public DescribeComponentIndexResponse describeComponentIndex(String InstanceId, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeComponentIndexWithOptions(InstanceId, name, headers, runtime);
    }

    public DescribeConnectableClustersResponse describeConnectableClustersWithOptions(String InstanceId, DescribeConnectableClustersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alreadySetItems)) {
            query.put("alreadySetItems", request.alreadySetItems);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeConnectableClusters"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/connectable-clusters"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConnectableClustersResponse());
    }

    public DescribeConnectableClustersResponse describeConnectableClusters(String InstanceId, DescribeConnectableClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeConnectableClustersWithOptions(InstanceId, request, headers, runtime);
    }

    public DescribeDeprecatedTemplateResponse describeDeprecatedTemplateWithOptions(String InstanceId, String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDeprecatedTemplate"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/deprecated-templates/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDeprecatedTemplateResponse());
    }

    public DescribeDeprecatedTemplateResponse describeDeprecatedTemplate(String InstanceId, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeDeprecatedTemplateWithOptions(InstanceId, name, headers, runtime);
    }

    public DescribeDiagnoseReportResponse describeDiagnoseReportWithOptions(String InstanceId, String ReportId, DescribeDiagnoseReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDiagnoseReport"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/diagnosis/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/reports/" + com.aliyun.openapiutil.Client.getEncodeParam(ReportId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDiagnoseReportResponse());
    }

    public DescribeDiagnoseReportResponse describeDiagnoseReport(String InstanceId, String ReportId, DescribeDiagnoseReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeDiagnoseReportWithOptions(InstanceId, ReportId, request, headers, runtime);
    }

    public DescribeDiagnosisSettingsResponse describeDiagnosisSettingsWithOptions(String InstanceId, DescribeDiagnosisSettingsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDiagnosisSettings"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/diagnosis/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/settings"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDiagnosisSettingsResponse());
    }

    public DescribeDiagnosisSettingsResponse describeDiagnosisSettings(String InstanceId, DescribeDiagnosisSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeDiagnosisSettingsWithOptions(InstanceId, request, headers, runtime);
    }

    public DescribeDynamicSettingsResponse describeDynamicSettingsWithOptions(String InstanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDynamicSettings"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/dynamic-settings"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDynamicSettingsResponse());
    }

    public DescribeDynamicSettingsResponse describeDynamicSettings(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeDynamicSettingsWithOptions(InstanceId, headers, runtime);
    }

    /**
      * An Elasticsearch cluster can be in a health state indicated by one of the following colors:
      * *   GREEN: Primary shards and replica shards for the primary shards are normally allocated.
      * *   YELLOW: Primary shards are normally allocated, but replica shards for the primary shards are not normally allocated.
      * *   RED: Primary shards are not normally allocated.
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeElasticsearchHealthResponse
     */
    public DescribeElasticsearchHealthResponse describeElasticsearchHealthWithOptions(String InstanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeElasticsearchHealth"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/elasticsearch-health"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeElasticsearchHealthResponse());
    }

    /**
      * An Elasticsearch cluster can be in a health state indicated by one of the following colors:
      * *   GREEN: Primary shards and replica shards for the primary shards are normally allocated.
      * *   YELLOW: Primary shards are normally allocated, but replica shards for the primary shards are not normally allocated.
      * *   RED: Primary shards are not normally allocated.
      *
      * @return DescribeElasticsearchHealthResponse
     */
    public DescribeElasticsearchHealthResponse describeElasticsearchHealth(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeElasticsearchHealthWithOptions(InstanceId, headers, runtime);
    }

    public DescribeILMPolicyResponse describeILMPolicyWithOptions(String InstanceId, String PolicyName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeILMPolicy"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/ilm-policies/" + com.aliyun.openapiutil.Client.getEncodeParam(PolicyName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeILMPolicyResponse());
    }

    public DescribeILMPolicyResponse describeILMPolicy(String InstanceId, String PolicyName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeILMPolicyWithOptions(InstanceId, PolicyName, headers, runtime);
    }

    public DescribeIndexTemplateResponse describeIndexTemplateWithOptions(String InstanceId, String IndexTemplate, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIndexTemplate"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/index-templates/" + com.aliyun.openapiutil.Client.getEncodeParam(IndexTemplate) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIndexTemplateResponse());
    }

    public DescribeIndexTemplateResponse describeIndexTemplate(String InstanceId, String IndexTemplate) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeIndexTemplateWithOptions(InstanceId, IndexTemplate, headers, runtime);
    }

    public DescribeInstanceResponse describeInstanceWithOptions(String InstanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstance"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceResponse());
    }

    public DescribeInstanceResponse describeInstance(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeInstanceWithOptions(InstanceId, headers, runtime);
    }

    public DescribeKibanaSettingsResponse describeKibanaSettingsWithOptions(String InstanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeKibanaSettings"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/kibana-settings"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeKibanaSettingsResponse());
    }

    public DescribeKibanaSettingsResponse describeKibanaSettings(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeKibanaSettingsWithOptions(InstanceId, headers, runtime);
    }

    public DescribeLogstashResponse describeLogstashWithOptions(String InstanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLogstash"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLogstashResponse());
    }

    public DescribeLogstashResponse describeLogstash(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeLogstashWithOptions(InstanceId, headers, runtime);
    }

    public DescribePipelineResponse describePipelineWithOptions(String InstanceId, String PipelineId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePipeline"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/pipelines/" + com.aliyun.openapiutil.Client.getEncodeParam(PipelineId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePipelineResponse());
    }

    public DescribePipelineResponse describePipeline(String InstanceId, String PipelineId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePipelineWithOptions(InstanceId, PipelineId, headers, runtime);
    }

    public DescribePipelineManagementConfigResponse describePipelineManagementConfigWithOptions(String InstanceId, DescribePipelineManagementConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePipelineManagementConfig"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/pipeline-management-config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePipelineManagementConfigResponse());
    }

    public DescribePipelineManagementConfigResponse describePipelineManagementConfig(String InstanceId, DescribePipelineManagementConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePipelineManagementConfigWithOptions(InstanceId, request, headers, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/regions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRegionsWithOptions(headers, runtime);
    }

    public DescribeSnapshotSettingResponse describeSnapshotSettingWithOptions(String InstanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSnapshotSetting"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/snapshot-setting"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSnapshotSettingResponse());
    }

    public DescribeSnapshotSettingResponse describeSnapshotSetting(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeSnapshotSettingWithOptions(InstanceId, headers, runtime);
    }

    public DescribeTemplatesResponse describeTemplatesWithOptions(String InstanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTemplates"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/templates"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTemplatesResponse());
    }

    public DescribeTemplatesResponse describeTemplates(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeTemplatesWithOptions(InstanceId, headers, runtime);
    }

    public DescribeXpackMonitorConfigResponse describeXpackMonitorConfigWithOptions(String InstanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeXpackMonitorConfig"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/xpack-monitor-config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeXpackMonitorConfigResponse());
    }

    public DescribeXpackMonitorConfigResponse describeXpackMonitorConfig(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeXpackMonitorConfigWithOptions(InstanceId, headers, runtime);
    }

    public DiagnoseInstanceResponse diagnoseInstanceWithOptions(String InstanceId, DiagnoseInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("lang", request.lang);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diagnoseItems)) {
            body.put("diagnoseItems", request.diagnoseItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indices)) {
            body.put("indices", request.indices);
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
            new TeaPair("action", "DiagnoseInstance"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/diagnosis/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/diagnose"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DiagnoseInstanceResponse());
    }

    public DiagnoseInstanceResponse diagnoseInstance(String InstanceId, DiagnoseInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.diagnoseInstanceWithOptions(InstanceId, request, headers, runtime);
    }

    public DisableKibanaPvlNetworkResponse disableKibanaPvlNetworkWithOptions(String InstanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableKibanaPvlNetwork"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/disable-kibana-private"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableKibanaPvlNetworkResponse());
    }

    public DisableKibanaPvlNetworkResponse disableKibanaPvlNetwork(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableKibanaPvlNetworkWithOptions(InstanceId, headers, runtime);
    }

    public EnableKibanaPvlNetworkResponse enableKibanaPvlNetworkWithOptions(String InstanceId, EnableKibanaPvlNetworkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpointName)) {
            body.put("endpointName", request.endpointName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroups)) {
            body.put("securityGroups", request.securityGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIdsZone)) {
            body.put("vSwitchIdsZone", request.vSwitchIdsZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("vpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableKibanaPvlNetwork"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/enable-kibana-private"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableKibanaPvlNetworkResponse());
    }

    public EnableKibanaPvlNetworkResponse enableKibanaPvlNetwork(String InstanceId, EnableKibanaPvlNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableKibanaPvlNetworkWithOptions(InstanceId, request, headers, runtime);
    }

    public EstimatedLogstashRestartTimeResponse estimatedLogstashRestartTimeWithOptions(String InstanceId, EstimatedLogstashRestartTimeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("force", request.force);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EstimatedLogstashRestartTime"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/estimated-time/restart-time"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EstimatedLogstashRestartTimeResponse());
    }

    public EstimatedLogstashRestartTimeResponse estimatedLogstashRestartTime(String InstanceId, EstimatedLogstashRestartTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.estimatedLogstashRestartTimeWithOptions(InstanceId, request, headers, runtime);
    }

    public EstimatedRestartTimeResponse estimatedRestartTimeWithOptions(String InstanceId, EstimatedRestartTimeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("force", request.force);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EstimatedRestartTime"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/estimated-time/restart-time"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EstimatedRestartTimeResponse());
    }

    public EstimatedRestartTimeResponse estimatedRestartTime(String InstanceId, EstimatedRestartTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.estimatedRestartTimeWithOptions(InstanceId, request, headers, runtime);
    }

    public GetClusterDataInformationResponse getClusterDataInformationWithOptions(GetClusterDataInformationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClusterDataInformation"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/cluster/data-information"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterDataInformationResponse());
    }

    public GetClusterDataInformationResponse getClusterDataInformation(GetClusterDataInformationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterDataInformationWithOptions(request, headers, runtime);
    }

    public GetElastictaskResponse getElastictaskWithOptions(String InstanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetElastictask"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/elastic-task"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetElastictaskResponse());
    }

    public GetElastictaskResponse getElastictask(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getElastictaskWithOptions(InstanceId, headers, runtime);
    }

    public GetEmonGrafanaAlertsResponse getEmonGrafanaAlertsWithOptions(String ProjectId, GetEmonGrafanaAlertsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEmonGrafanaAlerts"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/emon/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/grafana/proxy/api/alerts"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEmonGrafanaAlertsResponse());
    }

    public GetEmonGrafanaAlertsResponse getEmonGrafanaAlerts(String ProjectId, GetEmonGrafanaAlertsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEmonGrafanaAlertsWithOptions(ProjectId, request, headers, runtime);
    }

    public GetEmonGrafanaDashboardsResponse getEmonGrafanaDashboardsWithOptions(String ProjectId, GetEmonGrafanaDashboardsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEmonGrafanaDashboards"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/emon/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/grafana/proxy/api/search"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEmonGrafanaDashboardsResponse());
    }

    public GetEmonGrafanaDashboardsResponse getEmonGrafanaDashboards(String ProjectId, GetEmonGrafanaDashboardsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEmonGrafanaDashboardsWithOptions(ProjectId, request, headers, runtime);
    }

    public GetEmonMonitorDataResponse getEmonMonitorDataWithOptions(String ProjectId, GetEmonMonitorDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEmonMonitorData"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/emon/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/metrics/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEmonMonitorDataResponse());
    }

    public GetEmonMonitorDataResponse getEmonMonitorData(String ProjectId, GetEmonMonitorDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEmonMonitorDataWithOptions(ProjectId, request, headers, runtime);
    }

    public GetOpenStoreUsageResponse getOpenStoreUsageWithOptions(String InstanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOpenStoreUsage"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/openstore/usage"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOpenStoreUsageResponse());
    }

    public GetOpenStoreUsageResponse getOpenStoreUsage(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOpenStoreUsageWithOptions(InstanceId, headers, runtime);
    }

    public GetRegionConfigurationResponse getRegionConfigurationWithOptions(GetRegionConfigurationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("zoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRegionConfiguration"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/region"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRegionConfigurationResponse());
    }

    public GetRegionConfigurationResponse getRegionConfiguration(GetRegionConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRegionConfigurationWithOptions(request, headers, runtime);
    }

    public GetRegionalInstanceConfigResponse getRegionalInstanceConfigWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRegionalInstanceConfig"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/regions/instance-config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRegionalInstanceConfigResponse());
    }

    public GetRegionalInstanceConfigResponse getRegionalInstanceConfig() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRegionalInstanceConfigWithOptions(headers, runtime);
    }

    public GetSuggestShrinkableNodesResponse getSuggestShrinkableNodesWithOptions(String InstanceId, GetSuggestShrinkableNodesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            query.put("count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreStatus)) {
            query.put("ignoreStatus", request.ignoreStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            query.put("nodeType", request.nodeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSuggestShrinkableNodes"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/suggest-shrinkable-nodes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSuggestShrinkableNodesResponse());
    }

    public GetSuggestShrinkableNodesResponse getSuggestShrinkableNodes(String InstanceId, GetSuggestShrinkableNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSuggestShrinkableNodesWithOptions(InstanceId, request, headers, runtime);
    }

    public GetTransferableNodesResponse getTransferableNodesWithOptions(String InstanceId, GetTransferableNodesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            query.put("count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            query.put("nodeType", request.nodeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTransferableNodes"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/transferable-nodes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTransferableNodesResponse());
    }

    public GetTransferableNodesResponse getTransferableNodes(String InstanceId, GetTransferableNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTransferableNodesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
      * > Before you perform auto scaling for a cluster at the China site (aliyun.com) or you use shippers to collect logs, you must create a service-linked role.
      *
      * @param request InitializeOperationRoleRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return InitializeOperationRoleResponse
     */
    public InitializeOperationRoleResponse initializeOperationRoleWithOptions(InitializeOperationRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitializeOperationRole"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/user/slr"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitializeOperationRoleResponse());
    }

    /**
      * > Before you perform auto scaling for a cluster at the China site (aliyun.com) or you use shippers to collect logs, you must create a service-linked role.
      *
      * @param request InitializeOperationRoleRequest
      * @return InitializeOperationRoleResponse
     */
    public InitializeOperationRoleResponse initializeOperationRole(InitializeOperationRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initializeOperationRoleWithOptions(request, headers, runtime);
    }

    /**
      * > Before you install a shipper for an ACK cluster, you must call this operation to install ES-operator for the cluster.
      *
      * @param request InstallAckOperatorRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return InstallAckOperatorResponse
     */
    public InstallAckOperatorResponse installAckOperatorWithOptions(String ClusterId, InstallAckOperatorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallAckOperator"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ack-clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/operator"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallAckOperatorResponse());
    }

    /**
      * > Before you install a shipper for an ACK cluster, you must call this operation to install ES-operator for the cluster.
      *
      * @param request InstallAckOperatorRequest
      * @return InstallAckOperatorResponse
     */
    public InstallAckOperatorResponse installAckOperator(String ClusterId, InstallAckOperatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installAckOperatorWithOptions(ClusterId, request, headers, runtime);
    }

    public InstallKibanaSystemPluginResponse installKibanaSystemPluginWithOptions(String InstanceId, InstallKibanaSystemPluginRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallKibanaSystemPlugin"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/kibana-plugins/system/actions/install"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallKibanaSystemPluginResponse());
    }

    public InstallKibanaSystemPluginResponse installKibanaSystemPlugin(String InstanceId, InstallKibanaSystemPluginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installKibanaSystemPluginWithOptions(InstanceId, request, headers, runtime);
    }

    /**
      * ls-cn-oew1qbgl\\*\\*\\*\\*
      *
      * @param request InstallLogstashSystemPluginRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return InstallLogstashSystemPluginResponse
     */
    public InstallLogstashSystemPluginResponse installLogstashSystemPluginWithOptions(String InstanceId, InstallLogstashSystemPluginRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallLogstashSystemPlugin"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/plugins/system/actions/install"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallLogstashSystemPluginResponse());
    }

    /**
      * ls-cn-oew1qbgl\\*\\*\\*\\*
      *
      * @param request InstallLogstashSystemPluginRequest
      * @return InstallLogstashSystemPluginResponse
     */
    public InstallLogstashSystemPluginResponse installLogstashSystemPlugin(String InstanceId, InstallLogstashSystemPluginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installLogstashSystemPluginWithOptions(InstanceId, request, headers, runtime);
    }

    public InstallSystemPluginResponse installSystemPluginWithOptions(String InstanceId, InstallSystemPluginRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallSystemPlugin"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/plugins/system/actions/install"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallSystemPluginResponse());
    }

    public InstallSystemPluginResponse installSystemPlugin(String InstanceId, InstallSystemPluginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installSystemPluginWithOptions(InstanceId, request, headers, runtime);
    }

    public InstallUserPluginsResponse installUserPluginsWithOptions(String InstanceId, InstallUserPluginsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallUserPlugins"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/plugins/user/actions/install"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallUserPluginsResponse());
    }

    public InstallUserPluginsResponse installUserPlugins(String InstanceId, InstallUserPluginsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installUserPluginsWithOptions(InstanceId, request, headers, runtime);
    }

    public InterruptElasticsearchTaskResponse interruptElasticsearchTaskWithOptions(String InstanceId, InterruptElasticsearchTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InterruptElasticsearchTask"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/interrupt"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InterruptElasticsearchTaskResponse());
    }

    public InterruptElasticsearchTaskResponse interruptElasticsearchTask(String InstanceId, InterruptElasticsearchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.interruptElasticsearchTaskWithOptions(InstanceId, request, headers, runtime);
    }

    public InterruptLogstashTaskResponse interruptLogstashTaskWithOptions(String InstanceId, InterruptLogstashTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InterruptLogstashTask"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/interrupt"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InterruptLogstashTaskResponse());
    }

    public InterruptLogstashTaskResponse interruptLogstashTask(String InstanceId, InterruptLogstashTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.interruptLogstashTaskWithOptions(InstanceId, request, headers, runtime);
    }

    public ListAckClustersResponse listAckClustersWithOptions(ListAckClustersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("vpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAckClusters"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ack-clusters"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAckClustersResponse());
    }

    public ListAckClustersResponse listAckClusters(ListAckClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAckClustersWithOptions(request, headers, runtime);
    }

    /**
      * > When you install a shipper on an ACK cluster, you must specify a namespace. You can call this operation to query all namespaces in the ACK cluster, and select a namespace based on your business requirements.
      *
      * @param request ListAckNamespacesRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListAckNamespacesResponse
     */
    public ListAckNamespacesResponse listAckNamespacesWithOptions(String ClusterId, ListAckNamespacesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAckNamespaces"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ack-clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(ClusterId) + "/namespaces"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAckNamespacesResponse());
    }

    /**
      * > When you install a shipper on an ACK cluster, you must specify a namespace. You can call this operation to query all namespaces in the ACK cluster, and select a namespace based on your business requirements.
      *
      * @param request ListAckNamespacesRequest
      * @return ListAckNamespacesResponse
     */
    public ListAckNamespacesResponse listAckNamespaces(String ClusterId, ListAckNamespacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAckNamespacesWithOptions(ClusterId, request, headers, runtime);
    }

    public ListActionRecordsResponse listActionRecordsWithOptions(String InstanceId, ListActionRecordsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionNames)) {
            query.put("actionNames", request.actionNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListActionRecords"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/action-records"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListActionRecordsResponse());
    }

    public ListActionRecordsResponse listActionRecords(String InstanceId, ListActionRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listActionRecordsWithOptions(InstanceId, request, headers, runtime);
    }

    public ListAllNodeResponse listAllNodeWithOptions(String InstanceId, ListAllNodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extended)) {
            query.put("extended", request.extended);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAllNode"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/nodes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAllNodeResponse());
    }

    public ListAllNodeResponse listAllNode(String InstanceId, ListAllNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAllNodeWithOptions(InstanceId, request, headers, runtime);
    }

    public ListAlternativeSnapshotReposResponse listAlternativeSnapshotReposWithOptions(String InstanceId, ListAlternativeSnapshotReposRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alreadySetItems)) {
            query.put("alreadySetItems", request.alreadySetItems);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlternativeSnapshotRepos"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/alternative-snapshot-repos"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlternativeSnapshotReposResponse());
    }

    public ListAlternativeSnapshotReposResponse listAlternativeSnapshotRepos(String InstanceId, ListAlternativeSnapshotReposRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAlternativeSnapshotReposWithOptions(InstanceId, request, headers, runtime);
    }

    public ListApmResponse listApmWithOptions(ListApmRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            query.put("output", request.output);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApm"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/apm"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApmResponse());
    }

    public ListApmResponse listApm(ListApmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApmWithOptions(request, headers, runtime);
    }

    public ListAvailableEsInstanceIdsResponse listAvailableEsInstanceIdsWithOptions(String InstanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAvailableEsInstanceIds"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/available-elasticsearch-for-centralized-management"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAvailableEsInstanceIdsResponse());
    }

    public ListAvailableEsInstanceIdsResponse listAvailableEsInstanceIds(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAvailableEsInstanceIdsWithOptions(InstanceId, headers, runtime);
    }

    public ListCollectorsResponse listCollectorsWithOptions(ListCollectorsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resId)) {
            query.put("resId", request.resId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("sourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCollectors"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/collectors"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCollectorsResponse());
    }

    public ListCollectorsResponse listCollectors(ListCollectorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCollectorsWithOptions(request, headers, runtime);
    }

    public ListComponentIndicesResponse listComponentIndicesWithOptions(String InstanceId, ListComponentIndicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListComponentIndices"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/component-index"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListComponentIndicesResponse());
    }

    public ListComponentIndicesResponse listComponentIndices(String InstanceId, ListComponentIndicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listComponentIndicesWithOptions(InstanceId, request, headers, runtime);
    }

    public ListConnectedClustersResponse listConnectedClustersWithOptions(String InstanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConnectedClusters"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/connected-clusters"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConnectedClustersResponse());
    }

    public ListConnectedClustersResponse listConnectedClusters(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConnectedClustersWithOptions(InstanceId, headers, runtime);
    }

    public ListDataStreamsResponse listDataStreamsWithOptions(String InstanceId, ListDataStreamsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isManaged)) {
            query.put("isManaged", request.isManaged);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataStreams"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/data-streams"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataStreamsResponse());
    }

    public ListDataStreamsResponse listDataStreams(String InstanceId, ListDataStreamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataStreamsWithOptions(InstanceId, request, headers, runtime);
    }

    public ListDataTasksResponse listDataTasksWithOptions(String InstanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataTasks"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/data-task"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataTasksResponse());
    }

    public ListDataTasksResponse listDataTasks(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataTasksWithOptions(InstanceId, headers, runtime);
    }

    public ListDefaultCollectorConfigurationsResponse listDefaultCollectorConfigurationsWithOptions(ListDefaultCollectorConfigurationsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resType)) {
            query.put("resType", request.resType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resVersion)) {
            query.put("resVersion", request.resVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("sourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDefaultCollectorConfigurations"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/beats/default-configurations"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDefaultCollectorConfigurationsResponse());
    }

    public ListDefaultCollectorConfigurationsResponse listDefaultCollectorConfigurations(ListDefaultCollectorConfigurationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDefaultCollectorConfigurationsWithOptions(request, headers, runtime);
    }

    public ListDeprecatedTemplatesResponse listDeprecatedTemplatesWithOptions(String InstanceId, ListDeprecatedTemplatesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeprecatedTemplates"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/deprecated-templates"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeprecatedTemplatesResponse());
    }

    public ListDeprecatedTemplatesResponse listDeprecatedTemplates(String InstanceId, ListDeprecatedTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDeprecatedTemplatesWithOptions(InstanceId, request, headers, runtime);
    }

    public ListDiagnoseIndicesResponse listDiagnoseIndicesWithOptions(String InstanceId, ListDiagnoseIndicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDiagnoseIndices"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/diagnosis/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/indices"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDiagnoseIndicesResponse());
    }

    public ListDiagnoseIndicesResponse listDiagnoseIndices(String InstanceId, ListDiagnoseIndicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDiagnoseIndicesWithOptions(InstanceId, request, headers, runtime);
    }

    public ListDiagnoseReportResponse listDiagnoseReportWithOptions(String InstanceId, ListDiagnoseReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.detail)) {
            query.put("detail", request.detail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trigger)) {
            query.put("trigger", request.trigger);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDiagnoseReport"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/diagnosis/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/reports"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDiagnoseReportResponse());
    }

    public ListDiagnoseReportResponse listDiagnoseReport(String InstanceId, ListDiagnoseReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDiagnoseReportWithOptions(InstanceId, request, headers, runtime);
    }

    public ListDiagnoseReportIdsResponse listDiagnoseReportIdsWithOptions(String InstanceId, ListDiagnoseReportIdsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trigger)) {
            query.put("trigger", request.trigger);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDiagnoseReportIds"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/diagnosis/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/report-ids"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDiagnoseReportIdsResponse());
    }

    public ListDiagnoseReportIdsResponse listDiagnoseReportIds(String InstanceId, ListDiagnoseReportIdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDiagnoseReportIdsWithOptions(InstanceId, request, headers, runtime);
    }

    public ListDiagnosisItemsResponse listDiagnosisItemsWithOptions(ListDiagnosisItemsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDiagnosisItems"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/diagnosis/items"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDiagnosisItemsResponse());
    }

    public ListDiagnosisItemsResponse listDiagnosisItems(ListDiagnosisItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDiagnosisItemsWithOptions(request, headers, runtime);
    }

    public ListDictInformationResponse listDictInformationWithOptions(String InstanceId, ListDictInformationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analyzerType)) {
            query.put("analyzerType", request.analyzerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("bucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("key", request.key);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDictInformation"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/dict/_info"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDictInformationResponse());
    }

    public ListDictInformationResponse listDictInformation(String InstanceId, ListDictInformationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDictInformationWithOptions(InstanceId, request, headers, runtime);
    }

    public ListDictsResponse listDictsWithOptions(String InstanceId, ListDictsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analyzerType)) {
            query.put("analyzerType", request.analyzerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDicts"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/dicts"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDictsResponse());
    }

    public ListDictsResponse listDicts(String InstanceId, ListDictsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDictsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
      * **Important** To call this operation, you must create the Aliyun Elasticsearch AccessingOOSRole and the system service role AliyunOOSAccessingECS 4ESRole to Elasticsearch the service account to obtain the ECS access permissions of the primary account. For more information, see [Collect ECS service logs](~~146446~~).
      *
      * @param request ListEcsInstancesRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListEcsInstancesResponse
     */
    public ListEcsInstancesResponse listEcsInstancesWithOptions(ListEcsInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ecsInstanceIds)) {
            query.put("ecsInstanceIds", request.ecsInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsInstanceName)) {
            query.put("ecsInstanceName", request.ecsInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("vpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEcsInstances"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/ecs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEcsInstancesResponse());
    }

    /**
      * **Important** To call this operation, you must create the Aliyun Elasticsearch AccessingOOSRole and the system service role AliyunOOSAccessingECS 4ESRole to Elasticsearch the service account to obtain the ECS access permissions of the primary account. For more information, see [Collect ECS service logs](~~146446~~).
      *
      * @param request ListEcsInstancesRequest
      * @return ListEcsInstancesResponse
     */
    public ListEcsInstancesResponse listEcsInstances(ListEcsInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEcsInstancesWithOptions(request, headers, runtime);
    }

    public ListExtendfilesResponse listExtendfilesWithOptions(String InstanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExtendfiles"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/extendfiles"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExtendfilesResponse());
    }

    public ListExtendfilesResponse listExtendfiles(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listExtendfilesWithOptions(InstanceId, headers, runtime);
    }

    public ListILMPoliciesResponse listILMPoliciesWithOptions(String InstanceId, ListILMPoliciesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("policyName", request.policyName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListILMPolicies"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/ilm-policies"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListILMPoliciesResponse());
    }

    public ListILMPoliciesResponse listILMPolicies(String InstanceId, ListILMPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listILMPoliciesWithOptions(InstanceId, request, headers, runtime);
    }

    public ListIndexTemplatesResponse listIndexTemplatesWithOptions(String InstanceId, ListIndexTemplatesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.indexTemplate)) {
            query.put("indexTemplate", request.indexTemplate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIndexTemplates"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/index-templates"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIndexTemplatesResponse());
    }

    public ListIndexTemplatesResponse listIndexTemplates(String InstanceId, ListIndexTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIndexTemplatesWithOptions(InstanceId, request, headers, runtime);
    }

    public ListInstanceResponse listInstanceWithOptions(ListInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.esVersion)) {
            query.put("esVersion", request.esVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceCategory)) {
            query.put("instanceCategory", request.instanceCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("paymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("vpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("zoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstance"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceResponse());
    }

    public ListInstanceResponse listInstance(ListInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceWithOptions(request, headers, runtime);
    }

    public ListInstanceHistoryEventsResponse listInstanceHistoryEventsWithOptions(ListInstanceHistoryEventsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListInstanceHistoryEventsShrinkRequest request = new ListInstanceHistoryEventsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.eventCycleStatus)) {
            request.eventCycleStatusShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.eventCycleStatus, "eventCycleStatus", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.eventLevel)) {
            request.eventLevelShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.eventLevel, "eventLevel", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.eventType)) {
            request.eventTypeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.eventType, "eventType", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventCreateEndTime)) {
            query.put("eventCreateEndTime", request.eventCreateEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCreateStartTime)) {
            query.put("eventCreateStartTime", request.eventCreateStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCycleStatusShrink)) {
            query.put("eventCycleStatus", request.eventCycleStatusShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventExecuteEndTime)) {
            query.put("eventExecuteEndTime", request.eventExecuteEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventExecuteStartTime)) {
            query.put("eventExecuteStartTime", request.eventExecuteStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventFinashEndTime)) {
            query.put("eventFinashEndTime", request.eventFinashEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventFinashStartTime)) {
            query.put("eventFinashStartTime", request.eventFinashStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventLevelShrink)) {
            query.put("eventLevel", request.eventLevelShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventTypeShrink)) {
            query.put("eventType", request.eventTypeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIP)) {
            query.put("nodeIP", request.nodeIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceHistoryEvents"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/events"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceHistoryEventsResponse());
    }

    public ListInstanceHistoryEventsResponse listInstanceHistoryEvents(ListInstanceHistoryEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceHistoryEventsWithOptions(request, headers, runtime);
    }

    public ListInstanceIndicesResponse listInstanceIndicesWithOptions(String InstanceId, ListInstanceIndicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("all", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isManaged)) {
            query.put("isManaged", request.isManaged);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isOpenstore)) {
            query.put("isOpenstore", request.isOpenstore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceIndices"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/indices"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceIndicesResponse());
    }

    public ListInstanceIndicesResponse listInstanceIndices(String InstanceId, ListInstanceIndicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceIndicesWithOptions(InstanceId, request, headers, runtime);
    }

    public ListKibanaPluginsResponse listKibanaPluginsWithOptions(String InstanceId, ListKibanaPluginsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListKibanaPlugins"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/kibana-plugins"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListKibanaPluginsResponse());
    }

    public ListKibanaPluginsResponse listKibanaPlugins(String InstanceId, ListKibanaPluginsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listKibanaPluginsWithOptions(InstanceId, request, headers, runtime);
    }

    public ListKibanaPvlNetworkResponse listKibanaPvlNetworkWithOptions(String InstanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListKibanaPvlNetwork"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/get-kibana-private"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListKibanaPvlNetworkResponse());
    }

    public ListKibanaPvlNetworkResponse listKibanaPvlNetwork(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listKibanaPvlNetworkWithOptions(InstanceId, headers, runtime);
    }

    public ListLogstashResponse listLogstashWithOptions(ListLogstashRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLogstash"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLogstashResponse());
    }

    public ListLogstashResponse listLogstash(ListLogstashRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLogstashWithOptions(request, headers, runtime);
    }

    public ListLogstashLogResponse listLogstashLogWithOptions(String InstanceId, ListLogstashLogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("beginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLogstashLog"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/search-log"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLogstashLogResponse());
    }

    public ListLogstashLogResponse listLogstashLog(String InstanceId, ListLogstashLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLogstashLogWithOptions(InstanceId, request, headers, runtime);
    }

    public ListLogstashPluginsResponse listLogstashPluginsWithOptions(String InstanceId, ListLogstashPluginsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLogstashPlugins"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/plugins"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLogstashPluginsResponse());
    }

    public ListLogstashPluginsResponse listLogstashPlugins(String InstanceId, ListLogstashPluginsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLogstashPluginsWithOptions(InstanceId, request, headers, runtime);
    }

    public ListNodesResponse listNodesWithOptions(String ResId, ListNodesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ecsInstanceIds)) {
            query.put("ecsInstanceIds", request.ecsInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsInstanceName)) {
            query.put("ecsInstanceName", request.ecsInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodes"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/collectors/" + com.aliyun.openapiutil.Client.getEncodeParam(ResId) + "/nodes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodesResponse());
    }

    public ListNodesResponse listNodes(String ResId, ListNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNodesWithOptions(ResId, request, headers, runtime);
    }

    public ListPipelineResponse listPipelineWithOptions(String InstanceId, ListPipelineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("pipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPipeline"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/pipelines"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPipelineResponse());
    }

    public ListPipelineResponse listPipeline(String InstanceId, ListPipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelineWithOptions(InstanceId, request, headers, runtime);
    }

    public ListPipelineIdsResponse listPipelineIdsWithOptions(String InstanceId, ListPipelineIdsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPipelineIds"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/pipeline-ids"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPipelineIdsResponse());
    }

    public ListPipelineIdsResponse listPipelineIds(String InstanceId, ListPipelineIdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelineIdsWithOptions(InstanceId, request, headers, runtime);
    }

    public ListPluginsResponse listPluginsWithOptions(String InstanceId, ListPluginsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPlugins"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/plugins"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPluginsResponse());
    }

    public ListPluginsResponse listPlugins(String InstanceId, ListPluginsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPluginsWithOptions(InstanceId, request, headers, runtime);
    }

    public ListSearchLogResponse listSearchLogWithOptions(String InstanceId, ListSearchLogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("beginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSearchLog"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/search-log"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSearchLogResponse());
    }

    public ListSearchLogResponse listSearchLog(String InstanceId, ListSearchLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSearchLogWithOptions(InstanceId, request, headers, runtime);
    }

    /**
      * > The restoration of a shard is a process of synchronizing data from a primary shard to a replica shard. After the restoration is complete, the replica shard is available for data searches.
      *
      * @param request ListShardRecoveriesRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListShardRecoveriesResponse
     */
    public ListShardRecoveriesResponse listShardRecoveriesWithOptions(String InstanceId, ListShardRecoveriesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activeOnly)) {
            query.put("activeOnly", request.activeOnly);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListShardRecoveries"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/cat-recovery"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListShardRecoveriesResponse());
    }

    /**
      * > The restoration of a shard is a process of synchronizing data from a primary shard to a replica shard. After the restoration is complete, the replica shard is available for data searches.
      *
      * @param request ListShardRecoveriesRequest
      * @return ListShardRecoveriesResponse
     */
    public ListShardRecoveriesResponse listShardRecoveries(String InstanceId, ListShardRecoveriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listShardRecoveriesWithOptions(InstanceId, request, headers, runtime);
    }

    public ListSnapshotReposByInstanceIdResponse listSnapshotReposByInstanceIdWithOptions(String InstanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSnapshotReposByInstanceId"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/snapshot-repos"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSnapshotReposByInstanceIdResponse());
    }

    public ListSnapshotReposByInstanceIdResponse listSnapshotReposByInstanceId(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSnapshotReposByInstanceIdWithOptions(InstanceId, headers, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/tags"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTagResourcesWithOptions(request, headers, runtime);
    }

    public ListTagsResponse listTagsWithOptions(ListTagsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTags"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/tags/all-tags"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagsResponse());
    }

    public ListTagsResponse listTags(ListTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTagsWithOptions(request, headers, runtime);
    }

    public ListVpcEndpointsResponse listVpcEndpointsWithOptions(String InstanceId, ListVpcEndpointsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVpcEndpoints"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/vpc-endpoints"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVpcEndpointsResponse());
    }

    public ListVpcEndpointsResponse listVpcEndpoints(String InstanceId, ListVpcEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listVpcEndpointsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
      * If the specifications in your zone are insufficient, you can upgrade your instance to nodes in another zone. Before calling this interface, you must ensure that:
      * *   The error message returned because the current account is in a zone that has sufficient resources.
      *     After migrating nodes with current specifications to another zone, you need to manually [upgrade cluster](~~96650~~) because the cluster will not be upgraded during the migration process. Therefore, select a zone with sufficient resources to avoid cluster upgrade failure. We recommend that you choose new zones that are in lower alphabetical order. For example, for cn-hangzhou-e and cn-hangzhou-h zones, choose cn-hangzhou-h first.
      * *   The cluster is in the healthy state.
      *     Can be passed`  GET _cat/health?v  `command to view the health status of the cluster.
      *
      * @param request MigrateToOtherZoneRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return MigrateToOtherZoneResponse
     */
    public MigrateToOtherZoneResponse migrateToOtherZoneWithOptions(String InstanceId, MigrateToOtherZoneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MigrateToOtherZone"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/migrate-zones"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MigrateToOtherZoneResponse());
    }

    /**
      * If the specifications in your zone are insufficient, you can upgrade your instance to nodes in another zone. Before calling this interface, you must ensure that:
      * *   The error message returned because the current account is in a zone that has sufficient resources.
      *     After migrating nodes with current specifications to another zone, you need to manually [upgrade cluster](~~96650~~) because the cluster will not be upgraded during the migration process. Therefore, select a zone with sufficient resources to avoid cluster upgrade failure. We recommend that you choose new zones that are in lower alphabetical order. For example, for cn-hangzhou-e and cn-hangzhou-h zones, choose cn-hangzhou-h first.
      * *   The cluster is in the healthy state.
      *     Can be passed`  GET _cat/health?v  `command to view the health status of the cluster.
      *
      * @param request MigrateToOtherZoneRequest
      * @return MigrateToOtherZoneResponse
     */
    public MigrateToOtherZoneResponse migrateToOtherZone(String InstanceId, MigrateToOtherZoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.migrateToOtherZoneWithOptions(InstanceId, request, headers, runtime);
    }

    public ModifyDeployMachineResponse modifyDeployMachineWithOptions(String ResId, ModifyDeployMachineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDeployMachine"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/collectors/" + com.aliyun.openapiutil.Client.getEncodeParam(ResId) + "/actions/modify-deploy-machines"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDeployMachineResponse());
    }

    public ModifyDeployMachineResponse modifyDeployMachine(String ResId, ModifyDeployMachineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyDeployMachineWithOptions(ResId, request, headers, runtime);
    }

    public ModifyElastictaskResponse modifyElastictaskWithOptions(String InstanceId, ModifyElastictaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyElastictask"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/elastic-task"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyElastictaskResponse());
    }

    public ModifyElastictaskResponse modifyElastictask(String InstanceId, ModifyElastictaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyElastictaskWithOptions(InstanceId, request, headers, runtime);
    }

    /**
      * es-cn-n6w1o1x0w001c\\*\\*\\*\\*
      *
      * @param request ModifyInstanceMaintainTimeRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyInstanceMaintainTimeResponse
     */
    public ModifyInstanceMaintainTimeResponse modifyInstanceMaintainTimeWithOptions(String InstanceId, ModifyInstanceMaintainTimeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceMaintainTime"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/modify-maintaintime"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceMaintainTimeResponse());
    }

    /**
      * es-cn-n6w1o1x0w001c\\*\\*\\*\\*
      *
      * @param request ModifyInstanceMaintainTimeRequest
      * @return ModifyInstanceMaintainTimeResponse
     */
    public ModifyInstanceMaintainTimeResponse modifyInstanceMaintainTime(String InstanceId, ModifyInstanceMaintainTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyInstanceMaintainTimeWithOptions(InstanceId, request, headers, runtime);
    }

    /**
      * The ID of the cluster.
      *
      * @param request ModifyWhiteIpsRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyWhiteIpsResponse
     */
    public ModifyWhiteIpsResponse modifyWhiteIpsWithOptions(String InstanceId, ModifyWhiteIpsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modifyMode)) {
            body.put("modifyMode", request.modifyMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            body.put("networkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            body.put("nodeType", request.nodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whiteIpGroup)) {
            body.put("whiteIpGroup", request.whiteIpGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whiteIpList)) {
            body.put("whiteIpList", request.whiteIpList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyWhiteIps"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/modify-white-ips"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyWhiteIpsResponse());
    }

    /**
      * The ID of the cluster.
      *
      * @param request ModifyWhiteIpsRequest
      * @return ModifyWhiteIpsResponse
     */
    public ModifyWhiteIpsResponse modifyWhiteIps(String InstanceId, ModifyWhiteIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyWhiteIpsWithOptions(InstanceId, request, headers, runtime);
    }

    public MoveResourceGroupResponse moveResourceGroupWithOptions(String InstanceId, MoveResourceGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveResourceGroup"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/resourcegroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveResourceGroupResponse());
    }

    public MoveResourceGroupResponse moveResourceGroup(String InstanceId, MoveResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.moveResourceGroupWithOptions(InstanceId, request, headers, runtime);
    }

    public OpenDiagnosisResponse openDiagnosisWithOptions(String InstanceId, OpenDiagnosisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenDiagnosis"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/diagnosis/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/open-diagnosis"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenDiagnosisResponse());
    }

    public OpenDiagnosisResponse openDiagnosis(String InstanceId, OpenDiagnosisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openDiagnosisWithOptions(InstanceId, request, headers, runtime);
    }

    /**
      * >  To ensure data security, we recommend that you enable HTTPS.
      *
      * @param request OpenHttpsRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return OpenHttpsResponse
     */
    public OpenHttpsResponse openHttpsWithOptions(String InstanceId, OpenHttpsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenHttps"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/open-https"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenHttpsResponse());
    }

    /**
      * >  To ensure data security, we recommend that you enable HTTPS.
      *
      * @param request OpenHttpsRequest
      * @return OpenHttpsResponse
     */
    public OpenHttpsResponse openHttps(String InstanceId, OpenHttpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openHttpsWithOptions(InstanceId, request, headers, runtime);
    }

    public PostEmonTryAlarmRuleResponse postEmonTryAlarmRuleWithOptions(String ProjectId, String AlarmGroupId, PostEmonTryAlarmRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PostEmonTryAlarmRule"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/emon/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(ProjectId) + "/alarm-groups/" + com.aliyun.openapiutil.Client.getEncodeParam(AlarmGroupId) + "/alarm-rules/_test"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PostEmonTryAlarmRuleResponse());
    }

    public PostEmonTryAlarmRuleResponse postEmonTryAlarmRule(String ProjectId, String AlarmGroupId, PostEmonTryAlarmRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.postEmonTryAlarmRuleWithOptions(ProjectId, AlarmGroupId, request, headers, runtime);
    }

    public RecommendTemplatesResponse recommendTemplatesWithOptions(String InstanceId, RecommendTemplatesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.usageScenario)) {
            query.put("usageScenario", request.usageScenario);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecommendTemplates"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/recommended-templates"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecommendTemplatesResponse());
    }

    public RecommendTemplatesResponse recommendTemplates(String InstanceId, RecommendTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recommendTemplatesWithOptions(InstanceId, request, headers, runtime);
    }

    public ReinstallCollectorResponse reinstallCollectorWithOptions(String ResId, ReinstallCollectorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReinstallCollector"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/collectors/" + com.aliyun.openapiutil.Client.getEncodeParam(ResId) + "/actions/reinstall"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReinstallCollectorResponse());
    }

    public ReinstallCollectorResponse reinstallCollector(String ResId, ReinstallCollectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reinstallCollectorWithOptions(ResId, request, headers, runtime);
    }

    public RemoveApmResponse removeApmWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveApm"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/apm/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveApmResponse());
    }

    public RemoveApmResponse removeApm(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeApmWithOptions(instanceId, headers, runtime);
    }

    public RenewInstanceResponse renewInstanceWithOptions(String InstanceId, RenewInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewInstance"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/renew"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewInstanceResponse());
    }

    public RenewInstanceResponse renewInstance(String InstanceId, RenewInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renewInstanceWithOptions(InstanceId, request, headers, runtime);
    }

    public RenewLogstashResponse renewLogstashWithOptions(String InstanceId, RenewLogstashRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewLogstash"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/renew"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewLogstashResponse());
    }

    public RenewLogstashResponse renewLogstash(String InstanceId, RenewLogstashRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renewLogstashWithOptions(InstanceId, request, headers, runtime);
    }

    public RestartCollectorResponse restartCollectorWithOptions(String ResId, RestartCollectorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartCollector"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/collectors/" + com.aliyun.openapiutil.Client.getEncodeParam(ResId) + "/actions/restart"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartCollectorResponse());
    }

    public RestartCollectorResponse restartCollector(String ResId, RestartCollectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartCollectorWithOptions(ResId, request, headers, runtime);
    }

    /**
      * >  After the instance is restarted, the instance enters the activating state. After the instance is restarted, its status changes to active. Alibaba Cloud Elasticsearch supports restarting a single node. Restarting a node can be divided into normal restart and blue-green restart.
      *
      * @param request RestartInstanceRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return RestartInstanceResponse
     */
    public RestartInstanceResponse restartInstanceWithOptions(String InstanceId, RestartInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("force", request.force);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartInstance"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/restart"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartInstanceResponse());
    }

    /**
      * >  After the instance is restarted, the instance enters the activating state. After the instance is restarted, its status changes to active. Alibaba Cloud Elasticsearch supports restarting a single node. Restarting a node can be divided into normal restart and blue-green restart.
      *
      * @param request RestartInstanceRequest
      * @return RestartInstanceResponse
     */
    public RestartInstanceResponse restartInstance(String InstanceId, RestartInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartInstanceWithOptions(InstanceId, request, headers, runtime);
    }

    public RestartLogstashResponse restartLogstashWithOptions(String InstanceId, RestartLogstashRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("force", request.force);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchCount)) {
            body.put("batchCount", request.batchCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.blueGreenDep)) {
            body.put("blueGreenDep", request.blueGreenDep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeTypes)) {
            body.put("nodeTypes", request.nodeTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodes)) {
            body.put("nodes", request.nodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restartType)) {
            body.put("restartType", request.restartType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartLogstash"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/restart"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartLogstashResponse());
    }

    public RestartLogstashResponse restartLogstash(String InstanceId, RestartLogstashRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartLogstashWithOptions(InstanceId, request, headers, runtime);
    }

    public ResumeElasticsearchTaskResponse resumeElasticsearchTaskWithOptions(String InstanceId, ResumeElasticsearchTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeElasticsearchTask"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/resume"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeElasticsearchTaskResponse());
    }

    public ResumeElasticsearchTaskResponse resumeElasticsearchTask(String InstanceId, ResumeElasticsearchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeElasticsearchTaskWithOptions(InstanceId, request, headers, runtime);
    }

    public ResumeLogstashTaskResponse resumeLogstashTaskWithOptions(String InstanceId, ResumeLogstashTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeLogstashTask"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/resume"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeLogstashTaskResponse());
    }

    public ResumeLogstashTaskResponse resumeLogstashTask(String InstanceId, ResumeLogstashTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeLogstashTaskWithOptions(InstanceId, request, headers, runtime);
    }

    public RolloverDataStreamResponse rolloverDataStreamWithOptions(String InstanceId, String DataStream, RolloverDataStreamRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RolloverDataStream"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/data-streams/" + com.aliyun.openapiutil.Client.getEncodeParam(DataStream) + "/rollover"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RolloverDataStreamResponse());
    }

    public RolloverDataStreamResponse rolloverDataStream(String InstanceId, String DataStream, RolloverDataStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rolloverDataStreamWithOptions(InstanceId, DataStream, request, headers, runtime);
    }

    public RunPipelinesResponse runPipelinesWithOptions(String InstanceId, RunPipelinesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunPipelines"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/pipelines/action/run"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunPipelinesResponse());
    }

    public RunPipelinesResponse runPipelines(String InstanceId, RunPipelinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runPipelinesWithOptions(InstanceId, request, headers, runtime);
    }

    public ShrinkNodeResponse shrinkNodeWithOptions(String InstanceId, ShrinkNodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            query.put("count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreStatus)) {
            query.put("ignoreStatus", request.ignoreStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            query.put("nodeType", request.nodeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ShrinkNode"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/shrink"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ShrinkNodeResponse());
    }

    public ShrinkNodeResponse shrinkNode(String InstanceId, ShrinkNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.shrinkNodeWithOptions(InstanceId, request, headers, runtime);
    }

    public StartApmResponse startApmWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartApm"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/apm/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/actions/start"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartApmResponse());
    }

    public StartApmResponse startApm(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startApmWithOptions(instanceId, headers, runtime);
    }

    public StartCollectorResponse startCollectorWithOptions(String ResId, StartCollectorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartCollector"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/collectors/" + com.aliyun.openapiutil.Client.getEncodeParam(ResId) + "/actions/start"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartCollectorResponse());
    }

    public StartCollectorResponse startCollector(String ResId, StartCollectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startCollectorWithOptions(ResId, request, headers, runtime);
    }

    public StopApmResponse stopApmWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopApm"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/apm/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/actions/stop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopApmResponse());
    }

    public StopApmResponse stopApm(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopApmWithOptions(instanceId, headers, runtime);
    }

    public StopCollectorResponse stopCollectorWithOptions(String ResId, StopCollectorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopCollector"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/collectors/" + com.aliyun.openapiutil.Client.getEncodeParam(ResId) + "/actions/stop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopCollectorResponse());
    }

    public StopCollectorResponse stopCollector(String ResId, StopCollectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopCollectorWithOptions(ResId, request, headers, runtime);
    }

    public StopPipelinesResponse stopPipelinesWithOptions(String InstanceId, StopPipelinesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopPipelines"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/pipelines/action/stop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopPipelinesResponse());
    }

    public StopPipelinesResponse stopPipelines(String InstanceId, StopPipelinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopPipelinesWithOptions(InstanceId, request, headers, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            body.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/tags"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.tagResourcesWithOptions(request, headers, runtime);
    }

    public TransferNodeResponse transferNodeWithOptions(String InstanceId, TransferNodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            query.put("nodeType", request.nodeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferNode"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/transfer"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferNodeResponse());
    }

    public TransferNodeResponse transferNode(String InstanceId, TransferNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.transferNodeWithOptions(InstanceId, request, headers, runtime);
    }

    public TriggerNetworkResponse triggerNetworkWithOptions(String InstanceId, TriggerNetworkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionType)) {
            body.put("actionType", request.actionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            body.put("networkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            body.put("nodeType", request.nodeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TriggerNetwork"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/network-trigger"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TriggerNetworkResponse());
    }

    public TriggerNetworkResponse triggerNetwork(String InstanceId, TriggerNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.triggerNetworkWithOptions(InstanceId, request, headers, runtime);
    }

    public UninstallKibanaPluginResponse uninstallKibanaPluginWithOptions(String InstanceId, UninstallKibanaPluginRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UninstallKibanaPlugin"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/kibana-plugins/actions/uninstall"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UninstallKibanaPluginResponse());
    }

    public UninstallKibanaPluginResponse uninstallKibanaPlugin(String InstanceId, UninstallKibanaPluginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uninstallKibanaPluginWithOptions(InstanceId, request, headers, runtime);
    }

    public UninstallLogstashPluginResponse uninstallLogstashPluginWithOptions(String InstanceId, UninstallLogstashPluginRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UninstallLogstashPlugin"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/plugins/actions/uninstall"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UninstallLogstashPluginResponse());
    }

    public UninstallLogstashPluginResponse uninstallLogstashPlugin(String InstanceId, UninstallLogstashPluginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uninstallLogstashPluginWithOptions(InstanceId, request, headers, runtime);
    }

    public UninstallPluginResponse uninstallPluginWithOptions(String InstanceId, UninstallPluginRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("force", request.force);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UninstallPlugin"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/plugins/actions/uninstall"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UninstallPluginResponse());
    }

    public UninstallPluginResponse uninstallPlugin(String InstanceId, UninstallPluginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uninstallPluginWithOptions(InstanceId, request, headers, runtime);
    }

    /**
      * When you call this operation, take note of the following items:
      * *   You can only delete user tags.
      * > User labels are manually added to instances by users. A system Tag is a tag that Alibaba Cloud services add to instances. System labels are divided into visible labels and invisible labels.
      * *   If you delete a resource tag relationship that is not associated with any resources, you must delete the tags.
      *
      * @param request UntagResourcesRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeys)) {
            query.put("TagKeys", request.tagKeys);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/tags"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
      * When you call this operation, take note of the following items:
      * *   You can only delete user tags.
      * > User labels are manually added to instances by users. A system Tag is a tag that Alibaba Cloud services add to instances. System labels are divided into visible labels and invisible labels.
      * *   If you delete a resource tag relationship that is not associated with any resources, you must delete the tags.
      *
      * @param request UntagResourcesRequest
      * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.untagResourcesWithOptions(request, headers, runtime);
    }

    /**
      * 5A2CFF0E-5718-45B5-9D4D-70B3FF\\*\\*\\*\\*
      *
      * @param request UpdateAdminPasswordRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateAdminPasswordResponse
     */
    public UpdateAdminPasswordResponse updateAdminPasswordWithOptions(String InstanceId, UpdateAdminPasswordRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.esAdminPassword)) {
            body.put("esAdminPassword", request.esAdminPassword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAdminPassword"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/admin-pwd"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAdminPasswordResponse());
    }

    /**
      * 5A2CFF0E-5718-45B5-9D4D-70B3FF\\*\\*\\*\\*
      *
      * @param request UpdateAdminPasswordRequest
      * @return UpdateAdminPasswordResponse
     */
    public UpdateAdminPasswordResponse updateAdminPassword(String InstanceId, UpdateAdminPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAdminPasswordWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateAdvancedSettingResponse updateAdvancedSettingWithOptions(String InstanceId, UpdateAdvancedSettingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAdvancedSetting"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/update-advanced-setting"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAdvancedSettingResponse());
    }

    public UpdateAdvancedSettingResponse updateAdvancedSetting(String InstanceId, UpdateAdvancedSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAdvancedSettingWithOptions(InstanceId, request, headers, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   Elasticsearch V5.X clusters do not support the analysis-aliws plug-in.
      * *   If the dictionary file is stored in an Object Storage Service (OSS) bucket, you must make sure that the access control list (ACL) of the bucket is public read.
      * *   If you do not set sourceType to ORIGIN for an uploaded dictionary file, the file will be deleted after you call this operation.
      *
      * @param request UpdateAliwsDictRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateAliwsDictResponse
     */
    public UpdateAliwsDictResponse updateAliwsDictWithOptions(String InstanceId, UpdateAliwsDictRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAliwsDict"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/aliws-dict"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAliwsDictResponse());
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   Elasticsearch V5.X clusters do not support the analysis-aliws plug-in.
      * *   If the dictionary file is stored in an Object Storage Service (OSS) bucket, you must make sure that the access control list (ACL) of the bucket is public read.
      * *   If you do not set sourceType to ORIGIN for an uploaded dictionary file, the file will be deleted after you call this operation.
      *
      * @param request UpdateAliwsDictRequest
      * @return UpdateAliwsDictResponse
     */
    public UpdateAliwsDictResponse updateAliwsDict(String InstanceId, UpdateAliwsDictRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAliwsDictWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateApmResponse updateApmWithOptions(String instanceId, UpdateApmRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputES)) {
            body.put("outputES", request.outputES);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputESPassword)) {
            body.put("outputESPassword", request.outputESPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputESUserName)) {
            body.put("outputESUserName", request.outputESUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApm"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/apm/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApmResponse());
    }

    public UpdateApmResponse updateApm(String instanceId, UpdateApmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApmWithOptions(instanceId, request, headers, runtime);
    }

    /**
      * @deprecated
      *
      * @param request UpdateBlackIpsRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateBlackIpsResponse
     */
    // Deprecated
    public UpdateBlackIpsResponse updateBlackIpsWithOptions(String InstanceId, UpdateBlackIpsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBlackIps"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/black-ips"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBlackIpsResponse());
    }

    /**
      * @deprecated
      *
      * @param request UpdateBlackIpsRequest
      * @return UpdateBlackIpsResponse
     */
    // Deprecated
    public UpdateBlackIpsResponse updateBlackIps(String InstanceId, UpdateBlackIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBlackIpsWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateCollectorResponse updateCollectorWithOptions(String ResId, UpdateCollectorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCollector"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/collectors/" + com.aliyun.openapiutil.Client.getEncodeParam(ResId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCollectorResponse());
    }

    public UpdateCollectorResponse updateCollector(String ResId, UpdateCollectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCollectorWithOptions(ResId, request, headers, runtime);
    }

    public UpdateCollectorNameResponse updateCollectorNameWithOptions(String ResId, UpdateCollectorNameRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCollectorName"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/collectors/" + com.aliyun.openapiutil.Client.getEncodeParam(ResId) + "/actions/rename"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCollectorNameResponse());
    }

    public UpdateCollectorNameResponse updateCollectorName(String ResId, UpdateCollectorNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCollectorNameWithOptions(ResId, request, headers, runtime);
    }

    public UpdateComponentIndexResponse updateComponentIndexWithOptions(String InstanceId, String name, UpdateComponentIndexRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.meta)) {
            body.put("_meta", request.meta);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.template)) {
            body.put("template", request.template);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateComponentIndex"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/component-index/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateComponentIndexResponse());
    }

    public UpdateComponentIndexResponse updateComponentIndex(String InstanceId, String name, UpdateComponentIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateComponentIndexWithOptions(InstanceId, name, request, headers, runtime);
    }

    public UpdateDescriptionResponse updateDescriptionWithOptions(String InstanceId, UpdateDescriptionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDescription"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/description"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDescriptionResponse());
    }

    public UpdateDescriptionResponse updateDescription(String InstanceId, UpdateDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDescriptionWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateDiagnosisSettingsResponse updateDiagnosisSettingsWithOptions(String InstanceId, UpdateDiagnosisSettingsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDiagnosisSettings"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/diagnosis/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/settings"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDiagnosisSettingsResponse());
    }

    public UpdateDiagnosisSettingsResponse updateDiagnosisSettings(String InstanceId, UpdateDiagnosisSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDiagnosisSettingsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If the dictionary file is stored in an Object Storage Service (OSS) bucket, you must make sure that the access control list (ACL) of the bucket is public read.
      * *   If you do not set sourceType to ORIGIN for an uploaded dictionary file, the file will be deleted after you call this operation.
      *
      * @param request UpdateDictRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateDictResponse
     */
    public UpdateDictResponse updateDictWithOptions(String InstanceId, UpdateDictRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDict"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/dict"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDictResponse());
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If the dictionary file is stored in an Object Storage Service (OSS) bucket, you must make sure that the access control list (ACL) of the bucket is public read.
      * *   If you do not set sourceType to ORIGIN for an uploaded dictionary file, the file will be deleted after you call this operation.
      *
      * @param request UpdateDictRequest
      * @return UpdateDictResponse
     */
    public UpdateDictResponse updateDict(String InstanceId, UpdateDictRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDictWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateDynamicSettingsResponse updateDynamicSettingsWithOptions(String InstanceId, UpdateDynamicSettingsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("mode", request.mode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDynamicSettings"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/dynamic-settings"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDynamicSettingsResponse());
    }

    public UpdateDynamicSettingsResponse updateDynamicSettings(String InstanceId, UpdateDynamicSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDynamicSettingsWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateExtendConfigResponse updateExtendConfigWithOptions(String InstanceId, UpdateExtendConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateExtendConfig"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/extend-configs/actions/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateExtendConfigResponse());
    }

    public UpdateExtendConfigResponse updateExtendConfig(String InstanceId, UpdateExtendConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateExtendConfigWithOptions(InstanceId, request, headers, runtime);
    }

    /**
      * When you call this operation, take note of the following items: You can call this operation only to delete the driver files that are uploaded to a Logstash cluster in the Alibaba Cloud Management Console. You can add or modify driver files only in the Alibaba Cloud Management Console.
      *
      * @param request UpdateExtendfilesRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateExtendfilesResponse
     */
    public UpdateExtendfilesResponse updateExtendfilesWithOptions(String InstanceId, UpdateExtendfilesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateExtendfiles"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/extendfiles"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateExtendfilesResponse());
    }

    /**
      * When you call this operation, take note of the following items: You can call this operation only to delete the driver files that are uploaded to a Logstash cluster in the Alibaba Cloud Management Console. You can add or modify driver files only in the Alibaba Cloud Management Console.
      *
      * @param request UpdateExtendfilesRequest
      * @return UpdateExtendfilesResponse
     */
    public UpdateExtendfilesResponse updateExtendfiles(String InstanceId, UpdateExtendfilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateExtendfilesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If the dictionary file is stored in an Object Storage Service (OSS) bucket, you must make sure that the access control list (ACL) of the bucket is public read.
      * *   If you do not set sourceType to ORIGIN for an uploaded dictionary file, the file will be deleted after you call this operation.
      *
      * @param request UpdateHotIkDictsRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateHotIkDictsResponse
     */
    public UpdateHotIkDictsResponse updateHotIkDictsWithOptions(String InstanceId, UpdateHotIkDictsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateHotIkDicts"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/ik-hot-dict"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHotIkDictsResponse());
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If the dictionary file is stored in an Object Storage Service (OSS) bucket, you must make sure that the access control list (ACL) of the bucket is public read.
      * *   If you do not set sourceType to ORIGIN for an uploaded dictionary file, the file will be deleted after you call this operation.
      *
      * @param request UpdateHotIkDictsRequest
      * @return UpdateHotIkDictsResponse
     */
    public UpdateHotIkDictsResponse updateHotIkDicts(String InstanceId, UpdateHotIkDictsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateHotIkDictsWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateILMPolicyResponse updateILMPolicyWithOptions(String InstanceId, String PolicyName, UpdateILMPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateILMPolicy"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/ilm-policies/" + com.aliyun.openapiutil.Client.getEncodeParam(PolicyName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateILMPolicyResponse());
    }

    public UpdateILMPolicyResponse updateILMPolicy(String InstanceId, String PolicyName, UpdateILMPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateILMPolicyWithOptions(InstanceId, PolicyName, request, headers, runtime);
    }

    public UpdateIndexTemplateResponse updateIndexTemplateWithOptions(String InstanceId, String IndexTemplate, UpdateIndexTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIndexTemplate"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/index-templates/" + com.aliyun.openapiutil.Client.getEncodeParam(IndexTemplate) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIndexTemplateResponse());
    }

    public UpdateIndexTemplateResponse updateIndexTemplate(String InstanceId, String IndexTemplate, UpdateIndexTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIndexTemplateWithOptions(InstanceId, IndexTemplate, request, headers, runtime);
    }

    /**
      * es-cn-n6w1ptcb30009\\*\\*\\*\\*
      *
      * @param request UpdateInstanceRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstanceWithOptions(String InstanceId, UpdateInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderActionType)) {
            query.put("orderActionType", request.orderActionType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientNodeConfiguration)) {
            body.put("clientNodeConfiguration", request.clientNodeConfiguration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elasticDataNodeConfiguration)) {
            body.put("elasticDataNodeConfiguration", request.elasticDataNodeConfiguration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceCategory)) {
            body.put("instanceCategory", request.instanceCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kibanaConfiguration)) {
            body.put("kibanaConfiguration", request.kibanaConfiguration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterConfiguration)) {
            body.put("masterConfiguration", request.masterConfiguration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeAmount)) {
            body.put("nodeAmount", request.nodeAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeSpec)) {
            body.put("nodeSpec", request.nodeSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warmNodeConfiguration)) {
            body.put("warmNodeConfiguration", request.warmNodeConfiguration);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstance"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceResponse());
    }

    /**
      * es-cn-n6w1ptcb30009\\*\\*\\*\\*
      *
      * @param request UpdateInstanceRequest
      * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(String InstanceId, UpdateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateInstanceChargeTypeResponse updateInstanceChargeTypeWithOptions(String InstanceId, UpdateInstanceChargeTypeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceChargeType"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/convert-pay-type"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceChargeTypeResponse());
    }

    public UpdateInstanceChargeTypeResponse updateInstanceChargeType(String InstanceId, UpdateInstanceChargeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceChargeTypeWithOptions(InstanceId, request, headers, runtime);
    }

    /**
      * When you call this operation, take note of the following items:
      * When the instance is in the activating, invalid, or inactive state, you cannot update the configuration.
      *
      * @param request UpdateInstanceSettingsRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateInstanceSettingsResponse
     */
    public UpdateInstanceSettingsResponse updateInstanceSettingsWithOptions(String InstanceId, UpdateInstanceSettingsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceSettings"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/instance-settings"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceSettingsResponse());
    }

    /**
      * When you call this operation, take note of the following items:
      * When the instance is in the activating, invalid, or inactive state, you cannot update the configuration.
      *
      * @param request UpdateInstanceSettingsRequest
      * @return UpdateInstanceSettingsResponse
     */
    public UpdateInstanceSettingsResponse updateInstanceSettings(String InstanceId, UpdateInstanceSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceSettingsWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateKibanaPvlNetworkResponse updateKibanaPvlNetworkWithOptions(String InstanceId, UpdateKibanaPvlNetworkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pvlId)) {
            query.put("pvlId", request.pvlId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpointName)) {
            body.put("endpointName", request.endpointName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroups)) {
            body.put("securityGroups", request.securityGroups);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateKibanaPvlNetwork"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/update-kibana-private"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateKibanaPvlNetworkResponse());
    }

    public UpdateKibanaPvlNetworkResponse updateKibanaPvlNetwork(String InstanceId, UpdateKibanaPvlNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateKibanaPvlNetworkWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateKibanaSettingsResponse updateKibanaSettingsWithOptions(String InstanceId, UpdateKibanaSettingsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateKibanaSettings"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/update-kibana-settings"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateKibanaSettingsResponse());
    }

    public UpdateKibanaSettingsResponse updateKibanaSettings(String InstanceId, UpdateKibanaSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateKibanaSettingsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
      * *   Before you call this operation, you must make sure that the cluster is not in the activating, invalid, or inactive state.
      * *   You can update an IP address whitelist by using the following parameters:
      *     *   kibanaIPWhitelist
      *     *   modifyMode and whiteIpGroup
      * *   You cannot specify private IP addresses for public IP address whitelists and cannot specify public IP addresses for private IP address whitelists.
      *
      * @param request UpdateKibanaWhiteIpsRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateKibanaWhiteIpsResponse
     */
    public UpdateKibanaWhiteIpsResponse updateKibanaWhiteIpsWithOptions(String InstanceId, UpdateKibanaWhiteIpsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyMode)) {
            query.put("modifyMode", request.modifyMode);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.kibanaIPWhitelist)) {
            body.put("kibanaIPWhitelist", request.kibanaIPWhitelist);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whiteIpGroup)) {
            body.put("whiteIpGroup", request.whiteIpGroup);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateKibanaWhiteIps"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/kibana-white-ips"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateKibanaWhiteIpsResponse());
    }

    /**
      * *   Before you call this operation, you must make sure that the cluster is not in the activating, invalid, or inactive state.
      * *   You can update an IP address whitelist by using the following parameters:
      *     *   kibanaIPWhitelist
      *     *   modifyMode and whiteIpGroup
      * *   You cannot specify private IP addresses for public IP address whitelists and cannot specify public IP addresses for private IP address whitelists.
      *
      * @param request UpdateKibanaWhiteIpsRequest
      * @return UpdateKibanaWhiteIpsResponse
     */
    public UpdateKibanaWhiteIpsResponse updateKibanaWhiteIps(String InstanceId, UpdateKibanaWhiteIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateKibanaWhiteIpsWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateLogstashResponse updateLogstashWithOptions(String InstanceId, UpdateLogstashRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeAmount)) {
            body.put("nodeAmount", request.nodeAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeSpec)) {
            body.put("nodeSpec", request.nodeSpec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLogstash"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLogstashResponse());
    }

    public UpdateLogstashResponse updateLogstash(String InstanceId, UpdateLogstashRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLogstashWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateLogstashChargeTypeResponse updateLogstashChargeTypeWithOptions(String InstanceId, UpdateLogstashChargeTypeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLogstashChargeType"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/convert-pay-type"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLogstashChargeTypeResponse());
    }

    public UpdateLogstashChargeTypeResponse updateLogstashChargeType(String InstanceId, UpdateLogstashChargeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLogstashChargeTypeWithOptions(InstanceId, request, headers, runtime);
    }

    /**
      * When you call this operation, take note of the following items: You cannot change the name of a cluster that is in the activating, invalid, or inactive state.
      *
      * @param request UpdateLogstashDescriptionRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateLogstashDescriptionResponse
     */
    public UpdateLogstashDescriptionResponse updateLogstashDescriptionWithOptions(String InstanceId, UpdateLogstashDescriptionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLogstashDescription"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/description"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLogstashDescriptionResponse());
    }

    /**
      * When you call this operation, take note of the following items: You cannot change the name of a cluster that is in the activating, invalid, or inactive state.
      *
      * @param request UpdateLogstashDescriptionRequest
      * @return UpdateLogstashDescriptionResponse
     */
    public UpdateLogstashDescriptionResponse updateLogstashDescription(String InstanceId, UpdateLogstashDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLogstashDescriptionWithOptions(InstanceId, request, headers, runtime);
    }

    /**
      * When you call this operation, take note of the following items:
      * If the instance is in the Active (activating), Invalid (invalid), and Inactive (inactive) state, the information cannot be updated.
      *
      * @param request UpdateLogstashSettingsRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateLogstashSettingsResponse
     */
    public UpdateLogstashSettingsResponse updateLogstashSettingsWithOptions(String InstanceId, UpdateLogstashSettingsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLogstashSettings"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/instance-settings"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLogstashSettingsResponse());
    }

    /**
      * When you call this operation, take note of the following items:
      * If the instance is in the Active (activating), Invalid (invalid), and Inactive (inactive) state, the information cannot be updated.
      *
      * @param request UpdateLogstashSettingsRequest
      * @return UpdateLogstashSettingsResponse
     */
    public UpdateLogstashSettingsResponse updateLogstashSettings(String InstanceId, UpdateLogstashSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLogstashSettingsWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdatePipelineManagementConfigResponse updatePipelineManagementConfigWithOptions(String InstanceId, UpdatePipelineManagementConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpoints)) {
            body.put("endpoints", request.endpoints);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineIds)) {
            body.put("pipelineIds", request.pipelineIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineManagementType)) {
            body.put("pipelineManagementType", request.pipelineManagementType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("userName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePipelineManagementConfig"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/pipeline-management-config"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePipelineManagementConfigResponse());
    }

    public UpdatePipelineManagementConfigResponse updatePipelineManagementConfig(String InstanceId, UpdatePipelineManagementConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePipelineManagementConfigWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdatePipelinesResponse updatePipelinesWithOptions(String InstanceId, UpdatePipelinesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trigger)) {
            query.put("trigger", request.trigger);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePipelines"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/pipelines"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePipelinesResponse());
    }

    public UpdatePipelinesResponse updatePipelines(String InstanceId, UpdatePipelinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePipelinesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
      * >  In the following returned example, only the parameters in the returned data list are guaranteed to be included, and the parameters not mentioned are for reference only. For more information about the parameters, see [ListInstance](~~142230~~). You cannot force a dependency in a program to get these parameters.
      *
      * @param request UpdatePrivateNetworkWhiteIpsRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdatePrivateNetworkWhiteIpsResponse
     */
    public UpdatePrivateNetworkWhiteIpsResponse updatePrivateNetworkWhiteIpsWithOptions(String InstanceId, UpdatePrivateNetworkWhiteIpsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyMode)) {
            query.put("modifyMode", request.modifyMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePrivateNetworkWhiteIps"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/private-network-white-ips"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePrivateNetworkWhiteIpsResponse());
    }

    /**
      * >  In the following returned example, only the parameters in the returned data list are guaranteed to be included, and the parameters not mentioned are for reference only. For more information about the parameters, see [ListInstance](~~142230~~). You cannot force a dependency in a program to get these parameters.
      *
      * @param request UpdatePrivateNetworkWhiteIpsRequest
      * @return UpdatePrivateNetworkWhiteIpsResponse
     */
    public UpdatePrivateNetworkWhiteIpsResponse updatePrivateNetworkWhiteIps(String InstanceId, UpdatePrivateNetworkWhiteIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePrivateNetworkWhiteIpsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
      * When you call this operation, take note of the following items:
      * When the instance is in the activating, invalid, or inactive state, its configuration cannot be updated.
      *
      * @param request UpdatePublicNetworkRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdatePublicNetworkResponse
     */
    public UpdatePublicNetworkResponse updatePublicNetworkWithOptions(String InstanceId, UpdatePublicNetworkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePublicNetwork"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/public-network"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePublicNetworkResponse());
    }

    /**
      * When you call this operation, take note of the following items:
      * When the instance is in the activating, invalid, or inactive state, its configuration cannot be updated.
      *
      * @param request UpdatePublicNetworkRequest
      * @return UpdatePublicNetworkResponse
     */
    public UpdatePublicNetworkResponse updatePublicNetwork(String InstanceId, UpdatePublicNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePublicNetworkWithOptions(InstanceId, request, headers, runtime);
    }

    /**
      * >  In the following example, only the parameters in the returned data list are guaranteed to be included. The parameters that are not mentioned are for reference only. For more information about the parameters, see [ListInstance](~~142230~~). You cannot force a dependency in a program to get these parameters.
      *
      * @param request UpdatePublicWhiteIpsRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdatePublicWhiteIpsResponse
     */
    public UpdatePublicWhiteIpsResponse updatePublicWhiteIpsWithOptions(String InstanceId, UpdatePublicWhiteIpsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyMode)) {
            query.put("modifyMode", request.modifyMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePublicWhiteIps"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/public-white-ips"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePublicWhiteIpsResponse());
    }

    /**
      * >  In the following example, only the parameters in the returned data list are guaranteed to be included. The parameters that are not mentioned are for reference only. For more information about the parameters, see [ListInstance](~~142230~~). You cannot force a dependency in a program to get these parameters.
      *
      * @param request UpdatePublicWhiteIpsRequest
      * @return UpdatePublicWhiteIpsResponse
     */
    public UpdatePublicWhiteIpsResponse updatePublicWhiteIps(String InstanceId, UpdatePublicWhiteIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePublicWhiteIpsWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateReadWritePolicyResponse updateReadWritePolicyWithOptions(String InstanceId, UpdateReadWritePolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateReadWritePolicy"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/update-read-write-policy"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateReadWritePolicyResponse());
    }

    public UpdateReadWritePolicyResponse updateReadWritePolicy(String InstanceId, UpdateReadWritePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateReadWritePolicyWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateSnapshotSettingResponse updateSnapshotSettingWithOptions(String InstanceId, UpdateSnapshotSettingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSnapshotSetting"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/snapshot-setting"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSnapshotSettingResponse());
    }

    public UpdateSnapshotSettingResponse updateSnapshotSetting(String InstanceId, UpdateSnapshotSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSnapshotSettingWithOptions(InstanceId, request, headers, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If the dictionary file is stored in an Object Storage Service (OSS) bucket, you must make sure that the access control list (ACL) of the bucket is public read.
      * *   If you do not set sourceType to ORIGIN for an uploaded dictionary file, the file will be deleted after you call this operation.
      *
      * @param request UpdateSynonymsDictsRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateSynonymsDictsResponse
     */
    public UpdateSynonymsDictsResponse updateSynonymsDictsWithOptions(String InstanceId, UpdateSynonymsDictsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSynonymsDicts"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/synonymsDict"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSynonymsDictsResponse());
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If the dictionary file is stored in an Object Storage Service (OSS) bucket, you must make sure that the access control list (ACL) of the bucket is public read.
      * *   If you do not set sourceType to ORIGIN for an uploaded dictionary file, the file will be deleted after you call this operation.
      *
      * @param request UpdateSynonymsDictsRequest
      * @return UpdateSynonymsDictsResponse
     */
    public UpdateSynonymsDictsResponse updateSynonymsDicts(String InstanceId, UpdateSynonymsDictsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSynonymsDictsWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateTemplateResponse updateTemplateWithOptions(String InstanceId, String TemplateName, UpdateTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTemplate"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/templates/" + com.aliyun.openapiutil.Client.getEncodeParam(TemplateName) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTemplateResponse());
    }

    public UpdateTemplateResponse updateTemplate(String InstanceId, String TemplateName, UpdateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTemplateWithOptions(InstanceId, TemplateName, request, headers, runtime);
    }

    /**
      * > For more information about the parameters displayed in the following sample code but not provided in the preceding tables, see [ListInstance](~~142230~~). You cannot force your program to obtain these parameters.
      *
      * @param request UpdateWhiteIpsRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateWhiteIpsResponse
     */
    public UpdateWhiteIpsResponse updateWhiteIpsWithOptions(String InstanceId, UpdateWhiteIpsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyMode)) {
            query.put("modifyMode", request.modifyMode);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.esIPWhitelist)) {
            body.put("esIPWhitelist", request.esIPWhitelist);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whiteIpGroup)) {
            body.put("whiteIpGroup", request.whiteIpGroup);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWhiteIps"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/white-ips"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWhiteIpsResponse());
    }

    /**
      * > For more information about the parameters displayed in the following sample code but not provided in the preceding tables, see [ListInstance](~~142230~~). You cannot force your program to obtain these parameters.
      *
      * @param request UpdateWhiteIpsRequest
      * @return UpdateWhiteIpsResponse
     */
    public UpdateWhiteIpsResponse updateWhiteIps(String InstanceId, UpdateWhiteIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWhiteIpsWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateXpackMonitorConfigResponse updateXpackMonitorConfigWithOptions(String InstanceId, UpdateXpackMonitorConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            body.put("enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpoints)) {
            body.put("endpoints", request.endpoints);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("userName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateXpackMonitorConfig"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/xpack-monitor-config"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateXpackMonitorConfigResponse());
    }

    public UpdateXpackMonitorConfigResponse updateXpackMonitorConfig(String InstanceId, UpdateXpackMonitorConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateXpackMonitorConfigWithOptions(InstanceId, request, headers, runtime);
    }

    /**
      * 5A2CFF0E-5718-45B5-9D4D-70B3FF\\*\\*\\*\\*
      *
      * @param request UpgradeEngineVersionRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpgradeEngineVersionResponse
     */
    public UpgradeEngineVersionResponse upgradeEngineVersionWithOptions(String InstanceId, UpgradeEngineVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeEngineVersion"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/actions/upgrade-version"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeEngineVersionResponse());
    }

    /**
      * 5A2CFF0E-5718-45B5-9D4D-70B3FF\\*\\*\\*\\*
      *
      * @param request UpgradeEngineVersionRequest
      * @return UpgradeEngineVersionResponse
     */
    public UpgradeEngineVersionResponse upgradeEngineVersion(String InstanceId, UpgradeEngineVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upgradeEngineVersionWithOptions(InstanceId, request, headers, runtime);
    }

    /**
      * > Before you enable the X-Pack Monitoring feature for a Logstash cluster, you must associate the Logstash cluster with an Elasticsearch cluster. This way, you can view the monitoring data of the Logstash cluster in the Kibana console of the Elasticsearch cluster.
      *
      * @param request ValidateConnectionRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ValidateConnectionResponse
     */
    public ValidateConnectionResponse validateConnectionWithOptions(String InstanceId, ValidateConnectionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateConnection"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/logstashes/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/validate-connection"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateConnectionResponse());
    }

    /**
      * > Before you enable the X-Pack Monitoring feature for a Logstash cluster, you must associate the Logstash cluster with an Elasticsearch cluster. This way, you can view the monitoring data of the Logstash cluster in the Kibana console of the Elasticsearch cluster.
      *
      * @param request ValidateConnectionRequest
      * @return ValidateConnectionResponse
     */
    public ValidateConnectionResponse validateConnection(String InstanceId, ValidateConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateConnectionWithOptions(InstanceId, request, headers, runtime);
    }

    public ValidateShrinkNodesResponse validateShrinkNodesWithOptions(String InstanceId, ValidateShrinkNodesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            query.put("count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreStatus)) {
            query.put("ignoreStatus", request.ignoreStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            query.put("nodeType", request.nodeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateShrinkNodes"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/validate-shrink-nodes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateShrinkNodesResponse());
    }

    public ValidateShrinkNodesResponse validateShrinkNodes(String InstanceId, ValidateShrinkNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateShrinkNodesWithOptions(InstanceId, request, headers, runtime);
    }

    public ValidateSlrPermissionResponse validateSlrPermissionWithOptions(ValidateSlrPermissionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rolename)) {
            query.put("rolename", request.rolename);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateSlrPermission"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/user/servicerolepermission"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateSlrPermissionResponse());
    }

    public ValidateSlrPermissionResponse validateSlrPermission(ValidateSlrPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateSlrPermissionWithOptions(request, headers, runtime);
    }

    public ValidateTransferableNodesResponse validateTransferableNodesWithOptions(String InstanceId, ValidateTransferableNodesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            query.put("nodeType", request.nodeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateTransferableNodes"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/validate-transfer-nodes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateTransferableNodesResponse());
    }

    public ValidateTransferableNodesResponse validateTransferableNodes(String InstanceId, ValidateTransferableNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateTransferableNodesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
      * The configurations of warm nodes.
      *
      * @param request CreateInstanceRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientNodeConfiguration)) {
            body.put("clientNodeConfiguration", request.clientNodeConfiguration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elasticDataNodeConfiguration)) {
            body.put("elasticDataNodeConfiguration", request.elasticDataNodeConfiguration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.esAdminPassword)) {
            body.put("esAdminPassword", request.esAdminPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.esVersion)) {
            body.put("esVersion", request.esVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceCategory)) {
            body.put("instanceCategory", request.instanceCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kibanaConfiguration)) {
            body.put("kibanaConfiguration", request.kibanaConfiguration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterConfiguration)) {
            body.put("masterConfiguration", request.masterConfiguration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkConfig)) {
            body.put("networkConfig", request.networkConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeAmount)) {
            body.put("nodeAmount", request.nodeAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeSpec)) {
            body.put("nodeSpec", request.nodeSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentInfo)) {
            body.put("paymentInfo", request.paymentInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            body.put("paymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warmNodeConfiguration)) {
            body.put("warmNodeConfiguration", request.warmNodeConfiguration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneCount)) {
            body.put("zoneCount", request.zoneCount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "createInstance"),
            new TeaPair("version", "2017-06-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/instances"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceResponse());
    }

    /**
      * The configurations of warm nodes.
      *
      * @param request CreateInstanceRequest
      * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInstanceWithOptions(request, headers, runtime);
    }
}
