// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720;

import com.aliyun.tea.*;
import com.aliyun.ddosbgp20180720.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

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


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    public AddIpResponse addIpWithOptions(AddIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddIp", "2018-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new AddIpResponse());
    }

    public AddIpResponse addIp(AddIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addIpWithOptions(request, runtime);
    }

    public CheckAccessLogAuthResponse checkAccessLogAuthWithOptions(CheckAccessLogAuthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckAccessLogAuth", "2018-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new CheckAccessLogAuthResponse());
    }

    public CheckAccessLogAuthResponse checkAccessLogAuth(CheckAccessLogAuthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkAccessLogAuthWithOptions(request, runtime);
    }

    public CheckGrantResponse checkGrantWithOptions(CheckGrantRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckGrant", "2018-07-20", "HTTPS", "GET", "AK", "json", req, runtime), new CheckGrantResponse());
    }

    public CheckGrantResponse checkGrant(CheckGrantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkGrantWithOptions(request, runtime);
    }

    public ConfigSchedruleOnDemandResponse configSchedruleOnDemandWithOptions(ConfigSchedruleOnDemandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigSchedruleOnDemand", "2018-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigSchedruleOnDemandResponse());
    }

    public ConfigSchedruleOnDemandResponse configSchedruleOnDemand(ConfigSchedruleOnDemandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configSchedruleOnDemandWithOptions(request, runtime);
    }

    public CreateSchedruleOnDemandResponse createSchedruleOnDemandWithOptions(CreateSchedruleOnDemandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSchedruleOnDemand", "2018-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSchedruleOnDemandResponse());
    }

    public CreateSchedruleOnDemandResponse createSchedruleOnDemand(CreateSchedruleOnDemandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSchedruleOnDemandWithOptions(request, runtime);
    }

    public DeleteBlackholeResponse deleteBlackholeWithOptions(DeleteBlackholeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteBlackhole", "2018-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteBlackholeResponse());
    }

    public DeleteBlackholeResponse deleteBlackhole(DeleteBlackholeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBlackholeWithOptions(request, runtime);
    }

    public DeleteIpResponse deleteIpWithOptions(DeleteIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteIp", "2018-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteIpResponse());
    }

    public DeleteIpResponse deleteIp(DeleteIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIpWithOptions(request, runtime);
    }

    public DeleteSchedruleOnDemandResponse deleteSchedruleOnDemandWithOptions(DeleteSchedruleOnDemandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSchedruleOnDemand", "2018-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSchedruleOnDemandResponse());
    }

    public DeleteSchedruleOnDemandResponse deleteSchedruleOnDemand(DeleteSchedruleOnDemandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSchedruleOnDemandWithOptions(request, runtime);
    }

    public DescribeDdosEventResponse describeDdosEventWithOptions(DescribeDdosEventRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDdosEvent", "2018-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDdosEventResponse());
    }

    public DescribeDdosEventResponse describeDdosEvent(DescribeDdosEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDdosEventWithOptions(request, runtime);
    }

    public DescribeExcpetionCountResponse describeExcpetionCountWithOptions(DescribeExcpetionCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeExcpetionCount", "2018-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeExcpetionCountResponse());
    }

    public DescribeExcpetionCountResponse describeExcpetionCount(DescribeExcpetionCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeExcpetionCountWithOptions(request, runtime);
    }

    public DescribeInstanceListResponse describeInstanceListWithOptions(DescribeInstanceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceList", "2018-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceListResponse());
    }

    public DescribeInstanceListResponse describeInstanceList(DescribeInstanceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceListWithOptions(request, runtime);
    }

    public DescribeInstanceSpecsResponse describeInstanceSpecsWithOptions(DescribeInstanceSpecsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceSpecs", "2018-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceSpecsResponse());
    }

    public DescribeInstanceSpecsResponse describeInstanceSpecs(DescribeInstanceSpecsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceSpecsWithOptions(request, runtime);
    }

    public DescribeOnDemandDdosEventResponse describeOnDemandDdosEventWithOptions(DescribeOnDemandDdosEventRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeOnDemandDdosEvent", "2018-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeOnDemandDdosEventResponse());
    }

    public DescribeOnDemandDdosEventResponse describeOnDemandDdosEvent(DescribeOnDemandDdosEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOnDemandDdosEventWithOptions(request, runtime);
    }

    public DescribeOnDemandInstanceStatusResponse describeOnDemandInstanceStatusWithOptions(DescribeOnDemandInstanceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeOnDemandInstanceStatus", "2018-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeOnDemandInstanceStatusResponse());
    }

    public DescribeOnDemandInstanceStatusResponse describeOnDemandInstanceStatus(DescribeOnDemandInstanceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOnDemandInstanceStatusWithOptions(request, runtime);
    }

    public DescribeOpEntitiesResponse describeOpEntitiesWithOptions(DescribeOpEntitiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeOpEntities", "2018-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeOpEntitiesResponse());
    }

    public DescribeOpEntitiesResponse describeOpEntities(DescribeOpEntitiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOpEntitiesWithOptions(request, runtime);
    }

    public DescribePackIpListResponse describePackIpListWithOptions(DescribePackIpListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePackIpList", "2018-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePackIpListResponse());
    }

    public DescribePackIpListResponse describePackIpList(DescribePackIpListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePackIpListWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2018-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeTrafficResponse describeTrafficWithOptions(DescribeTrafficRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTraffic", "2018-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTrafficResponse());
    }

    public DescribeTrafficResponse describeTraffic(DescribeTrafficRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTrafficWithOptions(request, runtime);
    }

    public GetSlsOpenStatusResponse getSlsOpenStatusWithOptions(GetSlsOpenStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSlsOpenStatus", "2018-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetSlsOpenStatusResponse());
    }

    public GetSlsOpenStatusResponse getSlsOpenStatus(GetSlsOpenStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSlsOpenStatusWithOptions(request, runtime);
    }

    public ListOpenedAccessLogInstancesResponse listOpenedAccessLogInstancesWithOptions(ListOpenedAccessLogInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOpenedAccessLogInstances", "2018-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListOpenedAccessLogInstancesResponse());
    }

    public ListOpenedAccessLogInstancesResponse listOpenedAccessLogInstances(ListOpenedAccessLogInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOpenedAccessLogInstancesWithOptions(request, runtime);
    }

    public ListTagKeysResponse listTagKeysWithOptions(ListTagKeysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagKeys", "2018-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagKeysResponse());
    }

    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2018-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ModifyRemarkResponse modifyRemarkWithOptions(ModifyRemarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyRemark", "2018-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyRemarkResponse());
    }

    public ModifyRemarkResponse modifyRemark(ModifyRemarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyRemarkWithOptions(request, runtime);
    }

    public QuerySchedruleOnDemandResponse querySchedruleOnDemandWithOptions(QuerySchedruleOnDemandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySchedruleOnDemand", "2018-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySchedruleOnDemandResponse());
    }

    public QuerySchedruleOnDemandResponse querySchedruleOnDemand(QuerySchedruleOnDemandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySchedruleOnDemandWithOptions(request, runtime);
    }

    public SetInstanceModeOnDemandResponse setInstanceModeOnDemandWithOptions(SetInstanceModeOnDemandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetInstanceModeOnDemand", "2018-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new SetInstanceModeOnDemandResponse());
    }

    public SetInstanceModeOnDemandResponse setInstanceModeOnDemand(SetInstanceModeOnDemandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setInstanceModeOnDemandWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2018-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResources", "2018-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }
}
