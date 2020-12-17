// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.databot20200330;

import com.aliyun.tea.*;
import com.aliyun.databot20200330.models.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("databot", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public QueryDatabotResponse queryDatabotWithOptions(QueryDatabotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDatabot", "HTTPS", "POST", "2020-03-30", "AK", null, TeaModel.buildMap(request), runtime), new QueryDatabotResponse());
    }

    public QueryDatabotResponse queryDatabot(QueryDatabotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDatabotWithOptions(request, runtime);
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
}
