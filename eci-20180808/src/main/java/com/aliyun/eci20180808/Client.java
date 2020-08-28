// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808;

import com.aliyun.tea.*;
import com.aliyun.eci20180808.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("eci", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRegions", "HTTPS", "POST", "2018-08-08", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeImageCachesResponse describeImageCachesWithOptions(DescribeImageCachesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeImageCaches", "HTTPS", "POST", "2018-08-08", "AK", null, TeaModel.buildMap(request), runtime), new DescribeImageCachesResponse());
    }

    public DescribeImageCachesResponse describeImageCaches(DescribeImageCachesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImageCachesWithOptions(request, runtime);
    }

    public DeleteImageCacheResponse deleteImageCacheWithOptions(DeleteImageCacheRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteImageCache", "HTTPS", "POST", "2018-08-08", "AK", null, TeaModel.buildMap(request), runtime), new DeleteImageCacheResponse());
    }

    public DeleteImageCacheResponse deleteImageCache(DeleteImageCacheRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteImageCacheWithOptions(request, runtime);
    }

    public CreateImageCacheResponse createImageCacheWithOptions(CreateImageCacheRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateImageCache", "HTTPS", "POST", "2018-08-08", "AK", null, TeaModel.buildMap(request), runtime), new CreateImageCacheResponse());
    }

    public CreateImageCacheResponse createImageCache(CreateImageCacheRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createImageCacheWithOptions(request, runtime);
    }

    public DescribeMultiContainerGroupMetricResponse describeMultiContainerGroupMetricWithOptions(DescribeMultiContainerGroupMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMultiContainerGroupMetric", "HTTPS", "POST", "2018-08-08", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMultiContainerGroupMetricResponse());
    }

    public DescribeMultiContainerGroupMetricResponse describeMultiContainerGroupMetric(DescribeMultiContainerGroupMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMultiContainerGroupMetricWithOptions(request, runtime);
    }

    public DescribeContainerGroupMetricResponse describeContainerGroupMetricWithOptions(DescribeContainerGroupMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeContainerGroupMetric", "HTTPS", "POST", "2018-08-08", "AK", null, TeaModel.buildMap(request), runtime), new DescribeContainerGroupMetricResponse());
    }

    public DescribeContainerGroupMetricResponse describeContainerGroupMetric(DescribeContainerGroupMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeContainerGroupMetricWithOptions(request, runtime);
    }

    public UpdateContainerGroupByTemplateResponse updateContainerGroupByTemplateWithOptions(UpdateContainerGroupByTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateContainerGroupByTemplate", "HTTPS", "POST", "2018-08-08", "AK", null, TeaModel.buildMap(request), runtime), new UpdateContainerGroupByTemplateResponse());
    }

    public UpdateContainerGroupByTemplateResponse updateContainerGroupByTemplate(UpdateContainerGroupByTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateContainerGroupByTemplateWithOptions(request, runtime);
    }

    public CreateContainerGroupFromTemplateResponse createContainerGroupFromTemplateWithOptions(CreateContainerGroupFromTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateContainerGroupFromTemplate", "HTTPS", "POST", "2018-08-08", "AK", null, TeaModel.buildMap(request), runtime), new CreateContainerGroupFromTemplateResponse());
    }

    public CreateContainerGroupFromTemplateResponse createContainerGroupFromTemplate(CreateContainerGroupFromTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createContainerGroupFromTemplateWithOptions(request, runtime);
    }

    public ExportContainerGroupTemplateResponse exportContainerGroupTemplateWithOptions(ExportContainerGroupTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ExportContainerGroupTemplate", "HTTPS", "POST", "2018-08-08", "AK", null, TeaModel.buildMap(request), runtime), new ExportContainerGroupTemplateResponse());
    }

    public ExportContainerGroupTemplateResponse exportContainerGroupTemplate(ExportContainerGroupTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportContainerGroupTemplateWithOptions(request, runtime);
    }

    public RestartContainerGroupResponse restartContainerGroupWithOptions(RestartContainerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RestartContainerGroup", "HTTPS", "POST", "2018-08-08", "AK", null, TeaModel.buildMap(request), runtime), new RestartContainerGroupResponse());
    }

    public RestartContainerGroupResponse restartContainerGroup(RestartContainerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartContainerGroupWithOptions(request, runtime);
    }

    public UpdateContainerGroupResponse updateContainerGroupWithOptions(UpdateContainerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateContainerGroup", "HTTPS", "POST", "2018-08-08", "AK", null, TeaModel.buildMap(request), runtime), new UpdateContainerGroupResponse());
    }

    public UpdateContainerGroupResponse updateContainerGroup(UpdateContainerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateContainerGroupWithOptions(request, runtime);
    }

    public DescribeContainerGroupPriceResponse describeContainerGroupPriceWithOptions(DescribeContainerGroupPriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeContainerGroupPrice", "HTTPS", "POST", "2018-08-08", "AK", null, TeaModel.buildMap(request), runtime), new DescribeContainerGroupPriceResponse());
    }

    public DescribeContainerGroupPriceResponse describeContainerGroupPrice(DescribeContainerGroupPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeContainerGroupPriceWithOptions(request, runtime);
    }

    public ExecContainerCommandResponse execContainerCommandWithOptions(ExecContainerCommandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ExecContainerCommand", "HTTPS", "POST", "2018-08-08", "AK", null, TeaModel.buildMap(request), runtime), new ExecContainerCommandResponse());
    }

    public ExecContainerCommandResponse execContainerCommand(ExecContainerCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.execContainerCommandWithOptions(request, runtime);
    }

    public DescribeContainerLogResponse describeContainerLogWithOptions(DescribeContainerLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeContainerLog", "HTTPS", "POST", "2018-08-08", "AK", null, TeaModel.buildMap(request), runtime), new DescribeContainerLogResponse());
    }

    public DescribeContainerLogResponse describeContainerLog(DescribeContainerLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeContainerLogWithOptions(request, runtime);
    }

    public CreateContainerGroupResponse createContainerGroupWithOptions(CreateContainerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateContainerGroup", "HTTPS", "POST", "2018-08-08", "AK", null, TeaModel.buildMap(request), runtime), new CreateContainerGroupResponse());
    }

    public CreateContainerGroupResponse createContainerGroup(CreateContainerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createContainerGroupWithOptions(request, runtime);
    }

    public DescribeContainerGroupsResponse describeContainerGroupsWithOptions(DescribeContainerGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeContainerGroups", "HTTPS", "POST", "2018-08-08", "AK", null, TeaModel.buildMap(request), runtime), new DescribeContainerGroupsResponse());
    }

    public DescribeContainerGroupsResponse describeContainerGroups(DescribeContainerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeContainerGroupsWithOptions(request, runtime);
    }

    public DeleteContainerGroupResponse deleteContainerGroupWithOptions(DeleteContainerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteContainerGroup", "HTTPS", "POST", "2018-08-08", "AK", null, TeaModel.buildMap(request), runtime), new DeleteContainerGroupResponse());
    }

    public DeleteContainerGroupResponse deleteContainerGroup(DeleteContainerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteContainerGroupWithOptions(request, runtime);
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
