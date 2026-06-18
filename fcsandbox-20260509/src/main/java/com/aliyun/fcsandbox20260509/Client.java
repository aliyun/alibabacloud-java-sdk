// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509;

import com.aliyun.tea.*;
import com.aliyun.fcsandbox20260509.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("fcsandbox", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>删除 quota 配置</p>
     * 
     * @param request DeleteQuotaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteQuotaResponse
     */
    public DeleteQuotaResponse deleteQuotaWithOptions(DeleteQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagValue)) {
            query.put("tagValue", request.tagValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteQuota"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/quotas/tag"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除 quota 配置</p>
     * 
     * @param request DeleteQuotaRequest
     * @return DeleteQuotaResponse
     */
    public DeleteQuotaResponse deleteQuota(DeleteQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteQuotaWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取 quota 配置</p>
     * 
     * @param request DescribeQuotaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeQuotaResponse
     */
    public DescribeQuotaResponse describeQuotaWithOptions(DescribeQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagValue)) {
            query.put("tagValue", request.tagValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeQuota"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/quotas/tag"),
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
     * <p>获取 quota 配置</p>
     * 
     * @param request DescribeQuotaRequest
     * @return DescribeQuotaResponse
     */
    public DescribeQuotaResponse describeQuota(DescribeQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeQuotaWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询 quota 配置</p>
     * 
     * @param request ListQuotaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQuotaResponse
     */
    public ListQuotaResponse listQuotaWithOptions(ListQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQuota"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/quotas"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询 quota 配置</p>
     * 
     * @param request ListQuotaRequest
     * @return ListQuotaResponse
     */
    public ListQuotaResponse listQuota(ListQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQuotaWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新 quota 配置</p>
     * 
     * @param request UpdateQuotaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateQuotaResponse
     */
    public UpdateQuotaResponse updateQuotaWithOptions(UpdateQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateQuota"),
            new TeaPair("version", "2026-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/2026-05-09/quotas/tag"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新 quota 配置</p>
     * 
     * @param request UpdateQuotaRequest
     * @return UpdateQuotaResponse
     */
    public UpdateQuotaResponse updateQuota(UpdateQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateQuotaWithOptions(request, headers, runtime);
    }
}
