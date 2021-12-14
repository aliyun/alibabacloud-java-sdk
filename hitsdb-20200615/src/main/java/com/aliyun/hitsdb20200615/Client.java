// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615;

import com.aliyun.tea.*;
import com.aliyun.hitsdb20200615.models.*;
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
            new TeaPair("cn-qingdao", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-beijing", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shanghai", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hongkong", "hitsdb.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "hitsdb.aliyuncs.com"),
            new TeaPair("us-west-1", "hitsdb.aliyuncs.com"),
            new TeaPair("us-east-1", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "hitsdb.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-chengdu", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-edge-1", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-fujian", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-wuhan", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "hitsdb.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "hitsdb.aliyuncs.com"),
            new TeaPair("me-east-1", "hitsdb.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "hitsdb.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("hitsdb", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateLindormInstanceResponse createLindormInstanceWithOptions(CreateLindormInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ColdStorage", request.coldStorage);
        query.put("CoreSpec", request.coreSpec);
        query.put("DiskCategory", request.diskCategory);
        query.put("Duration", request.duration);
        query.put("FilestoreNum", request.filestoreNum);
        query.put("FilestoreSpec", request.filestoreSpec);
        query.put("InstanceAlias", request.instanceAlias);
        query.put("InstanceStorage", request.instanceStorage);
        query.put("LindormNum", request.lindormNum);
        query.put("LindormSpec", request.lindormSpec);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("PayType", request.payType);
        query.put("PricingCycle", request.pricingCycle);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SecurityToken", request.securityToken);
        query.put("SolrNum", request.solrNum);
        query.put("SolrSpec", request.solrSpec);
        query.put("TsdbNum", request.tsdbNum);
        query.put("TsdbSpec", request.tsdbSpec);
        query.put("VPCId", request.VPCId);
        query.put("VSwitchId", request.vSwitchId);
        query.put("ZoneId", request.zoneId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLindormInstance"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLindormInstanceResponse());
    }

    public CreateLindormInstanceResponse createLindormInstance(CreateLindormInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLindormInstanceWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AcceptLanguage", request.acceptLanguage);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public GetInstanceIpWhiteListResponse getInstanceIpWhiteListWithOptions(GetInstanceIpWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GroupName", request.groupName);
        query.put("InstanceId", request.instanceId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceIpWhiteList"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceIpWhiteListResponse());
    }

    public GetInstanceIpWhiteListResponse getInstanceIpWhiteList(GetInstanceIpWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceIpWhiteListWithOptions(request, runtime);
    }

    public GetLindormInstanceResponse getLindormInstanceWithOptions(GetLindormInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLindormInstance"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLindormInstanceResponse());
    }

    public GetLindormInstanceResponse getLindormInstance(GetLindormInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLindormInstanceWithOptions(request, runtime);
    }

    public GetLindormInstanceEngineListResponse getLindormInstanceEngineListWithOptions(GetLindormInstanceEngineListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLindormInstanceEngineList"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLindormInstanceEngineListResponse());
    }

    public GetLindormInstanceEngineListResponse getLindormInstanceEngineList(GetLindormInstanceEngineListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLindormInstanceEngineListWithOptions(request, runtime);
    }

    public GetLindormInstanceListResponse getLindormInstanceListWithOptions(GetLindormInstanceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("QueryStr", request.queryStr);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SecurityToken", request.securityToken);
        query.put("ServiceType", request.serviceType);
        query.put("SupportEngine", request.supportEngine);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLindormInstanceList"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLindormInstanceListResponse());
    }

    public GetLindormInstanceListResponse getLindormInstanceList(GetLindormInstanceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLindormInstanceListWithOptions(request, runtime);
    }

    public ReleaseLindormInstanceResponse releaseLindormInstanceWithOptions(ReleaseLindormInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseLindormInstance"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseLindormInstanceResponse());
    }

    public ReleaseLindormInstanceResponse releaseLindormInstance(ReleaseLindormInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseLindormInstanceWithOptions(request, runtime);
    }

    public UpdateInstanceIpWhiteListResponse updateInstanceIpWhiteListWithOptions(UpdateInstanceIpWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GroupName", request.groupName);
        query.put("InstanceId", request.instanceId);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SecurityIpList", request.securityIpList);
        query.put("SecurityToken", request.securityToken);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceIpWhiteList"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceIpWhiteListResponse());
    }

    public UpdateInstanceIpWhiteListResponse updateInstanceIpWhiteList(UpdateInstanceIpWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateInstanceIpWhiteListWithOptions(request, runtime);
    }

    public UpgradeLindormInstanceResponse upgradeLindormInstanceWithOptions(UpgradeLindormInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterStorage", request.clusterStorage);
        query.put("ColdStorage", request.coldStorage);
        query.put("CoreNum", request.coreNum);
        query.put("CoreSpec", request.coreSpec);
        query.put("FilestoreNum", request.filestoreNum);
        query.put("FilestoreSpec", request.filestoreSpec);
        query.put("InstanceId", request.instanceId);
        query.put("LindormNum", request.lindormNum);
        query.put("LindormSpec", request.lindormSpec);
        query.put("LtsCoreNum", request.ltsCoreNum);
        query.put("LtsCoreSpec", request.ltsCoreSpec);
        query.put("OwnerAccount", request.ownerAccount);
        query.put("OwnerId", request.ownerId);
        query.put("PhoenixCoreNum", request.phoenixCoreNum);
        query.put("PhoenixCoreSpec", request.phoenixCoreSpec);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SecurityToken", request.securityToken);
        query.put("SolrNum", request.solrNum);
        query.put("SolrSpec", request.solrSpec);
        query.put("TsdbNum", request.tsdbNum);
        query.put("TsdbSpec", request.tsdbSpec);
        query.put("UpgradeType", request.upgradeType);
        query.put("ZoneId", request.zoneId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeLindormInstance"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeLindormInstanceResponse());
    }

    public UpgradeLindormInstanceResponse upgradeLindormInstance(UpgradeLindormInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeLindormInstanceWithOptions(request, runtime);
    }
}
