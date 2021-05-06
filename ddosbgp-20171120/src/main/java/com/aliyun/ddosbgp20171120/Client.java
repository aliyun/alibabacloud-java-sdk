// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120;

import com.aliyun.tea.*;
import com.aliyun.ddosbgp20171120.models.*;
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


    public DescribeOnDemandInstanceResponse describeOnDemandInstanceWithOptions(DescribeOnDemandInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeOnDemandInstance", "HTTPS", "POST", "2017-11-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribeOnDemandInstanceResponse());
    }

    public DescribeOnDemandInstanceResponse describeOnDemandInstance(DescribeOnDemandInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOnDemandInstanceWithOptions(request, runtime);
    }

    public ModifyOnDemaondDefenseStatusResponse modifyOnDemaondDefenseStatusWithOptions(ModifyOnDemaondDefenseStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyOnDemaondDefenseStatus", "HTTPS", "POST", "2017-11-20", "AK", null, TeaModel.buildMap(request), runtime), new ModifyOnDemaondDefenseStatusResponse());
    }

    public ModifyOnDemaondDefenseStatusResponse modifyOnDemaondDefenseStatus(ModifyOnDemaondDefenseStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyOnDemaondDefenseStatusWithOptions(request, runtime);
    }

    public DescribeOpEntitiesResponse describeOpEntitiesWithOptions(DescribeOpEntitiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeOpEntities", "HTTPS", "POST", "2017-11-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribeOpEntitiesResponse());
    }

    public DescribeOpEntitiesResponse describeOpEntities(DescribeOpEntitiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOpEntitiesWithOptions(request, runtime);
    }

    public DescribePackPaidTrafficResponse describePackPaidTrafficWithOptions(DescribePackPaidTrafficRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePackPaidTraffic", "HTTPS", "POST", "2017-11-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribePackPaidTrafficResponse());
    }

    public DescribePackPaidTrafficResponse describePackPaidTraffic(DescribePackPaidTrafficRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePackPaidTrafficWithOptions(request, runtime);
    }

    public DescribeResourcePackUsageResponse describeResourcePackUsageWithOptions(DescribeResourcePackUsageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeResourcePackUsage", "HTTPS", "POST", "2017-11-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribeResourcePackUsageResponse());
    }

    public DescribeResourcePackUsageResponse describeResourcePackUsage(DescribeResourcePackUsageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeResourcePackUsageWithOptions(request, runtime);
    }

    public DescribeResourcePackStatisticsResponse describeResourcePackStatisticsWithOptions(DescribeResourcePackStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeResourcePackStatistics", "HTTPS", "POST", "2017-11-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribeResourcePackStatisticsResponse());
    }

    public DescribeResourcePackStatisticsResponse describeResourcePackStatistics(DescribeResourcePackStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeResourcePackStatisticsWithOptions(request, runtime);
    }

    public DescribeResourcePackInstancesResponse describeResourcePackInstancesWithOptions(DescribeResourcePackInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeResourcePackInstances", "HTTPS", "POST", "2017-11-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribeResourcePackInstancesResponse());
    }

    public DescribeResourcePackInstancesResponse describeResourcePackInstances(DescribeResourcePackInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeResourcePackInstancesWithOptions(request, runtime);
    }

    public DeleteBlackholeResponse deleteBlackholeWithOptions(DeleteBlackholeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteBlackhole", "HTTPS", "POST", "2017-11-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteBlackholeResponse());
    }

    public DeleteBlackholeResponse deleteBlackhole(DeleteBlackholeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBlackholeWithOptions(request, runtime);
    }

    public CheckGrantResponse checkGrantWithOptions(CheckGrantRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckGrant", "HTTPS", "GET", "2017-11-20", "AK", TeaModel.buildMap(request), null, runtime), new CheckGrantResponse());
    }

    public CheckGrantResponse checkGrant(CheckGrantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkGrantWithOptions(request, runtime);
    }

    public DeleteProductResponse deleteProductWithOptions(DeleteProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteProduct", "HTTPS", "POST", "2017-11-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteProductResponse());
    }

    public DeleteProductResponse deleteProduct(DeleteProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteProductWithOptions(request, runtime);
    }

    public AddProductResponse addProductWithOptions(AddProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddProduct", "HTTPS", "POST", "2017-11-20", "AK", null, TeaModel.buildMap(request), runtime), new AddProductResponse());
    }

    public AddProductResponse addProduct(AddProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addProductWithOptions(request, runtime);
    }

    public AddIpResponse addIpWithOptions(AddIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddIp", "HTTPS", "POST", "2017-11-20", "AK", null, TeaModel.buildMap(request), runtime), new AddIpResponse());
    }

    public AddIpResponse addIp(AddIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addIpWithOptions(request, runtime);
    }

    public DescribeInstanceListResponse describeInstanceListWithOptions(DescribeInstanceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceList", "HTTPS", "POST", "2017-11-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceListResponse());
    }

    public DescribeInstanceListResponse describeInstanceList(DescribeInstanceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceListWithOptions(request, runtime);
    }

    public DescribeTopTrafficResponse describeTopTrafficWithOptions(DescribeTopTrafficRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeTopTraffic", "HTTPS", "POST", "2017-11-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribeTopTrafficResponse());
    }

    public DescribeTopTrafficResponse describeTopTraffic(DescribeTopTrafficRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTopTrafficWithOptions(request, runtime);
    }

    public DescribeDdosEventResponse describeDdosEventWithOptions(DescribeDdosEventRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDdosEvent", "HTTPS", "POST", "2017-11-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDdosEventResponse());
    }

    public DescribeDdosEventResponse describeDdosEvent(DescribeDdosEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDdosEventWithOptions(request, runtime);
    }

    public DescribeTrafficResponse describeTrafficWithOptions(DescribeTrafficRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeTraffic", "HTTPS", "POST", "2017-11-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribeTrafficResponse());
    }

    public DescribeTrafficResponse describeTraffic(DescribeTrafficRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTrafficWithOptions(request, runtime);
    }

    public DeleteIpResponse deleteIpWithOptions(DeleteIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteIp", "HTTPS", "POST", "2017-11-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteIpResponse());
    }

    public DeleteIpResponse deleteIp(DeleteIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIpWithOptions(request, runtime);
    }

    public DescribePackResponse describePackWithOptions(DescribePackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePack", "HTTPS", "POST", "2017-11-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribePackResponse());
    }

    public DescribePackResponse describePack(DescribePackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePackWithOptions(request, runtime);
    }

    public DescribePackListResponse describePackListWithOptions(DescribePackListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePackList", "HTTPS", "POST", "2017-11-20", "AK", null, TeaModel.buildMap(request), runtime), new DescribePackListResponse());
    }

    public DescribePackListResponse describePackList(DescribePackListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePackListWithOptions(request, runtime);
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
