// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531;

import com.aliyun.tea.*;
import com.aliyun.mse20190531.models.*;
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
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("mse", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddMockRuleResponse addMockRuleWithOptions(AddMockRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConsumerAppIds", request.consumerAppIds);
        query.put("DubboMockItems", request.dubboMockItems);
        query.put("Enable", request.enable);
        query.put("ExtraJson", request.extraJson);
        query.put("MockType", request.mockType);
        query.put("Name", request.name);
        query.put("ProviderAppId", request.providerAppId);
        query.put("ProviderAppName", request.providerAppName);
        query.put("Region", request.region);
        query.put("ScMockItems", request.scMockItems);
        query.put("Source", request.source);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddMockRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddMockRuleResponse());
    }

    public AddMockRuleResponse addMockRule(AddMockRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addMockRuleWithOptions(request, runtime);
    }

    public AddServiceSourceResponse addServiceSourceWithOptions(AddServiceSourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Address", request.address);
        query.put("GatewayId", request.gatewayId);
        query.put("GatewayUniqueId", request.gatewayUniqueId);
        query.put("Info1", request.info1);
        query.put("Info2", request.info2);
        query.put("Name", request.name);
        query.put("Source", request.source);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddServiceSource"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddServiceSourceResponse());
    }

    public AddServiceSourceResponse addServiceSource(AddServiceSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addServiceSourceWithOptions(request, runtime);
    }

    public CloneNacosConfigResponse cloneNacosConfigWithOptions(CloneNacosConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Ids", request.ids);
        query.put("InstanceId", request.instanceId);
        query.put("OriginNamespaceId", request.originNamespaceId);
        query.put("Policy", request.policy);
        query.put("TargetNamespaceId", request.targetNamespaceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloneNacosConfig"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloneNacosConfigResponse());
    }

    public CloneNacosConfigResponse cloneNacosConfig(CloneNacosConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cloneNacosConfigWithOptions(request, runtime);
    }

    public CreateAlarmRuleResponse createAlarmRuleWithOptions(CreateAlarmRuleRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAlarmRuleShrinkRequest request = new CreateAlarmRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.alertWay)) {
            request.alertWayShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.alertWay, "AlertWay", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.contactGroupIds)) {
            request.contactGroupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.contactGroupIds, "ContactGroupIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Aggregates", request.aggregates);
        query.put("AlarmAliasName", request.alarmAliasName);
        query.put("AlarmItem", request.alarmItem);
        query.put("AlertWay", request.alertWayShrink);
        query.put("ContactGroupIds", request.contactGroupIdsShrink);
        query.put("InstanceId", request.instanceId);
        query.put("NValue", request.NValue);
        query.put("Operator", request.operator);
        query.put("Value", request.value);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAlarmRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAlarmRuleResponse());
    }

    public CreateAlarmRuleResponse createAlarmRule(CreateAlarmRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAlarmRuleWithOptions(request, runtime);
    }

    public CreateApplicationResponse createApplicationWithOptions(CreateApplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("ExtraInfo", request.extraInfo);
        query.put("Language", request.language);
        query.put("Region", request.region);
        query.put("Source", request.source);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApplication"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApplicationResponse());
    }

    public CreateApplicationResponse createApplication(CreateApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createApplicationWithOptions(request, runtime);
    }

    public CreateClusterResponse createClusterWithOptions(CreateClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterSpecification", request.clusterSpecification);
        query.put("ClusterType", request.clusterType);
        query.put("ClusterVersion", request.clusterVersion);
        query.put("ConnectionType", request.connectionType);
        query.put("DiskCapacity", request.diskCapacity);
        query.put("DiskType", request.diskType);
        query.put("InstanceCount", request.instanceCount);
        query.put("MseVersion", request.mseVersion);
        query.put("NetType", request.netType);
        query.put("PrivateSlbSpecification", request.privateSlbSpecification);
        query.put("PubNetworkFlow", request.pubNetworkFlow);
        query.put("PubSlbSpecification", request.pubSlbSpecification);
        query.put("Region", request.region);
        query.put("RequestPars", request.requestPars);
        query.put("VSwitchId", request.vSwitchId);
        query.put("VpcId", request.vpcId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCluster"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClusterResponse());
    }

    public CreateClusterResponse createCluster(CreateClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createClusterWithOptions(request, runtime);
    }

    public CreateEngineNamespaceResponse createEngineNamespaceWithOptions(CreateEngineNamespaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterId", request.clusterId);
        query.put("Desc", request.desc);
        query.put("InstanceId", request.instanceId);
        query.put("Name", request.name);
        query.put("ServiceCount", request.serviceCount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEngineNamespace"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEngineNamespaceResponse());
    }

    public CreateEngineNamespaceResponse createEngineNamespace(CreateEngineNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEngineNamespaceWithOptions(request, runtime);
    }

    public CreateGovernanceKubernetesClusterResponse createGovernanceKubernetesClusterWithOptions(CreateGovernanceKubernetesClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterId", request.clusterId);
        query.put("ClusterName", request.clusterName);
        query.put("K8sVersion", request.k8sVersion);
        query.put("NameSpaceInfos", request.nameSpaceInfos);
        query.put("PilotStartTime", request.pilotStartTime);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGovernanceKubernetesCluster"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGovernanceKubernetesClusterResponse());
    }

    public CreateGovernanceKubernetesClusterResponse createGovernanceKubernetesCluster(CreateGovernanceKubernetesClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGovernanceKubernetesClusterWithOptions(request, runtime);
    }

    public CreateNacosConfigResponse createNacosConfigWithOptions(CreateNacosConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("BetaIps", request.betaIps);
        query.put("Content", request.content);
        query.put("DataId", request.dataId);
        query.put("Desc", request.desc);
        query.put("Group", request.group);
        query.put("InstanceId", request.instanceId);
        query.put("NamespaceId", request.namespaceId);
        query.put("Tags", request.tags);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNacosConfig"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNacosConfigResponse());
    }

    public CreateNacosConfigResponse createNacosConfig(CreateNacosConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNacosConfigWithOptions(request, runtime);
    }

    public CreateZnodeResponse createZnodeWithOptions(CreateZnodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterId", request.clusterId);
        query.put("Data", request.data);
        query.put("Path", request.path);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateZnode"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateZnodeResponse());
    }

    public CreateZnodeResponse createZnode(CreateZnodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createZnodeWithOptions(request, runtime);
    }

    public DeleteAlarmRuleResponse deleteAlarmRuleWithOptions(DeleteAlarmRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AlarmRuleId", request.alarmRuleId);
        query.put("RequestPars", request.requestPars);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAlarmRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAlarmRuleResponse());
    }

    public DeleteAlarmRuleResponse deleteAlarmRule(DeleteAlarmRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAlarmRuleWithOptions(request, runtime);
    }

    public DeleteClusterResponse deleteClusterWithOptions(DeleteClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCluster"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClusterResponse());
    }

    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteClusterWithOptions(request, runtime);
    }

    public DeleteEngineNamespaceResponse deleteEngineNamespaceWithOptions(DeleteEngineNamespaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterId", request.clusterId);
        query.put("Id", request.id);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEngineNamespace"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEngineNamespaceResponse());
    }

    public DeleteEngineNamespaceResponse deleteEngineNamespace(DeleteEngineNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEngineNamespaceWithOptions(request, runtime);
    }

    public DeleteNacosConfigResponse deleteNacosConfigWithOptions(DeleteNacosConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Beta", request.beta);
        query.put("DataId", request.dataId);
        query.put("Group", request.group);
        query.put("InstanceId", request.instanceId);
        query.put("NamespaceId", request.namespaceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNacosConfig"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNacosConfigResponse());
    }

    public DeleteNacosConfigResponse deleteNacosConfig(DeleteNacosConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNacosConfigWithOptions(request, runtime);
    }

    public DeleteNacosConfigsResponse deleteNacosConfigsWithOptions(DeleteNacosConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Ids", request.ids);
        query.put("InstanceId", request.instanceId);
        query.put("NamespaceId", request.namespaceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNacosConfigs"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNacosConfigsResponse());
    }

    public DeleteNacosConfigsResponse deleteNacosConfigs(DeleteNacosConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNacosConfigsWithOptions(request, runtime);
    }

    public DeleteNacosServiceResponse deleteNacosServiceWithOptions(DeleteNacosServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GroupName", request.groupName);
        query.put("InstanceId", request.instanceId);
        query.put("NamespaceId", request.namespaceId);
        query.put("ServiceName", request.serviceName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNacosService"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNacosServiceResponse());
    }

    public DeleteNacosServiceResponse deleteNacosService(DeleteNacosServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNacosServiceWithOptions(request, runtime);
    }

    public DeleteZnodeResponse deleteZnodeWithOptions(DeleteZnodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterId", request.clusterId);
        query.put("Path", request.path);
        query.put("RequestPars", request.requestPars);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteZnode"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteZnodeResponse());
    }

    public DeleteZnodeResponse deleteZnode(DeleteZnodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteZnodeWithOptions(request, runtime);
    }

    public ExportNacosConfigResponse exportNacosConfigWithOptions(ExportNacosConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("DataId", request.dataId);
        query.put("Group", request.group);
        query.put("Ids", request.ids);
        query.put("InstanceId", request.instanceId);
        query.put("NamespaceId", request.namespaceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportNacosConfig"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportNacosConfigResponse());
    }

    public ExportNacosConfigResponse exportNacosConfig(ExportNacosConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exportNacosConfigWithOptions(request, runtime);
    }

    public GetEngineNamepaceResponse getEngineNamepaceWithOptions(GetEngineNamepaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterId", request.clusterId);
        query.put("Id", request.id);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEngineNamepace"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEngineNamepaceResponse());
    }

    public GetEngineNamepaceResponse getEngineNamepace(GetEngineNamepaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEngineNamepaceWithOptions(request, runtime);
    }

    public GetGatewayResponse getGatewayWithOptions(GetGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGateway"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGatewayResponse());
    }

    public GetGatewayResponse getGateway(GetGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGatewayWithOptions(request, runtime);
    }

    public GetGatewayOptionResponse getGatewayOptionWithOptions(GetGatewayOptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGatewayOption"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGatewayOptionResponse());
    }

    public GetGatewayOptionResponse getGatewayOption(GetGatewayOptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGatewayOptionWithOptions(request, runtime);
    }

    public GetGovernanceKubernetesClusterResponse getGovernanceKubernetesClusterWithOptions(GetGovernanceKubernetesClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterId", request.clusterId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGovernanceKubernetesCluster"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGovernanceKubernetesClusterResponse());
    }

    public GetGovernanceKubernetesClusterResponse getGovernanceKubernetesCluster(GetGovernanceKubernetesClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGovernanceKubernetesClusterWithOptions(request, runtime);
    }

    public GetGovernanceKubernetesClusterListResponse getGovernanceKubernetesClusterListWithOptions(GetGovernanceKubernetesClusterListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterId", request.clusterId);
        query.put("ClusterName", request.clusterName);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGovernanceKubernetesClusterList"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGovernanceKubernetesClusterListResponse());
    }

    public GetGovernanceKubernetesClusterListResponse getGovernanceKubernetesClusterList(GetGovernanceKubernetesClusterListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGovernanceKubernetesClusterListWithOptions(request, runtime);
    }

    public GetImageResponse getImageWithOptions(GetImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("VersionCode", request.versionCode);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImage"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageResponse());
    }

    public GetImageResponse getImage(GetImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getImageWithOptions(request, runtime);
    }

    public GetImportFileUrlResponse getImportFileUrlWithOptions(GetImportFileUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ContentType", request.contentType);
        query.put("InstanceId", request.instanceId);
        query.put("NamespaceId", request.namespaceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImportFileUrl"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImportFileUrlResponse());
    }

    public GetImportFileUrlResponse getImportFileUrl(GetImportFileUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getImportFileUrlWithOptions(request, runtime);
    }

    public GetMseFeatureSwitchResponse getMseFeatureSwitchWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMseFeatureSwitch"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMseFeatureSwitchResponse());
    }

    public GetMseFeatureSwitchResponse getMseFeatureSwitch() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMseFeatureSwitchWithOptions(runtime);
    }

    public GetNacosConfigResponse getNacosConfigWithOptions(GetNacosConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Beta", request.beta);
        query.put("DataId", request.dataId);
        query.put("Group", request.group);
        query.put("InstanceId", request.instanceId);
        query.put("NamespaceId", request.namespaceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNacosConfig"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNacosConfigResponse());
    }

    public GetNacosConfigResponse getNacosConfig(GetNacosConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNacosConfigWithOptions(request, runtime);
    }

    public GetNacosHistoryConfigResponse getNacosHistoryConfigWithOptions(GetNacosHistoryConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DataId", request.dataId);
        query.put("Group", request.group);
        query.put("InstanceId", request.instanceId);
        query.put("NamespaceId", request.namespaceId);
        query.put("Nid", request.nid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNacosHistoryConfig"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNacosHistoryConfigResponse());
    }

    public GetNacosHistoryConfigResponse getNacosHistoryConfig(GetNacosHistoryConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNacosHistoryConfigWithOptions(request, runtime);
    }

    public GetOverviewResponse getOverviewWithOptions(GetOverviewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Period", request.period);
        query.put("Region", request.region);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOverview"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOverviewResponse());
    }

    public GetOverviewResponse getOverview(GetOverviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOverviewWithOptions(request, runtime);
    }

    public ImportNacosConfigResponse importNacosConfigWithOptions(ImportNacosConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FileUrl", request.fileUrl);
        query.put("InstanceId", request.instanceId);
        query.put("NamespaceId", request.namespaceId);
        query.put("Policy", request.policy);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportNacosConfig"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportNacosConfigResponse());
    }

    public ImportNacosConfigResponse importNacosConfig(ImportNacosConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importNacosConfigWithOptions(request, runtime);
    }

    public ListAlarmContactGroupsResponse listAlarmContactGroupsWithOptions(ListAlarmContactGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlarmContactGroups"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlarmContactGroupsResponse());
    }

    public ListAlarmContactGroupsResponse listAlarmContactGroups(ListAlarmContactGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAlarmContactGroupsWithOptions(request, runtime);
    }

    public ListAlarmHistoriesResponse listAlarmHistoriesWithOptions(ListAlarmHistoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlarmHistories"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlarmHistoriesResponse());
    }

    public ListAlarmHistoriesResponse listAlarmHistories(ListAlarmHistoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAlarmHistoriesWithOptions(request, runtime);
    }

    public ListAlarmItemsResponse listAlarmItemsWithOptions(ListAlarmItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlarmItems"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlarmItemsResponse());
    }

    public ListAlarmItemsResponse listAlarmItems(ListAlarmItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAlarmItemsWithOptions(request, runtime);
    }

    public ListAlarmRulesResponse listAlarmRulesWithOptions(ListAlarmRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlarmRules"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlarmRulesResponse());
    }

    public ListAlarmRulesResponse listAlarmRules(ListAlarmRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAlarmRulesWithOptions(request, runtime);
    }

    public ListAnsInstancesResponse listAnsInstancesWithOptions(ListAnsInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAnsInstances"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAnsInstancesResponse());
    }

    public ListAnsInstancesResponse listAnsInstances(ListAnsInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAnsInstancesWithOptions(request, runtime);
    }

    public ListAnsServiceClustersResponse listAnsServiceClustersWithOptions(ListAnsServiceClustersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAnsServiceClusters"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAnsServiceClustersResponse());
    }

    public ListAnsServiceClustersResponse listAnsServiceClusters(ListAnsServiceClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAnsServiceClustersWithOptions(request, runtime);
    }

    public ListAnsServicesResponse listAnsServicesWithOptions(ListAnsServicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAnsServices"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAnsServicesResponse());
    }

    public ListAnsServicesResponse listAnsServices(ListAnsServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAnsServicesWithOptions(request, runtime);
    }

    public ListClusterConnectionTypesResponse listClusterConnectionTypesWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterConnectionTypes"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterConnectionTypesResponse());
    }

    public ListClusterConnectionTypesResponse listClusterConnectionTypes() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterConnectionTypesWithOptions(runtime);
    }

    public ListClusterTypesResponse listClusterTypesWithOptions(ListClusterTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterTypes"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterTypesResponse());
    }

    public ListClusterTypesResponse listClusterTypes(ListClusterTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterTypesWithOptions(request, runtime);
    }

    public ListClusterVersionsResponse listClusterVersionsWithOptions(ListClusterVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterType", request.clusterType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterVersions"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterVersionsResponse());
    }

    public ListClusterVersionsResponse listClusterVersions(ListClusterVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterVersionsWithOptions(request, runtime);
    }

    public ListClustersResponse listClustersWithOptions(ListClustersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusters"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
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

    public ListEngineNamespacesResponse listEngineNamespacesWithOptions(ListEngineNamespacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEngineNamespaces"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEngineNamespacesResponse());
    }

    public ListEngineNamespacesResponse listEngineNamespaces(ListEngineNamespacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEngineNamespacesWithOptions(request, runtime);
    }

    public ListEurekaInstancesResponse listEurekaInstancesWithOptions(ListEurekaInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEurekaInstances"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEurekaInstancesResponse());
    }

    public ListEurekaInstancesResponse listEurekaInstances(ListEurekaInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEurekaInstancesWithOptions(request, runtime);
    }

    public ListEurekaServicesResponse listEurekaServicesWithOptions(ListEurekaServicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEurekaServices"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEurekaServicesResponse());
    }

    public ListEurekaServicesResponse listEurekaServices(ListEurekaServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEurekaServicesWithOptions(request, runtime);
    }

    public ListGatewayResponse listGatewayWithOptions(ListGatewayRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListGatewayShrinkRequest request = new ListGatewayShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.filterParams))) {
            request.filterParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.filterParams), "FilterParams", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DescSort", request.descSort);
        query.put("FilterParams", request.filterParamsShrink);
        query.put("OrderItem", request.orderItem);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGateway"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGatewayResponse());
    }

    public ListGatewayResponse listGateway(ListGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listGatewayWithOptions(request, runtime);
    }

    public ListListenersByConfigResponse listListenersByConfigWithOptions(ListListenersByConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DataId", request.dataId);
        query.put("Group", request.group);
        query.put("InstanceId", request.instanceId);
        query.put("NamespaceId", request.namespaceId);
        query.put("RequestPars", request.requestPars);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListListenersByConfig"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListListenersByConfigResponse());
    }

    public ListListenersByConfigResponse listListenersByConfig(ListListenersByConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listListenersByConfigWithOptions(request, runtime);
    }

    public ListListenersByIpResponse listListenersByIpWithOptions(ListListenersByIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("Ip", request.ip);
        query.put("NamespaceId", request.namespaceId);
        query.put("RequestPars", request.requestPars);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListListenersByIp"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListListenersByIpResponse());
    }

    public ListListenersByIpResponse listListenersByIp(ListListenersByIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listListenersByIpWithOptions(request, runtime);
    }

    public ListNacosConfigsResponse listNacosConfigsWithOptions(ListNacosConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("DataId", request.dataId);
        query.put("Group", request.group);
        query.put("InstanceId", request.instanceId);
        query.put("NamespaceId", request.namespaceId);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("RegionId", request.regionId);
        query.put("RequestPars", request.requestPars);
        query.put("Tags", request.tags);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNacosConfigs"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNacosConfigsResponse());
    }

    public ListNacosConfigsResponse listNacosConfigs(ListNacosConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNacosConfigsWithOptions(request, runtime);
    }

    public ListNacosHistoryConfigsResponse listNacosHistoryConfigsWithOptions(ListNacosHistoryConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DataId", request.dataId);
        query.put("Group", request.group);
        query.put("InstanceId", request.instanceId);
        query.put("NamespaceId", request.namespaceId);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("RegionId", request.regionId);
        query.put("RequestPars", request.requestPars);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNacosHistoryConfigs"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNacosHistoryConfigsResponse());
    }

    public ListNacosHistoryConfigsResponse listNacosHistoryConfigs(ListNacosHistoryConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNacosHistoryConfigsWithOptions(request, runtime);
    }

    public ListZnodeChildrenResponse listZnodeChildrenWithOptions(ListZnodeChildrenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListZnodeChildren"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListZnodeChildrenResponse());
    }

    public ListZnodeChildrenResponse listZnodeChildren(ListZnodeChildrenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listZnodeChildrenWithOptions(request, runtime);
    }

    public ModifyGovernanceKubernetesClusterResponse modifyGovernanceKubernetesClusterWithOptions(ModifyGovernanceKubernetesClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterId", request.clusterId);
        query.put("NamespaceInfos", request.namespaceInfos);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyGovernanceKubernetesCluster"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyGovernanceKubernetesClusterResponse());
    }

    public ModifyGovernanceKubernetesClusterResponse modifyGovernanceKubernetesCluster(ModifyGovernanceKubernetesClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyGovernanceKubernetesClusterWithOptions(request, runtime);
    }

    public QueryBusinessLocationsResponse queryBusinessLocationsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBusinessLocations"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBusinessLocationsResponse());
    }

    public QueryBusinessLocationsResponse queryBusinessLocations() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryBusinessLocationsWithOptions(runtime);
    }

    public QueryClusterDetailResponse queryClusterDetailWithOptions(QueryClusterDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("OrderId", request.orderId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryClusterDetail"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryClusterDetailResponse());
    }

    public QueryClusterDetailResponse queryClusterDetail(QueryClusterDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryClusterDetailWithOptions(request, runtime);
    }

    public QueryClusterDiskSpecificationResponse queryClusterDiskSpecificationWithOptions(QueryClusterDiskSpecificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterType", request.clusterType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryClusterDiskSpecification"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryClusterDiskSpecificationResponse());
    }

    public QueryClusterDiskSpecificationResponse queryClusterDiskSpecification(QueryClusterDiskSpecificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryClusterDiskSpecificationWithOptions(request, runtime);
    }

    public QueryClusterSpecificationResponse queryClusterSpecificationWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryClusterSpecification"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryClusterSpecificationResponse());
    }

    public QueryClusterSpecificationResponse queryClusterSpecification() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryClusterSpecificationWithOptions(runtime);
    }

    public QueryConfigResponse queryConfigWithOptions(QueryConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryConfig"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryConfigResponse());
    }

    public QueryConfigResponse queryConfig(QueryConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryConfigWithOptions(request, runtime);
    }

    public QueryGatewayRegionResponse queryGatewayRegionWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryGatewayRegion"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryGatewayRegionResponse());
    }

    public QueryGatewayRegionResponse queryGatewayRegion() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryGatewayRegionWithOptions(runtime);
    }

    public QueryGatewayTypeResponse queryGatewayTypeWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryGatewayType"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryGatewayTypeResponse());
    }

    public QueryGatewayTypeResponse queryGatewayType() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryGatewayTypeWithOptions(runtime);
    }

    public QueryMonitorResponse queryMonitorWithOptions(QueryMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMonitor"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMonitorResponse());
    }

    public QueryMonitorResponse queryMonitor(QueryMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMonitorWithOptions(request, runtime);
    }

    public QuerySlbSpecResponse querySlbSpecWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySlbSpec"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySlbSpecResponse());
    }

    public QuerySlbSpecResponse querySlbSpec() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySlbSpecWithOptions(runtime);
    }

    public QueryZnodeDetailResponse queryZnodeDetailWithOptions(QueryZnodeDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryZnodeDetail"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryZnodeDetailResponse());
    }

    public QueryZnodeDetailResponse queryZnodeDetail(QueryZnodeDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryZnodeDetailWithOptions(request, runtime);
    }

    public RestartClusterResponse restartClusterWithOptions(RestartClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterId", request.clusterId);
        query.put("InstanceId", request.instanceId);
        query.put("PodNameList", request.podNameList);
        query.put("RequestPars", request.requestPars);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartCluster"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartClusterResponse());
    }

    public RestartClusterResponse restartCluster(RestartClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restartClusterWithOptions(request, runtime);
    }

    public RetryClusterResponse retryClusterWithOptions(RetryClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("RequestPars", request.requestPars);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryCluster"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryClusterResponse());
    }

    public RetryClusterResponse retryCluster(RetryClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.retryClusterWithOptions(request, runtime);
    }

    public ScalingClusterResponse scalingClusterWithOptions(ScalingClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterSpecification", request.clusterSpecification);
        query.put("Cpu", request.cpu);
        query.put("InstanceCount", request.instanceCount);
        query.put("InstanceId", request.instanceId);
        query.put("MemoryCapacity", request.memoryCapacity);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScalingCluster"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScalingClusterResponse());
    }

    public ScalingClusterResponse scalingCluster(ScalingClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.scalingClusterWithOptions(request, runtime);
    }

    public UpdateAclResponse updateAclWithOptions(UpdateAclRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AclEntryList", request.aclEntryList);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAcl"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAclResponse());
    }

    public UpdateAclResponse updateAcl(UpdateAclRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAclWithOptions(request, runtime);
    }

    public UpdateClusterResponse updateClusterWithOptions(UpdateClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterAliasName", request.clusterAliasName);
        query.put("InstanceId", request.instanceId);
        query.put("RequestPars", request.requestPars);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCluster"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateClusterResponse());
    }

    public UpdateClusterResponse updateCluster(UpdateClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateClusterWithOptions(request, runtime);
    }

    public UpdateConfigResponse updateConfigWithOptions(UpdateConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AutopurgePurgeInterval", request.autopurgePurgeInterval);
        query.put("AutopurgeSnapRetainCount", request.autopurgeSnapRetainCount);
        query.put("ClusterId", request.clusterId);
        query.put("ConfigAuthEnabled", request.configAuthEnabled);
        query.put("ConfigSecretEnabled", request.configSecretEnabled);
        query.put("ConfigType", request.configType);
        query.put("InitLimit", request.initLimit);
        query.put("InstanceId", request.instanceId);
        query.put("JuteMaxbuffer", request.juteMaxbuffer);
        query.put("MCPEnabled", request.MCPEnabled);
        query.put("MaxClientCnxns", request.maxClientCnxns);
        query.put("PassWord", request.passWord);
        query.put("RequestPars", request.requestPars);
        query.put("SyncLimit", request.syncLimit);
        query.put("TickTime", request.tickTime);
        query.put("UserName", request.userName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConfig"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConfigResponse());
    }

    public UpdateConfigResponse updateConfig(UpdateConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateConfigWithOptions(request, runtime);
    }

    public UpdateEngineNamespaceResponse updateEngineNamespaceWithOptions(UpdateEngineNamespaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterId", request.clusterId);
        query.put("Desc", request.desc);
        query.put("Id", request.id);
        query.put("InstanceId", request.instanceId);
        query.put("Name", request.name);
        query.put("ServiceCount", request.serviceCount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEngineNamespace"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEngineNamespaceResponse());
    }

    public UpdateEngineNamespaceResponse updateEngineNamespace(UpdateEngineNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEngineNamespaceWithOptions(request, runtime);
    }

    public UpdateGatewayNameResponse updateGatewayNameWithOptions(UpdateGatewayNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayName"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayNameResponse());
    }

    public UpdateGatewayNameResponse updateGatewayName(UpdateGatewayNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGatewayNameWithOptions(request, runtime);
    }

    public UpdateGatewayOptionResponse updateGatewayOptionWithOptions(UpdateGatewayOptionRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateGatewayOptionShrinkRequest request = new UpdateGatewayOptionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.gatewayOption))) {
            request.gatewayOptionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.gatewayOption), "GatewayOption", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("GatewayOption", request.gatewayOptionShrink);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayOption"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayOptionResponse());
    }

    public UpdateGatewayOptionResponse updateGatewayOption(UpdateGatewayOptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGatewayOptionWithOptions(request, runtime);
    }

    public UpdateGatewayRouteHTTPRewriteResponse updateGatewayRouteHTTPRewriteWithOptions(UpdateGatewayRouteHTTPRewriteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GatewayId", request.gatewayId);
        query.put("HttpRewriteJSON", request.httpRewriteJSON);
        query.put("Id", request.id);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayRouteHTTPRewrite"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayRouteHTTPRewriteResponse());
    }

    public UpdateGatewayRouteHTTPRewriteResponse updateGatewayRouteHTTPRewrite(UpdateGatewayRouteHTTPRewriteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGatewayRouteHTTPRewriteWithOptions(request, runtime);
    }

    public UpdateImageResponse updateImageWithOptions(UpdateImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterId", request.clusterId);
        query.put("VersionCode", request.versionCode);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateImage"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateImageResponse());
    }

    public UpdateImageResponse updateImage(UpdateImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateImageWithOptions(request, runtime);
    }

    public UpdateNacosConfigResponse updateNacosConfigWithOptions(UpdateNacosConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("BetaIps", request.betaIps);
        query.put("Content", request.content);
        query.put("DataId", request.dataId);
        query.put("Desc", request.desc);
        query.put("EncryptedDataKey", request.encryptedDataKey);
        query.put("Group", request.group);
        query.put("InstanceId", request.instanceId);
        query.put("Md5", request.md5);
        query.put("NamespaceId", request.namespaceId);
        query.put("Tags", request.tags);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNacosConfig"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNacosConfigResponse());
    }

    public UpdateNacosConfigResponse updateNacosConfig(UpdateNacosConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateNacosConfigWithOptions(request, runtime);
    }

    public UpdateNacosInstanceResponse updateNacosInstanceWithOptions(UpdateNacosInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterName", request.clusterName);
        query.put("Enabled", request.enabled);
        query.put("Ephemeral", request.ephemeral);
        query.put("GroupName", request.groupName);
        query.put("InstanceId", request.instanceId);
        query.put("Ip", request.ip);
        query.put("NamespaceId", request.namespaceId);
        query.put("Port", request.port);
        query.put("ServiceName", request.serviceName);
        query.put("Weight", request.weight);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNacosInstance"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNacosInstanceResponse());
    }

    public UpdateNacosInstanceResponse updateNacosInstance(UpdateNacosInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateNacosInstanceWithOptions(request, runtime);
    }

    public UpdateZnodeResponse updateZnodeWithOptions(UpdateZnodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClusterId", request.clusterId);
        query.put("Data", request.data);
        query.put("Path", request.path);
        query.put("RequestPars", request.requestPars);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateZnode"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateZnodeResponse());
    }

    public UpdateZnodeResponse updateZnode(UpdateZnodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateZnodeWithOptions(request, runtime);
    }

    public UpgradeClusterResponse upgradeClusterWithOptions(UpgradeClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("RequestPars", request.requestPars);
        query.put("UpgradeVersion", request.upgradeVersion);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeCluster"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeClusterResponse());
    }

    public UpgradeClusterResponse upgradeCluster(UpgradeClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeClusterWithOptions(request, runtime);
    }
}
