// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bsn20150512;

import com.aliyun.tea.*;
import com.aliyun.bsn20150512.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("bsn", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @param request GetBsnByResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBsnByResourceResponse
     */
    public GetBsnByResourceResponse getBsnByResourceWithOptions(GetBsnByResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliuid)) {
            query.put("aliuid", request.aliuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("resourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBsnByResource"),
            new TeaPair("version", "2015-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBsnByResourceResponse());
    }

    /**
     * @param request GetBsnByResourceRequest
     * @return GetBsnByResourceResponse
     */
    public GetBsnByResourceResponse getBsnByResource(GetBsnByResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBsnByResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>授权服务码，供虚商使用</p>
     * 
     * @param request GrantBsnCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantBsnCodeResponse
     */
    public GrantBsnCodeResponse grantBsnCodeWithOptions(GrantBsnCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            query.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantToAliuid)) {
            query.put("GrantToAliuid", request.grantToAliuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notes)) {
            query.put("Notes", request.notes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sn)) {
            query.put("Sn", request.sn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantBsnCode"),
            new TeaPair("version", "2015-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantBsnCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>授权服务码，供虚商使用</p>
     * 
     * @param request GrantBsnCodeRequest
     * @return GrantBsnCodeResponse
     */
    public GrantBsnCodeResponse grantBsnCode(GrantBsnCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantBsnCodeWithOptions(request, runtime);
    }

    /**
     * @param request ProductBindBsnRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ProductBindBsnResponse
     */
    public ProductBindBsnResponse productBindBsnWithOptions(ProductBindBsnRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliuid)) {
            query.put("aliuid", request.aliuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            query.put("num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("resourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProductBindBsn"),
            new TeaPair("version", "2015-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProductBindBsnResponse());
    }

    /**
     * @param request ProductBindBsnRequest
     * @return ProductBindBsnResponse
     */
    public ProductBindBsnResponse productBindBsn(ProductBindBsnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.productBindBsnWithOptions(request, runtime);
    }
}
