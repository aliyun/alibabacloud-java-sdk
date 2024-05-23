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
     * @summary 创建Serverless应用
     *
     * @param request CreateAppRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppResponse
     */
    public CreateAppResponse createAppWithOptions(CreateAppRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
     * @summary 创建Serverless应用
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
     * @summary 创建端点
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
     * @summary 创建端点
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
     * @summary 删除Serverless应用。
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
     * @summary 删除Serverless应用。
     *
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteApp(String appName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAppWithOptions(appName, headers, runtime);
    }

    /**
     * @summary 获取Serverless应用详情
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
     * @summary 获取Serverless应用详情
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
     * @summary 获取Serverless应用配额详情
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
     * @summary 获取Serverless应用配额详情
     *
     * @return GetAppQuotaResponse
     */
    public GetAppQuotaResponse getAppQuota(String appName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppQuotaWithOptions(appName, headers, runtime);
    }

    /**
     * @summary 获取监控数据
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
     * @summary 获取监控数据
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
     * @summary 查看Serverless应用列表
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
     * @summary 查看Serverless应用列表
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
     * @summary 编辑Serverless应用
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
     * @summary 编辑Serverless应用
     *
     * @param request UpdateAppRequest
     * @return UpdateAppResponse
     */
    public UpdateAppResponse updateApp(String appName, UpdateAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAppWithOptions(appName, request, headers, runtime);
    }
}
