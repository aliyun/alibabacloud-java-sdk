// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028;

import com.aliyun.tea.*;
import com.aliyun.mpaas20201028.models.*;

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
     * @param request AddMdsMiniConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddMdsMiniConfigResponse
     */
    public AddMdsMiniConfigResponse addMdsMiniConfigWithOptions(AddMdsMiniConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpaasMappcenterMiniConfigAddJsonStr)) {
            body.put("MpaasMappcenterMiniConfigAddJsonStr", request.mpaasMappcenterMiniConfigAddJsonStr);
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
            new TeaPair("action", "AddMdsMiniConfig"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddMdsMiniConfigResponse());
    }

    /**
     * @param request AddMdsMiniConfigRequest
     * @return AddMdsMiniConfigResponse
     */
    public AddMdsMiniConfigResponse addMdsMiniConfig(AddMdsMiniConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addMdsMiniConfigWithOptions(request, runtime);
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
     * @param request ChangeMdsCubeTaskStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeMdsCubeTaskStatusResponse
     */
    public ChangeMdsCubeTaskStatusResponse changeMdsCubeTaskStatusWithOptions(ChangeMdsCubeTaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskStatus)) {
            body.put("TaskStatus", request.taskStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateResourceId)) {
            body.put("TemplateResourceId", request.templateResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateTaskId)) {
            body.put("TemplateTaskId", request.templateTaskId);
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
            new TeaPair("action", "ChangeMdsCubeTaskStatus"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeMdsCubeTaskStatusResponse());
    }

    /**
     * @param request ChangeMdsCubeTaskStatusRequest
     * @return ChangeMdsCubeTaskStatusResponse
     */
    public ChangeMdsCubeTaskStatusResponse changeMdsCubeTaskStatus(ChangeMdsCubeTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeMdsCubeTaskStatusWithOptions(request, runtime);
    }

    /**
     * @param request CopyMcdpGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CopyMcdpGroupResponse
     */
    public CopyMcdpGroupResponse copyMcdpGroupWithOptions(CopyMcdpGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpaasMappcenterMcdpGroupCopyJsonStr)) {
            body.put("MpaasMappcenterMcdpGroupCopyJsonStr", request.mpaasMappcenterMcdpGroupCopyJsonStr);
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
            new TeaPair("action", "CopyMcdpGroup"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CopyMcdpGroupResponse());
    }

    /**
     * @param request CopyMcdpGroupRequest
     * @return CopyMcdpGroupResponse
     */
    public CopyMcdpGroupResponse copyMcdpGroup(CopyMcdpGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copyMcdpGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建短链</p>
     * 
     * @param request CreateLinkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLinkResponse
     */
    public CreateLinkResponse createLinkWithOptions(CreateLinkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cors)) {
            body.put("Cors", request.cors);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            body.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicfield)) {
            body.put("Dynamicfield", request.dynamicfield);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUrl)) {
            body.put("TargetUrl", request.targetUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLink"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLinkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建短链</p>
     * 
     * @param request CreateLinkRequest
     * @return CreateLinkResponse
     */
    public CreateLinkResponse createLink(CreateLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLinkWithOptions(request, runtime);
    }

    /**
     * @param request CreateMcdpGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMcdpGroupResponse
     */
    public CreateMcdpGroupResponse createMcdpGroupWithOptions(CreateMcdpGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpaasMappcenterMcdpGroupCreateJsonStr)) {
            body.put("MpaasMappcenterMcdpGroupCreateJsonStr", request.mpaasMappcenterMcdpGroupCreateJsonStr);
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
            new TeaPair("action", "CreateMcdpGroup"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMcdpGroupResponse());
    }

    /**
     * @param request CreateMcdpGroupRequest
     * @return CreateMcdpGroupResponse
     */
    public CreateMcdpGroupResponse createMcdpGroup(CreateMcdpGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMcdpGroupWithOptions(request, runtime);
    }

    /**
     * @param request CreateMcdpMaterialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMcdpMaterialResponse
     */
    public CreateMcdpMaterialResponse createMcdpMaterialWithOptions(CreateMcdpMaterialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpaasMappcenterMcdpMaterialCreateJsonStr)) {
            body.put("MpaasMappcenterMcdpMaterialCreateJsonStr", request.mpaasMappcenterMcdpMaterialCreateJsonStr);
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
            new TeaPair("action", "CreateMcdpMaterial"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMcdpMaterialResponse());
    }

    /**
     * @param request CreateMcdpMaterialRequest
     * @return CreateMcdpMaterialResponse
     */
    public CreateMcdpMaterialResponse createMcdpMaterial(CreateMcdpMaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMcdpMaterialWithOptions(request, runtime);
    }

    /**
     * @param request CreateMcdpZoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMcdpZoneResponse
     */
    public CreateMcdpZoneResponse createMcdpZoneWithOptions(CreateMcdpZoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpaasMappcenterMcdpZoneCreateJsonStr)) {
            body.put("MpaasMappcenterMcdpZoneCreateJsonStr", request.mpaasMappcenterMcdpZoneCreateJsonStr);
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
            new TeaPair("action", "CreateMcdpZone"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMcdpZoneResponse());
    }

    /**
     * @param request CreateMcdpZoneRequest
     * @return CreateMcdpZoneResponse
     */
    public CreateMcdpZoneResponse createMcdpZone(CreateMcdpZoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMcdpZoneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建热修复资源</p>
     * 
     * @param request CreateMcubeHotpatchResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMcubeHotpatchResourceResponse
     */
    public CreateMcubeHotpatchResourceResponse createMcubeHotpatchResourceWithOptions(CreateMcubeHotpatchResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            body.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fixDesc)) {
            body.put("FixDesc", request.fixDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onexFlag)) {
            body.put("OnexFlag", request.onexFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            body.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersion)) {
            body.put("ProductVersion", request.productVersion);
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
            new TeaPair("action", "CreateMcubeHotpatchResource"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMcubeHotpatchResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建热修复资源</p>
     * 
     * @param request CreateMcubeHotpatchResourceRequest
     * @return CreateMcubeHotpatchResourceResponse
     */
    public CreateMcubeHotpatchResourceResponse createMcubeHotpatchResource(CreateMcubeHotpatchResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMcubeHotpatchResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建热修复回滚任务</p>
     * 
     * @param request CreateMcubeHotpatchRollbackTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMcubeHotpatchRollbackTaskResponse
     */
    public CreateMcubeHotpatchRollbackTaskResponse createMcubeHotpatchRollbackTaskWithOptions(CreateMcubeHotpatchRollbackTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersion)) {
            body.put("ProductVersion", request.productVersion);
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
            new TeaPair("action", "CreateMcubeHotpatchRollbackTask"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMcubeHotpatchRollbackTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建热修复回滚任务</p>
     * 
     * @param request CreateMcubeHotpatchRollbackTaskRequest
     * @return CreateMcubeHotpatchRollbackTaskResponse
     */
    public CreateMcubeHotpatchRollbackTaskResponse createMcubeHotpatchRollbackTask(CreateMcubeHotpatchRollbackTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMcubeHotpatchRollbackTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建热修复发布任务</p>
     * 
     * @param request CreateMcubeHotpatchTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMcubeHotpatchTaskResponse
     */
    public CreateMcubeHotpatchTaskResponse createMcubeHotpatchTaskWithOptions(CreateMcubeHotpatchTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            body.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishMode)) {
            body.put("PublishMode", request.publishMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishType)) {
            body.put("PublishType", request.publishType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncMode)) {
            body.put("SyncMode", request.syncMode);
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
            new TeaPair("action", "CreateMcubeHotpatchTask"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMcubeHotpatchTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建热修复发布任务</p>
     * 
     * @param request CreateMcubeHotpatchTaskRequest
     * @return CreateMcubeHotpatchTaskResponse
     */
    public CreateMcubeHotpatchTaskResponse createMcubeHotpatchTask(CreateMcubeHotpatchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMcubeHotpatchTaskWithOptions(request, runtime);
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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

        if (!com.aliyun.teautil.Common.isUnset(request.harmonyLabel)) {
            body.put("HarmonyLabel", request.harmonyLabel);
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

        if (!com.aliyun.teautil.Common.isUnset(request.largeIconUrl)) {
            body.put("LargeIconUrl", request.largeIconUrl);
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
     * @param request CreateMdsCubeResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMdsCubeResourceResponse
     */
    public CreateMdsCubeResourceResponse createMdsCubeResourceWithOptions(CreateMdsCubeResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidMaxVersion)) {
            body.put("AndroidMaxVersion", request.androidMaxVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidMinVersion)) {
            body.put("AndroidMinVersion", request.androidMinVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendInfo)) {
            body.put("ExtendInfo", request.extendInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            body.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iosMaxVersion)) {
            body.put("IosMaxVersion", request.iosMaxVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iosMinVersion)) {
            body.put("IosMinVersion", request.iosMinVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mockDataUrl)) {
            body.put("MockDataUrl", request.mockDataUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onexFlag)) {
            body.put("OnexFlag", request.onexFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            body.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previewPictureUrl)) {
            body.put("PreviewPictureUrl", request.previewPictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateResourceDesc)) {
            body.put("TemplateResourceDesc", request.templateResourceDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateResourceVersion)) {
            body.put("TemplateResourceVersion", request.templateResourceVersion);
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
            new TeaPair("action", "CreateMdsCubeResource"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMdsCubeResourceResponse());
    }

    /**
     * @param request CreateMdsCubeResourceRequest
     * @return CreateMdsCubeResourceResponse
     */
    public CreateMdsCubeResourceResponse createMdsCubeResource(CreateMdsCubeResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMdsCubeResourceWithOptions(request, runtime);
    }

    /**
     * @param request CreateMdsCubeTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMdsCubeTaskResponse
     */
    public CreateMdsCubeTaskResponse createMdsCubeTaskWithOptions(CreateMdsCubeTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.publishMode)) {
            body.put("PublishMode", request.publishMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishType)) {
            body.put("PublishType", request.publishType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskDesc)) {
            body.put("TaskDesc", request.taskDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateResourceId)) {
            body.put("TemplateResourceId", request.templateResourceId);
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
            new TeaPair("action", "CreateMdsCubeTask"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMdsCubeTaskResponse());
    }

    /**
     * @param request CreateMdsCubeTaskRequest
     * @return CreateMdsCubeTaskResponse
     */
    public CreateMdsCubeTaskResponse createMdsCubeTask(CreateMdsCubeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMdsCubeTaskWithOptions(request, runtime);
    }

    /**
     * @param request CreateMdsCubeTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMdsCubeTemplateResponse
     */
    public CreateMdsCubeTemplateResponse createMdsCubeTemplateWithOptions(CreateMdsCubeTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateDesc)) {
            body.put("TemplateDesc", request.templateDesc);
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
            new TeaPair("action", "CreateMdsCubeTemplate"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMdsCubeTemplateResponse());
    }

    /**
     * @param request CreateMdsCubeTemplateRequest
     * @return CreateMdsCubeTemplateResponse
     */
    public CreateMdsCubeTemplateResponse createMdsCubeTemplate(CreateMdsCubeTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMdsCubeTemplateWithOptions(request, runtime);
    }

    /**
     * @param request CreateMdsMiniprogramTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMdsMiniprogramTaskResponse
     */
    public CreateMdsMiniprogramTaskResponse createMdsMiniprogramTaskWithOptions(CreateMdsMiniprogramTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.h5Id)) {
            body.put("H5Id", request.h5Id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
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

        if (!com.aliyun.teautil.Common.isUnset(request.syncMode)) {
            body.put("SyncMode", request.syncMode);
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
            new TeaPair("action", "CreateMdsMiniprogramTask"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMdsMiniprogramTaskResponse());
    }

    /**
     * @param request CreateMdsMiniprogramTaskRequest
     * @return CreateMdsMiniprogramTaskResponse
     */
    public CreateMdsMiniprogramTaskResponse createMdsMiniprogramTask(CreateMdsMiniprogramTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMdsMiniprogramTaskWithOptions(request, runtime);
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
     * @param request DeleteMcdpAimRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMcdpAimResponse
     */
    public DeleteMcdpAimResponse deleteMcdpAimWithOptions(DeleteMcdpAimRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpaasMappcenterMcdpAimDeleteJsonStr)) {
            body.put("MpaasMappcenterMcdpAimDeleteJsonStr", request.mpaasMappcenterMcdpAimDeleteJsonStr);
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
            new TeaPair("action", "DeleteMcdpAim"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMcdpAimResponse());
    }

    /**
     * @param request DeleteMcdpAimRequest
     * @return DeleteMcdpAimResponse
     */
    public DeleteMcdpAimResponse deleteMcdpAim(DeleteMcdpAimRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMcdpAimWithOptions(request, runtime);
    }

    /**
     * @param request DeleteMcdpCrowdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMcdpCrowdResponse
     */
    public DeleteMcdpCrowdResponse deleteMcdpCrowdWithOptions(DeleteMcdpCrowdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpaasMappcenterMcdpCrowdDeleteJsonStr)) {
            body.put("MpaasMappcenterMcdpCrowdDeleteJsonStr", request.mpaasMappcenterMcdpCrowdDeleteJsonStr);
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
            new TeaPair("action", "DeleteMcdpCrowd"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMcdpCrowdResponse());
    }

    /**
     * @param request DeleteMcdpCrowdRequest
     * @return DeleteMcdpCrowdResponse
     */
    public DeleteMcdpCrowdResponse deleteMcdpCrowd(DeleteMcdpCrowdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMcdpCrowdWithOptions(request, runtime);
    }

    /**
     * @param request DeleteMcdpZoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMcdpZoneResponse
     */
    public DeleteMcdpZoneResponse deleteMcdpZoneWithOptions(DeleteMcdpZoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpaasMappcenterMcdpZoneDeleteJsonStr)) {
            body.put("MpaasMappcenterMcdpZoneDeleteJsonStr", request.mpaasMappcenterMcdpZoneDeleteJsonStr);
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
            new TeaPair("action", "DeleteMcdpZone"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMcdpZoneResponse());
    }

    /**
     * @param request DeleteMcdpZoneRequest
     * @return DeleteMcdpZoneResponse
     */
    public DeleteMcdpZoneResponse deleteMcdpZone(DeleteMcdpZoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMcdpZoneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除热修复资源包</p>
     * 
     * @param request DeleteMcubeHotpatchResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMcubeHotpatchResourceResponse
     */
    public DeleteMcubeHotpatchResourceResponse deleteMcubeHotpatchResourceWithOptions(DeleteMcubeHotpatchResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            body.put("AppCode", request.appCode);
        }

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
            new TeaPair("action", "DeleteMcubeHotpatchResource"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMcubeHotpatchResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除热修复资源包</p>
     * 
     * @param request DeleteMcubeHotpatchResourceRequest
     * @return DeleteMcubeHotpatchResourceResponse
     */
    public DeleteMcubeHotpatchResourceResponse deleteMcubeHotpatchResource(DeleteMcubeHotpatchResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMcubeHotpatchResourceWithOptions(request, runtime);
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
     * @param request DeleteMdsCubeTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMdsCubeTemplateResponse
     */
    public DeleteMdsCubeTemplateResponse deleteMdsCubeTemplateWithOptions(DeleteMdsCubeTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
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
            new TeaPair("action", "DeleteMdsCubeTemplate"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMdsCubeTemplateResponse());
    }

    /**
     * @param request DeleteMdsCubeTemplateRequest
     * @return DeleteMdsCubeTemplateResponse
     */
    public DeleteMdsCubeTemplateResponse deleteMdsCubeTemplate(DeleteMdsCubeTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMdsCubeTemplateWithOptions(request, runtime);
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
     * @param request ExportMappCenterAppConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportMappCenterAppConfigResponse
     */
    public ExportMappCenterAppConfigResponse exportMappCenterAppConfigWithOptions(ExportMappCenterAppConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apkFileUrl)) {
            body.put("ApkFileUrl", request.apkFileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certRsaBase64)) {
            body.put("CertRsaBase64", request.certRsaBase64);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            body.put("Identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onexFlag)) {
            body.put("OnexFlag", request.onexFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemType)) {
            body.put("SystemType", request.systemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportMappCenterAppConfig"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportMappCenterAppConfigResponse());
    }

    /**
     * @param request ExportMappCenterAppConfigRequest
     * @return ExportMappCenterAppConfigResponse
     */
    public ExportMappCenterAppConfigResponse exportMappCenterAppConfig(ExportMappCenterAppConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportMappCenterAppConfigWithOptions(request, runtime);
    }

    /**
     * @param request GetFileTokenForUploadToMsaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFileTokenForUploadToMsaResponse
     */
    public GetFileTokenForUploadToMsaResponse getFileTokenForUploadToMsaWithOptions(GetFileTokenForUploadToMsaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetFileTokenForUploadToMsa"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFileTokenForUploadToMsaResponse());
    }

    /**
     * @param request GetFileTokenForUploadToMsaRequest
     * @return GetFileTokenForUploadToMsaResponse
     */
    public GetFileTokenForUploadToMsaResponse getFileTokenForUploadToMsa(GetFileTokenForUploadToMsaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFileTokenForUploadToMsaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看全部审核记录</p>
     * 
     * @param request GetGameReviewByStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGameReviewByStatusResponse
     */
    public GetGameReviewByStatusResponse getGameReviewByStatusWithOptions(GetGameReviewByStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.reviewStatus)) {
            body.put("ReviewStatus", request.reviewStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortMode)) {
            body.put("SortMode", request.sortMode);
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
            new TeaPair("action", "GetGameReviewByStatus"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGameReviewByStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看全部审核记录</p>
     * 
     * @param request GetGameReviewByStatusRequest
     * @return GetGameReviewByStatusResponse
     */
    public GetGameReviewByStatusResponse getGameReviewByStatus(GetGameReviewByStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGameReviewByStatusWithOptions(request, runtime);
    }

    /**
     * @param request GetLogUrlInMsaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLogUrlInMsaResponse
     */
    public GetLogUrlInMsaResponse getLogUrlInMsaWithOptions(GetLogUrlInMsaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetLogUrlInMsa"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLogUrlInMsaResponse());
    }

    /**
     * @param request GetLogUrlInMsaRequest
     * @return GetLogUrlInMsaResponse
     */
    public GetLogUrlInMsaResponse getLogUrlInMsa(GetLogUrlInMsaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLogUrlInMsaWithOptions(request, runtime);
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
     * @param request GetMdsMiniConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMdsMiniConfigResponse
     */
    public GetMdsMiniConfigResponse getMdsMiniConfigWithOptions(GetMdsMiniConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetMdsMiniConfig"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMdsMiniConfigResponse());
    }

    /**
     * @param request GetMdsMiniConfigRequest
     * @return GetMdsMiniConfigResponse
     */
    public GetMdsMiniConfigResponse getMdsMiniConfig(GetMdsMiniConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMdsMiniConfigWithOptions(request, runtime);
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
            new TeaPair("version", "2020-10-28"),
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
     * @param request GetUserAppDonwloadUrlInMsaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserAppDonwloadUrlInMsaResponse
     */
    public GetUserAppDonwloadUrlInMsaResponse getUserAppDonwloadUrlInMsaWithOptions(GetUserAppDonwloadUrlInMsaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetUserAppDonwloadUrlInMsa"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserAppDonwloadUrlInMsaResponse());
    }

    /**
     * @param request GetUserAppDonwloadUrlInMsaRequest
     * @return GetUserAppDonwloadUrlInMsaResponse
     */
    public GetUserAppDonwloadUrlInMsaResponse getUserAppDonwloadUrlInMsa(GetUserAppDonwloadUrlInMsaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserAppDonwloadUrlInMsaWithOptions(request, runtime);
    }

    /**
     * @param request GetUserAppEnhanceProcessInMsaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserAppEnhanceProcessInMsaResponse
     */
    public GetUserAppEnhanceProcessInMsaResponse getUserAppEnhanceProcessInMsaWithOptions(GetUserAppEnhanceProcessInMsaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetUserAppEnhanceProcessInMsa"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserAppEnhanceProcessInMsaResponse());
    }

    /**
     * @param request GetUserAppEnhanceProcessInMsaRequest
     * @return GetUserAppEnhanceProcessInMsaResponse
     */
    public GetUserAppEnhanceProcessInMsaResponse getUserAppEnhanceProcessInMsa(GetUserAppEnhanceProcessInMsaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserAppEnhanceProcessInMsaWithOptions(request, runtime);
    }

    /**
     * @param request GetUserAppUploadProcessInMsaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserAppUploadProcessInMsaResponse
     */
    public GetUserAppUploadProcessInMsaResponse getUserAppUploadProcessInMsaWithOptions(GetUserAppUploadProcessInMsaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetUserAppUploadProcessInMsa"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserAppUploadProcessInMsaResponse());
    }

    /**
     * @param request GetUserAppUploadProcessInMsaRequest
     * @return GetUserAppUploadProcessInMsaResponse
     */
    public GetUserAppUploadProcessInMsaResponse getUserAppUploadProcessInMsa(GetUserAppUploadProcessInMsaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserAppUploadProcessInMsaWithOptions(request, runtime);
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
            new TeaPair("version", "2020-10-28"),
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
     * @param request ListCubecardAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCubecardAppsResponse
     */
    public ListCubecardAppsResponse listCubecardAppsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCubecardApps"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCubecardAppsResponse());
    }

    /**
     * @return ListCubecardAppsResponse
     */
    public ListCubecardAppsResponse listCubecardApps() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCubecardAppsWithOptions(runtime);
    }

    /**
     * @param request ListMappCenterAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMappCenterAppsResponse
     */
    public ListMappCenterAppsResponse listMappCenterAppsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMappCenterApps"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMappCenterAppsResponse());
    }

    /**
     * @return ListMappCenterAppsResponse
     */
    public ListMappCenterAppsResponse listMappCenterApps() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMappCenterAppsWithOptions(runtime);
    }

    /**
     * @param request ListMappCenterWorkspacesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMappCenterWorkspacesResponse
     */
    public ListMappCenterWorkspacesResponse listMappCenterWorkspacesWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMappCenterWorkspaces"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMappCenterWorkspacesResponse());
    }

    /**
     * @return ListMappCenterWorkspacesResponse
     */
    public ListMappCenterWorkspacesResponse listMappCenterWorkspaces() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMappCenterWorkspacesWithOptions(runtime);
    }

    /**
     * @param request ListMcdpAimRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMcdpAimResponse
     */
    public ListMcdpAimResponse listMcdpAimWithOptions(ListMcdpAimRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emptyTag)) {
            body.put("EmptyTag", request.emptyTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            body.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            body.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            body.put("SortField", request.sortField);
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
            new TeaPair("action", "ListMcdpAim"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMcdpAimResponse());
    }

    /**
     * @param request ListMcdpAimRequest
     * @return ListMcdpAimResponse
     */
    public ListMcdpAimResponse listMcdpAim(ListMcdpAimRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMcdpAimWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询热修复资源包列表</p>
     * 
     * @param request ListMcubeHotpatchResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMcubeHotpatchResourcesResponse
     */
    public ListMcubeHotpatchResourcesResponse listMcubeHotpatchResourcesWithOptions(ListMcubeHotpatchResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListMcubeHotpatchResources"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMcubeHotpatchResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询热修复资源包列表</p>
     * 
     * @param request ListMcubeHotpatchResourcesRequest
     * @return ListMcubeHotpatchResourcesResponse
     */
    public ListMcubeHotpatchResourcesResponse listMcubeHotpatchResources(ListMcubeHotpatchResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMcubeHotpatchResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询热修复发布任务列表</p>
     * 
     * @param request ListMcubeHotpatchTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMcubeHotpatchTasksResponse
     */
    public ListMcubeHotpatchTasksResponse listMcubeHotpatchTasksWithOptions(ListMcubeHotpatchTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListMcubeHotpatchTasks"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMcubeHotpatchTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询热修复发布任务列表</p>
     * 
     * @param request ListMcubeHotpatchTasksRequest
     * @return ListMcubeHotpatchTasksResponse
     */
    public ListMcubeHotpatchTasksResponse listMcubeHotpatchTasks(ListMcubeHotpatchTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMcubeHotpatchTasksWithOptions(request, runtime);
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
     * @param request ListMdsCubeResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMdsCubeResourcesResponse
     */
    public ListMdsCubeResourcesResponse listMdsCubeResourcesWithOptions(ListMdsCubeResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.test)) {
            body.put("test", request.test);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMdsCubeResources"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMdsCubeResourcesResponse());
    }

    /**
     * @param request ListMdsCubeResourcesRequest
     * @return ListMdsCubeResourcesResponse
     */
    public ListMdsCubeResourcesResponse listMdsCubeResources(ListMdsCubeResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMdsCubeResourcesWithOptions(request, runtime);
    }

    /**
     * @param request ListMdsCubeTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMdsCubeTasksResponse
     */
    public ListMdsCubeTasksResponse listMdsCubeTasksWithOptions(ListMdsCubeTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.templateResourceId)) {
            body.put("TemplateResourceId", request.templateResourceId);
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
            new TeaPair("action", "ListMdsCubeTasks"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMdsCubeTasksResponse());
    }

    /**
     * @param request ListMdsCubeTasksRequest
     * @return ListMdsCubeTasksResponse
     */
    public ListMdsCubeTasksResponse listMdsCubeTasks(ListMdsCubeTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMdsCubeTasksWithOptions(request, runtime);
    }

    /**
     * @param request ListMdsCubeTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMdsCubeTemplatesResponse
     */
    public ListMdsCubeTemplatesResponse listMdsCubeTemplatesWithOptions(ListMdsCubeTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListMdsCubeTemplates"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMdsCubeTemplatesResponse());
    }

    /**
     * @param request ListMdsCubeTemplatesRequest
     * @return ListMdsCubeTemplatesResponse
     */
    public ListMdsCubeTemplatesResponse listMdsCubeTemplates(ListMdsCubeTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMdsCubeTemplatesWithOptions(request, runtime);
    }

    /**
     * @param request ListMgsApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMgsApiResponse
     */
    public ListMgsApiResponse listMgsApiWithOptions(ListMgsApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiStatus)) {
            body.put("ApiStatus", request.apiStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            body.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.format)) {
            body.put("Format", request.format);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            body.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needEncrypt)) {
            body.put("NeedEncrypt", request.needEncrypt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needEtag)) {
            body.put("NeedEtag", request.needEtag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needSign)) {
            body.put("NeedSign", request.needSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            body.put("OperationType", request.operationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optFuzzy)) {
            body.put("OptFuzzy", request.optFuzzy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            body.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sysId)) {
            body.put("SysId", request.sysId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sysName)) {
            body.put("SysName", request.sysName);
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
            new TeaPair("action", "ListMgsApi"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMgsApiResponse());
    }

    /**
     * @param request ListMgsApiRequest
     * @return ListMgsApiResponse
     */
    public ListMgsApiResponse listMgsApi(ListMgsApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMgsApiWithOptions(request, runtime);
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
            new TeaPair("version", "2020-10-28"),
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
     * <b>summary</b> : 
     * <p>OCR通用接口</p>
     * 
     * @param request MTRSOCRServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MTRSOCRServiceResponse
     */
    public MTRSOCRServiceResponse mTRSOCRServiceWithOptions(MTRSOCRServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageRaw)) {
            body.put("ImageRaw", request.imageRaw);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            body.put("Mask", request.mask);
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
            new TeaPair("action", "MTRSOCRService"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MTRSOCRServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>OCR通用接口</p>
     * 
     * @param request MTRSOCRServiceRequest
     * @return MTRSOCRServiceResponse
     */
    public MTRSOCRServiceResponse mTRSOCRService(MTRSOCRServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.mTRSOCRServiceWithOptions(request, runtime);
    }

    /**
     * @param request PushBindRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushBindResponse
     */
    public PushBindResponse pushBindWithOptions(PushBindRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryToken)) {
            body.put("DeliveryToken", request.deliveryToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            body.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushBind"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushBindResponse());
    }

    /**
     * @param request PushBindRequest
     * @return PushBindResponse
     */
    public PushBindResponse pushBind(PushBindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushBindWithOptions(request, runtime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.bindPeriod)) {
            body.put("BindPeriod", request.bindPeriod);
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
     * @param request PushReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushReportResponse
     */
    public PushReportResponse pushReportWithOptions(PushReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            body.put("AppVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            body.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectType)) {
            body.put("ConnectType", request.connectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryToken)) {
            body.put("DeliveryToken", request.deliveryToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imei)) {
            body.put("Imei", request.imei);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imsi)) {
            body.put("Imsi", request.imsi);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            body.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushVersion)) {
            body.put("PushVersion", request.pushVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdChannel)) {
            body.put("ThirdChannel", request.thirdChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdChannelDeviceToken)) {
            body.put("ThirdChannelDeviceToken", request.thirdChannelDeviceToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushReport"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushReportResponse());
    }

    /**
     * @param request PushReportRequest
     * @return PushReportResponse
     */
    public PushReportResponse pushReport(PushReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>极简推送</p>
     * 
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

        if (!com.aliyun.teautil.Common.isUnset(request.smsSignName)) {
            body.put("SmsSignName", request.smsSignName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsStrategy)) {
            body.put("SmsStrategy", request.smsStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsTemplateCode)) {
            body.put("SmsTemplateCode", request.smsTemplateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsTemplateParam)) {
            body.put("SmsTemplateParam", request.smsTemplateParam);
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
            new TeaPair("version", "2020-10-28"),
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
     * <b>summary</b> : 
     * <p>极简推送</p>
     * 
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

        if (!com.aliyun.teautil.Common.isUnset(request.smsSignName)) {
            body.put("SmsSignName", request.smsSignName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsStrategy)) {
            body.put("SmsStrategy", request.smsStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsTemplateCode)) {
            body.put("SmsTemplateCode", request.smsTemplateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsTemplateParam)) {
            body.put("SmsTemplateParam", request.smsTemplateParam);
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
            new TeaPair("version", "2020-10-28"),
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
     * @param request PushUnBindRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushUnBindResponse
     */
    public PushUnBindResponse pushUnBindWithOptions(PushUnBindRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryToken)) {
            body.put("DeliveryToken", request.deliveryToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushUnBind"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushUnBindResponse());
    }

    /**
     * @param request PushUnBindRequest
     * @return PushUnBindResponse
     */
    public PushUnBindResponse pushUnBind(PushUnBindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushUnBindWithOptions(request, runtime);
    }

    /**
     * @param request QueryCubecardFiletokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCubecardFiletokenResponse
     */
    public QueryCubecardFiletokenResponse queryCubecardFiletokenWithOptions(QueryCubecardFiletokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "QueryCubecardFiletoken"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCubecardFiletokenResponse());
    }

    /**
     * @param request QueryCubecardFiletokenRequest
     * @return QueryCubecardFiletokenResponse
     */
    public QueryCubecardFiletokenResponse queryCubecardFiletoken(QueryCubecardFiletokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCubecardFiletokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Device+服务的</p>
     * 
     * @param request QueryInfoFromMdpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryInfoFromMdpResponse
     */
    public QueryInfoFromMdpResponse queryInfoFromMdpWithOptions(QueryInfoFromMdpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            body.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobileMd5)) {
            body.put("MobileMd5", request.mobileMd5);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobileSha256)) {
            body.put("MobileSha256", request.mobileSha256);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobileSm3)) {
            body.put("MobileSm3", request.mobileSm3);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskScene)) {
            body.put("RiskScene", request.riskScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryInfoFromMdp"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryInfoFromMdpResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Device+服务的</p>
     * 
     * @param request QueryInfoFromMdpRequest
     * @return QueryInfoFromMdpResponse
     */
    public QueryInfoFromMdpResponse queryInfoFromMdp(QueryInfoFromMdpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryInfoFromMdpWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询短链</p>
     * 
     * @param request QueryLinkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryLinkResponse
     */
    public QueryLinkResponse queryLinkWithOptions(QueryLinkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            body.put("Url", request.url);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryLink"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryLinkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询短链</p>
     * 
     * @param request QueryLinkRequest
     * @return QueryLinkResponse
     */
    public QueryLinkResponse queryLink(QueryLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryLinkWithOptions(request, runtime);
    }

    /**
     * @param request QueryMappCenterAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMappCenterAppResponse
     */
    public QueryMappCenterAppResponse queryMappCenterAppWithOptions(QueryMappCenterAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMappCenterApp"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMappCenterAppResponse());
    }

    /**
     * @param request QueryMappCenterAppRequest
     * @return QueryMappCenterAppResponse
     */
    public QueryMappCenterAppResponse queryMappCenterApp(QueryMappCenterAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMappCenterAppWithOptions(request, runtime);
    }

    /**
     * @param request QueryMcdpAimRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMcdpAimResponse
     */
    public QueryMcdpAimResponse queryMcdpAimWithOptions(QueryMcdpAimRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "QueryMcdpAim"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMcdpAimResponse());
    }

    /**
     * @param request QueryMcdpAimRequest
     * @return QueryMcdpAimResponse
     */
    public QueryMcdpAimResponse queryMcdpAim(QueryMcdpAimRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMcdpAimWithOptions(request, runtime);
    }

    /**
     * @param request QueryMcdpZoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMcdpZoneResponse
     */
    public QueryMcdpZoneResponse queryMcdpZoneWithOptions(QueryMcdpZoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "QueryMcdpZone"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMcdpZoneResponse());
    }

    /**
     * @param request QueryMcdpZoneRequest
     * @return QueryMcdpZoneResponse
     */
    public QueryMcdpZoneResponse queryMcdpZone(QueryMcdpZoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMcdpZoneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询热修复发布任务详情</p>
     * 
     * @param request QueryMcubeHotpatchTaskDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMcubeHotpatchTaskDetailResponse
     */
    public QueryMcubeHotpatchTaskDetailResponse queryMcubeHotpatchTaskDetailWithOptions(QueryMcubeHotpatchTaskDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "QueryMcubeHotpatchTaskDetail"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMcubeHotpatchTaskDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询热修复发布任务详情</p>
     * 
     * @param request QueryMcubeHotpatchTaskDetailRequest
     * @return QueryMcubeHotpatchTaskDetailResponse
     */
    public QueryMcubeHotpatchTaskDetailResponse queryMcubeHotpatchTaskDetail(QueryMcubeHotpatchTaskDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMcubeHotpatchTaskDetailWithOptions(request, runtime);
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
     * @param request QueryMdsUpgradeTaskDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMdsUpgradeTaskDetailResponse
     */
    public QueryMdsUpgradeTaskDetailResponse queryMdsUpgradeTaskDetailWithOptions(QueryMdsUpgradeTaskDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "QueryMdsUpgradeTaskDetail"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMdsUpgradeTaskDetailResponse());
    }

    /**
     * @param request QueryMdsUpgradeTaskDetailRequest
     * @return QueryMdsUpgradeTaskDetailResponse
     */
    public QueryMdsUpgradeTaskDetailResponse queryMdsUpgradeTaskDetail(QueryMdsUpgradeTaskDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMdsUpgradeTaskDetailWithOptions(request, runtime);
    }

    /**
     * @param request QueryMgsApipageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMgsApipageResponse
     */
    public QueryMgsApipageResponse queryMgsApipageWithOptions(QueryMgsApipageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiStatus)) {
            body.put("ApiStatus", request.apiStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            body.put("ApiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.format)) {
            body.put("Format", request.format);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            body.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needEncrypt)) {
            body.put("NeedEncrypt", request.needEncrypt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needEtag)) {
            body.put("NeedEtag", request.needEtag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needSign)) {
            body.put("NeedSign", request.needSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            body.put("OperationType", request.operationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optFuzzy)) {
            body.put("OptFuzzy", request.optFuzzy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            body.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sysId)) {
            body.put("SysId", request.sysId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sysName)) {
            body.put("SysName", request.sysName);
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
            new TeaPair("action", "QueryMgsApipage"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMgsApipageResponse());
    }

    /**
     * @param request QueryMgsApipageRequest
     * @return QueryMgsApipageResponse
     */
    public QueryMgsApipageResponse queryMgsApipage(QueryMgsApipageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMgsApipageWithOptions(request, runtime);
    }

    /**
     * @param request QueryMgsApirestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMgsApirestResponse
     */
    public QueryMgsApirestResponse queryMgsApirestWithOptions(QueryMgsApirestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.format)) {
            body.put("Format", request.format);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
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
            new TeaPair("action", "QueryMgsApirest"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMgsApirestResponse());
    }

    /**
     * @param request QueryMgsApirestRequest
     * @return QueryMgsApirestResponse
     */
    public QueryMgsApirestResponse queryMgsApirest(QueryMgsApirestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMgsApirestWithOptions(request, runtime);
    }

    /**
     * @param request QueryMgsTestreqbodyautogenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMgsTestreqbodyautogenResponse
     */
    public QueryMgsTestreqbodyautogenResponse queryMgsTestreqbodyautogenWithOptions(QueryMgsTestreqbodyautogenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.format)) {
            body.put("Format", request.format);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpaasMappcenterMgsTestreqbodyautogenQueryJsonStr)) {
            body.put("MpaasMappcenterMgsTestreqbodyautogenQueryJsonStr", request.mpaasMappcenterMgsTestreqbodyautogenQueryJsonStr);
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
            new TeaPair("action", "QueryMgsTestreqbodyautogen"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMgsTestreqbodyautogenResponse());
    }

    /**
     * @param request QueryMgsTestreqbodyautogenRequest
     * @return QueryMgsTestreqbodyautogenResponse
     */
    public QueryMgsTestreqbodyautogenResponse queryMgsTestreqbodyautogen(QueryMgsTestreqbodyautogenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMgsTestreqbodyautogenWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2020-10-28"),
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
     * @param request QueryMpsSchedulerListRequest
     * @return QueryMpsSchedulerListResponse
     */
    public QueryMpsSchedulerListResponse queryMpsSchedulerList(QueryMpsSchedulerListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMpsSchedulerListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询风险信息</p>
     * 
     * @param request QueryMscpRiskInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMscpRiskInfoResponse
     */
    public QueryMscpRiskInfoResponse queryMscpRiskInfoWithOptions(QueryMscpRiskInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apdidToken)) {
            body.put("ApdidToken", request.apdidToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminalType)) {
            body.put("TerminalType", request.terminalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMscpRiskInfo"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMscpRiskInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询风险信息</p>
     * 
     * @param request QueryMscpRiskInfoRequest
     * @return QueryMscpRiskInfoResponse
     */
    public QueryMscpRiskInfoResponse queryMscpRiskInfo(QueryMscpRiskInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMscpRiskInfoWithOptions(request, runtime);
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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
     * @param request RunMsaDiffRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunMsaDiffResponse
     */
    public RunMsaDiffResponse runMsaDiffWithOptions(RunMsaDiffRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpaasMappcenterMsaDiffRunJsonStr)) {
            body.put("MpaasMappcenterMsaDiffRunJsonStr", request.mpaasMappcenterMsaDiffRunJsonStr);
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
            new TeaPair("action", "RunMsaDiff"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunMsaDiffResponse());
    }

    /**
     * @param request RunMsaDiffRequest
     * @return RunMsaDiffResponse
     */
    public RunMsaDiffResponse runMsaDiff(RunMsaDiffRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runMsaDiffWithOptions(request, runtime);
    }

    /**
     * @param request SaveMgsApirestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveMgsApirestResponse
     */
    public SaveMgsApirestResponse saveMgsApirestWithOptions(SaveMgsApirestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mpaasMappcenterMgsApirestSaveJsonStr)) {
            body.put("MpaasMappcenterMgsApirestSaveJsonStr", request.mpaasMappcenterMgsApirestSaveJsonStr);
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
            new TeaPair("action", "SaveMgsApirest"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveMgsApirestResponse());
    }

    /**
     * @param request SaveMgsApirestRequest
     * @return SaveMgsApirestResponse
     */
    public SaveMgsApirestResponse saveMgsApirest(SaveMgsApirestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveMgsApirestWithOptions(request, runtime);
    }

    /**
     * @param request StartUserAppAsyncEnhanceInMsaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartUserAppAsyncEnhanceInMsaResponse
     */
    public StartUserAppAsyncEnhanceInMsaResponse startUserAppAsyncEnhanceInMsaWithOptions(StartUserAppAsyncEnhanceInMsaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newShieldConfig)) {
            query.put("NewShieldConfig", request.newShieldConfig);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apkProtector)) {
            body.put("ApkProtector", request.apkProtector);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetsFileList)) {
            body.put("AssetsFileList", request.assetsFileList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classes)) {
            body.put("Classes", request.classes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dalvikDebugger)) {
            body.put("DalvikDebugger", request.dalvikDebugger);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emulatorEnvironment)) {
            body.put("EmulatorEnvironment", request.emulatorEnvironment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.javaHook)) {
            body.put("JavaHook", request.javaHook);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memoryDump)) {
            body.put("MemoryDump", request.memoryDump);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nativeDebugger)) {
            body.put("NativeDebugger", request.nativeDebugger);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nativeHook)) {
            body.put("NativeHook", request.nativeHook);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageTampered)) {
            body.put("PackageTampered", request.packageTampered);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.root)) {
            body.put("Root", request.root);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runMode)) {
            body.put("RunMode", request.runMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.soFileList)) {
            body.put("SoFileList", request.soFileList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            body.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalSwitch)) {
            body.put("TotalSwitch", request.totalSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAShield)) {
            body.put("UseAShield", request.useAShield);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useYShield)) {
            body.put("UseYShield", request.useYShield);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartUserAppAsyncEnhanceInMsa"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartUserAppAsyncEnhanceInMsaResponse());
    }

    /**
     * @param request StartUserAppAsyncEnhanceInMsaRequest
     * @return StartUserAppAsyncEnhanceInMsaResponse
     */
    public StartUserAppAsyncEnhanceInMsaResponse startUserAppAsyncEnhanceInMsa(StartUserAppAsyncEnhanceInMsaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startUserAppAsyncEnhanceInMsaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新短链</p>
     * 
     * @param request UpdateLinkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLinkResponse
     */
    public UpdateLinkResponse updateLinkWithOptions(UpdateLinkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cors)) {
            body.put("Cors", request.cors);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            body.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicfield)) {
            body.put("Dynamicfield", request.dynamicfield);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUrl)) {
            body.put("TargetUrl", request.targetUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            body.put("Url", request.url);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLink"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLinkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新短链</p>
     * 
     * @param request UpdateLinkRequest
     * @return UpdateLinkResponse
     */
    public UpdateLinkResponse updateLink(UpdateLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLinkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新热修复发布任务状态</p>
     * 
     * @param request UpdateMcubeHotpatchTaskStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMcubeHotpatchTaskStatusResponse
     */
    public UpdateMcubeHotpatchTaskStatusResponse updateMcubeHotpatchTaskStatusWithOptions(UpdateMcubeHotpatchTaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "UpdateMcubeHotpatchTaskStatus"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMcubeHotpatchTaskStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新热修复发布任务状态</p>
     * 
     * @param request UpdateMcubeHotpatchTaskStatusRequest
     * @return UpdateMcubeHotpatchTaskStatusResponse
     */
    public UpdateMcubeHotpatchTaskStatusResponse updateMcubeHotpatchTaskStatus(UpdateMcubeHotpatchTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMcubeHotpatchTaskStatusWithOptions(request, runtime);
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
            new TeaPair("version", "2020-10-28"),
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
     * @param request UpdateMdsCubeResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMdsCubeResourceResponse
     */
    public UpdateMdsCubeResourceResponse updateMdsCubeResourceWithOptions(UpdateMdsCubeResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mockDataUrl)) {
            body.put("MockDataUrl", request.mockDataUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onexFlag)) {
            body.put("OnexFlag", request.onexFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateResourceId)) {
            body.put("TemplateResourceId", request.templateResourceId);
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
            new TeaPair("action", "UpdateMdsCubeResource"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMdsCubeResourceResponse());
    }

    /**
     * @param request UpdateMdsCubeResourceRequest
     * @return UpdateMdsCubeResourceResponse
     */
    public UpdateMdsCubeResourceResponse updateMdsCubeResource(UpdateMdsCubeResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMdsCubeResourceWithOptions(request, runtime);
    }

    /**
     * @param request UpdateMpaasAppInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMpaasAppInfoResponse
     */
    public UpdateMpaasAppInfoResponse updateMpaasAppInfoWithOptions(UpdateMpaasAppInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iconFileUrl)) {
            body.put("IconFileUrl", request.iconFileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            body.put("Identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onexFlag)) {
            body.put("OnexFlag", request.onexFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemType)) {
            body.put("SystemType", request.systemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMpaasAppInfo"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMpaasAppInfoResponse());
    }

    /**
     * @param request UpdateMpaasAppInfoRequest
     * @return UpdateMpaasAppInfoResponse
     */
    public UpdateMpaasAppInfoResponse updateMpaasAppInfo(UpdateMpaasAppInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMpaasAppInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上传字节码到msa进行加固</p>
     * 
     * @param request UploadBitcodeToMsaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadBitcodeToMsaResponse
     */
    public UploadBitcodeToMsaResponse uploadBitcodeToMsaWithOptions(UploadBitcodeToMsaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bitcode)) {
            body.put("Bitcode", request.bitcode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeVersion)) {
            body.put("CodeVersion", request.codeVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.license)) {
            body.put("License", request.license);
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
            new TeaPair("action", "UploadBitcodeToMsa"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadBitcodeToMsaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上传字节码到msa进行加固</p>
     * 
     * @param request UploadBitcodeToMsaRequest
     * @return UploadBitcodeToMsaResponse
     */
    public UploadBitcodeToMsaResponse uploadBitcodeToMsa(UploadBitcodeToMsaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadBitcodeToMsaWithOptions(request, runtime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.iconUrl)) {
            body.put("IconUrl", request.iconUrl);
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
            new TeaPair("version", "2020-10-28"),
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
            new TeaPair("version", "2020-10-28"),
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

    /**
     * @param request UploadUserAppToMsaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadUserAppToMsaResponse
     */
    public UploadUserAppToMsaResponse uploadUserAppToMsaWithOptions(UploadUserAppToMsaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            body.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useYShield)) {
            body.put("UseYShield", request.useYShield);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadUserAppToMsa"),
            new TeaPair("version", "2020-10-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadUserAppToMsaResponse());
    }

    /**
     * @param request UploadUserAppToMsaRequest
     * @return UploadUserAppToMsaResponse
     */
    public UploadUserAppToMsaResponse uploadUserAppToMsa(UploadUserAppToMsaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadUserAppToMsaWithOptions(request, runtime);
    }
}
