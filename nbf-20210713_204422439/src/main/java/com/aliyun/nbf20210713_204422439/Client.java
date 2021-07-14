// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210713_204422439;

import com.aliyun.tea.*;
import com.aliyun.nbf20210713_204422439.models.*;
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

    public YxTestSingleHsfApiResponse yxTestSingleHsfApiWithOptions(YxTestSingleHsfApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("YxTestSingleHsfApi", "2021-07-13_20-44-22-439", "HTTPS", "POST", "AK", "json", req, runtime), new YxTestSingleHsfApiResponse());
    }

    public YxTestSingleHsfApiResponse yxTestSingleHsfApi(YxTestSingleHsfApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.yxTestSingleHsfApiWithOptions(request, runtime);
    }

    public SubstractResponse substractWithOptions(SubstractRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("Substract", "2021-07-13_20-44-22-439", "HTTPS", "POST", "AK", "int32", req, runtime), new SubstractResponse());
    }

    public SubstractResponse substract(SubstractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.substractWithOptions(request, runtime);
    }

    public AddResponse addWithOptions(AddRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("Add", "2021-07-13_20-44-22-439", "HTTPS", "POST", "AK", "int32", req, runtime), new AddResponse());
    }

    public AddResponse add(AddRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addWithOptions(request, runtime);
    }

    public YxTestSingleNbfApiResponse yxTestSingleNbfApiWithOptions(YxTestSingleNbfApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("YxTestSingleNbfApi", "2021-07-13_20-44-22-439", "HTTPS", "POST", "AK", "json", req, runtime), new YxTestSingleNbfApiResponse());
    }

    public YxTestSingleNbfApiResponse yxTestSingleNbfApi(YxTestSingleNbfApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.yxTestSingleNbfApiWithOptions(request, runtime);
    }

    public SayNameResponse sayNameWithOptions(SayNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SayName", "2021-07-13_20-44-22-439", "HTTPS", "POST", "AK", "string", req, runtime), new SayNameResponse());
    }

    public SayNameResponse sayName(SayNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sayNameWithOptions(request, runtime);
    }
}
