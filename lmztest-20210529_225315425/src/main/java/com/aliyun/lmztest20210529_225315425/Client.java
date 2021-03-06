// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20210529_225315425;

import com.aliyun.tea.*;
import com.aliyun.lmztest20210529_225315425.models.*;
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
        this._endpoint = this.getEndpoint("lmztest", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public BundleOpenAPiResponse bundleOpenAPiWithOptions(BundleOpenAPiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BundleOpenAPi", "2021-05-29_22-53-15-425", "HTTPS", "POST", "AK", "json", req, runtime), new BundleOpenAPiResponse());
    }

    public BundleOpenAPiResponse bundleOpenAPi(BundleOpenAPiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bundleOpenAPiWithOptions(request, runtime);
    }
}
