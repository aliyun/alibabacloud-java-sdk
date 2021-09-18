// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agraphservice20210914;

import com.aliyun.tea.*;
import com.aliyun.agraphservice20210914.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("agraphservice", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public SgVpcSearchServicePreResponse sgVpcSearchServicePreWithOptions(SgVpcSearchServicePreRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("SgVpcSearchServicePre", "2021-09-14", "HTTPS", "GET", "AK", "json", req, runtime), new SgVpcSearchServicePreResponse());
    }

    public SgVpcSearchServicePreResponse sgVpcSearchServicePre(SgVpcSearchServicePreRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sgVpcSearchServicePreWithOptions(request, runtime);
    }

    public SearchSgVpcGraphServiceResponse searchSgVpcGraphServiceWithOptions(SearchSgVpcGraphServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchSgVpcGraphService", "2021-09-14", "HTTPS", "GET", "AK", "json", req, runtime), new SearchSgVpcGraphServiceResponse());
    }

    public SearchSgVpcGraphServiceResponse searchSgVpcGraphService(SearchSgVpcGraphServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchSgVpcGraphServiceWithOptions(request, runtime);
    }
}
