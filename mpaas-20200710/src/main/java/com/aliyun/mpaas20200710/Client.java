// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710;

import com.aliyun.tea.*;
import com.aliyun.mpaas20200710.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "mpaas.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "mpaas.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "mpaas.aliyuncs.com"),
            new TeaPair("ap-south-1", "mpaas.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "mpaas.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "mpaas.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "mpaas.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "mpaas.aliyuncs.com"),
            new TeaPair("cn-beijing", "mpaas.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "mpaas.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "mpaas.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "mpaas.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "mpaas.aliyuncs.com"),
            new TeaPair("cn-chengdu", "mpaas.aliyuncs.com"),
            new TeaPair("cn-edge-1", "mpaas.aliyuncs.com"),
            new TeaPair("cn-fujian", "mpaas.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "mpaas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "mpaas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "mpaas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "mpaas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "mpaas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "mpaas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "mpaas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "mpaas.aliyuncs.com"),
            new TeaPair("cn-hongkong", "mpaas.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "mpaas.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "mpaas.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "mpaas.aliyuncs.com"),
            new TeaPair("cn-qingdao", "mpaas.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "mpaas.aliyuncs.com"),
            new TeaPair("cn-shanghai", "mpaas.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "mpaas.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "mpaas.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "mpaas.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "mpaas.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "mpaas.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "mpaas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "mpaas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "mpaas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "mpaas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "mpaas.aliyuncs.com"),
            new TeaPair("cn-wuhan", "mpaas.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "mpaas.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "mpaas.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "mpaas.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "mpaas.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "mpaas.aliyuncs.com"),
            new TeaPair("eu-central-1", "mpaas.aliyuncs.com"),
            new TeaPair("eu-west-1", "mpaas.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "mpaas.aliyuncs.com"),
            new TeaPair("me-east-1", "mpaas.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "mpaas.aliyuncs.com"),
            new TeaPair("us-east-1", "mpaas.aliyuncs.com"),
            new TeaPair("us-west-1", "mpaas.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("mpaas", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    /**
     * <b>summary</b> : 
     * <p>取消定时任务</p>
     * 
     * @param request CancelMpsSchedulerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelMpsSchedulerResponse
     */
    public CancelMpsSchedulerResponse cancelMpsSchedulerWithOptions(CancelMpsSchedulerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniqueIds)) {
            body.put("UniqueIds", request.uniqueIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelMpsScheduler"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelMpsSchedulerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消定时任务</p>
     * 
     * @param request CancelMpsSchedulerRequest
     * @return CancelMpsSchedulerResponse
     */
    public CancelMpsSchedulerResponse cancelMpsScheduler(CancelMpsSchedulerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelMpsSchedulerWithOptions(request, runtime);
    }

    /**
     * @param request CancelPushSchedulerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelPushSchedulerResponse
     */
    public CancelPushSchedulerResponse cancelPushSchedulerWithOptions(CancelPushSchedulerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniqueIds)) {
            body.put("UniqueIds", request.uniqueIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelPushScheduler"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelPushSchedulerResponse());
    }

    /**
     * @param request CancelPushSchedulerRequest
     * @return CancelPushSchedulerResponse
     */
    public CancelPushSchedulerResponse cancelPushScheduler(CancelPushSchedulerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelPushSchedulerWithOptions(request, runtime);
    }

    /**
     * @param request ChangeMcubeMiniTaskStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeMcubeMiniTaskStatusResponse
     */
    public ChangeMcubeMiniTaskStatusResponse changeMcubeMiniTaskStatusWithOptions(ChangeMcubeMiniTaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageId)) {
            body.put("PackageId", request.packageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskStatus)) {
            body.put("TaskStatus", request.taskStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeMcubeMiniTaskStatus"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeMcubeMiniTaskStatusResponse());
    }

    /**
     * @param request ChangeMcubeMiniTaskStatusRequest
     * @return ChangeMcubeMiniTaskStatusResponse
     */
    public ChangeMcubeMiniTaskStatusResponse changeMcubeMiniTaskStatus(ChangeMcubeMiniTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeMcubeMiniTaskStatusWithOptions(request, runtime);
    }

    /**
     * @param request ChangeMcubeNebulaTaskStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeMcubeNebulaTaskStatusResponse
     */
    public ChangeMcubeNebulaTaskStatusResponse changeMcubeNebulaTaskStatusWithOptions(ChangeMcubeNebulaTaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageId)) {
            body.put("PackageId", request.packageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskStatus)) {
            body.put("TaskStatus", request.taskStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeMcubeNebulaTaskStatus"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeMcubeNebulaTaskStatusResponse());
    }

    /**
     * @param request ChangeMcubeNebulaTaskStatusRequest
     * @return ChangeMcubeNebulaTaskStatusResponse
     */
    public ChangeMcubeNebulaTaskStatusResponse changeMcubeNebulaTaskStatus(ChangeMcubeNebulaTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeMcubeNebulaTaskStatusWithOptions(request, runtime);
    }

    /**
     * @param request ChangeMcubePublicTaskStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeMcubePublicTaskStatusResponse
     */
    public ChangeMcubePublicTaskStatusResponse changeMcubePublicTaskStatusWithOptions(ChangeMcubePublicTaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskStatus)) {
            body.put("TaskStatus", request.taskStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeMcubePublicTaskStatus"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeMcubePublicTaskStatusResponse());
    }

    /**
     * @param request ChangeMcubePublicTaskStatusRequest
     * @return ChangeMcubePublicTaskStatusResponse
     */
    public ChangeMcubePublicTaskStatusResponse changeMcubePublicTaskStatus(ChangeMcubePublicTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeMcubePublicTaskStatusWithOptions(request, runtime);
    }

    /**
     * @param request CreateMcubeMiniAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMcubeMiniAppResponse
     */
    public CreateMcubeMiniAppResponse createMcubeMiniAppWithOptions(CreateMcubeMiniAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.h5Id)) {
            body.put("H5Id", request.h5Id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.h5Name)) {
            body.put("H5Name", request.h5Name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMcubeMiniApp"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMcubeMiniAppResponse());
    }

    /**
     * @param request CreateMcubeMiniAppRequest
     * @return CreateMcubeMiniAppResponse
     */
    public CreateMcubeMiniAppResponse createMcubeMiniApp(CreateMcubeMiniAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMcubeMiniAppWithOptions(request, runtime);
    }

    /**
     * @param request CreateMcubeMiniTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMcubeMiniTaskResponse
     */
    public CreateMcubeMiniTaskResponse createMcubeMiniTaskWithOptions(CreateMcubeMiniTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.greyConfigInfo)) {
            body.put("GreyConfigInfo", request.greyConfigInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.greyEndtimeData)) {
            body.put("GreyEndtimeData", request.greyEndtimeData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.greyNum)) {
            body.put("GreyNum", request.greyNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memo)) {
            body.put("Memo", request.memo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageId)) {
            body.put("PackageId", request.packageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishMode)) {
            body.put("PublishMode", request.publishMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishType)) {
            body.put("PublishType", request.publishType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelistIds)) {
            body.put("WhitelistIds", request.whitelistIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMcubeMiniTask"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMcubeMiniTaskResponse());
    }

    /**
     * @param request CreateMcubeMiniTaskRequest
     * @return CreateMcubeMiniTaskResponse
     */
    public CreateMcubeMiniTaskResponse createMcubeMiniTask(CreateMcubeMiniTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMcubeMiniTaskWithOptions(request, runtime);
    }

    /**
     * @param request CreateMcubeNebulaAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMcubeNebulaAppResponse
     */
    public CreateMcubeNebulaAppResponse createMcubeNebulaAppWithOptions(CreateMcubeNebulaAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.h5Id)) {
            body.put("H5Id", request.h5Id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.h5Name)) {
            body.put("H5Name", request.h5Name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMcubeNebulaApp"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMcubeNebulaAppResponse());
    }

    /**
     * @param request CreateMcubeNebulaAppRequest
     * @return CreateMcubeNebulaAppResponse
     */
    public CreateMcubeNebulaAppResponse createMcubeNebulaApp(CreateMcubeNebulaAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMcubeNebulaAppWithOptions(request, runtime);
    }

    /**
     * @param request CreateMcubeNebulaResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMcubeNebulaResourceResponse
     */
    public CreateMcubeNebulaResourceResponse createMcubeNebulaResourceWithOptions(CreateMcubeNebulaResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoInstall)) {
            body.put("AutoInstall", request.autoInstall);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVersionMax)) {
            body.put("ClientVersionMax", request.clientVersionMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVersionMin)) {
            body.put("ClientVersionMin", request.clientVersionMin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customDomainName)) {
            body.put("CustomDomainName", request.customDomainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendInfo)) {
            body.put("ExtendInfo", request.extendInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            body.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.h5Id)) {
            body.put("H5Id", request.h5Id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.h5Name)) {
            body.put("H5Name", request.h5Name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.h5Version)) {
            body.put("H5Version", request.h5Version);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.installType)) {
            body.put("InstallType", request.installType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mainUrl)) {
            body.put("MainUrl", request.mainUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onexFlag)) {
            body.put("OnexFlag", request.onexFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            body.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatNebula)) {
            body.put("RepeatNebula", request.repeatNebula);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUrl)) {
            body.put("SubUrl", request.subUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhost)) {
            body.put("Vhost", request.vhost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMcubeNebulaResource"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMcubeNebulaResourceResponse());
    }

    /**
     * @param request CreateMcubeNebulaResourceRequest
     * @return CreateMcubeNebulaResourceResponse
     */
    public CreateMcubeNebulaResourceResponse createMcubeNebulaResource(CreateMcubeNebulaResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMcubeNebulaResourceWithOptions(request, runtime);
    }

    /**
     * @param request CreateMcubeNebulaTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMcubeNebulaTaskResponse
     */
    public CreateMcubeNebulaTaskResponse createMcubeNebulaTaskWithOptions(CreateMcubeNebulaTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            body.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creator)) {
            body.put("Creator", request.creator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            body.put("GmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtModified)) {
            body.put("GmtModified", request.gmtModified);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtModifiedStr)) {
            body.put("GmtModifiedStr", request.gmtModifiedStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.greyConfigInfo)) {
            body.put("GreyConfigInfo", request.greyConfigInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.greyEndtime)) {
            body.put("GreyEndtime", request.greyEndtime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.greyEndtimeData)) {
            body.put("GreyEndtimeData", request.greyEndtimeData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.greyEndtimeStr)) {
            body.put("GreyEndtimeStr", request.greyEndtimeStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.greyNum)) {
            body.put("GreyNum", request.greyNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.greyUrl)) {
            body.put("GreyUrl", request.greyUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memo)) {
            body.put("Memo", request.memo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifier)) {
            body.put("Modifier", request.modifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageId)) {
            body.put("PackageId", request.packageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.percent)) {
            body.put("Percent", request.percent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            body.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersion)) {
            body.put("ProductVersion", request.productVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishMode)) {
            body.put("PublishMode", request.publishMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishType)) {
            body.put("PublishType", request.publishType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseVersion)) {
            body.put("ReleaseVersion", request.releaseVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resIds)) {
            body.put("ResIds", request.resIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialVersionUID)) {
            body.put("SerialVersionUID", request.serialVersionUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncMode)) {
            body.put("SyncMode", request.syncMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncResult)) {
            body.put("SyncResult", request.syncResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskStatus)) {
            body.put("TaskStatus", request.taskStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            body.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskVersion)) {
            body.put("TaskVersion", request.taskVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradeNoticeNum)) {
            body.put("UpgradeNoticeNum", request.upgradeNoticeNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradeProgress)) {
            body.put("UpgradeProgress", request.upgradeProgress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelistIds)) {
            body.put("WhitelistIds", request.whitelistIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMcubeNebulaTask"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMcubeNebulaTaskResponse());
    }

    /**
     * @param request CreateMcubeNebulaTaskRequest
     * @return CreateMcubeNebulaTaskResponse
     */
    public CreateMcubeNebulaTaskResponse createMcubeNebulaTask(CreateMcubeNebulaTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMcubeNebulaTaskWithOptions(request, runtime);
    }

    /**
     * @param request CreateMcubeUpgradePackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMcubeUpgradePackageResponse
     */
    public CreateMcubeUpgradePackageResponse createMcubeUpgradePackageWithOptions(CreateMcubeUpgradePackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            body.put("AppVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appstoreUrl)) {
            body.put("AppstoreUrl", request.appstoreUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bundleId)) {
            body.put("BundleId", request.bundleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customDomainName)) {
            body.put("CustomDomainName", request.customDomainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            body.put("Desc", request.desc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.downloadUrl)) {
            body.put("DownloadUrl", request.downloadUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            body.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iconFileUrl)) {
            body.put("IconFileUrl", request.iconFileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.installAmount)) {
            body.put("InstallAmount", request.installAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iosSymbolfileUrl)) {
            body.put("IosSymbolfileUrl", request.iosSymbolfileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isEnterprise)) {
            body.put("IsEnterprise", request.isEnterprise);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needCheck)) {
            body.put("NeedCheck", request.needCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onexFlag)) {
            body.put("OnexFlag", request.onexFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            body.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validDays)) {
            body.put("ValidDays", request.validDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMcubeUpgradePackage"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMcubeUpgradePackageResponse());
    }

    /**
     * @param request CreateMcubeUpgradePackageRequest
     * @return CreateMcubeUpgradePackageResponse
     */
    public CreateMcubeUpgradePackageResponse createMcubeUpgradePackage(CreateMcubeUpgradePackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMcubeUpgradePackageWithOptions(request, runtime);
    }

    /**
     * @param request CreateMcubeUpgradeTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMcubeUpgradeTaskResponse
     */
    public CreateMcubeUpgradeTaskResponse createMcubeUpgradeTaskWithOptions(CreateMcubeUpgradeTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.greyConfigInfo)) {
            body.put("GreyConfigInfo", request.greyConfigInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.greyEndtimeData)) {
            body.put("GreyEndtimeData", request.greyEndtimeData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.greyNum)) {
            body.put("GreyNum", request.greyNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.historyForce)) {
            body.put("HistoryForce", request.historyForce);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memo)) {
            body.put("Memo", request.memo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageInfoId)) {
            body.put("PackageInfoId", request.packageInfoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishMode)) {
            body.put("PublishMode", request.publishMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishType)) {
            body.put("PublishType", request.publishType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradeContent)) {
            body.put("UpgradeContent", request.upgradeContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradeType)) {
            body.put("UpgradeType", request.upgradeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelistIds)) {
            body.put("WhitelistIds", request.whitelistIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMcubeUpgradeTask"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMcubeUpgradeTaskResponse());
    }

    /**
     * @param request CreateMcubeUpgradeTaskRequest
     * @return CreateMcubeUpgradeTaskResponse
     */
    public CreateMcubeUpgradeTaskResponse createMcubeUpgradeTask(CreateMcubeUpgradeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMcubeUpgradeTaskWithOptions(request, runtime);
    }

    /**
     * @param request CreateMcubeVhostRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMcubeVhostResponse
     */
    public CreateMcubeVhostResponse createMcubeVhostWithOptions(CreateMcubeVhostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhost)) {
            body.put("Vhost", request.vhost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMcubeVhost"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMcubeVhostResponse());
    }

    /**
     * @param request CreateMcubeVhostRequest
     * @return CreateMcubeVhostResponse
     */
    public CreateMcubeVhostResponse createMcubeVhost(CreateMcubeVhostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMcubeVhostWithOptions(request, runtime);
    }

    /**
     * @param request CreateMcubeWhitelistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMcubeWhitelistResponse
     */
    public CreateMcubeWhitelistResponse createMcubeWhitelistWithOptions(CreateMcubeWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whiteListName)) {
            body.put("WhiteListName", request.whiteListName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelistType)) {
            body.put("WhitelistType", request.whitelistType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMcubeWhitelist"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMcubeWhitelistResponse());
    }

    /**
     * @param request CreateMcubeWhitelistRequest
     * @return CreateMcubeWhitelistResponse
     */
    public CreateMcubeWhitelistResponse createMcubeWhitelist(CreateMcubeWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMcubeWhitelistWithOptions(request, runtime);
    }

    /**
     * @param request CreateMcubeWhitelistForIdeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMcubeWhitelistForIdeResponse
     */
    public CreateMcubeWhitelistForIdeResponse createMcubeWhitelistForIdeWithOptions(CreateMcubeWhitelistForIdeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelistValue)) {
            body.put("WhitelistValue", request.whitelistValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMcubeWhitelistForIde"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMcubeWhitelistForIdeResponse());
    }

    /**
     * @param request CreateMcubeWhitelistForIdeRequest
     * @return CreateMcubeWhitelistForIdeResponse
     */
    public CreateMcubeWhitelistForIdeResponse createMcubeWhitelistForIde(CreateMcubeWhitelistForIdeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMcubeWhitelistForIdeWithOptions(request, runtime);
    }

    /**
     * @param request CreateOpenGlobalDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOpenGlobalDataResponse
     */
    public CreateOpenGlobalDataResponse createOpenGlobalDataWithOptions(CreateOpenGlobalDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appMaxVersion)) {
            body.put("AppMaxVersion", request.appMaxVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appMinVersion)) {
            body.put("AppMinVersion", request.appMinVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extAttrStr)) {
            body.put("ExtAttrStr", request.extAttrStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxUid)) {
            body.put("MaxUid", request.maxUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minUid)) {
            body.put("MinUid", request.minUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            body.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payload)) {
            body.put("Payload", request.payload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdMsgId)) {
            body.put("ThirdMsgId", request.thirdMsgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uids)) {
            body.put("Uids", request.uids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validTimeEnd)) {
            body.put("ValidTimeEnd", request.validTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validTimeStart)) {
            body.put("ValidTimeStart", request.validTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOpenGlobalData"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOpenGlobalDataResponse());
    }

    /**
     * @param request CreateOpenGlobalDataRequest
     * @return CreateOpenGlobalDataResponse
     */
    public CreateOpenGlobalDataResponse createOpenGlobalData(CreateOpenGlobalDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOpenGlobalDataWithOptions(request, runtime);
    }

    /**
     * @param request CreateOpenSingleDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOpenSingleDataResponse
     */
    public CreateOpenSingleDataResponse createOpenSingleDataWithOptions(CreateOpenSingleDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appMaxVersion)) {
            body.put("AppMaxVersion", request.appMaxVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appMinVersion)) {
            body.put("AppMinVersion", request.appMinVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkOnline)) {
            body.put("CheckOnline", request.checkOnline);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extAttrStr)) {
            body.put("ExtAttrStr", request.extAttrStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.linkToken)) {
            body.put("LinkToken", request.linkToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            body.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payload)) {
            body.put("Payload", request.payload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdMsgId)) {
            body.put("ThirdMsgId", request.thirdMsgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validTimeEnd)) {
            body.put("ValidTimeEnd", request.validTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validTimeStart)) {
            body.put("ValidTimeStart", request.validTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOpenSingleData"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOpenSingleDataResponse());
    }

    /**
     * @param request CreateOpenSingleDataRequest
     * @return CreateOpenSingleDataResponse
     */
    public CreateOpenSingleDataResponse createOpenSingleData(CreateOpenSingleDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOpenSingleDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建模版</p>
     * 
     * @param request CreateTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplateWithOptions(CreateTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.descInfo)) {
            body.put("DescInfo", request.descInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iconUrls)) {
            body.put("IconUrls", request.iconUrls);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrls)) {
            body.put("ImageUrls", request.imageUrls);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jumpAction)) {
            body.put("JumpAction", request.jumpAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushStyle)) {
            body.put("PushStyle", request.pushStyle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showStyle)) {
            body.put("ShowStyle", request.showStyle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            body.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uri)) {
            body.put("Uri", request.uri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variables)) {
            body.put("Variables", request.variables);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTemplate"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建模版</p>
     * 
     * @param request CreateTemplateRequest
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTemplateWithOptions(request, runtime);
    }

    /**
     * @param request DeleteCubecardWhitelistContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCubecardWhitelistContentResponse
     */
    public DeleteCubecardWhitelistContentResponse deleteCubecardWhitelistContentWithOptions(DeleteCubecardWhitelistContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelistId)) {
            body.put("WhitelistId", request.whitelistId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelistValue)) {
            body.put("WhitelistValue", request.whitelistValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCubecardWhitelistContent"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCubecardWhitelistContentResponse());
    }

    /**
     * @param request DeleteCubecardWhitelistContentRequest
     * @return DeleteCubecardWhitelistContentResponse
     */
    public DeleteCubecardWhitelistContentResponse deleteCubecardWhitelistContent(DeleteCubecardWhitelistContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCubecardWhitelistContentWithOptions(request, runtime);
    }

    /**
     * @param request DeleteMcubeMiniAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMcubeMiniAppResponse
     */
    public DeleteMcubeMiniAppResponse deleteMcubeMiniAppWithOptions(DeleteMcubeMiniAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.h5Id)) {
            body.put("H5Id", request.h5Id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMcubeMiniApp"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMcubeMiniAppResponse());
    }

    /**
     * @param request DeleteMcubeMiniAppRequest
     * @return DeleteMcubeMiniAppResponse
     */
    public DeleteMcubeMiniAppResponse deleteMcubeMiniApp(DeleteMcubeMiniAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMcubeMiniAppWithOptions(request, runtime);
    }

    /**
     * @param request DeleteMcubeNebulaAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMcubeNebulaAppResponse
     */
    public DeleteMcubeNebulaAppResponse deleteMcubeNebulaAppWithOptions(DeleteMcubeNebulaAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.h5Id)) {
            body.put("H5Id", request.h5Id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMcubeNebulaApp"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMcubeNebulaAppResponse());
    }

    /**
     * @param request DeleteMcubeNebulaAppRequest
     * @return DeleteMcubeNebulaAppResponse
     */
    public DeleteMcubeNebulaAppResponse deleteMcubeNebulaApp(DeleteMcubeNebulaAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMcubeNebulaAppWithOptions(request, runtime);
    }

    /**
     * @param request DeleteMcubeUpgradeResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMcubeUpgradeResourceResponse
     */
    public DeleteMcubeUpgradeResourceResponse deleteMcubeUpgradeResourceWithOptions(DeleteMcubeUpgradeResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            body.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMcubeUpgradeResource"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMcubeUpgradeResourceResponse());
    }

    /**
     * @param request DeleteMcubeUpgradeResourceRequest
     * @return DeleteMcubeUpgradeResourceResponse
     */
    public DeleteMcubeUpgradeResourceResponse deleteMcubeUpgradeResource(DeleteMcubeUpgradeResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMcubeUpgradeResourceWithOptions(request, runtime);
    }

    /**
     * @param request DeleteMcubeWhitelistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMcubeWhitelistResponse
     */
    public DeleteMcubeWhitelistResponse deleteMcubeWhitelistWithOptions(DeleteMcubeWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMcubeWhitelist"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMcubeWhitelistResponse());
    }

    /**
     * @param request DeleteMcubeWhitelistRequest
     * @return DeleteMcubeWhitelistResponse
     */
    public DeleteMcubeWhitelistResponse deleteMcubeWhitelist(DeleteMcubeWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMcubeWhitelistWithOptions(request, runtime);
    }

    /**
     * @param request DeleteMdsWhitelistContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMdsWhitelistContentResponse
     */
    public DeleteMdsWhitelistContentResponse deleteMdsWhitelistContentWithOptions(DeleteMdsWhitelistContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelistId)) {
            body.put("WhitelistId", request.whitelistId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelistValue)) {
            body.put("WhitelistValue", request.whitelistValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMdsWhitelistContent"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMdsWhitelistContentResponse());
    }

    /**
     * @param request DeleteMdsWhitelistContentRequest
     * @return DeleteMdsWhitelistContentResponse
     */
    public DeleteMdsWhitelistContentResponse deleteMdsWhitelistContent(DeleteMdsWhitelistContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMdsWhitelistContentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除模版</p>
     * 
     * @param request DeleteTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplateWithOptions(DeleteTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            body.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTemplate"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除模版</p>
     * 
     * @param request DeleteTemplateRequest
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTemplateWithOptions(request, runtime);
    }

    /**
     * @param request ExistMcubeRsaKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExistMcubeRsaKeyResponse
     */
    public ExistMcubeRsaKeyResponse existMcubeRsaKeyWithOptions(ExistMcubeRsaKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExistMcubeRsaKey"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExistMcubeRsaKeyResponse());
    }

    /**
     * @param request ExistMcubeRsaKeyRequest
     * @return ExistMcubeRsaKeyResponse
     */
    public ExistMcubeRsaKeyResponse existMcubeRsaKey(ExistMcubeRsaKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.existMcubeRsaKeyWithOptions(request, runtime);
    }

    /**
     * @param request GetMcubeFileTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMcubeFileTokenResponse
     */
    public GetMcubeFileTokenResponse getMcubeFileTokenWithOptions(GetMcubeFileTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onexFlag)) {
            body.put("OnexFlag", request.onexFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMcubeFileToken"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMcubeFileTokenResponse());
    }

    /**
     * @param request GetMcubeFileTokenRequest
     * @return GetMcubeFileTokenResponse
     */
    public GetMcubeFileTokenResponse getMcubeFileToken(GetMcubeFileTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMcubeFileTokenWithOptions(request, runtime);
    }

    /**
     * @param request GetMcubeNebulaResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMcubeNebulaResourceResponse
     */
    public GetMcubeNebulaResourceResponse getMcubeNebulaResourceWithOptions(GetMcubeNebulaResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMcubeNebulaResource"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMcubeNebulaResourceResponse());
    }

    /**
     * @param request GetMcubeNebulaResourceRequest
     * @return GetMcubeNebulaResourceResponse
     */
    public GetMcubeNebulaResourceResponse getMcubeNebulaResource(GetMcubeNebulaResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMcubeNebulaResourceWithOptions(request, runtime);
    }

    /**
     * @param request GetMcubeNebulaTaskDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMcubeNebulaTaskDetailResponse
     */
    public GetMcubeNebulaTaskDetailResponse getMcubeNebulaTaskDetailWithOptions(GetMcubeNebulaTaskDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMcubeNebulaTaskDetail"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMcubeNebulaTaskDetailResponse());
    }

    /**
     * @param request GetMcubeNebulaTaskDetailRequest
     * @return GetMcubeNebulaTaskDetailResponse
     */
    public GetMcubeNebulaTaskDetailResponse getMcubeNebulaTaskDetail(GetMcubeNebulaTaskDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMcubeNebulaTaskDetailWithOptions(request, runtime);
    }

    /**
     * @param request GetMcubeUpgradePackageInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMcubeUpgradePackageInfoResponse
     */
    public GetMcubeUpgradePackageInfoResponse getMcubeUpgradePackageInfoWithOptions(GetMcubeUpgradePackageInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageId)) {
            body.put("PackageId", request.packageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMcubeUpgradePackageInfo"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMcubeUpgradePackageInfoResponse());
    }

    /**
     * @param request GetMcubeUpgradePackageInfoRequest
     * @return GetMcubeUpgradePackageInfoResponse
     */
    public GetMcubeUpgradePackageInfoResponse getMcubeUpgradePackageInfo(GetMcubeUpgradePackageInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMcubeUpgradePackageInfoWithOptions(request, runtime);
    }

    /**
     * @param request GetMcubeUpgradeTaskInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMcubeUpgradeTaskInfoResponse
     */
    public GetMcubeUpgradeTaskInfoResponse getMcubeUpgradeTaskInfoWithOptions(GetMcubeUpgradeTaskInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMcubeUpgradeTaskInfo"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMcubeUpgradeTaskInfoResponse());
    }

    /**
     * @param request GetMcubeUpgradeTaskInfoRequest
     * @return GetMcubeUpgradeTaskInfoResponse
     */
    public GetMcubeUpgradeTaskInfoResponse getMcubeUpgradeTaskInfo(GetMcubeUpgradeTaskInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMcubeUpgradeTaskInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取模版</p>
     * 
     * @param request GetTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTemplateResponse
     */
    public GetTemplateResponse getTemplateWithOptions(GetTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            body.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplate"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取模版</p>
     * 
     * @param request GetTemplateRequest
     * @return GetTemplateResponse
     */
    public GetTemplateResponse getTemplate(GetTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询报表</p>
     * 
     * @param request ListAnalysisCoreIndexRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAnalysisCoreIndexResponse
     */
    public ListAnalysisCoreIndexResponse listAnalysisCoreIndexWithOptions(ListAnalysisCoreIndexRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            body.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            body.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAnalysisCoreIndex"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAnalysisCoreIndexResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询报表</p>
     * 
     * @param request ListAnalysisCoreIndexRequest
     * @return ListAnalysisCoreIndexResponse
     */
    public ListAnalysisCoreIndexResponse listAnalysisCoreIndex(ListAnalysisCoreIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAnalysisCoreIndexWithOptions(request, runtime);
    }

    /**
     * @param request ListMcubeMiniAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMcubeMiniAppsResponse
     */
    public ListMcubeMiniAppsResponse listMcubeMiniAppsWithOptions(ListMcubeMiniAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMcubeMiniApps"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMcubeMiniAppsResponse());
    }

    /**
     * @param request ListMcubeMiniAppsRequest
     * @return ListMcubeMiniAppsResponse
     */
    public ListMcubeMiniAppsResponse listMcubeMiniApps(ListMcubeMiniAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMcubeMiniAppsWithOptions(request, runtime);
    }

    /**
     * @param request ListMcubeMiniPackagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMcubeMiniPackagesResponse
     */
    public ListMcubeMiniPackagesResponse listMcubeMiniPackagesWithOptions(ListMcubeMiniPackagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.h5Id)) {
            body.put("H5Id", request.h5Id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageTypes)) {
            body.put("PackageTypes", request.packageTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMcubeMiniPackages"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMcubeMiniPackagesResponse());
    }

    /**
     * @param request ListMcubeMiniPackagesRequest
     * @return ListMcubeMiniPackagesResponse
     */
    public ListMcubeMiniPackagesResponse listMcubeMiniPackages(ListMcubeMiniPackagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMcubeMiniPackagesWithOptions(request, runtime);
    }

    /**
     * @param request ListMcubeMiniTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMcubeMiniTasksResponse
     */
    public ListMcubeMiniTasksResponse listMcubeMiniTasksWithOptions(ListMcubeMiniTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMcubeMiniTasks"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMcubeMiniTasksResponse());
    }

    /**
     * @param request ListMcubeMiniTasksRequest
     * @return ListMcubeMiniTasksResponse
     */
    public ListMcubeMiniTasksResponse listMcubeMiniTasks(ListMcubeMiniTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMcubeMiniTasksWithOptions(request, runtime);
    }

    /**
     * @param request ListMcubeNebulaAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMcubeNebulaAppsResponse
     */
    public ListMcubeNebulaAppsResponse listMcubeNebulaAppsWithOptions(ListMcubeNebulaAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMcubeNebulaApps"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMcubeNebulaAppsResponse());
    }

    /**
     * @param request ListMcubeNebulaAppsRequest
     * @return ListMcubeNebulaAppsResponse
     */
    public ListMcubeNebulaAppsResponse listMcubeNebulaApps(ListMcubeNebulaAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMcubeNebulaAppsWithOptions(request, runtime);
    }

    /**
     * @param request ListMcubeNebulaResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMcubeNebulaResourcesResponse
     */
    public ListMcubeNebulaResourcesResponse listMcubeNebulaResourcesWithOptions(ListMcubeNebulaResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.h5Id)) {
            body.put("H5Id", request.h5Id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMcubeNebulaResources"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMcubeNebulaResourcesResponse());
    }

    /**
     * @param request ListMcubeNebulaResourcesRequest
     * @return ListMcubeNebulaResourcesResponse
     */
    public ListMcubeNebulaResourcesResponse listMcubeNebulaResources(ListMcubeNebulaResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMcubeNebulaResourcesWithOptions(request, runtime);
    }

    /**
     * @param request ListMcubeNebulaTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMcubeNebulaTasksResponse
     */
    public ListMcubeNebulaTasksResponse listMcubeNebulaTasksWithOptions(ListMcubeNebulaTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMcubeNebulaTasks"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMcubeNebulaTasksResponse());
    }

    /**
     * @param request ListMcubeNebulaTasksRequest
     * @return ListMcubeNebulaTasksResponse
     */
    public ListMcubeNebulaTasksResponse listMcubeNebulaTasks(ListMcubeNebulaTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMcubeNebulaTasksWithOptions(request, runtime);
    }

    /**
     * @param request ListMcubeUpgradePackagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMcubeUpgradePackagesResponse
     */
    public ListMcubeUpgradePackagesResponse listMcubeUpgradePackagesWithOptions(ListMcubeUpgradePackagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMcubeUpgradePackages"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMcubeUpgradePackagesResponse());
    }

    /**
     * @param request ListMcubeUpgradePackagesRequest
     * @return ListMcubeUpgradePackagesResponse
     */
    public ListMcubeUpgradePackagesResponse listMcubeUpgradePackages(ListMcubeUpgradePackagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMcubeUpgradePackagesWithOptions(request, runtime);
    }

    /**
     * @param request ListMcubeUpgradeTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMcubeUpgradeTasksResponse
     */
    public ListMcubeUpgradeTasksResponse listMcubeUpgradeTasksWithOptions(ListMcubeUpgradeTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageId)) {
            body.put("PackageId", request.packageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMcubeUpgradeTasks"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMcubeUpgradeTasksResponse());
    }

    /**
     * @param request ListMcubeUpgradeTasksRequest
     * @return ListMcubeUpgradeTasksResponse
     */
    public ListMcubeUpgradeTasksResponse listMcubeUpgradeTasks(ListMcubeUpgradeTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMcubeUpgradeTasksWithOptions(request, runtime);
    }

    /**
     * @param request ListMcubeWhitelistsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMcubeWhitelistsResponse
     */
    public ListMcubeWhitelistsResponse listMcubeWhitelistsWithOptions(ListMcubeWhitelistsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelistName)) {
            body.put("WhitelistName", request.whitelistName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMcubeWhitelists"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMcubeWhitelistsResponse());
    }

    /**
     * @param request ListMcubeWhitelistsRequest
     * @return ListMcubeWhitelistsResponse
     */
    public ListMcubeWhitelistsResponse listMcubeWhitelists(ListMcubeWhitelistsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMcubeWhitelistsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询模版列表</p>
     * 
     * @param request ListTemplatePageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTemplatePageResponse
     */
    public ListTemplatePageResponse listTemplatePageWithOptions(ListTemplatePageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTemplatePage"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTemplatePageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询模版列表</p>
     * 
     * @param request ListTemplatePageRequest
     * @return ListTemplatePageResponse
     */
    public ListTemplatePageResponse listTemplatePage(ListTemplatePageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTemplatePageWithOptions(request, runtime);
    }

    /**
     * @param tmpReq PushBroadcastRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushBroadcastResponse
     */
    public PushBroadcastResponse pushBroadcastWithOptions(PushBroadcastRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PushBroadcastShrinkRequest request = new PushBroadcastShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notifyLevel)) {
            request.notifyLevelShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notifyLevel, "NotifyLevel", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.thirdChannelCategory)) {
            request.thirdChannelCategoryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.thirdChannelCategory, "ThirdChannelCategory", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidChannel)) {
            body.put("AndroidChannel", request.androidChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindEndTime)) {
            body.put("BindEndTime", request.bindEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindStartTime)) {
            body.put("BindStartTime", request.bindStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classification)) {
            body.put("Classification", request.classification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryType)) {
            body.put("DeliveryType", request.deliveryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiredSeconds)) {
            body.put("ExpiredSeconds", request.expiredSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendedParams)) {
            body.put("ExtendedParams", request.extendedParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.miChannelId)) {
            body.put("MiChannelId", request.miChannelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msgkey)) {
            body.put("Msgkey", request.msgkey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyLevelShrink)) {
            body.put("NotifyLevel", request.notifyLevelShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyType)) {
            body.put("NotifyType", request.notifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushAction)) {
            body.put("PushAction", request.pushAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushStatus)) {
            body.put("PushStatus", request.pushStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.silent)) {
            body.put("Silent", request.silent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyContent)) {
            body.put("StrategyContent", request.strategyContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyType)) {
            body.put("StrategyType", request.strategyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateKeyValue)) {
            body.put("TemplateKeyValue", request.templateKeyValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            body.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdChannelCategoryShrink)) {
            body.put("ThirdChannelCategory", request.thirdChannelCategoryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeMode)) {
            body.put("TimeMode", request.timeMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transparentMessagePayload)) {
            body.put("TransparentMessagePayload", request.transparentMessagePayload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transparentMessageUrgency)) {
            body.put("TransparentMessageUrgency", request.transparentMessageUrgency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unBindEndTime)) {
            body.put("UnBindEndTime", request.unBindEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unBindPeriod)) {
            body.put("UnBindPeriod", request.unBindPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unBindStartTime)) {
            body.put("UnBindStartTime", request.unBindStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushBroadcast"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushBroadcastResponse());
    }

    /**
     * @param request PushBroadcastRequest
     * @return PushBroadcastResponse
     */
    public PushBroadcastResponse pushBroadcast(PushBroadcastRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushBroadcastWithOptions(request, runtime);
    }

    /**
     * @param tmpReq PushMultipleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushMultipleResponse
     */
    public PushMultipleResponse pushMultipleWithOptions(PushMultipleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PushMultipleShrinkRequest request = new PushMultipleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notifyLevel)) {
            request.notifyLevelShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notifyLevel, "NotifyLevel", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.thirdChannelCategory)) {
            request.thirdChannelCategoryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.thirdChannelCategory, "ThirdChannelCategory", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activityContentState)) {
            body.put("ActivityContentState", request.activityContentState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.activityEvent)) {
            body.put("ActivityEvent", request.activityEvent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classification)) {
            body.put("Classification", request.classification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryType)) {
            body.put("DeliveryType", request.deliveryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dismissalDate)) {
            body.put("DismissalDate", request.dismissalDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiredSeconds)) {
            body.put("ExpiredSeconds", request.expiredSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendedParams)) {
            body.put("ExtendedParams", request.extendedParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.miChannelId)) {
            body.put("MiChannelId", request.miChannelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyLevelShrink)) {
            body.put("NotifyLevel", request.notifyLevelShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyType)) {
            body.put("NotifyType", request.notifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushAction)) {
            body.put("PushAction", request.pushAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.silent)) {
            body.put("Silent", request.silent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyContent)) {
            body.put("StrategyContent", request.strategyContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyType)) {
            body.put("StrategyType", request.strategyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetMsg)) {
            body.put("TargetMsg", request.targetMsg);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            body.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdChannelCategoryShrink)) {
            body.put("ThirdChannelCategory", request.thirdChannelCategoryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transparentMessagePayload)) {
            body.put("TransparentMessagePayload", request.transparentMessagePayload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transparentMessageUrgency)) {
            body.put("TransparentMessageUrgency", request.transparentMessageUrgency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushMultiple"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushMultipleResponse());
    }

    /**
     * @param request PushMultipleRequest
     * @return PushMultipleResponse
     */
    public PushMultipleResponse pushMultiple(PushMultipleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushMultipleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询设备状态信息</p>
     * 
     * @param request PushQueryDeviceStateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushQueryDeviceStateResponse
     */
    public PushQueryDeviceStateResponse pushQueryDeviceStateWithOptions(PushQueryDeviceStateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            body.put("Target", request.target);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            body.put("TargetType", request.targetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushQueryDeviceState"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushQueryDeviceStateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询设备状态信息</p>
     * 
     * @param request PushQueryDeviceStateRequest
     * @return PushQueryDeviceStateResponse
     */
    public PushQueryDeviceStateResponse pushQueryDeviceState(PushQueryDeviceStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushQueryDeviceStateWithOptions(request, runtime);
    }

    /**
     * @param tmpReq PushSimpleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushSimpleResponse
     */
    public PushSimpleResponse pushSimpleWithOptions(PushSimpleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PushSimpleShrinkRequest request = new PushSimpleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notifyLevel)) {
            request.notifyLevelShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notifyLevel, "NotifyLevel", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.thirdChannelCategory)) {
            request.thirdChannelCategoryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.thirdChannelCategory, "ThirdChannelCategory", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activityContentState)) {
            body.put("ActivityContentState", request.activityContentState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.activityEvent)) {
            body.put("ActivityEvent", request.activityEvent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classification)) {
            body.put("Classification", request.classification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryType)) {
            body.put("DeliveryType", request.deliveryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dismissalDate)) {
            body.put("DismissalDate", request.dismissalDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiredSeconds)) {
            body.put("ExpiredSeconds", request.expiredSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendedParams)) {
            body.put("ExtendedParams", request.extendedParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iconUrls)) {
            body.put("IconUrls", request.iconUrls);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrls)) {
            body.put("ImageUrls", request.imageUrls);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.miChannelId)) {
            body.put("MiChannelId", request.miChannelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyLevelShrink)) {
            body.put("NotifyLevel", request.notifyLevelShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyType)) {
            body.put("NotifyType", request.notifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushAction)) {
            body.put("PushAction", request.pushAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushStyle)) {
            body.put("PushStyle", request.pushStyle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.silent)) {
            body.put("Silent", request.silent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyContent)) {
            body.put("StrategyContent", request.strategyContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyType)) {
            body.put("StrategyType", request.strategyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetMsgkey)) {
            body.put("TargetMsgkey", request.targetMsgkey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdChannelCategoryShrink)) {
            body.put("ThirdChannelCategory", request.thirdChannelCategoryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transparentMessagePayload)) {
            body.put("TransparentMessagePayload", request.transparentMessagePayload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transparentMessageUrgency)) {
            body.put("TransparentMessageUrgency", request.transparentMessageUrgency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uri)) {
            body.put("Uri", request.uri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushSimple"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushSimpleResponse());
    }

    /**
     * @param request PushSimpleRequest
     * @return PushSimpleResponse
     */
    public PushSimpleResponse pushSimple(PushSimpleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushSimpleWithOptions(request, runtime);
    }

    /**
     * @param tmpReq PushTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushTemplateResponse
     */
    public PushTemplateResponse pushTemplateWithOptions(PushTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PushTemplateShrinkRequest request = new PushTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notifyLevel)) {
            request.notifyLevelShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notifyLevel, "NotifyLevel", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.thirdChannelCategory)) {
            request.thirdChannelCategoryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.thirdChannelCategory, "ThirdChannelCategory", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activityContentState)) {
            body.put("ActivityContentState", request.activityContentState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.activityEvent)) {
            body.put("ActivityEvent", request.activityEvent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classification)) {
            body.put("Classification", request.classification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryType)) {
            body.put("DeliveryType", request.deliveryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dismissalDate)) {
            body.put("DismissalDate", request.dismissalDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiredSeconds)) {
            body.put("ExpiredSeconds", request.expiredSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendedParams)) {
            body.put("ExtendedParams", request.extendedParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.miChannelId)) {
            body.put("MiChannelId", request.miChannelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyLevelShrink)) {
            body.put("NotifyLevel", request.notifyLevelShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyType)) {
            body.put("NotifyType", request.notifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushAction)) {
            body.put("PushAction", request.pushAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.silent)) {
            body.put("Silent", request.silent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyContent)) {
            body.put("StrategyContent", request.strategyContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyType)) {
            body.put("StrategyType", request.strategyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetMsgkey)) {
            body.put("TargetMsgkey", request.targetMsgkey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateKeyValue)) {
            body.put("TemplateKeyValue", request.templateKeyValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            body.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdChannelCategoryShrink)) {
            body.put("ThirdChannelCategory", request.thirdChannelCategoryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transparentMessagePayload)) {
            body.put("TransparentMessagePayload", request.transparentMessagePayload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transparentMessageUrgency)) {
            body.put("TransparentMessageUrgency", request.transparentMessageUrgency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushTemplate"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushTemplateResponse());
    }

    /**
     * @param request PushTemplateRequest
     * @return PushTemplateResponse
     */
    public PushTemplateResponse pushTemplate(PushTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushTemplateWithOptions(request, runtime);
    }

    /**
     * @param request QueryMcubeMiniPackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMcubeMiniPackageResponse
     */
    public QueryMcubeMiniPackageResponse queryMcubeMiniPackageWithOptions(QueryMcubeMiniPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.h5Id)) {
            body.put("H5Id", request.h5Id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMcubeMiniPackage"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMcubeMiniPackageResponse());
    }

    /**
     * @param request QueryMcubeMiniPackageRequest
     * @return QueryMcubeMiniPackageResponse
     */
    public QueryMcubeMiniPackageResponse queryMcubeMiniPackage(QueryMcubeMiniPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMcubeMiniPackageWithOptions(request, runtime);
    }

    /**
     * @param request QueryMcubeMiniTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMcubeMiniTaskResponse
     */
    public QueryMcubeMiniTaskResponse queryMcubeMiniTaskWithOptions(QueryMcubeMiniTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMcubeMiniTask"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMcubeMiniTaskResponse());
    }

    /**
     * @param request QueryMcubeMiniTaskRequest
     * @return QueryMcubeMiniTaskResponse
     */
    public QueryMcubeMiniTaskResponse queryMcubeMiniTask(QueryMcubeMiniTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMcubeMiniTaskWithOptions(request, runtime);
    }

    /**
     * @param request QueryMcubeVhostRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMcubeVhostResponse
     */
    public QueryMcubeVhostResponse queryMcubeVhostWithOptions(QueryMcubeVhostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMcubeVhost"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMcubeVhostResponse());
    }

    /**
     * @param request QueryMcubeVhostRequest
     * @return QueryMcubeVhostResponse
     */
    public QueryMcubeVhostResponse queryMcubeVhost(QueryMcubeVhostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMcubeVhostWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询定时任务列表</p>
     * 
     * @param request QueryMpsSchedulerListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMpsSchedulerListResponse
     */
    public QueryMpsSchedulerListResponse queryMpsSchedulerListWithOptions(QueryMpsSchedulerListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniqueId)) {
            body.put("UniqueId", request.uniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMpsSchedulerList"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMpsSchedulerListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询定时任务列表</p>
     * 
     * @param request QueryMpsSchedulerListRequest
     * @return QueryMpsSchedulerListResponse
     */
    public QueryMpsSchedulerListResponse queryMpsSchedulerList(QueryMpsSchedulerListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMpsSchedulerListWithOptions(request, runtime);
    }

    /**
     * @param request QueryPushAnalysisCoreIndexRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPushAnalysisCoreIndexResponse
     */
    public QueryPushAnalysisCoreIndexResponse queryPushAnalysisCoreIndexWithOptions(QueryPushAnalysisCoreIndexRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            body.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            body.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPushAnalysisCoreIndex"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPushAnalysisCoreIndexResponse());
    }

    /**
     * @param request QueryPushAnalysisCoreIndexRequest
     * @return QueryPushAnalysisCoreIndexResponse
     */
    public QueryPushAnalysisCoreIndexResponse queryPushAnalysisCoreIndex(QueryPushAnalysisCoreIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPushAnalysisCoreIndexWithOptions(request, runtime);
    }

    /**
     * @param request QueryPushAnalysisTaskDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPushAnalysisTaskDetailResponse
     */
    public QueryPushAnalysisTaskDetailResponse queryPushAnalysisTaskDetailWithOptions(QueryPushAnalysisTaskDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPushAnalysisTaskDetail"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPushAnalysisTaskDetailResponse());
    }

    /**
     * @param request QueryPushAnalysisTaskDetailRequest
     * @return QueryPushAnalysisTaskDetailResponse
     */
    public QueryPushAnalysisTaskDetailResponse queryPushAnalysisTaskDetail(QueryPushAnalysisTaskDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPushAnalysisTaskDetailWithOptions(request, runtime);
    }

    /**
     * @param request QueryPushAnalysisTaskListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPushAnalysisTaskListResponse
     */
    public QueryPushAnalysisTaskListResponse queryPushAnalysisTaskListWithOptions(QueryPushAnalysisTaskListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPushAnalysisTaskList"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPushAnalysisTaskListResponse());
    }

    /**
     * @param request QueryPushAnalysisTaskListRequest
     * @return QueryPushAnalysisTaskListResponse
     */
    public QueryPushAnalysisTaskListResponse queryPushAnalysisTaskList(QueryPushAnalysisTaskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPushAnalysisTaskListWithOptions(request, runtime);
    }

    /**
     * @param request QueryPushSchedulerListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPushSchedulerListResponse
     */
    public QueryPushSchedulerListResponse queryPushSchedulerListWithOptions(QueryPushSchedulerListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniqueId)) {
            body.put("UniqueId", request.uniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPushSchedulerList"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPushSchedulerListResponse());
    }

    /**
     * @param request QueryPushSchedulerListRequest
     * @return QueryPushSchedulerListResponse
     */
    public QueryPushSchedulerListResponse queryPushSchedulerList(QueryPushSchedulerListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPushSchedulerListWithOptions(request, runtime);
    }

    /**
     * @param request RevokePushMessageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokePushMessageResponse
     */
    public RevokePushMessageResponse revokePushMessageWithOptions(RevokePushMessageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            body.put("MessageId", request.messageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            body.put("TargetId", request.targetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokePushMessage"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokePushMessageResponse());
    }

    /**
     * @param request RevokePushMessageRequest
     * @return RevokePushMessageResponse
     */
    public RevokePushMessageResponse revokePushMessage(RevokePushMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokePushMessageWithOptions(request, runtime);
    }

    /**
     * @param request RevokePushTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokePushTaskResponse
     */
    public RevokePushTaskResponse revokePushTaskWithOptions(RevokePushTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokePushTask"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokePushTaskResponse());
    }

    /**
     * @param request RevokePushTaskRequest
     * @return RevokePushTaskResponse
     */
    public RevokePushTaskResponse revokePushTask(RevokePushTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokePushTaskWithOptions(request, runtime);
    }

    /**
     * @param request UpdateMcubeWhitelistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMcubeWhitelistResponse
     */
    public UpdateMcubeWhitelistResponse updateMcubeWhitelistWithOptions(UpdateMcubeWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyIds)) {
            body.put("KeyIds", request.keyIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onexFlag)) {
            body.put("OnexFlag", request.onexFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossUrl)) {
            body.put("OssUrl", request.ossUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMcubeWhitelist"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMcubeWhitelistResponse());
    }

    /**
     * @param request UpdateMcubeWhitelistRequest
     * @return UpdateMcubeWhitelistResponse
     */
    public UpdateMcubeWhitelistResponse updateMcubeWhitelist(UpdateMcubeWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMcubeWhitelistWithOptions(request, runtime);
    }

    /**
     * @param request UploadMcubeMiniPackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadMcubeMiniPackageResponse
     */
    public UploadMcubeMiniPackageResponse uploadMcubeMiniPackageWithOptions(UploadMcubeMiniPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoInstall)) {
            body.put("AutoInstall", request.autoInstall);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVersionMax)) {
            body.put("ClientVersionMax", request.clientVersionMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVersionMin)) {
            body.put("ClientVersionMin", request.clientVersionMin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableKeepAlive)) {
            body.put("EnableKeepAlive", request.enableKeepAlive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableOptionMenu)) {
            body.put("EnableOptionMenu", request.enableOptionMenu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableTabBar)) {
            body.put("EnableTabBar", request.enableTabBar);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendInfo)) {
            body.put("ExtendInfo", request.extendInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.h5Id)) {
            body.put("H5Id", request.h5Id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.h5Name)) {
            body.put("H5Name", request.h5Name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.h5Version)) {
            body.put("H5Version", request.h5Version);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iconFileUrl)) {
            body.put("IconFileUrl", request.iconFileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.installType)) {
            body.put("InstallType", request.installType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mainUrl)) {
            body.put("MainUrl", request.mainUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onexFlag)) {
            body.put("OnexFlag", request.onexFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            body.put("PackageType", request.packageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            body.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceFileUrl)) {
            body.put("ResourceFileUrl", request.resourceFileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vhost)) {
            body.put("Vhost", request.vhost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadMcubeMiniPackage"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadMcubeMiniPackageResponse());
    }

    /**
     * @param request UploadMcubeMiniPackageRequest
     * @return UploadMcubeMiniPackageResponse
     */
    public UploadMcubeMiniPackageResponse uploadMcubeMiniPackage(UploadMcubeMiniPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadMcubeMiniPackageWithOptions(request, runtime);
    }

    /**
     * @param request UploadMcubeRsaKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadMcubeRsaKeyResponse
     */
    public UploadMcubeRsaKeyResponse uploadMcubeRsaKeyWithOptions(UploadMcubeRsaKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            body.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onexFlag)) {
            body.put("OnexFlag", request.onexFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadMcubeRsaKey"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadMcubeRsaKeyResponse());
    }

    /**
     * @param request UploadMcubeRsaKeyRequest
     * @return UploadMcubeRsaKeyResponse
     */
    public UploadMcubeRsaKeyResponse uploadMcubeRsaKey(UploadMcubeRsaKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadMcubeRsaKeyWithOptions(request, runtime);
    }
}
