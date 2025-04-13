// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20200824;

import com.aliyun.tea.*;
import com.aliyun.et_industry_openapi20200824.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "et-industry.cn-hangzhou.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("et-industry-openapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @param request GetMqttConnectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMqttConnectResponse
     */
    public GetMqttConnectResponse getMqttConnectWithOptions(GetMqttConnectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.request)) {
            body.put("Request", request.request);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMqttConnect"),
            new TeaPair("version", "2020-08-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/igate/collaboration/pop/getmqttconnect"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetMqttConnectResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetMqttConnectResponse());
        }

    }

    /**
     * @param request GetMqttConnectRequest
     * @return GetMqttConnectResponse
     */
    public GetMqttConnectResponse getMqttConnect(GetMqttConnectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMqttConnectWithOptions(request, headers, runtime);
    }

    /**
     * @param request GetNonceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNonceResponse
     */
    public GetNonceResponse getNonceWithOptions(GetNonceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.request)) {
            body.put("Request", request.request);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNonce"),
            new TeaPair("version", "2020-08-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/igate/collaboration/pop/getnonce"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetNonceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetNonceResponse());
        }

    }

    /**
     * @param request GetNonceRequest
     * @return GetNonceResponse
     */
    public GetNonceResponse getNonce(GetNonceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getNonceWithOptions(request, headers, runtime);
    }

    /**
     * @param request ListMeasurePointListByNodeCodePageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMeasurePointListByNodeCodePageResponse
     */
    public ListMeasurePointListByNodeCodePageResponse listMeasurePointListByNodeCodePageWithOptions(ListMeasurePointListByNodeCodePageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.request)) {
            body.put("Request", request.request);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMeasurePointListByNodeCodePage"),
            new TeaPair("version", "2020-08-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/igate/node/pop/measurepointlistbynodecodepage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListMeasurePointListByNodeCodePageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListMeasurePointListByNodeCodePageResponse());
        }

    }

    /**
     * @param request ListMeasurePointListByNodeCodePageRequest
     * @return ListMeasurePointListByNodeCodePageResponse
     */
    public ListMeasurePointListByNodeCodePageResponse listMeasurePointListByNodeCodePage(ListMeasurePointListByNodeCodePageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMeasurePointListByNodeCodePageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>多值批量上报</p>
     * 
     * @param request MultiFieldBatchUploadRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return MultiFieldBatchUploadResponse
     */
    public MultiFieldBatchUploadResponse multiFieldBatchUploadWithOptions(MultiFieldBatchUploadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "MultiFieldBatchUpload"),
            new TeaPair("version", "2020-08-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/igate/timeseries/upload/pop/multifieldbatchv2"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new MultiFieldBatchUploadResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new MultiFieldBatchUploadResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>多值批量上报</p>
     * 
     * @param request MultiFieldBatchUploadRequest
     * @return MultiFieldBatchUploadResponse
     */
    public MultiFieldBatchUploadResponse multiFieldBatchUpload(MultiFieldBatchUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.multiFieldBatchUploadWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>多源点位批量上报</p>
     * 
     * @param request MultiSourcePointBatchUploadRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return MultiSourcePointBatchUploadResponse
     */
    public MultiSourcePointBatchUploadResponse multiSourcePointBatchUploadWithOptions(MultiSourcePointBatchUploadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "MultiSourcePointBatchUpload"),
            new TeaPair("version", "2020-08-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/igate/timeseries/upload/pop/sourcepointbatchv2"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new MultiSourcePointBatchUploadResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new MultiSourcePointBatchUploadResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>多源点位批量上报</p>
     * 
     * @param request MultiSourcePointBatchUploadRequest
     * @return MultiSourcePointBatchUploadResponse
     */
    public MultiSourcePointBatchUploadResponse multiSourcePointBatchUpload(MultiSourcePointBatchUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.multiSourcePointBatchUploadWithOptions(request, headers, runtime);
    }

    /**
     * @param request QueryFieldLatestBySourcePointRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryFieldLatestBySourcePointResponse
     */
    public QueryFieldLatestBySourcePointResponse queryFieldLatestBySourcePointWithOptions(QueryFieldLatestBySourcePointRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.request)) {
            body.put("Request", request.request);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFieldLatestBySourcePoint"),
            new TeaPair("version", "2020-08-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/igate/timeseries/query/pop/multifieldlatestbysourcepoint"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFieldLatestBySourcePointResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new QueryFieldLatestBySourcePointResponse());
        }

    }

    /**
     * @param request QueryFieldLatestBySourcePointRequest
     * @return QueryFieldLatestBySourcePointResponse
     */
    public QueryFieldLatestBySourcePointResponse queryFieldLatestBySourcePoint(QueryFieldLatestBySourcePointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFieldLatestBySourcePointWithOptions(request, headers, runtime);
    }

    /**
     * @param request QueryIndustryDeviceDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryIndustryDeviceDataResponse
     */
    public QueryIndustryDeviceDataResponse queryIndustryDeviceDataWithOptions(QueryIndustryDeviceDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.request)) {
            body.put("Request", request.request);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryIndustryDeviceData"),
            new TeaPair("version", "2020-08-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/igate/timeseries/query/pop/multifieldlatest"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new QueryIndustryDeviceDataResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new QueryIndustryDeviceDataResponse());
        }

    }

    /**
     * @param request QueryIndustryDeviceDataRequest
     * @return QueryIndustryDeviceDataResponse
     */
    public QueryIndustryDeviceDataResponse queryIndustryDeviceData(QueryIndustryDeviceDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIndustryDeviceDataWithOptions(request, headers, runtime);
    }

    /**
     * @param request QueryIndustryDeviceLimitsDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryIndustryDeviceLimitsDataResponse
     */
    public QueryIndustryDeviceLimitsDataResponse queryIndustryDeviceLimitsDataWithOptions(QueryIndustryDeviceLimitsDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.request)) {
            body.put("Request", request.request);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryIndustryDeviceLimitsData"),
            new TeaPair("version", "2020-08-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/igate/timeseries/query/pop/multifieldrange"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new QueryIndustryDeviceLimitsDataResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new QueryIndustryDeviceLimitsDataResponse());
        }

    }

    /**
     * @param request QueryIndustryDeviceLimitsDataRequest
     * @return QueryIndustryDeviceLimitsDataResponse
     */
    public QueryIndustryDeviceLimitsDataResponse queryIndustryDeviceLimitsData(QueryIndustryDeviceLimitsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIndustryDeviceLimitsDataWithOptions(request, headers, runtime);
    }

    /**
     * @param request QueryIndustryDeviceStatusDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryIndustryDeviceStatusDataResponse
     */
    public QueryIndustryDeviceStatusDataResponse queryIndustryDeviceStatusDataWithOptions(QueryIndustryDeviceStatusDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.request)) {
            body.put("Request", request.request);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryIndustryDeviceStatusData"),
            new TeaPair("version", "2020-08-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/igate/timeseries/query/pop/multifieldrangestatus"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new QueryIndustryDeviceStatusDataResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new QueryIndustryDeviceStatusDataResponse());
        }

    }

    /**
     * @param request QueryIndustryDeviceStatusDataRequest
     * @return QueryIndustryDeviceStatusDataResponse
     */
    public QueryIndustryDeviceStatusDataResponse queryIndustryDeviceStatusData(QueryIndustryDeviceStatusDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIndustryDeviceStatusDataWithOptions(request, headers, runtime);
    }

    /**
     * @param request SourcePointBatchRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SourcePointBatchResponse
     */
    public SourcePointBatchResponse sourcePointBatchWithOptions(SourcePointBatchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.request)) {
            body.put("Request", request.request);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SourcePointBatch"),
            new TeaPair("version", "2020-08-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/igate/timeseries/upload/pop/sourcepointbatch"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SourcePointBatchResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SourcePointBatchResponse());
        }

    }

    /**
     * @param request SourcePointBatchRequest
     * @return SourcePointBatchResponse
     */
    public SourcePointBatchResponse sourcePointBatch(SourcePointBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sourcePointBatchWithOptions(request, headers, runtime);
    }

    /**
     * @param request UploadIndustryDeviceDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadIndustryDeviceDataResponse
     */
    public UploadIndustryDeviceDataResponse uploadIndustryDeviceDataWithOptions(UploadIndustryDeviceDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.request)) {
            body.put("Request", request.request);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadIndustryDeviceData"),
            new TeaPair("version", "2020-08-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/igate/timeseries/upload/pop/multifieldbatch"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UploadIndustryDeviceDataResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UploadIndustryDeviceDataResponse());
        }

    }

    /**
     * @param request UploadIndustryDeviceDataRequest
     * @return UploadIndustryDeviceDataResponse
     */
    public UploadIndustryDeviceDataResponse uploadIndustryDeviceData(UploadIndustryDeviceDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadIndustryDeviceDataWithOptions(request, headers, runtime);
    }
}
