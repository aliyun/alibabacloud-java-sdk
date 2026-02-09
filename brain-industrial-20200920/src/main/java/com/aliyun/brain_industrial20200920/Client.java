// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920;

import com.aliyun.tea.*;
import com.aliyun.brain_industrial20200920.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("brain-industrial", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>激活License</p>
     * 
     * @param request ActivateLicenseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ActivateLicenseResponse
     */
    public ActivateLicenseResponse activateLicenseWithOptions(ActivateLicenseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fingerprint)) {
            body.put("Fingerprint", request.fingerprint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("OrderId", request.orderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActivateLicense"),
            new TeaPair("version", "2020-09-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActivateLicenseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>激活License</p>
     * 
     * @param request ActivateLicenseRequest
     * @return ActivateLicenseResponse
     */
    public ActivateLicenseResponse activateLicense(ActivateLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activateLicenseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调用aics openapi</p>
     * 
     * @param tmpReq AicsOpenApiInvokeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AicsOpenApiInvokeResponse
     */
    public AicsOpenApiInvokeResponse aicsOpenApiInvokeWithOptions(AicsOpenApiInvokeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AicsOpenApiInvokeShrinkRequest request = new AicsOpenApiInvokeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.param)) {
            request.paramShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.param, "Param", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paramShrink)) {
            body.put("Param", request.paramShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AicsOpenApiInvoke"),
            new TeaPair("version", "2020-09-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AicsOpenApiInvokeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>调用aics openapi</p>
     * 
     * @param request AicsOpenApiInvokeRequest
     * @return AicsOpenApiInvokeResponse
     */
    public AicsOpenApiInvokeResponse aicsOpenApiInvoke(AicsOpenApiInvokeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.aicsOpenApiInvokeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建储能运行优化任务</p>
     * 
     * @param tmpReq CreateEssOptJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEssOptJobResponse
     */
    public CreateEssOptJobResponse createEssOptJobWithOptions(CreateEssOptJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateEssOptJobShrinkRequest request = new CreateEssOptJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.elecPrice)) {
            request.elecPriceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.elecPrice, "ElecPrice", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.genPrice)) {
            request.genPriceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.genPrice, "GenPrice", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.location)) {
            request.locationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.location, "Location", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.systemData)) {
            request.systemDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.systemData, "SystemData", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessKey)) {
            body.put("BusinessKey", request.businessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            body.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elecPriceShrink)) {
            body.put("ElecPrice", request.elecPriceShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.freq)) {
            body.put("Freq", request.freq);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.genPriceShrink)) {
            body.put("GenPrice", request.genPriceShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationShrink)) {
            body.put("Location", request.locationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelVersion)) {
            body.put("ModelVersion", request.modelVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runDate)) {
            body.put("RunDate", request.runDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDataShrink)) {
            body.put("SystemData", request.systemDataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            body.put("TimeZone", request.timeZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topoType)) {
            body.put("TopoType", request.topoType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEssOptJob"),
            new TeaPair("version", "2020-09-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEssOptJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建储能运行优化任务</p>
     * 
     * @param request CreateEssOptJobRequest
     * @return CreateEssOptJobResponse
     */
    public CreateEssOptJobResponse createEssOptJob(CreateEssOptJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEssOptJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建用电负荷预测任务，历史数据来自文件url</p>
     * 
     * @param request CreateLoadForecastByFileUrlJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLoadForecastByFileUrlJobResponse
     */
    public CreateLoadForecastByFileUrlJobResponse createLoadForecastByFileUrlJobWithOptions(CreateLoadForecastByFileUrlJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessKey)) {
            body.put("BusinessKey", request.businessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataMode)) {
            body.put("DataMode", request.dataMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            body.put("DeviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            body.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forecastHorizon)) {
            body.put("ForecastHorizon", request.forecastHorizon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.freq)) {
            body.put("Freq", request.freq);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.historyUrl)) {
            body.put("HistoryUrl", request.historyUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelVersion)) {
            body.put("ModelVersion", request.modelVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runDate)) {
            body.put("RunDate", request.runDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemType)) {
            body.put("SystemType", request.systemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeColumn)) {
            body.put("TimeColumn", request.timeColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            body.put("TimeZone", request.timeZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.valueColumn)) {
            body.put("ValueColumn", request.valueColumn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLoadForecastByFileUrlJob"),
            new TeaPair("version", "2020-09-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLoadForecastByFileUrlJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建用电负荷预测任务，历史数据来自文件url</p>
     * 
     * @param request CreateLoadForecastByFileUrlJobRequest
     * @return CreateLoadForecastByFileUrlJobResponse
     */
    public CreateLoadForecastByFileUrlJobResponse createLoadForecastByFileUrlJob(CreateLoadForecastByFileUrlJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLoadForecastByFileUrlJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建用电负荷预测任务</p>
     * 
     * @param tmpReq CreateLoadForecastJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLoadForecastJobResponse
     */
    public CreateLoadForecastJobResponse createLoadForecastJobWithOptions(CreateLoadForecastJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateLoadForecastJobShrinkRequest request = new CreateLoadForecastJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.historyData)) {
            request.historyDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.historyData, "HistoryData", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessKey)) {
            body.put("BusinessKey", request.businessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataMode)) {
            body.put("DataMode", request.dataMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            body.put("DeviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            body.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forecastHorizon)) {
            body.put("ForecastHorizon", request.forecastHorizon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.freq)) {
            body.put("Freq", request.freq);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.historyDataShrink)) {
            body.put("HistoryData", request.historyDataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelVersion)) {
            body.put("ModelVersion", request.modelVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runDate)) {
            body.put("RunDate", request.runDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemType)) {
            body.put("SystemType", request.systemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            body.put("TimeZone", request.timeZone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLoadForecastJob"),
            new TeaPair("version", "2020-09-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLoadForecastJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建用电负荷预测任务</p>
     * 
     * @param request CreateLoadForecastJobRequest
     * @return CreateLoadForecastJobResponse
     */
    public CreateLoadForecastJobResponse createLoadForecastJob(CreateLoadForecastJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLoadForecastJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建发电功率预测任务，历史数据来自文件url</p>
     * 
     * @param tmpReq CreatePowerForecastByFileUrlJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePowerForecastByFileUrlJobResponse
     */
    public CreatePowerForecastByFileUrlJobResponse createPowerForecastByFileUrlJobWithOptions(CreatePowerForecastByFileUrlJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePowerForecastByFileUrlJobShrinkRequest request = new CreatePowerForecastByFileUrlJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.location)) {
            request.locationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.location, "Location", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessKey)) {
            body.put("BusinessKey", request.businessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataMode)) {
            body.put("DataMode", request.dataMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            body.put("DeviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            body.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forecastHorizon)) {
            body.put("ForecastHorizon", request.forecastHorizon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.freq)) {
            body.put("Freq", request.freq);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.historyUrl)) {
            body.put("HistoryUrl", request.historyUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationShrink)) {
            body.put("Location", request.locationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelVersion)) {
            body.put("ModelVersion", request.modelVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runDate)) {
            body.put("RunDate", request.runDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemType)) {
            body.put("SystemType", request.systemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeColumn)) {
            body.put("TimeColumn", request.timeColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            body.put("TimeZone", request.timeZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.valueColumn)) {
            body.put("ValueColumn", request.valueColumn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePowerForecastByFileUrlJob"),
            new TeaPair("version", "2020-09-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePowerForecastByFileUrlJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建发电功率预测任务，历史数据来自文件url</p>
     * 
     * @param request CreatePowerForecastByFileUrlJobRequest
     * @return CreatePowerForecastByFileUrlJobResponse
     */
    public CreatePowerForecastByFileUrlJobResponse createPowerForecastByFileUrlJob(CreatePowerForecastByFileUrlJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPowerForecastByFileUrlJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建发电功率预测任务</p>
     * 
     * @param tmpReq CreatePowerForecastJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePowerForecastJobResponse
     */
    public CreatePowerForecastJobResponse createPowerForecastJobWithOptions(CreatePowerForecastJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePowerForecastJobShrinkRequest request = new CreatePowerForecastJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.historyData)) {
            request.historyDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.historyData, "HistoryData", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.location)) {
            request.locationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.location, "Location", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessKey)) {
            body.put("BusinessKey", request.businessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataMode)) {
            body.put("DataMode", request.dataMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            body.put("DeviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            body.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forecastHorizon)) {
            body.put("ForecastHorizon", request.forecastHorizon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.freq)) {
            body.put("Freq", request.freq);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.historyDataShrink)) {
            body.put("HistoryData", request.historyDataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationShrink)) {
            body.put("Location", request.locationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelVersion)) {
            body.put("ModelVersion", request.modelVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runDate)) {
            body.put("RunDate", request.runDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemType)) {
            body.put("SystemType", request.systemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            body.put("TimeZone", request.timeZone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePowerForecastJob"),
            new TeaPair("version", "2020-09-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePowerForecastJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建发电功率预测任务</p>
     * 
     * @param request CreatePowerForecastJobRequest
     * @return CreatePowerForecastJobResponse
     */
    public CreatePowerForecastJobResponse createPowerForecastJob(CreatePowerForecastJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPowerForecastJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询aivpp算法job</p>
     * 
     * @param request GetAivppAlgoJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAivppAlgoJobResponse
     */
    public GetAivppAlgoJobResponse getAivppAlgoJobWithOptions(GetAivppAlgoJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAivppAlgoJob"),
            new TeaPair("version", "2020-09-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAivppAlgoJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询aivpp算法job</p>
     * 
     * @param request GetAivppAlgoJobRequest
     * @return GetAivppAlgoJobResponse
     */
    public GetAivppAlgoJobResponse getAivppAlgoJob(GetAivppAlgoJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAivppAlgoJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>License详情</p>
     * 
     * @param request GetLicenseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLicenseResponse
     */
    public GetLicenseResponse getLicenseWithOptions(GetLicenseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLicense"),
            new TeaPair("version", "2020-09-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLicenseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>License详情</p>
     * 
     * @param request GetLicenseRequest
     * @return GetLicenseResponse
     */
    public GetLicenseResponse getLicense(GetLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLicenseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户AIVPP资源列表</p>
     * 
     * @param request ListAivppResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAivppResourcesResponse
     */
    public ListAivppResourcesResponse listAivppResourcesWithOptions(ListAivppResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAivppResources"),
            new TeaPair("version", "2020-09-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAivppResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户AIVPP资源列表</p>
     * 
     * @param request ListAivppResourcesRequest
     * @return ListAivppResourcesResponse
     */
    public ListAivppResourcesResponse listAivppResources(ListAivppResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAivppResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>License列表</p>
     * 
     * @param request ListLicensesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLicensesResponse
     */
    public ListLicensesResponse listLicensesWithOptions(ListLicensesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryStr)) {
            body.put("QueryStr", request.queryStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLicenses"),
            new TeaPair("version", "2020-09-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLicensesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>License列表</p>
     * 
     * @param request ListLicensesRequest
     * @return ListLicensesResponse
     */
    public ListLicensesResponse listLicenses(ListLicensesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLicensesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户资源列表</p>
     * 
     * @param request ListUserResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserResourcesResponse
     */
    public ListUserResourcesResponse listUserResourcesWithOptions(ListUserResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            body.put("CommodityCode", request.commodityCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserResources"),
            new TeaPair("version", "2020-09-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户资源列表</p>
     * 
     * @param request ListUserResourcesRequest
     * @return ListUserResourcesResponse
     */
    public ListUserResourcesResponse listUserResources(ListUserResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新license描述</p>
     * 
     * @param request UpdateLicenseDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLicenseDescriptionResponse
     */
    public UpdateLicenseDescriptionResponse updateLicenseDescriptionWithOptions(UpdateLicenseDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLicenseDescription"),
            new TeaPair("version", "2020-09-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLicenseDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新license描述</p>
     * 
     * @param request UpdateLicenseDescriptionRequest
     * @return UpdateLicenseDescriptionResponse
     */
    public UpdateLicenseDescriptionResponse updateLicenseDescription(UpdateLicenseDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLicenseDescriptionWithOptions(request, runtime);
    }
}
