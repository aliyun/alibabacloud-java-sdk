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

    public CloneFlowResponse cloneFlowWithOptions(CloneFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Id", request.id);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloneFlow"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloneFlowResponse());
    }

    public CloneFlowResponse cloneFlow(CloneFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cloneFlowWithOptions(request, runtime);
    }

    public CloneFlowJobResponse cloneFlowJobWithOptions(CloneFlowJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Id", request.id);
        query.put("Name", request.name);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloneFlowJob"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloneFlowJobResponse());
    }

    public CloneFlowJobResponse cloneFlowJob(CloneFlowJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cloneFlowJobWithOptions(request, runtime);
    }

    public CommitFlowEntitySnapshotResponse commitFlowEntitySnapshotWithOptions(CommitFlowEntitySnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EntityId", request.entityId);
        query.put("EntityType", request.entityType);
        query.put("Message", request.message);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CommitFlowEntitySnapshot"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CommitFlowEntitySnapshotResponse());
    }

    public CommitFlowEntitySnapshotResponse commitFlowEntitySnapshot(CommitFlowEntitySnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.commitFlowEntitySnapshotWithOptions(request, runtime);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateClusterV2"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClusterV2Response());
    }

    public CreateClusterV2Response createClusterV2(CreateClusterV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createClusterV2WithOptions(request, runtime);
    }

    public CreateFlowResponse createFlowWithOptions(CreateFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AlertConf", request.alertConf);
        query.put("AlertDingDingGroupBizId", request.alertDingDingGroupBizId);
        query.put("AlertUserGroupBizId", request.alertUserGroupBizId);
        query.put("Application", request.application);
        query.put("ClientToken", request.clientToken);
        query.put("ClusterId", request.clusterId);
        query.put("CreateCluster", request.createCluster);
        query.put("CronExpression", request.cronExpression);
        query.put("Description", request.description);
        query.put("EndSchedule", request.endSchedule);
        query.put("HostName", request.hostName);
        query.put("Name", request.name);
        query.put("Namespace", request.namespace);
        query.put("ParentCategory", request.parentCategory);
        query.put("ParentFlowList", request.parentFlowList);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        query.put("StartSchedule", request.startSchedule);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFlow"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlowResponse());
    }

    public CreateFlowResponse createFlow(CreateFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowWithOptions(request, runtime);
    }

    public CreateFlowCategoryResponse createFlowCategoryWithOptions(CreateFlowCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("Name", request.name);
        query.put("ParentId", request.parentId);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFlowCategory"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlowCategoryResponse());
    }

    public CreateFlowCategoryResponse createFlowCategory(CreateFlowCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowCategoryWithOptions(request, runtime);
    }

    public CreateFlowEditLockResponse createFlowEditLockWithOptions(CreateFlowEditLockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EntityId", request.entityId);
        query.put("Force", request.force);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFlowEditLock"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlowEditLockResponse());
    }

    public CreateFlowEditLockResponse createFlowEditLock(CreateFlowEditLockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowEditLockWithOptions(request, runtime);
    }

    public CreateFlowJobResponse createFlowJobWithOptions(CreateFlowJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Adhoc", request.adhoc);
        query.put("AlertConf", request.alertConf);
        query.put("ClientToken", request.clientToken);
        query.put("ClusterId", request.clusterId);
        query.put("CustomVariables", request.customVariables);
        query.put("Description", request.description);
        query.put("EnvConf", request.envConf);
        query.put("FailAct", request.failAct);
        query.put("Mode", request.mode);
        query.put("MonitorConf", request.monitorConf);
        query.put("Name", request.name);
        query.put("ParamConf", request.paramConf);
        query.put("Params", request.params);
        query.put("ParentCategory", request.parentCategory);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        query.put("ResourceList", request.resourceList);
        query.put("RetryPolicy", request.retryPolicy);
        query.put("RunConf", request.runConf);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFlowJob"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlowJobResponse());
    }

    public CreateFlowJobResponse createFlowJob(CreateFlowJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowJobWithOptions(request, runtime);
    }

    public CreateFlowProjectResponse createFlowProjectWithOptions(CreateFlowProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("Description", request.description);
        query.put("Name", request.name);
        query.put("ProductType", request.productType);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFlowProject"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlowProjectResponse());
    }

    public CreateFlowProjectResponse createFlowProject(CreateFlowProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowProjectWithOptions(request, runtime);
    }

    public CreateFlowProjectClusterSettingResponse createFlowProjectClusterSettingWithOptions(CreateFlowProjectClusterSettingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("ClusterId", request.clusterId);
        query.put("DefaultQueue", request.defaultQueue);
        query.put("DefaultUser", request.defaultUser);
        query.put("HostList", request.hostList);
        query.put("ProjectId", request.projectId);
        query.put("QueueList", request.queueList);
        query.put("RegionId", request.regionId);
        query.put("UserList", request.userList);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFlowProjectClusterSetting"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlowProjectClusterSettingResponse());
    }

    public CreateFlowProjectClusterSettingResponse createFlowProjectClusterSetting(CreateFlowProjectClusterSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowProjectClusterSettingWithOptions(request, runtime);
    }

    public CreateFlowProjectUserResponse createFlowProjectUserWithOptions(CreateFlowProjectUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        query.put("User", request.user);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFlowProjectUser"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlowProjectUserResponse());
    }

    public CreateFlowProjectUserResponse createFlowProjectUser(CreateFlowProjectUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowProjectUserWithOptions(request, runtime);
    }

    public DeleteFlowResponse deleteFlowWithOptions(DeleteFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Id", request.id);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFlow"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFlowResponse());
    }

    public DeleteFlowResponse deleteFlow(DeleteFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFlowWithOptions(request, runtime);
    }

    public DeleteFlowCategoryResponse deleteFlowCategoryWithOptions(DeleteFlowCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Id", request.id);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFlowCategory"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFlowCategoryResponse());
    }

    public DeleteFlowCategoryResponse deleteFlowCategory(DeleteFlowCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFlowCategoryWithOptions(request, runtime);
    }

    public DeleteFlowEditLockResponse deleteFlowEditLockWithOptions(DeleteFlowEditLockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EntityId", request.entityId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFlowEditLock"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFlowEditLockResponse());
    }

    public DeleteFlowEditLockResponse deleteFlowEditLock(DeleteFlowEditLockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFlowEditLockWithOptions(request, runtime);
    }

    public DeleteFlowProjectResponse deleteFlowProjectWithOptions(DeleteFlowProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFlowProject"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFlowProjectResponse());
    }

    public DeleteFlowProjectResponse deleteFlowProject(DeleteFlowProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFlowProjectWithOptions(request, runtime);
    }

    public DeleteFlowProjectClusterSettingResponse deleteFlowProjectClusterSettingWithOptions(DeleteFlowProjectClusterSettingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterId", request.clusterId);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFlowProjectClusterSetting"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFlowProjectClusterSettingResponse());
    }

    public DeleteFlowProjectClusterSettingResponse deleteFlowProjectClusterSetting(DeleteFlowProjectClusterSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFlowProjectClusterSettingWithOptions(request, runtime);
    }

    public DeleteFlowProjectUserResponse deleteFlowProjectUserWithOptions(DeleteFlowProjectUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        query.put("UserName", request.userName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFlowProjectUser"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFlowProjectUserResponse());
    }

    public DeleteFlowProjectUserResponse deleteFlowProjectUser(DeleteFlowProjectUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFlowProjectUserWithOptions(request, runtime);
    }

    public DescribeClusterV2Response describeClusterV2WithOptions(DescribeClusterV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Id", request.id);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterV2"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterV2Response());
    }

    public DescribeClusterV2Response describeClusterV2(DescribeClusterV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeClusterV2WithOptions(request, runtime);
    }

    public DescribeFlowResponse describeFlowWithOptions(DescribeFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Id", request.id);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFlow"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFlowResponse());
    }

    public DescribeFlowResponse describeFlow(DescribeFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowWithOptions(request, runtime);
    }

    public DescribeFlowCategoryTreeResponse describeFlowCategoryTreeWithOptions(DescribeFlowCategoryTreeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CategoryId", request.categoryId);
        query.put("Keyword", request.keyword);
        query.put("Mode", request.mode);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFlowCategoryTree"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFlowCategoryTreeResponse());
    }

    public DescribeFlowCategoryTreeResponse describeFlowCategoryTree(DescribeFlowCategoryTreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowCategoryTreeWithOptions(request, runtime);
    }

    public DescribeFlowInstanceResponse describeFlowInstanceWithOptions(DescribeFlowInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Id", request.id);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFlowInstance"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFlowInstanceResponse());
    }

    public DescribeFlowInstanceResponse describeFlowInstance(DescribeFlowInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowInstanceWithOptions(request, runtime);
    }

    public DescribeFlowJobResponse describeFlowJobWithOptions(DescribeFlowJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Id", request.id);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFlowJob"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFlowJobResponse());
    }

    public DescribeFlowJobResponse describeFlowJob(DescribeFlowJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowJobWithOptions(request, runtime);
    }

    public DescribeFlowNodeInstanceResponse describeFlowNodeInstanceWithOptions(DescribeFlowNodeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Id", request.id);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFlowNodeInstance"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFlowNodeInstanceResponse());
    }

    public DescribeFlowNodeInstanceResponse describeFlowNodeInstance(DescribeFlowNodeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowNodeInstanceWithOptions(request, runtime);
    }

    public DescribeFlowNodeInstanceContainerLogResponse describeFlowNodeInstanceContainerLogWithOptions(DescribeFlowNodeInstanceContainerLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("ContainerId", request.containerId);
        query.put("Length", request.length);
        query.put("LogName", request.logName);
        query.put("NodeInstanceId", request.nodeInstanceId);
        query.put("Offset", request.offset);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFlowNodeInstanceContainerLog"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFlowNodeInstanceContainerLogResponse());
    }

    public DescribeFlowNodeInstanceContainerLogResponse describeFlowNodeInstanceContainerLog(DescribeFlowNodeInstanceContainerLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowNodeInstanceContainerLogWithOptions(request, runtime);
    }

    public DescribeFlowNodeInstanceLauncherLogResponse describeFlowNodeInstanceLauncherLogWithOptions(DescribeFlowNodeInstanceLauncherLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndTime", request.endTime);
        query.put("Length", request.length);
        query.put("Lines", request.lines);
        query.put("NodeInstanceId", request.nodeInstanceId);
        query.put("Offset", request.offset);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        query.put("Reverse", request.reverse);
        query.put("Start", request.start);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFlowNodeInstanceLauncherLog"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFlowNodeInstanceLauncherLogResponse());
    }

    public DescribeFlowNodeInstanceLauncherLogResponse describeFlowNodeInstanceLauncherLog(DescribeFlowNodeInstanceLauncherLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowNodeInstanceLauncherLogWithOptions(request, runtime);
    }

    public DescribeFlowProjectResponse describeFlowProjectWithOptions(DescribeFlowProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFlowProject"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFlowProjectResponse());
    }

    public DescribeFlowProjectResponse describeFlowProject(DescribeFlowProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowProjectWithOptions(request, runtime);
    }

    public DescribeFlowProjectClusterSettingResponse describeFlowProjectClusterSettingWithOptions(DescribeFlowProjectClusterSettingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterId", request.clusterId);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFlowProjectClusterSetting"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFlowProjectClusterSettingResponse());
    }

    public DescribeFlowProjectClusterSettingResponse describeFlowProjectClusterSetting(DescribeFlowProjectClusterSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowProjectClusterSettingWithOptions(request, runtime);
    }

    public DescribeFlowSLAResponse describeFlowSLAWithOptions(DescribeFlowSLARequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("From", request.from);
        query.put("Metrics", request.metrics);
        query.put("PeriodType", request.periodType);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("To", request.to);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFlowSLA"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFlowSLAResponse());
    }

    public DescribeFlowSLAResponse describeFlowSLA(DescribeFlowSLARequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowSLAWithOptions(request, runtime);
    }

    public DescribeFlowVariableCollectionResponse describeFlowVariableCollectionWithOptions(DescribeFlowVariableCollectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EntityId", request.entityId);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFlowVariableCollection"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFlowVariableCollectionResponse());
    }

    public DescribeFlowVariableCollectionResponse describeFlowVariableCollection(DescribeFlowVariableCollectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowVariableCollectionWithOptions(request, runtime);
    }

    public GetFlowAuditLogsResponse getFlowAuditLogsWithOptions(GetFlowAuditLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CurrentSize", request.currentSize);
        query.put("EntityGroupId", request.entityGroupId);
        query.put("EntityId", request.entityId);
        query.put("EntityType", request.entityType);
        query.put("Limit", request.limit);
        query.put("Operation", request.operation);
        query.put("OperatorId", request.operatorId);
        query.put("OrderField", request.orderField);
        query.put("OrderMode", request.orderMode);
        query.put("PageCount", request.pageCount);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("Status", request.status);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFlowAuditLogs"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFlowAuditLogsResponse());
    }

    public GetFlowAuditLogsResponse getFlowAuditLogs(GetFlowAuditLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFlowAuditLogsWithOptions(request, runtime);
    }

    public KillFlowResponse killFlowWithOptions(KillFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FlowInstanceId", request.flowInstanceId);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "KillFlow"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new KillFlowResponse());
    }

    public KillFlowResponse killFlow(KillFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.killFlowWithOptions(request, runtime);
    }

    public KillFlowJobResponse killFlowJobWithOptions(KillFlowJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("JobInstanceId", request.jobInstanceId);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "KillFlowJob"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new KillFlowJobResponse());
    }

    public KillFlowJobResponse killFlowJob(KillFlowJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.killFlowJobWithOptions(request, runtime);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusters"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClustersResponse());
    }

    public ListClustersResponse listClusters(ListClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClustersWithOptions(request, runtime);
    }

    public ListFlowResponse listFlowWithOptions(ListFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterId", request.clusterId);
        query.put("Id", request.id);
        query.put("JobId", request.jobId);
        query.put("Name", request.name);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("Periodic", request.periodic);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        query.put("Status", request.status);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlow"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowResponse());
    }

    public ListFlowResponse listFlow(ListFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowWithOptions(request, runtime);
    }

    public ListFlowClusterResponse listFlowClusterWithOptions(ListFlowClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlowCluster"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowClusterResponse());
    }

    public ListFlowClusterResponse listFlowCluster(ListFlowClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowClusterWithOptions(request, runtime);
    }

    public ListFlowClusterAllResponse listFlowClusterAllWithOptions(ListFlowClusterAllRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProductType", request.productType);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlowClusterAll"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowClusterAllResponse());
    }

    public ListFlowClusterAllResponse listFlowClusterAll(ListFlowClusterAllRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowClusterAllWithOptions(request, runtime);
    }

    public ListFlowClusterAllHostsResponse listFlowClusterAllHostsWithOptions(ListFlowClusterAllHostsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterId", request.clusterId);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlowClusterAllHosts"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowClusterAllHostsResponse());
    }

    public ListFlowClusterAllHostsResponse listFlowClusterAllHosts(ListFlowClusterAllHostsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowClusterAllHostsWithOptions(request, runtime);
    }

    public ListFlowClusterHostResponse listFlowClusterHostWithOptions(ListFlowClusterHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterId", request.clusterId);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlowClusterHost"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowClusterHostResponse());
    }

    public ListFlowClusterHostResponse listFlowClusterHost(ListFlowClusterHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowClusterHostWithOptions(request, runtime);
    }

    public ListFlowEntitySnapshotResponse listFlowEntitySnapshotWithOptions(ListFlowEntitySnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CommitterId", request.committerId);
        query.put("CurrentSize", request.currentSize);
        query.put("EntityGroupId", request.entityGroupId);
        query.put("EntityId", request.entityId);
        query.put("EntityType", request.entityType);
        query.put("Limit", request.limit);
        query.put("OrderField", request.orderField);
        query.put("OrderMode", request.orderMode);
        query.put("PageCount", request.pageCount);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("Revision", request.revision);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlowEntitySnapshot"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowEntitySnapshotResponse());
    }

    public ListFlowEntitySnapshotResponse listFlowEntitySnapshot(ListFlowEntitySnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowEntitySnapshotWithOptions(request, runtime);
    }

    public ListFlowInstanceResponse listFlowInstanceWithOptions(ListFlowInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FlowId", request.flowId);
        query.put("FlowName", request.flowName);
        query.put("Id", request.id);
        query.put("InstanceId", request.instanceId);
        query.put("OrderBy", request.orderBy);
        query.put("OrderType", request.orderType);
        query.put("Owner", request.owner);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        query.put("StatusList", request.statusList);
        query.put("TimeRange", request.timeRange);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlowInstance"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowInstanceResponse());
    }

    public ListFlowInstanceResponse listFlowInstance(ListFlowInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowInstanceWithOptions(request, runtime);
    }

    public ListFlowJobHistoryResponse listFlowJobHistoryWithOptions(ListFlowJobHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Id", request.id);
        query.put("InstanceId", request.instanceId);
        query.put("JobType", request.jobType);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        query.put("StatusList", request.statusList);
        query.put("TimeRange", request.timeRange);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlowJobHistory"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowJobHistoryResponse());
    }

    public ListFlowJobHistoryResponse listFlowJobHistory(ListFlowJobHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowJobHistoryWithOptions(request, runtime);
    }

    public ListFlowJobsResponse listFlowJobsWithOptions(ListFlowJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Adhoc", request.adhoc);
        query.put("Id", request.id);
        query.put("Name", request.name);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlowJobs"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowJobsResponse());
    }

    public ListFlowJobsResponse listFlowJobs(ListFlowJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowJobsWithOptions(request, runtime);
    }

    public ListFlowNodeInstanceContainerStatusResponse listFlowNodeInstanceContainerStatusWithOptions(ListFlowNodeInstanceContainerStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("NodeInstanceId", request.nodeInstanceId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlowNodeInstanceContainerStatus"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowNodeInstanceContainerStatusResponse());
    }

    public ListFlowNodeInstanceContainerStatusResponse listFlowNodeInstanceContainerStatus(ListFlowNodeInstanceContainerStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowNodeInstanceContainerStatusWithOptions(request, runtime);
    }

    public ListFlowNodeSqlResultResponse listFlowNodeSqlResultWithOptions(ListFlowNodeSqlResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Length", request.length);
        query.put("NodeInstanceId", request.nodeInstanceId);
        query.put("Offset", request.offset);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        query.put("SqlIndex", request.sqlIndex);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlowNodeSqlResult"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowNodeSqlResultResponse());
    }

    public ListFlowNodeSqlResultResponse listFlowNodeSqlResult(ListFlowNodeSqlResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowNodeSqlResultWithOptions(request, runtime);
    }

    public ListFlowProjectClusterSettingResponse listFlowProjectClusterSettingWithOptions(ListFlowProjectClusterSettingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlowProjectClusterSetting"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowProjectClusterSettingResponse());
    }

    public ListFlowProjectClusterSettingResponse listFlowProjectClusterSetting(ListFlowProjectClusterSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowProjectClusterSettingWithOptions(request, runtime);
    }

    public ListFlowProjectUserResponse listFlowProjectUserWithOptions(ListFlowProjectUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlowProjectUser"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowProjectUserResponse());
    }

    public ListFlowProjectUserResponse listFlowProjectUser(ListFlowProjectUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowProjectUserWithOptions(request, runtime);
    }

    public ListFlowProjectsResponse listFlowProjectsWithOptions(ListFlowProjectsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Name", request.name);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ProductType", request.productType);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlowProjects"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowProjectsResponse());
    }

    public ListFlowProjectsResponse listFlowProjects(ListFlowProjectsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowProjectsWithOptions(request, runtime);
    }

    public ListFlowsResponse listFlowsWithOptions(ListFlowsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterId", request.clusterId);
        query.put("Id", request.id);
        query.put("JobId", request.jobId);
        query.put("Name", request.name);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("Periodic", request.periodic);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        query.put("Status", request.status);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlows"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowsResponse());
    }

    public ListFlowsResponse listFlows(ListFlowsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowsWithOptions(request, runtime);
    }

    public ListMainVersionsResponse listMainVersionsWithOptions(ListMainVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMainVersions"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMainVersionsResponse());
    }

    public ListMainVersionsResponse listMainVersions(ListMainVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMainVersionsWithOptions(request, runtime);
    }

    public ModifyFlowResponse modifyFlowWithOptions(ModifyFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AlertConf", request.alertConf);
        query.put("AlertDingDingGroupBizId", request.alertDingDingGroupBizId);
        query.put("AlertUserGroupBizId", request.alertUserGroupBizId);
        query.put("Application", request.application);
        query.put("ClusterId", request.clusterId);
        query.put("CreateCluster", request.createCluster);
        query.put("CronExpr", request.cronExpr);
        query.put("Description", request.description);
        query.put("EndSchedule", request.endSchedule);
        query.put("HostName", request.hostName);
        query.put("Id", request.id);
        query.put("Name", request.name);
        query.put("ParentCategory", request.parentCategory);
        query.put("ParentFlowList", request.parentFlowList);
        query.put("Periodic", request.periodic);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        query.put("StartSchedule", request.startSchedule);
        query.put("Status", request.status);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFlow"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFlowResponse());
    }

    public ModifyFlowResponse modifyFlow(ModifyFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyFlowWithOptions(request, runtime);
    }

    public ModifyFlowCategoryResponse modifyFlowCategoryWithOptions(ModifyFlowCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Id", request.id);
        query.put("Name", request.name);
        query.put("ParentId", request.parentId);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFlowCategory"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFlowCategoryResponse());
    }

    public ModifyFlowCategoryResponse modifyFlowCategory(ModifyFlowCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyFlowCategoryWithOptions(request, runtime);
    }

    public ModifyFlowForWebResponse modifyFlowForWebWithOptions(ModifyFlowForWebRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AlertConf", request.alertConf);
        query.put("AlertDingDingGroupBizId", request.alertDingDingGroupBizId);
        query.put("AlertUserGroupBizId", request.alertUserGroupBizId);
        query.put("ClusterId", request.clusterId);
        query.put("CreateCluster", request.createCluster);
        query.put("CronExpr", request.cronExpr);
        query.put("Description", request.description);
        query.put("EndSchedule", request.endSchedule);
        query.put("Graph", request.graph);
        query.put("HostName", request.hostName);
        query.put("Id", request.id);
        query.put("Name", request.name);
        query.put("Namespace", request.namespace);
        query.put("ParentCategory", request.parentCategory);
        query.put("ParentFlowList", request.parentFlowList);
        query.put("Periodic", request.periodic);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        query.put("StartSchedule", request.startSchedule);
        query.put("Status", request.status);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFlowForWeb"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFlowForWebResponse());
    }

    public ModifyFlowForWebResponse modifyFlowForWeb(ModifyFlowForWebRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyFlowForWebWithOptions(request, runtime);
    }

    public ModifyFlowJobResponse modifyFlowJobWithOptions(ModifyFlowJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AlertConf", request.alertConf);
        query.put("ClusterId", request.clusterId);
        query.put("CustomVariables", request.customVariables);
        query.put("Description", request.description);
        query.put("EnvConf", request.envConf);
        query.put("FailAct", request.failAct);
        query.put("Id", request.id);
        query.put("KnoxPassword", request.knoxPassword);
        query.put("KnoxUser", request.knoxUser);
        query.put("Mode", request.mode);
        query.put("MonitorConf", request.monitorConf);
        query.put("Name", request.name);
        query.put("ParamConf", request.paramConf);
        query.put("Params", request.params);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        query.put("ResourceList", request.resourceList);
        query.put("RetryPolicy", request.retryPolicy);
        query.put("RunConf", request.runConf);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFlowJob"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFlowJobResponse());
    }

    public ModifyFlowJobResponse modifyFlowJob(ModifyFlowJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyFlowJobWithOptions(request, runtime);
    }

    public ModifyFlowProjectResponse modifyFlowProjectWithOptions(ModifyFlowProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Description", request.description);
        query.put("Name", request.name);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFlowProject"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFlowProjectResponse());
    }

    public ModifyFlowProjectResponse modifyFlowProject(ModifyFlowProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyFlowProjectWithOptions(request, runtime);
    }

    public ModifyFlowProjectClusterSettingResponse modifyFlowProjectClusterSettingWithOptions(ModifyFlowProjectClusterSettingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterId", request.clusterId);
        query.put("DefaultQueue", request.defaultQueue);
        query.put("DefaultUser", request.defaultUser);
        query.put("HostList", request.hostList);
        query.put("ProjectId", request.projectId);
        query.put("QueueList", request.queueList);
        query.put("RegionId", request.regionId);
        query.put("UserList", request.userList);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFlowProjectClusterSetting"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFlowProjectClusterSettingResponse());
    }

    public ModifyFlowProjectClusterSettingResponse modifyFlowProjectClusterSetting(ModifyFlowProjectClusterSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyFlowProjectClusterSettingWithOptions(request, runtime);
    }

    public ModifyFlowVariableCollectionResponse modifyFlowVariableCollectionWithOptions(ModifyFlowVariableCollectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Data", request.data);
        query.put("RegionId", request.regionId);
        query.put("ResourceGroupId", request.resourceGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFlowVariableCollection"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFlowVariableCollectionResponse());
    }

    public ModifyFlowVariableCollectionResponse modifyFlowVariableCollection(ModifyFlowVariableCollectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyFlowVariableCollectionWithOptions(request, runtime);
    }

    public ReleaseClusterResponse releaseClusterWithOptions(ReleaseClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ForceRelease", request.forceRelease);
        query.put("Id", request.id);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseCluster"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseClusterResponse());
    }

    public ReleaseClusterResponse releaseCluster(ReleaseClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseClusterWithOptions(request, runtime);
    }

    public RerunFlowResponse rerunFlowWithOptions(RerunFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FlowInstanceId", request.flowInstanceId);
        query.put("ProjectId", request.projectId);
        query.put("ReRunFail", request.reRunFail);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RerunFlow"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RerunFlowResponse());
    }

    public RerunFlowResponse rerunFlow(RerunFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rerunFlowWithOptions(request, runtime);
    }

    public RestoreFlowEntitySnapshotResponse restoreFlowEntitySnapshotWithOptions(RestoreFlowEntitySnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EntityId", request.entityId);
        query.put("EntityType", request.entityType);
        query.put("OperatorId", request.operatorId);
        query.put("RegionId", request.regionId);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("Revision", request.revision);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestoreFlowEntitySnapshot"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestoreFlowEntitySnapshotResponse());
    }

    public RestoreFlowEntitySnapshotResponse restoreFlowEntitySnapshot(RestoreFlowEntitySnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restoreFlowEntitySnapshotWithOptions(request, runtime);
    }

    public ResumeFlowResponse resumeFlowWithOptions(ResumeFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FlowInstanceId", request.flowInstanceId);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeFlow"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeFlowResponse());
    }

    public ResumeFlowResponse resumeFlow(ResumeFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resumeFlowWithOptions(request, runtime);
    }

    public StartFlowResponse startFlowWithOptions(StartFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FlowInstanceId", request.flowInstanceId);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartFlow"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartFlowResponse());
    }

    public StartFlowResponse startFlow(StartFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startFlowWithOptions(request, runtime);
    }

    public SubmitFlowResponse submitFlowWithOptions(SubmitFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Conf", request.conf);
        query.put("FlowId", request.flowId);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitFlow"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitFlowResponse());
    }

    public SubmitFlowResponse submitFlow(SubmitFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitFlowWithOptions(request, runtime);
    }

    public SubmitFlowJobResponse submitFlowJobWithOptions(SubmitFlowJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterId", request.clusterId);
        query.put("Conf", request.conf);
        query.put("HostName", request.hostName);
        query.put("JobId", request.jobId);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitFlowJob"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitFlowJobResponse());
    }

    public SubmitFlowJobResponse submitFlowJob(SubmitFlowJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitFlowJobWithOptions(request, runtime);
    }

    public SuspendFlowResponse suspendFlowWithOptions(SuspendFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FlowInstanceId", request.flowInstanceId);
        query.put("ProjectId", request.projectId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendFlow"),
            new TeaPair("version", "2020-06-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendFlowResponse());
    }

    public SuspendFlowResponse suspendFlow(SuspendFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.suspendFlowWithOptions(request, runtime);
    }
}
