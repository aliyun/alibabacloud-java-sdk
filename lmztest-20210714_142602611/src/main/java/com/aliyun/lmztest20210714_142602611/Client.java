// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20210714_142602611;

import com.aliyun.tea.*;
import com.aliyun.lmztest20210714_142602611.models.*;
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

    public CaiheApiResponse caiheApiWithOptions(CaiheApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CaiheApi", "2021-07-14_14-26-02-611", "HTTPS", "POST", "AK", "json", req, runtime), new CaiheApiResponse());
    }

    public CaiheApiResponse caiheApi(CaiheApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.caiheApiWithOptions(request, runtime);
    }

    public OpenApiBResponse openApiBWithOptions(OpenApiBRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OpenApiB", "2021-07-14_14-26-02-611", "HTTPS", "POST", "AK", "json", req, runtime), new OpenApiBResponse());
    }

    public OpenApiBResponse openApiB(OpenApiBRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openApiBWithOptions(request, runtime);
    }

    public ActionApiResponse actionApiWithOptions(ActionApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ActionApi", "2021-07-14_14-26-02-611", "HTTPS", "POST", "AK", "json", req, runtime), new ActionApiResponse());
    }

    public ActionApiResponse actionApi(ActionApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.actionApiWithOptions(request, runtime);
    }

    public AssetInfoTestResponse assetInfoTestWithOptions(AssetInfoTestRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssetInfoTest", "2021-07-14_14-26-02-611", "HTTPS", "POST", "AK", "json", req, runtime), new AssetInfoTestResponse());
    }

    public AssetInfoTestResponse assetInfoTest(AssetInfoTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.assetInfoTestWithOptions(request, runtime);
    }
}
