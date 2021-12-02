// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617;

import com.aliyun.tea.*;
import com.aliyun.ddi20200617.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "ddi.cn-qingdao.aliyuncs.com"),
            new TeaPair("cn-chengdu", "ddi.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "ddi.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "ddi.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-hongkong", "ddi.cn-hongkong.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "ddi.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "ddi.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "ddi.ap-southeast-5.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "ddi.ap-northeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "ddi.eu-west-1.aliyuncs.com"),
            new TeaPair("us-east-1", "ddi.us-east-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "ddi.eu-central-1.aliyuncs.com"),
            new TeaPair("me-east-1", "ddi.me-east-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "ddi.ap-south-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ddi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateClusterV2Response createClusterV2WithOptions(CreateClusterV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AuthorizeContent", request.authorizeContent);
        query.put("Auto", request.auto);
        query.put("AutoPayOrder", request.autoPayOrder);
        query.put("BootstrapAction", request.bootstrapAction);
        query.put("ChargeType", request.chargeType);
        query.put("ClickHouseConf", request.clickHouseConf);
        query.put("ClientToken", request.clientToken);
        query.put("ClusterType", request.clusterType);
        query.put("Config", request.config);
        query.put("Configurations", request.configurations);
        query.put("DepositType", request.depositType);
        query.put("EmrVer", request.emrVer);
        query.put("EnableEas", request.enableEas);
        query.put("EnableHighAvailability", request.enableHighAvailability);
        query.put("EnableSsh", request.enableSsh);
        query.put("ExtraAttributes", request.extraAttributes);
        query.put("HostComponentInfo", request.hostComponentInfo);
        query.put("HostGroup", request.hostGroup);
        query.put("InitCustomHiveMetaDB", request.initCustomHiveMetaDB);
        query.put("InstanceGeneration", request.instanceGeneration);
        query.put("IsOpenPublicIp", request.isOpenPublicIp);
        query.put("KeyPairName", request.keyPairName);
        query.put("LogPath", request.logPath);
        query.put("MachineType", request.machineType);
        query.put("MasterPwd", request.masterPwd);
        query.put("MetaStoreConf", request.metaStoreConf);
        query.put("MetaStoreType", request.metaStoreType);
        query.put("Name", request.name);
        query.put("NetType", request.netType);
        query.put("Period", request.period);
        query.put("PromotionInfo", request.promotionInfo);
        query.put("RegionId", request.regionId);
        query.put("RelatedClusterId", request.relatedClusterId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SecurityGroupId", request.securityGroupId);
        query.put("SecurityGroupName", request.securityGroupName);
        query.put("ServiceInfo", request.serviceInfo);
        query.put("Tag", request.tag);
        query.put("UseCustomHiveMetaDB", request.useCustomHiveMetaDB);
        query.put("UseLocalMetaDb", request.useLocalMetaDb);
        query.put("UserDefinedEmrEcsRole", request.userDefinedEmrEcsRole);
        query.put("UserInfo", request.userInfo);
        query.put("VSwitchId", request.vSwitchId);
        query.put("VpcId", request.vpcId);
        query.put("WhiteListType", request.whiteListType);
        query.put("ZoneId", request.zoneId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateClusterV2"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClusterV2Response());
    }

    public CreateClusterV2Response createClusterV2(CreateClusterV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createClusterV2WithOptions(request, runtime);
    }

    public DescribeClusterV2Response describeClusterV2WithOptions(DescribeClusterV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Id", request.id);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterV2"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterV2Response());
    }

    public DescribeClusterV2Response describeClusterV2(DescribeClusterV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterV2WithOptions(request, runtime);
    }

    public ListClustersResponse listClustersWithOptions(ListClustersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterTypeList", request.clusterTypeList);
        query.put("CreateType", request.createType);
        query.put("DefaultStatus", request.defaultStatus);
        query.put("DepositType", request.depositType);
        query.put("ExpiredTagList", request.expiredTagList);
        query.put("IsDesc", request.isDesc);
        query.put("MachineType", request.machineType);
        query.put("Name", request.name);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("StatusList", request.statusList);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusters"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClustersResponse());
    }

    public ListClustersResponse listClusters(ListClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClustersWithOptions(request, runtime);
    }

    public ReleaseClusterResponse releaseClusterWithOptions(ReleaseClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ForceRelease", request.forceRelease);
        query.put("Id", request.id);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseCluster"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseClusterResponse());
    }

    public ReleaseClusterResponse releaseCluster(ReleaseClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseClusterWithOptions(request, runtime);
    }
}
