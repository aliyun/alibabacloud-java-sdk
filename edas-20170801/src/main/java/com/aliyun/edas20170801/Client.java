// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801;

import com.aliyun.tea.*;
import com.aliyun.edas20170801.models.*;
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
            new TeaPair("ap-northeast-2-pop", "edas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "edas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "edas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "edas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "edas.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "edas.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "edas.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "edas.aliyuncs.com"),
            new TeaPair("cn-chengdu", "edas.aliyuncs.com"),
            new TeaPair("cn-edge-1", "edas.aliyuncs.com"),
            new TeaPair("cn-fujian", "edas.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "edas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "edas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "edas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "edas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "edas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "edas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "edas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "edas.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "edas.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "edas.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "edas.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "edas.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "edas.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "edas.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "edas.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "edas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "edas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "edas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "edas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "edas.aliyuncs.com"),
            new TeaPair("cn-wuhan", "edas.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "edas.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "edas.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "edas.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "edas.aliyuncs.com"),
            new TeaPair("eu-west-1", "edas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "edas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "edas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "edas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "edas.ap-northeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("edas", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AbortAndRollbackChangeOrderResponse abortAndRollbackChangeOrder(AbortAndRollbackChangeOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.abortAndRollbackChangeOrderWithOptions(request, headers, runtime);
    }

    public AbortAndRollbackChangeOrderResponse abortAndRollbackChangeOrderWithOptions(AbortAndRollbackChangeOrderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeOrderId)) {
            query.put("ChangeOrderId", request.changeOrderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("AbortAndRollbackChangeOrder", "2017-08-01", "HTTPS", "PUT", "AK", "/pop/v5/changeorder/change_order_abort_and_rollback", "json", req, runtime), new AbortAndRollbackChangeOrderResponse());
    }

    public AbortChangeOrderResponse abortChangeOrder(AbortChangeOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.abortChangeOrderWithOptions(request, headers, runtime);
    }

    public AbortChangeOrderResponse abortChangeOrderWithOptions(AbortChangeOrderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeOrderId)) {
            query.put("ChangeOrderId", request.changeOrderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("AbortChangeOrder", "2017-08-01", "HTTPS", "PUT", "AK", "/pop/v5/changeorder/change_order_abort", "json", req, runtime), new AbortChangeOrderResponse());
    }

    public AddLogPathResponse addLogPath(AddLogPathRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addLogPathWithOptions(request, headers, runtime);
    }

    public AddLogPathResponse addLogPathWithOptions(AddLogPathRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            body.put("Path", request.path);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("AddLogPath", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/log/popListLogDirs", "json", req, runtime), new AddLogPathResponse());
    }

    public AddMockRuleResponse addMockRule(AddMockRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addMockRuleWithOptions(request, headers, runtime);
    }

    public AddMockRuleResponse addMockRuleWithOptions(AddMockRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerAppId)) {
            query.put("ProviderAppId", request.providerAppId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerAppName)) {
            query.put("ProviderAppName", request.providerAppName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraJson)) {
            query.put("ExtraJson", request.extraJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scMockItemJson)) {
            query.put("ScMockItemJson", request.scMockItemJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dubboMockItemJson)) {
            query.put("DubboMockItemJson", request.dubboMockItemJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerAppsJson)) {
            query.put("ConsumerAppsJson", request.consumerAppsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("AddMockRule", "2017-08-01", "HTTPS", "POST", "AK", "/pop/sp/api/mock/addMockRule", "json", req, runtime), new AddMockRuleResponse());
    }

    public AddServiceTimeConfigResponse addServiceTimeConfig(AddServiceTimeConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addServiceTimeConfigWithOptions(request, headers, runtime);
    }

    public AddServiceTimeConfigResponse addServiceTimeConfigWithOptions(AddServiceTimeConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("ServiceVersion", request.serviceVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroup)) {
            query.put("ServiceGroup", request.serviceGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerAppName)) {
            query.put("ConsumerAppName", request.consumerAppName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerAppId)) {
            query.put("ConsumerAppId", request.consumerAppId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("AddServiceTimeConfig", "2017-08-01", "HTTPS", "POST", "AK", "/pop/sp/api/timeout/add", "json", req, runtime), new AddServiceTimeConfigResponse());
    }

    public AuthorizeApplicationResponse authorizeApplication(AuthorizeApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authorizeApplicationWithOptions(request, headers, runtime);
    }

    public AuthorizeApplicationResponse authorizeApplicationWithOptions(AuthorizeApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.targetUserId)) {
            query.put("TargetUserId", request.targetUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appIds)) {
            query.put("AppIds", request.appIds);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("AuthorizeApplication", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/account/authorize_app", "json", req, runtime), new AuthorizeApplicationResponse());
    }

    public AuthorizeResourceGroupResponse authorizeResourceGroup(AuthorizeResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authorizeResourceGroupWithOptions(request, headers, runtime);
    }

    public AuthorizeResourceGroupResponse authorizeResourceGroupWithOptions(AuthorizeResourceGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.targetUserId)) {
            query.put("TargetUserId", request.targetUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIds)) {
            query.put("ResourceGroupIds", request.resourceGroupIds);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("AuthorizeResourceGroup", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/account/authorize_res_group", "json", req, runtime), new AuthorizeResourceGroupResponse());
    }

    public AuthorizeRoleResponse authorizeRole(AuthorizeRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authorizeRoleWithOptions(request, headers, runtime);
    }

    public AuthorizeRoleResponse authorizeRoleWithOptions(AuthorizeRoleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.targetUserId)) {
            query.put("TargetUserId", request.targetUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleIds)) {
            query.put("RoleIds", request.roleIds);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("AuthorizeRole", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/account/authorize_role", "json", req, runtime), new AuthorizeRoleResponse());
    }

    public BindEcsSlbResponse bindEcsSlb(BindEcsSlbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindEcsSlbWithOptions(request, headers, runtime);
    }

    public BindEcsSlbResponse bindEcsSlbWithOptions(BindEcsSlbRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slbId)) {
            query.put("SlbId", request.slbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroupId)) {
            query.put("VServerGroupId", request.VServerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerProtocol)) {
            query.put("ListenerProtocol", request.listenerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployGroupId)) {
            query.put("DeployGroupId", request.deployGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroupName)) {
            query.put("VServerGroupName", request.VServerGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerHealthCheckUrl)) {
            query.put("ListenerHealthCheckUrl", request.listenerHealthCheckUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VForwardingUrlRule)) {
            query.put("VForwardingUrlRule", request.VForwardingUrlRule);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("BindEcsSlb", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/app/slb/bind_slb", "json", req, runtime), new BindEcsSlbResponse());
    }

    public BindK8sSlbResponse bindK8sSlb(BindK8sSlbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindK8sSlbWithOptions(request, headers, runtime);
    }

    public BindK8sSlbResponse bindK8sSlbWithOptions(BindK8sSlbRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slbId)) {
            query.put("SlbId", request.slbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slbProtocol)) {
            query.put("SlbProtocol", request.slbProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPort)) {
            query.put("TargetPort", request.targetPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicePortInfos)) {
            query.put("ServicePortInfos", request.servicePortInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specification)) {
            query.put("Specification", request.specification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            query.put("Scheduler", request.scheduler);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("BindK8sSlb", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/k8s/acs/k8s_slb_binding", "json", req, runtime), new BindK8sSlbResponse());
    }

    public BindSlbResponse bindSlb(BindSlbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindSlbWithOptions(request, headers, runtime);
    }

    public BindSlbResponse bindSlbWithOptions(BindSlbRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slbId)) {
            query.put("SlbId", request.slbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slbIp)) {
            query.put("SlbIp", request.slbIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroupId)) {
            query.put("VServerGroupId", request.VServerGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("BindSlb", "2017-08-01", "HTTPS", "POST", "AK", "/pop/app/bind_slb_json", "json", req, runtime), new BindSlbResponse());
    }

    public ChangeDeployGroupResponse changeDeployGroup(ChangeDeployGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.changeDeployGroupWithOptions(request, headers, runtime);
    }

    public ChangeDeployGroupResponse changeDeployGroupWithOptions(ChangeDeployGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eccInfo)) {
            query.put("EccInfo", request.eccInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceStatus)) {
            query.put("ForceStatus", request.forceStatus);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ChangeDeployGroup", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/changeorder/co_change_group", "json", req, runtime), new ChangeDeployGroupResponse());
    }

    public ContinuePipelineResponse continuePipeline(ContinuePipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.continuePipelineWithOptions(request, headers, runtime);
    }

    public ContinuePipelineResponse continuePipelineWithOptions(ContinuePipelineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.confirm)) {
            query.put("Confirm", request.confirm);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ContinuePipeline", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/changeorder/pipeline_batch_confirm", "json", req, runtime), new ContinuePipelineResponse());
    }

    public ConvertK8sResourceResponse convertK8sResource(ConvertK8sResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.convertK8sResourceWithOptions(request, headers, runtime);
    }

    public ConvertK8sResourceResponse convertK8sResourceWithOptions(ConvertK8sResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            query.put("ResourceName", request.resourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ConvertK8sResource", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/oam/k8s_resource_convert", "json", req, runtime), new ConvertK8sResourceResponse());
    }

    public CreateIDCImportCommandResponse createIDCImportCommand(CreateIDCImportCommandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIDCImportCommandWithOptions(request, headers, runtime);
    }

    public CreateIDCImportCommandResponse createIDCImportCommandWithOptions(CreateIDCImportCommandRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("CreateIDCImportCommand", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/create_idc_import_command", "json", req, runtime), new CreateIDCImportCommandResponse());
    }

    public CreateK8sIngressRuleResponse createK8sIngressRule(CreateK8sIngressRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createK8sIngressRuleWithOptions(request, headers, runtime);
    }

    public CreateK8sIngressRuleResponse createK8sIngressRuleWithOptions(CreateK8sIngressRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rules)) {
            query.put("Rules", request.rules);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateK8sIngressRule", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/k8s/acs/k8s_ingress", "json", req, runtime), new CreateK8sIngressRuleResponse());
    }

    public CreateK8sServiceResponse createK8sService(CreateK8sServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createK8sServiceWithOptions(request, headers, runtime);
    }

    public CreateK8sServiceResponse createK8sServiceWithOptions(CreateK8sServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicePorts)) {
            query.put("ServicePorts", request.servicePorts);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateK8sService", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/k8s/acs/k8s_service", "json", req, runtime), new CreateK8sServiceResponse());
    }

    public DelegateAdminRoleResponse delegateAdminRole(DelegateAdminRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.delegateAdminRoleWithOptions(request, headers, runtime);
    }

    public DelegateAdminRoleResponse delegateAdminRoleWithOptions(DelegateAdminRoleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.targetUserId)) {
            query.put("TargetUserId", request.targetUserId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DelegateAdminRole", "2017-08-01", "HTTPS", "PUT", "AK", "/pop/v5/account/delegate_admin_role", "json", req, runtime), new DelegateAdminRoleResponse());
    }

    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteApplicationWithOptions(request, headers, runtime);
    }

    public DeleteApplicationResponse deleteApplicationWithOptions(DeleteApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteApplication", "2017-08-01", "HTTPS", "DELETE", "AK", "/pop/v5/changeorder/co_delete_app", "json", req, runtime), new DeleteApplicationResponse());
    }

    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteClusterWithOptions(request, headers, runtime);
    }

    public DeleteClusterResponse deleteClusterWithOptions(DeleteClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteCluster", "2017-08-01", "HTTPS", "DELETE", "AK", "/pop/v5/resource/cluster", "json", req, runtime), new DeleteClusterResponse());
    }

    public DeleteClusterMemberResponse deleteClusterMember(DeleteClusterMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteClusterMemberWithOptions(request, headers, runtime);
    }

    public DeleteClusterMemberResponse deleteClusterMemberWithOptions(DeleteClusterMemberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterMemberId)) {
            query.put("ClusterMemberId", request.clusterMemberId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteClusterMember", "2017-08-01", "HTTPS", "DELETE", "AK", "/pop/v5/resource/cluster_member", "json", req, runtime), new DeleteClusterMemberResponse());
    }

    public DeleteConfigCenterResponse deleteConfigCenter(DeleteConfigCenterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConfigCenterWithOptions(request, headers, runtime);
    }

    public DeleteConfigCenterResponse deleteConfigCenterWithOptions(DeleteConfigCenterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            query.put("DataId", request.dataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("Group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteConfigCenter", "2017-08-01", "HTTPS", "DELETE", "AK", "/pop/v5/configCenter", "json", req, runtime), new DeleteConfigCenterResponse());
    }

    public DeleteDegradeControlResponse deleteDegradeControl(DeleteDegradeControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDegradeControlWithOptions(request, headers, runtime);
    }

    public DeleteDegradeControlResponse deleteDegradeControlWithOptions(DeleteDegradeControlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteDegradeControl", "2017-08-01", "HTTPS", "DELETE", "AK", "/pop/v5/degradeControl", "json", req, runtime), new DeleteDegradeControlResponse());
    }

    public DeleteDeployGroupResponse deleteDeployGroup(DeleteDeployGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDeployGroupWithOptions(request, headers, runtime);
    }

    public DeleteDeployGroupResponse deleteDeployGroupWithOptions(DeleteDeployGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteDeployGroup", "2017-08-01", "HTTPS", "DELETE", "AK", "/pop/v5/deploy_group", "json", req, runtime), new DeleteDeployGroupResponse());
    }

    public DeleteEcuResponse deleteEcu(DeleteEcuRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteEcuWithOptions(request, headers, runtime);
    }

    public DeleteEcuResponse deleteEcuWithOptions(DeleteEcuRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ecuId)) {
            query.put("EcuId", request.ecuId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteEcu", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/resource/delete_ecu", "json", req, runtime), new DeleteEcuResponse());
    }

    public DeleteFlowControlResponse deleteFlowControl(DeleteFlowControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFlowControlWithOptions(request, headers, runtime);
    }

    public DeleteFlowControlResponse deleteFlowControlWithOptions(DeleteFlowControlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteFlowControl", "2017-08-01", "HTTPS", "DELETE", "AK", "/pop/v5/flowControl", "json", req, runtime), new DeleteFlowControlResponse());
    }

    public DeleteK8sApplicationResponse deleteK8sApplication(DeleteK8sApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteK8sApplicationWithOptions(request, headers, runtime);
    }

    public DeleteK8sApplicationResponse deleteK8sApplicationWithOptions(DeleteK8sApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteK8sApplication", "2017-08-01", "HTTPS", "DELETE", "AK", "/pop/v5/k8s/acs/k8s_apps", "json", req, runtime), new DeleteK8sApplicationResponse());
    }

    public DeleteK8sIngressRuleResponse deleteK8sIngressRule(DeleteK8sIngressRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteK8sIngressRuleWithOptions(request, headers, runtime);
    }

    public DeleteK8sIngressRuleResponse deleteK8sIngressRuleWithOptions(DeleteK8sIngressRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteK8sIngressRule", "2017-08-01", "HTTPS", "DELETE", "AK", "/pop/v5/k8s/acs/k8s_ingress", "json", req, runtime), new DeleteK8sIngressRuleResponse());
    }

    public DeleteK8sServiceResponse deleteK8sService(DeleteK8sServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteK8sServiceWithOptions(request, headers, runtime);
    }

    public DeleteK8sServiceResponse deleteK8sServiceWithOptions(DeleteK8sServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteK8sService", "2017-08-01", "HTTPS", "DELETE", "AK", "/pop/v5/k8s/acs/k8s_service", "json", req, runtime), new DeleteK8sServiceResponse());
    }

    public DeleteLogPathResponse deleteLogPath(DeleteLogPathRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLogPathWithOptions(request, headers, runtime);
    }

    public DeleteLogPathResponse deleteLogPathWithOptions(DeleteLogPathRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteLogPath", "2017-08-01", "HTTPS", "DELETE", "AK", "/pop/v5/log/popListLogDirs", "json", req, runtime), new DeleteLogPathResponse());
    }

    public DeleteRoleResponse deleteRole(DeleteRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRoleWithOptions(request, headers, runtime);
    }

    public DeleteRoleResponse deleteRoleWithOptions(DeleteRoleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            query.put("RoleId", request.roleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteRole", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/account/delete_role", "json", req, runtime), new DeleteRoleResponse());
    }

    public DeleteServiceGroupResponse deleteServiceGroup(DeleteServiceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceGroupWithOptions(request, headers, runtime);
    }

    public DeleteServiceGroupResponse deleteServiceGroupWithOptions(DeleteServiceGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteServiceGroup", "2017-08-01", "HTTPS", "DELETE", "AK", "/pop/v5/service/serviceGroups", "json", req, runtime), new DeleteServiceGroupResponse());
    }

    public DeleteServiceTimeConfigResponse deleteServiceTimeConfig(DeleteServiceTimeConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceTimeConfigWithOptions(request, headers, runtime);
    }

    public DeleteServiceTimeConfigResponse deleteServiceTimeConfigWithOptions(DeleteServiceTimeConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteServiceTimeConfig", "2017-08-01", "HTTPS", "POST", "AK", "/pop/sp/api/timeout/remove", "json", req, runtime), new DeleteServiceTimeConfigResponse());
    }

    public DeleteSwimmingLaneResponse deleteSwimmingLane(DeleteSwimmingLaneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSwimmingLaneWithOptions(request, headers, runtime);
    }

    public DeleteSwimmingLaneResponse deleteSwimmingLaneWithOptions(DeleteSwimmingLaneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.laneId)) {
            query.put("LaneId", request.laneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteSwimmingLane", "2017-08-01", "HTTPS", "DELETE", "AK", "/pop/v5/trafficmgnt/swimming_lanes", "json", req, runtime), new DeleteSwimmingLaneResponse());
    }

    public DeleteSwimmingLaneGroupResponse deleteSwimmingLaneGroup(DeleteSwimmingLaneGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSwimmingLaneGroupWithOptions(request, headers, runtime);
    }

    public DeleteSwimmingLaneGroupResponse deleteSwimmingLaneGroupWithOptions(DeleteSwimmingLaneGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteSwimmingLaneGroup", "2017-08-01", "HTTPS", "DELETE", "AK", "/pop/v5/trafficmgnt/swimming_lane_groups", "json", req, runtime), new DeleteSwimmingLaneGroupResponse());
    }

    public DeleteUserDefineRegionResponse deleteUserDefineRegion(DeleteUserDefineRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUserDefineRegionWithOptions(request, headers, runtime);
    }

    public DeleteUserDefineRegionResponse deleteUserDefineRegionWithOptions(DeleteUserDefineRegionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionTag)) {
            query.put("RegionTag", request.regionTag);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteUserDefineRegion", "2017-08-01", "HTTPS", "DELETE", "AK", "/pop/v5/user_region_def", "json", req, runtime), new DeleteUserDefineRegionResponse());
    }

    public DeployApplicationResponse deployApplication(DeployApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deployApplicationWithOptions(request, headers, runtime);
    }

    public DeployApplicationResponse deployApplicationWithOptions(DeployApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageVersion)) {
            query.put("PackageVersion", request.packageVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            query.put("Desc", request.desc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployType)) {
            query.put("DeployType", request.deployType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warUrl)) {
            query.put("WarUrl", request.warUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batch)) {
            query.put("Batch", request.batch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchWaitTime)) {
            query.put("BatchWaitTime", request.batchWaitTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appEnv)) {
            query.put("AppEnv", request.appEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buildPackId)) {
            query.put("BuildPackId", request.buildPackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentIds)) {
            query.put("ComponentIds", request.componentIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseType)) {
            query.put("ReleaseType", request.releaseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gray)) {
            query.put("Gray", request.gray);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficControlStrategy)) {
            query.put("TrafficControlStrategy", request.trafficControlStrategy);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeployApplication", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/changeorder/co_deploy", "json", req, runtime), new DeployApplicationResponse());
    }

    public DeployK8sApplicationResponse deployK8sApplication(DeployK8sApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deployK8sApplicationWithOptions(request, headers, runtime);
    }

    public DeployK8sApplicationResponse deployK8sApplicationWithOptions(DeployK8sApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.preStop)) {
            query.put("PreStop", request.preStop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envs)) {
            query.put("Envs", request.envs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageTag)) {
            query.put("ImageTag", request.imageTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchWaitTime)) {
            query.put("BatchWaitTime", request.batchWaitTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.command)) {
            query.put("Command", request.command);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.postStart)) {
            query.put("PostStart", request.postStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.readiness)) {
            query.put("Readiness", request.readiness);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveness)) {
            query.put("Liveness", request.liveness);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.args)) {
            query.put("Args", request.args);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicas)) {
            query.put("Replicas", request.replicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.image)) {
            query.put("Image", request.image);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuLimit)) {
            query.put("CpuLimit", request.cpuLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memoryLimit)) {
            query.put("MemoryLimit", request.memoryLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuRequest)) {
            query.put("CpuRequest", request.cpuRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memoryRequest)) {
            query.put("MemoryRequest", request.memoryRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nasId)) {
            query.put("NasId", request.nasId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountDescs)) {
            query.put("MountDescs", request.mountDescs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localVolume)) {
            query.put("LocalVolume", request.localVolume);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageUrl)) {
            query.put("PackageUrl", request.packageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageVersion)) {
            query.put("PackageVersion", request.packageVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.JDK)) {
            query.put("JDK", request.JDK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webContainer)) {
            query.put("WebContainer", request.webContainer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edasContainerVersion)) {
            query.put("EdasContainerVersion", request.edasContainerVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uriEncoding)) {
            query.put("UriEncoding", request.uriEncoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useBodyEncoding)) {
            query.put("UseBodyEncoding", request.useBodyEncoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateStrategy)) {
            query.put("UpdateStrategy", request.updateStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mcpuRequest)) {
            query.put("McpuRequest", request.mcpuRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mcpuLimit)) {
            query.put("McpuLimit", request.mcpuLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volumesStr)) {
            query.put("VolumesStr", request.volumesStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageVersionId)) {
            query.put("PackageVersionId", request.packageVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeOrderDesc)) {
            query.put("ChangeOrderDesc", request.changeOrderDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeClassName)) {
            query.put("RuntimeClassName", request.runtimeClassName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployAcrossZones)) {
            query.put("DeployAcrossZones", request.deployAcrossZones);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchTimeout)) {
            query.put("BatchTimeout", request.batchTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAhas)) {
            query.put("EnableAhas", request.enableAhas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webContainerConfig)) {
            query.put("WebContainerConfig", request.webContainerConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.javaStartUpConfig)) {
            query.put("JavaStartUpConfig", request.javaStartUpConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsConfigs)) {
            query.put("SlsConfigs", request.slsConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployAcrossNodes)) {
            query.put("DeployAcrossNodes", request.deployAcrossNodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficControlStrategy)) {
            query.put("TrafficControlStrategy", request.trafficControlStrategy);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeployK8sApplication", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/k8s/acs/k8s_apps", "json", req, runtime), new DeployK8sApplicationResponse());
    }

    public DisableDegradeControlResponse disableDegradeControl(DisableDegradeControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableDegradeControlWithOptions(request, headers, runtime);
    }

    public DisableDegradeControlResponse disableDegradeControlWithOptions(DisableDegradeControlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DisableDegradeControl", "2017-08-01", "HTTPS", "PUT", "AK", "/pop/v5/degradecontrol/disable", "json", req, runtime), new DisableDegradeControlResponse());
    }

    public DisableFlowControlResponse disableFlowControl(DisableFlowControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableFlowControlWithOptions(request, headers, runtime);
    }

    public DisableFlowControlResponse disableFlowControlWithOptions(DisableFlowControlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DisableFlowControl", "2017-08-01", "HTTPS", "PUT", "AK", "/pop/v5/flowcontrol/disable", "json", req, runtime), new DisableFlowControlResponse());
    }

    public DisableMockRuleResponse disableMockRule(DisableMockRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableMockRuleWithOptions(request, headers, runtime);
    }

    public DisableMockRuleResponse disableMockRuleWithOptions(DisableMockRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DisableMockRule", "2017-08-01", "HTTPS", "POST", "AK", "/pop/sp/api/mock/disableMockRule", "json", req, runtime), new DisableMockRuleResponse());
    }

    public EnableDegradeControlResponse enableDegradeControl(EnableDegradeControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableDegradeControlWithOptions(request, headers, runtime);
    }

    public EnableDegradeControlResponse enableDegradeControlWithOptions(EnableDegradeControlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("EnableDegradeControl", "2017-08-01", "HTTPS", "PUT", "AK", "/pop/v5/degradecontrol/enable", "json", req, runtime), new EnableDegradeControlResponse());
    }

    public EnableFlowControlResponse enableFlowControl(EnableFlowControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableFlowControlWithOptions(request, headers, runtime);
    }

    public EnableFlowControlResponse enableFlowControlWithOptions(EnableFlowControlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("EnableFlowControl", "2017-08-01", "HTTPS", "PUT", "AK", "/pop/v5/flowcontrol/enable", "json", req, runtime), new EnableFlowControlResponse());
    }

    public EnableMockRuleResponse enableMockRule(EnableMockRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableMockRuleWithOptions(request, headers, runtime);
    }

    public EnableMockRuleResponse enableMockRuleWithOptions(EnableMockRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("EnableMockRule", "2017-08-01", "HTTPS", "POST", "AK", "/pop/sp/api/mock/enableMockRule", "json", req, runtime), new EnableMockRuleResponse());
    }

    public ExecuteStatusResponse executeStatus(ExecuteStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeStatusWithOptions(request, headers, runtime);
    }

    public ExecuteStatusResponse executeStatusWithOptions(ExecuteStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.podName)) {
            query.put("PodName", request.podName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ExecuteStatus", "2017-08-01", "HTTPS", "POST", "AK", "/pop/sp/api/mse/status/execute", "json", req, runtime), new ExecuteStatusResponse());
    }

    public GetAccountMockRuleResponse getAccountMockRule(GetAccountMockRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAccountMockRuleWithOptions(request, headers, runtime);
    }

    public GetAccountMockRuleResponse getAccountMockRuleWithOptions(GetAccountMockRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerAppName)) {
            query.put("ConsumerAppName", request.consumerAppName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerAppName)) {
            query.put("ProviderAppName", request.providerAppName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetAccountMockRule", "2017-08-01", "HTTPS", "POST", "AK", "/pop/sp/api/mock/getAccountMockRule", "json", req, runtime), new GetAccountMockRuleResponse());
    }

    public GetApplicationResponse getApplication(GetApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApplicationWithOptions(request, headers, runtime);
    }

    public GetApplicationResponse getApplicationWithOptions(GetApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetApplication", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/app/app_info", "json", req, runtime), new GetApplicationResponse());
    }

    public GetChangeOrderInfoResponse getChangeOrderInfo(GetChangeOrderInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getChangeOrderInfoWithOptions(request, headers, runtime);
    }

    public GetChangeOrderInfoResponse getChangeOrderInfoWithOptions(GetChangeOrderInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeOrderId)) {
            query.put("ChangeOrderId", request.changeOrderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetChangeOrderInfo", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/changeorder/change_order_info", "json", req, runtime), new GetChangeOrderInfoResponse());
    }

    public GetClusterResponse getCluster(GetClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterWithOptions(request, headers, runtime);
    }

    public GetClusterResponse getClusterWithOptions(GetClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetCluster", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/resource/cluster", "json", req, runtime), new GetClusterResponse());
    }

    public GetContainerConfigurationResponse getContainerConfiguration(GetContainerConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContainerConfigurationWithOptions(request, headers, runtime);
    }

    public GetContainerConfigurationResponse getContainerConfigurationWithOptions(GetContainerConfigurationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetContainerConfiguration", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/app/container_config", "json", req, runtime), new GetContainerConfigurationResponse());
    }

    public GetJvmConfigurationResponse getJvmConfiguration(GetJvmConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJvmConfigurationWithOptions(request, headers, runtime);
    }

    public GetJvmConfigurationResponse getJvmConfigurationWithOptions(GetJvmConfigurationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetJvmConfiguration", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/app/app_jvm_config", "json", req, runtime), new GetJvmConfigurationResponse());
    }

    public GetK8sApplicationResponse getK8sApplication(GetK8sApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getK8sApplicationWithOptions(request, headers, runtime);
    }

    public GetK8sApplicationResponse getK8sApplicationWithOptions(GetK8sApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("From", request.from);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetK8sApplication", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/changeorder/co_application", "json", req, runtime), new GetK8sApplicationResponse());
    }

    public GetK8sClusterResponse getK8sCluster(GetK8sClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getK8sClusterWithOptions(request, headers, runtime);
    }

    public GetK8sClusterResponse getK8sClusterWithOptions(GetK8sClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionTag)) {
            query.put("RegionTag", request.regionTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetK8sCluster", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/k8s_clusters", "json", req, runtime), new GetK8sClusterResponse());
    }

    public GetK8sServicesResponse getK8sServices(GetK8sServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getK8sServicesWithOptions(request, headers, runtime);
    }

    public GetK8sServicesResponse getK8sServicesWithOptions(GetK8sServicesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetK8sServices", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/k8s/acs/k8s_service", "json", req, runtime), new GetK8sServicesResponse());
    }

    public GetMockRuleByConsumerAppIdResponse getMockRuleByConsumerAppId(GetMockRuleByConsumerAppIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMockRuleByConsumerAppIdWithOptions(request, headers, runtime);
    }

    public GetMockRuleByConsumerAppIdResponse getMockRuleByConsumerAppIdWithOptions(GetMockRuleByConsumerAppIdRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerAppId)) {
            query.put("ConsumerAppId", request.consumerAppId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetMockRuleByConsumerAppId", "2017-08-01", "HTTPS", "POST", "AK", "/pop/sp/api/mock/getMockRuleByConsumerAppId", "json", req, runtime), new GetMockRuleByConsumerAppIdResponse());
    }

    public GetMockRuleByIdResponse getMockRuleById(GetMockRuleByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMockRuleByIdWithOptions(request, headers, runtime);
    }

    public GetMockRuleByIdResponse getMockRuleByIdWithOptions(GetMockRuleByIdRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetMockRuleById", "2017-08-01", "HTTPS", "POST", "AK", "/pop/sp/api/mock/getMockRuleById", "json", req, runtime), new GetMockRuleByIdResponse());
    }

    public GetMockRuleByProviderAppIdResponse getMockRuleByProviderAppId(GetMockRuleByProviderAppIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMockRuleByProviderAppIdWithOptions(request, headers, runtime);
    }

    public GetMockRuleByProviderAppIdResponse getMockRuleByProviderAppIdWithOptions(GetMockRuleByProviderAppIdRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerAppId)) {
            query.put("ProviderAppId", request.providerAppId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetMockRuleByProviderAppId", "2017-08-01", "HTTPS", "POST", "AK", "/pop/sp/api/mock/getMockRuleByProviderAppId", "json", req, runtime), new GetMockRuleByProviderAppIdResponse());
    }

    public GetPackageStorageCredentialResponse getPackageStorageCredential() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPackageStorageCredentialWithOptions(headers, runtime);
    }

    public GetPackageStorageCredentialResponse getPackageStorageCredentialWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetPackageStorageCredential", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/package_storage_credential", "json", req, runtime), new GetPackageStorageCredentialResponse());
    }

    public GetScalingRulesResponse getScalingRules(GetScalingRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getScalingRulesWithOptions(request, headers, runtime);
    }

    public GetScalingRulesResponse getScalingRulesWithOptions(GetScalingRulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetScalingRules", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/app/scalingRules", "json", req, runtime), new GetScalingRulesResponse());
    }

    public GetSecureTokenResponse getSecureToken(GetSecureTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSecureTokenWithOptions(request, headers, runtime);
    }

    public GetSecureTokenResponse getSecureTokenWithOptions(GetSecureTokenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetSecureToken", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/secure_token", "json", req, runtime), new GetSecureTokenResponse());
    }

    public GetServiceConsumersPageResponse getServiceConsumersPage(GetServiceConsumersPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceConsumersPageWithOptions(request, headers, runtime);
    }

    public GetServiceConsumersPageResponse getServiceConsumersPageWithOptions(GetServiceConsumersPageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.origin)) {
            query.put("origin", request.origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("serviceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("serviceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("serviceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("serviceVersion", request.serviceVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registryType)) {
            query.put("registryType", request.registryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetServiceConsumersPage", "2017-08-01", "HTTPS", "POST", "AK", "/pop/sp/api/mseForOam/getServiceConsumersPage", "json", req, runtime), new GetServiceConsumersPageResponse());
    }

    public GetServiceDetailResponse getServiceDetail(GetServiceDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceDetailWithOptions(request, headers, runtime);
    }

    public GetServiceDetailResponse getServiceDetailWithOptions(GetServiceDetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.origin)) {
            query.put("origin", request.origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("serviceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("serviceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("serviceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("serviceVersion", request.serviceVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registryType)) {
            query.put("registryType", request.registryType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetServiceDetail", "2017-08-01", "HTTPS", "POST", "AK", "/pop/sp/api/mseForOam/getServiceDetail", "json", req, runtime), new GetServiceDetailResponse());
    }

    public GetServiceListResponse getServiceList(GetServiceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceListWithOptions(request, headers, runtime);
    }

    public GetServiceListResponse getServiceListWithOptions(GetServiceListRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.origin)) {
            query.put("origin", request.origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("serviceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchType)) {
            query.put("searchType", request.searchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchValue)) {
            query.put("searchValue", request.searchValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.side)) {
            query.put("side", request.side);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetServiceList", "2017-08-01", "HTTPS", "POST", "AK", "/pop/sp/api/mseForOam/getServiceList", "json", req, runtime), new GetServiceListResponse());
    }

    public GetServiceListPageResponse getServiceListPage(GetServiceListPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceListPageWithOptions(request, headers, runtime);
    }

    public GetServiceListPageResponse getServiceListPageWithOptions(GetServiceListPageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.origin)) {
            query.put("origin", request.origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("serviceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchType)) {
            query.put("searchType", request.searchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchValue)) {
            query.put("searchValue", request.searchValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.side)) {
            query.put("side", request.side);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetServiceListPage", "2017-08-01", "HTTPS", "POST", "AK", "/pop/sp/api/mseForOam/getServiceListPage", "json", req, runtime), new GetServiceListPageResponse());
    }

    public GetServiceMethodPageResponse getServiceMethodPage(GetServiceMethodPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceMethodPageWithOptions(request, headers, runtime);
    }

    public GetServiceMethodPageResponse getServiceMethodPageWithOptions(GetServiceMethodPageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.origin)) {
            query.put("origin", request.origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("serviceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("serviceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("serviceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("serviceVersion", request.serviceVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registryType)) {
            query.put("registryType", request.registryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.methodController)) {
            query.put("methodController", request.methodController);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetServiceMethodPage", "2017-08-01", "HTTPS", "POST", "AK", "/pop/sp/api/mseForOam/getServiceMethodPage", "json", req, runtime), new GetServiceMethodPageResponse());
    }

    public GetServiceProvidersPageResponse getServiceProvidersPage(GetServiceProvidersPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceProvidersPageWithOptions(request, headers, runtime);
    }

    public GetServiceProvidersPageResponse getServiceProvidersPageWithOptions(GetServiceProvidersPageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.origin)) {
            query.put("origin", request.origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("serviceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("serviceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("serviceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("serviceVersion", request.serviceVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registryType)) {
            query.put("registryType", request.registryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetServiceProvidersPage", "2017-08-01", "HTTPS", "POST", "AK", "/pop/sp/api/mseForOam/getServiceProvidersPage", "json", req, runtime), new GetServiceProvidersPageResponse());
    }

    public GetSubAccountInfoResponse getSubAccountInfo(GetSubAccountInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSubAccountInfoWithOptions(request, headers, runtime);
    }

    public GetSubAccountInfoResponse getSubAccountInfoWithOptions(GetSubAccountInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.targetUserId)) {
            query.put("TargetUserId", request.targetUserId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetSubAccountInfo", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/account/sub_account_info", "json", req, runtime), new GetSubAccountInfoResponse());
    }

    public GetSwimmingLaneResponse getSwimmingLane(GetSwimmingLaneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSwimmingLaneWithOptions(request, headers, runtime);
    }

    public GetSwimmingLaneResponse getSwimmingLaneWithOptions(GetSwimmingLaneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.laneId)) {
            query.put("LaneId", request.laneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetSwimmingLane", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/trafficmgnt/swimming_lane", "json", req, runtime), new GetSwimmingLaneResponse());
    }

    public ImportK8sClusterResponse importK8sCluster(ImportK8sClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importK8sClusterWithOptions(request, headers, runtime);
    }

    public ImportK8sClusterResponse importK8sClusterWithOptions(ImportK8sClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAsm)) {
            query.put("EnableAsm", request.enableAsm);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ImportK8sCluster", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/import_k8s_cluster", "json", req, runtime), new ImportK8sClusterResponse());
    }

    public InsertApplicationResponse insertApplication(InsertApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.insertApplicationWithOptions(request, headers, runtime);
    }

    public InsertApplicationResponse insertApplicationWithOptions(InsertApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buildPackId)) {
            query.put("BuildPackId", request.buildPackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservedPortStr)) {
            query.put("ReservedPortStr", request.reservedPortStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecuInfo)) {
            query.put("EcuInfo", request.ecuInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mem)) {
            query.put("Mem", request.mem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckURL)) {
            query.put("HealthCheckURL", request.healthCheckURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jdk)) {
            query.put("Jdk", request.jdk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webContainer)) {
            query.put("WebContainer", request.webContainer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            query.put("PackageType", request.packageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentIds)) {
            query.put("ComponentIds", request.componentIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hooks)) {
            query.put("Hooks", request.hooks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jvmOptions)) {
            query.put("JvmOptions", request.jvmOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minHeapSize)) {
            query.put("MinHeapSize", request.minHeapSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxPermSize)) {
            query.put("MaxPermSize", request.maxPermSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxHeapSize)) {
            query.put("MaxHeapSize", request.maxHeapSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableUrlCheck)) {
            query.put("EnableUrlCheck", request.enableUrlCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enablePortCheck)) {
            query.put("EnablePortCheck", request.enablePortCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckUrl)) {
            query.put("HealthCheckUrl", request.healthCheckUrl);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("InsertApplication", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/changeorder/co_create_app", "json", req, runtime), new InsertApplicationResponse());
    }

    public InsertClusterResponse insertCluster(InsertClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.insertClusterWithOptions(request, headers, runtime);
    }

    public InsertClusterResponse insertClusterWithOptions(InsertClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkMode)) {
            query.put("NetworkMode", request.networkMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversoldFactor)) {
            query.put("OversoldFactor", request.oversoldFactor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iaasProvider)) {
            query.put("IaasProvider", request.iaasProvider);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("InsertCluster", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/resource/cluster", "json", req, runtime), new InsertClusterResponse());
    }

    public InsertClusterMemberResponse insertClusterMember(InsertClusterMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.insertClusterMemberWithOptions(request, headers, runtime);
    }

    public InsertClusterMemberResponse insertClusterMemberWithOptions(InsertClusterMemberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("clusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("instanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("password", request.password);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("InsertClusterMember", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/resource/cluster_member", "json", req, runtime), new InsertClusterMemberResponse());
    }

    public InsertConfigCenterResponse insertConfigCenter(InsertConfigCenterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.insertConfigCenterWithOptions(request, headers, runtime);
    }

    public InsertConfigCenterResponse insertConfigCenterWithOptions(InsertConfigCenterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            query.put("DataId", request.dataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("Group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("InsertConfigCenter", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/configCenter", "json", req, runtime), new InsertConfigCenterResponse());
    }

    public InsertDegradeControlResponse insertDegradeControl(InsertDegradeControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.insertDegradeControlWithOptions(request, headers, runtime);
    }

    public InsertDegradeControlResponse insertDegradeControlWithOptions(InsertDegradeControlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.methodName)) {
            query.put("MethodName", request.methodName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rtThreshold)) {
            query.put("RtThreshold", request.rtThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.urlVar)) {
            query.put("UrlVar", request.urlVar);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("InsertDegradeControl", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/degradeControl", "json", req, runtime), new InsertDegradeControlResponse());
    }

    public InsertDeployGroupResponse insertDeployGroup(InsertDeployGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.insertDeployGroupWithOptions(request, headers, runtime);
    }

    public InsertDeployGroupResponse insertDeployGroupWithOptions(InsertDeployGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initPackageVersionId)) {
            query.put("InitPackageVersionId", request.initPackageVersionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("InsertDeployGroup", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/deploy_group", "json", req, runtime), new InsertDeployGroupResponse());
    }

    public InsertFlowControlResponse insertFlowControl(InsertFlowControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.insertFlowControlWithOptions(request, headers, runtime);
    }

    public InsertFlowControlResponse insertFlowControlWithOptions(InsertFlowControlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerAppId)) {
            query.put("ConsumerAppId", request.consumerAppId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.granularity)) {
            query.put("Granularity", request.granularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.methodName)) {
            query.put("MethodName", request.methodName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategy)) {
            query.put("Strategy", request.strategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.urlVar)) {
            query.put("UrlVar", request.urlVar);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("InsertFlowControl", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/flowControl", "json", req, runtime), new InsertFlowControlResponse());
    }

    public InsertK8sApplicationResponse insertK8sApplication(InsertK8sApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.insertK8sApplicationWithOptions(request, headers, runtime);
    }

    public InsertK8sApplicationResponse insertK8sApplicationWithOptions(InsertK8sApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.intranetTargetPort)) {
            query.put("IntranetTargetPort", request.intranetTargetPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intranetSlbPort)) {
            query.put("IntranetSlbPort", request.intranetSlbPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationDescription)) {
            query.put("ApplicationDescription", request.applicationDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicas)) {
            query.put("Replicas", request.replicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitCpu)) {
            query.put("LimitCpu", request.limitCpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitMem)) {
            query.put("LimitMem", request.limitMem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestsCpu)) {
            query.put("RequestsCpu", request.requestsCpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestsMem)) {
            query.put("RequestsMem", request.requestsMem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.command)) {
            query.put("Command", request.command);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commandArgs)) {
            query.put("CommandArgs", request.commandArgs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intranetSlbProtocol)) {
            query.put("IntranetSlbProtocol", request.intranetSlbProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intranetSlbId)) {
            query.put("IntranetSlbId", request.intranetSlbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetSlbId)) {
            query.put("InternetSlbId", request.internetSlbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetSlbProtocol)) {
            query.put("InternetSlbProtocol", request.internetSlbProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetSlbPort)) {
            query.put("InternetSlbPort", request.internetSlbPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetTargetPort)) {
            query.put("InternetTargetPort", request.internetTargetPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envs)) {
            query.put("Envs", request.envs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preStop)) {
            query.put("PreStop", request.preStop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.postStart)) {
            query.put("PostStart", request.postStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveness)) {
            query.put("Liveness", request.liveness);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.readiness)) {
            query.put("Readiness", request.readiness);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nasId)) {
            query.put("NasId", request.nasId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountDescs)) {
            query.put("MountDescs", request.mountDescs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localVolume)) {
            query.put("LocalVolume", request.localVolume);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            query.put("PackageType", request.packageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageUrl)) {
            query.put("PackageUrl", request.packageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageVersion)) {
            query.put("PackageVersion", request.packageVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.JDK)) {
            query.put("JDK", request.JDK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webContainer)) {
            query.put("WebContainer", request.webContainer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edasContainerVersion)) {
            query.put("EdasContainerVersion", request.edasContainerVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uriEncoding)) {
            query.put("UriEncoding", request.uriEncoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useBodyEncoding)) {
            query.put("UseBodyEncoding", request.useBodyEncoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestsmCpu)) {
            query.put("RequestsmCpu", request.requestsmCpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitmCpu)) {
            query.put("LimitmCpu", request.limitmCpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeClassName)) {
            query.put("RuntimeClassName", request.runtimeClassName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployAcrossZones)) {
            query.put("DeployAcrossZones", request.deployAcrossZones);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAhas)) {
            query.put("EnableAhas", request.enableAhas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webContainerConfig)) {
            query.put("WebContainerConfig", request.webContainerConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.javaStartUpConfig)) {
            query.put("JavaStartUpConfig", request.javaStartUpConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsConfigs)) {
            query.put("SlsConfigs", request.slsConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isMultilingualApp)) {
            query.put("IsMultilingualApp", request.isMultilingualApp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployAcrossNodes)) {
            query.put("DeployAcrossNodes", request.deployAcrossNodes);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("InsertK8sApplication", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/k8s/acs/create_k8s_app", "json", req, runtime), new InsertK8sApplicationResponse());
    }

    public InsertOrUpdateRegionResponse insertOrUpdateRegion(InsertOrUpdateRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.insertOrUpdateRegionWithOptions(request, headers, runtime);
    }

    public InsertOrUpdateRegionResponse insertOrUpdateRegionWithOptions(InsertOrUpdateRegionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionTag)) {
            query.put("RegionTag", request.regionTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionName)) {
            query.put("RegionName", request.regionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.debugEnable)) {
            query.put("DebugEnable", request.debugEnable);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("InsertOrUpdateRegion", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/user_region_def", "json", req, runtime), new InsertOrUpdateRegionResponse());
    }

    public InsertRoleResponse insertRole(InsertRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.insertRoleWithOptions(request, headers, runtime);
    }

    public InsertRoleResponse insertRoleWithOptions(InsertRoleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.actionData)) {
            query.put("ActionData", request.actionData);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("InsertRole", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/account/create_role", "json", req, runtime), new InsertRoleResponse());
    }

    public InsertServiceGroupResponse insertServiceGroup(InsertServiceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.insertServiceGroupWithOptions(request, headers, runtime);
    }

    public InsertServiceGroupResponse insertServiceGroupWithOptions(InsertServiceGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("InsertServiceGroup", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/service/serviceGroups", "json", req, runtime), new InsertServiceGroupResponse());
    }

    public InsertSwimmingLaneResponse insertSwimmingLane(InsertSwimmingLaneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.insertSwimmingLaneWithOptions(request, headers, runtime);
    }

    public InsertSwimmingLaneResponse insertSwimmingLaneWithOptions(InsertSwimmingLaneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entryRules)) {
            query.put("EntryRules", request.entryRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableRules)) {
            query.put("EnableRules", request.enableRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInfos)) {
            query.put("AppInfos", request.appInfos);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("InsertSwimmingLane", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/trafficmgnt/swimming_lanes", "json", req, runtime), new InsertSwimmingLaneResponse());
    }

    public InsertSwimmingLaneGroupResponse insertSwimmingLaneGroup(InsertSwimmingLaneGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.insertSwimmingLaneGroupWithOptions(request, headers, runtime);
    }

    public InsertSwimmingLaneGroupResponse insertSwimmingLaneGroupWithOptions(InsertSwimmingLaneGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entryApp)) {
            query.put("EntryApp", request.entryApp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appIds)) {
            query.put("AppIds", request.appIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("InsertSwimmingLaneGroup", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/trafficmgnt/swimming_lane_groups", "json", req, runtime), new InsertSwimmingLaneGroupResponse());
    }

    public InstallAgentResponse installAgent(InstallAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installAgentWithOptions(request, headers, runtime);
    }

    public InstallAgentResponse installAgentWithOptions(InstallAgentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.doAsync)) {
            query.put("DoAsync", request.doAsync);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("InstallAgent", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/ecss/install_agent", "json", req, runtime), new InstallAgentResponse());
    }

    public ListAliyunRegionResponse listAliyunRegion() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAliyunRegionWithOptions(headers, runtime);
    }

    public ListAliyunRegionResponse listAliyunRegionWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListAliyunRegion", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/resource/region_list", "json", req, runtime), new ListAliyunRegionResponse());
    }

    public ListApplicationResponse listApplication(ListApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApplicationWithOptions(request, headers, runtime);
    }

    public ListApplicationResponse listApplicationWithOptions(ListApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionIdFilter)) {
            query.put("LogicalRegionIdFilter", request.logicalRegionIdFilter);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListApplication", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/app/app_list", "json", req, runtime), new ListApplicationResponse());
    }

    public ListApplicationEcuResponse listApplicationEcu(ListApplicationEcuRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApplicationEcuWithOptions(request, headers, runtime);
    }

    public ListApplicationEcuResponse listApplicationEcuWithOptions(ListApplicationEcuRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListApplicationEcu", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/resource/ecu_list", "json", req, runtime), new ListApplicationEcuResponse());
    }

    public ListAuthorityResponse listAuthority() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAuthorityWithOptions(headers, runtime);
    }

    public ListAuthorityResponse listAuthorityWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListAuthority", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/account/authority_list", "json", req, runtime), new ListAuthorityResponse());
    }

    public ListBuildPackResponse listBuildPack() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBuildPackWithOptions(headers, runtime);
    }

    public ListBuildPackResponse listBuildPackWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListBuildPack", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/app/build_pack_list", "json", req, runtime), new ListBuildPackResponse());
    }

    public ListChildrenStacksResponse listChildrenStacks(ListChildrenStacksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listChildrenStacksWithOptions(request, headers, runtime);
    }

    public ListChildrenStacksResponse listChildrenStacksWithOptions(ListChildrenStacksRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.stackId)) {
            query.put("StackId", request.stackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListChildrenStacks", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/s2i/list_children_stack", "json", req, runtime), new ListChildrenStacksResponse());
    }

    public ListClusterResponse listCluster(ListClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterWithOptions(request, headers, runtime);
    }

    public ListClusterResponse listClusterWithOptions(ListClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListCluster", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/resource/cluster_list", "json", req, runtime), new ListClusterResponse());
    }

    public ListClusterMembersResponse listClusterMembers(ListClusterMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterMembersWithOptions(request, headers, runtime);
    }

    public ListClusterMembersResponse listClusterMembersWithOptions(ListClusterMembersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsList)) {
            query.put("EcsList", request.ecsList);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListClusterMembers", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/resource/cluster_member_list", "json", req, runtime), new ListClusterMembersResponse());
    }

    public ListComponentsResponse listComponents() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listComponentsWithOptions(headers, runtime);
    }

    public ListComponentsResponse listComponentsWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListComponents", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/resource/components", "json", req, runtime), new ListComponentsResponse());
    }

    public ListConfigCentersResponse listConfigCenters(ListConfigCentersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConfigCentersWithOptions(request, headers, runtime);
    }

    public ListConfigCentersResponse listConfigCentersWithOptions(ListConfigCentersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataIdPattern)) {
            query.put("DataIdPattern", request.dataIdPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("Group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListConfigCenters", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/configCenters", "json", req, runtime), new ListConfigCentersResponse());
    }

    public ListConsumedServicesResponse listConsumedServices(ListConsumedServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConsumedServicesWithOptions(request, headers, runtime);
    }

    public ListConsumedServicesResponse listConsumedServicesWithOptions(ListConsumedServicesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListConsumedServices", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/service/listConsumedServices", "json", req, runtime), new ListConsumedServicesResponse());
    }

    public ListConvertableEcuResponse listConvertableEcu(ListConvertableEcuRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConvertableEcuWithOptions(request, headers, runtime);
    }

    public ListConvertableEcuResponse listConvertableEcuWithOptions(ListConvertableEcuRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("clusterId", request.clusterId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListConvertableEcu", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/resource/convertable_ecu_list", "json", req, runtime), new ListConvertableEcuResponse());
    }

    public ListCSBGatewayResponse listCSBGateway(ListCSBGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCSBGatewayWithOptions(request, headers, runtime);
    }

    public ListCSBGatewayResponse listCSBGatewayWithOptions(ListCSBGatewayRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListCSBGateway", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/csbgateway/gateway", "json", req, runtime), new ListCSBGatewayResponse());
    }

    public ListDegradeControlsResponse listDegradeControls(ListDegradeControlsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDegradeControlsWithOptions(request, headers, runtime);
    }

    public ListDegradeControlsResponse listDegradeControlsWithOptions(ListDegradeControlsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListDegradeControls", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/app/degradeControls", "json", req, runtime), new ListDegradeControlsResponse());
    }

    public ListDeployGroupResponse listDeployGroup(ListDeployGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDeployGroupWithOptions(request, headers, runtime);
    }

    public ListDeployGroupResponse listDeployGroupWithOptions(ListDeployGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListDeployGroup", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/app/deploy_group_list", "json", req, runtime), new ListDeployGroupResponse());
    }

    public ListEcsNotInClusterResponse listEcsNotInCluster(ListEcsNotInClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEcsNotInClusterWithOptions(request, headers, runtime);
    }

    public ListEcsNotInClusterResponse listEcsNotInClusterWithOptions(ListEcsNotInClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkMode)) {
            query.put("NetworkMode", request.networkMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListEcsNotInCluster", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/resource/ecs_not_in_cluster", "json", req, runtime), new ListEcsNotInClusterResponse());
    }

    public ListEcuByRegionResponse listEcuByRegion(ListEcuByRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEcuByRegionWithOptions(request, headers, runtime);
    }

    public ListEcuByRegionResponse listEcuByRegionWithOptions(ListEcuByRegionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.act)) {
            query.put("Act", request.act);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListEcuByRegion", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/resource/ecu_list", "json", req, runtime), new ListEcuByRegionResponse());
    }

    public ListFlowControlsResponse listFlowControls(ListFlowControlsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFlowControlsWithOptions(request, headers, runtime);
    }

    public ListFlowControlsResponse listFlowControlsWithOptions(ListFlowControlsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListFlowControls", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/app/flowControls", "json", req, runtime), new ListFlowControlsResponse());
    }

    public ListHistoryDeployVersionResponse listHistoryDeployVersion(ListHistoryDeployVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listHistoryDeployVersionWithOptions(request, headers, runtime);
    }

    public ListHistoryDeployVersionResponse listHistoryDeployVersionWithOptions(ListHistoryDeployVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListHistoryDeployVersion", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/app/deploy_history_version_list", "json", req, runtime), new ListHistoryDeployVersionResponse());
    }

    public ListK8sIngressRulesResponse listK8sIngressRules(ListK8sIngressRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listK8sIngressRulesWithOptions(request, headers, runtime);
    }

    public ListK8sIngressRulesResponse listK8sIngressRulesWithOptions(ListK8sIngressRulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListK8sIngressRules", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/k8s/acs/k8s_ingress", "json", req, runtime), new ListK8sIngressRulesResponse());
    }

    public ListMethodsResponse listMethods(ListMethodsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMethodsWithOptions(request, headers, runtime);
    }

    public ListMethodsResponse listMethodsWithOptions(ListMethodsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListMethods", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/service/list_methods", "json", req, runtime), new ListMethodsResponse());
    }

    public ListOperationLogsResponse listOperationLogs(ListOperationLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOperationLogsWithOptions(request, headers, runtime);
    }

    public ListOperationLogsResponse listOperationLogsWithOptions(ListOperationLogsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListOperationLogs", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/operationlog/log_list", "json", req, runtime), new ListOperationLogsResponse());
    }

    public ListPublishedServicesResponse listPublishedServices(ListPublishedServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPublishedServicesWithOptions(request, headers, runtime);
    }

    public ListPublishedServicesResponse listPublishedServicesWithOptions(ListPublishedServicesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListPublishedServices", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/service/listPublishedServices", "json", req, runtime), new ListPublishedServicesResponse());
    }

    public ListRecentChangeOrderResponse listRecentChangeOrder(ListRecentChangeOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRecentChangeOrderWithOptions(request, headers, runtime);
    }

    public ListRecentChangeOrderResponse listRecentChangeOrderWithOptions(ListRecentChangeOrderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListRecentChangeOrder", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/changeorder/change_order_list", "json", req, runtime), new ListRecentChangeOrderResponse());
    }

    public ListResourceGroupResponse listResourceGroup() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceGroupWithOptions(headers, runtime);
    }

    public ListResourceGroupResponse listResourceGroupWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListResourceGroup", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/resource/reg_group_list", "json", req, runtime), new ListResourceGroupResponse());
    }

    public ListRoleResponse listRole() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRoleWithOptions(headers, runtime);
    }

    public ListRoleResponse listRoleWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListRole", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/account/role_list", "json", req, runtime), new ListRoleResponse());
    }

    public ListRootStacksResponse listRootStacks(ListRootStacksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRootStacksWithOptions(request, headers, runtime);
    }

    public ListRootStacksResponse listRootStacksWithOptions(ListRootStacksRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListRootStacks", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/s2i/list_root_stack", "json", req, runtime), new ListRootStacksResponse());
    }

    public ListScaleOutEcuResponse listScaleOutEcu(ListScaleOutEcuRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listScaleOutEcuWithOptions(request, headers, runtime);
    }

    public ListScaleOutEcuResponse listScaleOutEcuWithOptions(ListScaleOutEcuRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mem)) {
            query.put("Mem", request.mem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceNum)) {
            query.put("InstanceNum", request.instanceNum);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListScaleOutEcu", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/resource/scale_out_ecu_list", "json", req, runtime), new ListScaleOutEcuResponse());
    }

    public ListServiceGroupsResponse listServiceGroups() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceGroupsWithOptions(headers, runtime);
    }

    public ListServiceGroupsResponse listServiceGroupsWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListServiceGroups", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/service/serviceGroups", "json", req, runtime), new ListServiceGroupsResponse());
    }

    public ListSlbResponse listSlb() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSlbWithOptions(headers, runtime);
    }

    public ListSlbResponse listSlbWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListSlb", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/slb_list", "json", req, runtime), new ListSlbResponse());
    }

    public ListStatusResponse listStatus(ListStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listStatusWithOptions(request, headers, runtime);
    }

    public ListStatusResponse listStatusWithOptions(ListStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.podName)) {
            query.put("PodName", request.podName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListStatus", "2017-08-01", "HTTPS", "POST", "AK", "/pop/sp/api/mse/status/list", "json", req, runtime), new ListStatusResponse());
    }

    public ListSubAccountResponse listSubAccount() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSubAccountWithOptions(headers, runtime);
    }

    public ListSubAccountResponse listSubAccountWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListSubAccount", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/account/sub_account_list", "json", req, runtime), new ListSubAccountResponse());
    }

    public ListSwimmingLaneResponse listSwimmingLane(ListSwimmingLaneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSwimmingLaneWithOptions(request, headers, runtime);
    }

    public ListSwimmingLaneResponse listSwimmingLaneWithOptions(ListSwimmingLaneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListSwimmingLane", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/trafficmgnt/swimming_lanes", "json", req, runtime), new ListSwimmingLaneResponse());
    }

    public ListSwimmingLaneGroupResponse listSwimmingLaneGroup(ListSwimmingLaneGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSwimmingLaneGroupWithOptions(request, headers, runtime);
    }

    public ListSwimmingLaneGroupResponse listSwimmingLaneGroupWithOptions(ListSwimmingLaneGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListSwimmingLaneGroup", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/trafficmgnt/swimming_lane_groups", "json", req, runtime), new ListSwimmingLaneGroupResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTagResourcesWithOptions(request, headers, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRegionId)) {
            query.put("ResourceRegionId", request.resourceRegionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListTagResources", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/tag/tags", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListUserDefineRegionResponse listUserDefineRegion(ListUserDefineRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserDefineRegionWithOptions(request, headers, runtime);
    }

    public ListUserDefineRegionResponse listUserDefineRegionWithOptions(ListUserDefineRegionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.debugEnable)) {
            query.put("DebugEnable", request.debugEnable);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListUserDefineRegion", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/user_region_defs", "json", req, runtime), new ListUserDefineRegionResponse());
    }

    public ListVpcResponse listVpc() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listVpcWithOptions(headers, runtime);
    }

    public ListVpcResponse listVpcWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListVpc", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/vpc_list", "json", req, runtime), new ListVpcResponse());
    }

    public MigrateEcuResponse migrateEcu(MigrateEcuRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.migrateEcuWithOptions(request, headers, runtime);
    }

    public MigrateEcuResponse migrateEcuWithOptions(MigrateEcuRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("MigrateEcu", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/resource/migrate_ecu", "json", req, runtime), new MigrateEcuResponse());
    }

    public ModifyScalingRuleResponse modifyScalingRule(ModifyScalingRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyScalingRuleWithOptions(request, headers, runtime);
    }

    public ModifyScalingRuleResponse modifyScalingRuleWithOptions(ModifyScalingRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inCondition)) {
            query.put("InCondition", request.inCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inEnable)) {
            query.put("InEnable", request.inEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inCpu)) {
            query.put("InCpu", request.inCpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inDuration)) {
            query.put("InDuration", request.inDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inInstanceNum)) {
            query.put("InInstanceNum", request.inInstanceNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inLoad)) {
            query.put("InLoad", request.inLoad);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inRT)) {
            query.put("InRT", request.inRT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inStep)) {
            query.put("InStep", request.inStep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outCondition)) {
            query.put("OutCondition", request.outCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outCPU)) {
            query.put("OutCPU", request.outCPU);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outDuration)) {
            query.put("OutDuration", request.outDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outEnable)) {
            query.put("OutEnable", request.outEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outInstanceNum)) {
            query.put("OutInstanceNum", request.outInstanceNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outLoad)) {
            query.put("OutLoad", request.outLoad);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outRT)) {
            query.put("OutRT", request.outRT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outStep)) {
            query.put("OutStep", request.outStep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceFrom)) {
            query.put("ResourceFrom", request.resourceFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.multiAzPolicy)) {
            query.put("MultiAzPolicy", request.multiAzPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIds)) {
            query.put("VSwitchIds", request.vSwitchIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingPolicy)) {
            query.put("ScalingPolicy", request.scalingPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateInstanceId)) {
            query.put("TemplateInstanceId", request.templateInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateInstanceName)) {
            query.put("TemplateInstanceName", request.templateInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.acceptEULA)) {
            query.put("AcceptEULA", request.acceptEULA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ModifyScalingRule", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/app/scaling_rules", "json", req, runtime), new ModifyScalingRuleResponse());
    }

    public QueryApplicationStatusResponse queryApplicationStatus(QueryApplicationStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApplicationStatusWithOptions(request, headers, runtime);
    }

    public QueryApplicationStatusResponse queryApplicationStatusWithOptions(QueryApplicationStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("QueryApplicationStatus", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/app/app_status", "json", req, runtime), new QueryApplicationStatusResponse());
    }

    public QueryConfigCenterResponse queryConfigCenter(QueryConfigCenterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryConfigCenterWithOptions(request, headers, runtime);
    }

    public QueryConfigCenterResponse queryConfigCenterWithOptions(QueryConfigCenterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            query.put("DataId", request.dataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("Group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("QueryConfigCenter", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/configCenter", "json", req, runtime), new QueryConfigCenterResponse());
    }

    public QueryEccInfoResponse queryEccInfo(QueryEccInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEccInfoWithOptions(request, headers, runtime);
    }

    public QueryEccInfoResponse queryEccInfoWithOptions(QueryEccInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eccId)) {
            query.put("EccId", request.eccId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("QueryEccInfo", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/ecc", "json", req, runtime), new QueryEccInfoResponse());
    }

    public QueryK8sClusterLogProjectInfoResponse queryK8sClusterLogProjectInfo(QueryK8sClusterLogProjectInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryK8sClusterLogProjectInfoWithOptions(request, headers, runtime);
    }

    public QueryK8sClusterLogProjectInfoResponse queryK8sClusterLogProjectInfoWithOptions(QueryK8sClusterLogProjectInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("QueryK8sClusterLogProjectInfo", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/k8s/sls/project", "json", req, runtime), new QueryK8sClusterLogProjectInfoResponse());
    }

    public QueryMigrateEcuListResponse queryMigrateEcuList(QueryMigrateEcuListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMigrateEcuListWithOptions(request, headers, runtime);
    }

    public QueryMigrateEcuListResponse queryMigrateEcuListWithOptions(QueryMigrateEcuListRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("QueryMigrateEcuList", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/resource/migrate_ecu_list", "json", req, runtime), new QueryMigrateEcuListResponse());
    }

    public QueryMigrateRegionListResponse queryMigrateRegionList(QueryMigrateRegionListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMigrateRegionListWithOptions(request, headers, runtime);
    }

    public QueryMigrateRegionListResponse queryMigrateRegionListWithOptions(QueryMigrateRegionListRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("QueryMigrateRegionList", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/resource/migrate_region_select", "json", req, runtime), new QueryMigrateRegionListResponse());
    }

    public QueryMonitorInfoResponse queryMonitorInfo(QueryMonitorInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMonitorInfoWithOptions(request, headers, runtime);
    }

    public QueryMonitorInfoResponse queryMonitorInfoWithOptions(QueryMonitorInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("Start", request.start);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("End", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metric)) {
            query.put("Metric", request.metric);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aggregator)) {
            query.put("Aggregator", request.aggregator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("QueryMonitorInfo", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/monitor/queryMonitorInfo", "json", req, runtime), new QueryMonitorInfoResponse());
    }

    public QueryRegionConfigResponse queryRegionConfig() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRegionConfigWithOptions(headers, runtime);
    }

    public QueryRegionConfigResponse queryRegionConfigWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("QueryRegionConfig", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/region_config", "json", req, runtime), new QueryRegionConfigResponse());
    }

    public QueryServiceTimeConfigResponse queryServiceTimeConfig(QueryServiceTimeConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryServiceTimeConfigWithOptions(request, headers, runtime);
    }

    public QueryServiceTimeConfigResponse queryServiceTimeConfigWithOptions(QueryServiceTimeConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("ServiceVersion", request.serviceVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroup)) {
            query.put("ServiceGroup", request.serviceGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("QueryServiceTimeConfig", "2017-08-01", "HTTPS", "POST", "AK", "/pop/sp/api/timeout/page", "json", req, runtime), new QueryServiceTimeConfigResponse());
    }

    public QuerySlsLogStoreListResponse querySlsLogStoreList(QuerySlsLogStoreListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySlsLogStoreListWithOptions(request, headers, runtime);
    }

    public QuerySlsLogStoreListResponse querySlsLogStoreListWithOptions(QuerySlsLogStoreListRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("QuerySlsLogStoreList", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/k8s/sls/query_sls_log_store_list", "json", req, runtime), new QuerySlsLogStoreListResponse());
    }

    public RemoveMockRuleResponse removeMockRule(RemoveMockRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeMockRuleWithOptions(request, headers, runtime);
    }

    public RemoveMockRuleResponse removeMockRuleWithOptions(RemoveMockRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("RemoveMockRule", "2017-08-01", "HTTPS", "POST", "AK", "/pop/sp/api/mock/removeMockRule", "json", req, runtime), new RemoveMockRuleResponse());
    }

    public ResetApplicationResponse resetApplication(ResetApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetApplicationWithOptions(request, headers, runtime);
    }

    public ResetApplicationResponse resetApplicationWithOptions(ResetApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eccInfo)) {
            query.put("EccInfo", request.eccInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ResetApplication", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/changeorder/co_reset", "json", req, runtime), new ResetApplicationResponse());
    }

    public RestartApplicationResponse restartApplication(RestartApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartApplicationWithOptions(request, headers, runtime);
    }

    public RestartApplicationResponse restartApplicationWithOptions(RestartApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eccInfo)) {
            query.put("EccInfo", request.eccInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("RestartApplication", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/changeorder/co_restart", "json", req, runtime), new RestartApplicationResponse());
    }

    public RestartK8sApplicationResponse restartK8sApplication(RestartK8sApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartK8sApplicationWithOptions(request, headers, runtime);
    }

    public RestartK8sApplicationResponse restartK8sApplicationWithOptions(RestartK8sApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("RestartK8sApplication", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/k8s/acs/restart_k8s_app", "json", req, runtime), new RestartK8sApplicationResponse());
    }

    public RollbackApplicationResponse rollbackApplication(RollbackApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rollbackApplicationWithOptions(request, headers, runtime);
    }

    public RollbackApplicationResponse rollbackApplicationWithOptions(RollbackApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.historyVersion)) {
            query.put("HistoryVersion", request.historyVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batch)) {
            query.put("Batch", request.batch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchWaitTime)) {
            query.put("BatchWaitTime", request.batchWaitTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("RollbackApplication", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/changeorder/co_rollback", "json", req, runtime), new RollbackApplicationResponse());
    }

    public RollbackChangeOrderResponse rollbackChangeOrder(RollbackChangeOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rollbackChangeOrderWithOptions(request, headers, runtime);
    }

    public RollbackChangeOrderResponse rollbackChangeOrderWithOptions(RollbackChangeOrderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeOrderId)) {
            query.put("ChangeOrderId", request.changeOrderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("RollbackChangeOrder", "2017-08-01", "HTTPS", "PUT", "AK", "/pop/v5/oam/changeorder/rollback", "json", req, runtime), new RollbackChangeOrderResponse());
    }

    public ScaleInApplicationResponse scaleInApplication(ScaleInApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scaleInApplicationWithOptions(request, headers, runtime);
    }

    public ScaleInApplicationResponse scaleInApplicationWithOptions(ScaleInApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eccInfo)) {
            query.put("EccInfo", request.eccInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceStatus)) {
            query.put("ForceStatus", request.forceStatus);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ScaleInApplication", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/changeorder/co_scale_in", "json", req, runtime), new ScaleInApplicationResponse());
    }

    public ScaleK8sApplicationResponse scaleK8sApplication(ScaleK8sApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scaleK8sApplicationWithOptions(request, headers, runtime);
    }

    public ScaleK8sApplicationResponse scaleK8sApplicationWithOptions(ScaleK8sApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicas)) {
            query.put("Replicas", request.replicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ScaleK8sApplication", "2017-08-01", "HTTPS", "PUT", "AK", "/pop/v5/k8s/acs/k8s_apps", "json", req, runtime), new ScaleK8sApplicationResponse());
    }

    public ScaleOutApplicationResponse scaleOutApplication(ScaleOutApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scaleOutApplicationWithOptions(request, headers, runtime);
    }

    public ScaleOutApplicationResponse scaleOutApplicationWithOptions(ScaleOutApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecuInfo)) {
            query.put("EcuInfo", request.ecuInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployGroup)) {
            query.put("DeployGroup", request.deployGroup);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ScaleOutApplication", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/changeorder/co_scale_out", "json", req, runtime), new ScaleOutApplicationResponse());
    }

    public ScaleoutApplicationWithNewInstancesResponse scaleoutApplicationWithNewInstances(ScaleoutApplicationWithNewInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scaleoutApplicationWithNewInstancesWithOptions(request, headers, runtime);
    }

    public ScaleoutApplicationWithNewInstancesResponse scaleoutApplicationWithNewInstancesWithOptions(ScaleoutApplicationWithNewInstancesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingNum)) {
            query.put("ScalingNum", request.scalingNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingPolicy)) {
            query.put("ScalingPolicy", request.scalingPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateInstanceId)) {
            query.put("TemplateInstanceId", request.templateInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceChargeType)) {
            query.put("InstanceChargeType", request.instanceChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceChargePeriodUnit)) {
            query.put("InstanceChargePeriodUnit", request.instanceChargePeriodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceChargePeriod)) {
            query.put("InstanceChargePeriod", request.instanceChargePeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewPeriod)) {
            query.put("AutoRenewPeriod", request.autoRenewPeriod);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ScaleoutApplicationWithNewInstances", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/scaling/scale_out", "json", req, runtime), new ScaleoutApplicationWithNewInstancesResponse());
    }

    public StartApplicationResponse startApplication(StartApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startApplicationWithOptions(request, headers, runtime);
    }

    public StartApplicationResponse startApplicationWithOptions(StartApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eccInfo)) {
            query.put("EccInfo", request.eccInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("StartApplication", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/changeorder/co_start", "json", req, runtime), new StartApplicationResponse());
    }

    public StartK8sApplicationResponse startK8sApplication(StartK8sApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startK8sApplicationWithOptions(request, headers, runtime);
    }

    public StartK8sApplicationResponse startK8sApplicationWithOptions(StartK8sApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.replicas)) {
            query.put("Replicas", request.replicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("StartK8sApplication", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/k8s/acs/start_k8s_app", "json", req, runtime), new StartK8sApplicationResponse());
    }

    public StopApplicationResponse stopApplication(StopApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopApplicationWithOptions(request, headers, runtime);
    }

    public StopApplicationResponse stopApplicationWithOptions(StopApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eccInfo)) {
            query.put("EccInfo", request.eccInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("StopApplication", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/changeorder/co_stop", "json", req, runtime), new StopApplicationResponse());
    }

    public StopK8sApplicationResponse stopK8sApplication(StopK8sApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopK8sApplicationWithOptions(request, headers, runtime);
    }

    public StopK8sApplicationResponse stopK8sApplicationWithOptions(StopK8sApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("StopK8sApplication", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/k8s/acs/stop_k8s_app", "json", req, runtime), new StopK8sApplicationResponse());
    }

    public SwitchAdvancedMonitoringResponse switchAdvancedMonitoring(SwitchAdvancedMonitoringRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.switchAdvancedMonitoringWithOptions(request, headers, runtime);
    }

    public SwitchAdvancedMonitoringResponse switchAdvancedMonitoringWithOptions(SwitchAdvancedMonitoringRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAdvancedMonitoring)) {
            query.put("EnableAdvancedMonitoring", request.enableAdvancedMonitoring);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("SwitchAdvancedMonitoring", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/monitor/advancedMonitorInfo", "json", req, runtime), new SwitchAdvancedMonitoringResponse());
    }

    public SynchronizeResourceResponse synchronizeResource(SynchronizeResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.synchronizeResourceWithOptions(request, headers, runtime);
    }

    public SynchronizeResourceResponse synchronizeResourceWithOptions(SynchronizeResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("SynchronizeResource", "2017-08-01", "HTTPS", "GET", "AK", "/pop/v5/resource/pop_sync_resource", "json", req, runtime), new SynchronizeResourceResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.tagResourcesWithOptions(request, headers, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRegionId)) {
            query.put("ResourceRegionId", request.resourceRegionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("TagResources", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/tag/tags", "json", req, runtime), new TagResourcesResponse());
    }

    public TransformClusterMemberResponse transformClusterMember(TransformClusterMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.transformClusterMemberWithOptions(request, headers, runtime);
    }

    public TransformClusterMemberResponse transformClusterMemberWithOptions(TransformClusterMemberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetClusterId)) {
            query.put("TargetClusterId", request.targetClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("TransformClusterMember", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/resource/transform_cluster_member", "json", req, runtime), new TransformClusterMemberResponse());
    }

    public UnbindK8sSlbResponse unbindK8sSlb(UnbindK8sSlbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindK8sSlbWithOptions(request, headers, runtime);
    }

    public UnbindK8sSlbResponse unbindK8sSlbWithOptions(UnbindK8sSlbRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slbName)) {
            query.put("SlbName", request.slbName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UnbindK8sSlb", "2017-08-01", "HTTPS", "DELETE", "AK", "/pop/v5/k8s/acs/k8s_slb_binding", "json", req, runtime), new UnbindK8sSlbResponse());
    }

    public UnbindSlbResponse unbindSlb(UnbindSlbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindSlbWithOptions(request, headers, runtime);
    }

    public UnbindSlbResponse unbindSlbWithOptions(UnbindSlbRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slbId)) {
            query.put("SlbId", request.slbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UnbindSlb", "2017-08-01", "HTTPS", "POST", "AK", "/pop/app/unbind_slb_json", "json", req, runtime), new UnbindSlbResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.untagResourcesWithOptions(request, headers, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceRegionId)) {
            query.put("ResourceRegionId", request.resourceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeys)) {
            query.put("TagKeys", request.tagKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteAll)) {
            query.put("DeleteAll", request.deleteAll);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UntagResources", "2017-08-01", "HTTPS", "DELETE", "AK", "/pop/v5/tag/tags", "json", req, runtime), new UntagResourcesResponse());
    }

    public UpdateAccountInfoResponse updateAccountInfo(UpdateAccountInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAccountInfoWithOptions(request, headers, runtime);
    }

    public UpdateAccountInfoResponse updateAccountInfoWithOptions(UpdateAccountInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telephone)) {
            query.put("Telephone", request.telephone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateAccountInfo", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/account/edit_account_info", "json", req, runtime), new UpdateAccountInfoResponse());
    }

    public UpdateApplicationBaseInfoResponse updateApplicationBaseInfo(UpdateApplicationBaseInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApplicationBaseInfoWithOptions(request, headers, runtime);
    }

    public UpdateApplicationBaseInfoResponse updateApplicationBaseInfoWithOptions(UpdateApplicationBaseInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            query.put("Desc", request.desc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            query.put("Owner", request.owner);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateApplicationBaseInfo", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/app/update_app_info", "json", req, runtime), new UpdateApplicationBaseInfoResponse());
    }

    public UpdateContainerResponse updateContainer(UpdateContainerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateContainerWithOptions(request, headers, runtime);
    }

    public UpdateContainerResponse updateContainerWithOptions(UpdateContainerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buildPackId)) {
            query.put("BuildPackId", request.buildPackId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateContainer", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/changeorder/co_update_container", "json", req, runtime), new UpdateContainerResponse());
    }

    public UpdateContainerConfigurationResponse updateContainerConfiguration(UpdateContainerConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateContainerConfigurationWithOptions(request, headers, runtime);
    }

    public UpdateContainerConfigurationResponse updateContainerConfigurationWithOptions(UpdateContainerConfigurationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contextPath)) {
            query.put("ContextPath", request.contextPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpPort)) {
            query.put("HttpPort", request.httpPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxThreads)) {
            query.put("MaxThreads", request.maxThreads);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URIEncoding)) {
            query.put("URIEncoding", request.URIEncoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useBodyEncoding)) {
            query.put("UseBodyEncoding", request.useBodyEncoding);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateContainerConfiguration", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/app/container_config", "json", req, runtime), new UpdateContainerConfigurationResponse());
    }

    public UpdateDegradeControlResponse updateDegradeControl(UpdateDegradeControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDegradeControlWithOptions(request, headers, runtime);
    }

    public UpdateDegradeControlResponse updateDegradeControlWithOptions(UpdateDegradeControlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.methodName)) {
            query.put("MethodName", request.methodName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rtThreshold)) {
            query.put("RtThreshold", request.rtThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.urlVar)) {
            query.put("UrlVar", request.urlVar);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateDegradeControl", "2017-08-01", "HTTPS", "PUT", "AK", "/pop/v5/degradeControl", "json", req, runtime), new UpdateDegradeControlResponse());
    }

    public UpdateFlowControlResponse updateFlowControl(UpdateFlowControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFlowControlWithOptions(request, headers, runtime);
    }

    public UpdateFlowControlResponse updateFlowControlWithOptions(UpdateFlowControlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerAppId)) {
            query.put("ConsumerAppId", request.consumerAppId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.granularity)) {
            query.put("Granularity", request.granularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.methodName)) {
            query.put("MethodName", request.methodName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategy)) {
            query.put("Strategy", request.strategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.urlVar)) {
            query.put("UrlVar", request.urlVar);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateFlowControl", "2017-08-01", "HTTPS", "PUT", "AK", "/pop/v5/flowControl", "json", req, runtime), new UpdateFlowControlResponse());
    }

    public UpdateHealthCheckUrlResponse updateHealthCheckUrl(UpdateHealthCheckUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateHealthCheckUrlWithOptions(request, headers, runtime);
    }

    public UpdateHealthCheckUrlResponse updateHealthCheckUrlWithOptions(UpdateHealthCheckUrlRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hcURL)) {
            query.put("hcURL", request.hcURL);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateHealthCheckUrl", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/app/modify_hc_url", "json", req, runtime), new UpdateHealthCheckUrlResponse());
    }

    public UpdateHookConfigurationResponse updateHookConfiguration(UpdateHookConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateHookConfigurationWithOptions(request, headers, runtime);
    }

    public UpdateHookConfigurationResponse updateHookConfigurationWithOptions(UpdateHookConfigurationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hooks)) {
            query.put("Hooks", request.hooks);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateHookConfiguration", "2017-08-01", "HTTPS", "POST", "AK", "/pop/app/config_app_hook_json", "json", req, runtime), new UpdateHookConfigurationResponse());
    }

    public UpdateJvmConfigurationResponse updateJvmConfiguration(UpdateJvmConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateJvmConfigurationWithOptions(request, headers, runtime);
    }

    public UpdateJvmConfigurationResponse updateJvmConfigurationWithOptions(UpdateJvmConfigurationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            query.put("Options", request.options);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minHeapSize)) {
            query.put("MinHeapSize", request.minHeapSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxPermSize)) {
            query.put("MaxPermSize", request.maxPermSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxHeapSize)) {
            query.put("MaxHeapSize", request.maxHeapSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateJvmConfiguration", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/app/app_jvm_config", "json", req, runtime), new UpdateJvmConfigurationResponse());
    }

    public UpdateK8sApplicationBaseInfoResponse updateK8sApplicationBaseInfo(UpdateK8sApplicationBaseInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateK8sApplicationBaseInfoWithOptions(request, headers, runtime);
    }

    public UpdateK8sApplicationBaseInfoResponse updateK8sApplicationBaseInfoWithOptions(UpdateK8sApplicationBaseInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            query.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateK8sApplicationBaseInfo", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/oam/update_app_basic_info", "json", req, runtime), new UpdateK8sApplicationBaseInfoResponse());
    }

    public UpdateK8sApplicationConfigResponse updateK8sApplicationConfig(UpdateK8sApplicationConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateK8sApplicationConfigWithOptions(request, headers, runtime);
    }

    public UpdateK8sApplicationConfigResponse updateK8sApplicationConfigWithOptions(UpdateK8sApplicationConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuLimit)) {
            query.put("CpuLimit", request.cpuLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memoryLimit)) {
            query.put("MemoryLimit", request.memoryLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mcpuLimit)) {
            query.put("McpuLimit", request.mcpuLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuRequest)) {
            query.put("CpuRequest", request.cpuRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mcpuRequest)) {
            query.put("McpuRequest", request.mcpuRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memoryRequest)) {
            query.put("MemoryRequest", request.memoryRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateK8sApplicationConfig", "2017-08-01", "HTTPS", "PUT", "AK", "/pop/v5/k8s/acs/k8s_app_configuration", "json", req, runtime), new UpdateK8sApplicationConfigResponse());
    }

    public UpdateK8sIngressRuleResponse updateK8sIngressRule(UpdateK8sIngressRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateK8sIngressRuleWithOptions(request, headers, runtime);
    }

    public UpdateK8sIngressRuleResponse updateK8sIngressRuleWithOptions(UpdateK8sIngressRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rules)) {
            query.put("Rules", request.rules);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateK8sIngressRule", "2017-08-01", "HTTPS", "PUT", "AK", "/pop/v5/k8s/acs/k8s_ingress", "json", req, runtime), new UpdateK8sIngressRuleResponse());
    }

    public UpdateK8sResourceResponse updateK8sResource(UpdateK8sResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateK8sResourceWithOptions(request, headers, runtime);
    }

    public UpdateK8sResourceResponse updateK8sResourceWithOptions(UpdateK8sResourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceContent)) {
            body.put("ResourceContent", request.resourceContent);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("UpdateK8sResource", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/oam/update_k8s_resource_config", "json", req, runtime), new UpdateK8sResourceResponse());
    }

    public UpdateK8sServiceResponse updateK8sService(UpdateK8sServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateK8sServiceWithOptions(request, headers, runtime);
    }

    public UpdateK8sServiceResponse updateK8sServiceWithOptions(UpdateK8sServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicePorts)) {
            query.put("ServicePorts", request.servicePorts);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateK8sService", "2017-08-01", "HTTPS", "PUT", "AK", "/pop/v5/k8s/acs/k8s_service", "json", req, runtime), new UpdateK8sServiceResponse());
    }

    public UpdateK8sSlbResponse updateK8sSlb(UpdateK8sSlbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateK8sSlbWithOptions(request, headers, runtime);
    }

    public UpdateK8sSlbResponse updateK8sSlbWithOptions(UpdateK8sSlbRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slbProtocol)) {
            query.put("SlbProtocol", request.slbProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPort)) {
            query.put("TargetPort", request.targetPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicePortInfos)) {
            query.put("ServicePortInfos", request.servicePortInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specification)) {
            query.put("Specification", request.specification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            query.put("Scheduler", request.scheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slbName)) {
            query.put("SlbName", request.slbName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateK8sSlb", "2017-08-01", "HTTPS", "PUT", "AK", "/pop/v5/k8s/acs/k8s_slb_binding", "json", req, runtime), new UpdateK8sSlbResponse());
    }

    public UpdateMockRuleResponse updateMockRule(UpdateMockRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMockRuleWithOptions(request, headers, runtime);
    }

    public UpdateMockRuleResponse updateMockRuleWithOptions(UpdateMockRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraJson)) {
            query.put("ExtraJson", request.extraJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scMockItemJson)) {
            query.put("ScMockItemJson", request.scMockItemJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dubboMockItemJson)) {
            query.put("DubboMockItemJson", request.dubboMockItemJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateMockRule", "2017-08-01", "HTTPS", "POST", "AK", "/pop/sp/api/mock/updateMockRule", "json", req, runtime), new UpdateMockRuleResponse());
    }

    public UpdateRoleResponse updateRole(UpdateRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRoleWithOptions(request, headers, runtime);
    }

    public UpdateRoleResponse updateRoleWithOptions(UpdateRoleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            query.put("RoleId", request.roleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.actionData)) {
            query.put("ActionData", request.actionData);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateRole", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/account/edit_role", "json", req, runtime), new UpdateRoleResponse());
    }

    public UpdateSlsLogStoreResponse updateSlsLogStore(UpdateSlsLogStoreRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSlsLogStoreWithOptions(request, headers, runtime);
    }

    public UpdateSlsLogStoreResponse updateSlsLogStoreWithOptions(UpdateSlsLogStoreRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configs)) {
            body.put("Configs", request.configs);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("UpdateSlsLogStore", "2017-08-01", "HTTPS", "POST", "AK", "/pop/v5/k8s/sls/update_sls_log_store", "json", req, runtime), new UpdateSlsLogStoreResponse());
    }

    public UpdateSwimmingLaneResponse updateSwimmingLane(UpdateSwimmingLaneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSwimmingLaneWithOptions(request, headers, runtime);
    }

    public UpdateSwimmingLaneResponse updateSwimmingLaneWithOptions(UpdateSwimmingLaneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.laneId)) {
            query.put("LaneId", request.laneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableRules)) {
            query.put("EnableRules", request.enableRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInfos)) {
            query.put("AppInfos", request.appInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entryRules)) {
            query.put("EntryRules", request.entryRules);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateSwimmingLane", "2017-08-01", "HTTPS", "PUT", "AK", "/pop/v5/trafficmgnt/swimming_lanes", "json", req, runtime), new UpdateSwimmingLaneResponse());
    }

    public UpdateSwimmingLaneGroupResponse updateSwimmingLaneGroup(UpdateSwimmingLaneGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSwimmingLaneGroupWithOptions(request, headers, runtime);
    }

    public UpdateSwimmingLaneGroupResponse updateSwimmingLaneGroupWithOptions(UpdateSwimmingLaneGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entryApp)) {
            query.put("EntryApp", request.entryApp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appIds)) {
            query.put("AppIds", request.appIds);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateSwimmingLaneGroup", "2017-08-01", "HTTPS", "PUT", "AK", "/pop/v5/trafficmgnt/swimming_lane_groups", "json", req, runtime), new UpdateSwimmingLaneGroupResponse());
    }
}
