// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_114952485;

import com.aliyun.tea.*;
import com.aliyun.nbf20210701_114952485.models.*;
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
        this._endpoint = this.getEndpoint("nbf", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ApidasResponse apidasWithOptions(ApidasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("Apidas", "2021-07-01_11-49-52-485", "HTTPS", "POST", "AK", "json", req, runtime), new ApidasResponse());
    }

    public ApidasResponse apidas(ApidasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.apidasWithOptions(request, runtime);
    }

    public TestAOpenResponse testAOpenWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("TestAOpen", "2021-07-01_11-49-52-485", "HTTPS", "POST", "AK", "json", req, runtime), new TestAOpenResponse());
    }

    public TestAOpenResponse testAOpen() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.testAOpenWithOptions(runtime);
    }

    public TestOneResponse testOneWithOptions(TestOneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TestOne", "2021-07-01_11-49-52-485", "HTTPS", "POST", "AK", "json", req, runtime), new TestOneResponse());
    }

    public TestOneResponse testOne(TestOneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.testOneWithOptions(request, runtime);
    }

    public TestTwoResponse testTwoWithOptions(TestTwoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TestTwo", "2021-07-01_11-49-52-485", "HTTPS", "POST", "AK", "json", req, runtime), new TestTwoResponse());
    }

    public TestTwoResponse testTwo(TestTwoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.testTwoWithOptions(request, runtime);
    }

    public ReleaseStatusTestResponse releaseStatusTestWithOptions(ReleaseStatusTestRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseStatusTest", "2021-07-01_11-49-52-485", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseStatusTestResponse());
    }

    public ReleaseStatusTestResponse releaseStatusTest(ReleaseStatusTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseStatusTestWithOptions(request, runtime);
    }
}
