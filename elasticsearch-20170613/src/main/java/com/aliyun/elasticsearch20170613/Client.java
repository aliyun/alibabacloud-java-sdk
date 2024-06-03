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

    /**
     * @summary Restores nodes in disabled zones. This operation is available only for multi-zone Elasticsearch clusters.
     *
     * @param request ActivateZonesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ActivateZonesResponse
     */
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

    /**
     * @summary Restores nodes in disabled zones. This operation is available only for multi-zone Elasticsearch clusters.
     *
     * @param request ActivateZonesRequest
     * @return ActivateZonesResponse
     */
    public ActivateZonesResponse activateZones(String InstanceId, ActivateZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.activateZonesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @param request AddConnectableClusterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddConnectableClusterResponse
     */
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

    /**
     * @param request AddConnectableClusterRequest
     * @return AddConnectableClusterResponse
     */
    public AddConnectableClusterResponse addConnectableCluster(String InstanceId, AddConnectableClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addConnectableClusterWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Call the AddSnapshotRepo to create a reference repository when configuring a cross-cluster OSS repository.
     *
     * @param request AddSnapshotRepoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddSnapshotRepoResponse
     */
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

    /**
     * @summary Call the AddSnapshotRepo to create a reference repository when configuring a cross-cluster OSS repository.
     *
     * @param request AddSnapshotRepoRequest
     * @return AddSnapshotRepoResponse
     */
    public AddSnapshotRepoResponse addSnapshotRepo(String InstanceId, AddSnapshotRepoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addSnapshotRepoWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Restores an Elasticsearch cluster that is frozen after it is released.
     *
     * @param request CancelDeletionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelDeletionResponse
     */
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

    /**
     * @summary Restores an Elasticsearch cluster that is frozen after it is released.
     *
     * @param request CancelDeletionRequest
     * @return CancelDeletionResponse
     */
    public CancelDeletionResponse cancelDeletion(String InstanceId, CancelDeletionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelDeletionWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Restores a Logstash cluster that is frozen after it is released.
     *
     * @param request CancelLogstashDeletionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelLogstashDeletionResponse
     */
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

    /**
     * @summary Restores a Logstash cluster that is frozen after it is released.
     *
     * @param request CancelLogstashDeletionRequest
     * @return CancelLogstashDeletionResponse
     */
    public CancelLogstashDeletionResponse cancelLogstashDeletion(String InstanceId, CancelLogstashDeletionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelLogstashDeletionWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @param request CancelTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelTaskResponse
     */
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

    /**
     * @param request CancelTaskRequest
     * @return CancelTaskResponse
     */
    public CancelTaskResponse cancelTask(String InstanceId, CancelTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelTaskWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 容量规划
     *
     * @param request CapacityPlanRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CapacityPlanResponse
     */
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

    /**
     * @summary 容量规划
     *
     * @param request CapacityPlanRequest
     * @return CapacityPlanResponse
     */
    public CapacityPlanResponse capacityPlan(CapacityPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.capacityPlanWithOptions(request, headers, runtime);
    }

    /**
     * @summary 关闭实例的智能运维功能
     *
     * @param request CloseDiagnosisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloseDiagnosisResponse
     */
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

    /**
     * @summary 关闭实例的智能运维功能
     *
     * @param request CloseDiagnosisRequest
     * @return CloseDiagnosisResponse
     */
    public CloseDiagnosisResponse closeDiagnosis(String InstanceId, CloseDiagnosisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeDiagnosisWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @param request CloseHttpsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloseHttpsResponse
     */
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

    /**
     * @param request CloseHttpsRequest
     * @return CloseHttpsResponse
     */
    public CloseHttpsResponse closeHttps(String InstanceId, CloseHttpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeHttpsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 关闭索引托管
     *
     * @param request CloseManagedIndexRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloseManagedIndexResponse
     */
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

    /**
     * @summary 关闭索引托管
     *
     * @param request CloseManagedIndexRequest
     * @return CloseManagedIndexResponse
     */
    public CloseManagedIndexResponse closeManagedIndex(String InstanceId, String Index, CloseManagedIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeManagedIndexWithOptions(InstanceId, Index, request, headers, runtime);
    }

    /**
     * @summary 创建收集器
     *
     * @param request CreateCollectorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCollectorResponse
     */
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

    /**
     * @summary 创建收集器
     *
     * @param request CreateCollectorRequest
     * @return CreateCollectorResponse
     */
    public CreateCollectorResponse createCollector(CreateCollectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCollectorWithOptions(request, headers, runtime);
    }

    /**
     * @summary 创建Elasticsearch组合模板
     *
     * @param request CreateComponentIndexRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateComponentIndexResponse
     */
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

    /**
     * @summary 创建Elasticsearch组合模板
     *
     * @param request CreateComponentIndexRequest
     * @return CreateComponentIndexResponse
     */
    public CreateComponentIndexResponse createComponentIndex(String InstanceId, String name, CreateComponentIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createComponentIndexWithOptions(InstanceId, name, request, headers, runtime);
    }

    /**
     * @summary 创建数据流
     *
     * @param request CreateDataStreamRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataStreamResponse
     */
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

    /**
     * @summary 创建数据流
     *
     * @param request CreateDataStreamRequest
     * @return CreateDataStreamResponse
     */
    public CreateDataStreamResponse createDataStream(String InstanceId, CreateDataStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataStreamWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 创建索引生命周期策略
     *
     * @param request CreateILMPolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateILMPolicyResponse
     */
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

    /**
     * @summary 创建索引生命周期策略
     *
     * @param request CreateILMPolicyRequest
     * @return CreateILMPolicyResponse
     */
    public CreateILMPolicyResponse createILMPolicy(String InstanceId, CreateILMPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createILMPolicyWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 创建索引模版
     *
     * @param request CreateIndexTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIndexTemplateResponse
     */
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

    /**
     * @summary 创建索引模版
     *
     * @param request CreateIndexTemplateRequest
     * @return CreateIndexTemplateResponse
     */
    public CreateIndexTemplateResponse createIndexTemplate(String InstanceId, CreateIndexTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIndexTemplateWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 创建logstash实例
     *
     * @param request CreateLogstashRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLogstashResponse
     */
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

    /**
     * @summary 创建logstash实例
     *
     * @param request CreateLogstashRequest
     * @return CreateLogstashResponse
     */
    public CreateLogstashResponse createLogstash(CreateLogstashRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLogstashWithOptions(request, headers, runtime);
    }

    /**
     * @summary 创建Logstash管道任务
     *
     * @param request CreatePipelinesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePipelinesResponse
     */
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

    /**
     * @summary 创建Logstash管道任务
     *
     * @param request CreatePipelinesRequest
     * @return CreatePipelinesResponse
     */
    public CreatePipelinesResponse createPipelines(String InstanceId, CreatePipelinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPipelinesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @param request CreateSnapshotRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSnapshotResponse
     */
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

    /**
     * @param request CreateSnapshotRequest
     * @return CreateSnapshotResponse
     */
    public CreateSnapshotResponse createSnapshot(String InstanceId, CreateSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSnapshotWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 创建私网链接VPC终端节点
     *
     * @description 5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D\\*\\*\\*
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
     * @summary 创建私网链接VPC终端节点
     *
     * @description 5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D\\*\\*\\*
     *
     * @param request CreateVpcEndpointRequest
     * @return CreateVpcEndpointResponse
     */
    public CreateVpcEndpointResponse createVpcEndpoint(String InstanceId, CreateVpcEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVpcEndpointWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Call deactivatezones to offline part of the zone when multiple zones are available. And you need to migrate the nodes in the offline zone to other zones.
     *
     * @param request DeactivateZonesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeactivateZonesResponse
     */
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

    /**
     * @summary Call deactivatezones to offline part of the zone when multiple zones are available. And you need to migrate the nodes in the offline zone to other zones.
     *
     * @param request DeactivateZonesRequest
     * @return DeactivateZonesResponse
     */
    public DeactivateZonesResponse deactivateZones(String InstanceId, DeactivateZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deactivateZonesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Deletes a shipper.
     *
     * @param request DeleteCollectorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCollectorResponse
     */
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

    /**
     * @summary Deletes a shipper.
     *
     * @param request DeleteCollectorRequest
     * @return DeleteCollectorResponse
     */
    public DeleteCollectorResponse deleteCollector(String ResId, DeleteCollectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCollectorWithOptions(ResId, request, headers, runtime);
    }

    /**
     * @summary 删除组合索引模板
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteComponentIndexResponse
     */
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

    /**
     * @summary 删除组合索引模板
     *
     * @return DeleteComponentIndexResponse
     */
    public DeleteComponentIndexResponse deleteComponentIndex(String InstanceId, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteComponentIndexWithOptions(InstanceId, name, headers, runtime);
    }

    /**
     * @param request DeleteConnectedClusterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteConnectedClusterResponse
     */
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

    /**
     * @param request DeleteConnectedClusterRequest
     * @return DeleteConnectedClusterResponse
     */
    public DeleteConnectedClusterResponse deleteConnectedCluster(String InstanceId, DeleteConnectedClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConnectedClusterWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 删除数据流
     *
     * @param request DeleteDataStreamRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataStreamResponse
     */
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

    /**
     * @summary 删除数据流
     *
     * @param request DeleteDataStreamRequest
     * @return DeleteDataStreamResponse
     */
    public DeleteDataStreamResponse deleteDataStream(String InstanceId, String DataStream, DeleteDataStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDataStreamWithOptions(InstanceId, DataStream, request, headers, runtime);
    }

    /**
     * @param request DeleteDataTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataTaskResponse
     */
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

    /**
     * @param request DeleteDataTaskRequest
     * @return DeleteDataTaskResponse
     */
    public DeleteDataTaskResponse deleteDataTask(String InstanceId, DeleteDataTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDataTaskWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 删除历史索引模板
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDeprecatedTemplateResponse
     */
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

    /**
     * @summary 删除历史索引模板
     *
     * @return DeleteDeprecatedTemplateResponse
     */
    public DeleteDeprecatedTemplateResponse deleteDeprecatedTemplate(String InstanceId, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDeprecatedTemplateWithOptions(InstanceId, name, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteILMPolicyResponse
     */
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

    /**
     * @return DeleteILMPolicyResponse
     */
    public DeleteILMPolicyResponse deleteILMPolicy(String InstanceId, String PolicyName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteILMPolicyWithOptions(InstanceId, PolicyName, headers, runtime);
    }

    /**
     * @summary 删除ES集群索引模版
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIndexTemplateResponse
     */
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

    /**
     * @summary 删除ES集群索引模版
     *
     * @return DeleteIndexTemplateResponse
     */
    public DeleteIndexTemplateResponse deleteIndexTemplate(String InstanceId, String IndexTemplate) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIndexTemplateWithOptions(InstanceId, IndexTemplate, headers, runtime);
    }

    /**
     * @param request DeleteInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceResponse
     */
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

    /**
     * @param request DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(String InstanceId, DeleteInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInstanceWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Releases a Logstash cluster.
     *
     * @description Before you call this operation, take note of the following information: After the cluster is released, the physical resources used by the cluster are reclaimed. The data stored in the cluster is deleted and cannot be recovered. The disks attached to the nodes in the cluster and the snapshots created for the cluster are released.
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
     * @summary Releases a Logstash cluster.
     *
     * @description Before you call this operation, take note of the following information: After the cluster is released, the physical resources used by the cluster are reclaimed. The data stored in the cluster is deleted and cannot be recovered. The disks attached to the nodes in the cluster and the snapshots created for the cluster are released.
     *
     * @param request DeleteLogstashRequest
     * @return DeleteLogstashResponse
     */
    public DeleteLogstashResponse deleteLogstash(String InstanceId, DeleteLogstashRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLogstashWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Deletes a pipeline that is configured for a Logstash cluster.
     *
     * @param request DeletePipelinesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePipelinesResponse
     */
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

    /**
     * @summary Deletes a pipeline that is configured for a Logstash cluster.
     *
     * @param request DeletePipelinesRequest
     * @return DeletePipelinesResponse
     */
    public DeletePipelinesResponse deletePipelines(String InstanceId, DeletePipelinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePipelinesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @param request DeleteSnapshotRepoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSnapshotRepoResponse
     */
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

    /**
     * @param request DeleteSnapshotRepoRequest
     * @return DeleteSnapshotRepoResponse
     */
    public DeleteSnapshotRepoResponse deleteSnapshotRepo(String InstanceId, DeleteSnapshotRepoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSnapshotRepoWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 删除服务账号vpc下的终端节点
     *
     * @param request DeleteVpcEndpointRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVpcEndpointResponse
     */
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

    /**
     * @summary 删除服务账号vpc下的终端节点
     *
     * @param request DeleteVpcEndpointRequest
     * @return DeleteVpcEndpointResponse
     */
    public DeleteVpcEndpointResponse deleteVpcEndpoint(String InstanceId, String EndpointId, DeleteVpcEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteVpcEndpointWithOptions(InstanceId, EndpointId, request, headers, runtime);
    }

    /**
     * @summary Queries the information of ES-operator that is installed for a specified Container Service for Kubernetes (ACK) cluster.
     *
     * @description > Before you install a shipper on an ACK cluster, you can call this operation to query the installation status of ES-operator for the ACK cluster.
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
     * @summary Queries the information of ES-operator that is installed for a specified Container Service for Kubernetes (ACK) cluster.
     *
     * @description > Before you install a shipper on an ACK cluster, you can call this operation to query the installation status of ES-operator for the ACK cluster.
     *
     * @return DescribeAckOperatorResponse
     */
    public DescribeAckOperatorResponse describeAckOperator(String ClusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAckOperatorWithOptions(ClusterId, headers, runtime);
    }

    /**
     * @summary DescribeApm
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApmResponse
     */
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

    /**
     * @summary DescribeApm
     *
     * @return DescribeApmResponse
     */
    public DescribeApmResponse describeApm(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApmWithOptions(instanceId, headers, runtime);
    }

    /**
     * @summary Queries the details of a shipper.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCollectorResponse
     */
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

    /**
     * @summary Queries the details of a shipper.
     *
     * @return DescribeCollectorResponse
     */
    public DescribeCollectorResponse describeCollector(String ResId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeCollectorWithOptions(ResId, headers, runtime);
    }

    /**
     * @summary 查看组合索引模板详情
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeComponentIndexResponse
     */
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

    /**
     * @summary 查看组合索引模板详情
     *
     * @return DescribeComponentIndexResponse
     */
    public DescribeComponentIndexResponse describeComponentIndex(String InstanceId, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeComponentIndexWithOptions(InstanceId, name, headers, runtime);
    }

    /**
     * @param request DescribeConnectableClustersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConnectableClustersResponse
     */
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

    /**
     * @param request DescribeConnectableClustersRequest
     * @return DescribeConnectableClustersResponse
     */
    public DescribeConnectableClustersResponse describeConnectableClusters(String InstanceId, DescribeConnectableClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeConnectableClustersWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary DescribeDeprecatedTemplate
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDeprecatedTemplateResponse
     */
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

    /**
     * @summary DescribeDeprecatedTemplate
     *
     * @return DescribeDeprecatedTemplateResponse
     */
    public DescribeDeprecatedTemplateResponse describeDeprecatedTemplate(String InstanceId, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeDeprecatedTemplateWithOptions(InstanceId, name, headers, runtime);
    }

    /**
     * @param request DescribeDiagnoseReportRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDiagnoseReportResponse
     */
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

    /**
     * @param request DescribeDiagnoseReportRequest
     * @return DescribeDiagnoseReportResponse
     */
    public DescribeDiagnoseReportResponse describeDiagnoseReport(String InstanceId, String ReportId, DescribeDiagnoseReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeDiagnoseReportWithOptions(InstanceId, ReportId, request, headers, runtime);
    }

    /**
     * @param request DescribeDiagnosisSettingsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDiagnosisSettingsResponse
     */
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

    /**
     * @param request DescribeDiagnosisSettingsRequest
     * @return DescribeDiagnosisSettingsResponse
     */
    public DescribeDiagnosisSettingsResponse describeDiagnosisSettings(String InstanceId, DescribeDiagnosisSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeDiagnosisSettingsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 获取集群动态指标
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDynamicSettingsResponse
     */
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

    /**
     * @summary 获取集群动态指标
     *
     * @return DescribeDynamicSettingsResponse
     */
    public DescribeDynamicSettingsResponse describeDynamicSettings(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeDynamicSettingsWithOptions(InstanceId, headers, runtime);
    }

    /**
     * @summary Queries the health status of an Elasticsearch cluster.
     *
     * @description An Elasticsearch cluster can be in a health state indicated by one of the following colors:
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
     * @summary Queries the health status of an Elasticsearch cluster.
     *
     * @description An Elasticsearch cluster can be in a health state indicated by one of the following colors:
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

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeILMPolicyResponse
     */
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

    /**
     * @return DescribeILMPolicyResponse
     */
    public DescribeILMPolicyResponse describeILMPolicy(String InstanceId, String PolicyName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeILMPolicyWithOptions(InstanceId, PolicyName, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIndexTemplateResponse
     */
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

    /**
     * @return DescribeIndexTemplateResponse
     */
    public DescribeIndexTemplateResponse describeIndexTemplate(String InstanceId, String IndexTemplate) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeIndexTemplateWithOptions(InstanceId, IndexTemplate, headers, runtime);
    }

    /**
     * @summary The name of the dictionary file.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceResponse
     */
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

    /**
     * @summary The name of the dictionary file.
     *
     * @return DescribeInstanceResponse
     */
    public DescribeInstanceResponse describeInstance(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeInstanceWithOptions(InstanceId, headers, runtime);
    }

    /**
     * @summary 获取Elasticsearch集群Kibana节点settings配置
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeKibanaSettingsResponse
     */
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

    /**
     * @summary 获取Elasticsearch集群Kibana节点settings配置
     *
     * @return DescribeKibanaSettingsResponse
     */
    public DescribeKibanaSettingsResponse describeKibanaSettings(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeKibanaSettingsWithOptions(InstanceId, headers, runtime);
    }

    /**
     * @summary 查看Logstash实例详情
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLogstashResponse
     */
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

    /**
     * @summary 查看Logstash实例详情
     *
     * @return DescribeLogstashResponse
     */
    public DescribeLogstashResponse describeLogstash(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeLogstashWithOptions(InstanceId, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePipelineResponse
     */
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

    /**
     * @return DescribePipelineResponse
     */
    public DescribePipelineResponse describePipeline(String InstanceId, String PipelineId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePipelineWithOptions(InstanceId, PipelineId, headers, runtime);
    }

    /**
     * @summary Queries the management configurations of pipelines in a Logstash cluster.
     *
     * @param request DescribePipelineManagementConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePipelineManagementConfigResponse
     */
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

    /**
     * @summary Queries the management configurations of pipelines in a Logstash cluster.
     *
     * @param request DescribePipelineManagementConfigRequest
     * @return DescribePipelineManagementConfigResponse
     */
    public DescribePipelineManagementConfigResponse describePipelineManagementConfig(String InstanceId, DescribePipelineManagementConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePipelineManagementConfigWithOptions(InstanceId, request, headers, runtime);
    }

    /**
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

    /**
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRegionsWithOptions(headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSnapshotSettingResponse
     */
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

    /**
     * @return DescribeSnapshotSettingResponse
     */
    public DescribeSnapshotSettingResponse describeSnapshotSetting(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeSnapshotSettingWithOptions(InstanceId, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTemplatesResponse
     */
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

    /**
     * @return DescribeTemplatesResponse
     */
    public DescribeTemplatesResponse describeTemplates(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeTemplatesWithOptions(InstanceId, headers, runtime);
    }

    /**
     * @summary Queries the configurations of the X-Pack Monitoring feature of a Logstash cluster.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeXpackMonitorConfigResponse
     */
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

    /**
     * @summary Queries the configurations of the X-Pack Monitoring feature of a Logstash cluster.
     *
     * @return DescribeXpackMonitorConfigResponse
     */
    public DescribeXpackMonitorConfigResponse describeXpackMonitorConfig(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeXpackMonitorConfigWithOptions(InstanceId, headers, runtime);
    }

    /**
     * @summary 触发ES实例智能诊断
     *
     * @param request DiagnoseInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DiagnoseInstanceResponse
     */
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

    /**
     * @summary 触发ES实例智能诊断
     *
     * @param request DiagnoseInstanceRequest
     * @return DiagnoseInstanceResponse
     */
    public DiagnoseInstanceResponse diagnoseInstance(String InstanceId, DiagnoseInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.diagnoseInstanceWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 关闭kibana私网
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableKibanaPvlNetworkResponse
     */
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

    /**
     * @summary 关闭kibana私网
     *
     * @return DisableKibanaPvlNetworkResponse
     */
    public DisableKibanaPvlNetworkResponse disableKibanaPvlNetwork(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableKibanaPvlNetworkWithOptions(InstanceId, headers, runtime);
    }

    /**
     * @summary 开启v3 kibana私网
     *
     * @param request EnableKibanaPvlNetworkRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableKibanaPvlNetworkResponse
     */
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

    /**
     * @summary 开启v3 kibana私网
     *
     * @param request EnableKibanaPvlNetworkRequest
     * @return EnableKibanaPvlNetworkResponse
     */
    public EnableKibanaPvlNetworkResponse enableKibanaPvlNetwork(String InstanceId, EnableKibanaPvlNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableKibanaPvlNetworkWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Queries the estimated time that is required to restart a Logstash cluster.
     *
     * @param request EstimatedLogstashRestartTimeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EstimatedLogstashRestartTimeResponse
     */
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

    /**
     * @summary Queries the estimated time that is required to restart a Logstash cluster.
     *
     * @param request EstimatedLogstashRestartTimeRequest
     * @return EstimatedLogstashRestartTimeResponse
     */
    public EstimatedLogstashRestartTimeResponse estimatedLogstashRestartTime(String InstanceId, EstimatedLogstashRestartTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.estimatedLogstashRestartTimeWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Queries the estimated time that is required to restart an Elasticsearch cluster.
     *
     * @param request EstimatedRestartTimeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EstimatedRestartTimeResponse
     */
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

    /**
     * @summary Queries the estimated time that is required to restart an Elasticsearch cluster.
     *
     * @param request EstimatedRestartTimeRequest
     * @return EstimatedRestartTimeResponse
     */
    public EstimatedRestartTimeResponse estimatedRestartTime(String InstanceId, EstimatedRestartTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.estimatedRestartTimeWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Call GetClusterDataInformation to obtain the data information about the cluster.
     *
     * @param request GetClusterDataInformationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClusterDataInformationResponse
     */
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

    /**
     * @summary Call GetClusterDataInformation to obtain the data information about the cluster.
     *
     * @param request GetClusterDataInformationRequest
     * @return GetClusterDataInformationResponse
     */
    public GetClusterDataInformationResponse getClusterDataInformation(GetClusterDataInformationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterDataInformationWithOptions(request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetElastictaskResponse
     */
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

    /**
     * @return GetElastictaskResponse
     */
    public GetElastictaskResponse getElastictask(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getElastictaskWithOptions(InstanceId, headers, runtime);
    }

    /**
     * @summary 获取高级监控报警自定义Grafana监控报警项
     *
     * @param request GetEmonGrafanaAlertsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEmonGrafanaAlertsResponse
     */
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

    /**
     * @summary 获取高级监控报警自定义Grafana监控报警项
     *
     * @param request GetEmonGrafanaAlertsRequest
     * @return GetEmonGrafanaAlertsResponse
     */
    public GetEmonGrafanaAlertsResponse getEmonGrafanaAlerts(String ProjectId, GetEmonGrafanaAlertsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEmonGrafanaAlertsWithOptions(ProjectId, request, headers, runtime);
    }

    /**
     * @summary 获取高级监控报警自定义Grafana监控大盘列表
     *
     * @param request GetEmonGrafanaDashboardsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEmonGrafanaDashboardsResponse
     */
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

    /**
     * @summary 获取高级监控报警自定义Grafana监控大盘列表
     *
     * @param request GetEmonGrafanaDashboardsRequest
     * @return GetEmonGrafanaDashboardsResponse
     */
    public GetEmonGrafanaDashboardsResponse getEmonGrafanaDashboards(String ProjectId, GetEmonGrafanaDashboardsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEmonGrafanaDashboardsWithOptions(ProjectId, request, headers, runtime);
    }

    /**
     * @param request GetEmonMonitorDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEmonMonitorDataResponse
     */
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

    /**
     * @param request GetEmonMonitorDataRequest
     * @return GetEmonMonitorDataResponse
     */
    public GetEmonMonitorDataResponse getEmonMonitorData(String ProjectId, GetEmonMonitorDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEmonMonitorDataWithOptions(ProjectId, request, headers, runtime);
    }

    /**
     * @summary 统计OpenStore实例的存储容量和使用情况
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOpenStoreUsageResponse
     */
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

    /**
     * @summary 统计OpenStore实例的存储容量和使用情况
     *
     * @return GetOpenStoreUsageResponse
     */
    public GetOpenStoreUsageResponse getOpenStoreUsage(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOpenStoreUsageWithOptions(InstanceId, headers, runtime);
    }

    /**
     * @summary The maximum number of nodes.
     *
     * @param request GetRegionConfigurationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRegionConfigurationResponse
     */
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

    /**
     * @summary The maximum number of nodes.
     *
     * @param request GetRegionConfigurationRequest
     * @return GetRegionConfigurationResponse
     */
    public GetRegionConfigurationResponse getRegionConfiguration(GetRegionConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRegionConfigurationWithOptions(request, headers, runtime);
    }

    /**
     * @summary 实例区域商品化配置
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRegionalInstanceConfigResponse
     */
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

    /**
     * @summary 实例区域商品化配置
     *
     * @return GetRegionalInstanceConfigResponse
     */
    public GetRegionalInstanceConfigResponse getRegionalInstanceConfig() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRegionalInstanceConfigWithOptions(headers, runtime);
    }

    /**
     * @summary ES集群可缩容节点
     *
     * @param request GetSuggestShrinkableNodesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSuggestShrinkableNodesResponse
     */
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

    /**
     * @summary ES集群可缩容节点
     *
     * @param request GetSuggestShrinkableNodesRequest
     * @return GetSuggestShrinkableNodesResponse
     */
    public GetSuggestShrinkableNodesResponse getSuggestShrinkableNodes(String InstanceId, GetSuggestShrinkableNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSuggestShrinkableNodesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 获取可数据迁移节点
     *
     * @param request GetTransferableNodesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTransferableNodesResponse
     */
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

    /**
     * @summary 获取可数据迁移节点
     *
     * @param request GetTransferableNodesRequest
     * @return GetTransferableNodesResponse
     */
    public GetTransferableNodesResponse getTransferableNodes(String InstanceId, GetTransferableNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTransferableNodesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Creates a service-linked role.
     *
     * @description > Before you perform auto scaling for a cluster at the China site (aliyun.com) or you use shippers to collect logs, you must create a service-linked role.
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
     * @summary Creates a service-linked role.
     *
     * @description > Before you perform auto scaling for a cluster at the China site (aliyun.com) or you use shippers to collect logs, you must create a service-linked role.
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
     * @summary Installs ES-operator for a Container Service for Kubernetes (ACK) cluster.
     *
     * @description > Before you install a shipper for an ACK cluster, you must call this operation to install ES-operator for the cluster.
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
     * @summary Installs ES-operator for a Container Service for Kubernetes (ACK) cluster.
     *
     * @description > Before you install a shipper for an ACK cluster, you must call this operation to install ES-operator for the cluster.
     *
     * @param request InstallAckOperatorRequest
     * @return InstallAckOperatorResponse
     */
    public InstallAckOperatorResponse installAckOperator(String ClusterId, InstallAckOperatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installAckOperatorWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary Call InstallKibanaSystemPlugin to install the Kibana plug-in. The Kibana specification must be 2-Core 4 GB or higher.
     *
     * @param request InstallKibanaSystemPluginRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallKibanaSystemPluginResponse
     */
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

    /**
     * @summary Call InstallKibanaSystemPlugin to install the Kibana plug-in. The Kibana specification must be 2-Core 4 GB or higher.
     *
     * @param request InstallKibanaSystemPluginRequest
     * @return InstallKibanaSystemPluginResponse
     */
    public InstallKibanaSystemPluginResponse installKibanaSystemPlugin(String InstanceId, InstallKibanaSystemPluginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installKibanaSystemPluginWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary The returned data also contains **Headers** parameters, indicating that header information is returned.
     *
     * @description ls-cn-oew1qbgl\\*\\*\\*\\*
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
     * @summary The returned data also contains **Headers** parameters, indicating that header information is returned.
     *
     * @description ls-cn-oew1qbgl\\*\\*\\*\\*
     *
     * @param request InstallLogstashSystemPluginRequest
     * @return InstallLogstashSystemPluginResponse
     */
    public InstallLogstashSystemPluginResponse installLogstashSystemPlugin(String InstanceId, InstallLogstashSystemPluginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installLogstashSystemPluginWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Call InstallSystemPlugin to install a system preset plug-in.
     *
     * @param request InstallSystemPluginRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallSystemPluginResponse
     */
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

    /**
     * @summary Call InstallSystemPlugin to install a system preset plug-in.
     *
     * @param request InstallSystemPluginRequest
     * @return InstallSystemPluginResponse
     */
    public InstallSystemPluginResponse installSystemPlugin(String InstanceId, InstallSystemPluginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installSystemPluginWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Installs custom plug-ins that are uploaded to the Elasticsearch console.
     *
     * @param request InstallUserPluginsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallUserPluginsResponse
     */
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

    /**
     * @summary Installs custom plug-ins that are uploaded to the Elasticsearch console.
     *
     * @param request InstallUserPluginsRequest
     * @return InstallUserPluginsResponse
     */
    public InstallUserPluginsResponse installUserPlugins(String InstanceId, InstallUserPluginsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installUserPluginsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @param request InterruptElasticsearchTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InterruptElasticsearchTaskResponse
     */
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

    /**
     * @param request InterruptElasticsearchTaskRequest
     * @return InterruptElasticsearchTaskResponse
     */
    public InterruptElasticsearchTaskResponse interruptElasticsearchTask(String InstanceId, InterruptElasticsearchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.interruptElasticsearchTaskWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary After the task is suspended, the Logstash cluster is in the suspended state.
     *
     * @param request InterruptLogstashTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InterruptLogstashTaskResponse
     */
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

    /**
     * @summary After the task is suspended, the Logstash cluster is in the suspended state.
     *
     * @param request InterruptLogstashTaskRequest
     * @return InterruptLogstashTaskResponse
     */
    public InterruptLogstashTaskResponse interruptLogstashTask(String InstanceId, InterruptLogstashTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.interruptLogstashTaskWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Queries a list of Container Service for Kubernetes (ACK) clusters.
     *
     * @param request ListAckClustersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAckClustersResponse
     */
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

    /**
     * @summary Queries a list of Container Service for Kubernetes (ACK) clusters.
     *
     * @param request ListAckClustersRequest
     * @return ListAckClustersResponse
     */
    public ListAckClustersResponse listAckClusters(ListAckClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAckClustersWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries all namespaces in a specified Container Service for Kubernetes (ACK) cluster.
     *
     * @description > When you install a shipper on an ACK cluster, you must specify a namespace. You can call this operation to query all namespaces in the ACK cluster, and select a namespace based on your business requirements.
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
     * @summary Queries all namespaces in a specified Container Service for Kubernetes (ACK) cluster.
     *
     * @description > When you install a shipper on an ACK cluster, you must specify a namespace. You can call this operation to query all namespaces in the ACK cluster, and select a namespace based on your business requirements.
     *
     * @param request ListAckNamespacesRequest
     * @return ListAckNamespacesResponse
     */
    public ListAckNamespacesResponse listAckNamespaces(String ClusterId, ListAckNamespacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAckNamespacesWithOptions(ClusterId, request, headers, runtime);
    }

    /**
     * @summary 变更记录 变更详情
     *
     * @param request ListActionRecordsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListActionRecordsResponse
     */
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

    /**
     * @summary 变更记录 变更详情
     *
     * @param request ListActionRecordsRequest
     * @return ListActionRecordsResponse
     */
    public ListActionRecordsResponse listActionRecords(String InstanceId, ListActionRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listActionRecordsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary es-cn-tl32cpgwa002l\\*\\*\\*\\*
     *
     * @param request ListAllNodeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAllNodeResponse
     */
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

    /**
     * @summary es-cn-tl32cpgwa002l\\*\\*\\*\\*
     *
     * @param request ListAllNodeRequest
     * @return ListAllNodeResponse
     */
    public ListAllNodeResponse listAllNode(String InstanceId, ListAllNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAllNodeWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 实例可添加的OSS引用仓库
     *
     * @param request ListAlternativeSnapshotReposRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAlternativeSnapshotReposResponse
     */
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

    /**
     * @summary 实例可添加的OSS引用仓库
     *
     * @param request ListAlternativeSnapshotReposRequest
     * @return ListAlternativeSnapshotReposResponse
     */
    public ListAlternativeSnapshotReposResponse listAlternativeSnapshotRepos(String InstanceId, ListAlternativeSnapshotReposRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAlternativeSnapshotReposWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary ListApm
     *
     * @param request ListApmRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApmResponse
     */
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

    /**
     * @summary ListApm
     *
     * @param request ListApmRequest
     * @return ListApmResponse
     */
    public ListApmResponse listApm(ListApmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApmWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries the Elasticsearch clusters that can be associated with a Logstash cluster when you configure the X-Pack Monitoring feature for the Logstash cluster.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAvailableEsInstanceIdsResponse
     */
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

    /**
     * @summary Queries the Elasticsearch clusters that can be associated with a Logstash cluster when you configure the X-Pack Monitoring feature for the Logstash cluster.
     *
     * @return ListAvailableEsInstanceIdsResponse
     */
    public ListAvailableEsInstanceIdsResponse listAvailableEsInstanceIds(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAvailableEsInstanceIdsWithOptions(InstanceId, headers, runtime);
    }

    /**
     * @summary Queries shippers.
     *
     * @param request ListCollectorsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCollectorsResponse
     */
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

    /**
     * @summary Queries shippers.
     *
     * @param request ListCollectorsRequest
     * @return ListCollectorsResponse
     */
    public ListCollectorsResponse listCollectors(ListCollectorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCollectorsWithOptions(request, headers, runtime);
    }

    /**
     * @summary ES集群组合索引列表
     *
     * @param request ListComponentIndicesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListComponentIndicesResponse
     */
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

    /**
     * @summary ES集群组合索引列表
     *
     * @param request ListComponentIndicesRequest
     * @return ListComponentIndicesResponse
     */
    public ListComponentIndicesResponse listComponentIndices(String InstanceId, ListComponentIndicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listComponentIndicesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 获取与当前实例进行网络互通的实例列表
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConnectedClustersResponse
     */
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

    /**
     * @summary 获取与当前实例进行网络互通的实例列表
     *
     * @return ListConnectedClustersResponse
     */
    public ListConnectedClustersResponse listConnectedClusters(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConnectedClustersWithOptions(InstanceId, headers, runtime);
    }

    /**
     * @param request ListDataStreamsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataStreamsResponse
     */
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

    /**
     * @param request ListDataStreamsRequest
     * @return ListDataStreamsResponse
     */
    public ListDataStreamsResponse listDataStreams(String InstanceId, ListDataStreamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataStreamsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataTasksResponse
     */
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

    /**
     * @return ListDataTasksResponse
     */
    public ListDataTasksResponse listDataTasks(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataTasksWithOptions(InstanceId, headers, runtime);
    }

    /**
     * @summary Queries the default configuration files of shippers.
     *
     * @param request ListDefaultCollectorConfigurationsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDefaultCollectorConfigurationsResponse
     */
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

    /**
     * @summary Queries the default configuration files of shippers.
     *
     * @param request ListDefaultCollectorConfigurationsRequest
     * @return ListDefaultCollectorConfigurationsResponse
     */
    public ListDefaultCollectorConfigurationsResponse listDefaultCollectorConfigurations(ListDefaultCollectorConfigurationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDefaultCollectorConfigurationsWithOptions(request, headers, runtime);
    }

    /**
     * @summary ListDeprecatedTemplates
     *
     * @param request ListDeprecatedTemplatesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeprecatedTemplatesResponse
     */
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

    /**
     * @summary ListDeprecatedTemplates
     *
     * @param request ListDeprecatedTemplatesRequest
     * @return ListDeprecatedTemplatesResponse
     */
    public ListDeprecatedTemplatesResponse listDeprecatedTemplates(String InstanceId, ListDeprecatedTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDeprecatedTemplatesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Queries the indexes for health diagnosis performed on an Elasticsearch cluster.
     *
     * @param request ListDiagnoseIndicesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDiagnoseIndicesResponse
     */
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

    /**
     * @summary Queries the indexes for health diagnosis performed on an Elasticsearch cluster.
     *
     * @param request ListDiagnoseIndicesRequest
     * @return ListDiagnoseIndicesResponse
     */
    public ListDiagnoseIndicesResponse listDiagnoseIndices(String InstanceId, ListDiagnoseIndicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDiagnoseIndicesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 获取集群诊断报告列表
     *
     * @param request ListDiagnoseReportRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDiagnoseReportResponse
     */
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

    /**
     * @summary 获取集群诊断报告列表
     *
     * @param request ListDiagnoseReportRequest
     * @return ListDiagnoseReportResponse
     */
    public ListDiagnoseReportResponse listDiagnoseReport(String InstanceId, ListDiagnoseReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDiagnoseReportWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Queries the IDs of the historical intelligent O&M reports of an Elasticsearch cluster.
     *
     * @param request ListDiagnoseReportIdsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDiagnoseReportIdsResponse
     */
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

    /**
     * @summary Queries the IDs of the historical intelligent O&M reports of an Elasticsearch cluster.
     *
     * @param request ListDiagnoseReportIdsRequest
     * @return ListDiagnoseReportIdsResponse
     */
    public ListDiagnoseReportIdsResponse listDiagnoseReportIds(String InstanceId, ListDiagnoseReportIdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDiagnoseReportIdsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary The diagnostic item is used to check whether data write requests of a cluster are accumulated. If data write requests are accumulated, a bulk rejection occurs. This may cause data loss and severely consume system resources.
     *
     * @param request ListDiagnosisItemsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDiagnosisItemsResponse
     */
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

    /**
     * @summary The diagnostic item is used to check whether data write requests of a cluster are accumulated. If data write requests are accumulated, a bulk rejection occurs. This may cause data loss and severely consume system resources.
     *
     * @param request ListDiagnosisItemsRequest
     * @return ListDiagnosisItemsResponse
     */
    public ListDiagnosisItemsResponse listDiagnosisItems(ListDiagnosisItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDiagnosisItemsWithOptions(request, headers, runtime);
    }

    /**
     * @param request ListDictInformationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDictInformationResponse
     */
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

    /**
     * @param request ListDictInformationRequest
     * @return ListDictInformationResponse
     */
    public ListDictInformationResponse listDictInformation(String InstanceId, ListDictInformationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDictInformationWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Queries the details of a specified type of dictionary.
     *
     * @param request ListDictsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDictsResponse
     */
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

    /**
     * @summary Queries the details of a specified type of dictionary.
     *
     * @param request ListDictsRequest
     * @return ListDictsResponse
     */
    public ListDictsResponse listDicts(String InstanceId, ListDictsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDictsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @description **Important** To call this operation, you must create the Aliyun Elasticsearch AccessingOOSRole and the system service role AliyunOOSAccessingECS 4ESRole to Elasticsearch the service account to obtain the ECS access permissions of the primary account. For more information, see [Collect ECS service logs](https://help.aliyun.com/document_detail/146446.html).
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
     * @description **Important** To call this operation, you must create the Aliyun Elasticsearch AccessingOOSRole and the system service role AliyunOOSAccessingECS 4ESRole to Elasticsearch the service account to obtain the ECS access permissions of the primary account. For more information, see [Collect ECS service logs](https://help.aliyun.com/document_detail/146446.html).
     *
     * @param request ListEcsInstancesRequest
     * @return ListEcsInstancesResponse
     */
    public ListEcsInstancesResponse listEcsInstances(ListEcsInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEcsInstancesWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries the driver files of a Logstash cluster.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExtendfilesResponse
     */
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

    /**
     * @summary Queries the driver files of a Logstash cluster.
     *
     * @return ListExtendfilesResponse
     */
    public ListExtendfilesResponse listExtendfiles(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listExtendfilesWithOptions(InstanceId, headers, runtime);
    }

    /**
     * @param request ListILMPoliciesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListILMPoliciesResponse
     */
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

    /**
     * @param request ListILMPoliciesRequest
     * @return ListILMPoliciesResponse
     */
    public ListILMPoliciesResponse listILMPolicies(String InstanceId, ListILMPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listILMPoliciesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @param request ListIndexTemplatesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIndexTemplatesResponse
     */
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

    /**
     * @param request ListIndexTemplatesRequest
     * @return ListIndexTemplatesResponse
     */
    public ListIndexTemplatesResponse listIndexTemplates(String InstanceId, ListIndexTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIndexTemplatesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 查询Elasticsearch实例列表
     *
     * @param request ListInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceResponse
     */
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

    /**
     * @summary 查询Elasticsearch实例列表
     *
     * @param request ListInstanceRequest
     * @return ListInstanceResponse
     */
    public ListInstanceResponse listInstance(ListInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceWithOptions(request, headers, runtime);
    }

    /**
     * @summary 集群触发的硬件运维事件列表
     *
     * @param tmpReq ListInstanceHistoryEventsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceHistoryEventsResponse
     */
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

    /**
     * @summary 集群触发的硬件运维事件列表
     *
     * @param request ListInstanceHistoryEventsRequest
     * @return ListInstanceHistoryEventsResponse
     */
    public ListInstanceHistoryEventsResponse listInstanceHistoryEvents(ListInstanceHistoryEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceHistoryEventsWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取当前实例先特定的索引列表
     *
     * @param request ListInstanceIndicesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceIndicesResponse
     */
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

    /**
     * @summary 获取当前实例先特定的索引列表
     *
     * @param request ListInstanceIndicesRequest
     * @return ListInstanceIndicesResponse
     */
    public ListInstanceIndicesResponse listInstanceIndices(String InstanceId, ListInstanceIndicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceIndicesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Queries a list of Kibana plug-ins.
     *
     * @param request ListKibanaPluginsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListKibanaPluginsResponse
     */
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

    /**
     * @summary Queries a list of Kibana plug-ins.
     *
     * @param request ListKibanaPluginsRequest
     * @return ListKibanaPluginsResponse
     */
    public ListKibanaPluginsResponse listKibanaPlugins(String InstanceId, ListKibanaPluginsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listKibanaPluginsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 查询kibana私网连接信息
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListKibanaPvlNetworkResponse
     */
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

    /**
     * @summary 查询kibana私网连接信息
     *
     * @return ListKibanaPvlNetworkResponse
     */
    public ListKibanaPvlNetworkResponse listKibanaPvlNetwork(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listKibanaPvlNetworkWithOptions(InstanceId, headers, runtime);
    }

    /**
     * @summary Logstash集群列表
     *
     * @param request ListLogstashRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLogstashResponse
     */
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

    /**
     * @summary Logstash集群列表
     *
     * @param request ListLogstashRequest
     * @return ListLogstashResponse
     */
    public ListLogstashResponse listLogstash(ListLogstashRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLogstashWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取Logstash日志
     *
     * @param request ListLogstashLogRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLogstashLogResponse
     */
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

    /**
     * @summary 获取Logstash日志
     *
     * @param request ListLogstashLogRequest
     * @return ListLogstashLogResponse
     */
    public ListLogstashLogResponse listLogstashLog(String InstanceId, ListLogstashLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLogstashLogWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Logstash插件列表
     *
     * @param request ListLogstashPluginsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLogstashPluginsResponse
     */
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

    /**
     * @summary Logstash插件列表
     *
     * @param request ListLogstashPluginsRequest
     * @return ListLogstashPluginsResponse
     */
    public ListLogstashPluginsResponse listLogstashPlugins(String InstanceId, ListLogstashPluginsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLogstashPluginsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Queries the statuses of Elastic Compute Service (ECS) instances on which a shipper is installed.
     *
     * @param request ListNodesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodesResponse
     */
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

    /**
     * @summary Queries the statuses of Elastic Compute Service (ECS) instances on which a shipper is installed.
     *
     * @param request ListNodesRequest
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodes(String ResId, ListNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNodesWithOptions(ResId, request, headers, runtime);
    }

    /**
     * @param request ListPipelineRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPipelineResponse
     */
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

    /**
     * @param request ListPipelineRequest
     * @return ListPipelineResponse
     */
    public ListPipelineResponse listPipeline(String InstanceId, ListPipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelineWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary The error message returned.
     *
     * @param request ListPipelineIdsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPipelineIdsResponse
     */
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

    /**
     * @summary The error message returned.
     *
     * @param request ListPipelineIdsRequest
     * @return ListPipelineIdsResponse
     */
    public ListPipelineIdsResponse listPipelineIds(String InstanceId, ListPipelineIdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelineIdsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary ES系统插件列表
     *
     * @param request ListPluginsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPluginsResponse
     */
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

    /**
     * @summary ES系统插件列表
     *
     * @param request ListPluginsRequest
     * @return ListPluginsResponse
     */
    public ListPluginsResponse listPlugins(String InstanceId, ListPluginsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPluginsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 查看Elasticsearch集群各种类型的日志
     *
     * @param request ListSearchLogRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSearchLogResponse
     */
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

    /**
     * @summary 查看Elasticsearch集群各种类型的日志
     *
     * @param request ListSearchLogRequest
     * @return ListSearchLogResponse
     */
    public ListSearchLogResponse listSearchLog(String InstanceId, ListSearchLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSearchLogWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Queries the information about shards that are being restored or shards that are restored. By default, this operation returns only the information about shards that are being restored after you call this operation.
     *
     * @description > The restoration of a shard is a process of synchronizing data from a primary shard to a replica shard. After the restoration is complete, the replica shard is available for data searches.
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
     * @summary Queries the information about shards that are being restored or shards that are restored. By default, this operation returns only the information about shards that are being restored after you call this operation.
     *
     * @description > The restoration of a shard is a process of synchronizing data from a primary shard to a replica shard. After the restoration is complete, the replica shard is available for data searches.
     *
     * @param request ListShardRecoveriesRequest
     * @return ListShardRecoveriesResponse
     */
    public ListShardRecoveriesResponse listShardRecoveries(String InstanceId, ListShardRecoveriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listShardRecoveriesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 获取跨集群索引仓库列表
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSnapshotReposByInstanceIdResponse
     */
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

    /**
     * @summary 获取跨集群索引仓库列表
     *
     * @return ListSnapshotReposByInstanceIdResponse
     */
    public ListSnapshotReposByInstanceIdResponse listSnapshotReposByInstanceId(String InstanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSnapshotReposByInstanceIdWithOptions(InstanceId, headers, runtime);
    }

    /**
     * @summary 查看资源和标签关系
     *
     * @param request ListTagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
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

    /**
     * @summary 查看资源和标签关系
     *
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查看所有已常见的标签
     *
     * @param request ListTagsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagsResponse
     */
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

    /**
     * @summary 查看所有已常见的标签
     *
     * @param request ListTagsRequest
     * @return ListTagsResponse
     */
    public ListTagsResponse listTags(ListTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTagsWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries the statuses of endpoints in the virtual private cloud (VPC) within the Elasticsearch service account.
     *
     * @param request ListVpcEndpointsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVpcEndpointsResponse
     */
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

    /**
     * @summary Queries the statuses of endpoints in the virtual private cloud (VPC) within the Elasticsearch service account.
     *
     * @param request ListVpcEndpointsRequest
     * @return ListVpcEndpointsResponse
     */
    public ListVpcEndpointsResponse listVpcEndpoints(String InstanceId, ListVpcEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listVpcEndpointsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Call the MigrateToOtherZone to migrate the nodes in the specified zone to the destination zone.
     *
     * @description If the specifications in your zone are insufficient, you can upgrade your instance to nodes in another zone. Before calling this interface, you must ensure that:
     * *   The error message returned because the current account is in a zone that has sufficient resources.
     *     After migrating nodes with current specifications to another zone, you need to manually [upgrade cluster](https://help.aliyun.com/document_detail/96650.html) because the cluster will not be upgraded during the migration process. Therefore, select a zone with sufficient resources to avoid cluster upgrade failure. We recommend that you choose new zones that are in lower alphabetical order. For example, for cn-hangzhou-e and cn-hangzhou-h zones, choose cn-hangzhou-h first.
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
     * @summary Call the MigrateToOtherZone to migrate the nodes in the specified zone to the destination zone.
     *
     * @description If the specifications in your zone are insufficient, you can upgrade your instance to nodes in another zone. Before calling this interface, you must ensure that:
     * *   The error message returned because the current account is in a zone that has sufficient resources.
     *     After migrating nodes with current specifications to another zone, you need to manually [upgrade cluster](https://help.aliyun.com/document_detail/96650.html) because the cluster will not be upgraded during the migration process. Therefore, select a zone with sufficient resources to avoid cluster upgrade failure. We recommend that you choose new zones that are in lower alphabetical order. For example, for cn-hangzhou-e and cn-hangzhou-h zones, choose cn-hangzhou-h first.
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

    /**
     * @summary Changes the Elastic Compute Service (ECS) instances on which a shipper is installed.
     *
     * @param request ModifyDeployMachineRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDeployMachineResponse
     */
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

    /**
     * @summary Changes the Elastic Compute Service (ECS) instances on which a shipper is installed.
     *
     * @param request ModifyDeployMachineRequest
     * @return ModifyDeployMachineResponse
     */
    public ModifyDeployMachineResponse modifyDeployMachine(String ResId, ModifyDeployMachineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyDeployMachineWithOptions(ResId, request, headers, runtime);
    }

    /**
     * @param request ModifyElastictaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyElastictaskResponse
     */
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

    /**
     * @param request ModifyElastictaskRequest
     * @return ModifyElastictaskResponse
     */
    public ModifyElastictaskResponse modifyElastictask(String InstanceId, ModifyElastictaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyElastictaskWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary ## RequestBody
     * You must also specify the following parameters in the RequestBody parameter to specify the maintenance window information.  
     * | Parameter | Type | Required | Example | Description |
     * | --------- | ---- | -------- | ------- | ----------- |
     * | maintainStartTime | String | No | 02:00Z | The start time of the maintenance window. Specify the time in the HH:mmZ format. The time must be in UTC. |
     * | maintainEndTime | String | No | 06:00Z | The end time of the maintenance window. Specify the time in the HH:mmZ format. The time must be displayed in UTC. |
     * | openMaintainTime | boolean | Yes | true | Specifies whether to enable the maintenance window feature. Only **true** is supported, indicating that the feature is enabled. |
     * Examples: 
     * ```
     * {
     *     "openMaintainTime": true,
     *     "maintainStartTime": "03:00Z",
     *     "maintainEndTime": "04:00Z"
     * }
     * ```
     *
     * @description es-cn-n6w1o1x0w001c\\*\\*\\*\\*
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
     * @summary ## RequestBody
     * You must also specify the following parameters in the RequestBody parameter to specify the maintenance window information.  
     * | Parameter | Type | Required | Example | Description |
     * | --------- | ---- | -------- | ------- | ----------- |
     * | maintainStartTime | String | No | 02:00Z | The start time of the maintenance window. Specify the time in the HH:mmZ format. The time must be in UTC. |
     * | maintainEndTime | String | No | 06:00Z | The end time of the maintenance window. Specify the time in the HH:mmZ format. The time must be displayed in UTC. |
     * | openMaintainTime | boolean | Yes | true | Specifies whether to enable the maintenance window feature. Only **true** is supported, indicating that the feature is enabled. |
     * Examples: 
     * ```
     * {
     *     "openMaintainTime": true,
     *     "maintainStartTime": "03:00Z",
     *     "maintainEndTime": "04:00Z"
     * }
     * ```
     *
     * @description es-cn-n6w1o1x0w001c\\*\\*\\*\\*
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
     * @summary >  If you want to add an IP address whitelist, you can set the modifyMode parameter only to Cover. If you set this parameter to Delete or Append, you can only update an IP address whitelist.
     * *   If you set the modifyMode parameter to Cover and leave the ips parameter empty, the system deletes the specified whitelist. If the whitelist specified by using the groupName parameter does not exist, the system creates such a whitelist.
     * *   If you set the modifyMode parameter to Delete, at least one IP address must be retained for the specified whitelist.
     * *   If you set the modifyMode parameter to Append, you must make sure that the specified whitelist exists. Otherwise, the system reports the NotFound error.
     *
     * @description The ID of the cluster.
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
     * @summary >  If you want to add an IP address whitelist, you can set the modifyMode parameter only to Cover. If you set this parameter to Delete or Append, you can only update an IP address whitelist.
     * *   If you set the modifyMode parameter to Cover and leave the ips parameter empty, the system deletes the specified whitelist. If the whitelist specified by using the groupName parameter does not exist, the system creates such a whitelist.
     * *   If you set the modifyMode parameter to Delete, at least one IP address must be retained for the specified whitelist.
     * *   If you set the modifyMode parameter to Append, you must make sure that the specified whitelist exists. Otherwise, the system reports the NotFound error.
     *
     * @description The ID of the cluster.
     *
     * @param request ModifyWhiteIpsRequest
     * @return ModifyWhiteIpsResponse
     */
    public ModifyWhiteIpsResponse modifyWhiteIps(String InstanceId, ModifyWhiteIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyWhiteIpsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Migrates an Elasticsearch cluster to a specified resource group.
     *
     * @param request MoveResourceGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveResourceGroupResponse
     */
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

    /**
     * @summary Migrates an Elasticsearch cluster to a specified resource group.
     *
     * @param request MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroup(String InstanceId, MoveResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.moveResourceGroupWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @param request OpenDiagnosisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenDiagnosisResponse
     */
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

    /**
     * @param request OpenDiagnosisRequest
     * @return OpenDiagnosisResponse
     */
    public OpenDiagnosisResponse openDiagnosis(String InstanceId, OpenDiagnosisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openDiagnosisWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @description >  To ensure data security, we recommend that you enable HTTPS.
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
     * @description >  To ensure data security, we recommend that you enable HTTPS.
     *
     * @param request OpenHttpsRequest
     * @return OpenHttpsResponse
     */
    public OpenHttpsResponse openHttps(String InstanceId, OpenHttpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openHttpsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @param request PostEmonTryAlarmRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PostEmonTryAlarmRuleResponse
     */
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

    /**
     * @param request PostEmonTryAlarmRuleRequest
     * @return PostEmonTryAlarmRuleResponse
     */
    public PostEmonTryAlarmRuleResponse postEmonTryAlarmRule(String ProjectId, String AlarmGroupId, PostEmonTryAlarmRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.postEmonTryAlarmRuleWithOptions(ProjectId, AlarmGroupId, request, headers, runtime);
    }

    /**
     * @param request RecommendTemplatesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecommendTemplatesResponse
     */
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

    /**
     * @param request RecommendTemplatesRequest
     * @return RecommendTemplatesResponse
     */
    public RecommendTemplatesResponse recommendTemplates(String InstanceId, RecommendTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recommendTemplatesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Installs a shipper that failed to be installed when you create the shipper.
     *
     * @param request ReinstallCollectorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReinstallCollectorResponse
     */
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

    /**
     * @summary Installs a shipper that failed to be installed when you create the shipper.
     *
     * @param request ReinstallCollectorRequest
     * @return ReinstallCollectorResponse
     */
    public ReinstallCollectorResponse reinstallCollector(String ResId, ReinstallCollectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reinstallCollectorWithOptions(ResId, request, headers, runtime);
    }

    /**
     * @summary RemoveApm
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveApmResponse
     */
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

    /**
     * @summary RemoveApm
     *
     * @return RemoveApmResponse
     */
    public RemoveApmResponse removeApm(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeApmWithOptions(instanceId, headers, runtime);
    }

    /**
     * @summary Call RenewInstance to renew a subscription instance.
     *
     * @param request RenewInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewInstanceResponse
     */
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

    /**
     * @summary Call RenewInstance to renew a subscription instance.
     *
     * @param request RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    public RenewInstanceResponse renewInstance(String InstanceId, RenewInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renewInstanceWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Renews a Logstash cluster.
     *
     * @param request RenewLogstashRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewLogstashResponse
     */
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

    /**
     * @summary Renews a Logstash cluster.
     *
     * @param request RenewLogstashRequest
     * @return RenewLogstashResponse
     */
    public RenewLogstashResponse renewLogstash(String InstanceId, RenewLogstashRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renewLogstashWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Restarts a shipper.
     *
     * @param request RestartCollectorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartCollectorResponse
     */
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

    /**
     * @summary Restarts a shipper.
     *
     * @param request RestartCollectorRequest
     * @return RestartCollectorResponse
     */
    public RestartCollectorResponse restartCollector(String ResId, RestartCollectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartCollectorWithOptions(ResId, request, headers, runtime);
    }

    /**
     * @summary You can call this operation to restart a specified Elasticsearch instance.
     *
     * @description >  After the instance is restarted, the instance enters the activating state. After the instance is restarted, its status changes to active. Alibaba Cloud Elasticsearch supports restarting a single node. Restarting a node can be divided into normal restart and blue-green restart.
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
     * @summary You can call this operation to restart a specified Elasticsearch instance.
     *
     * @description >  After the instance is restarted, the instance enters the activating state. After the instance is restarted, its status changes to active. Alibaba Cloud Elasticsearch supports restarting a single node. Restarting a node can be divided into normal restart and blue-green restart.
     *
     * @param request RestartInstanceRequest
     * @return RestartInstanceResponse
     */
    public RestartInstanceResponse restartInstance(String InstanceId, RestartInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartInstanceWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 重启Logstash集群
     *
     * @param request RestartLogstashRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartLogstashResponse
     */
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

    /**
     * @summary 重启Logstash集群
     *
     * @param request RestartLogstashRequest
     * @return RestartLogstashResponse
     */
    public RestartLogstashResponse restartLogstash(String InstanceId, RestartLogstashRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartLogstashWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @param request ResumeElasticsearchTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeElasticsearchTaskResponse
     */
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

    /**
     * @param request ResumeElasticsearchTaskRequest
     * @return ResumeElasticsearchTaskResponse
     */
    public ResumeElasticsearchTaskResponse resumeElasticsearchTask(String InstanceId, ResumeElasticsearchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeElasticsearchTaskWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Resumes a change task of a Logstash cluster. After the task is resumed, the Logstash cluster is in the activating state.
     *
     * @param request ResumeLogstashTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeLogstashTaskResponse
     */
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

    /**
     * @summary Resumes a change task of a Logstash cluster. After the task is resumed, the Logstash cluster is in the activating state.
     *
     * @param request ResumeLogstashTaskRequest
     * @return ResumeLogstashTaskResponse
     */
    public ResumeLogstashTaskResponse resumeLogstashTask(String InstanceId, ResumeLogstashTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeLogstashTaskWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 滚动数据流，生成新索引
     *
     * @param request RolloverDataStreamRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RolloverDataStreamResponse
     */
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

    /**
     * @summary 滚动数据流，生成新索引
     *
     * @param request RolloverDataStreamRequest
     * @return RolloverDataStreamResponse
     */
    public RolloverDataStreamResponse rolloverDataStream(String InstanceId, String DataStream, RolloverDataStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rolloverDataStreamWithOptions(InstanceId, DataStream, request, headers, runtime);
    }

    /**
     * @summary Runs pipelines in a Logstash cluster.
     *
     * @param request RunPipelinesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunPipelinesResponse
     */
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

    /**
     * @summary Runs pipelines in a Logstash cluster.
     *
     * @param request RunPipelinesRequest
     * @return RunPipelinesResponse
     */
    public RunPipelinesResponse runPipelines(String InstanceId, RunPipelinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runPipelinesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary ES集群缩节点
     *
     * @param request ShrinkNodeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ShrinkNodeResponse
     */
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

    /**
     * @summary ES集群缩节点
     *
     * @param request ShrinkNodeRequest
     * @return ShrinkNodeResponse
     */
    public ShrinkNodeResponse shrinkNode(String InstanceId, ShrinkNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.shrinkNodeWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary StartApm
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartApmResponse
     */
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

    /**
     * @summary StartApm
     *
     * @return StartApmResponse
     */
    public StartApmResponse startApm(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startApmWithOptions(instanceId, headers, runtime);
    }

    /**
     * @summary Starts a collector to collect data.
     *
     * @param request StartCollectorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartCollectorResponse
     */
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

    /**
     * @summary Starts a collector to collect data.
     *
     * @param request StartCollectorRequest
     * @return StartCollectorResponse
     */
    public StartCollectorResponse startCollector(String ResId, StartCollectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startCollectorWithOptions(ResId, request, headers, runtime);
    }

    /**
     * @summary StopApm
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopApmResponse
     */
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

    /**
     * @summary StopApm
     *
     * @return StopApmResponse
     */
    public StopApmResponse stopApm(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopApmWithOptions(instanceId, headers, runtime);
    }

    /**
     * @summary Stops a shipper.
     *
     * @param request StopCollectorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopCollectorResponse
     */
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

    /**
     * @summary Stops a shipper.
     *
     * @param request StopCollectorRequest
     * @return StopCollectorResponse
     */
    public StopCollectorResponse stopCollector(String ResId, StopCollectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopCollectorWithOptions(ResId, request, headers, runtime);
    }

    /**
     * @summary Stops pipelines in a Logstash cluster.
     *
     * @param request StopPipelinesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopPipelinesResponse
     */
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

    /**
     * @summary Stops pipelines in a Logstash cluster.
     *
     * @param request StopPipelinesRequest
     * @return StopPipelinesResponse
     */
    public StopPipelinesResponse stopPipelines(String InstanceId, StopPipelinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopPipelinesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary The information about the clusters and tags.
     *
     * @param request TagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
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

    /**
     * @summary The information about the clusters and tags.
     *
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.tagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * @summary 缩节点，数据迁移
     *
     * @param request TransferNodeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TransferNodeResponse
     */
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

    /**
     * @summary 缩节点，数据迁移
     *
     * @param request TransferNodeRequest
     * @return TransferNodeResponse
     */
    public TransferNodeResponse transferNode(String InstanceId, TransferNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.transferNodeWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 开关ES集群及Kibana节点公私网访问
     *
     * @param request TriggerNetworkRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TriggerNetworkResponse
     */
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

    /**
     * @summary 开关ES集群及Kibana节点公私网访问
     *
     * @param request TriggerNetworkRequest
     * @return TriggerNetworkResponse
     */
    public TriggerNetworkResponse triggerNetwork(String InstanceId, TriggerNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.triggerNetworkWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Call the UninstallKibanaPlugin to uninstall the Kibana plug-in.
     *
     * @param request UninstallKibanaPluginRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UninstallKibanaPluginResponse
     */
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

    /**
     * @summary Call the UninstallKibanaPlugin to uninstall the Kibana plug-in.
     *
     * @param request UninstallKibanaPluginRequest
     * @return UninstallKibanaPluginResponse
     */
    public UninstallKibanaPluginResponse uninstallKibanaPlugin(String InstanceId, UninstallKibanaPluginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uninstallKibanaPluginWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 卸载Logstash实例已安装的插件
     *
     * @param request UninstallLogstashPluginRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UninstallLogstashPluginResponse
     */
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

    /**
     * @summary 卸载Logstash实例已安装的插件
     *
     * @param request UninstallLogstashPluginRequest
     * @return UninstallLogstashPluginResponse
     */
    public UninstallLogstashPluginResponse uninstallLogstashPlugin(String InstanceId, UninstallLogstashPluginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uninstallLogstashPluginWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Call UninstallPlugin to uninstall the preset plug-in.
     *
     * @param request UninstallPluginRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UninstallPluginResponse
     */
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

    /**
     * @summary Call UninstallPlugin to uninstall the preset plug-in.
     *
     * @param request UninstallPluginRequest
     * @return UninstallPluginResponse
     */
    public UninstallPluginResponse uninstallPlugin(String InstanceId, UninstallPluginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uninstallPluginWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 删除ES集群实例的用户可见标签
     *
     * @description When you call this operation, take note of the following items:
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
     * @summary 删除ES集群实例的用户可见标签
     *
     * @description When you call this operation, take note of the following items:
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
     * @summary 修改ES集群密码
     *
     * @description 5A2CFF0E-5718-45B5-9D4D-70B3FF\\*\\*\\*\\*
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
     * @summary 修改ES集群密码
     *
     * @description 5A2CFF0E-5718-45B5-9D4D-70B3FF\\*\\*\\*\\*
     *
     * @param request UpdateAdminPasswordRequest
     * @return UpdateAdminPasswordResponse
     */
    public UpdateAdminPasswordResponse updateAdminPassword(String InstanceId, UpdateAdminPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAdminPasswordWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Call UpdateAdvancedSetting to change the garbage collector configuration for the specified instance.
     *
     * @param request UpdateAdvancedSettingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAdvancedSettingResponse
     */
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

    /**
     * @summary Call UpdateAdvancedSetting to change the garbage collector configuration for the specified instance.
     *
     * @param request UpdateAdvancedSettingRequest
     * @return UpdateAdvancedSettingResponse
     */
    public UpdateAdvancedSettingResponse updateAdvancedSetting(String InstanceId, UpdateAdvancedSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAdvancedSettingWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Updates the dictionary file of the analysis-aliws plug-in.
     *
     * @description Before you call this operation, take note of the following items:
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
     * @summary Updates the dictionary file of the analysis-aliws plug-in.
     *
     * @description Before you call this operation, take note of the following items:
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

    /**
     * @summary 修改APM实规格配置
     *
     * @param request UpdateApmRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApmResponse
     */
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

    /**
     * @summary 修改APM实规格配置
     *
     * @param request UpdateApmRequest
     * @return UpdateApmResponse
     */
    public UpdateApmResponse updateApm(String instanceId, UpdateApmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApmWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * @deprecated OpenAPI UpdateBlackIps is deprecated
     *
     * @summary 修改ES实例访问黑名单，已废弃
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
     * @deprecated OpenAPI UpdateBlackIps is deprecated
     *
     * @summary 修改ES实例访问黑名单，已废弃
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

    /**
     * @summary Updates the configurations of a shipper.
     *
     * @param request UpdateCollectorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCollectorResponse
     */
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

    /**
     * @summary Updates the configurations of a shipper.
     *
     * @param request UpdateCollectorRequest
     * @return UpdateCollectorResponse
     */
    public UpdateCollectorResponse updateCollector(String ResId, UpdateCollectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCollectorWithOptions(ResId, request, headers, runtime);
    }

    /**
     * @summary Changes the name of a shipper.
     *
     * @param request UpdateCollectorNameRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCollectorNameResponse
     */
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

    /**
     * @summary Changes the name of a shipper.
     *
     * @param request UpdateCollectorNameRequest
     * @return UpdateCollectorNameResponse
     */
    public UpdateCollectorNameResponse updateCollectorName(String ResId, UpdateCollectorNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCollectorNameWithOptions(ResId, request, headers, runtime);
    }

    /**
     * @summary 修改ES集群动态索引
     *
     * @param request UpdateComponentIndexRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateComponentIndexResponse
     */
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

    /**
     * @summary 修改ES集群动态索引
     *
     * @param request UpdateComponentIndexRequest
     * @return UpdateComponentIndexResponse
     */
    public UpdateComponentIndexResponse updateComponentIndex(String InstanceId, String name, UpdateComponentIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateComponentIndexWithOptions(InstanceId, name, request, headers, runtime);
    }

    /**
     * @summary 修改elasticsearch实例名称名称
     *
     * @param request UpdateDescriptionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDescriptionResponse
     */
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

    /**
     * @summary 修改elasticsearch实例名称名称
     *
     * @param request UpdateDescriptionRequest
     * @return UpdateDescriptionResponse
     */
    public UpdateDescriptionResponse updateDescription(String InstanceId, UpdateDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDescriptionWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Call UpdateDiagnosisSettings to update the instance of intelligent operation&maintenance (O&M) scene settings.
     *
     * @param request UpdateDiagnosisSettingsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDiagnosisSettingsResponse
     */
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

    /**
     * @summary Call UpdateDiagnosisSettings to update the instance of intelligent operation&maintenance (O&M) scene settings.
     *
     * @param request UpdateDiagnosisSettingsRequest
     * @return UpdateDiagnosisSettingsResponse
     */
    public UpdateDiagnosisSettingsResponse updateDiagnosisSettings(String InstanceId, UpdateDiagnosisSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDiagnosisSettingsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Updates a dictionary of an Elasticsearch cluster.
     *
     * @description Before you call this operation, take note of the following items:
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
     * @summary Updates a dictionary of an Elasticsearch cluster.
     *
     * @description Before you call this operation, take note of the following items:
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

    /**
     * @summary 修改集群动态配置
     *
     * @param request UpdateDynamicSettingsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDynamicSettingsResponse
     */
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

    /**
     * @summary 修改集群动态配置
     *
     * @param request UpdateDynamicSettingsRequest
     * @return UpdateDynamicSettingsResponse
     */
    public UpdateDynamicSettingsResponse updateDynamicSettings(String InstanceId, UpdateDynamicSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDynamicSettingsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @param request UpdateExtendConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateExtendConfigResponse
     */
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

    /**
     * @param request UpdateExtendConfigRequest
     * @return UpdateExtendConfigResponse
     */
    public UpdateExtendConfigResponse updateExtendConfig(String InstanceId, UpdateExtendConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateExtendConfigWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Updates the driver files of a Logstash cluster.
     *
     * @description When you call this operation, take note of the following items: You can call this operation only to delete the driver files that are uploaded to a Logstash cluster in the Alibaba Cloud Management Console. You can add or modify driver files only in the Alibaba Cloud Management Console.
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
     * @summary Updates the driver files of a Logstash cluster.
     *
     * @description When you call this operation, take note of the following items: You can call this operation only to delete the driver files that are uploaded to a Logstash cluster in the Alibaba Cloud Management Console. You can add or modify driver files only in the Alibaba Cloud Management Console.
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
     * @summary Performs a rolling update for the IK dictionaries of an Elasticsearch cluster.
     *
     * @description Before you call this operation, take note of the following items:
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
     * @summary Performs a rolling update for the IK dictionaries of an Elasticsearch cluster.
     *
     * @description Before you call this operation, take note of the following items:
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

    /**
     * @summary 修改ES集群索引生命周期策略
     *
     * @param request UpdateILMPolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateILMPolicyResponse
     */
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

    /**
     * @summary 修改ES集群索引生命周期策略
     *
     * @param request UpdateILMPolicyRequest
     * @return UpdateILMPolicyResponse
     */
    public UpdateILMPolicyResponse updateILMPolicy(String InstanceId, String PolicyName, UpdateILMPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateILMPolicyWithOptions(InstanceId, PolicyName, request, headers, runtime);
    }

    /**
     * @summary 修改ES集群索引模版配置
     *
     * @param request UpdateIndexTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIndexTemplateResponse
     */
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

    /**
     * @summary 修改ES集群索引模版配置
     *
     * @param request UpdateIndexTemplateRequest
     * @return UpdateIndexTemplateResponse
     */
    public UpdateIndexTemplateResponse updateIndexTemplate(String InstanceId, String IndexTemplate, UpdateIndexTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIndexTemplateWithOptions(InstanceId, IndexTemplate, request, headers, runtime);
    }

    /**
     * @summary 修改ES集群节点配置
     *
     * @description es-cn-n6w1ptcb30009\\*\\*\\*\\*
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
     * @summary 修改ES集群节点配置
     *
     * @description es-cn-n6w1ptcb30009\\*\\*\\*\\*
     *
     * @param request UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(String InstanceId, UpdateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Call UpdateInstanceChargeType to change the billing method of a pay-as-you-go instance to subscription.
     *
     * @param request UpdateInstanceChargeTypeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceChargeTypeResponse
     */
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

    /**
     * @summary Call UpdateInstanceChargeType to change the billing method of a pay-as-you-go instance to subscription.
     *
     * @param request UpdateInstanceChargeTypeRequest
     * @return UpdateInstanceChargeTypeResponse
     */
    public UpdateInstanceChargeTypeResponse updateInstanceChargeType(String InstanceId, UpdateInstanceChargeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceChargeTypeWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Call UpdateInstanceSettings to update the YML configuration of a specified instance.
     *
     * @description When you call this operation, take note of the following items:
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
     * @summary Call UpdateInstanceSettings to update the YML configuration of a specified instance.
     *
     * @description When you call this operation, take note of the following items:
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

    /**
     * @summary 更新kibana私网链接
     *
     * @param request UpdateKibanaPvlNetworkRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateKibanaPvlNetworkResponse
     */
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

    /**
     * @summary 更新kibana私网链接
     *
     * @param request UpdateKibanaPvlNetworkRequest
     * @return UpdateKibanaPvlNetworkResponse
     */
    public UpdateKibanaPvlNetworkResponse updateKibanaPvlNetwork(String InstanceId, UpdateKibanaPvlNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateKibanaPvlNetworkWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Call UpdateKibanaSettings to modify the Kibana configuration. Currently, you can only modify the Kibana language configuration.
     *
     * @param request UpdateKibanaSettingsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateKibanaSettingsResponse
     */
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

    /**
     * @summary Call UpdateKibanaSettings to modify the Kibana configuration. Currently, you can only modify the Kibana language configuration.
     *
     * @param request UpdateKibanaSettingsRequest
     * @return UpdateKibanaSettingsResponse
     */
    public UpdateKibanaSettingsResponse updateKibanaSettings(String InstanceId, UpdateKibanaSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateKibanaSettingsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Updates an IP address whitelist for access to the Kibana console of a specified Elasticsearch cluster.
     *
     * @description *   Before you call this operation, you must make sure that the cluster is not in the activating, invalid, or inactive state.
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
     * @summary Updates an IP address whitelist for access to the Kibana console of a specified Elasticsearch cluster.
     *
     * @description *   Before you call this operation, you must make sure that the cluster is not in the activating, invalid, or inactive state.
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

    /**
     * @summary 修改Logstash节点规格磁盘配置
     *
     * @param request UpdateLogstashRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLogstashResponse
     */
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

    /**
     * @summary 修改Logstash节点规格磁盘配置
     *
     * @param request UpdateLogstashRequest
     * @return UpdateLogstashResponse
     */
    public UpdateLogstashResponse updateLogstash(String InstanceId, UpdateLogstashRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLogstashWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Switches the billing method of a Logstash cluster from pay-as-you-go to subscription.
     *
     * @param request UpdateLogstashChargeTypeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLogstashChargeTypeResponse
     */
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

    /**
     * @summary Switches the billing method of a Logstash cluster from pay-as-you-go to subscription.
     *
     * @param request UpdateLogstashChargeTypeRequest
     * @return UpdateLogstashChargeTypeResponse
     */
    public UpdateLogstashChargeTypeResponse updateLogstashChargeType(String InstanceId, UpdateLogstashChargeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLogstashChargeTypeWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Changes the name of a specified Logstash cluster.
     *
     * @description When you call this operation, take note of the following items: You cannot change the name of a cluster that is in the activating, invalid, or inactive state.
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
     * @summary Changes the name of a specified Logstash cluster.
     *
     * @description When you call this operation, take note of the following items: You cannot change the name of a cluster that is in the activating, invalid, or inactive state.
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
     * @summary Updates the configuration of a specified Logstash cluster.
     *
     * @description When you call this operation, take note of the following items:
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
     * @summary Updates the configuration of a specified Logstash cluster.
     *
     * @description When you call this operation, take note of the following items:
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

    /**
     * @summary 修改Logstash管道配置
     *
     * @param request UpdatePipelineManagementConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePipelineManagementConfigResponse
     */
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

    /**
     * @summary 修改Logstash管道配置
     *
     * @param request UpdatePipelineManagementConfigRequest
     * @return UpdatePipelineManagementConfigResponse
     */
    public UpdatePipelineManagementConfigResponse updatePipelineManagementConfig(String InstanceId, UpdatePipelineManagementConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePipelineManagementConfigWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Updates a pipeline of a Logstash cluster.
     *
     * @param request UpdatePipelinesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePipelinesResponse
     */
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

    /**
     * @summary Updates a pipeline of a Logstash cluster.
     *
     * @param request UpdatePipelinesRequest
     * @return UpdatePipelinesResponse
     */
    public UpdatePipelinesResponse updatePipelines(String InstanceId, UpdatePipelinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePipelinesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary ## RequestBody
     * | Property | Type | Required | Example | Description |
     * | -------- | ---- | -------- | ------- | ----------- |
     * | privateNetworkIpWhiteList | List<String> | No | ["0.0.XX.XX","10.2.XX.XX","192.168.XX.XX/25"] | The list of IP address whitelists. This parameter is available if whiteIpGroup is left empty. The value of this parameter updates the IP address whitelist configurations in the Default whitelist group.  
     * You cannot configure both privateNetworkIpWhiteList and whiteIpGroup. |
     * | whiteIpGroup | Object | No |  | You can update the whitelist configurations of an instance by using a whitelist group. You can update only one whitelist group.  
     * You cannot configure both privateNetworkIpWhiteList and whiteIpGroup. |
     * | └ groupName | String | No | test_group_name | The group name of the whitelist group. This parameter is required if the whiteIpGroup parameter is optional. |
     * | └ ips | List<String> | No | ["0.0.0.0", "10.2.XX.XX"] | The list of IP addresses in the whitelist group. This parameter is required if the whiteIpGroup parameter is optional. |
     * > **Notice**  The addition and deletion of whitelist groups are implemented by calling modifyMode to Cover. Delete and Append cannot add or delete whitelist groups at the same time. You can only modify the IP address list in the whitelist group. Take note of the following items: - If the modifyMode parameter is set to Cover, the whitelist group is deleted if ips is empty. If groupName is not in the list of existing whitelist group names, a whitelist group is created.
     * - If the modifyMode parameter is set to Delete, you must retain at least one IP address for the deleted ips.
     * - If the modifyMode parameter is set to Append, make sure that the whitelist group name has been created. Otherwise, the NotFound error message appears.
     *
     * @description >  In the following returned example, only the parameters in the returned data list are guaranteed to be included, and the parameters not mentioned are for reference only. For more information about the parameters, see [ListInstance](https://help.aliyun.com/document_detail/142230.html). You cannot force a dependency in a program to get these parameters.
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
     * @summary ## RequestBody
     * | Property | Type | Required | Example | Description |
     * | -------- | ---- | -------- | ------- | ----------- |
     * | privateNetworkIpWhiteList | List<String> | No | ["0.0.XX.XX","10.2.XX.XX","192.168.XX.XX/25"] | The list of IP address whitelists. This parameter is available if whiteIpGroup is left empty. The value of this parameter updates the IP address whitelist configurations in the Default whitelist group.  
     * You cannot configure both privateNetworkIpWhiteList and whiteIpGroup. |
     * | whiteIpGroup | Object | No |  | You can update the whitelist configurations of an instance by using a whitelist group. You can update only one whitelist group.  
     * You cannot configure both privateNetworkIpWhiteList and whiteIpGroup. |
     * | └ groupName | String | No | test_group_name | The group name of the whitelist group. This parameter is required if the whiteIpGroup parameter is optional. |
     * | └ ips | List<String> | No | ["0.0.0.0", "10.2.XX.XX"] | The list of IP addresses in the whitelist group. This parameter is required if the whiteIpGroup parameter is optional. |
     * > **Notice**  The addition and deletion of whitelist groups are implemented by calling modifyMode to Cover. Delete and Append cannot add or delete whitelist groups at the same time. You can only modify the IP address list in the whitelist group. Take note of the following items: - If the modifyMode parameter is set to Cover, the whitelist group is deleted if ips is empty. If groupName is not in the list of existing whitelist group names, a whitelist group is created.
     * - If the modifyMode parameter is set to Delete, you must retain at least one IP address for the deleted ips.
     * - If the modifyMode parameter is set to Append, make sure that the whitelist group name has been created. Otherwise, the NotFound error message appears.
     *
     * @description >  In the following returned example, only the parameters in the returned data list are guaranteed to be included, and the parameters not mentioned are for reference only. For more information about the parameters, see [ListInstance](https://help.aliyun.com/document_detail/142230.html). You cannot force a dependency in a program to get these parameters.
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
     * @summary Call UpdatePublicNetwork to open or close the public network address of the specified elasticsearch instance.
     *
     * @description When you call this operation, take note of the following items:
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
     * @summary Call UpdatePublicNetwork to open or close the public network address of the specified elasticsearch instance.
     *
     * @description When you call this operation, take note of the following items:
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
     * @summary ## RequestBody
     * | Property | Type | Required | Example | Description |
     * | -------- | ---- | -------- | ------- | ----------- |
     * | publicIpWhitelist | List<String> | Yes | ["0.0.0.0/0","0.0.0.0/1"] | The list of IP address whitelists. This parameter is available if whiteIpGroup is left empty. The value of this parameter updates the IP address whitelist configurations in the Default whitelist group.  
     * You cannot configure both publicIpWhitelist and whiteIpGroup. |
     * | whiteIpGroup | Object | No |  | You can update the whitelist configurations of an instance by using a whitelist group. You can update only one whitelist group.  
     * You cannot configure both publicIpWhitelist and whiteIpGroup. |
     * | └ groupName | String | No | test_group_name | The group name of the whitelist group. This parameter is required if the whiteIpGroup parameter is optional. |
     * | └ ips | List<String> | No | ["0.0.0.0", "10.2.XX.XX"] | The list of IP addresses in the whitelist group. This parameter is required if the whiteIpGroup parameter is optional. |
     * > **Notice**  The addition and deletion of whitelist groups are implemented by calling modifyMode to Cover. Delete and Append cannot add or delete whitelist groups at the same time. You can only modify the IP address list in the whitelist group. Take note of the following items: - If the modifyMode parameter is set to Cover, the whitelist group is deleted if ips is empty. If groupName is not in the list of existing whitelist group names, a whitelist group is created.
     * - If the modifyMode parameter is set to Delete, you must retain at least one IP address for the deleted ips.
     * - If the modifyMode parameter is set to Append, make sure that the whitelist group name has been created. Otherwise, the NotFound error message appears.
     *
     * @description >  In the following example, only the parameters in the returned data list are guaranteed to be included. The parameters that are not mentioned are for reference only. For more information about the parameters, see [ListInstance](https://help.aliyun.com/document_detail/142230.html). You cannot force a dependency in a program to get these parameters.
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
     * @summary ## RequestBody
     * | Property | Type | Required | Example | Description |
     * | -------- | ---- | -------- | ------- | ----------- |
     * | publicIpWhitelist | List<String> | Yes | ["0.0.0.0/0","0.0.0.0/1"] | The list of IP address whitelists. This parameter is available if whiteIpGroup is left empty. The value of this parameter updates the IP address whitelist configurations in the Default whitelist group.  
     * You cannot configure both publicIpWhitelist and whiteIpGroup. |
     * | whiteIpGroup | Object | No |  | You can update the whitelist configurations of an instance by using a whitelist group. You can update only one whitelist group.  
     * You cannot configure both publicIpWhitelist and whiteIpGroup. |
     * | └ groupName | String | No | test_group_name | The group name of the whitelist group. This parameter is required if the whiteIpGroup parameter is optional. |
     * | └ ips | List<String> | No | ["0.0.0.0", "10.2.XX.XX"] | The list of IP addresses in the whitelist group. This parameter is required if the whiteIpGroup parameter is optional. |
     * > **Notice**  The addition and deletion of whitelist groups are implemented by calling modifyMode to Cover. Delete and Append cannot add or delete whitelist groups at the same time. You can only modify the IP address list in the whitelist group. Take note of the following items: - If the modifyMode parameter is set to Cover, the whitelist group is deleted if ips is empty. If groupName is not in the list of existing whitelist group names, a whitelist group is created.
     * - If the modifyMode parameter is set to Delete, you must retain at least one IP address for the deleted ips.
     * - If the modifyMode parameter is set to Append, make sure that the whitelist group name has been created. Otherwise, the NotFound error message appears.
     *
     * @description >  In the following example, only the parameters in the returned data list are guaranteed to be included. The parameters that are not mentioned are for reference only. For more information about the parameters, see [ListInstance](https://help.aliyun.com/document_detail/142230.html). You cannot force a dependency in a program to get these parameters.
     *
     * @param request UpdatePublicWhiteIpsRequest
     * @return UpdatePublicWhiteIpsResponse
     */
    public UpdatePublicWhiteIpsResponse updatePublicWhiteIps(String InstanceId, UpdatePublicWhiteIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePublicWhiteIpsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 更改ES集群高可用策略
     *
     * @param request UpdateReadWritePolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateReadWritePolicyResponse
     */
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

    /**
     * @summary 更改ES集群高可用策略
     *
     * @param request UpdateReadWritePolicyRequest
     * @return UpdateReadWritePolicyResponse
     */
    public UpdateReadWritePolicyResponse updateReadWritePolicy(String InstanceId, UpdateReadWritePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateReadWritePolicyWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Call UpdateSnapshotSetting to update the data backup configuration of the specified instance.
     *
     * @param request UpdateSnapshotSettingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSnapshotSettingResponse
     */
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

    /**
     * @summary Call UpdateSnapshotSetting to update the data backup configuration of the specified instance.
     *
     * @param request UpdateSnapshotSettingRequest
     * @return UpdateSnapshotSettingResponse
     */
    public UpdateSnapshotSettingResponse updateSnapshotSetting(String InstanceId, UpdateSnapshotSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSnapshotSettingWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary Updates the synonym dictionaries of an Elasticsearch cluster.
     *
     * @description Before you call this operation, take note of the following items:
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
     * @summary Updates the synonym dictionaries of an Elasticsearch cluster.
     *
     * @description Before you call this operation, take note of the following items:
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

    /**
     * @param request UpdateTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTemplateResponse
     */
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

    /**
     * @param request UpdateTemplateRequest
     * @return UpdateTemplateResponse
     */
    public UpdateTemplateResponse updateTemplate(String InstanceId, String TemplateName, UpdateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTemplateWithOptions(InstanceId, TemplateName, request, headers, runtime);
    }

    /**
     * @summary >  If you want to add an IP address whitelist, you can set the modifyMode parameter only to Cover. If you set this parameter to Delete or Append, you can only update an IP address whitelist.
     * *   If you set the modifyMode parameter to Cover and leave the ips parameter empty, the system deletes the specified whitelist. If the whitelist specified by using the groupName parameter does not exist, the system creates such a whitelist.
     * *   If you set the modifyMode parameter to Delete, at least one IP address must be retained for the specified whitelist.
     * *   If you set the modifyMode parameter to Append, you must make sure that the specified whitelist exists. Otherwise, the system reports the NotFound error.
     *
     * @description > For more information about the parameters displayed in the following sample code but not provided in the preceding tables, see [ListInstance](https://help.aliyun.com/document_detail/142230.html). You cannot force your program to obtain these parameters.
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
     * @summary >  If you want to add an IP address whitelist, you can set the modifyMode parameter only to Cover. If you set this parameter to Delete or Append, you can only update an IP address whitelist.
     * *   If you set the modifyMode parameter to Cover and leave the ips parameter empty, the system deletes the specified whitelist. If the whitelist specified by using the groupName parameter does not exist, the system creates such a whitelist.
     * *   If you set the modifyMode parameter to Delete, at least one IP address must be retained for the specified whitelist.
     * *   If you set the modifyMode parameter to Append, you must make sure that the specified whitelist exists. Otherwise, the system reports the NotFound error.
     *
     * @description > For more information about the parameters displayed in the following sample code but not provided in the preceding tables, see [ListInstance](https://help.aliyun.com/document_detail/142230.html). You cannot force your program to obtain these parameters.
     *
     * @param request UpdateWhiteIpsRequest
     * @return UpdateWhiteIpsResponse
     */
    public UpdateWhiteIpsResponse updateWhiteIps(String InstanceId, UpdateWhiteIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWhiteIpsWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 修改Logstash实例的X-Pack监控报警配置。
     *
     * @param request UpdateXpackMonitorConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateXpackMonitorConfigResponse
     */
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

    /**
     * @summary 修改Logstash实例的X-Pack监控报警配置。
     *
     * @param request UpdateXpackMonitorConfigRequest
     * @return UpdateXpackMonitorConfigResponse
     */
    public UpdateXpackMonitorConfigResponse updateXpackMonitorConfig(String InstanceId, UpdateXpackMonitorConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateXpackMonitorConfigWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary ES集群版本升级
     *
     * @description 5A2CFF0E-5718-45B5-9D4D-70B3FF\\*\\*\\*\\*
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
     * @summary ES集群版本升级
     *
     * @description 5A2CFF0E-5718-45B5-9D4D-70B3FF\\*\\*\\*\\*
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
     * @summary Tests the connectivity between a Logstash cluster and its associated Elasticsearch cluster when you configure the X-Pack Monitoring feature for the Logstash cluster.
     *
     * @description > Before you enable the X-Pack Monitoring feature for a Logstash cluster, you must associate the Logstash cluster with an Elasticsearch cluster. This way, you can view the monitoring data of the Logstash cluster in the Kibana console of the Elasticsearch cluster.
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
     * @summary Tests the connectivity between a Logstash cluster and its associated Elasticsearch cluster when you configure the X-Pack Monitoring feature for the Logstash cluster.
     *
     * @description > Before you enable the X-Pack Monitoring feature for a Logstash cluster, you must associate the Logstash cluster with an Elasticsearch cluster. This way, you can view the monitoring data of the Logstash cluster in the Kibana console of the Elasticsearch cluster.
     *
     * @param request ValidateConnectionRequest
     * @return ValidateConnectionResponse
     */
    public ValidateConnectionResponse validateConnection(String InstanceId, ValidateConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateConnectionWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary 校验缩节点合法性
     *
     * @param request ValidateShrinkNodesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidateShrinkNodesResponse
     */
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

    /**
     * @summary 校验缩节点合法性
     *
     * @param request ValidateShrinkNodesRequest
     * @return ValidateShrinkNodesResponse
     */
    public ValidateShrinkNodesResponse validateShrinkNodes(String InstanceId, ValidateShrinkNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateShrinkNodesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @param request ValidateSlrPermissionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidateSlrPermissionResponse
     */
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

    /**
     * @param request ValidateSlrPermissionRequest
     * @return ValidateSlrPermissionResponse
     */
    public ValidateSlrPermissionResponse validateSlrPermission(ValidateSlrPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateSlrPermissionWithOptions(request, headers, runtime);
    }

    /**
     * @summary 缩节点校验数据迁移合法性
     *
     * @param request ValidateTransferableNodesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidateTransferableNodesResponse
     */
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

    /**
     * @summary 缩节点校验数据迁移合法性
     *
     * @param request ValidateTransferableNodesRequest
     * @return ValidateTransferableNodesResponse
     */
    public ValidateTransferableNodesResponse validateTransferableNodes(String InstanceId, ValidateTransferableNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateTransferableNodesWithOptions(InstanceId, request, headers, runtime);
    }

    /**
     * @summary The configurations of dedicated master nodes.
     *
     * @description The configurations of warm nodes.
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
     * @summary The configurations of dedicated master nodes.
     *
     * @description The configurations of warm nodes.
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
