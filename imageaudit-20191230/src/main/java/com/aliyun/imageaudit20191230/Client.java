// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageaudit20191230;

import com.aliyun.tea.*;
import com.aliyun.imageaudit20191230.models.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("imageaudit", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public ScanTextResponse scanTextWithOptions(ScanTextRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ScanText", "HTTPS", "POST", "2019-12-30", "AK", null, TeaModel.buildMap(request), runtime), new ScanTextResponse());
    }

    public ScanTextResponse scanText(ScanTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.scanTextWithOptions(request, runtime);
    }

    public ScanImageResponse scanImageWithOptions(ScanImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ScanImage", "HTTPS", "POST", "2019-12-30", "AK", null, TeaModel.buildMap(request), runtime), new ScanImageResponse());
    }

    public ScanImageResponse scanImage(ScanImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.scanImageWithOptions(request, runtime);
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
