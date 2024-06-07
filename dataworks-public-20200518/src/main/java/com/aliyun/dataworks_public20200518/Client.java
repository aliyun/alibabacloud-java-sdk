// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518;

import com.aliyun.tea.*;
import com.aliyun.dataworks_public20200518.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "dataworks.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "dataworks.ap-south-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "dataworks.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "dataworks.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "dataworks.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "dataworks.ap-southeast-5.aliyuncs.com"),
            new TeaPair("cn-beijing", "dataworks.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-chengdu", "dataworks.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "dataworks.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hongkong", "dataworks.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "dataworks.aliyuncs.com"),
            new TeaPair("cn-qingdao", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shanghai", "dataworks.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "dataworks.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "dataworks.aliyuncs.com"),
            new TeaPair("eu-central-1", "dataworks.eu-central-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "dataworks.eu-west-1.aliyuncs.com"),
            new TeaPair("me-east-1", "dataworks.me-east-1.aliyuncs.com"),
            new TeaPair("us-east-1", "dataworks.us-east-1.aliyuncs.com"),
            new TeaPair("us-west-1", "dataworks.us-west-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "dataworks.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "dataworks.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dataworks-public", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @summary Unpublishes a DataService Studio API.
     *
     * @param request AbolishDataServiceApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AbolishDataServiceApiResponse
     */
    public AbolishDataServiceApiResponse abolishDataServiceApiWithOptions(AbolishDataServiceApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            body.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AbolishDataServiceApi"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AbolishDataServiceApiResponse());
    }

    /**
     * @summary Unpublishes a DataService Studio API.
     *
     * @param request AbolishDataServiceApiRequest
     * @return AbolishDataServiceApiResponse
     */
    public AbolishDataServiceApiResponse abolishDataServiceApi(AbolishDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.abolishDataServiceApiWithOptions(request, runtime);
    }

    /**
     * @summary Adds an entity to a collection.
     *
     * @param request AddMetaCollectionEntityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddMetaCollectionEntityResponse
     */
    public AddMetaCollectionEntityResponse addMetaCollectionEntityWithOptions(AddMetaCollectionEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collectionQualifiedName)) {
            query.put("CollectionQualifiedName", request.collectionQualifiedName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityQualifiedName)) {
            query.put("EntityQualifiedName", request.entityQualifiedName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddMetaCollectionEntity"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddMetaCollectionEntityResponse());
    }

    /**
     * @summary Adds an entity to a collection.
     *
     * @param request AddMetaCollectionEntityRequest
     * @return AddMetaCollectionEntityResponse
     */
    public AddMetaCollectionEntityResponse addMetaCollectionEntity(AddMetaCollectionEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addMetaCollectionEntityWithOptions(request, runtime);
    }

    /**
     * @summary For more information about how to add your Alibaba Cloud account or a RAM user as a member of a DataWorks workspace, see [Add a member to a DataWorks workspace](https://help.aliyun.com/document_detail/136941.html).
     *
     * @description The ID of the DataWorks workspace. You can call the [ListProjects](https://help.aliyun.com/document_detail/178393.html) operation to query the ID.
     *
     * @param request AddProjectMemberToRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddProjectMemberToRoleResponse
     */
    public AddProjectMemberToRoleResponse addProjectMemberToRoleWithOptions(AddProjectMemberToRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleCode)) {
            query.put("RoleCode", request.roleCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddProjectMemberToRole"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddProjectMemberToRoleResponse());
    }

    /**
     * @summary For more information about how to add your Alibaba Cloud account or a RAM user as a member of a DataWorks workspace, see [Add a member to a DataWorks workspace](https://help.aliyun.com/document_detail/136941.html).
     *
     * @description The ID of the DataWorks workspace. You can call the [ListProjects](https://help.aliyun.com/document_detail/178393.html) operation to query the ID.
     *
     * @param request AddProjectMemberToRoleRequest
     * @return AddProjectMemberToRoleResponse
     */
    public AddProjectMemberToRoleResponse addProjectMemberToRole(AddProjectMemberToRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addProjectMemberToRoleWithOptions(request, runtime);
    }

    /**
     * @summary 添加识别规则
     *
     * @param request AddRecognizeRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddRecognizeRuleResponse
     */
    public AddRecognizeRuleResponse addRecognizeRuleWithOptions(AddRecognizeRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.colExclude)) {
            body.put("ColExclude", request.colExclude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.colScan)) {
            body.put("ColScan", request.colScan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commentScan)) {
            body.put("CommentScan", request.commentScan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentScan)) {
            body.put("ContentScan", request.contentScan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hitThreshold)) {
            body.put("HitThreshold", request.hitThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            body.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.levelName)) {
            body.put("LevelName", request.levelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeParent)) {
            body.put("NodeParent", request.nodeParent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            body.put("OperationType", request.operationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recognizeRules)) {
            body.put("RecognizeRules", request.recognizeRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recognizeRulesType)) {
            body.put("RecognizeRulesType", request.recognizeRulesType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveDescription)) {
            body.put("SensitiveDescription", request.sensitiveDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveName)) {
            body.put("SensitiveName", request.sensitiveName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddRecognizeRule"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddRecognizeRuleResponse());
    }

    /**
     * @summary 添加识别规则
     *
     * @param request AddRecognizeRuleRequest
     * @return AddRecognizeRuleResponse
     */
    public AddRecognizeRuleResponse addRecognizeRule(AddRecognizeRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addRecognizeRuleWithOptions(request, runtime);
    }

    /**
     * @summary Adds a metatable to a specified category.
     *
     * @param request AddToMetaCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddToMetaCategoryResponse
     */
    public AddToMetaCategoryResponse addToMetaCategoryWithOptions(AddToMetaCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableGuid)) {
            query.put("TableGuid", request.tableGuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddToMetaCategory"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddToMetaCategoryResponse());
    }

    /**
     * @summary Adds a metatable to a specified category.
     *
     * @param request AddToMetaCategoryRequest
     * @return AddToMetaCategoryResponse
     */
    public AddToMetaCategoryResponse addToMetaCategory(AddToMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addToMetaCategoryWithOptions(request, runtime);
    }

    /**
     * @param request ApprovePermissionApplyOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApprovePermissionApplyOrderResponse
     */
    public ApprovePermissionApplyOrderResponse approvePermissionApplyOrderWithOptions(ApprovePermissionApplyOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approveAction)) {
            query.put("ApproveAction", request.approveAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approveComment)) {
            query.put("ApproveComment", request.approveComment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            query.put("FlowId", request.flowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApprovePermissionApplyOrder"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApprovePermissionApplyOrderResponse());
    }

    /**
     * @param request ApprovePermissionApplyOrderRequest
     * @return ApprovePermissionApplyOrderResponse
     */
    public ApprovePermissionApplyOrderResponse approvePermissionApplyOrder(ApprovePermissionApplyOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.approvePermissionApplyOrderWithOptions(request, runtime);
    }

    /**
     * @summary 扩展程序回调接口
     *
     * @param request CallbackExtensionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CallbackExtensionResponse
     */
    public CallbackExtensionResponse callbackExtensionWithOptions(CallbackExtensionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkMessage)) {
            body.put("CheckMessage", request.checkMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkResult)) {
            body.put("CheckResult", request.checkResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extensionCode)) {
            body.put("ExtensionCode", request.extensionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            body.put("MessageId", request.messageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CallbackExtension"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CallbackExtensionResponse());
    }

    /**
     * @summary 扩展程序回调接口
     *
     * @param request CallbackExtensionRequest
     * @return CallbackExtensionResponse
     */
    public CallbackExtensionResponse callbackExtension(CallbackExtensionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.callbackExtensionWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the resource group that you specify when you activate DataWorks or purchase a DataWorks exclusive resource group.
     *
     * @param request ChangeResourceManagerResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceManagerResourceGroupResponse
     */
    public ChangeResourceManagerResourceGroupResponse changeResourceManagerResourceGroupWithOptions(ChangeResourceManagerResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceManagerResourceGroup"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeResourceManagerResourceGroupResponse());
    }

    /**
     * @summary Modifies the resource group that you specify when you activate DataWorks or purchase a DataWorks exclusive resource group.
     *
     * @param request ChangeResourceManagerResourceGroupRequest
     * @return ChangeResourceManagerResourceGroupResponse
     */
    public ChangeResourceManagerResourceGroupResponse changeResourceManagerResourceGroup(ChangeResourceManagerResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceManagerResourceGroupWithOptions(request, runtime);
    }

    /**
     * @param request CheckFileDeploymentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckFileDeploymentResponse
     */
    public CheckFileDeploymentResponse checkFileDeploymentWithOptions(CheckFileDeploymentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkDetailUrl)) {
            body.put("CheckDetailUrl", request.checkDetailUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkerInstanceId)) {
            body.put("CheckerInstanceId", request.checkerInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckFileDeployment"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckFileDeploymentResponse());
    }

    /**
     * @param request CheckFileDeploymentRequest
     * @return CheckFileDeploymentResponse
     */
    public CheckFileDeploymentResponse checkFileDeployment(CheckFileDeploymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkFileDeploymentWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform. Set the value to **CheckMetaPartition**.
     *
     * @param request CheckMetaPartitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckMetaPartitionResponse
     */
    public CheckMetaPartitionResponse checkMetaPartitionWithOptions(CheckMetaPartitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            query.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partition)) {
            query.put("Partition", request.partition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableGuid)) {
            query.put("TableGuid", request.tableGuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckMetaPartition"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckMetaPartitionResponse());
    }

    /**
     * @summary The operation that you want to perform. Set the value to **CheckMetaPartition**.
     *
     * @param request CheckMetaPartitionRequest
     * @return CheckMetaPartitionResponse
     */
    public CheckMetaPartitionResponse checkMetaPartition(CheckMetaPartitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkMetaPartitionWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform. Set the value to **CheckMetaTable**.
     *
     * @param request CheckMetaTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckMetaTableResponse
     */
    public CheckMetaTableResponse checkMetaTableWithOptions(CheckMetaTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            query.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableGuid)) {
            query.put("TableGuid", request.tableGuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckMetaTable"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckMetaTableResponse());
    }

    /**
     * @summary The operation that you want to perform. Set the value to **CheckMetaTable**.
     *
     * @param request CheckMetaTableRequest
     * @return CheckMetaTableResponse
     */
    public CheckMetaTableResponse checkMetaTable(CheckMetaTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkMetaTableWithOptions(request, runtime);
    }

    /**
     * @summary 创建基线
     *
     * @param request CreateBaselineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBaselineResponse
     */
    public CreateBaselineResponse createBaselineWithOptions(CreateBaselineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertMarginThreshold)) {
            body.put("AlertMarginThreshold", request.alertMarginThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baselineName)) {
            body.put("BaselineName", request.baselineName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baselineType)) {
            body.put("BaselineType", request.baselineType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIds)) {
            body.put("NodeIds", request.nodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overtimeSettings)) {
            body.put("OvertimeSettings", request.overtimeSettings);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBaseline"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBaselineResponse());
    }

    /**
     * @summary 创建基线
     *
     * @param request CreateBaselineRequest
     * @return CreateBaselineResponse
     */
    public CreateBaselineResponse createBaseline(CreateBaselineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBaselineWithOptions(request, runtime);
    }

    /**
     * @param request CreateBusinessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBusinessResponse
     */
    public CreateBusinessResponse createBusinessWithOptions(CreateBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessName)) {
            body.put("BusinessName", request.businessName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useType)) {
            body.put("UseType", request.useType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBusiness"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBusinessResponse());
    }

    /**
     * @param request CreateBusinessRequest
     * @return CreateBusinessResponse
     */
    public CreateBusinessResponse createBusiness(CreateBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBusinessWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI CreateConnection is deprecated
     *
     * @summary 创建数据源
     *
     * @param request CreateConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateConnectionResponse
     */
    // Deprecated
    public CreateConnectionResponse createConnectionWithOptions(CreateConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionType)) {
            query.put("ConnectionType", request.connectionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            query.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subType)) {
            query.put("SubType", request.subType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConnection"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConnectionResponse());
    }

    /**
     * @deprecated OpenAPI CreateConnection is deprecated
     *
     * @summary 创建数据源
     *
     * @param request CreateConnectionRequest
     * @return CreateConnectionResponse
     */
    // Deprecated
    public CreateConnectionResponse createConnection(CreateConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createConnectionWithOptions(request, runtime);
    }

    /**
     * @summary 创建数据集成新版告警规则
     *
     * @param tmpReq CreateDIAlarmRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDIAlarmRuleResponse
     */
    public CreateDIAlarmRuleResponse createDIAlarmRuleWithOptions(CreateDIAlarmRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDIAlarmRuleShrinkRequest request = new CreateDIAlarmRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notificationSettings)) {
            request.notificationSettingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notificationSettings, "NotificationSettings", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.triggerConditions)) {
            request.triggerConditionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.triggerConditions, "TriggerConditions", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DIJobId)) {
            body.put("DIJobId", request.DIJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            body.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            body.put("MetricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationSettingsShrink)) {
            body.put("NotificationSettings", request.notificationSettingsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerConditionsShrink)) {
            body.put("TriggerConditions", request.triggerConditionsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDIAlarmRule"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDIAlarmRuleResponse());
    }

    /**
     * @summary 创建数据集成新版告警规则
     *
     * @param request CreateDIAlarmRuleRequest
     * @return CreateDIAlarmRuleResponse
     */
    public CreateDIAlarmRuleResponse createDIAlarmRule(CreateDIAlarmRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDIAlarmRuleWithOptions(request, runtime);
    }

    /**
     * @summary 创建数据集成新版解决方案任务
     *
     * @param tmpReq CreateDIJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDIJobResponse
     */
    public CreateDIJobResponse createDIJobWithOptions(CreateDIJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDIJobShrinkRequest request = new CreateDIJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.destinationDataSourceSettings)) {
            request.destinationDataSourceSettingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.destinationDataSourceSettings, "DestinationDataSourceSettings", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.jobSettings)) {
            request.jobSettingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.jobSettings, "JobSettings", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceSettings)) {
            request.resourceSettingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceSettings, "ResourceSettings", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceDataSourceSettings)) {
            request.sourceDataSourceSettingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceDataSourceSettings, "SourceDataSourceSettings", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tableMappings)) {
            request.tableMappingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tableMappings, "TableMappings", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.transformationRules)) {
            request.transformationRulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.transformationRules, "TransformationRules", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.systemDebug)) {
            query.put("SystemDebug", request.systemDebug);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationDataSourceSettingsShrink)) {
            body.put("DestinationDataSourceSettings", request.destinationDataSourceSettingsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationDataSourceType)) {
            body.put("DestinationDataSourceType", request.destinationDataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobSettingsShrink)) {
            body.put("JobSettings", request.jobSettingsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationType)) {
            body.put("MigrationType", request.migrationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSettingsShrink)) {
            body.put("ResourceSettings", request.resourceSettingsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDataSourceSettingsShrink)) {
            body.put("SourceDataSourceSettings", request.sourceDataSourceSettingsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDataSourceType)) {
            body.put("SourceDataSourceType", request.sourceDataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableMappingsShrink)) {
            body.put("TableMappings", request.tableMappingsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transformationRulesShrink)) {
            body.put("TransformationRules", request.transformationRulesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDIJob"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDIJobResponse());
    }

    /**
     * @summary 创建数据集成新版解决方案任务
     *
     * @param request CreateDIJobRequest
     * @return CreateDIJobResponse
     */
    public CreateDIJobResponse createDIJob(CreateDIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDIJobWithOptions(request, runtime);
    }

    /**
     * @summary Creates a data synchronization task.
     *
     * @param request CreateDISyncTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDISyncTaskResponse
     */
    public CreateDISyncTaskResponse createDISyncTaskWithOptions(CreateDISyncTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskContent)) {
            query.put("TaskContent", request.taskContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskParam)) {
            query.put("TaskParam", request.taskParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDISyncTask"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDISyncTaskResponse());
    }

    /**
     * @summary Creates a data synchronization task.
     *
     * @param request CreateDISyncTaskRequest
     * @return CreateDISyncTaskResponse
     */
    public CreateDISyncTaskResponse createDISyncTask(CreateDISyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDISyncTaskWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI CreateDagComplement is deprecated
     *
     * @param request CreateDagComplementRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDagComplementResponse
     */
    // Deprecated
    public CreateDagComplementResponse createDagComplementWithOptions(CreateDagComplementRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizBeginTime)) {
            body.put("BizBeginTime", request.bizBeginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizEndTime)) {
            body.put("BizEndTime", request.bizEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endBizDate)) {
            body.put("EndBizDate", request.endBizDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeNodeIds)) {
            body.put("ExcludeNodeIds", request.excludeNodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeNodeIds)) {
            body.put("IncludeNodeIds", request.includeNodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeParams)) {
            body.put("NodeParams", request.nodeParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parallelism)) {
            body.put("Parallelism", request.parallelism);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootNodeId)) {
            body.put("RootNodeId", request.rootNodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startBizDate)) {
            body.put("StartBizDate", request.startBizDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDagComplement"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDagComplementResponse());
    }

    /**
     * @deprecated OpenAPI CreateDagComplement is deprecated
     *
     * @param request CreateDagComplementRequest
     * @return CreateDagComplementResponse
     */
    // Deprecated
    public CreateDagComplementResponse createDagComplement(CreateDagComplementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDagComplementWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI CreateDagTest is deprecated
     *
     * @param request CreateDagTestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDagTestResponse
     */
    // Deprecated
    public CreateDagTestResponse createDagTestWithOptions(CreateDagTestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizdate)) {
            body.put("Bizdate", request.bizdate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeParams)) {
            body.put("NodeParams", request.nodeParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDagTest"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDagTestResponse());
    }

    /**
     * @deprecated OpenAPI CreateDagTest is deprecated
     *
     * @param request CreateDagTestRequest
     * @return CreateDagTestResponse
     */
    // Deprecated
    public CreateDagTestResponse createDagTest(CreateDagTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDagTestWithOptions(request, runtime);
    }

    /**
     * @param request CreateDataServiceApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataServiceApiResponse
     */
    public CreateDataServiceApiResponse createDataServiceApiWithOptions(CreateDataServiceApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiDescription)) {
            body.put("ApiDescription", request.apiDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiMode)) {
            body.put("ApiMode", request.apiMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiName)) {
            body.put("ApiName", request.apiName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiPath)) {
            body.put("ApiPath", request.apiPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("FolderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocols)) {
            body.put("Protocols", request.protocols);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrationDetails)) {
            body.put("RegistrationDetails", request.registrationDetails);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestContentType)) {
            body.put("RequestContentType", request.requestContentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestMethod)) {
            body.put("RequestMethod", request.requestMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseContentType)) {
            body.put("ResponseContentType", request.responseContentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptDetails)) {
            body.put("ScriptDetails", request.scriptDetails);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlMode)) {
            body.put("SqlMode", request.sqlMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            body.put("Timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibleRange)) {
            body.put("VisibleRange", request.visibleRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wizardDetails)) {
            body.put("WizardDetails", request.wizardDetails);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataServiceApi"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataServiceApiResponse());
    }

    /**
     * @param request CreateDataServiceApiRequest
     * @return CreateDataServiceApiResponse
     */
    public CreateDataServiceApiResponse createDataServiceApi(CreateDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataServiceApiWithOptions(request, runtime);
    }

    /**
     * @summary Grants the access permissions on an API in DataService Studio.
     *
     * @param request CreateDataServiceApiAuthorityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataServiceApiAuthorityResponse
     */
    public CreateDataServiceApiAuthorityResponse createDataServiceApiAuthorityWithOptions(CreateDataServiceApiAuthorityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            body.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizedProjectId)) {
            body.put("AuthorizedProjectId", request.authorizedProjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataServiceApiAuthority"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataServiceApiAuthorityResponse());
    }

    /**
     * @summary Grants the access permissions on an API in DataService Studio.
     *
     * @param request CreateDataServiceApiAuthorityRequest
     * @return CreateDataServiceApiAuthorityResponse
     */
    public CreateDataServiceApiAuthorityResponse createDataServiceApiAuthority(CreateDataServiceApiAuthorityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataServiceApiAuthorityWithOptions(request, runtime);
    }

    /**
     * @summary Creates a folder in DataService Studio.
     *
     * @param request CreateDataServiceFolderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataServiceFolderResponse
     */
    public CreateDataServiceFolderResponse createDataServiceFolderWithOptions(CreateDataServiceFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.folderName)) {
            body.put("FolderName", request.folderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            body.put("ParentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataServiceFolder"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataServiceFolderResponse());
    }

    /**
     * @summary Creates a folder in DataService Studio.
     *
     * @param request CreateDataServiceFolderRequest
     * @return CreateDataServiceFolderResponse
     */
    public CreateDataServiceFolderResponse createDataServiceFolder(CreateDataServiceFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataServiceFolderWithOptions(request, runtime);
    }

    /**
     * @summary Creates a business process.
     *
     * @param request CreateDataServiceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataServiceGroupResponse
     */
    public CreateDataServiceGroupResponse createDataServiceGroupWithOptions(CreateDataServiceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiGatewayGroupId)) {
            body.put("ApiGatewayGroupId", request.apiGatewayGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataServiceGroup"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataServiceGroupResponse());
    }

    /**
     * @summary Creates a business process.
     *
     * @param request CreateDataServiceGroupRequest
     * @return CreateDataServiceGroupResponse
     */
    public CreateDataServiceGroupResponse createDataServiceGroup(CreateDataServiceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataServiceGroupWithOptions(request, runtime);
    }

    /**
     * @summary 创建数据源
     *
     * @param request CreateDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataSourceResponse
     */
    public CreateDataSourceResponse createDataSourceWithOptions(CreateDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            query.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            query.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subType)) {
            query.put("SubType", request.subType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataSource"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataSourceResponse());
    }

    /**
     * @summary 创建数据源
     *
     * @param request CreateDataSourceRequest
     * @return CreateDataSourceResponse
     */
    public CreateDataSourceResponse createDataSource(CreateDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataSourceWithOptions(request, runtime);
    }

    /**
     * @summary 新建导出任务
     *
     * @param request CreateExportMigrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExportMigrationResponse
     */
    public CreateExportMigrationResponse createExportMigrationWithOptions(CreateExportMigrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exportMode)) {
            body.put("ExportMode", request.exportMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exportObjectStatus)) {
            body.put("ExportObjectStatus", request.exportObjectStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incrementalSince)) {
            body.put("IncrementalSince", request.incrementalSince);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExportMigration"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExportMigrationResponse());
    }

    /**
     * @summary 新建导出任务
     *
     * @param request CreateExportMigrationRequest
     * @return CreateExportMigrationResponse
     */
    public CreateExportMigrationResponse createExportMigration(CreateExportMigrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createExportMigrationWithOptions(request, runtime);
    }

    /**
     * @summary Creates a file in DataStudio. You cannot call this operation to create files for Data Integration nodes.
     *
     * @param request CreateFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFileResponse
     */
    public CreateFileResponse createFileWithOptions(CreateFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.advancedSettings)) {
            body.put("AdvancedSettings", request.advancedSettings);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoParsing)) {
            body.put("AutoParsing", request.autoParsing);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRerunIntervalMillis)) {
            body.put("AutoRerunIntervalMillis", request.autoRerunIntervalMillis);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRerunTimes)) {
            body.put("AutoRerunTimes", request.autoRerunTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionName)) {
            body.put("ConnectionName", request.connectionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createFolderIfNotExists)) {
            body.put("CreateFolderIfNotExists", request.createFolderIfNotExists);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cronExpress)) {
            body.put("CronExpress", request.cronExpress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cycleType)) {
            body.put("CycleType", request.cycleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dependentNodeIdList)) {
            body.put("DependentNodeIdList", request.dependentNodeIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dependentType)) {
            body.put("DependentType", request.dependentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endEffectDate)) {
            body.put("EndEffectDate", request.endEffectDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileDescription)) {
            body.put("FileDescription", request.fileDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileFolderPath)) {
            body.put("FileFolderPath", request.fileFolderPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            body.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreParentSkipRunningProperty)) {
            body.put("IgnoreParentSkipRunningProperty", request.ignoreParentSkipRunningProperty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputList)) {
            body.put("InputList", request.inputList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputParameters)) {
            body.put("InputParameters", request.inputParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputParameters)) {
            body.put("OutputParameters", request.outputParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paraValue)) {
            body.put("ParaValue", request.paraValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerunMode)) {
            body.put("RerunMode", request.rerunMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIdentifier)) {
            body.put("ResourceGroupIdentifier", request.resourceGroupIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedulerType)) {
            body.put("SchedulerType", request.schedulerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startEffectDate)) {
            body.put("StartEffectDate", request.startEffectDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startImmediately)) {
            body.put("StartImmediately", request.startImmediately);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stop)) {
            body.put("Stop", request.stop);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFile"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFileResponse());
    }

    /**
     * @summary Creates a file in DataStudio. You cannot call this operation to create files for Data Integration nodes.
     *
     * @param request CreateFileRequest
     * @return CreateFileResponse
     */
    public CreateFileResponse createFile(CreateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFileWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform. Set the value to **CreateFolder**.
     *
     * @param request CreateFolderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFolderResponse
     */
    public CreateFolderResponse createFolderWithOptions(CreateFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.folderPath)) {
            body.put("FolderPath", request.folderPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFolder"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFolderResponse());
    }

    /**
     * @summary The operation that you want to perform. Set the value to **CreateFolder**.
     *
     * @param request CreateFolderRequest
     * @return CreateFolderResponse
     */
    public CreateFolderResponse createFolder(CreateFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFolderWithOptions(request, runtime);
    }

    /**
     * @description The import package must be uploaded. Example of the upload method:
     * Config config = new Config();
     * config.setAccessKeyId(accessId);
     * config.setAccessKeySecret(accessKey);
     * config.setEndpoint(popEndpoint);
     * config.setRegionId(regionId);
     * Client client = new Client(config);
     * CreateImportMigrationAdvanceRequest request = new CreateImportMigrationAdvanceRequest();
     * request.setName("test_migration_api_" + System.currentTimeMillis());
     * request.setProjectId(123456L);
     * request.setPackageType("DATAWORKS_MODEL");
     * request.setPackageFileObject(new FileInputStream("/home/admin/Downloads/test.zip"));
     * RuntimeOptions runtime = new RuntimeOptions();
     * CreateImportMigrationResponse response = client.createImportMigrationAdvance(request, runtime);
     * ...
     *
     * @param request CreateImportMigrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateImportMigrationResponse
     */
    public CreateImportMigrationResponse createImportMigrationWithOptions(CreateImportMigrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calculateEngineMap)) {
            body.put("CalculateEngineMap", request.calculateEngineMap);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commitRule)) {
            body.put("CommitRule", request.commitRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageFile)) {
            body.put("PackageFile", request.packageFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            body.put("PackageType", request.packageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupMap)) {
            body.put("ResourceGroupMap", request.resourceGroupMap);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceMap)) {
            body.put("WorkspaceMap", request.workspaceMap);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImportMigration"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateImportMigrationResponse());
    }

    /**
     * @description The import package must be uploaded. Example of the upload method:
     * Config config = new Config();
     * config.setAccessKeyId(accessId);
     * config.setAccessKeySecret(accessKey);
     * config.setEndpoint(popEndpoint);
     * config.setRegionId(regionId);
     * Client client = new Client(config);
     * CreateImportMigrationAdvanceRequest request = new CreateImportMigrationAdvanceRequest();
     * request.setName("test_migration_api_" + System.currentTimeMillis());
     * request.setProjectId(123456L);
     * request.setPackageType("DATAWORKS_MODEL");
     * request.setPackageFileObject(new FileInputStream("/home/admin/Downloads/test.zip"));
     * RuntimeOptions runtime = new RuntimeOptions();
     * CreateImportMigrationResponse response = client.createImportMigrationAdvance(request, runtime);
     * ...
     *
     * @param request CreateImportMigrationRequest
     * @return CreateImportMigrationResponse
     */
    public CreateImportMigrationResponse createImportMigration(CreateImportMigrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createImportMigrationWithOptions(request, runtime);
    }

    public CreateImportMigrationResponse createImportMigrationAdvance(CreateImportMigrationAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "dataworks-public"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        CreateImportMigrationRequest createImportMigrationReq = new CreateImportMigrationRequest();
        com.aliyun.openapiutil.Client.convert(request, createImportMigrationReq);
        if (!com.aliyun.teautil.Common.isUnset(request.packageFileObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.body.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.body.objectKey),
                new TeaPair("content", request.packageFileObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                new TeaPair("policy", authResponse.body.encodedPolicy),
                new TeaPair("signature", authResponse.body.signature),
                new TeaPair("key", authResponse.body.objectKey),
                new TeaPair("file", fileObj),
                new TeaPair("successActionStatus", "201")
            ));
            uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                new TeaPair("bucketName", authResponse.body.bucket),
                new TeaPair("header", ossHeader)
            ));
            ossClient.postObject(uploadRequest, ossRuntime);
            createImportMigrationReq.packageFile = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        CreateImportMigrationResponse createImportMigrationResp = this.createImportMigrationWithOptions(createImportMigrationReq, runtime);
        return createImportMigrationResp;
    }

    /**
     * @deprecated OpenAPI CreateManualDag is deprecated
     *
     * @param request CreateManualDagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateManualDagResponse
     */
    // Deprecated
    public CreateManualDagResponse createManualDagWithOptions(CreateManualDagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizDate)) {
            body.put("BizDate", request.bizDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dagParameters)) {
            body.put("DagParameters", request.dagParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeNodeIds)) {
            body.put("ExcludeNodeIds", request.excludeNodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowName)) {
            body.put("FlowName", request.flowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeNodeIds)) {
            body.put("IncludeNodeIds", request.includeNodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeParameters)) {
            body.put("NodeParameters", request.nodeParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateManualDag"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateManualDagResponse());
    }

    /**
     * @deprecated OpenAPI CreateManualDag is deprecated
     *
     * @param request CreateManualDagRequest
     * @return CreateManualDagResponse
     */
    // Deprecated
    public CreateManualDagResponse createManualDag(CreateManualDagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createManualDagWithOptions(request, runtime);
    }

    /**
     * @summary Creates a category.
     *
     * @param request CreateMetaCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMetaCategoryResponse
     */
    public CreateMetaCategoryResponse createMetaCategoryWithOptions(CreateMetaCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            body.put("ParentId", request.parentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMetaCategory"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMetaCategoryResponse());
    }

    /**
     * @summary Creates a category.
     *
     * @param request CreateMetaCategoryRequest
     * @return CreateMetaCategoryResponse
     */
    public CreateMetaCategoryResponse createMetaCategory(CreateMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMetaCategoryWithOptions(request, runtime);
    }

    /**
     * @summary Creates a collection.
     *
     * @description Collections are classified into various types. The names of collections of the same type must be different.
     *
     * @param request CreateMetaCollectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMetaCollectionResponse
     */
    public CreateMetaCollectionResponse createMetaCollectionWithOptions(CreateMetaCollectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collectionType)) {
            query.put("CollectionType", request.collectionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentQualifiedName)) {
            query.put("ParentQualifiedName", request.parentQualifiedName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMetaCollection"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMetaCollectionResponse());
    }

    /**
     * @summary Creates a collection.
     *
     * @description Collections are classified into various types. The names of collections of the same type must be different.
     *
     * @param request CreateMetaCollectionRequest
     * @return CreateMetaCollectionResponse
     */
    public CreateMetaCollectionResponse createMetaCollection(CreateMetaCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMetaCollectionWithOptions(request, runtime);
    }

    /**
     * @param request CreatePermissionApplyOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePermissionApplyOrderResponse
     */
    public CreatePermissionApplyOrderResponse createPermissionApplyOrderWithOptions(CreatePermissionApplyOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyObject)) {
            query.put("ApplyObject", request.applyObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyReason)) {
            query.put("ApplyReason", request.applyReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyUserIds)) {
            query.put("ApplyUserIds", request.applyUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deadline)) {
            query.put("Deadline", request.deadline);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineType)) {
            query.put("EngineType", request.engineType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxComputeProjectName)) {
            query.put("MaxComputeProjectName", request.maxComputeProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePermissionApplyOrder"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePermissionApplyOrderResponse());
    }

    /**
     * @param request CreatePermissionApplyOrderRequest
     * @return CreatePermissionApplyOrderResponse
     */
    public CreatePermissionApplyOrderResponse createPermissionApplyOrder(CreatePermissionApplyOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPermissionApplyOrderWithOptions(request, runtime);
    }

    /**
     * @summary 创建项目
     *
     * @param tmpReq CreateProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateProjectShrinkRequest request = new CreateProjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableDevelopment)) {
            query.put("DisableDevelopment", request.disableDevelopment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAllowDownload)) {
            query.put("IsAllowDownload", request.isAllowDownload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectDescription)) {
            query.put("ProjectDescription", request.projectDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            query.put("ProjectIdentifier", request.projectIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectMode)) {
            query.put("ProjectMode", request.projectMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProject"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectResponse());
    }

    /**
     * @summary 创建项目
     *
     * @param request CreateProjectRequest
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProjectWithOptions(request, runtime);
    }

    /**
     * @param request CreateProjectMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProjectMemberResponse
     */
    public CreateProjectMemberResponse createProjectMemberWithOptions(CreateProjectMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleCode)) {
            query.put("RoleCode", request.roleCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProjectMember"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectMemberResponse());
    }

    /**
     * @param request CreateProjectMemberRequest
     * @return CreateProjectMemberResponse
     */
    public CreateProjectMemberResponse createProjectMember(CreateProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProjectMemberWithOptions(request, runtime);
    }

    /**
     * @param request CreateQualityEntityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateQualityEntityResponse
     */
    public CreateQualityEntityResponse createQualityEntityWithOptions(CreateQualityEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityLevel)) {
            body.put("EntityLevel", request.entityLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            body.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchExpression)) {
            body.put("MatchExpression", request.matchExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQualityEntity"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQualityEntityResponse());
    }

    /**
     * @param request CreateQualityEntityRequest
     * @return CreateQualityEntityResponse
     */
    public CreateQualityEntityResponse createQualityEntity(CreateQualityEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQualityEntityWithOptions(request, runtime);
    }

    /**
     * @param request CreateQualityFollowerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateQualityFollowerResponse
     */
    public CreateQualityFollowerResponse createQualityFollowerWithOptions(CreateQualityFollowerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmMode)) {
            body.put("AlarmMode", request.alarmMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            body.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.follower)) {
            body.put("Follower", request.follower);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQualityFollower"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQualityFollowerResponse());
    }

    /**
     * @param request CreateQualityFollowerRequest
     * @return CreateQualityFollowerResponse
     */
    public CreateQualityFollowerResponse createQualityFollower(CreateQualityFollowerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQualityFollowerWithOptions(request, runtime);
    }

    /**
     * @param request CreateQualityRelativeNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateQualityRelativeNodeResponse
     */
    public CreateQualityRelativeNodeResponse createQualityRelativeNodeWithOptions(CreateQualityRelativeNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            body.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchExpression)) {
            body.put("MatchExpression", request.matchExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetNodeProjectId)) {
            body.put("TargetNodeProjectId", request.targetNodeProjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetNodeProjectName)) {
            body.put("TargetNodeProjectName", request.targetNodeProjectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQualityRelativeNode"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQualityRelativeNodeResponse());
    }

    /**
     * @param request CreateQualityRelativeNodeRequest
     * @return CreateQualityRelativeNodeResponse
     */
    public CreateQualityRelativeNodeResponse createQualityRelativeNode(CreateQualityRelativeNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQualityRelativeNodeWithOptions(request, runtime);
    }

    /**
     * @param request CreateQualityRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateQualityRuleResponse
     */
    public CreateQualityRuleResponse createQualityRuleWithOptions(CreateQualityRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blockType)) {
            body.put("BlockType", request.blockType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checker)) {
            body.put("Checker", request.checker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.criticalThreshold)) {
            body.put("CriticalThreshold", request.criticalThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            body.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expectValue)) {
            body.put("ExpectValue", request.expectValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.methodName)) {
            body.put("MethodName", request.methodName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            body.put("Operator", request.operator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictType)) {
            body.put("PredictType", request.predictType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.property)) {
            body.put("Property", request.property);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyType)) {
            body.put("PropertyType", request.propertyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            body.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            body.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskSetting)) {
            body.put("TaskSetting", request.taskSetting);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trend)) {
            body.put("Trend", request.trend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warningThreshold)) {
            body.put("WarningThreshold", request.warningThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whereCondition)) {
            body.put("WhereCondition", request.whereCondition);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQualityRule"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQualityRuleResponse());
    }

    /**
     * @param request CreateQualityRuleRequest
     * @return CreateQualityRuleResponse
     */
    public CreateQualityRuleResponse createQualityRule(CreateQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQualityRuleWithOptions(request, runtime);
    }

    /**
     * @param request CreateRemindRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRemindResponse
     */
    public CreateRemindResponse createRemindWithOptions(CreateRemindRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertInterval)) {
            body.put("AlertInterval", request.alertInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertMethods)) {
            body.put("AlertMethods", request.alertMethods);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertTargets)) {
            body.put("AlertTargets", request.alertTargets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertUnit)) {
            body.put("AlertUnit", request.alertUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baselineIds)) {
            body.put("BaselineIds", request.baselineIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizProcessIds)) {
            body.put("BizProcessIds", request.bizProcessIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detail)) {
            body.put("Detail", request.detail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dndEnd)) {
            body.put("DndEnd", request.dndEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxAlertTimes)) {
            body.put("MaxAlertTimes", request.maxAlertTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIds)) {
            body.put("NodeIds", request.nodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remindName)) {
            body.put("RemindName", request.remindName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remindType)) {
            body.put("RemindType", request.remindType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remindUnit)) {
            body.put("RemindUnit", request.remindUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotUrls)) {
            body.put("RobotUrls", request.robotUrls);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhooks)) {
            body.put("Webhooks", request.webhooks);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRemind"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRemindResponse());
    }

    /**
     * @param request CreateRemindRequest
     * @return CreateRemindResponse
     */
    public CreateRemindResponse createRemind(CreateRemindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRemindWithOptions(request, runtime);
    }

    /**
     * @summary 支持用户指定自己的文件（比如jar，py，arhive，file等）创建数据开发资源文件
     *
     * @param request CreateResourceFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateResourceFileResponse
     */
    public CreateResourceFileResponse createResourceFileWithOptions(CreateResourceFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileDescription)) {
            body.put("FileDescription", request.fileDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileFolderPath)) {
            body.put("FileFolderPath", request.fileFolderPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            body.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originResourceName)) {
            body.put("OriginResourceName", request.originResourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerToCalcEngine)) {
            body.put("RegisterToCalcEngine", request.registerToCalcEngine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceFile)) {
            body.put("ResourceFile", request.resourceFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageURL)) {
            body.put("StorageURL", request.storageURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadMode)) {
            body.put("UploadMode", request.uploadMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResourceFile"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceFileResponse());
    }

    /**
     * @summary 支持用户指定自己的文件（比如jar，py，arhive，file等）创建数据开发资源文件
     *
     * @param request CreateResourceFileRequest
     * @return CreateResourceFileResponse
     */
    public CreateResourceFileResponse createResourceFile(CreateResourceFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createResourceFileWithOptions(request, runtime);
    }

    public CreateResourceFileResponse createResourceFileAdvance(CreateResourceFileAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "dataworks-public"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        CreateResourceFileRequest createResourceFileReq = new CreateResourceFileRequest();
        com.aliyun.openapiutil.Client.convert(request, createResourceFileReq);
        if (!com.aliyun.teautil.Common.isUnset(request.resourceFileObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.body.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.body.objectKey),
                new TeaPair("content", request.resourceFileObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                new TeaPair("policy", authResponse.body.encodedPolicy),
                new TeaPair("signature", authResponse.body.signature),
                new TeaPair("key", authResponse.body.objectKey),
                new TeaPair("file", fileObj),
                new TeaPair("successActionStatus", "201")
            ));
            uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                new TeaPair("bucketName", authResponse.body.bucket),
                new TeaPair("header", ossHeader)
            ));
            ossClient.postObject(uploadRequest, ossRuntime);
            createResourceFileReq.resourceFile = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        CreateResourceFileResponse createResourceFileResp = this.createResourceFileWithOptions(createResourceFileReq, runtime);
        return createResourceFileResp;
    }

    /**
     * @summary The operation that you want to perform. Set the value to **CreateTable**.
     *
     * @param request CreateTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTableResponse
     */
    public CreateTableResponse createTableWithOptions(CreateTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appGuid)) {
            query.put("AppGuid", request.appGuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalTableType)) {
            query.put("ExternalTableType", request.externalTableType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hasPart)) {
            query.put("HasPart", request.hasPart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isView)) {
            query.put("IsView", request.isView);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifeCycle)) {
            query.put("LifeCycle", request.lifeCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            query.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalLevelId)) {
            query.put("LogicalLevelId", request.logicalLevelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.physicsLevelId)) {
            query.put("PhysicsLevelId", request.physicsLevelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schema)) {
            query.put("Schema", request.schema);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibility)) {
            query.put("Visibility", request.visibility);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columns)) {
            body.put("Columns", request.columns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            body.put("Endpoint", request.endpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            body.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.themes)) {
            body.put("Themes", request.themes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTable"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTableResponse());
    }

    /**
     * @summary The operation that you want to perform. Set the value to **CreateTable**.
     *
     * @param request CreateTableRequest
     * @return CreateTableResponse
     */
    public CreateTableResponse createTable(CreateTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTableWithOptions(request, runtime);
    }

    /**
     * @summary The ID of the DataWorks workspace.
     *
     * @param request CreateTableLevelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTableLevelResponse
     */
    public CreateTableLevelResponse createTableLevelWithOptions(CreateTableLevelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.levelType)) {
            query.put("LevelType", request.levelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTableLevel"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTableLevelResponse());
    }

    /**
     * @summary The ID of the DataWorks workspace.
     *
     * @param request CreateTableLevelRequest
     * @return CreateTableLevelResponse
     */
    public CreateTableLevelResponse createTableLevel(CreateTableLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTableLevelWithOptions(request, runtime);
    }

    /**
     * @summary Creates a table folder. This API operation will be replaced soon. We recommend that you do not call this API operation.
     *
     * @param request CreateTableThemeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTableThemeResponse
     */
    public CreateTableThemeResponse createTableThemeWithOptions(CreateTableThemeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            query.put("ParentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTableTheme"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTableThemeResponse());
    }

    /**
     * @summary Creates a table folder. This API operation will be replaced soon. We recommend that you do not call this API operation.
     *
     * @param request CreateTableThemeRequest
     * @return CreateTableThemeResponse
     */
    public CreateTableThemeResponse createTableTheme(CreateTableThemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTableThemeWithOptions(request, runtime);
    }

    /**
     * @param request CreateUdfFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUdfFileResponse
     */
    public CreateUdfFileResponse createUdfFileWithOptions(CreateUdfFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.className)) {
            body.put("ClassName", request.className);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cmdDescription)) {
            body.put("CmdDescription", request.cmdDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createFolderIfNotExists)) {
            body.put("CreateFolderIfNotExists", request.createFolderIfNotExists);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.example)) {
            body.put("Example", request.example);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileFolderPath)) {
            body.put("FileFolderPath", request.fileFolderPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionType)) {
            body.put("FunctionType", request.functionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameterDescription)) {
            body.put("ParameterDescription", request.parameterDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            body.put("Resources", request.resources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnValue)) {
            body.put("ReturnValue", request.returnValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.udfDescription)) {
            body.put("UdfDescription", request.udfDescription);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUdfFile"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUdfFileResponse());
    }

    /**
     * @param request CreateUdfFileRequest
     * @return CreateUdfFileResponse
     */
    public CreateUdfFileResponse createUdfFile(CreateUdfFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUdfFileWithOptions(request, runtime);
    }

    /**
     * @param request DeleteBaselineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBaselineResponse
     */
    public DeleteBaselineResponse deleteBaselineWithOptions(DeleteBaselineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baselineId)) {
            body.put("BaselineId", request.baselineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBaseline"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBaselineResponse());
    }

    /**
     * @param request DeleteBaselineRequest
     * @return DeleteBaselineResponse
     */
    public DeleteBaselineResponse deleteBaseline(DeleteBaselineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBaselineWithOptions(request, runtime);
    }

    /**
     * @param request DeleteBusinessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBusinessResponse
     */
    public DeleteBusinessResponse deleteBusinessWithOptions(DeleteBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessId)) {
            body.put("BusinessId", request.businessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBusiness"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBusinessResponse());
    }

    /**
     * @param request DeleteBusinessRequest
     * @return DeleteBusinessResponse
     */
    public DeleteBusinessResponse deleteBusiness(DeleteBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBusinessWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI DeleteConnection is deprecated
     *
     * @summary 删除数据源
     *
     * @param request DeleteConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteConnectionResponse
     */
    // Deprecated
    public DeleteConnectionResponse deleteConnectionWithOptions(DeleteConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            query.put("ConnectionId", request.connectionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConnection"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConnectionResponse());
    }

    /**
     * @deprecated OpenAPI DeleteConnection is deprecated
     *
     * @summary 删除数据源
     *
     * @param request DeleteConnectionRequest
     * @return DeleteConnectionResponse
     */
    // Deprecated
    public DeleteConnectionResponse deleteConnection(DeleteConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteConnectionWithOptions(request, runtime);
    }

    /**
     * @summary 删除数据集成新版告警规则
     *
     * @param request DeleteDIAlarmRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDIAlarmRuleResponse
     */
    public DeleteDIAlarmRuleResponse deleteDIAlarmRuleWithOptions(DeleteDIAlarmRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DIAlarmRuleId)) {
            body.put("DIAlarmRuleId", request.DIAlarmRuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDIAlarmRule"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDIAlarmRuleResponse());
    }

    /**
     * @summary 删除数据集成新版告警规则
     *
     * @param request DeleteDIAlarmRuleRequest
     * @return DeleteDIAlarmRuleResponse
     */
    public DeleteDIAlarmRuleResponse deleteDIAlarmRule(DeleteDIAlarmRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDIAlarmRuleWithOptions(request, runtime);
    }

    /**
     * @summary 删除数据集成新版解决方案任务
     *
     * @param request DeleteDIJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDIJobResponse
     */
    public DeleteDIJobResponse deleteDIJobWithOptions(DeleteDIJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DIJobId)) {
            body.put("DIJobId", request.DIJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDIJob"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDIJobResponse());
    }

    /**
     * @summary 删除数据集成新版解决方案任务
     *
     * @param request DeleteDIJobRequest
     * @return DeleteDIJobResponse
     */
    public DeleteDIJobResponse deleteDIJob(DeleteDIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDIJobWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform.
     *
     * @param request DeleteDISyncTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDISyncTaskResponse
     */
    public DeleteDISyncTaskResponse deleteDISyncTaskWithOptions(DeleteDISyncTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDISyncTask"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDISyncTaskResponse());
    }

    /**
     * @summary The operation that you want to perform.
     *
     * @param request DeleteDISyncTaskRequest
     * @return DeleteDISyncTaskResponse
     */
    public DeleteDISyncTaskResponse deleteDISyncTask(DeleteDISyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDISyncTaskWithOptions(request, runtime);
    }

    /**
     * @summary Deletes an API in DataService Studio.
     *
     * @param request DeleteDataServiceApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataServiceApiResponse
     */
    public DeleteDataServiceApiResponse deleteDataServiceApiWithOptions(DeleteDataServiceApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            body.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataServiceApi"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataServiceApiResponse());
    }

    /**
     * @summary Deletes an API in DataService Studio.
     *
     * @param request DeleteDataServiceApiRequest
     * @return DeleteDataServiceApiResponse
     */
    public DeleteDataServiceApiResponse deleteDataServiceApi(DeleteDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataServiceApiWithOptions(request, runtime);
    }

    /**
     * @summary Revokes the access permissions on an API.
     *
     * @param request DeleteDataServiceApiAuthorityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataServiceApiAuthorityResponse
     */
    public DeleteDataServiceApiAuthorityResponse deleteDataServiceApiAuthorityWithOptions(DeleteDataServiceApiAuthorityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            body.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizedProjectId)) {
            body.put("AuthorizedProjectId", request.authorizedProjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataServiceApiAuthority"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataServiceApiAuthorityResponse());
    }

    /**
     * @summary Revokes the access permissions on an API.
     *
     * @param request DeleteDataServiceApiAuthorityRequest
     * @return DeleteDataServiceApiAuthorityResponse
     */
    public DeleteDataServiceApiAuthorityResponse deleteDataServiceApiAuthority(DeleteDataServiceApiAuthorityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataServiceApiAuthorityWithOptions(request, runtime);
    }

    /**
     * @param request DeleteDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataSourceResponse
     */
    public DeleteDataSourceResponse deleteDataSourceWithOptions(DeleteDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("DataSourceId", request.dataSourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataSource"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataSourceResponse());
    }

    /**
     * @param request DeleteDataSourceRequest
     * @return DeleteDataSourceResponse
     */
    public DeleteDataSourceResponse deleteDataSource(DeleteDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataSourceWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform.
     *
     * @param request DeleteFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFileResponse
     */
    public DeleteFileResponse deleteFileWithOptions(DeleteFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFile"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFileResponse());
    }

    /**
     * @summary The operation that you want to perform.
     *
     * @param request DeleteFileRequest
     * @return DeleteFileResponse
     */
    public DeleteFileResponse deleteFile(DeleteFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFileWithOptions(request, runtime);
    }

    /**
     * @param request DeleteFolderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFolderResponse
     */
    public DeleteFolderResponse deleteFolderWithOptions(DeleteFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("FolderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFolder"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFolderResponse());
    }

    /**
     * @param request DeleteFolderRequest
     * @return DeleteFolderResponse
     */
    public DeleteFolderResponse deleteFolder(DeleteFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFolderWithOptions(request, runtime);
    }

    /**
     * @summary Removes a metatable from a specified category.
     *
     * @param request DeleteFromMetaCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFromMetaCategoryResponse
     */
    public DeleteFromMetaCategoryResponse deleteFromMetaCategoryWithOptions(DeleteFromMetaCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableGuid)) {
            query.put("TableGuid", request.tableGuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFromMetaCategory"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFromMetaCategoryResponse());
    }

    /**
     * @summary Removes a metatable from a specified category.
     *
     * @param request DeleteFromMetaCategoryRequest
     * @return DeleteFromMetaCategoryResponse
     */
    public DeleteFromMetaCategoryResponse deleteFromMetaCategory(DeleteFromMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFromMetaCategoryWithOptions(request, runtime);
    }

    /**
     * @summary 删除血缘, 支持删除用户自定义血缘关系
     *
     * @param request DeleteLineageRelationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLineageRelationResponse
     */
    public DeleteLineageRelationResponse deleteLineageRelationWithOptions(DeleteLineageRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destEntityQualifiedName)) {
            query.put("DestEntityQualifiedName", request.destEntityQualifiedName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relationshipGuid)) {
            query.put("RelationshipGuid", request.relationshipGuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcEntityQualifiedName)) {
            query.put("SrcEntityQualifiedName", request.srcEntityQualifiedName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLineageRelation"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLineageRelationResponse());
    }

    /**
     * @summary 删除血缘, 支持删除用户自定义血缘关系
     *
     * @param request DeleteLineageRelationRequest
     * @return DeleteLineageRelationResponse
     */
    public DeleteLineageRelationResponse deleteLineageRelation(DeleteLineageRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLineageRelationWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a category.
     *
     * @param request DeleteMetaCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMetaCategoryResponse
     */
    public DeleteMetaCategoryResponse deleteMetaCategoryWithOptions(DeleteMetaCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMetaCategory"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMetaCategoryResponse());
    }

    /**
     * @summary Deletes a category.
     *
     * @param request DeleteMetaCategoryRequest
     * @return DeleteMetaCategoryResponse
     */
    public DeleteMetaCategoryResponse deleteMetaCategory(DeleteMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMetaCategoryWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a collection.
     *
     * @param request DeleteMetaCollectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMetaCollectionResponse
     */
    public DeleteMetaCollectionResponse deleteMetaCollectionWithOptions(DeleteMetaCollectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifiedName)) {
            query.put("QualifiedName", request.qualifiedName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMetaCollection"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMetaCollectionResponse());
    }

    /**
     * @summary Deletes a collection.
     *
     * @param request DeleteMetaCollectionRequest
     * @return DeleteMetaCollectionResponse
     */
    public DeleteMetaCollectionResponse deleteMetaCollection(DeleteMetaCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMetaCollectionWithOptions(request, runtime);
    }

    /**
     * @summary Deletes an entity from a collection.
     *
     * @param request DeleteMetaCollectionEntityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMetaCollectionEntityResponse
     */
    public DeleteMetaCollectionEntityResponse deleteMetaCollectionEntityWithOptions(DeleteMetaCollectionEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collectionQualifiedName)) {
            query.put("CollectionQualifiedName", request.collectionQualifiedName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityQualifiedName)) {
            query.put("EntityQualifiedName", request.entityQualifiedName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMetaCollectionEntity"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMetaCollectionEntityResponse());
    }

    /**
     * @summary Deletes an entity from a collection.
     *
     * @param request DeleteMetaCollectionEntityRequest
     * @return DeleteMetaCollectionEntityResponse
     */
    public DeleteMetaCollectionEntityResponse deleteMetaCollectionEntity(DeleteMetaCollectionEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMetaCollectionEntityWithOptions(request, runtime);
    }

    /**
     * @param request DeleteProjectMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProjectMemberResponse
     */
    public DeleteProjectMemberResponse deleteProjectMemberWithOptions(DeleteProjectMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProjectMember"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProjectMemberResponse());
    }

    /**
     * @param request DeleteProjectMemberRequest
     * @return DeleteProjectMemberResponse
     */
    public DeleteProjectMemberResponse deleteProjectMember(DeleteProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProjectMemberWithOptions(request, runtime);
    }

    /**
     * @param request DeleteQualityEntityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteQualityEntityResponse
     */
    public DeleteQualityEntityResponse deleteQualityEntityWithOptions(DeleteQualityEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            body.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            body.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteQualityEntity"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQualityEntityResponse());
    }

    /**
     * @param request DeleteQualityEntityRequest
     * @return DeleteQualityEntityResponse
     */
    public DeleteQualityEntityResponse deleteQualityEntity(DeleteQualityEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQualityEntityWithOptions(request, runtime);
    }

    /**
     * @description In Data Quality, you must configure monitoring rules based on a partition filter expression. Data Quality uses these rules to detect changes in source data and dirty data generated during the process of extract, transformation, load (ETL). Thereby, Data Quality automatically blocks the nodes that involve dirty data to stop dirty data from spreading downstream. This prevents nodes from producing unexpected dirty data that affects normal use and business decisions. You can go to the Manage Subscriptions page to add subscribers for a partition filter expression. When the monitoring rule described by the partition filter expression is triggered, the subscribers can receive notifications and troubleshoot errors in a timely manner. For more information, see [Configure monitoring rules for MaxCompute](https://help.aliyun.com/document_detail/73690.html).
     *
     * @param request DeleteQualityFollowerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteQualityFollowerResponse
     */
    public DeleteQualityFollowerResponse deleteQualityFollowerWithOptions(DeleteQualityFollowerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.followerId)) {
            body.put("FollowerId", request.followerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteQualityFollower"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQualityFollowerResponse());
    }

    /**
     * @description In Data Quality, you must configure monitoring rules based on a partition filter expression. Data Quality uses these rules to detect changes in source data and dirty data generated during the process of extract, transformation, load (ETL). Thereby, Data Quality automatically blocks the nodes that involve dirty data to stop dirty data from spreading downstream. This prevents nodes from producing unexpected dirty data that affects normal use and business decisions. You can go to the Manage Subscriptions page to add subscribers for a partition filter expression. When the monitoring rule described by the partition filter expression is triggered, the subscribers can receive notifications and troubleshoot errors in a timely manner. For more information, see [Configure monitoring rules for MaxCompute](https://help.aliyun.com/document_detail/73690.html).
     *
     * @param request DeleteQualityFollowerRequest
     * @return DeleteQualityFollowerResponse
     */
    public DeleteQualityFollowerResponse deleteQualityFollower(DeleteQualityFollowerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQualityFollowerWithOptions(request, runtime);
    }

    /**
     * @param request DeleteQualityRelativeNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteQualityRelativeNodeResponse
     */
    public DeleteQualityRelativeNodeResponse deleteQualityRelativeNodeWithOptions(DeleteQualityRelativeNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            body.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchExpression)) {
            body.put("MatchExpression", request.matchExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetNodeProjectId)) {
            body.put("TargetNodeProjectId", request.targetNodeProjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetNodeProjectName)) {
            body.put("TargetNodeProjectName", request.targetNodeProjectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteQualityRelativeNode"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQualityRelativeNodeResponse());
    }

    /**
     * @param request DeleteQualityRelativeNodeRequest
     * @return DeleteQualityRelativeNodeResponse
     */
    public DeleteQualityRelativeNodeResponse deleteQualityRelativeNode(DeleteQualityRelativeNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQualityRelativeNodeWithOptions(request, runtime);
    }

    /**
     * @param request DeleteQualityRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteQualityRuleResponse
     */
    public DeleteQualityRuleResponse deleteQualityRuleWithOptions(DeleteQualityRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            body.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteQualityRule"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQualityRuleResponse());
    }

    /**
     * @param request DeleteQualityRuleRequest
     * @return DeleteQualityRuleResponse
     */
    public DeleteQualityRuleResponse deleteQualityRule(DeleteQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQualityRuleWithOptions(request, runtime);
    }

    /**
     * @summary 删除识别规则
     *
     * @param request DeleteRecognizeRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRecognizeRuleResponse
     */
    public DeleteRecognizeRuleResponse deleteRecognizeRuleWithOptions(DeleteRecognizeRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveId)) {
            body.put("SensitiveId", request.sensitiveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRecognizeRule"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRecognizeRuleResponse());
    }

    /**
     * @summary 删除识别规则
     *
     * @param request DeleteRecognizeRuleRequest
     * @return DeleteRecognizeRuleResponse
     */
    public DeleteRecognizeRuleResponse deleteRecognizeRule(DeleteRecognizeRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRecognizeRuleWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a custom alert rule.
     *
     * @param request DeleteRemindRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRemindResponse
     */
    public DeleteRemindResponse deleteRemindWithOptions(DeleteRemindRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.remindId)) {
            body.put("RemindId", request.remindId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRemind"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRemindResponse());
    }

    /**
     * @summary Deletes a custom alert rule.
     *
     * @param request DeleteRemindRequest
     * @return DeleteRemindResponse
     */
    public DeleteRemindResponse deleteRemind(DeleteRemindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRemindWithOptions(request, runtime);
    }

    /**
     * @param request DeleteTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTableResponse
     */
    public DeleteTableResponse deleteTableWithOptions(DeleteTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appGuid)) {
            query.put("AppGuid", request.appGuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            query.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schema)) {
            query.put("Schema", request.schema);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTable"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTableResponse());
    }

    /**
     * @param request DeleteTableRequest
     * @return DeleteTableResponse
     */
    public DeleteTableResponse deleteTable(DeleteTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTableWithOptions(request, runtime);
    }

    /**
     * @param request DeleteTableLevelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTableLevelResponse
     */
    public DeleteTableLevelResponse deleteTableLevelWithOptions(DeleteTableLevelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.levelId)) {
            query.put("LevelId", request.levelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTableLevel"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTableLevelResponse());
    }

    /**
     * @param request DeleteTableLevelRequest
     * @return DeleteTableLevelResponse
     */
    public DeleteTableLevelResponse deleteTableLevel(DeleteTableLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTableLevelWithOptions(request, runtime);
    }

    /**
     * @param request DeleteTableThemeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTableThemeResponse
     */
    public DeleteTableThemeResponse deleteTableThemeWithOptions(DeleteTableThemeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.themeId)) {
            query.put("ThemeId", request.themeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTableTheme"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTableThemeResponse());
    }

    /**
     * @param request DeleteTableThemeRequest
     * @return DeleteTableThemeResponse
     */
    public DeleteTableThemeResponse deleteTableTheme(DeleteTableThemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTableThemeWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform. Set the value to **DeployDISyncTask**.
     *
     * @param request DeployDISyncTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeployDISyncTaskResponse
     */
    public DeployDISyncTaskResponse deployDISyncTaskWithOptions(DeployDISyncTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployDISyncTask"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployDISyncTaskResponse());
    }

    /**
     * @summary The operation that you want to perform. Set the value to **DeployDISyncTask**.
     *
     * @param request DeployDISyncTaskRequest
     * @return DeployDISyncTaskResponse
     */
    public DeployDISyncTaskResponse deployDISyncTask(DeployDISyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deployDISyncTaskWithOptions(request, runtime);
    }

    /**
     * @param request DeployFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeployFileResponse
     */
    public DeployFileResponse deployFileWithOptions(DeployFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployFile"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployFileResponse());
    }

    /**
     * @param request DeployFileRequest
     * @return DeployFileResponse
     */
    public DeployFileResponse deployFile(DeployFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deployFileWithOptions(request, runtime);
    }

    /**
     * @param request DesensitizeDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DesensitizeDataResponse
     */
    public DesensitizeDataResponse desensitizeDataWithOptions(DesensitizeDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DesensitizeData"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DesensitizeDataResponse());
    }

    /**
     * @param request DesensitizeDataRequest
     * @return DesensitizeDataResponse
     */
    public DesensitizeDataResponse desensitizeData(DesensitizeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.desensitizeDataWithOptions(request, runtime);
    }

    /**
     * @summary 新增或编辑脱敏规则
     *
     * @param tmpReq DsgDesensPlanAddOrUpdateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DsgDesensPlanAddOrUpdateResponse
     */
    public DsgDesensPlanAddOrUpdateResponse dsgDesensPlanAddOrUpdateWithOptions(DsgDesensPlanAddOrUpdateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DsgDesensPlanAddOrUpdateShrinkRequest request = new DsgDesensPlanAddOrUpdateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.desensRules)) {
            request.desensRulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.desensRules, "DesensRules", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desensRulesShrink)) {
            query.put("DesensRules", request.desensRulesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DsgDesensPlanAddOrUpdate"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DsgDesensPlanAddOrUpdateResponse());
    }

    /**
     * @summary 新增或编辑脱敏规则
     *
     * @param request DsgDesensPlanAddOrUpdateRequest
     * @return DsgDesensPlanAddOrUpdateResponse
     */
    public DsgDesensPlanAddOrUpdateResponse dsgDesensPlanAddOrUpdate(DsgDesensPlanAddOrUpdateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgDesensPlanAddOrUpdateWithOptions(request, runtime);
    }

    /**
     * @summary 删除脱敏规则
     *
     * @param tmpReq DsgDesensPlanDeleteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DsgDesensPlanDeleteResponse
     */
    public DsgDesensPlanDeleteResponse dsgDesensPlanDeleteWithOptions(DsgDesensPlanDeleteRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DsgDesensPlanDeleteShrinkRequest request = new DsgDesensPlanDeleteShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            query.put("Ids", request.idsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneCode)) {
            query.put("SceneCode", request.sceneCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DsgDesensPlanDelete"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DsgDesensPlanDeleteResponse());
    }

    /**
     * @summary 删除脱敏规则
     *
     * @param request DsgDesensPlanDeleteRequest
     * @return DsgDesensPlanDeleteResponse
     */
    public DsgDesensPlanDeleteResponse dsgDesensPlanDelete(DsgDesensPlanDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgDesensPlanDeleteWithOptions(request, runtime);
    }

    /**
     * @summary 查询脱敏规则列表
     *
     * @param request DsgDesensPlanQueryListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DsgDesensPlanQueryListResponse
     */
    public DsgDesensPlanQueryListResponse dsgDesensPlanQueryListWithOptions(DsgDesensPlanQueryListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DsgDesensPlanQueryList"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DsgDesensPlanQueryListResponse());
    }

    /**
     * @summary 查询脱敏规则列表
     *
     * @param request DsgDesensPlanQueryListRequest
     * @return DsgDesensPlanQueryListResponse
     */
    public DsgDesensPlanQueryListResponse dsgDesensPlanQueryList(DsgDesensPlanQueryListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgDesensPlanQueryListWithOptions(request, runtime);
    }

    /**
     * @summary 修改脱敏规则生效状态
     *
     * @param tmpReq DsgDesensPlanUpdateStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DsgDesensPlanUpdateStatusResponse
     */
    public DsgDesensPlanUpdateStatusResponse dsgDesensPlanUpdateStatusWithOptions(DsgDesensPlanUpdateStatusRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DsgDesensPlanUpdateStatusShrinkRequest request = new DsgDesensPlanUpdateStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            query.put("Ids", request.idsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneCode)) {
            query.put("SceneCode", request.sceneCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DsgDesensPlanUpdateStatus"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DsgDesensPlanUpdateStatusResponse());
    }

    /**
     * @summary 修改脱敏规则生效状态
     *
     * @param request DsgDesensPlanUpdateStatusRequest
     * @return DsgDesensPlanUpdateStatusResponse
     */
    public DsgDesensPlanUpdateStatusResponse dsgDesensPlanUpdateStatus(DsgDesensPlanUpdateStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgDesensPlanUpdateStatusWithOptions(request, runtime);
    }

    /**
     * @summary 查询引擎实例列表
     *
     * @param request DsgPlatformQueryProjectsAndSchemaFromMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DsgPlatformQueryProjectsAndSchemaFromMetaResponse
     */
    public DsgPlatformQueryProjectsAndSchemaFromMetaResponse dsgPlatformQueryProjectsAndSchemaFromMetaWithOptions(DsgPlatformQueryProjectsAndSchemaFromMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DsgPlatformQueryProjectsAndSchemaFromMeta"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DsgPlatformQueryProjectsAndSchemaFromMetaResponse());
    }

    /**
     * @summary 查询引擎实例列表
     *
     * @param request DsgPlatformQueryProjectsAndSchemaFromMetaRequest
     * @return DsgPlatformQueryProjectsAndSchemaFromMetaResponse
     */
    public DsgPlatformQueryProjectsAndSchemaFromMetaResponse dsgPlatformQueryProjectsAndSchemaFromMeta(DsgPlatformQueryProjectsAndSchemaFromMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgPlatformQueryProjectsAndSchemaFromMetaWithOptions(request, runtime);
    }

    /**
     * @summary 查询能够选择的敏感类型模版列表
     *
     * @param request DsgQueryDefaultTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DsgQueryDefaultTemplatesResponse
     */
    public DsgQueryDefaultTemplatesResponse dsgQueryDefaultTemplatesWithOptions(DsgQueryDefaultTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DsgQueryDefaultTemplates"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DsgQueryDefaultTemplatesResponse());
    }

    /**
     * @summary 查询能够选择的敏感类型模版列表
     *
     * @param request DsgQueryDefaultTemplatesRequest
     * @return DsgQueryDefaultTemplatesResponse
     */
    public DsgQueryDefaultTemplatesResponse dsgQueryDefaultTemplates(DsgQueryDefaultTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgQueryDefaultTemplatesWithOptions(request, runtime);
    }

    /**
     * @summary 识别结果查询
     *
     * @param request DsgQuerySensResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DsgQuerySensResultResponse
     */
    public DsgQuerySensResultResponse dsgQuerySensResultWithOptions(DsgQuerySensResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.col)) {
            body.put("Col", request.col);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbType)) {
            body.put("DbType", request.dbType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            body.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeName)) {
            body.put("NodeName", request.nodeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderField)) {
            body.put("OrderField", request.orderField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            body.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            body.put("SchemaName", request.schemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensStatus)) {
            body.put("SensStatus", request.sensStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveId)) {
            body.put("SensitiveId", request.sensitiveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveName)) {
            body.put("SensitiveName", request.sensitiveName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.table)) {
            body.put("Table", request.table);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DsgQuerySensResult"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DsgQuerySensResultResponse());
    }

    /**
     * @summary 识别结果查询
     *
     * @param request DsgQuerySensResultRequest
     * @return DsgQuerySensResultResponse
     */
    public DsgQuerySensResultResponse dsgQuerySensResult(DsgQuerySensResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgQuerySensResultWithOptions(request, runtime);
    }

    /**
     * @param tmpReq DsgRunSensIdentifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DsgRunSensIdentifyResponse
     */
    public DsgRunSensIdentifyResponse dsgRunSensIdentifyWithOptions(DsgRunSensIdentifyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DsgRunSensIdentifyShrinkRequest request = new DsgRunSensIdentifyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.esMetaParams)) {
            request.esMetaParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.esMetaParams, "EsMetaParams", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.esMetaParamsShrink)) {
            body.put("EsMetaParams", request.esMetaParamsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DsgRunSensIdentify"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DsgRunSensIdentifyResponse());
    }

    /**
     * @param request DsgRunSensIdentifyRequest
     * @return DsgRunSensIdentifyResponse
     */
    public DsgRunSensIdentifyResponse dsgRunSensIdentify(DsgRunSensIdentifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgRunSensIdentifyWithOptions(request, runtime);
    }

    /**
     * @summary 新增或编辑二级场景
     *
     * @param tmpReq DsgSceneAddOrUpdateSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DsgSceneAddOrUpdateSceneResponse
     */
    public DsgSceneAddOrUpdateSceneResponse dsgSceneAddOrUpdateSceneWithOptions(DsgSceneAddOrUpdateSceneRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DsgSceneAddOrUpdateSceneShrinkRequest request = new DsgSceneAddOrUpdateSceneShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scenes)) {
            request.scenesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scenes, "scenes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scenesShrink)) {
            query.put("scenes", request.scenesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DsgSceneAddOrUpdateScene"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DsgSceneAddOrUpdateSceneResponse());
    }

    /**
     * @summary 新增或编辑二级场景
     *
     * @param request DsgSceneAddOrUpdateSceneRequest
     * @return DsgSceneAddOrUpdateSceneResponse
     */
    public DsgSceneAddOrUpdateSceneResponse dsgSceneAddOrUpdateScene(DsgSceneAddOrUpdateSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgSceneAddOrUpdateSceneWithOptions(request, runtime);
    }

    /**
     * @summary 查询场景列表
     *
     * @param request DsgSceneQuerySceneListByNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DsgSceneQuerySceneListByNameResponse
     */
    public DsgSceneQuerySceneListByNameResponse dsgSceneQuerySceneListByNameWithOptions(DsgSceneQuerySceneListByNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DsgSceneQuerySceneListByName"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DsgSceneQuerySceneListByNameResponse());
    }

    /**
     * @summary 查询场景列表
     *
     * @param request DsgSceneQuerySceneListByNameRequest
     * @return DsgSceneQuerySceneListByNameResponse
     */
    public DsgSceneQuerySceneListByNameResponse dsgSceneQuerySceneListByName(DsgSceneQuerySceneListByNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgSceneQuerySceneListByNameWithOptions(request, runtime);
    }

    /**
     * @summary 删除二级场景
     *
     * @param tmpReq DsgScenedDeleteSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DsgScenedDeleteSceneResponse
     */
    public DsgScenedDeleteSceneResponse dsgScenedDeleteSceneWithOptions(DsgScenedDeleteSceneRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DsgScenedDeleteSceneShrinkRequest request = new DsgScenedDeleteSceneShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            query.put("Ids", request.idsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DsgScenedDeleteScene"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DsgScenedDeleteSceneResponse());
    }

    /**
     * @summary 删除二级场景
     *
     * @param request DsgScenedDeleteSceneRequest
     * @return DsgScenedDeleteSceneResponse
     */
    public DsgScenedDeleteSceneResponse dsgScenedDeleteScene(DsgScenedDeleteSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgScenedDeleteSceneWithOptions(request, runtime);
    }

    /**
     * @summary 识别任务停止
     *
     * @param request DsgStopSensIdentifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DsgStopSensIdentifyResponse
     */
    public DsgStopSensIdentifyResponse dsgStopSensIdentifyWithOptions(DsgStopSensIdentifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DsgStopSensIdentify"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DsgStopSensIdentifyResponse());
    }

    /**
     * @summary 识别任务停止
     *
     * @param request DsgStopSensIdentifyRequest
     * @return DsgStopSensIdentifyResponse
     */
    public DsgStopSensIdentifyResponse dsgStopSensIdentify(DsgStopSensIdentifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgStopSensIdentifyWithOptions(request, runtime);
    }

    /**
     * @summary 新增或编辑用户组
     *
     * @param tmpReq DsgUserGroupAddOrUpdateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DsgUserGroupAddOrUpdateResponse
     */
    public DsgUserGroupAddOrUpdateResponse dsgUserGroupAddOrUpdateWithOptions(DsgUserGroupAddOrUpdateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DsgUserGroupAddOrUpdateShrinkRequest request = new DsgUserGroupAddOrUpdateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userGroups)) {
            request.userGroupsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userGroups, "UserGroups", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userGroupsShrink)) {
            query.put("UserGroups", request.userGroupsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DsgUserGroupAddOrUpdate"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DsgUserGroupAddOrUpdateResponse());
    }

    /**
     * @summary 新增或编辑用户组
     *
     * @param request DsgUserGroupAddOrUpdateRequest
     * @return DsgUserGroupAddOrUpdateResponse
     */
    public DsgUserGroupAddOrUpdateResponse dsgUserGroupAddOrUpdate(DsgUserGroupAddOrUpdateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgUserGroupAddOrUpdateWithOptions(request, runtime);
    }

    /**
     * @summary 删除用户组
     *
     * @param tmpReq DsgUserGroupDeleteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DsgUserGroupDeleteResponse
     */
    public DsgUserGroupDeleteResponse dsgUserGroupDeleteWithOptions(DsgUserGroupDeleteRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DsgUserGroupDeleteShrinkRequest request = new DsgUserGroupDeleteShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            query.put("Ids", request.idsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DsgUserGroupDelete"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DsgUserGroupDeleteResponse());
    }

    /**
     * @summary 删除用户组
     *
     * @param request DsgUserGroupDeleteRequest
     * @return DsgUserGroupDeleteResponse
     */
    public DsgUserGroupDeleteResponse dsgUserGroupDelete(DsgUserGroupDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgUserGroupDeleteWithOptions(request, runtime);
    }

    /**
     * @param request DsgUserGroupGetOdpsRoleGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DsgUserGroupGetOdpsRoleGroupsResponse
     */
    public DsgUserGroupGetOdpsRoleGroupsResponse dsgUserGroupGetOdpsRoleGroupsWithOptions(DsgUserGroupGetOdpsRoleGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DsgUserGroupGetOdpsRoleGroups"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DsgUserGroupGetOdpsRoleGroupsResponse());
    }

    /**
     * @param request DsgUserGroupGetOdpsRoleGroupsRequest
     * @return DsgUserGroupGetOdpsRoleGroupsResponse
     */
    public DsgUserGroupGetOdpsRoleGroupsResponse dsgUserGroupGetOdpsRoleGroups(DsgUserGroupGetOdpsRoleGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgUserGroupGetOdpsRoleGroupsWithOptions(request, runtime);
    }

    /**
     * @summary 查询用户组列表
     *
     * @param request DsgUserGroupQueryListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DsgUserGroupQueryListResponse
     */
    public DsgUserGroupQueryListResponse dsgUserGroupQueryListWithOptions(DsgUserGroupQueryListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DsgUserGroupQueryList"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DsgUserGroupQueryListResponse());
    }

    /**
     * @summary 查询用户组列表
     *
     * @param request DsgUserGroupQueryListRequest
     * @return DsgUserGroupQueryListResponse
     */
    public DsgUserGroupQueryListResponse dsgUserGroupQueryList(DsgUserGroupQueryListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgUserGroupQueryListWithOptions(request, runtime);
    }

    /**
     * @summary 查询当前用户列表
     *
     * @param request DsgUserGroupQueryUserListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DsgUserGroupQueryUserListResponse
     */
    public DsgUserGroupQueryUserListResponse dsgUserGroupQueryUserListWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DsgUserGroupQueryUserList"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DsgUserGroupQueryUserListResponse());
    }

    /**
     * @summary 查询当前用户列表
     *
     * @return DsgUserGroupQueryUserListResponse
     */
    public DsgUserGroupQueryUserListResponse dsgUserGroupQueryUserList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgUserGroupQueryUserListWithOptions(runtime);
    }

    /**
     * @summary 新增或编辑脱敏白名单
     *
     * @param tmpReq DsgWhiteListAddOrUpdateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DsgWhiteListAddOrUpdateResponse
     */
    public DsgWhiteListAddOrUpdateResponse dsgWhiteListAddOrUpdateWithOptions(DsgWhiteListAddOrUpdateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DsgWhiteListAddOrUpdateShrinkRequest request = new DsgWhiteListAddOrUpdateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.whiteLists)) {
            request.whiteListsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.whiteLists, "WhiteLists", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.whiteListsShrink)) {
            query.put("WhiteLists", request.whiteListsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DsgWhiteListAddOrUpdate"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DsgWhiteListAddOrUpdateResponse());
    }

    /**
     * @summary 新增或编辑脱敏白名单
     *
     * @param request DsgWhiteListAddOrUpdateRequest
     * @return DsgWhiteListAddOrUpdateResponse
     */
    public DsgWhiteListAddOrUpdateResponse dsgWhiteListAddOrUpdate(DsgWhiteListAddOrUpdateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgWhiteListAddOrUpdateWithOptions(request, runtime);
    }

    /**
     * @summary 删除脱敏白名单
     *
     * @param tmpReq DsgWhiteListDeleteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DsgWhiteListDeleteListResponse
     */
    public DsgWhiteListDeleteListResponse dsgWhiteListDeleteListWithOptions(DsgWhiteListDeleteListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DsgWhiteListDeleteListShrinkRequest request = new DsgWhiteListDeleteListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            query.put("Ids", request.idsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DsgWhiteListDeleteList"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DsgWhiteListDeleteListResponse());
    }

    /**
     * @summary 删除脱敏白名单
     *
     * @param request DsgWhiteListDeleteListRequest
     * @return DsgWhiteListDeleteListResponse
     */
    public DsgWhiteListDeleteListResponse dsgWhiteListDeleteList(DsgWhiteListDeleteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgWhiteListDeleteListWithOptions(request, runtime);
    }

    /**
     * @summary 查询脱敏白名单
     *
     * @param request DsgWhiteListQueryListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DsgWhiteListQueryListResponse
     */
    public DsgWhiteListQueryListResponse dsgWhiteListQueryListWithOptions(DsgWhiteListQueryListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DsgWhiteListQueryList"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DsgWhiteListQueryListResponse());
    }

    /**
     * @summary 查询脱敏白名单
     *
     * @param request DsgWhiteListQueryListRequest
     * @return DsgWhiteListQueryListResponse
     */
    public DsgWhiteListQueryListResponse dsgWhiteListQueryList(DsgWhiteListQueryListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgWhiteListQueryListWithOptions(request, runtime);
    }

    /**
     * @summary 修改识别规则
     *
     * @param request EditRecognizeRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EditRecognizeRuleResponse
     */
    public EditRecognizeRuleResponse editRecognizeRuleWithOptions(EditRecognizeRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.colExclude)) {
            body.put("ColExclude", request.colExclude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.colScan)) {
            body.put("ColScan", request.colScan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commentScan)) {
            body.put("CommentScan", request.commentScan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentScan)) {
            body.put("ContentScan", request.contentScan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hitThreshold)) {
            body.put("HitThreshold", request.hitThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.levelName)) {
            body.put("LevelName", request.levelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeParent)) {
            body.put("NodeParent", request.nodeParent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            body.put("OperationType", request.operationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recognizeRules)) {
            body.put("RecognizeRules", request.recognizeRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recognizeRulesType)) {
            body.put("RecognizeRulesType", request.recognizeRulesType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveDescription)) {
            body.put("SensitiveDescription", request.sensitiveDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveId)) {
            body.put("SensitiveId", request.sensitiveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveName)) {
            body.put("SensitiveName", request.sensitiveName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            body.put("level", request.level);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EditRecognizeRule"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EditRecognizeRuleResponse());
    }

    /**
     * @summary 修改识别规则
     *
     * @param request EditRecognizeRuleRequest
     * @return EditRecognizeRuleResponse
     */
    public EditRecognizeRuleResponse editRecognizeRule(EditRecognizeRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.editRecognizeRuleWithOptions(request, runtime);
    }

    /**
     * @param request EstablishRelationTableToBusinessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EstablishRelationTableToBusinessResponse
     */
    public EstablishRelationTableToBusinessResponse establishRelationTableToBusinessWithOptions(EstablishRelationTableToBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessId)) {
            body.put("BusinessId", request.businessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("FolderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableGuid)) {
            body.put("TableGuid", request.tableGuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EstablishRelationTableToBusiness"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EstablishRelationTableToBusinessResponse());
    }

    /**
     * @param request EstablishRelationTableToBusinessRequest
     * @return EstablishRelationTableToBusinessResponse
     */
    public EstablishRelationTableToBusinessResponse establishRelationTableToBusiness(EstablishRelationTableToBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.establishRelationTableToBusinessWithOptions(request, runtime);
    }

    /**
     * @param request ExportDataSourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportDataSourcesResponse
     */
    public ExportDataSourcesResponse exportDataSourcesWithOptions(ExportDataSourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportDataSources"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportDataSourcesResponse());
    }

    /**
     * @param request ExportDataSourcesRequest
     * @return ExportDataSourcesResponse
     */
    public ExportDataSourcesResponse exportDataSources(ExportDataSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportDataSourcesWithOptions(request, runtime);
    }

    /**
     * @summary DataWorks allows you to use only the [CreateDISyncTask](https://help.aliyun.com/document_detail/278725.html) operation to create a batch synchronization node in Data Integration. To create a real-time synchronization node or a synchronization solution, you must first call the [GenerateDISyncTaskConfigForCreating](https://help.aliyun.com/document_detail/383463.html) operation to generate the ID of an asynchronous thread and call the [QueryDISyncTaskConfigProcessResult](https://help.aliyun.com/document_detail/383465.html) operation to obtain the asynchronously generated parameters based on the ID. Then, you can call the [CreateDISyncTask](https://help.aliyun.com/document_detail/278725.html) operation and use the parameters as request parameters to create a real-time synchronization node or a synchronization solution in Data Integration.
     * DataWorks allows you to create real-time synchronization nodes and synchronization solutions in Data Integration only in asynchronous mode.
     *
     * @description The operation that you want to perform.
     *
     * @param request GenerateDISyncTaskConfigForCreatingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateDISyncTaskConfigForCreatingResponse
     */
    public GenerateDISyncTaskConfigForCreatingResponse generateDISyncTaskConfigForCreatingWithOptions(GenerateDISyncTaskConfigForCreatingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskParam)) {
            query.put("TaskParam", request.taskParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateDISyncTaskConfigForCreating"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateDISyncTaskConfigForCreatingResponse());
    }

    /**
     * @summary DataWorks allows you to use only the [CreateDISyncTask](https://help.aliyun.com/document_detail/278725.html) operation to create a batch synchronization node in Data Integration. To create a real-time synchronization node or a synchronization solution, you must first call the [GenerateDISyncTaskConfigForCreating](https://help.aliyun.com/document_detail/383463.html) operation to generate the ID of an asynchronous thread and call the [QueryDISyncTaskConfigProcessResult](https://help.aliyun.com/document_detail/383465.html) operation to obtain the asynchronously generated parameters based on the ID. Then, you can call the [CreateDISyncTask](https://help.aliyun.com/document_detail/278725.html) operation and use the parameters as request parameters to create a real-time synchronization node or a synchronization solution in Data Integration.
     * DataWorks allows you to create real-time synchronization nodes and synchronization solutions in Data Integration only in asynchronous mode.
     *
     * @description The operation that you want to perform.
     *
     * @param request GenerateDISyncTaskConfigForCreatingRequest
     * @return GenerateDISyncTaskConfigForCreatingResponse
     */
    public GenerateDISyncTaskConfigForCreatingResponse generateDISyncTaskConfigForCreating(GenerateDISyncTaskConfigForCreatingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateDISyncTaskConfigForCreatingWithOptions(request, runtime);
    }

    /**
     * @summary DataWorks allows you to use only the [UpdateDISyncTask](https://help.aliyun.com/document_detail/289109.html) operation to update a batch synchronization node in Data Integration. To update a real-time synchronization node or a synchronization solution, you must first call the GenerateDISyncTaskConfigForUpdating operation to generate the ID of an asynchronous thread and call the [QueryDISyncTaskConfigProcessResult](https://help.aliyun.com/document_detail/383465.html) operation to obtain the asynchronously generated parameters based on the ID. Then, you can call the UpdateDISyncTask operation and use the parameters as request parameters to update a real-time synchronization node or a synchronization solution in Data Integration. DataWorks allows you to update real-time synchronization nodes and synchronization solutions in Data Integration only in asynchronous mode.
     *
     * @description The operation that you want to perform.
     *
     * @param request GenerateDISyncTaskConfigForUpdatingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateDISyncTaskConfigForUpdatingResponse
     */
    public GenerateDISyncTaskConfigForUpdatingResponse generateDISyncTaskConfigForUpdatingWithOptions(GenerateDISyncTaskConfigForUpdatingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskParam)) {
            query.put("TaskParam", request.taskParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateDISyncTaskConfigForUpdating"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateDISyncTaskConfigForUpdatingResponse());
    }

    /**
     * @summary DataWorks allows you to use only the [UpdateDISyncTask](https://help.aliyun.com/document_detail/289109.html) operation to update a batch synchronization node in Data Integration. To update a real-time synchronization node or a synchronization solution, you must first call the GenerateDISyncTaskConfigForUpdating operation to generate the ID of an asynchronous thread and call the [QueryDISyncTaskConfigProcessResult](https://help.aliyun.com/document_detail/383465.html) operation to obtain the asynchronously generated parameters based on the ID. Then, you can call the UpdateDISyncTask operation and use the parameters as request parameters to update a real-time synchronization node or a synchronization solution in Data Integration. DataWorks allows you to update real-time synchronization nodes and synchronization solutions in Data Integration only in asynchronous mode.
     *
     * @description The operation that you want to perform.
     *
     * @param request GenerateDISyncTaskConfigForUpdatingRequest
     * @return GenerateDISyncTaskConfigForUpdatingResponse
     */
    public GenerateDISyncTaskConfigForUpdatingResponse generateDISyncTaskConfigForUpdating(GenerateDISyncTaskConfigForUpdatingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateDISyncTaskConfigForUpdatingWithOptions(request, runtime);
    }

    /**
     * @summary 获取告警信息
     *
     * @param request GetAlertMessageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAlertMessageResponse
     */
    public GetAlertMessageResponse getAlertMessageWithOptions(GetAlertMessageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertId)) {
            body.put("AlertId", request.alertId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlertMessage"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlertMessageResponse());
    }

    /**
     * @summary 获取告警信息
     *
     * @param request GetAlertMessageRequest
     * @return GetAlertMessageResponse
     */
    public GetAlertMessageResponse getAlertMessage(GetAlertMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAlertMessageWithOptions(request, runtime);
    }

    /**
     * @summary 根据基线id查询基线
     *
     * @param request GetBaselineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBaselineResponse
     */
    public GetBaselineResponse getBaselineWithOptions(GetBaselineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baselineId)) {
            body.put("BaselineId", request.baselineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBaseline"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBaselineResponse());
    }

    /**
     * @summary 根据基线id查询基线
     *
     * @param request GetBaselineRequest
     * @return GetBaselineResponse
     */
    public GetBaselineResponse getBaseline(GetBaselineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBaselineWithOptions(request, runtime);
    }

    /**
     * @param request GetBaselineConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBaselineConfigResponse
     */
    public GetBaselineConfigResponse getBaselineConfigWithOptions(GetBaselineConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baselineId)) {
            body.put("BaselineId", request.baselineId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBaselineConfig"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBaselineConfigResponse());
    }

    /**
     * @param request GetBaselineConfigRequest
     * @return GetBaselineConfigResponse
     */
    public GetBaselineConfigResponse getBaselineConfig(GetBaselineConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBaselineConfigWithOptions(request, runtime);
    }

    /**
     * @summary The information about the events that are associated with the instance.
     *
     * @param request GetBaselineKeyPathRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBaselineKeyPathResponse
     */
    public GetBaselineKeyPathResponse getBaselineKeyPathWithOptions(GetBaselineKeyPathRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baselineId)) {
            body.put("BaselineId", request.baselineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizdate)) {
            body.put("Bizdate", request.bizdate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inGroupId)) {
            body.put("InGroupId", request.inGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBaselineKeyPath"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBaselineKeyPathResponse());
    }

    /**
     * @summary The information about the events that are associated with the instance.
     *
     * @param request GetBaselineKeyPathRequest
     * @return GetBaselineKeyPathResponse
     */
    public GetBaselineKeyPathResponse getBaselineKeyPath(GetBaselineKeyPathRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBaselineKeyPathWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of a baseline instance.
     *
     * @param request GetBaselineStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBaselineStatusResponse
     */
    public GetBaselineStatusResponse getBaselineStatusWithOptions(GetBaselineStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baselineId)) {
            body.put("BaselineId", request.baselineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizdate)) {
            body.put("Bizdate", request.bizdate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inGroupId)) {
            body.put("InGroupId", request.inGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBaselineStatus"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBaselineStatusResponse());
    }

    /**
     * @summary Queries the details of a baseline instance.
     *
     * @param request GetBaselineStatusRequest
     * @return GetBaselineStatusResponse
     */
    public GetBaselineStatusResponse getBaselineStatus(GetBaselineStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBaselineStatusWithOptions(request, runtime);
    }

    /**
     * @param request GetBusinessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBusinessResponse
     */
    public GetBusinessResponse getBusinessWithOptions(GetBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessId)) {
            body.put("BusinessId", request.businessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBusiness"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBusinessResponse());
    }

    /**
     * @param request GetBusinessRequest
     * @return GetBusinessResponse
     */
    public GetBusinessResponse getBusiness(GetBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBusinessWithOptions(request, runtime);
    }

    /**
     * @summary Queries the status of a table creation, update, or deletion task.
     *
     * @param request GetDDLJobStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDDLJobStatusResponse
     */
    public GetDDLJobStatusResponse getDDLJobStatusWithOptions(GetDDLJobStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDDLJobStatus"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDDLJobStatusResponse());
    }

    /**
     * @summary Queries the status of a table creation, update, or deletion task.
     *
     * @param request GetDDLJobStatusRequest
     * @return GetDDLJobStatusResponse
     */
    public GetDDLJobStatusResponse getDDLJobStatus(GetDDLJobStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDDLJobStatusWithOptions(request, runtime);
    }

    /**
     * @summary 查询数据集成新版告警规则
     *
     * @param request GetDIAlarmRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDIAlarmRuleResponse
     */
    public GetDIAlarmRuleResponse getDIAlarmRuleWithOptions(GetDIAlarmRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DIAlarmRuleId)) {
            body.put("DIAlarmRuleId", request.DIAlarmRuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDIAlarmRule"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDIAlarmRuleResponse());
    }

    /**
     * @summary 查询数据集成新版告警规则
     *
     * @param request GetDIAlarmRuleRequest
     * @return GetDIAlarmRuleResponse
     */
    public GetDIAlarmRuleResponse getDIAlarmRule(GetDIAlarmRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDIAlarmRuleWithOptions(request, runtime);
    }

    /**
     * @summary 查询数据集成新版解决方案任务
     *
     * @param request GetDIJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDIJobResponse
     */
    public GetDIJobResponse getDIJobWithOptions(GetDIJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DIJobId)) {
            body.put("DIJobId", request.DIJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withDetails)) {
            body.put("WithDetails", request.withDetails);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDIJob"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDIJobResponse());
    }

    /**
     * @summary 查询数据集成新版解决方案任务
     *
     * @param request GetDIJobRequest
     * @return GetDIJobResponse
     */
    public GetDIJobResponse getDIJob(GetDIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDIJobWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform. Set the value to **GetDISyncInstanceInfo**.
     *
     * @param request GetDISyncInstanceInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDISyncInstanceInfoResponse
     */
    public GetDISyncInstanceInfoResponse getDISyncInstanceInfoWithOptions(GetDISyncInstanceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDISyncInstanceInfo"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDISyncInstanceInfoResponse());
    }

    /**
     * @summary The operation that you want to perform. Set the value to **GetDISyncInstanceInfo**.
     *
     * @param request GetDISyncInstanceInfoRequest
     * @return GetDISyncInstanceInfoResponse
     */
    public GetDISyncInstanceInfoResponse getDISyncInstanceInfo(GetDISyncInstanceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDISyncInstanceInfoWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform. Set the value to **GetDISyncTask**.
     *
     * @param request GetDISyncTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDISyncTaskResponse
     */
    public GetDISyncTaskResponse getDISyncTaskWithOptions(GetDISyncTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDISyncTask"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDISyncTaskResponse());
    }

    /**
     * @summary The operation that you want to perform. Set the value to **GetDISyncTask**.
     *
     * @param request GetDISyncTaskRequest
     * @return GetDISyncTaskResponse
     */
    public GetDISyncTaskResponse getDISyncTask(GetDISyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDISyncTaskWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of a directed acyclic graph (DAG) based on the ID of the DAG.
     *                   You can call the GetDag operation to query the details of the DAG for a manually triggered
     *                   workflow, a manually triggered node, or a data backfill instance. However, you cannot
     *                   query the details of the DAG for an auto triggered node or an auto triggered workflow.
     *
     * @description Supported DAG types:
     * *   MANUAL: the DAG for a manually triggered workflow.
     * *   SMOKE_TEST: the DAG for a smoke testing workflow.
     * *   SUPPLY_DATA: the DAG for a data backfill instance.
     * *   BUSINESS_PROCESS_DAG: the DAG for a one-time workflow.
     * Supported DAG states:
     * *   CREATED: The DAG is created.
     * *   RUNNING: The DAG is running.
     * *   FAILURE: The DAG fails to run.
     * *   SUCCESS: The DAG successfully runs.
     *
     * @param request GetDagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDagResponse
     */
    public GetDagResponse getDagWithOptions(GetDagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            body.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDag"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDagResponse());
    }

    /**
     * @summary Queries the details of a directed acyclic graph (DAG) based on the ID of the DAG.
     *                   You can call the GetDag operation to query the details of the DAG for a manually triggered
     *                   workflow, a manually triggered node, or a data backfill instance. However, you cannot
     *                   query the details of the DAG for an auto triggered node or an auto triggered workflow.
     *
     * @description Supported DAG types:
     * *   MANUAL: the DAG for a manually triggered workflow.
     * *   SMOKE_TEST: the DAG for a smoke testing workflow.
     * *   SUPPLY_DATA: the DAG for a data backfill instance.
     * *   BUSINESS_PROCESS_DAG: the DAG for a one-time workflow.
     * Supported DAG states:
     * *   CREATED: The DAG is created.
     * *   RUNNING: The DAG is running.
     * *   FAILURE: The DAG fails to run.
     * *   SUCCESS: The DAG successfully runs.
     *
     * @param request GetDagRequest
     * @return GetDagResponse
     */
    public GetDagResponse getDag(GetDagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDagWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of a DataService Studio API in the development state.
     *
     * @param request GetDataServiceApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataServiceApiResponse
     */
    public GetDataServiceApiResponse getDataServiceApiWithOptions(GetDataServiceApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            body.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataServiceApi"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataServiceApiResponse());
    }

    /**
     * @summary Queries the details of a DataService Studio API in the development state.
     *
     * @param request GetDataServiceApiRequest
     * @return GetDataServiceApiResponse
     */
    public GetDataServiceApiResponse getDataServiceApi(GetDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceApiWithOptions(request, runtime);
    }

    /**
     * @param request GetDataServiceApiTestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataServiceApiTestResponse
     */
    public GetDataServiceApiTestResponse getDataServiceApiTestWithOptions(GetDataServiceApiTestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataServiceApiTest"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataServiceApiTestResponse());
    }

    /**
     * @param request GetDataServiceApiTestRequest
     * @return GetDataServiceApiTestResponse
     */
    public GetDataServiceApiTestResponse getDataServiceApiTest(GetDataServiceApiTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceApiTestWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of an application.
     *
     * @param request GetDataServiceApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataServiceApplicationResponse
     */
    public GetDataServiceApplicationResponse getDataServiceApplicationWithOptions(GetDataServiceApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            body.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataServiceApplication"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataServiceApplicationResponse());
    }

    /**
     * @summary Queries the details of an application.
     *
     * @param request GetDataServiceApplicationRequest
     * @return GetDataServiceApplicationResponse
     */
    public GetDataServiceApplicationResponse getDataServiceApplication(GetDataServiceApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceApplicationWithOptions(request, runtime);
    }

    /**
     * @summary Queries a folder.
     *
     * @param request GetDataServiceFolderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataServiceFolderResponse
     */
    public GetDataServiceFolderResponse getDataServiceFolderWithOptions(GetDataServiceFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("FolderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataServiceFolder"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataServiceFolderResponse());
    }

    /**
     * @summary Queries a folder.
     *
     * @param request GetDataServiceFolderRequest
     * @return GetDataServiceFolderResponse
     */
    public GetDataServiceFolderResponse getDataServiceFolder(GetDataServiceFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceFolderWithOptions(request, runtime);
    }

    /**
     * @summary Queries a business process.
     *
     * @param request GetDataServiceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataServiceGroupResponse
     */
    public GetDataServiceGroupResponse getDataServiceGroupWithOptions(GetDataServiceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataServiceGroup"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataServiceGroupResponse());
    }

    /**
     * @summary Queries a business process.
     *
     * @param request GetDataServiceGroupRequest
     * @return GetDataServiceGroupResponse
     */
    public GetDataServiceGroupResponse getDataServiceGroup(GetDataServiceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceGroupWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about a DataService Studio API in the published state.
     *
     * @param request GetDataServicePublishedApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataServicePublishedApiResponse
     */
    public GetDataServicePublishedApiResponse getDataServicePublishedApiWithOptions(GetDataServicePublishedApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            body.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataServicePublishedApi"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataServicePublishedApiResponse());
    }

    /**
     * @summary Queries the information about a DataService Studio API in the published state.
     *
     * @param request GetDataServicePublishedApiRequest
     * @return GetDataServicePublishedApiResponse
     */
    public GetDataServicePublishedApiResponse getDataServicePublishedApi(GetDataServicePublishedApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServicePublishedApiWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform. Set the value to **GetDataSourceMeta**.
     *
     * @param request GetDataSourceMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataSourceMetaResponse
     */
    public GetDataSourceMetaResponse getDataSourceMetaWithOptions(GetDataSourceMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasourceName)) {
            query.put("DatasourceName", request.datasourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            query.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataSourceMeta"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataSourceMetaResponse());
    }

    /**
     * @summary The operation that you want to perform. Set the value to **GetDataSourceMeta**.
     *
     * @param request GetDataSourceMetaRequest
     * @return GetDataSourceMetaResponse
     */
    public GetDataSourceMetaResponse getDataSourceMeta(GetDataSourceMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataSourceMetaWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of a deployment task.
     *
     * @param request GetDeploymentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeploymentResponse
     */
    public GetDeploymentResponse getDeploymentWithOptions(GetDeploymentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deploymentId)) {
            body.put("DeploymentId", request.deploymentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeployment"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeploymentResponse());
    }

    /**
     * @summary Queries the details of a deployment task.
     *
     * @param request GetDeploymentRequest
     * @return GetDeploymentResponse
     */
    public GetDeploymentResponse getDeployment(GetDeploymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeploymentWithOptions(request, runtime);
    }

    /**
     * @summary 获取开放平台扩展程序详情
     *
     * @param request GetExtensionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExtensionResponse
     */
    public GetExtensionResponse getExtensionWithOptions(GetExtensionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extensionCode)) {
            query.put("ExtensionCode", request.extensionCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExtension"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExtensionResponse());
    }

    /**
     * @summary 获取开放平台扩展程序详情
     *
     * @param request GetExtensionRequest
     * @return GetExtensionResponse
     */
    public GetExtensionResponse getExtension(GetExtensionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getExtensionWithOptions(request, runtime);
    }

    /**
     * @param request GetFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFileResponse
     */
    public GetFileResponse getFileWithOptions(GetFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFile"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFileResponse());
    }

    /**
     * @param request GetFileRequest
     * @return GetFileResponse
     */
    public GetFileResponse getFile(GetFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFileWithOptions(request, runtime);
    }

    /**
     * @param request GetFileTypeStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFileTypeStatisticResponse
     */
    public GetFileTypeStatisticResponse getFileTypeStatisticWithOptions(GetFileTypeStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFileTypeStatistic"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFileTypeStatisticResponse());
    }

    /**
     * @param request GetFileTypeStatisticRequest
     * @return GetFileTypeStatisticResponse
     */
    public GetFileTypeStatisticResponse getFileTypeStatistic(GetFileTypeStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFileTypeStatisticWithOptions(request, runtime);
    }

    /**
     * @param request GetFileVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFileVersionResponse
     */
    public GetFileVersionResponse getFileVersionWithOptions(GetFileVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileVersion)) {
            body.put("FileVersion", request.fileVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFileVersion"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFileVersionResponse());
    }

    /**
     * @param request GetFileVersionRequest
     * @return GetFileVersionResponse
     */
    public GetFileVersionResponse getFileVersion(GetFileVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFileVersionWithOptions(request, runtime);
    }

    /**
     * @param request GetFolderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFolderResponse
     */
    public GetFolderResponse getFolderWithOptions(GetFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("FolderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderPath)) {
            body.put("FolderPath", request.folderPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFolder"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFolderResponse());
    }

    /**
     * @param request GetFolderRequest
     * @return GetFolderResponse
     */
    public GetFolderResponse getFolder(GetFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFolderWithOptions(request, runtime);
    }

    /**
     * @summary Queries the data snapshot of an extension point based on the ID of an open message when the related extension point event is triggered.
     *
     * @param request GetIDEEventDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIDEEventDetailResponse
     */
    public GetIDEEventDetailResponse getIDEEventDetailWithOptions(GetIDEEventDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            body.put("MessageId", request.messageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIDEEventDetail"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIDEEventDetailResponse());
    }

    /**
     * @summary Queries the data snapshot of an extension point based on the ID of an open message when the related extension point event is triggered.
     *
     * @param request GetIDEEventDetailRequest
     * @return GetIDEEventDetailResponse
     */
    public GetIDEEventDetailResponse getIDEEventDetail(GetIDEEventDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIDEEventDetailWithOptions(request, runtime);
    }

    /**
     * @param request GetInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstanceWithOptions(GetInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstance"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceResponse());
    }

    /**
     * @param request GetInstanceRequest
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstance(GetInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI GetInstanceConsumeTimeRank is deprecated
     *
     * @param request GetInstanceConsumeTimeRankRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceConsumeTimeRankResponse
     */
    // Deprecated
    public GetInstanceConsumeTimeRankResponse getInstanceConsumeTimeRankWithOptions(GetInstanceConsumeTimeRankRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizdate)) {
            body.put("Bizdate", request.bizdate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceConsumeTimeRank"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceConsumeTimeRankResponse());
    }

    /**
     * @deprecated OpenAPI GetInstanceConsumeTimeRank is deprecated
     *
     * @param request GetInstanceConsumeTimeRankRequest
     * @return GetInstanceConsumeTimeRankResponse
     */
    // Deprecated
    public GetInstanceConsumeTimeRankResponse getInstanceConsumeTimeRank(GetInstanceConsumeTimeRankRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceConsumeTimeRankWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI GetInstanceCountTrend is deprecated
     *
     * @param request GetInstanceCountTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceCountTrendResponse
     */
    // Deprecated
    public GetInstanceCountTrendResponse getInstanceCountTrendWithOptions(GetInstanceCountTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginDate)) {
            body.put("BeginDate", request.beginDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceCountTrend"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceCountTrendResponse());
    }

    /**
     * @deprecated OpenAPI GetInstanceCountTrend is deprecated
     *
     * @param request GetInstanceCountTrendRequest
     * @return GetInstanceCountTrendResponse
     */
    // Deprecated
    public GetInstanceCountTrendResponse getInstanceCountTrend(GetInstanceCountTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceCountTrendWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI GetInstanceErrorRank is deprecated
     *
     * @param request GetInstanceErrorRankRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceErrorRankResponse
     */
    // Deprecated
    public GetInstanceErrorRankResponse getInstanceErrorRankWithOptions(GetInstanceErrorRankRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceErrorRank"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceErrorRankResponse());
    }

    /**
     * @deprecated OpenAPI GetInstanceErrorRank is deprecated
     *
     * @param request GetInstanceErrorRankRequest
     * @return GetInstanceErrorRankResponse
     */
    // Deprecated
    public GetInstanceErrorRankResponse getInstanceErrorRank(GetInstanceErrorRankRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceErrorRankWithOptions(request, runtime);
    }

    /**
     * @summary Queries the logs of an instance.
     *
     * @description You may not obtain the instance logs that were generated more than seven days ago.
     *
     * @param request GetInstanceLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceLogResponse
     */
    public GetInstanceLogResponse getInstanceLogWithOptions(GetInstanceLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceHistoryId)) {
            body.put("InstanceHistoryId", request.instanceHistoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceLog"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceLogResponse());
    }

    /**
     * @summary Queries the logs of an instance.
     *
     * @description You may not obtain the instance logs that were generated more than seven days ago.
     *
     * @param request GetInstanceLogRequest
     * @return GetInstanceLogResponse
     */
    public GetInstanceLogResponse getInstanceLog(GetInstanceLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceLogWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI GetInstanceStatusCount is deprecated
     *
     * @param request GetInstanceStatusCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceStatusCountResponse
     */
    // Deprecated
    public GetInstanceStatusCountResponse getInstanceStatusCountWithOptions(GetInstanceStatusCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizDate)) {
            body.put("BizDate", request.bizDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceStatusCount"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceStatusCountResponse());
    }

    /**
     * @deprecated OpenAPI GetInstanceStatusCount is deprecated
     *
     * @param request GetInstanceStatusCountRequest
     * @return GetInstanceStatusCountResponse
     */
    // Deprecated
    public GetInstanceStatusCountResponse getInstanceStatusCount(GetInstanceStatusCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceStatusCountWithOptions(request, runtime);
    }

    /**
     * @param request GetInstanceStatusStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceStatusStatisticResponse
     */
    public GetInstanceStatusStatisticResponse getInstanceStatusStatisticWithOptions(GetInstanceStatusStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizDate)) {
            body.put("BizDate", request.bizDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dagType)) {
            body.put("DagType", request.dagType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedulerPeriod)) {
            body.put("SchedulerPeriod", request.schedulerPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedulerType)) {
            body.put("SchedulerType", request.schedulerType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceStatusStatistic"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceStatusStatisticResponse());
    }

    /**
     * @param request GetInstanceStatusStatisticRequest
     * @return GetInstanceStatusStatisticResponse
     */
    public GetInstanceStatusStatisticResponse getInstanceStatusStatistic(GetInstanceStatusStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceStatusStatisticWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI GetManualDagInstances is deprecated
     *
     * @param request GetManualDagInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetManualDagInstancesResponse
     */
    // Deprecated
    public GetManualDagInstancesResponse getManualDagInstancesWithOptions(GetManualDagInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            body.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetManualDagInstances"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetManualDagInstancesResponse());
    }

    /**
     * @deprecated OpenAPI GetManualDagInstances is deprecated
     *
     * @param request GetManualDagInstancesRequest
     * @return GetManualDagInstancesResponse
     */
    // Deprecated
    public GetManualDagInstancesResponse getManualDagInstances(GetManualDagInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getManualDagInstancesWithOptions(request, runtime);
    }

    /**
     * @summary Queries a category tree.
     *
     * @param request GetMetaCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMetaCategoryResponse
     */
    public GetMetaCategoryResponse getMetaCategoryWithOptions(GetMetaCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentCategoryId)) {
            query.put("ParentCategoryId", request.parentCategoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaCategory"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaCategoryResponse());
    }

    /**
     * @summary Queries a category tree.
     *
     * @param request GetMetaCategoryRequest
     * @return GetMetaCategoryResponse
     */
    public GetMetaCategoryResponse getMetaCategory(GetMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaCategoryWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of a collection.
     *
     * @param request GetMetaCollectionDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMetaCollectionDetailResponse
     */
    public GetMetaCollectionDetailResponse getMetaCollectionDetailWithOptions(GetMetaCollectionDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifiedName)) {
            query.put("QualifiedName", request.qualifiedName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaCollectionDetail"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaCollectionDetailResponse());
    }

    /**
     * @summary Queries the details of a collection.
     *
     * @param request GetMetaCollectionDetailRequest
     * @return GetMetaCollectionDetailResponse
     */
    public GetMetaCollectionDetailResponse getMetaCollectionDetail(GetMetaCollectionDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaCollectionDetailWithOptions(request, runtime);
    }

    /**
     * @summary Queries the lineage of a field in a metatable.
     *
     * @param request GetMetaColumnLineageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMetaColumnLineageResponse
     */
    public GetMetaColumnLineageResponse getMetaColumnLineageWithOptions(GetMetaColumnLineageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnGuid)) {
            query.put("ColumnGuid", request.columnGuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnName)) {
            query.put("ColumnName", request.columnName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            query.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaColumnLineage"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaColumnLineageResponse());
    }

    /**
     * @summary Queries the lineage of a field in a metatable.
     *
     * @param request GetMetaColumnLineageRequest
     * @return GetMetaColumnLineageResponse
     */
    public GetMetaColumnLineageResponse getMetaColumnLineage(GetMetaColumnLineageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaColumnLineageWithOptions(request, runtime);
    }

    /**
     * @summary The ID of the compute engine instance. Specify the ID in the Engine type.Engine name format.
     *
     * @description The ID of the EMR cluster. This parameter is required only if you set the DataSourceType parameter to emr.
     * You can log on to the [EMR console](https://emr.console.aliyun.com/?spm=a2c4g.11186623.0.0.965cc5c2GeiHet#/cn-hangzhou) to obtain the ID of the EMR cluster.
     *
     * @param request GetMetaDBInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMetaDBInfoResponse
     */
    public GetMetaDBInfoResponse getMetaDBInfoWithOptions(GetMetaDBInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaDBInfo"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaDBInfoResponse());
    }

    /**
     * @summary The ID of the compute engine instance. Specify the ID in the Engine type.Engine name format.
     *
     * @description The ID of the EMR cluster. This parameter is required only if you set the DataSourceType parameter to emr.
     * You can log on to the [EMR console](https://emr.console.aliyun.com/?spm=a2c4g.11186623.0.0.965cc5c2GeiHet#/cn-hangzhou) to obtain the ID of the EMR cluster.
     *
     * @param request GetMetaDBInfoRequest
     * @return GetMetaDBInfoResponse
     */
    public GetMetaDBInfoResponse getMetaDBInfo(GetMetaDBInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaDBInfoWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform. Set the value to **GetMetaDBTableList**.
     *
     * @param request GetMetaDBTableListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMetaDBTableListResponse
     */
    public GetMetaDBTableListResponse getMetaDBTableListWithOptions(GetMetaDBTableListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appGuid)) {
            query.put("AppGuid", request.appGuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            query.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaDBTableList"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaDBTableListResponse());
    }

    /**
     * @summary The operation that you want to perform. Set the value to **GetMetaDBTableList**.
     *
     * @param request GetMetaDBTableListRequest
     * @return GetMetaDBTableListResponse
     */
    public GetMetaDBTableListResponse getMetaDBTableList(GetMetaDBTableListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaDBTableListWithOptions(request, runtime);
    }

    /**
     * @summary Queries the basic information about a metatable.
     *
     * @param request GetMetaTableBasicInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMetaTableBasicInfoResponse
     */
    public GetMetaTableBasicInfoResponse getMetaTableBasicInfoWithOptions(GetMetaTableBasicInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaTableBasicInfo"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaTableBasicInfoResponse());
    }

    /**
     * @summary Queries the basic information about a metatable.
     *
     * @param request GetMetaTableBasicInfoRequest
     * @return GetMetaTableBasicInfoResponse
     */
    public GetMetaTableBasicInfoResponse getMetaTableBasicInfo(GetMetaTableBasicInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableBasicInfoWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform. Set the value to **GetMetaTableChangeLog**.
     *
     * @param request GetMetaTableChangeLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMetaTableChangeLogResponse
     */
    public GetMetaTableChangeLogResponse getMetaTableChangeLogWithOptions(GetMetaTableChangeLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeType)) {
            body.put("ChangeType", request.changeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            body.put("ObjectType", request.objectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableGuid)) {
            body.put("TableGuid", request.tableGuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaTableChangeLog"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaTableChangeLogResponse());
    }

    /**
     * @summary The operation that you want to perform. Set the value to **GetMetaTableChangeLog**.
     *
     * @param request GetMetaTableChangeLogRequest
     * @return GetMetaTableChangeLogResponse
     */
    public GetMetaTableChangeLogResponse getMetaTableChangeLog(GetMetaTableChangeLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableChangeLogWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform. Set the value to **GetMetaTableColumn**.
     *
     * @param request GetMetaTableColumnRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMetaTableColumnResponse
     */
    public GetMetaTableColumnResponse getMetaTableColumnWithOptions(GetMetaTableColumnRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaTableColumn"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaTableColumnResponse());
    }

    /**
     * @summary The operation that you want to perform. Set the value to **GetMetaTableColumn**.
     *
     * @param request GetMetaTableColumnRequest
     * @return GetMetaTableColumnResponse
     */
    public GetMetaTableColumnResponse getMetaTableColumn(GetMetaTableColumnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableColumnWithOptions(request, runtime);
    }

    /**
     * @summary Queries the complete information about a metatable, including information about fields in the metatable.
     *
     * @param request GetMetaTableFullInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMetaTableFullInfoResponse
     */
    public GetMetaTableFullInfoResponse getMetaTableFullInfoWithOptions(GetMetaTableFullInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaTableFullInfo"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaTableFullInfoResponse());
    }

    /**
     * @summary Queries the complete information about a metatable, including information about fields in the metatable.
     *
     * @param request GetMetaTableFullInfoRequest
     * @return GetMetaTableFullInfoResponse
     */
    public GetMetaTableFullInfoResponse getMetaTableFullInfo(GetMetaTableFullInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableFullInfoWithOptions(request, runtime);
    }

    /**
     * @summary Queries the instructions on how to use a metatable.
     *
     * @param request GetMetaTableIntroWikiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMetaTableIntroWikiResponse
     */
    public GetMetaTableIntroWikiResponse getMetaTableIntroWikiWithOptions(GetMetaTableIntroWikiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tableGuid)) {
            query.put("TableGuid", request.tableGuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wikiVersion)) {
            query.put("WikiVersion", request.wikiVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaTableIntroWiki"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaTableIntroWikiResponse());
    }

    /**
     * @summary Queries the instructions on how to use a metatable.
     *
     * @param request GetMetaTableIntroWikiRequest
     * @return GetMetaTableIntroWikiResponse
     */
    public GetMetaTableIntroWikiResponse getMetaTableIntroWiki(GetMetaTableIntroWikiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableIntroWikiWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform. Set the value to **GetMetaTableLineage**.
     *
     * @param request GetMetaTableLineageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMetaTableLineageResponse
     */
    public GetMetaTableLineageResponse getMetaTableLineageWithOptions(GetMetaTableLineageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            query.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPrimaryKey)) {
            query.put("NextPrimaryKey", request.nextPrimaryKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableGuid)) {
            query.put("TableGuid", request.tableGuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaTableLineage"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaTableLineageResponse());
    }

    /**
     * @summary The operation that you want to perform. Set the value to **GetMetaTableLineage**.
     *
     * @param request GetMetaTableLineageRequest
     * @return GetMetaTableLineageResponse
     */
    public GetMetaTableLineageResponse getMetaTableLineage(GetMetaTableLineageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableLineageWithOptions(request, runtime);
    }

    /**
     * @summary Queries metatables in a specified category.
     *
     * @param request GetMetaTableListByCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMetaTableListByCategoryResponse
     */
    public GetMetaTableListByCategoryResponse getMetaTableListByCategoryWithOptions(GetMetaTableListByCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaTableListByCategory"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaTableListByCategoryResponse());
    }

    /**
     * @summary Queries metatables in a specified category.
     *
     * @param request GetMetaTableListByCategoryRequest
     * @return GetMetaTableListByCategoryResponse
     */
    public GetMetaTableListByCategoryResponse getMetaTableListByCategory(GetMetaTableListByCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableListByCategoryWithOptions(request, runtime);
    }

    /**
     * @param request GetMetaTableOutputRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMetaTableOutputResponse
     */
    public GetMetaTableOutputResponse getMetaTableOutputWithOptions(GetMetaTableOutputRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableGuid)) {
            query.put("TableGuid", request.tableGuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaTableOutput"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaTableOutputResponse());
    }

    /**
     * @param request GetMetaTableOutputRequest
     * @return GetMetaTableOutputResponse
     */
    public GetMetaTableOutputResponse getMetaTableOutput(GetMetaTableOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableOutputWithOptions(request, runtime);
    }

    /**
     * @summary Queries the partitions of a metatable.
     *
     * @description You can call this operation to query only the partitions of a metatable in a MaxCompute or E-MapReduce (EMR) compute engine instance.
     *
     * @param tmpReq GetMetaTablePartitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMetaTablePartitionResponse
     */
    public GetMetaTablePartitionResponse getMetaTablePartitionWithOptions(GetMetaTablePartitionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetMetaTablePartitionShrinkRequest request = new GetMetaTablePartitionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sortCriterion)) {
            request.sortCriterionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sortCriterion, "SortCriterion", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            query.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortCriterionShrink)) {
            query.put("SortCriterion", request.sortCriterionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableGuid)) {
            query.put("TableGuid", request.tableGuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaTablePartition"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaTablePartitionResponse());
    }

    /**
     * @summary Queries the partitions of a metatable.
     *
     * @description You can call this operation to query only the partitions of a metatable in a MaxCompute or E-MapReduce (EMR) compute engine instance.
     *
     * @param request GetMetaTablePartitionRequest
     * @return GetMetaTablePartitionResponse
     */
    public GetMetaTablePartitionResponse getMetaTablePartition(GetMetaTablePartitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTablePartitionWithOptions(request, runtime);
    }

    /**
     * @summary 获取Table的产出任务列表
     *
     * @param request GetMetaTableProducingTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMetaTableProducingTasksResponse
     */
    public GetMetaTableProducingTasksResponse getMetaTableProducingTasksWithOptions(GetMetaTableProducingTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            query.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableGuid)) {
            query.put("TableGuid", request.tableGuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaTableProducingTasks"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaTableProducingTasksResponse());
    }

    /**
     * @summary 获取Table的产出任务列表
     *
     * @param request GetMetaTableProducingTasksRequest
     * @return GetMetaTableProducingTasksResponse
     */
    public GetMetaTableProducingTasksResponse getMetaTableProducingTasks(GetMetaTableProducingTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableProducingTasksWithOptions(request, runtime);
    }

    /**
     * @summary Queries information about table folders and table levels.
     *
     * @param request GetMetaTableThemeLevelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMetaTableThemeLevelResponse
     */
    public GetMetaTableThemeLevelResponse getMetaTableThemeLevelWithOptions(GetMetaTableThemeLevelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaTableThemeLevel"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaTableThemeLevelResponse());
    }

    /**
     * @summary Queries information about table folders and table levels.
     *
     * @param request GetMetaTableThemeLevelRequest
     * @return GetMetaTableThemeLevelResponse
     */
    public GetMetaTableThemeLevelResponse getMetaTableThemeLevel(GetMetaTableThemeLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableThemeLevelWithOptions(request, runtime);
    }

    /**
     * @param request GetMigrationProcessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMigrationProcessResponse
     */
    public GetMigrationProcessResponse getMigrationProcessWithOptions(GetMigrationProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.migrationId)) {
            body.put("MigrationId", request.migrationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMigrationProcess"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMigrationProcessResponse());
    }

    /**
     * @param request GetMigrationProcessRequest
     * @return GetMigrationProcessResponse
     */
    public GetMigrationProcessResponse getMigrationProcess(GetMigrationProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMigrationProcessWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about a migration task.
     *
     * @param request GetMigrationSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMigrationSummaryResponse
     */
    public GetMigrationSummaryResponse getMigrationSummaryWithOptions(GetMigrationSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.migrationId)) {
            body.put("MigrationId", request.migrationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMigrationSummary"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMigrationSummaryResponse());
    }

    /**
     * @summary Queries the information about a migration task.
     *
     * @param request GetMigrationSummaryRequest
     * @return GetMigrationSummaryResponse
     */
    public GetMigrationSummaryResponse getMigrationSummary(GetMigrationSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMigrationSummaryWithOptions(request, runtime);
    }

    /**
     * @summary Indicates whether the request is successful.
     *
     * @param request GetNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNodeResponse
     */
    public GetNodeResponse getNodeWithOptions(GetNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNode"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeResponse());
    }

    /**
     * @summary Indicates whether the request is successful.
     *
     * @param request GetNodeRequest
     * @return GetNodeResponse
     */
    public GetNodeResponse getNode(GetNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeWithOptions(request, runtime);
    }

    /**
     * @param request GetNodeChildrenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNodeChildrenResponse
     */
    public GetNodeChildrenResponse getNodeChildrenWithOptions(GetNodeChildrenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNodeChildren"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeChildrenResponse());
    }

    /**
     * @param request GetNodeChildrenRequest
     * @return GetNodeChildrenResponse
     */
    public GetNodeChildrenResponse getNodeChildren(GetNodeChildrenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeChildrenWithOptions(request, runtime);
    }

    /**
     * @summary Queries the code of a node.
     *
     * @param request GetNodeCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNodeCodeResponse
     */
    public GetNodeCodeResponse getNodeCodeWithOptions(GetNodeCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNodeCode"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeCodeResponse());
    }

    /**
     * @summary Queries the code of a node.
     *
     * @param request GetNodeCodeRequest
     * @return GetNodeCodeResponse
     */
    public GetNodeCodeResponse getNodeCode(GetNodeCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeCodeWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI GetNodeOnBaseline is deprecated
     *
     * @param request GetNodeOnBaselineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNodeOnBaselineResponse
     */
    // Deprecated
    public GetNodeOnBaselineResponse getNodeOnBaselineWithOptions(GetNodeOnBaselineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baselineId)) {
            body.put("BaselineId", request.baselineId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNodeOnBaseline"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeOnBaselineResponse());
    }

    /**
     * @deprecated OpenAPI GetNodeOnBaseline is deprecated
     *
     * @param request GetNodeOnBaselineRequest
     * @return GetNodeOnBaselineResponse
     */
    // Deprecated
    public GetNodeOnBaselineResponse getNodeOnBaseline(GetNodeOnBaselineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeOnBaselineWithOptions(request, runtime);
    }

    /**
     * @summary Queries the ancestor nodes of a node.
     *
     * @param request GetNodeParentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNodeParentsResponse
     */
    public GetNodeParentsResponse getNodeParentsWithOptions(GetNodeParentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNodeParents"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeParentsResponse());
    }

    /**
     * @summary Queries the ancestor nodes of a node.
     *
     * @param request GetNodeParentsRequest
     * @return GetNodeParentsResponse
     */
    public GetNodeParentsResponse getNodeParents(GetNodeParentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeParentsWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI GetNodeTypeListInfo is deprecated
     *
     * @param request GetNodeTypeListInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNodeTypeListInfoResponse
     */
    // Deprecated
    public GetNodeTypeListInfoResponse getNodeTypeListInfoWithOptions(GetNodeTypeListInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locale)) {
            body.put("Locale", request.locale);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNodeTypeListInfo"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeTypeListInfoResponse());
    }

    /**
     * @deprecated OpenAPI GetNodeTypeListInfo is deprecated
     *
     * @param request GetNodeTypeListInfoRequest
     * @return GetNodeTypeListInfoResponse
     */
    // Deprecated
    public GetNodeTypeListInfoResponse getNodeTypeListInfo(GetNodeTypeListInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeTypeListInfoWithOptions(request, runtime);
    }

    /**
     * @param request GetOpRiskDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOpRiskDataResponse
     */
    public GetOpRiskDataResponse getOpRiskDataWithOptions(GetOpRiskDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOpRiskData"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOpRiskDataResponse());
    }

    /**
     * @param request GetOpRiskDataRequest
     * @return GetOpRiskDataResponse
     */
    public GetOpRiskDataResponse getOpRiskData(GetOpRiskDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOpRiskDataWithOptions(request, runtime);
    }

    /**
     * @param request GetOpSensitiveDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOpSensitiveDataResponse
     */
    public GetOpSensitiveDataResponse getOpSensitiveDataWithOptions(GetOpSensitiveDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOpSensitiveData"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOpSensitiveDataResponse());
    }

    /**
     * @param request GetOpSensitiveDataRequest
     * @return GetOpSensitiveDataResponse
     */
    public GetOpSensitiveDataResponse getOpSensitiveData(GetOpSensitiveDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOpSensitiveDataWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform. Set the value to **GetOptionValueForProject**.
     *
     * @param request GetOptionValueForProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOptionValueForProjectResponse
     */
    public GetOptionValueForProjectResponse getOptionValueForProjectWithOptions(GetOptionValueForProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extensionCode)) {
            body.put("ExtensionCode", request.extensionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOptionValueForProject"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOptionValueForProjectResponse());
    }

    /**
     * @summary The operation that you want to perform. Set the value to **GetOptionValueForProject**.
     *
     * @param request GetOptionValueForProjectRequest
     * @return GetOptionValueForProjectResponse
     */
    public GetOptionValueForProjectResponse getOptionValueForProject(GetOptionValueForProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOptionValueForProjectWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details about a permission request order.
     *
     * @param request GetPermissionApplyOrderDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPermissionApplyOrderDetailResponse
     */
    public GetPermissionApplyOrderDetailResponse getPermissionApplyOrderDetailWithOptions(GetPermissionApplyOrderDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            query.put("FlowId", request.flowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPermissionApplyOrderDetail"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPermissionApplyOrderDetailResponse());
    }

    /**
     * @summary Queries the details about a permission request order.
     *
     * @param request GetPermissionApplyOrderDetailRequest
     * @return GetPermissionApplyOrderDetailResponse
     */
    public GetPermissionApplyOrderDetailResponse getPermissionApplyOrderDetail(GetPermissionApplyOrderDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPermissionApplyOrderDetailWithOptions(request, runtime);
    }

    /**
     * @summary 查询工作空间详情
     *
     * @param request GetProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectResponse
     */
    public GetProjectResponse getProjectWithOptions(GetProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            query.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProject"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectResponse());
    }

    /**
     * @summary 查询工作空间详情
     *
     * @param request GetProjectRequest
     * @return GetProjectResponse
     */
    public GetProjectResponse getProject(GetProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProjectWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI GetProjectDetail is deprecated
     *
     * @summary 查询工作空间详情
     *
     * @param request GetProjectDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectDetailResponse
     */
    // Deprecated
    public GetProjectDetailResponse getProjectDetailWithOptions(GetProjectDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectDetail"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectDetailResponse());
    }

    /**
     * @deprecated OpenAPI GetProjectDetail is deprecated
     *
     * @summary 查询工作空间详情
     *
     * @param request GetProjectDetailRequest
     * @return GetProjectDetailResponse
     */
    // Deprecated
    public GetProjectDetailResponse getProjectDetail(GetProjectDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProjectDetailWithOptions(request, runtime);
    }

    /**
     * @param request GetQualityEntityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQualityEntityResponse
     */
    public GetQualityEntityResponse getQualityEntityWithOptions(GetQualityEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            body.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchExpression)) {
            body.put("MatchExpression", request.matchExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQualityEntity"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualityEntityResponse());
    }

    /**
     * @param request GetQualityEntityRequest
     * @return GetQualityEntityResponse
     */
    public GetQualityEntityResponse getQualityEntity(GetQualityEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityEntityWithOptions(request, runtime);
    }

    /**
     * @param request GetQualityFollowerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQualityFollowerResponse
     */
    public GetQualityFollowerResponse getQualityFollowerWithOptions(GetQualityFollowerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            body.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQualityFollower"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualityFollowerResponse());
    }

    /**
     * @param request GetQualityFollowerRequest
     * @return GetQualityFollowerResponse
     */
    public GetQualityFollowerResponse getQualityFollower(GetQualityFollowerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityFollowerWithOptions(request, runtime);
    }

    /**
     * @param request GetQualityRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQualityRuleResponse
     */
    public GetQualityRuleResponse getQualityRuleWithOptions(GetQualityRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            body.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQualityRule"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualityRuleResponse());
    }

    /**
     * @param request GetQualityRuleRequest
     * @return GetQualityRuleResponse
     */
    public GetQualityRuleResponse getQualityRule(GetQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityRuleWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of a custom alert rule.
     *
     * @description ## Debugging
     * [OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.](https://api.aliyun.com/#product=dataworks-public\\&api=GetRemind\\&type=RPC\\&version=2020-05-18)
     *
     * @param request GetRemindRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRemindResponse
     */
    public GetRemindResponse getRemindWithOptions(GetRemindRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.remindId)) {
            body.put("RemindId", request.remindId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRemind"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRemindResponse());
    }

    /**
     * @summary Queries the details of a custom alert rule.
     *
     * @description ## Debugging
     * [OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.](https://api.aliyun.com/#product=dataworks-public\\&api=GetRemind\\&type=RPC\\&version=2020-05-18)
     *
     * @param request GetRemindRequest
     * @return GetRemindResponse
     */
    public GetRemindResponse getRemind(GetRemindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRemindWithOptions(request, runtime);
    }

    /**
     * @param request GetSensitiveDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSensitiveDataResponse
     */
    public GetSensitiveDataResponse getSensitiveDataWithOptions(GetSensitiveDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSensitiveData"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSensitiveDataResponse());
    }

    /**
     * @param request GetSensitiveDataRequest
     * @return GetSensitiveDataResponse
     */
    public GetSensitiveDataResponse getSensitiveData(GetSensitiveDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSensitiveDataWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI GetSuccessInstanceTrend is deprecated
     *
     * @param request GetSuccessInstanceTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSuccessInstanceTrendResponse
     */
    // Deprecated
    public GetSuccessInstanceTrendResponse getSuccessInstanceTrendWithOptions(GetSuccessInstanceTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSuccessInstanceTrend"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSuccessInstanceTrendResponse());
    }

    /**
     * @deprecated OpenAPI GetSuccessInstanceTrend is deprecated
     *
     * @param request GetSuccessInstanceTrendRequest
     * @return GetSuccessInstanceTrendResponse
     */
    // Deprecated
    public GetSuccessInstanceTrendResponse getSuccessInstanceTrend(GetSuccessInstanceTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSuccessInstanceTrendWithOptions(request, runtime);
    }

    /**
     * @description ****
     *
     * @param request GetTopicRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTopicResponse
     */
    public GetTopicResponse getTopicWithOptions(GetTopicRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.topicId)) {
            body.put("TopicId", request.topicId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTopic"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTopicResponse());
    }

    /**
     * @description ****
     *
     * @param request GetTopicRequest
     * @return GetTopicResponse
     */
    public GetTopicResponse getTopic(GetTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTopicWithOptions(request, runtime);
    }

    /**
     * @param request GetTopicInfluenceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTopicInfluenceResponse
     */
    public GetTopicInfluenceResponse getTopicInfluenceWithOptions(GetTopicInfluenceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.topicId)) {
            body.put("TopicId", request.topicId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTopicInfluence"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTopicInfluenceResponse());
    }

    /**
     * @param request GetTopicInfluenceRequest
     * @return GetTopicInfluenceResponse
     */
    public GetTopicInfluenceResponse getTopicInfluence(GetTopicInfluenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTopicInfluenceWithOptions(request, runtime);
    }

    /**
     * @description You can import self-managed data sources or data sources that are exported from other Dataworks workspaces to a specified DataWorks workspace.
     * *   To import a self-managed data source to DataWorks, the data source type must be supported by DataWorks. For more information about the types of data sources supported by DataWorks, see [Supported data stores](https://help.aliyun.com/document_detail/181656.html).
     * *   For more information about how to export data sources from DataWorks workspaces to on-premises devices, see [ExportDataSources](https://help.aliyun.com/document_detail/279570.html).
     *
     * @param request ImportDataSourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportDataSourcesResponse
     */
    public ImportDataSourcesResponse importDataSourcesWithOptions(ImportDataSourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSources)) {
            query.put("DataSources", request.dataSources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportDataSources"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportDataSourcesResponse());
    }

    /**
     * @description You can import self-managed data sources or data sources that are exported from other Dataworks workspaces to a specified DataWorks workspace.
     * *   To import a self-managed data source to DataWorks, the data source type must be supported by DataWorks. For more information about the types of data sources supported by DataWorks, see [Supported data stores](https://help.aliyun.com/document_detail/181656.html).
     * *   For more information about how to export data sources from DataWorks workspaces to on-premises devices, see [ExportDataSources](https://help.aliyun.com/document_detail/279570.html).
     *
     * @param request ImportDataSourcesRequest
     * @return ImportDataSourcesResponse
     */
    public ImportDataSourcesResponse importDataSources(ImportDataSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importDataSourcesWithOptions(request, runtime);
    }

    /**
     * @param request ListAlertMessagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAlertMessagesResponse
     */
    public ListAlertMessagesResponse listAlertMessagesWithOptions(ListAlertMessagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertMethods)) {
            body.put("AlertMethods", request.alertMethods);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertRuleTypes)) {
            body.put("AlertRuleTypes", request.alertRuleTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertUser)) {
            body.put("AlertUser", request.alertUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baselineId)) {
            body.put("BaselineId", request.baselineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            body.put("BeginTime", request.beginTime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.remindId)) {
            body.put("RemindId", request.remindId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlertMessages"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlertMessagesResponse());
    }

    /**
     * @param request ListAlertMessagesRequest
     * @return ListAlertMessagesResponse
     */
    public ListAlertMessagesResponse listAlertMessages(ListAlertMessagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAlertMessagesWithOptions(request, runtime);
    }

    /**
     * @param request ListBaselineConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBaselineConfigsResponse
     */
    public ListBaselineConfigsResponse listBaselineConfigsWithOptions(ListBaselineConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baselineTypes)) {
            body.put("BaselineTypes", request.baselineTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchText)) {
            body.put("SearchText", request.searchText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useflag)) {
            body.put("Useflag", request.useflag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBaselineConfigs"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBaselineConfigsResponse());
    }

    /**
     * @param request ListBaselineConfigsRequest
     * @return ListBaselineConfigsResponse
     */
    public ListBaselineConfigsResponse listBaselineConfigs(ListBaselineConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBaselineConfigsWithOptions(request, runtime);
    }

    /**
     * @summary Queries baseline instances.
     *
     * @param request ListBaselineStatusesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBaselineStatusesResponse
     */
    public ListBaselineStatusesResponse listBaselineStatusesWithOptions(ListBaselineStatusesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baselineTypes)) {
            body.put("BaselineTypes", request.baselineTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizdate)) {
            body.put("Bizdate", request.bizdate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.finishStatus)) {
            body.put("FinishStatus", request.finishStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchText)) {
            body.put("SearchText", request.searchText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicId)) {
            body.put("TopicId", request.topicId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBaselineStatuses"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBaselineStatusesResponse());
    }

    /**
     * @summary Queries baseline instances.
     *
     * @param request ListBaselineStatusesRequest
     * @return ListBaselineStatusesResponse
     */
    public ListBaselineStatusesResponse listBaselineStatuses(ListBaselineStatusesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBaselineStatusesWithOptions(request, runtime);
    }

    /**
     * @summary 查询基线列表
     *
     * @param request ListBaselinesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBaselinesResponse
     */
    public ListBaselinesResponse listBaselinesWithOptions(ListBaselinesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baselineTypes)) {
            body.put("BaselineTypes", request.baselineTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            body.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchText)) {
            body.put("SearchText", request.searchText);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBaselines"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBaselinesResponse());
    }

    /**
     * @summary 查询基线列表
     *
     * @param request ListBaselinesRequest
     * @return ListBaselinesResponse
     */
    public ListBaselinesResponse listBaselines(ListBaselinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBaselinesWithOptions(request, runtime);
    }

    /**
     * @summary Queries workflows.
     *
     * @param request ListBusinessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBusinessResponse
     */
    public ListBusinessResponse listBusinessWithOptions(ListBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBusiness"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBusinessResponse());
    }

    /**
     * @summary Queries workflows.
     *
     * @param request ListBusinessRequest
     * @return ListBusinessResponse
     */
    public ListBusinessResponse listBusiness(ListBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBusinessWithOptions(request, runtime);
    }

    /**
     * @summary Queries compute engine instances.
     *
     * @param request ListCalcEnginesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCalcEnginesResponse
     */
    public ListCalcEnginesResponse listCalcEnginesWithOptions(ListCalcEnginesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calcEngineType)) {
            query.put("CalcEngineType", request.calcEngineType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            query.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCalcEngines"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCalcEnginesResponse());
    }

    /**
     * @summary Queries compute engine instances.
     *
     * @param request ListCalcEnginesRequest
     * @return ListCalcEnginesResponse
     */
    public ListCalcEnginesResponse listCalcEngines(ListCalcEnginesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCalcEnginesWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI ListConnections is deprecated
     *
     * @summary 查询数据源
     *
     * @param request ListConnectionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConnectionsResponse
     */
    // Deprecated
    public ListConnectionsResponse listConnectionsWithOptions(ListConnectionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConnections"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConnectionsResponse());
    }

    /**
     * @deprecated OpenAPI ListConnections is deprecated
     *
     * @summary 查询数据源
     *
     * @param request ListConnectionsRequest
     * @return ListConnectionsResponse
     */
    // Deprecated
    public ListConnectionsResponse listConnections(ListConnectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConnectionsWithOptions(request, runtime);
    }

    /**
     * @summary 查询数据集成新版告警规则列表
     *
     * @param request ListDIAlarmRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDIAlarmRulesResponse
     */
    public ListDIAlarmRulesResponse listDIAlarmRulesWithOptions(ListDIAlarmRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DIJobId)) {
            body.put("DIJobId", request.DIJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDIAlarmRules"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDIAlarmRulesResponse());
    }

    /**
     * @summary 查询数据集成新版告警规则列表
     *
     * @param request ListDIAlarmRulesRequest
     * @return ListDIAlarmRulesResponse
     */
    public ListDIAlarmRulesResponse listDIAlarmRules(ListDIAlarmRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDIAlarmRulesWithOptions(request, runtime);
    }

    /**
     * @summary 查询数据集成新版解决方案任务列表
     *
     * @param request ListDIJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDIJobsResponse
     */
    public ListDIJobsResponse listDIJobsWithOptions(ListDIJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationDataSourceType)) {
            body.put("DestinationDataSourceType", request.destinationDataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDataSourceType)) {
            body.put("SourceDataSourceType", request.sourceDataSourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDIJobs"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDIJobsResponse());
    }

    /**
     * @summary 查询数据集成新版解决方案任务列表
     *
     * @param request ListDIJobsRequest
     * @return ListDIJobsResponse
     */
    public ListDIJobsResponse listDIJobs(ListDIJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDIJobsWithOptions(request, runtime);
    }

    /**
     * @description DataWorks allows you to set the default global configuration for only the processing rules of DDL messages in sync solutions. After you configure the **processing rules of DDL messages** in sync solutions, the configuration is set as the default global configuration and applies to all real-time sync nodes. You can also modify the **processing rules of DDL messages** based on your business requirements. For more information, see [Sync solutions](https://help.aliyun.com/document_detail/199008.html).
     *
     * @param request ListDIProjectConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDIProjectConfigResponse
     */
    public ListDIProjectConfigResponse listDIProjectConfigWithOptions(ListDIProjectConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationType)) {
            query.put("DestinationType", request.destinationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDIProjectConfig"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDIProjectConfigResponse());
    }

    /**
     * @description DataWorks allows you to set the default global configuration for only the processing rules of DDL messages in sync solutions. After you configure the **processing rules of DDL messages** in sync solutions, the configuration is set as the default global configuration and applies to all real-time sync nodes. You can also modify the **processing rules of DDL messages** based on your business requirements. For more information, see [Sync solutions](https://help.aliyun.com/document_detail/199008.html).
     *
     * @param request ListDIProjectConfigRequest
     * @return ListDIProjectConfigResponse
     */
    public ListDIProjectConfigResponse listDIProjectConfig(ListDIProjectConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDIProjectConfigWithOptions(request, runtime);
    }

    /**
     * @summary Supported DAG types:
     * *   MANUAL: the DAG for a manually triggered workflow.
     * *   SMOKE_TEST: the DAG for a smoke testing workflow.
     * *   SUPPLY_DATA: the DAG for a data backfill instance.
     * *   BUSINESS_PROCESS_DAG: the DAG for a one-time workflow.
     * Supported DAG states:
     * *   CREATED: The DAG is created.
     * *   RUNNING: The DAG is running.
     * *   FAILURE: The DAG fails to run.
     * *   SUCCESS: The DAG successfully runs.
     *
     * @description The operation that you want to perform. Set the value to **ListDags**.
     *
     * @param request ListDagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDagsResponse
     */
    public ListDagsResponse listDagsWithOptions(ListDagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opSeq)) {
            body.put("OpSeq", request.opSeq);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDags"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDagsResponse());
    }

    /**
     * @summary Supported DAG types:
     * *   MANUAL: the DAG for a manually triggered workflow.
     * *   SMOKE_TEST: the DAG for a smoke testing workflow.
     * *   SUPPLY_DATA: the DAG for a data backfill instance.
     * *   BUSINESS_PROCESS_DAG: the DAG for a one-time workflow.
     * Supported DAG states:
     * *   CREATED: The DAG is created.
     * *   RUNNING: The DAG is running.
     * *   FAILURE: The DAG fails to run.
     * *   SUCCESS: The DAG successfully runs.
     *
     * @description The operation that you want to perform. Set the value to **ListDags**.
     *
     * @param request ListDagsRequest
     * @return ListDagsResponse
     */
    public ListDagsResponse listDags(ListDagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDagsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the APIs on which other users are granted the access permissions.
     *
     * @param request ListDataServiceApiAuthoritiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataServiceApiAuthoritiesResponse
     */
    public ListDataServiceApiAuthoritiesResponse listDataServiceApiAuthoritiesWithOptions(ListDataServiceApiAuthoritiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiNameKeyword)) {
            body.put("ApiNameKeyword", request.apiNameKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataServiceApiAuthorities"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataServiceApiAuthoritiesResponse());
    }

    /**
     * @summary Queries the APIs on which other users are granted the access permissions.
     *
     * @param request ListDataServiceApiAuthoritiesRequest
     * @return ListDataServiceApiAuthoritiesResponse
     */
    public ListDataServiceApiAuthoritiesResponse listDataServiceApiAuthorities(ListDataServiceApiAuthoritiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceApiAuthoritiesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the test records of a DataService Studio API. This API operation allows you to query only the test records that are generated within the last month.
     *
     * @param request ListDataServiceApiTestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataServiceApiTestResponse
     */
    public ListDataServiceApiTestResponse listDataServiceApiTestWithOptions(ListDataServiceApiTestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataServiceApiTest"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataServiceApiTestResponse());
    }

    /**
     * @summary Queries the test records of a DataService Studio API. This API operation allows you to query only the test records that are generated within the last month.
     *
     * @param request ListDataServiceApiTestRequest
     * @return ListDataServiceApiTestResponse
     */
    public ListDataServiceApiTestResponse listDataServiceApiTest(ListDataServiceApiTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceApiTestWithOptions(request, runtime);
    }

    /**
     * @summary Queries a list of APIs in the development state.
     *
     * @param request ListDataServiceApisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataServiceApisResponse
     */
    public ListDataServiceApisResponse listDataServiceApisWithOptions(ListDataServiceApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiNameKeyword)) {
            body.put("ApiNameKeyword", request.apiNameKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiPathKeyword)) {
            body.put("ApiPathKeyword", request.apiPathKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataServiceApis"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataServiceApisResponse());
    }

    /**
     * @summary Queries a list of APIs in the development state.
     *
     * @param request ListDataServiceApisRequest
     * @return ListDataServiceApisResponse
     */
    public ListDataServiceApisResponse listDataServiceApis(ListDataServiceApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceApisWithOptions(request, runtime);
    }

    /**
     * @summary Queries the basic information of applications.
     *
     * @param request ListDataServiceApplicationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataServiceApplicationsResponse
     */
    public ListDataServiceApplicationsResponse listDataServiceApplicationsWithOptions(ListDataServiceApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdList)) {
            body.put("ProjectIdList", request.projectIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataServiceApplications"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataServiceApplicationsResponse());
    }

    /**
     * @summary Queries the basic information of applications.
     *
     * @param request ListDataServiceApplicationsRequest
     * @return ListDataServiceApplicationsResponse
     */
    public ListDataServiceApplicationsResponse listDataServiceApplications(ListDataServiceApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceApplicationsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the APIs that you are authorized to access.
     *
     * @param request ListDataServiceAuthorizedApisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataServiceAuthorizedApisResponse
     */
    public ListDataServiceAuthorizedApisResponse listDataServiceAuthorizedApisWithOptions(ListDataServiceAuthorizedApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiNameKeyword)) {
            body.put("ApiNameKeyword", request.apiNameKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataServiceAuthorizedApis"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataServiceAuthorizedApisResponse());
    }

    /**
     * @summary Queries the APIs that you are authorized to access.
     *
     * @param request ListDataServiceAuthorizedApisRequest
     * @return ListDataServiceAuthorizedApisResponse
     */
    public ListDataServiceAuthorizedApisResponse listDataServiceAuthorizedApis(ListDataServiceAuthorizedApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceAuthorizedApisWithOptions(request, runtime);
    }

    /**
     * @summary Queries folders.
     *
     * @param request ListDataServiceFoldersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataServiceFoldersResponse
     */
    public ListDataServiceFoldersResponse listDataServiceFoldersWithOptions(ListDataServiceFoldersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.folderNameKeyword)) {
            body.put("FolderNameKeyword", request.folderNameKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataServiceFolders"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataServiceFoldersResponse());
    }

    /**
     * @summary Queries folders.
     *
     * @param request ListDataServiceFoldersRequest
     * @return ListDataServiceFoldersResponse
     */
    public ListDataServiceFoldersResponse listDataServiceFolders(ListDataServiceFoldersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceFoldersWithOptions(request, runtime);
    }

    /**
     * @summary Queries business processes.
     *
     * @param request ListDataServiceGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataServiceGroupsResponse
     */
    public ListDataServiceGroupsResponse listDataServiceGroupsWithOptions(ListDataServiceGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupNameKeyword)) {
            body.put("GroupNameKeyword", request.groupNameKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataServiceGroups"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataServiceGroupsResponse());
    }

    /**
     * @summary Queries business processes.
     *
     * @param request ListDataServiceGroupsRequest
     * @return ListDataServiceGroupsResponse
     */
    public ListDataServiceGroupsResponse listDataServiceGroups(ListDataServiceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceGroupsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about APIs in the published state.
     *
     * @param request ListDataServicePublishedApisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataServicePublishedApisResponse
     */
    public ListDataServicePublishedApisResponse listDataServicePublishedApisWithOptions(ListDataServicePublishedApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiNameKeyword)) {
            body.put("ApiNameKeyword", request.apiNameKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiPathKeyword)) {
            body.put("ApiPathKeyword", request.apiPathKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("CreatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataServicePublishedApis"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataServicePublishedApisResponse());
    }

    /**
     * @summary Queries the information about APIs in the published state.
     *
     * @param request ListDataServicePublishedApisRequest
     * @return ListDataServicePublishedApisResponse
     */
    public ListDataServicePublishedApisResponse listDataServicePublishedApis(ListDataServicePublishedApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServicePublishedApisWithOptions(request, runtime);
    }

    /**
     * @summary 查询数据源
     *
     * @param request ListDataSourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSourcesResponse
     */
    public ListDataSourcesResponse listDataSourcesWithOptions(ListDataSourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSources"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourcesResponse());
    }

    /**
     * @summary 查询数据源
     *
     * @param request ListDataSourcesRequest
     * @return ListDataSourcesResponse
     */
    public ListDataSourcesResponse listDataSources(ListDataSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataSourcesWithOptions(request, runtime);
    }

    /**
     * @summary 查询发布包列表
     *
     * @param request ListDeploymentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeploymentsResponse
     */
    public ListDeploymentsResponse listDeploymentsWithOptions(ListDeploymentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creator)) {
            body.put("Creator", request.creator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endCreateTime)) {
            body.put("EndCreateTime", request.endCreateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endExecuteTime)) {
            body.put("EndExecuteTime", request.endExecuteTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executor)) {
            body.put("Executor", request.executor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeployments"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeploymentsResponse());
    }

    /**
     * @summary 查询发布包列表
     *
     * @param request ListDeploymentsRequest
     * @return ListDeploymentsResponse
     */
    public ListDeploymentsResponse listDeployments(ListDeploymentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeploymentsWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform. Set the value to **ListEnabledExtensionsForProject**.
     *
     * @param request ListEnabledExtensionsForProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEnabledExtensionsForProjectResponse
     */
    public ListEnabledExtensionsForProjectResponse listEnabledExtensionsForProjectWithOptions(ListEnabledExtensionsForProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            body.put("EventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            body.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnabledExtensionsForProject"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnabledExtensionsForProjectResponse());
    }

    /**
     * @summary The operation that you want to perform. Set the value to **ListEnabledExtensionsForProject**.
     *
     * @param request ListEnabledExtensionsForProjectRequest
     * @return ListEnabledExtensionsForProjectResponse
     */
    public ListEnabledExtensionsForProjectResponse listEnabledExtensionsForProject(ListEnabledExtensionsForProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEnabledExtensionsForProjectWithOptions(request, runtime);
    }

    /**
     * @summary List entities by tags
     *
     * @param tmpReq ListEntitiesByTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEntitiesByTagsResponse
     */
    public ListEntitiesByTagsResponse listEntitiesByTagsWithOptions(ListEntitiesByTagsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListEntitiesByTagsShrinkRequest request = new ListEntitiesByTagsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEntitiesByTags"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEntitiesByTagsResponse());
    }

    /**
     * @summary List entities by tags
     *
     * @param request ListEntitiesByTagsRequest
     * @return ListEntitiesByTagsResponse
     */
    public ListEntitiesByTagsResponse listEntitiesByTags(ListEntitiesByTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEntitiesByTagsWithOptions(request, runtime);
    }

    /**
     * @summary List entity tags by given qualified name
     *
     * @param request ListEntityTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEntityTagsResponse
     */
    public ListEntityTagsResponse listEntityTagsWithOptions(ListEntityTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEntityTags"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEntityTagsResponse());
    }

    /**
     * @summary List entity tags by given qualified name
     *
     * @param request ListEntityTagsRequest
     * @return ListEntityTagsResponse
     */
    public ListEntityTagsResponse listEntityTags(ListEntityTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEntityTagsWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform. Set the value to **ListExtensions**.
     *
     * @param request ListExtensionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExtensionsResponse
     */
    public ListExtensionsResponse listExtensionsWithOptions(ListExtensionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExtensions"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExtensionsResponse());
    }

    /**
     * @summary The operation that you want to perform. Set the value to **ListExtensions**.
     *
     * @param request ListExtensionsRequest
     * @return ListExtensionsResponse
     */
    public ListExtensionsResponse listExtensions(ListExtensionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExtensionsWithOptions(request, runtime);
    }

    /**
     * @param request ListFileTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFileTypeResponse
     */
    public ListFileTypeResponse listFileTypeWithOptions(ListFileTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locale)) {
            body.put("Locale", request.locale);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFileType"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFileTypeResponse());
    }

    /**
     * @param request ListFileTypeRequest
     * @return ListFileTypeResponse
     */
    public ListFileTypeResponse listFileType(ListFileTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFileTypeWithOptions(request, runtime);
    }

    /**
     * @param request ListFileVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFileVersionsResponse
     */
    public ListFileVersionsResponse listFileVersionsWithOptions(ListFileVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFileVersions"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFileVersionsResponse());
    }

    /**
     * @param request ListFileVersionsRequest
     * @return ListFileVersionsResponse
     */
    public ListFileVersionsResponse listFileVersions(ListFileVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFileVersionsWithOptions(request, runtime);
    }

    /**
     * @param request ListFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFilesResponse
     */
    public ListFilesResponse listFilesWithOptions(ListFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exactFileName)) {
            body.put("ExactFileName", request.exactFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileFolderPath)) {
            body.put("FileFolderPath", request.fileFolderPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileIdIn)) {
            body.put("FileIdIn", request.fileIdIn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileTypes)) {
            body.put("FileTypes", request.fileTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needAbsoluteFolderPath)) {
            body.put("NeedAbsoluteFolderPath", request.needAbsoluteFolderPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needContent)) {
            body.put("NeedContent", request.needContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useType)) {
            body.put("UseType", request.useType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFiles"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFilesResponse());
    }

    /**
     * @param request ListFilesRequest
     * @return ListFilesResponse
     */
    public ListFilesResponse listFiles(ListFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFilesWithOptions(request, runtime);
    }

    /**
     * @param request ListFoldersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFoldersResponse
     */
    public ListFoldersResponse listFoldersWithOptions(ListFoldersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentFolderPath)) {
            body.put("ParentFolderPath", request.parentFolderPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFolders"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFoldersResponse());
    }

    /**
     * @param request ListFoldersRequest
     * @return ListFoldersResponse
     */
    public ListFoldersResponse listFolders(ListFoldersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFoldersWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform. Set the value to **ListInnerNodes**.
     *
     * @param request ListInnerNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInnerNodesResponse
     */
    public ListInnerNodesResponse listInnerNodesWithOptions(ListInnerNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeName)) {
            body.put("NodeName", request.nodeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerNodeId)) {
            body.put("OuterNodeId", request.outerNodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.programType)) {
            body.put("ProgramType", request.programType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInnerNodes"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInnerNodesResponse());
    }

    /**
     * @summary The operation that you want to perform. Set the value to **ListInnerNodes**.
     *
     * @param request ListInnerNodesRequest
     * @return ListInnerNodesResponse
     */
    public ListInnerNodesResponse listInnerNodes(ListInnerNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInnerNodesWithOptions(request, runtime);
    }

    /**
     * @param request ListInstanceAmountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceAmountResponse
     */
    public ListInstanceAmountResponse listInstanceAmountWithOptions(ListInstanceAmountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginDate)) {
            body.put("BeginDate", request.beginDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceAmount"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceAmountResponse());
    }

    /**
     * @param request ListInstanceAmountRequest
     * @return ListInstanceAmountResponse
     */
    public ListInstanceAmountResponse listInstanceAmount(ListInstanceAmountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceAmountWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform. Set the value to **ListInstanceHistory**.
     *
     * @param request ListInstanceHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceHistoryResponse
     */
    public ListInstanceHistoryResponse listInstanceHistoryWithOptions(ListInstanceHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceHistory"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceHistoryResponse());
    }

    /**
     * @summary The operation that you want to perform. Set the value to **ListInstanceHistory**.
     *
     * @param request ListInstanceHistoryRequest
     * @return ListInstanceHistoryResponse
     */
    public ListInstanceHistoryResponse listInstanceHistory(ListInstanceHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceHistoryWithOptions(request, runtime);
    }

    /**
     * @summary The ID of the directed acyclic graph (DAG). You can set this parameter to the value of the DagId parameter returned by the [RunCycleDagNodes](https://help.aliyun.com/document_detail/212961.html), [RunSmokeTest](https://help.aliyun.com/document_detail/212949.html), or [RunManualDagNodes](https://help.aliyun.com/document_detail/212830.html) operation based on your business requirements. The RunManualDagNodes operation is used to backfill data, the RunSmokeTest operation is used to perform smoke testing, and the RunManualDagNodes operation is used to run nodes in a manually triggered workflow.
     *
     * @param request ListInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginBizdate)) {
            body.put("BeginBizdate", request.beginBizdate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizName)) {
            body.put("BizName", request.bizName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizdate)) {
            body.put("Bizdate", request.bizdate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            body.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endBizdate)) {
            body.put("EndBizdate", request.endBizdate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeName)) {
            body.put("NodeName", request.nodeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            body.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.programType)) {
            body.put("ProgramType", request.programType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
    }

    /**
     * @summary The ID of the directed acyclic graph (DAG). You can set this parameter to the value of the DagId parameter returned by the [RunCycleDagNodes](https://help.aliyun.com/document_detail/212961.html), [RunSmokeTest](https://help.aliyun.com/document_detail/212949.html), or [RunManualDagNodes](https://help.aliyun.com/document_detail/212830.html) operation based on your business requirements. The RunManualDagNodes operation is used to backfill data, the RunSmokeTest operation is used to perform smoke testing, and the RunManualDagNodes operation is used to run nodes in a manually triggered workflow.
     *
     * @param request ListInstancesRequest
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    /**
     * @summary 查询血缘V2, 支持各种实体的血缘查询
     *
     * @param request ListLineageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLineageResponse
     */
    public ListLineageResponse listLineageWithOptions(ListLineageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityQualifiedName)) {
            query.put("EntityQualifiedName", request.entityQualifiedName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLineage"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLineageResponse());
    }

    /**
     * @summary 查询血缘V2, 支持各种实体的血缘查询
     *
     * @param request ListLineageRequest
     * @return ListLineageResponse
     */
    public ListLineageResponse listLineage(ListLineageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLineageWithOptions(request, runtime);
    }

    /**
     * @param request ListManualDagInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListManualDagInstancesResponse
     */
    public ListManualDagInstancesResponse listManualDagInstancesWithOptions(ListManualDagInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            body.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListManualDagInstances"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListManualDagInstancesResponse());
    }

    /**
     * @param request ListManualDagInstancesRequest
     * @return ListManualDagInstancesResponse
     */
    public ListManualDagInstancesResponse listManualDagInstances(ListManualDagInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listManualDagInstancesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the entities in a collection.
     *
     * @param request ListMetaCollectionEntitiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMetaCollectionEntitiesResponse
     */
    public ListMetaCollectionEntitiesResponse listMetaCollectionEntitiesWithOptions(ListMetaCollectionEntitiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collectionQualifiedName)) {
            query.put("CollectionQualifiedName", request.collectionQualifiedName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            query.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMetaCollectionEntities"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMetaCollectionEntitiesResponse());
    }

    /**
     * @summary Queries the entities in a collection.
     *
     * @param request ListMetaCollectionEntitiesRequest
     * @return ListMetaCollectionEntitiesResponse
     */
    public ListMetaCollectionEntitiesResponse listMetaCollectionEntities(ListMetaCollectionEntitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMetaCollectionEntitiesWithOptions(request, runtime);
    }

    /**
     * @summary Queries information about collections. Collections include data albums that are displayed on the DataMap page and categories that are created in the data albums. You can call this API operation to query collections by type.
     *
     * @description The type can be ALBUM or ALBUM_CATEGORY. ALBUM indicates data albums. ALBUM_CATEGORY indicates categories.
     *
     * @param request ListMetaCollectionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMetaCollectionsResponse
     */
    public ListMetaCollectionsResponse listMetaCollectionsWithOptions(ListMetaCollectionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.administrator)) {
            query.put("Administrator", request.administrator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.collectionType)) {
            query.put("CollectionType", request.collectionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creator)) {
            query.put("Creator", request.creator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.follower)) {
            query.put("Follower", request.follower);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentQualifiedName)) {
            query.put("ParentQualifiedName", request.parentQualifiedName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMetaCollections"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMetaCollectionsResponse());
    }

    /**
     * @summary Queries information about collections. Collections include data albums that are displayed on the DataMap page and categories that are created in the data albums. You can call this API operation to query collections by type.
     *
     * @description The type can be ALBUM or ALBUM_CATEGORY. ALBUM indicates data albums. ALBUM_CATEGORY indicates categories.
     *
     * @param request ListMetaCollectionsRequest
     * @return ListMetaCollectionsResponse
     */
    public ListMetaCollectionsResponse listMetaCollections(ListMetaCollectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMetaCollectionsWithOptions(request, runtime);
    }

    /**
     * @param request ListMetaDBRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMetaDBResponse
     */
    public ListMetaDBResponse listMetaDBWithOptions(ListMetaDBRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMetaDB"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMetaDBResponse());
    }

    /**
     * @param request ListMetaDBRequest
     * @return ListMetaDBResponse
     */
    public ListMetaDBResponse listMetaDB(ListMetaDBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMetaDBWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform. Set the value to **ListMigrations**.
     *
     * @param request ListMigrationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMigrationsResponse
     */
    public ListMigrationsResponse listMigrationsWithOptions(ListMigrationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.migrationType)) {
            body.put("MigrationType", request.migrationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMigrations"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMigrationsResponse());
    }

    /**
     * @summary The operation that you want to perform. Set the value to **ListMigrations**.
     *
     * @param request ListMigrationsRequest
     * @return ListMigrationsResponse
     */
    public ListMigrationsResponse listMigrations(ListMigrationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMigrationsWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI ListNodeIO is deprecated
     *
     * @param request ListNodeIORequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodeIOResponse
     */
    // Deprecated
    public ListNodeIOResponse listNodeIOWithOptions(ListNodeIORequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ioType)) {
            body.put("IoType", request.ioType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodeIO"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodeIOResponse());
    }

    /**
     * @deprecated OpenAPI ListNodeIO is deprecated
     *
     * @param request ListNodeIORequest
     * @return ListNodeIOResponse
     */
    // Deprecated
    public ListNodeIOResponse listNodeIO(ListNodeIORequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodeIOWithOptions(request, runtime);
    }

    /**
     * @param request ListNodeInputOrOutputRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodeInputOrOutputResponse
     */
    public ListNodeInputOrOutputResponse listNodeInputOrOutputWithOptions(ListNodeInputOrOutputRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ioType)) {
            body.put("IoType", request.ioType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodeInputOrOutput"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodeInputOrOutputResponse());
    }

    /**
     * @param request ListNodeInputOrOutputRequest
     * @return ListNodeInputOrOutputResponse
     */
    public ListNodeInputOrOutputResponse listNodeInputOrOutput(ListNodeInputOrOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodeInputOrOutputWithOptions(request, runtime);
    }

    /**
     * @summary The ID of the workspace.
     *
     * @param request ListNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodesWithOptions(ListNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizName)) {
            body.put("BizName", request.bizName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeName)) {
            body.put("NodeName", request.nodeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.programType)) {
            body.put("ProgramType", request.programType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedulerType)) {
            body.put("SchedulerType", request.schedulerType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodes"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodesResponse());
    }

    /**
     * @summary The ID of the workspace.
     *
     * @param request ListNodesRequest
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodes(ListNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodesWithOptions(request, runtime);
    }

    /**
     * @param request ListNodesByBaselineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodesByBaselineResponse
     */
    public ListNodesByBaselineResponse listNodesByBaselineWithOptions(ListNodesByBaselineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baselineId)) {
            body.put("BaselineId", request.baselineId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodesByBaseline"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodesByBaselineResponse());
    }

    /**
     * @param request ListNodesByBaselineRequest
     * @return ListNodesByBaselineResponse
     */
    public ListNodesByBaselineResponse listNodesByBaseline(ListNodesByBaselineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodesByBaselineWithOptions(request, runtime);
    }

    /**
     * @param request ListNodesByOutputRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodesByOutputResponse
     */
    public ListNodesByOutputResponse listNodesByOutputWithOptions(ListNodesByOutputRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outputs)) {
            body.put("Outputs", request.outputs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodesByOutput"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodesByOutputResponse());
    }

    /**
     * @param request ListNodesByOutputRequest
     * @return ListNodesByOutputResponse
     */
    public ListNodesByOutputResponse listNodesByOutput(ListNodesByOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodesByOutputWithOptions(request, runtime);
    }

    /**
     * @param request ListPermissionApplyOrdersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPermissionApplyOrdersResponse
     */
    public ListPermissionApplyOrdersResponse listPermissionApplyOrdersWithOptions(ListPermissionApplyOrdersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineType)) {
            query.put("EngineType", request.engineType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowStatus)) {
            query.put("FlowStatus", request.flowStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxComputeProjectName)) {
            query.put("MaxComputeProjectName", request.maxComputeProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("QueryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPermissionApplyOrders"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPermissionApplyOrdersResponse());
    }

    /**
     * @param request ListPermissionApplyOrdersRequest
     * @return ListPermissionApplyOrdersResponse
     */
    public ListPermissionApplyOrdersResponse listPermissionApplyOrders(ListPermissionApplyOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPermissionApplyOrdersWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI ListProgramTypeCount is deprecated
     *
     * @param request ListProgramTypeCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProgramTypeCountResponse
     */
    // Deprecated
    public ListProgramTypeCountResponse listProgramTypeCountWithOptions(ListProgramTypeCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProgramTypeCount"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProgramTypeCountResponse());
    }

    /**
     * @deprecated OpenAPI ListProgramTypeCount is deprecated
     *
     * @param request ListProgramTypeCountRequest
     * @return ListProgramTypeCountResponse
     */
    // Deprecated
    public ListProgramTypeCountResponse listProgramTypeCount(ListProgramTypeCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProgramTypeCountWithOptions(request, runtime);
    }

    /**
     * @description For example, an Alibaba Cloud account can assume the developer, O&M engineer, or workspace administrator role in a workspace. For more information, see [Manage members and roles](https://help.aliyun.com/document_detail/136941.html).
     *
     * @param request ListProjectIdsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectIdsResponse
     */
    public ListProjectIdsResponse listProjectIdsWithOptions(ListProjectIdsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectIds"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectIdsResponse());
    }

    /**
     * @description For example, an Alibaba Cloud account can assume the developer, O&M engineer, or workspace administrator role in a workspace. For more information, see [Manage members and roles](https://help.aliyun.com/document_detail/136941.html).
     *
     * @param request ListProjectIdsRequest
     * @return ListProjectIdsResponse
     */
    public ListProjectIdsResponse listProjectIds(ListProjectIdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectIdsWithOptions(request, runtime);
    }

    /**
     * @summary Queries members in a DataWorks workspace.
     *
     * @param request ListProjectMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectMembersResponse
     */
    public ListProjectMembersResponse listProjectMembersWithOptions(ListProjectMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectMembers"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectMembersResponse());
    }

    /**
     * @summary Queries members in a DataWorks workspace.
     *
     * @param request ListProjectMembersRequest
     * @return ListProjectMembersResponse
     */
    public ListProjectMembersResponse listProjectMembers(ListProjectMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectMembersWithOptions(request, runtime);
    }

    /**
     * @summary A topic is added to describe how to call the ListProjectRoles operation to query all roles in a workspace.
     *
     * @description ## Debugging
     * [OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.](https://api.aliyun.com/#product=dataworks-public\\&api=ListProjectRoles\\&type=RPC\\&version=2020-05-18)
     *
     * @param request ListProjectRolesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectRolesResponse
     */
    public ListProjectRolesResponse listProjectRolesWithOptions(ListProjectRolesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectRoles"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectRolesResponse());
    }

    /**
     * @summary A topic is added to describe how to call the ListProjectRoles operation to query all roles in a workspace.
     *
     * @description ## Debugging
     * [OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.](https://api.aliyun.com/#product=dataworks-public\\&api=ListProjectRoles\\&type=RPC\\&version=2020-05-18)
     *
     * @param request ListProjectRolesRequest
     * @return ListProjectRolesResponse
     */
    public ListProjectRolesResponse listProjectRoles(ListProjectRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectRolesWithOptions(request, runtime);
    }

    /**
     * @summary 查询工作空间
     *
     * @param tmpReq ListProjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjectsWithOptions(ListProjectsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListProjectsShrinkRequest request = new ListProjectsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjects"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectsResponse());
    }

    /**
     * @summary 查询工作空间
     *
     * @param request ListProjectsRequest
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjects(ListProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectsWithOptions(request, runtime);
    }

    /**
     * @description ****
     *
     * @param request ListQualityResultsByEntityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQualityResultsByEntityResponse
     */
    public ListQualityResultsByEntityResponse listQualityResultsByEntityWithOptions(ListQualityResultsByEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            body.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQualityResultsByEntity"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQualityResultsByEntityResponse());
    }

    /**
     * @description ****
     *
     * @param request ListQualityResultsByEntityRequest
     * @return ListQualityResultsByEntityResponse
     */
    public ListQualityResultsByEntityResponse listQualityResultsByEntity(ListQualityResultsByEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQualityResultsByEntityWithOptions(request, runtime);
    }

    /**
     * @param request ListQualityResultsByRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQualityResultsByRuleResponse
     */
    public ListQualityResultsByRuleResponse listQualityResultsByRuleWithOptions(ListQualityResultsByRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            body.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQualityResultsByRule"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQualityResultsByRuleResponse());
    }

    /**
     * @param request ListQualityResultsByRuleRequest
     * @return ListQualityResultsByRuleResponse
     */
    public ListQualityResultsByRuleResponse listQualityResultsByRule(ListQualityResultsByRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQualityResultsByRuleWithOptions(request, runtime);
    }

    /**
     * @param request ListQualityRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQualityRulesResponse
     */
    public ListQualityRulesResponse listQualityRulesWithOptions(ListQualityRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            body.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQualityRules"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQualityRulesResponse());
    }

    /**
     * @param request ListQualityRulesRequest
     * @return ListQualityRulesResponse
     */
    public ListQualityRulesResponse listQualityRules(ListQualityRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQualityRulesWithOptions(request, runtime);
    }

    /**
     * @param request ListRefDISyncTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRefDISyncTasksResponse
     */
    public ListRefDISyncTasksResponse listRefDISyncTasksWithOptions(ListRefDISyncTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasourceName)) {
            query.put("DatasourceName", request.datasourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refType)) {
            query.put("RefType", request.refType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRefDISyncTasks"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRefDISyncTasksResponse());
    }

    /**
     * @param request ListRefDISyncTasksRequest
     * @return ListRefDISyncTasksResponse
     */
    public ListRefDISyncTasksResponse listRefDISyncTasks(ListRefDISyncTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRefDISyncTasksWithOptions(request, runtime);
    }

    /**
     * @summary Queries custom alert rules.
     *
     * @param request ListRemindsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRemindsResponse
     */
    public ListRemindsResponse listRemindsWithOptions(ListRemindsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertTarget)) {
            body.put("AlertTarget", request.alertTarget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.founder)) {
            body.put("Founder", request.founder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remindTypes)) {
            body.put("RemindTypes", request.remindTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchText)) {
            body.put("SearchText", request.searchText);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListReminds"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRemindsResponse());
    }

    /**
     * @summary Queries custom alert rules.
     *
     * @param request ListRemindsRequest
     * @return ListRemindsResponse
     */
    public ListRemindsResponse listReminds(ListRemindsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRemindsWithOptions(request, runtime);
    }

    /**
     * @summary 查询资源组
     *
     * @param tmpReq ListResourceGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceGroupsResponse
     */
    public ListResourceGroupsResponse listResourceGroupsWithOptions(ListResourceGroupsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListResourceGroupsShrinkRequest request = new ListResourceGroupsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizExtKey)) {
            query.put("BizExtKey", request.bizExtKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupType)) {
            query.put("ResourceGroupType", request.resourceGroupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceManagerResourceGroupId)) {
            query.put("ResourceManagerResourceGroupId", request.resourceManagerResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceGroups"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceGroupsResponse());
    }

    /**
     * @summary 查询资源组
     *
     * @param request ListResourceGroupsRequest
     * @return ListResourceGroupsResponse
     */
    public ListResourceGroupsResponse listResourceGroups(ListResourceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceGroupsWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform. Set the value to **ListShiftPersonnels**.
     *
     * @param request ListShiftPersonnelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListShiftPersonnelsResponse
     */
    public ListShiftPersonnelsResponse listShiftPersonnelsWithOptions(ListShiftPersonnelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            body.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shiftPersonUID)) {
            body.put("ShiftPersonUID", request.shiftPersonUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shiftScheduleIdentifier)) {
            body.put("ShiftScheduleIdentifier", request.shiftScheduleIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            body.put("UserType", request.userType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListShiftPersonnels"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListShiftPersonnelsResponse());
    }

    /**
     * @summary The operation that you want to perform. Set the value to **ListShiftPersonnels**.
     *
     * @param request ListShiftPersonnelsRequest
     * @return ListShiftPersonnelsResponse
     */
    public ListShiftPersonnelsResponse listShiftPersonnels(ListShiftPersonnelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listShiftPersonnelsWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform. Set the value to **ListShiftSchedules**.
     *
     * @param request ListShiftSchedulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListShiftSchedulesResponse
     */
    public ListShiftSchedulesResponse listShiftSchedulesWithOptions(ListShiftSchedulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shiftScheduleName)) {
            body.put("ShiftScheduleName", request.shiftScheduleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListShiftSchedules"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListShiftSchedulesResponse());
    }

    /**
     * @summary The operation that you want to perform. Set the value to **ListShiftSchedules**.
     *
     * @param request ListShiftSchedulesRequest
     * @return ListShiftSchedulesResponse
     */
    public ListShiftSchedulesResponse listShiftSchedules(ListShiftSchedulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listShiftSchedulesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the trend of the number of auto triggered node instances that are successfully run every hour on the hour of the current day.
     *
     * @param request ListSuccessInstanceAmountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSuccessInstanceAmountResponse
     */
    public ListSuccessInstanceAmountResponse listSuccessInstanceAmountWithOptions(ListSuccessInstanceAmountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSuccessInstanceAmount"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSuccessInstanceAmountResponse());
    }

    /**
     * @summary Queries the trend of the number of auto triggered node instances that are successfully run every hour on the hour of the current day.
     *
     * @param request ListSuccessInstanceAmountRequest
     * @return ListSuccessInstanceAmountResponse
     */
    public ListSuccessInstanceAmountResponse listSuccessInstanceAmount(ListSuccessInstanceAmountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSuccessInstanceAmountWithOptions(request, runtime);
    }

    /**
     * @summary Queries table levels. This API operation will be replaced soon. We recommend that you do not call this API operation.
     *
     * @param request ListTableLevelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTableLevelResponse
     */
    public ListTableLevelResponse listTableLevelWithOptions(ListTableLevelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTableLevel"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTableLevelResponse());
    }

    /**
     * @summary Queries table levels. This API operation will be replaced soon. We recommend that you do not call this API operation.
     *
     * @param request ListTableLevelRequest
     * @return ListTableLevelResponse
     */
    public ListTableLevelResponse listTableLevel(ListTableLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTableLevelWithOptions(request, runtime);
    }

    /**
     * @summary Queries table folders. This API operation will be replaced soon. We recommend that you do not call this API operation.
     *
     * @param request ListTableThemeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTableThemeResponse
     */
    public ListTableThemeResponse listTableThemeWithOptions(ListTableThemeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTableTheme"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTableThemeResponse());
    }

    /**
     * @summary Queries table folders. This API operation will be replaced soon. We recommend that you do not call this API operation.
     *
     * @param request ListTableThemeRequest
     * @return ListTableThemeResponse
     */
    public ListTableThemeResponse listTableTheme(ListTableThemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTableThemeWithOptions(request, runtime);
    }

    /**
     * @summary Queries events.
     *
     * @param request ListTopicsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTopicsResponse
     */
    public ListTopicsResponse listTopicsWithOptions(ListTopicsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            body.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicStatuses)) {
            body.put("TopicStatuses", request.topicStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicTypes)) {
            body.put("TopicTypes", request.topicTypes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTopics"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTopicsResponse());
    }

    /**
     * @summary Queries events.
     *
     * @param request ListTopicsRequest
     * @return ListTopicsResponse
     */
    public ListTopicsResponse listTopics(ListTopicsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTopicsWithOptions(request, runtime);
    }

    /**
     * @summary The ID of the directory that you want to add to the left-side navigation pane of DataAnalysis. This parameter is used together with the TargetType parameter.
     * For example, if you set the TargetType parameter to META_ALBUM, you must set the TargetId parameter to the ID of the related data album. You can call the [ListMetaCollections](https://help.aliyun.com/document_detail/469938.html) operation to obtain the ID of the data album. The ID is indicated by the QualifiedName parameter.
     *
     * @param request MountDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MountDirectoryResponse
     */
    public MountDirectoryResponse mountDirectoryWithOptions(MountDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            body.put("TargetId", request.targetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            body.put("TargetType", request.targetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUserId)) {
            body.put("TargetUserId", request.targetUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MountDirectory"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MountDirectoryResponse());
    }

    /**
     * @summary The ID of the directory that you want to add to the left-side navigation pane of DataAnalysis. This parameter is used together with the TargetType parameter.
     * For example, if you set the TargetType parameter to META_ALBUM, you must set the TargetId parameter to the ID of the related data album. You can call the [ListMetaCollections](https://help.aliyun.com/document_detail/469938.html) operation to obtain the ID of the data album. The ID is indicated by the QualifiedName parameter.
     *
     * @param request MountDirectoryRequest
     * @return MountDirectoryResponse
     */
    public MountDirectoryResponse mountDirectory(MountDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.mountDirectoryWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform. Set the value to **OfflineNode**.
     *
     * @param request OfflineNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OfflineNodeResponse
     */
    public OfflineNodeResponse offlineNodeWithOptions(OfflineNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OfflineNode"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OfflineNodeResponse());
    }

    /**
     * @summary The operation that you want to perform. Set the value to **OfflineNode**.
     *
     * @param request OfflineNodeRequest
     * @return OfflineNodeResponse
     */
    public OfflineNodeResponse offlineNode(OfflineNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.offlineNodeWithOptions(request, runtime);
    }

    /**
     * @param request PublishDataServiceApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishDataServiceApiResponse
     */
    public PublishDataServiceApiResponse publishDataServiceApiWithOptions(PublishDataServiceApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            body.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishDataServiceApi"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishDataServiceApiResponse());
    }

    /**
     * @param request PublishDataServiceApiRequest
     * @return PublishDataServiceApiResponse
     */
    public PublishDataServiceApiResponse publishDataServiceApi(PublishDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishDataServiceApiWithOptions(request, runtime);
    }

    /**
     * @summary DataWorks allows you to call only the [CreateDISyncTask](https://help.aliyun.com/document_detail/278725.html) or [UpdateDISyncTask](https://help.aliyun.com/document_detail/289109.html) operation to create or update a batch synchronization node in Data Integration. To create or update a real-time synchronization node or a synchronization solution, you must first call the GenerateDISyncTaskConfigForCreating or GenerateDISyncTaskConfigForUpdating operation to generate the ID of an asynchronous thread and call the [QueryDISyncTaskConfigProcessResult](https://help.aliyun.com/document_detail/383465.html) operation to obtain the asynchronously generated parameters based on the ID. Then, you can call the CreateDISyncTask or UpdateDISyncTask operation and use the parameters as request parameters to create or update a real-time synchronization node or a synchronization solution.
     * DataWorks allows you to create or update real-time synchronization nodes and synchronization solutions in Data Integration only in asynchronous mode.
     *
     * @description The operation that you want to perform.
     *
     * @param request QueryDISyncTaskConfigProcessResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDISyncTaskConfigProcessResultResponse
     */
    public QueryDISyncTaskConfigProcessResultResponse queryDISyncTaskConfigProcessResultWithOptions(QueryDISyncTaskConfigProcessResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asyncProcessId)) {
            query.put("AsyncProcessId", request.asyncProcessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDISyncTaskConfigProcessResult"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDISyncTaskConfigProcessResultResponse());
    }

    /**
     * @summary DataWorks allows you to call only the [CreateDISyncTask](https://help.aliyun.com/document_detail/278725.html) or [UpdateDISyncTask](https://help.aliyun.com/document_detail/289109.html) operation to create or update a batch synchronization node in Data Integration. To create or update a real-time synchronization node or a synchronization solution, you must first call the GenerateDISyncTaskConfigForCreating or GenerateDISyncTaskConfigForUpdating operation to generate the ID of an asynchronous thread and call the [QueryDISyncTaskConfigProcessResult](https://help.aliyun.com/document_detail/383465.html) operation to obtain the asynchronously generated parameters based on the ID. Then, you can call the CreateDISyncTask or UpdateDISyncTask operation and use the parameters as request parameters to create or update a real-time synchronization node or a synchronization solution.
     * DataWorks allows you to create or update real-time synchronization nodes and synchronization solutions in Data Integration only in asynchronous mode.
     *
     * @description The operation that you want to perform.
     *
     * @param request QueryDISyncTaskConfigProcessResultRequest
     * @return QueryDISyncTaskConfigProcessResultResponse
     */
    public QueryDISyncTaskConfigProcessResultResponse queryDISyncTaskConfigProcessResult(QueryDISyncTaskConfigProcessResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDISyncTaskConfigProcessResultWithOptions(request, runtime);
    }

    /**
     * @summary 获取模版列表
     *
     * @param request QueryDefaultTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDefaultTemplateResponse
     */
    public QueryDefaultTemplateResponse queryDefaultTemplateWithOptions(QueryDefaultTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDefaultTemplate"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDefaultTemplateResponse());
    }

    /**
     * @summary 获取模版列表
     *
     * @param request QueryDefaultTemplateRequest
     * @return QueryDefaultTemplateResponse
     */
    public QueryDefaultTemplateResponse queryDefaultTemplate(QueryDefaultTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDefaultTemplateWithOptions(request, runtime);
    }

    /**
     * @summary 建模平台弹外的公共处理
     *
     * @param request QueryPublicModelEngineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPublicModelEngineResponse
     */
    public QueryPublicModelEngineResponse queryPublicModelEngineWithOptions(QueryPublicModelEngineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPublicModelEngine"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPublicModelEngineResponse());
    }

    /**
     * @summary 建模平台弹外的公共处理
     *
     * @param request QueryPublicModelEngineRequest
     * @return QueryPublicModelEngineResponse
     */
    public QueryPublicModelEngineResponse queryPublicModelEngine(QueryPublicModelEngineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPublicModelEngineWithOptions(request, runtime);
    }

    /**
     * @summary 获取识别规则类型数据
     *
     * @param request QueryRecognizeDataByRuleTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRecognizeDataByRuleTypeResponse
     */
    public QueryRecognizeDataByRuleTypeResponse queryRecognizeDataByRuleTypeWithOptions(QueryRecognizeDataByRuleTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recognizeRulesType)) {
            body.put("RecognizeRulesType", request.recognizeRulesType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRecognizeDataByRuleType"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRecognizeDataByRuleTypeResponse());
    }

    /**
     * @summary 获取识别规则类型数据
     *
     * @param request QueryRecognizeDataByRuleTypeRequest
     * @return QueryRecognizeDataByRuleTypeResponse
     */
    public QueryRecognizeDataByRuleTypeResponse queryRecognizeDataByRuleType(QueryRecognizeDataByRuleTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecognizeDataByRuleTypeWithOptions(request, runtime);
    }

    /**
     * @summary 查询识别规则详情
     *
     * @param request QueryRecognizeRuleDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRecognizeRuleDetailResponse
     */
    public QueryRecognizeRuleDetailResponse queryRecognizeRuleDetailWithOptions(QueryRecognizeRuleDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveName)) {
            body.put("SensitiveName", request.sensitiveName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRecognizeRuleDetail"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRecognizeRuleDetailResponse());
    }

    /**
     * @summary 查询识别规则详情
     *
     * @param request QueryRecognizeRuleDetailRequest
     * @return QueryRecognizeRuleDetailResponse
     */
    public QueryRecognizeRuleDetailResponse queryRecognizeRuleDetail(QueryRecognizeRuleDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecognizeRuleDetailWithOptions(request, runtime);
    }

    /**
     * @summary 获取识别规则类型
     *
     * @param request QueryRecognizeRulesTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRecognizeRulesTypeResponse
     */
    public QueryRecognizeRulesTypeResponse queryRecognizeRulesTypeWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRecognizeRulesType"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRecognizeRulesTypeResponse());
    }

    /**
     * @summary 获取识别规则类型
     *
     * @return QueryRecognizeRulesTypeResponse
     */
    public QueryRecognizeRulesTypeResponse queryRecognizeRulesType() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecognizeRulesTypeWithOptions(runtime);
    }

    /**
     * @summary 获取分类
     *
     * @param request QuerySensClassificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySensClassificationResponse
     */
    public QuerySensClassificationResponse querySensClassificationWithOptions(QuerySensClassificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySensClassification"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySensClassificationResponse());
    }

    /**
     * @summary 获取分类
     *
     * @param request QuerySensClassificationRequest
     * @return QuerySensClassificationResponse
     */
    public QuerySensClassificationResponse querySensClassification(QuerySensClassificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySensClassificationWithOptions(request, runtime);
    }

    /**
     * @summary 获取分级
     *
     * @param request QuerySensLevelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySensLevelResponse
     */
    public QuerySensLevelResponse querySensLevelWithOptions(QuerySensLevelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySensLevel"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySensLevelResponse());
    }

    /**
     * @summary 获取分级
     *
     * @param request QuerySensLevelRequest
     * @return QuerySensLevelResponse
     */
    public QuerySensLevelResponse querySensLevel(QuerySensLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySensLevelWithOptions(request, runtime);
    }

    /**
     * @summary 获取敏感字段
     *
     * @param request QuerySensNodeInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySensNodeInfoResponse
     */
    public QuerySensNodeInfoResponse querySensNodeInfoWithOptions(QuerySensNodeInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            body.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveName)) {
            body.put("SensitiveName", request.sensitiveName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySensNodeInfo"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySensNodeInfoResponse());
    }

    /**
     * @summary 获取敏感字段
     *
     * @param request QuerySensNodeInfoRequest
     * @return QuerySensNodeInfoResponse
     */
    public QuerySensNodeInfoResponse querySensNodeInfo(QuerySensNodeInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySensNodeInfoWithOptions(request, runtime);
    }

    /**
     * @summary 注册实体关系，支持用户注册自定义的实体关系
     *
     * @param tmpReq RegisterLineageRelationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterLineageRelationResponse
     */
    public RegisterLineageRelationResponse registerLineageRelationWithOptions(RegisterLineageRelationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RegisterLineageRelationShrinkRequest request = new RegisterLineageRelationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lineageRelationRegisterVO)) {
            request.lineageRelationRegisterVOShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lineageRelationRegisterVO, "LineageRelationRegisterVO", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lineageRelationRegisterVOShrink)) {
            body.put("LineageRelationRegisterVO", request.lineageRelationRegisterVOShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterLineageRelation"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterLineageRelationResponse());
    }

    /**
     * @summary 注册实体关系，支持用户注册自定义的实体关系
     *
     * @param request RegisterLineageRelationRequest
     * @return RegisterLineageRelationResponse
     */
    public RegisterLineageRelationResponse registerLineageRelation(RegisterLineageRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerLineageRelationWithOptions(request, runtime);
    }

    /**
     * @summary Remove entity tags by given qualified name and tag keys
     *
     * @param tmpReq RemoveEntityTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveEntityTagsResponse
     */
    public RemoveEntityTagsResponse removeEntityTagsWithOptions(RemoveEntityTagsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveEntityTagsShrinkRequest request = new RemoveEntityTagsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagKeys)) {
            request.tagKeysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagKeys, "TagKeys", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifiedName)) {
            query.put("QualifiedName", request.qualifiedName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagKeysShrink)) {
            body.put("TagKeys", request.tagKeysShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveEntityTags"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveEntityTagsResponse());
    }

    /**
     * @summary Remove entity tags by given qualified name and tag keys
     *
     * @param request RemoveEntityTagsRequest
     * @return RemoveEntityTagsResponse
     */
    public RemoveEntityTagsResponse removeEntityTags(RemoveEntityTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeEntityTagsWithOptions(request, runtime);
    }

    /**
     * @param request RemoveProjectMemberFromRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveProjectMemberFromRoleResponse
     */
    public RemoveProjectMemberFromRoleResponse removeProjectMemberFromRoleWithOptions(RemoveProjectMemberFromRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleCode)) {
            query.put("RoleCode", request.roleCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveProjectMemberFromRole"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveProjectMemberFromRoleResponse());
    }

    /**
     * @param request RemoveProjectMemberFromRoleRequest
     * @return RemoveProjectMemberFromRoleResponse
     */
    public RemoveProjectMemberFromRoleResponse removeProjectMemberFromRole(RemoveProjectMemberFromRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeProjectMemberFromRoleWithOptions(request, runtime);
    }

    /**
     * @summary Restarts an instance.
     *
     * @param request RestartInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartInstanceResponse
     */
    public RestartInstanceResponse restartInstanceWithOptions(RestartInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartInstance"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartInstanceResponse());
    }

    /**
     * @summary Restarts an instance.
     *
     * @param request RestartInstanceRequest
     * @return RestartInstanceResponse
     */
    public RestartInstanceResponse restartInstance(RestartInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Resumes a suspended instance.
     *
     * @param request ResumeInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeInstanceResponse
     */
    public ResumeInstanceResponse resumeInstanceWithOptions(ResumeInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeInstance"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeInstanceResponse());
    }

    /**
     * @summary Resumes a suspended instance.
     *
     * @param request ResumeInstanceRequest
     * @return ResumeInstanceResponse
     */
    public ResumeInstanceResponse resumeInstance(ResumeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeInstanceWithOptions(request, runtime);
    }

    /**
     * @summary The ID of the region where the MaxCompute project that contains the destination fields resides. For example, the ID of the China (Shanghai) region is cn-shanghai, and that of the China (Zhangjiakou) region is cn-zhangjiakou. The system automatically determines the value of this parameter based on the endpoint used to call the operation.
     *
     * @param request RevokeColumnPermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeColumnPermissionResponse
     */
    public RevokeColumnPermissionResponse revokeColumnPermissionWithOptions(RevokeColumnPermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columns)) {
            query.put("Columns", request.columns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxComputeProjectName)) {
            query.put("MaxComputeProjectName", request.maxComputeProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revokeUserId)) {
            query.put("RevokeUserId", request.revokeUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revokeUserName)) {
            query.put("RevokeUserName", request.revokeUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeColumnPermission"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeColumnPermissionResponse());
    }

    /**
     * @summary The ID of the region where the MaxCompute project that contains the destination fields resides. For example, the ID of the China (Shanghai) region is cn-shanghai, and that of the China (Zhangjiakou) region is cn-zhangjiakou. The system automatically determines the value of this parameter based on the endpoint used to call the operation.
     *
     * @param request RevokeColumnPermissionRequest
     * @return RevokeColumnPermissionResponse
     */
    public RevokeColumnPermissionResponse revokeColumnPermission(RevokeColumnPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeColumnPermissionWithOptions(request, runtime);
    }

    /**
     * @param request RevokeTablePermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeTablePermissionResponse
     */
    public RevokeTablePermissionResponse revokeTablePermissionWithOptions(RevokeTablePermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actions)) {
            query.put("Actions", request.actions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxComputeProjectName)) {
            query.put("MaxComputeProjectName", request.maxComputeProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revokeUserId)) {
            query.put("RevokeUserId", request.revokeUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revokeUserName)) {
            query.put("RevokeUserName", request.revokeUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeTablePermission"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeTablePermissionResponse());
    }

    /**
     * @param request RevokeTablePermissionRequest
     * @return RevokeTablePermissionResponse
     */
    public RevokeTablePermissionResponse revokeTablePermission(RevokeTablePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeTablePermissionWithOptions(request, runtime);
    }

    /**
     * @description For more information about data backfill, see [Backfill data](https://help.aliyun.com/document_detail/137937.html).
     *
     * @param request RunCycleDagNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunCycleDagNodesResponse
     */
    public RunCycleDagNodesResponse runCycleDagNodesWithOptions(RunCycleDagNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertNoticeType)) {
            body.put("AlertNoticeType", request.alertNoticeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertType)) {
            body.put("AlertType", request.alertType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizBeginTime)) {
            body.put("BizBeginTime", request.bizBeginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizEndTime)) {
            body.put("BizEndTime", request.bizEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.concurrentRuns)) {
            body.put("ConcurrentRuns", request.concurrentRuns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endBizDate)) {
            body.put("EndBizDate", request.endBizDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeNodeIds)) {
            body.put("ExcludeNodeIds", request.excludeNodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeNodeIds)) {
            body.put("IncludeNodeIds", request.includeNodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeParams)) {
            body.put("NodeParams", request.nodeParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parallelism)) {
            body.put("Parallelism", request.parallelism);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootNodeId)) {
            body.put("RootNodeId", request.rootNodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startBizDate)) {
            body.put("StartBizDate", request.startBizDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startFutureInstanceImmediately)) {
            body.put("StartFutureInstanceImmediately", request.startFutureInstanceImmediately);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunCycleDagNodes"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunCycleDagNodesResponse());
    }

    /**
     * @description For more information about data backfill, see [Backfill data](https://help.aliyun.com/document_detail/137937.html).
     *
     * @param request RunCycleDagNodesRequest
     * @return RunCycleDagNodesResponse
     */
    public RunCycleDagNodesResponse runCycleDagNodes(RunCycleDagNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runCycleDagNodesWithOptions(request, runtime);
    }

    /**
     * @summary The region ID. For example, the ID of the China (Shanghai) region is cn-shanghai, and that of the China (Zhangjiakou) region is cn-zhangjiakou. The system automatically determines the value of this parameter based on the endpoint used to call the operation.
     *
     * @param request RunManualDagNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunManualDagNodesResponse
     */
    public RunManualDagNodesResponse runManualDagNodesWithOptions(RunManualDagNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizDate)) {
            body.put("BizDate", request.bizDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dagParameters)) {
            body.put("DagParameters", request.dagParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endBizDate)) {
            body.put("EndBizDate", request.endBizDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeNodeIds)) {
            body.put("ExcludeNodeIds", request.excludeNodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowName)) {
            body.put("FlowName", request.flowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeNodeIds)) {
            body.put("IncludeNodeIds", request.includeNodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeParameters)) {
            body.put("NodeParameters", request.nodeParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startBizDate)) {
            body.put("StartBizDate", request.startBizDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunManualDagNodes"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunManualDagNodesResponse());
    }

    /**
     * @summary The region ID. For example, the ID of the China (Shanghai) region is cn-shanghai, and that of the China (Zhangjiakou) region is cn-zhangjiakou. The system automatically determines the value of this parameter based on the endpoint used to call the operation.
     *
     * @param request RunManualDagNodesRequest
     * @return RunManualDagNodesResponse
     */
    public RunManualDagNodesResponse runManualDagNodes(RunManualDagNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runManualDagNodesWithOptions(request, runtime);
    }

    /**
     * @param request RunSmokeTestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunSmokeTestResponse
     */
    public RunSmokeTestResponse runSmokeTestWithOptions(RunSmokeTestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizdate)) {
            body.put("Bizdate", request.bizdate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeParams)) {
            body.put("NodeParams", request.nodeParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunSmokeTest"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunSmokeTestResponse());
    }

    /**
     * @param request RunSmokeTestRequest
     * @return RunSmokeTestResponse
     */
    public RunSmokeTestResponse runSmokeTest(RunSmokeTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runSmokeTestWithOptions(request, runtime);
    }

    /**
     * @param request RunTriggerNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunTriggerNodeResponse
     */
    public RunTriggerNodeResponse runTriggerNodeWithOptions(RunTriggerNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizDate)) {
            body.put("BizDate", request.bizDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cycleTime)) {
            body.put("CycleTime", request.cycleTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunTriggerNode"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunTriggerNodeResponse());
    }

    /**
     * @param request RunTriggerNodeRequest
     * @return RunTriggerNodeResponse
     */
    public RunTriggerNodeResponse runTriggerNode(RunTriggerNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runTriggerNodeWithOptions(request, runtime);
    }

    /**
     * @summary 保存api测试结果
     *
     * @param request SaveDataServiceApiTestResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveDataServiceApiTestResultResponse
     */
    public SaveDataServiceApiTestResultResponse saveDataServiceApiTestResultWithOptions(SaveDataServiceApiTestResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            body.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoGenerate)) {
            body.put("AutoGenerate", request.autoGenerate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failResultSample)) {
            body.put("FailResultSample", request.failResultSample);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultSample)) {
            body.put("ResultSample", request.resultSample);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveDataServiceApiTestResult"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveDataServiceApiTestResultResponse());
    }

    /**
     * @summary 保存api测试结果
     *
     * @param request SaveDataServiceApiTestResultRequest
     * @return SaveDataServiceApiTestResultResponse
     */
    public SaveDataServiceApiTestResultResponse saveDataServiceApiTestResult(SaveDataServiceApiTestResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveDataServiceApiTestResultWithOptions(request, runtime);
    }

    /**
     * @param request ScanSensitiveDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ScanSensitiveDataResponse
     */
    public ScanSensitiveDataResponse scanSensitiveDataWithOptions(ScanSensitiveDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScanSensitiveData"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScanSensitiveDataResponse());
    }

    /**
     * @param request ScanSensitiveDataRequest
     * @return ScanSensitiveDataResponse
     */
    public ScanSensitiveDataResponse scanSensitiveData(ScanSensitiveDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.scanSensitiveDataWithOptions(request, runtime);
    }

    /**
     * @summary For more information about the example on how to use the SearchMetaTables operation, see [Examples of DataWorks API operations](https://developer.aliyun.com/article/780879?groupCode=dataworks).
     *
     * @description The operation that you want to perform. Set the value to **SearchMetaTables**.
     *
     * @param request SearchMetaTablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchMetaTablesResponse
     */
    public SearchMetaTablesResponse searchMetaTablesWithOptions(SearchMetaTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appGuid)) {
            query.put("AppGuid", request.appGuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            query.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            query.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schema)) {
            query.put("Schema", request.schema);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchMetaTables"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchMetaTablesResponse());
    }

    /**
     * @summary For more information about the example on how to use the SearchMetaTables operation, see [Examples of DataWorks API operations](https://developer.aliyun.com/article/780879?groupCode=dataworks).
     *
     * @description The operation that you want to perform. Set the value to **SearchMetaTables**.
     *
     * @param request SearchMetaTablesRequest
     * @return SearchMetaTablesResponse
     */
    public SearchMetaTablesResponse searchMetaTables(SearchMetaTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchMetaTablesWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI SearchNodesByOutput is deprecated
     *
     * @param request SearchNodesByOutputRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchNodesByOutputResponse
     */
    // Deprecated
    public SearchNodesByOutputResponse searchNodesByOutputWithOptions(SearchNodesByOutputRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outputs)) {
            body.put("Outputs", request.outputs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchNodesByOutput"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchNodesByOutputResponse());
    }

    /**
     * @deprecated OpenAPI SearchNodesByOutput is deprecated
     *
     * @param request SearchNodesByOutputRequest
     * @return SearchNodesByOutputResponse
     */
    // Deprecated
    public SearchNodesByOutputResponse searchNodesByOutput(SearchNodesByOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchNodesByOutputWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI SetDataSourceShare is deprecated
     *
     * @param request SetDataSourceShareRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDataSourceShareResponse
     */
    // Deprecated
    public SetDataSourceShareResponse setDataSourceShareWithOptions(SetDataSourceShareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasourceName)) {
            query.put("DatasourceName", request.datasourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            query.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectPermissions)) {
            query.put("ProjectPermissions", request.projectPermissions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPermissions)) {
            query.put("UserPermissions", request.userPermissions);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDataSourceShare"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDataSourceShareResponse());
    }

    /**
     * @deprecated OpenAPI SetDataSourceShare is deprecated
     *
     * @param request SetDataSourceShareRequest
     * @return SetDataSourceShareResponse
     */
    // Deprecated
    public SetDataSourceShareResponse setDataSourceShare(SetDataSourceShareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDataSourceShareWithOptions(request, runtime);
    }

    /**
     * @summary Set entity tags by given qualified name and tags
     *
     * @param tmpReq SetEntityTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetEntityTagsResponse
     */
    public SetEntityTagsResponse setEntityTagsWithOptions(SetEntityTagsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetEntityTagsShrinkRequest request = new SetEntityTagsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qualifiedName)) {
            query.put("QualifiedName", request.qualifiedName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            body.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetEntityTags"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetEntityTagsResponse());
    }

    /**
     * @summary Set entity tags by given qualified name and tags
     *
     * @param request SetEntityTagsRequest
     * @return SetEntityTagsResponse
     */
    public SetEntityTagsResponse setEntityTags(SetEntityTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setEntityTagsWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform. Set the value to **SetSuccessInstance**.
     *
     * @param request SetSuccessInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetSuccessInstanceResponse
     */
    public SetSuccessInstanceResponse setSuccessInstanceWithOptions(SetSuccessInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetSuccessInstance"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetSuccessInstanceResponse());
    }

    /**
     * @summary The operation that you want to perform. Set the value to **SetSuccessInstance**.
     *
     * @param request SetSuccessInstanceRequest
     * @return SetSuccessInstanceResponse
     */
    public SetSuccessInstanceResponse setSuccessInstance(SetSuccessInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setSuccessInstanceWithOptions(request, runtime);
    }

    /**
     * @summary 启动数据集成新版解决方案任务
     *
     * @param tmpReq StartDIJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartDIJobResponse
     */
    public StartDIJobResponse startDIJobWithOptions(StartDIJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StartDIJobShrinkRequest request = new StartDIJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.realtimeStartSettings)) {
            request.realtimeStartSettingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.realtimeStartSettings, "RealtimeStartSettings", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DIJobId)) {
            body.put("DIJobId", request.DIJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceToRerun)) {
            body.put("ForceToRerun", request.forceToRerun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realtimeStartSettingsShrink)) {
            body.put("RealtimeStartSettings", request.realtimeStartSettingsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartDIJob"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartDIJobResponse());
    }

    /**
     * @summary 启动数据集成新版解决方案任务
     *
     * @param request StartDIJobRequest
     * @return StartDIJobResponse
     */
    public StartDIJobResponse startDIJob(StartDIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDIJobWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform.
     *
     * @param request StartDISyncInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartDISyncInstanceResponse
     */
    public StartDISyncInstanceResponse startDISyncInstanceWithOptions(StartDISyncInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startParam)) {
            query.put("StartParam", request.startParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartDISyncInstance"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartDISyncInstanceResponse());
    }

    /**
     * @summary The operation that you want to perform.
     *
     * @param request StartDISyncInstanceRequest
     * @return StartDISyncInstanceResponse
     */
    public StartDISyncInstanceResponse startDISyncInstance(StartDISyncInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDISyncInstanceWithOptions(request, runtime);
    }

    /**
     * @param request StartMigrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartMigrationResponse
     */
    public StartMigrationResponse startMigrationWithOptions(StartMigrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.migrationId)) {
            body.put("MigrationId", request.migrationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartMigration"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartMigrationResponse());
    }

    /**
     * @param request StartMigrationRequest
     * @return StartMigrationResponse
     */
    public StartMigrationResponse startMigration(StartMigrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startMigrationWithOptions(request, runtime);
    }

    /**
     * @summary 停止数据集成新版解决方案任务
     *
     * @param request StopDIJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopDIJobResponse
     */
    public StopDIJobResponse stopDIJobWithOptions(StopDIJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DIJobId)) {
            body.put("DIJobId", request.DIJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDIJob"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopDIJobResponse());
    }

    /**
     * @summary 停止数据集成新版解决方案任务
     *
     * @param request StopDIJobRequest
     * @return StopDIJobResponse
     */
    public StopDIJobResponse stopDIJob(StopDIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDIJobWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform.
     *
     * @param request StopDISyncInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopDISyncInstanceResponse
     */
    public StopDISyncInstanceResponse stopDISyncInstanceWithOptions(StopDISyncInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDISyncInstance"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopDISyncInstanceResponse());
    }

    /**
     * @summary The operation that you want to perform.
     *
     * @param request StopDISyncInstanceRequest
     * @return StopDISyncInstanceResponse
     */
    public StopDISyncInstanceResponse stopDISyncInstance(StopDISyncInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDISyncInstanceWithOptions(request, runtime);
    }

    /**
     * @param request StopInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopInstanceResponse
     */
    public StopInstanceResponse stopInstanceWithOptions(StopInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopInstance"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopInstanceResponse());
    }

    /**
     * @param request StopInstanceRequest
     * @return StopInstanceResponse
     */
    public StopInstanceResponse stopInstance(StopInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopInstanceWithOptions(request, runtime);
    }

    /**
     * @summary 发布APi
     *
     * @param request SubmitDataServiceApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitDataServiceApiResponse
     */
    public SubmitDataServiceApiResponse submitDataServiceApiWithOptions(SubmitDataServiceApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            body.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitDataServiceApi"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitDataServiceApiResponse());
    }

    /**
     * @summary 发布APi
     *
     * @param request SubmitDataServiceApiRequest
     * @return SubmitDataServiceApiResponse
     */
    public SubmitDataServiceApiResponse submitDataServiceApi(SubmitDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitDataServiceApiWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform. Set the value to **SubmitFile**.
     *
     * @param request SubmitFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitFileResponse
     */
    public SubmitFileResponse submitFileWithOptions(SubmitFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipAllDeployFileExtensions)) {
            body.put("SkipAllDeployFileExtensions", request.skipAllDeployFileExtensions);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitFile"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitFileResponse());
    }

    /**
     * @summary The operation that you want to perform. Set the value to **SubmitFile**.
     *
     * @param request SubmitFileRequest
     * @return SubmitFileResponse
     */
    public SubmitFileResponse submitFile(SubmitFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitFileWithOptions(request, runtime);
    }

    /**
     * @summary Suspends an instance.
     *
     * @param request SuspendInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SuspendInstanceResponse
     */
    public SuspendInstanceResponse suspendInstanceWithOptions(SuspendInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendInstance"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendInstanceResponse());
    }

    /**
     * @summary Suspends an instance.
     *
     * @param request SuspendInstanceRequest
     * @return SuspendInstanceResponse
     */
    public SuspendInstanceResponse suspendInstance(SuspendInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendInstanceWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform. Set the value to **TerminateDISyncInstance**.
     *
     * @param request TerminateDISyncInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TerminateDISyncInstanceResponse
     */
    public TerminateDISyncInstanceResponse terminateDISyncInstanceWithOptions(TerminateDISyncInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TerminateDISyncInstance"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TerminateDISyncInstanceResponse());
    }

    /**
     * @summary The operation that you want to perform. Set the value to **TerminateDISyncInstance**.
     *
     * @param request TerminateDISyncInstanceRequest
     * @return TerminateDISyncInstanceResponse
     */
    public TerminateDISyncInstanceResponse terminateDISyncInstance(TerminateDISyncInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.terminateDISyncInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Tests a DataService Studio API in asynchronous mode. You can call the GetDataServiceApiTest operation to query the test result.
     *
     * @param request TestDataServiceApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TestDataServiceApiResponse
     */
    public TestDataServiceApiResponse testDataServiceApiWithOptions(TestDataServiceApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyContent)) {
            body.put("BodyContent", request.bodyContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bodyParams)) {
            body.put("BodyParams", request.bodyParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.headParams)) {
            body.put("HeadParams", request.headParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pathParams)) {
            body.put("PathParams", request.pathParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryParam)) {
            body.put("QueryParam", request.queryParam);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestDataServiceApi"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestDataServiceApiResponse());
    }

    /**
     * @summary Tests a DataService Studio API in asynchronous mode. You can call the GetDataServiceApiTest operation to query the test result.
     *
     * @param request TestDataServiceApiRequest
     * @return TestDataServiceApiResponse
     */
    public TestDataServiceApiResponse testDataServiceApi(TestDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testDataServiceApiWithOptions(request, runtime);
    }

    /**
     * @param request TestNetworkConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TestNetworkConnectionResponse
     */
    public TestNetworkConnectionResponse testNetworkConnectionWithOptions(TestNetworkConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasourceName)) {
            query.put("DatasourceName", request.datasourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            query.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroup)) {
            query.put("ResourceGroup", request.resourceGroup);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestNetworkConnection"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestNetworkConnectionResponse());
    }

    /**
     * @param request TestNetworkConnectionRequest
     * @return TestNetworkConnectionResponse
     */
    public TestNetworkConnectionResponse testNetworkConnection(TestNetworkConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testNetworkConnectionWithOptions(request, runtime);
    }

    /**
     * @param request TopTenElapsedTimeInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TopTenElapsedTimeInstanceResponse
     */
    public TopTenElapsedTimeInstanceResponse topTenElapsedTimeInstanceWithOptions(TopTenElapsedTimeInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TopTenElapsedTimeInstance"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TopTenElapsedTimeInstanceResponse());
    }

    /**
     * @param request TopTenElapsedTimeInstanceRequest
     * @return TopTenElapsedTimeInstanceResponse
     */
    public TopTenElapsedTimeInstanceResponse topTenElapsedTimeInstance(TopTenElapsedTimeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.topTenElapsedTimeInstanceWithOptions(request, runtime);
    }

    /**
     * @param request TopTenErrorTimesInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TopTenErrorTimesInstanceResponse
     */
    public TopTenErrorTimesInstanceResponse topTenErrorTimesInstanceWithOptions(TopTenErrorTimesInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TopTenErrorTimesInstance"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TopTenErrorTimesInstanceResponse());
    }

    /**
     * @param request TopTenErrorTimesInstanceRequest
     * @return TopTenErrorTimesInstanceResponse
     */
    public TopTenErrorTimesInstanceResponse topTenErrorTimesInstance(TopTenErrorTimesInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.topTenErrorTimesInstanceWithOptions(request, runtime);
    }

    /**
     * @summary 将数据专辑从数据分析的左侧导航目录移除（卸载）
     *
     * @param request UmountDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UmountDirectoryResponse
     */
    public UmountDirectoryResponse umountDirectoryWithOptions(UmountDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            body.put("TargetId", request.targetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            body.put("TargetType", request.targetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUserId)) {
            body.put("TargetUserId", request.targetUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UmountDirectory"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UmountDirectoryResponse());
    }

    /**
     * @summary 将数据专辑从数据分析的左侧导航目录移除（卸载）
     *
     * @param request UmountDirectoryRequest
     * @return UmountDirectoryResponse
     */
    public UmountDirectoryResponse umountDirectory(UmountDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.umountDirectoryWithOptions(request, runtime);
    }

    /**
     * @summary 更新基线
     *
     * @param tmpReq UpdateBaselineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBaselineResponse
     */
    public UpdateBaselineResponse updateBaselineWithOptions(UpdateBaselineRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateBaselineShrinkRequest request = new UpdateBaselineShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.alertSettings)) {
            request.alertSettingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.alertSettings, "AlertSettings", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.overtimeSettings)) {
            request.overtimeSettingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.overtimeSettings, "OvertimeSettings", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertEnabled)) {
            body.put("AlertEnabled", request.alertEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertMarginThreshold)) {
            body.put("AlertMarginThreshold", request.alertMarginThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertSettingsShrink)) {
            body.put("AlertSettings", request.alertSettingsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baselineId)) {
            body.put("BaselineId", request.baselineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baselineName)) {
            body.put("BaselineName", request.baselineName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baselineType)) {
            body.put("BaselineType", request.baselineType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            body.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIds)) {
            body.put("NodeIds", request.nodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overtimeSettingsShrink)) {
            body.put("OvertimeSettings", request.overtimeSettingsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.removeNodeIds)) {
            body.put("RemoveNodeIds", request.removeNodeIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBaseline"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBaselineResponse());
    }

    /**
     * @summary 更新基线
     *
     * @param request UpdateBaselineRequest
     * @return UpdateBaselineResponse
     */
    public UpdateBaselineResponse updateBaseline(UpdateBaselineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBaselineWithOptions(request, runtime);
    }

    /**
     * @summary Updates a workflow.
     *
     * @param request UpdateBusinessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBusinessResponse
     */
    public UpdateBusinessResponse updateBusinessWithOptions(UpdateBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessId)) {
            body.put("BusinessId", request.businessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessName)) {
            body.put("BusinessName", request.businessName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBusiness"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBusinessResponse());
    }

    /**
     * @summary Updates a workflow.
     *
     * @param request UpdateBusinessRequest
     * @return UpdateBusinessResponse
     */
    public UpdateBusinessResponse updateBusiness(UpdateBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBusinessWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI UpdateConnection is deprecated
     *
     * @param request UpdateConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateConnectionResponse
     */
    // Deprecated
    public UpdateConnectionResponse updateConnectionWithOptions(UpdateConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            query.put("ConnectionId", request.connectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            query.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConnection"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConnectionResponse());
    }

    /**
     * @deprecated OpenAPI UpdateConnection is deprecated
     *
     * @param request UpdateConnectionRequest
     * @return UpdateConnectionResponse
     */
    // Deprecated
    public UpdateConnectionResponse updateConnection(UpdateConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateConnectionWithOptions(request, runtime);
    }

    /**
     * @summary 更新数据集成新版告警规则
     *
     * @param tmpReq UpdateDIAlarmRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDIAlarmRuleResponse
     */
    public UpdateDIAlarmRuleResponse updateDIAlarmRuleWithOptions(UpdateDIAlarmRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDIAlarmRuleShrinkRequest request = new UpdateDIAlarmRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notificationSettings)) {
            request.notificationSettingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notificationSettings, "NotificationSettings", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.triggerConditions)) {
            request.triggerConditionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.triggerConditions, "TriggerConditions", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DIAlarmRuleId)) {
            body.put("DIAlarmRuleId", request.DIAlarmRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            body.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            body.put("MetricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationSettingsShrink)) {
            body.put("NotificationSettings", request.notificationSettingsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerConditionsShrink)) {
            body.put("TriggerConditions", request.triggerConditionsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDIAlarmRule"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDIAlarmRuleResponse());
    }

    /**
     * @summary 更新数据集成新版告警规则
     *
     * @param request UpdateDIAlarmRuleRequest
     * @return UpdateDIAlarmRuleResponse
     */
    public UpdateDIAlarmRuleResponse updateDIAlarmRule(UpdateDIAlarmRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDIAlarmRuleWithOptions(request, runtime);
    }

    /**
     * @summary 更新数据集成新版解决方案任务
     *
     * @param tmpReq UpdateDIJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDIJobResponse
     */
    public UpdateDIJobResponse updateDIJobWithOptions(UpdateDIJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDIJobShrinkRequest request = new UpdateDIJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.jobSettings)) {
            request.jobSettingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.jobSettings, "JobSettings", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceSettings)) {
            request.resourceSettingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceSettings, "ResourceSettings", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tableMappings)) {
            request.tableMappingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tableMappings, "TableMappings", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.transformationRules)) {
            request.transformationRulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.transformationRules, "TransformationRules", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DIJobId)) {
            body.put("DIJobId", request.DIJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobSettingsShrink)) {
            body.put("JobSettings", request.jobSettingsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSettingsShrink)) {
            body.put("ResourceSettings", request.resourceSettingsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableMappingsShrink)) {
            body.put("TableMappings", request.tableMappingsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transformationRulesShrink)) {
            body.put("TransformationRules", request.transformationRulesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDIJob"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDIJobResponse());
    }

    /**
     * @summary 更新数据集成新版解决方案任务
     *
     * @param request UpdateDIJobRequest
     * @return UpdateDIJobResponse
     */
    public UpdateDIJobResponse updateDIJob(UpdateDIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDIJobWithOptions(request, runtime);
    }

    /**
     * @summary DataWorks allows you to specify a default global configuration only for the processing rules of DDL messages in synchronization solutions. After you configure the **processing rules of DDL messages** in synchronization solutions, the configuration is used as the default global configuration and applies to all real-time synchronization nodes in the solutions. You can modify the **processing rules of DDL messages** based on your business requirements. For more information about how to configure a synchronization solution, see [Synchronization solutions](https://help.aliyun.com/document_detail/199008.html).
     *
     * @description The operation that you want to perform. Set the value to **UpdateDIProjectConfig**.
     *
     * @param request UpdateDIProjectConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDIProjectConfigResponse
     */
    public UpdateDIProjectConfigResponse updateDIProjectConfigWithOptions(UpdateDIProjectConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationType)) {
            query.put("DestinationType", request.destinationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectConfig)) {
            query.put("ProjectConfig", request.projectConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDIProjectConfig"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDIProjectConfigResponse());
    }

    /**
     * @summary DataWorks allows you to specify a default global configuration only for the processing rules of DDL messages in synchronization solutions. After you configure the **processing rules of DDL messages** in synchronization solutions, the configuration is used as the default global configuration and applies to all real-time synchronization nodes in the solutions. You can modify the **processing rules of DDL messages** based on your business requirements. For more information about how to configure a synchronization solution, see [Synchronization solutions](https://help.aliyun.com/document_detail/199008.html).
     *
     * @description The operation that you want to perform. Set the value to **UpdateDIProjectConfig**.
     *
     * @param request UpdateDIProjectConfigRequest
     * @return UpdateDIProjectConfigResponse
     */
    public UpdateDIProjectConfigResponse updateDIProjectConfig(UpdateDIProjectConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDIProjectConfigWithOptions(request, runtime);
    }

    /**
     * @param request UpdateDISyncTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDISyncTaskResponse
     */
    public UpdateDISyncTaskResponse updateDISyncTaskWithOptions(UpdateDISyncTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskContent)) {
            query.put("TaskContent", request.taskContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskParam)) {
            query.put("TaskParam", request.taskParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDISyncTask"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDISyncTaskResponse());
    }

    /**
     * @param request UpdateDISyncTaskRequest
     * @return UpdateDISyncTaskResponse
     */
    public UpdateDISyncTaskResponse updateDISyncTask(UpdateDISyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDISyncTaskWithOptions(request, runtime);
    }

    /**
     * @summary Updates the information about an API in the development state in DataService Studio.
     *
     * @param request UpdateDataServiceApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataServiceApiResponse
     */
    public UpdateDataServiceApiResponse updateDataServiceApiWithOptions(UpdateDataServiceApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiDescription)) {
            body.put("ApiDescription", request.apiDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            body.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiPath)) {
            body.put("ApiPath", request.apiPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocols)) {
            body.put("Protocols", request.protocols);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrationDetails)) {
            body.put("RegistrationDetails", request.registrationDetails);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestMethod)) {
            body.put("RequestMethod", request.requestMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseContentType)) {
            body.put("ResponseContentType", request.responseContentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptDetails)) {
            body.put("ScriptDetails", request.scriptDetails);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            body.put("Timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibleRange)) {
            body.put("VisibleRange", request.visibleRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wizardDetails)) {
            body.put("WizardDetails", request.wizardDetails);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataServiceApi"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataServiceApiResponse());
    }

    /**
     * @summary Updates the information about an API in the development state in DataService Studio.
     *
     * @param request UpdateDataServiceApiRequest
     * @return UpdateDataServiceApiResponse
     */
    public UpdateDataServiceApiResponse updateDataServiceApi(UpdateDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataServiceApiWithOptions(request, runtime);
    }

    /**
     * @param request UpdateDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataSourceResponse
     */
    public UpdateDataSourceResponse updateDataSourceWithOptions(UpdateDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            query.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataSource"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataSourceResponse());
    }

    /**
     * @param request UpdateDataSourceRequest
     * @return UpdateDataSourceResponse
     */
    public UpdateDataSourceResponse updateDataSource(UpdateDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataSourceWithOptions(request, runtime);
    }

    /**
     * @description When you debug or call this operation, you must specify new values for the specified parameters to ensure that the values are different from the original configurations of the file. For example, if the original value of a parameter is A, you must change the value of this parameter to B before you commit the node. If you set the parameter to A, an exception that indicates invalid data occurs.
     *
     * @param request UpdateFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFileResponse
     */
    public UpdateFileResponse updateFileWithOptions(UpdateFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.advancedSettings)) {
            body.put("AdvancedSettings", request.advancedSettings);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoParsing)) {
            body.put("AutoParsing", request.autoParsing);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRerunIntervalMillis)) {
            body.put("AutoRerunIntervalMillis", request.autoRerunIntervalMillis);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRerunTimes)) {
            body.put("AutoRerunTimes", request.autoRerunTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionName)) {
            body.put("ConnectionName", request.connectionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cronExpress)) {
            body.put("CronExpress", request.cronExpress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cycleType)) {
            body.put("CycleType", request.cycleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dependentNodeIdList)) {
            body.put("DependentNodeIdList", request.dependentNodeIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dependentType)) {
            body.put("DependentType", request.dependentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endEffectDate)) {
            body.put("EndEffectDate", request.endEffectDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileDescription)) {
            body.put("FileDescription", request.fileDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileFolderPath)) {
            body.put("FileFolderPath", request.fileFolderPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreParentSkipRunningProperty)) {
            body.put("IgnoreParentSkipRunningProperty", request.ignoreParentSkipRunningProperty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputList)) {
            body.put("InputList", request.inputList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputParameters)) {
            body.put("InputParameters", request.inputParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputList)) {
            body.put("OutputList", request.outputList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputParameters)) {
            body.put("OutputParameters", request.outputParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paraValue)) {
            body.put("ParaValue", request.paraValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerunMode)) {
            body.put("RerunMode", request.rerunMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIdentifier)) {
            body.put("ResourceGroupIdentifier", request.resourceGroupIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedulerType)) {
            body.put("SchedulerType", request.schedulerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startEffectDate)) {
            body.put("StartEffectDate", request.startEffectDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startImmediately)) {
            body.put("StartImmediately", request.startImmediately);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stop)) {
            body.put("Stop", request.stop);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFile"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFileResponse());
    }

    /**
     * @description When you debug or call this operation, you must specify new values for the specified parameters to ensure that the values are different from the original configurations of the file. For example, if the original value of a parameter is A, you must change the value of this parameter to B before you commit the node. If you set the parameter to A, an exception that indicates invalid data occurs.
     *
     * @param request UpdateFileRequest
     * @return UpdateFileResponse
     */
    public UpdateFileResponse updateFile(UpdateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFileWithOptions(request, runtime);
    }

    /**
     * @param request UpdateFolderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFolderResponse
     */
    public UpdateFolderResponse updateFolderWithOptions(UpdateFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("FolderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderName)) {
            body.put("FolderName", request.folderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFolder"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFolderResponse());
    }

    /**
     * @param request UpdateFolderRequest
     * @return UpdateFolderResponse
     */
    public UpdateFolderResponse updateFolder(UpdateFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFolderWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform.
     *
     * @param request UpdateIDEEventResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIDEEventResultResponse
     */
    public UpdateIDEEventResultResponse updateIDEEventResultWithOptions(UpdateIDEEventResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkResult)) {
            body.put("CheckResult", request.checkResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkResultTip)) {
            body.put("CheckResultTip", request.checkResultTip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extensionCode)) {
            body.put("ExtensionCode", request.extensionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            body.put("MessageId", request.messageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIDEEventResult"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIDEEventResultResponse());
    }

    /**
     * @summary The operation that you want to perform.
     *
     * @param request UpdateIDEEventResultRequest
     * @return UpdateIDEEventResultResponse
     */
    public UpdateIDEEventResultResponse updateIDEEventResult(UpdateIDEEventResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIDEEventResultWithOptions(request, runtime);
    }

    /**
     * @summary Updates a category.
     *
     * @param request UpdateMetaCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMetaCategoryResponse
     */
    public UpdateMetaCategoryResponse updateMetaCategoryWithOptions(UpdateMetaCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            body.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMetaCategory"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMetaCategoryResponse());
    }

    /**
     * @summary Updates a category.
     *
     * @param request UpdateMetaCategoryRequest
     * @return UpdateMetaCategoryResponse
     */
    public UpdateMetaCategoryResponse updateMetaCategory(UpdateMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMetaCategoryWithOptions(request, runtime);
    }

    /**
     * @summary Updates a collection.
     *
     * @description Only the name and comment of a collection can be updated.
     *
     * @param request UpdateMetaCollectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMetaCollectionResponse
     */
    public UpdateMetaCollectionResponse updateMetaCollectionWithOptions(UpdateMetaCollectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualifiedName)) {
            query.put("QualifiedName", request.qualifiedName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMetaCollection"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMetaCollectionResponse());
    }

    /**
     * @summary Updates a collection.
     *
     * @description Only the name and comment of a collection can be updated.
     *
     * @param request UpdateMetaCollectionRequest
     * @return UpdateMetaCollectionResponse
     */
    public UpdateMetaCollectionResponse updateMetaCollection(UpdateMetaCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMetaCollectionWithOptions(request, runtime);
    }

    /**
     * @summary Updates the metadata information about a table.
     *
     * @param request UpdateMetaTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMetaTableResponse
     */
    public UpdateMetaTableResponse updateMetaTableWithOptions(UpdateMetaTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caption)) {
            query.put("Caption", request.caption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            query.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newOwnerId)) {
            query.put("NewOwnerId", request.newOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schema)) {
            query.put("Schema", request.schema);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableGuid)) {
            query.put("TableGuid", request.tableGuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibility)) {
            query.put("Visibility", request.visibility);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addedLabels)) {
            body.put("AddedLabels", request.addedLabels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.removedLabels)) {
            body.put("RemovedLabels", request.removedLabels);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMetaTable"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMetaTableResponse());
    }

    /**
     * @summary Updates the metadata information about a table.
     *
     * @param request UpdateMetaTableRequest
     * @return UpdateMetaTableResponse
     */
    public UpdateMetaTableResponse updateMetaTable(UpdateMetaTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMetaTableWithOptions(request, runtime);
    }

    /**
     * @summary Updates the instructions on how to use a metatable. If no instruction on how to use the metatable is available, the instructions that are specified by calling this operation are added.
     *
     * @param request UpdateMetaTableIntroWikiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMetaTableIntroWikiResponse
     */
    public UpdateMetaTableIntroWikiResponse updateMetaTableIntroWikiWithOptions(UpdateMetaTableIntroWikiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tableGuid)) {
            query.put("TableGuid", request.tableGuid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMetaTableIntroWiki"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMetaTableIntroWikiResponse());
    }

    /**
     * @summary Updates the instructions on how to use a metatable. If no instruction on how to use the metatable is available, the instructions that are specified by calling this operation are added.
     *
     * @param request UpdateMetaTableIntroWikiRequest
     * @return UpdateMetaTableIntroWikiResponse
     */
    public UpdateMetaTableIntroWikiResponse updateMetaTableIntroWiki(UpdateMetaTableIntroWikiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMetaTableIntroWikiWithOptions(request, runtime);
    }

    /**
     * @param request UpdateNodeOwnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNodeOwnerResponse
     */
    public UpdateNodeOwnerResponse updateNodeOwnerWithOptions(UpdateNodeOwnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNodeOwner"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNodeOwnerResponse());
    }

    /**
     * @param request UpdateNodeOwnerRequest
     * @return UpdateNodeOwnerResponse
     */
    public UpdateNodeOwnerResponse updateNodeOwner(UpdateNodeOwnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNodeOwnerWithOptions(request, runtime);
    }

    /**
     * @param request UpdateNodeRunModeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNodeRunModeResponse
     */
    public UpdateNodeRunModeResponse updateNodeRunModeWithOptions(UpdateNodeRunModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedulerType)) {
            body.put("SchedulerType", request.schedulerType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNodeRunMode"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNodeRunModeResponse());
    }

    /**
     * @param request UpdateNodeRunModeRequest
     * @return UpdateNodeRunModeResponse
     */
    public UpdateNodeRunModeResponse updateNodeRunMode(UpdateNodeRunModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNodeRunModeWithOptions(request, runtime);
    }

    /**
     * @param request UpdateQualityFollowerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateQualityFollowerResponse
     */
    public UpdateQualityFollowerResponse updateQualityFollowerWithOptions(UpdateQualityFollowerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmMode)) {
            body.put("AlarmMode", request.alarmMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.follower)) {
            body.put("Follower", request.follower);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.followerId)) {
            body.put("FollowerId", request.followerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateQualityFollower"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateQualityFollowerResponse());
    }

    /**
     * @param request UpdateQualityFollowerRequest
     * @return UpdateQualityFollowerResponse
     */
    public UpdateQualityFollowerResponse updateQualityFollower(UpdateQualityFollowerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateQualityFollowerWithOptions(request, runtime);
    }

    /**
     * @param request UpdateQualityRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateQualityRuleResponse
     */
    public UpdateQualityRuleResponse updateQualityRuleWithOptions(UpdateQualityRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blockType)) {
            body.put("BlockType", request.blockType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checker)) {
            body.put("Checker", request.checker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.criticalThreshold)) {
            body.put("CriticalThreshold", request.criticalThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            body.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expectValue)) {
            body.put("ExpectValue", request.expectValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.methodName)) {
            body.put("MethodName", request.methodName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openSwitch)) {
            body.put("OpenSwitch", request.openSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            body.put("Operator", request.operator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictType)) {
            body.put("PredictType", request.predictType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.property)) {
            body.put("Property", request.property);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyType)) {
            body.put("PropertyType", request.propertyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            body.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            body.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskSetting)) {
            body.put("TaskSetting", request.taskSetting);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trend)) {
            body.put("Trend", request.trend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warningThreshold)) {
            body.put("WarningThreshold", request.warningThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whereCondition)) {
            body.put("WhereCondition", request.whereCondition);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateQualityRule"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateQualityRuleResponse());
    }

    /**
     * @param request UpdateQualityRuleRequest
     * @return UpdateQualityRuleResponse
     */
    public UpdateQualityRuleResponse updateQualityRule(UpdateQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateQualityRuleWithOptions(request, runtime);
    }

    /**
     * @param request UpdateRemindRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRemindResponse
     */
    public UpdateRemindResponse updateRemindWithOptions(UpdateRemindRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertInterval)) {
            body.put("AlertInterval", request.alertInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertMethods)) {
            body.put("AlertMethods", request.alertMethods);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertTargets)) {
            body.put("AlertTargets", request.alertTargets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertUnit)) {
            body.put("AlertUnit", request.alertUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baselineIds)) {
            body.put("BaselineIds", request.baselineIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizProcessIds)) {
            body.put("BizProcessIds", request.bizProcessIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detail)) {
            body.put("Detail", request.detail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dndEnd)) {
            body.put("DndEnd", request.dndEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxAlertTimes)) {
            body.put("MaxAlertTimes", request.maxAlertTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIds)) {
            body.put("NodeIds", request.nodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remindId)) {
            body.put("RemindId", request.remindId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remindName)) {
            body.put("RemindName", request.remindName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remindType)) {
            body.put("RemindType", request.remindType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remindUnit)) {
            body.put("RemindUnit", request.remindUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.robotUrls)) {
            body.put("RobotUrls", request.robotUrls);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useFlag)) {
            body.put("UseFlag", request.useFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhooks)) {
            body.put("Webhooks", request.webhooks);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRemind"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRemindResponse());
    }

    /**
     * @param request UpdateRemindRequest
     * @return UpdateRemindResponse
     */
    public UpdateRemindResponse updateRemind(UpdateRemindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRemindWithOptions(request, runtime);
    }

    /**
     * @summary The operation that you want to perform. Set the value to **UpdateTable**.
     *
     * @param request UpdateTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTableResponse
     */
    public UpdateTableResponse updateTableWithOptions(UpdateTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appGuid)) {
            query.put("AppGuid", request.appGuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createIfNotExists)) {
            query.put("CreateIfNotExists", request.createIfNotExists);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalTableType)) {
            query.put("ExternalTableType", request.externalTableType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hasPart)) {
            query.put("HasPart", request.hasPart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isView)) {
            query.put("IsView", request.isView);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifeCycle)) {
            query.put("LifeCycle", request.lifeCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            query.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalLevelId)) {
            query.put("LogicalLevelId", request.logicalLevelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.physicsLevelId)) {
            query.put("PhysicsLevelId", request.physicsLevelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schema)) {
            query.put("Schema", request.schema);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibility)) {
            query.put("Visibility", request.visibility);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columns)) {
            body.put("Columns", request.columns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            body.put("Endpoint", request.endpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            body.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.themes)) {
            body.put("Themes", request.themes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTable"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTableResponse());
    }

    /**
     * @summary The operation that you want to perform. Set the value to **UpdateTable**.
     *
     * @param request UpdateTableRequest
     * @return UpdateTableResponse
     */
    public UpdateTableResponse updateTable(UpdateTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTableWithOptions(request, runtime);
    }

    /**
     * @param request UpdateTableAddColumnRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTableAddColumnResponse
     */
    public UpdateTableAddColumnResponse updateTableAddColumnWithOptions(UpdateTableAddColumnRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tableGuid)) {
            query.put("TableGuid", request.tableGuid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.column)) {
            body.put("Column", request.column);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTableAddColumn"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTableAddColumnResponse());
    }

    /**
     * @param request UpdateTableAddColumnRequest
     * @return UpdateTableAddColumnResponse
     */
    public UpdateTableAddColumnResponse updateTableAddColumn(UpdateTableAddColumnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTableAddColumnWithOptions(request, runtime);
    }

    /**
     * @param request UpdateTableLevelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTableLevelResponse
     */
    public UpdateTableLevelResponse updateTableLevelWithOptions(UpdateTableLevelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.levelId)) {
            query.put("LevelId", request.levelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.levelType)) {
            query.put("LevelType", request.levelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTableLevel"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTableLevelResponse());
    }

    /**
     * @param request UpdateTableLevelRequest
     * @return UpdateTableLevelResponse
     */
    public UpdateTableLevelResponse updateTableLevel(UpdateTableLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTableLevelWithOptions(request, runtime);
    }

    /**
     * @param request UpdateTableModelInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTableModelInfoResponse
     */
    public UpdateTableModelInfoResponse updateTableModelInfoWithOptions(UpdateTableModelInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.firstLevelThemeId)) {
            query.put("FirstLevelThemeId", request.firstLevelThemeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.levelId)) {
            query.put("LevelId", request.levelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.levelType)) {
            query.put("LevelType", request.levelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondLevelThemeId)) {
            query.put("SecondLevelThemeId", request.secondLevelThemeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableGuid)) {
            query.put("TableGuid", request.tableGuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTableModelInfo"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTableModelInfoResponse());
    }

    /**
     * @param request UpdateTableModelInfoRequest
     * @return UpdateTableModelInfoResponse
     */
    public UpdateTableModelInfoResponse updateTableModelInfo(UpdateTableModelInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTableModelInfoWithOptions(request, runtime);
    }

    /**
     * @param request UpdateTableThemeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTableThemeResponse
     */
    public UpdateTableThemeResponse updateTableThemeWithOptions(UpdateTableThemeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.themeId)) {
            query.put("ThemeId", request.themeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTableTheme"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTableThemeResponse());
    }

    /**
     * @param request UpdateTableThemeRequest
     * @return UpdateTableThemeResponse
     */
    public UpdateTableThemeResponse updateTableTheme(UpdateTableThemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTableThemeWithOptions(request, runtime);
    }

    /**
     * @param request UpdateUdfFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUdfFileResponse
     */
    public UpdateUdfFileResponse updateUdfFileWithOptions(UpdateUdfFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.className)) {
            body.put("ClassName", request.className);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cmdDescription)) {
            body.put("CmdDescription", request.cmdDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.example)) {
            body.put("Example", request.example);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileFolderPath)) {
            body.put("FileFolderPath", request.fileFolderPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionType)) {
            body.put("FunctionType", request.functionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameterDescription)) {
            body.put("ParameterDescription", request.parameterDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectIdentifier)) {
            body.put("ProjectIdentifier", request.projectIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            body.put("Resources", request.resources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnValue)) {
            body.put("ReturnValue", request.returnValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.udfDescription)) {
            body.put("UdfDescription", request.udfDescription);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUdfFile"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUdfFileResponse());
    }

    /**
     * @param request UpdateUdfFileRequest
     * @return UpdateUdfFileResponse
     */
    public UpdateUdfFileResponse updateUdfFile(UpdateUdfFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUdfFileWithOptions(request, runtime);
    }

    /**
     * @summary 更新运维中心扩展程序的回调结果
     *
     * @param request UpdateWorkbenchEventResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkbenchEventResultResponse
     */
    public UpdateWorkbenchEventResultResponse updateWorkbenchEventResultWithOptions(UpdateWorkbenchEventResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkResult)) {
            query.put("CheckResult", request.checkResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkResultTip)) {
            query.put("CheckResultTip", request.checkResultTip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extensionCode)) {
            query.put("ExtensionCode", request.extensionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            query.put("MessageId", request.messageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkbenchEventResult"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkbenchEventResultResponse());
    }

    /**
     * @summary 更新运维中心扩展程序的回调结果
     *
     * @param request UpdateWorkbenchEventResultRequest
     * @return UpdateWorkbenchEventResultResponse
     */
    public UpdateWorkbenchEventResultResponse updateWorkbenchEventResult(UpdateWorkbenchEventResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWorkbenchEventResultWithOptions(request, runtime);
    }
}
