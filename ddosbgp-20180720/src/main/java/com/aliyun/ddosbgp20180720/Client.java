// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720;

import com.aliyun.tea.*;
import com.aliyun.ddosbgp20180720.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.tearpc.*;
import com.aliyun.tearpc.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "ddosbgp.aliyuncs.com"),
            new TeaPair("cn-beijing", "ddosbgp.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "ddosbgp.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "ddosbgp.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "ddosbgp.aliyuncs.com"),
            new TeaPair("cn-shanghai", "ddosbgp.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "ddosbgp.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "ddosbgp.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "ddosbgp.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "ddosbgp.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "ddosbgp.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "ddosbgp.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-chengdu", "ddosbgp.aliyuncs.com"),
            new TeaPair("eu-central-1", "ddosbgp.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "ddosbgp.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "ddosbgp.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "ddosbgp.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "ddosbgp.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "ddosbgp.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "ddosbgp.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ddosbgp", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public DescribeOnDemandInstanceStatusResponse describeOnDemandInstanceStatusWithOptions(DescribeOnDemandInstanceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeOnDemandInstanceStatus", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribeOnDemandInstanceStatusResponse());
    }

    public DescribeOnDemandInstanceStatusResponse describeOnDemandInstanceStatus(DescribeOnDemandInstanceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOnDemandInstanceStatusWithOptions(request, runtime);
    }

    public SetInstanceModeOnDemandResponse setInstanceModeOnDemandWithOptions(SetInstanceModeOnDemandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetInstanceModeOnDemand", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new SetInstanceModeOnDemandResponse());
    }

    public SetInstanceModeOnDemandResponse setInstanceModeOnDemand(SetInstanceModeOnDemandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setInstanceModeOnDemandWithOptions(request, runtime);
    }

    public QuerySchedruleOnDemandResponse querySchedruleOnDemandWithOptions(QuerySchedruleOnDemandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QuerySchedruleOnDemand", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new QuerySchedruleOnDemandResponse());
    }

    public QuerySchedruleOnDemandResponse querySchedruleOnDemand(QuerySchedruleOnDemandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySchedruleOnDemandWithOptions(request, runtime);
    }

    public DeleteSchedruleOnDemandResponse deleteSchedruleOnDemandWithOptions(DeleteSchedruleOnDemandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteSchedruleOnDemand", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteSchedruleOnDemandResponse());
    }

    public DeleteSchedruleOnDemandResponse deleteSchedruleOnDemand(DeleteSchedruleOnDemandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSchedruleOnDemandWithOptions(request, runtime);
    }

    public ConfigSchedruleOnDemandResponse configSchedruleOnDemandWithOptions(ConfigSchedruleOnDemandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ConfigSchedruleOnDemand", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new ConfigSchedruleOnDemandResponse());
    }

    public ConfigSchedruleOnDemandResponse configSchedruleOnDemand(ConfigSchedruleOnDemandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configSchedruleOnDemandWithOptions(request, runtime);
    }

    public CreateSchedruleOnDemandResponse createSchedruleOnDemandWithOptions(CreateSchedruleOnDemandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateSchedruleOnDemand", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateSchedruleOnDemandResponse());
    }

    public CreateSchedruleOnDemandResponse createSchedruleOnDemand(CreateSchedruleOnDemandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSchedruleOnDemandWithOptions(request, runtime);
    }

    public GetSlsOpenStatusResponse getSlsOpenStatusWithOptions(GetSlsOpenStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetSlsOpenStatus", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new GetSlsOpenStatusResponse());
    }

    public GetSlsOpenStatusResponse getSlsOpenStatus(GetSlsOpenStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSlsOpenStatusWithOptions(request, runtime);
    }

    public CheckAccessLogAuthResponse checkAccessLogAuthWithOptions(CheckAccessLogAuthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckAccessLogAuth", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new CheckAccessLogAuthResponse());
    }

    public CheckAccessLogAuthResponse checkAccessLogAuth(CheckAccessLogAuthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkAccessLogAuthWithOptions(request, runtime);
    }

    public ListOpenedAccessLogInstancesResponse listOpenedAccessLogInstancesWithOptions(ListOpenedAccessLogInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListOpenedAccessLogInstances", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new ListOpenedAccessLogInstancesResponse());
    }

    public ListOpenedAccessLogInstancesResponse listOpenedAccessLogInstances(ListOpenedAccessLogInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOpenedAccessLogInstancesWithOptions(request, runtime);
    }

    public DescribeOnDemandDdosEventResponse describeOnDemandDdosEventWithOptions(DescribeOnDemandDdosEventRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeOnDemandDdosEvent", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribeOnDemandDdosEventResponse());
    }

    public DescribeOnDemandDdosEventResponse describeOnDemandDdosEvent(DescribeOnDemandDdosEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOnDemandDdosEventWithOptions(request, runtime);
    }

    public ListTagKeysResponse listTagKeysWithOptions(ListTagKeysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTagKeys", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new ListTagKeysResponse());
    }

    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTagResources", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UntagResources", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TagResources", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public DescribeExcpetionCountResponse describeExcpetionCountWithOptions(DescribeExcpetionCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeExcpetionCount", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribeExcpetionCountResponse());
    }

    public DescribeExcpetionCountResponse describeExcpetionCount(DescribeExcpetionCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeExcpetionCountWithOptions(request, runtime);
    }

    public DescribePackIpListResponse describePackIpListWithOptions(DescribePackIpListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePackIpList", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribePackIpListResponse());
    }

    public DescribePackIpListResponse describePackIpList(DescribePackIpListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePackIpListWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRegions", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public ModifyRemarkResponse modifyRemarkWithOptions(ModifyRemarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyRemark", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new ModifyRemarkResponse());
    }

    public ModifyRemarkResponse modifyRemark(ModifyRemarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyRemarkWithOptions(request, runtime);
    }

    public DescribeTrafficResponse describeTrafficWithOptions(DescribeTrafficRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeTraffic", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribeTrafficResponse());
    }

    public DescribeTrafficResponse describeTraffic(DescribeTrafficRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTrafficWithOptions(request, runtime);
    }

    public DescribeResourcePackUsageResponse describeResourcePackUsageWithOptions(DescribeResourcePackUsageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeResourcePackUsage", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribeResourcePackUsageResponse());
    }

    public DescribeResourcePackUsageResponse describeResourcePackUsage(DescribeResourcePackUsageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeResourcePackUsageWithOptions(request, runtime);
    }

    public DescribeResourcePackStatisticsResponse describeResourcePackStatisticsWithOptions(DescribeResourcePackStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeResourcePackStatistics", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribeResourcePackStatisticsResponse());
    }

    public DescribeResourcePackStatisticsResponse describeResourcePackStatistics(DescribeResourcePackStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeResourcePackStatisticsWithOptions(request, runtime);
    }

    public DescribeResourcePackInstancesResponse describeResourcePackInstancesWithOptions(DescribeResourcePackInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeResourcePackInstances", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribeResourcePackInstancesResponse());
    }

    public DescribeResourcePackInstancesResponse describeResourcePackInstances(DescribeResourcePackInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeResourcePackInstancesWithOptions(request, runtime);
    }

    public DescribePackPaidTrafficResponse describePackPaidTrafficWithOptions(DescribePackPaidTrafficRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePackPaidTraffic", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribePackPaidTrafficResponse());
    }

    public DescribePackPaidTrafficResponse describePackPaidTraffic(DescribePackPaidTrafficRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePackPaidTrafficWithOptions(request, runtime);
    }

    public DescribeOpEntitiesResponse describeOpEntitiesWithOptions(DescribeOpEntitiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeOpEntities", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribeOpEntitiesResponse());
    }

    public DescribeOpEntitiesResponse describeOpEntities(DescribeOpEntitiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOpEntitiesWithOptions(request, runtime);
    }

    public DescribeInstanceSpecsResponse describeInstanceSpecsWithOptions(DescribeInstanceSpecsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceSpecs", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceSpecsResponse());
    }

    public DescribeInstanceSpecsResponse describeInstanceSpecs(DescribeInstanceSpecsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceSpecsWithOptions(request, runtime);
    }

    public DescribeInstanceListResponse describeInstanceListWithOptions(DescribeInstanceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceList", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceListResponse());
    }

    public DescribeInstanceListResponse describeInstanceList(DescribeInstanceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceListWithOptions(request, runtime);
    }

    public DescribeDdosEventResponse describeDdosEventWithOptions(DescribeDdosEventRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDdosEvent", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDdosEventResponse());
    }

    public DescribeDdosEventResponse describeDdosEvent(DescribeDdosEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDdosEventWithOptions(request, runtime);
    }

    public DeleteIpResponse deleteIpWithOptions(DeleteIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteIp", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteIpResponse());
    }

    public DeleteIpResponse deleteIp(DeleteIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIpWithOptions(request, runtime);
    }

    public DeleteBlackholeResponse deleteBlackholeWithOptions(DeleteBlackholeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteBlackhole", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteBlackholeResponse());
    }

    public DeleteBlackholeResponse deleteBlackhole(DeleteBlackholeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBlackholeWithOptions(request, runtime);
    }

    public CheckGrantResponse checkGrantWithOptions(CheckGrantRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckGrant", "HTTPS", "GET", "2018-07-20", "AK", TeaModel.buildMap(request), null, runtime), new CheckGrantResponse());
    }

    public CheckGrantResponse checkGrant(CheckGrantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkGrantWithOptions(request, runtime);
    }

    public AddIpResponse addIpWithOptions(AddIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddIp", "HTTPS", "POST", "2018-07-20", "AK", null, TeaModel.buildMap(request), runtime), new AddIpResponse());
    }

    public AddIpResponse addIp(AddIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addIpWithOptions(request, runtime);
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
