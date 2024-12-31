// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bss20140714;

import com.aliyun.tea.*;
import com.aliyun.bss20140714.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("bss", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @param request CreateOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrderResponse
     */
    public CreateOrderResponse createOrderWithOptions(CreateOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paramStr)) {
            query.put("paramStr", request.paramStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrder"),
            new TeaPair("version", "2014-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrderResponse());
    }

    /**
     * @param request CreateOrderRequest
     * @return CreateOrderResponse
     */
    public CreateOrderResponse createOrder(CreateOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取现金明细</p>
     * 
     * @param request DescribeCashDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCashDetailResponse
     */
    public DescribeCashDetailResponse describeCashDetailWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCashDetail"),
            new TeaPair("version", "2014-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCashDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取现金明细</p>
     * @return DescribeCashDetailResponse
     */
    public DescribeCashDetailResponse describeCashDetail() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCashDetailWithOptions(runtime);
    }

    /**
     * @param request DescribeCouponListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCouponListResponse
     */
    public DescribeCouponListResponse describeCouponListWithOptions(DescribeCouponListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDeliveryTime)) {
            query.put("EndDeliveryTime", request.endDeliveryTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDeliveryTime)) {
            query.put("StartDeliveryTime", request.startDeliveryTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCouponList"),
            new TeaPair("version", "2014-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCouponListResponse());
    }

    /**
     * @param request DescribeCouponListRequest
     * @return DescribeCouponListResponse
     */
    public DescribeCouponListResponse describeCouponList(DescribeCouponListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCouponListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>OpenCallback</p>
     * 
     * @param request OpenCallbackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenCallbackResponse
     */
    public OpenCallbackResponse openCallbackWithOptions(OpenCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paramStr)) {
            query.put("paramStr", request.paramStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenCallback"),
            new TeaPair("version", "2014-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenCallbackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>OpenCallback</p>
     * 
     * @param request OpenCallbackRequest
     * @return OpenCallbackResponse
     */
    public OpenCallbackResponse openCallback(OpenCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openCallbackWithOptions(request, runtime);
    }

    /**
     * @param request QueryForCssOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryForCssOrderResponse
     */
    public QueryForCssOrderResponse queryForCssOrderWithOptions(QueryForCssOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paramStr)) {
            query.put("paramStr", request.paramStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryForCssOrder"),
            new TeaPair("version", "2014-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryForCssOrderResponse());
    }

    /**
     * @param request QueryForCssOrderRequest
     * @return QueryForCssOrderResponse
     */
    public QueryForCssOrderResponse queryForCssOrder(QueryForCssOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryForCssOrderWithOptions(request, runtime);
    }

    /**
     * @param request VnoBatchRefundOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VnoBatchRefundOrderResponse
     */
    public VnoBatchRefundOrderResponse vnoBatchRefundOrderWithOptions(VnoBatchRefundOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paramStr)) {
            query.put("paramStr", request.paramStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "vnoBatchRefundOrder"),
            new TeaPair("version", "2014-07-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VnoBatchRefundOrderResponse());
    }

    /**
     * @param request VnoBatchRefundOrderRequest
     * @return VnoBatchRefundOrderResponse
     */
    public VnoBatchRefundOrderResponse vnoBatchRefundOrder(VnoBatchRefundOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.vnoBatchRefundOrderWithOptions(request, runtime);
    }
}
