// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627;

import com.aliyun.tea.*;
import com.aliyun.es_serverless20230627.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("es-serverless", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>撤销规格审批</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelSpecReviewTaskResponse
     */
    public CancelSpecReviewTaskResponse cancelSpecReviewTaskWithOptions(String appName, String taskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelSpecReviewTask"),
            new TeaPair("version", "2023-06-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/es-serverless/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/spec-review-tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelSpecReviewTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>撤销规格审批</p>
     * @return CancelSpecReviewTaskResponse
     */
    public CancelSpecReviewTaskResponse cancelSpecReviewTask(String appName, String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelSpecReviewTaskWithOptions(appName, taskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建Serverless应用</p>
     * 
     * @param request CreateAppRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppResponse
     */
    public CreateAppResponse createAppWithOptions(CreateAppRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("appName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authentication)) {
            body.put("authentication", request.authentication);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            body.put("chargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.network)) {
            body.put("network", request.network);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateNetwork)) {
            body.put("privateNetwork", request.privateNetwork);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaInfo)) {
            body.put("quotaInfo", request.quotaInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenario)) {
            body.put("scenario", request.scenario);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
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
            new TeaPair("action", "CreateApp"),
            new TeaPair("version", "2023-06-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/es-serverless/instances"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建Serverless应用</p>
     * 
     * @param request CreateAppRequest
     * @return CreateAppResponse
     */
    public CreateAppResponse createApp(CreateAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAppWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建端点</p>
     * 
     * @param request CreateEndpointRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEndpointResponse
     */
    public CreateEndpointResponse createEndpointWithOptions(CreateEndpointRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpointZones)) {
            body.put("endpointZones", request.endpointZones);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
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
            new TeaPair("action", "CreateEndpoint"),
            new TeaPair("version", "2023-06-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/es-serverless/endpoints"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建端点</p>
     * 
     * @param request CreateEndpointRequest
     * @return CreateEndpointResponse
     */
    public CreateEndpointResponse createEndpoint(CreateEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEndpointWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建快照</p>
     * 
     * @param request CreateSnapshotRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSnapshotResponse
     */
    public CreateSnapshotResponse createSnapshotWithOptions(String appName, String repository, CreateSnapshotRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.indices)) {
            body.put("indices", request.indices);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshot)) {
            body.put("snapshot", request.snapshot);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSnapshot"),
            new TeaPair("version", "2023-06-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/es-serverless/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/snapshot-repositories/" + com.aliyun.openapiutil.Client.getEncodeParam(repository) + "/snapshots"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSnapshotResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建快照</p>
     * 
     * @param request CreateSnapshotRequest
     * @return CreateSnapshotResponse
     */
    public CreateSnapshotResponse createSnapshot(String appName, String repository, CreateSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSnapshotWithOptions(appName, repository, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除Serverless应用。</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteAppWithOptions(String appName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApp"),
            new TeaPair("version", "2023-06-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/es-serverless/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除Serverless应用。</p>
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteApp(String appName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAppWithOptions(appName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除词典</p>
     * 
     * @param request DeleteDictRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDictResponse
     */
    public DeleteDictResponse deleteDictWithOptions(String appName, DeleteDictRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDict"),
            new TeaPair("version", "2023-06-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/es-serverless/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/dicts/actions/remove"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDictResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除词典</p>
     * 
     * @param request DeleteDictRequest
     * @return DeleteDictResponse
     */
    public DeleteDictResponse deleteDict(String appName, DeleteDictRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDictWithOptions(appName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除端点</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEndpointResponse
     */
    public DeleteEndpointResponse deleteEndpointWithOptions(String endpointId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEndpoint"),
            new TeaPair("version", "2023-06-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/es-serverless/endpoints/" + com.aliyun.openapiutil.Client.getEncodeParam(endpointId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除端点</p>
     * @return DeleteEndpointResponse
     */
    public DeleteEndpointResponse deleteEndpoint(String endpointId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteEndpointWithOptions(endpointId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除快照</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSnapshotResponse
     */
    public DeleteSnapshotResponse deleteSnapshotWithOptions(String appName, String repository, String snapshot, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSnapshot"),
            new TeaPair("version", "2023-06-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/es-serverless/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/snapshot-repositories/" + com.aliyun.openapiutil.Client.getEncodeParam(repository) + "/snapshots/" + com.aliyun.openapiutil.Client.getEncodeParam(snapshot) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSnapshotResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除快照</p>
     * @return DeleteSnapshotResponse
     */
    public DeleteSnapshotResponse deleteSnapshot(String appName, String repository, String snapshot) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSnapshotWithOptions(appName, repository, snapshot, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Serverless应用详情</p>
     * 
     * @param request GetAppRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppResponse
     */
    public GetAppResponse getAppWithOptions(String appName, GetAppRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.detailed)) {
            query.put("detailed", request.detailed);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApp"),
            new TeaPair("version", "2023-06-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/es-serverless/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Serverless应用详情</p>
     * 
     * @param request GetAppRequest
     * @return GetAppResponse
     */
    public GetAppResponse getApp(String appName, GetAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppWithOptions(appName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Serverless应用配额详情</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppQuotaResponse
     */
    public GetAppQuotaResponse getAppQuotaWithOptions(String appName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppQuota"),
            new TeaPair("version", "2023-06-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/es-serverless/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/quota"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Serverless应用配额详情</p>
     * @return GetAppQuotaResponse
     */
    public GetAppQuotaResponse getAppQuota(String appName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppQuotaWithOptions(appName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取监控数据</p>
     * 
     * @param request GetMonitorDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMonitorDataResponse
     */
    public GetMonitorDataResponse getMonitorDataWithOptions(GetMonitorDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMonitorData"),
            new TeaPair("version", "2023-06-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/es-serverless/emon/metrics/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMonitorDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取监控数据</p>
     * 
     * @param request GetMonitorDataRequest
     * @return GetMonitorDataResponse
     */
    public GetMonitorDataResponse getMonitorData(GetMonitorDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMonitorDataWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取自动备份配置</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSnapshotSettingResponse
     */
    public GetSnapshotSettingResponse getSnapshotSettingWithOptions(String appName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSnapshotSetting"),
            new TeaPair("version", "2023-06-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/es-serverless/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/auto-snapshot-setting"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSnapshotSettingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取自动备份配置</p>
     * @return GetSnapshotSettingResponse
     */
    public GetSnapshotSettingResponse getSnapshotSetting(String appName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSnapshotSettingWithOptions(appName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取配额审批详情</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSpecReviewTaskResponse
     */
    public GetSpecReviewTaskResponse getSpecReviewTaskWithOptions(String appName, String taskId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSpecReviewTask"),
            new TeaPair("version", "2023-06-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/es-serverless/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/spec-review-tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(taskId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSpecReviewTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取配额审批详情</p>
     * @return GetSpecReviewTaskResponse
     */
    public GetSpecReviewTaskResponse getSpecReviewTask(String appName, String taskId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSpecReviewTaskWithOptions(appName, taskId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看Serverless应用列表</p>
     * 
     * @param request ListAppsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppsResponse
     */
    public ListAppsResponse listAppsWithOptions(ListAppsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("appName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTime)) {
            query.put("createTime", request.createTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("orderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApps"),
            new TeaPair("version", "2023-06-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/es-serverless/instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看Serverless应用列表</p>
     * 
     * @param request ListAppsRequest
     * @return ListAppsResponse
     */
    public ListAppsResponse listApps(ListAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取词典列表</p>
     * 
     * @param request ListDictsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDictsResponse
     */
    public ListDictsResponse listDictsWithOptions(String appName, ListDictsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDicts"),
            new TeaPair("version", "2023-06-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/es-serverless/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/dicts"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDictsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取词典列表</p>
     * 
     * @param request ListDictsRequest
     * @return ListDictsResponse
     */
    public ListDictsResponse listDicts(String appName, ListDictsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDictsWithOptions(appName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取端点信息列表</p>
     * 
     * @param request ListEndpointsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEndpointsResponse
     */
    public ListEndpointsResponse listEndpointsWithOptions(ListEndpointsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("resourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("vpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEndpoints"),
            new TeaPair("version", "2023-06-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/es-serverless/endpoints"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEndpointsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取端点信息列表</p>
     * 
     * @param request ListEndpointsRequest
     * @return ListEndpointsResponse
     */
    public ListEndpointsResponse listEndpoints(ListEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEndpointsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看索引列表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIndicesResponse
     */
    public ListIndicesResponse listIndicesWithOptions(String appName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIndices"),
            new TeaPair("version", "2023-06-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/es-serverless/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/indices"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIndicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看索引列表</p>
     * @return ListIndicesResponse
     */
    public ListIndicesResponse listIndices(String appName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIndicesWithOptions(appName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取快照仓库列表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSnapshotRepositoriesResponse
     */
    public ListSnapshotRepositoriesResponse listSnapshotRepositoriesWithOptions(String appName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSnapshotRepositories"),
            new TeaPair("version", "2023-06-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/es-serverless/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/snapshot-repositories"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSnapshotRepositoriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取快照仓库列表</p>
     * @return ListSnapshotRepositoriesResponse
     */
    public ListSnapshotRepositoriesResponse listSnapshotRepositories(String appName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSnapshotRepositoriesWithOptions(appName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取仓库的快照列表</p>
     * 
     * @param request ListSnapshotsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSnapshotsResponse
     */
    public ListSnapshotsResponse listSnapshotsWithOptions(String appName, ListSnapshotsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repository)) {
            query.put("repository", request.repository);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshot)) {
            query.put("snapshot", request.snapshot);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSnapshots"),
            new TeaPair("version", "2023-06-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/es-serverless/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/snapshots"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSnapshotsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取仓库的快照列表</p>
     * 
     * @param request ListSnapshotsRequest
     * @return ListSnapshotsResponse
     */
    public ListSnapshotsResponse listSnapshots(String appName, ListSnapshotsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSnapshotsWithOptions(appName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取规格审批列表</p>
     * 
     * @param request ListSpecReviewTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSpecReviewTasksResponse
     */
    public ListSpecReviewTasksResponse listSpecReviewTasksWithOptions(String appName, ListSpecReviewTasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSpecReviewTasks"),
            new TeaPair("version", "2023-06-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/es-serverless/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/spec-review-tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSpecReviewTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取规格审批列表</p>
     * 
     * @param request ListSpecReviewTasksRequest
     * @return ListSpecReviewTasksResponse
     */
    public ListSpecReviewTasksResponse listSpecReviewTasks(String appName, ListSpecReviewTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSpecReviewTasksWithOptions(appName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑Serverless应用</p>
     * 
     * @param request UpdateAppRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAppResponse
     */
    public UpdateAppResponse updateAppWithOptions(String appName, UpdateAppRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyReason)) {
            body.put("applyReason", request.applyReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authentication)) {
            body.put("authentication", request.authentication);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactInfo)) {
            body.put("contactInfo", request.contactInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limiterInfo)) {
            body.put("limiterInfo", request.limiterInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.network)) {
            body.put("network", request.network);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateNetwork)) {
            body.put("privateNetwork", request.privateNetwork);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApp"),
            new TeaPair("version", "2023-06-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/es-serverless/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + ""),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑Serverless应用</p>
     * 
     * @param request UpdateAppRequest
     * @return UpdateAppResponse
     */
    public UpdateAppResponse updateApp(String appName, UpdateAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAppWithOptions(appName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建或更新词典</p>
     * 
     * @param request UpdateDictRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDictResponse
     */
    public UpdateDictResponse updateDictWithOptions(String appName, UpdateDictRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowCover)) {
            query.put("allowCover", request.allowCover);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.files)) {
            body.put("files", request.files);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            body.put("sourceType", request.sourceType);
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
            new TeaPair("action", "UpdateDict"),
            new TeaPair("version", "2023-06-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/es-serverless/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/dicts"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDictResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建或更新词典</p>
     * 
     * @param request UpdateDictRequest
     * @return UpdateDictResponse
     */
    public UpdateDictResponse updateDict(String appName, UpdateDictRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDictWithOptions(appName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改端点信息</p>
     * 
     * @param request UpdateEndpointRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEndpointResponse
     */
    public UpdateEndpointResponse updateEndpointWithOptions(String endpointId, UpdateEndpointRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpointZones)) {
            body.put("endpointZones", request.endpointZones);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEndpoint"),
            new TeaPair("version", "2023-06-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/es-serverless/endpoints/" + com.aliyun.openapiutil.Client.getEncodeParam(endpointId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改端点信息</p>
     * 
     * @param request UpdateEndpointRequest
     * @return UpdateEndpointResponse
     */
    public UpdateEndpointResponse updateEndpoint(String endpointId, UpdateEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEndpointWithOptions(endpointId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改应用公网配置。</p>
     * 
     * @param request UpdateNetworkRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNetworkResponse
     */
    public UpdateNetworkResponse updateNetworkWithOptions(String appName, UpdateNetworkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNetwork"),
            new TeaPair("version", "2023-06-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/es-serverless/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/networks"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNetworkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改应用公网配置。</p>
     * 
     * @param request UpdateNetworkRequest
     * @return UpdateNetworkResponse
     */
    public UpdateNetworkResponse updateNetwork(String appName, UpdateNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateNetworkWithOptions(appName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改应用公网信息。</p>
     * 
     * @param request UpdatePrivateNetwrokRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePrivateNetwrokResponse
     */
    public UpdatePrivateNetwrokResponse updatePrivateNetwrokWithOptions(String appName, UpdatePrivateNetwrokRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePrivateNetwrok"),
            new TeaPair("version", "2023-06-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/es-serverless/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/private-networks"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePrivateNetwrokResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改应用公网信息。</p>
     * 
     * @param request UpdatePrivateNetwrokRequest
     * @return UpdatePrivateNetwrokResponse
     */
    public UpdatePrivateNetwrokResponse updatePrivateNetwrok(String appName, UpdatePrivateNetwrokRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePrivateNetwrokWithOptions(appName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改自动备份配置</p>
     * 
     * @param request UpdateSnapshotSettingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSnapshotSettingResponse
     */
    public UpdateSnapshotSettingResponse updateSnapshotSettingWithOptions(String appName, UpdateSnapshotSettingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            body.put("enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quartzRegex)) {
            body.put("quartzRegex", request.quartzRegex);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSnapshotSetting"),
            new TeaPair("version", "2023-06-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/es-serverless/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(appName) + "/auto-snapshot-setting"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSnapshotSettingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改自动备份配置</p>
     * 
     * @param request UpdateSnapshotSettingRequest
     * @return UpdateSnapshotSettingResponse
     */
    public UpdateSnapshotSettingResponse updateSnapshotSetting(String appName, UpdateSnapshotSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSnapshotSettingWithOptions(appName, request, headers, runtime);
    }
}
