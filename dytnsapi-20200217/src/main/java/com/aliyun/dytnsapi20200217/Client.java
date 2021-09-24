// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217;

import com.aliyun.tea.*;
import com.aliyun.dytnsapi20200217.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dytnsapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public DescribePhoneNumberStatusResponse describePhoneNumberStatusWithOptions(DescribePhoneNumberStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePhoneNumberStatus", "2020-02-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePhoneNumberStatusResponse());
    }

    public DescribePhoneNumberStatusResponse describePhoneNumberStatus(DescribePhoneNumberStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePhoneNumberStatusWithOptions(request, runtime);
    }

    public DescribePhoneNumberAttributeResponse describePhoneNumberAttributeWithOptions(DescribePhoneNumberAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePhoneNumberAttribute", "2020-02-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePhoneNumberAttributeResponse());
    }

    public DescribePhoneNumberAttributeResponse describePhoneNumberAttribute(DescribePhoneNumberAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePhoneNumberAttributeWithOptions(request, runtime);
    }

    public DescribePhoneNumberResaleResponse describePhoneNumberResaleWithOptions(DescribePhoneNumberResaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePhoneNumberResale", "2020-02-17", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePhoneNumberResaleResponse());
    }

    public DescribePhoneNumberResaleResponse describePhoneNumberResale(DescribePhoneNumberResaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePhoneNumberResaleWithOptions(request, runtime);
    }
}
