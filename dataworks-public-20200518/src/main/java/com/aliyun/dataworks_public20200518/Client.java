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
     * <b>summary</b> : 
     * <p>Unpublishes a DataService Studio API.</p>
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
     * <b>summary</b> : 
     * <p>Unpublishes a DataService Studio API.</p>
     * 
     * @param request AbolishDataServiceApiRequest
     * @return AbolishDataServiceApiResponse
     */
    public AbolishDataServiceApiResponse abolishDataServiceApi(AbolishDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.abolishDataServiceApiWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds an entity to a collection.</p>
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
     * <b>summary</b> : 
     * <p>Adds an entity to a collection.</p>
     * 
     * @param request AddMetaCollectionEntityRequest
     * @return AddMetaCollectionEntityResponse
     */
    public AddMetaCollectionEntityResponse addMetaCollectionEntity(AddMetaCollectionEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addMetaCollectionEntityWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about how to add an account to a DataWorks workspace as a member, see <a href="https://help.aliyun.com/document_detail/136941.html">Manage members and roles</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Assigns a role to a member of a DataWorks workspace. Before you call this operation, you must add your account to a DataWorks workspace as a member.</p>
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
     * <b>description</b> :
     * <p>For information about how to add an account to a DataWorks workspace as a member, see <a href="https://help.aliyun.com/document_detail/136941.html">Manage members and roles</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Assigns a role to a member of a DataWorks workspace. Before you call this operation, you must add your account to a DataWorks workspace as a member.</p>
     * 
     * @param request AddProjectMemberToRoleRequest
     * @return AddProjectMemberToRoleResponse
     */
    public AddProjectMemberToRoleResponse addProjectMemberToRole(AddProjectMemberToRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addProjectMemberToRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a sensitive field that is defined based on the category and sensitivity level of data in Data Security Guard.</p>
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
     * <b>summary</b> : 
     * <p>Adds a sensitive field that is defined based on the category and sensitivity level of data in Data Security Guard.</p>
     * 
     * @param request AddRecognizeRuleRequest
     * @return AddRecognizeRuleResponse
     */
    public AddRecognizeRuleResponse addRecognizeRule(AddRecognizeRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addRecognizeRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a metatable to a specified category.</p>
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
     * <b>summary</b> : 
     * <p>Adds a metatable to a specified category.</p>
     * 
     * @param request AddToMetaCategoryRequest
     * @return AddToMetaCategoryResponse
     */
    public AddToMetaCategoryResponse addToMetaCategory(AddToMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addToMetaCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Processes a permission request order.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Processes a permission request order.</p>
     * 
     * @param request ApprovePermissionApplyOrderRequest
     * @return ApprovePermissionApplyOrderResponse
     */
    public ApprovePermissionApplyOrderResponse approvePermissionApplyOrder(ApprovePermissionApplyOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.approvePermissionApplyOrderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sends the processing result of an extension point event by an extension to DataWorks.</p>
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
     * <b>summary</b> : 
     * <p>Sends the processing result of an extension point event by an extension to DataWorks.</p>
     * 
     * @param request CallbackExtensionRequest
     * @return CallbackExtensionResponse
     */
    public CallbackExtensionResponse callbackExtension(CallbackExtensionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.callbackExtensionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the resource group to which a resource belongs.</p>
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
     * <b>summary</b> : 
     * <p>Changes the resource group to which a resource belongs.</p>
     * 
     * @param request ChangeResourceManagerResourceGroupRequest
     * @return ChangeResourceManagerResourceGroupResponse
     */
    public ChangeResourceManagerResourceGroupResponse changeResourceManagerResourceGroup(ChangeResourceManagerResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceManagerResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Returns the check events of a file. After you commit your file that is created on the DataStudio page, the system checks the file and returns check events before the system deploys the file. You must determine whether the check can be continued based on the events. You can call this operation to return the check events for the file that you want to deploy to DataWorks.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Returns the check events of a file. After you commit your file that is created on the DataStudio page, the system checks the file and returns check events before the system deploys the file. You must determine whether the check can be continued based on the events. You can call this operation to return the check events for the file that you want to deploy to DataWorks.</p>
     * 
     * @param request CheckFileDeploymentRequest
     * @return CheckFileDeploymentResponse
     */
    public CheckFileDeploymentResponse checkFileDeployment(CheckFileDeploymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkFileDeploymentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether a partition in a MaxCompute metatable exists.</p>
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
     * <b>summary</b> : 
     * <p>Checks whether a partition in a MaxCompute metatable exists.</p>
     * 
     * @param request CheckMetaPartitionRequest
     * @return CheckMetaPartitionResponse
     */
    public CheckMetaPartitionResponse checkMetaPartition(CheckMetaPartitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkMetaPartitionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether a metatable exists.</p>
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
     * <b>summary</b> : 
     * <p>Checks whether a metatable exists.</p>
     * 
     * @param request CheckMetaTableRequest
     * @return CheckMetaTableResponse
     */
    public CheckMetaTableResponse checkMetaTable(CheckMetaTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkMetaTableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a baseline.</p>
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
     * <b>summary</b> : 
     * <p>Creates a baseline.</p>
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
     * <b>summary</b> : 
     * <p>Adds a data source.</p>
     * 
     * @deprecated OpenAPI CreateConnection is deprecated
     * 
     * @param request CreateConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateConnectionResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>Adds a data source.</p>
     * 
     * @deprecated OpenAPI CreateConnection is deprecated
     * 
     * @param request CreateConnectionRequest
     * @return CreateConnectionResponse
     */
    @Deprecated
    // Deprecated
    public CreateConnectionResponse createConnection(CreateConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createConnectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can configure alert rules only for tasks that can be used for real-time data synchronization.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an alert rule for a Data Integration task of a new version. Only the following type of task is supported: real-time data synchronization from a MySQL database to Hologres.</p>
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
     * <b>description</b> :
     * <p>You can configure alert rules only for tasks that can be used for real-time data synchronization.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an alert rule for a Data Integration task of a new version. Only the following type of task is supported: real-time data synchronization from a MySQL database to Hologres.</p>
     * 
     * @param request CreateDIAlarmRuleRequest
     * @return CreateDIAlarmRuleResponse
     */
    public CreateDIAlarmRuleResponse createDIAlarmRule(CreateDIAlarmRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDIAlarmRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a synchronization task of a new version in Data Integration. The following types of synchronization tasks are supported: real-time synchronization of all data in a MySQL database to Hologres and batch synchronization of all data in a MySQL database to Hive.</p>
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
     * <b>summary</b> : 
     * <p>Creates a synchronization task of a new version in Data Integration. The following types of synchronization tasks are supported: real-time synchronization of all data in a MySQL database to Hologres and batch synchronization of all data in a MySQL database to Hive.</p>
     * 
     * @param request CreateDIJobRequest
     * @return CreateDIJobResponse
     */
    public CreateDIJobResponse createDIJob(CreateDIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDIJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a data synchronization task.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskParam)) {
            query.put("TaskParam", request.taskParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskContent)) {
            body.put("TaskContent", request.taskContent);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
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
     * <b>summary</b> : 
     * <p>Creates a data synchronization task.</p>
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
    @Deprecated
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
    @Deprecated
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
    @Deprecated
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
    @Deprecated
    // Deprecated
    public CreateDagTestResponse createDagTest(CreateDagTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDagTestWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an API.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Creates an API.</p>
     * 
     * @param request CreateDataServiceApiRequest
     * @return CreateDataServiceApiResponse
     */
    public CreateDataServiceApiResponse createDataServiceApi(CreateDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataServiceApiWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Grants the access permissions on an API in DataService Studio.</p>
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
     * <b>summary</b> : 
     * <p>Grants the access permissions on an API in DataService Studio.</p>
     * 
     * @param request CreateDataServiceApiAuthorityRequest
     * @return CreateDataServiceApiAuthorityResponse
     */
    public CreateDataServiceApiAuthorityResponse createDataServiceApiAuthority(CreateDataServiceApiAuthorityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataServiceApiAuthorityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a folder in DataService Studio.</p>
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
     * <b>summary</b> : 
     * <p>Creates a folder in DataService Studio.</p>
     * 
     * @param request CreateDataServiceFolderRequest
     * @return CreateDataServiceFolderResponse
     */
    public CreateDataServiceFolderResponse createDataServiceFolder(CreateDataServiceFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataServiceFolderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a business process.</p>
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
     * <b>summary</b> : 
     * <p>Creates a business process.</p>
     * 
     * @param request CreateDataServiceGroupRequest
     * @return CreateDataServiceGroupResponse
     */
    public CreateDataServiceGroupResponse createDataServiceGroup(CreateDataServiceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataServiceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a data source to DataWorks.</p>
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
     * <b>summary</b> : 
     * <p>Adds a data source to DataWorks.</p>
     * 
     * @param request CreateDataSourceRequest
     * @return CreateDataSourceResponse
     */
    public CreateDataSourceResponse createDataSource(CreateDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an export task. You can use this operation to create an export task but cannot use this operation to start the created export task.</p>
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
     * <b>summary</b> : 
     * <p>Creates an export task. You can use this operation to create an export task but cannot use this operation to start the created export task.</p>
     * 
     * @param request CreateExportMigrationRequest
     * @return CreateExportMigrationResponse
     */
    public CreateExportMigrationResponse createExportMigration(CreateExportMigrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createExportMigrationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a file in DataStudio. You cannot call this operation to create files for Data Integration nodes.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.applyScheduleImmediately)) {
            body.put("ApplyScheduleImmediately", request.applyScheduleImmediately);
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
     * <b>summary</b> : 
     * <p>Creates a file in DataStudio. You cannot call this operation to create files for Data Integration nodes.</p>
     * 
     * @param request CreateFileRequest
     * @return CreateFileResponse
     */
    public CreateFileResponse createFile(CreateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The operation that you want to perform. Set the value to <strong>CreateFolder</strong>.</p>
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
     * <b>summary</b> : 
     * <p>The operation that you want to perform. Set the value to <strong>CreateFolder</strong>.</p>
     * 
     * @param request CreateFolderRequest
     * @return CreateFolderResponse
     */
    public CreateFolderResponse createFolder(CreateFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFolderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The import package must be uploaded. Example of the upload method:
     *         Config config = new Config();
     *         config.setAccessKeyId(accessId);
     *         config.setAccessKeySecret(accessKey);
     *         config.setEndpoint(popEndpoint);
     *         config.setRegionId(regionId);</p>
     * <pre><code>    Client client = new Client(config);
     *     CreateImportMigrationAdvanceRequest request = new CreateImportMigrationAdvanceRequest();
     *     request.setName(&quot;test_migration_api_&quot; + System.currentTimeMillis());
     *     request.setProjectId(123456L); 
     *     request.setPackageType(&quot;DATAWORKS_MODEL&quot;);
     *     request.setPackageFileObject(new FileInputStream(&quot;/home/admin/Downloads/test.zip&quot;));
     *     RuntimeOptions runtime = new RuntimeOptions();
     *     CreateImportMigrationResponse response = client.createImportMigrationAdvance(request, runtime);
     *     ...
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Creates an import task. The import task contains the import packages of data sources, nodes, and tables.</p>
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
     * <b>description</b> :
     * <p>The import package must be uploaded. Example of the upload method:
     *         Config config = new Config();
     *         config.setAccessKeyId(accessId);
     *         config.setAccessKeySecret(accessKey);
     *         config.setEndpoint(popEndpoint);
     *         config.setRegionId(regionId);</p>
     * <pre><code>    Client client = new Client(config);
     *     CreateImportMigrationAdvanceRequest request = new CreateImportMigrationAdvanceRequest();
     *     request.setName(&quot;test_migration_api_&quot; + System.currentTimeMillis());
     *     request.setProjectId(123456L); 
     *     request.setPackageType(&quot;DATAWORKS_MODEL&quot;);
     *     request.setPackageFileObject(new FileInputStream(&quot;/home/admin/Downloads/test.zip&quot;));
     *     RuntimeOptions runtime = new RuntimeOptions();
     *     CreateImportMigrationResponse response = client.createImportMigrationAdvance(request, runtime);
     *     ...
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Creates an import task. The import task contains the import packages of data sources, nodes, and tables.</p>
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
     * <b>summary</b> : 
     * <p>Triggers a manually triggered workflow to run. Before you call this operation, make sure that the manually triggered workflow is committed and deployed. You can find the manually triggered workflow on the Operation Center page only after the manually triggered workflow is committed and deployed.</p>
     * 
     * @deprecated OpenAPI CreateManualDag is deprecated
     * 
     * @param request CreateManualDagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateManualDagResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>Triggers a manually triggered workflow to run. Before you call this operation, make sure that the manually triggered workflow is committed and deployed. You can find the manually triggered workflow on the Operation Center page only after the manually triggered workflow is committed and deployed.</p>
     * 
     * @deprecated OpenAPI CreateManualDag is deprecated
     * 
     * @param request CreateManualDagRequest
     * @return CreateManualDagResponse
     */
    @Deprecated
    // Deprecated
    public CreateManualDagResponse createManualDag(CreateManualDagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createManualDagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a category.</p>
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
     * <b>summary</b> : 
     * <p>Creates a category.</p>
     * 
     * @param request CreateMetaCategoryRequest
     * @return CreateMetaCategoryResponse
     */
    public CreateMetaCategoryResponse createMetaCategory(CreateMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMetaCategoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Collections are classified into various types. The names of collections of the same type must be different.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a collection.</p>
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
     * <b>description</b> :
     * <p>Collections are classified into various types. The names of collections of the same type must be different.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a collection.</p>
     * 
     * @param request CreateMetaCollectionRequest
     * @return CreateMetaCollectionResponse
     */
    public CreateMetaCollectionResponse createMetaCollection(CreateMetaCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMetaCollectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a permission request order.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Creates a permission request order.</p>
     * 
     * @param request CreatePermissionApplyOrderRequest
     * @return CreatePermissionApplyOrderResponse
     */
    public CreatePermissionApplyOrderResponse createPermissionApplyOrder(CreatePermissionApplyOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPermissionApplyOrderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a DataWorks workspace.</p>
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
     * <b>summary</b> : 
     * <p>Creates a DataWorks workspace.</p>
     * 
     * @param request CreateProjectRequest
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a user to a DataWorks workspace.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Adds a user to a DataWorks workspace.</p>
     * 
     * @param request CreateProjectMemberRequest
     * @return CreateProjectMemberResponse
     */
    public CreateProjectMemberResponse createProjectMember(CreateProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProjectMemberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a partition filter expression.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Creates a partition filter expression.</p>
     * 
     * @param request CreateQualityEntityRequest
     * @return CreateQualityEntityResponse
     */
    public CreateQualityEntityResponse createQualityEntity(CreateQualityEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQualityEntityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a subscriber for a partition filter expression.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Creates a subscriber for a partition filter expression.</p>
     * 
     * @param request CreateQualityFollowerRequest
     * @return CreateQualityFollowerResponse
     */
    public CreateQualityFollowerResponse createQualityFollower(CreateQualityFollowerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQualityFollowerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a node with a partition filter expression.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Associates a node with a partition filter expression.</p>
     * 
     * @param request CreateQualityRelativeNodeRequest
     * @return CreateQualityRelativeNodeResponse
     */
    public CreateQualityRelativeNodeResponse createQualityRelativeNode(CreateQualityRelativeNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQualityRelativeNodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a monitoring rule.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Creates a monitoring rule.</p>
     * 
     * @param request CreateQualityRuleRequest
     * @return CreateQualityRuleResponse
     */
    public CreateQualityRuleResponse createQualityRule(CreateQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQualityRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom alert rule.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Creates a custom alert rule.</p>
     * 
     * @param request CreateRemindRequest
     * @return CreateRemindResponse
     */
    public CreateRemindResponse createRemind(CreateRemindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRemindWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>支持用户指定自己的文件（比如jar，py，arhive，file等）创建数据开发资源文件</p>
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
     * <b>summary</b> : 
     * <p>支持用户指定自己的文件（比如jar，py，arhive，file等）创建数据开发资源文件</p>
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
     * <b>summary</b> : 
     * <p>Creates a MaxCompute table or view.</p>
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
     * <b>summary</b> : 
     * <p>Creates a MaxCompute table or view.</p>
     * 
     * @param request CreateTableRequest
     * @return CreateTableResponse
     */
    public CreateTableResponse createTable(CreateTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a table level. This operation will be replaced soon. We recommend that you do not call this operation.</p>
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
     * <b>summary</b> : 
     * <p>Creates a table level. This operation will be replaced soon. We recommend that you do not call this operation.</p>
     * 
     * @param request CreateTableLevelRequest
     * @return CreateTableLevelResponse
     */
    public CreateTableLevelResponse createTableLevel(CreateTableLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTableLevelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a table theme. This operation will be replaced soon. We recommend that you do not call this operation.</p>
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
     * <b>summary</b> : 
     * <p>Creates a table theme. This operation will be replaced soon. We recommend that you do not call this operation.</p>
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
     * <b>summary</b> : 
     * <p>Deletes a baseline based on its ID. You can delete a baseline only if the nodes in the baseline does not have ancestor nodes. You can call the UpdateBaseline operation to delete the relationships between the nodes and their ancestor nodes.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes a baseline based on its ID. You can delete a baseline only if the nodes in the baseline does not have ancestor nodes. You can call the UpdateBaseline operation to delete the relationships between the nodes and their ancestor nodes.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Removes a data source.</p>
     * 
     * @deprecated OpenAPI DeleteConnection is deprecated
     * 
     * @param request DeleteConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteConnectionResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>Removes a data source.</p>
     * 
     * @deprecated OpenAPI DeleteConnection is deprecated
     * 
     * @param request DeleteConnectionRequest
     * @return DeleteConnectionResponse
     */
    @Deprecated
    // Deprecated
    public DeleteConnectionResponse deleteConnection(DeleteConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteConnectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can configure alert rules only for tasks whose MigrationType is set to RealtimeIncremental.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an alert rule for a Data Integration task of a new version. Only the following type of task is supported: real-time data synchronization from a MySQL database to Hologres.</p>
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
     * <b>description</b> :
     * <p>You can configure alert rules only for tasks whose MigrationType is set to RealtimeIncremental.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an alert rule for a Data Integration task of a new version. Only the following type of task is supported: real-time data synchronization from a MySQL database to Hologres.</p>
     * 
     * @param request DeleteDIAlarmRuleRequest
     * @return DeleteDIAlarmRuleResponse
     */
    public DeleteDIAlarmRuleResponse deleteDIAlarmRule(DeleteDIAlarmRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDIAlarmRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Data Integration task of a new version. Only the following type of task is supported: real-time data synchronization from a MySQL database to Hologres.</p>
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
     * <b>summary</b> : 
     * <p>Deletes a Data Integration task of a new version. Only the following type of task is supported: real-time data synchronization from a MySQL database to Hologres.</p>
     * 
     * @param request DeleteDIJobRequest
     * @return DeleteDIJobResponse
     */
    public DeleteDIJobResponse deleteDIJob(DeleteDIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDIJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you want to delete a batch synchronization task, call the DeleteFile operation. For more information, see <a href="https://help.aliyun.com/document_detail/321443.html">Delete a synchronization task</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a synchronization task. You can call this operation to delete only a real-time synchronization task.</p>
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
     * <b>description</b> :
     * <p>If you want to delete a batch synchronization task, call the DeleteFile operation. For more information, see <a href="https://help.aliyun.com/document_detail/321443.html">Delete a synchronization task</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a synchronization task. You can call this operation to delete only a real-time synchronization task.</p>
     * 
     * @param request DeleteDISyncTaskRequest
     * @return DeleteDISyncTaskResponse
     */
    public DeleteDISyncTaskResponse deleteDISyncTask(DeleteDISyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDISyncTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an API in DataService Studio.</p>
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
     * <b>summary</b> : 
     * <p>Deletes an API in DataService Studio.</p>
     * 
     * @param request DeleteDataServiceApiRequest
     * @return DeleteDataServiceApiResponse
     */
    public DeleteDataServiceApiResponse deleteDataServiceApi(DeleteDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataServiceApiWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes the access permissions on an API.</p>
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
     * <b>summary</b> : 
     * <p>Revokes the access permissions on an API.</p>
     * 
     * @param request DeleteDataServiceApiAuthorityRequest
     * @return DeleteDataServiceApiAuthorityResponse
     */
    public DeleteDataServiceApiAuthorityResponse deleteDataServiceApiAuthority(DeleteDataServiceApiAuthorityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataServiceApiAuthorityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a data source.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Removes a data source.</p>
     * 
     * @param request DeleteDataSourceRequest
     * @return DeleteDataSourceResponse
     */
    public DeleteDataSourceResponse deleteDataSource(DeleteDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a file from DataStudio. If the file has been committed, an asynchronous process is triggered to delete the file in the scheduling system. The value of the DeploymentId parameter returned is used to call the GetDeployment operation to poll the status of the asynchronous process.</p>
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
     * <b>summary</b> : 
     * <p>Deletes a file from DataStudio. If the file has been committed, an asynchronous process is triggered to delete the file in the scheduling system. The value of the DeploymentId parameter returned is used to call the GetDeployment operation to poll the status of the asynchronous process.</p>
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
     * <b>summary</b> : 
     * <p>Removes a table from a specified category.</p>
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
     * <b>summary</b> : 
     * <p>Removes a table from a specified category.</p>
     * 
     * @param request DeleteFromMetaCategoryRequest
     * @return DeleteFromMetaCategoryResponse
     */
    public DeleteFromMetaCategoryResponse deleteFromMetaCategory(DeleteFromMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFromMetaCategoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is in the trial phase. Users who need to call this operation can apply for it. The users can call this operation after the administrator adds the users to the trial list.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the lineage between entities. You can call this operation to delete only custom lineages that are registered by users.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.relationshipType)) {
            query.put("RelationshipType", request.relationshipType);
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
     * <b>description</b> :
     * <p>This operation is in the trial phase. Users who need to call this operation can apply for it. The users can call this operation after the administrator adds the users to the trial list.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the lineage between entities. You can call this operation to delete only custom lineages that are registered by users.</p>
     * 
     * @param request DeleteLineageRelationRequest
     * @return DeleteLineageRelationResponse
     */
    public DeleteLineageRelationResponse deleteLineageRelation(DeleteLineageRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLineageRelationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a category.</p>
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
     * <b>summary</b> : 
     * <p>Deletes a category.</p>
     * 
     * @param request DeleteMetaCategoryRequest
     * @return DeleteMetaCategoryResponse
     */
    public DeleteMetaCategoryResponse deleteMetaCategory(DeleteMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMetaCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a collection.</p>
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
     * <b>summary</b> : 
     * <p>Deletes a collection.</p>
     * 
     * @param request DeleteMetaCollectionRequest
     * @return DeleteMetaCollectionResponse
     */
    public DeleteMetaCollectionResponse deleteMetaCollection(DeleteMetaCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMetaCollectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an entity from a collection.</p>
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
     * <b>summary</b> : 
     * <p>Deletes an entity from a collection.</p>
     * 
     * @param request DeleteMetaCollectionEntityRequest
     * @return DeleteMetaCollectionEntityResponse
     */
    public DeleteMetaCollectionEntityResponse deleteMetaCollectionEntity(DeleteMetaCollectionEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMetaCollectionEntityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a user from a DataWorks workspace.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Removes a user from a DataWorks workspace.</p>
     * 
     * @param request DeleteProjectMemberRequest
     * @return DeleteProjectMemberResponse
     */
    public DeleteProjectMemberResponse deleteProjectMember(DeleteProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProjectMemberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a partition filter expression.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes a partition filter expression.</p>
     * 
     * @param request DeleteQualityEntityRequest
     * @return DeleteQualityEntityResponse
     */
    public DeleteQualityEntityResponse deleteQualityEntity(DeleteQualityEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQualityEntityWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In Data Quality, you must configure monitoring rules based on a partition filter expression. Data Quality uses these rules to detect changes in source data and dirty data generated during the process of extract, transform, and load (ETL). This way, you can prevent tasks from producing unexpected dirty data that affects the smooth running of tasks and business decision-making. You can go to the Manage Subscriptions page to add subscribers for a partition filter expression. When the monitoring rule that is created based on the partition filter expression is triggered, the subscribers can receive notifications and troubleshoot errors at the earliest opportunity. For more information, see <a href="https://help.aliyun.com/document_detail/73690.html">Configure monitoring rules</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a subscriber of a partition filter expression.</p>
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
     * <b>description</b> :
     * <p>In Data Quality, you must configure monitoring rules based on a partition filter expression. Data Quality uses these rules to detect changes in source data and dirty data generated during the process of extract, transform, and load (ETL). This way, you can prevent tasks from producing unexpected dirty data that affects the smooth running of tasks and business decision-making. You can go to the Manage Subscriptions page to add subscribers for a partition filter expression. When the monitoring rule that is created based on the partition filter expression is triggered, the subscribers can receive notifications and troubleshoot errors at the earliest opportunity. For more information, see <a href="https://help.aliyun.com/document_detail/73690.html">Configure monitoring rules</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a subscriber of a partition filter expression.</p>
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
     * <b>summary</b> : 
     * <p>Deletes a monitoring rule.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes a monitoring rule.</p>
     * 
     * @param request DeleteQualityRuleRequest
     * @return DeleteQualityRuleResponse
     */
    public DeleteQualityRuleResponse deleteQualityRule(DeleteQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQualityRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes sensitive field types.</p>
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
     * <b>summary</b> : 
     * <p>Deletes sensitive field types.</p>
     * 
     * @param request DeleteRecognizeRuleRequest
     * @return DeleteRecognizeRuleResponse
     */
    public DeleteRecognizeRuleResponse deleteRecognizeRule(DeleteRecognizeRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRecognizeRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom alert rule.</p>
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
     * <b>summary</b> : 
     * <p>Deletes a custom alert rule.</p>
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
     * <b>summary</b> : 
     * <p>Deletes a table level. This operation will be replaced soon. We recommend that you do not call this operation.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes a table level. This operation will be replaced soon. We recommend that you do not call this operation.</p>
     * 
     * @param request DeleteTableLevelRequest
     * @return DeleteTableLevelResponse
     */
    public DeleteTableLevelResponse deleteTableLevel(DeleteTableLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTableLevelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a table theme. This operation will be replaced soon. We recommend that you do not call this operation.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes a table theme. This operation will be replaced soon. We recommend that you do not call this operation.</p>
     * 
     * @param request DeleteTableThemeRequest
     * @return DeleteTableThemeResponse
     */
    public DeleteTableThemeResponse deleteTableTheme(DeleteTableThemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTableThemeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deploys a real-time synchronization task.</p>
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
     * <b>summary</b> : 
     * <p>Deploys a real-time synchronization task.</p>
     * 
     * @param request DeployDISyncTaskRequest
     * @return DeployDISyncTaskResponse
     */
    public DeployDISyncTaskResponse deployDISyncTask(DeployDISyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deployDISyncTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deploys a file to the production environment.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deploys a file to the production environment.</p>
     * 
     * @param request DeployFileRequest
     * @return DeployFileResponse
     */
    public DeployFileResponse deployFile(DeployFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deployFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Masks data.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Masks data.</p>
     * 
     * @param request DesensitizeDataRequest
     * @return DesensitizeDataResponse
     */
    public DesensitizeDataResponse desensitizeData(DesensitizeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.desensitizeDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds or modifies a data masking rule.</p>
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
     * <b>summary</b> : 
     * <p>Adds or modifies a data masking rule.</p>
     * 
     * @param request DsgDesensPlanAddOrUpdateRequest
     * @return DsgDesensPlanAddOrUpdateResponse
     */
    public DsgDesensPlanAddOrUpdateResponse dsgDesensPlanAddOrUpdate(DsgDesensPlanAddOrUpdateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgDesensPlanAddOrUpdateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a data masking rule created in Data Security Guard.</p>
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
     * <b>summary</b> : 
     * <p>Deletes a data masking rule created in Data Security Guard.</p>
     * 
     * @param request DsgDesensPlanDeleteRequest
     * @return DsgDesensPlanDeleteResponse
     */
    public DsgDesensPlanDeleteResponse dsgDesensPlanDelete(DsgDesensPlanDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgDesensPlanDeleteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of data masking rules.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of data masking rules.</p>
     * 
     * @param request DsgDesensPlanQueryListRequest
     * @return DsgDesensPlanQueryListResponse
     */
    public DsgDesensPlanQueryListResponse dsgDesensPlanQueryList(DsgDesensPlanQueryListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgDesensPlanQueryListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the status of a data masking rule.</p>
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
     * <b>summary</b> : 
     * <p>Modifies the status of a data masking rule.</p>
     * 
     * @param request DsgDesensPlanUpdateStatusRequest
     * @return DsgDesensPlanUpdateStatusResponse
     */
    public DsgDesensPlanUpdateStatusResponse dsgDesensPlanUpdateStatus(DsgDesensPlanUpdateStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgDesensPlanUpdateStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of compute engines of different types in the current tenant.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of compute engines of different types in the current tenant.</p>
     * 
     * @param request DsgPlatformQueryProjectsAndSchemaFromMetaRequest
     * @return DsgPlatformQueryProjectsAndSchemaFromMetaResponse
     */
    public DsgPlatformQueryProjectsAndSchemaFromMetaResponse dsgPlatformQueryProjectsAndSchemaFromMeta(DsgPlatformQueryProjectsAndSchemaFromMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgPlatformQueryProjectsAndSchemaFromMetaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of available sensitive field type templates and the data masking rules supported by the templates. You can refer to the response parameters of this operation to configure a data masking rule.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of available sensitive field type templates and the data masking rules supported by the templates. You can refer to the response parameters of this operation to configure a data masking rule.</p>
     * 
     * @param request DsgQueryDefaultTemplatesRequest
     * @return DsgQueryDefaultTemplatesResponse
     */
    public DsgQueryDefaultTemplatesResponse dsgQueryDefaultTemplates(DsgQueryDefaultTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgQueryDefaultTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The query capability of the API operation is similar to the query feature in Data Security Guard in the DataWorks console. The API operation can be used to query the identification results of sensitive data of a tenant based on the association with the tenant ID.</p>
     * <ul>
     * <li>You can search for a specific identification result based on filter conditions such as data source type and workspace.</li>
     * <li>You can sort the identification results of sensitive data of a tenant based on the values of a field in ascending or descending order.</li>
     * <li>This operation supports paged query.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the identification results of sensitive data.</p>
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
     * <b>description</b> :
     * <p>The query capability of the API operation is similar to the query feature in Data Security Guard in the DataWorks console. The API operation can be used to query the identification results of sensitive data of a tenant based on the association with the tenant ID.</p>
     * <ul>
     * <li>You can search for a specific identification result based on filter conditions such as data source type and workspace.</li>
     * <li>You can sort the identification results of sensitive data of a tenant based on the values of a field in ascending or descending order.</li>
     * <li>This operation supports paged query.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the identification results of sensitive data.</p>
     * 
     * @param request DsgQuerySensResultRequest
     * @return DsgQuerySensResultResponse
     */
    public DsgQuerySensResultResponse dsgQuerySensResult(DsgQuerySensResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgQuerySensResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a sensitive data identification task in Data Security Guard.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Starts a sensitive data identification task in Data Security Guard.</p>
     * 
     * @param request DsgRunSensIdentifyRequest
     * @return DsgRunSensIdentifyResponse
     */
    public DsgRunSensIdentifyResponse dsgRunSensIdentify(DsgRunSensIdentifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgRunSensIdentifyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds or modifies a level-2 data masking scenario.</p>
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
     * <b>summary</b> : 
     * <p>Adds or modifies a level-2 data masking scenario.</p>
     * 
     * @param request DsgSceneAddOrUpdateSceneRequest
     * @return DsgSceneAddOrUpdateSceneResponse
     */
    public DsgSceneAddOrUpdateSceneResponse dsgSceneAddOrUpdateScene(DsgSceneAddOrUpdateSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgSceneAddOrUpdateSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of data masking scenarios.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of data masking scenarios.</p>
     * 
     * @param request DsgSceneQuerySceneListByNameRequest
     * @return DsgSceneQuerySceneListByNameResponse
     */
    public DsgSceneQuerySceneListByNameResponse dsgSceneQuerySceneListByName(DsgSceneQuerySceneListByNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgSceneQuerySceneListByNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a level-2 data masking scenario created in Data Security Guard.</p>
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
     * <b>summary</b> : 
     * <p>Deletes a level-2 data masking scenario created in Data Security Guard.</p>
     * 
     * @param request DsgScenedDeleteSceneRequest
     * @return DsgScenedDeleteSceneResponse
     */
    public DsgScenedDeleteSceneResponse dsgScenedDeleteScene(DsgScenedDeleteSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgScenedDeleteSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a sensitive data identification task.</p>
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
     * <b>summary</b> : 
     * <p>Stops a sensitive data identification task.</p>
     * 
     * @param request DsgStopSensIdentifyRequest
     * @return DsgStopSensIdentifyResponse
     */
    public DsgStopSensIdentifyResponse dsgStopSensIdentify(DsgStopSensIdentifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgStopSensIdentifyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds or modifies a user group.</p>
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
     * <b>summary</b> : 
     * <p>Adds or modifies a user group.</p>
     * 
     * @param request DsgUserGroupAddOrUpdateRequest
     * @return DsgUserGroupAddOrUpdateResponse
     */
    public DsgUserGroupAddOrUpdateResponse dsgUserGroupAddOrUpdate(DsgUserGroupAddOrUpdateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgUserGroupAddOrUpdateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a user group configured in Data Security Guard.</p>
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
     * <b>summary</b> : 
     * <p>Deletes a user group configured in Data Security Guard.</p>
     * 
     * @param request DsgUserGroupDeleteRequest
     * @return DsgUserGroupDeleteResponse
     */
    public DsgUserGroupDeleteResponse dsgUserGroupDelete(DsgUserGroupDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgUserGroupDeleteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of MaxCompute roles that can be selected by the members of a user group when the user group is created or modified by the tenant in Data Security Guard.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries a list of MaxCompute roles that can be selected by the members of a user group when the user group is created or modified by the tenant in Data Security Guard.</p>
     * 
     * @param request DsgUserGroupGetOdpsRoleGroupsRequest
     * @return DsgUserGroupGetOdpsRoleGroupsResponse
     */
    public DsgUserGroupGetOdpsRoleGroupsResponse dsgUserGroupGetOdpsRoleGroups(DsgUserGroupGetOdpsRoleGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgUserGroupGetOdpsRoleGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of user groups in Data Security Guard.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of user groups in Data Security Guard.</p>
     * 
     * @param request DsgUserGroupQueryListRequest
     * @return DsgUserGroupQueryListResponse
     */
    public DsgUserGroupQueryListResponse dsgUserGroupQueryList(DsgUserGroupQueryListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgUserGroupQueryListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of users or roles of the current tenant.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of users or roles of the current tenant.</p>
     * @return DsgUserGroupQueryUserListResponse
     */
    public DsgUserGroupQueryUserListResponse dsgUserGroupQueryUserList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgUserGroupQueryUserListWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds or modifies a data masking whitelist.</p>
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
     * <b>summary</b> : 
     * <p>Adds or modifies a data masking whitelist.</p>
     * 
     * @param request DsgWhiteListAddOrUpdateRequest
     * @return DsgWhiteListAddOrUpdateResponse
     */
    public DsgWhiteListAddOrUpdateResponse dsgWhiteListAddOrUpdate(DsgWhiteListAddOrUpdateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgWhiteListAddOrUpdateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a data masking whitelist configured in Data Security Guard.</p>
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
     * <b>summary</b> : 
     * <p>Deletes a data masking whitelist configured in Data Security Guard.</p>
     * 
     * @param request DsgWhiteListDeleteListRequest
     * @return DsgWhiteListDeleteListResponse
     */
    public DsgWhiteListDeleteListResponse dsgWhiteListDeleteList(DsgWhiteListDeleteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgWhiteListDeleteListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a data masking whitelist.</p>
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
     * <b>summary</b> : 
     * <p>Queries a data masking whitelist.</p>
     * 
     * @param request DsgWhiteListQueryListRequest
     * @return DsgWhiteListQueryListResponse
     */
    public DsgWhiteListQueryListResponse dsgWhiteListQueryList(DsgWhiteListQueryListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dsgWhiteListQueryListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Edits a sensitive field that is defined based on the category and sensitivity level of data in Data Security Guard.</p>
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
     * <b>summary</b> : 
     * <p>Edits a sensitive field that is defined based on the category and sensitivity level of data in Data Security Guard.</p>
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
     * <b>summary</b> : 
     * <p>Exports a list of data sources.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Exports a list of data sources.</p>
     * 
     * @param request ExportDataSourcesRequest
     * @return ExportDataSourcesResponse
     */
    public ExportDataSourcesResponse exportDataSources(ExportDataSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportDataSourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>DataWorks allows you to use the <a href="https://help.aliyun.com/document_detail/278725.html">CreateDISyncTask</a> operation to directly create a batch synchronization task in Data Integration. To create a real-time synchronization task or another type of synchronization task, you must first call the <a href="https://help.aliyun.com/document_detail/383463.html">GenerateDISyncTaskConfigForCreating</a> operation to generate the ID of an asynchronous thread and call the <a href="https://help.aliyun.com/document_detail/383465.html">QueryDISyncTaskConfigProcessResult</a> operation to obtain the asynchronously generated parameters based on the ID. Then, you can use the parameters as request parameters of <a href="https://help.aliyun.com/document_detail/278725.html">CreateDISyncTask</a> and call the <a href="https://help.aliyun.com/document_detail/278725.html">CreateDISyncTask</a> operation to create a real-time synchronization task or another type of synchronization task. DataWorks allows you to create real-time synchronization tasks and other types of synchronization tasks in Data Integration only in asynchronous mode.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates an ID for an asynchronous thread that is used to create a synchronization task in Data Integration.</p>
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
     * <b>description</b> :
     * <p>DataWorks allows you to use the <a href="https://help.aliyun.com/document_detail/278725.html">CreateDISyncTask</a> operation to directly create a batch synchronization task in Data Integration. To create a real-time synchronization task or another type of synchronization task, you must first call the <a href="https://help.aliyun.com/document_detail/383463.html">GenerateDISyncTaskConfigForCreating</a> operation to generate the ID of an asynchronous thread and call the <a href="https://help.aliyun.com/document_detail/383465.html">QueryDISyncTaskConfigProcessResult</a> operation to obtain the asynchronously generated parameters based on the ID. Then, you can use the parameters as request parameters of <a href="https://help.aliyun.com/document_detail/278725.html">CreateDISyncTask</a> and call the <a href="https://help.aliyun.com/document_detail/278725.html">CreateDISyncTask</a> operation to create a real-time synchronization task or another type of synchronization task. DataWorks allows you to create real-time synchronization tasks and other types of synchronization tasks in Data Integration only in asynchronous mode.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates an ID for an asynchronous thread that is used to create a synchronization task in Data Integration.</p>
     * 
     * @param request GenerateDISyncTaskConfigForCreatingRequest
     * @return GenerateDISyncTaskConfigForCreatingResponse
     */
    public GenerateDISyncTaskConfigForCreatingResponse generateDISyncTaskConfigForCreating(GenerateDISyncTaskConfigForCreatingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateDISyncTaskConfigForCreatingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>DataWorks allows you to use only the <a href="https://help.aliyun.com/document_detail/289109.html">UpdateDISyncTask</a> operation to update a batch synchronization task in Data Integration. To update a real-time synchronization task, you must first call the GenerateDISyncTaskConfigForUpdating operation to generate the ID of an asynchronous thread and call the <a href="https://help.aliyun.com/document_detail/383465.html">QueryDISyncTaskConfigProcessResult</a> operation to obtain the asynchronously generated parameters based on the ID. Then, you can call the UpdateDISyncTask operation and use the parameters as request parameters to update a real-time synchronization task in Data Integration. DataWorks allows you to create or update real-time synchronization tasks in Data Integration only in asynchronous mode.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates the JSON for an asynchronous thread that is used to update a real-time synchronization task in Data Integration.</p>
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
     * <b>description</b> :
     * <p>DataWorks allows you to use only the <a href="https://help.aliyun.com/document_detail/289109.html">UpdateDISyncTask</a> operation to update a batch synchronization task in Data Integration. To update a real-time synchronization task, you must first call the GenerateDISyncTaskConfigForUpdating operation to generate the ID of an asynchronous thread and call the <a href="https://help.aliyun.com/document_detail/383465.html">QueryDISyncTaskConfigProcessResult</a> operation to obtain the asynchronously generated parameters based on the ID. Then, you can call the UpdateDISyncTask operation and use the parameters as request parameters to update a real-time synchronization task in Data Integration. DataWorks allows you to create or update real-time synchronization tasks in Data Integration only in asynchronous mode.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates the JSON for an asynchronous thread that is used to update a real-time synchronization task in Data Integration.</p>
     * 
     * @param request GenerateDISyncTaskConfigForUpdatingRequest
     * @return GenerateDISyncTaskConfigForUpdatingResponse
     */
    public GenerateDISyncTaskConfigForUpdatingResponse generateDISyncTaskConfigForUpdating(GenerateDISyncTaskConfigForUpdatingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateDISyncTaskConfigForUpdatingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries alert information based on the alert ID that is specified by the AlertId parameter.</p>
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
     * <b>summary</b> : 
     * <p>Queries alert information based on the alert ID that is specified by the AlertId parameter.</p>
     * 
     * @param request GetAlertMessageRequest
     * @return GetAlertMessageResponse
     */
    public GetAlertMessageResponse getAlertMessage(GetAlertMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAlertMessageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a baseline based on its ID.</p>
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
     * <b>summary</b> : 
     * <p>Queries the information about a baseline based on its ID.</p>
     * 
     * @param request GetBaselineRequest
     * @return GetBaselineResponse
     */
    public GetBaselineResponse getBaseline(GetBaselineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBaselineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of a baseline.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the configurations of a baseline.</p>
     * 
     * @param request GetBaselineConfigRequest
     * @return GetBaselineConfigResponse
     */
    public GetBaselineConfigResponse getBaselineConfig(GetBaselineConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBaselineConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The information about the events that are associated with the instance.</p>
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
     * <b>summary</b> : 
     * <p>The information about the events that are associated with the instance.</p>
     * 
     * @param request GetBaselineKeyPathRequest
     * @return GetBaselineKeyPathResponse
     */
    public GetBaselineKeyPathResponse getBaselineKeyPath(GetBaselineKeyPathRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBaselineKeyPathWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a baseline instance.</p>
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
     * <b>summary</b> : 
     * <p>Queries the details of a baseline instance.</p>
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
     * <b>summary</b> : 
     * <p>Queries the status of a table creation, update, or deletion task.</p>
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
     * <b>summary</b> : 
     * <p>Queries the status of a table creation, update, or deletion task.</p>
     * 
     * @param request GetDDLJobStatusRequest
     * @return GetDDLJobStatusResponse
     */
    public GetDDLJobStatusResponse getDDLJobStatus(GetDDLJobStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDDLJobStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can configure alert rules only for tasks that can be used for real-time data synchronization.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an alert rule for a Data Integration task of a new version. Only the following type of task is supported: real-time data synchronization from a MySQL database to Hologres.</p>
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
     * <b>description</b> :
     * <p>You can configure alert rules only for tasks that can be used for real-time data synchronization.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an alert rule for a Data Integration task of a new version. Only the following type of task is supported: real-time data synchronization from a MySQL database to Hologres.</p>
     * 
     * @param request GetDIAlarmRuleRequest
     * @return GetDIAlarmRuleResponse
     */
    public GetDIAlarmRuleResponse getDIAlarmRule(GetDIAlarmRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDIAlarmRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a new-version synchronization task created in Data Integration. The following types of synchronization tasks are supported: real-time synchronization of all data in a MySQL database to Hologres.</p>
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
     * <b>summary</b> : 
     * <p>Queries the information about a new-version synchronization task created in Data Integration. The following types of synchronization tasks are supported: real-time synchronization of all data in a MySQL database to Hologres.</p>
     * 
     * @param request GetDIJobRequest
     * @return GetDIJobResponse
     */
    public GetDIJobResponse getDIJob(GetDIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDIJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of a real-time synchronization task or a data synchronization solution.</p>
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
     * <b>summary</b> : 
     * <p>Queries the status of a real-time synchronization task or a data synchronization solution.</p>
     * 
     * @param request GetDISyncInstanceInfoRequest
     * @return GetDISyncInstanceInfoResponse
     */
    public GetDISyncInstanceInfoResponse getDISyncInstanceInfo(GetDISyncInstanceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDISyncInstanceInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a real-time synchronization task or a data synchronization solution.</p>
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
     * <b>summary</b> : 
     * <p>Queries the details of a real-time synchronization task or a data synchronization solution.</p>
     * 
     * @param request GetDISyncTaskRequest
     * @return GetDISyncTaskResponse
     */
    public GetDISyncTaskResponse getDISyncTask(GetDISyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDISyncTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Supported DAG types:</p>
     * <ul>
     * <li>MANUAL: DAG for a manually triggered workflow</li>
     * <li>SMOKE_TEST: DAG for a smoke testing workflow</li>
     * <li>SUPPLY_DATA: DAG for a data backfill instance</li>
     * <li>BUSINESS_PROCESS_DAG: DAG for a one-time workflow
     * Supported DAG states:</li>
     * <li>CREATED</li>
     * <li>RUNNING</li>
     * <li>FAILURE</li>
     * <li>SUCCESS</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a directed acyclic graph (DAG). You can call the GetDag operation to query the information about the DAG for a manually triggered workflow, a manually triggered node, or a data backfill instance. However, you cannot query the information about the DAG for an auto triggered node or an auto triggered workflow.</p>
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
     * <b>description</b> :
     * <p>Supported DAG types:</p>
     * <ul>
     * <li>MANUAL: DAG for a manually triggered workflow</li>
     * <li>SMOKE_TEST: DAG for a smoke testing workflow</li>
     * <li>SUPPLY_DATA: DAG for a data backfill instance</li>
     * <li>BUSINESS_PROCESS_DAG: DAG for a one-time workflow
     * Supported DAG states:</li>
     * <li>CREATED</li>
     * <li>RUNNING</li>
     * <li>FAILURE</li>
     * <li>SUCCESS</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a directed acyclic graph (DAG). You can call the GetDag operation to query the information about the DAG for a manually triggered workflow, a manually triggered node, or a data backfill instance. However, you cannot query the information about the DAG for an auto triggered node or an auto triggered workflow.</p>
     * 
     * @param request GetDagRequest
     * @return GetDagResponse
     */
    public GetDagResponse getDag(GetDagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a DataService Studio API in the development state.</p>
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
     * <b>summary</b> : 
     * <p>Queries the details of a DataService Studio API in the development state.</p>
     * 
     * @param request GetDataServiceApiRequest
     * @return GetDataServiceApiResponse
     */
    public GetDataServiceApiResponse getDataServiceApi(GetDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceApiWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the test results of an API in DataService Studio.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the test results of an API in DataService Studio.</p>
     * 
     * @param request GetDataServiceApiTestRequest
     * @return GetDataServiceApiTestResponse
     */
    public GetDataServiceApiTestResponse getDataServiceApiTest(GetDataServiceApiTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceApiTestWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an application.</p>
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
     * <b>summary</b> : 
     * <p>Queries the details of an application.</p>
     * 
     * @param request GetDataServiceApplicationRequest
     * @return GetDataServiceApplicationResponse
     */
    public GetDataServiceApplicationResponse getDataServiceApplication(GetDataServiceApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a folder.</p>
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
     * <b>summary</b> : 
     * <p>Queries a folder.</p>
     * 
     * @param request GetDataServiceFolderRequest
     * @return GetDataServiceFolderResponse
     */
    public GetDataServiceFolderResponse getDataServiceFolder(GetDataServiceFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceFolderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a business process.</p>
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
     * <b>summary</b> : 
     * <p>Queries a business process.</p>
     * 
     * @param request GetDataServiceGroupRequest
     * @return GetDataServiceGroupResponse
     */
    public GetDataServiceGroupResponse getDataServiceGroup(GetDataServiceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a DataService Studio API in the published state.</p>
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
     * <b>summary</b> : 
     * <p>Queries the information about a DataService Studio API in the published state.</p>
     * 
     * @param request GetDataServicePublishedApiRequest
     * @return GetDataServicePublishedApiResponse
     */
    public GetDataServicePublishedApiResponse getDataServicePublishedApi(GetDataServicePublishedApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServicePublishedApiWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the metadata of a specified data source.</p>
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
     * <b>summary</b> : 
     * <p>Queries the metadata of a specified data source.</p>
     * 
     * @param request GetDataSourceMetaRequest
     * @return GetDataSourceMetaResponse
     */
    public GetDataSourceMetaResponse getDataSourceMeta(GetDataSourceMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataSourceMetaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a deployment package.</p>
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
     * <b>summary</b> : 
     * <p>Queries the information about a deployment package.</p>
     * 
     * @param request GetDeploymentRequest
     * @return GetDeploymentResponse
     */
    public GetDeploymentResponse getDeployment(GetDeploymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeploymentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an extension.</p>
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
     * <b>summary</b> : 
     * <p>Queries the details of an extension.</p>
     * 
     * @param request GetExtensionRequest
     * @return GetExtensionResponse
     */
    public GetExtensionResponse getExtension(GetExtensionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getExtensionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a file.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the information about a file.</p>
     * 
     * @param request GetFileRequest
     * @return GetFileResponse
     */
    public GetFileResponse getFile(GetFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the distribution of node types.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the distribution of node types.</p>
     * 
     * @param request GetFileTypeStatisticRequest
     * @return GetFileTypeStatisticResponse
     */
    public GetFileTypeStatisticResponse getFileTypeStatistic(GetFileTypeStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFileTypeStatisticWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a file version.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the information about a file version.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the data snapshot of an extension point based on the ID of a message in DataWorks OpenEvent when the related extension point event is triggered.</p>
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
     * <b>summary</b> : 
     * <p>Queries the data snapshot of an extension point based on the ID of a message in DataWorks OpenEvent when the related extension point event is triggered.</p>
     * 
     * @param request GetIDEEventDetailRequest
     * @return GetIDEEventDetailResponse
     */
    public GetIDEEventDetailResponse getIDEEventDetail(GetIDEEventDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIDEEventDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the information about an instance.</p>
     * 
     * @param request GetInstanceRequest
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstance(GetInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ranking of the running durations of instances.</p>
     * 
     * @deprecated OpenAPI GetInstanceConsumeTimeRank is deprecated
     * 
     * @param request GetInstanceConsumeTimeRankRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceConsumeTimeRankResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>Queries the ranking of the running durations of instances.</p>
     * 
     * @deprecated OpenAPI GetInstanceConsumeTimeRank is deprecated
     * 
     * @param request GetInstanceConsumeTimeRankRequest
     * @return GetInstanceConsumeTimeRankResponse
     */
    @Deprecated
    // Deprecated
    public GetInstanceConsumeTimeRankResponse getInstanceConsumeTimeRank(GetInstanceConsumeTimeRankRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceConsumeTimeRankWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the quantity trend of auto triggered instances.</p>
     * 
     * @deprecated OpenAPI GetInstanceCountTrend is deprecated
     * 
     * @param request GetInstanceCountTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceCountTrendResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>Queries the quantity trend of auto triggered instances.</p>
     * 
     * @deprecated OpenAPI GetInstanceCountTrend is deprecated
     * 
     * @param request GetInstanceCountTrendRequest
     * @return GetInstanceCountTrendResponse
     */
    @Deprecated
    // Deprecated
    public GetInstanceCountTrendResponse getInstanceCountTrend(GetInstanceCountTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceCountTrendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ranking of nodes on which errors occur within the last month.</p>
     * 
     * @deprecated OpenAPI GetInstanceErrorRank is deprecated
     * 
     * @param request GetInstanceErrorRankRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceErrorRankResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>Queries the ranking of nodes on which errors occur within the last month.</p>
     * 
     * @deprecated OpenAPI GetInstanceErrorRank is deprecated
     * 
     * @param request GetInstanceErrorRankRequest
     * @return GetInstanceErrorRankResponse
     */
    @Deprecated
    // Deprecated
    public GetInstanceErrorRankResponse getInstanceErrorRank(GetInstanceErrorRankRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceErrorRankWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You may not obtain the instance logs that were generated more than seven days ago.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the logs of an instance.</p>
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
     * <b>description</b> :
     * <p>You may not obtain the instance logs that were generated more than seven days ago.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the logs of an instance.</p>
     * 
     * @param request GetInstanceLogRequest
     * @return GetInstanceLogResponse
     */
    public GetInstanceLogResponse getInstanceLog(GetInstanceLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics of instances in different states.</p>
     * 
     * @deprecated OpenAPI GetInstanceStatusCount is deprecated
     * 
     * @param request GetInstanceStatusCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceStatusCountResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>Queries the statistics of instances in different states.</p>
     * 
     * @deprecated OpenAPI GetInstanceStatusCount is deprecated
     * 
     * @param request GetInstanceStatusCountRequest
     * @return GetInstanceStatusCountResponse
     */
    @Deprecated
    // Deprecated
    public GetInstanceStatusCountResponse getInstanceStatusCount(GetInstanceStatusCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceStatusCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of instances that are in each state.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the number of instances that are in each state.</p>
     * 
     * @param request GetInstanceStatusStatisticRequest
     * @return GetInstanceStatusStatisticResponse
     */
    public GetInstanceStatusStatisticResponse getInstanceStatusStatistic(GetInstanceStatusStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceStatusStatisticWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about instances in a manually triggered workflow.</p>
     * 
     * @deprecated OpenAPI GetManualDagInstances is deprecated
     * 
     * @param request GetManualDagInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetManualDagInstancesResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>Queries the information about instances in a manually triggered workflow.</p>
     * 
     * @deprecated OpenAPI GetManualDagInstances is deprecated
     * 
     * @param request GetManualDagInstancesRequest
     * @return GetManualDagInstancesResponse
     */
    @Deprecated
    // Deprecated
    public GetManualDagInstancesResponse getManualDagInstances(GetManualDagInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getManualDagInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a category tree.</p>
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
     * <b>summary</b> : 
     * <p>Queries the information about a category tree.</p>
     * 
     * @param request GetMetaCategoryRequest
     * @return GetMetaCategoryResponse
     */
    public GetMetaCategoryResponse getMetaCategory(GetMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a collection.</p>
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
     * <b>summary</b> : 
     * <p>Queries the information about a collection.</p>
     * 
     * @param request GetMetaCollectionDetailRequest
     * @return GetMetaCollectionDetailResponse
     */
    public GetMetaCollectionDetailResponse getMetaCollectionDetail(GetMetaCollectionDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaCollectionDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the lineage of a field in a metatable.</p>
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
     * <b>summary</b> : 
     * <p>Queries the lineage of a field in a metatable.</p>
     * 
     * @param request GetMetaColumnLineageRequest
     * @return GetMetaColumnLineageResponse
     */
    public GetMetaColumnLineageResponse getMetaColumnLineage(GetMetaColumnLineageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaColumnLineageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The ID of the EMR cluster. This parameter is required only if you set the DataSourceType parameter to emr.
     * You can log on to the <a href="https://emr.console.aliyun.com/?spm=a2c4g.11186623.0.0.965cc5c2GeiHet#/cn-hangzhou">EMR console</a> to obtain the ID of the EMR cluster.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic metadata information about a compute engine instance.</p>
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
     * <b>description</b> :
     * <p>The ID of the EMR cluster. This parameter is required only if you set the DataSourceType parameter to emr.
     * You can log on to the <a href="https://emr.console.aliyun.com/?spm=a2c4g.11186623.0.0.965cc5c2GeiHet#/cn-hangzhou">EMR console</a> to obtain the ID of the EMR cluster.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic metadata information about a compute engine instance.</p>
     * 
     * @param request GetMetaDBInfoRequest
     * @return GetMetaDBInfoResponse
     */
    public GetMetaDBInfoResponse getMetaDBInfo(GetMetaDBInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaDBInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries metatables in a compute engine instance.</p>
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
     * <b>summary</b> : 
     * <p>Queries metatables in a compute engine instance.</p>
     * 
     * @param request GetMetaDBTableListRequest
     * @return GetMetaDBTableListResponse
     */
    public GetMetaDBTableListResponse getMetaDBTableList(GetMetaDBTableListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaDBTableListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the basic information about a metatable.</p>
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
     * <b>summary</b> : 
     * <p>Queries the basic information about a metatable.</p>
     * 
     * @param request GetMetaTableBasicInfoRequest
     * @return GetMetaTableBasicInfoResponse
     */
    public GetMetaTableBasicInfoResponse getMetaTableBasicInfo(GetMetaTableBasicInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableBasicInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation will be replaced soon. We recommend that you do not call this operation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the change logs of a metatable.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>This operation will be replaced soon. We recommend that you do not call this operation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the change logs of a metatable.</p>
     * 
     * @param request GetMetaTableChangeLogRequest
     * @return GetMetaTableChangeLogResponse
     */
    public GetMetaTableChangeLogResponse getMetaTableChangeLog(GetMetaTableChangeLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableChangeLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the field information of a metatable.</p>
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
     * <b>summary</b> : 
     * <p>Queries the field information of a metatable.</p>
     * 
     * @param request GetMetaTableColumnRequest
     * @return GetMetaTableColumnResponse
     */
    public GetMetaTableColumnResponse getMetaTableColumn(GetMetaTableColumnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableColumnWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the complete information about a metatable, including information about fields in the metatable.</p>
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
     * <b>summary</b> : 
     * <p>Queries the complete information about a metatable, including information about fields in the metatable.</p>
     * 
     * @param request GetMetaTableFullInfoRequest
     * @return GetMetaTableFullInfoResponse
     */
    public GetMetaTableFullInfoResponse getMetaTableFullInfo(GetMetaTableFullInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableFullInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the instructions on how to use a table.</p>
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
     * <b>summary</b> : 
     * <p>Queries the instructions on how to use a table.</p>
     * 
     * @param request GetMetaTableIntroWikiRequest
     * @return GetMetaTableIntroWikiResponse
     */
    public GetMetaTableIntroWikiResponse getMetaTableIntroWiki(GetMetaTableIntroWikiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableIntroWikiWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the lineage of a metatable.</p>
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
     * <b>summary</b> : 
     * <p>Queries the lineage of a metatable.</p>
     * 
     * @param request GetMetaTableLineageRequest
     * @return GetMetaTableLineageResponse
     */
    public GetMetaTableLineageResponse getMetaTableLineage(GetMetaTableLineageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableLineageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries metatables in a specified category.</p>
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
     * <b>summary</b> : 
     * <p>Queries metatables in a specified category.</p>
     * 
     * @param request GetMetaTableListByCategoryRequest
     * @return GetMetaTableListByCategoryResponse
     */
    public GetMetaTableListByCategoryResponse getMetaTableListByCategory(GetMetaTableListByCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableListByCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the output information of a metatable.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the output information of a metatable.</p>
     * 
     * @param request GetMetaTableOutputRequest
     * @return GetMetaTableOutputResponse
     */
    public GetMetaTableOutputResponse getMetaTableOutput(GetMetaTableOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableOutputWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only the partitions of a metatable in a MaxCompute or E-MapReduce (EMR) compute engine. If you query partitions of a metatable in an EMR compute engine, only DataLake clusters that use Data Lake Formation (DLF) to manage metadata and Hadoop clusters whose cluster version is earlier than 3.41.0 or 5.7.0 are supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains a list of partitions in a metatable.</p>
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
     * <b>description</b> :
     * <p>You can call this operation to query only the partitions of a metatable in a MaxCompute or E-MapReduce (EMR) compute engine. If you query partitions of a metatable in an EMR compute engine, only DataLake clusters that use Data Lake Formation (DLF) to manage metadata and Hadoop clusters whose cluster version is earlier than 3.41.0 or 5.7.0 are supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains a list of partitions in a metatable.</p>
     * 
     * @param request GetMetaTablePartitionRequest
     * @return GetMetaTablePartitionResponse
     */
    public GetMetaTablePartitionResponse getMetaTablePartition(GetMetaTablePartitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTablePartitionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Table的产出任务列表</p>
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
     * <b>summary</b> : 
     * <p>获取Table的产出任务列表</p>
     * 
     * @param request GetMetaTableProducingTasksRequest
     * @return GetMetaTableProducingTasksResponse
     */
    public GetMetaTableProducingTasksResponse getMetaTableProducingTasks(GetMetaTableProducingTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableProducingTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the themes and levels of a metatable.</p>
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
     * <b>summary</b> : 
     * <p>Queries the information about the themes and levels of a metatable.</p>
     * 
     * @param request GetMetaTableThemeLevelRequest
     * @return GetMetaTableThemeLevelResponse
     */
    public GetMetaTableThemeLevelResponse getMetaTableThemeLevel(GetMetaTableThemeLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableThemeLevelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the progress of a migration task.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the progress of a migration task.</p>
     * 
     * @param request GetMigrationProcessRequest
     * @return GetMigrationProcessResponse
     */
    public GetMigrationProcessResponse getMigrationProcess(GetMigrationProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMigrationProcessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a migration task.</p>
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
     * <b>summary</b> : 
     * <p>Queries the information about a migration task.</p>
     * 
     * @param request GetMigrationSummaryRequest
     * @return GetMigrationSummaryResponse
     */
    public GetMigrationSummaryResponse getMigrationSummary(GetMigrationSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMigrationSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Indicates whether the request is successful.</p>
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
     * <b>summary</b> : 
     * <p>Indicates whether the request is successful.</p>
     * 
     * @param request GetNodeRequest
     * @return GetNodeResponse
     */
    public GetNodeResponse getNode(GetNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of instances.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries a list of instances.</p>
     * 
     * @param request GetNodeChildrenRequest
     * @return GetNodeChildrenResponse
     */
    public GetNodeChildrenResponse getNodeChildren(GetNodeChildrenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeChildrenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the code of a node.</p>
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
     * <b>summary</b> : 
     * <p>Queries the code of a node.</p>
     * 
     * @param request GetNodeCodeRequest
     * @return GetNodeCodeResponse
     */
    public GetNodeCodeResponse getNodeCode(GetNodeCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the nodes associated with a baseline.</p>
     * 
     * @deprecated OpenAPI GetNodeOnBaseline is deprecated
     * 
     * @param request GetNodeOnBaselineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNodeOnBaselineResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>Queries the nodes associated with a baseline.</p>
     * 
     * @deprecated OpenAPI GetNodeOnBaseline is deprecated
     * 
     * @param request GetNodeOnBaselineRequest
     * @return GetNodeOnBaselineResponse
     */
    @Deprecated
    // Deprecated
    public GetNodeOnBaselineResponse getNodeOnBaseline(GetNodeOnBaselineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeOnBaselineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ancestor nodes of a node.</p>
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
     * <b>summary</b> : 
     * <p>Queries the ancestor nodes of a node.</p>
     * 
     * @param request GetNodeParentsRequest
     * @return GetNodeParentsResponse
     */
    public GetNodeParentsResponse getNodeParents(GetNodeParentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeParentsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about node types, including the code and name of a node type.</p>
     * 
     * @deprecated OpenAPI GetNodeTypeListInfo is deprecated
     * 
     * @param request GetNodeTypeListInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNodeTypeListInfoResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>Queries the information about node types, including the code and name of a node type.</p>
     * 
     * @deprecated OpenAPI GetNodeTypeListInfo is deprecated
     * 
     * @param request GetNodeTypeListInfoRequest
     * @return GetNodeTypeListInfoResponse
     */
    @Deprecated
    // Deprecated
    public GetNodeTypeListInfoResponse getNodeTypeListInfo(GetNodeTypeListInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeTypeListInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the records that are generated on a specified date for access to the high-risk sensitive data in all the DataWorks workspaces of a tenant.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the records that are generated on a specified date for access to the high-risk sensitive data in all the DataWorks workspaces of a tenant.</p>
     * 
     * @param request GetOpRiskDataRequest
     * @return GetOpRiskDataResponse
     */
    public GetOpRiskDataResponse getOpRiskData(GetOpRiskDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOpRiskDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the records that are generated on a specified date for access to sensitive data in all the DataWorks workspaces of a tenant.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the records that are generated on a specified date for access to sensitive data in all the DataWorks workspaces of a tenant.</p>
     * 
     * @param request GetOpSensitiveDataRequest
     * @return GetOpSensitiveDataResponse
     */
    public GetOpSensitiveDataResponse getOpSensitiveData(GetOpSensitiveDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOpSensitiveDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the option settings of an extension in a workspace.</p>
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
     * <b>summary</b> : 
     * <p>Queries the option settings of an extension in a workspace.</p>
     * 
     * @param request GetOptionValueForProjectRequest
     * @return GetOptionValueForProjectResponse
     */
    public GetOptionValueForProjectResponse getOptionValueForProject(GetOptionValueForProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOptionValueForProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a permission request order.</p>
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
     * <b>summary</b> : 
     * <p>Queries the details of a permission request order.</p>
     * 
     * @param request GetPermissionApplyOrderDetailRequest
     * @return GetPermissionApplyOrderDetailResponse
     */
    public GetPermissionApplyOrderDetailResponse getPermissionApplyOrderDetail(GetPermissionApplyOrderDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPermissionApplyOrderDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a DataWorks workspace.</p>
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
     * <b>summary</b> : 
     * <p>Queries the information about a DataWorks workspace.</p>
     * 
     * @param request GetProjectRequest
     * @return GetProjectResponse
     */
    public GetProjectResponse getProject(GetProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a DataWorks workspace.</p>
     * 
     * @deprecated OpenAPI GetProjectDetail is deprecated
     * 
     * @param request GetProjectDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectDetailResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>Queries the information about a DataWorks workspace.</p>
     * 
     * @deprecated OpenAPI GetProjectDetail is deprecated
     * 
     * @param request GetProjectDetailRequest
     * @return GetProjectDetailResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>Queries the information about a monitoring rule.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the information about a monitoring rule.</p>
     * 
     * @param request GetQualityRuleRequest
     * @return GetQualityRuleResponse
     */
    public GetQualityRuleResponse getQualityRule(GetQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Debugging</h2>
     * <p><a href="https://api.aliyun.com/#product=dataworks-public%5C&api=GetRemind%5C&type=RPC%5C&version=2020-05-18">OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a custom alert rule.</p>
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
     * <b>description</b> :
     * <h2>Debugging</h2>
     * <p><a href="https://api.aliyun.com/#product=dataworks-public%5C&api=GetRemind%5C&type=RPC%5C&version=2020-05-18">OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a custom alert rule.</p>
     * 
     * @param request GetRemindRequest
     * @return GetRemindResponse
     */
    public GetRemindResponse getRemind(GetRemindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRemindWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the latest sensitive data in all the DataWorks workspaces of a tenant.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the latest sensitive data in all the DataWorks workspaces of a tenant.</p>
     * 
     * @param request GetSensitiveDataRequest
     * @return GetSensitiveDataResponse
     */
    public GetSensitiveDataResponse getSensitiveData(GetSensitiveDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSensitiveDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics of instances in different periods of a day.</p>
     * 
     * @deprecated OpenAPI GetSuccessInstanceTrend is deprecated
     * 
     * @param request GetSuccessInstanceTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSuccessInstanceTrendResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>Queries the statistics of instances in different periods of a day.</p>
     * 
     * @deprecated OpenAPI GetSuccessInstanceTrend is deprecated
     * 
     * @param request GetSuccessInstanceTrendRequest
     * @return GetSuccessInstanceTrendResponse
     */
    @Deprecated
    // Deprecated
    public GetSuccessInstanceTrendResponse getSuccessInstanceTrend(GetSuccessInstanceTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSuccessInstanceTrendWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about an event.</p>
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
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about an event.</p>
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
     * <b>description</b> :
     * <p>You can import self-managed data sources or data sources that are exported from other DataWorks workspaces to a specific DataWorks workspace.</p>
     * <ul>
     * <li>To import a self-managed data source to a DataWorks workspace, the data source type must be supported by DataWorks. For more information about the types of data sources supported by DataWorks, see <a href="https://help.aliyun.com/document_detail/181656.html">Supported data stores</a>.</li>
     * <li>For more information about how to export data sources from DataWorks workspaces to your on-premises machine, see <a href="https://help.aliyun.com/document_detail/279570.html">ExportDataSources</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Imports data sources from your on-premises machine to a specific DataWorks workspace.</p>
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
     * <b>description</b> :
     * <p>You can import self-managed data sources or data sources that are exported from other DataWorks workspaces to a specific DataWorks workspace.</p>
     * <ul>
     * <li>To import a self-managed data source to a DataWorks workspace, the data source type must be supported by DataWorks. For more information about the types of data sources supported by DataWorks, see <a href="https://help.aliyun.com/document_detail/181656.html">Supported data stores</a>.</li>
     * <li>For more information about how to export data sources from DataWorks workspaces to your on-premises machine, see <a href="https://help.aliyun.com/document_detail/279570.html">ExportDataSources</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Imports data sources from your on-premises machine to a specific DataWorks workspace.</p>
     * 
     * @param request ImportDataSourcesRequest
     * @return ImportDataSourcesResponse
     */
    public ImportDataSourcesResponse importDataSources(ImportDataSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importDataSourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of alerts.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries a list of alerts.</p>
     * 
     * @param request ListAlertMessagesRequest
     * @return ListAlertMessagesResponse
     */
    public ListAlertMessagesResponse listAlertMessages(ListAlertMessagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAlertMessagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of baselines.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries a list of baselines.</p>
     * 
     * @param request ListBaselineConfigsRequest
     * @return ListBaselineConfigsResponse
     */
    public ListBaselineConfigsResponse listBaselineConfigs(ListBaselineConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBaselineConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of baseline instances.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of baseline instances.</p>
     * 
     * @param request ListBaselineStatusesRequest
     * @return ListBaselineStatusesResponse
     */
    public ListBaselineStatusesResponse listBaselineStatuses(ListBaselineStatusesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBaselineStatusesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a list of baselines.</p>
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
     * <b>summary</b> : 
     * <p>Obtains a list of baselines.</p>
     * 
     * @param request ListBaselinesRequest
     * @return ListBaselinesResponse
     */
    public ListBaselinesResponse listBaselines(ListBaselinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBaselinesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of workflows.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of workflows.</p>
     * 
     * @param request ListBusinessRequest
     * @return ListBusinessResponse
     */
    public ListBusinessResponse listBusiness(ListBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBusinessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of compute engines that are associated with a DataWorks workspace.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of compute engines that are associated with a DataWorks workspace.</p>
     * 
     * @param request ListCalcEnginesRequest
     * @return ListCalcEnginesResponse
     */
    public ListCalcEnginesResponse listCalcEngines(ListCalcEnginesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCalcEnginesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询扩展事件的检查列表</p>
     * 
     * @param request ListCheckProcessesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCheckProcessesResponse
     */
    public ListCheckProcessesResponse listCheckProcessesWithOptions(ListCheckProcessesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            body.put("EventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            body.put("Operator", request.operator);
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

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCheckProcesses"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCheckProcessesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询扩展事件的检查列表</p>
     * 
     * @param request ListCheckProcessesRequest
     * @return ListCheckProcessesResponse
     */
    public ListCheckProcessesResponse listCheckProcesses(ListCheckProcessesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCheckProcessesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出集群的配置信息</p>
     * 
     * @param request ListClusterConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClusterConfigsResponse
     */
    public ListClusterConfigsResponse listClusterConfigsWithOptions(ListClusterConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterConfigs"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出集群的配置信息</p>
     * 
     * @param request ListClusterConfigsRequest
     * @return ListClusterConfigsResponse
     */
    public ListClusterConfigsResponse listClusterConfigs(ListClusterConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClusterConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出注册到 DataWorks 的集群的信息</p>
     * 
     * @param request ListClustersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClustersResponse
     */
    public ListClustersResponse listClustersWithOptions(ListClustersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusters"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClustersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出注册到 DataWorks 的集群的信息</p>
     * 
     * @param request ListClustersRequest
     * @return ListClustersResponse
     */
    public ListClustersResponse listClusters(ListClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClustersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of data sources.</p>
     * 
     * @deprecated OpenAPI ListConnections is deprecated
     * 
     * @param request ListConnectionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConnectionsResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>Queries a list of data sources.</p>
     * 
     * @deprecated OpenAPI ListConnections is deprecated
     * 
     * @param request ListConnectionsRequest
     * @return ListConnectionsResponse
     */
    @Deprecated
    // Deprecated
    public ListConnectionsResponse listConnections(ListConnectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConnectionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can configure alert rules only for tasks that can be used for real-time data synchronization.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of alert rules for a new-version synchronization task. The following type of task is supported: real-time data synchronization from a MySQL database to Hologres.</p>
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
     * <b>description</b> :
     * <p>You can configure alert rules only for tasks that can be used for real-time data synchronization.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of alert rules for a new-version synchronization task. The following type of task is supported: real-time data synchronization from a MySQL database to Hologres.</p>
     * 
     * @param request ListDIAlarmRulesRequest
     * @return ListDIAlarmRulesResponse
     */
    public ListDIAlarmRulesResponse listDIAlarmRules(ListDIAlarmRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDIAlarmRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to obtain only the basic information about the tasks. If you want to obtain the details of a task, call the GetDIJob operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of new-version synchronization tasks. The following type of task is supported: real-time data synchronization from a MySQL database to Hologres.</p>
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
     * <b>description</b> :
     * <p>You can call this operation to obtain only the basic information about the tasks. If you want to obtain the details of a task, call the GetDIJob operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of new-version synchronization tasks. The following type of task is supported: real-time data synchronization from a MySQL database to Hologres.</p>
     * 
     * @param request ListDIJobsRequest
     * @return ListDIJobsResponse
     */
    public ListDIJobsResponse listDIJobs(ListDIJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDIJobsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>DataWorks allows you to specify a default global configuration only for the processing rules of DDL messages in synchronization solutions. After you configure the <strong>processing rules of DDL messages</strong> in synchronization solutions, the configuration is used as the default global configuration and applies to all real-time synchronization tasks in the solutions. You can modify the <strong>processing rules of DDL messages</strong> based on your business requirements. For more information about how to configure a synchronization solution, see <a href="https://help.aliyun.com/document_detail/199008.html">Synchronization solutions</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the default global configurations of synchronization solutions in a specified DataWorks workspace.</p>
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
     * <b>description</b> :
     * <p>DataWorks allows you to specify a default global configuration only for the processing rules of DDL messages in synchronization solutions. After you configure the <strong>processing rules of DDL messages</strong> in synchronization solutions, the configuration is used as the default global configuration and applies to all real-time synchronization tasks in the solutions. You can modify the <strong>processing rules of DDL messages</strong> based on your business requirements. For more information about how to configure a synchronization solution, see <a href="https://help.aliyun.com/document_detail/199008.html">Synchronization solutions</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the default global configurations of synchronization solutions in a specified DataWorks workspace.</p>
     * 
     * @param request ListDIProjectConfigRequest
     * @return ListDIProjectConfigResponse
     */
    public ListDIProjectConfigResponse listDIProjectConfig(ListDIProjectConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDIProjectConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Supported DAG types:</p>
     * <ul>
     * <li>MANUAL: DAG for a manually triggered workflow</li>
     * <li>SMOKE_TEST: DAG for a smoke testing workflow</li>
     * <li>SUPPLY_DATA: DAG for a data backfill instance</li>
     * <li>BUSINESS_PROCESS_DAG: DAG for a one-time workflow
     * Supported DAG states:</li>
     * <li>CREATED: The DAG is created.</li>
     * <li>RUNNING: The DAG is running.</li>
     * <li>FAILURE: The DAG fails to run.</li>
     * <li>SUCCESS: The DAG is successfully run.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of directed acyclic graphs (DAGs) for a single data backfill instance based on OpSeq.</p>
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
     * <b>description</b> :
     * <p>Supported DAG types:</p>
     * <ul>
     * <li>MANUAL: DAG for a manually triggered workflow</li>
     * <li>SMOKE_TEST: DAG for a smoke testing workflow</li>
     * <li>SUPPLY_DATA: DAG for a data backfill instance</li>
     * <li>BUSINESS_PROCESS_DAG: DAG for a one-time workflow
     * Supported DAG states:</li>
     * <li>CREATED: The DAG is created.</li>
     * <li>RUNNING: The DAG is running.</li>
     * <li>FAILURE: The DAG fails to run.</li>
     * <li>SUCCESS: The DAG is successfully run.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of directed acyclic graphs (DAGs) for a single data backfill instance based on OpSeq.</p>
     * 
     * @param request ListDagsRequest
     * @return ListDagsResponse
     */
    public ListDagsResponse listDags(ListDagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the APIs on which other users are granted the access permissions.</p>
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
     * <b>summary</b> : 
     * <p>Queries the APIs on which other users are granted the access permissions.</p>
     * 
     * @param request ListDataServiceApiAuthoritiesRequest
     * @return ListDataServiceApiAuthoritiesResponse
     */
    public ListDataServiceApiAuthoritiesResponse listDataServiceApiAuthorities(ListDataServiceApiAuthoritiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceApiAuthoritiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the test records of a DataService Studio API. This API operation allows you to query only the test records that are generated within the previous month.</p>
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
     * <b>summary</b> : 
     * <p>Queries the test records of a DataService Studio API. This API operation allows you to query only the test records that are generated within the previous month.</p>
     * 
     * @param request ListDataServiceApiTestRequest
     * @return ListDataServiceApiTestResponse
     */
    public ListDataServiceApiTestResponse listDataServiceApiTest(ListDataServiceApiTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceApiTestWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of APIs in the development state.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of APIs in the development state.</p>
     * 
     * @param request ListDataServiceApisRequest
     * @return ListDataServiceApisResponse
     */
    public ListDataServiceApisResponse listDataServiceApis(ListDataServiceApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceApisWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the basic information of applications.</p>
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
     * <b>summary</b> : 
     * <p>Queries the basic information of applications.</p>
     * 
     * @param request ListDataServiceApplicationsRequest
     * @return ListDataServiceApplicationsResponse
     */
    public ListDataServiceApplicationsResponse listDataServiceApplications(ListDataServiceApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceApplicationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the APIs that you are authorized to access.</p>
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
     * <b>summary</b> : 
     * <p>Queries the APIs that you are authorized to access.</p>
     * 
     * @param request ListDataServiceAuthorizedApisRequest
     * @return ListDataServiceAuthorizedApisResponse
     */
    public ListDataServiceAuthorizedApisResponse listDataServiceAuthorizedApis(ListDataServiceAuthorizedApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceAuthorizedApisWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries folders.</p>
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
     * <b>summary</b> : 
     * <p>Queries folders.</p>
     * 
     * @param request ListDataServiceFoldersRequest
     * @return ListDataServiceFoldersResponse
     */
    public ListDataServiceFoldersResponse listDataServiceFolders(ListDataServiceFoldersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceFoldersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries business processes.</p>
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
     * <b>summary</b> : 
     * <p>Queries business processes.</p>
     * 
     * @param request ListDataServiceGroupsRequest
     * @return ListDataServiceGroupsResponse
     */
    public ListDataServiceGroupsResponse listDataServiceGroups(ListDataServiceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of APIs in the published state.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of APIs in the published state.</p>
     * 
     * @param request ListDataServicePublishedApisRequest
     * @return ListDataServicePublishedApisResponse
     */
    public ListDataServicePublishedApisResponse listDataServicePublishedApis(ListDataServicePublishedApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServicePublishedApisWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the data sources added to a DataWorks workspace.</p>
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
     * <b>summary</b> : 
     * <p>Queries the data sources added to a DataWorks workspace.</p>
     * 
     * @param request ListDataSourcesRequest
     * @return ListDataSourcesResponse
     */
    public ListDataSourcesResponse listDataSources(ListDataSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataSourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of deployment packages. This operation is equivalent to viewing a list of deployment packages on the Deployment Packages page of the DataWorks console.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of deployment packages. This operation is equivalent to viewing a list of deployment packages on the Deployment Packages page of the DataWorks console.</p>
     * 
     * @param request ListDeploymentsRequest
     * @return ListDeploymentsResponse
     */
    public ListDeploymentsResponse listDeployments(ListDeploymentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeploymentsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about codes of extension point events, see <a href="https://help.aliyun.com/document_detail/463357.html">Development references: Extension point event codes</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of built-in and custom extensions that are enabled in a workspace.</p>
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
     * <b>description</b> :
     * <p>For information about codes of extension point events, see <a href="https://help.aliyun.com/document_detail/463357.html">Development references: Extension point event codes</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of built-in and custom extensions that are enabled in a workspace.</p>
     * 
     * @param request ListEnabledExtensionsForProjectRequest
     * @return ListEnabledExtensionsForProjectResponse
     */
    public ListEnabledExtensionsForProjectResponse listEnabledExtensionsForProject(ListEnabledExtensionsForProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEnabledExtensionsForProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of entities by tag. Only entities of the maxcompute-table type are supported.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of entities by tag. Only entities of the maxcompute-table type are supported.</p>
     * 
     * @param request ListEntitiesByTagsRequest
     * @return ListEntitiesByTagsResponse
     */
    public ListEntitiesByTagsResponse listEntitiesByTags(ListEntitiesByTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEntitiesByTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of tags of an entity. Only entities of the maxcompute-table type are supported.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of tags of an entity. Only entities of the maxcompute-table type are supported.</p>
     * 
     * @param request ListEntityTagsRequest
     * @return ListEntityTagsResponse
     */
    public ListEntityTagsResponse listEntityTags(ListEntityTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEntityTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of extensions.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of extensions.</p>
     * 
     * @param request ListExtensionsRequest
     * @return ListExtensionsResponse
     */
    public ListExtensionsResponse listExtensions(ListExtensionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExtensionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about node types, such as the code and name.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the information about node types, such as the code and name.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries a list of folders.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries a list of folders.</p>
     * 
     * @param request ListFoldersRequest
     * @return ListFoldersResponse
     */
    public ListFoldersResponse listFolders(ListFoldersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFoldersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about inner nodes. For example, you can call this operation to query the inner nodes of a node group or a do-while node. You cannot call this operation to query the inner nodes of a PAI node.</p>
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
     * <b>summary</b> : 
     * <p>Queries information about inner nodes. For example, you can call this operation to query the inner nodes of a node group or a do-while node. You cannot call this operation to query the inner nodes of a PAI node.</p>
     * 
     * @param request ListInnerNodesRequest
     * @return ListInnerNodesResponse
     */
    public ListInnerNodesResponse listInnerNodes(ListInnerNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInnerNodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the trend of the number of auto triggered node instances within a specified period of time.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the trend of the number of auto triggered node instances within a specified period of time.</p>
     * 
     * @param request ListInstanceAmountRequest
     * @return ListInstanceAmountResponse
     */
    public ListInstanceAmountResponse listInstanceAmount(ListInstanceAmountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceAmountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about the historical records of all instances. One historical record is generated if an instance is rerun once.</p>
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
     * <b>summary</b> : 
     * <p>Queries information about the historical records of all instances. One historical record is generated if an instance is rerun once.</p>
     * 
     * @param request ListInstanceHistoryRequest
     * @return ListInstanceHistoryResponse
     */
    public ListInstanceHistoryResponse listInstanceHistory(ListInstanceHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceHistoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the directed acyclic graph (DAG). You can set this parameter to the value of the DagId parameter returned by the <a href="https://help.aliyun.com/document_detail/212961.html">RunCycleDagNodes</a>, <a href="https://help.aliyun.com/document_detail/212949.html">RunSmokeTest</a>, or <a href="https://help.aliyun.com/document_detail/212830.html">RunManualDagNodes</a> operation based on your business requirements. The RunManualDagNodes operation is used to backfill data, the RunSmokeTest operation is used to perform smoke testing, and the RunManualDagNodes operation is used to run nodes in a manually triggered workflow.</p>
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
     * <b>summary</b> : 
     * <p>The ID of the directed acyclic graph (DAG). You can set this parameter to the value of the DagId parameter returned by the <a href="https://help.aliyun.com/document_detail/212961.html">RunCycleDagNodes</a>, <a href="https://help.aliyun.com/document_detail/212949.html">RunSmokeTest</a>, or <a href="https://help.aliyun.com/document_detail/212830.html">RunManualDagNodes</a> operation based on your business requirements. The RunManualDagNodes operation is used to backfill data, the RunSmokeTest operation is used to perform smoke testing, and the RunManualDagNodes operation is used to run nodes in a manually triggered workflow.</p>
     * 
     * @param request ListInstancesRequest
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ancestor or descendant lineage of an entity.</p>
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
     * <b>summary</b> : 
     * <p>Queries the ancestor or descendant lineage of an entity.</p>
     * 
     * @param request ListLineageRequest
     * @return ListLineageResponse
     */
    public ListLineageResponse listLineage(ListLineageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLineageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about instances in a manually triggered workflow.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the information about instances in a manually triggered workflow.</p>
     * 
     * @param request ListManualDagInstancesRequest
     * @return ListManualDagInstancesResponse
     */
    public ListManualDagInstancesResponse listManualDagInstances(ListManualDagInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listManualDagInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics on the number of phone call-based alerts or text message-based alerts reported within the tenant to which your account belongs during the previous 30 days.</p>
     * 
     * @param request ListMeasureDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMeasureDataResponse
     */
    public ListMeasureDataResponse listMeasureDataWithOptions(ListMeasureDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentCode)) {
            query.put("ComponentCode", request.componentCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainCode)) {
            query.put("DomainCode", request.domainCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMeasureData"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMeasureDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics on the number of phone call-based alerts or text message-based alerts reported within the tenant to which your account belongs during the previous 30 days.</p>
     * 
     * @param request ListMeasureDataRequest
     * @return ListMeasureDataResponse
     */
    public ListMeasureDataResponse listMeasureData(ListMeasureDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMeasureDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the entities in a collection.</p>
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
     * <b>summary</b> : 
     * <p>Queries the entities in a collection.</p>
     * 
     * @param request ListMetaCollectionEntitiesRequest
     * @return ListMetaCollectionEntitiesResponse
     */
    public ListMetaCollectionEntitiesResponse listMetaCollectionEntities(ListMetaCollectionEntitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMetaCollectionEntitiesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The type can be ALBUM or ALBUM_CATEGORY. ALBUM indicates data albums. ALBUM_CATEGORY indicates categories.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about collections. Collections include data albums that are displayed on the Data Map page and categories that are created in the data albums. You can call this API operation to query collections by type.</p>
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
     * <b>description</b> :
     * <p>The type can be ALBUM or ALBUM_CATEGORY. ALBUM indicates data albums. ALBUM_CATEGORY indicates categories.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about collections. Collections include data albums that are displayed on the Data Map page and categories that are created in the data albums. You can call this API operation to query collections by type.</p>
     * 
     * @param request ListMetaCollectionsRequest
     * @return ListMetaCollectionsResponse
     */
    public ListMetaCollectionsResponse listMetaCollections(ListMetaCollectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMetaCollectionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of metadatabases.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries a list of metadatabases.</p>
     * 
     * @param request ListMetaDBRequest
     * @return ListMetaDBResponse
     */
    public ListMetaDBResponse listMetaDB(ListMetaDBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMetaDBWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of migration tasks.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of migration tasks.</p>
     * 
     * @param request ListMigrationsRequest
     * @return ListMigrationsResponse
     */
    public ListMigrationsResponse listMigrations(ListMigrationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMigrationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about one level of ancestor or descendant nodes of a node.</p>
     * 
     * @deprecated OpenAPI ListNodeIO is deprecated
     * 
     * @param request ListNodeIORequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodeIOResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>Queries the information about one level of ancestor or descendant nodes of a node.</p>
     * 
     * @deprecated OpenAPI ListNodeIO is deprecated
     * 
     * @param request ListNodeIORequest
     * @return ListNodeIOResponse
     */
    @Deprecated
    // Deprecated
    public ListNodeIOResponse listNodeIO(ListNodeIORequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodeIOWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the input and output information about a node. Only the ancestor or descendant nodes at the nearest level can be queried each time.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the input and output information about a node. Only the ancestor or descendant nodes at the nearest level can be queried each time.</p>
     * 
     * @param request ListNodeInputOrOutputRequest
     * @return ListNodeInputOrOutputResponse
     */
    public ListNodeInputOrOutputResponse listNodeInputOrOutput(ListNodeInputOrOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodeInputOrOutputWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the workspace.</p>
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
     * <b>summary</b> : 
     * <p>The ID of the workspace.</p>
     * 
     * @param request ListNodesRequest
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodes(ListNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries nodes in a baseline.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries nodes in a baseline.</p>
     * 
     * @param request ListNodesByBaselineRequest
     * @return ListNodesByBaselineResponse
     */
    public ListNodesByBaselineResponse listNodesByBaseline(ListNodesByBaselineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodesByBaselineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries nodes based on the output of the nodes.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries nodes based on the output of the nodes.</p>
     * 
     * @param request ListNodesByOutputRequest
     * @return ListNodesByOutputResponse
     */
    public ListNodesByOutputResponse listNodesByOutput(ListNodesByOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodesByOutputWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of permission request orders.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries a list of permission request orders.</p>
     * 
     * @param request ListPermissionApplyOrdersRequest
     * @return ListPermissionApplyOrdersResponse
     */
    public ListPermissionApplyOrdersResponse listPermissionApplyOrders(ListPermissionApplyOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPermissionApplyOrdersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the distribution of different types of nodes.</p>
     * 
     * @deprecated OpenAPI ListProgramTypeCount is deprecated
     * 
     * @param request ListProgramTypeCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProgramTypeCountResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>Queries the distribution of different types of nodes.</p>
     * 
     * @deprecated OpenAPI ListProgramTypeCount is deprecated
     * 
     * @param request ListProgramTypeCountRequest
     * @return ListProgramTypeCountResponse
     */
    @Deprecated
    // Deprecated
    public ListProgramTypeCountResponse listProgramTypeCount(ListProgramTypeCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProgramTypeCountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>An Alibaba Cloud account can assume a role such as the developer, O\&amp;M engineer, or workspace administrator role in a workspace. For more information, see <a href="https://help.aliyun.com/document_detail/136941.html">Manage members and roles</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the IDs of the workspaces on which a specific Alibaba Cloud account or RAM user has permissions in a specific region.</p>
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
     * <b>description</b> :
     * <p>An Alibaba Cloud account can assume a role such as the developer, O\&amp;M engineer, or workspace administrator role in a workspace. For more information, see <a href="https://help.aliyun.com/document_detail/136941.html">Manage members and roles</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the IDs of the workspaces on which a specific Alibaba Cloud account or RAM user has permissions in a specific region.</p>
     * 
     * @param request ListProjectIdsRequest
     * @return ListProjectIdsResponse
     */
    public ListProjectIdsResponse listProjectIds(ListProjectIdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectIdsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of existing members in a DataWorks workspace.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of existing members in a DataWorks workspace.</p>
     * 
     * @param request ListProjectMembersRequest
     * @return ListProjectMembersResponse
     */
    public ListProjectMembersResponse listProjectMembers(ListProjectMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectMembersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Debugging</h2>
     * <p><a href="https://api.aliyun.com/#product=dataworks-public%5C&api=ListProjectRoles%5C&type=RPC%5C&version=2020-05-18">OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of roles in a DataWorks workspace.</p>
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
     * <b>description</b> :
     * <h2>Debugging</h2>
     * <p><a href="https://api.aliyun.com/#product=dataworks-public%5C&api=ListProjectRoles%5C&type=RPC%5C&version=2020-05-18">OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of roles in a DataWorks workspace.</p>
     * 
     * @param request ListProjectRolesRequest
     * @return ListProjectRolesResponse
     */
    public ListProjectRolesResponse listProjectRoles(ListProjectRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectRolesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of DataWorks workspaces of the tenant to which a user belongs.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of DataWorks workspaces of the tenant to which a user belongs.</p>
     * 
     * @param request ListProjectsRequest
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjects(ListProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of historical check results based on a partition filter expression.</p>
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
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of historical check results based on a partition filter expression.</p>
     * 
     * @param request ListQualityResultsByEntityRequest
     * @return ListQualityResultsByEntityResponse
     */
    public ListQualityResultsByEntityResponse listQualityResultsByEntity(ListQualityResultsByEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQualityResultsByEntityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries monitoring results after the data quality of a data source or a compute engine is monitored based on monitoring rules.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries monitoring results after the data quality of a data source or a compute engine is monitored based on monitoring rules.</p>
     * 
     * @param request ListQualityResultsByRuleRequest
     * @return ListQualityResultsByRuleResponse
     */
    public ListQualityResultsByRuleResponse listQualityResultsByRule(ListQualityResultsByRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQualityResultsByRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries monitoring rules based on a partition filter expression.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries monitoring rules based on a partition filter expression.</p>
     * 
     * @param request ListQualityRulesRequest
     * @return ListQualityRulesResponse
     */
    public ListQualityRulesResponse listQualityRules(ListQualityRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQualityRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries synchronization tasks in Data Integration that use a specific data source.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries synchronization tasks in Data Integration that use a specific data source.</p>
     * 
     * @param request ListRefDISyncTasksRequest
     * @return ListRefDISyncTasksResponse
     */
    public ListRefDISyncTasksResponse listRefDISyncTasks(ListRefDISyncTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRefDISyncTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of custom alert rules.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of custom alert rules.</p>
     * 
     * @param request ListRemindsRequest
     * @return ListRemindsResponse
     */
    public ListRemindsResponse listReminds(ListRemindsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRemindsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of resource groups of a specific type.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of resource groups of a specific type.</p>
     * 
     * @param request ListResourceGroupsRequest
     * @return ListResourceGroupsResponse
     */
    public ListResourceGroupsResponse listResourceGroups(ListResourceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of on-duty engineers in a shift schedule.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of on-duty engineers in a shift schedule.</p>
     * 
     * @param request ListShiftPersonnelsRequest
     * @return ListShiftPersonnelsResponse
     */
    public ListShiftPersonnelsResponse listShiftPersonnels(ListShiftPersonnelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listShiftPersonnelsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of shift schedules in Operation Center.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of shift schedules in Operation Center.</p>
     * 
     * @param request ListShiftSchedulesRequest
     * @return ListShiftSchedulesResponse
     */
    public ListShiftSchedulesResponse listShiftSchedules(ListShiftSchedulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listShiftSchedulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the trend of the number of auto triggered node instances that are successfully run every hour on the hour of the current day.</p>
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
     * <b>summary</b> : 
     * <p>Queries the trend of the number of auto triggered node instances that are successfully run every hour on the hour of the current day.</p>
     * 
     * @param request ListSuccessInstanceAmountRequest
     * @return ListSuccessInstanceAmountResponse
     */
    public ListSuccessInstanceAmountResponse listSuccessInstanceAmount(ListSuccessInstanceAmountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSuccessInstanceAmountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of table levels. This operation will be replaced soon. We recommend that you do not call this operation.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of table levels. This operation will be replaced soon. We recommend that you do not call this operation.</p>
     * 
     * @param request ListTableLevelRequest
     * @return ListTableLevelResponse
     */
    public ListTableLevelResponse listTableLevel(ListTableLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTableLevelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of table themes. This operation will be replaced soon. We recommend that you do not call this operation.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of table themes. This operation will be replaced soon. We recommend that you do not call this operation.</p>
     * 
     * @param request ListTableThemeRequest
     * @return ListTableThemeResponse
     */
    public ListTableThemeResponse listTableTheme(ListTableThemeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTableThemeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains tables of different data source types within a tenant by page.</p>
     * 
     * @param request ListTablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTablesResponse
     */
    public ListTablesResponse listTablesWithOptions(ListTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            query.put("DataSourceType", request.dataSourceType);
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
            new TeaPair("action", "ListTables"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains tables of different data source types within a tenant by page.</p>
     * 
     * @param request ListTablesRequest
     * @return ListTablesResponse
     */
    public ListTablesResponse listTables(ListTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTablesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries events.</p>
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
     * <b>summary</b> : 
     * <p>Queries events.</p>
     * 
     * @param request ListTopicsRequest
     * @return ListTopicsResponse
     */
    public ListTopicsResponse listTopics(ListTopicsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTopicsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a directory to the left-side navigation pane of DataAnalysis.</p>
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
     * <b>summary</b> : 
     * <p>Adds a directory to the left-side navigation pane of DataAnalysis.</p>
     * 
     * @param request MountDirectoryRequest
     * @return MountDirectoryResponse
     */
    public MountDirectoryResponse mountDirectory(MountDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.mountDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Undeploys a node.</p>
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
     * <b>summary</b> : 
     * <p>Undeploys a node.</p>
     * 
     * @param request OfflineNodeRequest
     * @return OfflineNodeResponse
     */
    public OfflineNodeResponse offlineNode(OfflineNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.offlineNodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Publishes an API.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Publishes an API.</p>
     * 
     * @param request PublishDataServiceApiRequest
     * @return PublishDataServiceApiResponse
     */
    public PublishDataServiceApiResponse publishDataServiceApi(PublishDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishDataServiceApiWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>DataWorks allows you to call only the <a href="https://help.aliyun.com/document_detail/278725.html">CreateDISyncTask</a> operation to create a batch synchronization task or the <a href="https://help.aliyun.com/document_detail/289109.html">UpdateDISyncTask</a> operation to update a batch synchronization task in Data Integration. To create or update a real-time synchronization task, you must first call the <a href="https://help.aliyun.com/document_detail/383463.html">GenerateDISyncTaskConfigForCreating</a> or <a href="https://help.aliyun.com/document_detail/383464.html">GenerateDISyncTaskConfigForUpdating</a> operation to obtain the ID of an asynchronous thread and call the <a href="https://help.aliyun.com/document_detail/383465.html">QueryDISyncTaskConfigProcessResult</a> operation to obtain the asynchronously generated parameters based on the ID. Then, you can call the CreateDISyncTask or UpdateDISyncTask operation and use the parameters as request parameters to create or update a real-time synchronization task. DataWorks allows you to create or update real-time synchronization tasks in Data Integration only in asynchronous mode.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution results of an asynchronous task.</p>
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
     * <b>description</b> :
     * <p>DataWorks allows you to call only the <a href="https://help.aliyun.com/document_detail/278725.html">CreateDISyncTask</a> operation to create a batch synchronization task or the <a href="https://help.aliyun.com/document_detail/289109.html">UpdateDISyncTask</a> operation to update a batch synchronization task in Data Integration. To create or update a real-time synchronization task, you must first call the <a href="https://help.aliyun.com/document_detail/383463.html">GenerateDISyncTaskConfigForCreating</a> or <a href="https://help.aliyun.com/document_detail/383464.html">GenerateDISyncTaskConfigForUpdating</a> operation to obtain the ID of an asynchronous thread and call the <a href="https://help.aliyun.com/document_detail/383465.html">QueryDISyncTaskConfigProcessResult</a> operation to obtain the asynchronously generated parameters based on the ID. Then, you can call the CreateDISyncTask or UpdateDISyncTask operation and use the parameters as request parameters to create or update a real-time synchronization task. DataWorks allows you to create or update real-time synchronization tasks in Data Integration only in asynchronous mode.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution results of an asynchronous task.</p>
     * 
     * @param request QueryDISyncTaskConfigProcessResultRequest
     * @return QueryDISyncTaskConfigProcessResultResponse
     */
    public QueryDISyncTaskConfigProcessResultResponse queryDISyncTaskConfigProcessResult(QueryDISyncTaskConfigProcessResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDISyncTaskConfigProcessResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the default data category and data sensitivity level template defined by Data Security Guard.</p>
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
     * <b>summary</b> : 
     * <p>Queries the default data category and data sensitivity level template defined by Data Security Guard.</p>
     * 
     * @param request QueryDefaultTemplateRequest
     * @return QueryDefaultTemplateResponse
     */
    public QueryDefaultTemplateResponse queryDefaultTemplate(QueryDefaultTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDefaultTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Each time you call this API operation, you must use FML statements to query information about objects that are created in Data Modeling.</p>
     * <ul>
     * <li>The information about the objects can be queried by page, except for data layers, business processes, and data domains. You can add an offset to the end of an FML statement. The num LIMIT num statement specifies the offset when the information about the objects is queried, and the number of pages to return each time. The offset value must be a multiple of the number of pages.</li>
     * <li>A maximum of 1,000 entries can be returned each time you call this API operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about objects that are created in Data Modeling by using fast modeling language (FML) statements.</p>
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
     * <b>description</b> :
     * <p>  Each time you call this API operation, you must use FML statements to query information about objects that are created in Data Modeling.</p>
     * <ul>
     * <li>The information about the objects can be queried by page, except for data layers, business processes, and data domains. You can add an offset to the end of an FML statement. The num LIMIT num statement specifies the offset when the information about the objects is queried, and the number of pages to return each time. The offset value must be a multiple of the number of pages.</li>
     * <li>A maximum of 1,000 entries can be returned each time you call this API operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about objects that are created in Data Modeling by using fast modeling language (FML) statements.</p>
     * 
     * @param request QueryPublicModelEngineRequest
     * @return QueryPublicModelEngineResponse
     */
    public QueryPublicModelEngineResponse queryPublicModelEngine(QueryPublicModelEngineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPublicModelEngineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the type of a sensitive data identification rule.</p>
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
     * <b>summary</b> : 
     * <p>Queries the type of a sensitive data identification rule.</p>
     * 
     * @param request QueryRecognizeDataByRuleTypeRequest
     * @return QueryRecognizeDataByRuleTypeResponse
     */
    public QueryRecognizeDataByRuleTypeResponse queryRecognizeDataByRuleType(QueryRecognizeDataByRuleTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecognizeDataByRuleTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified sensitive field in Data Security Guard.</p>
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
     * <b>summary</b> : 
     * <p>Queries the details of a specified sensitive field in Data Security Guard.</p>
     * 
     * @param request QueryRecognizeRuleDetailRequest
     * @return QueryRecognizeRuleDetailResponse
     */
    public QueryRecognizeRuleDetailResponse queryRecognizeRuleDetail(QueryRecognizeRuleDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecognizeRuleDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the built-in sensitive data identification rule that is used to configure a sensitive field.</p>
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
     * <b>summary</b> : 
     * <p>Queries the built-in sensitive data identification rule that is used to configure a sensitive field.</p>
     * @return QueryRecognizeRulesTypeResponse
     */
    public QueryRecognizeRulesTypeResponse queryRecognizeRulesType() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecognizeRulesTypeWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries data categories.</p>
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
     * <b>summary</b> : 
     * <p>Queries data categories.</p>
     * 
     * @param request QuerySensClassificationRequest
     * @return QuerySensClassificationResponse
     */
    public QuerySensClassificationResponse querySensClassification(QuerySensClassificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySensClassificationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries data sensitivity levels in Data Security Guard.</p>
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
     * <b>summary</b> : 
     * <p>Queries data sensitivity levels in Data Security Guard.</p>
     * 
     * @param request QuerySensLevelRequest
     * @return QuerySensLevelResponse
     */
    public QuerySensLevelResponse querySensLevel(QuerySensLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySensLevelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries sensitive data identification rules.</p>
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
     * <b>summary</b> : 
     * <p>Queries sensitive data identification rules.</p>
     * 
     * @param request QuerySensNodeInfoRequest
     * @return QuerySensNodeInfoResponse
     */
    public QuerySensNodeInfoResponse querySensNodeInfo(QuerySensNodeInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySensNodeInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is in the trial phase. Users who need to call this operation can apply for it. The users can call this operation after the administrator adds the users to the trial list.</p>
     * 
     * <b>summary</b> : 
     * <p>Registers the lineage between self-managed entities to DataWorks.</p>
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
     * <b>description</b> :
     * <p>This operation is in the trial phase. Users who need to call this operation can apply for it. The users can call this operation after the administrator adds the users to the trial list.</p>
     * 
     * <b>summary</b> : 
     * <p>Registers the lineage between self-managed entities to DataWorks.</p>
     * 
     * @param request RegisterLineageRelationRequest
     * @return RegisterLineageRelationResponse
     */
    public RegisterLineageRelationResponse registerLineageRelation(RegisterLineageRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerLineageRelationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from an entity. Only entities of the maxcompute-table type are supported.</p>
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
     * <b>summary</b> : 
     * <p>Removes tags from an entity. Only entities of the maxcompute-table type are supported.</p>
     * 
     * @param request RemoveEntityTagsRequest
     * @return RemoveEntityTagsResponse
     */
    public RemoveEntityTagsResponse removeEntityTags(RemoveEntityTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeEntityTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a role from a user in a DataWorks workspace.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Removes a role from a user in a DataWorks workspace.</p>
     * 
     * @param request RemoveProjectMemberFromRoleRequest
     * @return RemoveProjectMemberFromRoleResponse
     */
    public RemoveProjectMemberFromRoleResponse removeProjectMemberFromRole(RemoveProjectMemberFromRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeProjectMemberFromRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts an instance.</p>
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
     * <b>summary</b> : 
     * <p>Restarts an instance.</p>
     * 
     * @param request RestartInstanceRequest
     * @return RestartInstanceResponse
     */
    public RestartInstanceResponse restartInstance(RestartInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes a suspended instance.</p>
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
     * <b>summary</b> : 
     * <p>Resumes a suspended instance.</p>
     * 
     * @param request ResumeInstanceRequest
     * @return ResumeInstanceResponse
     */
    public ResumeInstanceResponse resumeInstance(ResumeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes permissions on table fields from a user.</p>
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
     * <b>summary</b> : 
     * <p>Revokes permissions on table fields from a user.</p>
     * 
     * @param request RevokeColumnPermissionRequest
     * @return RevokeColumnPermissionResponse
     */
    public RevokeColumnPermissionResponse revokeColumnPermission(RevokeColumnPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeColumnPermissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes permissions on a table from a user.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Revokes permissions on a table from a user.</p>
     * 
     * @param request RevokeTablePermissionRequest
     * @return RevokeTablePermissionResponse
     */
    public RevokeTablePermissionResponse revokeTablePermission(RevokeTablePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeTablePermissionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For more information about data backfill, see <a href="https://help.aliyun.com/document_detail/137937.html">Backfill data</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a workflow to backfill data.</p>
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
     * <b>description</b> :
     * <p>For more information about data backfill, see <a href="https://help.aliyun.com/document_detail/137937.html">Backfill data</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a workflow to backfill data.</p>
     * 
     * @param request RunCycleDagNodesRequest
     * @return RunCycleDagNodesResponse
     */
    public RunCycleDagNodesResponse runCycleDagNodes(RunCycleDagNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runCycleDagNodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Runs nodes in a manually triggered workflow. Before you call this operation, make sure that the manually triggered workflow is committed and deployed. You can find a manually triggered workflow in Operation Center only after the manually triggered workflow is committed and deployed.</p>
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
     * <b>summary</b> : 
     * <p>Runs nodes in a manually triggered workflow. Before you call this operation, make sure that the manually triggered workflow is committed and deployed. You can find a manually triggered workflow in Operation Center only after the manually triggered workflow is committed and deployed.</p>
     * 
     * @param request RunManualDagNodesRequest
     * @return RunManualDagNodesResponse
     */
    public RunManualDagNodesResponse runManualDagNodes(RunManualDagNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runManualDagNodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a workflow to perform smoke testing.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Creates a workflow to perform smoke testing.</p>
     * 
     * @param request RunSmokeTestRequest
     * @return RunSmokeTestResponse
     */
    public RunSmokeTestResponse runSmokeTest(RunSmokeTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runSmokeTestWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Runs a manually triggered node.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Runs a manually triggered node.</p>
     * 
     * @param request RunTriggerNodeRequest
     * @return RunTriggerNodeResponse
     */
    public RunTriggerNodeResponse runTriggerNode(RunTriggerNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runTriggerNodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Saves the test results of an API.</p>
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
     * <b>summary</b> : 
     * <p>Saves the test results of an API.</p>
     * 
     * @param request SaveDataServiceApiTestResultRequest
     * @return SaveDataServiceApiTestResultResponse
     */
    public SaveDataServiceApiTestResultResponse saveDataServiceApiTestResult(SaveDataServiceApiTestResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveDataServiceApiTestResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether input data contains sensitive data.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Checks whether input data contains sensitive data.</p>
     * 
     * @param request ScanSensitiveDataRequest
     * @return ScanSensitiveDataResponse
     */
    public ScanSensitiveDataResponse scanSensitiveData(ScanSensitiveDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.scanSensitiveDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only metatables in a MaxCompute or E-MapReduce (EMR) compute engine.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries metatables based on specific conditions.</p>
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
     * <b>description</b> :
     * <p>You can call this operation to query only metatables in a MaxCompute or E-MapReduce (EMR) compute engine.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries metatables based on specific conditions.</p>
     * 
     * @param request SearchMetaTablesRequest
     * @return SearchMetaTablesResponse
     */
    public SearchMetaTablesResponse searchMetaTables(SearchMetaTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchMetaTablesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a node based on the output.</p>
     * 
     * @deprecated OpenAPI SearchNodesByOutput is deprecated
     * 
     * @param request SearchNodesByOutputRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchNodesByOutputResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>Queries a node based on the output.</p>
     * 
     * @deprecated OpenAPI SearchNodesByOutput is deprecated
     * 
     * @param request SearchNodesByOutputRequest
     * @return SearchNodesByOutputResponse
     */
    @Deprecated
    // Deprecated
    public SearchNodesByOutputResponse searchNodesByOutput(SearchNodesByOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchNodesByOutputWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Shares a data source to a specific DataWorks workspace or a specific user.</p>
     * 
     * @deprecated OpenAPI SetDataSourceShare is deprecated
     * 
     * @param request SetDataSourceShareRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDataSourceShareResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>Shares a data source to a specific DataWorks workspace or a specific user.</p>
     * 
     * @deprecated OpenAPI SetDataSourceShare is deprecated
     * 
     * @param request SetDataSourceShareRequest
     * @return SetDataSourceShareResponse
     */
    @Deprecated
    // Deprecated
    public SetDataSourceShareResponse setDataSourceShare(SetDataSourceShareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDataSourceShareWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures tags for an entity. Only entities of the maxcompute-table type are supported.</p>
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
     * <b>summary</b> : 
     * <p>Configures tags for an entity. Only entities of the maxcompute-table type are supported.</p>
     * 
     * @param request SetEntityTagsRequest
     * @return SetEntityTagsResponse
     */
    public SetEntityTagsResponse setEntityTags(SetEntityTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setEntityTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the state of a failed instance to successful.</p>
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
     * <b>summary</b> : 
     * <p>Sets the state of a failed instance to successful.</p>
     * 
     * @param request SetSuccessInstanceRequest
     * @return SetSuccessInstanceResponse
     */
    public SetSuccessInstanceResponse setSuccessInstance(SetSuccessInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setSuccessInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a synchronization task of a new version. Only the following type of task is supported: real-time data synchronization from a MySQL database to Hologres.</p>
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
     * <b>summary</b> : 
     * <p>Starts a synchronization task of a new version. Only the following type of task is supported: real-time data synchronization from a MySQL database to Hologres.</p>
     * 
     * @param request StartDIJobRequest
     * @return StartDIJobResponse
     */
    public StartDIJobResponse startDIJob(StartDIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDIJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a real-time synchronization task or a synchronization solution.</p>
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
     * <b>summary</b> : 
     * <p>Starts a real-time synchronization task or a synchronization solution.</p>
     * 
     * @param request StartDISyncInstanceRequest
     * @return StartDISyncInstanceResponse
     */
    public StartDISyncInstanceResponse startDISyncInstance(StartDISyncInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDISyncInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a migration task.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Starts a migration task.</p>
     * 
     * @param request StartMigrationRequest
     * @return StartMigrationResponse
     */
    public StartMigrationResponse startMigration(StartMigrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startMigrationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a new-version synchronization task. The following type of synchronization task is supported: real-time synchronization of all data in a MySQL database to Hologres.</p>
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
     * <b>summary</b> : 
     * <p>Stops a new-version synchronization task. The following type of synchronization task is supported: real-time synchronization of all data in a MySQL database to Hologres.</p>
     * 
     * @param request StopDIJobRequest
     * @return StopDIJobResponse
     */
    public StopDIJobResponse stopDIJob(StopDIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDIJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a real-time synchronization task.</p>
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
     * <b>summary</b> : 
     * <p>Stops a real-time synchronization task.</p>
     * 
     * @param request StopDISyncInstanceRequest
     * @return StopDISyncInstanceResponse
     */
    public StopDISyncInstanceResponse stopDISyncInstance(StopDISyncInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDISyncInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Terminates an instance.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Terminates an instance.</p>
     * 
     * @param request StopInstanceRequest
     * @return StopInstanceResponse
     */
    public StopInstanceResponse stopInstance(StopInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits an API in DataService Studio.</p>
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
     * <b>summary</b> : 
     * <p>Submits an API in DataService Studio.</p>
     * 
     * @param request SubmitDataServiceApiRequest
     * @return SubmitDataServiceApiResponse
     */
    public SubmitDataServiceApiResponse submitDataServiceApi(SubmitDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitDataServiceApiWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Commits a file to the development environment of the scheduling system to generate a task.</p>
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
     * <b>summary</b> : 
     * <p>Commits a file to the development environment of the scheduling system to generate a task.</p>
     * 
     * @param request SubmitFileRequest
     * @return SubmitFileResponse
     */
    public SubmitFileResponse submitFile(SubmitFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Suspends an instance.</p>
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
     * <b>summary</b> : 
     * <p>Suspends an instance.</p>
     * 
     * @param request SuspendInstanceRequest
     * @return SuspendInstanceResponse
     */
    public SuspendInstanceResponse suspendInstance(SuspendInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Undeploys a real-time synchronization task.</p>
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
     * <b>summary</b> : 
     * <p>Undeploys a real-time synchronization task.</p>
     * 
     * @param request TerminateDISyncInstanceRequest
     * @return TerminateDISyncInstanceResponse
     */
    public TerminateDISyncInstanceResponse terminateDISyncInstance(TerminateDISyncInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.terminateDISyncInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Tests a DataService Studio API in asynchronous mode. You can call the GetDataServiceApiTest operation to query the test result.</p>
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
     * <b>summary</b> : 
     * <p>Tests a DataService Studio API in asynchronous mode. You can call the GetDataServiceApiTest operation to query the test result.</p>
     * 
     * @param request TestDataServiceApiRequest
     * @return TestDataServiceApiResponse
     */
    public TestDataServiceApiResponse testDataServiceApi(TestDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testDataServiceApiWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Tests the network connectivity between a data source and a resource group.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Tests the network connectivity between a data source and a resource group.</p>
     * 
     * @param request TestNetworkConnectionRequest
     * @return TestNetworkConnectionResponse
     */
    public TestNetworkConnectionResponse testNetworkConnection(TestNetworkConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testNetworkConnectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ranking of the running durations of instances.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the ranking of the running durations of instances.</p>
     * 
     * @param request TopTenElapsedTimeInstanceRequest
     * @return TopTenElapsedTimeInstanceResponse
     */
    public TopTenElapsedTimeInstanceResponse topTenElapsedTimeInstance(TopTenElapsedTimeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.topTenElapsedTimeInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ranking of nodes on which errors occur within the previous month.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the ranking of nodes on which errors occur within the previous month.</p>
     * 
     * @param request TopTenErrorTimesInstanceRequest
     * @return TopTenErrorTimesInstanceResponse
     */
    public TopTenErrorTimesInstanceResponse topTenErrorTimesInstance(TopTenErrorTimesInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.topTenErrorTimesInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a directory from the left-side navigation pane of DataAnalysis.</p>
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
     * <b>summary</b> : 
     * <p>Removes a directory from the left-side navigation pane of DataAnalysis.</p>
     * 
     * @param request UmountDirectoryRequest
     * @return UmountDirectoryResponse
     */
    public UmountDirectoryResponse umountDirectory(UmountDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.umountDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新基线</p>
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
     * <b>summary</b> : 
     * <p>更新基线</p>
     * 
     * @param request UpdateBaselineRequest
     * @return UpdateBaselineResponse
     */
    public UpdateBaselineResponse updateBaseline(UpdateBaselineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBaselineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a workflow.</p>
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
     * <b>summary</b> : 
     * <p>Updates a workflow.</p>
     * 
     * @param request UpdateBusinessRequest
     * @return UpdateBusinessResponse
     */
    public UpdateBusinessResponse updateBusiness(UpdateBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBusinessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新集群的配置信息</p>
     * 
     * @param tmpReq UpdateClusterConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateClusterConfigsResponse
     */
    public UpdateClusterConfigsResponse updateClusterConfigsWithOptions(UpdateClusterConfigsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateClusterConfigsShrinkRequest request = new UpdateClusterConfigsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.configValues)) {
            request.configValuesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.configValues, "ConfigValues", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configType)) {
            query.put("ConfigType", request.configType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configValuesShrink)) {
            body.put("ConfigValues", request.configValuesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateClusterConfigs"),
            new TeaPair("version", "2020-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateClusterConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新集群的配置信息</p>
     * 
     * @param request UpdateClusterConfigsRequest
     * @return UpdateClusterConfigsResponse
     */
    public UpdateClusterConfigsResponse updateClusterConfigs(UpdateClusterConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateClusterConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a data source.</p>
     * 
     * @deprecated OpenAPI UpdateConnection is deprecated
     * 
     * @param request UpdateConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateConnectionResponse
     */
    @Deprecated
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
     * <b>summary</b> : 
     * <p>Updates a data source.</p>
     * 
     * @deprecated OpenAPI UpdateConnection is deprecated
     * 
     * @param request UpdateConnectionRequest
     * @return UpdateConnectionResponse
     */
    @Deprecated
    // Deprecated
    public UpdateConnectionResponse updateConnection(UpdateConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateConnectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can configure alert rules only for tasks that can be used for real-time data synchronization. You must update all fields in the alert rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an alert rule for a new-version synchronization task. The following type of task is supported: real-time synchronization of all data in a MySQL database to Hologres.</p>
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
     * <b>description</b> :
     * <p>You can configure alert rules only for tasks that can be used for real-time data synchronization. You must update all fields in the alert rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an alert rule for a new-version synchronization task. The following type of task is supported: real-time synchronization of all data in a MySQL database to Hologres.</p>
     * 
     * @param request UpdateDIAlarmRuleRequest
     * @return UpdateDIAlarmRuleResponse
     */
    public UpdateDIAlarmRuleResponse updateDIAlarmRule(UpdateDIAlarmRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDIAlarmRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a new-version synchronization task. The following type of task is supported: real-time synchronization of all data in a MySQL database to Hologres.</p>
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
     * <b>summary</b> : 
     * <p>Updates a new-version synchronization task. The following type of task is supported: real-time synchronization of all data in a MySQL database to Hologres.</p>
     * 
     * @param request UpdateDIJobRequest
     * @return UpdateDIJobResponse
     */
    public UpdateDIJobResponse updateDIJob(UpdateDIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDIJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>DataWorks allows you to specify a default global configuration only for the processing rules of DDL messages in synchronization solutions. After you configure the <strong>processing rules of DDL messages</strong> in synchronization solutions, the configuration is used as the default global configuration and applies to all real-time synchronization tasks in the solutions. You can modify the <strong>processing rules of DDL messages</strong> based on your business requirements. For more information about how to configure a synchronization solution, see <a href="https://help.aliyun.com/document_detail/199008.html">Synchronization solutions</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the default global configuration of synchronization solutions in a DataWorks workspace.</p>
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
     * <b>description</b> :
     * <p>DataWorks allows you to specify a default global configuration only for the processing rules of DDL messages in synchronization solutions. After you configure the <strong>processing rules of DDL messages</strong> in synchronization solutions, the configuration is used as the default global configuration and applies to all real-time synchronization tasks in the solutions. You can modify the <strong>processing rules of DDL messages</strong> based on your business requirements. For more information about how to configure a synchronization solution, see <a href="https://help.aliyun.com/document_detail/199008.html">Synchronization solutions</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the default global configuration of synchronization solutions in a DataWorks workspace.</p>
     * 
     * @param request UpdateDIProjectConfigRequest
     * @return UpdateDIProjectConfigResponse
     */
    public UpdateDIProjectConfigResponse updateDIProjectConfig(UpdateDIProjectConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDIProjectConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a data synchronization task.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Updates a data synchronization task.</p>
     * 
     * @param request UpdateDISyncTaskRequest
     * @return UpdateDISyncTaskResponse
     */
    public UpdateDISyncTaskResponse updateDISyncTask(UpdateDISyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDISyncTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about an API in the development state in DataService Studio.</p>
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
     * <b>summary</b> : 
     * <p>Updates the information about an API in the development state in DataService Studio.</p>
     * 
     * @param request UpdateDataServiceApiRequest
     * @return UpdateDataServiceApiResponse
     */
    public UpdateDataServiceApiResponse updateDataServiceApi(UpdateDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataServiceApiWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a data source.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Updates a data source.</p>
     * 
     * @param request UpdateDataSourceRequest
     * @return UpdateDataSourceResponse
     */
    public UpdateDataSourceResponse updateDataSource(UpdateDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you debug or call this operation, you must specify new values for the specified parameters to ensure that the values are different from the original configurations of the file. For example, if the original value of a parameter is A, you must change the value of this parameter to B before you commit the node. If you set the parameter to A, an exception that indicates invalid data occurs.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a file.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.applyScheduleImmediately)) {
            body.put("ApplyScheduleImmediately", request.applyScheduleImmediately);
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
     * <b>description</b> :
     * <p>When you debug or call this operation, you must specify new values for the specified parameters to ensure that the values are different from the original configurations of the file. For example, if the original value of a parameter is A, you must change the value of this parameter to B before you commit the node. If you set the parameter to A, an exception that indicates invalid data occurs.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a file.</p>
     * 
     * @param request UpdateFileRequest
     * @return UpdateFileResponse
     */
    public UpdateFileResponse updateFile(UpdateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a folder.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Updates a folder.</p>
     * 
     * @param request UpdateFolderRequest
     * @return UpdateFolderResponse
     */
    public UpdateFolderResponse updateFolder(UpdateFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFolderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Returns the check result of an extension point event to DataStudio after the extension point event is triggered during data development and checked by an extension.</p>
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
     * <b>summary</b> : 
     * <p>Returns the check result of an extension point event to DataStudio after the extension point event is triggered during data development and checked by an extension.</p>
     * 
     * @param request UpdateIDEEventResultRequest
     * @return UpdateIDEEventResultResponse
     */
    public UpdateIDEEventResultResponse updateIDEEventResult(UpdateIDEEventResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIDEEventResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a category.</p>
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
     * <b>summary</b> : 
     * <p>Updates a category.</p>
     * 
     * @param request UpdateMetaCategoryRequest
     * @return UpdateMetaCategoryResponse
     */
    public UpdateMetaCategoryResponse updateMetaCategory(UpdateMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMetaCategoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only the name and comment of a collection can be updated.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the name and comment of a collection.</p>
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
     * <b>description</b> :
     * <p>Only the name and comment of a collection can be updated.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the name and comment of a collection.</p>
     * 
     * @param request UpdateMetaCollectionRequest
     * @return UpdateMetaCollectionResponse
     */
    public UpdateMetaCollectionResponse updateMetaCollection(UpdateMetaCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMetaCollectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the metadata information about a table. Only MaxCompute tables are supported.</p>
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
     * <b>summary</b> : 
     * <p>Updates the metadata information about a table. Only MaxCompute tables are supported.</p>
     * 
     * @param request UpdateMetaTableRequest
     * @return UpdateMetaTableResponse
     */
    public UpdateMetaTableResponse updateMetaTable(UpdateMetaTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMetaTableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the instructions on how to use a table. If no instruction on how to use the table is available, the instructions that are configured by calling this operation are added.</p>
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
     * <b>summary</b> : 
     * <p>Updates the instructions on how to use a table. If no instruction on how to use the table is available, the instructions that are configured by calling this operation are added.</p>
     * 
     * @param request UpdateMetaTableIntroWikiRequest
     * @return UpdateMetaTableIntroWikiResponse
     */
    public UpdateMetaTableIntroWikiResponse updateMetaTableIntroWiki(UpdateMetaTableIntroWikiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMetaTableIntroWikiWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the owner of a node.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Changes the owner of a node.</p>
     * 
     * @param request UpdateNodeOwnerRequest
     * @return UpdateNodeOwnerResponse
     */
    public UpdateNodeOwnerResponse updateNodeOwner(UpdateNodeOwnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNodeOwnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Freezes or unfreezes a node.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Freezes or unfreezes a node.</p>
     * 
     * @param request UpdateNodeRunModeRequest
     * @return UpdateNodeRunModeResponse
     */
    public UpdateNodeRunModeResponse updateNodeRunMode(UpdateNodeRunModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNodeRunModeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a subscription relationship.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Updates a subscription relationship.</p>
     * 
     * @param request UpdateQualityFollowerRequest
     * @return UpdateQualityFollowerResponse
     */
    public UpdateQualityFollowerResponse updateQualityFollower(UpdateQualityFollowerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateQualityFollowerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a monitoring rule.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Updates a monitoring rule.</p>
     * 
     * @param request UpdateQualityRuleRequest
     * @return UpdateQualityRuleResponse
     */
    public UpdateQualityRuleResponse updateQualityRule(UpdateQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateQualityRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a custom alert rule.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Modifies a custom alert rule.</p>
     * 
     * @param request UpdateRemindRequest
     * @return UpdateRemindResponse
     */
    public UpdateRemindResponse updateRemind(UpdateRemindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRemindWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a MaxCompute table.</p>
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
     * <b>summary</b> : 
     * <p>Updates a MaxCompute table.</p>
     * 
     * @param request UpdateTableRequest
     * @return UpdateTableResponse
     */
    public UpdateTableResponse updateTable(UpdateTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the fields in a MaxCompute table.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Updates the fields in a MaxCompute table.</p>
     * 
     * @param request UpdateTableAddColumnRequest
     * @return UpdateTableAddColumnResponse
     */
    public UpdateTableAddColumnResponse updateTableAddColumn(UpdateTableAddColumnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTableAddColumnWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a table level. This operation will be replaced soon. We recommend that you do not call this operation.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Updates a table level. This operation will be replaced soon. We recommend that you do not call this operation.</p>
     * 
     * @param request UpdateTableLevelRequest
     * @return UpdateTableLevelResponse
     */
    public UpdateTableLevelResponse updateTableLevel(UpdateTableLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTableLevelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information about a table, such as the table folder, level, and category.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Modifies the information about a table, such as the table folder, level, and category.</p>
     * 
     * @param request UpdateTableModelInfoRequest
     * @return UpdateTableModelInfoResponse
     */
    public UpdateTableModelInfoResponse updateTableModelInfo(UpdateTableModelInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTableModelInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a table theme. This operation will be replaced soon. We recommend that you do not call this operation.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Updates a table theme. This operation will be replaced soon. We recommend that you do not call this operation.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Returns the processing result sent by an extension after a process in Operation Center is blocked by the extension.</p>
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
     * <b>summary</b> : 
     * <p>Returns the processing result sent by an extension after a process in Operation Center is blocked by the extension.</p>
     * 
     * @param request UpdateWorkbenchEventResultRequest
     * @return UpdateWorkbenchEventResultResponse
     */
    public UpdateWorkbenchEventResultResponse updateWorkbenchEventResult(UpdateWorkbenchEventResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWorkbenchEventResultWithOptions(request, runtime);
    }
}
