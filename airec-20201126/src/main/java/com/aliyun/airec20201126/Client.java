// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126;

import com.aliyun.tea.*;
import com.aliyun.airec20201126.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("airec", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Uses a dataset of a specified version of a specified instance to provide online services.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachDatasetResponse
     */
    public AttachDatasetResponse attachDatasetWithOptions(String instanceId, String versionId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachDataset"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/dataSets/" + com.aliyun.openapiutil.Client.getEncodeParam(versionId) + "/actions/current"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachDatasetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Uses a dataset of a specified version of a specified instance to provide online services.</p>
     * @return AttachDatasetResponse
     */
    public AttachDatasetResponse attachDataset(String instanceId, String versionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.attachDatasetWithOptions(instanceId, versionId, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachIndexVersionResponse
     */
    public AttachIndexVersionResponse attachIndexVersionWithOptions(String instanceId, String algorithmId, String versionId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachIndexVersion"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/filtering-algorithms/" + com.aliyun.openapiutil.Client.getEncodeParam(algorithmId) + "/index-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(versionId) + "/actions/attach"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachIndexVersionResponse());
    }

    /**
     * @return AttachIndexVersionResponse
     */
    public AttachIndexVersionResponse attachIndexVersion(String instanceId, String algorithmId, String versionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.attachIndexVersionWithOptions(instanceId, algorithmId, versionId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks the network connectivity of a ranking model.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckRankingModelReachableResponse
     */
    public CheckRankingModelReachableResponse checkRankingModelReachableWithOptions(String instanceId, String rankingModelId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckRankingModelReachable"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ranking-models/" + com.aliyun.openapiutil.Client.getEncodeParam(rankingModelId) + "/actions/check-connectivity"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckRankingModelReachableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks the network connectivity of a ranking model.</p>
     * @return CheckRankingModelReachableResponse
     */
    public CheckRankingModelReachableResponse checkRankingModelReachable(String instanceId, String rankingModelId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkRankingModelReachableWithOptions(instanceId, rankingModelId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Clones an experiment.</p>
     * 
     * @param request CloneExperimentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloneExperimentResponse
     */
    public CloneExperimentResponse cloneExperimentWithOptions(String instanceId, String sceneId, String experimentId, CloneExperimentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloneExperiment"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + "/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(experimentId) + "/actions/clone"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloneExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Clones an experiment.</p>
     * 
     * @param request CloneExperimentRequest
     * @return CloneExperimentResponse
     */
    public CloneExperimentResponse cloneExperiment(String instanceId, String sceneId, String experimentId, CloneExperimentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cloneExperimentWithOptions(instanceId, sceneId, experimentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Clones a sample.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloneSampleResponse
     */
    public CloneSampleResponse cloneSampleWithOptions(String instanceId, String sampleId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloneSample"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/samples/" + com.aliyun.openapiutil.Client.getEncodeParam(sampleId) + "/actions/clone"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloneSampleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Clones a sample.</p>
     * @return CloneSampleResponse
     */
    public CloneSampleResponse cloneSample(String instanceId, String sampleId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cloneSampleWithOptions(instanceId, sampleId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>该接口用于获取指定冷启动实例的排序结果。</p>
     * 
     * @param request ColdStartRankRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ColdStartRankResponse
     */
    public ColdStartRankResponse coldStartRankWithOptions(String instanceId, ColdStartRankRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.features)) {
            query.put("features", request.features);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imei)) {
            query.put("imei", request.imei);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.items)) {
            query.put("items", request.items);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("sceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ColdStartRank"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/cold-start/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/actions/rank"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ColdStartRankResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>该接口用于获取指定冷启动实例的排序结果。</p>
     * 
     * @param request ColdStartRankRequest
     * @return ColdStartRankResponse
     */
    public ColdStartRankResponse coldStartRank(String instanceId, ColdStartRankRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.coldStartRankWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建自定义分析任务</p>
     * 
     * @param request CreateCustomAnalysisTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomAnalysisTaskResponse
     */
    public CreateCustomAnalysisTaskResponse createCustomAnalysisTaskWithOptions(String instanceId, CreateCustomAnalysisTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomAnalysisTask"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/dashboard/custom-analysis-tasks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomAnalysisTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建自定义分析任务</p>
     * 
     * @param request CreateCustomAnalysisTaskRequest
     * @return CreateCustomAnalysisTaskResponse
     */
    public CreateCustomAnalysisTaskResponse createCustomAnalysisTask(String instanceId, CreateCustomAnalysisTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCustomAnalysisTaskWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建自定义样本</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomSampleResponse
     */
    public CreateCustomSampleResponse createCustomSampleWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomSample"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/samples"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomSampleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建自定义样本</p>
     * @return CreateCustomSampleResponse
     */
    public CreateCustomSampleResponse createCustomSample(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCustomSampleWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据诊断任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataDiagnoseTaskResponse
     */
    public CreateDataDiagnoseTaskResponse createDataDiagnoseTaskWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataDiagnoseTask"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/data-diagnose-task"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataDiagnoseTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据诊断任务</p>
     * @return CreateDataDiagnoseTaskResponse
     */
    public CreateDataDiagnoseTaskResponse createDataDiagnoseTask(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataDiagnoseTaskWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a data source.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExtraDataSourceResponse
     */
    public CreateExtraDataSourceResponse createExtraDataSourceWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExtraDataSource"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/extra-data-sources"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExtraDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a data source.</p>
     * @return CreateExtraDataSourceResponse
     */
    public CreateExtraDataSourceResponse createExtraDataSource(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createExtraDataSourceWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The time when the filtering table was created.</p>
     * 
     * @param request CreateFilteringAlgorithmRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFilteringAlgorithmResponse
     */
    public CreateFilteringAlgorithmResponse createFilteringAlgorithmWithOptions(String instanceId, CreateFilteringAlgorithmRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFilteringAlgorithm"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/filtering-algorithms"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFilteringAlgorithmResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The time when the filtering table was created.</p>
     * 
     * @param request CreateFilteringAlgorithmRequest
     * @return CreateFilteringAlgorithmResponse
     */
    public CreateFilteringAlgorithmResponse createFilteringAlgorithm(String instanceId, CreateFilteringAlgorithmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFilteringAlgorithmWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a throttling task.</p>
     * 
     * @param request CreateFlowControlTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFlowControlTaskResponse
     */
    public CreateFlowControlTaskResponse createFlowControlTaskWithOptions(String instanceId, CreateFlowControlTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFlowControlTask"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/flowControlTasks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlowControlTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a throttling task.</p>
     * 
     * @param request CreateFlowControlTaskRequest
     * @return CreateFlowControlTaskResponse
     */
    public CreateFlowControlTaskResponse createFlowControlTask(String instanceId, CreateFlowControlTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFlowControlTaskWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an Artificial Intelligence Recommendation (AIRec) instance.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstanceWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstance"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an Artificial Intelligence Recommendation (AIRec) instance.</p>
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInstanceWithOptions(headers, runtime);
    }

    /**
     * @param request CreateRankingModelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRankingModelResponse
     */
    public CreateRankingModelResponse createRankingModelWithOptions(String instanceId, CreateRankingModelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRankingModel"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ranking-models"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRankingModelResponse());
    }

    /**
     * @param request CreateRankingModelRequest
     * @return CreateRankingModelResponse
     */
    public CreateRankingModelResponse createRankingModel(String instanceId, CreateRankingModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRankingModelWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建排序模型模板配置</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRankingModelTemplateResponse
     */
    public CreateRankingModelTemplateResponse createRankingModelTemplateWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRankingModelTemplate"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ranking-model-templates"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRankingModelTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建排序模型模板配置</p>
     * @return CreateRankingModelTemplateResponse
     */
    public CreateRankingModelTemplateResponse createRankingModelTemplate(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRankingModelTemplateWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建排序服务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRankingSystemResponse
     */
    public CreateRankingSystemResponse createRankingSystemWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRankingSystem"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ranking-systems"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRankingSystemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建排序服务</p>
     * @return CreateRankingSystemResponse
     */
    public CreateRankingSystemResponse createRankingSystem(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRankingSystemWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a rule.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRuleResponse
     */
    public CreateRuleResponse createRuleWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRule"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/rules"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a rule.</p>
     * @return CreateRuleResponse
     */
    public CreateRuleResponse createRule(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRuleWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建样本格式化配置</p>
     * 
     * @param request CreateSampleFormatConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSampleFormatConfigResponse
     */
    public CreateSampleFormatConfigResponse createSampleFormatConfigWithOptions(String instanceId, String sampleId, CreateSampleFormatConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSampleFormatConfig"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/samples/" + com.aliyun.openapiutil.Client.getEncodeParam(sampleId) + "/format-configs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSampleFormatConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建样本格式化配置</p>
     * 
     * @param request CreateSampleFormatConfigRequest
     * @return CreateSampleFormatConfigResponse
     */
    public CreateSampleFormatConfigResponse createSampleFormatConfig(String instanceId, String sampleId, CreateSampleFormatConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSampleFormatConfigWithOptions(instanceId, sampleId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call an API operation to manage scenes. We recommend that you go to the Scenario Building page in the Artificial Intelligence Recommendation (AIRec) console to manage scenes.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies the information that you specified for creating a scene.</p>
     * 
     * @param request CreateSceneRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSceneResponse
     */
    public CreateSceneResponse createSceneWithOptions(String instanceId, CreateSceneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScene"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/scenes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSceneResponse());
    }

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call an API operation to manage scenes. We recommend that you go to the Scenario Building page in the Artificial Intelligence Recommendation (AIRec) console to manage scenes.</p>
     * 
     * <b>summary</b> : 
     * <p>Verifies the information that you specified for creating a scene.</p>
     * 
     * @param request CreateSceneRequest
     * @return CreateSceneResponse
     */
    public CreateSceneResponse createScene(String instanceId, CreateSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSceneWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建友盟授权token</p>
     * 
     * @param request CreateUmengTokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUmengTokenResponse
     */
    public CreateUmengTokenResponse createUmengTokenWithOptions(CreateUmengTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("code", request.code);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUmengToken"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/umeng/token"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUmengTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建友盟授权token</p>
     * 
     * @param request CreateUmengTokenRequest
     * @return CreateUmengTokenResponse
     */
    public CreateUmengTokenResponse createUmengToken(CreateUmengTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUmengTokenWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of a ranking model.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DecribeRankingModelResponse
     */
    public DecribeRankingModelResponse decribeRankingModelWithOptions(String instanceId, String rankingModelId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DecribeRankingModel"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ranking-models/" + com.aliyun.openapiutil.Client.getEncodeParam(rankingModelId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DecribeRankingModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of a ranking model.</p>
     * @return DecribeRankingModelResponse
     */
    public DecribeRankingModelResponse decribeRankingModel(String instanceId, String rankingModelId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.decribeRankingModelWithOptions(instanceId, rankingModelId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a dataset of a specified version for an instance.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataSetResponse
     */
    public DeleteDataSetResponse deleteDataSetWithOptions(String instanceId, String versionId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataSet"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/dataSets/" + com.aliyun.openapiutil.Client.getEncodeParam(versionId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a dataset of a specified version for an instance.</p>
     * @return DeleteDataSetResponse
     */
    public DeleteDataSetResponse deleteDataSet(String instanceId, String versionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDataSetWithOptions(instanceId, versionId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the test.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExperimentResponse
     */
    public DeleteExperimentResponse deleteExperimentWithOptions(String instanceId, String sceneId, String experimentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExperiment"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + "/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(experimentId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the test.</p>
     * @return DeleteExperimentResponse
     */
    public DeleteExperimentResponse deleteExperiment(String instanceId, String sceneId, String experimentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteExperimentWithOptions(instanceId, sceneId, experimentId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除特征、样本等表扩展数据源</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExtraDataSourceResponse
     */
    public DeleteExtraDataSourceResponse deleteExtraDataSourceWithOptions(String instanceId, String type, String dataSourceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExtraDataSource"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/extra-data-sources/" + com.aliyun.openapiutil.Client.getEncodeParam(type) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(dataSourceId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExtraDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除特征、样本等表扩展数据源</p>
     * @return DeleteExtraDataSourceResponse
     */
    public DeleteExtraDataSourceResponse deleteExtraDataSource(String instanceId, String type, String dataSourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteExtraDataSourceWithOptions(instanceId, type, dataSourceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the configurations of a specified filtering table and the information about the related index table.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFilteringAlgorithmResponse
     */
    public DeleteFilteringAlgorithmResponse deleteFilteringAlgorithmWithOptions(String instanceId, String algorithmId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFilteringAlgorithm"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/filtering-algorithms/" + com.aliyun.openapiutil.Client.getEncodeParam(algorithmId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFilteringAlgorithmResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the configurations of a specified filtering table and the information about the related index table.</p>
     * @return DeleteFilteringAlgorithmResponse
     */
    public DeleteFilteringAlgorithmResponse deleteFilteringAlgorithm(String instanceId, String algorithmId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFilteringAlgorithmWithOptions(instanceId, algorithmId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a throttling task.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFlowControlTaskResponse
     */
    public DeleteFlowControlTaskResponse deleteFlowControlTaskWithOptions(String instanceId, String taskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFlowControlTask"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/flowControlTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFlowControlTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a throttling task.</p>
     * @return DeleteFlowControlTaskResponse
     */
    public DeleteFlowControlTaskResponse deleteFlowControlTask(String instanceId, String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFlowControlTaskWithOptions(instanceId, taskId, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRankingModelResponse
     */
    public DeleteRankingModelResponse deleteRankingModelWithOptions(String instanceId, String rankingModelId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRankingModel"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ranking-models/" + com.aliyun.openapiutil.Client.getEncodeParam(rankingModelId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRankingModelResponse());
    }

    /**
     * @return DeleteRankingModelResponse
     */
    public DeleteRankingModelResponse deleteRankingModel(String instanceId, String rankingModelId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRankingModelWithOptions(instanceId, rankingModelId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除排序模型模板</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRankingModelTemplateResponse
     */
    public DeleteRankingModelTemplateResponse deleteRankingModelTemplateWithOptions(String instanceId, String templateId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRankingModelTemplate"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ranking-model-templates/" + com.aliyun.openapiutil.Client.getEncodeParam(templateId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRankingModelTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除排序模型模板</p>
     * @return DeleteRankingModelTemplateResponse
     */
    public DeleteRankingModelTemplateResponse deleteRankingModelTemplate(String instanceId, String templateId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRankingModelTemplateWithOptions(instanceId, templateId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除排序模型版本</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRankingModelVersionResponse
     */
    public DeleteRankingModelVersionResponse deleteRankingModelVersionWithOptions(String instanceId, String versionId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRankingModelVersion"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ranking-model-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(versionId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRankingModelVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除排序模型版本</p>
     * @return DeleteRankingModelVersionResponse
     */
    public DeleteRankingModelVersionResponse deleteRankingModelVersion(String instanceId, String versionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRankingModelVersionWithOptions(instanceId, versionId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除某个排序服务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRankingSystemResponse
     */
    public DeleteRankingSystemResponse deleteRankingSystemWithOptions(String instanceId, String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRankingSystem"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ranking-systems/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRankingSystemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除某个排序服务</p>
     * @return DeleteRankingSystemResponse
     */
    public DeleteRankingSystemResponse deleteRankingSystem(String instanceId, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRankingSystemWithOptions(instanceId, name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除样本</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSampleResponse
     */
    public DeleteSampleResponse deleteSampleWithOptions(String instanceId, String sampleId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSample"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/samples/" + com.aliyun.openapiutil.Client.getEncodeParam(sampleId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSampleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除样本</p>
     * @return DeleteSampleResponse
     */
    public DeleteSampleResponse deleteSample(String instanceId, String sampleId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSampleWithOptions(instanceId, sampleId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call an API operation to manage scenes. We recommend that you go to the Scenario Building page in the Artificial Intelligence Recommendation (AIRec) console to manage scenes.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a scene.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSceneResponse
     */
    public DeleteSceneResponse deleteSceneWithOptions(String instanceId, String sceneId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScene"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSceneResponse());
    }

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call an API operation to manage scenes. We recommend that you go to the Scenario Building page in the Artificial Intelligence Recommendation (AIRec) console to manage scenes.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a scene.</p>
     * @return DeleteSceneResponse
     */
    public DeleteSceneResponse deleteScene(String instanceId, String sceneId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSceneWithOptions(instanceId, sceneId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the instance.</p>
     * 
     * @param request DeployRankingSystemRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeployRankingSystemResponse
     */
    public DeployRankingSystemResponse deployRankingSystemWithOptions(String instanceId, String name, DeployRankingSystemRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployRankingSystem"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ranking-systems/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/actions/deploy"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployRankingSystemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the instance.</p>
     * 
     * @param request DeployRankingSystemRequest
     * @return DeployRankingSystemResponse
     */
    public DeployRankingSystemResponse deployRankingSystem(String instanceId, String name, DeployRankingSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deployRankingSystemWithOptions(instanceId, name, request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBaseExperimentResponse
     */
    public DescribeBaseExperimentResponse describeBaseExperimentWithOptions(String instanceId, String sceneId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBaseExperiment"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + "/base-experiment"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBaseExperimentResponse());
    }

    /**
     * @return DescribeBaseExperimentResponse
     */
    public DescribeBaseExperimentResponse describeBaseExperiment(String instanceId, String sceneId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeBaseExperimentWithOptions(instanceId, sceneId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询自定义分析任务</p>
     * 
     * @param request DescribeCustomAnalysisTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomAnalysisTaskResponse
     */
    public DescribeCustomAnalysisTaskResponse describeCustomAnalysisTaskWithOptions(String instanceId, String taskId, DescribeCustomAnalysisTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustomAnalysisTask"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/dashboard/custom-analysis-tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomAnalysisTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询自定义分析任务</p>
     * 
     * @param request DescribeCustomAnalysisTaskRequest
     * @return DescribeCustomAnalysisTaskResponse
     */
    public DescribeCustomAnalysisTaskResponse describeCustomAnalysisTask(String instanceId, String taskId, DescribeCustomAnalysisTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeCustomAnalysisTaskWithOptions(instanceId, taskId, request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataSetMessageResponse
     */
    public DescribeDataSetMessageResponse describeDataSetMessageWithOptions(String instanceId, String versionId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataSetMessage"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/dataSets/" + com.aliyun.openapiutil.Client.getEncodeParam(versionId) + "/messages"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataSetMessageResponse());
    }

    /**
     * @return DescribeDataSetMessageResponse
     */
    public DescribeDataSetMessageResponse describeDataSetMessage(String instanceId, String versionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeDataSetMessageWithOptions(instanceId, versionId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of default algorithms.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDefaultAlgorithmsResponse
     */
    public DescribeDefaultAlgorithmsResponse describeDefaultAlgorithmsWithOptions(String instanceId, String sceneId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDefaultAlgorithms"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + "/default-algorithms"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDefaultAlgorithmsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of default algorithms.</p>
     * @return DescribeDefaultAlgorithmsResponse
     */
    public DescribeDefaultAlgorithmsResponse describeDefaultAlgorithms(String instanceId, String sceneId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeDefaultAlgorithmsWithOptions(instanceId, sceneId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details about an experiment.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExperimentResponse
     */
    public DescribeExperimentResponse describeExperimentWithOptions(String instanceId, String sceneId, String experimentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExperiment"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + "/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(experimentId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExperimentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details about an experiment.</p>
     * @return DescribeExperimentResponse
     */
    public DescribeExperimentResponse describeExperiment(String instanceId, String sceneId, String experimentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeExperimentWithOptions(instanceId, sceneId, experimentId, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExperimentEnvResponse
     */
    public DescribeExperimentEnvResponse describeExperimentEnvWithOptions(String instanceId, String sceneId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExperimentEnv"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + "/experiment-env"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExperimentEnvResponse());
    }

    /**
     * @return DescribeExperimentEnvResponse
     */
    public DescribeExperimentEnvResponse describeExperimentEnv(String instanceId, String sceneId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeExperimentEnvWithOptions(instanceId, sceneId, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExperimentEnvProgressResponse
     */
    public DescribeExperimentEnvProgressResponse describeExperimentEnvProgressWithOptions(String instanceId, String sceneId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExperimentEnvProgress"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + "/experiment-progress"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExperimentEnvProgressResponse());
    }

    /**
     * @return DescribeExperimentEnvProgressResponse
     */
    public DescribeExperimentEnvProgressResponse describeExperimentEnvProgress(String instanceId, String sceneId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeExperimentEnvProgressWithOptions(instanceId, sceneId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The fluctuation threshold for the data entries in the source table.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFilteringAlgorithmResponse
     */
    public DescribeFilteringAlgorithmResponse describeFilteringAlgorithmWithOptions(String instanceId, String algorithmId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFilteringAlgorithm"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/filtering-algorithms/" + com.aliyun.openapiutil.Client.getEncodeParam(algorithmId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFilteringAlgorithmResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The fluctuation threshold for the data entries in the source table.</p>
     * @return DescribeFilteringAlgorithmResponse
     */
    public DescribeFilteringAlgorithmResponse describeFilteringAlgorithm(String instanceId, String algorithmId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeFilteringAlgorithmWithOptions(instanceId, algorithmId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details about an instance based on the instance ID.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceResponse
     */
    public DescribeInstanceResponse describeInstanceWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstance"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details about an instance based on the instance ID.</p>
     * @return DescribeInstanceResponse
     */
    public DescribeInstanceResponse describeInstance(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeInstanceWithOptions(instanceId, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLatestTaskResponse
     */
    public DescribeLatestTaskResponse describeLatestTaskWithOptions(String instanceId, String algorithmId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLatestTask"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/filtering-algorithms/" + com.aliyun.openapiutil.Client.getEncodeParam(algorithmId) + "/tasks/latest"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLatestTaskResponse());
    }

    /**
     * @return DescribeLatestTaskResponse
     */
    public DescribeLatestTaskResponse describeLatestTask(String instanceId, String algorithmId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeLatestTaskWithOptions(instanceId, algorithmId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the quotas of an instance based on a specified instance ID.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeQuotaResponse
     */
    public DescribeQuotaResponse describeQuotaWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeQuota"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/quota"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the quotas of an instance based on a specified instance ID.</p>
     * @return DescribeQuotaResponse
     */
    public DescribeQuotaResponse describeQuota(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeQuotaWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries available Alibaba Cloud regions.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("acceptLanguage", request.acceptLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/configurations/regions"),
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
     * <p>Queries available Alibaba Cloud regions.</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRegionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the instance.</p>
     * 
     * @param request DescribeRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRuleResponse
     */
    public DescribeRuleResponse describeRuleWithOptions(String instanceId, String ruleId, DescribeRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("ruleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("sceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRule"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/rules/" + com.aliyun.openapiutil.Client.getEncodeParam(ruleId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the instance.</p>
     * 
     * @param request DescribeRuleRequest
     * @return DescribeRuleResponse
     */
    public DescribeRuleResponse describeRule(String instanceId, String ruleId, DescribeRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRuleWithOptions(instanceId, ruleId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call an API operation to manage scenes. We recommend that you go to the Scenario Building page in the Artificial Intelligence Recommendation (AIRec) console to manage scenes.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about a specified scene.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSceneResponse
     */
    public DescribeSceneResponse describeSceneWithOptions(String instanceId, String sceneId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScene"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSceneResponse());
    }

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call an API operation to manage scenes. We recommend that you go to the Scenario Building page in the Artificial Intelligence Recommendation (AIRec) console to manage scenes.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about a specified scene.</p>
     * @return DescribeSceneResponse
     */
    public DescribeSceneResponse describeScene(String instanceId, String sceneId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeSceneWithOptions(instanceId, sceneId, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSceneBucketResponse
     */
    public DescribeSceneBucketResponse describeSceneBucketWithOptions(String instanceId, String sceneId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSceneBucket"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + "/experiment-bucket"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSceneBucketResponse());
    }

    /**
     * @return DescribeSceneBucketResponse
     */
    public DescribeSceneBucketResponse describeSceneBucket(String instanceId, String sceneId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeSceneBucketWithOptions(instanceId, sceneId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><strong>null</strong></p>
     * 
     * <b>summary</b> : 
     * <p>The error message.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSceneThroughputResponse
     */
    public DescribeSceneThroughputResponse describeSceneThroughputWithOptions(String instanceId, String sceneId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSceneThroughput"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + "/throughput"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSceneThroughputResponse());
    }

    /**
     * <b>description</b> :
     * <p><strong>null</strong></p>
     * 
     * <b>summary</b> : 
     * <p>The error message.</p>
     * @return DescribeSceneThroughputResponse
     */
    public DescribeSceneThroughputResponse describeSceneThroughput(String instanceId, String sceneId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeSceneThroughputWithOptions(instanceId, sceneId, headers, runtime);
    }

    /**
     * @param request DescribeSyncReportDetailRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSyncReportDetailResponse
     */
    public DescribeSyncReportDetailResponse describeSyncReportDetailWithOptions(String instanceId, DescribeSyncReportDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.levelType)) {
            query.put("levelType", request.levelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSyncReportDetail"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/sync-reports/detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSyncReportDetailResponse());
    }

    /**
     * @param request DescribeSyncReportDetailRequest
     * @return DescribeSyncReportDetailResponse
     */
    public DescribeSyncReportDetailResponse describeSyncReportDetail(String instanceId, DescribeSyncReportDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeSyncReportDetailWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * @param request DescribeSyncReportOutliersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSyncReportOutliersResponse
     */
    public DescribeSyncReportOutliersResponse describeSyncReportOutliersWithOptions(String instanceId, DescribeSyncReportOutliersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.levelType)) {
            query.put("levelType", request.levelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSyncReportOutliers"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/sync-reports/outliers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSyncReportOutliersResponse());
    }

    /**
     * @param request DescribeSyncReportOutliersRequest
     * @return DescribeSyncReportOutliersResponse
     */
    public DescribeSyncReportOutliersResponse describeSyncReportOutliers(String instanceId, DescribeSyncReportOutliersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeSyncReportOutliersWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries user metrics related to the conversion rate.</p>
     * 
     * @param request DescribeUserMetricsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserMetricsResponse
     */
    public DescribeUserMetricsResponse describeUserMetricsWithOptions(String instanceId, DescribeUserMetricsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("metricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserMetrics"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/metrics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries user metrics related to the conversion rate.</p>
     * 
     * @param request DescribeUserMetricsRequest
     * @return DescribeUserMetricsResponse
     */
    public DescribeUserMetricsResponse describeUserMetrics(String instanceId, DescribeUserMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeUserMetricsWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The returned results.</p>
     * 
     * <b>summary</b> : 
     * <p>The ID of the instance.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DowngradeInstanceResponse
     */
    public DowngradeInstanceResponse downgradeInstanceWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DowngradeInstance"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/actions/downgrade"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DowngradeInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>The returned results.</p>
     * 
     * <b>summary</b> : 
     * <p>The ID of the instance.</p>
     * @return DowngradeInstanceResponse
     */
    public DowngradeInstanceResponse downgradeInstance(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downgradeInstanceWithOptions(instanceId, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableExperimentResponse
     */
    public EnableExperimentResponse enableExperimentWithOptions(String instanceId, String sceneId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableExperiment"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + "/actions/enable-experiment"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableExperimentResponse());
    }

    /**
     * @return EnableExperimentResponse
     */
    public EnableExperimentResponse enableExperiment(String instanceId, String sceneId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableExperimentWithOptions(instanceId, sceneId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成样本，只针对复制创建的样本</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateSampleResponse
     */
    public GenerateSampleResponse generateSampleWithOptions(String instanceId, String sampleId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateSample"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/samples/" + com.aliyun.openapiutil.Client.getEncodeParam(sampleId) + "/actions/generate"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateSampleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>生成样本，只针对复制创建的样本</p>
     * @return GenerateSampleResponse
     */
    public GenerateSampleResponse generateSample(String instanceId, String sampleId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateSampleWithOptions(instanceId, sampleId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of other data sources.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExtraDataSourceResponse
     */
    public GetExtraDataSourceResponse getExtraDataSourceWithOptions(String instanceId, String type, String dataSourceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExtraDataSource"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/extra-data-sources/" + com.aliyun.openapiutil.Client.getEncodeParam(type) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(dataSourceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExtraDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of other data sources.</p>
     * @return GetExtraDataSourceResponse
     */
    public GetExtraDataSourceResponse getExtraDataSource(String instanceId, String type, String dataSourceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExtraDataSourceWithOptions(instanceId, type, dataSourceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of a throttling task.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFlowControlTaskResponse
     */
    public GetFlowControlTaskResponse getFlowControlTaskWithOptions(String instanceId, String taskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFlowControlTask"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/flowControlTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFlowControlTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of a throttling task.</p>
     * @return GetFlowControlTaskResponse
     */
    public GetFlowControlTaskResponse getFlowControlTask(String instanceId, String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFlowControlTaskWithOptions(instanceId, taskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取最新诊断任务状态</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLatestDataDiagnoseTaskStatusResponse
     */
    public GetLatestDataDiagnoseTaskStatusResponse getLatestDataDiagnoseTaskStatusWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLatestDataDiagnoseTaskStatus"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/data-diagnose-task/status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLatestDataDiagnoseTaskStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取最新诊断任务状态</p>
     * @return GetLatestDataDiagnoseTaskStatusResponse
     */
    public GetLatestDataDiagnoseTaskStatusResponse getLatestDataDiagnoseTaskStatus(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLatestDataDiagnoseTaskStatusWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看排序模型模板配置详情</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRankingModelTemplateResponse
     */
    public GetRankingModelTemplateResponse getRankingModelTemplateWithOptions(String instanceId, String templateId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRankingModelTemplate"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ranking-model-templates/" + com.aliyun.openapiutil.Client.getEncodeParam(templateId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRankingModelTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看排序模型模板配置详情</p>
     * @return GetRankingModelTemplateResponse
     */
    public GetRankingModelTemplateResponse getRankingModelTemplate(String instanceId, String templateId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRankingModelTemplateWithOptions(instanceId, templateId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看排序模型版本详情，包括评估结果和训练结果</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRankingModelVersionResponse
     */
    public GetRankingModelVersionResponse getRankingModelVersionWithOptions(String instanceId, String versionId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRankingModelVersion"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ranking-model-versions/" + com.aliyun.openapiutil.Client.getEncodeParam(versionId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRankingModelVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看排序模型版本详情，包括评估结果和训练结果</p>
     * @return GetRankingModelVersionResponse
     */
    public GetRankingModelVersionResponse getRankingModelVersion(String instanceId, String versionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRankingModelVersionWithOptions(instanceId, versionId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取某个排序服务详情</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRankingSystemResponse
     */
    public GetRankingSystemResponse getRankingSystemWithOptions(String instanceId, String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRankingSystem"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ranking-systems/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRankingSystemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取某个排序服务详情</p>
     * @return GetRankingSystemResponse
     */
    public GetRankingSystemResponse getRankingSystem(String instanceId, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRankingSystemWithOptions(instanceId, name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询某个服务操作记录</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRankingSystemHistoryResponse
     */
    public GetRankingSystemHistoryResponse getRankingSystemHistoryWithOptions(String instanceId, String name, String operateId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRankingSystemHistory"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ranking-systems/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/histories/" + com.aliyun.openapiutil.Client.getEncodeParam(operateId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRankingSystemHistoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询某个服务操作记录</p>
     * @return GetRankingSystemHistoryResponse
     */
    public GetRankingSystemHistoryResponse getRankingSystemHistory(String instanceId, String name, String operateId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRankingSystemHistoryWithOptions(instanceId, name, operateId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取样本详情</p>
     * 
     * @param request GetSampleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSampleResponse
     */
    public GetSampleResponse getSampleWithOptions(String instanceId, String sampleId, GetSampleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.withExtendParmas)) {
            query.put("withExtendParmas", request.withExtendParmas);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSample"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/samples/" + com.aliyun.openapiutil.Client.getEncodeParam(sampleId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSampleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取样本详情</p>
     * 
     * @param request GetSampleRequest
     * @return GetSampleResponse
     */
    public GetSampleResponse getSample(String instanceId, String sampleId, GetSampleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSampleWithOptions(instanceId, sampleId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>初始化计算资源</p>
     * 
     * @param request InitComputingResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitComputingResourceResponse
     */
    public InitComputingResourceResponse initComputingResourceWithOptions(String instanceId, InitComputingResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitComputingResource"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/computing-resources/actions/init"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitComputingResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>初始化计算资源</p>
     * 
     * @param request InitComputingResourceRequest
     * @return InitComputingResourceResponse
     */
    public InitComputingResourceResponse initComputingResource(String instanceId, InitComputingResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initComputingResourceWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * @param request ListDashboardDetailsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDashboardDetailsResponse
     */
    public ListDashboardDetailsResponse listDashboardDetailsWithOptions(String instanceId, ListDashboardDetailsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.experimentIds)) {
            query.put("experimentIds", request.experimentIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchTypes)) {
            query.put("matchTypes", request.matchTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("metricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneIds)) {
            query.put("sceneIds", request.sceneIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceIds)) {
            query.put("traceIds", request.traceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDashboardDetails"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/dashboard/details"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDashboardDetailsResponse());
    }

    /**
     * @param request ListDashboardDetailsRequest
     * @return ListDashboardDetailsResponse
     */
    public ListDashboardDetailsResponse listDashboardDetails(String instanceId, ListDashboardDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDashboardDetailsWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * @param request ListDashboardDetailsFlowsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDashboardDetailsFlowsResponse
     */
    public ListDashboardDetailsFlowsResponse listDashboardDetailsFlowsWithOptions(String instanceId, ListDashboardDetailsFlowsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.experimentIds)) {
            query.put("experimentIds", request.experimentIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("metricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneIds)) {
            query.put("sceneIds", request.sceneIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceIds)) {
            query.put("traceIds", request.traceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDashboardDetailsFlows"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/dashboard/details/flows"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDashboardDetailsFlowsResponse());
    }

    /**
     * @param request ListDashboardDetailsFlowsRequest
     * @return ListDashboardDetailsFlowsResponse
     */
    public ListDashboardDetailsFlowsResponse listDashboardDetailsFlows(String instanceId, ListDashboardDetailsFlowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDashboardDetailsFlowsWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The end time. The value is a timestamp in seconds.</p>
     * 
     * @param request ListDashboardMetricsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDashboardMetricsResponse
     */
    public ListDashboardMetricsResponse listDashboardMetricsWithOptions(String instanceId, ListDashboardMetricsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricQuery)) {
            query.put("metricQuery", request.metricQuery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("metricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricView)) {
            query.put("metricView", request.metricView);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDashboardMetrics"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/dashboard/metrics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDashboardMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The end time. The value is a timestamp in seconds.</p>
     * 
     * @param request ListDashboardMetricsRequest
     * @return ListDashboardMetricsResponse
     */
    public ListDashboardMetricsResponse listDashboardMetrics(String instanceId, ListDashboardMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDashboardMetricsWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The end time. The value is a timestamp in seconds.</p>
     * 
     * @param request ListDashboardMetricsFlowsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDashboardMetricsFlowsResponse
     */
    public ListDashboardMetricsFlowsResponse listDashboardMetricsFlowsWithOptions(String instanceId, ListDashboardMetricsFlowsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("metricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDashboardMetricsFlows"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/dashboard/metrics/flows"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDashboardMetricsFlowsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The end time. The value is a timestamp in seconds.</p>
     * 
     * @param request ListDashboardMetricsFlowsRequest
     * @return ListDashboardMetricsFlowsResponse
     */
    public ListDashboardMetricsFlowsResponse listDashboardMetricsFlows(String instanceId, ListDashboardMetricsFlowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDashboardMetricsFlowsWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据诊断报告 (包括用户手动触发的诊断、每天产出的周期报告、数据启动时诊断的报告)</p>
     * 
     * @param request ListDataDiagnoseReportsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataDiagnoseReportsResponse
     */
    public ListDataDiagnoseReportsResponse listDataDiagnoseReportsWithOptions(String instanceId, ListDataDiagnoseReportsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskCreateTime)) {
            query.put("taskCreateTime", request.taskCreateTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataDiagnoseReports"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/data-diagnose-reports"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataDiagnoseReportsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据诊断报告 (包括用户手动触发的诊断、每天产出的周期报告、数据启动时诊断的报告)</p>
     * 
     * @param request ListDataDiagnoseReportsRequest
     * @return ListDataDiagnoseReportsResponse
     */
    public ListDataDiagnoseReportsResponse listDataDiagnoseReports(String instanceId, ListDataDiagnoseReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataDiagnoseReportsWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据诊断项抽样明细</p>
     * 
     * @param request ListDataDiagnoseSampleDetailsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataDiagnoseSampleDetailsResponse
     */
    public ListDataDiagnoseSampleDetailsResponse listDataDiagnoseSampleDetailsWithOptions(String instanceId, ListDataDiagnoseSampleDetailsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskCreateTime)) {
            query.put("taskCreateTime", request.taskCreateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskSource)) {
            query.put("taskSource", request.taskSource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataDiagnoseSampleDetails"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/data-diagnose-reports/sample-details"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataDiagnoseSampleDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据诊断项抽样明细</p>
     * 
     * @param request ListDataDiagnoseSampleDetailsRequest
     * @return ListDataDiagnoseSampleDetailsResponse
     */
    public ListDataDiagnoseSampleDetailsResponse listDataDiagnoseSampleDetails(String instanceId, ListDataDiagnoseSampleDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataDiagnoseSampleDetailsWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries datasets of a specified instance.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSetResponse
     */
    public ListDataSetResponse listDataSetWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSet"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/dataSets"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries datasets of a specified instance.</p>
     * @return ListDataSetResponse
     */
    public ListDataSetResponse listDataSet(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataSetWithOptions(instanceId, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSourceResponse
     */
    public ListDataSourceResponse listDataSourceWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSource"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/dataSources"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourceResponse());
    }

    /**
     * @return ListDataSourceResponse
     */
    public ListDataSourceResponse listDataSource(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataSourceWithOptions(instanceId, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExperimentsResponse
     */
    public ListExperimentsResponse listExperimentsWithOptions(String instanceId, String sceneId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExperiments"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + "/experiments"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExperimentsResponse());
    }

    /**
     * @return ListExperimentsResponse
     */
    public ListExperimentsResponse listExperiments(String instanceId, String sceneId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listExperimentsWithOptions(instanceId, sceneId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取特征、样本等表扩展数据源列表</p>
     * 
     * @param request ListExtraDataSourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExtraDataSourcesResponse
     */
    public ListExtraDataSourcesResponse listExtraDataSourcesWithOptions(String instanceId, ListExtraDataSourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExtraDataSources"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/extra-data-sources"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExtraDataSourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取特征、样本等表扩展数据源列表</p>
     * 
     * @param request ListExtraDataSourcesRequest
     * @return ListExtraDataSourcesResponse
     */
    public ListExtraDataSourcesResponse listExtraDataSources(String instanceId, ListExtraDataSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listExtraDataSourcesWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取特征表列表</p>
     * 
     * @param request ListFeatureTablesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFeatureTablesResponse
     */
    public ListFeatureTablesResponse listFeatureTablesWithOptions(String instanceId, ListFeatureTablesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("dataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateFrequency)) {
            query.put("updateFrequency", request.updateFrequency);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFeatureTables"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/feature-tables"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFeatureTablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取特征表列表</p>
     * 
     * @param request ListFeatureTablesRequest
     * @return ListFeatureTablesResponse
     */
    public ListFeatureTablesResponse listFeatureTables(String instanceId, ListFeatureTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFeatureTablesWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * @param request ListFilteringAlgorithmsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFilteringAlgorithmsResponse
     */
    public ListFilteringAlgorithmsResponse listFilteringAlgorithmsWithOptions(String instanceId, ListFilteringAlgorithmsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmId)) {
            query.put("algorithmId", request.algorithmId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFilteringAlgorithms"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/filtering-algorithms"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFilteringAlgorithmsResponse());
    }

    /**
     * @param request ListFilteringAlgorithmsRequest
     * @return ListFilteringAlgorithmsResponse
     */
    public ListFilteringAlgorithmsResponse listFilteringAlgorithms(String instanceId, ListFilteringAlgorithmsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFilteringAlgorithmsWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询流控任务列表</p>
     * 
     * @param request ListFlowControlTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFlowControlTaskResponse
     */
    public ListFlowControlTaskResponse listFlowControlTaskWithOptions(String instanceId, ListFlowControlTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlowControlTask"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/flowControlTasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowControlTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询流控任务列表</p>
     * 
     * @param request ListFlowControlTaskRequest
     * @return ListFlowControlTaskResponse
     */
    public ListFlowControlTaskResponse listFlowControlTask(String instanceId, ListFlowControlTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFlowControlTaskWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询失效物品 id_type</p>
     * 
     * @param request ListFlowControlTaskInvalidItemsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFlowControlTaskInvalidItemsResponse
     */
    public ListFlowControlTaskInvalidItemsResponse listFlowControlTaskInvalidItemsWithOptions(String instanceId, String taskId, ListFlowControlTaskInvalidItemsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlowControlTaskInvalidItems"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/flowControlTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + "/invalidItems"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowControlTaskInvalidItemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询失效物品 id_type</p>
     * 
     * @param request ListFlowControlTaskInvalidItemsRequest
     * @return ListFlowControlTaskInvalidItemsResponse
     */
    public ListFlowControlTaskInvalidItemsResponse listFlowControlTaskInvalidItems(String instanceId, String taskId, ListFlowControlTaskInvalidItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFlowControlTaskInvalidItemsWithOptions(instanceId, taskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>流量调控曝光排名物品/失效物品查询</p>
     * 
     * @param request ListFlowControlTaskItemReportsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFlowControlTaskItemReportsResponse
     */
    public ListFlowControlTaskItemReportsResponse listFlowControlTaskItemReportsWithOptions(String instanceId, String taskId, ListFlowControlTaskItemReportsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            query.put("count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectTimeType)) {
            query.put("selectTimeType", request.selectTimeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectType)) {
            query.put("selectType", request.selectType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlowControlTaskItemReports"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/flowControlTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + "/itemReports"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowControlTaskItemReportsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>流量调控曝光排名物品/失效物品查询</p>
     * 
     * @param request ListFlowControlTaskItemReportsRequest
     * @return ListFlowControlTaskItemReportsResponse
     */
    public ListFlowControlTaskItemReportsResponse listFlowControlTaskItemReports(String instanceId, String taskId, ListFlowControlTaskItemReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFlowControlTaskItemReportsWithOptions(instanceId, taskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>流量调控预览</p>
     * 
     * @param request ListFlowControlTaskItemsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFlowControlTaskItemsResponse
     */
    public ListFlowControlTaskItemsResponse listFlowControlTaskItemsWithOptions(String instanceId, String taskId, ListFlowControlTaskItemsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListFlowControlTaskItems"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/flowControlTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + "/actions/items"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowControlTaskItemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>流量调控预览</p>
     * 
     * @param request ListFlowControlTaskItemsRequest
     * @return ListFlowControlTaskItemsResponse
     */
    public ListFlowControlTaskItemsResponse listFlowControlTaskItems(String instanceId, String taskId, ListFlowControlTaskItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFlowControlTaskItemsWithOptions(instanceId, taskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries reference data for throttling.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFlowControlTaskReferenceResponse
     */
    public ListFlowControlTaskReferenceResponse listFlowControlTaskReferenceWithOptions(String instanceId, String taskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlowControlTaskReference"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/flowControlTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + "/reference"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowControlTaskReferenceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries reference data for throttling.</p>
     * @return ListFlowControlTaskReferenceResponse
     */
    public ListFlowControlTaskReferenceResponse listFlowControlTaskReference(String instanceId, String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFlowControlTaskReferenceWithOptions(instanceId, taskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>流量调控任务曝光分析</p>
     * 
     * @param request ListFlowControlTaskReportsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFlowControlTaskReportsResponse
     */
    public ListFlowControlTaskReportsResponse listFlowControlTaskReportsWithOptions(String instanceId, String taskId, ListFlowControlTaskReportsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlowControlTaskReports"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/flowControlTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + "/flowTaskReports"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowControlTaskReportsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>流量调控任务曝光分析</p>
     * 
     * @param request ListFlowControlTaskReportsRequest
     * @return ListFlowControlTaskReportsResponse
     */
    public ListFlowControlTaskReportsResponse listFlowControlTaskReports(String instanceId, String taskId, ListFlowControlTaskReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFlowControlTaskReportsWithOptions(instanceId, taskId, request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIndexVersionsResponse
     */
    public ListIndexVersionsResponse listIndexVersionsWithOptions(String instanceId, String algorithmId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIndexVersions"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/filtering-algorithms/" + com.aliyun.openapiutil.Client.getEncodeParam(algorithmId) + "/index-versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIndexVersionsResponse());
    }

    /**
     * @return ListIndexVersionsResponse
     */
    public ListIndexVersionsResponse listIndexVersions(String instanceId, String algorithmId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIndexVersionsWithOptions(instanceId, algorithmId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query the list of instances. The returned instances are ranked in descending order based on the values of GmtCreate. You can specify multiple request parameters. These request parameters can be used to filter query results. The request parameters that you specify have logical AND relations. Only the specified parameters can be used to filter query results.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information of instances.</p>
     * 
     * @param request ListInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceResponse
     */
    public ListInstanceResponse listInstanceWithOptions(ListInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expiredTime)) {
            query.put("expiredTime", request.expiredTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("instanceId", request.instanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstance"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query the list of instances. The returned instances are ranked in descending order based on the values of GmtCreate. You can specify multiple request parameters. These request parameters can be used to filter query results. The request parameters that you specify have logical AND relations. Only the specified parameters can be used to filter query results.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information of instances.</p>
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
     * <b>summary</b> : 
     * <p>Queries all asynchronous tasks of a specified instance by using the instance ID.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceTaskResponse
     */
    public ListInstanceTaskResponse listInstanceTaskWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceTask"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all asynchronous tasks of a specified instance by using the instance ID.</p>
     * @return ListInstanceTaskResponse
     */
    public ListInstanceTaskResponse listInstanceTask(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceTaskWithOptions(instanceId, headers, runtime);
    }

    /**
     * @param request ListItemsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListItemsResponse
     */
    public ListItemsResponse listItemsWithOptions(String instanceId, ListItemsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyUsed)) {
            query.put("strategyUsed", request.strategyUsed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withInvalidDetail)) {
            query.put("withInvalidDetail", request.withInvalidDetail);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListItems"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/items/actions/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListItemsResponse());
    }

    /**
     * @param request ListItemsRequest
     * @return ListItemsResponse
     */
    public ListItemsResponse listItems(String instanceId, ListItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listItemsWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * @param request ListLogsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLogsResponse
     */
    public ListLogsResponse listLogsWithOptions(String instanceId, ListLogsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryParams)) {
            query.put("queryParams", request.queryParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLogs"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/logs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLogsResponse());
    }

    /**
     * @param request ListLogsRequest
     * @return ListLogsResponse
     */
    public ListLogsResponse listLogs(String instanceId, ListLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLogsWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the content types supported in the diversity rule configurations of an instance.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMixCategoriesResponse
     */
    public ListMixCategoriesResponse listMixCategoriesWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMixCategories"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/configurations/mixCategories"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMixCategoriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the content types supported in the diversity rule configurations of an instance.</p>
     * @return ListMixCategoriesResponse
     */
    public ListMixCategoriesResponse listMixCategories() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMixCategoriesWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取离线存储列表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOfflineStoragesResponse
     */
    public ListOfflineStoragesResponse listOfflineStoragesWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOfflineStorages"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/%5BinstanceId%5D/offlineStorages"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOfflineStoragesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取离线存储列表</p>
     * @return ListOfflineStoragesResponse
     */
    public ListOfflineStoragesResponse listOfflineStorages(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOfflineStoragesWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the templates of a ranking model. The returned templates are sorted in reverse chronological order based on the time when the templates were created.</p>
     * 
     * @param request ListRankingModelTemplatesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRankingModelTemplatesResponse
     */
    public ListRankingModelTemplatesResponse listRankingModelTemplatesWithOptions(String instanceId, ListRankingModelTemplatesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListRankingModelTemplates"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ranking-model-templates"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRankingModelTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the templates of a ranking model. The returned templates are sorted in reverse chronological order based on the time when the templates were created.</p>
     * 
     * @param request ListRankingModelTemplatesRequest
     * @return ListRankingModelTemplatesResponse
     */
    public ListRankingModelTemplatesResponse listRankingModelTemplates(String instanceId, ListRankingModelTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRankingModelTemplatesWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of versions for a ranking model.</p>
     * 
     * @param request ListRankingModelVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRankingModelVersionsResponse
     */
    public ListRankingModelVersionsResponse listRankingModelVersionsWithOptions(String instanceId, ListRankingModelVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("templateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRankingModelVersions"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ranking-model-versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRankingModelVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of versions for a ranking model.</p>
     * 
     * @param request ListRankingModelVersionsRequest
     * @return ListRankingModelVersionsResponse
     */
    public ListRankingModelVersionsResponse listRankingModelVersions(String instanceId, ListRankingModelVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRankingModelVersionsWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * @param request ListRankingModelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRankingModelsResponse
     */
    public ListRankingModelsResponse listRankingModelsWithOptions(String instanceId, ListRankingModelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rankingModelId)) {
            query.put("rankingModelId", request.rankingModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRankingModels"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ranking-models"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRankingModelsResponse());
    }

    /**
     * @param request ListRankingModelsRequest
     * @return ListRankingModelsResponse
     */
    public ListRankingModelsResponse listRankingModels(String instanceId, ListRankingModelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRankingModelsWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the instance.</p>
     * 
     * @param request ListRankingSystemHistoriesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRankingSystemHistoriesResponse
     */
    public ListRankingSystemHistoriesResponse listRankingSystemHistoriesWithOptions(String instanceId, String name, ListRankingSystemHistoriesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            query.put("operateType", request.operateType);
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
            new TeaPair("action", "ListRankingSystemHistories"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ranking-systems/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/histories"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRankingSystemHistoriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the instance.</p>
     * 
     * @param request ListRankingSystemHistoriesRequest
     * @return ListRankingSystemHistoriesResponse
     */
    public ListRankingSystemHistoriesResponse listRankingSystemHistories(String instanceId, String name, ListRankingSystemHistoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRankingSystemHistoriesWithOptions(instanceId, name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取排序服务列表</p>
     * 
     * @param request ListRankingSystemsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRankingSystemsResponse
     */
    public ListRankingSystemsResponse listRankingSystemsWithOptions(String instanceId, ListRankingSystemsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deployStatus)) {
            query.put("deployStatus", request.deployStatus);
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
            new TeaPair("action", "ListRankingSystems"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ranking-systems"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRankingSystemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取排序服务列表</p>
     * 
     * @param request ListRankingSystemsRequest
     * @return ListRankingSystemsResponse
     */
    public ListRankingSystemsResponse listRankingSystems(String instanceId, ListRankingSystemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRankingSystemsWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries item selection rules of an instance.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRuleConditionsResponse
     */
    public ListRuleConditionsResponse listRuleConditionsWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRuleConditions"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/rule-conditions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRuleConditionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries item selection rules of an instance.</p>
     * @return ListRuleConditionsResponse
     */
    public ListRuleConditionsResponse listRuleConditions(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRuleConditionsWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The returned results.</p>
     * 
     * @param request ListRuleTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRuleTasksResponse
     */
    public ListRuleTasksResponse listRuleTasksWithOptions(String instanceId, ListRuleTasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("sceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRuleTasks"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/rule-tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRuleTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The returned results.</p>
     * 
     * @param request ListRuleTasksRequest
     * @return ListRuleTasksResponse
     */
    public ListRuleTasksResponse listRuleTasks(String instanceId, ListRuleTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRuleTasksWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * @param request ListRulesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRulesResponse
     */
    public ListRulesResponse listRulesWithOptions(String instanceId, ListRulesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("ruleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("sceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRules"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/rules"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRulesResponse());
    }

    /**
     * @param request ListRulesRequest
     * @return ListRulesResponse
     */
    public ListRulesResponse listRules(String instanceId, ListRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRulesWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取样本格式化配置列表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSampleFormatConfigsResponse
     */
    public ListSampleFormatConfigsResponse listSampleFormatConfigsWithOptions(String instanceId, String sampleId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSampleFormatConfigs"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/samples/" + com.aliyun.openapiutil.Client.getEncodeParam(sampleId) + "/format-configs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSampleFormatConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取样本格式化配置列表</p>
     * @return ListSampleFormatConfigsResponse
     */
    public ListSampleFormatConfigsResponse listSampleFormatConfigs(String instanceId, String sampleId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSampleFormatConfigsWithOptions(instanceId, sampleId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取样本列表</p>
     * 
     * @param request ListSamplesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSamplesResponse
     */
    public ListSamplesResponse listSamplesWithOptions(String instanceId, ListSamplesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleId)) {
            query.put("sampleId", request.sampleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSamples"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/samples"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSamplesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取样本列表</p>
     * 
     * @param request ListSamplesRequest
     * @return ListSamplesResponse
     */
    public ListSamplesResponse listSamples(String instanceId, ListSamplesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSamplesWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call an API operation to manage scenes. We recommend that you go to the Scenario Building page in the Artificial Intelligence Recommendation (AIRec) console to manage scenes.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries preview results.</p>
     * 
     * @param request ListSceneItemsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSceneItemsResponse
     */
    public ListSceneItemsResponse listSceneItemsWithOptions(String instanceId, String sceneId, ListSceneItemsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operationRuleId)) {
            query.put("operationRuleId", request.operationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previewType)) {
            query.put("previewType", request.previewType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryCount)) {
            query.put("queryCount", request.queryCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectionRuleId)) {
            query.put("selectionRuleId", request.selectionRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSceneItems"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + "/items"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSceneItemsResponse());
    }

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call an API operation to manage scenes. We recommend that you go to the Scenario Building page in the Artificial Intelligence Recommendation (AIRec) console to manage scenes.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries preview results.</p>
     * 
     * @param request ListSceneItemsRequest
     * @return ListSceneItemsResponse
     */
    public ListSceneItemsResponse listSceneItems(String instanceId, String sceneId, ListSceneItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSceneItemsWithOptions(instanceId, sceneId, request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSceneParametersResponse
     */
    public ListSceneParametersResponse listSceneParametersWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSceneParameters"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/dashboard/scene-parameters"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSceneParametersResponse());
    }

    /**
     * @return ListSceneParametersResponse
     */
    public ListSceneParametersResponse listSceneParameters(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSceneParametersWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call an API operation to manage scenes. Go to the Scenario Building page in the AIRec console to manage scenes.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries scenes of a specified instance.</p>
     * 
     * @param request ListScenesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScenesResponse
     */
    public ListScenesResponse listScenesWithOptions(String instanceId, ListScenesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("sceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScenes"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/scenes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListScenesResponse());
    }

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call an API operation to manage scenes. Go to the Scenario Building page in the AIRec console to manage scenes.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries scenes of a specified instance.</p>
     * 
     * @param request ListScenesRequest
     * @return ListScenesResponse
     */
    public ListScenesResponse listScenes(String instanceId, ListScenesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listScenesWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUmengAppkeysResponse
     */
    public ListUmengAppkeysResponse listUmengAppkeysWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUmengAppkeys"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/umeng/appkeys"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUmengAppkeysResponse());
    }

    /**
     * @return ListUmengAppkeysResponse
     */
    public ListUmengAppkeysResponse listUmengAppkeys() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUmengAppkeysWithOptions(headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserClustersResponse
     */
    public ListUserClustersResponse listUserClustersWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserClusters"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/user-clusters"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserClustersResponse());
    }

    /**
     * @return ListUserClustersResponse
     */
    public ListUserClustersResponse listUserClusters(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserClustersWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information of a single data source in a table of a specified instance.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDataSourceResponse
     */
    public ModifyDataSourceResponse modifyDataSourceWithOptions(String instanceId, String tableName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDataSource"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/dataSources/" + com.aliyun.openapiutil.Client.getEncodeParam(tableName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information of a single data source in a table of a specified instance.</p>
     * @return ModifyDataSourceResponse
     */
    public ModifyDataSourceResponse modifyDataSource(String instanceId, String tableName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyDataSourceWithOptions(instanceId, tableName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改特征表，只支表级别持特征列表的全量修改</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyFeatureTableResponse
     */
    public ModifyFeatureTableResponse modifyFeatureTableWithOptions(String instanceId, String type, String featureTableId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFeatureTable"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/feature-tables/" + com.aliyun.openapiutil.Client.getEncodeParam(type) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(featureTableId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFeatureTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改特征表，只支表级别持特征列表的全量修改</p>
     * @return ModifyFeatureTableResponse
     */
    public ModifyFeatureTableResponse modifyFeatureTable(String instanceId, String type, String featureTableId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyFeatureTableWithOptions(instanceId, type, featureTableId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The name of the filtering algorithm.</p>
     * 
     * <b>summary</b> : 
     * <p>The name of the project.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyFilteringAlgorithmMetaResponse
     */
    public ModifyFilteringAlgorithmMetaResponse modifyFilteringAlgorithmMetaWithOptions(String instanceId, String algorithmId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFilteringAlgorithmMeta"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/filtering-algorithms/" + com.aliyun.openapiutil.Client.getEncodeParam(algorithmId) + "/meta"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFilteringAlgorithmMetaResponse());
    }

    /**
     * <b>description</b> :
     * <p>The name of the filtering algorithm.</p>
     * 
     * <b>summary</b> : 
     * <p>The name of the project.</p>
     * @return ModifyFilteringAlgorithmMetaResponse
     */
    public ModifyFilteringAlgorithmMetaResponse modifyFilteringAlgorithmMeta(String instanceId, String algorithmId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyFilteringAlgorithmMetaWithOptions(instanceId, algorithmId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a throttling task.</p>
     * 
     * @param request ModifyFlowControlTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyFlowControlTaskResponse
     */
    public ModifyFlowControlTaskResponse modifyFlowControlTaskWithOptions(String instanceId, String taskId, ModifyFlowControlTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metaType)) {
            body.put("metaType", request.metaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneIds)) {
            body.put("sceneIds", request.sceneIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectionParams)) {
            body.put("selectionParams", request.selectionParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            body.put("target", request.target);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFlowControlTask"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/flowControlTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFlowControlTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a throttling task.</p>
     * 
     * @param request ModifyFlowControlTaskRequest
     * @return ModifyFlowControlTaskResponse
     */
    public ModifyFlowControlTaskResponse modifyFlowControlTask(String instanceId, String taskId, ModifyFlowControlTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyFlowControlTaskWithOptions(instanceId, taskId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a specified instance.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceResponse
     */
    public ModifyInstanceResponse modifyInstanceWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstance"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a specified instance.</p>
     * @return ModifyInstanceResponse
     */
    public ModifyInstanceResponse modifyInstance(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyInstanceWithOptions(instanceId, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyItemsResponse
     */
    public ModifyItemsResponse modifyItemsWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyItems"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/items"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyItemsResponse());
    }

    /**
     * @return ModifyItemsResponse
     */
    public ModifyItemsResponse modifyItems(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyItemsWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the offline storage configurations of an instance. You need to modify three tables at the same time.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyOfflineStoragesResponse
     */
    public ModifyOfflineStoragesResponse modifyOfflineStoragesWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyOfflineStorages"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/%5BinstanceId%5D/offlineStorages"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyOfflineStoragesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the offline storage configurations of an instance. You need to modify three tables at the same time.</p>
     * @return ModifyOfflineStoragesResponse
     */
    public ModifyOfflineStoragesResponse modifyOfflineStorages(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyOfflineStoragesWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the ranking model.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyRankingModelResponse
     */
    public ModifyRankingModelResponse modifyRankingModelWithOptions(String instanceId, String rankingModelId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyRankingModel"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ranking-models/" + com.aliyun.openapiutil.Client.getEncodeParam(rankingModelId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyRankingModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the ranking model.</p>
     * @return ModifyRankingModelResponse
     */
    public ModifyRankingModelResponse modifyRankingModel(String instanceId, String rankingModelId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyRankingModelWithOptions(instanceId, rankingModelId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a ranking model.</p>
     * 
     * @param request ModifyRankingModelTemplateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyRankingModelTemplateResponse
     */
    public ModifyRankingModelTemplateResponse modifyRankingModelTemplateWithOptions(String instanceId, String templateId, ModifyRankingModelTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyRankingModelTemplate"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ranking-model-templates/" + com.aliyun.openapiutil.Client.getEncodeParam(templateId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyRankingModelTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a ranking model.</p>
     * 
     * @param request ModifyRankingModelTemplateRequest
     * @return ModifyRankingModelTemplateResponse
     */
    public ModifyRankingModelTemplateResponse modifyRankingModelTemplate(String instanceId, String templateId, ModifyRankingModelTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyRankingModelTemplateWithOptions(instanceId, templateId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a ranking service.</p>
     * 
     * @param request ModifyRankingSystemRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyRankingSystemResponse
     */
    public ModifyRankingSystemResponse modifyRankingSystemWithOptions(String instanceId, String name, ModifyRankingSystemRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyRankingSystem"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ranking-systems/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyRankingSystemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a ranking service.</p>
     * 
     * @param request ModifyRankingSystemRequest
     * @return ModifyRankingSystemResponse
     */
    public ModifyRankingSystemResponse modifyRankingSystem(String instanceId, String name, ModifyRankingSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyRankingSystemWithOptions(instanceId, name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a rule.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyRuleResponse
     */
    public ModifyRuleResponse modifyRuleWithOptions(String instanceId, String ruleId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyRule"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/rules/" + com.aliyun.openapiutil.Client.getEncodeParam(ruleId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a rule.</p>
     * @return ModifyRuleResponse
     */
    public ModifyRuleResponse modifyRule(String instanceId, String ruleId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyRuleWithOptions(instanceId, ruleId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改样本配置</p>
     * 
     * @param request ModifySampleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySampleResponse
     */
    public ModifySampleResponse modifySampleWithOptions(String instanceId, String sampleId, ModifySampleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySample"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/samples/" + com.aliyun.openapiutil.Client.getEncodeParam(sampleId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySampleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改样本配置</p>
     * 
     * @param request ModifySampleRequest
     * @return ModifySampleResponse
     */
    public ModifySampleResponse modifySample(String instanceId, String sampleId, ModifySampleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifySampleWithOptions(instanceId, sampleId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call an API operation to manage scenes. We recommend that you go to the Scenario Building page in the Artificial Intelligence Recommendation (AIRec) console to manage scenes.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information about a scene.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySceneResponse
     */
    public ModifySceneResponse modifySceneWithOptions(String instanceId, String sceneId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyScene"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySceneResponse());
    }

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call an API operation to manage scenes. We recommend that you go to the Scenario Building page in the Artificial Intelligence Recommendation (AIRec) console to manage scenes.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information about a scene.</p>
     * @return ModifySceneResponse
     */
    public ModifySceneResponse modifyScene(String instanceId, String sceneId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifySceneWithOptions(instanceId, sceneId, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return OfflineFilteringAlgorithmResponse
     */
    public OfflineFilteringAlgorithmResponse offlineFilteringAlgorithmWithOptions(String instanceId, String algorithmId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OfflineFilteringAlgorithm"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/filtering-algorithms/" + com.aliyun.openapiutil.Client.getEncodeParam(algorithmId) + "/actions/offline"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OfflineFilteringAlgorithmResponse());
    }

    /**
     * @return OfflineFilteringAlgorithmResponse
     */
    public OfflineFilteringAlgorithmResponse offlineFilteringAlgorithm(String instanceId, String algorithmId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.offlineFilteringAlgorithmWithOptions(instanceId, algorithmId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发布流调任务接口</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishFlowControlTaskResponse
     */
    public PublishFlowControlTaskResponse publishFlowControlTaskWithOptions(String instanceId, String taskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishFlowControlTask"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/flowControlTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + "/actions/publish"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishFlowControlTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发布流调任务接口</p>
     * @return PublishFlowControlTaskResponse
     */
    public PublishFlowControlTaskResponse publishFlowControlTask(String instanceId, String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishFlowControlTaskWithOptions(instanceId, taskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Publishes a rule.</p>
     * 
     * @param request PublishRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishRuleResponse
     */
    public PublishRuleResponse publishRuleWithOptions(String ruleId, String instanceId, PublishRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("ruleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("sceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishRule"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/rules/" + com.aliyun.openapiutil.Client.getEncodeParam(ruleId) + "/actions/publish"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Publishes a rule.</p>
     * 
     * @param request PublishRuleRequest
     * @return PublishRuleResponse
     */
    public PublishRuleResponse publishRule(String ruleId, String instanceId, PublishRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishRuleWithOptions(ruleId, instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>该接口用于向指定冷启动实例指定表推送文档</p>
     * 
     * @param request PushColdStartDocumentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushColdStartDocumentResponse
     */
    public PushColdStartDocumentResponse pushColdStartDocumentWithOptions(String instanceId, String tableName, PushColdStartDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushColdStartDocument"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/cold-start/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(tableName) + "/actions/bulk"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushColdStartDocumentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>该接口用于向指定冷启动实例指定表推送文档</p>
     * 
     * @param request PushColdStartDocumentRequest
     * @return PushColdStartDocumentResponse
     */
    public PushColdStartDocumentResponse pushColdStartDocument(String instanceId, String tableName, PushColdStartDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushColdStartDocumentWithOptions(instanceId, tableName, request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushDocumentResponse
     */
    public PushDocumentResponse pushDocumentWithOptions(String instanceId, String tableName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushDocument"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(tableName) + "/actions/bulk"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushDocumentResponse());
    }

    /**
     * @return PushDocumentResponse
     */
    public PushDocumentResponse pushDocument(String instanceId, String tableName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushDocumentWithOptions(instanceId, tableName, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushInterventionResponse
     */
    public PushInterventionResponse pushInterventionWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushIntervention"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/actions/intervene"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushInterventionResponse());
    }

    /**
     * @return PushInterventionResponse
     */
    public PushInterventionResponse pushIntervention(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushInterventionWithOptions(instanceId, headers, runtime);
    }

    /**
     * @param request QueryDataMessageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDataMessageResponse
     */
    public QueryDataMessageResponse queryDataMessageWithOptions(String instanceId, String table, QueryDataMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bhvType)) {
            query.put("bhvType", request.bhvType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cmdType)) {
            query.put("cmdType", request.cmdType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imei)) {
            query.put("imei", request.imei);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            query.put("itemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemType)) {
            query.put("itemType", request.itemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageSource)) {
            query.put("messageSource", request.messageSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("sceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceId)) {
            query.put("traceId", request.traceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("userId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            query.put("userType", request.userType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDataMessage"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(table) + "/data-message"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDataMessageResponse());
    }

    /**
     * @param request QueryDataMessageRequest
     * @return QueryDataMessageResponse
     */
    public QueryDataMessageResponse queryDataMessage(String instanceId, String table, QueryDataMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDataMessageWithOptions(instanceId, table, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query statistics on update messages in a specified data table of a specified instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries statistics on update messages in a data table of an instance.</p>
     * 
     * @param request QueryDataMessageStatisticsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDataMessageStatisticsResponse
     */
    public QueryDataMessageStatisticsResponse queryDataMessageStatisticsWithOptions(String instanceId, String table, QueryDataMessageStatisticsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bhvType)) {
            query.put("bhvType", request.bhvType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cmdType)) {
            query.put("cmdType", request.cmdType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imei)) {
            query.put("imei", request.imei);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            query.put("itemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemType)) {
            query.put("itemType", request.itemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageSource)) {
            query.put("messageSource", request.messageSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("sceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceId)) {
            query.put("traceId", request.traceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("userId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            query.put("userType", request.userType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDataMessageStatistics"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(table) + "/data-message-statistics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDataMessageStatisticsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query statistics on update messages in a specified data table of a specified instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries statistics on update messages in a data table of an instance.</p>
     * 
     * @param request QueryDataMessageStatisticsRequest
     * @return QueryDataMessageStatisticsResponse
     */
    public QueryDataMessageStatisticsResponse queryDataMessageStatistics(String instanceId, String table, QueryDataMessageStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDataMessageStatisticsWithOptions(instanceId, table, request, headers, runtime);
    }

    /**
     * @param request QueryExceptionHistoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryExceptionHistoryResponse
     */
    public QueryExceptionHistoryResponse queryExceptionHistoryWithOptions(String instanceId, QueryExceptionHistoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryExceptionHistory"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/sync-reports/exception-history"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryExceptionHistoryResponse());
    }

    /**
     * @param request QueryExceptionHistoryRequest
     * @return QueryExceptionHistoryResponse
     */
    public QueryExceptionHistoryResponse queryExceptionHistory(String instanceId, QueryExceptionHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryExceptionHistoryWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query raw data in a specific data table of an instance by using the primary key. The returned results need to be confirmed by customers.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries raw data in a specific data table of an instance by using the primary key.</p>
     * 
     * @param request QueryRawDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRawDataResponse
     */
    public QueryRawDataResponse queryRawDataWithOptions(String instanceId, String table, QueryRawDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imei)) {
            query.put("imei", request.imei);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            query.put("itemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemType)) {
            query.put("itemType", request.itemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("userId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            query.put("userType", request.userType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRawData"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/tables/" + com.aliyun.openapiutil.Client.getEncodeParam(table) + "/raw-data"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRawDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query raw data in a specific data table of an instance by using the primary key. The returned results need to be confirmed by customers.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries raw data in a specific data table of an instance by using the primary key.</p>
     * 
     * @param request QueryRawDataRequest
     * @return QueryRawDataResponse
     */
    public QueryRawDataResponse queryRawData(String instanceId, String table, QueryRawDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRawDataWithOptions(instanceId, table, request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySingleAggregationReportResponse
     */
    public QuerySingleAggregationReportResponse querySingleAggregationReportWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySingleAggregationReport"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/sync-reports/single-aggregation-report"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySingleAggregationReportResponse());
    }

    /**
     * @return QuerySingleAggregationReportResponse
     */
    public QuerySingleAggregationReportResponse querySingleAggregationReport(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySingleAggregationReportWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a single table report. More report types may be supported.</p>
     * 
     * @param request QuerySingleReportRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySingleReportResponse
     */
    public QuerySingleReportResponse querySingleReportWithOptions(String instanceId, QuerySingleReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportType)) {
            query.put("reportType", request.reportType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySingleReport"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/sync-reports/single-report"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySingleReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a single table report. More report types may be supported.</p>
     * 
     * @param request QuerySingleReportRequest
     * @return QuerySingleReportResponse
     */
    public QuerySingleReportResponse querySingleReport(String instanceId, QuerySingleReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySingleReportWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the data overview.</p>
     * 
     * @param request QuerySyncReportAggregationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySyncReportAggregationResponse
     */
    public QuerySyncReportAggregationResponse querySyncReportAggregationWithOptions(String instanceId, QuerySyncReportAggregationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySyncReportAggregation"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/sync-reports/aggregation"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySyncReportAggregationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the data overview.</p>
     * 
     * @param request QuerySyncReportAggregationRequest
     * @return QuerySyncReportAggregationResponse
     */
    public QuerySyncReportAggregationResponse querySyncReportAggregation(String instanceId, QuerySyncReportAggregationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySyncReportAggregationWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Rebuilds an index.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RebuildIndexResponse
     */
    public RebuildIndexResponse rebuildIndexWithOptions(String instanceId, String algorithmId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebuildIndex"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/filtering-algorithms/" + com.aliyun.openapiutil.Client.getEncodeParam(algorithmId) + "/actions/rebuild"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebuildIndexResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Rebuilds an index.</p>
     * @return RebuildIndexResponse
     */
    public RebuildIndexResponse rebuildIndex(String instanceId, String algorithmId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rebuildIndexWithOptions(instanceId, algorithmId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The type of the recommendation service.</p>
     * 
     * @param request RecommendRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecommendResponse
     */
    public RecommendResponse recommendWithOptions(String instanceId, RecommendRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imei)) {
            query.put("imei", request.imei);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.items)) {
            query.put("items", request.items);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rankOpen)) {
            query.put("rankOpen", request.rankOpen);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recType)) {
            query.put("recType", request.recType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnCount)) {
            query.put("returnCount", request.returnCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("sceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("serviceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategy)) {
            query.put("strategy", request.strategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("userId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfo)) {
            query.put("userInfo", request.userInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Recommend"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/actions/recommend"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecommendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The type of the recommendation service.</p>
     * 
     * @param request RecommendRequest
     * @return RecommendResponse
     */
    public RecommendResponse recommend(String instanceId, RecommendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recommendWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Refreshes a feature table based on the source table in MaxCompute. The refresh policy is subject to data in the source table.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshFeatureTableResponse
     */
    public RefreshFeatureTableResponse refreshFeatureTableWithOptions(String instanceId, String type, String featureTableId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshFeatureTable"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/feature-tables/" + com.aliyun.openapiutil.Client.getEncodeParam(type) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(featureTableId) + "/actions/refresh"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshFeatureTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Refreshes a feature table based on the source table in MaxCompute. The refresh policy is subject to data in the source table.</p>
     * @return RefreshFeatureTableResponse
     */
    public RefreshFeatureTableResponse refreshFeatureTable(String instanceId, String type, String featureTableId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refreshFeatureTableWithOptions(instanceId, type, featureTableId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>回滚某个排序服务</p>
     * 
     * @param request RollbackRankingSystemRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RollbackRankingSystemResponse
     */
    public RollbackRankingSystemResponse rollbackRankingSystemWithOptions(String instanceId, String name, RollbackRankingSystemRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RollbackRankingSystem"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ranking-systems/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/actions/rollback"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RollbackRankingSystemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>回滚某个排序服务</p>
     * 
     * @param request RollbackRankingSystemRequest
     * @return RollbackRankingSystemResponse
     */
    public RollbackRankingSystemResponse rollbackRankingSystem(String instanceId, String name, RollbackRankingSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rollbackRankingSystemWithOptions(instanceId, name, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to run an instance to start a full data import task. After you call this API operation, the system creates a dataset. Then, the system imports all data from your data sources into the dataset for data training.</p>
     * 
     * <b>summary</b> : 
     * <p>Runs an instance to start a full data import task.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunInstanceResponse
     */
    public RunInstanceResponse runInstanceWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunInstance"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/actions/import"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to run an instance to start a full data import task. After you call this API operation, the system creates a dataset. Then, the system imports all data from your data sources into the dataset for data training.</p>
     * 
     * <b>summary</b> : 
     * <p>Runs an instance to start a full data import task.</p>
     * @return RunInstanceResponse
     */
    public RunInstanceResponse runInstance(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runInstanceWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启动模型训练</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunRankingModelTemplateResponse
     */
    public RunRankingModelTemplateResponse runRankingModelTemplateWithOptions(String instanceId, String templateId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunRankingModelTemplate"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ranking-model-templates/" + com.aliyun.openapiutil.Client.getEncodeParam(templateId) + "/actions/run"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunRankingModelTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启动模型训练</p>
     * @return RunRankingModelTemplateResponse
     */
    public RunRankingModelTemplateResponse runRankingModelTemplate(String instanceId, String templateId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runRankingModelTemplateWithOptions(instanceId, templateId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Triggers sample formatting configurations.</p>
     * 
     * @param request RunSampleFormatConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunSampleFormatConfigResponse
     */
    public RunSampleFormatConfigResponse runSampleFormatConfigWithOptions(String instanceId, String sampleId, RunSampleFormatConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("mode", request.mode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunSampleFormatConfig"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/samples/" + com.aliyun.openapiutil.Client.getEncodeParam(sampleId) + "/format-configs/actions/run"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunSampleFormatConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Triggers sample formatting configurations.</p>
     * 
     * @param request RunSampleFormatConfigRequest
     * @return RunSampleFormatConfigResponse
     */
    public RunSampleFormatConfigResponse runSampleFormatConfig(String instanceId, String sampleId, RunSampleFormatConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runSampleFormatConfigWithOptions(instanceId, sampleId, request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopDataSetResponse
     */
    public StopDataSetResponse stopDataSetWithOptions(String instanceId, String versionId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDataSet"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/dataSets/" + com.aliyun.openapiutil.Client.getEncodeParam(versionId) + "/actions/stop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopDataSetResponse());
    }

    /**
     * @return StopDataSetResponse
     */
    public StopDataSetResponse stopDataSet(String instanceId, String versionId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopDataSetWithOptions(instanceId, versionId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停止流调任务接口</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopFlowControlTaskResponse
     */
    public StopFlowControlTaskResponse stopFlowControlTaskWithOptions(String instanceId, String taskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopFlowControlTask"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/flowControlTasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + "/actions/stop"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopFlowControlTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>停止流调任务接口</p>
     * @return StopFlowControlTaskResponse
     */
    public StopFlowControlTaskResponse stopFlowControlTask(String instanceId, String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopFlowControlTaskWithOptions(instanceId, taskId, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnLockIndexVersionResponse
     */
    public UnLockIndexVersionResponse unLockIndexVersionWithOptions(String instanceId, String algorithmId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnLockIndexVersion"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/filtering-algorithms/" + com.aliyun.openapiutil.Client.getEncodeParam(algorithmId) + "/actions/unlock"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnLockIndexVersionResponse());
    }

    /**
     * @return UnLockIndexVersionResponse
     */
    public UnLockIndexVersionResponse unLockIndexVersion(String instanceId, String algorithmId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unLockIndexVersionWithOptions(instanceId, algorithmId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the basic information about an experiment.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateExperimentBasicInfoResponse
     */
    public UpdateExperimentBasicInfoResponse updateExperimentBasicInfoWithOptions(String instanceId, String sceneId, String experimentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateExperimentBasicInfo"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + "/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(experimentId) + "/basic"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateExperimentBasicInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the basic information about an experiment.</p>
     * @return UpdateExperimentBasicInfoResponse
     */
    public UpdateExperimentBasicInfoResponse updateExperimentBasicInfo(String instanceId, String sceneId, String experimentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateExperimentBasicInfoWithOptions(instanceId, sceneId, experimentId, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateExperimentConfigResponse
     */
    public UpdateExperimentConfigResponse updateExperimentConfigWithOptions(String instanceId, String sceneId, String experimentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateExperimentConfig"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + "/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(experimentId) + "/config"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateExperimentConfigResponse());
    }

    /**
     * @return UpdateExperimentConfigResponse
     */
    public UpdateExperimentConfigResponse updateExperimentConfig(String instanceId, String sceneId, String experimentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateExperimentConfigWithOptions(instanceId, sceneId, experimentId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the state of an experiment.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateExperimentStatusResponse
     */
    public UpdateExperimentStatusResponse updateExperimentStatusWithOptions(String instanceId, String sceneId, String experimentId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateExperimentStatus"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/scenes/" + com.aliyun.openapiutil.Client.getEncodeParam(sceneId) + "/experiments/" + com.aliyun.openapiutil.Client.getEncodeParam(experimentId) + "/status"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateExperimentStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the state of an experiment.</p>
     * @return UpdateExperimentStatusResponse
     */
    public UpdateExperimentStatusResponse updateExperimentStatus(String instanceId, String sceneId, String experimentId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateExperimentStatusWithOptions(instanceId, sceneId, experimentId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the quotas of a specified instance.
     * The limits on the number of users: 1,000,000 to 10,000,000. The limits on the number of items: 1,000,000 to 10,000,000. The limits on the queries per second (QPS) for recommendation requests: 10 to 500.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the quotas of a specified instance.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeInstanceResponse
     */
    public UpgradeInstanceResponse upgradeInstanceWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeInstance"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/actions/upgrade"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the quotas of a specified instance.
     * The limits on the number of users: 1,000,000 to 10,000,000. The limits on the number of items: 1,000,000 to 10,000,000. The limits on the queries per second (QPS) for recommendation requests: 10 to 500.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the quotas of a specified instance.</p>
     * @return UpgradeInstanceResponse
     */
    public UpgradeInstanceResponse upgradeInstance(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upgradeInstanceWithOptions(instanceId, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidateInstanceResponse
     */
    public ValidateInstanceResponse validateInstanceWithOptions(String instanceId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateInstance"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/actions/validate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateInstanceResponse());
    }

    /**
     * @return ValidateInstanceResponse
     */
    public ValidateInstanceResponse validateInstance(String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateInstanceWithOptions(instanceId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调试排序服务</p>
     * 
     * @param request VerifyRankingSystemRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyRankingSystemResponse
     */
    public VerifyRankingSystemResponse verifyRankingSystemWithOptions(String instanceId, String name, VerifyRankingSystemRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.body)) {
            body.put("body", request.body);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyRankingSystem"),
            new TeaPair("version", "2020-11-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/openapi/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/ranking-systems/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/actions/verify"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyRankingSystemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>调试排序服务</p>
     * 
     * @param request VerifyRankingSystemRequest
     * @return VerifyRankingSystemResponse
     */
    public VerifyRankingSystemResponse verifyRankingSystem(String instanceId, String name, VerifyRankingSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyRankingSystemWithOptions(instanceId, name, request, headers, runtime);
    }
}
