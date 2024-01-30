// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801;

import com.aliyun.tea.*;
import com.aliyun.edas20170801.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
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

    public AbortAndRollbackChangeOrderResponse abortAndRollbackChangeOrderWithOptions(AbortAndRollbackChangeOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeOrderId)) {
            query.put("ChangeOrderId", request.changeOrderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AbortAndRollbackChangeOrder"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/changeorder/change_order_abort_and_rollback"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AbortAndRollbackChangeOrderResponse());
    }

    public AbortAndRollbackChangeOrderResponse abortAndRollbackChangeOrder(AbortAndRollbackChangeOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.abortAndRollbackChangeOrderWithOptions(request, headers, runtime);
    }

    public AbortChangeOrderResponse abortChangeOrderWithOptions(AbortChangeOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeOrderId)) {
            query.put("ChangeOrderId", request.changeOrderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AbortChangeOrder"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/changeorder/change_order_abort"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AbortChangeOrderResponse());
    }

    public AbortChangeOrderResponse abortChangeOrder(AbortChangeOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.abortChangeOrderWithOptions(request, headers, runtime);
    }

    public AddLogPathResponse addLogPathWithOptions(AddLogPathRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            body.put("Path", request.path);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddLogPath"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/log/popListLogDirs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddLogPathResponse());
    }

    public AddLogPathResponse addLogPath(AddLogPathRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addLogPathWithOptions(request, headers, runtime);
    }

    public AuthorizeApplicationResponse authorizeApplicationWithOptions(AuthorizeApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIds)) {
            query.put("AppIds", request.appIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUserId)) {
            query.put("TargetUserId", request.targetUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeApplication"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/account/authorize_app"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeApplicationResponse());
    }

    public AuthorizeApplicationResponse authorizeApplication(AuthorizeApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authorizeApplicationWithOptions(request, headers, runtime);
    }

    public AuthorizeResourceGroupResponse authorizeResourceGroupWithOptions(AuthorizeResourceGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIds)) {
            query.put("ResourceGroupIds", request.resourceGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUserId)) {
            query.put("TargetUserId", request.targetUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeResourceGroup"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/account/authorize_res_group"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeResourceGroupResponse());
    }

    public AuthorizeResourceGroupResponse authorizeResourceGroup(AuthorizeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authorizeResourceGroupWithOptions(request, headers, runtime);
    }

    public AuthorizeRoleResponse authorizeRoleWithOptions(AuthorizeRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleIds)) {
            query.put("RoleIds", request.roleIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUserId)) {
            query.put("TargetUserId", request.targetUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeRole"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/account/authorize_role"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeRoleResponse());
    }

    public AuthorizeRoleResponse authorizeRole(AuthorizeRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authorizeRoleWithOptions(request, headers, runtime);
    }

    public BindEcsSlbResponse bindEcsSlbWithOptions(BindEcsSlbRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployGroupId)) {
            query.put("DeployGroupId", request.deployGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerHealthCheckUrl)) {
            query.put("ListenerHealthCheckUrl", request.listenerHealthCheckUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerProtocol)) {
            query.put("ListenerProtocol", request.listenerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slbId)) {
            query.put("SlbId", request.slbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VForwardingUrlRule)) {
            query.put("VForwardingUrlRule", request.VForwardingUrlRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroupId)) {
            query.put("VServerGroupId", request.VServerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroupName)) {
            query.put("VServerGroupName", request.VServerGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindEcsSlb"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/app/slb/bind_slb"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindEcsSlbResponse());
    }

    public BindEcsSlbResponse bindEcsSlb(BindEcsSlbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindEcsSlbWithOptions(request, headers, runtime);
    }

    public BindK8sSlbResponse bindK8sSlbWithOptions(BindK8sSlbRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            query.put("Scheduler", request.scheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicePortInfos)) {
            query.put("ServicePortInfos", request.servicePortInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slbId)) {
            query.put("SlbId", request.slbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slbProtocol)) {
            query.put("SlbProtocol", request.slbProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specification)) {
            query.put("Specification", request.specification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPort)) {
            query.put("TargetPort", request.targetPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindK8sSlb"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/k8s_slb_binding"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindK8sSlbResponse());
    }

    public BindK8sSlbResponse bindK8sSlb(BindK8sSlbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindK8sSlbWithOptions(request, headers, runtime);
    }

    public BindSlbResponse bindSlbWithOptions(BindSlbRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
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

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroupId)) {
            query.put("VServerGroupId", request.VServerGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindSlb"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/app/bind_slb_json"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindSlbResponse());
    }

    public BindSlbResponse bindSlb(BindSlbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindSlbWithOptions(request, headers, runtime);
    }

    public ChangeDeployGroupResponse changeDeployGroupWithOptions(ChangeDeployGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeDeployGroup"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/changeorder/co_change_group"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeDeployGroupResponse());
    }

    public ChangeDeployGroupResponse changeDeployGroup(ChangeDeployGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.changeDeployGroupWithOptions(request, headers, runtime);
    }

    public ContinuePipelineResponse continuePipelineWithOptions(ContinuePipelineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.confirm)) {
            query.put("Confirm", request.confirm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ContinuePipeline"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/changeorder/pipeline_batch_confirm"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ContinuePipelineResponse());
    }

    public ContinuePipelineResponse continuePipeline(ContinuePipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.continuePipelineWithOptions(request, headers, runtime);
    }

    public ConvertK8sResourceResponse convertK8sResourceWithOptions(ConvertK8sResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            query.put("ResourceName", request.resourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConvertK8sResource"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/oam/k8s_resource_convert"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConvertK8sResourceResponse());
    }

    public ConvertK8sResourceResponse convertK8sResource(ConvertK8sResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.convertK8sResourceWithOptions(request, headers, runtime);
    }

    public CreateApplicationScalingRuleResponse createApplicationScalingRuleWithOptions(CreateApplicationScalingRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingBehaviour)) {
            query.put("ScalingBehaviour", request.scalingBehaviour);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleEnable)) {
            query.put("ScalingRuleEnable", request.scalingRuleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleMetric)) {
            query.put("ScalingRuleMetric", request.scalingRuleMetric);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleName)) {
            query.put("ScalingRuleName", request.scalingRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleTimer)) {
            query.put("ScalingRuleTimer", request.scalingRuleTimer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleTrigger)) {
            query.put("ScalingRuleTrigger", request.scalingRuleTrigger);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleType)) {
            query.put("ScalingRuleType", request.scalingRuleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApplicationScalingRule"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/eam/scale/application_scaling_rule"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApplicationScalingRuleResponse());
    }

    public CreateApplicationScalingRuleResponse createApplicationScalingRule(CreateApplicationScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApplicationScalingRuleWithOptions(request, headers, runtime);
    }

    public CreateConfigTemplateResponse createConfigTemplateWithOptions(CreateConfigTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.format)) {
            body.put("Format", request.format);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConfigTemplate"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/config_template"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConfigTemplateResponse());
    }

    public CreateConfigTemplateResponse createConfigTemplate(CreateConfigTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConfigTemplateWithOptions(request, headers, runtime);
    }

    /**
      * ## Description
      * You must call the CreateIDCImportCommand operation first to generate a command used to import hybrid cloud ECS instances to a hybrid cloud ECS cluster. Then, run this command on the instances to import the instances to the cluster.
      *
      * @param request CreateIDCImportCommandRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateIDCImportCommandResponse
     */
    public CreateIDCImportCommandResponse createIDCImportCommandWithOptions(CreateIDCImportCommandRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIDCImportCommand"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/create_idc_import_command"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIDCImportCommandResponse());
    }

    /**
      * ## Description
      * You must call the CreateIDCImportCommand operation first to generate a command used to import hybrid cloud ECS instances to a hybrid cloud ECS cluster. Then, run this command on the instances to import the instances to the cluster.
      *
      * @param request CreateIDCImportCommandRequest
      * @return CreateIDCImportCommandResponse
     */
    public CreateIDCImportCommandResponse createIDCImportCommand(CreateIDCImportCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIDCImportCommandWithOptions(request, headers, runtime);
    }

    public CreateK8sConfigMapResponse createK8sConfigMapWithOptions(CreateK8sConfigMapRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateK8sConfigMap"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/k8s_config_map"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateK8sConfigMapResponse());
    }

    public CreateK8sConfigMapResponse createK8sConfigMap(CreateK8sConfigMapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createK8sConfigMapWithOptions(request, headers, runtime);
    }

    public CreateK8sIngressRuleResponse createK8sIngressRuleWithOptions(CreateK8sIngressRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.annotations)) {
            query.put("Annotations", request.annotations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ingressConf)) {
            query.put("IngressConf", request.ingressConf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateK8sIngressRule"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/k8s_ingress"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateK8sIngressRuleResponse());
    }

    public CreateK8sIngressRuleResponse createK8sIngressRule(CreateK8sIngressRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createK8sIngressRuleWithOptions(request, headers, runtime);
    }

    public CreateK8sSecretResponse createK8sSecretWithOptions(CreateK8sSecretRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.base64Encoded)) {
            body.put("Base64Encoded", request.base64Encoded);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certId)) {
            body.put("CertId", request.certId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certRegionId)) {
            body.put("CertRegionId", request.certRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateK8sSecret"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/k8s_secret"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateK8sSecretResponse());
    }

    public CreateK8sSecretResponse createK8sSecret(CreateK8sSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createK8sSecretWithOptions(request, headers, runtime);
    }

    public CreateK8sServiceResponse createK8sServiceWithOptions(CreateK8sServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalTrafficPolicy)) {
            query.put("ExternalTrafficPolicy", request.externalTrafficPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicePorts)) {
            query.put("ServicePorts", request.servicePorts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateK8sService"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/k8s_service"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateK8sServiceResponse());
    }

    public CreateK8sServiceResponse createK8sService(CreateK8sServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createK8sServiceWithOptions(request, headers, runtime);
    }

    public DeleteApplicationResponse deleteApplicationWithOptions(DeleteApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApplication"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/changeorder/co_delete_app"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApplicationResponse());
    }

    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteApplicationWithOptions(request, headers, runtime);
    }

    public DeleteApplicationScalingRuleResponse deleteApplicationScalingRuleWithOptions(DeleteApplicationScalingRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleName)) {
            query.put("ScalingRuleName", request.scalingRuleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApplicationScalingRule"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/eam/scale/application_scaling_rule"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApplicationScalingRuleResponse());
    }

    public DeleteApplicationScalingRuleResponse deleteApplicationScalingRule(DeleteApplicationScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteApplicationScalingRuleWithOptions(request, headers, runtime);
    }

    public DeleteClusterResponse deleteClusterWithOptions(DeleteClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCluster"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/resource/cluster"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClusterResponse());
    }

    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteClusterWithOptions(request, headers, runtime);
    }

    public DeleteClusterMemberResponse deleteClusterMemberWithOptions(DeleteClusterMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterMemberId)) {
            query.put("ClusterMemberId", request.clusterMemberId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteClusterMember"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/resource/cluster_member"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClusterMemberResponse());
    }

    public DeleteClusterMemberResponse deleteClusterMember(DeleteClusterMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteClusterMemberWithOptions(request, headers, runtime);
    }

    public DeleteConfigTemplateResponse deleteConfigTemplateWithOptions(DeleteConfigTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConfigTemplate"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/config_template"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConfigTemplateResponse());
    }

    public DeleteConfigTemplateResponse deleteConfigTemplate(DeleteConfigTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConfigTemplateWithOptions(request, headers, runtime);
    }

    public DeleteDeployGroupResponse deleteDeployGroupWithOptions(DeleteDeployGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeployGroup"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/deploy_group"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeployGroupResponse());
    }

    public DeleteDeployGroupResponse deleteDeployGroup(DeleteDeployGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDeployGroupWithOptions(request, headers, runtime);
    }

    public DeleteEcuResponse deleteEcuWithOptions(DeleteEcuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ecuId)) {
            query.put("EcuId", request.ecuId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEcu"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/resource/delete_ecu"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEcuResponse());
    }

    public DeleteEcuResponse deleteEcu(DeleteEcuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteEcuWithOptions(request, headers, runtime);
    }

    public DeleteK8sApplicationResponse deleteK8sApplicationWithOptions(DeleteK8sApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteK8sApplication"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/k8s_apps"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteK8sApplicationResponse());
    }

    public DeleteK8sApplicationResponse deleteK8sApplication(DeleteK8sApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteK8sApplicationWithOptions(request, headers, runtime);
    }

    public DeleteK8sConfigMapResponse deleteK8sConfigMapWithOptions(DeleteK8sConfigMapRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteK8sConfigMap"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/k8s_config_map"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteK8sConfigMapResponse());
    }

    public DeleteK8sConfigMapResponse deleteK8sConfigMap(DeleteK8sConfigMapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteK8sConfigMapWithOptions(request, headers, runtime);
    }

    public DeleteK8sIngressRuleResponse deleteK8sIngressRuleWithOptions(DeleteK8sIngressRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteK8sIngressRule"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/k8s_ingress"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteK8sIngressRuleResponse());
    }

    public DeleteK8sIngressRuleResponse deleteK8sIngressRule(DeleteK8sIngressRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteK8sIngressRuleWithOptions(request, headers, runtime);
    }

    public DeleteK8sSecretResponse deleteK8sSecretWithOptions(DeleteK8sSecretRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteK8sSecret"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/k8s_secret"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteK8sSecretResponse());
    }

    public DeleteK8sSecretResponse deleteK8sSecret(DeleteK8sSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteK8sSecretWithOptions(request, headers, runtime);
    }

    public DeleteK8sServiceResponse deleteK8sServiceWithOptions(DeleteK8sServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteK8sService"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/k8s_service"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteK8sServiceResponse());
    }

    public DeleteK8sServiceResponse deleteK8sService(DeleteK8sServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteK8sServiceWithOptions(request, headers, runtime);
    }

    public DeleteLogPathResponse deleteLogPathWithOptions(DeleteLogPathRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLogPath"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/log/popListLogDirs"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLogPathResponse());
    }

    public DeleteLogPathResponse deleteLogPath(DeleteLogPathRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLogPathWithOptions(request, headers, runtime);
    }

    public DeleteRoleResponse deleteRoleWithOptions(DeleteRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            query.put("RoleId", request.roleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRole"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/account/delete_role"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRoleResponse());
    }

    public DeleteRoleResponse deleteRole(DeleteRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRoleWithOptions(request, headers, runtime);
    }

    public DeleteServiceGroupResponse deleteServiceGroupWithOptions(DeleteServiceGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceGroup"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/service/serviceGroups"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceGroupResponse());
    }

    public DeleteServiceGroupResponse deleteServiceGroup(DeleteServiceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteServiceGroupWithOptions(request, headers, runtime);
    }

    public DeleteSwimmingLaneResponse deleteSwimmingLaneWithOptions(DeleteSwimmingLaneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.laneId)) {
            query.put("LaneId", request.laneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSwimmingLane"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/trafficmgnt/swimming_lanes"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSwimmingLaneResponse());
    }

    public DeleteSwimmingLaneResponse deleteSwimmingLane(DeleteSwimmingLaneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSwimmingLaneWithOptions(request, headers, runtime);
    }

    public DeleteUserDefineRegionResponse deleteUserDefineRegionWithOptions(DeleteUserDefineRegionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionTag)) {
            query.put("RegionTag", request.regionTag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserDefineRegion"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/user_region_def"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserDefineRegionResponse());
    }

    public DeleteUserDefineRegionResponse deleteUserDefineRegion(DeleteUserDefineRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUserDefineRegionWithOptions(request, headers, runtime);
    }

    /**
      * > To deploy an application in a Container Service for Kubernetes (ACK) cluster that is imported into Enterprise Distributed Application Service (EDAS), call the DeployK8sApplication operation provided by EDAS. For more information, see [](~~149420~~)DeployK8sApplication.
      *
      * @param request DeployApplicationRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeployApplicationResponse
     */
    public DeployApplicationResponse deployApplicationWithOptions(DeployApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appEnv)) {
            query.put("AppEnv", request.appEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batch)) {
            query.put("Batch", request.batch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchWaitTime)) {
            query.put("BatchWaitTime", request.batchWaitTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buildPackId)) {
            query.put("BuildPackId", request.buildPackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentIds)) {
            query.put("ComponentIds", request.componentIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployType)) {
            query.put("DeployType", request.deployType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            query.put("Desc", request.desc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gray)) {
            query.put("Gray", request.gray);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageVersion)) {
            query.put("PackageVersion", request.packageVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseType)) {
            query.put("ReleaseType", request.releaseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficControlStrategy)) {
            query.put("TrafficControlStrategy", request.trafficControlStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warUrl)) {
            query.put("WarUrl", request.warUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployApplication"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/changeorder/co_deploy"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployApplicationResponse());
    }

    /**
      * > To deploy an application in a Container Service for Kubernetes (ACK) cluster that is imported into Enterprise Distributed Application Service (EDAS), call the DeployK8sApplication operation provided by EDAS. For more information, see [](~~149420~~)DeployK8sApplication.
      *
      * @param request DeployApplicationRequest
      * @return DeployApplicationResponse
     */
    public DeployApplicationResponse deployApplication(DeployApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deployApplicationWithOptions(request, headers, runtime);
    }

    public DeployK8sApplicationResponse deployK8sApplicationWithOptions(DeployK8sApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.annotations)) {
            query.put("Annotations", request.annotations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.args)) {
            query.put("Args", request.args);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchTimeout)) {
            query.put("BatchTimeout", request.batchTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchWaitTime)) {
            query.put("BatchWaitTime", request.batchWaitTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buildPackId)) {
            query.put("BuildPackId", request.buildPackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.canaryRuleId)) {
            query.put("CanaryRuleId", request.canaryRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeOrderDesc)) {
            query.put("ChangeOrderDesc", request.changeOrderDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.command)) {
            query.put("Command", request.command);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configMountDescs)) {
            query.put("ConfigMountDescs", request.configMountDescs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuLimit)) {
            query.put("CpuLimit", request.cpuLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuRequest)) {
            query.put("CpuRequest", request.cpuRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customAffinity)) {
            query.put("CustomAffinity", request.customAffinity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customAgentVersion)) {
            query.put("CustomAgentVersion", request.customAgentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customTolerations)) {
            query.put("CustomTolerations", request.customTolerations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployAcrossNodes)) {
            query.put("DeployAcrossNodes", request.deployAcrossNodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployAcrossZones)) {
            query.put("DeployAcrossZones", request.deployAcrossZones);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edasContainerVersion)) {
            query.put("EdasContainerVersion", request.edasContainerVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emptyDirs)) {
            query.put("EmptyDirs", request.emptyDirs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAhas)) {
            query.put("EnableAhas", request.enableAhas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableEmptyPushReject)) {
            query.put("EnableEmptyPushReject", request.enableEmptyPushReject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableLosslessRule)) {
            query.put("EnableLosslessRule", request.enableLosslessRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envFroms)) {
            query.put("EnvFroms", request.envFroms);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envs)) {
            query.put("Envs", request.envs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.image)) {
            query.put("Image", request.image);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imagePlatforms)) {
            query.put("ImagePlatforms", request.imagePlatforms);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageTag)) {
            query.put("ImageTag", request.imageTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initContainers)) {
            query.put("InitContainers", request.initContainers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.JDK)) {
            query.put("JDK", request.JDK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.javaStartUpConfig)) {
            query.put("JavaStartUpConfig", request.javaStartUpConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitEphemeralStorage)) {
            query.put("LimitEphemeralStorage", request.limitEphemeralStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveness)) {
            query.put("Liveness", request.liveness);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localVolume)) {
            query.put("LocalVolume", request.localVolume);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.losslessRuleAligned)) {
            query.put("LosslessRuleAligned", request.losslessRuleAligned);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.losslessRuleDelayTime)) {
            query.put("LosslessRuleDelayTime", request.losslessRuleDelayTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.losslessRuleFuncType)) {
            query.put("LosslessRuleFuncType", request.losslessRuleFuncType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.losslessRuleRelated)) {
            query.put("LosslessRuleRelated", request.losslessRuleRelated);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.losslessRuleWarmupTime)) {
            query.put("LosslessRuleWarmupTime", request.losslessRuleWarmupTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mcpuLimit)) {
            query.put("McpuLimit", request.mcpuLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mcpuRequest)) {
            query.put("McpuRequest", request.mcpuRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memoryLimit)) {
            query.put("MemoryLimit", request.memoryLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memoryRequest)) {
            query.put("MemoryRequest", request.memoryRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountDescs)) {
            query.put("MountDescs", request.mountDescs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nasId)) {
            query.put("NasId", request.nasId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageUrl)) {
            query.put("PackageUrl", request.packageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageVersion)) {
            query.put("PackageVersion", request.packageVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageVersionId)) {
            query.put("PackageVersionId", request.packageVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.postStart)) {
            query.put("PostStart", request.postStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preStop)) {
            query.put("PreStop", request.preStop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pvcMountDescs)) {
            query.put("PvcMountDescs", request.pvcMountDescs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.readiness)) {
            query.put("Readiness", request.readiness);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicas)) {
            query.put("Replicas", request.replicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestsEphemeralStorage)) {
            query.put("RequestsEphemeralStorage", request.requestsEphemeralStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeClassName)) {
            query.put("RuntimeClassName", request.runtimeClassName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sidecars)) {
            query.put("Sidecars", request.sidecars);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsConfigs)) {
            query.put("SlsConfigs", request.slsConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startup)) {
            query.put("Startup", request.startup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminateGracePeriod)) {
            query.put("TerminateGracePeriod", request.terminateGracePeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficControlStrategy)) {
            query.put("TrafficControlStrategy", request.trafficControlStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateStrategy)) {
            query.put("UpdateStrategy", request.updateStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uriEncoding)) {
            query.put("UriEncoding", request.uriEncoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useBodyEncoding)) {
            query.put("UseBodyEncoding", request.useBodyEncoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userBaseImageUrl)) {
            query.put("UserBaseImageUrl", request.userBaseImageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volumesStr)) {
            query.put("VolumesStr", request.volumesStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webContainer)) {
            query.put("WebContainer", request.webContainer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webContainerConfig)) {
            query.put("WebContainerConfig", request.webContainerConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployK8sApplication"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/k8s_apps"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployK8sApplicationResponse());
    }

    public DeployK8sApplicationResponse deployK8sApplication(DeployK8sApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deployK8sApplicationWithOptions(request, headers, runtime);
    }

    public DescribeAppInstanceListResponse describeAppInstanceListWithOptions(DescribeAppInstanceListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withNodeInfo)) {
            query.put("WithNodeInfo", request.withNodeInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppInstanceList"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/oam/app_instance_list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppInstanceListResponse());
    }

    public DescribeAppInstanceListResponse describeAppInstanceList(DescribeAppInstanceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppInstanceListWithOptions(request, headers, runtime);
    }

    public DescribeApplicationScalingRulesResponse describeApplicationScalingRulesWithOptions(DescribeApplicationScalingRulesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApplicationScalingRules"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/eam/scale/application_scaling_rules"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApplicationScalingRulesResponse());
    }

    public DescribeApplicationScalingRulesResponse describeApplicationScalingRules(DescribeApplicationScalingRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApplicationScalingRulesWithOptions(request, headers, runtime);
    }

    public DisableApplicationScalingRuleResponse disableApplicationScalingRuleWithOptions(DisableApplicationScalingRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleName)) {
            query.put("ScalingRuleName", request.scalingRuleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableApplicationScalingRule"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/eam/scale/disable_application_scaling_rule"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableApplicationScalingRuleResponse());
    }

    public DisableApplicationScalingRuleResponse disableApplicationScalingRule(DisableApplicationScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableApplicationScalingRuleWithOptions(request, headers, runtime);
    }

    public EnableApplicationScalingRuleResponse enableApplicationScalingRuleWithOptions(EnableApplicationScalingRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleName)) {
            query.put("ScalingRuleName", request.scalingRuleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableApplicationScalingRule"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/eam/scale/enable_application_scaling_rule"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableApplicationScalingRuleResponse());
    }

    public EnableApplicationScalingRuleResponse enableApplicationScalingRule(EnableApplicationScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableApplicationScalingRuleWithOptions(request, headers, runtime);
    }

    public GetAppDeploymentResponse getAppDeploymentWithOptions(GetAppDeploymentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppDeployment"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/oam/app_deployment"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppDeploymentResponse());
    }

    public GetAppDeploymentResponse getAppDeployment(GetAppDeploymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppDeploymentWithOptions(request, headers, runtime);
    }

    public GetApplicationResponse getApplicationWithOptions(GetApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApplication"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/app/app_info"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApplicationResponse());
    }

    public GetApplicationResponse getApplication(GetApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApplicationWithOptions(request, headers, runtime);
    }

    public GetChangeOrderInfoResponse getChangeOrderInfoWithOptions(GetChangeOrderInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeOrderId)) {
            query.put("ChangeOrderId", request.changeOrderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChangeOrderInfo"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/changeorder/change_order_info"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChangeOrderInfoResponse());
    }

    public GetChangeOrderInfoResponse getChangeOrderInfo(GetChangeOrderInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getChangeOrderInfoWithOptions(request, headers, runtime);
    }

    public GetClusterResponse getClusterWithOptions(GetClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCluster"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/resource/cluster"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterResponse());
    }

    public GetClusterResponse getCluster(GetClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterWithOptions(request, headers, runtime);
    }

    public GetContainerConfigurationResponse getContainerConfigurationWithOptions(GetContainerConfigurationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetContainerConfiguration"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/app/container_config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetContainerConfigurationResponse());
    }

    public GetContainerConfigurationResponse getContainerConfiguration(GetContainerConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContainerConfigurationWithOptions(request, headers, runtime);
    }

    public GetJavaStartUpConfigResponse getJavaStartUpConfigWithOptions(GetJavaStartUpConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJavaStartUpConfig"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/oam/java_start_up_config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJavaStartUpConfigResponse());
    }

    public GetJavaStartUpConfigResponse getJavaStartUpConfig(GetJavaStartUpConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJavaStartUpConfigWithOptions(request, headers, runtime);
    }

    public GetJvmConfigurationResponse getJvmConfigurationWithOptions(GetJvmConfigurationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJvmConfiguration"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/app/app_jvm_config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJvmConfigurationResponse());
    }

    public GetJvmConfigurationResponse getJvmConfiguration(GetJvmConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJvmConfigurationWithOptions(request, headers, runtime);
    }

    public GetK8sAppPrecheckResultResponse getK8sAppPrecheckResultWithOptions(GetK8sAppPrecheckResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetK8sAppPrecheckResult"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/app_precheck"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetK8sAppPrecheckResultResponse());
    }

    public GetK8sAppPrecheckResultResponse getK8sAppPrecheckResult(GetK8sAppPrecheckResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getK8sAppPrecheckResultWithOptions(request, headers, runtime);
    }

    public GetK8sApplicationResponse getK8sApplicationWithOptions(GetK8sApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("From", request.from);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetK8sApplication"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/changeorder/co_application"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetK8sApplicationResponse());
    }

    public GetK8sApplicationResponse getK8sApplication(GetK8sApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getK8sApplicationWithOptions(request, headers, runtime);
    }

    public GetK8sClusterResponse getK8sClusterWithOptions(GetK8sClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionTag)) {
            query.put("RegionTag", request.regionTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subClusterType)) {
            query.put("SubClusterType", request.subClusterType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetK8sCluster"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s_clusters"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetK8sClusterResponse());
    }

    public GetK8sClusterResponse getK8sCluster(GetK8sClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getK8sClusterWithOptions(request, headers, runtime);
    }

    public GetK8sServicesResponse getK8sServicesWithOptions(GetK8sServicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetK8sServices"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/k8s_service"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetK8sServicesResponse());
    }

    public GetK8sServicesResponse getK8sServices(GetK8sServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getK8sServicesWithOptions(request, headers, runtime);
    }

    public GetPackageStorageCredentialResponse getPackageStorageCredentialWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPackageStorageCredential"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/package_storage_credential"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPackageStorageCredentialResponse());
    }

    public GetPackageStorageCredentialResponse getPackageStorageCredential() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPackageStorageCredentialWithOptions(headers, runtime);
    }

    public GetScalingRulesResponse getScalingRulesWithOptions(GetScalingRulesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScalingRules"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/app/scalingRules"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScalingRulesResponse());
    }

    public GetScalingRulesResponse getScalingRules(GetScalingRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getScalingRulesWithOptions(request, headers, runtime);
    }

    public GetSecureTokenResponse getSecureTokenWithOptions(GetSecureTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSecureToken"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/secure_token"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSecureTokenResponse());
    }

    public GetSecureTokenResponse getSecureToken(GetSecureTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSecureTokenWithOptions(request, headers, runtime);
    }

    public GetServiceConsumersPageResponse getServiceConsumersPageWithOptions(GetServiceConsumersPageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.origin)) {
            query.put("origin", request.origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registryType)) {
            query.put("registryType", request.registryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("serviceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("serviceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("serviceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("serviceVersion", request.serviceVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceConsumersPage"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/sp/api/mseForOam/getServiceConsumersPage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceConsumersPageResponse());
    }

    public GetServiceConsumersPageResponse getServiceConsumersPage(GetServiceConsumersPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceConsumersPageWithOptions(request, headers, runtime);
    }

    public GetServiceDetailResponse getServiceDetailWithOptions(GetServiceDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.origin)) {
            query.put("origin", request.origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registryType)) {
            query.put("registryType", request.registryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("serviceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("serviceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("serviceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("serviceVersion", request.serviceVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceDetail"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/sp/api/mseForOam/getServiceDetail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceDetailResponse());
    }

    public GetServiceDetailResponse getServiceDetail(GetServiceDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceDetailWithOptions(request, headers, runtime);
    }

    public GetServiceListPageResponse getServiceListPageWithOptions(GetServiceListPageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.origin)) {
            query.put("origin", request.origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchType)) {
            query.put("searchType", request.searchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchValue)) {
            query.put("searchValue", request.searchValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("serviceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.side)) {
            query.put("side", request.side);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceListPage"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/sp/api/mseForOam/getServiceListPage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceListPageResponse());
    }

    public GetServiceListPageResponse getServiceListPage(GetServiceListPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceListPageWithOptions(request, headers, runtime);
    }

    public GetServiceMethodPageResponse getServiceMethodPageWithOptions(GetServiceMethodPageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.methodController)) {
            query.put("methodController", request.methodController);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.origin)) {
            query.put("origin", request.origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registryType)) {
            query.put("registryType", request.registryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("serviceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("serviceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("serviceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("serviceVersion", request.serviceVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceMethodPage"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/sp/api/mseForOam/getServiceMethodPage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceMethodPageResponse());
    }

    public GetServiceMethodPageResponse getServiceMethodPage(GetServiceMethodPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceMethodPageWithOptions(request, headers, runtime);
    }

    public GetServiceProvidersPageResponse getServiceProvidersPageWithOptions(GetServiceProvidersPageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.origin)) {
            query.put("origin", request.origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registryType)) {
            query.put("registryType", request.registryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("serviceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("serviceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("serviceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("serviceVersion", request.serviceVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceProvidersPage"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/sp/api/mseForOam/getServiceProvidersPage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceProvidersPageResponse());
    }

    public GetServiceProvidersPageResponse getServiceProvidersPage(GetServiceProvidersPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceProvidersPageWithOptions(request, headers, runtime);
    }

    /**
      * ***
      *
      * @param request GetWebContainerConfigRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetWebContainerConfigResponse
     */
    public GetWebContainerConfigResponse getWebContainerConfigWithOptions(GetWebContainerConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWebContainerConfig"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/oam/web_container_config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWebContainerConfigResponse());
    }

    /**
      * ***
      *
      * @param request GetWebContainerConfigRequest
      * @return GetWebContainerConfigResponse
     */
    public GetWebContainerConfigResponse getWebContainerConfig(GetWebContainerConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWebContainerConfigWithOptions(request, headers, runtime);
    }

    public ImportK8sClusterResponse importK8sClusterWithOptions(ImportK8sClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAsm)) {
            query.put("EnableAsm", request.enableAsm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportK8sCluster"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/import_k8s_cluster"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportK8sClusterResponse());
    }

    public ImportK8sClusterResponse importK8sCluster(ImportK8sClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importK8sClusterWithOptions(request, headers, runtime);
    }

    /**
      * > To create an application in a Kubernetes cluster, call the InsertK8sApplication operation provided by Enterprise Distributed Application Service (EDAS).
      *
      * @param request InsertApplicationRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return InsertApplicationResponse
     */
    public InsertApplicationResponse insertApplicationWithOptions(InsertApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buildPackId)) {
            query.put("BuildPackId", request.buildPackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentIds)) {
            query.put("ComponentIds", request.componentIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecuInfo)) {
            query.put("EcuInfo", request.ecuInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enablePortCheck)) {
            query.put("EnablePortCheck", request.enablePortCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableUrlCheck)) {
            query.put("EnableUrlCheck", request.enableUrlCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckURL)) {
            query.put("HealthCheckURL", request.healthCheckURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckUrl)) {
            query.put("HealthCheckUrl", request.healthCheckUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hooks)) {
            query.put("Hooks", request.hooks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jdk)) {
            query.put("Jdk", request.jdk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jvmOptions)) {
            query.put("JvmOptions", request.jvmOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxHeapSize)) {
            query.put("MaxHeapSize", request.maxHeapSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxPermSize)) {
            query.put("MaxPermSize", request.maxPermSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mem)) {
            query.put("Mem", request.mem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minHeapSize)) {
            query.put("MinHeapSize", request.minHeapSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            query.put("PackageType", request.packageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservedPortStr)) {
            query.put("ReservedPortStr", request.reservedPortStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webContainer)) {
            query.put("WebContainer", request.webContainer);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsertApplication"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/changeorder/co_create_app"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsertApplicationResponse());
    }

    /**
      * > To create an application in a Kubernetes cluster, call the InsertK8sApplication operation provided by Enterprise Distributed Application Service (EDAS).
      *
      * @param request InsertApplicationRequest
      * @return InsertApplicationResponse
     */
    public InsertApplicationResponse insertApplication(InsertApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.insertApplicationWithOptions(request, headers, runtime);
    }

    public InsertClusterResponse insertClusterWithOptions(InsertClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iaasProvider)) {
            query.put("IaasProvider", request.iaasProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkMode)) {
            query.put("NetworkMode", request.networkMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversoldFactor)) {
            query.put("OversoldFactor", request.oversoldFactor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsertCluster"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/resource/cluster"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsertClusterResponse());
    }

    public InsertClusterResponse insertCluster(InsertClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.insertClusterWithOptions(request, headers, runtime);
    }

    /**
      * ##
      * If you call this operation to import an ECS instance, the operating system of the ECS instance is reinstalled. After the operating system is reinstalled, all original data of the ECS instance is deleted. In addition, you must set a logon password for the ECS instance. Make sure that no important data exists on the ECS instance that you want to import or data has been backed up for the ECS instance.
      * > We recommend that you call the InstallAgent operation instead of this operation. For more information, see [InstallAgent](~~127023~~).
      *
      * @param request InsertClusterMemberRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return InsertClusterMemberResponse
     */
    public InsertClusterMemberResponse insertClusterMemberWithOptions(InsertClusterMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsertClusterMember"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/resource/cluster_member"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsertClusterMemberResponse());
    }

    /**
      * ##
      * If you call this operation to import an ECS instance, the operating system of the ECS instance is reinstalled. After the operating system is reinstalled, all original data of the ECS instance is deleted. In addition, you must set a logon password for the ECS instance. Make sure that no important data exists on the ECS instance that you want to import or data has been backed up for the ECS instance.
      * > We recommend that you call the InstallAgent operation instead of this operation. For more information, see [InstallAgent](~~127023~~).
      *
      * @param request InsertClusterMemberRequest
      * @return InsertClusterMemberResponse
     */
    public InsertClusterMemberResponse insertClusterMember(InsertClusterMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.insertClusterMemberWithOptions(request, headers, runtime);
    }

    public InsertDeployGroupResponse insertDeployGroupWithOptions(InsertDeployGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsertDeployGroup"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/deploy_group"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsertDeployGroupResponse());
    }

    public InsertDeployGroupResponse insertDeployGroup(InsertDeployGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.insertDeployGroupWithOptions(request, headers, runtime);
    }

    public InsertK8sApplicationResponse insertK8sApplicationWithOptions(InsertK8sApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.annotations)) {
            query.put("Annotations", request.annotations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appConfig)) {
            query.put("AppConfig", request.appConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appTemplateName)) {
            query.put("AppTemplateName", request.appTemplateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationDescription)) {
            query.put("ApplicationDescription", request.applicationDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buildPackId)) {
            query.put("BuildPackId", request.buildPackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.command)) {
            query.put("Command", request.command);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commandArgs)) {
            query.put("CommandArgs", request.commandArgs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configMountDescs)) {
            query.put("ConfigMountDescs", request.configMountDescs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerRegistryId)) {
            query.put("ContainerRegistryId", request.containerRegistryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.csClusterId)) {
            query.put("CsClusterId", request.csClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customAffinity)) {
            query.put("CustomAffinity", request.customAffinity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customAgentVersion)) {
            query.put("CustomAgentVersion", request.customAgentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customTolerations)) {
            query.put("CustomTolerations", request.customTolerations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployAcrossNodes)) {
            query.put("DeployAcrossNodes", request.deployAcrossNodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployAcrossZones)) {
            query.put("DeployAcrossZones", request.deployAcrossZones);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edasContainerVersion)) {
            query.put("EdasContainerVersion", request.edasContainerVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emptyDirs)) {
            query.put("EmptyDirs", request.emptyDirs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAhas)) {
            query.put("EnableAhas", request.enableAhas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAsm)) {
            query.put("EnableAsm", request.enableAsm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableEmptyPushReject)) {
            query.put("EnableEmptyPushReject", request.enableEmptyPushReject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableLosslessRule)) {
            query.put("EnableLosslessRule", request.enableLosslessRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envFroms)) {
            query.put("EnvFroms", request.envFroms);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envs)) {
            query.put("Envs", request.envs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureConfig)) {
            query.put("FeatureConfig", request.featureConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imagePlatforms)) {
            query.put("ImagePlatforms", request.imagePlatforms);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initContainers)) {
            query.put("InitContainers", request.initContainers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetSlbId)) {
            query.put("InternetSlbId", request.internetSlbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetSlbPort)) {
            query.put("InternetSlbPort", request.internetSlbPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetSlbProtocol)) {
            query.put("InternetSlbProtocol", request.internetSlbProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetTargetPort)) {
            query.put("InternetTargetPort", request.internetTargetPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intranetSlbId)) {
            query.put("IntranetSlbId", request.intranetSlbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intranetSlbPort)) {
            query.put("IntranetSlbPort", request.intranetSlbPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intranetSlbProtocol)) {
            query.put("IntranetSlbProtocol", request.intranetSlbProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intranetTargetPort)) {
            query.put("IntranetTargetPort", request.intranetTargetPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isMultilingualApp)) {
            query.put("IsMultilingualApp", request.isMultilingualApp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.JDK)) {
            query.put("JDK", request.JDK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.javaStartUpConfig)) {
            query.put("JavaStartUpConfig", request.javaStartUpConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitCpu)) {
            query.put("LimitCpu", request.limitCpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitEphemeralStorage)) {
            query.put("LimitEphemeralStorage", request.limitEphemeralStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitMem)) {
            query.put("LimitMem", request.limitMem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitmCpu)) {
            query.put("LimitmCpu", request.limitmCpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveness)) {
            query.put("Liveness", request.liveness);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localVolume)) {
            query.put("LocalVolume", request.localVolume);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.losslessRuleAligned)) {
            query.put("LosslessRuleAligned", request.losslessRuleAligned);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.losslessRuleDelayTime)) {
            query.put("LosslessRuleDelayTime", request.losslessRuleDelayTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.losslessRuleFuncType)) {
            query.put("LosslessRuleFuncType", request.losslessRuleFuncType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.losslessRuleRelated)) {
            query.put("LosslessRuleRelated", request.losslessRuleRelated);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.losslessRuleWarmupTime)) {
            query.put("LosslessRuleWarmupTime", request.losslessRuleWarmupTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountDescs)) {
            query.put("MountDescs", request.mountDescs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nasId)) {
            query.put("NasId", request.nasId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.postStart)) {
            query.put("PostStart", request.postStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preStop)) {
            query.put("PreStop", request.preStop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pvcMountDescs)) {
            query.put("PvcMountDescs", request.pvcMountDescs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.readiness)) {
            query.put("Readiness", request.readiness);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicas)) {
            query.put("Replicas", request.replicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repoId)) {
            query.put("RepoId", request.repoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestsCpu)) {
            query.put("RequestsCpu", request.requestsCpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestsEphemeralStorage)) {
            query.put("RequestsEphemeralStorage", request.requestsEphemeralStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestsMem)) {
            query.put("RequestsMem", request.requestsMem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestsmCpu)) {
            query.put("RequestsmCpu", request.requestsmCpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeClassName)) {
            query.put("RuntimeClassName", request.runtimeClassName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretName)) {
            query.put("SecretName", request.secretName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceConfigs)) {
            query.put("ServiceConfigs", request.serviceConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sidecars)) {
            query.put("Sidecars", request.sidecars);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsConfigs)) {
            query.put("SlsConfigs", request.slsConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startup)) {
            query.put("Startup", request.startup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminateGracePeriod)) {
            query.put("TerminateGracePeriod", request.terminateGracePeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uriEncoding)) {
            query.put("UriEncoding", request.uriEncoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useBodyEncoding)) {
            query.put("UseBodyEncoding", request.useBodyEncoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userBaseImageUrl)) {
            query.put("UserBaseImageUrl", request.userBaseImageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webContainer)) {
            query.put("WebContainer", request.webContainer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webContainerConfig)) {
            query.put("WebContainerConfig", request.webContainerConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadType)) {
            query.put("WorkloadType", request.workloadType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsertK8sApplication"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/create_k8s_app"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsertK8sApplicationResponse());
    }

    public InsertK8sApplicationResponse insertK8sApplication(InsertK8sApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.insertK8sApplicationWithOptions(request, headers, runtime);
    }

    public InsertOrUpdateRegionResponse insertOrUpdateRegionWithOptions(InsertOrUpdateRegionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.debugEnable)) {
            query.put("DebugEnable", request.debugEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mseInstanceId)) {
            query.put("MseInstanceId", request.mseInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionName)) {
            query.put("RegionName", request.regionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionTag)) {
            query.put("RegionTag", request.regionTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registryType)) {
            query.put("RegistryType", request.registryType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsertOrUpdateRegion"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/user_region_def"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsertOrUpdateRegionResponse());
    }

    public InsertOrUpdateRegionResponse insertOrUpdateRegion(InsertOrUpdateRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.insertOrUpdateRegionWithOptions(request, headers, runtime);
    }

    public InsertRoleResponse insertRoleWithOptions(InsertRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionData)) {
            query.put("ActionData", request.actionData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("RoleName", request.roleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsertRole"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/account/create_role"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsertRoleResponse());
    }

    public InsertRoleResponse insertRole(InsertRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.insertRoleWithOptions(request, headers, runtime);
    }

    public InsertServiceGroupResponse insertServiceGroupWithOptions(InsertServiceGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsertServiceGroup"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/service/serviceGroups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsertServiceGroupResponse());
    }

    public InsertServiceGroupResponse insertServiceGroup(InsertServiceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.insertServiceGroupWithOptions(request, headers, runtime);
    }

    public InsertSwimmingLaneResponse insertSwimmingLaneWithOptions(InsertSwimmingLaneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInfos)) {
            query.put("AppInfos", request.appInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableRules)) {
            query.put("EnableRules", request.enableRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entryRules)) {
            query.put("EntryRules", request.entryRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsertSwimmingLane"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/trafficmgnt/swimming_lanes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsertSwimmingLaneResponse());
    }

    public InsertSwimmingLaneResponse insertSwimmingLane(InsertSwimmingLaneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.insertSwimmingLaneWithOptions(request, headers, runtime);
    }

    public InsertSwimmingLaneGroupResponse insertSwimmingLaneGroupWithOptions(InsertSwimmingLaneGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIds)) {
            query.put("AppIds", request.appIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entryApp)) {
            query.put("EntryApp", request.entryApp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsertSwimmingLaneGroup"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/trafficmgnt/swimming_lane_groups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsertSwimmingLaneGroupResponse());
    }

    public InsertSwimmingLaneGroupResponse insertSwimmingLaneGroup(InsertSwimmingLaneGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.insertSwimmingLaneGroupWithOptions(request, headers, runtime);
    }

    /**
      * If you call this operation to import an ECS instance into EDAS, the operating system of the ECS instance is not reinstalled. We recommend that you call this operation to import ECS instances into EDAS.
      *
      * @param request InstallAgentRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return InstallAgentResponse
     */
    public InstallAgentResponse installAgentWithOptions(InstallAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.doAsync)) {
            query.put("DoAsync", request.doAsync);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallAgent"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/ecss/install_agent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallAgentResponse());
    }

    /**
      * If you call this operation to import an ECS instance into EDAS, the operating system of the ECS instance is not reinstalled. We recommend that you call this operation to import ECS instances into EDAS.
      *
      * @param request InstallAgentRequest
      * @return InstallAgentResponse
     */
    public InstallAgentResponse installAgent(InstallAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installAgentWithOptions(request, headers, runtime);
    }

    public ListAliyunRegionResponse listAliyunRegionWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAliyunRegion"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/resource/region_list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAliyunRegionResponse());
    }

    public ListAliyunRegionResponse listAliyunRegion() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAliyunRegionWithOptions(headers, runtime);
    }

    public ListApplicationResponse listApplicationWithOptions(ListApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIds)) {
            query.put("AppIds", request.appIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionIdFilter)) {
            query.put("LogicalRegionIdFilter", request.logicalRegionIdFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplication"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/app/app_list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationResponse());
    }

    public ListApplicationResponse listApplication(ListApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApplicationWithOptions(request, headers, runtime);
    }

    public ListApplicationEcuResponse listApplicationEcuWithOptions(ListApplicationEcuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationEcu"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/resource/ecu_list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationEcuResponse());
    }

    public ListApplicationEcuResponse listApplicationEcu(ListApplicationEcuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApplicationEcuWithOptions(request, headers, runtime);
    }

    public ListAuthorityResponse listAuthorityWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAuthority"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/account/authority_list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthorityResponse());
    }

    public ListAuthorityResponse listAuthority() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAuthorityWithOptions(headers, runtime);
    }

    public ListBuildPackResponse listBuildPackWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBuildPack"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/app/build_pack_list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBuildPackResponse());
    }

    public ListBuildPackResponse listBuildPack() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBuildPackWithOptions(headers, runtime);
    }

    public ListClusterResponse listClusterWithOptions(ListClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCluster"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/resource/cluster_list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterResponse());
    }

    public ListClusterResponse listCluster(ListClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterWithOptions(request, headers, runtime);
    }

    public ListClusterMembersResponse listClusterMembersWithOptions(ListClusterMembersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsList)) {
            query.put("EcsList", request.ecsList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterMembers"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/resource/cluster_member_list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterMembersResponse());
    }

    public ListClusterMembersResponse listClusterMembers(ListClusterMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterMembersWithOptions(request, headers, runtime);
    }

    public ListComponentsResponse listComponentsWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListComponents"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/resource/components"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListComponentsResponse());
    }

    public ListComponentsResponse listComponents() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listComponentsWithOptions(headers, runtime);
    }

    public ListConfigTemplatesResponse listConfigTemplatesWithOptions(ListConfigTemplatesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConfigTemplates"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/config_template"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConfigTemplatesResponse());
    }

    public ListConfigTemplatesResponse listConfigTemplates(ListConfigTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConfigTemplatesWithOptions(request, headers, runtime);
    }

    public ListConsumedServicesResponse listConsumedServicesWithOptions(ListConsumedServicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConsumedServices"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/service/listConsumedServices"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConsumedServicesResponse());
    }

    public ListConsumedServicesResponse listConsumedServices(ListConsumedServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConsumedServicesWithOptions(request, headers, runtime);
    }

    public ListConvertableEcuResponse listConvertableEcuWithOptions(ListConvertableEcuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("clusterId", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConvertableEcu"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/resource/convertable_ecu_list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConvertableEcuResponse());
    }

    public ListConvertableEcuResponse listConvertableEcu(ListConvertableEcuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConvertableEcuWithOptions(request, headers, runtime);
    }

    public ListDeployGroupResponse listDeployGroupWithOptions(ListDeployGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeployGroup"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/app/deploy_group_list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeployGroupResponse());
    }

    public ListDeployGroupResponse listDeployGroup(ListDeployGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDeployGroupWithOptions(request, headers, runtime);
    }

    public ListEcsNotInClusterResponse listEcsNotInClusterWithOptions(ListEcsNotInClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkMode)) {
            query.put("NetworkMode", request.networkMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEcsNotInCluster"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/resource/ecs_not_in_cluster"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEcsNotInClusterResponse());
    }

    public ListEcsNotInClusterResponse listEcsNotInCluster(ListEcsNotInClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEcsNotInClusterWithOptions(request, headers, runtime);
    }

    /**
      * ## Terms
      * *   **Namespace**: the logical concept that is used to isolate resources such as clusters, ECS instances, and applications, and microservices published in EDAS. This concept involves the default namespace and custom namespaces. Each region has a default namespace and supports multiple custom namespaces. By default, only the default namespace is available. You do not need to create a custom namespace if you do not want to isolate resources and microservices.
      * *   **Elastic compute unit (ECU)**: After an ECS instance is imported to a cluster, the instance becomes an ECU.
      * *   **Elastic compute container (ECC)**: After you deploy an application to an ECU in a cluster, the ECU becomes an ECC.
      *
      * @param request ListEcuByRegionRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListEcuByRegionResponse
     */
    public ListEcuByRegionResponse listEcuByRegionWithOptions(ListEcuByRegionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.act)) {
            query.put("Act", request.act);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEcuByRegion"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/resource/ecu_list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEcuByRegionResponse());
    }

    /**
      * ## Terms
      * *   **Namespace**: the logical concept that is used to isolate resources such as clusters, ECS instances, and applications, and microservices published in EDAS. This concept involves the default namespace and custom namespaces. Each region has a default namespace and supports multiple custom namespaces. By default, only the default namespace is available. You do not need to create a custom namespace if you do not want to isolate resources and microservices.
      * *   **Elastic compute unit (ECU)**: After an ECS instance is imported to a cluster, the instance becomes an ECU.
      * *   **Elastic compute container (ECC)**: After you deploy an application to an ECU in a cluster, the ECU becomes an ECC.
      *
      * @param request ListEcuByRegionRequest
      * @return ListEcuByRegionResponse
     */
    public ListEcuByRegionResponse listEcuByRegion(ListEcuByRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEcuByRegionWithOptions(request, headers, runtime);
    }

    public ListHistoryDeployVersionResponse listHistoryDeployVersionWithOptions(ListHistoryDeployVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHistoryDeployVersion"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/app/deploy_history_version_list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHistoryDeployVersionResponse());
    }

    public ListHistoryDeployVersionResponse listHistoryDeployVersion(ListHistoryDeployVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listHistoryDeployVersionWithOptions(request, headers, runtime);
    }

    public ListK8sConfigMapsResponse listK8sConfigMapsWithOptions(ListK8sConfigMapsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.condition)) {
            query.put("Condition", request.condition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showRelatedApps)) {
            query.put("ShowRelatedApps", request.showRelatedApps);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListK8sConfigMaps"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/k8s_config_map"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListK8sConfigMapsResponse());
    }

    public ListK8sConfigMapsResponse listK8sConfigMaps(ListK8sConfigMapsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listK8sConfigMapsWithOptions(request, headers, runtime);
    }

    public ListK8sIngressRulesResponse listK8sIngressRulesWithOptions(ListK8sIngressRulesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.condition)) {
            query.put("Condition", request.condition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListK8sIngressRules"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/k8s_ingress"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListK8sIngressRulesResponse());
    }

    public ListK8sIngressRulesResponse listK8sIngressRules(ListK8sIngressRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listK8sIngressRulesWithOptions(request, headers, runtime);
    }

    public ListK8sNamespacesResponse listK8sNamespacesWithOptions(ListK8sNamespacesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListK8sNamespaces"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/k8s_namespace"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListK8sNamespacesResponse());
    }

    public ListK8sNamespacesResponse listK8sNamespaces(ListK8sNamespacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listK8sNamespacesWithOptions(request, headers, runtime);
    }

    public ListK8sSecretsResponse listK8sSecretsWithOptions(ListK8sSecretsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.condition)) {
            query.put("Condition", request.condition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showRelatedApps)) {
            query.put("ShowRelatedApps", request.showRelatedApps);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListK8sSecrets"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/k8s_secret"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListK8sSecretsResponse());
    }

    public ListK8sSecretsResponse listK8sSecrets(ListK8sSecretsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listK8sSecretsWithOptions(request, headers, runtime);
    }

    public ListMethodsResponse listMethodsWithOptions(ListMethodsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMethods"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/service/list_methods"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMethodsResponse());
    }

    public ListMethodsResponse listMethods(ListMethodsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMethodsWithOptions(request, headers, runtime);
    }

    public ListPublishedServicesResponse listPublishedServicesWithOptions(ListPublishedServicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPublishedServices"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/service/listPublishedServices"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPublishedServicesResponse());
    }

    public ListPublishedServicesResponse listPublishedServices(ListPublishedServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPublishedServicesWithOptions(request, headers, runtime);
    }

    public ListRecentChangeOrderResponse listRecentChangeOrderWithOptions(ListRecentChangeOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRecentChangeOrder"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/changeorder/change_order_list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRecentChangeOrderResponse());
    }

    public ListRecentChangeOrderResponse listRecentChangeOrder(ListRecentChangeOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRecentChangeOrderWithOptions(request, headers, runtime);
    }

    public ListResourceGroupResponse listResourceGroupWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceGroup"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/resource/reg_group_list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceGroupResponse());
    }

    public ListResourceGroupResponse listResourceGroup() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceGroupWithOptions(headers, runtime);
    }

    public ListRoleResponse listRoleWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRole"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/account/role_list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRoleResponse());
    }

    public ListRoleResponse listRole() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRoleWithOptions(headers, runtime);
    }

    /**
      * ## Terms
      * *   **Namespace**: the logical concept that is used to isolate resources such as clusters, ECS instances, and applications, and microservices published in EDAS. This concept involves the default namespace and custom namespaces. Each region has a default namespace and supports multiple custom namespaces. By default, only the default namespace is available. You do not need to create a custom namespace if you do not want to isolate resources and microservices.
      * *   **Elastic compute unit (ECU)**: After an ECS instance is imported to a cluster, the instance becomes an ECU.
      * *   **Elastic compute container (ECC)**: After you deploy an application to an ECU in a cluster, the ECU becomes an ECC.
      *
      * @param request ListScaleOutEcuRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListScaleOutEcuResponse
     */
    public ListScaleOutEcuResponse listScaleOutEcuWithOptions(ListScaleOutEcuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceNum)) {
            query.put("InstanceNum", request.instanceNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mem)) {
            query.put("Mem", request.mem);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScaleOutEcu"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/resource/scale_out_ecu_list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListScaleOutEcuResponse());
    }

    /**
      * ## Terms
      * *   **Namespace**: the logical concept that is used to isolate resources such as clusters, ECS instances, and applications, and microservices published in EDAS. This concept involves the default namespace and custom namespaces. Each region has a default namespace and supports multiple custom namespaces. By default, only the default namespace is available. You do not need to create a custom namespace if you do not want to isolate resources and microservices.
      * *   **Elastic compute unit (ECU)**: After an ECS instance is imported to a cluster, the instance becomes an ECU.
      * *   **Elastic compute container (ECC)**: After you deploy an application to an ECU in a cluster, the ECU becomes an ECC.
      *
      * @param request ListScaleOutEcuRequest
      * @return ListScaleOutEcuResponse
     */
    public ListScaleOutEcuResponse listScaleOutEcu(ListScaleOutEcuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listScaleOutEcuWithOptions(request, headers, runtime);
    }

    public ListServiceGroupsResponse listServiceGroupsWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceGroups"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/service/serviceGroups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceGroupsResponse());
    }

    public ListServiceGroupsResponse listServiceGroups() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServiceGroupsWithOptions(headers, runtime);
    }

    public ListSlbResponse listSlbWithOptions(ListSlbRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressType)) {
            query.put("AddressType", request.addressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slbType)) {
            query.put("SlbType", request.slbType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSlb"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/slb_list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSlbResponse());
    }

    public ListSlbResponse listSlb(ListSlbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSlbWithOptions(request, headers, runtime);
    }

    public ListSubAccountResponse listSubAccountWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSubAccount"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/account/sub_account_list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubAccountResponse());
    }

    public ListSubAccountResponse listSubAccount() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSubAccountWithOptions(headers, runtime);
    }

    public ListSwimmingLaneResponse listSwimmingLaneWithOptions(ListSwimmingLaneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSwimmingLane"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/trafficmgnt/swimming_lanes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSwimmingLaneResponse());
    }

    public ListSwimmingLaneResponse listSwimmingLane(ListSwimmingLaneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSwimmingLaneWithOptions(request, headers, runtime);
    }

    public ListSwimmingLaneGroupResponse listSwimmingLaneGroupWithOptions(ListSwimmingLaneGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSwimmingLaneGroup"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/trafficmgnt/swimming_lane_groups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSwimmingLaneGroupResponse());
    }

    public ListSwimmingLaneGroupResponse listSwimmingLaneGroup(ListSwimmingLaneGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSwimmingLaneGroupWithOptions(request, headers, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRegionId)) {
            query.put("ResourceRegionId", request.resourceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/tag/tags"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTagResourcesWithOptions(request, headers, runtime);
    }

    public ListUserDefineRegionResponse listUserDefineRegionWithOptions(ListUserDefineRegionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.debugEnable)) {
            query.put("DebugEnable", request.debugEnable);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserDefineRegion"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/user_region_defs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserDefineRegionResponse());
    }

    public ListUserDefineRegionResponse listUserDefineRegion(ListUserDefineRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserDefineRegionWithOptions(request, headers, runtime);
    }

    public ListVpcResponse listVpcWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVpc"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/vpc_list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVpcResponse());
    }

    public ListVpcResponse listVpc() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listVpcWithOptions(headers, runtime);
    }

    /**
      * ## Limits
      * We recommend that you do not call this operation. Instead, we recommend that you call the TransformClusterMember operation. For more information, see [TransformClusterMember](~~71514~~).
      * When you call this operation to import an Elastic Compute Service (ECS) instance, the operating system of the ECS instance is reinstalled. After the operating system is reinstalled, all data of the ECS instance is deleted. You must set a logon password for the ECS instance. Make sure that no important data exists on or data has been backed up for the ECS instance that you want to import.
      * ## Terms
      * *   **Namespace**: the logical concept that is used to isolate resources and microservices in Enterprise Distributed Application Service (EDAS). The resources include clusters, ECS instances, and applications. You can use a default or custom namespace. Each region has a default namespace and supports multiple custom namespaces. By default, only the default namespace is available. You do not need to create a custom namespace if you do not want to isolate resources or microservices.
      * *   **ECU**: After an ECS instance is imported to a cluster, the instance becomes an ECU.
      * *   **Elastic compute container (ECC)**: After you deploy an application to an ECU in a cluster, the ECU becomes an ECC.
      *
      * @param request MigrateEcuRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return MigrateEcuResponse
     */
    public MigrateEcuResponse migrateEcuWithOptions(MigrateEcuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MigrateEcu"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/resource/migrate_ecu"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MigrateEcuResponse());
    }

    /**
      * ## Limits
      * We recommend that you do not call this operation. Instead, we recommend that you call the TransformClusterMember operation. For more information, see [TransformClusterMember](~~71514~~).
      * When you call this operation to import an Elastic Compute Service (ECS) instance, the operating system of the ECS instance is reinstalled. After the operating system is reinstalled, all data of the ECS instance is deleted. You must set a logon password for the ECS instance. Make sure that no important data exists on or data has been backed up for the ECS instance that you want to import.
      * ## Terms
      * *   **Namespace**: the logical concept that is used to isolate resources and microservices in Enterprise Distributed Application Service (EDAS). The resources include clusters, ECS instances, and applications. You can use a default or custom namespace. Each region has a default namespace and supports multiple custom namespaces. By default, only the default namespace is available. You do not need to create a custom namespace if you do not want to isolate resources or microservices.
      * *   **ECU**: After an ECS instance is imported to a cluster, the instance becomes an ECU.
      * *   **Elastic compute container (ECC)**: After you deploy an application to an ECU in a cluster, the ECU becomes an ECC.
      *
      * @param request MigrateEcuRequest
      * @return MigrateEcuResponse
     */
    public MigrateEcuResponse migrateEcu(MigrateEcuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.migrateEcuWithOptions(request, headers, runtime);
    }

    public ModifyScalingRuleResponse modifyScalingRuleWithOptions(ModifyScalingRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptEULA)) {
            query.put("AcceptEULA", request.acceptEULA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inCondition)) {
            query.put("InCondition", request.inCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inCpu)) {
            query.put("InCpu", request.inCpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inDuration)) {
            query.put("InDuration", request.inDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inEnable)) {
            query.put("InEnable", request.inEnable);
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

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.multiAzPolicy)) {
            query.put("MultiAzPolicy", request.multiAzPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outCPU)) {
            query.put("OutCPU", request.outCPU);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outCondition)) {
            query.put("OutCondition", request.outCondition);
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

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceFrom)) {
            query.put("ResourceFrom", request.resourceFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingPolicy)) {
            query.put("ScalingPolicy", request.scalingPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateInstanceId)) {
            query.put("TemplateInstanceId", request.templateInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateInstanceName)) {
            query.put("TemplateInstanceName", request.templateInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIds)) {
            query.put("VSwitchIds", request.vSwitchIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyScalingRule"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/app/scaling_rules"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyScalingRuleResponse());
    }

    public ModifyScalingRuleResponse modifyScalingRule(ModifyScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyScalingRuleWithOptions(request, headers, runtime);
    }

    public QueryApplicationStatusResponse queryApplicationStatusWithOptions(QueryApplicationStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryApplicationStatus"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/app/app_status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryApplicationStatusResponse());
    }

    public QueryApplicationStatusResponse queryApplicationStatus(QueryApplicationStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApplicationStatusWithOptions(request, headers, runtime);
    }

    public QueryEccInfoResponse queryEccInfoWithOptions(QueryEccInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eccId)) {
            query.put("EccId", request.eccId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEccInfo"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/ecc"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEccInfoResponse());
    }

    public QueryEccInfoResponse queryEccInfo(QueryEccInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEccInfoWithOptions(request, headers, runtime);
    }

    public QueryMigrateEcuListResponse queryMigrateEcuListWithOptions(QueryMigrateEcuListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMigrateEcuList"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/resource/migrate_ecu_list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMigrateEcuListResponse());
    }

    public QueryMigrateEcuListResponse queryMigrateEcuList(QueryMigrateEcuListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMigrateEcuListWithOptions(request, headers, runtime);
    }

    public QueryMigrateRegionListResponse queryMigrateRegionListWithOptions(QueryMigrateRegionListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logicalRegionId)) {
            query.put("LogicalRegionId", request.logicalRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMigrateRegionList"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/resource/migrate_region_select"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMigrateRegionListResponse());
    }

    public QueryMigrateRegionListResponse queryMigrateRegionList(QueryMigrateRegionListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMigrateRegionListWithOptions(request, headers, runtime);
    }

    public QueryRegionConfigResponse queryRegionConfigWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRegionConfig"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/region_config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRegionConfigResponse());
    }

    public QueryRegionConfigResponse queryRegionConfig() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRegionConfigWithOptions(headers, runtime);
    }

    public QuerySlsLogStoreListResponse querySlsLogStoreListWithOptions(QuerySlsLogStoreListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySlsLogStoreList"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/sls/query_sls_log_store_list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySlsLogStoreListResponse());
    }

    public QuerySlsLogStoreListResponse querySlsLogStoreList(QuerySlsLogStoreListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySlsLogStoreListWithOptions(request, headers, runtime);
    }

    public ResetApplicationResponse resetApplicationWithOptions(ResetApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eccInfo)) {
            query.put("EccInfo", request.eccInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetApplication"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/changeorder/co_reset"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetApplicationResponse());
    }

    public ResetApplicationResponse resetApplication(ResetApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetApplicationWithOptions(request, headers, runtime);
    }

    public RestartApplicationResponse restartApplicationWithOptions(RestartApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eccInfo)) {
            query.put("EccInfo", request.eccInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartApplication"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/changeorder/co_restart"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartApplicationResponse());
    }

    public RestartApplicationResponse restartApplication(RestartApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartApplicationWithOptions(request, headers, runtime);
    }

    public RestartK8sApplicationResponse restartK8sApplicationWithOptions(RestartK8sApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartK8sApplication"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/restart_k8s_app"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartK8sApplicationResponse());
    }

    public RestartK8sApplicationResponse restartK8sApplication(RestartK8sApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartK8sApplicationWithOptions(request, headers, runtime);
    }

    public RetryChangeOrderTaskResponse retryChangeOrderTaskWithOptions(RetryChangeOrderTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.retryStatus)) {
            query.put("RetryStatus", request.retryStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryChangeOrderTask"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/changeorder/task_retry"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryChangeOrderTaskResponse());
    }

    public RetryChangeOrderTaskResponse retryChangeOrderTask(RetryChangeOrderTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryChangeOrderTaskWithOptions(request, headers, runtime);
    }

    public RollbackApplicationResponse rollbackApplicationWithOptions(RollbackApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batch)) {
            query.put("Batch", request.batch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchWaitTime)) {
            query.put("BatchWaitTime", request.batchWaitTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.historyVersion)) {
            query.put("HistoryVersion", request.historyVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RollbackApplication"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/changeorder/co_rollback"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RollbackApplicationResponse());
    }

    public RollbackApplicationResponse rollbackApplication(RollbackApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rollbackApplicationWithOptions(request, headers, runtime);
    }

    public RollbackChangeOrderResponse rollbackChangeOrderWithOptions(RollbackChangeOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeOrderId)) {
            query.put("ChangeOrderId", request.changeOrderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RollbackChangeOrder"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/oam/changeorder/rollback"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RollbackChangeOrderResponse());
    }

    public RollbackChangeOrderResponse rollbackChangeOrder(RollbackChangeOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rollbackChangeOrderWithOptions(request, headers, runtime);
    }

    public ScaleInApplicationResponse scaleInApplicationWithOptions(ScaleInApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScaleInApplication"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/changeorder/co_scale_in"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScaleInApplicationResponse());
    }

    public ScaleInApplicationResponse scaleInApplication(ScaleInApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scaleInApplicationWithOptions(request, headers, runtime);
    }

    public ScaleK8sApplicationResponse scaleK8sApplicationWithOptions(ScaleK8sApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScaleK8sApplication"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/k8s_apps"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScaleK8sApplicationResponse());
    }

    public ScaleK8sApplicationResponse scaleK8sApplication(ScaleK8sApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scaleK8sApplicationWithOptions(request, headers, runtime);
    }

    public ScaleOutApplicationResponse scaleOutApplicationWithOptions(ScaleOutApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployGroup)) {
            query.put("DeployGroup", request.deployGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecuInfo)) {
            query.put("EcuInfo", request.ecuInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScaleOutApplication"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/changeorder/co_scale_out"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScaleOutApplicationResponse());
    }

    public ScaleOutApplicationResponse scaleOutApplication(ScaleOutApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scaleOutApplicationWithOptions(request, headers, runtime);
    }

    /**
      * ## Limits
      * Assume that the auto scaling feature is configured and enabled for an application. When an auto scale-in is triggered for the application, the ECS instances that are purchased by calling this operation are removed first.
      *
      * @param request ScaleoutApplicationWithNewInstancesRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ScaleoutApplicationWithNewInstancesResponse
     */
    public ScaleoutApplicationWithNewInstancesResponse scaleoutApplicationWithNewInstancesWithOptions(ScaleoutApplicationWithNewInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewPeriod)) {
            query.put("AutoRenewPeriod", request.autoRenewPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceChargePeriod)) {
            query.put("InstanceChargePeriod", request.instanceChargePeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceChargePeriodUnit)) {
            query.put("InstanceChargePeriodUnit", request.instanceChargePeriodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceChargeType)) {
            query.put("InstanceChargeType", request.instanceChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingNum)) {
            query.put("ScalingNum", request.scalingNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingPolicy)) {
            query.put("ScalingPolicy", request.scalingPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateInstanceId)) {
            query.put("TemplateInstanceId", request.templateInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScaleoutApplicationWithNewInstances"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/scaling/scale_out"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScaleoutApplicationWithNewInstancesResponse());
    }

    /**
      * ## Limits
      * Assume that the auto scaling feature is configured and enabled for an application. When an auto scale-in is triggered for the application, the ECS instances that are purchased by calling this operation are removed first.
      *
      * @param request ScaleoutApplicationWithNewInstancesRequest
      * @return ScaleoutApplicationWithNewInstancesResponse
     */
    public ScaleoutApplicationWithNewInstancesResponse scaleoutApplicationWithNewInstances(ScaleoutApplicationWithNewInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scaleoutApplicationWithNewInstancesWithOptions(request, headers, runtime);
    }

    public StartApplicationResponse startApplicationWithOptions(StartApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eccInfo)) {
            query.put("EccInfo", request.eccInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartApplication"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/changeorder/co_start"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartApplicationResponse());
    }

    public StartApplicationResponse startApplication(StartApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startApplicationWithOptions(request, headers, runtime);
    }

    public StartK8sAppPrecheckResponse startK8sAppPrecheckWithOptions(StartK8sAppPrecheckRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.annotations)) {
            query.put("Annotations", request.annotations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentIds)) {
            query.put("ComponentIds", request.componentIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configMountDescs)) {
            query.put("ConfigMountDescs", request.configMountDescs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emptyDirs)) {
            query.put("EmptyDirs", request.emptyDirs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envFroms)) {
            query.put("EnvFroms", request.envFroms);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envs)) {
            query.put("Envs", request.envs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.javaStartUpConfig)) {
            query.put("JavaStartUpConfig", request.javaStartUpConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitEphemeralStorage)) {
            query.put("LimitEphemeralStorage", request.limitEphemeralStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitMem)) {
            query.put("LimitMem", request.limitMem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitmCpu)) {
            query.put("LimitmCpu", request.limitmCpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localVolume)) {
            query.put("LocalVolume", request.localVolume);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageUrl)) {
            query.put("PackageUrl", request.packageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pvcMountDescs)) {
            query.put("PvcMountDescs", request.pvcMountDescs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicas)) {
            query.put("Replicas", request.replicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestsEphemeralStorage)) {
            query.put("RequestsEphemeralStorage", request.requestsEphemeralStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestsMem)) {
            query.put("RequestsMem", request.requestsMem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestsmCpu)) {
            query.put("RequestsmCpu", request.requestsmCpu);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartK8sAppPrecheck"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/app_precheck"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartK8sAppPrecheckResponse());
    }

    public StartK8sAppPrecheckResponse startK8sAppPrecheck(StartK8sAppPrecheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startK8sAppPrecheckWithOptions(request, headers, runtime);
    }

    public StartK8sApplicationResponse startK8sApplicationWithOptions(StartK8sApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartK8sApplication"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/start_k8s_app"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartK8sApplicationResponse());
    }

    public StartK8sApplicationResponse startK8sApplication(StartK8sApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startK8sApplicationWithOptions(request, headers, runtime);
    }

    public StopApplicationResponse stopApplicationWithOptions(StopApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eccInfo)) {
            query.put("EccInfo", request.eccInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopApplication"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/changeorder/co_stop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopApplicationResponse());
    }

    public StopApplicationResponse stopApplication(StopApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopApplicationWithOptions(request, headers, runtime);
    }

    public StopK8sApplicationResponse stopK8sApplicationWithOptions(StopK8sApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopK8sApplication"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/stop_k8s_app"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopK8sApplicationResponse());
    }

    public StopK8sApplicationResponse stopK8sApplication(StopK8sApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopK8sApplicationWithOptions(request, headers, runtime);
    }

    /**
      * To call the SwitchAdvancedMonitoring operation, you must make sure that the version of Enterprise Distributed Application Service (EDAS) SDK for Java or Python is 3.15.2 or later.
      *
      * @param request SwitchAdvancedMonitoringRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return SwitchAdvancedMonitoringResponse
     */
    public SwitchAdvancedMonitoringResponse switchAdvancedMonitoringWithOptions(SwitchAdvancedMonitoringRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAdvancedMonitoring)) {
            query.put("EnableAdvancedMonitoring", request.enableAdvancedMonitoring);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchAdvancedMonitoring"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/monitor/advancedMonitorInfo"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchAdvancedMonitoringResponse());
    }

    /**
      * To call the SwitchAdvancedMonitoring operation, you must make sure that the version of Enterprise Distributed Application Service (EDAS) SDK for Java or Python is 3.15.2 or later.
      *
      * @param request SwitchAdvancedMonitoringRequest
      * @return SwitchAdvancedMonitoringResponse
     */
    public SwitchAdvancedMonitoringResponse switchAdvancedMonitoring(SwitchAdvancedMonitoringRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.switchAdvancedMonitoringWithOptions(request, headers, runtime);
    }

    /**
      * If you call this operation to synchronize ECS resource information, all instance data is synchronized from ECS. If you have more than 100 ECS instances, we recommend that you do not frequently call this operation.
      *
      * @param request SynchronizeResourceRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return SynchronizeResourceResponse
     */
    public SynchronizeResourceResponse synchronizeResourceWithOptions(SynchronizeResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SynchronizeResource"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/resource/pop_sync_resource"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SynchronizeResourceResponse());
    }

    /**
      * If you call this operation to synchronize ECS resource information, all instance data is synchronized from ECS. If you have more than 100 ECS instances, we recommend that you do not frequently call this operation.
      *
      * @param request SynchronizeResourceRequest
      * @return SynchronizeResourceResponse
     */
    public SynchronizeResourceResponse synchronizeResource(SynchronizeResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.synchronizeResourceWithOptions(request, headers, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRegionId)) {
            query.put("ResourceRegionId", request.resourceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/tag/tags"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.tagResourcesWithOptions(request, headers, runtime);
    }

    /**
      * ## Limits
      * When you call this operation to import an ECS instance, the operating system of the ECS instance is reinstalled. After the operating system is reinstalled, all data of the ECS instance is deleted. You must set a logon password for the ECS instance. Make sure that no important data exists on or data has been backed up for the ECS instance that you want to import.
      *
      * @param request TransformClusterMemberRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return TransformClusterMemberResponse
     */
    public TransformClusterMemberResponse transformClusterMemberWithOptions(TransformClusterMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetClusterId)) {
            query.put("TargetClusterId", request.targetClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransformClusterMember"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/resource/transform_cluster_member"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransformClusterMemberResponse());
    }

    /**
      * ## Limits
      * When you call this operation to import an ECS instance, the operating system of the ECS instance is reinstalled. After the operating system is reinstalled, all data of the ECS instance is deleted. You must set a logon password for the ECS instance. Make sure that no important data exists on or data has been backed up for the ECS instance that you want to import.
      *
      * @param request TransformClusterMemberRequest
      * @return TransformClusterMemberResponse
     */
    public TransformClusterMemberResponse transformClusterMember(TransformClusterMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.transformClusterMemberWithOptions(request, headers, runtime);
    }

    public UnbindK8sSlbResponse unbindK8sSlbWithOptions(UnbindK8sSlbRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slbName)) {
            query.put("SlbName", request.slbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindK8sSlb"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/k8s_slb_binding"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindK8sSlbResponse());
    }

    public UnbindK8sSlbResponse unbindK8sSlb(UnbindK8sSlbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindK8sSlbWithOptions(request, headers, runtime);
    }

    public UnbindSlbResponse unbindSlbWithOptions(UnbindSlbRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteListener)) {
            query.put("DeleteListener", request.deleteListener);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slbId)) {
            query.put("SlbId", request.slbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindSlb"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/app/unbind_slb_json"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindSlbResponse());
    }

    public UnbindSlbResponse unbindSlb(UnbindSlbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindSlbWithOptions(request, headers, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteAll)) {
            query.put("DeleteAll", request.deleteAll);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRegionId)) {
            query.put("ResourceRegionId", request.resourceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeys)) {
            query.put("TagKeys", request.tagKeys);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/tag/tags"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.untagResourcesWithOptions(request, headers, runtime);
    }

    public UpdateAccountInfoResponse updateAccountInfoWithOptions(UpdateAccountInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telephone)) {
            query.put("Telephone", request.telephone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAccountInfo"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/account/edit_account_info"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAccountInfoResponse());
    }

    public UpdateAccountInfoResponse updateAccountInfo(UpdateAccountInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAccountInfoWithOptions(request, headers, runtime);
    }

    public UpdateApplicationBaseInfoResponse updateApplicationBaseInfoWithOptions(UpdateApplicationBaseInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApplicationBaseInfo"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/app/update_app_info"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApplicationBaseInfoResponse());
    }

    public UpdateApplicationBaseInfoResponse updateApplicationBaseInfo(UpdateApplicationBaseInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApplicationBaseInfoWithOptions(request, headers, runtime);
    }

    public UpdateApplicationScalingRuleResponse updateApplicationScalingRuleWithOptions(UpdateApplicationScalingRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingBehaviour)) {
            query.put("ScalingBehaviour", request.scalingBehaviour);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleEnable)) {
            query.put("ScalingRuleEnable", request.scalingRuleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleMetric)) {
            query.put("ScalingRuleMetric", request.scalingRuleMetric);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleName)) {
            query.put("ScalingRuleName", request.scalingRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleTimer)) {
            query.put("ScalingRuleTimer", request.scalingRuleTimer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleTrigger)) {
            query.put("ScalingRuleTrigger", request.scalingRuleTrigger);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleType)) {
            query.put("ScalingRuleType", request.scalingRuleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApplicationScalingRule"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/eam/scale/application_scaling_rule"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApplicationScalingRuleResponse());
    }

    public UpdateApplicationScalingRuleResponse updateApplicationScalingRule(UpdateApplicationScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApplicationScalingRuleWithOptions(request, headers, runtime);
    }

    public UpdateConfigTemplateResponse updateConfigTemplateWithOptions(UpdateConfigTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.format)) {
            body.put("Format", request.format);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConfigTemplate"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/config_template"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConfigTemplateResponse());
    }

    public UpdateConfigTemplateResponse updateConfigTemplate(UpdateConfigTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateConfigTemplateWithOptions(request, headers, runtime);
    }

    public UpdateContainerResponse updateContainerWithOptions(UpdateContainerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buildPackId)) {
            query.put("BuildPackId", request.buildPackId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateContainer"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/changeorder/co_update_container"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateContainerResponse());
    }

    public UpdateContainerResponse updateContainer(UpdateContainerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateContainerWithOptions(request, headers, runtime);
    }

    public UpdateContainerConfigurationResponse updateContainerConfigurationWithOptions(UpdateContainerConfigurationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contextPath)) {
            query.put("ContextPath", request.contextPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateContainerConfiguration"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/app/container_config"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateContainerConfigurationResponse());
    }

    public UpdateContainerConfigurationResponse updateContainerConfiguration(UpdateContainerConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateContainerConfigurationWithOptions(request, headers, runtime);
    }

    public UpdateHealthCheckUrlResponse updateHealthCheckUrlWithOptions(UpdateHealthCheckUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hcURL)) {
            query.put("hcURL", request.hcURL);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateHealthCheckUrl"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/app/modify_hc_url"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHealthCheckUrlResponse());
    }

    public UpdateHealthCheckUrlResponse updateHealthCheckUrl(UpdateHealthCheckUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateHealthCheckUrlWithOptions(request, headers, runtime);
    }

    public UpdateHookConfigurationResponse updateHookConfigurationWithOptions(UpdateHookConfigurationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateHookConfiguration"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/app/config_app_hook_json"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHookConfigurationResponse());
    }

    public UpdateHookConfigurationResponse updateHookConfiguration(UpdateHookConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateHookConfigurationWithOptions(request, headers, runtime);
    }

    public UpdateJvmConfigurationResponse updateJvmConfigurationWithOptions(UpdateJvmConfigurationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxHeapSize)) {
            query.put("MaxHeapSize", request.maxHeapSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxPermSize)) {
            query.put("MaxPermSize", request.maxPermSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minHeapSize)) {
            query.put("MinHeapSize", request.minHeapSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            query.put("Options", request.options);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateJvmConfiguration"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/app/app_jvm_config"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateJvmConfigurationResponse());
    }

    public UpdateJvmConfigurationResponse updateJvmConfiguration(UpdateJvmConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateJvmConfigurationWithOptions(request, headers, runtime);
    }

    public UpdateK8sApplicationBaseInfoResponse updateK8sApplicationBaseInfoWithOptions(UpdateK8sApplicationBaseInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            query.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateK8sApplicationBaseInfo"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/oam/update_app_basic_info"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateK8sApplicationBaseInfoResponse());
    }

    public UpdateK8sApplicationBaseInfoResponse updateK8sApplicationBaseInfo(UpdateK8sApplicationBaseInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateK8sApplicationBaseInfoWithOptions(request, headers, runtime);
    }

    public UpdateK8sApplicationConfigResponse updateK8sApplicationConfigWithOptions(UpdateK8sApplicationConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.cpuRequest)) {
            query.put("CpuRequest", request.cpuRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ephemeralStorageLimit)) {
            query.put("EphemeralStorageLimit", request.ephemeralStorageLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ephemeralStorageRequest)) {
            query.put("EphemeralStorageRequest", request.ephemeralStorageRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mcpuLimit)) {
            query.put("McpuLimit", request.mcpuLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mcpuRequest)) {
            query.put("McpuRequest", request.mcpuRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memoryLimit)) {
            query.put("MemoryLimit", request.memoryLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memoryRequest)) {
            query.put("MemoryRequest", request.memoryRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateK8sApplicationConfig"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/k8s_app_configuration"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateK8sApplicationConfigResponse());
    }

    public UpdateK8sApplicationConfigResponse updateK8sApplicationConfig(UpdateK8sApplicationConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateK8sApplicationConfigWithOptions(request, headers, runtime);
    }

    public UpdateK8sConfigMapResponse updateK8sConfigMapWithOptions(UpdateK8sConfigMapRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateK8sConfigMap"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/k8s_config_map"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateK8sConfigMapResponse());
    }

    public UpdateK8sConfigMapResponse updateK8sConfigMap(UpdateK8sConfigMapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateK8sConfigMapWithOptions(request, headers, runtime);
    }

    public UpdateK8sIngressRuleResponse updateK8sIngressRuleWithOptions(UpdateK8sIngressRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.annotations)) {
            query.put("Annotations", request.annotations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ingressConf)) {
            query.put("IngressConf", request.ingressConf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateK8sIngressRule"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/k8s_ingress"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateK8sIngressRuleResponse());
    }

    public UpdateK8sIngressRuleResponse updateK8sIngressRule(UpdateK8sIngressRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateK8sIngressRuleWithOptions(request, headers, runtime);
    }

    /**
      * > You can update only Deployments.
      *
      * @param request UpdateK8sResourceRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateK8sResourceResponse
     */
    public UpdateK8sResourceResponse updateK8sResourceWithOptions(UpdateK8sResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateK8sResource"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/oam/update_k8s_resource_config"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateK8sResourceResponse());
    }

    /**
      * > You can update only Deployments.
      *
      * @param request UpdateK8sResourceRequest
      * @return UpdateK8sResourceResponse
     */
    public UpdateK8sResourceResponse updateK8sResource(UpdateK8sResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateK8sResourceWithOptions(request, headers, runtime);
    }

    public UpdateK8sSecretResponse updateK8sSecretWithOptions(UpdateK8sSecretRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.base64Encoded)) {
            body.put("Base64Encoded", request.base64Encoded);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certId)) {
            body.put("CertId", request.certId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certRegionId)) {
            body.put("CertRegionId", request.certRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateK8sSecret"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/k8s_secret"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateK8sSecretResponse());
    }

    public UpdateK8sSecretResponse updateK8sSecret(UpdateK8sSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateK8sSecretWithOptions(request, headers, runtime);
    }

    public UpdateK8sServiceResponse updateK8sServiceWithOptions(UpdateK8sServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalTrafficPolicy)) {
            query.put("ExternalTrafficPolicy", request.externalTrafficPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicePorts)) {
            query.put("ServicePorts", request.servicePorts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateK8sService"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/k8s_service"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateK8sServiceResponse());
    }

    public UpdateK8sServiceResponse updateK8sService(UpdateK8sServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateK8sServiceWithOptions(request, headers, runtime);
    }

    public UpdateK8sSlbResponse updateK8sSlbWithOptions(UpdateK8sSlbRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableForceOverride)) {
            query.put("DisableForceOverride", request.disableForceOverride);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            query.put("Scheduler", request.scheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicePortInfos)) {
            query.put("ServicePortInfos", request.servicePortInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slbName)) {
            query.put("SlbName", request.slbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slbProtocol)) {
            query.put("SlbProtocol", request.slbProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specification)) {
            query.put("Specification", request.specification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPort)) {
            query.put("TargetPort", request.targetPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateK8sSlb"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/acs/k8s_slb_binding"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateK8sSlbResponse());
    }

    public UpdateK8sSlbResponse updateK8sSlb(UpdateK8sSlbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateK8sSlbWithOptions(request, headers, runtime);
    }

    public UpdateRoleResponse updateRoleWithOptions(UpdateRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionData)) {
            query.put("ActionData", request.actionData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            query.put("RoleId", request.roleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRole"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/account/edit_role"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRoleResponse());
    }

    public UpdateRoleResponse updateRole(UpdateRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRoleWithOptions(request, headers, runtime);
    }

    public UpdateSlsLogStoreResponse updateSlsLogStoreWithOptions(UpdateSlsLogStoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configs)) {
            body.put("Configs", request.configs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSlsLogStore"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/k8s/sls/update_sls_log_store"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSlsLogStoreResponse());
    }

    public UpdateSlsLogStoreResponse updateSlsLogStore(UpdateSlsLogStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSlsLogStoreWithOptions(request, headers, runtime);
    }

    public UpdateSwimmingLaneResponse updateSwimmingLaneWithOptions(UpdateSwimmingLaneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInfos)) {
            query.put("AppInfos", request.appInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableRules)) {
            query.put("EnableRules", request.enableRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entryRules)) {
            query.put("EntryRules", request.entryRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.laneId)) {
            query.put("LaneId", request.laneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSwimmingLane"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/trafficmgnt/swimming_lanes"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSwimmingLaneResponse());
    }

    public UpdateSwimmingLaneResponse updateSwimmingLane(UpdateSwimmingLaneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSwimmingLaneWithOptions(request, headers, runtime);
    }

    public UpdateSwimmingLaneGroupResponse updateSwimmingLaneGroupWithOptions(UpdateSwimmingLaneGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIds)) {
            query.put("AppIds", request.appIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entryApp)) {
            query.put("EntryApp", request.entryApp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSwimmingLaneGroup"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v5/trafficmgnt/swimming_lane_groups"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSwimmingLaneGroupResponse());
    }

    public UpdateSwimmingLaneGroupResponse updateSwimmingLaneGroup(UpdateSwimmingLaneGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSwimmingLaneGroupWithOptions(request, headers, runtime);
    }
}
