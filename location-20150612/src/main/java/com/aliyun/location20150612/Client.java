// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.location20150612;

import com.aliyun.tea.*;
import com.aliyun.location20150612.models.*;
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
        this._endpoint = this.getEndpoint("location", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public DescribeEndpointResponse describeEndpointWithOptions(DescribeEndpointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEndpoint", "2015-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEndpointResponse());
    }

    public DescribeEndpointResponse describeEndpoint(DescribeEndpointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEndpointWithOptions(request, runtime);
    }

    public DescribeEndpointsResponse describeEndpointsWithOptions(DescribeEndpointsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEndpoints", "2015-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEndpointsResponse());
    }

    public DescribeEndpointsResponse describeEndpoints(DescribeEndpointsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEndpointsWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2015-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeServicesResponse describeServicesWithOptions(DescribeServicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeServices", "2015-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeServicesResponse());
    }

    public DescribeServicesResponse describeServices(DescribeServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServicesWithOptions(request, runtime);
    }

    public ListEndpointsResponse listEndpointsWithOptions(ListEndpointsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListEndpoints", "2015-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new ListEndpointsResponse());
    }

    public ListEndpointsResponse listEndpoints(ListEndpointsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEndpointsWithOptions(request, runtime);
    }

    public ListEndpointsByIpResponse listEndpointsByIpWithOptions(ListEndpointsByIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListEndpointsByIp", "2015-06-12", "HTTPS", "POST", "AK", "json", req, runtime), new ListEndpointsByIpResponse());
    }

    public ListEndpointsByIpResponse listEndpointsByIp(ListEndpointsByIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEndpointsByIpWithOptions(request, runtime);
    }
}
