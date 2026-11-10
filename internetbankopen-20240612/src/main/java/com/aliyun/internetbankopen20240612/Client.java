// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.internetbankopen20240612;

import com.aliyun.tea.*;
import com.aliyun.internetbankopen20240612.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "InternetBankOpen";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("internetbankopen", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>数据产品统一调用入口</p>
     * 
     * @param request InvokeDataProductRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InvokeDataProductResponse
     */
    public InvokeDataProductResponse invokeDataProductWithOptions(InvokeDataProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("productCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            query.put("serviceParameters", request.serviceParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvokeDataProduct"),
            new TeaPair("version", "2024-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/api/v1/rpc"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvokeDataProductResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>数据产品统一调用入口</p>
     * 
     * @param request InvokeDataProductRequest
     * @return InvokeDataProductResponse
     */
    public InvokeDataProductResponse invokeDataProduct(InvokeDataProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.invokeDataProductWithOptions(request, headers, runtime);
    }
}
