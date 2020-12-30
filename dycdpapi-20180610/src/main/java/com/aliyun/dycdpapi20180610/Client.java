// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dycdpapi20180610;

import com.aliyun.tea.*;
import com.aliyun.dycdpapi20180610.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dycdpapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public QueryCdpOfferResponse queryCdpOfferWithOptions(QueryCdpOfferRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryCdpOffer", "2018-06-10", "HTTPS", "POST", "AK", "json", req, runtime), new QueryCdpOfferResponse());
    }

    public QueryCdpOfferResponse queryCdpOffer(QueryCdpOfferRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCdpOfferWithOptions(request, runtime);
    }

    public QueryCdpOfferByIdResponse queryCdpOfferByIdWithOptions(QueryCdpOfferByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryCdpOfferById", "2018-06-10", "HTTPS", "POST", "AK", "json", req, runtime), new QueryCdpOfferByIdResponse());
    }

    public QueryCdpOfferByIdResponse queryCdpOfferById(QueryCdpOfferByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCdpOfferByIdWithOptions(request, runtime);
    }

    public QueryCdpOrderResponse queryCdpOrderWithOptions(QueryCdpOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryCdpOrder", "2018-06-10", "HTTPS", "POST", "AK", "json", req, runtime), new QueryCdpOrderResponse());
    }

    public QueryCdpOrderResponse queryCdpOrder(QueryCdpOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCdpOrderWithOptions(request, runtime);
    }
}
