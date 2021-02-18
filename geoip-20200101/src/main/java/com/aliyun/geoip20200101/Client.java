// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.geoip20200101;

import com.aliyun.tea.*;
import com.aliyun.geoip20200101.models.*;
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
        this._endpoint = this.getEndpoint("geoip", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public DescribeGeoipInstanceResponse describeGeoipInstanceWithOptions(DescribeGeoipInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGeoipInstance", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGeoipInstanceResponse());
    }

    public DescribeGeoipInstanceResponse describeGeoipInstance(DescribeGeoipInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGeoipInstanceWithOptions(request, runtime);
    }

    public DescribeGeoipInstanceDataInfosResponse describeGeoipInstanceDataInfosWithOptions(DescribeGeoipInstanceDataInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGeoipInstanceDataInfos", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGeoipInstanceDataInfosResponse());
    }

    public DescribeGeoipInstanceDataInfosResponse describeGeoipInstanceDataInfos(DescribeGeoipInstanceDataInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGeoipInstanceDataInfosWithOptions(request, runtime);
    }

    public DescribeGeoipInstanceDataUrlResponse describeGeoipInstanceDataUrlWithOptions(DescribeGeoipInstanceDataUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGeoipInstanceDataUrl", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGeoipInstanceDataUrlResponse());
    }

    public DescribeGeoipInstanceDataUrlResponse describeGeoipInstanceDataUrl(DescribeGeoipInstanceDataUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGeoipInstanceDataUrlWithOptions(request, runtime);
    }

    public DescribeGeoipInstancesResponse describeGeoipInstancesWithOptions(DescribeGeoipInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGeoipInstances", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGeoipInstancesResponse());
    }

    public DescribeGeoipInstancesResponse describeGeoipInstances(DescribeGeoipInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGeoipInstancesWithOptions(request, runtime);
    }

    public DescribeGeoipInstanceStatisticsResponse describeGeoipInstanceStatisticsWithOptions(DescribeGeoipInstanceStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGeoipInstanceStatistics", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGeoipInstanceStatisticsResponse());
    }

    public DescribeGeoipInstanceStatisticsResponse describeGeoipInstanceStatistics(DescribeGeoipInstanceStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGeoipInstanceStatisticsWithOptions(request, runtime);
    }

    public DescribeIpv4LocationResponse describeIpv4LocationWithOptions(DescribeIpv4LocationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeIpv4Location", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeIpv4LocationResponse());
    }

    public DescribeIpv4LocationResponse describeIpv4Location(DescribeIpv4LocationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIpv4LocationWithOptions(request, runtime);
    }

    public DescribeIpv6LocationResponse describeIpv6LocationWithOptions(DescribeIpv6LocationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeIpv6Location", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeIpv6LocationResponse());
    }

    public DescribeIpv6LocationResponse describeIpv6Location(DescribeIpv6LocationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIpv6LocationWithOptions(request, runtime);
    }
}
