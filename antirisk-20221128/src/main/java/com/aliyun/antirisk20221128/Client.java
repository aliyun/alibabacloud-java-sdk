// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antirisk20221128;

import com.aliyun.tea.*;
import com.aliyun.antirisk20221128.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("antirisk", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @summary 获取实时反作弊信息
     *
     * @param request GetRealTimeRiskInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRealTimeRiskInfoResponse
     */
    public GetRealTimeRiskInfoResponse getRealTimeRiskInfoWithOptions(GetRealTimeRiskInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.atoken)) {
            query.put("atoken", request.atoken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("dataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extra)) {
            query.put("extra", request.extra);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRealTimeRiskInfo"),
            new TeaPair("version", "2022-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/anti/getRealTimeRiskInfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRealTimeRiskInfoResponse());
    }

    /**
     * @summary 获取实时反作弊信息
     *
     * @param request GetRealTimeRiskInfoRequest
     * @return GetRealTimeRiskInfoResponse
     */
    public GetRealTimeRiskInfoResponse getRealTimeRiskInfo(GetRealTimeRiskInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRealTimeRiskInfoWithOptions(request, headers, runtime);
    }

    /**
     * @summary atoken换zid+tags
     *
     * @param request GetZidTagByAtokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetZidTagByAtokenResponse
     */
    public GetZidTagByAtokenResponse getZidTagByAtokenWithOptions(GetZidTagByAtokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.atoken)) {
            query.put("atoken", request.atoken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("dataSourceId", request.dataSourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetZidTagByAtoken"),
            new TeaPair("version", "2022-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/anti/getZidTagByAtoken"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetZidTagByAtokenResponse());
    }

    /**
     * @summary atoken换zid+tags
     *
     * @param request GetZidTagByAtokenRequest
     * @return GetZidTagByAtokenResponse
     */
    public GetZidTagByAtokenResponse getZidTagByAtoken(GetZidTagByAtokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getZidTagByAtokenWithOptions(request, headers, runtime);
    }

    /**
     * @summary atoken换zid+tags+风险分
     *
     * @param request GetZidTagScoreByAtokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetZidTagScoreByAtokenResponse
     */
    public GetZidTagScoreByAtokenResponse getZidTagScoreByAtokenWithOptions(GetZidTagScoreByAtokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.atoken)) {
            query.put("atoken", request.atoken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("dataSourceId", request.dataSourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetZidTagScoreByAtoken"),
            new TeaPair("version", "2022-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/anti/getZidTagScoreByAtoken"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetZidTagScoreByAtokenResponse());
    }

    /**
     * @summary atoken换zid+tags+风险分
     *
     * @param request GetZidTagScoreByAtokenRequest
     * @return GetZidTagScoreByAtokenResponse
     */
    public GetZidTagScoreByAtokenResponse getZidTagScoreByAtoken(GetZidTagScoreByAtokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getZidTagScoreByAtokenWithOptions(request, headers, runtime);
    }

    /**
     * @summary  渠道风险明细
     *
     * @param request ListChannelRiskDetailsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListChannelRiskDetailsResponse
     */
    public ListChannelRiskDetailsResponse listChannelRiskDetailsWithOptions(ListChannelRiskDetailsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("dataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("end", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAllChannel)) {
            query.put("isAllChannel", request.isAllChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChannelRiskDetails"),
            new TeaPair("version", "2022-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/anti/listChannelRiskDetails"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChannelRiskDetailsResponse());
    }

    /**
     * @summary  渠道风险明细
     *
     * @param request ListChannelRiskDetailsRequest
     * @return ListChannelRiskDetailsResponse
     */
    public ListChannelRiskDetailsResponse listChannelRiskDetails(ListChannelRiskDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listChannelRiskDetailsWithOptions(request, headers, runtime);
    }

    /**
     * @summary 卸载明细列表
     *
     * @param request ListUninstallDetailRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUninstallDetailResponse
     */
    public ListUninstallDetailResponse listUninstallDetailWithOptions(ListUninstallDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("dataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDs)) {
            query.put("endDs", request.endDs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDs)) {
            query.put("startDs", request.startDs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUninstallDetail"),
            new TeaPair("version", "2022-11-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/uninstall/listUninstallDetail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUninstallDetailResponse());
    }

    /**
     * @summary 卸载明细列表
     *
     * @param request ListUninstallDetailRequest
     * @return ListUninstallDetailResponse
     */
    public ListUninstallDetailResponse listUninstallDetail(ListUninstallDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUninstallDetailWithOptions(request, headers, runtime);
    }
}
