// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808;

import com.aliyun.tea.*;
import com.aliyun.eci20180808.models.*;
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
        this._endpoint = this.getEndpoint("eci", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateContainerGroupResponse createContainerGroupWithOptions(CreateContainerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateContainerGroup", "2018-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateContainerGroupResponse());
    }

    public CreateContainerGroupResponse createContainerGroup(CreateContainerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createContainerGroupWithOptions(request, runtime);
    }

    public CreateImageCacheResponse createImageCacheWithOptions(CreateImageCacheRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateImageCache", "2018-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateImageCacheResponse());
    }

    public CreateImageCacheResponse createImageCache(CreateImageCacheRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createImageCacheWithOptions(request, runtime);
    }

    public DeleteContainerGroupResponse deleteContainerGroupWithOptions(DeleteContainerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteContainerGroup", "2018-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteContainerGroupResponse());
    }

    public DeleteContainerGroupResponse deleteContainerGroup(DeleteContainerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteContainerGroupWithOptions(request, runtime);
    }

    public DeleteImageCacheResponse deleteImageCacheWithOptions(DeleteImageCacheRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteImageCache", "2018-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteImageCacheResponse());
    }

    public DeleteImageCacheResponse deleteImageCache(DeleteImageCacheRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteImageCacheWithOptions(request, runtime);
    }

    public DescribeContainerGroupMetricResponse describeContainerGroupMetricWithOptions(DescribeContainerGroupMetricRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeContainerGroupMetric", "2018-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeContainerGroupMetricResponse());
    }

    public DescribeContainerGroupMetricResponse describeContainerGroupMetric(DescribeContainerGroupMetricRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeContainerGroupMetricWithOptions(request, runtime);
    }

    public DescribeContainerGroupPriceResponse describeContainerGroupPriceWithOptions(DescribeContainerGroupPriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeContainerGroupPrice", "2018-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeContainerGroupPriceResponse());
    }

    public DescribeContainerGroupPriceResponse describeContainerGroupPrice(DescribeContainerGroupPriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeContainerGroupPriceWithOptions(request, runtime);
    }

    public DescribeContainerGroupsResponse describeContainerGroupsWithOptions(DescribeContainerGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeContainerGroups", "2018-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeContainerGroupsResponse());
    }

    public DescribeContainerGroupsResponse describeContainerGroups(DescribeContainerGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeContainerGroupsWithOptions(request, runtime);
    }

    public DescribeContainerLogResponse describeContainerLogWithOptions(DescribeContainerLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeContainerLog", "2018-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeContainerLogResponse());
    }

    public DescribeContainerLogResponse describeContainerLog(DescribeContainerLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeContainerLogWithOptions(request, runtime);
    }

    public DescribeImageCachesResponse describeImageCachesWithOptions(DescribeImageCachesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeImageCaches", "2018-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeImageCachesResponse());
    }

    public DescribeImageCachesResponse describeImageCaches(DescribeImageCachesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImageCachesWithOptions(request, runtime);
    }

    public DescribeMultiContainerGroupMetricResponse describeMultiContainerGroupMetricWithOptions(DescribeMultiContainerGroupMetricRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMultiContainerGroupMetric", "2018-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMultiContainerGroupMetricResponse());
    }

    public DescribeMultiContainerGroupMetricResponse describeMultiContainerGroupMetric(DescribeMultiContainerGroupMetricRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMultiContainerGroupMetricWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2018-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public ExecContainerCommandResponse execContainerCommandWithOptions(ExecContainerCommandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExecContainerCommand", "2018-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new ExecContainerCommandResponse());
    }

    public ExecContainerCommandResponse execContainerCommand(ExecContainerCommandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.execContainerCommandWithOptions(request, runtime);
    }

    public ListUsageResponse listUsageWithOptions(ListUsageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUsage", "2018-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListUsageResponse());
    }

    public ListUsageResponse listUsage(ListUsageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUsageWithOptions(request, runtime);
    }

    public RestartContainerGroupResponse restartContainerGroupWithOptions(RestartContainerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RestartContainerGroup", "2018-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new RestartContainerGroupResponse());
    }

    public RestartContainerGroupResponse restartContainerGroup(RestartContainerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restartContainerGroupWithOptions(request, runtime);
    }

    public UpdateContainerGroupResponse updateContainerGroupWithOptions(UpdateContainerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateContainerGroup", "2018-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateContainerGroupResponse());
    }

    public UpdateContainerGroupResponse updateContainerGroup(UpdateContainerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateContainerGroupWithOptions(request, runtime);
    }
}
